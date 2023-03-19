# safe-thread-local-random 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `setSeed()` overrides synchronized method
in `safe-thread-local-random/src/main/java/com/palantir/random/SafeThreadLocalRandom.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("UnsynchronizedOverridesSynchronized")
    public void setSeed(long _seed) {
        // setSeed is invoked once in the constructor
        if (initialized) {
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `nextGaussian()` overrides synchronized method
in `safe-thread-local-random/src/main/java/com/palantir/random/SafeThreadLocalRandom.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("UnsynchronizedOverridesSynchronized")
    public double nextGaussian() {
        return ThreadLocalRandom.current().nextGaussian();
    }
```

