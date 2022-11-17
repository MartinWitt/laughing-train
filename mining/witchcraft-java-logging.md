# palantir/witchcraft-java-logging
# Bad smells
I found 28 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 17 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 2 | false |
| RuleId[ruleID=ReturnNull] | 2 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 1 | false |
| RuleId[ruleID=OptionalIsPresent] | 1 | false |
| RuleId[ruleID=TrivialStringConcatenation] | 1 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 1 | false |
| RuleId[ruleID=CodeBlock2Expr] | 1 | false |
| RuleId[ruleID=UnstableApiUsage] | 1 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 1 | false |
## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `witchcraft-logging-idea/src/main/java/com/palantir/witchcraft/java/logging/idea/WitchcraftLogFilter.java`
#### Snippet
```java
    // Witchcraft line. If we filter an event, we must also filter the trailing newline character.
    // An instance of each filter is created for every console, so this may be stateful.
    private boolean removeNextLineIfNewline = false;

    WitchcraftLogFilter(InputFilter delegate, Supplier<WitchcraftLogSettings> settings) {
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'BLOCK'
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/testreport/TestLogFilter.java`
#### Snippet
```java

    private static final Optional<Boolean> ALLOW = Optional.of(Boolean.TRUE);
    private static final Optional<Boolean> BLOCK = Optional.of(Boolean.FALSE);

    @Override
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'ALLOW'
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/testreport/TestLogFilter.java`
#### Snippet
```java
    INSTANCE;

    private static final Optional<Boolean> ALLOW = Optional.of(Boolean.TRUE);
    private static final Optional<Boolean> BLOCK = Optional.of(Boolean.FALSE);

```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/ServiceLogFormatter.java`
#### Snippet
```java
            buffer.append("] ");
            Optional<String> maybeThread = service.getThread();
            if (maybeThread.isPresent()) {
                buffer.append('[').append(maybeThread.get()).append("] ");
            }
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `witchcraft-logging-idea/src/main/java/com/palantir/witchcraft/java/logging/idea/WitchcraftLogFormatter.java`
#### Snippet
```java
        if (!LogParser.anyPossibleWitchcraftLogsInBlock(text)) {
            // Return fast if there are no witchcraft logs
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `witchcraft-logging-idea/src/main/java/com/palantir/witchcraft/java/logging/idea/WitchcraftLogFormatter.java`
#### Snippet
```java
        if (!witchcraftLogParsed) {
            // When nothing has been decoded, return null based on InputFilter.applyFilter documentation
            return null;
        }

```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/ServiceLogFormatter.java`
#### Snippet
```java
                // Use the placeholder string by default to avoid modifying non-existent parameters.
                // This can occur if only some parameters are wrapped with log-safe args.
                parameters[i] = MoreObjects.firstNonNull(mergedParameters.remove("" + i), "{}");
            }
            // Use the slf4j provided utility directly
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TestReportFormattingPlugin` has no concrete subclass
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/testreport/TestReportFormattingPlugin.java`
#### Snippet
```java
 * lines much like our intellij plugin.
 */
public abstract class TestReportFormattingPlugin implements Plugin<Project> {

    @Override
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/SupplierLogVisitor.java`
#### Snippet
```java
    private final Supplier<T> supplier;

