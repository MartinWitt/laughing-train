package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.data.FindProjectConfigResult;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.quarkus.vertx.ConsumeEvent;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectConfigService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @ConsumeEvent(value = ServiceAdresses.PROJECT_CONFIG_REQUEST, blocking = true)
    public FindProjectConfigResult getConfig(FindProjectConfigRequest request) {
        if (request instanceof FindProjectConfigRequest.ByProjectUrl byProjectUrl) {
            return convertToResult(ProjectConfig.findByProjectUrl(byProjectUrl.projectUrl()));
        }
        logger.atWarning().log("Unknown request type %s", request.getClass());
        return new FindProjectConfigResult.NotFound();
    }

    private FindProjectConfigResult convertToResult(List<ProjectConfig> projectConfigs) {
        if (projectConfigs.isEmpty()) {
            return new FindProjectConfigResult.NotFound();
        } else if (projectConfigs.size() == 1) {
            return new FindProjectConfigResult.SingleResult(
                    projectConfigs.iterator().next());
        } else {
            return new FindProjectConfigResult.MultipleResults(projectConfigs);
        }
    }
}
