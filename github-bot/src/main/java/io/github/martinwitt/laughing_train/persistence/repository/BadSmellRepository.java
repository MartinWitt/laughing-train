package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import java.util.List;

public interface BadSmellRepository {

    Uni<List<BadSmell>> findByRuleID(RuleId ruleID);

    Uni<List<BadSmell>> findByProjectName(String projectName);

    Uni<List<BadSmell>> findByProjectUrl(String projectUrl);

    Uni<List<BadSmell>> findByCommitHash(String commitHash);

    Uni<List<BadSmell>> findByIdentifier(String identifier);

    Uni<Long> deleteByIdentifier(String identifier);

    Uni<BadSmell> save(BadSmell badSmell);

    Multi<BadSmell> getAll();
}
