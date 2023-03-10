# sling-org-apache-sling-commons-messaging 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 2 | true |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/commons/messaging/MessageService.java`
#### Snippet
```java
     * @return the result of send operation
     */
    public abstract @NotNull CompletableFuture<S> sendMessage(@NotNull final T message);

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `src/main/java/org/apache/sling/commons/messaging/MessageService.java`
#### Snippet
```java
     * @return the result of send operation
     */
    public abstract @NotNull CompletableFuture<S> sendMessage(@NotNull final T message);

}
```

