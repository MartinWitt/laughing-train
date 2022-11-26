package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(database = "Laughing-Train", collection = "ProjectConfig")
@SuppressWarnings("NullAway")
public class ProjectConfigDao extends PanacheMongoEntity {
    private String sourceFolder;
    private String projectUrl;

    public ProjectConfigDao() {
        // for JPA
    }

    /**
     * @return the sourceFolder
     */
    public String getSourceFolder() {
        return sourceFolder;
    }
    /**
     * @param sourceFolder the sourceFolder to set
     */
    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
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

    @Override
    public String toString() {
        return "{" + " sourceFolder='" + getSourceFolder() + "'" + ", projectUrl='" + getProjectUrl() + "'" + "}";
    }
}
