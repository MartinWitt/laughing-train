package io.github.martinwitt.laughing_train.gitprojects;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

/**
 * The Project class represents a project with its name, URL, folder, source folder, and commit
 * hash.
 */
public record GitProject(
    String name, String url, File folder, String sourceFolder, String commitHash)
    implements Serializable {

  /**
   * Retrieves the owner and repository name from the URL associated with the project.
   *
   * @return The owner and repository name in the format "owner/repo".
   */
  public String getOwnerRepoName() {
    return extractOwnerRepoFromUrl(url());
  }

  /**
   * Extracts the owner and repository name from a given URL.
   *
   * @param url The URL to extract the owner and repository name from.
   * @return The owner and repository name in the format "owner/repo".
   */
  private String extractOwnerRepoFromUrl(String url) {
    String[] split = StringUtils.split(url, "/");
    if (split.length == 2) {
      return split[0] + "/" + split[1];
    }
    // TODO: this is a hack, but it works for now
    return split[split.length - 2] + "/" + split[split.length - 1].replace(".git", "");
  }
}
