package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Multi;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AnalyzerResultPersistenceService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    BadSmellRepository badSmellRepository;

    @ConsumeEvent(value = ServiceAddresses.QODANA_ANALYZER_RESPONSE, blocking = true)
    void persistResults(QodanaResult result) {
        if (result instanceof QodanaResult.Success success) {
            Project project = success.project();
            Multi.createFrom()
                    .iterable(success.result())
                    .map(badSmell -> new BadSmell(badSmell, project.name(), project.url(), project.commitHash()))
                    .invoke(badSmellRepository::save)
                    .collect()
                    .with(Collectors.counting())
                    .subscribe()
                    .with(badSmell ->
                            logger.atInfo().log("Persisted %d bad smells for project %s", badSmell, project.name()));
        }
    }
}
