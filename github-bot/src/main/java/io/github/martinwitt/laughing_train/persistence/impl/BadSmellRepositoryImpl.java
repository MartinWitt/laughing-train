package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.converter.BadSmellDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.BadSmellDao;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BadSmellRepositoryImpl implements BadSmellRepository, ReactivePanacheMongoRepository<BadSmellDao> {

    private static final BadSmellDaoConverter badSmellConverter = new BadSmellDaoConverter();

    public Uni<List<BadSmell>> findByRuleID(RuleId ruleID) {
        return find("ruleID", ruleID.ruleID()).stream()
                .map(badSmellConverter::convertToEntity)
                .collect()
                .asList();
    }

    public Uni<List<BadSmell>> findByProjectName(String projectName) {
        return find("projectName", projectName).stream()
                .map(badSmellConverter::convertToEntity)
                .collect()
                .asList();
    }

    public Uni<List<BadSmell>> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).stream()
                .map(badSmellConverter::convertToEntity)
                .collect()
                .asList();
    }

    public Uni<List<BadSmell>> findByCommitHash(String commitHash) {
        return find("commitHash", commitHash).stream()
                .map(badSmellConverter::convertToEntity)
                .collect()
                .asList();
    }

    public Uni<List<BadSmell>> findByIdentifier(String identifier) {
        return find("identifier", identifier).stream()
                .map(badSmellConverter::convertToEntity)
                .collect()
                .asList();
    }

    @Override
    public Uni<Long> deleteByIdentifier(String identifier) {
        return delete("identifier", identifier).invoke(() -> System.out.println("Deleted " + identifier));
    }

    @Override
    public Uni<BadSmell> save(BadSmell badSmell) {
        return findByIdentifier(badSmell.getIdentifier()).flatMap(list -> {
            if (list.isEmpty()) {
                return persist(badSmellConverter.convertToDao(badSmell)).map(badSmellConverter::convertToEntity);
            } else {
                // 2 bad smells with same identifier should be the same no reason to update
                return Uni.createFrom().item(badSmell);
            }
        });
    }

    @Override
    public Multi<BadSmell> getAll() {
        return streamAll().map(badSmellConverter::convertToEntity);
    }
}
