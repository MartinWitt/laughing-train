package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AnalyzerResultPersistenceService {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject BadSmellRepository badSmellRepository;


  void persistResults(CodeAnalyzerResult.Success success) {
    logger.atInfo().log(
        "Persisting %s results for project %s",
        success.results().size(), success.gitProject().name());
    GitProject gitProject = success.gitProject();
    success.results().stream()
        .map(
            badSmell ->
                new BadSmell(
                    badSmell, gitProject.name(), gitProject.url(), gitProject.commitHash()))
        .filter(it -> badSmellRepository.findByIdentifier(it.getIdentifier()).isEmpty())
        .forEach(badSmellRepository::save);
  }
}
