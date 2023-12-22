package io.github.martinwitt.laughing_train.github;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.GitHubConnector;
import io.github.martinwitt.laughing_train.commons.result.Result;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueSearchBuilder;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class GitHubIssueSearch {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  public Result<List<PullRequest>> findPullRequests(String userName) {
    return searchIssuesWithFixes(userName);
  }

  private Result<List<PullRequest>> searchIssuesWithFixes(String userName) {
    try {
      return Result.ok(
          convertGHIssueToPullRequest(
              getGitHubIssues("is:pr", "author:" + userName, "fingerprint in:body")));
    } catch (IOException e) {
      logger.atSevere().withCause(e).log(
          "Error while searching for issues with fixes for user %s", userName);
      return Result.error(e);
    }
  }

  private List<PullRequest> convertGHIssueToPullRequest(Collection<? extends GHIssue> issues) {
    return issues.stream().map(this::toPullRequest).collect(Collectors.toList());
  }

  private List<GHIssue> getGitHubIssues(String... queries) throws IOException {
    Result<GitHub> githubConnectionResult = GitHubConnector.connectOAuth();
    if (githubConnectionResult.isError()) {
      throw new IOException(githubConnectionResult.getError());
    }
    GitHub gitHub = githubConnectionResult.get();
    GHIssueSearchBuilder issueQueryBuilder = gitHub.searchIssues();
    for (String query : queries) {
      issueQueryBuilder = issueQueryBuilder.q(query);
    }
    return issueQueryBuilder.list().toList().stream()
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

  public Result<Issue> findSummaryIssue() {
    return searchSummaryIssue();
  }

  private Result<Issue> searchSummaryIssue() {
    try {
      GHIssue issue = getFirstIssue("laughing-train-summary");
      return Result.ofNullable(toIssue(issue));
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while searching for summary issue");
      return Result.error(e);
    }
  }

  private GHIssue getFirstIssue(String label) throws IOException {
    Result<GitHub> githubConnectionResult = GitHubConnector.connectOAuth();
    if (githubConnectionResult.isError()) {
      throw new IOException(githubConnectionResult.getError());
    }
    GitHub gitHub = githubConnectionResult.get();
    return gitHub
        .getRepository("MartinWitt/laughing-train")
        .queryIssues()
        .pageSize(100)
        .label(label)
        .state(GHIssueState.OPEN)
        .pageSize(1)
        .list()
        .toList()
        .getFirst();
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
