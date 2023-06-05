# cql-on-beam 
 
# Bad smells
I found 13 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 4 | false |
| NullableProblems | 4 | false |
| ReplaceInefficientStreamCount | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| RedundantTypeArguments | 1 | false |
| FieldMayBeFinal | 1 | false |
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `https`
in `src/main/java/com/google/fhir/cql/beam/KeyForContextFn.java`
#### Snippet
```java
 * <p>All references within the resources being processed must be relative (i.e., "Patient/123").
 *
 * @see https://cql.hl7.org/02-authorsguide.html#context
 */
public final class KeyForContextFn extends DoFn<String, KV<ResourceTypeAndId, String>> {
```

### JavadocReference
Cannot resolve symbol `https`
in `src/main/java/com/google/fhir/cql/beam/types/ResourceTypeAndId.java`
#### Snippet
```java
   * Returns the resource's logical ID.
   *
   * @see https://www.hl7.org/fhir/resource.html#id
   */
  public String getId() {
```

### JavadocReference
Cannot resolve symbol `https`
in `src/main/java/com/google/fhir/cql/beam/types/CqlLibraryId.java`
#### Snippet
```java
   * Returns the library's version.
   *
   * @see https://cql.hl7.org/02-authorsguide.html#library
   */
  @Nullable
```

### JavadocReference
Cannot resolve symbol `https`
in `src/main/java/com/google/fhir/cql/beam/types/CqlLibraryId.java`
#### Snippet
```java
   * Returns the library's name.
   *
   * @see https://cql.hl7.org/02-authorsguide.html#library
   */
  @JsonProperty("name")
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/google/fhir/cql/beam/EvaluateCql.java`
#### Snippet
```java
        .apply("KeyForContext", ParDo.of(new KeyForContextFn(
            "Patient", new ModelManager().resolveModel("FHIR", "4.0.1").getModelInfo())))
        .apply("GroupByContext", GroupByKey.<ResourceTypeAndId, String>create())
        .apply(
            "EvaluateCql",
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `jsonMapper` may be 'final'
in `src/main/java/com/google/fhir/cql/beam/EvaluateCqlForContextFn.java`
#### Snippet
```java
  /** A wrapper around {@link Library} that supports Java serialization. */
  private static class SerializableLibraryWrapper implements Serializable {
    private static JsonMapper jsonMapper =
        JsonCqlMapper.getMapper()
            .rebuild()
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/com/google/fhir/cql/beam/types/CqlEvaluationResult.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static CoderProvider getCoderProvider() {
      return new CoderProvider() {
        @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/com/google/fhir/cql/beam/types/CqlEvaluationResult.java`
#### Snippet
```java
      return new CoderProvider() {
        @Override
        public <T> Coder<T> coderFor(
            TypeDescriptor<T> typeDescriptor, List<? extends Coder<?>> componentCoders)
            throws CannotProvideCoderException {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `src/main/java/com/google/fhir/cql/beam/types/CqlEvaluationResult.java`
#### Snippet
```java
        @Override
        public <T> Coder<T> coderFor(
            TypeDescriptor<T> typeDescriptor, List<? extends Coder<?>> componentCoders)
            throws CannotProvideCoderException {
          if (typeDescriptor.getRawType() != CqlEvaluationResult.class) {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `src/main/java/com/google/fhir/cql/beam/types/CqlEvaluationResult.java`
#### Snippet
```java
        @Override
        public <T> Coder<T> coderFor(
            TypeDescriptor<T> typeDescriptor, List<? extends Coder<?>> componentCoders)
            throws CannotProvideCoderException {
          if (typeDescriptor.getRawType() != CqlEvaluationResult.class) {
```

