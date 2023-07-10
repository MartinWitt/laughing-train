package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.util.List;

public class GitHubCommit implements Serializable {

    private String commitHash;
    private List<AnalyzerStatus> analyzerStatuses;

    /**
     * @param commitHash
     * @param localDateTime
     * @param analyzerStatuses
     */
    public GitHubCommit(String commitHash, List<AnalyzerStatus> analyzerStatuses) {
        this.commitHash = commitHash;
        this.analyzerStatuses = analyzerStatuses;
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
     * @return the analyzerStatuses
     */
    public List<AnalyzerStatus> getAnalyzerStatuses() {
        return analyzerStatuses;
    }
    /**
     * @param analyzerStatuses the analyzerStatuses to set
     */
    public void setAnalyzerStatuses(List<AnalyzerStatus> analyzerStatuses) {
        this.analyzerStatuses = analyzerStatuses;
    }

    public void addAnalyzerStatus(AnalyzerStatus analyzerStatus) {
        this.analyzerStatuses.add(analyzerStatus);
    }
}
