package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.requests.GetProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectService;
import io.quarkus.logging.Log;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.Message;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import java.io.IOException;
import java.util.Random;

@ApplicationScoped
public class ProjectSupplier extends AbstractVerticle {

  public static final String SERVICE_NAME = "projectSupplier";
  private static final Random random = new Random();
  final SearchProjectService searchProjectService;
  final ProjectRepository projectRepository;
  final ProjectService projectService;
  final Vertx vertx;

  @Produces
  Random random() {
    return new Random();
  }

  ProjectSupplier(
      SearchProjectService searchProjectService,
      ProjectRepository projectRepository,
      ProjectService projectService,
      Vertx vertx) {
    this.searchProjectService = searchProjectService;
    this.projectRepository = projectRepository;
    this.projectService = projectService;
    this.vertx = vertx;
  }

  @Override
  public void start() throws Exception {
    vertx.eventBus().<GetProject>consumer(SERVICE_NAME, v -> supplyProject(v));
  }

  void supplyProject(Message<GetProject> getProject) {
    try {
      RemoteProject project = getRandomProject();
      ProjectResult checkoutProject = checkoutProject(project);
      Log.info("Project %s checked out".formatted(project.getProjectUrl()));
      getProject.reply(checkoutProject);
    } catch (IOException e) {
      getProject.reply(new ProjectResult.Error(e.getMessage()));
    }
  }

  public ProjectResult supplyProject() {
    try {
      RemoteProject project = getRandomProject();
      ProjectResult checkoutProject = checkoutProject(project);
      Log.info("Project %s checked out".formatted(project.getProjectUrl()));
      return checkoutProject;
    } catch (IOException e) {
      return new ProjectResult.Error(e.getMessage());
    }
  }

  private ProjectResult checkoutProject(RemoteProject project) throws IOException {
    return projectService.handleProjectRequest(new ProjectRequest.WithUrl(project.getProjectUrl()));
  }

  private RemoteProject getRandomProject() throws IOException {
    if (random.nextBoolean()) {
      return searchProjectService.searchProjectOnGithub();
    } else {
      return getKnownProject();
    }
  }

  private RemoteProject getKnownProject() {
    var list = projectRepository.getAll();
    return list.get(random.nextInt(list.size()));
  }
}
