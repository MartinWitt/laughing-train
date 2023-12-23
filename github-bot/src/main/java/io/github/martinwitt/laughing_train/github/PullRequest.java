package io.github.martinwitt.laughing_train.github;

import java.io.Serializable;

/** The PullRequest class represents a pull request on GitHub. */
public record PullRequest(
    GitHubState state, String title, String body, String owner, String repo, int number, String url)
    implements Serializable {}
