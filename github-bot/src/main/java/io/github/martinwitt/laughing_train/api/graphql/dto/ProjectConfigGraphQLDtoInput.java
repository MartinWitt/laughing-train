package io.github.martinwitt.laughing_train.api.graphql.dto;

import org.eclipse.microprofile.graphql.Name;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;

@Name("ProjectConfig")
public class ProjectConfigGraphQLDtoInput {

    private String sourceFolder;
    private String projectUrl;

    @SuppressWarnings("NullAway")
    public ProjectConfigGraphQLDtoInput() {}

    public ProjectConfigGraphQLDtoInput(ProjectConfig projectConfig) {
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
