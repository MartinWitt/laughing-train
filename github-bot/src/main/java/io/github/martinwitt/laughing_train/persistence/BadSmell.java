package io.github.martinwitt.laughing_train.persistence;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import io.smallrye.mutiny.Uni;
import java.util.List;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@MongoEntity(database = "AnalyzerResults")
public class BadSmell extends ReactivePanacheMongoEntity {

    private String ruleID;
    private String filePath;
    private int startLine;
    private int endLine;
    private int startColumn;
    private int endColumn;
    private int charOffset;
    private int charLength;
    private String message;
    private String messageMarkdown;
    private String snippet;
    private String projectName;
    private String projectUrl;
    private String commitHash;

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

    public static Uni<List<BadSmell>> findByRuleID(String ruleID) {
        return list("ruleID", ruleID);
    }

    /**
     * @return the ruleID
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @return the startLine
     */
    public int getStartLine() {
        return startLine;
    }

    /**
     * @return the endLine
     */
    public int getEndLine() {
        return endLine;
    }

    /**
     * @return the startColumn
     */
    public int getStartColumn() {
        return startColumn;
    }

    /**
     * @return the endColumn
     */
    public int getEndColumn() {
        return endColumn;
    }

    /**
     * @return the charOffset
     */
    public int getCharOffset() {
        return charOffset;
    }

    /**
     * @return the charLength
     */
    public int getCharLength() {
        return charLength;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the messageMarkdown
     */
    public String getMessageMarkdown() {
        return messageMarkdown;
    }

    /**
     * @return the snippet
     */
    public String getSnippet() {
        return snippet;
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
}
