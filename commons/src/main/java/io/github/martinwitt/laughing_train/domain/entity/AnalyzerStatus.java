package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;

public class AnalyzerStatus implements Serializable {

    private String analyzerName;
    private Status status;
    private int numberOfIssues;

    AnalyzerStatus(String analyzerName, Status status, int numberOfIssues) {
        this.analyzerName = analyzerName;
        this.status = status;
        this.numberOfIssues = numberOfIssues;
    }

    public static AnalyzerStatus success(String analyzerName, int numberOfIssues) {
        return new AnalyzerStatus(analyzerName, Status.SUCCESS, numberOfIssues);
    }

    public static AnalyzerStatus failure(String analyzerName, int numberOfIssues) {
        return new AnalyzerStatus(analyzerName, Status.FAILURE, numberOfIssues);
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
}
