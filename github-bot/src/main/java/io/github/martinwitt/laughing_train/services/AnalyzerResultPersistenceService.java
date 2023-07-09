package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.stream.Collectors;

@ApplicationScoped
public class AnalyzerResultPersistenceService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    BadSmellRepository badSmellRepository;

    void persistResults(QodanaResult result) {
        if (result instanceof QodanaResult.Success success) {
            Project project = success.project();
            Multi.createFrom()
                    .iterable(success.result())
                    .map(badSmell -> new BadSmell(badSmell, project.name(), project.url(), project.commitHash()))
                    .filter(v -> badSmellRepository
                            .findByIdentifier(v.getIdentifier())
                            .isEmpty())
                    .map(badSmellRepository::save)
                    .collect()
                    .with(Collectors.counting())
                    .subscribe()
                    .with(badSmell -> logger.atInfo().log(
                            "Persisted %d qodana bad smells for project %s", badSmell, project.name()));
        }
    }

    void persistResults(CodeAnalyzerResult result) {
        if (result instanceof CodeAnalyzerResult.Success success) {
            Project project = success.project();
            Multi.createFrom()
                    .iterable(success.results())
                    .map(badSmell -> new BadSmell(badSmell, project.name(), project.url(), project.commitHash()))
                    .filter(v -> badSmellRepository
                            .findByIdentifier(v.getIdentifier())
                            .isEmpty())
                    .map(badSmellRepository::save)
                    .collect()
                    .with(Collectors.counting())
                    .subscribe()
                    .with(badSmell ->
                            logger.atInfo().log("Persisted %d bad smells for project %s", badSmell, project.name()));
        }
    }
}
