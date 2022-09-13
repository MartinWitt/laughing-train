package io.github.martinwitt.laughing_train.data;

public record PullRequest(
        PullRequestState state, String url, String title, String body, String owner, String repo, int number) {

    public enum PullRequestState {
        OPEN,
        CLOSED,
        MERGED
    }
}
