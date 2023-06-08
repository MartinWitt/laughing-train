# safe-thread-local-random 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 1 | false |
## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `initialized` may be 'final'
in `safe-thread-local-random/src/main/java/com/palantir/random/SafeThreadLocalRandom.java`
#### Snippet
```java

    private static final Random INSTANCE = new SafeThreadLocalRandom();
    private boolean initialized;

    private SafeThreadLocalRandom() {
```

