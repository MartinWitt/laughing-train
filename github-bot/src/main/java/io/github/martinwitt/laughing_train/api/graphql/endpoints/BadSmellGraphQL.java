package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import io.github.martinwitt.laughing_train.api.graphql.dto.BadSmellGraphQLDto;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
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
    public List<BadSmellGraphQLDto> getAllBadSmells() {
        return badSmellRepository.getAll().map(BadSmellGraphQLDto::new).toList();
    }

    @Query("byRuleID")
    @Description("Gets all bad smells from the database by ruleID")
    public List<BadSmellGraphQLDto> getAllBadSmellsByRuleID(@Name("ruleID") String ruleID) {
        return badSmellRepository.findByRuleID(new RuleId(ruleID)).stream()
                .map(this::mapToDto)
                .toList();
    }

    @Query("byProjectName")
    @Description("Gets all bad smells from the database by projectName")
    public List<BadSmellGraphQLDto> getAllBadSmellsByProjectName(@Name("projectName") String projectName) {
        return badSmellRepository.findByProjectName(projectName).stream()
                .map(this::mapToDto)
                .toList();
    }

    @Query("byCommitHash")
    @Description("Gets all bad smells from the database by commitHash")
    public List<BadSmellGraphQLDto> getAllBadSmellsByCommitHash(@Name("commitHash") String commitHash) {
        return badSmellRepository.findByCommitHash(commitHash).stream()
                .map(this::mapToDto)
                .toList();
    }

    @Query("byIdentifier")
    @Description("Gets all bad smells from the database by identifier")
    public List<BadSmellGraphQLDto> getAllBadSmellsByIdentifier(@Name("identifier") String identifier) {
        return badSmellRepository.findByIdentifier(identifier).stream()
                .map(this::mapToDto)
                .toList();
    }

    private BadSmellGraphQLDto mapToDto(BadSmell badSmell) {
        return new BadSmellGraphQLDto(badSmell);
    }
}
