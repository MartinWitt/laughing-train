package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.refactor.RefactorService;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

@GraphQLApi
public class RefactorGraphQL {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject RefactorService refactorService;

  @Inject BadSmellRepository badSmellRepository;

  @Query
  @Description("Returns a list of all available refactorings")
  public List<? extends AnalyzerRule> getAvailableRefactorings() {
    return Arrays.stream(QodanaRules.values()).toList();
  }

  @Mutation
  @Description("Refactoring the given bad smells")
  @Authenticated
  public String refactor(List<String> badSmellIdentifier) {
    Set<BadSmell> badSmellsToRefactor =
        badSmellIdentifier.stream()
            .map(badSmellRepository::findByIdentifier)
            .collect(Collectors.flatMapping(Collection::stream, Collectors.toSet()));
    logger.atInfo().log(
        "Refactoring %s",
        badSmellsToRefactor.stream().map(BadSmell::ruleID).map(RuleId::id).toList());
    return refactorService.fixBadSmells(badSmellsToRefactor);
  }
}
