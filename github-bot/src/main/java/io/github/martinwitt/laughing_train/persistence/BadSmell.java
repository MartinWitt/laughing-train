package io.github.martinwitt.laughing_train.persistence;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.Objects;

public class BadSmell implements AnalyzerResult {

  private final String analyzer;
  private final String identifier;
  private final String ruleID;
  private final String filePath;
  private final String message;
  private final String messageMarkdown;
  private final String snippet;
  private final String projectName;
  private final String projectUrl;
  private final String commitHash;
  private final Position position;

  public BadSmell(AnalyzerResult result, String projectName, String projectUrl, String commitHash) {
    position = result.position();
    ruleID = result.ruleID().id();
    filePath = result.filePath();
    message = result.message();
    messageMarkdown = result.messageMarkdown();
    snippet = result.snippet();
    this.projectName = projectName;
    this.projectUrl = projectUrl;
    this.commitHash = commitHash;
    identifier = generateIdentifier(result, projectName, commitHash);
    analyzer = result.getAnalyzer();
  }

  public static String generateIdentifier(
      AnalyzerResult result, String projectName, String commitHash) {
    return "%s-%s-%s-%s-%s"
        .formatted(
            result.getAnalyzer(),
            projectName,
            result.ruleID().id(),
            commitHash,
            positionToString(result.position()));
  }

  /**
   * (non-Javadoc)
   *
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(
        analyzer,
        identifier,
        ruleID,
        filePath,
        message,
        messageMarkdown,
        snippet,
        projectName,
        projectUrl,
        commitHash,
        position);
  }

  /**
   * (non-Javadoc)
   *
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof BadSmell other) {
      return Objects.equals(analyzer, other.analyzer)
          && Objects.equals(identifier, other.identifier)
          && Objects.equals(ruleID, other.ruleID)
          && Objects.equals(filePath, other.filePath)
          && Objects.equals(message, other.message)
          && Objects.equals(messageMarkdown, other.messageMarkdown)
          && Objects.equals(snippet, other.snippet)
          && Objects.equals(projectName, other.projectName)
          && Objects.equals(projectUrl, other.projectUrl)
          && Objects.equals(commitHash, other.commitHash)
          && Objects.equals(position, other.position);
    }
    return false;
  }

  @Override
  public String getAnalyzer() {
    return analyzer;
  }

  @Override
  public RuleId ruleID() {
    return new RuleId(ruleID);
  }

  @Override
  public String filePath() {
    return filePath;
  }

  @Override
  public Position position() {
    return position;
  }

  @Override
  public String message() {
    return message;
  }

  @Override
  public String messageMarkdown() {
    return messageMarkdown;
  }

  @Override
  public String snippet() {
    return snippet;
  }

  /**
   * @return the identifier
   */
  public String getIdentifier() {
    return identifier;
  }

  /**
   * @return the projectName
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * @return the projectUrl
   */
  public String getProjectUrl() {
    return projectUrl;
  }

  /**
   * @return the commitHash
   */
  public String getCommitHash() {
    return commitHash;
  }

  private static String positionToString(Position position) {
    return "sl:%s-el:%s-sc:%s-ec:%s-co:%s-cl:%s"
        .formatted(
            position.startLine(),
            position.endLine(),
            position.startColumn(),
            position.endColumn(),
            position.charOffset(),
            position.charLength());
  }
}
