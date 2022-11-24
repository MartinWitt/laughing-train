package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import java.util.List;

public interface BadSmellRepository {

    public List<BadSmell> findByRuleID(RuleId ruleID);

    public List<BadSmell> findByProjectName(String projectName);

    public List<BadSmell> findByProjectUrl(String projectUrl);

    public List<BadSmell> findByCommitHash(String commitHash);

    public List<BadSmell> findByIdentifier(String identifier);
}
