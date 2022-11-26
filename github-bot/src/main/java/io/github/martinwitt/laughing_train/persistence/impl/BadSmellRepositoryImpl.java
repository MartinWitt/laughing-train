package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.converter.BadSmellDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.BadSmellDao;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.util.List;
import java.util.stream.Stream;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BadSmellRepositoryImpl implements BadSmellRepository, PanacheMongoRepository<BadSmellDao> {

    private static final BadSmellDaoConverter badSmellConverter = new BadSmellDaoConverter();

    public List<BadSmell> findByRuleID(RuleId ruleID) {
        return find("ruleID", ruleID.ruleID()).stream()
                .map(badSmellConverter::convertToEntity)
                .toList();
    }

    public List<BadSmell> findByProjectName(String projectName) {
        return find("projectName", projectName).stream()
                .map(badSmellConverter::convertToEntity)
                .toList();
    }

    public List<BadSmell> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).stream()
                .map(badSmellConverter::convertToEntity)
                .toList();
    }

    public List<BadSmell> findByCommitHash(String commitHash) {
        return find("commitHash", commitHash).stream()
                .map(badSmellConverter::convertToEntity)
                .toList();
    }

    public List<BadSmell> findByIdentifier(String identifier) {
        return find("identifier", identifier).stream()
                .map(badSmellConverter::convertToEntity)
                .toList();
    }

    @Override
    public long deleteByIdentifier(String identifier) {
        return delete("identifier", identifier);
    }

    @Override
    public BadSmell save(BadSmell badSmell) {
        var list = find("identifier", badSmell.getIdentifier()).list();
        if (list.isEmpty()) {
            persist(badSmellConverter.convertToDao(badSmell));
        } else {
            var dao = badSmellConverter.convertToDao(badSmell);
            dao.id = list.get(0).id;
            update(dao);
            update(badSmellConverter.convertToDao(badSmell));
        }
        return badSmell;
    }

    @Override
    public Stream<BadSmell> getAll() {
        return streamAll().map(badSmellConverter::convertToEntity);
    }
}
