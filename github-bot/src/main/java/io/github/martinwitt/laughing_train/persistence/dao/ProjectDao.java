package io.github.martinwitt.laughing_train.persistence.dao;

import java.util.List;

public class ProjectDao {

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

    public ProjectDao() {
        // for JPA
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
     * @return the commitHashes
     */
    public List<String> getCommitHashes() {
        return commitHashes;
    }

    /**
     * @param commitHashes the commitHashes to set
     */
    public void setCommitHashes(List<String> commitHashes) {
        this.commitHashes = commitHashes;
    }
}
