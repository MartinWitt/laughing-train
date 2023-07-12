package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.mining.requests.GetProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectService;
import io.quarkus.vertx.ConsumeEvent;
import java.io.IOException;
import java.util.Random;

public class ProjectSupplier {

    public static final String SERVICE_NAME = "projectSupplier";

    final SearchProjectService searchProjectService;
    final ProjectRepository projectRepository;
    final ProjectService projectService;
    private static final Random random = new Random();

    ProjectSupplier(
            SearchProjectService searchProjectService,
            ProjectRepository projectRepository,
            ProjectService projectService) {
        this.searchProjectService = searchProjectService;
        this.projectRepository = projectRepository;
        this.projectService = projectService;
    }

    @ConsumeEvent(value = SERVICE_NAME, blocking = true)
    ProjectResult supplyProject(GetProject getProject) {
        try {
            Project project = getRandomProject();
            return checkoutProject(project);
        } catch (IOException e) {
            return new ProjectResult.Error(e.getMessage());
        }
    }

    private ProjectResult checkoutProject(Project project) throws IOException {
        return projectService.handleProjectRequest(new ProjectRequest.WithUrl(project.getProjectUrl()));
    }

    private Project getRandomProject() throws IOException {
        if (random.nextBoolean()) {
            return searchProjectService.searchProjectOnGithub();
        } else {
            return getKnownProject();
        }
    }

    private Project getKnownProject() {
        var list = projectRepository.getAll();
        return list.get(random.nextInt(list.size()));
    }
}
