# rejoiner 
 
# Bad smells
I found 66 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 12 | false |
| AbstractClassNeverImplemented | 10 | false |
| DataFlowIssue | 5 | false |
| ReturnNull | 5 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| Convert2MethodRef | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| UNUSED_IMPORT | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| CommentedOutCode | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| SystemOutErr | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| EmptyStatementBody | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| EmptyMethod | 1 | false |
| RedundantFieldInitialization | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ConstantValue | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/GraphQlStreamObserver.java`
#### Snippet
```java

    try {
      System.out.println(
          "Streaming response as Json: " + JsonFormat.printer().print(graphQlResponse));
    } catch (InvalidProtocolBufferException e) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ProtoToMap` has only 'static' members, and lacks a 'private' constructor
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/ProtoToMap.java`
#### Snippet
```java

/** Creates a Map based on a Message, while maintaining the field name case. */
public final class ProtoToMap {

  private static final Converter<String, String> UNDERSCORE_TO_CAMEL =
```

### UtilityClassWithoutPrivateConstructor
Class `ExecutionResultToProtoAsync` has only 'static' members, and lacks a 'private' constructor
in `rejoiner-grpc/src/main/java/com/google/api/graphql/execution/ExecutionResultToProtoAsync.java`
#### Snippet
```java

/** Transforms ExecutionResult into generated proto Messages. */
public final class ExecutionResultToProtoAsync {

  /** Transforms an async ExecutionResult into a ProtoExecutionResult. */
```

### UtilityClassWithoutPrivateConstructor
Class `QueryResponseToProtoJson` has only 'static' members, and lacks a 'private' constructor
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/QueryResponseToProtoJson.java`
#### Snippet
```java

/** Converts a QueryResponse json map into a protobuf {@link Struct} object. */
public final class QueryResponseToProtoJson {

  /** Converts a json map into a protobuf {@link Struct} object. */
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/DescriptorSet.java`
#### Snippet
```java
    return (location.getLeadingComments().trim()
            + (!trailingComment.isEmpty() ? (". " + trailingComment) : ""))
        .replaceAll("^[*\\\\/.]*\\s*", "");
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `rejoiner/src/main/java/com/google/api/graphql/execution/GuavaListenableFutureSupport.java`
#### Snippet
```java

  /**
   * Converts a {@link ListenableFuture} to a Java8 {@link java.util.concurrent.CompletableFuture}.
   *
   * <p>{@see CompletableFuture} is supported by the provided {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `rejoiner/src/main/java/com/google/api/graphql/execution/GuavaListenableFutureSupport.java`
#### Snippet
```java

