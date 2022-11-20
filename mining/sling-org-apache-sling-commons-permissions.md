# sling-org-apache-sling-commons-permissions 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryModifier] | 2 | true |
## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/permissions/PermissionsService.java`
#### Snippet
```java
     * @return true if principal has permission, otherwise false
     */
    public abstract boolean hasPermission(@NotNull final Principal principal, @NotNull final String permission);

}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/permissions/PermissionsService.java`
#### Snippet
```java
     * @return true if principal has permission, otherwise false
     */
    public abstract boolean hasPermission(@NotNull final Principal principal, @NotNull final String permission);

}
```

