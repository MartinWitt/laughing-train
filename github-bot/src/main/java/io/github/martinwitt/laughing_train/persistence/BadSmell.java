package io.github.martinwitt.laughing_train.persistence;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@MongoEntity(database = "Laughing-Train")
public class BadSmell extends PanacheMongoEntity implements Serializable {

    public String ruleID;
    public String filePath;
    public int startLine;
    public int endLine;
    public int startColumn;
    public int endColumn;
    public int charOffset;
    public int charLength;
    public String message;
    public String messageMarkdown;
    public String snippet;
    public String projectName;
    public String projectUrl;
    public String commitHash;

    public static List<BadSmell> findByRuleID(String ruleID) {
        return list("ruleID", ruleID);
    }

    public static List<BadSmell> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }

    public static List<BadSmell> findByCommitHash(String commitHash) {
        return list("commitHash", commitHash);
    }

    public BadSmell() {
        // default constructor for mongodb
    }

    public BadSmell(
            String ruleID, String filePath, Position position, String message, String messageMarkdown, String snippet) {
        this();
        this.ruleID = ruleID;
        this.filePath = filePath;
        this.startLine = position.startLine();
        this.endLine = position.endLine();
        this.startColumn = position.startColumn();
        this.endColumn = position.endColumn();
        this.charOffset = position.charOffset();
        this.charLength = position.charLength();
        this.message = message;
        this.messageMarkdown = messageMarkdown;
        this.snippet = snippet;
    }

    public BadSmell(AnalyzerResult result, String projectName, String projectUrl, String commitHash) {
        this();
        Position position = result.position();
        this.ruleID = result.ruleID();
        this.filePath = result.filePath();
        this.startLine = position.startLine();
        this.endLine = position.endLine();
        this.startColumn = position.startColumn();
        this.endColumn = position.endColumn();
        this.charOffset = position.charOffset();
        this.charLength = position.charLength();
        this.message = result.message();
        this.messageMarkdown = result.messageMarkdown();
        this.snippet = result.snippet();
        this.projectName = projectName;
        this.projectUrl = projectUrl;
        this.commitHash = commitHash;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(
                ruleID,
                filePath,
                startLine,
                endLine,
                startColumn,
                endColumn,
                charOffset,
                charLength,
                message,
                messageMarkdown,
                snippet,
                projectName,
                projectUrl,
                commitHash);
    }

    /* (non-Javadoc)
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
        return Objects.equals(ruleID, other.ruleID)
                && Objects.equals(filePath, other.filePath)
                && startLine == other.startLine
                && endLine == other.endLine
                && startColumn == other.startColumn
                && endColumn == other.endColumn
                && charOffset == other.charOffset
                && charLength == other.charLength
                && Objects.equals(message, other.message)
                && Objects.equals(messageMarkdown, other.messageMarkdown)
                && Objects.equals(snippet, other.snippet)
                && Objects.equals(projectName, other.projectName)
                && Objects.equals(projectUrl, other.projectUrl)
                && Objects.equals(commitHash, other.commitHash);
    }
}
