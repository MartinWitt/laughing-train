package io.github.martinwitt.laughing_train.persistence;

import io.github.martinwitt.laughing_train.api.RuleId;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.util.List;
import java.util.Objects;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@MongoEntity(database = "Laughing-Train")
public class BadSmell extends PanacheMongoEntity implements AnalyzerResult {

    public String analyzer;
    public String identifier;
    public RuleId ruleID;
    public String filePath;
    public String message;
    public String messageMarkdown;
    public String snippet;
    public String projectName;
    public String projectUrl;
    public String commitHash;
    public Position position;

    public static List<BadSmell> findByRuleID(RuleId ruleID) {
        return list("ruleID", ruleID.ruleID());
    }

    public static List<BadSmell> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }

    public static List<BadSmell> findByCommitHash(String commitHash) {
        return list("commitHash", commitHash);
    }

    public static List<BadSmell> findByIdentifier(String identifier) {
        return list("identifier", identifier);
    }

    public BadSmell() {
        // default constructor for mongodb
    }

    public BadSmell(AnalyzerResult result, String projectName, String projectUrl, String commitHash) {
        this();
        this.position = result.position();
        this.ruleID = result.ruleID();
        this.filePath = result.filePath();
        this.message = result.message();
        this.messageMarkdown = result.messageMarkdown();
        this.snippet = result.snippet();
        this.projectName = projectName;
        this.projectUrl = projectUrl;
        this.commitHash = commitHash;
        this.identifier = generateIdentifier(result, projectName, commitHash);
        this.analyzer = result.getAnalyzer();
    }

    public static String generateIdentifier(AnalyzerResult result, String projectName, String commitHash) {
        return "%s-%s-%s-%s"
                .formatted(result.getAnalyzer(), projectName, result.ruleID(), Objects.hash(result, commitHash));
    }

    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
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

    /** (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadSmell)) {
            return false;
        }
        BadSmell other = (BadSmell) obj;
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

    @Override
    public String getAnalyzer() {
        return analyzer;
    }

    @Override
    public RuleId ruleID() {
        return ruleID;
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
}
