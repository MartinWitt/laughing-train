package io.github.martinwitt.laughing_train.api.graphql.dto;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import java.util.List;
import org.eclipse.microprofile.graphql.Name;

@Name("Project")
public class ProjectGraphQLDto {

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

    @SuppressWarnings("NullAway")
    public ProjectGraphQLDto() {}

    public ProjectGraphQLDto(Project project) {
        this.projectName = project.getProjectName();
        this.projectUrl = project.getProjectUrl();
        this.commitHashes = project.getCommitHashes();
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectUrl() {
        return this.projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public List<String> getCommitHashes() {
        return this.commitHashes;
    }

    public void setCommitHashes(List<String> commitHashes) {
        this.commitHashes = commitHashes;
    }
}
