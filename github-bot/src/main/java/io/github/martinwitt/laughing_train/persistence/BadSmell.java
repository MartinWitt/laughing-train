package io.github.martinwitt.laughing_train.persistence;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.util.List;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@MongoEntity(database = "AnalyzerResults")
public class BadSmell extends PanacheMongoEntity {

    public static List<BadSmell> findByRuleID(String ruleID) {
        return list("ruleID", ruleID);
    }

    public static List<BadSmell> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }

    public static List<BadSmell> findByCommitHash(String commitHash) {
        return list("commitHash", commitHash);
    }

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

    /**
     * @param ruleID the ruleID to set
     */
    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @param startLine the startLine to set
     */
    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    /**
     * @param endLine the endLine to set
     */
    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    /**
     * @param startColumn the startColumn to set
     */
    public void setStartColumn(int startColumn) {
        this.startColumn = startColumn;
    }

    /**
     * @param endColumn the endColumn to set
     */
    public void setEndColumn(int endColumn) {
        this.endColumn = endColumn;
    }

    /**
     * @param charOffset the charOffset to set
     */
    public void setCharOffset(int charOffset) {
        this.charOffset = charOffset;
    }

    /**
     * @param charLength the charLength to set
     */
    public void setCharLength(int charLength) {
        this.charLength = charLength;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param messageMarkdown the messageMarkdown to set
     */
    public void setMessageMarkdown(String messageMarkdown) {
        this.messageMarkdown = messageMarkdown;
    }

    /**
     * @param snippet the snippet to set
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @param projectUrl the projectUrl to set
     */
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    /**
     * @param commitHash the commitHash to set
     */
    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }
}
