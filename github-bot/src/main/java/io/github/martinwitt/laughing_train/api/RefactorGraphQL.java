package io.github.martinwitt.laughing_train.api;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.services.RefactorService;
import io.quarkus.security.Authenticated;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

@GraphQLApi
@RequestScoped
public class RefactorGraphQL {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    RefactorService refactorService;

    @Inject
    BadSmellRepository badSmellRepository;

    @Query
    @Description("Returns a list of all available refactorings")
    public List<? extends AnalyzerRule> getAvailableRefactorings() {
        return Arrays.stream(QodanaRules.values()).toList();
    }

    @Mutation
    @Description("Refactoring the given bad smells")
    @Authenticated
    public Uni<String> refactor(List<String> badSmellIdentifier) {

        return Multi.createFrom()
                .items(badSmellIdentifier.stream())
                .onItem()
                .transformToUniAndConcatenate(badSmellRepository::findByIdentifier)
                .collect()
                .with(Collectors.flatMapping(Collection::stream, Collectors.toList()))
                .<String>flatMap(badSmells -> refactorService.refactor(badSmells));
    }
}
