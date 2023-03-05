# teamcity-github-auth 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 1 | false |
## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PropertyKey`
in `src/main/java/org/jetbrains/teamcity/githubauth/TeamCityCoreFacade.java`
#### Snippet
```java
    }

    SUser createUser(String username, @Nullable String email, @Nullable String name, Map<PropertyKey, String> properties) {
        SUser created = myUserModel.createUserAccount(null, username);
        properties.forEach(created::setUserProperty);
```

