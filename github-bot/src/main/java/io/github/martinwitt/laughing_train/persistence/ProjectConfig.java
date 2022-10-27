package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.io.Serializable;
import java.util.List;

@MongoEntity(database = "Laughing-Train")
public class ProjectConfig extends PanacheMongoEntity implements Serializable {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String sourceFolder;
    private String projectUrl;

    public ProjectConfig(String sourceFolder, String projectUrl) {
        this.sourceFolder = sourceFolder;
        this.projectUrl = projectUrl;
    }

    public static ProjectConfig ofProjectUrl(String projectUrl) {
        return new ProjectConfig(".", projectUrl);
    }

    public ProjectConfig(String projectUrl) {
        this(".", projectUrl);
    }

    public ProjectConfig() {
        sourceFolder = ".";
    }

    public static List<ProjectConfig> findByProjectUrl(String projectUrl) {
        logger.atInfo().log("Searching for project config for %s", projectUrl);
        listAll().forEach(System.out::println);
        return find("projectUrl", projectUrl).list();
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
