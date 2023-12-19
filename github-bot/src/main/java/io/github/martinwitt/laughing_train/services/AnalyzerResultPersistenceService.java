package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.gitprojects.GitProject;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class AnalyzerResultPersistenceService {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject BadSmellRepository badSmellRepository;

  void persistResults(QodanaResult result) {
    if (result instanceof QodanaResult.Success success) {
      GitProject gitProject = success.gitProject();
      Multi.createFrom()
          .iterable(success.result())
          .map(
              badSmell ->
                  new BadSmell(
                      badSmell, gitProject.name(), gitProject.url(), gitProject.commitHash()))
          .filter(v -> badSmellRepository.findByIdentifier(v.getIdentifier()).isEmpty())
          .map(badSmellRepository::save)
          .collect()
          .with(Collectors.counting())
          .subscribe()
          .with(
              badSmell ->
                  logger.atInfo().log(
                      "Persisted %d qodana bad smells for project %s",
                      badSmell, gitProject.name()));
    }
  }

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
