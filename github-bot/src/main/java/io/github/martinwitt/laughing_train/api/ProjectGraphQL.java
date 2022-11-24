package io.github.martinwitt.laughing_train.api;

import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.sort;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Sorts.ascending;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectConfigService;
import io.quarkus.security.Authenticated;
import io.smallrye.mutiny.Uni;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@RequestScoped
public class ProjectGraphQL {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    ProjectConfigService projectConfigService;

    @Inject
    ProjectRepository projectRepository;

    @Inject
    ProjectConfigRepository projectConfigRepository;

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
    public Uni<Project> addProject(String projectUrl, String projectName) {
        return projectConfigRepository
                .existsByProjectUrl(projectUrl)
                .invoke(exist -> {
                    if (exist) {
                        projectConfigRepository.create(ProjectConfig.ofProjectUrl(projectUrl));
                    }
                })
                .replaceWith(new Project(projectName, projectUrl))
                .invoke(project -> projectRepository.create(project));
    }

    @Mutation("deleteProject")
    @Authenticated
    @Description("Deletes a project from the database")
    public List<Project> removeProjectByName(String projectName) {
        var result = Project.findByProjectName(projectName);
        result.forEach(Project::delete);
        return result;
    }

    @Query("login")
    @Authenticated
    @Description("Logins the user")
    public String login(@DefaultValue("defaultValue") String notNeeded) {
        return "login successful";
    }

    @Query("getProjectConfig")
    @Description("Gets the project config for a project")
    public Uni<ProjectConfig> getProjectConfig(String projectUrl) {
        return projectConfigService
                .getConfig(new FindProjectConfigRequest.ByProjectUrl(projectUrl))
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        return projectConfigRepository.create(ProjectConfig.ofProjectUrl(projectUrl));
                    } else {
                        return Uni.createFrom().item(list.get(0));
                    }
                });
    }

    @Mutation
    @Authenticated
    @Description("Sets the project config for a project")
    public Uni<ProjectConfig> setProjectConfig(ProjectConfig projectConfig) {

        String projectUrl = projectConfig.getProjectUrl();
        return projectConfigService
                .getConfig(new FindProjectConfigRequest.ByProjectUrl(projectUrl))
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        return projectConfigRepository.create(ProjectConfig.ofProjectUrl(projectUrl));
                    } else {
                        return projectConfigRepository.save(projectConfig);
                    }
                });
    }
}
