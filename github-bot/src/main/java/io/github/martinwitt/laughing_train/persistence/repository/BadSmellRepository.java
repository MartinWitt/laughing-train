package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import java.util.List;
import java.util.stream.Stream;

public interface BadSmellRepository {

    List<BadSmell> findByRuleID(RuleId ruleID);

    List<BadSmell> findByProjectName(String projectName);

    List<BadSmell> findByProjectUrl(String projectUrl);

    List<BadSmell> findByCommitHash(String commitHash);

    List<BadSmell> findByIdentifier(String identifier);

    long deleteByIdentifier(String identifier);

    BadSmell save(BadSmell badSmell);

    Stream<BadSmell> getAll();
}
