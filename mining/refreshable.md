# refreshable 
 
# Bad smells
I found 4 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| FieldCanBeLocal | 2 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'strongParentReference'
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused")
    private final Optional<?> strongParentReference;

    DefaultRefreshable(T current) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'strongParentReference'
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java
    }

    private DefaultRefreshable(T current, Optional<?> strongParentReference, RootSubscriberTracker tracker) {
        this.current = current;
        this.strongParentReference = strongParentReference;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused")
    private final Optional<?> strongParentReference;

    DefaultRefreshable(T current) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java

        @SuppressWarnings("unused")
        private final Refreshable<?> strongParentReference;

        SideEffectSubscriber(Consumer<T> unsafeSubscriber, Refreshable<?> strongParentReference) {
```

