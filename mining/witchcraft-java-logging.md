# witchcraft-java-logging 
 
# Bad smells
I found 12 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 4 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| NullableProblems | 2 | false |
| OptionalIsPresent | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnstableApiUsage | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'BLOCK'
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/testreport/TestLogFilter.java`
#### Snippet
```java

    private static final Optional<Boolean> ALLOW = Optional.of(Boolean.TRUE);
    private static final Optional<Boolean> BLOCK = Optional.of(Boolean.FALSE);

    @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ALLOW'
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/testreport/TestLogFilter.java`
#### Snippet
```java
    INSTANCE;

    private static final Optional<Boolean> ALLOW = Optional.of(Boolean.TRUE);
    private static final Optional<Boolean> BLOCK = Optional.of(Boolean.FALSE);

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
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

## RuleId[id=Deprecation]
### Deprecation
'configureAbsentsAsNulls(boolean)' is deprecated
in `witchcraft-logging-formatting/src/main/java/com/palantir/witchcraft/java/logging/format/LogParser.java`
#### Snippet
```java

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .registerModule(new Jdk8Module().configureAbsentsAsNulls(true))
            .registerModule(new JavaTimeModule())
            .disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)
```

### Deprecation
'groovy.util.XmlParser' is deprecated
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java
        if (configurationFile.isFile()) {
            try {
                rootNode = new XmlParser().parse(configurationFile);
            } catch (IOException | SAXException | ParserConfigurationException e) {
                throw new RuntimeException("Couldn't parse existing configuration file: " + configurationFile, e);
```

### Deprecation
'groovy.util.XmlNodePrinter' is deprecated
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java
        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(writer)) {
            XmlNodePrinter nodePrinter = new XmlNodePrinter(printWriter);
            nodePrinter.setPreserveWhitespace(true);
            nodePrinter.print(rootNode);
```

### Deprecation
'groovy.util.XmlNodePrinter' is deprecated
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java
        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(writer)) {
            XmlNodePrinter nodePrinter = new XmlNodePrinter(printWriter);
            nodePrinter.setPreserveWhitespace(true);
            nodePrinter.print(rootNode);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/WitchcraftLoggingPlugin.java`
#### Snippet
```java
public final class WitchcraftLoggingPlugin implements Plugin<Project> {
    @Override
    public void apply(Project rootProject) {
        if (!Objects.equals(rootProject, rootProject.getRootProject())) {
            throw new IllegalArgumentException(
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `witchcraft-logging-idea/src/main/java/com/palantir/witchcraft/java/logging/idea/WitchcraftLogFormatFilterProvider.java`
#### Snippet
```java
    @NotNull
    @Override
    public InputFilter[] getDefaultFilters(@NotNull Project project) {
        WitchcraftLogSettingsManager settingsManager = WitchcraftLogSettingsManager.getInstance(project);
        return new InputFilter[] {new WitchcraftLogFilter(WitchcraftLogFormatter.INSTANCE, settingsManager::getSettings)
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
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

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `gradle-witchcraft-logging/src/main/groovy/com/palantir/witchcraft/java/logging/gradle/idea/XmlUtils.java`
#### Snippet
```java
        configure.accept(rootNode);

        configurationFile.getParentFile().mkdirs();

        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
```