  /**
   * Converts a {@link ListenableFuture} to a Java8 {@link java.util.concurrent.CompletableFuture}.
   *
   * <p>{@see CompletableFuture} is supported by the provided {@link
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `UNDERSCORE_TO_CAMEL.convert(field.getName())` might be null
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/ProtoToMap.java`
#### Snippet
```java
            (field, value) ->
                variablesBuilder.put(
                    UNDERSCORE_TO_CAMEL.convert(field.getName()), mapValues(field, value)));
    return variablesBuilder.build();
  }
```

### DataFlowIssue
Method invocation `getFieldDefinitions` may produce `NullPointerException`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/Type.java`
#### Snippet
```java
    public GraphQLObjectType apply(GraphQLObjectType input) {
      ImmutableList.Builder<GraphQLFieldDefinition> remainingFields = ImmutableList.builder();
      for (GraphQLFieldDefinition field : input.getFieldDefinitions()) {
        if (!fieldNameToRemove.equals(field.getName())) {
          remainingFields.add(field);
```

### DataFlowIssue
Method invocation `getFieldDefinitions` may produce `NullPointerException`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/Type.java`
#### Snippet
```java
    public GraphQLObjectType apply(GraphQLObjectType input) {
      ImmutableList.Builder<GraphQLFieldDefinition> remainingFields = ImmutableList.builder();
      for (GraphQLFieldDefinition field : input.getFieldDefinitions()) {
        if (!fieldNamesToRemove.contains(field.getName())) {
          remainingFields.add(field);
```

### DataFlowIssue
Method invocation `getFieldDefinition` may produce `NullPointerException`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/Type.java`
#### Snippet
```java
    @Override
    public GraphQLObjectType apply(GraphQLObjectType input) {
      if (input.getFieldDefinition(field.getName()) != null) {
        throw new AssertException(
            String.format("Field already added with name %s", field.getName()));
```

### DataFlowIssue
Method invocation `apply` may produce `NullPointerException`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java

    Object getParameterValue(DataFetchingEnvironment environment) {
      return function().apply(environment);
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableMap;`
in `rejoiner/src/main/java/com/google/api/graphql/grpc/SelectorToFieldMask.java`
#### Snippet
```java
import com.google.common.base.Converter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.Descriptors.Descriptor;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableMap;`
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/SchemaModule.java`
#### Snippet
```java
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.AbstractModule;
import com.google.inject.Key;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/DynamicProtoUtil.java`
#### Snippet
```java
      return ProtoToMap.messageToMap(message);
    } catch (DescriptorValidationException | InvalidProtocolBufferException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/DynamicProtoUtil.java`
#### Snippet
```java
      return responseData.toByteString();
    } catch (DescriptorValidationException | InvalidProtocolBufferException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/QueryResponseToProto.java`
#### Snippet
```java
    }
    if (field.getType() == FieldDescriptor.Type.MESSAGE) {
      if (field.isRepeated()) {}
      Message.Builder fieldBuilder = parentBuilder.newBuilderForField(field);
      return buildMessage(fieldBuilder, (Map<String, Object>) value);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SchemaModule()` of an abstract class should not be declared 'public'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/SchemaModule.java`
#### Snippet
```java

  /** Creates a schema using the supplied fields descriptions. */
  public SchemaModule(SchemaOptions schemaOptions) {
    this.schemaOptions = schemaOptions;
    schemaDefinition = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `SchemaModule()` of an abstract class should not be declared 'public'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/SchemaModule.java`
#### Snippet
```java

  /** Uses the fields and methods on the given schema definition. */
  public SchemaModule(Object schemaDefinition) {
    this.schemaDefinition = schemaDefinition;
    schemaOptions = SchemaOptions.defaultOptions();
```

### NonProtectedConstructorInAbstractClass
Constructor `SchemaModule()` of an abstract class should not be declared 'public'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/SchemaModule.java`
#### Snippet
```java

  /** Uses the fields and methods on the module itself. */
  public SchemaModule() {
    schemaDefinition = this;
    schemaOptions = SchemaOptions.defaultOptions();
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphQlStreamObserver()` of an abstract class should not be declared 'public'
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/GraphQlStreamObserver.java`
#### Snippet
```java
  private final AtomicInteger pathIndex = new AtomicInteger();

  public GraphQlStreamObserver(DataFetchingEnvironment dataFetchingEnvironment) {
    this.dataFetchingEnvironment = dataFetchingEnvironment;
    rejoinerStreamingContext = dataFetchingEnvironment.getContext();
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (38 lines)
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoToGql.java`
#### Snippet
```java
    // TODO: add back relay support

    //    Optional<GraphQLFieldDefinition> relayId =
    //        descriptor.getFields().stream()
    //            .filter(field -> field.getOptions().hasExtension(RelayOptionsProto.relayOptions))
```

### CommentedOutCode
Commented out code (9 lines)
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
              try {
                return null;
                //                      return graphQLFieldDefinition
                //                              .getDataFetcher()
                //                              .get(
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `descriptors` are queried, but never updated
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/GqlInputConverter.java`
#### Snippet
```java
  public static class Builder {
    private final ArrayList<FileDescriptor> fileDescriptors = new ArrayList<>();
    private final ArrayList<Descriptor> descriptors = new ArrayList<>();
    private final ArrayList<EnumDescriptor> enumDescriptors = new ArrayList<>();

```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/StructUtil.java`
#### Snippet
```java
        .collect(
            ImmutableMap.toImmutableMap(
                entry -> entry.getKey(),
                entry -> {
                  Value value = entry.getValue();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaBundle.java`
#### Snippet
```java
    Map<String, ? extends Function<String, Object>> nodeDataFetchers =
        nodeDataFetchers().stream()
            .collect(Collectors.toMap(e -> e.getClassName(), Function.identity()));

    GraphQLObjectType.Builder queryType = newObject().name("QueryType").fields(queryFields());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
        if (sourceDescriptor != null
            && requestDescriptor.getFullName().equals(sourceDescriptor.getFullName())) {
          Function<DataFetchingEnvironment, ?> function = environment -> environment.getSource();
          listBuilder.add(MethodMetadata.create(function));
        } else {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/SchemaModule.java`
#### Snippet
```java

  /** Override and call addQuery etc (called lazily when the Schema is created). */
  protected void configureSchemaAsync() {}

  @Override
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoDataFetcher.java`
#### Snippet
```java
  private final Descriptors.FieldDescriptor fieldDescriptor;
  private final String convertedFieldName;
  private Method method = null;

  ProtoDataFetcher(Descriptors.FieldDescriptor fieldDescriptor) {
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `mapping.keySet()` may be replaced with 'entrySet()' iteration
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoRegistry.java`
#### Snippet
```java
        ImmutableListMultimap<String, TypeModification> modifications) {
      BiMap<String, GraphQLType> result = HashBiMap.create(mapping.size());
      for (String key : mapping.keySet()) {
        if (mapping.get(key) instanceof GraphQLObjectType) {
          GraphQLObjectType val = (GraphQLObjectType) mapping.get(key);
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `fullName`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/DescriptorSet.java`
#### Snippet
```java
  private static String appendEnum(
      DescriptorProtos.EnumDescriptorProto enumDescriptor, List<Integer> path, String fullName) {
    fullName += appendNameComponent(enumDescriptor.getName());
    if (path.size() > 2) {
      fullName += appendNameComponent(enumDescriptor.getValue(path.get(3)).getName());
```

### AssignmentToMethodParameter
Assignment to method parameter `fullName`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/DescriptorSet.java`
#### Snippet
```java
    fullName += appendNameComponent(enumDescriptor.getName());
    if (path.size() > 2) {
      fullName += appendNameComponent(enumDescriptor.getValue(path.get(3)).getName());
    }
    return fullName;
```

### AssignmentToMethodParameter
Assignment to method parameter `fullName`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/DescriptorSet.java`
#### Snippet
```java
  private static Optional<String> appendMessage(
      DescriptorProtos.DescriptorProto message, List<Integer> path, String fullName) {
    fullName += appendNameComponent(message.getName());
    return path.size() > 2
        ? append(message, path.subList(2, path.size()), fullName)
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'schema' in a Serializable class
in `examples/schema/src/main/java/com/google/api/graphql/schema/GraphQlServlet.java`
#### Snippet
```java
              new TracingInstrumentation()));

  @Inject @Schema GraphQLSchema schema;
  @Inject Provider<DataLoaderRegistry> registryProvider;

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoScalars.java`
#### Snippet
```java
                    return ByteString.copyFromUtf8(((StringValue) input).getValue());
                  }
                  return null;
                }
              })
```

### ReturnNull
Return of `null`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoDataFetcher.java`
#### Snippet
```java
    final Object source = environment.getSource();
    if (source == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
      clazz = clazz.getSuperclass();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
  protected Function<DataFetchingEnvironment, Object> handleParameter(
      Method method, int parameterIndex) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
              // TODO: Don't hardcode the arguments structure.
              try {
                return null;
                //                      return graphQLFieldDefinition
                //                              .getDataFetcher()
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `req` is redundant
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
          Function<DataFetchingEnvironment, ?> function =
              environment -> {
                Message req =
                    inputConverter.createProtoBuf(
                        requestDescriptor, message.toBuilder(), environment.getArgument(argName));
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/DynamicProtoUtil.java`
#### Snippet
```java
      // TODO: Support multiple FileDescriptors in FileDescriptorSet
      FileDescriptor fileDescriptor =
          FileDescriptor.buildFrom(fileDescriptorSet.getFileList().get(0), new FileDescriptor[] {});
      Descriptor messageType = fileDescriptor.findMessageTypeByName(operationName + "Request");
      Message message = DynamicMessage.parseFrom(messageType, encodedRequest);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/DynamicProtoUtil.java`
#### Snippet
```java
      // TODO: Support multiple FileDescriptors in FileDescriptorSet
      FileDescriptor fileDescriptor =
          FileDescriptor.buildFrom(fileDescriptorSet.getFileList().get(0), new FileDescriptor[] {});

      Descriptor messageType = fileDescriptor.findMessageTypeByName(operationName + "Response");
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ExecutionResult`
in `rejoiner-grpc/src/main/java/com/google/api/graphql/execution/ExecutionResultToProtoAsync.java`
#### Snippet
```java
   */
  public static <T extends Message> CompletableFuture<T> toProtoMessage(
      T message, CompletableFuture<ExecutionResult> executionResultCompletableFuture) {
    return executionResultCompletableFuture.thenApply(
        executionResult ->
```

### BoundedWildcard
Can generalize to `? extends ExecutionResult`
in `rejoiner-grpc/src/main/java/com/google/api/graphql/execution/ExecutionResultToProtoAsync.java`
#### Snippet
```java
  public static <T extends Message>
      CompletableFuture<ProtoExecutionResult<T>> toProtoExecutionResult(
          T message, CompletableFuture<ExecutionResult> executionResultCompletableFuture) {
    return executionResultCompletableFuture.thenApply(
        executionResult ->
```

### BoundedWildcard
Can generalize to `? extends T`
in `schema/common/src/main/java/com/google/api/graphql/schema/FuturesConverter.java`
#### Snippet
```java

  /** Converts an {@see ApiFuture} to a {@see ListenableFuture}. */
  public static <T> ListenableFuture<T> apiFutureToListenableFuture(final ApiFuture<T> apiFuture) {
    SettableFuture<T> settableFuture = SettableFuture.create();
    ApiFutures.addCallback(
```

### BoundedWildcard
Can generalize to `? extends Set`
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/SchemaProviderModule.java`
#### Snippet
```java

    @Inject
    public SchemaImpl(@Annotations.SchemaBundles Provider<Set<SchemaBundle>> schemaBundles) {
      this.schemaBundleProviders = schemaBundles;
    }
```

### BoundedWildcard
Can generalize to `? extends FragmentDefinition`
in `rejoiner/src/main/java/com/google/api/graphql/grpc/SelectorToFieldMask.java`
#### Snippet
```java
      Selection<?> node,
      Descriptor descriptor,
      Map<String, FragmentDefinition> fragmentsByName) {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();
    if (node instanceof Field) {
```

### BoundedWildcard
Can generalize to `? extends SchemaBundle`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaBundle.java`
#### Snippet
```java
  }

  public static SchemaBundle combine(Collection<SchemaBundle> schemaBundles) {
    Builder builder = SchemaBundle.builder();
    SchemaOptions.Builder schemaOptionsBuilder = SchemaOptions.builder();
```

### BoundedWildcard
Can generalize to `? extends TypeModification`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoRegistry.java`
#### Snippet
```java
    }

    Builder add(Collection<TypeModification> modifications) {
      typeModifications.addAll(modifications);
      return this;
```

### BoundedWildcard
Can generalize to `? extends GraphQLType`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoRegistry.java`
#### Snippet
```java
    /** Applies the supplied modifications to the GraphQLTypes. */
    private static BiMap<String, GraphQLType> modifyTypes(
        BiMap<String, GraphQLType> mapping,
        ImmutableListMultimap<String, TypeModification> modifications) {
      BiMap<String, GraphQLType> result = HashBiMap.create(mapping.size());
```

### BoundedWildcard
Can generalize to `? super String`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoRegistry.java`
#### Snippet
```java
    private static BiMap<String, GraphQLType> modifyTypes(
        BiMap<String, GraphQLType> mapping,
        ImmutableListMultimap<String, TypeModification> modifications) {
      BiMap<String, GraphQLType> result = HashBiMap.create(mapping.size());
      for (String key : mapping.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends TypeModification`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoRegistry.java`
#### Snippet
```java
    private static BiMap<String, GraphQLType> modifyTypes(
        BiMap<String, GraphQLType> mapping,
        ImmutableListMultimap<String, TypeModification> modifications) {
      BiMap<String, GraphQLType> result = HashBiMap.create(mapping.size());
      for (String key : mapping.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
  }

  protected void addMutationList(List<GraphQLFieldDefinition> mutations) {
    allMutationsInModule.addAll(mutations);
  }
```

### BoundedWildcard
Can generalize to `? extends GraphQLFieldDefinition`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
  }

  protected void addQueryList(List<GraphQLFieldDefinition> queries) {
    allQueriesInModule.addAll(queries);
  }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `FieldDefinition` has no concrete subclass
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/FieldDefinition.java`
#### Snippet
```java
/** A GraphQL field definition with it's data fetcher. */
@AutoValue
public abstract class FieldDefinition<T> {
  abstract String parentTypeName();

```

### AbstractClassNeverImplemented
Abstract class `ProtoExecutionResult` has no concrete subclass
in `rejoiner-grpc/src/main/java/com/google/api/graphql/execution/ProtoExecutionResult.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class ProtoExecutionResult<T extends Message> {

  static <T extends Message> ProtoExecutionResult<T> create(
```

### AbstractClassNeverImplemented
Abstract class `RejoinerStreamingContext` has no concrete subclass
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/RejoinerStreamingContext.java`
#### Snippet
```java

@AutoValue
public abstract class RejoinerStreamingContext<T> {

  private final CountDownLatch countDownLatch = new CountDownLatch(1);
```

### AbstractClassNeverImplemented
Abstract class `GrpcSchemaModule` has no concrete subclass
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GrpcSchemaModule.java`
#### Snippet
```java

/** SchemaModule that generates queries and mutations for gRPC clients. */
public abstract class GrpcSchemaModule extends SchemaModule {

  protected ImmutableList<GraphQLFieldDefinition> serviceToFields(
```

### AbstractClassNeverImplemented
Abstract class `GraphQlStreamObserver` has no concrete subclass
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/GraphQlStreamObserver.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public abstract class GraphQlStreamObserver<T extends Message, R extends Message>
    implements StreamObserver<T> {

```

### AbstractClassNeverImplemented
Abstract class `SchemaOptions` has no concrete subclass
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaOptions.java`
#### Snippet
```java

@AutoValue
public abstract class SchemaOptions {
  public static SchemaOptions defaultOptions() {
    return SchemaOptions.builder().useProtoScalarTypes(false).build();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaOptions.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder useProtoScalarTypes(boolean useProtoScalarTypes);

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaBundle.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract ImmutableList.Builder<GraphQLFieldDefinition> queryFieldsBuilder();

```

### AbstractClassNeverImplemented
Abstract class `SchemaBundle` has no concrete subclass
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaBundle.java`
#### Snippet
```java

@AutoValue
public abstract class SchemaBundle {

  public GraphQLSchema toSchema() {
```

### AbstractClassNeverImplemented
Abstract class `MethodMetadata` has no concrete subclass
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java

  @AutoValue
  abstract static class MethodMetadata {
    @Nullable
    abstract Function<DataFetchingEnvironment, ?> function();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `result == null` is always `false`
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoScalars.java`
#### Snippet
```java
                  if (input instanceof String) {
                    ByteString result = ByteString.copyFromUtf8((String) input);
                    if (result == null) {
                      throw new CoercingParseValueException(
                          "Invalid value '" + input + "' for Bytes");
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is marked unstable with @Beta
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoRegistry.java`
#### Snippet
```java
    ProtoRegistry build() {
      ImmutableListMultimap<String, TypeModification> modificationsMap =
          ImmutableListMultimap.copyOf(
              this.typeModifications.stream()
                  .map(
```

