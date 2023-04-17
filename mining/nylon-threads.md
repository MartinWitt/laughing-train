# nylon-threads 
 
# Bad smells
I found 11 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 7 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| RedundantImplements | 1 | false |
| RedundantSuppression | 1 | false |
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

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `BuildStage`
in `nylon-threads/src/main/java/com/palantir/nylon/threads/NylonExecutor.java`
#### Snippet
```java

    private static final class Builder
            implements NameStage, ExecutorStage, MaxThreadsStage, QueueSizeStage, BuildStage {

        private String name;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
    // prevent avoidable failures in spark/etc where security manager is used
    @SuppressWarnings("removal")
    private static sun.misc.Unsafe initUnsafe() {
        return java.security.AccessController.doPrivileged((PrivilegedAction<sun.misc.Unsafe>) () -> {
            try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
    @SuppressWarnings("removal")
    private static sun.misc.Unsafe initUnsafe() {
        return java.security.AccessController.doPrivileged((PrivilegedAction<sun.misc.Unsafe>) () -> {
            try {
                Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `nylon-threads/src/main/java/com/palantir/nylon/threads/NylonExecutor.java`
#### Snippet
```java
    public interface BuildStage {
        /**
         * Provide an {@link java.lang.Thread.UncaughtExceptionHandler}, otherwise a
         * {@link LoggingUncaughtExceptionHandler default logging implementation} will be used.
         */
```

### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
    @SuppressWarnings("removal")
    private static sun.misc.Unsafe initUnsafe() {
        return java.security.AccessController.doPrivileged((PrivilegedAction<sun.misc.Unsafe>) () -> {
            try {
                Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
```

### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
        return java.security.AccessController.doPrivileged((PrivilegedAction<sun.misc.Unsafe>) () -> {
            try {
                Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
                field.setAccessible(true);
                return (sun.misc.Unsafe) field.get(null);
```

### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
                Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
                field.setAccessible(true);
                return (sun.misc.Unsafe) field.get(null);
            } catch (ReflectiveOperationException e) {
                throw new SafeIllegalStateException("Failed to load Unsafe", e);
```

### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
public final class ThreadNames {

    private static final sun.misc.Unsafe unsafe = initUnsafe();

    private static final long threadNameOffset;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `nylon-threads/src/main/java/com/palantir/nylon/threads/ThreadNames.java`
#### Snippet
```java
/** Utility functionality to rename {@link Thread threads} as efficiently as possible. */
@SuppressWarnings({"UnnecessarilyQualified", "deprecation", "removal"}) // Internal classes should not be imported
public final class ThreadNames {

    private static final sun.misc.Unsafe unsafe = initUnsafe();
```

