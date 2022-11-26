package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@MongoEntity(database = "Laughing-Train", collection = "BadSmell")
@SuppressWarnings("NullAway")
public class BadSmellDao extends PanacheMongoEntity {
    private String analyzer;
    private String identifier;
    private String ruleID;
    private String filePath;
    private String message;
    private String messageMarkdown;
    private String snippet;
    private String projectName;
    private String projectUrl;
    private String commitHash;
    private Position position;

    public BadSmellDao() {
        // default constructor for mongodb
    }

    /**
     * @return the analyzer
     */
    public String getAnalyzer() {
        return analyzer;
    }

    /**
     * @param analyzer the analyzer to set
     */
    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the ruleID
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * @param ruleID the ruleID to set
     */
    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the messageMarkdown
     */
    public String getMessageMarkdown() {
        return messageMarkdown;
    }

    /**
     * @param messageMarkdown the messageMarkdown to set
     */
    public void setMessageMarkdown(String messageMarkdown) {
        this.messageMarkdown = messageMarkdown;
    }

    /**
     * @return the snippet
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * @param snippet the snippet to set
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the projectUrl
     */
    public String getProjectUrl() {
        return projectUrl;
    }

    /**
     * @param projectUrl the projectUrl to set
     */
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    /**
     * @return the commitHash
     */
    public String getCommitHash() {
        return commitHash;
    }

    /**
     * @param commitHash the commitHash to set
     */
    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "{" + " analyzer='"
                + getAnalyzer() + "'" + ", identifier='"
                + getIdentifier() + "'" + ", ruleID='"
                + getRuleID() + "'" + ", filePath='"
                + getFilePath() + "'" + ", message='"
                + getMessage() + "'" + ", messageMarkdown='"
                + getMessageMarkdown() + "'" + ", snippet='"
                + getSnippet() + "'" + ", projectName='"
                + getProjectName() + "'" + ", projectUrl='"
                + getProjectUrl() + "'" + ", commitHash='"
                + getCommitHash() + "'" + ", position='"
                + getPosition() + "'" + "}";
    }
}
