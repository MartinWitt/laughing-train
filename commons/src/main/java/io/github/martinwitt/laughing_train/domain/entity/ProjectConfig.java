package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.util.Objects;

public class ProjectConfig implements Serializable {

    private String sourceFolder;
    private String projectUrl;

    public ProjectConfig(String sourceFolder, String projectUrl) {
        this.sourceFolder = Objects.requireNonNull(sourceFolder);
        this.projectUrl = Objects.requireNonNull(projectUrl);
    }

    public static ProjectConfig ofProjectUrl(String projectUrl) {
        return new ProjectConfig(".", projectUrl);
    }

    /**
     * @param sourceFolder the sourceFolder to set
     */
    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
    }
    /**
     * @param projectUrl the projectUrl to set
     */
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
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

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(sourceFolder, projectUrl);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProjectConfig config) {
            return Objects.equals(sourceFolder, config.sourceFolder) && Objects.equals(projectUrl, config.projectUrl);
        }
        return false;
    }
}
