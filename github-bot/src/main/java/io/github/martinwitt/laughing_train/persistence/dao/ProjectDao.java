package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.util.List;
import org.bson.types.ObjectId;

@MongoEntity(database = "Laughing-Train", collection = "Project")
public class ProjectDao extends PanacheMongoEntity {

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

    public ProjectDao() {
        id = new ObjectId();
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
