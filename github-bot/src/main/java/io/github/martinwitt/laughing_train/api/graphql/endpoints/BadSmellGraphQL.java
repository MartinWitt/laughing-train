package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import io.github.martinwitt.laughing_train.api.graphql.dto.BadSmellGraphQLDto;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.summary.GetFixableBadSmells;
import io.github.martinwitt.spoon_analyzer.badsmells.SpoonRules;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@RequestScoped
@RunOnVirtualThread
public class BadSmellGraphQL {

  @Inject BadSmellRepository badSmellRepository;

  @Inject GetFixableBadSmells getFixableBadSmells;

  @Inject ProjectRepository projectRepository;

  @Query("byRuleID")
  @Description("Gets all bad smells from the database by ruleID")
  public List<BadSmellGraphQLDto> getAllBadSmellsByRuleID(@Name("ruleID") String ruleID) {
    return badSmellRepository.findByRuleID(new RuleId(ruleID)).stream()
        .map(this::mapToDto)
        .toList();
  }

  @Query("byRuleIDAndAnalyzerAndCommitHash")
  @Description("Gets all bad smells from the database by ruleID and analyzer and commitHash")
  public List<BadSmellGraphQLDto> getBadSmellsByRuleIdAndAnalyzer(
      @Name("ruleID") String ruleID,
      @Name("analyzer") String analyzer,
      @Name("commitHash") String commitHash) {
    return badSmellRepository.findByCommitHash(commitHash, analyzer, ruleID).stream()
        .map(this::mapToDto)
        .toList();
  }

  @Query("byAndAnalyzerAndCommitHash")
  @Description("Gets all bad smells from the database by analyzer and commitHash")
  public List<BadSmellGraphQLDto> getBadSmellsByRuleIdAndAnalyzer(
      @Name("analyzer") String analyzer, @Name("commitHash") String commitHash) {
    return badSmellRepository.findByCommitHash(commitHash, analyzer).stream()
        .map(this::mapToDto)
        .toList();
  }

  @Query("byProjectName")
  @Description("Gets all bad smells from the database by projectName")
  public List<BadSmellGraphQLDto> getAllBadSmellsByProjectName(
      @Name("projectName") String projectName) {
    return badSmellRepository.findByProjectName(projectName).stream().map(this::mapToDto).toList();
  }

  @Query("byCommitHash")
  @Description("Gets all bad smells from the database by commitHash")
  public List<BadSmellGraphQLDto> getAllBadSmellsByCommitHash(
      @Name("commitHash") String commitHash) {
    return badSmellRepository.findByCommitHash(commitHash).stream().map(this::mapToDto).toList();
  }

  @Query("byIdentifier")
  @Description("Gets all bad smells from the database by identifier")
  public List<BadSmellGraphQLDto> getAllBadSmellsByIdentifier(
      @Name("identifier") String identifier) {
    return badSmellRepository.findByIdentifier(identifier).stream().map(this::mapToDto).toList();
  }

  @Query("fixableByProjectName")
  @Description("Gets all fixable bad smells from the database by projectUrl")
  public List<BadSmellGraphQLDto> getAllFixableBadSmellsByProjectUrl(
      @Name("projectUrl") String projectUrl) {
    var projects = projectRepository.findByProjectUrl(projectUrl);
    if (projects.isEmpty()) {
      return List.of();
    }
    return getFixableBadSmells.getFixableBadSmells(projects.get(0)).stream()
        .map(this::mapToDto)
        .toList();
  }

  @Query("fixableBadSmells")
  @Description("Gets all fixable bad smells rules")
  public List<String> getAllFixableBadSmells() {
    return Arrays.stream(SpoonRules.values()).map(SpoonRules::getRuleID).toList();
  }

  private BadSmellGraphQLDto mapToDto(BadSmell badSmell) {
    return new BadSmellGraphQLDto(badSmell);
  }
}
