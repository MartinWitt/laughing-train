package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.Project;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class ProjectGraphQL {
    @Query("getProjects")
    @Description("Gets all projects from the database")
    public List<Project> getAllProjects() {
        return BadSmell.<BadSmell>mongoCollection()
                .distinct("projectName", BadSmell.class)
                .map(v -> new Project(v.getProjectName(), v.getProjectUrl()))
                .into(new ArrayList<>());
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
