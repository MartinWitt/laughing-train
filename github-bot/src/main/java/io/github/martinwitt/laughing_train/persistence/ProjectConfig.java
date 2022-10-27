package io.github.martinwitt.laughing_train.persistence;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.io.Serializable;
import java.util.List;

@MongoEntity(database = "Laughing-Train")
public class ProjectConfig extends PanacheMongoEntity implements Serializable {

    private String sourceFolder;
    private String projectUrl;

    private ProjectConfig(String sourceFolder, String projectUrl) {
        this.sourceFolder = sourceFolder;
        this.projectUrl = projectUrl;
    }

    public static ProjectConfig ofProjectUrl(String projectUrl) {
        return new ProjectConfig(".", projectUrl);
    }

    public ProjectConfig() {
        sourceFolder = ".";
    }

    public static List<ProjectConfig> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).<ProjectConfig>list();
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
     * @return the sourceFolder
     */
    public String getSourceFolder() {
        return sourceFolder;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "ProjectConfig [sourceFolder=" + sourceFolder + ", projectUrl=" + projectUrl + "]";
    }
}
