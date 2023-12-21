package io.github.martinwitt.laughing_train.commons;

import io.github.martinwitt.laughing_train.commons.result.Result;
import org.kohsuke.github.GitHub;

/**
 * GitHubConnector is a utility class for connecting to GitHub using OAuth token. It provides
 * methods to authenticate and establish a connection with GitHub.
 */
public class GitHubConnector {

  private static final String GITHUB_TOKEN_ENV_NAME = "GITHUB_TOKEN";

  private GitHubConnector() {}

  /**
   * Connects to GitHub using OAuth token.
   *
   * @param token the OAuth token to authenticate the connection
   * @return a Result object containing the connected GitHub instance if successful, or an error if
   *     an exception occurs
   */
  public static Result<GitHub> connectOAuth(String token) {
    try {
      return Result.ok(GitHub.connectUsingOAuth(token));
    } catch (Exception e) {
      return Result.error(e);
    }
  }

  /**
   * Connects to GitHub using OAuth token.
   *
   * @return a Result object containing the connected GitHub instance if successful, or an error if
   *     an exception occurs
   */
  public static Result<GitHub> connectOAuth() {
    return connectOAuth(System.getenv(GITHUB_TOKEN_ENV_NAME));
  }
}
