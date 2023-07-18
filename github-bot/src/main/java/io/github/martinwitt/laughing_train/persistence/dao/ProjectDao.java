package io.github.martinwitt.laughing_train.persistence.dao;

import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.util.List;

@MongoEntity(database = "Laughing-Train", collection = "Project")
@SuppressWarnings("NullAway")
public class ProjectDao extends PanacheMongoEntity {
    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;
    private List<GitHubCommit> commits;

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

    /**
     * @return the commits
     */
    public List<GitHubCommit> getCommits() {
        return commits;
    }
    /**
     * @param commits the commits to set
     */
    public void setCommits(List<GitHubCommit> commits) {
        this.commits = commits;
    }

    @Override
    public String toString() {
        return "{" + " projectName='"
                + getProjectName() + "'" + ", projectUrl='"
                + getProjectUrl() + "'" + ", commitHashes='"
                + getCommitHashes() + "'" + "}";
    }
}
