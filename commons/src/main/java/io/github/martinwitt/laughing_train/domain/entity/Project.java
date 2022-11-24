package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Project implements Serializable {

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

    public Project(String projectName, String projectUrl) {
        this.projectName = projectName;
        this.projectUrl = projectUrl;
        commitHashes = new ArrayList<>();
    }

    public Project() {
        // default constructor for mongodb
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
     * @param commitHash the commitHash to add
     */
    public void addCommitHash(String commitHash) {
        if (!commitHashes.contains(commitHash)) {
            commitHashes.add(commitHash);
        }
    }

    public boolean removeCommitHash(String commitHash) {
        return commitHashes.remove(commitHash);
    }

    /**
     * @return the commitHashes
     */
    public List<String> getCommitHashes() {
        return commitHashes;
    }
}
