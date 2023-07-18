package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AnalyzerStatus implements Serializable {

    private String analyzerName;
    private Status status;
    private int numberOfIssues;
    private String commitHash;
    private LocalDateTime localDateTime;

    AnalyzerStatus(
            String analyzerName, Status status, int numberOfIssues, String commitHash, LocalDateTime localDateTime) {
        this.analyzerName = analyzerName;
        this.status = status;
        this.numberOfIssues = numberOfIssues;
        this.commitHash = commitHash;
        this.localDateTime = localDateTime;
    }

    public static AnalyzerStatus success(String analyzerName, int numberOfIssues, String commitHash) {
        return new AnalyzerStatus(analyzerName, Status.SUCCESS, numberOfIssues, commitHash, LocalDateTime.now());
    }

    public static AnalyzerStatus failure(String analyzerName, int numberOfIssues, String commitHash) {
        return new AnalyzerStatus(analyzerName, Status.FAILURE, numberOfIssues, commitHash, LocalDateTime.now());
    }

    enum Status {
        SUCCESS,
        FAILURE
    }

    /**
     * @return the analyzerName
     */
    public String getAnalyzerName() {
        return analyzerName;
    }

    /**
     * @param analyzerName the analyzerName to set
     */
    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the numberOfIssues
     */
    public int getNumberOfIssues() {
        return numberOfIssues;
    }

    /**
     * @param numberOfIssues the numberOfIssues to set
     */
    public void setNumberOfIssues(int numberOfIssues) {
        this.numberOfIssues = numberOfIssues;
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
     * @return the localDateTime
     */
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    /**
     * @param localDateTime the localDateTime to set
     */
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
