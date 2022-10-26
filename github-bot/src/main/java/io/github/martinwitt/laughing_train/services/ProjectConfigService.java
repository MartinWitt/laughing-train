package io.github.martinwitt.laughing_train.services;

import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.data.FindProjectConfigResult;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectConfigService {
    @ConsumeEvent(value = ServiceAdresses.PROJECT_CONFIG_REQUEST)
    public FindProjectConfigResult getConfig(FindProjectConfigRequest request) {
        if (request instanceof FindProjectConfigRequest.ByProjectUrl byProjectUrl) {
            return Uni.createFrom()
                    .item(ProjectConfig.findByProjectUrl(byProjectUrl.projectUrl()))
                    .onItem()
                    .transform(this::convertToResult)
                    .await()
                    .indefinitely();
        }
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
