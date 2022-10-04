package io.github.martinwitt.laughing_train.persistence;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@MongoEntity(database = "Laughing-Train")
public class Project extends PanacheMongoEntity implements Serializable {

    public String projectName;
    public String projectUrl;
    public List<String> commitHashes;

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

    public static List<Project> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }

    /**
     * @param commitHash the commitHash to add
     */
    public void addCommitHash(String commitHash) {
        commitHashes.add(commitHash);
    }

    /**
     * @return the commitHashes
     */
    public List<String> getCommitHashes() {
        return commitHashes;
    }
}
