package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import java.util.List;

public interface BadSmellRepository {

    List<BadSmell> findByRuleID(RuleId ruleID);

    List<BadSmell> findByProjectName(String projectName);

    List<BadSmell> findByProjectUrl(String projectUrl);

    List<BadSmell> findByCommitHash(String commitHash);

    List<BadSmell> findByIdentifier(String identifier);
}
