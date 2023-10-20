package io.github.martinwitt.laughing_train.summary;

import com.google.common.base.Strings;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPullRequestResult;
import io.github.martinwitt.laughing_train.data.GitHubState;
import io.github.martinwitt.laughing_train.data.Issue;
import io.github.martinwitt.laughing_train.data.PullRequest;
import io.github.martinwitt.laughing_train.services.GitHubIssueSearch;
import io.quarkus.scheduler.Scheduled;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

/**
 * This class is responsible for creating a summary issue on GitHub. It is triggered every 2 hours.
 * If there is no summary issue, it will be created. If there is a summary issue, it will be
 * updated. The summary issue contains a list of all open issues and pull requests with their
 * status.
 */
public class PeriodicSummary {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  GitHubIssueSearch issueRequestService;

  PeriodicSummary(GitHubIssueSearch issueRequestService) {
    this.issueRequestService = issueRequestService;
  }

  @Scheduled(every = "2h", delay = 10, delayUnit = TimeUnit.MINUTES)
  public void createSummary() {
    FindIssueResult summaryIssue = issueRequestService.getSummaryIssue();
    switch (summaryIssue) {
      case FindIssueResult.SingleResult summary -> updateContent(summary.issue());
      case FindIssueResult.NoResult noResult -> {
        logger.atInfo().log("No summary issue found, creating one");
        createNewSummary();
      }
      case FindIssueResult.MultipleResults multipleResults -> updateContent(
          multipleResults.issues().get(0));
      default -> logger.atWarning().log("No summary issue found");
    }
  }

  private void createNewSummary() {
    try {
      updateContent(createNewIssue());
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Failed to create summary issue");
    }
  }

  /**
   * Creates a new issue in the repository martinwitt/laughing-train with the title
   * laughing-train-summary
   *
   * @return the created issue
   * @throws IOException if the issue could not be created
   */
  private Issue createNewIssue() throws IOException {
    return toIssue(
        GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
            .getRepository("martinwitt/laughing-train")
            .createIssue("laughing-train-summary")
            .create());
  }

  private void updateContent(Issue issue) {
    logger.atInfo().log("Updating summary issue");
    FindPullRequestResult test =
        issueRequestService.findPullRequests(new FindIssueRequest.WithUserName("MartinWitt"));
    if (test instanceof FindPullRequestResult.MultipleResults multipleResults) {
      logger.atInfo().log("Found multiple results %s", multipleResults.pullRequests().size());
      updateBody(issue, multipleResults);
    } else if (test instanceof FindPullRequestResult.NoResult noResult) {
      logger.atInfo().log("Found no results %s", noResult);
    } else {
      logger.atInfo().log("Found single result %s", test);
    }
  }

  private void updateBody(Issue issue, FindPullRequestResult.MultipleResults multipleResults) {
    try {
      GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
          .getRepository("martinwitt/laughing-train")
          .getIssue(issue.number())
          .setBody(
              createSummaryBody(
                  multipleResults.pullRequests().stream()
                      .collect(Collectors.groupingBy(PullRequest::repo))));
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while creating summary");
    }
  }

  private String createSummaryBody(Map<String, List<PullRequest>> prsByGHRepo) {
    var sb = new StringBuilder();
    sb.append("# Summary\n");
    for (var entry : prsByGHRepo.entrySet()) {
      sb.append("## %s%n".formatted(entry.getKey()));
      sb.append("| Rule | PR | State | \n");
      sb.append("|------|------|------| \n");
      var prs = entry.getValue();

      Collections.sort(prs, Comparator.comparing(PullRequest::state));
      for (var pr : prs) {
        sb.append("| %s | %s | %s | %n".formatted(findRuleID(pr.body()), pr.url(), pr.state()));
      }
    }
    return sb.toString();
  }

  private String findRuleID(String body) {
    if (body.contains("laughing-train-refactor")) {
      return "Multiple rules";
    }
    String result =
        Strings.nullToEmpty(StringUtils.substringBetween(body, "ruleID:"))
            .replace("\n", "")
            .replace("\"", "")
            .trim();
    if (result == null || result.isEmpty()) {
      return "Multiple rules";
    } else {
      return result;
    }
  }

  private Issue toIssue(GHIssue issue) {
    return new Issue(
        toPullRequestState(issue.getState()),
        issue.getTitle(),
        issue.getBody(),
        issue.getRepository().getOwnerName(),
        issue.getRepository().getName(),
        issue.getNumber(),
        issue.getHtmlUrl().toString());
  }

  private GitHubState toPullRequestState(GHIssueState state) {
    return Enum.valueOf(GitHubState.class, state.name());
  }
}
