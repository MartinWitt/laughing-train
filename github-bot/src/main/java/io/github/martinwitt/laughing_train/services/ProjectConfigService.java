package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ProjectConfigService {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject ProjectConfigRepository projectConfigRepository;

  public List<ProjectConfig> getProjectConfig(FindProjectConfigRequest request) {
    if (request instanceof FindProjectConfigRequest.ByProjectUrl byProjectUrl) {
      return projectConfigRepository.findByProjectUrl(byProjectUrl.projectUrl());
    }
    logger.atWarning().log("Unknown request type %s", request.getClass());
    throw new IllegalArgumentException("Unknown request type");
  }
}
