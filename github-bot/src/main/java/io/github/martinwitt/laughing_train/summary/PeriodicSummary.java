package io.github.martinwitt.laughing_train.summary;

import com.google.common.base.Strings;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.github.martinwitt.laughing_train.github.GitHubIssueSearch;
import io.github.martinwitt.laughing_train.github.GitHubState;
import io.github.martinwitt.laughing_train.github.Issue;
import io.github.martinwitt.laughing_train.github.PullRequest;
import io.quarkus.scheduler.Scheduled;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * This class is responsible for creating a summary issue on GitHub. It is triggered every 2 hours.
 * If there is no summary issue, it will be created. If there is a summary issue, it will be
 * updated. The summary issue contains a list of all open issues and pull requests with their
 * status.
 */
public class PeriodicSummary {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private GitHubIssueSearch issueRequestService;

  PeriodicSummary(GitHubIssueSearch issueRequestService) {
    this.issueRequestService = issueRequestService;
  }

  @Scheduled(every = "2h", delay = 10, delayUnit = TimeUnit.MINUTES)
  public void createSummary() {
    Result<Issue> summaryIssue = issueRequestService.findSummaryIssue();
    if (summaryIssue.isError()) {
      logger.atSevere().log(
          "Error while searching for summary issue." + summaryIssue.getError().getMessage());
      return;
    }
    Issue issue = summaryIssue.get();
    if (issue == null) {
      logger.atInfo().log("No summary issue found, creating one");
      createNewSummary();
    } else {
      updateContent(issue);
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
        authenticateWithGitHub()
            .getRepository("martinwitt/laughing-train")
            .createIssue("laughing-train-summary")
            .create());
  }

  private void updateContent(Issue issue) {
    logger.atInfo().log("Updating summary issue");
    Result<List<PullRequest>> issues = issueRequestService.findPullRequests("MartinWitt");
    if (issues.isError()) {
      logger.atSevere().log(
          "Error while searching for pull requests." + issues.getError().getMessage());
      return;
    }
    updateBody(issue, issues.get());
  }

  private void updateBody(Issue issue, Collection<PullRequest> pullRequests) {
    try {
      authenticateWithGitHub()
          .getRepository("martinwitt/laughing-train")
          .getIssue(issue.number())
          .setBody(
              createSummaryBody(
                  pullRequests.stream().collect(Collectors.groupingBy(PullRequest::repo))));
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while creating summary");
    }
  }

  private static GitHub authenticateWithGitHub() throws IOException {
    return GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));
  }

  private String createSummaryBody(Map<String, ? extends List<PullRequest>> prsByGHRepo) {
    var sb = new StringBuilder();
    sb.append("# Summary\n");
    for (var entry : prsByGHRepo.entrySet()) {
      sb.append("## %s%n".formatted(entry.getKey()));
      sb.append("| Rule | PR | State | \n");
      sb.append("|------|------|------| \n");
      var prs = entry.getValue();

      prs.sort(Comparator.comparing(PullRequest::state));
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
    if (result.isEmpty()) {
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
