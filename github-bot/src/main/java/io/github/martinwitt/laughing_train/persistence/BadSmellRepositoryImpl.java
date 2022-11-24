package io.github.martinwitt.laughing_train.persistence;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BadSmellRepositoryImpl implements BadSmellRepository, PanacheMongoRepository<BadSmell> {

    public List<BadSmell> findByRuleID(RuleId ruleID) {
        return list("ruleID", ruleID.ruleID());
    }

    public List<BadSmell> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }

    public List<BadSmell> findByProjectUrl(String projectUrl) {
        return list("projectUrl", projectUrl);
    }

    public List<BadSmell> findByCommitHash(String commitHash) {
        return list("commitHash", commitHash);
    }

    public List<BadSmell> findByIdentifier(String identifier) {
        return list("identifier", identifier);
    }
}
