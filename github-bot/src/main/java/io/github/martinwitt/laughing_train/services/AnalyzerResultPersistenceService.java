package io.github.martinwitt.laughing_train.services;

import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.quarkus.vertx.ConsumeEvent;
import javax.enterprise.context.ApplicationScoped;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class AnalyzerResultPersistenceService {

    @ConsumeEvent(value = ServiceAddresses.QODANA_ANALYZER_RESPONSE, blocking = true)
    void persistResults(QodanaResult result) {
        if (result instanceof QodanaResult.Success success) {
            Project project = success.project();
            for (AnalyzerResult badSmell : success.result()) {
                if (BadSmell.findByIdentifier(
                                BadSmell.generateIdentifier(badSmell, project.name(), project.commitHash()))
                        .isEmpty()) {
                    var savedBadSmell = new BadSmell(badSmell, project.name(), project.url(), project.commitHash());
                    if (BadSmell.findByIdentifier(savedBadSmell.identifier).isEmpty()) {
                        savedBadSmell.persist();
                    }
                }
            }
        }
    }
}
