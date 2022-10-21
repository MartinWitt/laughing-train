package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.services.RefactorService;
import io.quarkus.security.Authenticated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;

@GraphQLApi
@RequestScoped
public class RefactorGraphQL {
    @Query
    @Description("Returns a list of all available refactorings")
    public List<? extends AnalyzerRule> getAvailableRefactorings() {
        return Arrays.stream(QodanaRules.values()).toList();
    }

    @Mutation
    @Description("Refactorings the given bad smells")
    @Authenticated
    public String refactor(List<String> badSmellIdentifier) {
        List<BadSmell> badSmells = new ArrayList<>();
        for (String identifier : badSmellIdentifier) {
            badSmells.addAll(BadSmell.findByIdentifier(identifier));
        }
        new RefactorService().refactor(badSmells);
        return "Not implemented yet";
    }
}
