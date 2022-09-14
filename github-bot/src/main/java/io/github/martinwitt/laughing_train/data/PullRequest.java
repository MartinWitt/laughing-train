package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;

public record PullRequest(
        PullRequestState state, String title, String body, String owner, String repo, int number, String url)
        implements Serializable {}
