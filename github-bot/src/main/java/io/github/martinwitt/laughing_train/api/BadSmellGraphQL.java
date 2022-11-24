package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@RequestScoped
public class BadSmellGraphQL {

    @Inject
    BadSmellRepository badSmellRepository;

    @Query("allBadSmells")
    @Description("Gets all bad smells from the database")
    public Uni<List<BadSmell>> getAllBadSmells() {
        return badSmellRepository.getAll().collect().asList();
    }

    @Query("byRuleID")
    @Description("Gets all bad smells from the database by ruleID")
    public Uni<List<BadSmell>> getAllBadSmellsByRuleID(@Name("ruleID") String ruleID) {
        return badSmellRepository.findByRuleID(new RuleId(ruleID));
    }

    @Query("byProjectName")
    @Description("Gets all bad smells from the database by projectName")
    public Uni<List<BadSmell>> getAllBadSmellsByProjectName(@Name("projectName") String projectName) {
        return badSmellRepository.findByProjectName(projectName);
    }

    @Query("byCommitHash")
    @Description("Gets all bad smells from the database by commitHash")
    public Uni<List<BadSmell>> getAllBadSmellsByCommitHash(@Name("commitHash") String commitHash) {
        return badSmellRepository.findByCommitHash(commitHash);
    }

    @Query("byIdentifier")
    @Description("Gets all bad smells from the database by identifier")
    public Uni<List<BadSmell>> getAllBadSmellsByIdentifier(@Name("identifier") String identifier) {
        return badSmellRepository.findByIdentifier(identifier);
    }
}