    SupplierLogVisitor(Supplier<T> supplier) {
        this.supplier = supplier;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StringBuilder`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/Formatting.java`
#### Snippet
```java
    }

    static String withStringBuilder(Consumer<StringBuilder> function) {
        StringBuilder builder = REUSABLE_STRING_BUILDER.get();
        builder.setLength(0);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Pair`
in `witchcraft-logging-idea/src/main/java/com/palantir/witchcraft/java/logging/idea/WitchcraftLogFilter.java`
#### Snippet
```java
    }

    private static boolean containsWitchcraftData(List<Pair<String, ConsoleViewContentType>> lines) {
        for (Pair<String, ConsoleViewContentType> item : lines) {
            // The null check is likely unnecessarily defensive, the goal is to avoid breaking any non-witchcraft
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/CombineWithLogVisitor.java`
#### Snippet
```java
    private final BiFunction<T, U, R> combiner;

    CombineWithLogVisitor(LogVisitor<T> first, LogVisitor<U> second, BiFunction<T, U, R> combiner) {
        this.first = first;
        this.second = second;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/CombineWithLogVisitor.java`
#### Snippet
```java
    private final BiFunction<T, U, R> combiner;

    CombineWithLogVisitor(LogVisitor<T> first, LogVisitor<U> second, BiFunction<T, U, R> combiner) {
        this.first = first;
        this.second = second;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/CombineWithLogVisitor.java`
#### Snippet
```java
    private final BiFunction<T, U, R> combiner;

    CombineWithLogVisitor(LogVisitor<T> first, LogVisitor<U> second, BiFunction<T, U, R> combiner) {
        this.first = first;
        this.second = second;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super U`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/CombineWithLogVisitor.java`
#### Snippet
```java
    private final BiFunction<T, U, R> combiner;

    CombineWithLogVisitor(LogVisitor<T> first, LogVisitor<U> second, BiFunction<T, U, R> combiner) {
        this.first = first;
        this.second = second;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/CombineWithLogVisitor.java`
#### Snippet
```java
    private final BiFunction<T, U, R> combiner;

    CombineWithLogVisitor(LogVisitor<T> first, LogVisitor<U> second, BiFunction<T, U, R> combiner) {
        this.first = first;
        this.second = second;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogParser.java`
#### Snippet
```java
    }

    private static <L> Optional<L> parseJson(String logLine, Class<L> clazz) {
        try {
            return Optional.of(OBJECT_MAPPER.readValue(logLine, clazz));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogParser.java`
#### Snippet
```java
    }

    private <L> Optional<T> applyToLogLine(String logLine, Class<L> clazz, Function<L, Optional<T>> function) {
        return parseJson(logLine, clazz).flatMap(function);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super L`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogParser.java`
#### Snippet
```java
    }

    private <L> Optional<T> applyToLogLine(String logLine, Class<L> clazz, Function<L, Optional<T>> function) {
        return parseJson(logLine, clazz).flatMap(function);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Node`
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java

    static void createOrUpdateXmlFile(
            File configurationFile, Consumer<Node> configure, Supplier<Node> defaultRootNode) {
        Node rootNode;
        if (configurationFile.isFile()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Node`
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java

    static void createOrUpdateXmlFile(
            File configurationFile, Consumer<Node> configure, Supplier<Node> defaultRootNode) {
        Node rootNode;
        if (configurationFile.isFile()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/ServiceLogFormatter.java`
#### Snippet
```java
    }

    private static String interpolateParameters(String original, Function<String, Object> lookup) {
        Matcher matcher = PARAMETER_PATTERN.matcher(original);
        String current = original;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogVisitor.java`
#### Snippet
```java
     * visitor is visited, and then the value from each is handed off to the given {@code effect} consumer.
     */
    default <U> LogVisitor<T> combineWithEffect(LogVisitor<U> otherLogVisitor, BiConsumer<T, U> effect) {
        return new CombineWithLogVisitor<>(this, LogVisitors.liftOptional(otherLogVisitor), (original, maybeOther) -> {
            maybeOther.ifPresent(other -> effect.accept(original, other));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogVisitor.java`
#### Snippet
```java
     * visitor is visited, and then the value from each is handed off to the given {@code effect} consumer.
     */
    default <U> LogVisitor<T> combineWithEffect(LogVisitor<U> otherLogVisitor, BiConsumer<T, U> effect) {
        return new CombineWithLogVisitor<>(this, LogVisitors.liftOptional(otherLogVisitor), (original, maybeOther) -> {
            maybeOther.ifPresent(other -> effect.accept(original, other));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super U`
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogVisitor.java`
#### Snippet
```java
     * visitor is visited, and then the value from each is handed off to the given {@code effect} consumer.
     */
    default <U> LogVisitor<T> combineWithEffect(LogVisitor<U> otherLogVisitor, BiConsumer<T, U> effect) {
        return new CombineWithLogVisitor<>(this, LogVisitors.liftOptional(otherLogVisitor), (original, maybeOther) -> {
            maybeOther.ifPresent(other -> effect.accept(original, other));
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/CombineWithLogVisitor.java`
#### Snippet
```java
    private <L> Optional<R> combineWith(L log, LogFunctionSelector<L> logFunc) {
        return logFunc.apply(first, log).flatMap(t -> {
            return logFunc.apply(second, log).map(u -> combiner.apply(t, u));
        });
    }
```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `witchcraft-logging-idea/src/main/java/com/palantir/witchcraft/java/logging/idea/WitchcraftLogFilter.java`
#### Snippet
```java
        }
        ImmutableList.Builder<Pair<String, ConsoleViewContentType>> result =
                ImmutableList.builderWithExpectedSize(delegateResult.size());
        for (Pair<String, ConsoleViewContentType> item : delegateResult) {
            if (removeNextLineIfNewline) {
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java
        configure.accept(rootNode);

        configurationFile.getParentFile().mkdirs();

        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
```

