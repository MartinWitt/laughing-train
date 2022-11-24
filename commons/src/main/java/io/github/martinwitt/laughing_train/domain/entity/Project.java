package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Project implements Serializable {

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

    public Project(String projectName, String projectUrl) {
        this.projectName = Objects.requireNonNull(projectName);
        this.projectUrl = Objects.requireNonNull(projectUrl);
        commitHashes = new ArrayList<>();
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

    /** (non-Javadoc)
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(projectName, projectUrl, commitHashes);
    }

    /** (non-Javadoc)
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Project project) {
            return Objects.equals(projectName, project.projectName)
                    && Objects.equals(projectUrl, project.projectUrl)
                    && Objects.equals(commitHashes, project.commitHashes);
        }
        return false;
    }
}
