# rejoiner 
 
# Bad smells
I found 42 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 9 | false |
| UNCHECKED_WARNING | 8 | false |
| DataFlowIssue | 5 | false |
| JavadocLinkAsPlainText | 5 | false |
| UNUSED_IMPORT | 2 | false |
| EmptyStatementBody | 2 | false |
| CommentedOutCode | 2 | false |
| DuplicatedCode | 2 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| NullableProblems | 1 | false |
| ConstantValue | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/GqlInputConverter.java`
#### Snippet
```java
          descriptorMapping.get(getReferenceName(field.getMessageType()));
      return createProtoBuf(
          fieldTypeDescriptor, builder.newBuilderForField(field), (Map<String, Object>) value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'forEach(BiConsumer)' as a member of raw type 'java.util.Map'
in `examples/schema/src/main/java/com/google/api/graphql/schema/GraphQlServlet.java`
#### Snippet
```java
    Map<String, Object> variablesWithStringKey = new HashMap<>();
    if (variables instanceof Map) {
      ((Map) variables).forEach((k, v) -> variablesWithStringKey.put(String.valueOf(k), v));
    }
    return variablesWithStringKey;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'com.google.common.util.concurrent.ListenableFuture'
in `rejoiner/src/main/java/com/google/api/graphql/execution/GuavaListenableFutureSupport.java`
#### Snippet
```java
              Object data = dataFetcher.get(dataFetchingEnvironment);
              if (data instanceof ListenableFuture) {
                ListenableFuture<Object> listenableFuture = (ListenableFuture<Object>) data;
                CompletableFuture<Object> completableFuture = new CompletableFuture<>();
                Futures.addCallback(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GaxSchemaModule.java`
#### Snippet
```java
                GraphQLOutputType responseType = getReturnType(callable);
                Class<? extends Message> requestMessageClass =
                    (Class<? extends Message>) callable.getActualTypeArguments()[0];
                Descriptors.Descriptor requestDescriptor =
                    (Descriptors.Descriptor)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GaxSchemaModule.java`
#### Snippet
```java
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<? extends Message> responseClass =
        (Class<? extends Message>) parameterizedType.getActualTypeArguments()[1];
    Descriptors.Descriptor responseDescriptor =
        (Descriptors.Descriptor) responseClass.getMethod("getDescriptor").invoke(null);
```

### UNCHECKED_WARNING
Unchecked call to 'onNext(V)' as a member of raw type 'io.grpc.stub.StreamObserver'
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/GraphQlStreamObserver.java`
#### Snippet
```java
    R graphQlResponse = getData(value, pathListVale);

    rejoinerStreamingContext.responseStreamObserver().onNext(graphQlResponse);

    try {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GrpcSchemaModule.java`
#### Snippet
```java
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<? extends Message> responseClass =
        (Class<? extends Message>) parameterizedType.getActualTypeArguments()[0];
    Descriptors.Descriptor responseDescriptor =
        (Descriptors.Descriptor) responseClass.getMethod("getDescriptor").invoke(null);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GrpcSchemaModule.java`
#### Snippet
```java
                GraphQLOutputType responseType = getReturnType(returnType);
                Class<? extends Message> requestMessageClass =
                    (Class<? extends Message>) method.getParameterTypes()[0];
                Descriptors.Descriptor requestDescriptor =
                    (Descriptors.Descriptor)
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

### EmptyStatementBody
`else` statement has empty body
in `rejoiner/src/main/java/com/google/api/graphql/grpc/SelectorToFieldMask.java`
#### Snippet
```java
        builder.add(prefix + name);
      }
    } else {
      // "not a Field"
    }
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `rejoiner-grpc/src/main/java/com/google/api/graphql/grpc/QueryResponseToProto.java`
#### Snippet
```java
      return field.getEnumType().findValueByName((String) value);
    } else {
      switch (field.getType()) {
        case FLOAT: // float is a special case
          return Float.valueOf(value.toString());
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GrpcSchemaModule.java`
#### Snippet
```java
                Descriptors.Descriptor requestDescriptor =
                    (Descriptors.Descriptor)
                        requestMessageClass.getMethod("getDescriptor").invoke(null);
                Message requestMessage =
                    ((Message.Builder) requestMessageClass.getMethod("newBuilder").invoke(null))
                        .buildPartial();
                Provider<?> service = getProvider(client);

                GqlInputConverter inputConverter =
                    GqlInputConverter.newBuilder().add(requestDescriptor.getFile()).build();
```

### DuplicatedCode
Duplicated code
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
      @SuppressWarnings("unchecked")
      Class<? extends Message> responseClass = (Class<? extends Message>) listElType;
      Descriptor responseDescriptor =
          (Descriptor) responseClass.getMethod("getDescriptor").invoke(null);
      referencedDescriptors.add(responseDescriptor);
      return new GraphQLList(new GraphQLNonNull(ProtoToGql.getReference(responseDescriptor)));
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

## RuleId[id=Deprecation]
### Deprecation
'dataFetcher(graphql.schema.DataFetcher)' is deprecated
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GaxSchemaModule.java`
#### Snippet
```java
                    .argument(GqlInputConverter.createArgument(requestDescriptor, "input"))
                    .type(responseType)
                    .dataFetcher(dataFetcher)
                    .build();
              } catch (Exception e) {
```

### Deprecation
'staticValue(java.lang.Object)' is deprecated
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoToGql.java`
#### Snippet
```java

  private static final ImmutableList<GraphQLFieldDefinition> STATIC_FIELD =
      ImmutableList.of(newFieldDefinition().type(GraphQLString).name("_").staticValue("-").build());

  private static GraphQLFieldDefinition convertField(
```

### Deprecation
'dataFetcher(graphql.schema.DataFetcher)' is deprecated
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoToGql.java`
#### Snippet
```java
        newFieldDefinition()
            .type(convertType(fieldDescriptor, schemaOptions))
            .dataFetcher(dataFetcher)
            .name(fieldDescriptor.getJsonName());
    builder.description(schemaOptions.commentsMap().get(fieldDescriptor.getFullName()));
```

### Deprecation
'addCallback(com.google.api.core.ApiFuture, com.google.api.core.ApiFutureCallback)' is deprecated
in `schema/common/src/main/java/com/google/api/graphql/schema/FuturesConverter.java`
#### Snippet
```java
  public static <T> ListenableFuture<T> apiFutureToListenableFuture(final ApiFuture<T> apiFuture) {
    SettableFuture<T> settableFuture = SettableFuture.create();
    ApiFutures.addCallback(
        apiFuture,
        new ApiFutureCallback<T>() {
```

### Deprecation
'dataFetcher(graphql.schema.DataFetcher)' is deprecated
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
        }
      }
      fieldDef.dataFetcher(dataFetcher);
      return fieldDef.build();
    } catch (Exception e) {
```

### Deprecation
'staticValue(java.lang.Object)' is deprecated
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
            .add(
                GraphQLFieldDefinition.newFieldDefinition()
                    .staticValue("")
                    .name(namespace)
                    .description(namespace)
```

### Deprecation
'staticValue(java.lang.Object)' is deprecated
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/SchemaDefinitionReader.java`
#### Snippet
```java
            .add(
                GraphQLFieldDefinition.newFieldDefinition()
                    .staticValue("")
                    .name(namespace)
                    .description(namespace)
```

### Deprecation
'dataFetcher(graphql.schema.DataFetcher)' is deprecated
in `rejoiner-guice/src/main/java/com/google/api/graphql/rejoiner/GrpcSchemaModule.java`
#### Snippet
```java
                    .argument(GqlInputConverter.createArgument(requestDescriptor, "input"))
                    .type(responseType)
                    .dataFetcher(dataFetcher)
                    .build();
              } catch (Exception e) {
```

### Deprecation
'getFields()' is deprecated
in `rejoiner/src/main/java/com/google/api/graphql/grpc/SelectorToFieldMask.java`
#### Snippet
```java
    Builder maskFromSelectionBuilder = FieldMask.newBuilder();

    for (Field field : environment.getFields()) {
      for (Selection<?> selection1 : field.getSelectionSet().getSelections()) {
        if (selection1 instanceof Field) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.getOrDefault()'
in `rejoiner-grpc/src/main/java/com/google/api/graphql/execution/ExecutionResultToProtoAsync.java`
#### Snippet
```java
                    .setType(
                        ERROR_TYPE_MAP.getOrDefault(
                            error.getErrorType(), com.google.api.graphql.ErrorType.UNKNOWN))
                    .addAllLocations(
                        error
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `rejoiner/src/main/java/com/google/api/graphql/execution/GuavaListenableFutureSupport.java`
#### Snippet
```java

                      @Override
                      public void onFailure(Throwable t) {
                        completableFuture.completeExceptionally(t);
                      }
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `schema/google-cloud-container/src/main/java/com/google/api/graphql/schema/cloud/container/ContainerSchemaModule.java`
#### Snippet
```java
 * authentication, etc.
 *
 * <p>https://github.com/googleapis/googleapis/blob/master/google/container/v1/cluster_service.proto
 */
@Namespace("clusterManager")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `schema/firestore/src/main/java/com/google/api/graphql/schema/firestore/FirestoreSchemaModule.java`
#### Snippet
```java
 * authentication, etc.
 *
 * <p>https://github.com/googleapis/googleapis/blob/master/google/firestore/v1beta1/firestore.proto
 */
@Namespace("firestore")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoScalars.java`
#### Snippet
```java
 *
 * <p>To learn about proto scalars see:
 * https://developers.google.com/protocol-buffers/docs/proto3#scalar
 *
 * <p>To learn about GraphQL scalars see http://graphql.org/learn/schema/#scalar-types and
```

### JavadocLinkAsPlainText
Link specified as plain text
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoScalars.java`
#### Snippet
```java
 * https://developers.google.com/protocol-buffers/docs/proto3#scalar
 *
 * <p>To learn about GraphQL scalars see http://graphql.org/learn/schema/#scalar-types and
 * http://facebook.github.io/graphql/#sec-Scalars
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `rejoiner/src/main/java/com/google/api/graphql/rejoiner/ProtoScalars.java`
#### Snippet
```java
 *
 * <p>To learn about GraphQL scalars see http://graphql.org/learn/schema/#scalar-types and
 * http://facebook.github.io/graphql/#sec-Scalars
 */
public final class ProtoScalars {
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

