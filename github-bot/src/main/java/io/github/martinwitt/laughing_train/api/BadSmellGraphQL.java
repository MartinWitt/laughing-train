package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@RequestScoped
public class BadSmellGraphQL {

    @Query("allBadSmells")
    @Description("Gets all bad smells from the database")
    public List<BadSmell> getAllBadSmells() {
        return BadSmell.<BadSmell>listAll();
    }

    @Query("byRuleID")
    @Description("Gets all bad smells from the database by ruleID")
    public List<BadSmell> getAllBadSmellsByRuleID(@Name("ruleID") String ruleID) {
        return BadSmell.findByRuleID(ruleID);
    }

    @Query("byProjectName")
    @Description("Gets all bad smells from the database by projectName")
    public List<BadSmell> getAllBadSmellsByProjectName(@Name("projectName") String projectName) {
        return BadSmell.findByProjectName(projectName);
    }

    @Query("byCommitHash")
    @Description("Gets all bad smells from the database by commitHash")
    public List<BadSmell> getAllBadSmellsByCommitHash(@Name("commitHash") String commitHash) {
        return BadSmell.findByCommitHash(commitHash);
    }

    @Query("byIdentifier")
    @Description("Gets all bad smells from the database by identifier")
    public List<BadSmell> getAllBadSmellsByIdentifier(@Name("identifier") String identifier) {
        return BadSmell.findByIdentifier(identifier);
    }
}
