package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.Project;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class ProjectGraphQL {
    @Query("getProjects")
    @Description("Gets all projects from the database")
    public List<Project> getAllProjects() {
        return BadSmell.<BadSmell>findAll().stream()
                .map(v -> new Project(v.getProjectName(), v.getProjectUrl()))
                .distinct()
                .collect(Collectors.toList());
    }

    @Query("getHashesForProject")
    @Description("Gets all commit hashes for a project from the database")
    public List<String> getHashesForProject(String projectName) {
        return BadSmell.findByProjectName(projectName).stream()
                .map(BadSmell::getCommitHash)
                .distinct()
                .toList();
    }
}
