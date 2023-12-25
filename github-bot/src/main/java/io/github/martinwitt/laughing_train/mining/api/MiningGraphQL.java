package io.github.martinwitt.laughing_train.mining.api;

import io.github.martinwitt.laughing_train.mining.AnalyzerRunGraphQlDto;
import io.quarkus.security.Authenticated;
import java.util.List;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

/** This class provides GraphQL endpoints for querying and retrieving analyzer run data. */
@GraphQLApi
public class MiningGraphQL {

  /**
   * Retrieves a list of recent analyzer runs.
   *
   * @param size The maximum number of runs to retrieve.
   * @return A list of AnalyzerRunGraphQlDto objects representing the recent analyzer runs. The list
   *     is ordered by the localDateTime property in descending order.
   */
  @Query
  public List<AnalyzerRunGraphQlDto> recentRuns(int size) {
    List<AnalyzerRunDao> recentAnalyzerRuns = fetchAnalyzerRuns(size);
    return constructAnalyzerRunGraphQlDtos(recentAnalyzerRuns);
  }

  /**
   * Constructs a list of AnalyzerRunGraphQlDto objects from a list of AnalyzerRunDao objects.
   *
   * @param analyzerRuns the list of AnalyzerRunDao objects
   * @return the list of AnalyzerRunGraphQlDto objects
   */
  private List<AnalyzerRunGraphQlDto> constructAnalyzerRunGraphQlDtos(
      List<? extends AnalyzerRunDao> analyzerRuns) {
    return analyzerRuns.stream().map(AnalyzerRunGraphQlDto::new).toList();
  }

  /**
   * Fetches a list of AnalyzerRunDao objects according to the specified limit.
   *
   * @param limit The maximum number of AnalyzerRunDao objects to fetch.
   * @return A list of AnalyzerRunDao objects.
   */
  private List<AnalyzerRunDao> fetchAnalyzerRuns(int limit) {
    return AnalyzerRunDao.find("ORDER BY localDateTime DESC LIMIT").page(0, limit).list();
  }

  @Authenticated
  @Mutation
  public boolean mineProject(String url) {
    // TODO: Not Implemented
    return false;
  }
}
