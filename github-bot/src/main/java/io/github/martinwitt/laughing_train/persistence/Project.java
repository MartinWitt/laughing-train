package io.github.martinwitt.laughing_train.persistence;

public class Project {

    private String projectName;
    private String projectUrl;

    public Project(String projectName, String projectUrl) {
        this.projectName = projectName;
        this.projectUrl = projectUrl;
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
}
