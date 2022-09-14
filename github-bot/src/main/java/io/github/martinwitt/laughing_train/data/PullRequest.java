package io.github.martinwitt.laughing_train.data;

public record PullRequest(
        PullRequestState state, String title, String body, String owner, String repo, int number, String url) {

    public enum PullRequestState {
        OPEN,
        CLOSED,
        MERGED
    }
}
