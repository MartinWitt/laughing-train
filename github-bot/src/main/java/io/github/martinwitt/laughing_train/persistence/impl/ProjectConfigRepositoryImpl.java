package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectConfigRepositoryImpl
        implements ProjectConfigRepository, ReactivePanacheMongoRepository<ProjectConfig> {

    public Uni<List<ProjectConfig>> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).list();
    }

    @Override
    public Uni<Boolean> existsByProjectUrl(String projectUrl) {
        return findByProjectUrl(projectUrl).map(projects -> !projects.isEmpty());
    }

    @Override
    public Uni<Long> deleteByProjectUrl(String projectUrl) {
        return delete("projectUrl", projectUrl);
    }

    @Override
    public Uni<ProjectConfig> create(ProjectConfig projectConfig) {
        return findByProjectUrl(projectConfig.getProjectUrl()).log().<ProjectConfig>flatMap(list -> {
            if (list.isEmpty()) {
                return persist(projectConfig);
            } else {
                return Uni.createFrom().item(list.get(0));
            }
        });
    }

    @Override
    public Uni<ProjectConfig> update(ProjectConfig projectConfig) {
        return update(projectConfig);
    }
}
