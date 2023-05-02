# nylon-threads 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 3 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| BlockingMethodInNonBlockingContext | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'queueSize'
in `nylon-threads/src/main/java/com/palantir/nylon/threads/NylonExecutor.java`
#### Snippet
```java
        private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        private OptionalInt maxThreads = OptionalInt.empty();
        private OptionalInt queueSize = OptionalInt.empty();
        private boolean built;

```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'maxThreads'
in `nylon-threads/src/main/java/com/palantir/nylon/threads/NylonExecutor.java`
#### Snippet
```java
        private Executor executor;
        private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        private OptionalInt maxThreads = OptionalInt.empty();
        private OptionalInt queueSize = OptionalInt.empty();
        private boolean built;
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `nylon-threads/src/main/java/com/palantir/nylon/threads/RenamingExecutorService.java`
#### Snippet
```java

    @Override
    public List<Runnable> shutdownNow() {
        return delegate.shutdownNow();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `nylon-threads/src/main/java/com/palantir/nylon/threads/RenamingExecutorService.java`
#### Snippet
```java

    @Override
    public void execute(Runnable command) {
        delegate.execute(new RenamingRunnable(command));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `nylon-threads/src/main/java/com/palantir/nylon/threads/RenamingExecutorService.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `nylon-threads/src/main/java/com/palantir/nylon/threads/RenamingExecutorService.java`
#### Snippet
```java
    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }

```

