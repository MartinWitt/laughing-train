package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProjectConfigService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    ProjectConfigRepository projectConfigRepository;

    public Uni<List<ProjectConfig>> getConfig(FindProjectConfigRequest request) {
        if (request instanceof FindProjectConfigRequest.ByProjectUrl byProjectUrl) {
            return projectConfigRepository.findByProjectUrl(byProjectUrl.projectUrl());
        }
        logger.atWarning().log("Unknown request type %s", request.getClass());
        return Uni.createFrom().failure(new IllegalArgumentException("Unknown request type"));
    }
}
