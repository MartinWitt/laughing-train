package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.smallrye.mutiny.Uni;
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
    @Description("Gets all badsmells from the database")
    public Uni<List<BadSmell>> getAllBadSmells() {
        return BadSmell.<BadSmell>findAll().list();
    }

    @Query("byRuleID")
    @Description("Gets all badsmells from the database by ruleID")
    public Uni<List<BadSmell>> getAllBadSmellsByRuleID(@Name("ruleID") String ruleID) {
        return BadSmell.findByRuleID(ruleID);
    }
}
