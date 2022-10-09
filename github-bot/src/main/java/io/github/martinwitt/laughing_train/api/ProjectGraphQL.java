package io.github.martinwitt.laughing_train.api;

import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.sort;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Sorts.ascending;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.Project;
import io.quarkus.security.Authenticated;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.jwt.JsonWebToken;

@GraphQLApi
@RequestScoped
public class ProjectGraphQL {

    @Inject
    JsonWebToken accessToken;

    @Query("getProjects")
    @Description("Gets all projects from the database")
    public List<Project> getAllProjects() {
        return Project.<Project>findAll().list();
    }

    @Query("getProjectWithName")
    @Description("Gets project with given name from the database")
    public Project getProject(String projectName) {
        return Project.<Project>list("projectName", projectName).stream()
                .findAny()
                .orElse(null);
    }

    @Query("getHashesForProject")
    @Description("Gets all commit hashes for a project from the database")
    public List<String> getHashesForProject(String projectName) {
        Bson matchStage = match(eq("projectName", projectName));
        Bson groupStage = group("$commitHash");
        Bson sortStage = sort(ascending("commitHash"));
        return BadSmell.<BadSmell>mongoCollection()
                .aggregate(List.of(matchStage, groupStage, sortStage), BsonDocument.class)
                .map(v -> v.get(v.getFirstKey()).asString().getValue())
                .into(new ArrayList<>());
    }

    @Mutation("addProject")
    @Authenticated
    @Description("Adds a project to the database")
    public Project addProject(String projectUrl, String projectName) {
        System.out.println("User: " + accessToken.getName());
        if (!accessToken.getName().equals("martinwitt")) {
            return null;
        }
        Project project = new Project(projectName, projectUrl);
        project.persistOrUpdate();
        return project;
    }

    @Mutation("deleteProject")
    @Authenticated
    @Description("Deletes a project from the database")
    public List<Project> removeProjectByName(String projectName) {
        var result = Project.findByProjectName(projectName);
        result.forEach(Project::delete);
        return result;
    }
}
