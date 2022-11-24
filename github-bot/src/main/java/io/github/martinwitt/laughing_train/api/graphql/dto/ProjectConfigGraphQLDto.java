package io.github.martinwitt.laughing_train.api.graphql.dto;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import org.eclipse.microprofile.graphql.Name;

@Name("ProjectConfig")
public class ProjectConfigGraphQLDto {
    private String sourceFolder;
    private String projectUrl;

    public ProjectConfigGraphQLDto() {
        // pojo constructor
    }

    public ProjectConfigGraphQLDto(ProjectConfig projectConfig) {
        this.sourceFolder = projectConfig.getSourceFolder();
        this.projectUrl = projectConfig.getProjectUrl();
    }

    public String getSourceFolder() {
        return this.sourceFolder;
    }

    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
    }

    public String getProjectUrl() {
        return this.projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }
}
