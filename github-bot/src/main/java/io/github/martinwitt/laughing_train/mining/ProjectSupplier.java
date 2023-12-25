package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.commons.GitRepoHandler;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.vertx.core.AbstractVerticle;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.util.Random;
import java.util.random.RandomGenerator;

@ApplicationScoped
public class ProjectSupplier extends AbstractVerticle {

  private static final RandomGenerator RANDOM_GENERATOR = new Random();
  private final SearchProjectService searchProjectService;
  private final ProjectRepository projectRepository;

  ProjectSupplier(SearchProjectService searchProjectService, ProjectRepository projectRepository) {
    this.searchProjectService = searchProjectService;
    this.projectRepository = projectRepository;
  }

  Result<GitProject> supplyProject() {
    try {
      RemoteProject project = getRandomProject();
      return checkoutProject(project);
    } catch (Exception e) {
      return Result.error(e);
    }
  }

  private Result<GitProject> checkoutProject(RemoteProject project) {
    return GitRepoHandler.cloneGitProject(project.getProjectUrl());
  }

  private RemoteProject getRandomProject() throws IOException {
    if (RANDOM_GENERATOR.nextBoolean()) {
      return searchProjectService.searchProjectOnGithub();
    } else {
      return getKnownProject();
    }
  }

  private RemoteProject getKnownProject() {
    var list = projectRepository.getAll();
    if (list.isEmpty()) {
      throw new IllegalStateException("No known projects found");
    }
    return list.get(RANDOM_GENERATOR.nextInt(list.size()));
  }
}
