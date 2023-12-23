package io.github.martinwitt.laughing_train.github;

import java.io.Serializable;

/** The Issue class represents an issue on GitHub. */
public record Issue(
    GitHubState state, String title, String body, String owner, String repo, int number, String url)
    implements Serializable {}
