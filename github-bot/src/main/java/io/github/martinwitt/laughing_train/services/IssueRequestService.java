package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPullRequestResult;
import io.github.martinwitt.laughing_train.data.GitHubState;
import io.github.martinwitt.laughing_train.data.Issue;
import io.github.martinwitt.laughing_train.data.PullRequest;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class IssueRequestService {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  public FindPullRequestResult findPullRequests(FindIssueRequest request) {
    logger.atFine().log("Got request %s", request);
    if (request instanceof FindIssueRequest.WithUserName userName) {
      logger.atFine().log("Got user name %s", userName);
      return getIssuesWithFixes(userName);
    }
    throw new IllegalArgumentException("Unknown request type %s".formatted(request));
  }

  private FindPullRequestResult getIssuesWithFixes(FindIssueRequest.WithUserName userName) {
    try {
      return new FindPullRequestResult.MultipleResults(
          convertGHIssueToPullRequest(searchPrs(userName)));
    } catch (IOException e) {
      logger.atSevere().withCause(e).log(
          "Error while searching for issues with fixes for user %s", userName);
      return new FindPullRequestResult.NoResult();
    }
  }

  private List<PullRequest> convertGHIssueToPullRequest(List<? extends GHIssue> issues) {
    return issues.stream().map(this::toPullRequest).collect(Collectors.toList());
  }

  private List<GHIssue> searchPrs(FindIssueRequest.WithUserName userName) throws IOException {
    return GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
        .searchIssues()
        .q("is:pr")
        .q("author:" + userName.userName())
        .q("fingerprint in:body")
        .list()
        .toList()
        .stream()
        .filter(v -> !v.getRepository().isFork())
        .toList();
  }

  private PullRequest toPullRequest(GHIssue issue) {
    return new PullRequest(
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

  public FindIssueResult getSummaryIssue() {
    return findSummaryIssue();
  }

  private FindIssueResult findSummaryIssue() {
    try {
      var list = searchSummaryIssueOnGithub();
      if (list.isEmpty()) {
        return new FindIssueResult.NoResult();
      }
      return new FindIssueResult.MultipleResults(list.stream().map(v -> toIssue(v)).toList());
    } catch (IOException e) {
      logger.atSevere().withCause(e).log("Error while searching for summary issue");
      return new FindIssueResult.NoResult();
    }
  }

  private List<GHIssue> searchSummaryIssueOnGithub() throws IOException {
    return GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
        .getRepository("MartinWitt/laughing-train")
        .queryIssues()
        .pageSize(1)
        .label("laughing-train-summary")
        .state(GHIssueState.OPEN)
        .list()
        .toList();
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
}
