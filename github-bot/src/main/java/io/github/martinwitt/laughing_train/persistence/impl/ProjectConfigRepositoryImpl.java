package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.converter.ProjectConfigConverter;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectConfigDao;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectConfigRepositoryImpl
        implements ProjectConfigRepository, ReactivePanacheMongoRepository<ProjectConfigDao> {

            private static ProjectConfigConverter projectConfigConverter = new ProjectConfigConverter();
    public Uni<List<ProjectConfig>> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).stream().map(projectConfigConverter::convertToEntity).collect().asList();
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
        return findByProjectUrl(projectConfig.getProjectUrl()).flatMap(list -> {
            if (list.isEmpty()) {
                return persist(projectConfigConverter.convertToDao(projectConfig)).map(projectConfigConverter::convertToEntity);
            } else {
                return Uni.createFrom().item(list.get(0));
            }
        });
    }

    @Override
    public Uni<ProjectConfig> save(ProjectConfig projectConfig) {
        return update(projectConfigConverter.convertToDao(projectConfig)).map(projectConfigConverter::convertToEntity);
    }
}
