# refreshable 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 4 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends R`
in `refreshable/src/main/java/com/palantir/refreshable/ImmutableRefreshable.java`
#### Snippet
```java

    @Override
    public <R> Refreshable<R> map(Function<? super T, R> function) {
        return new ImmutableRefreshable<>(function.apply(value));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java
        private final Function<T, R> function;

        private MapSubscriber(Function<T, R> function, DefaultRefreshable<R> child) {
            this.childRef = new WeakReference<>(child);
            this.function = function;
```

### BoundedWildcard
Can generalize to `? extends R`
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java
        private final Function<T, R> function;

        private MapSubscriber(Function<T, R> function, DefaultRefreshable<R> child) {
            this.childRef = new WeakReference<>(child);
            this.function = function;
```

### BoundedWildcard
Can generalize to `? super T`
in `refreshable/src/main/java/com/palantir/refreshable/DefaultRefreshable.java`
#### Snippet
```java
        private final Refreshable<?> strongParentReference;

        SideEffectSubscriber(Consumer<T> unsafeSubscriber, Refreshable<?> strongParentReference) {
            this.unsafeSubscriber = unsafeSubscriber;
            this.strongParentReference = strongParentReference;
```

