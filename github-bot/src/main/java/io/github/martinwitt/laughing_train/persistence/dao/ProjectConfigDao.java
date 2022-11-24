package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(database = "Laughing-Train")
public class ProjectConfigDao {

    private String sourceFolder;
    private String projectUrl;

    public ProjectConfigDao() {
        // for JPA
    }
    /**
     * @param sourceFolder
     * @param projectUrl
     */
    public ProjectConfigDao(String sourceFolder, String projectUrl) {
        this.sourceFolder = sourceFolder;
        this.projectUrl = projectUrl;
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
}
