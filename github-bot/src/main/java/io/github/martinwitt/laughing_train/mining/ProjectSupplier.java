package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.commons.GitRepoHandler;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.logging.Log;
import io.vertx.core.AbstractVerticle;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import java.io.IOException;
import java.util.Random;

@ApplicationScoped
public class ProjectSupplier extends AbstractVerticle {

  private static final Random random = new Random();
  private final SearchProjectService searchProjectService;
  private final ProjectRepository projectRepository;

  @Produces
  Random random() {
    return new Random();
  }

  ProjectSupplier(SearchProjectService searchProjectService, ProjectRepository projectRepository) {
    this.searchProjectService = searchProjectService;
    this.projectRepository = projectRepository;
  }

  Result<GitProject> supplyProject() {
    try {
      RemoteProject project = getRandomProject();
      Result<GitProject> checkoutProject = checkoutProject(project);
      Log.info("Project %s checked out".formatted(project.getProjectUrl()));
      return checkoutProject;
    } catch (IOException e) {
      return Result.error(e);
    }
  }

  private Result<GitProject> checkoutProject(RemoteProject project) throws IOException {
    return GitRepoHandler.cloneGitProject(project.getProjectUrl());
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
