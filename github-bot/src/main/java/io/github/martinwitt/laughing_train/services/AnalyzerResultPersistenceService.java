package io.github.martinwitt.laughing_train.services;

import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.quarkus.vertx.ConsumeEvent;
import javax.enterprise.context.ApplicationScoped;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class AnalyzerResultPersistenceService {

    @ConsumeEvent(ServiceAdresses.QODANA_ANALYZER_RESPONSE)
    void persistResults(QodanaResult result) {
        if (result instanceof QodanaResult.Success success) {
            Project project = success.project();
            for (AnalyzerResult badSmell : success.result()) {
                // TODO: convert to multi creation
                new BadSmell(badSmell, project.name(), project.url(), project.commitHash()).persistOrUpdate();
            }
        }
    }
}
