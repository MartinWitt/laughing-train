package io.github.martinwitt.laughing_train.persistence;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.io.Serializable;
import java.util.List;

@MongoEntity(database = "Laughing-Train")
public class Project extends PanacheMongoEntityBase implements Serializable {

    private String projectName;
    private String projectUrl;

    public Project(String projectName, String projectUrl) {
        this.projectName = projectName;
        this.projectUrl = projectUrl;
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
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    /**
     * @param projectUrl the projectUrl to set
     */
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public static List<Project> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }
}
