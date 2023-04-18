# teamcity-bitbucket-issues 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 4 | false |
| RedundantFieldInitialization | 1 | false |
| DoubleBraceInitialization | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/auth/BitBucketAuthenticator.java`
#### Snippet
```java
public class BitBucketAuthenticator implements IssueFetcherAuthenticator {

  private Credentials myCredentials = null;

  public BitBucketAuthenticator(@NotNull final Map<String, String > properties) {
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/BitBucketIssueProviderType.java`
#### Snippet
```java
  @Override
  public Map<String, String> getDefaultProperties() {
    return new HashMap<String, String>() {{
      put(PARAM_AUTH_TYPE, AUTH_ANONYMOUS);
      put(PARAM_PATTERN, DEFAULT_ISSUE_PATTERN);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super InvalidProperty`
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/BitBucketIssueProvider.java`
#### Snippet
```java
    }

    private boolean checkNotEmptyParam(@NotNull final Collection<InvalidProperty> invalid,
                                       @NotNull final Map<String, String> map,
                                       @NotNull final String propertyName,
```

### BoundedWildcard
Can generalize to `? extends SBuildType`
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/health/IssueTrackerSuggestion.java`
#### Snippet
```java
  }

  private Set<String> getPathsFromInstances(@NotNull final List<SBuildType> buildTypes) {
    return extractFetchUrls(buildTypes.stream().map(SBuildType::getVcsRootInstances));
  }
```

### BoundedWildcard
Can generalize to `? extends SBuildType`
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/health/IssueTrackerSuggestion.java`
#### Snippet
```java
  }

  private Set<String> getPathsFromVcsRoots(@NotNull final List<SBuildType> buildTypes) {
    return extractFetchUrls(buildTypes.stream().map(BuildTypeSettings::getVcsRoots));
  }
```

### BoundedWildcard
Can generalize to `? extends List`
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/health/IssueTrackerSuggestion.java`
#### Snippet
```java
  }

  private Set<String> extractFetchUrls(@NotNull final Stream<List<? extends VcsRoot>> stream) {
    return stream.flatMap(List::stream)
            .map(this::getFetchUrl)
```

