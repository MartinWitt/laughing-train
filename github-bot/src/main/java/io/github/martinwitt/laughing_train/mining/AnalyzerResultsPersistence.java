package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.quarkus.vertx.ConsumeEvent;

public class AnalyzerResultsPersistence {

    public static final String SERVICE_NAME = "analyzerResultsPersistence";

    @ConsumeEvent(value = SERVICE_NAME, blocking = true)
    void persistResults(StoreResults storeResults) {}
}
