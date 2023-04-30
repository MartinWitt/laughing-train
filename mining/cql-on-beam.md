# cql-on-beam 
 
# Bad smells
I found 15 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 5 | false |
| CodeBlock2Expr | 2 | true |
| ReplaceInefficientStreamCount | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySuperQualifier | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| NonProtectedConstructorInAbstractClass | 1 | true |
| MethodOverridesStaticMethod | 1 | false |
## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.anyMatch()'
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
          new CqlTranslatorOptions(TRANSLATOR_OPTIONS),
          errors);
      if (errors.stream().filter(error -> error.getSeverity().equals(ErrorSeverity.Error)).count()
          > 0) {
        throw new RuntimeException(
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `EvaluateCql` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
 * <p>See README.md for additional information.
 */
public final class EvaluateCql {
  /**
   * Options supported by {@link EvaluateCql}.
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/fhir/cql/beam/EvaluateCqlForContextFn.java`
#### Snippet
```java
        Library library, ZonedDateTime evaluationZonedDateTime, ResourceTypeAndId contextValue) {
      super(library, evaluationZonedDateTime);
      super.setContextValue(contextValue.getType(), contextValue.getId());
      super.enterContext(contextValue.getType());
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `contextResources.getValue()` might be null
in `src/main/java/com/google/fhir/cql/beam/EvaluateCqlForContextFn.java`
#### Snippet
```java
      @Element KV<ResourceTypeAndId, Iterable<String>> contextResources,
      OutputReceiver<CqlEvaluationResult> out) {
    RetrieveProvider retrieveProvider = createRetrieveProvider(contextResources.getValue());
    for (VersionedIdentifier cqlLibraryId : cqlLibraryVersionedIdentifiers) {
      Library library = libraryLoader.load(cqlLibraryId);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.hl7.elm.r1` is unnecessary, and can be replaced with an import
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
      List<CqlCompilerException> errors = new ArrayList<>();
      libraryManager.resolveLibrary(
          new org.hl7.elm.r1.VersionedIdentifier()
              .withId(libraryIds.getName())
              .withVersion(libraryIds.getVersion()),
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
          > 0) {
        throw new RuntimeException(
            "Errors encountered while compiling CQL. " + errors.toString());
      }
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super EvaluateCqlOptions`
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
  @VisibleForTesting
  static void runPipeline(
      Function<EvaluateCqlOptions, Pipeline> pipelineCreator,
      String[] args,
      ZonedDateTime evaluationDateTime) {
```

### BoundedWildcard
Can generalize to `? extends Pipeline`
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
  @VisibleForTesting
  static void runPipeline(
      Function<EvaluateCqlOptions, Pipeline> pipelineCreator,
      String[] args,
      ZonedDateTime evaluationDateTime) {
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `src/main/java/com/google/fhir/cql/beam/EvaluateCqlForContextFn.java`
#### Snippet
```java
  @ProcessElement
  public void processElement(
      @Element KV<ResourceTypeAndId, Iterable<String>> contextResources,
      OutputReceiver<CqlEvaluationResult> out) {
    RetrieveProvider retrieveProvider = createRetrieveProvider(contextResources.getValue());
```

### BoundedWildcard
Can generalize to `? super CqlEvaluationResult`
in `src/main/java/com/google/fhir/cql/beam/EvaluateCqlForContextFn.java`
#### Snippet
```java
  public void processElement(
      @Element KV<ResourceTypeAndId, Iterable<String>> contextResources,
      OutputReceiver<CqlEvaluationResult> out) {
    RetrieveProvider retrieveProvider = createRetrieveProvider(contextResources.getValue());
    for (VersionedIdentifier cqlLibraryId : cqlLibraryVersionedIdentifiers) {
```

### BoundedWildcard
Can generalize to `? super KV`
in `src/main/java/com/google/fhir/cql/beam/KeyForContextFn.java`
#### Snippet
```java
  @ProcessElement
  public void processElement(
      @Element String element, OutputReceiver<KV<ResourceTypeAndId, String>> out) {
    JsonObject resourceObject = JsonParser.parseString(element).getAsJsonObject();
    String resourceType = resourceObject.get("resourceType").getAsString();
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/google/fhir/cql/beam/CachingModelResolver.java`
#### Snippet
```java
        value.getClass(),
        (key) -> {
          return super.resolveType(value);
        });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/google/fhir/cql/beam/EvaluateCqlForContextFn.java`
#### Snippet
```java
    IParser parser = fhirContext.newJsonParser();
    jsonResource.forEach(
        element -> {
          bundle.addEntry().setResource((Resource) parser.parseResource(element));
        });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ForwardingModelResolver()` of an abstract class should not be declared 'public'
in `src/main/java/com/google/fhir/cql/beam/ForwardingModelResolver.java`
#### Snippet
```java
  private final ModelResolver resolver;

  public ForwardingModelResolver(ModelResolver resolver) {
    this.resolver = resolver;
  }
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getCoderProvider()` tries to override a static method of a superclass
in `src/main/java/com/google/fhir/cql/beam/types/CqlEvaluationResult.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static CoderProvider getCoderProvider() {
      return new CoderProvider() {
        @Override
```

