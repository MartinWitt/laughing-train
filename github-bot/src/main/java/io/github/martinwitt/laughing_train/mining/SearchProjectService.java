package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.GitHubConnector;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepositorySearchBuilder.Sort;
import org.kohsuke.github.GitHub;

/**
 * This service handles searches for random java projects on github. Use this service to get a
 * random project from github. See {@link #searchProjectOnGithub()}.
 */
@ApplicationScoped
public class SearchProjectService {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private static final RandomGenerator RANDOM_GENERATOR = new Random();
  private final List<String> githubOrganizations;
  private final ProjectRepository projectRepository;

  public SearchProjectService(
      ProjectRepository projectRepository,
      @ConfigProperty(name = "mining.github.search.orgs") List<String> githubOrganizations) {
    this.projectRepository = projectRepository;
    this.githubOrganizations = githubOrganizations;
  }

  /**
   * Searches for a random project on github and returns it as a {@link RemoteProject}. Only
   * projects from the config property {@code mining.github.search.orgs} are considered.
   *
   * @return a random project from github as a {@link RemoteProject}
   * @throws IOException if no project is found
   */
  public RemoteProject searchProjectOnGithub() throws IOException {
    var repo = findRandomRepositoryOnGithub();
    if (repo == null) {
      throw new IOException("No project found on github");
    }
    logger.atInfo().log(
        "Found project %s on github now starting mining it", repo.getHttpTransportUrl());
    return persistProject(getProject(repo));
  }

  /**
   * This searches for the repository in the database and returns it if it exists. If it does not
   * exist, it is created.
   *
   * @param ghRepo the repository to search for
   * @return the repository if it exists, null otherwise
   */
  private RemoteProject getProject(GHRepository ghRepo) {
    var list = projectRepository.findByProjectUrl(ghRepo.getHtmlUrl().toString());
    if (list.isEmpty()) {
      return projectRepository.save(toProject(ghRepo));
    } else {
      return list.get(0);
    }
  }

  /**
   * Persists the project in the database if it does not exist yet.
   *
   * @param project the project to persist
   * @return the persisted project or the project from the database if it already existed
   */
  private RemoteProject persistProject(RemoteProject project) {
    var list = projectRepository.findByProjectUrl(project.getProjectUrl());
    if (list.isEmpty()) {
      return projectRepository.save(project);
    } else {
      return project;
    }
  }

  private @Nullable GHRepository findRandomRepositoryOnGithub() {

    try {
      Result<GitHub> githubConnectionResult = GitHubConnector.connectOAuth();
      if (githubConnectionResult.isError()) {
        return null;
      }
      GitHub gitHub = githubConnectionResult.get();
      var repos =
          gitHub
              .searchRepositories()
              .q("language:java")
              .org(getRandomOrgName())
              .sort(Sort.UPDATED)
              .list()
              .withPageSize(50)
              .iterator()
              .nextPage();
      return repos.get(RANDOM_GENERATOR.nextInt(repos.size()));
    } catch (Exception e) {
      Log.error("Error while searching for project on github", e);
      return null;
    }
  }

  private String getRandomOrgName() {
    String org = githubOrganizations.get(RANDOM_GENERATOR.nextInt(githubOrganizations.size()));
    logger.atInfo().log("Searching for project in org %s", org);
    return org;
  }

  private RemoteProject toProject(GHRepository ghRepo) {
    String ghRepoUrl = ghRepo.getHtmlUrl().toString();
    return new RemoteProject(ghRepo.getName(), ghRepoUrl);
  }
}
