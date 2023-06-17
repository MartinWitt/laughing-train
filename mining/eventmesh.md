# eventmesh 
 
# Bad smells
I found 736 bad smells with 32 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 98 | false |
| DuplicatedCode | 70 | false |
| FieldMayBeFinal | 67 | false |
| StringBufferReplaceableByString | 57 | false |
| UnstableApiUsage | 55 | false |
| DataFlowIssue | 41 | false |
| UnusedAssignment | 27 | false |
| FieldCanBeLocal | 25 | false |
| PlaceholderCountMatchesArgumentCount | 24 | false |
| FinalMethodInFinalClass | 21 | false |
| ConstantValue | 17 | false |
| AutoCloseableResource | 17 | false |
| UnnecessaryLocalVariable | 14 | true |
| Deprecation | 12 | false |
| IgnoreResultOfCall | 12 | false |
| DanglingJavadoc | 11 | false |
| NullableProblems | 10 | false |
| Lombok | 10 | false |
| UNCHECKED_WARNING | 10 | false |
| UnnecessaryModifier | 9 | true |
| UnnecessarySemicolon | 9 | false |
| SynchronizeOnNonFinalField | 8 | false |
| DefaultAnnotationParam | 7 | false |
| MismatchedCollectionQueryUpdate | 7 | false |
| FinalStaticMethod | 6 | false |
| JavadocReference | 6 | false |
| TrivialIf | 5 | false |
| RegExpSingleCharAlternation | 5 | false |
| RedundantCast | 5 | false |
| UnnecessaryReturn | 4 | true |
| RedundantMethodOverride | 4 | false |
| UNUSED_IMPORT | 4 | false |
| NonAtomicOperationOnVolatileField | 4 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| RegExpRedundantEscape | 3 | false |
| ExcessiveLambdaUsage | 3 | false |
| DoubleNegation | 3 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| WrapperTypeMayBePrimitive | 2 | false |
| EmptyStatementBody | 2 | false |
| NonFinalFieldInEnum | 2 | false |
| TrivialStringConcatenation | 2 | false |
| MalformedFormatString | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| IOStreamConstructor | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| SpringJavaAutowiredFieldsWarningInspection | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| EmptyTryBlock | 1 | false |
| RedundantTypeArguments | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| CollectionAddedToSelf | 1 | false |
| InfiniteLoopStatement | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| RedundantLengthCheck | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| UnnecessaryContinue | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| PointlessBooleanExpression | 1 | true |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SubscribeProcessor.java`
#### Snippet
```java
        HttpCommand responseEventMeshCommand;
        final HttpCommand request = asyncContext.getRequest();
        final Integer requestCode = Integer.valueOf(request.getRequestCode());
        final String localAddress = IPUtils.getLocalAddress();
        final String remoteAddr = RemotingHelper.parseChannelRemoteAddr(ctx.channel());
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/NacosWebHookConfigOperation.java`
#### Snippet
```java
        }

        Boolean result;
        final String manufacturerName = webHookConfig.getManufacturerName();
        try {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
public abstract class TcpClient implements Closeable {

    protected static transient int CLIENTNO = 0;
    
    static {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventOrBuilder.java`
#### Snippet
```java
  com.google.protobuf.AnyOrBuilder getProtoDataOrBuilder();

  public CloudEvent.DataCase getDataCase();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    com.google.protobuf.TimestampOrBuilder getCeTimestampOrBuilder();

    public CloudEventAttributeValue.AttrCase getAttrCase();
  }
  /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      ATTR_NOT_SET(0);
      private final int value;
      private AttrCase(int value) {
        this.value = value;
      }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPMessageHandler.java`
#### Snippet
```java
    private static final Integer CONSUMER_GROUP_WAITING_REQUEST_THRESHOLD = 10000;

    protected static final transient Map<String, Set<AbstractHTTPPushRequest>> waitingRequests = Maps.newConcurrentMap();

    private final transient ThreadPoolExecutor pushExecutor;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPMessageHandler.java`
#### Snippet
```java
    private final transient EventMeshConsumer eventMeshConsumer;

    private static final transient ScheduledExecutorService SCHEDULER =
        ThreadPoolFactory.createSingleScheduledExecutor("eventMesh-pushMsgTimeout");

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
    private final transient Set<String> localTopicSet = new HashSet<String>(16);

    private static final transient ReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();

    private HttpClientGroupMapping() {
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/AdminWebHookConfigOperationManager.java`
#### Snippet
```java
public class AdminWebHookConfigOperationManager {

    private static final transient Map<String, Class<? extends WebHookConfigOperation>> WEBHOOK_CONFIG_OPERATION_MAP
        = new HashMap<>();

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * 1000` can be replaced with '1000'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
                    Utils.writeAndFlush(msg, startTime, taskExecuteTime, session.getContext(), session);
                }
            }, 1 * 1000, TimeUnit.MILLISECONDS);

            closeSessionIfTimeout(eventMeshTCPServer, session, mapping);
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/sub/app/service/SubService.java`
#### Snippet
```java
            log.error("exception occurred when unsubscribe ", e);
        }
        try (EventMeshGrpcConsumer ignore = eventMeshGrpcConsumer) {
            // close consumer
        } catch (Exception e) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
```

### EmptyStatementBody
`if` statement has empty body
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
public class UrlMappingPattern {

    private static final String URL_PARAMETER_REGEX = "\\{(\\w*?)\\}";

    private static final String URL_PARAMETER_MATCH_REGEX =
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
    private static final Pattern URL_PARAMETER_PATTERN = Pattern.compile(URL_PARAMETER_REGEX);

    private static final String URL_FORMAT_REGEX = "(?:\\.\\{format\\})$";

    private static final String URL_FORMAT_MATCH_REGEX = "(?:\\\\.\\([\\\\w%]+?\\))?";
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
            for (Map.Entry<Object, Object> entry : entries) {
                String entryKey = entry.getKey().toString();
                String[] keyGroup = entryKey.split("[\\._]");
                for (int i = 0; i < keyGroup.length; i++) {
                    keyGroup[i] = keyGroup[i].toLowerCase();
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java

    @Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:org.apache.eventmesh.cloudevents.v1.CloudEventBatch)
      CloudEventBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEventBatch_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEventBatch_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:org.apache.eventmesh.cloudevents.v1.CloudEvent)
      CloudEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_CloudEventAttributeValue_descriptor;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java

    @Override
    public final boolean isInitialized() {
      return true;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java

      @Override
      public final boolean isInitialized() {
        return true;
      }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        // @@protoc_insertion_point(builder_implements:org.apache.eventmesh.cloudevents.v1.CloudEvent.CloudEventAttributeValue)
        CloudEventAttributeValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_CloudEventAttributeValue_descriptor;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `code` in enum 'EventMeshDataContentType'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/enums/EventMeshDataContentType.java`
#### Snippet
```java

    @Getter
    private String code;

    EventMeshDataContentType(String code) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'EventMeshProtocolType'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/enums/EventMeshProtocolType.java`
#### Snippet
```java
    OPEN_MESSAGE("openmessage");

    private String name;

    EventMeshProtocolType(String name) {
```

## RuleId[id=Deprecation]
### Deprecation
'isAccessible()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/ConfigMonitorService.java`
#### Snippet
```java

                Field field = configInfo.getObjectField();
                boolean isAccessible = field.isAccessible();
                try {
                    field.setAccessible(true);
```

### Deprecation
'newInstance()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/ConverterMap.java`
#### Snippet
```java
            if (!classToConverter.containsKey(converter1)) {
                try {
                    ConvertValue<?> convertValue = (ConvertValue<?>) converter1.newInstance();
                    register(convertValue, converter1);
                } catch (Exception e) {
```

### Deprecation
'newInstance()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/MapConverter.java`
#### Snippet
```java
                map = new HashMap<>();
            } else {
                map = (Map<String, Object>) convertInfo.getField().getType().newInstance();
            }
            Type parameterizedType = ((ParameterizedType) convertInfo.getField().getGenericType()).getActualTypeArguments()[1];
```

### Deprecation
'newInstance()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ListConverter.java`
#### Snippet
```java
                list = new ArrayList<>();
            } else {
                list = (List<Object>) convertInfo.getField().getType().newInstance();
            }

```

### Deprecation
'isAccessible()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ObjectConverter.java`
#### Snippet
```java
            Method method = this.clazz.getDeclaredMethod(this.reloadMethodName == null ? "reload" : this.reloadMethodName);

            boolean isAccessible = method.isAccessible();
            try {
                method.setAccessible(true);
```

### Deprecation
'isAccessible()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ObjectConverter.java`
#### Snippet
```java
            }

            boolean isAccessible = field.isAccessible();
            try {
                field.setAccessible(true);
```

### Deprecation
'newInstance()' is deprecated
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ObjectConverter.java`
#### Snippet
```java
        try {
            this.convertInfo = convertInfo;
            this.object = convertInfo.getClazz().newInstance();
            this.init(convertInfo.getConfigInfo());
            this.setValue();
```

### Deprecation
'isAccessible()' is deprecated
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/AdminWebHookConfigOperationManager.java`
#### Snippet
```java
        final Constructor<? extends WebHookConfigOperation> constructor =
            WEBHOOK_CONFIG_OPERATION_MAP.get(operationMode).getDeclaredConstructor(Properties.class);
        final boolean oldAccesssible = constructor.isAccessible();
        try {
            constructor.setAccessible(true);
```

### Deprecation
'com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner' is deprecated
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/EventMeshGrpcService.java`
#### Snippet
```java
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
            new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
```

### Deprecation
'com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner' is deprecated
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/EventMeshGrpcService.java`
#### Snippet
```java
                "nfunctionB\024EventMeshGrpcServiceb\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
            new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                public com.google.protobuf.ExtensionRegistry assignDescriptors(
```

### Deprecation
'internalBuildGeneratedFileFrom(java.lang.String\[\], com.google.protobuf.Descriptors.FileDescriptor\[\], com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner)' is deprecated
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/EventMeshGrpcService.java`
#### Snippet
```java
            };
        com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[] {
                    org.apache.eventmesh.common.protocol.grpc.cloudevents.EventMeshCloudEvents.getDescriptor(),
```

### Deprecation
'getDefaultMQPushConsumerImpl()' is deprecated
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        ConsumeMessageService consumeMessageService = rocketmqPushConsumer
            .getDefaultMQPushConsumerImpl().getConsumeMessageService();
        List<MessageExt> msgExtList = new ArrayList<>(cloudEvents.size());
        for (CloudEvent msg : cloudEvents) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/response/TopicResponse.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopicResponse {topic=").append(this.topic).append(",").append("created_time=").append(this.createdTime).append("}");
        return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpCommand.java`
#### Snippet
```java

    public String simpleDesc() {
        StringBuilder sb = new StringBuilder();
        sb.append("httpCommand={")
            .append(cmdType).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/UnRegResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/SubscribeResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/UnSubscribeResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/HeartbeatResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("heartbeatResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/PushMessageResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pushMessageResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/RegResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/UnRegRequestBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regRequestBody={")
            .append("clientType=").append(clientType)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/UnRegRequestBody.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("unRegTopicEntity={")
                .append("topic=").append(topic).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchV2ResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchV2ResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchV2RequestBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendMessageBatchV2RequestBody={")
            .append("bizSeqNo=").append(bizSeqNo).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/ReplyMessageRequestBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("replyMessageRequestBody={")
            .append("bizSeqNo=").append(bizSeqNo).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/ReplyMessageResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("replyMessageResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/PushMessageRequestBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pushMessageRequestBody={")
            .append("randomNo=").append(randomNo).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchResponseBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchResponseBody={")
            .append("retCode=").append(retCode).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageRequestBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageRequestBody={")
            .append("topic=").append(topic).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchRequestBody.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchRequestBody={")
            .append("batchId=").append(batchId).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchRequestBody.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("batchMessageEntity={")
                .append("bizSeqNo=").append(bizSeqNo).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/BaseRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("baseRequestHeader={code=").append(code).append("}");
        return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/RegResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/UnSubscribeResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("unSubscribeResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/SubscribeResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("subscribeResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/RegRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("regRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/HeartbeatResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("heartbeatResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/UnSubscribeRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("subscribeRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/UnRegResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nnRegResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/SubscribeRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("subscribeRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/UnRegRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("unRegRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/ReplyMessageResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("replyMessageResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/HeartbeatRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("heartbeatRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/PushMessageResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pushMessageResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/PushMessageRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pushMessageRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageBatchResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageBatchRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageBatchV2ResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchV2ResponseHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/ReplyMessageRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("replyMessageRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageBatchV2RequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageBatchV2RequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageRequestHeader={")
            .append("code=").append(code).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/SendMessageContext.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageContext={")
            .append("bizSeqNo=").append(bizSeqNo)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/EventMeshProducer.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("eventMeshProducer={").append("status=").append(serviceState.name()).append(",").append("producerGroupConfig=")
            .append(producerGroupConfig).append("}");
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HandleMsgContext.java`
#### Snippet
```java
    @Override
    public String toString() {
        return new StringBuilder()
            .append("handleMsgContext={")
            .append("consumerGroup=")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/SendMessageContext.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessageContext={")
            .append("bizSeqNo=").append(bizSeqNo)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("eventMeshProducer={")
            .append("inited=").append(inited.get()).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AsyncHTTPPushRequest.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("asyncPushRequest={")
            .append("bizSeqNo=").append(handleMsgContext.getBizSeqNo())
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncRemoteEventProcessor.java`
#### Snippet
```java

        final String env = eventMeshHTTPServer.getEventMeshHttpConfiguration().getEventMeshEnv();
        final String meshGroup = new StringBuilder()
            .append(env)
            .append('-')
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/Client.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("endPoint={env=").append(env)
            .append(",idc=").append(idc)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/ConsumerGroupConf.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumerGroupConfig={")
            .append("groupName=").append(consumerGroup).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/ProducerGroupConf.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("producerGroupConfig={")
            .append("groupName=").append(groupName).append("}");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/event/ConsumerGroupTopicConfChangeEvent.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumerGroupTopicConfChangeEvent={")
            .append("consumerGroup=").append(consumerGroup).append(",")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/event/ConsumerGroupStateEvent.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumerGroupStateEvent={")
            .append("consumerGroup=").append(consumerGroup)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/ConsumerGroupTopicConf.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(120);
        sb.append("consumeTopicConfig={consumerGroup=").append(consumerGroup)
            .append(",topic=").append(topic)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java

    public static String buildPushMsgSeqNo() {
        return new StringBuilder()
            .append(StringUtils.rightPad(String.valueOf(System.currentTimeMillis()), 6))
            .append(RandomStringUtils.generateNum(4))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java

    public static String buildMeshClientID(final String clientGroup, final String meshCluster) {
        return new StringBuilder()
            .append(StringUtils.trim(clientGroup))
            .append('(')
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
        }

        return new StringBuilder()
            .append(client.getSubsystem())
            .append('-')
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/EventMeshCloudEventUtils.java`
#### Snippet
```java
                OffsetDateTime offsetDateTime = covertProtoTimestamp(value.getCeTimestamp());
                convertedAttributes.put(key, dateTimeFormatter.format(offsetDateTime.toLocalDateTime()));
                return;
            }
        });
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
            notification.setConsumerGroupConfig(EventMeshUtil.cloneObject(latestConsumerGroupConfig));
            eventMeshHTTPServer.getEventBus().post(notification);
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendSyncMessageProcessor.java`
#### Snippet
```java
        }

        return;
    }
}
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageProcessor.java`
#### Snippet
```java
        completeResponse(request, asyncContext, sendMessageBatchResponseHeader, EventMeshRetCode.SUCCESS, null,
                SendMessageBatchResponseBody.class);
        return;
    }
}
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `eventmesh-connectors/source-connector-rocketmq/src/main/java/org/apache/eventmesh/source/connector/rocketmq/connector/RocketMQSourceConnector.java`
#### Snippet
```java
        map.put("topic", topic);
        map.put("brokerName", brokerName);
        map.put("queueId", queueId + "");
        return new RecordPartition(map);
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `eventmesh-connectors/source-connector-rocketmq/src/main/java/org/apache/eventmesh/source/connector/rocketmq/connector/RocketMQSourceConnector.java`
#### Snippet
```java
    public static RecordOffset convertToRecordOffset(Long offset) {
        Map<String, String> offsetMap = new HashMap<>();
        offsetMap.put("queueOffset", offset + "");
        return new RecordOffset(offsetMap);
    }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:org.apache.eventmesh.cloudevents.v1.CloudEventBatch)
      CloudEventBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEventBatch_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEventBatch_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      // @@protoc_insertion_point(builder_implements:org.apache.eventmesh.cloudevents.v1.CloudEvent)
      CloudEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        // @@protoc_insertion_point(builder_implements:org.apache.eventmesh.cloudevents.v1.CloudEvent.CloudEventAttributeValue)
        CloudEventAttributeValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_CloudEventAttributeValue_descriptor;
```

### FinalStaticMethod
'static' method declared `final`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_CloudEventAttributeValue_descriptor;
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        String, CloudEventAttributeValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, CloudEventAttributeValue>newDefaultInstance(
                EventMeshCloudEvents.internal_static_org_apache_eventmesh_cloudevents_v1_CloudEvent_AttributesEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            public void initChannel(SocketChannel ch) {
                ch.pipeline().addLast(new Codec.Encoder(), new Codec.Decoder())
                    .addLast(handler, newExceptionHandler());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
        ctx.writeAndFlush(pkg).addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                Utils.logSucceedMessageFlow(pkg, null, startTime, startTime);
                try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/HelloTask.java`
#### Snippet
```java
                new ChannelFutureListener() {
                    @Override
                    public void operationComplete(ChannelFuture future) throws Exception {
                        if (!future.isSuccess()) {
                            Utils.logFailedMessageFlow(future, res, user, startTime, taskExecuteTime);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
                new ChannelFutureListener() {
                    @Override
                    public void operationComplete(ChannelFuture future) throws Exception {
                        if (!future.isSuccess()) {
                            MESSAGE_LOGGER.error("write2Client fail, pkg[{}] session[{}]", pkg, this);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java

        @Override
        public void channelInactive(final ChannelHandlerContext ctx) throws Exception {
            connections.decrementAndGet();
            super.channelInactive(ctx);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
         */
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            if (!(msg instanceof HttpRequest)) {
                return;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
         */
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            if (!(msg instanceof HttpRequest)) {
                return;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java

        @Override
        public void channelActive(final ChannelHandlerContext ctx) throws Exception {
            if (connections.incrementAndGet() > MAX_CONNECTIONS) {
                if (log.isWarnEnabled()) {
```

### NullableProblems
Parameter annotated @Nonnull must not override @Nullable parameter
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/AbstractTraceService.java`
#### Snippet
```java
            @Nullable
            @Override
            public String get(final @Nonnull Map<String, Object> carrier, final String key) {
                return Optional.ofNullable(carrier.get(key)).map(Objects::toString).orElse(null);
            }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/AbstractTraceService.java`
#### Snippet
```java
            @Nullable
            @Override
            public String get(final @Nonnull Map<String, Object> carrier, final String key) {
                return Optional.ofNullable(carrier.get(key)).map(Objects::toString).orElse(null);
            }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/PinpointTraceService.java`
#### Snippet
```java

/**
 * https://github.com/pinpoint-apm/pinpoint
 */
@Config(field = "pinpointConfiguration")
```

## RuleId[id=CollectionAddedToSelf]
### CollectionAddedToSelf
'putAll()' called on collection `properties` with itself as argument
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/SubscriptionReply.java`
#### Snippet
```java
            return;
        }
        properties.putAll(properties);
    }
}
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/openmessage/OpenMessageTCPPubClient.java`
#### Snippet
```java
class OpenMessageTCPPubClient implements EventMeshTCPPubClient<Message> {

    private final EventMeshTCPClientConfig eventMeshTcpClientConfig;

    public OpenMessageTCPPubClient(final EventMeshTCPClientConfig eventMeshTcpClientConfig) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/openmessage/OpenMessageTCPSubClient.java`
#### Snippet
```java
class OpenMessageTCPSubClient implements EventMeshTCPSubClient<Message> {

    private final EventMeshTCPClientConfig eventMeshTcpClientConfig;

    public OpenMessageTCPSubClient(EventMeshTCPClientConfig eventMeshTcpClientConfig) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/SSLContextFactory.java`
#### Snippet
```java
public class SSLContextFactory {

    private static String protocol = "TLSv1.1";

    private static String fileName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/SSLContextFactory.java`
#### Snippet
```java
    private static String fileName;

    private static String password;

    public static SSLContext getSslContext(final EventMeshHTTPConfiguration eventMeshHttpConfiguration)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
    private final Acl acl;

    private final EventMeshServer eventMeshServer;

    private EventMeshGrpcMonitor eventMeshGrpcMonitor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    private ThreadPoolExecutor adminExecutor;

    private ThreadPoolExecutor webhookExecutor;

    private transient RateLimiter msgRateLimiter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/SessionContext.java`
#### Snippet
```java
public class SessionContext {

    private Session session;

    @Getter
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/PushContext.java`
#### Snippet
```java
public class PushContext {

    private SessionPusher sessionPusher;

    public AtomicLong deliveredMsgsCount = new AtomicLong(0);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceService.java`
#### Snippet
```java
public class EventMeshRebalanceService {

    private EventMeshTCPServer eventMeshTCPServer;

    private Integer rebalanceIntervalMills;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPMessageHandler.java`
#### Snippet
```java
public class HTTPMessageHandler implements MessageHandler {

    private final transient EventMeshConsumer eventMeshConsumer;

    private static final transient ScheduledExecutorService SCHEDULER =
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
    private final AtomicBoolean inited = new AtomicBoolean(false);

    private final EventMeshHTTPServer eventMeshHTTPServer;

    private final EventMeshConsumer eventMeshConsumer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/metrics/tcp/EventMeshTcpMonitor.java`
#### Snippet
```java
    private static final int period = 60 * 1000;

    private static int PRINT_THREADPOOLSTATE_INTERVAL = 1;

    public ScheduledFuture<?> monitorTpsTask;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/AdminWebHookConfigOperationManager.java`
#### Snippet
```java
    }

    private transient AdminConfiguration adminConfiguration;

    private transient WebHookConfigOperation webHookConfigOperation;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/WebHookController.java`
#### Snippet
```java
    private transient ProtocolAdaptor<ProtocolTransportObject> protocolAdaptor;

    private transient ReceiveConfiguration receiveConfiguration;

    public void init() throws Exception {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/sub/service/SubService.java`
#### Snippet
```java
    private transient EventMeshHttpConsumer eventMeshHttpConsumer;

    private transient Properties properties;

    private final transient List<SubscriptionItem> topicList = Lists.newArrayList(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/service/ConsumerService.java`
#### Snippet
```java
    private CallbackServiceBlockingStub publisherClient = CallbackServiceGrpc.newBlockingStub(channel);

    private final ExecutorService handleService = Executors.newSingleThreadExecutor();


```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/api/connector/SourceConnector.java`
#### Snippet
```java
public abstract class SourceConnector implements Source {

    private final SourceConfig sourceConfig;

    protected SourceConnector(SourceConfig sourceConfig) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/api/connector/SinkConnector.java`
#### Snippet
```java
public abstract class SinkConnector implements Sink {

    private final SinkConfig sinkConfig;

    protected SinkConnector(SinkConfig sinkConfig) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    private final Properties properties;
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private KafkaConsumerRunner kafkaConsumerRunner;
    private ExecutorService executorService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/admin/RocketMQAdmin.java`
#### Snippet
```java

    private int numOfQueue = 4;
    private int queuePermission = 6;

    public RocketMQAdmin() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/admin/RocketMQAdmin.java`
#### Snippet
```java
    protected String clusterName;

    private int numOfQueue = 4;
    private int queuePermission = 6;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/producer/AbstractProducer.java`
#### Snippet
```java
    protected final AtomicBoolean started = new AtomicBoolean(false);
    //    private boolean started = false;
    private final ClientConfig clientConfig;

    AbstractProducer(final Properties properties) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
    private final DefaultMQPushConsumer defaultMQPushConsumer;
    private final MessageListenerConcurrently messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ThreadPoolExecutor consumeExecutor;
    private final String consumerGroup;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private final ClientConfig clientConfig;

    public PushConsumerImpl(final Properties properties) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdStreamObserver.java`
#### Snippet
```java
public class EtcdStreamObserver implements StreamObserver<LeaseKeepAliveResponse> {

    private EtcdLeaseId etcdLeaseId;

    @Override
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `EmptyProto.getDescriptor()` is ignored
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/EventMeshGrpcService.java`
#### Snippet
```java
          EventMeshCloudEvents.getDescriptor(),
        });
    com.google.protobuf.EmptyProto.getDescriptor();
    EventMeshCloudEvents.getDescriptor();
  }
```

### IgnoreResultOfCall
Result of `EventMeshCloudEvents.getDescriptor()` is ignored
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/EventMeshGrpcService.java`
#### Snippet
```java
        });
    com.google.protobuf.EmptyProto.getDescriptor();
    EventMeshCloudEvents.getDescriptor();
  }

```

### IgnoreResultOfCall
Result of `AnyProto.getDescriptor()` is ignored
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/EventMeshCloudEvents.java`
#### Snippet
```java
        internal_static_org_apache_eventmesh_cloudevents_v1_CloudEventBatch_descriptor,
        new String[] { "Events", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }
```

### IgnoreResultOfCall
Result of `TimestampProto.getDescriptor()` is ignored
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/EventMeshCloudEvents.java`
#### Snippet
```java
        new String[] { "Events", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
        final File webHookFileDir = new File(webHookFilePath);
        if (!webHookFileDir.exists()) {
            webHookFileDir.mkdirs();
        }
        if (!webHookFileDir.isDirectory()) {
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
        final File manuDir = new File(getWebhookConfigManuDir(webHookConfig));
        if (!manuDir.exists()) {
            manuDir.mkdir();
        }

```

### IgnoreResultOfCall
Result of `FileChannel.lock()` is ignored
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8))) {
            // lock this file, and will auto release after fos close
            fos.getChannel().lock();
            bw.write(Objects.requireNonNull(JsonUtils.toJSONString(webHookConfig)));
        } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
        final File webHookFileDir = new File(filePath);
        if (!webHookFileDir.exists()) {
            webHookFileDir.mkdirs();
        } else {
            readFiles(webHookFileDir);
```

### IgnoreResultOfCall
Result of `EventMeshCloudEvents.getDescriptor()` is ignored
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/EventMeshGrpcService.java`
#### Snippet
```java
                    com.google.protobuf.TimestampProto.getDescriptor(),
                }, assigner);
        org.apache.eventmesh.common.protocol.grpc.cloudevents.EventMeshCloudEvents.getDescriptor();
        com.google.protobuf.AnyProto.getDescriptor();
        com.google.protobuf.TimestampProto.getDescriptor();
```

### IgnoreResultOfCall
Result of `AnyProto.getDescriptor()` is ignored
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/EventMeshGrpcService.java`
#### Snippet
```java
                }, assigner);
        org.apache.eventmesh.common.protocol.grpc.cloudevents.EventMeshCloudEvents.getDescriptor();
        com.google.protobuf.AnyProto.getDescriptor();
        com.google.protobuf.TimestampProto.getDescriptor();
    }
```

### IgnoreResultOfCall
Result of `TimestampProto.getDescriptor()` is ignored
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/EventMeshGrpcService.java`
#### Snippet
```java
        org.apache.eventmesh.common.protocol.grpc.cloudevents.EventMeshCloudEvents.getDescriptor();
        com.google.protobuf.AnyProto.getDescriptor();
        com.google.protobuf.TimestampProto.getDescriptor();
    }

```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/SourceWorker.java`
#### Snippet
```java
        pollService.shutdown();
        try {
            pollService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("awaitTermination error", e);
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/producer/AbstractProducer.java`
#### Snippet
```java
    StorageRuntimeException checkProducerException(CloudEvent cloudEvent, Throwable e) {
        if (cloudEvent.getData() == null) {
            return new StorageRuntimeException(String.format("CloudEvent message data does not exist.", e));
        }
        return new StorageRuntimeException(String.format("Unknown connector runtime exception.", e));
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/producer/AbstractProducer.java`
#### Snippet
```java
            return new StorageRuntimeException(String.format("CloudEvent message data does not exist.", e));
        }
        return new StorageRuntimeException(String.format("Unknown connector runtime exception.", e));
    }

```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java

@Slf4j
@EventMeshTrace(isEnable = false)
public class LocalUnSubscribeEventProcessor extends AbstractEventProcessor {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshGrpcConfiguration.java`
#### Snippet
```java
    private int eventMeshMsgReqNumPerSecond = 15000;

    @ConfigFiled(field = "", reload = true)
    private String eventMeshIp;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshHTTPConfiguration.java`
#### Snippet
```java
    private int eventMeshServerRetryThreadNum = 2;

    @ConfigFiled(field = "")
    private int eventMeshServerWebhookThreadNum = 4;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshHTTPConfiguration.java`
#### Snippet
```java
    private int eventMeshServerSendMsgBlockQSize = 1000;

    @ConfigFiled(field = "")
    private int eventMeshServerRemoteMsgBlockQSize = 1000;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/config/AdminConfiguration.java`
#### Snippet
```java
    private String operationMode;

    @ConfigFiled(field = "", reload = true)
    private Properties operationProperties;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/config/ReceiveConfiguration.java`
#### Snippet
```java
    private String filePath;

    @ConfigFiled(field = "", reload = true)
    private Properties operationProperties;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/config/PinpointConfiguration.java`
#### Snippet
```java
    private String applicationName;

    @ConfigFiled(field = "", reload = true)
    private Properties grpcTransportProperties;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getTopic()` is identical to its super method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
    }

    public String getTopic() {
        return topic;
    }
```

### RedundantMethodOverride
Method `getSubscriptionMode()` is identical to its super method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
    }

    public SubscriptionMode getSubscriptionMode() {
        return subscriptionMode;
    }
```

### RedundantMethodOverride
Method `getConsumerGroup()` is identical to its super method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
    }

    public String getConsumerGroup() {
        return consumerGroup;
    }
```

### RedundantMethodOverride
Method `getGrpcType()` is identical to its super method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
    }

    public GrpcType getGrpcType() {
        return grpcType;
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    @Override
    public com.google.protobuf.Any getProtoData() {
      if (protoDataBuilder_ == null) {
        if (dataCase_ == 8) {
          return (com.google.protobuf.Any) data_;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      @Override
      public com.google.protobuf.Timestamp getCeTimestamp() {
        if (ceTimestampBuilder_ == null) {
          if (attrCase_ == 7) {
            return (com.google.protobuf.Timestamp) attr_;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/SourceWorker.java`
#### Snippet
```java
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/SourceWorker.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
```

### UNUSED_IMPORT
Unused import `import org.apache.kafka.clients.producer.Callback;`
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/producer/ProducerImpl.java`
#### Snippet
```java

import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
```

### UNUSED_IMPORT
Unused import `import org.apache.kafka.clients.producer.RecordMetadata;`
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/producer/ProducerImpl.java`
#### Snippet
```java
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/task/HistoryMessageClearTask.java`
#### Snippet
```java
    @Override
    public void run() {
        while (true) {
            historyMessageClear.clearMessages();
            try {
```

## RuleId[id=ExcessiveLambdaUsage]
### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/EventMeshConsumer.java`
#### Snippet
```java
            final String bizSeqNo = Optional.ofNullable(
                    (String) event.getExtension(Constants.PROPERTY_MESSAGE_SEARCH_KEYS))
                .orElseGet(() -> "");
            final String uniqueId = Optional.ofNullable((String) event.getExtension(Constants.RMB_UNIQ_ID))
                .orElseGet(() -> "");
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/EventMeshConsumer.java`
#### Snippet
```java
                .orElseGet(() -> "");
            final String uniqueId = Optional.ofNullable((String) event.getExtension(Constants.RMB_UNIQ_ID))
                .orElseGet(() -> "");

            if (log.isDebugEnabled()) {
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncRemoteEventProcessor.java`
#### Snippet
```java
        return Optional.ofNullable(event.getExtension(protocolKey))
            .map(Objects::toString)
            .orElseGet(() -> "");
    }

```

## RuleId[id=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-connectors/sink-connector-rocketmq/src/main/java/org/apache/eventmesh/sink/connector/rocketmq/config/RocketMQSinkConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class RocketMQSinkConfig extends SinkConfig {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-connectors/source-connector-rocketmq/src/main/java/org/apache/eventmesh/source/connector/rocketmq/config/RocketMQSourceConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class RocketMQSourceConfig extends SourceConfig {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/sink/config/OpenFunctionSinkConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class OpenFunctionSinkConfig extends SinkConfig {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/config/OpenFunctionServerConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class OpenFunctionServerConfig extends Config {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/source/config/OpenFunctionSourceConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class OpenFunctionSourceConfig extends SourceConfig {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/api/config/SourceConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public abstract class SourceConfig extends Config {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/api/config/SinkConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public abstract class SinkConfig extends Config {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-trace-plugin/eventmesh-trace-jaeger/src/main/java/org/apache/eventmesh/trace/jaeger/JaegerTraceService.java`
#### Snippet
```java
@Config(field = "jaegerConfiguration")
@Config(field = "exporterConfiguration")
@Data
public class JaegerTraceService extends AbstractTraceService {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/PinpointTraceService.java`
#### Snippet
```java
@Config(field = "pinpointConfiguration")
@Config(field = "exporterConfiguration")
@Data
public class PinpointTraceService extends AbstractTraceService {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-trace-plugin/eventmesh-trace-zipkin/src/main/java/org/apache/eventmesh/trace/zipkin/ZipkinTraceService.java`
#### Snippet
```java
@Config(field = "zipkinConfiguration")
@Config(field = "exporterConfiguration")
@Data
public class ZipkinTraceService extends AbstractTraceService {

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `callbackConcurrentHashMap` are updated, but never queried
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
    private ReceiveMsgHook<CloudEvent> callback;

    private final ConcurrentHashMap<String, AsyncRRCallback> callbackConcurrentHashMap = new ConcurrentHashMap<>();

    public CloudEventTCPPubClient(EventMeshTCPClientConfig eventMeshTcpClientConfig) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `callbackConcurrentHashMap` are updated, but never queried
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java
    private transient ReceiveMsgHook<EventMeshMessage> callback;

    private final transient ConcurrentHashMap<String, AsyncRRCallback> callbackConcurrentHashMap = new ConcurrentHashMap<>();

    public EventMeshMessageTCPPubClient(EventMeshTCPClientConfig eventMeshTcpClientConfig) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `paramPairs` are queried, but never updated
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/metrics/PrometheusGrpcExporter.java`
#### Snippet
```java
     * Map structure : [metric name, description of name] -> the method of get corresponding metric.
     */
    private Map<String[], Function<GrpcSummaryMetrics, Number>> paramPairs;

    static {
```

### MismatchedCollectionQueryUpdate
Contents of collection `paramPairs` are queried, but never updated
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/metrics/PrometheusTcpExporter.java`
#### Snippet
```java
     * Map structure : [metric name, description of name] -> the method of get corresponding metric.
     */
    private Map<String[], Function<TcpSummaryMetrics, Number>> paramPairs;

    static {
```

### MismatchedCollectionQueryUpdate
Contents of collection `paramPairs` are queried, but never updated
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/metrics/PrometheusHttpExporter.java`
#### Snippet
```java
     * Map structure : [metric name, description of name] -> the method of get corresponding metric.
     */
    private Map<String[], Function<HttpSummaryMetrics, Number>> paramPairs;

    static {
```

### MismatchedCollectionQueryUpdate
Contents of collection `subscriptionInner` are updated, but never queried
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // Store received message:
    private transient ConcurrentMap<String /* topic */, String /* responseBody */> subscriptionInner;
    private transient EventListener eventListener;

```

### MismatchedCollectionQueryUpdate
Contents of collection `wrapperMap` are updated, but never queried
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
    }

    private static final Map<Class<?>, Class<?>> wrapperMap = new HashMap<>();

    static {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `field` initializer `null` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/ConfigService.java`
#### Snippet
```java
        configInfo.setReloadMethodName(config.reloadMethodName());

        Field field = null;
        try {
            field = clazz.getDeclaredField(configInfo.getField());
```

### UnusedAssignment
Variable `session` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/HelloTask.java`
#### Snippet
```java
        long taskExecuteTime = System.currentTimeMillis();
        Package res = new Package();
        Session session = null;
        UserAgent user = (UserAgent) pkg.getBody();
        try {
```

### UnusedAssignment
Variable `retryObj` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/retry/GrpcRetryer.java`
#### Snippet
```java
        dispatcher = new Thread(() -> {
            try {
                DelayRetryable retryObj = null;
                while (!Thread.currentThread().isInterrupted()
                    && (retryObj = failed.take()) != null) {
```

### UnusedAssignment
Variable `res` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/WebhookPushRequest.java`
#### Snippet
```java
                delayRetry();
            } else {
                String res = "";
                try {
                    res = EntityUtils.toString(response.getEntity(),
```

### UnusedAssignment
Variable `rebalanceResult` initializer `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
            }
        }
        int rebalanceResult = 0;
        if (avgNum == 0) {
            rebalanceResult = 1;
```

### UnusedAssignment
Variable `localEventMeshMap` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java

    private Map<String, String> queryLocalEventMeshMap(String cluster) {
        Map<String, String> localEventMeshMap = null;
        List<EventMeshDataInfo> eventMeshDataInfoList = null;
        try {
```

### UnusedAssignment
Variable `eventMeshDataInfoList` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
    private Map<String, String> queryLocalEventMeshMap(String cluster) {
        Map<String, String> localEventMeshMap = null;
        List<EventMeshDataInfo> eventMeshDataInfoList = null;
        try {
            eventMeshDataInfoList = eventMeshTCPServer.getRegistry().findEventMeshInfoByCluster(cluster);
```

### UnusedAssignment
Variable `sessionSet` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
    private void doRedirect(String group, String purpose, int judge, List<String> eventMeshRecommendResult) throws Exception {
        log.info("doRebalance redirect start---------------------group:{},judge:{}", group, judge);
        Set<Session> sessionSet = null;
        if (EventMeshConstants.PURPOSE_SUB.equals(purpose)) {
            sessionSet = eventMeshTCPServer.getClientSessionGroupMapping().getClientGroupMap().get(group).getGroupConsumerSessions();
```

### UnusedAssignment
Variable `localEventMeshDistributeData` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
    private Map<String, Integer> queryLocalEventMeshDistributeData(String cluster, String group, String purpose,
        Map<String, String> eventMeshMap) {
        Map<String, Integer> localEventMeshDistributeData = null;
        Map<String, Map<String, Integer>> eventMeshClientDistributionDataMap = null;
        try {
```

### UnusedAssignment
Variable `eventMeshClientDistributionDataMap` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
        Map<String, String> eventMeshMap) {
        Map<String, Integer> localEventMeshDistributeData = null;
        Map<String, Map<String, Integer>> eventMeshClientDistributionDataMap = null;
        try {
            eventMeshClientDistributionDataMap = eventMeshTCPServer.getRegistry().findEventMeshClientDistributionData(
```

### UnusedAssignment
Variable `eventMeshProducer` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/ProducerManager.java`
#### Snippet
```java

    public EventMeshProducer getEventMeshProducer(String producerGroup) throws Exception {
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        targetUrl.append("http://").append(ip).append(":").append(port)
            .append("/eventMesh/msg/push");
        HttpTinyClient.HttpResult result = null;

        try {
```

### UnusedAssignment
Variable `eventMeshProducer` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java

    public EventMeshProducer getEventMeshProducer(String producerGroup, String token) throws Exception {
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
```

### UnusedAssignment
Variable `eventMeshProducer` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java

    public EventMeshProducer getEventMeshProducer(String producerGroup) throws Exception {
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
```

### UnusedAssignment
Variable `requestCode` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AsyncHTTPPushRequest.java`
#### Snippet
```java
        HttpPost builder = new HttpPost(currPushUrl);

        String requestCode = "";
        if (SubscriptionType.SYNC == handleMsgContext.getSubscriptionItem().getType()) {
            requestCode = String.valueOf(RequestCode.HTTP_PUSH_CLIENT_SYNC.getRequestCode());
```

### UnusedAssignment
Variable `content` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AsyncHTTPPushRequest.java`
#### Snippet
```java
        handleMsgContext.setEvent(event);

        String content = "";
        try {
            String protocolType = Objects.requireNonNull(event.getExtension(Constants.PROTOCOL_TYPE)).toString();
```

### UnusedAssignment
Variable `resp` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/HttpTinyClient.java`
#### Snippet
```java
            conn.connect();
            int respCode = conn.getResponseCode();
            String resp = null;

            if (HttpURLConnection.HTTP_OK == respCode) {
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectClientByIpPortHandler.java`
#### Snippet
```java
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String result = "";
        try (OutputStream out = httpExchange.getResponseBody()) {
            String queryString = httpExchange.getRequestURI().getQuery();
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientByPathHandler.java`
#### Snippet
```java
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String result = "";
        try (OutputStream out = httpExchange.getResponseBody()) {
            String queryString = httpExchange.getRequestURI().getQuery();
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/QueryRecommendEventMeshHandler.java`
#### Snippet
```java
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String result = "";
        try (OutputStream out = httpExchange.getResponseBody()) {
            if (!eventMeshTCPServer.getEventMeshTCPConfiguration().isEventMeshServerRegistryEnable()) {
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientByIpPortHandler.java`
#### Snippet
```java
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String result = "";
        try (OutputStream out = httpExchange.getResponseBody()) {
            String queryString = httpExchange.getRequestURI().getQuery();
```

### UnusedAssignment
Variable `properties` initializer `new ConcurrentHashMap<>()` is redundant
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/api/data/DefaultKeyValue.java`
#### Snippet
```java
public class DefaultKeyValue implements KeyValue {

    private Map<String, String> properties = new ConcurrentHashMap<>();

    @Override
```

### UnusedAssignment
Variable `topicList` initializer `null` is redundant
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // Topics to subscribe:
    private transient List<SubscriptionItem> topicList = null;
    private final transient ConcurrentHashMap<String, AtomicLong> offsetMap;
    private final transient AtomicBoolean started = new AtomicBoolean(false);
```

### UnusedAssignment
Variable `keyValues` initializer `null` is redundant
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
        Client client = getEtcdClient();
        String keyPrefix = KEY_PREFIX + KEY_APP + EtcdConstant.KEY_SEPARATOR + group;
        List<KeyValue> keyValues = null;
        try {
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
```

### UnusedAssignment
Variable `keyValues` initializer `null` is redundant
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
        Client client = getEtcdClient();
        String keyPrefix = KEY_PREFIX + KEY_SERVICE + EtcdConstant.KEY_SEPARATOR;
        List<KeyValue> keyValues = null;
        try {
            List<EventMeshServicePubTopicInfo> eventMeshServicePubTopicInfoList = new ArrayList<>();
```

### UnusedAssignment
Variable `validationKeyBytes` initializer `new byte[0]` is redundant
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
                publicKeyUrl = commonConfiguration.getEventMeshSecurityPublickey();
            }
            byte[] validationKeyBytes = new byte[0];
            try {
                validationKeyBytes = Files.readAllBytes(Paths.get(publicKeyUrl));
```

### UnusedAssignment
Variable `validationKeyBytes` initializer `new byte[0]` is redundant
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
                publicKeyUrl = commonConfiguration.getEventMeshSecurityPublickey();
            }
            byte[] validationKeyBytes = new byte[0];
            try {
                validationKeyBytes = Files.readAllBytes(Paths.get(publicKeyUrl));
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java

    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        Long maxOffset = cloudEvents.stream().map(cloudEvent -> this.kafkaConsumerRunner.getOffset(cloudEvent)).max(Long::compare).get();
        cloudEvents.forEach(cloudEvent -> this.updateOffset(cloudEvent.getSubject(), maxOffset));
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `this.scheduler != null` is always `true`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
        }

        if (this.scheduler != null) {
            scheduler.shutdown();
        }
```

### ConstantValue
Condition `topicResponse != null` is always `false`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/handler/TopicsHandler.java`
#### Snippet
```java
            //TBD: A new rocketmq service will be implemented for creating topics
            TopicResponse topicResponse = null;
            if (topicResponse != null) {
                log.info("create a new topic: {}", topic);
                httpExchange.getResponseHeaders().add(CONTENT_TYPE, APPLICATION_JSON);
```

### ConstantValue
Condition `protoData == null` is always `false`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/EventMeshCloudEventUtils.java`
#### Snippet
```java
        if (ProtoSupport.isProtoContent(dataContentType)) {
            Any protoData = cloudEvent.getProtoData();
            return protoData == null || protoData == Any.getDefaultInstance() ? defaultValue
                : new String(protoData.toByteArray(), Constants.DEFAULT_CHARSET);
        }
```

### ConstantValue
Condition `binaryData == null` is always `false`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/EventMeshCloudEventUtils.java`
#### Snippet
```java
        }
        ByteString binaryData = cloudEvent.getBinaryData();
        return binaryData == null || ByteString.EMPTY == binaryData ? defaultValue : binaryData.toStringUtf8();


```

### ConstantValue
Result of `eventMeshHttpConfiguration.isEventMeshServerTraceEnable()` is always 'true'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
            && eventMeshHttpConfiguration.isEventMeshServerTraceEnable()) {

            this.setUseTrace(eventMeshHttpConfiguration.isEventMeshServerTraceEnable());
        }

```

### ConstantValue
Condition `(retryContext = retrys.take()) != null` is always `true`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/EventMeshTcpRetryer.java`
#### Snippet
```java
            try {
                RetryContext retryContext;
                while ((retryContext = retrys.take()) != null) {
                    final RetryContext retryCtx = retryContext;
                    pool.execute(() -> {
```

### ConstantValue
Condition `(retryObj = failed.take()) != null` is always `true` when reached
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/retry/GrpcRetryer.java`
#### Snippet
```java
                DelayRetryable retryObj = null;
                while (!Thread.currentThread().isInterrupted()
                    && (retryObj = failed.take()) != null) {
                    final DelayRetryable delayRetryable = retryObj;
                    pool.execute(() -> {
```

### ConstantValue
Value `responseCommand` is always 'null'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java

                    final AsyncContext<HttpCommand> asyncContext =
                        new AsyncContext<>(requestCommand, responseCommand, asyncContextCompleteHandler);
                    processEventMeshRequest(ctx, asyncContext);
                }
```

### ConstantValue
Condition `flag` is always `true`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
        final String dataContentType = EventMeshCloudEventUtils.getDataContentType(cloudEvent);
        if (ProtoSupport.isTextContent(dataContentType)) {
            return flag & (StringUtils.isNotEmpty(cloudEvent.getTextData()));
        }
        if (ProtoSupport.isProtoContent(dataContentType)) {
```

### ConstantValue
Condition `flag` is always `true`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
        }
        if (ProtoSupport.isProtoContent(dataContentType)) {
            return flag & (cloudEvent.getProtoData() != Any.getDefaultInstance());
        }

```

### ConstantValue
Condition `flag` is always `true`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
        }

        return flag & (cloudEvent.getBinaryData() != ByteString.EMPTY);
    }

```

### ConstantValue
Condition `(retryObj = failed.take()) != null` is always `true` when reached
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/retry/HttpRetryer.java`
#### Snippet
```java
            try {
                DelayRetryable retryObj;
                while (!Thread.currentThread().isInterrupted() && (retryObj = failed.take()) != null) {
                    final DelayRetryable delayRetryable = retryObj;
                    pool.execute(() -> {
```

### ConstantValue
Value `event` is always 'null'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageProcessor.java`
#### Snippet
```java
                CloudEvent event = null;
                // TODO: Detect the maximum length of messages for different producers.
                final SendMessageContext sendMessageContext = new SendMessageContext(batchId, event, batchEventMeshProducer,
                    eventMeshHTTPServer);
                sendMessageContext.setEventList(eventlist);
```

### ConstantValue
Value `status` is always 'null'
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/patch/EventMeshMessageListenerConcurrently.java`
#### Snippet
```java
                        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                    default:
                        return status;
                }
            } catch (Throwable e) {
```

### ConstantValue
Condition `ipPort == null` is always `false`
in `eventmesh-registry-plugin/eventmesh-registry-consul/src/main/java/org/apache/eventmesh/registry/consul/service/ConsulRegistryService.java`
#### Snippet
```java
        try {
            String[] ipPort = eventMeshRegisterInfo.getEndPoint().split(IP_PORT_SEPARATOR);
            if (ipPort == null || ipPort.length < 2) {
                return false;
            }
```

### ConstantValue
Condition `ipPort == null` is always `false`
in `eventmesh-registry-plugin/eventmesh-registry-nacos/src/main/java/org/apache/eventmesh/registry/nacos/service/NacosRegistryService.java`
#### Snippet
```java
        try {
            String[] ipPort = eventMeshRegisterInfo.getEndPoint().split(NacosConstant.IP_PORT_SEPARATOR);
            if (ipPort == null || ipPort.length < 2) {
                return false;
            }
```

### ConstantValue
Condition `null == ipPort` is always `false`
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
        try {
            String[] ipPort = eventMeshRegisterInfo.getEndPoint().split(ZookeeperConstant.IP_PORT_SEPARATOR);
            if (null == ipPort || ipPort.length < 2) {
                return false;
            }
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `takeIndex`
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/MessageQueue.java`
#### Snippet
```java
                return;
            }
            items[takeIndex++] = null;
            if (takeIndex == items.length) {
                takeIndex = 0;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `takeIndex`
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/MessageQueue.java`
#### Snippet
```java
     */
    private MessageEntity dequeue() {
        MessageEntity item = items[takeIndex++];
        if (takeIndex == items.length) {
            takeIndex = 0;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `putIndex`
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/MessageQueue.java`
#### Snippet
```java
     */
    private void enqueue(MessageEntity messageEntity) {
        items[putIndex++] = messageEntity;
        if (putIndex == items.length) {
            putIndex = 0;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `count`
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/MessageQueue.java`
#### Snippet
```java
            putIndex = 0;
        }
        count++;
        notEmpty.signalAll();
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'io.cloudevents.CloudEvent' to 'T'
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java
        if (message instanceof CloudEvent) {
            CloudEvent cloudEvent = cloudEventProducer.requestReply((CloudEvent) message, timeout);
            return (T) cloudEvent;
        } else if (message instanceof EventMeshMessage) {
            return (T) eventMeshMessageProducer.requestReply((EventMeshMessage) message, timeout);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.eventmesh.common.EventMeshMessage' to 'T'
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java
            return (T) cloudEvent;
        } else if (message instanceof EventMeshMessage) {
            return (T) eventMeshMessageProducer.requestReply((EventMeshMessage) message, timeout);
        } else {
            throw new IllegalArgumentException("Not support message " + message.getClass().getName());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.HashMap' to 'T'
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
        // This is GRPC response cloudEvent
        if (StringUtils.isEmpty(seq) && StringUtils.isEmpty(uniqueId)) {
            return (T) JsonUtils.parseTypeReferenceObject(content,
                new TypeReference<HashMap<String, String>>() {

                });
        }
        if (null == protocolType) {
```

### UNCHECKED_WARNING
Unchecked cast: 'io.cloudevents.CloudEvent' to 'T'
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
        switch (protocolType) {
            case CLOUD_EVENTS:
                return (T) switchEventMeshCloudEvent2CloudEvent(cloudEvent);
            case EVENT_MESH_MESSAGE:
                return (T) switchEventMeshCloudEvent2EventMeshMessage(cloudEvent);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.eventmesh.common.EventMeshMessage' to 'T'
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
                return (T) switchEventMeshCloudEvent2CloudEvent(cloudEvent);
            case EVENT_MESH_MESSAGE:
                return (T) switchEventMeshCloudEvent2EventMeshMessage(cloudEvent);
            case OPEN_MESSAGE:
            default:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/HttpRequestProcessor.java`
#### Snippet
```java
            Object o = method.invoke(null, emCode.getRetCode(),
                    StringUtils.isNotBlank(msg) ? msg : emCode.getErrMsg());
            HttpCommand response = req.createHttpCommandResponse(respHeader, (E) o);
            asyncContext.onComplete(response);
        } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.eventmesh.runtime.core.protocol.http.async.AsyncContext'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/HttpRequestProcessor.java`
#### Snippet
```java
                    StringUtils.isNotBlank(msg) ? msg : emCode.getErrMsg());
            HttpCommand response = req.createHttpCommandResponse(respHeader, (E) o);
            asyncContext.onComplete(response);
        } catch (Exception e) {
            log.error("response failed", e);
```

### UNCHECKED_WARNING
Unchecked call to 'apply(T)' as a member of raw type 'java.util.function.Function'
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
                .setDescription(metricDesc)
                .setUnit(protocol)
                .setUpdater(result -> result.observe((long) getMetric.apply(summaryMetrics), Labels.empty()))
                .build();
        } else if (metricType == Double.class) {
```

### UNCHECKED_WARNING
Unchecked call to 'apply(T)' as a member of raw type 'java.util.function.Function'
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
                .setDescription(metricDesc)
                .setUnit(protocol)
                .setUpdater(result -> result.observe((double) getMetric.apply(summaryMetrics), Labels.empty()))
                .build();
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Set'
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
        String topic = aclProperties.getTopic();

        Set<String> groupTopics = (Set<String>) aclProperties.getExtendedField("topics");

        if (groupTopics.contains(topic)) {
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/ConfigService.java`
#### Snippet
```java
        Class<?> clazz = object.getClass();
        Config[] configArray = clazz.getAnnotationsByType(Config.class);
        if (configArray.length == 0) {
            return;
        }
```

## RuleId[id=DoubleNegation]
### DoubleNegation
Double negation in `!((mutable_bitField0_ & 0x00000001) != 0)`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              events_ = new java.util.ArrayList<CloudEvent>();
              mutable_bitField0_ |= 0x00000001;
```

### DoubleNegation
Double negation in `!((bitField0_ & 0x00000001) != 0)`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new java.util.ArrayList<CloudEvent>(events_);
        bitField0_ |= 0x00000001;
```

### DoubleNegation
Double negation in `!((mutable_bitField0_ & 0x00000001) != 0)`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attributes_ = com.google.protobuf.MapField.newMapField(
                  AttributesDefaultEntryHolder.defaultEntry);
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPPubClient` is inaccessible from here
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/EventMeshTCPPubClient.java`
#### Snippet
```java
 * EventMesh TCP publish client.
 * <ul>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPPubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPPubClient}</li>
```

### JavadocReference
Symbol `org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient` is inaccessible from here
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/EventMeshTCPPubClient.java`
#### Snippet
```java
 * <ul>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPPubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPPubClient}</li>
 * </ul>
```

### JavadocReference
Symbol `org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPPubClient` is inaccessible from here
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/EventMeshTCPPubClient.java`
#### Snippet
```java
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPPubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPPubClient}</li>
 * </ul>
 *
```

### JavadocReference
Symbol `org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPSubClient` is inaccessible from here
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/EventMeshTCPSubClient.java`
#### Snippet
```java
 * EventMesh TCP subscribe client.
 * <ul>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPSubClient}</li>
```

### JavadocReference
Symbol `org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient` is inaccessible from here
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/EventMeshTCPSubClient.java`
#### Snippet
```java
 * <ul>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPSubClient}</li>
 * </ul>
```

### JavadocReference
Symbol `org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPSubClient` is inaccessible from here
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/EventMeshTCPSubClient.java`
#### Snippet
```java
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.cloudevent.CloudEventTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.eventmeshmessage.EventMeshMessageTCPSubClient}</li>
 *     <li>{@link org.apache.eventmesh.client.tcp.impl.openmessage.OpenMessageTCPSubClient}</li>
 * </ul>
 *
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    private com.google.protobuf.MapField<String, CloudEventAttributeValue>
    internalGetMutableAttributes() {
      onChanged();;
      if (attributes_ == null) {
        attributes_ = com.google.protobuf.MapField.newMapField(
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        }
        attrCase_ = 7;
        onChanged();;
        return ceTimestampBuilder_;
      }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      }
      dataCase_ = 8;
      onChanged();;
      return protoDataBuilder_;
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        return this.value;
      }
    };

    public AttrCase
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      return this.value;
    }
  };

  public DataCase
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/EventMeshTcpSendStatus.java`
#### Snippet
```java
    SUCCESS,
    SEND_TOO_FAST,
    OTHER_EXCEPTION;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/patch/EventMeshConsumeConcurrentlyStatus.java`
#### Snippet
```java
     * Success consumption but ack later manually
     */
    CONSUME_FINISH;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/common/ServiceState.java`
#### Snippet
```java
    STOPPING,

    STOPPED;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/patch/EventMeshConsumeConcurrentlyStatus.java`
#### Snippet
```java
     * Success consumption but ack later manually
     */
    CONSUME_FINISH;
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `cloudEvent.getDataContentType()` might be null
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/MessageUtils.java`
#### Snippet
```java
        if (message instanceof CloudEvent) {
            final CloudEvent cloudEvent = (CloudEvent) message;
            Preconditions.checkNotNull(cloudEvent.getDataContentType(), "DateContentType cannot be null");
            msg.getHeader().putProperty(Constants.PROTOCOL_TYPE, EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME);
            msg.getHeader().putProperty(Constants.PROTOCOL_VERSION, cloudEvent.getSpecVersion().toString());
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/MessageUtils.java`
#### Snippet
```java

            final byte[] bodyByte = EventFormatProvider.getInstance().resolveFormat(cloudEvent.getDataContentType())
                .serialize((CloudEvent) message);
            msg.setBody(bodyByte);
        } else if (message instanceof EventMeshMessage) {
```

### DataFlowIssue
Method invocation `getAttributesMap` may produce `NullPointerException`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
#### Snippet
```java
        subscriptionReply.putAllProperties(prop);

        return CloudEvent.newBuilder().putAllAttributes(cloudEvent.getAttributesMap())
            .putAttributes(ProtocolKey.DATA_CONTENT_TYPE,
                CloudEventAttributeValue.newBuilder().setCeString(EventMeshDataContentType.JSON.getCode()).build())
```

### DataFlowIssue
Casting `Arrays.asList(...).toArray()` to `String[]` will produce `ClassCastException` for any non-null value
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/model/RequestParam.java`
#### Snippet
```java
            queryParams.put(key, new String[]{value});
        } else {
            queryParams.put(key, (String[]) Arrays.asList(queryParams.get(key), value).toArray());
        }
        return this;
```

### DataFlowIssue
Argument `cloudEvent.getDataContentType()` might be null
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/CloudEventProducer.java`
#### Snippet
```java
    private RequestParam buildCommonPostParam(final CloudEvent cloudEvent) {
        validateCloudEvent(cloudEvent);
        final byte[] bodyByte = Objects.requireNonNull(EventFormatProvider.getInstance().resolveFormat(cloudEvent.getDataContentType()))
            .serialize(cloudEvent);
        final String content = new String(bodyByte, StandardCharsets.UTF_8);
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
        }
        try {
            return CloudEvent.parseFrom(eventProtoFormat.serialize(cloudEventBuilder.build()));
        } catch (InvalidProtocolBufferException exc) {
            log.error("Parse from CloudEvents CloudEvent bytes to EventMesh CloudEvent error", exc);
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
    private static io.cloudevents.CloudEvent switchEventMeshCloudEvent2CloudEvent(final CloudEvent cloudEvent) {

        return eventProtoFormat.deserialize(Objects.requireNonNull(cloudEvent).toByteArray());
    }

```

### DataFlowIssue
Method invocation `getTopic` may produce `NullPointerException`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/handler/TopicsHandler.java`
#### Snippet
```java
            TopicCreateRequest topicCreateRequest =
                JsonUtils.parseObject(params, TopicCreateRequest.class);
            String topic = topicCreateRequest.getTopic();

            if (StringUtils.isBlank(topic)) {
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/EventMeshCloudEventUtils.java`
#### Snippet
```java
            return new HashMap<>(0);
        }
        Map<String, CloudEventAttributeValue> attributesMap = Optional.ofNullable(cloudEvent.getAttributesMap()).orElse(new HashMap<>(0));
        Map<String, String> convertedAttributes = new HashMap<>(attributesMap.size());
        attributesMap.forEach((key, value) -> {
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/EventMeshCloudEventUtils.java`
#### Snippet
```java
        String dataContentType = getDataContentType(cloudEvent);
        if (ProtoSupport.isTextContent(dataContentType)) {
            return Optional.ofNullable(cloudEvent.getTextData()).orElse(defaultValue);
        }
        if (ProtoSupport.isProtoContent(dataContentType)) {
```

### DataFlowIssue
Method invocation `setAttribute` will produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
                if (useRequestURI) {
                    if (useTrace) {
                        span.setAttribute(SemanticAttributes.HTTP_METHOD,
                            httpRequest.method() == null ? "" : httpRequest.method().name());
                        span.setAttribute(SemanticAttributes.HTTP_FLAVOR,
```

### DataFlowIssue
Dereference of `heartbeatItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
            new TypeReference<List<HeartbeatItem>>() {
            });
        for (HeartbeatItem item : heartbeatItems) {
            if (StringUtils.isEmpty(item.getTopic())) {
                return false;
```

### DataFlowIssue
Dereference of `subscriptionItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/UnsubscribeProcessor.java`
#### Snippet
```java
        // Collect clients to remove in the unsubscribe
        List<ConsumerGroupClient> removeClients = new LinkedList<>();
        for (SubscriptionItem item : subscriptionItems) {
            ConsumerGroupClient newClient = ConsumerGroupClient.builder()
                .env(env)
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
            long startTime = System.currentTimeMillis();
            long taskExcuteTime = startTime;
            send(new UpStreamMsgContext(null, event, null, startTime, taskExcuteTime),
                new SendCallback() {
                    @Override
```

### DataFlowIssue
Dereference of `heartbeatItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/HeartbeatProcessor.java`
#### Snippet
```java
            new TypeReference<List<HeartbeatItem>>() {
            });
        for (HeartbeatItem item : heartbeatItems) {
            ConsumerGroupClient hbClient = ConsumerGroupClient.builder()
                .env(env)
```

### DataFlowIssue
Dereference of `heartbeatItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/HeartbeatProcessor.java`
#### Snippet
```java
                new TypeReference<List<HeartbeatItem>>() {
                });
            for (HeartbeatItem item : heartbeatItems) {
                this.acl.doAclCheckInHttpHeartbeat(remoteAdd, user, pass, sys, item.getTopic(), requestCode);
            }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/BatchPublishCloudEventProcessor.java`
#### Snippet
```java
        for (io.cloudevents.CloudEvent event : cloudEvents) {
            String seqNum = event.getId();
            String uniqueId = (event.getExtension(ProtocolKey.UNIQUE_ID) == null) ? "" : event.getExtension(ProtocolKey.UNIQUE_ID).toString();
            ProducerManager producerManager = eventMeshGrpcServer.getProducerManager();
            EventMeshProducer eventMeshProducer = producerManager.getEventMeshProducer(producerGroup);
```

### DataFlowIssue
Dereference of `subscriptionItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/SubscribeStreamProcessor.java`
#### Snippet
```java
            new TypeReference<List<SubscriptionItem>>() {
            });
        for (SubscriptionItem item : subscriptionItems) {
            ConsumerGroupClient newClient = ConsumerGroupClient.builder()
                .env(env)
```

### DataFlowIssue
Dereference of `subscriptionItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/SubscribeStreamProcessor.java`
#### Snippet
```java
                new TypeReference<List<SubscriptionItem>>() {
                });
            for (SubscriptionItem item : subscriptionItems) {
                this.acl.doAclCheckInHttpReceive(remoteAdd, user, pass, subsystem, item.getTopic(), RequestCode.SUBSCRIBE.getRequestCode());
            }
```

### DataFlowIssue
Method invocation `close` will produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPClientPool.java`
#### Snippet
```java

        if (this.connectionManager == null) {
            this.connectionManager.close();
        }
    }
```

### DataFlowIssue
Dereference of `subscriptionItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/SubscribeProcessor.java`
#### Snippet
```java
        final String url = EventMeshCloudEventUtils.getURL(subscription);
        final List<ConsumerGroupClient> newClients = new LinkedList<>();
        for (final SubscriptionItem item : subscriptionItems) {
            final ConsumerGroupClient newClient = ConsumerGroupClient.builder()
                .env(env)
```

### DataFlowIssue
Dereference of `subscriptionItems` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/SubscribeProcessor.java`
#### Snippet
```java
            });
        if (eventMeshGrpcServer.getEventMeshGrpcConfiguration().isEventMeshServerSecurityEnable()) {
            for (final SubscriptionItem item : subscriptionItems) {
                this.acl.doAclCheckInHttpReceive(EventMeshCloudEventUtils.getConsumerGroup(subscription),
                    EventMeshCloudEventUtils.getUserName(subscription), EventMeshCloudEventUtils.getPassword(subscription),
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
        event.getExtensionNames().forEach((extensionKey) -> {
            propMap.put(extensionKey, event.getExtension(extensionKey) == null ? ""
                    : event.getExtension(extensionKey).toString());
        });
        return propMap;
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
        //add trace info
        for (String entry : cloudEvent.getExtensionNames()) {
            span.setAttribute(entry, cloudEvent.getExtension(entry) == null ? "" : cloudEvent.getExtension(entry).toString());
        }
        return span;
```

### DataFlowIssue
Argument `service` might be null
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
                WatchKey key = null;
                try {
                    key = Paths.get(path).register(service, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
                } catch (IOException e) {
                    log.error("registerWatchKey failed", e);
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/GrpcAbstractDemo.java`
#### Snippet
```java
            .withDataContentType(ExampleConstants.CLOUDEVENT_CONTENT_TYPE)
            .withType(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME)
            .withData(JsonUtils.toJSONString(content).getBytes(StandardCharsets.UTF_8))
            .withExtension(Constants.EVENTMESH_MESSAGE_CONST_TTL, String.valueOf(4 * 1000))
            .build();
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/HttpAbstractDemo.java`
#### Snippet
```java
            .withDataContentType(ExampleConstants.CLOUDEVENT_CONTENT_TYPE)
            .withType(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME)
            .withData(JsonUtils.toJSONString(content).getBytes(StandardCharsets.UTF_8))
            .withExtension(Constants.EVENTMESH_MESSAGE_CONST_TTL, String.valueOf(4_000))
            .build();
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/sub/controller/SubController.java`
#### Snippet
```java
        }
        @SuppressWarnings("unchecked") final Map<String, String> contentMap = JsonUtils.parseObject(content, HashMap.class);
        if (StringUtils.equals(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME, contentMap.get(ProtocolKey.PROTOCOL_TYPE))) {
            final EventFormat eventFormat = EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE);
            if (eventFormat != null) {
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/CloudEventsPublishInstance.java`
#### Snippet
```java
            .withDataContentType("application/cloudevents+json")
            .withType(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME)
            .withData(JsonUtils.toJSONString(content).getBytes(StandardCharsets.UTF_8))
            .withExtension(Constants.EVENTMESH_MESSAGE_CONST_TTL, String.valueOf(4 * 1000))
            .build();
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/cloudevent/impl/KnativeMessageWriter.java`
#### Snippet
```java
    public String end() throws CloudEventRWException {
        if (ObjectUtils.allNotNull(message, message.getData())) {
            return message.getData().toString();
        }
        throw CloudEventRWException.newOther(new IllegalArgumentException("message data is null"));
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaEvent.java`
#### Snippet
```java

    public static byte[] toByteArray(PravegaEvent pravegaEvent) {
        return JsonUtils.toJSONString(pravegaEvent).getBytes(StandardCharsets.UTF_8);
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        org.apache.rocketmq.common.message.Message msg =
            RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);
        msg = supplySysProp(msg, cloudEvent);
        try {
            this.rocketmqProducer.send(msg, this.sendCallbackConvert(msg, sendCallback));
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java
            return new ArrayList<>(0);
        }
        return cloudEventBatch.getEventsList().stream().map(cloudEvent -> eventFormat.deserialize(cloudEvent.toByteArray()))
            .collect(Collectors.toList());
    }
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java
        }
        try {
            return new EventMeshCloudEventWrapper(CloudEvent.parseFrom(eventFormat.serialize(cloudEvent)));
        } catch (InvalidProtocolBufferException e) {
            log.error("Build Event Mesh CloudEvent from io.cloudevents.CloudEvent error", e);
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java

    public static io.cloudevents.CloudEvent buildEvent(CloudEvent cloudEvent) {
        io.cloudevents.CloudEvent event = eventFormat.deserialize(cloudEvent.toByteArray());
        return event;
    }
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java
        }
        try {
            return new EventMeshCloudEventWrapper(CloudEvent.parseFrom(eventFormat.serialize(cloudEvent)));
        } catch (InvalidProtocolBufferException e) {
            log.error("Build Event Mesh CloudEvent from io.cloudevents.CloudEvent error", e);
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java
            return new ArrayList<>(0);
        }
        return cloudEventBatch.getEventsList().stream().map(cloudEvent -> eventFormat.deserialize(cloudEvent.toByteArray()))
            .collect(Collectors.toList());
    }
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java
            return null;
        }
        io.cloudevents.CloudEvent event = eventFormat.deserialize(cloudEvent.toByteArray());
        return event;
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/MeshMessageProtocolAdaptor.java`
#### Snippet
```java
        validateCloudEvent(cloudEvent);
        String protocolDesc =
            cloudEvent.getExtension(Constants.PROTOCOL_DESC) == null ? null : cloudEvent.getExtension(Constants.PROTOCOL_DESC).toString();

        if (StringUtils.equals(MeshMessageProtocolConstant.PROTOCOL_DESC_HTTP, protocolDesc)) {
```

### DataFlowIssue
Argument `publicKeyUrl` might be null
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
            byte[] validationKeyBytes = new byte[0];
            try {
                validationKeyBytes = Files.readAllBytes(Paths.get(publicKeyUrl));
                X509EncodedKeySpec spec = new X509EncodedKeySpec(validationKeyBytes);
                KeyFactory kf = KeyFactory.getInstance("RSA");
```

### DataFlowIssue
Argument `publicKeyUrl` might be null
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
            byte[] validationKeyBytes = new byte[0];
            try {
                validationKeyBytes = Files.readAllBytes(Paths.get(publicKeyUrl));
                X509EncodedKeySpec spec = new X509EncodedKeySpec(validationKeyBytes);
                KeyFactory kf = KeyFactory.getInstance("RSA");
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcpExceptionHandler.java`
#### Snippet
```java
        Session session = eventMeshTCPServer.getClientSessionGroupMapping().getSession(ctx);
        UserAgent client = session == null ? null : session.getClient();
        log.error("exceptionCaught, push goodbye to client|user={},errMsg={}", client, cause.fillInStackTrace());
        String errMsg;
        if (cause.toString().contains("value not one of declared Enum instance names")) {
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/ListenTask.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            log.error("ListenTask failed|user={}|errMsg={}", session.getClient(), e);
            Integer status = OPStatus.FAIL.getCode();
            header = new Header(LISTEN_RESPONSE, status, e.toString(), pkg.getHeader().getSeq());
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
                .getSeq()));
        } catch (Exception e) {
            MESSAGE_LOGGER.error("UnSubscribeTask failed|user={}|errMsg={}", session.getClient(), e);
            msg.setHeader(new Header(Command.UNSUBSCRIBE_RESPONSE, OPStatus.FAIL.getCode(), "exception while "
                +
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/HelloTask.java`
#### Snippet
```java
            Utils.writeAndFlush(res, startTime, taskExecuteTime, session.getContext(), session);
        } catch (Throwable e) {
            MESSAGE_LOGGER.error("HelloTask failed|address={},errMsg={}", ctx.channel().remoteAddress(), e);
            res.setHeader(new Header(HELLO_RESPONSE, OPStatus.FAIL.getCode(), Arrays.toString(e.getStackTrace()), pkg
                .getHeader().getSeq()));
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/HeartBeatTask.java`
#### Snippet
```java
                pkg.getHeader().getSeq()));
        } catch (Exception e) {
            log.error("HeartBeatTask failed|user={}|errMsg={}", Objects.requireNonNull(session).getClient(), e);
            res.setHeader(new Header(HEARTBEAT_RESPONSE, OPStatus.FAIL.getCode(), "exception while "
                + "heartbeating", pkg.getHeader().getSeq()));
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/SubscribeTask.java`
#### Snippet
```java
            msg.setHeader(new Header(Command.SUBSCRIBE_RESPONSE, OPStatus.SUCCESS.getCode(), OPStatus.SUCCESS.getDesc(), pkg.getHeader().getSeq()));
        } catch (Exception e) {
            log.error("SubscribeTask failed|user={}|errMsg={}", session.getClient(), e);
            msg.setHeader(new Header(Command.SUBSCRIBE_RESPONSE, OPStatus.FAIL.getCode(), e.toString(), pkg.getHeader().getSeq()));
        } finally {
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/RecommendTask.java`
#### Snippet
```java
            res.setBody(eventMeshRecommendResult);
        } catch (Exception e) {
            MESSAGE_LOGGER.error("RecommendTask failed|address={}|errMsg={}", ctx.channel().remoteAddress(), e);
            res.setHeader(new Header(RECOMMEND_RESPONSE, OPStatus.FAIL.getCode(), e.toString(), pkg
                .getHeader().getSeq()));
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/GoodbyeTask.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            log.error("GoodbyeTask failed|user={}|errMsg={}", session.getClient(), e);
            msg.setHeader(new Header(CLIENT_GOODBYE_RESPONSE, OPStatus.FAIL.getCode(), Arrays.toString(e.getStackTrace()),
                pkg.getHeader().getSeq()));
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                session.getSender().failMsgCount.incrementAndGet();
                MESSAGE_LOGGER
                    .error("upstreamMsg mq message error|user={}|callback cost={}, errMsg={}",
                        session.getClient(),
                        (System.currentTimeMillis() - createTime),
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java

                session.getSender().failMsgCount.incrementAndGet();
                log.error("upstreamMsg mq message error|user={}|callback cost={}, errMsg={}", session.getClient(),
                    System.currentTimeMillis() - createTime, new Exception(context.getException()));
                msg.setHeader(new Header(replyCmd, OPStatus.FAIL.getCode(), context.getException().toString(), seq));
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            log.warn("doRebalance failed,findEventMeshInfoByCluster failed,cluster:{},errMsg:{}", cluster, e);
            return Collections.emptyMap();
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
                group, purpose);
        } catch (Exception e) {
            log.warn("doRebalance failed,cluster:{},group:{},purpose:{},findProxyClientDistributionData failed, errMsg:{}",
                cluster, group, purpose, e);
            return Collections.emptyMap();
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            if (log.isWarnEnabled()) {
                log.warn("EventMeshRecommend failed, findEventMeshInfoByCluster failed, cluster:{}, group:{}, purpose:{}, errMsg:{}",
                    cluster, group, purpose, e);
            }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            if (log.isWarnEnabled()) {
                log.warn("EventMeshRecommend failed,findEventMeshClientDistributionData failed,"
                    + "cluster:{},group:{},purpose:{}, errMsg:{}", cluster, group, purpose, e);
            }
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/RemoteSubscribeEventProcessor.java`
#### Snippet
```java
            long endTime = System.currentTimeMillis();
            httpLogger.error(
                "message|eventMesh2mq|REQ|ASYNC|send2MQCost={}ms|topic={}"
                    + "|bizSeqNo={}|uniqueId={}", endTime - startTime,
                JsonUtils.toJSONString(subscriptionList), url, e);
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_SUBSCRIBE_ERR, responseHeaderMap,
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/RemoteUnSubscribeEventProcessor.java`
#### Snippet
```java
            long endTime = System.currentTimeMillis();
            httpLogger.error(
                "message|eventMesh2mq|REQ|ASYNC|send2MQCost={}ms|topic={}"
                    + "|bizSeqNo={}|uniqueId={}", endTime - startTime,
                topic, unSubscribeUrl, e);
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_UNSUBSCRIBE_ERR, responseHeaderMap,
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SubscribeProcessor.java`
#### Snippet
```java
                if (log.isErrorEnabled()) {
                    log.error(
                        "message|eventMesh2mq|REQ|ASYNC|send2MQCost={}ms|topic={}"
                            + "|bizSeqNo={}|uniqueId={}", endTime - startTime,
                        JsonUtils.toJSONString(subscribeRequestBody.getTopics()),
                        subscribeRequestBody.getUrl(), e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (5) than placeholders specified (6)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
        if (pkg.getBody() instanceof EventMeshMessage) {
            final String mqMessage = EventMeshUtil.printMqMessage((EventMeshMessage) pkg.getBody());
            MESSAGE_LOGGER.error("pkg|eventMesh2c|failed|cmd={}|mqMsg={}|user={}|wait={}ms|cost={}ms|errMsg={}",
                pkg.getHeader().getCmd(), mqMessage, user, taskExecuteTime - startTime,
                System.currentTimeMillis() - startTime, e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (5) than placeholders specified (6)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
                System.currentTimeMillis() - startTime, e);
        } else {
            MESSAGE_LOGGER.error("pkg|eventMesh2c|failed|cmd={}|pkg={}|user={}|wait={}ms|cost={}ms|errMsg={}",
                pkg.getHeader().getCmd(),
                pkg, user, taskExecuteTime - startTime, System.currentTimeMillis() - startTime, e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectClientByIpPortHandler.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                log.error("clientManage|rejectClientByIpPort|fail|ip={}|port={},errMsg={}", ip, port, e);
                result = String.format("rejectClientByIpPort fail! {ip=%s port=%s}, had reject {%s}, errorMsg : %s", ip,
                    port, NetUtils.addressToString(successRemoteAddrs), e.getMessage());
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientBySubSystemHandler.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                log.error("clientManage|redirectClientBySubSystem|fail|subSystem={}|destEventMeshIp"
                    +
                    "={}|destEventMeshPort={},errMsg={}", subSystem, destEventMeshIp, destEventMeshPort, e);

                NetUtils.sendSuccessResponseHeaders(httpExchange);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientByPathHandler.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                log.error("clientManage|redirectClientByPath|fail|path={}|destEventMeshIp"
                    +
                    "={}|destEventMeshPort={},errMsg={}", path, destEventMeshIp, destEventMeshPort, e);
                result = String.format("redirectClientByPath fail! sessionMap size {%d}, {path=%s "
                        +
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectClientBySubSystemHandler.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                log.error("clientManage|rejectClientBySubSystem|fail|subSystemId={},errMsg={}", subSystem, e);
                result = String.format("rejectClientBySubSystem fail! sessionMap size {%d}, had reject {%s} , {"
                        +
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (4) than placeholders specified (5)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientByIpPortHandler.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                log.error("clientManage|redirectClientByIpPort|fail|ip={}|port={}|destEventMeshIp"
                    +
                    "={}|destEventMeshPort={},errMsg={}", ip, port, destEventMeshIp, destEventMeshPort, e);
                result = String.format("redirectClientByIpPort fail! sessionMap size {%d}, {clientIp=%s clientPort=%s "
                        +
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetAttributes();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetMutableAttributes();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 5:
        return internalGetAttributes();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpCommand.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("httpCommand={")
            .append(cmdType).append(",")
            .append(httpMethod).append("/").append(httpVersion).append(",")
            .append("requestCode=").append(requestCode).append(",")
            .append("opaque=").append(opaque).append(",");

        if (cmdType == CmdType.RES) {
            sb.append("cost=").append(resTime - reqTime).append(",");
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/PushMessageRequestBody.java`
#### Snippet
```java
        Map<String, Object> map = new HashMap<>();
        map.put(RANDOMNO, randomNo);
        map.put(TOPIC, topic);
        map.put(CONTENT, content);
        map.put(BIZSEQNO, bizSeqNo);
        map.put(UNIQUEID, uniqueId);
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/ReplyMessageRequestBody.java`
#### Snippet
```java
        String extFields = MapUtils.getString(bodyParam, EXTFIELDS);
        if (StringUtils.isNotBlank(extFields)) {
            body.setExtFields(
                JsonUtils.parseTypeReferenceObject(extFields, new TypeReference<HashMap<String, String>>() {
                }));
        }
        body.setProducerGroup(MapUtils.getString(bodyParam, PRODUCERGROUP));
        return body;
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/HeartbeatRequestHeader.java`
#### Snippet
```java
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(ProtocolKey.REQUEST_CODE, code);
        map.put(ProtocolKey.LANGUAGE, language);
        map.put(ProtocolKey.VERSION, version);
        map.put(ProtocolKey.ClientInstanceKey.ENV, env);
        map.put(ProtocolKey.ClientInstanceKey.IDC, idc);
        map.put(ProtocolKey.ClientInstanceKey.SYS, sys);
        map.put(ProtocolKey.ClientInstanceKey.PID, pid);
        map.put(ProtocolKey.ClientInstanceKey.IP, ip);
        map.put(ProtocolKey.ClientInstanceKey.USERNAME, username);
        map.put(ProtocolKey.ClientInstanceKey.PASSWD, passwd);
        return map;
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/HeartbeatRequestHeader.java`
#### Snippet
```java
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
        header.setVersion(ProtocolVersion.get(MapUtils.getString(headerParam, ProtocolKey.VERSION)));
        String lan = StringUtils.isBlank(MapUtils.getString(headerParam, ProtocolKey.LANGUAGE))
            ? Constants.LANGUAGE_JAVA : MapUtils.getString(headerParam, ProtocolKey.LANGUAGE);
        header.setLanguage(lan);
        header.setEnv(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.ENV));
        header.setIdc(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.IDC));
        header.setSys(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.SYS));
        header.setPid(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.PID));
        header.setIp(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.IP));
        header.setUsername(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.USERNAME));
        header.setPasswd(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.PASSWD));
        return header;
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/HeartbeatResponseHeader.java`
#### Snippet
```java
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(ProtocolKey.REQUEST_CODE, code);
        map.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHCLUSTER, eventMeshCluster);
        map.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHIP, eventMeshIp);
        map.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHENV, eventMeshEnv);
        map.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHIDC, eventMeshIdc);
        return map;
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/SubscribeRequestHeader.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("subscribeRequestHeader={")
            .append("code=").append(code).append(",")
            .append("language=").append(language).append(",")
            .append("version=").append(version).append(",")
            .append("env=").append(env).append(",")
            .append("idc=").append(idc).append(",")
            .append("sys=").append(sys).append(",")
            .append("pid=").append(pid).append(",")
            .append("ip=").append(ip).append(",")
            .append("username=").append(username).append(",")
            .append("passwd=").append(passwd).append("}");
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/ReplyMessageRequestHeader.java`
#### Snippet
```java
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
        header.setVersion(ProtocolVersion.get(MapUtils.getString(headerParam, ProtocolKey.VERSION)));
        header.setProtocolType(MapUtils.getString(headerParam, ProtocolKey.PROTOCOL_TYPE));
        header.setProtocolVersion(MapUtils.getString(headerParam, ProtocolKey.PROTOCOL_VERSION));
        header.setProtocolDesc(MapUtils.getString(headerParam, ProtocolKey.PROTOCOL_DESC));
        String lan = StringUtils.isBlank(MapUtils.getString(headerParam, ProtocolKey.LANGUAGE))
            ? Constants.LANGUAGE_JAVA : MapUtils.getString(headerParam, ProtocolKey.LANGUAGE);
        header.setLanguage(lan);
        header.setEnv(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.ENV));
        header.setIdc(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.IDC));
        header.setSys(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.SYS));
        header.setPid(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.PID));
        header.setIp(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.IP));
        header.setUsername(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.USERNAME));
        header.setPasswd(MapUtils.getString(headerParam, ProtocolKey.ClientInstanceKey.PASSWD));
        return header;
```

### DuplicatedCode
Duplicated code
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/client/CloudEventsPublishInstance.java`
#### Snippet
```java
            final Map<String, String> content = new HashMap<>();
            content.put("content", "testAsyncMessage");

            for (int i = 0; i < MESSAGE_SIZE; i++) {
                eventMeshGrpcProducer.publish(buildCloudEvent(content));
                ThreadUtils.sleep(1, TimeUnit.SECONDS);
            }

            ThreadUtils.sleep(30, TimeUnit.SECONDS);
```

### DuplicatedCode
Duplicated code
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/sub/WorkflowExpressAsyncSubscribe.java`
#### Snippet
```java
            NacosSelector nacosSelector = new NacosSelector();
            nacosSelector.init();
            SelectorFactory.register(selectorType, nacosSelector);

            EventMeshCatalogClientConfig eventMeshCatalogClientConfig = EventMeshCatalogClientConfig.builder()
                .serverName(catalogServerName)
                .appServerName(serverName).build();
            EventMeshCatalogClient eventMeshCatalogClient = new EventMeshCatalogClient(eventMeshCatalogClientConfig,
                eventMeshGrpcConsumer);
            eventMeshCatalogClient.init();

            EventMeshWorkflowClientConfig eventMeshWorkflowClientConfig = EventMeshWorkflowClientConfig.builder()
                .serverName(workflowServerName).build();
            workflowClient = new EventMeshWorkflowClient(eventMeshWorkflowClientConfig);

            ThreadUtils.sleep(60_000, TimeUnit.SECONDS);
            eventMeshCatalogClient.destroy();
```

### DuplicatedCode
Duplicated code
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/sub/WorkflowExpressAsyncSubscribe.java`
#### Snippet
```java
        if (log.isInfoEnabled()) {
            log.info("receive async msg: {}", msg);
        }
        if (msg == null) {
            log.info("async msg is null, workflow end.");
            return Optional.empty();
        }

        final Map<String, String> props = msg.getProp();
        final String workflowInstanceId = props.get("workflowinstanceid");
        final String taskInstanceId = props.get("workflowtaskinstanceid");

        final ExecuteRequest executeRequest = ExecuteRequest.newBuilder().setId("testcreateworkflow")
            .setTaskInstanceId(taskInstanceId)
            .setInstanceId(workflowInstanceId).build();
        final ExecuteResponse response = workflowClient.getWorkflowClient().execute(executeRequest);
        if (log.isInfoEnabled()) {
            log.info("receive workflow msg: {}", response.getInstanceId());
        }
        return Optional.empty();
```

### DuplicatedCode
Duplicated code
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/sub/WorkflowOrderAsyncSubscribe.java`
#### Snippet
```java
        final Map<String, String> props = msg.getProp();
        final String workflowInstanceId = props.get("workflowinstanceid");
        final String taskInstanceId = props.get("workflowtaskinstanceid");

        final ExecuteRequest executeRequest = ExecuteRequest.newBuilder().setId("testcreateworkflow")
            .setTaskInstanceId(taskInstanceId)
            .setInstanceId(workflowInstanceId).build();
        final ExecuteResponse response = workflowClient.getWorkflowClient().execute(executeRequest);
        if (log.isInfoEnabled()) {
            log.info("receive workflow msg: {}", response.getInstanceId());
        }
        return Optional.empty();
```

### DuplicatedCode
Duplicated code
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/cloudevents/SyncRequest.java`
#### Snippet
```java
        final Properties properties = Utils.readPropertiesFile(ExampleConstants.CONFIG_FILE_NAME);
        final String eventMeshIp = properties.getProperty(ExampleConstants.EVENTMESH_IP);
        final int eventMeshTcpPort = Integer.parseInt(properties.getProperty(ExampleConstants.EVENTMESH_TCP_PORT));
        final UserAgent userAgent = EventMeshTestUtils.generateClient1();
        final EventMeshTCPClientConfig eventMeshTcpClientConfig = EventMeshTCPClientConfig.builder()
            .host(eventMeshIp)
            .port(eventMeshTcpPort)
            .userAgent(userAgent)
            .build();
```

### DuplicatedCode
Duplicated code
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/sub/cloudevents/AsyncSubscribe.java`
#### Snippet
```java
        final Properties properties = Utils.readPropertiesFile(ExampleConstants.CONFIG_FILE_NAME);
        final String eventMeshIp = properties.getProperty(ExampleConstants.EVENTMESH_IP);
        final int eventMeshTcpPort = Integer.parseInt(properties.getProperty(ExampleConstants.EVENTMESH_TCP_PORT));
        final UserAgent userAgent = EventMeshTestUtils.generateClient2();
        final EventMeshTCPClientConfig eventMeshTcpClientConfig = EventMeshTCPClientConfig.builder()
            .host(eventMeshIp)
            .port(eventMeshTcpPort)
            .userAgent(userAgent)
            .build();
```

### DuplicatedCode
Duplicated code
in `eventmesh-openconnect/eventmesh-openconnect-java/src/main/java/org/apache/eventmesh/openconnect/SinkWorker.java`
#### Snippet
```java
        String meshAddress = config.getPubSubConfig().getMeshAddress();
        String meshIp = meshAddress.split(":")[0];
        int meshPort = Integer.parseInt(meshAddress.split(":")[1]);
        UserAgent agent = UserAgent.builder()
            .env(config.getPubSubConfig().getEnv())
            .host("localhost")
            .password(config.getPubSubConfig().getPassWord())
            .username(config.getPubSubConfig().getUserName())
            .group(config.getPubSubConfig().getGroup())
            .path("/")
            .port(8362)
            .subsystem(config.getPubSubConfig().getAppId())
            .pid(Integer.parseInt(SystemUtils.getProcessId()))
            .version("2.0")
            .idc(config.getPubSubConfig().getIdc())
            .build();
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/CloudEventsProtocolAdaptor.java`
#### Snippet
```java
        } else if (cloudEvent instanceof HttpCommand) {
            org.apache.eventmesh.common.protocol.http.header.Header header = ((HttpCommand) cloudEvent).getHeader();
            Body body = ((HttpCommand) cloudEvent).getBody();
            String requestCode = ((HttpCommand) cloudEvent).getRequestCode();

            return deserializeHttpProtocol(requestCode, header, body);
        } else if (cloudEvent instanceof EventMeshCloudEventWrapper) {
            EventMeshCloudEventWrapper ce = (EventMeshCloudEventWrapper) cloudEvent;
            return GrpcEventMeshCloudEventProtocolResolver.buildEvent(ce.getMessage());
        } else {
            throw new ProtocolHandleException(String.format("protocol class: %s", cloudEvent.getClass()));
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/CloudEventsProtocolAdaptor.java`
#### Snippet
```java
        if (String.valueOf(RequestCode.MSG_BATCH_SEND.getRequestCode()).equals(requestCode)) {
            return SendMessageBatchProtocolResolver.buildEvent(header, body);
        } else if (String.valueOf(RequestCode.MSG_BATCH_SEND_V2.getRequestCode()).equals(requestCode)) {
            return SendMessageBatchV2ProtocolResolver.buildEvent(header, body);
        } else if (String.valueOf(RequestCode.MSG_SEND_SYNC.getRequestCode()).equals(requestCode)) {
            return SendMessageRequestProtocolResolver.buildEvent(header, body);
        } else if (String.valueOf(RequestCode.MSG_SEND_ASYNC.getRequestCode()).equals(requestCode)) {
            return SendMessageRequestProtocolResolver.buildEvent(header, body);
        } else {
            throw new ProtocolHandleException(String.format("unsupported requestCode: %s", requestCode));
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchV2ProtocolResolver.java`
#### Snippet
```java
            String protocolType = sendMessageBatchV2RequestHeader.getProtocolType();
            String protocolDesc = sendMessageBatchV2RequestHeader.getProtocolDesc();
            String protocolVersion = sendMessageBatchV2RequestHeader.getProtocolVersion();

            String code = sendMessageBatchV2RequestHeader.getCode();
            String env = sendMessageBatchV2RequestHeader.getEnv();
            String idc = sendMessageBatchV2RequestHeader.getIdc();
            String ip = sendMessageBatchV2RequestHeader.getIp();
            String pid = sendMessageBatchV2RequestHeader.getPid();
            String sys = sendMessageBatchV2RequestHeader.getSys();
            String username = sendMessageBatchV2RequestHeader.getUsername();
            String passwd = sendMessageBatchV2RequestHeader.getPasswd();
            ProtocolVersion version = sendMessageBatchV2RequestHeader.getVersion();
            String language = sendMessageBatchV2RequestHeader.getLanguage();

            String producerGroup = sendMessageBatchV2RequestBody.getProducerGroup();
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchV2ProtocolResolver.java`
#### Snippet
```java
                event = CloudEventBuilder.from(event)
                    .withExtension(ProtocolKey.REQUEST_CODE, code)
                    .withExtension(ProtocolKey.ClientInstanceKey.ENV, env)
                    .withExtension(ProtocolKey.ClientInstanceKey.IDC, idc)
                    .withExtension(ProtocolKey.ClientInstanceKey.IP, ip)
                    .withExtension(ProtocolKey.ClientInstanceKey.PID, pid)
                    .withExtension(ProtocolKey.ClientInstanceKey.SYS, sys)
                    .withExtension(ProtocolKey.ClientInstanceKey.USERNAME, username)
                    .withExtension(ProtocolKey.ClientInstanceKey.PASSWD, passwd)
                    .withExtension(ProtocolKey.VERSION, version.getVersion())
                    .withExtension(ProtocolKey.LANGUAGE, language)
                    .withExtension(ProtocolKey.PROTOCOL_TYPE, protocolType)
                    .withExtension(ProtocolKey.PROTOCOL_DESC, protocolDesc)
                    .withExtension(ProtocolKey.PROTOCOL_VERSION, protocolVersion)
                    .withExtension(SendMessageBatchV2RequestBody.PRODUCERGROUP, producerGroup)
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageRequestProtocolResolver.java`
#### Snippet
```java
            SendMessageRequestHeader sendMessageRequestHeader = (SendMessageRequestHeader) header;
            SendMessageRequestBody sendMessageRequestBody = (SendMessageRequestBody) body;

            String protocolType = sendMessageRequestHeader.getProtocolType();
            String protocolDesc = sendMessageRequestHeader.getProtocolDesc();
            String protocolVersion = sendMessageRequestHeader.getProtocolVersion();

            String code = sendMessageRequestHeader.getCode();
            String env = sendMessageRequestHeader.getEnv();
            String idc = sendMessageRequestHeader.getIdc();
            String ip = sendMessageRequestHeader.getIp();
            String pid = sendMessageRequestHeader.getPid();
            String sys = sendMessageRequestHeader.getSys();
            String username = sendMessageRequestHeader.getUsername();
            String passwd = sendMessageRequestHeader.getPasswd();
            ProtocolVersion version = sendMessageRequestHeader.getVersion();
            String language = sendMessageRequestHeader.getLanguage();
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/tcp/TcpMessageProtocolResolver.java`
#### Snippet
```java
        String protocolType = header.getProperty(Constants.PROTOCOL_TYPE).toString();
        String protocolVersion = header.getProperty(Constants.PROTOCOL_VERSION).toString();
        String protocolDesc = header.getProperty(Constants.PROTOCOL_DESC).toString();

        if (StringUtils.isAnyBlank(protocolType, protocolVersion, protocolDesc)) {
            throw new ProtocolHandleException(
                String.format("invalid protocol params protocolType %s|protocolVersion %s|protocolDesc %s",
                    protocolType, protocolVersion, protocolDesc));
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-protocol-plugin/eventmesh-protocol-http/src/main/java/org/apache/eventmesh/protocol/http/HttpProtocolAdaptor.java`
#### Snippet
```java
        Map<String, Object> sysHeaderMap = new HashMap<>();
        // ce attributes
        Set<String> attributeNames = cloudEvent.getAttributeNames();
        // ce extensions
        Set<String> extensionNames = cloudEvent.getExtensionNames();
        for (String attributeName : attributeNames) {
            sysHeaderMap.put(attributeName, cloudEvent.getAttribute(attributeName));
        }
        for (String extensionName : extensionNames) {
            sysHeaderMap.put(extensionName, cloudEvent.getExtension(extensionName));
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
        if (!initStatus.compareAndSet(false, true)) {
            return;
        }
        eventMeshRegisterInfoMap = new ConcurrentHashMap<>(ConfigurationContextUtil.KEYS.size());
        for (String key : ConfigurationContextUtil.KEYS) {
            CommonConfiguration commonConfiguration = ConfigurationContextUtil.get(key);
            if (null == commonConfiguration) {
                continue;
            }
            if (StringUtils.isBlank(commonConfiguration.getNamesrvAddr())) {
                throw new RegistryException("namesrvAddr cannot be null");
            }
            this.serverAddr = commonConfiguration.getNamesrvAddr();
            this.username = commonConfiguration.getEventMeshRegistryPluginUsername();
            this.password = commonConfiguration.getEventMeshRegistryPluginPassword();
            break;
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/ConfigurationHandler.java`
#### Snippet
```java
        httpExchange.getResponseHeaders().add(EventMeshConstants.HANDLER_ORIGIN, "*");
        httpExchange.getResponseHeaders().add(EventMeshConstants.HANDLER_METHODS, "*");
        httpExchange.getResponseHeaders().add(EventMeshConstants.HANDLER_HEADERS, "*");
        httpExchange.getResponseHeaders().add(EventMeshConstants.HANDLER_AGE, EventMeshConstants.MAX_AGE);
        httpExchange.sendResponseHeaders(200, 0);
        OutputStream out = httpExchange.getResponseBody();
        out.close();
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/ConfigurationHandler.java`
#### Snippet
```java
            } catch (Exception e) {
                StringWriter writer = new StringWriter();
                PrintWriter printWriter = new PrintWriter(writer);
                e.printStackTrace(printWriter);
                printWriter.flush();
                String stackTrace = writer.toString();

                Error error = new Error(e.toString(), stackTrace);
                String result = JsonUtils.toJSONString(error);
                httpExchange.sendResponseHeaders(500, Objects.requireNonNull(result).getBytes(Constants.DEFAULT_CHARSET).length);
                out.write(result.getBytes(Constants.DEFAULT_CHARSET));
            }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/MetricsHandler.java`
#### Snippet
```java
            StringWriter writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            e.printStackTrace(printWriter);
            printWriter.flush();
            String stackTrace = writer.toString();

            Error error = new Error(e.toString(), stackTrace);
            String result = JsonUtils.toJSONString(error);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/ConfigurationHandler.java`
#### Snippet
```java
        switch (HttpMethod.valueOf(httpExchange.getRequestMethod())) {
            case OPTIONS:
                preflight(httpExchange);
                break;
            case GET:
                get(httpExchange);
                break;
            default: //do nothing
                break;
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/EventHandler.java`
#### Snippet
```java
        } catch (Exception e) {
            try (OutputStream out = httpExchange.getResponseBody()) {
                StringWriter writer = new StringWriter();
                PrintWriter printWriter = new PrintWriter(writer);
                e.printStackTrace(printWriter);
                printWriter.flush();
                String stackTrace = writer.toString();

                Error error = new Error(e.toString(), stackTrace);
                String result = JsonUtils.toJSONString(error);
                httpExchange.sendResponseHeaders(500, Objects.requireNonNull(result).getBytes(Constants.DEFAULT_CHARSET).length);
                out.write(result.getBytes(Constants.DEFAULT_CHARSET));
            } catch (IOException ioe) {
                log.warn("out close failed...", ioe);
            }
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/GrpcClientHandler.java`
#### Snippet
```java
        } catch (Exception e) {
            StringWriter writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            e.printStackTrace(printWriter);
            printWriter.flush();
            String stackTrace = writer.toString();

            Error error = new Error(e.toString(), stackTrace);
            String result = JsonUtils.toJSONString(error);
            httpExchange.sendResponseHeaders(500, 0);
            log.error(result, e);
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/GrpcClientHandler.java`
#### Snippet
```java
            getClientResponseList.sort((lhs, rhs) -> {
                if (lhs.getHost().equals(rhs.getHost())) {
                    return lhs.getHost().compareTo(rhs.getHost());
                }
                return Integer.compare(rhs.getPort(), lhs.getPort());
            });

            String result = JsonUtils.toJSONString(getClientResponseList);
            httpExchange.sendResponseHeaders(200, Objects.requireNonNull(result).getBytes(Constants.DEFAULT_CHARSET).length);
            out.write(result.getBytes(Constants.DEFAULT_CHARSET));
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/GrpcClientHandler.java`
#### Snippet
```java
        switch (HttpMethod.valueOf(httpExchange.getRequestMethod())) {
            case OPTIONS:
                preflight(httpExchange);
                break;
            case GET:
                list(httpExchange);
                break;
            case DELETE:
                delete(httpExchange);
                break;
            default:
                break;
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/TCPClientHandler.java`
#### Snippet
```java
        } catch (Exception e) {
            StringWriter writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            e.printStackTrace(printWriter);
            printWriter.flush();
            String stackTrace = writer.toString();

            Error error = new Error(e.toString(), stackTrace);
            String result = JsonUtils.toJSONString(error);
            httpExchange.sendResponseHeaders(500, Objects.requireNonNull(result).getBytes(Constants.DEFAULT_CHARSET).length);
            log.error(result, e);
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
            final HttpPostRequestDecoder decoder = new HttpPostRequestDecoder(DEFAULT_HTTP_DATA_FACTORY, httpRequest);
            for (final InterfaceHttpData parm : decoder.getBodyHttpDatas()) {
                if (InterfaceHttpData.HttpDataType.Attribute == parm.getHttpDataType()) {
                    final Attribute data = (Attribute) parm;
                    httpRequestBody.put(data.getName(), data.getValue());
                }
            }
            decoder.destroy();
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
                        processor.processRequest(ctx, asyncContext);
                        if (!asyncContext.isComplete()) {
                            return;
                        }

                        metrics.getSummaryMetrics()
                            .recordHTTPReqResTimeCost(System.currentTimeMillis() - requestWrapper.getReqTime());

                        if (log.isDebugEnabled()) {
                            log.debug("{}", asyncContext.getResponse());
                        }

                        sendResponse(ctx, asyncContext.getResponse().httpResponse());
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumer/SubscriptionManager.java`
#### Snippet
```java
                client.setEnv(clientInfo.getEnv());
                client.setIdc(clientInfo.getIdc());
                client.setSys(clientInfo.getSys());
                client.setIp(clientInfo.getIp());
                client.setPid(clientInfo.getPid());
                client.setConsumerGroup(consumerGroup);
                client.setTopic(subscription.getTopic());
                client.setUrl(url);
                client.setLastUpTime(new Date());
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/AbstractPublishBatchCloudEventProcessor.java`
#### Snippet
```java
        try {
            if (eventMeshGrpcServer.getEventMeshGrpcConfiguration().isEventMeshServerSecurityEnable()) {
                String remoteAdd = EventMeshCloudEventUtils.getIp(cloudEvent);
                String user = EventMeshCloudEventUtils.getUserName(cloudEvent);
                String pass = EventMeshCloudEventUtils.getPassword(cloudEvent);
                String subsystem = EventMeshCloudEventUtils.getSys(cloudEvent);
                String topic = EventMeshCloudEventUtils.getSubject(cloudEvent);
                this.acl.doAclCheckInHttpSend(remoteAdd, user, pass, subsystem, topic, RequestCode.MSG_SEND_ASYNC.getRequestCode());
            }
        } catch (AclException e) {
            aclLogger.warn("Client has no permission,AbstructPublishCloudEventProcessor send failed", e);
            return StatusCode.EVENTMESH_ACL_ERR;
        }
        return StatusCode.SUCCESS;
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/HeartbeatProcessor.java`
#### Snippet
```java
        ConsumerManager consumerManager = eventMeshGrpcServer.getConsumerManager();

        String consumerGroup = EventMeshCloudEventUtils.getConsumerGroup(heartbeat);
        final String env = EventMeshCloudEventUtils.getEnv(heartbeat);
        final String idc = EventMeshCloudEventUtils.getIdc(heartbeat);
        final String sys = EventMeshCloudEventUtils.getSys(heartbeat);
        final String ip = EventMeshCloudEventUtils.getIp(heartbeat);
        final String pid = EventMeshCloudEventUtils.getPid(heartbeat);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/PublishCloudEventsProcessor.java`
#### Snippet
```java
        String protocolType = EventMeshCloudEventUtils.getProtocolType(message);
        ProtocolAdaptor<ProtocolTransportObject> grpcCommandProtocolAdaptor = ProtocolPluginFactory.getProtocolAdaptor(protocolType);
        io.cloudevents.CloudEvent cloudEvent = grpcCommandProtocolAdaptor.toCloudEvent(new EventMeshCloudEventWrapper(message));

        String seqNum = EventMeshCloudEventUtils.getSeqNum(message);
        String uniqueId = EventMeshCloudEventUtils.getUniqueId(message);
        String topic = EventMeshCloudEventUtils.getSubject(message);
        String producerGroup = EventMeshCloudEventUtils.getProducerGroup(message);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/SubscribeProcessor.java`
#### Snippet
```java
        List<SubscriptionItem> subscriptionItems = JsonUtils.parseTypeReferenceObject(subscription.getTextData(),
            new TypeReference<List<SubscriptionItem>>() {
            });
        final String env = EventMeshCloudEventUtils.getEnv(subscription);
        final String idc = EventMeshCloudEventUtils.getIdc(subscription);
        final String sys = EventMeshCloudEventUtils.getSys(subscription);
        final String ip = EventMeshCloudEventUtils.getIp(subscription);
        final String pid = EventMeshCloudEventUtils.getPid(subscription);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/ProducerManager.java`
#### Snippet
```java
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
                if (!producerTable.containsKey(producerGroup)) {
                    ProducerGroupConf producerGroupConfig = new ProducerGroupConf(producerGroup);
                    eventMeshProducer = createEventMeshProducer(producerGroupConfig);
                    eventMeshProducer.start();
                }
            }
        }

        eventMeshProducer = producerTable.get(producerGroup);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/StreamPushRequest.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(emitterList)) {
            if (subscriptionMode == SubscriptionMode.CLUSTERING) {
                return Collections.singletonList(emitterList.get((startIdx + retryTimes) % emitterList.size()));
            } else if (subscriptionMode == SubscriptionMode.BROADCASTING) {
                return emitterList;
            } else {
                log.error("Invalid Subscription Mode, no message returning back to subscriber.");
                return Collections.emptyList();
            }
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/WebhookPushRequest.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(localIdcUrl)) {
            if (subscriptionMode == SubscriptionMode.CLUSTERING) {
                return Collections.singletonList(localIdcUrl.get((startIdx + retryTimes) % localIdcUrl.size()));
            } else if (subscriptionMode == SubscriptionMode.BROADCASTING) {
                return localIdcUrl;
            } else {
                MESSAGE_LOGGER.error("Invalid Subscription Mode, no message returning back to subscriber.");
                return Collections.emptyList();
            }
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
ConsumerGroupTopicConf currentTopicConfig = MapUtils.getObject(consumerGroupConf.getConsumerGroupTopicConf(),
                    topic, null);
                EventMeshAsyncConsumeContext eventMeshAsyncConsumeContext = (EventMeshAsyncConsumeContext) context;

                if (currentTopicConfig == null) {
                    log.error("no topicConfig found, consumerGroup:{} topic:{}",
                        consumerGroupConf.getConsumerGroup(), topic);
                    try {
                        sendMessageBack(event, uniqueId, bizSeqNo);
                        eventMeshAsyncConsumeContext.commit(EventMeshAction.CommitMessage);
                        return;
                    } catch (Exception ex) {
                        //ignore
                    }
                }

                SubscriptionItem subscriptionItem =
                    consumerGroupConf.getConsumerGroupTopicConf().get(topic).getSubscriptionItem();
                HandleMsgContext handleMsgContext = new HandleMsgContext(
                    EventMeshUtil.buildPushMsgSeqNo(),
                    consumerGroupConf.getConsumerGroup(),
                    EventMeshConsumer.this,
                    topic, event, subscriptionItem, eventMeshAsyncConsumeContext.getAbstractContext(),
                    consumerGroupConf, eventMeshHTTPServer, bizSeqNo, uniqueId, currentTopicConfig);

                if (httpMessageHandler.handle(handleMsgContext)) {
                    eventMeshAsyncConsumeContext.commit(EventMeshAction.ManualAck);
                } else {
                    try {
                        sendMessageBack(event, uniqueId, bizSeqNo);
                    } catch (Exception e) {
                        //ignore
                    }
                    eventMeshAsyncConsumeContext.commit(EventMeshAction.CommitMessage);
                }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
            final ConsumerGroupTopicConf consumeTopicConfig = new ConsumerGroupTopicConf();
            consumeTopicConfig.setConsumerGroup(consumerGroup);
            consumeTopicConfig.setTopic(subTopic.getTopic());
            consumeTopicConfig.setSubscriptionItem(subTopic);
            consumeTopicConfig.setUrls(new HashSet<>(Collections.singletonList(url)));
            final Map<String, List<String>> idcUrls = new HashMap<>();
            final List<String> urls = new ArrayList<String>();
            urls.add(url);
            idcUrls.put(clientIdc, urls);
            consumeTopicConfig.setIdcUrls(idcUrls);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
            final Client client = new Client();
            client.setEnv(subscribeRequestHeader.getEnv());
            client.setIdc(subscribeRequestHeader.getIdc());
            client.setSys(subscribeRequestHeader.getSys());
            client.setIp(subscribeRequestHeader.getIp());
            client.setPid(subscribeRequestHeader.getPid());
            client.setConsumerGroup(consumerGroup);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
            final String groupTopicKey = client.getConsumerGroup() + "@" + client.getTopic();
            List<Client> localClients = localClientInfoMapping.computeIfAbsent(
                    groupTopicKey, key -> Collections.unmodifiableList(new ArrayList<Client>() {
                        private static final long serialVersionUID = -529919988844134656L;
                        {
                            add(client);
                        }
                    }));
            localClients.stream().filter(o -> StringUtils.equals(o.getUrl(), client.getUrl())).findFirst()
                .ifPresent(o -> o.setLastUpTime(client.getLastUpTime()));
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
            List<Client> localClients = localClientInfoMapping.computeIfAbsent(
                                    groupTopicKey, key -> Collections.unmodifiableList(new ArrayList<Client>() {
                                        private static final long serialVersionUID = -529919988844134656L;
                                        {
                                            add(client);
                                        }
                                    }));
            localClients.stream().filter(o -> StringUtils.equals(o.getUrl(), client.getUrl())).findFirst()
                .ifPresent(o -> o.setLastUpTime(client.getLastUpTime()));
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HeartBeatProcessor.java`
#### Snippet
```java
            final CompleteHandler<HttpCommand> handler = httpCommand -> {
                try {
                    if (log.isDebugEnabled()) {
                        log.debug("{}", httpCommand);
                    }
                    eventMeshHTTPServer.sendResponse(ctx, httpCommand.httpResponse());
                    summaryMetrics.recordHTTPReqResTimeCost(
                        System.currentTimeMillis() - request.getReqTime());
                } catch (Exception ex) {
                    //ignore
                }
            };
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HeartBeatProcessor.java`
#### Snippet
```java
            boolean isContains = false;
            for (final Client localClient : localClientList) {
                if (StringUtils.equals(localClient.getUrl(), tmpClient.getUrl())) {
                    isContains = true;
                    localClient.setLastUpTime(tmpClient.getLastUpTime());
                    break;
                }
            }
            if (!isContains) {
                localClientList.add(tmpClient);
            }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalSubscribeEventProcessor.java`
#### Snippet
```java
        if (log.isInfoEnabled()) {
            log.info("uri={}|{}|client2eventMesh|from={}|to={}", requestWrapper.getRequestURI(),
                EventMeshConstants.PROTOCOL_HTTP, remoteAddr, localAddress);
        }

        // user request header
        requestWrapper.getHeaderMap().put(ProtocolKey.ClientInstanceKey.IP, remoteAddr);
        // build sys header
        requestWrapper.buildSysHeaderForClient();

        final Map<String, Object> responseHeaderMap = builderResponseHeaderMap(requestWrapper);
        final Map<String, Object> sysHeaderMap = requestWrapper.getSysHeaderMap();
        final Map<String, Object> responseBodyMap = new HashMap<>();

        //validate header
        if (validateSysHeader(sysHeaderMap)) {
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_PROTOCOL_HEADER_ERR, responseHeaderMap,
                responseBodyMap, null);
            return;
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalSubscribeEventProcessor.java`
#### Snippet
```java
        clientInfo.setEnv(requestHeaderMap.get(ProtocolKey.ClientInstanceKey.ENV).toString());
        clientInfo.setIdc(requestHeaderMap.get(ProtocolKey.ClientInstanceKey.IDC).toString());
        clientInfo.setSys(requestHeaderMap.get(ProtocolKey.ClientInstanceKey.SYS).toString());
        clientInfo.setIp(requestHeaderMap.get(ProtocolKey.ClientInstanceKey.IP).toString());
        clientInfo.setPid(requestHeaderMap.get(ProtocolKey.ClientInstanceKey.PID).toString());
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                final Iterator<Client> clientIterator = groupTopicClients.iterator();
                while (clientIterator.hasNext()) {
                    final Client client = clientIterator.next();
                    if (StringUtils.equals(client.getPid(), pid)
                        && StringUtils.equals(client.getUrl(), unSubscribeUrl)) {
                        if (log.isWarnEnabled()) {
                            log.warn("client {} start unsubscribe", JsonUtils.toJSONString(client));
                        }
                        clientIterator.remove();
                    }
                }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                        final Map<String, ConsumerGroupTopicConf> map =
                            consumerGroupConf.getConsumerGroupTopicConf();
                        for (final Map.Entry<String, ConsumerGroupTopicConf> entry : map.entrySet()) {
                            // only modify the topic to subscribe
                            if (StringUtils.equals(unSubTopic, entry.getKey())) {
                                final ConsumerGroupTopicConf latestTopicConf = new ConsumerGroupTopicConf();
                                latestTopicConf.setConsumerGroup(consumerGroup);
                                latestTopicConf.setTopic(unSubTopic);
                                latestTopicConf.setSubscriptionItem(entry.getValue().getSubscriptionItem());
                                latestTopicConf.setUrls(clientUrls);
                                latestTopicConf.setIdcUrls(idcUrls);
                                map.put(unSubTopic, latestTopicConf);
                            }
                        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/RemoteSubscribeEventProcessor.java`
#### Snippet
```java
AsyncContext<HttpEventWrapper> asyncContext = handlerSpecific.getAsyncContext();

        ChannelHandlerContext ctx = handlerSpecific.getCtx();

        HttpEventWrapper requestWrapper = asyncContext.getRequest();
        String localAddress = IPUtils.getLocalAddress();
        String remoteAddr = RemotingHelper.parseChannelRemoteAddr(ctx.channel());
        httpLogger.info("uri={}|{}|client2eventMesh|from={}|to={}", requestWrapper.getRequestURI(),
            EventMeshConstants.PROTOCOL_HTTP, remoteAddr, localAddress
        );

        // user request header
        Map<String, Object> userRequestHeaderMap = requestWrapper.getHeaderMap();
        userRequestHeaderMap.put(ProtocolKey.ClientInstanceKey.IP, remoteAddr);

        // build sys header
        requestWrapper.buildSysHeaderForClient();

        Map<String, Object> responseHeaderMap = builderResponseHeaderMap(requestWrapper);

        Map<String, Object> sysHeaderMap = requestWrapper.getSysHeaderMap();

        Map<String, Object> responseBodyMap = new HashMap<>();

        //validate header
        if (validateSysHeader(sysHeaderMap)) {
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_PROTOCOL_HEADER_ERR, responseHeaderMap,
                responseBodyMap, null);
            return;
        }

        //validate body
        byte[] requestBody = requestWrapper.getBody();

        Map<String, Object> requestBodyMap = Optional.ofNullable(JsonUtils.parseTypeReferenceObject(
            new String(requestBody, Constants.DEFAULT_CHARSET),
            new TypeReference<HashMap<String, Object>>() {
            }
        )).orElseGet(Maps::newHashMap);

        if (validatedRequestBodyMap(requestBodyMap)) {
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_PROTOCOL_BODY_ERR, responseHeaderMap,
                responseBodyMap, null);
            return;
        }

        String url = requestBodyMap.get(EventMeshConstants.URL).toString();
        String consumerGroup = requestBodyMap.get(EventMeshConstants.CONSUMER_GROUP).toString();
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/RemoteSubscribeEventProcessor.java`
#### Snippet
```java
            String remoteResult = post(closeableHttpClient, targetMesh, builderRemoteHeaderMap(localAddress), remoteBodyMap,
                response -> EntityUtils.toString(response.getEntity(), Constants.DEFAULT_CHARSET));

            Map<String, String> remoteResultMap = Optional.ofNullable(JsonUtils.parseTypeReferenceObject(
                remoteResult,
                new TypeReference<Map<String, String>>() {
                }
            )).orElseGet(Maps::newHashMap);
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncEventProcessor.java`
#### Snippet
```java
        final AsyncContext<HttpEventWrapper> asyncContext = handlerSpecific.getAsyncContext();
        final ChannelHandlerContext ctx = handlerSpecific.getCtx();
        final HttpEventWrapper requestWrapper = asyncContext.getRequest();

        final String localAddress = IPUtils.getLocalAddress();

        if (log.isInfoEnabled()) {
            log.info("uri={}|{}|client2eventMesh|from={}|to={}", requestWrapper.getRequestURI(),
                EventMeshConstants.PROTOCOL_HTTP, RemotingHelper.parseChannelRemoteAddr(ctx.channel()), localAddress);
        }

        // user request header
        final Map<String, Object> requestHeaderMap = requestWrapper.getHeaderMap();
        final String source = RemotingHelper.parseChannelRemoteAddr(ctx.channel());
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncEventProcessor.java`
#### Snippet
```java
        final String bizNo = requestHeaderMap.getOrDefault(ProtocolKey.ClientInstanceKey.BIZSEQNO,
            RandomStringUtils.generateNum(30)).toString();
        final String uniqueId = requestHeaderMap.getOrDefault(ProtocolKey.ClientInstanceKey.UNIQUEID,
            RandomStringUtils.generateNum(30)).toString();
        final String ttl = requestHeaderMap.getOrDefault(Constants.EVENTMESH_MESSAGE_CONST_TTL,
            4 * 1000).toString();

        requestWrapper.getSysHeaderMap().putIfAbsent(ProtocolKey.ClientInstanceKey.BIZSEQNO, bizNo);
        requestWrapper.getSysHeaderMap().putIfAbsent(ProtocolKey.ClientInstanceKey.UNIQUEID, uniqueId);
        requestWrapper.getSysHeaderMap().putIfAbsent(Constants.EVENTMESH_MESSAGE_CONST_TTL, ttl);

        final Map<String, Object> responseHeaderMap = new HashMap<>();
        responseHeaderMap.put(ProtocolKey.REQUEST_URI, requestWrapper.getRequestURI());
        responseHeaderMap.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHCLUSTER,
            eventMeshHTTPServer.getEventMeshHttpConfiguration().getEventMeshCluster());
        responseHeaderMap.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHIP,
            localAddress);
        responseHeaderMap.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHENV,
            eventMeshHTTPServer.getEventMeshHttpConfiguration().getEventMeshEnv());
        responseHeaderMap.put(ProtocolKey.EventMeshInstanceKey.EVENTMESHIDC,
            eventMeshHTTPServer.getEventMeshHttpConfiguration().getEventMeshIDC());

        final Map<String, Object> responseBodyMap = new HashMap<>();
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncEventProcessor.java`
#### Snippet
```java
        try {
            event = CloudEventBuilder.from(event)
                .withExtension(EventMeshConstants.MSG_TYPE, EventMeshConstants.PERSISTENT)
                .withExtension(EventMeshConstants.REQ_C2EVENTMESH_TIMESTAMP, String.valueOf(System.currentTimeMillis()))
                .withExtension(EventMeshConstants.REQ_EVENTMESH2MQ_TIMESTAMP, String.valueOf(System.currentTimeMillis()))
                .build();

            if (log.isDebugEnabled()) {
                log.debug("msg2MQMsg suc, bizSeqNo={}, topic={}", bizNo, topic);
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error("msg2MQMsg err, bizSeqNo={}, topic={}", bizNo, topic, e);
            }
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_PACKAGE_MSG_ERR, responseHeaderMap,
                responseBodyMap, EventMeshUtil.getCloudEventExtensionMap(SpecVersion.V1.toString(), event));
            return;
        }

        final SendMessageContext sendMessageContext = new SendMessageContext(bizNo, event, eventMeshProducer,
            eventMeshHTTPServer);
        eventMeshHTTPServer.getMetrics().getSummaryMetrics().recordSendMsg();

        final long startTime = System.currentTimeMillis();
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncEventProcessor.java`
#### Snippet
```java
event = CloudEventBuilder.from(sendMessageContext.getEvent())
                .withExtension(EventMeshConstants.REQ_EVENTMESH2MQ_TIMESTAMP, String.valueOf(System.currentTimeMillis()))
                .build();
            handlerSpecific.getTraceOperation().createClientTraceOperation(EventMeshUtil.getCloudEventExtensionMap(SpecVersion.V1.toString(), event),
                EventMeshTraceConstants.TRACE_UPSTREAM_EVENTMESH_CLIENT_SPAN, false);

            eventMeshProducer.send(sendMessageContext, new SendCallback() {

                @Override
                public void onSuccess(final SendResult sendResult) {
                    responseBodyMap.put(EventMeshConstants.RET_CODE, EventMeshRetCode.SUCCESS.getRetCode());
                    responseBodyMap.put(EventMeshConstants.RET_MSG, EventMeshRetCode.SUCCESS.getErrMsg() + sendResult);

                    if (log.isInfoEnabled()) {
                        log.info("message|eventMesh2mq|REQ|ASYNC|send2MQCost={}ms|topic={}|bizSeqNo={}|uniqueId={}",
                            System.currentTimeMillis() - startTime, topic, bizNo, uniqueId);
                    }
                    handlerSpecific.getTraceOperation().endLatestTrace(sendMessageContext.getEvent());
                    handlerSpecific.sendResponse(responseHeaderMap, responseBodyMap);
                }

                @Override
                public void onException(final OnExceptionContext context) {
                    responseBodyMap.put(EventMeshConstants.RET_CODE, EventMeshRetCode.EVENTMESH_SEND_ASYNC_MSG_ERR.getRetCode());
                    responseBodyMap.put(EventMeshConstants.RET_MSG, EventMeshRetCode.EVENTMESH_SEND_ASYNC_MSG_ERR.getErrMsg()
                        + EventMeshUtil.stackTrace(context.getException(), 2));
                    eventMeshHTTPServer.getHttpRetryer().pushRetry(sendMessageContext.delay(10_000));
                    handlerSpecific.getTraceOperation().exceptionLatestTrace(context.getException(),
                        EventMeshUtil.getCloudEventExtensionMap(SpecVersion.V1.toString(), sendMessageContext.getEvent()));

                    handlerSpecific.sendResponse(responseHeaderMap, responseBodyMap);
                    if (log.isErrorEnabled()) {
                        log.error("message|eventMesh2mq|REQ|ASYNC|send2MQCost={}ms|topic={}|bizSeqNo={}|uniqueId={}",
                            System.currentTimeMillis() - startTime, topic, bizNo, uniqueId, context.getException());
                    }
                }
            });
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
        Map<String, Map<String, Integer>> result = null;

        if (!clientGroupMap.isEmpty()) {
            result = new HashMap<>();
            for (Map.Entry<String, ClientGroupWrapper> entry : clientGroupMap.entrySet()) {
                Map<String, Integer> map = new HashMap<>();
                map.put(EventMeshConstants.PURPOSE_SUB, entry.getValue().getGroupConsumerSessions().size());
                map.put(EventMeshConstants.PURPOSE_PUB, entry.getValue().getGroupProducerSessions().size());
                result.put(entry.getKey(), map);
            }
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java
        switch (cmd) {
            case REQUEST_TO_SERVER:
                return Command.RESPONSE_TO_CLIENT;
            case ASYNC_MESSAGE_TO_SERVER:
                return Command.ASYNC_MESSAGE_TO_SERVER_ACK;
            case BROADCAST_MESSAGE_TO_SERVER:
                return Command.BROADCAST_MESSAGE_TO_SERVER_ACK;
            default:
                return cmd;
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/util/HttpUtils.java`
#### Snippet
```java
        final RequestConfig.Builder configBuilder = RequestConfig.custom();
        configBuilder.setSocketTimeout(Integer.parseInt(String.valueOf(requestParam.getTimeout())))
            .setConnectTimeout(Integer.parseInt(String.valueOf(requestParam.getTimeout())))
            .setConnectionRequestTimeout(Integer.parseInt(String.valueOf(requestParam.getTimeout())));

        if (forwardAgent != null) {
            configBuilder.setProxy(forwardAgent);
        }

        httpPost.setConfig(configBuilder.build());

        if (log.isDebugEnabled()) {
            log.debug("{}", httpPost);
        }

        return client.execute(httpPost, responseHandler);
```

### DuplicatedCode
Duplicated code
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
        try {
            Package msg = MessageUtils.buildPackage(cloudEvent, Command.BROADCAST_MESSAGE_TO_SERVER);
            log.info("{}|publish|send|type={}|protocol={}|msg={}", CLIENTNO, msg.getHeader().getCmd(),
                msg.getHeader().getProperty(Constants.PROTOCOL_TYPE), msg);
            super.send(msg);
        } catch (Exception ex) {
            throw new EventMeshException("Broadcast message error", ex);
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPSubClient.java`
#### Snippet
```java
        try {
            super.reconnect();
            hello();
            if (!CollectionUtils.isEmpty(subscriptionItems)) {
                synchronized (subscriptionItems) {
                    for (SubscriptionItem item : subscriptionItems) {
                        Package request = MessageUtils.subscribe(item.getTopic(), item.getMode(), item.getType());
                        this.io(request, EventMeshCommon.DEFAULT_TIME_OUT_MILLS);
                    }
                }
            }
            listen();
        } catch (Exception ex) {
            //
        }
```

### DuplicatedCode
Duplicated code
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
String publicKeyUrl = null;
            token = token.replace("Bearer ", "");
            for (String key : ConfigurationContextUtil.KEYS) {
                CommonConfiguration commonConfiguration = ConfigurationContextUtil.get(key);
                if (null == commonConfiguration) {
                    continue;
                }
                if (StringUtils.isBlank(commonConfiguration.getEventMeshSecurityPublickey())) {
                    throw new AclException("publicKeyUrl cannot be null");
                }
                publicKeyUrl = commonConfiguration.getEventMeshSecurityPublickey();
            }
            byte[] validationKeyBytes = new byte[0];
            try {
                validationKeyBytes = Files.readAllBytes(Paths.get(publicKeyUrl));
                X509EncodedKeySpec spec = new X509EncodedKeySpec(validationKeyBytes);
                KeyFactory kf = KeyFactory.getInstance("RSA");
                Key validationKey = kf.generatePublic(spec);
                JwtParser signedParser = Jwts.parserBuilder().setSigningKey(validationKey).build();
                Jwt<?, Claims> signJwt = signedParser.parseClaimsJws(token);
                String sub = signJwt.getBody().get("sub", String.class);
                if (!sub.contains(aclProperties.getExtendedField("group").toString()) && !sub.contains("pulsar-admin")) {
                    throw new AclException("group:" + aclProperties.getExtendedField("group ") + " has no auth to access eventMesh:"
                        + aclProperties.getTopic());
                }
            } catch (IOException e) {
                throw new AclException("public key read error!", e);
            } catch (NoSuchAlgorithmException e) {
                throw new AclException("no such RSA algorithm!", e);
            } catch (InvalidKeySpecException e) {
                throw new AclException("invalid public key spec!", e);
            } catch (JwtException e) {
                throw new AclException("invalid token!", e);
            }
```

### DuplicatedCode
Duplicated code
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java
            final Properties contextProperties = new Properties();
            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS, EventMeshConsumeConcurrentlyStatus.RECONSUME_LATER.name());

            EventMeshAsyncConsumeContext eventMeshAsyncConsumeContext = new EventMeshAsyncConsumeContext() {
                @Override
                public void commit(EventMeshAction action) {
                    switch (action) {
                        case CommitMessage:
                            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                                    EventMeshConsumeConcurrentlyStatus.CONSUME_SUCCESS.name());
                            break;
                        case ReconsumeLater:
                            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                                    EventMeshConsumeConcurrentlyStatus.RECONSUME_LATER.name());
                            break;
                        case ManualAck:
                            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                                    EventMeshConsumeConcurrentlyStatus.CONSUME_FINISH.name());
                            break;
                        default:
                            break;
                    }
                }
            };
```

### DuplicatedCode
Duplicated code
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaEvent.java`
#### Snippet
```java
        builder.withData(data.getBytes(StandardCharsets.UTF_8))
            .withId(extensions.remove("id"))
            .withSource(URI.create(extensions.remove("source")))
            .withType(extensions.remove("type"))
            .withDataContentType(extensions.remove("datacontenttype"))
            .withSubject(extensions.remove("subject"));
        extensions.forEach(builder::withExtension);
        return builder.build();
```

### DuplicatedCode
Duplicated code
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
CloudEvent cloudEvent =
                RocketMQMessageFactory.createReader(CloudEventUtils.msgConvert(msg)).toEvent();

            CloudEventBuilder cloudEventBuilder = null;
            for (String sysPropKey : MessageConst.STRING_HASH_SET) {
                if (StringUtils.isNotEmpty(msg.getProperty(sysPropKey))) {
                    String prop = msg.getProperty(sysPropKey);
                    sysPropKey = sysPropKey.toLowerCase().replace("_", Constants.MESSAGE_PROP_SEPARATOR);
                    cloudEventBuilder = CloudEventBuilder.from(cloudEvent).withExtension(sysPropKey, prop);
                }
            }
            if (cloudEventBuilder != null) {
                cloudEvent = cloudEventBuilder.build();
            }

            if (eventListener == null) {
                throw new StorageRuntimeException(String.format("The topic/queue %s isn't attached to this consumer",
                    msg.getTopic()));
            }

            final Properties contextProperties = new Properties();
            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                EventMeshConsumeConcurrentlyStatus.RECONSUME_LATER.name());
            EventMeshAsyncConsumeContext eventMeshAsyncConsumeContext = new EventMeshAsyncConsumeContext() {
                @Override
                public void commit(EventMeshAction action) {
                    switch (action) {
                        case CommitMessage:
                            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                                EventMeshConsumeConcurrentlyStatus.CONSUME_SUCCESS.name());
                            break;
                        case ReconsumeLater:
                            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                                EventMeshConsumeConcurrentlyStatus.RECONSUME_LATER.name());
                            break;
                        case ManualAck:
                            contextProperties.put(NonStandardKeys.MESSAGE_CONSUME_STATUS,
                                EventMeshConsumeConcurrentlyStatus.CONSUME_FINISH.name());
                            break;
                        default:
                            break;
                    }
                }
            };

            eventMeshAsyncConsumeContext.setAbstractContext(context);

            eventListener.consume(cloudEvent, eventMeshAsyncConsumeContext);

            return EventMeshConsumeConcurrentlyStatus.valueOf(
                contextProperties.getProperty(NonStandardKeys.MESSAGE_CONSUME_STATUS));
```

### DuplicatedCode
Duplicated code
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
                for (String sysPropKey : MessageConst.STRING_HASH_SET) {
                    if (StringUtils.isNotEmpty(message.getProperty(sysPropKey))) {
                        String prop = message.getProperty(sysPropKey);
                        String tmpPropKey = sysPropKey.toLowerCase().replace("_", Constants.MESSAGE_PROP_SEPARATOR);
                        MessageAccessor.putProperty(message, tmpPropKey, prop);
                        message.getProperties().remove(sysPropKey);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
            @Override
            public void onException(Throwable e) {
                String topic = message.getTopic();
                StorageRuntimeException onsEx = ProducerImpl.this.checkProducerException(topic, null, e);
                OnExceptionContext context = new OnExceptionContext();
                context.setTopic(topic);
                context.setException(onsEx);
                rrCallback.onException(e);

            }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
        }
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream(file), cs))) {
            properties.load(reader);
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/FileLoad.java`
#### Snippet
```java
        public <T> T getConfig(ConfigInfo configInfo) throws IOException {
            Yaml yaml = new Yaml();
            return (T) yaml.loadAs(new BufferedInputStream(new FileInputStream(configInfo.getFilePath())), configInfo.getClazz());
        }
    }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
        }
        Set<SubscriptionItem> subscriptionItemSet = new HashSet<>();
        subscriptionItemSet.addAll(subscriptionItems);

        final Map<String, CloudEventAttributeValue> attributeValueMap = buildCommonCloudEventAttributes(clientConfig, protocolType);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java

        final List<String> preferList = new ArrayList<>();
        preferList.addAll(Arrays.asList(priority.split("<")));

        NetworkInterface preferNetworkInterface = null;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
        if (client.getGrpcType() != grpcType) {
            log.warn("Invalid grpc type: {}, expecting grpc type: {}, can not register client {}",
                client.getGrpcType(), grpcType, client.toString());
            return;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientByIpPortHandler.java`
#### Snippet
```java
                        "destEventMeshIp=%s destEventMeshPort=%s}, result {%s}, errorMsg : %s",
                    sessionMap.size(), ip, port, destEventMeshIp, destEventMeshPort,
                    redirectResult.toString(), e
                        .getMessage());
                NetUtils.sendSuccessResponseHeaders(httpExchange);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RedirectClientByIpPortHandler.java`
#### Snippet
```java
                    "destEventMeshIp=%s destEventMeshPort=%s}, result {%s} ",
                sessionMap.size(), ip, port, destEventMeshIp, destEventMeshPort,
                redirectResult.toString());
            NetUtils.sendSuccessResponseHeaders(httpExchange);
            out.write(result.getBytes(Constants.DEFAULT_CHARSET));
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '('
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
    public void compile() {
        acquireParamNames();
        String parsedPattern = urlMappingPattern.replaceFirst(URL_FORMAT_REGEX, URL_FORMAT_MATCH_REGEX);
        parsedPattern = parsedPattern.replaceAll(URL_PARAMETER_REGEX, URL_PARAMETER_MATCH_REGEX);
        this.compiledUrlMappingPattern = Pattern.compile(parsedPattern + URL_QUERY_STRING_REGEX);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '('
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
        acquireParamNames();
        String parsedPattern = urlMappingPattern.replaceFirst(URL_FORMAT_REGEX, URL_FORMAT_MATCH_REGEX);
        parsedPattern = parsedPattern.replaceAll(URL_PARAMETER_REGEX, URL_PARAMETER_MATCH_REGEX);
        this.compiledUrlMappingPattern = Pattern.compile(parsedPattern + URL_QUERY_STRING_REGEX);
    }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'List' may not contain objects of type 'String'
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java
        try {
            // Unsubscribe topic:
            topicList.remove(topic);
        } catch (Exception e) {
            LOG.error("unsubscribe topic error", e);
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `HttpConnectionHandler` may be 'static'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java

    @Sharable
    private class HttpConnectionHandler extends ChannelDuplexHandler {

        public final transient AtomicInteger connections = new AtomicInteger(0);
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
                throw new IllegalArgumentException("message size is exceed limit!");
            }
            /**
             * Header + Body, Format:
             * <pre>
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumer/SubscriptionManager.java`
#### Snippet
```java
public class SubscriptionManager {

    private final ConcurrentHashMap<String /**group*/, ConsumerGroupConf> localConsumerGroupMapping = new ConcurrentHashMap<>(64);

    private final ConcurrentHashMap<String /**group@topic*/, List<Client>> localClientInfoMapping = new ConcurrentHashMap<>(64);
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumer/SubscriptionManager.java`
#### Snippet
```java
    private final ConcurrentHashMap<String /**group*/, ConsumerGroupConf> localConsumerGroupMapping = new ConcurrentHashMap<>(64);

    private final ConcurrentHashMap<String /**group@topic*/, List<Client>> localClientInfoMapping = new ConcurrentHashMap<>(64);

    public ConcurrentHashMap<String, ConsumerGroupConf> getLocalConsumerGroupMapping() {
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/PushContext.java`
#### Snippet
```java
    public AtomicLong deliverFailMsgsCount = new AtomicLong(0);

    private ConcurrentHashMap<String /** seq */, DownStreamMsgContext> unAckMsg = new ConcurrentHashMap<String, DownStreamMsgContext>();

    private long createTime = System.currentTimeMillis();
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
     */
    private void handleUnackMsgsInSession(Session session) {
        ConcurrentHashMap<String /** seq */, DownStreamMsgContext> unAckMsg = session.getPusher().getUnAckMsg();
        ClientGroupWrapper clientGroupWrapper = Objects.requireNonNull(session.getClientGroupWrapper().get());
        if (unAckMsg.size() > 0 && !clientGroupWrapper.getGroupConsumerSessions().isEmpty()) {
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
        new ConcurrentHashMap<String, ClientGroupWrapper>();

    private final ConcurrentHashMap<String /** subsystem eg . 5109 or 5109-1A0 */, Object> lockMap =
        new ConcurrentHashMap<String, Object>();

```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
    private final ConcurrentHashMap<InetSocketAddress, Session> sessionTable = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<String /** subsystem eg . 5109 or 5109-1A0 */, ClientGroupWrapper> clientGroupMap =
        new ConcurrentHashMap<String, ClientGroupWrapper>();

```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AbstractHTTPPushRequest.java`
#### Snippet
```java
    public long lastPushTime = System.currentTimeMillis();

    public final Map<String /** IDC*/, List<String>> urls;

    public final List<String> totalUrls;
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
    private EventMeshHTTPServer eventMeshHTTPServer;

    private ConcurrentHashMap<String /** groupName*/, EventMeshProducer> producerTable = new ConcurrentHashMap<String, EventMeshProducer>();

    public ProducerManager(EventMeshHTTPServer eventMeshHTTPServer) {
```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
public final class HttpClientGroupMapping {

    private final transient Map<String /**group*/, ConsumerGroupConf> localConsumerGroupMapping =
        new ConcurrentHashMap<>();

```

### DanglingJavadoc
Dangling Javadoc comment
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java
        new ConcurrentHashMap<>();

    private final transient Map<String /**group@topic*/, List<Client>> localClientInfoMapping =
        new ConcurrentHashMap<>();

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
    if (!getEventsList()
        .equals(other.getEventsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }
```

### TrivialIf
`if` statement can be simplified
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }
```

### TrivialIf
`if` statement can be simplified
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcpMessageDispatcher.java`
#### Snippet
```java

    private boolean isNeedTrace(Command cmd) {
        if (eventMeshTCPServer.getEventMeshTCPConfiguration().isEventMeshServerTraceEnable()
            && cmd != null && (Command.REQUEST_TO_SERVER == cmd
            || Command.ASYNC_MESSAGE_TO_SERVER == cmd
```

### TrivialIf
`if` statement can be simplified
in `eventmesh-security-plugin/eventmesh-security-auth-token/src/main/java/org/apache/eventmesh/auth/token/impl/auth/AuthTokenUtils.java`
#### Snippet
```java
        Set<String> groupTopics = (Set<String>) aclProperties.getExtendedField("topics");

        if (groupTopics.contains(topic)) {
            return true;
        } else {
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `sender`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
#### Snippet
```java
    private void senderOnComplete() {
        try {
            synchronized (sender) {
                sender.onCompleted();
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `sender`
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
#### Snippet
```java
    private void senderOnNext(final CloudEvent subscription) {
        try {
            synchronized (sender) {
                sender.onNext(subscription);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/ListenTask.java`
#### Snippet
```java
        session.setListenRequestSeq(pkg.getHeader().getSeq());
        try {
            synchronized (session) {
                eventMeshTCPServer.getClientSessionGroupMapping().readySession(session);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
        Package msg = new Package();
        try {
            synchronized (session) {
                ConcurrentHashMap<String, SubscriptionItem> subscribeTopics = session.getSessionContext().getSubscribeTopics();
                if (MapUtils.isNotEmpty(subscribeTopics)) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/SubscribeTask.java`
#### Snippet
```java
            });

            synchronized (session) {
                session.subscribe(subscriptionItems);
                if (log.isInfoEnabled()) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
            }

            synchronized (session) {
                long sendTime = System.currentTimeMillis();
                event = addTimestamp(event, cmd, sendTime);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `producerTable`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
                if (!producerTable.containsKey(producerGroup)) {
                    ProducerGroupConf producerGroupConfig = new ProducerGroupConf(producerGroup, token);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `producerTable`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
                if (!producerTable.containsKey(producerGroup)) {
                    ProducerGroupConf producerGroupConfig = new ProducerGroupConf(producerGroup);
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
Constants.DEFAULT_CHARSET can be used instead
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java
        }
        StringBuilder body = new StringBuilder(1024);
        try (InputStreamReader reader = new InputStreamReader(exchange.getRequestBody(), Constants.DEFAULT_CHARSET.name())) {
            char[] buffer = new char[256];
            int readIndex;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileLock' used without 'try'-with-resources statement
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8))) {
            // lock this file, and will auto release after fos close
            fos.getChannel().lock();
            bw.write(Objects.requireNonNull(JsonUtils.toJSONString(webHookConfig)));
        } catch (IOException e) {
```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/cloudevents/AsyncPublish.java`
#### Snippet
```java
                .build();
            final EventMeshTCPClient<CloudEvent> client =
                EventMeshTCPClientFactory.createEventMeshTCPClient(eventMeshTcpClientConfig, CloudEvent.class);
            client.init();

```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/sub/cloudevents/SyncResponse.java`
#### Snippet
```java
        try {
            final EventMeshTCPClient<CloudEvent> client = EventMeshTCPClientFactory
                .createEventMeshTCPClient(eventMeshTcpClientConfig, CloudEvent.class);
            client.init();

```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/sub/cloudevents/AsyncSubscribe.java`
#### Snippet
```java
            .build();
        try {
            final EventMeshTCPClient<CloudEvent> client = EventMeshTCPClientFactory.createEventMeshTCPClient(
                eventMeshTcpClientConfig, CloudEvent.class);
            client.init();
```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/sub/eventmeshmessage/AsyncSubscribe.java`
#### Snippet
```java
        try {
            final EventMeshTCPClient<EventMeshMessage> client =
                EventMeshTCPClientFactory.createEventMeshTCPClient(eventMeshTcpClientConfig, EventMeshMessage.class);
            client.init();

```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/eventmeshmessage/SyncRequest.java`
#### Snippet
```java
            .build();
        try {
            final EventMeshTCPClient<EventMeshMessage> client = EventMeshTCPClientFactory.createEventMeshTCPClient(
                eventMeshTcpClientConfig, EventMeshMessage.class);
            client.init();
```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/eventmeshmessage/AsyncPublishBroadcast.java`
#### Snippet
```java
            .userAgent(userAgent)
            .build();
        final EventMeshTCPClient<EventMeshMessage> client = EventMeshTCPClientFactory.createEventMeshTCPClient(
            eventMeshTcpClientConfig, EventMeshMessage.class);
        try {
```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/sub/eventmeshmessage/AsyncSubscribeBroadcast.java`
#### Snippet
```java

        try {
            final EventMeshTCPClient<EventMeshMessage> client = EventMeshTCPClientFactory.createEventMeshTCPClient(
                eventMeshTcpClientConfig, EventMeshMessage.class);

```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/eventmeshmessage/AsyncPublish.java`
#### Snippet
```java
                .build();
            final EventMeshTCPClient<EventMeshMessage> client =
                EventMeshTCPClientFactory.createEventMeshTCPClient(eventMeshTcpClientConfig, EventMeshMessage.class);
            client.init();

```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/cloudevents/SyncRequest.java`
#### Snippet
```java
        try {

            final EventMeshTCPClient<CloudEvent> client = EventMeshTCPClientFactory.createEventMeshTCPClient(
                eventMeshTcpClientConfig, CloudEvent.class);
            client.init();
```

### AutoCloseableResource
'EventMeshTCPClient' used without 'try'-with-resources statement
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/sub/eventmeshmessage/SyncResponse.java`
#### Snippet
```java
        try {
            final EventMeshTCPClient<EventMeshMessage> client = EventMeshTCPClientFactory
                .createEventMeshTCPClient(eventMeshTcpClientConfig, EventMeshMessage.class);
            client.init();

```

### AutoCloseableResource
'Producer' used without 'try'-with-resources statement
in `eventmesh-storage-plugin/eventmesh-storage-pulsar/src/main/java/org/apache/eventmesh/storage/pulsar/client/PulsarClientWrapper.java`
#### Snippet
```java
    public void publish(CloudEvent cloudEvent, SendCallback sendCallback) {
        String topic = config.getTopicPrefix() + cloudEvent.getSubject();
        Producer<byte[]> producer = producerMap.computeIfAbsent(topic, k -> createProducer(topic));
        try {
            byte[] serializedCloudEvent = Objects.requireNonNull(EventFormatProvider
```

### AutoCloseableResource
'Consumer' used without 'try'-with-resources statement
in `eventmesh-storage-plugin/eventmesh-storage-pulsar/src/main/java/org/apache/eventmesh/storage/pulsar/consumer/PulsarConsumerImpl.java`
#### Snippet
```java
            org.apache.pulsar.client.api.Consumer<byte[]> consumer = consumerMap.get(consumerKey);
            consumer.unsubscribe();
            consumerMap.remove(consumerKey);
        } catch (PulsarClientException ex) {
            throw new StorageRuntimeException(
```

### AutoCloseableResource
'EventStreamWriter' used without 'try'-with-resources statement
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
            log.debug("stream[{}] has already been created.", topic);
        }
        EventStreamWriter<byte[]> writer = writerMap.computeIfAbsent(topic, k -> createWrite(topic));
        PravegaCloudEventWriter cloudEventWriter = new PravegaCloudEventWriter(topic);
        PravegaEvent pravegaEvent = cloudEventWriter.writeBinary(cloudEvent);
```

### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientFactory.java`
#### Snippet
```java
            if (ttl < 1) {
                long leaseId = client.getLeaseClient().grant(EtcdConstant.TTL).get().getID();
                client.getLeaseClient().keepAlive(leaseId, etcdLeaseId.getEtcdStreamObserver());
                etcdLeaseId.setLeaseId(leaseId);
            }
```

### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientFactory.java`
#### Snippet
```java
        } catch (Throwable e) {
            log.error("renewal error, server url: {}", etcdLeaseId.getUrl(), e);
            client.getLeaseClient().keepAlive(System.currentTimeMillis(), etcdLeaseId.getEtcdStreamObserver());
        }
    }
```

### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientFactory.java`
#### Snippet
```java
            etcdStreamObserver.setEtcdLeaseId(etcdLeaseId);
            etcdLeaseId.setEtcdStreamObserver(etcdStreamObserver);
            client.getLeaseClient().keepAlive(leaseId, etcdStreamObserver);

            etcdLeaseIdMap.put(serverAddr, etcdLeaseId);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'cmd != null' covered by subsequent condition 'Command.REQUEST_TO_SERVER == cmd \|\| Command.ASYNC_MESSAGE_TO_SERVER == cmd \|\| Command.BROADCAST_MESS ...'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcpMessageDispatcher.java`
#### Snippet
```java
    private boolean isNeedTrace(Command cmd) {
        if (eventMeshTCPServer.getEventMeshTCPConfiguration().isEventMeshServerTraceEnable()
            && cmd != null && (Command.REQUEST_TO_SERVER == cmd
            || Command.ASYNC_MESSAGE_TO_SERVER == cmd
            || Command.BROADCAST_MESSAGE_TO_SERVER == cmd)) {
```

### ConditionCoveredByFurtherCondition
Condition 'modNum != 0' covered by subsequent conditions
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceImpl.java`
#### Snippet
```java
            rebalanceResult = 1;
        } else {
            rebalanceResult = (modNum != 0 && index < modNum && index >= 0) ? avgNum + 1 : avgNum;
        }
        log.info("rebalance caculateRedirectNum,group:{}, purpose:{},sum:{},avgNum:{},"
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
        // Regex for digit from 0 to 255.
        String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java

        String regex
            = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java

        String regex
            = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
        String regex
            = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255;
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
            = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255;

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `((Boolean)attr_)` to `boolean` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(
              1, (boolean)((Boolean) attr_));
      }
      if (attrCase_ == 2) {
```

### RedundantCast
Casting `((Integer)attr_)` to `int` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(
              2, (int)((Integer) attr_));
      }
      if (attrCase_ == 3) {
```

### RedundantCast
Casting `((Boolean)attr_)` to `boolean` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      if (attrCase_ == 1) {
        output.writeBool(
            1, (boolean)((Boolean) attr_));
      }
      if (attrCase_ == 2) {
```

### RedundantCast
Casting `((Integer)attr_)` to `int` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
      if (attrCase_ == 2) {
        output.writeInt32(
            2, (int)((Integer) attr_));
      }
      if (attrCase_ == 3) {
```

### RedundantCast
Casting `null` to `BytesCloudEventData` is redundant
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/cloudevent/impl/KnativeBinaryMessageReader.java`
#### Snippet
```java

    protected KnativeBinaryMessageReader(SpecVersion version, byte[] body) {
        super(version, body != null && body.length > 0 ? BytesCloudEventData.wrap(body) : (BytesCloudEventData) null);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param urls` tag description is missing
in `eventmesh-spi/src/main/java/org/apache/eventmesh/spi/loader/EventMeshUrlClassLoader.java`
#### Snippet
```java
     * More detail see {@link URLClassLoader#addURL(URL)}
     *
     * @param urls
     */
    public void addUrls(List<URL> urls) {
```

### JavadocDeclaration
`@param msg` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/ReceiveMsgHook.java`
#### Snippet
```java
     * Handle the received message, return the response message.
     *
     * @param msg
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/ReceiveMsgHook.java`
#### Snippet
```java
     *
     * @param msg
     * @return
     */
    Optional<ProtocolMessage> handle(ProtocolMessage msg);
```

### JavadocDeclaration
`@param msg` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/ReceiveMsgHook.java`
#### Snippet
```java
     * Handle the received message, return the response message.
     *
     * @param msg
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/ReceiveMsgHook.java`
#### Snippet
```java
     *
     * @param msg
     * @return
     */
    Optional<T> handle(T msg) throws Exception;
```

### JavadocDeclaration
`@param message` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java

    /**
     * @param message
     * @param clientConfig
     * @param protocolType
```

### JavadocDeclaration
`@param clientConfig` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
    /**
     * @param message
     * @param clientConfig
     * @param protocolType
     * @param <T>
```

### JavadocDeclaration
`@param protocolType` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
     * @param message
     * @param clientConfig
     * @param protocolType
     * @param <T>
     * @return CloudEvent
```

### JavadocDeclaration
`@param ` tag description is missing
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
     * @param clientConfig
     * @param protocolType
     * @param <T>
     * @return CloudEvent
     * @see <a href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#context-attributes">context-attributes</a>
```

### JavadocDeclaration
`@param key` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ConfigurationContextUtil.java`
#### Snippet
```java
     * Save http, tcp, grpc configuration at startup for global use.
     *
     * @param key
     * @param configuration
     */
```

### JavadocDeclaration
`@param configuration` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ConfigurationContextUtil.java`
#### Snippet
```java
     *
     * @param key
     * @param configuration
     */
    public static void putIfAbsent(String key, CommonConfiguration configuration) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ConfigurationContextUtil.java`
#### Snippet
```java
     * Get the configuration of the specified key mapping.
     *
     * @param key
     * @return configuration of the specified key mapping
     */
```

### JavadocDeclaration
`@param formData` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java
     * Transform the url form string to Map
     *
     * @param formData
     * @return url parameters map
     */
```

### JavadocDeclaration
`@param clazz` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ReflectUtils.java`
#### Snippet
```java
     * Look up fields inherited from the parent class.
     *
     * @param clazz
     * @param fieldName
     * @return
```

### JavadocDeclaration
`@param fieldName` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ReflectUtils.java`
#### Snippet
```java
     *
     * @param clazz
     * @param fieldName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ReflectUtils.java`
#### Snippet
```java
     * @param clazz
     * @param fieldName
     * @return
     */
    public static Field lookUpField(Class<?> clazz, String fieldName) {
```

### JavadocDeclaration
`@param properties` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
     * Load properties from file when file is exist
     *
     * @param properties
     * @param path
     * @param cs
```

### JavadocDeclaration
`@param path` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
     *
     * @param properties
     * @param path
     * @param cs
     * @throws IOException Exception when loading properties, like illegal content, file permission denies
```

### JavadocDeclaration
`@param cs` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
     * @param properties
     * @param path
     * @param cs
     * @throws IOException Exception when loading properties, like illegal content, file permission denies
     */
```

### JavadocDeclaration
`@param properties` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
     * Load properties from file when file is exist
     *
     * @param properties
     * @param path
     * @throws IOException Exception when loading properties, like illegal content, file permission denies
```

### JavadocDeclaration
`@param path` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
     *
     * @param properties
     * @param path
     * @throws IOException Exception when loading properties, like illegal content, file permission denies
     */
```

### JavadocDeclaration
`@param str` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
     * Serialize String to bytes.
     *
     * @param str
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
     *
     * @param str
     * @return
     */
    private static byte[] serializeBytes(String str) {
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
     * Deserialize bytes to String.
     *
     * @param bytes
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
     *
     * @param bytes
     * @return
     */
    private static String deserializeBytes(byte[] bytes) {
```

### JavadocDeclaration
`@param group` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/dispatch/DownstreamDispatchStrategy.java`
#### Snippet
```java
     * select a SESSION
     *
     * @param group
     * @param consumeSessions
     * @return client session
```

### JavadocDeclaration
`@param consumeSessions` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/dispatch/DownstreamDispatchStrategy.java`
#### Snippet
```java
     *
     * @param group
     * @param consumeSessions
     * @return client session
     */
```

### JavadocDeclaration
`@param session` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
     * handle unAck msgs in this session
     *
     * @param session
     */
    private void handleUnackMsgsInSession(Session session) {
```

### JavadocDeclaration
`@param session` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
     * clean subscription of the session
     *
     * @param session
     */
    private void cleanSubscriptionInSession(Session session) throws Exception {
```

### JavadocDeclaration
`@param httpRequest` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
     * Parse request body to map
     *
     * @param httpRequest
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
     *
     * @param httpRequest
     * @return
     */
    private Map<String, Object> parseHttpRequestBody(final HttpRequest httpRequest) throws IOException {
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
     * Inject ip and protocol version, if the protocol version is empty, set default to {@link ProtocolVersion#V1}.
     *
     * @param ctx
     * @param httpRequest
     */
```

### JavadocDeclaration
`@param httpRequest` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
     *
     * @param ctx
     * @param httpRequest
     */
    private void preProcessHttpRequestHeader(final ChannelHandlerContext ctx, final HttpRequest httpRequest) {
```

### JavadocDeclaration
`@param httpRequest` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
     * Validate request, return error status.
     *
     * @param httpRequest
     * @return if request is validated return null else return error status
     */
```

### JavadocDeclaration
`@param request` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/PublisherService.java`
#### Snippet
```java
     * </pre>
     *
     * @param request
     * @param responseObserver
     */
```

### JavadocDeclaration
`@param responseObserver` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/PublisherService.java`
#### Snippet
```java
     *
     * @param request
     * @param responseObserver
     */
    @Override
```

### JavadocDeclaration
`@param request` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/PublisherService.java`
#### Snippet
```java
     * </pre>
     *
     * @param request
     * @param responseObserver
     */
```

### JavadocDeclaration
`@param responseObserver` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/PublisherService.java`
#### Snippet
```java
     *
     * @param request
     * @param responseObserver
     */
    @Override
```

### JavadocDeclaration
`@param request` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/PublisherService.java`
#### Snippet
```java
     * </pre>
     *
     * @param request
     * @param responseObserver
     */
```

### JavadocDeclaration
`@param responseObserver` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/PublisherService.java`
#### Snippet
```java
     *
     * @param request
     * @param responseObserver
     */
    @Override
```

### JavadocDeclaration
`@param consumerGroup` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     * delete consumer
     *
     * @param consumerGroup
     */
    public synchronized void delConsumer(String consumerGroup) throws Exception {
```

### JavadocDeclaration
`@param consumerGroup` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     * add consumer
     *
     * @param consumerGroup
     * @param consumerGroupConfig
     * @throws Exception
```

### JavadocDeclaration
`@param consumerGroupConfig` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     *
     * @param consumerGroup
     * @param consumerGroupConfig
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     * @param consumerGroup
     * @param consumerGroupConfig
     * @throws Exception
     */
    public synchronized void addConsumer(String consumerGroup, ConsumerGroupConf consumerGroupConfig) throws Exception {
```

### JavadocDeclaration
`@param count` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HandlerService.java`
#### Snippet
```java

        /**
         * @param count
         */
        public void recordSendBatchMsgFailed(int count) {
```

### JavadocDeclaration
`@param httpRequest` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HandlerService.java`
#### Snippet
```java

    /**
     * @param httpRequest
     */
    public void handler(ChannelHandlerContext ctx, HttpRequest httpRequest, ThreadPoolExecutor asyncContextCompleteHandler) {
```

### JavadocDeclaration
`@param pkg` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * used to send messages to the client
     *
     * @param pkg
     * @param startTime
     * @param ctx
```

### JavadocDeclaration
`@param startTime` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     *
     * @param pkg
     * @param startTime
     * @param ctx
     * @param session
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * @param pkg
     * @param startTime
     * @param ctx
     * @param session
     */
```

### JavadocDeclaration
`@param session` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * @param startTime
     * @param ctx
     * @param session
     */
    public static void writeAndFlush(final Package pkg, long startTime, long taskExecuteTime, ChannelHandlerContext ctx,
```

### JavadocDeclaration
`@param localAddress` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/AbstractEventProcessor.java`
#### Snippet
```java
     * builder RemoteHeaderMap
     *
     * @param localAddress
     * @return
     */
```

### JavadocDeclaration
`@param future` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * print the message flow of failed sending
     *
     * @param future
     * @param pkg
     * @param user
```

### JavadocDeclaration
`@param pkg` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     *
     * @param future
     * @param pkg
     * @param user
     * @param startTime
```

### JavadocDeclaration
`@param user` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * @param future
     * @param pkg
     * @param user
     * @param startTime
     */
```

### JavadocDeclaration
`@param startTime` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * @param pkg
     * @param user
     * @param startTime
     */
    public static void logFailedMessageFlow(ChannelFuture future, Package pkg, UserAgent user, long startTime,
```

### JavadocDeclaration
`@param pkg` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * print the message flow of successful sending.
     *
     * @param pkg
     * @param user
     * @param startTime
```

### JavadocDeclaration
`@param user` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     *
     * @param pkg
     * @param user
     * @param startTime
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/AbstractEventProcessor.java`
#### Snippet
```java
     *
     * @param localAddress
     * @return
     */
    protected Map<String, String> builderRemoteHeaderMap(String localAddress) {
```

### JavadocDeclaration
`@param startTime` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
     * @param pkg
     * @param user
     * @param startTime
     */
    public static void logSucceedMessageFlow(Package pkg, UserAgent user, long startTime, long taskExecuteTime) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/AbstractEventProcessor.java`
#### Snippet
```java
     * @param responseHandler responseHandler
     * @return string
     * @throws IOException
     */
    public static String post(CloseableHttpClient client, String uri,
```

### JavadocDeclaration
`@param httpExchange` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectAllClientHandler.java`
#### Snippet
```java
     * remove all clients accessed by eventMesh
     *
     * @param httpExchange
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectAllClientHandler.java`
#### Snippet
```java
     *
     * @param httpExchange
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param httpExchange` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/ShowClientBySystemHandler.java`
#### Snippet
```java
     * print clientInfo by subsys
     *
     * @param httpExchange
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/ShowClientBySystemHandler.java`
#### Snippet
```java
     *
     * @param httpExchange
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param eventMeshMessage` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
     * print part of the mq message
     *
     * @param eventMeshMessage
     * @return message string
     */
```

### JavadocDeclaration
`@param object` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
     * Perform deep clone of the given object using serialization
     *
     * @param object
     * @return cloned object
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
     * @param object
     * @return cloned object
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
     * @return cloned object
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @SuppressWarnings("unchecked")
```

### JavadocDeclaration
`@param e` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
     * custom fetch stack
     *
     * @param e
     * @return stacktrace
     */
```

### JavadocDeclaration
`@param httpExchange` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectClientBySubSystemHandler.java`
#### Snippet
```java
     * remove c client by dcn and susysId
     *
     * @param httpExchange
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectClientBySubSystemHandler.java`
#### Snippet
```java
     *
     * @param httpExchange
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param webHookConfig` tag description is missing
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/NacosWebHookConfigOperation.java`
#### Snippet
```java

    /**
     * @param webHookConfig
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/NacosWebHookConfigOperation.java`
#### Snippet
```java
    /**
     * @param webHookConfig
     * @return
     */
    private String getWebHookConfigDataId(final WebHookConfig webHookConfig) {
```

### JavadocDeclaration
`@param fileName` tag description is missing
in `eventmesh-examples/src/main/java/org/apache/eventmesh/util/Utils.java`
#### Snippet
```java

    /**
     * @param fileName
     * @return Properties
     */
```

### JavadocDeclaration
`@param event` tag description is missing
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/service/ProducerService.java`
#### Snippet
```java
     * publish event to eventmesh
     *
     * @param event
     * @param responseObserver
     */
```

### JavadocDeclaration
`@param responseObserver` tag description is missing
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/service/ProducerService.java`
#### Snippet
```java
     *
     * @param event
     * @param responseObserver
     */
    @Override
```

### JavadocDeclaration
`@param eventBatch` tag description is missing
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/service/ProducerService.java`
#### Snippet
```java
     * publish eventBatch to eventmesh
     *
     * @param eventBatch
     * @param responseObserver
     */
```

### JavadocDeclaration
`@param responseObserver` tag description is missing
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/service/ProducerService.java`
#### Snippet
```java
     *
     * @param eventBatch
     * @param responseObserver
     */
    @Override
```

### JavadocDeclaration
`@param traceServiceType` tag description is missing
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/TracePluginFactory.java`
#### Snippet
```java
     * to get TraceService
     *
     * @param traceServiceType
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/TracePluginFactory.java`
#### Snippet
```java
     *
     * @param traceServiceType
     * @return
     */
    public static EventMeshTraceService getEventMeshTraceService(final String traceServiceType) {
```

### JavadocDeclaration
`@param metric` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/MetricsRegistry.java`
#### Snippet
```java
     * Register a new Metric, if the metric is already exist, it will do nothing.
     *
     * @param metric
     */
    void register(Metric metric);
```

### JavadocDeclaration
`@param metric` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/MetricsRegistry.java`
#### Snippet
```java
     * Remove a metric, if the metric is not exist, it will do nothing.
     *
     * @param metric
     */
    void unRegister(Metric metric);
```

### JavadocDeclaration
`@param metricsRegistryType` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/MetricsPluginFactory.java`
#### Snippet
```java
     * Get {@code MetricsRegistry}.
     *
     * @param metricsRegistryType
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/MetricsPluginFactory.java`
#### Snippet
```java
     *
     * @param metricsRegistryType
     * @return
     */
    public static MetricsRegistry getMetricsRegistry(String metricsRegistryType) {
```

### JavadocDeclaration
`@return` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     * @param metricName the metric name
     * @param desc the description of metric
     * @return
     */
    public static String[] join(String metricName, String desc) {
```

### JavadocDeclaration
`@param meter` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     * Build the OpenTelemetry's Meter
     *
     * @param meter
     * @param metricName
     * @param metricDesc
```

### JavadocDeclaration
`@param metricName` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     *
     * @param meter
     * @param metricName
     * @param metricDesc
     * @param protocol
```

### JavadocDeclaration
`@param metricDesc` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     * @param meter
     * @param metricName
     * @param metricDesc
     * @param protocol
     * @param summaryMetrics
```

### JavadocDeclaration
`@param protocol` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     * @param metricName
     * @param metricDesc
     * @param protocol
     * @param summaryMetrics
     * @param getMetric
```

### JavadocDeclaration
`@param summaryMetrics` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     * @param metricDesc
     * @param protocol
     * @param summaryMetrics
     * @param getMetric
     */
```

### JavadocDeclaration
`@param getMetric` tag description is missing
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     * @param protocol
     * @param summaryMetrics
     * @param getMetric
     */
    @SneakyThrows
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-storage-plugin/eventmesh-storage-api/src/main/java/org/apache/eventmesh/api/storage/StorageResourceService.java`
#### Snippet
```java
     * Resource initialization in connector,such as,some public thread pool if exist
     *
     * @throws Exception
     */
    void init() throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-storage-plugin/eventmesh-storage-api/src/main/java/org/apache/eventmesh/api/storage/StorageResourceService.java`
#### Snippet
```java
     * Resource release in connector,such as,some public thread pool if exist
     *
     * @throws Exception
     */
    void release() throws Exception;
```

### JavadocDeclaration
`@param spanProcessor` tag description is missing
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/AbstractTraceService.java`
#### Snippet
```java
    /**
     * Init the common fields
     * @param spanProcessor
     * @param serviceNameResource
     */
```

### JavadocDeclaration
`@param serviceNameResource` tag description is missing
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/AbstractTraceService.java`
#### Snippet
```java
     * Init the common fields
     * @param spanProcessor
     * @param serviceNameResource
     */
    protected void initVars(SpanProcessor spanProcessor, Resource serviceNameResource) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/StandaloneBroker.java`
#### Snippet
```java
     * @param topicName topic name
     * @param message   message
     * @throws InterruptedException
     */
    public MessageEntity putMessage(String topicName, CloudEvent message) throws InterruptedException {
```

### JavadocDeclaration
`@param topicName` tag description is missing
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/StandaloneBroker.java`
#### Snippet
```java
     * Get the message, if the queue is empty then await
     *
     * @param topicName
     */
    public CloudEvent takeMessage(String topicName) throws InterruptedException {
```

### JavadocDeclaration
`@param topicName` tag description is missing
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/StandaloneBroker.java`
#### Snippet
```java
     * Get the message, if the queue is empty return null
     *
     * @param topicName
     */
    public CloudEvent getMessage(String topicName) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myTrustManager` may be 'final'
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/ssl/MyX509TrustManager.java`
#### Snippet
```java
public class MyX509TrustManager implements X509TrustManager {

    private transient X509TrustManager myTrustManager;

    public MyX509TrustManager() throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
```

### FieldMayBeFinal
Field `paramNames` may be 'final'
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
    private Pattern compiledUrlMappingPattern;

    private List<String> paramNames = new ArrayList<>();

    public UrlMappingPattern(String pattern) {
```

### FieldMayBeFinal
Field `urlMappingPattern` may be 'final'
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
    private static final String URL_QUERY_STRING_REGEX = "(?:\\?.*?)?$";

    private String urlMappingPattern;

    private Pattern compiledUrlMappingPattern;
```

### FieldMayBeFinal
Field `code` may be 'final'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/enums/EventMeshDataContentType.java`
#### Snippet
```java

    @Getter
    private String code;

    EventMeshDataContentType(String code) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/enums/EventMeshProtocolType.java`
#### Snippet
```java
    OPEN_MESSAGE("openmessage");

    private String name;

    EventMeshProtocolType(String name) {
```

### FieldMayBeFinal
Field `descriptor` may be 'final'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/EventMeshGrpcService.java`
#### Snippet
```java
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
```

### FieldMayBeFinal
Field `descriptor` may be 'final'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/EventMeshCloudEvents.java`
#### Snippet
```java
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
```

### FieldMayBeFinal
Field `eventMeshTCPServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcpExceptionHandler.java`
#### Snippet
```java
public class EventMeshTcpExceptionHandler extends ChannelDuplexHandler {

    private EventMeshTCPServer eventMeshTCPServer;

    public EventMeshTcpExceptionHandler(EventMeshTCPServer eventMeshTCPServer) {
```

### FieldMayBeFinal
Field `eventMeshTCPServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcpConnectionHandler.java`
#### Snippet
```java
    private final AtomicInteger connections = new AtomicInteger(0);

    private EventMeshTCPServer eventMeshTCPServer;

    public EventMeshTcpConnectionHandler(EventMeshTCPServer eventMeshTCPServer) {
```

### FieldMayBeFinal
Field `eventMeshTCPServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcpMessageDispatcher.java`
#### Snippet
```java

    private static final Logger MESSAGE_LOGGER = LoggerFactory.getLogger(EventMeshConstants.MESSAGE);
    private EventMeshTCPServer eventMeshTCPServer;

    public EventMeshTcpMessageDispatcher(EventMeshTCPServer eventMeshTCPServer) {
```

### FieldMayBeFinal
Field `session` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/SessionContext.java`
#### Snippet
```java
public class SessionContext {

    private Session session;

    @Getter
```

### FieldMayBeFinal
Field `unAckMsg` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/PushContext.java`
#### Snippet
```java
    public AtomicLong deliverFailMsgsCount = new AtomicLong(0);

    private ConcurrentHashMap<String /** seq */, DownStreamMsgContext> unAckMsg = new ConcurrentHashMap<String, DownStreamMsgContext>();

    private long createTime = System.currentTimeMillis();
```

### FieldMayBeFinal
Field `createTime` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/PushContext.java`
#### Snippet
```java
    private ConcurrentHashMap<String /** seq */, DownStreamMsgContext> unAckMsg = new ConcurrentHashMap<String, DownStreamMsgContext>();

    private long createTime = System.currentTimeMillis();

    public PushContext(SessionPusher sessionPusher) {
```

### FieldMayBeFinal
Field `sessionPusher` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/PushContext.java`
#### Snippet
```java
public class PushContext {

    private SessionPusher sessionPusher;

    public AtomicLong deliveredMsgsCount = new AtomicLong(0);
```

### FieldMayBeFinal
Field `detail` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/EventMeshTcpSendResult.java`
#### Snippet
```java
    private EventMeshTcpSendStatus sendStatus;

    private String detail;

    public EventMeshTcpSendResult(String seq, EventMeshTcpSendStatus sendStatus, String detail) {
```

### FieldMayBeFinal
Field `seq` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/EventMeshTcpSendResult.java`
#### Snippet
```java
public class EventMeshTcpSendResult {

    private String seq;

    private EventMeshTcpSendStatus sendStatus;
```

### FieldMayBeFinal
Field `sendStatus` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/EventMeshTcpSendResult.java`
#### Snippet
```java
    private String seq;

    private EventMeshTcpSendStatus sendStatus;

    private String detail;
```

### FieldMayBeFinal
Field `createTime` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java
    private Session session;

    private long createTime = System.currentTimeMillis();

    private Header header;
```

### FieldMayBeFinal
Field `taskExecuteTime` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java
    private long startTime;

    private long taskExecuteTime;

    public UpStreamMsgContext(Session session, CloudEvent event, Header header, long startTime, long taskExecuteTime) {
```

### FieldMayBeFinal
Field `session` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java
public class UpStreamMsgContext extends RetryContext {

    private Session session;

    private long createTime = System.currentTimeMillis();
```

### FieldMayBeFinal
Field `startTime` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java
    private Header header;

    private long startTime;

    private long taskExecuteTime;
```

### FieldMayBeFinal
Field `header` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/UpStreamMsgContext.java`
#### Snippet
```java
    private long createTime = System.currentTimeMillis();

    private Header header;

    private long startTime;
```

### FieldMayBeFinal
Field `retrys` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/EventMeshTcpRetryer.java`
#### Snippet
```java
    private EventMeshTCPServer eventMeshTCPServer;

    private DelayQueue<RetryContext> retrys = new DelayQueue<RetryContext>();

    private ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
```

### FieldMayBeFinal
Field `pool` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/EventMeshTcpRetryer.java`
#### Snippet
```java
    private DelayQueue<RetryContext> retrys = new DelayQueue<RetryContext>();

    private ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
        3,
        60000,
```

### FieldMayBeFinal
Field `subscriptionItem` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/DownStreamMsgContext.java`
#### Snippet
```java

    @Getter
    private SubscriptionItem subscriptionItem;

    private long lastPushTime;
```

### FieldMayBeFinal
Field `consumeConcurrentlyContext` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/DownStreamMsgContext.java`
#### Snippet
```java
    private Session session;

    private AbstractContext consumeConcurrentlyContext;

    private MQConsumerWrapper consumer;
```

### FieldMayBeFinal
Field `consumer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/DownStreamMsgContext.java`
#### Snippet
```java
    private AbstractContext consumeConcurrentlyContext;

    private MQConsumerWrapper consumer;

    @Getter
```

### FieldMayBeFinal
Field `eventMeshTCPServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceService.java`
#### Snippet
```java
public class EventMeshRebalanceService {

    private EventMeshTCPServer eventMeshTCPServer;

    private Integer rebalanceIntervalMills;
```

### FieldMayBeFinal
Field `rebalanceStrategy` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceService.java`
#### Snippet
```java
    private Integer rebalanceIntervalMills;

    private EventMeshRebalanceStrategy rebalanceStrategy;

    private ScheduledExecutorService serviceRebalanceScheduler;
```

### FieldMayBeFinal
Field `rebalanceIntervalMills` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventMeshRebalanceService.java`
#### Snippet
```java
    private EventMeshTCPServer eventMeshTCPServer;

    private Integer rebalanceIntervalMills;

    private EventMeshRebalanceStrategy rebalanceStrategy;
```

### FieldMayBeFinal
Field `eventMeshGrpcServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/ProducerManager.java`
#### Snippet
```java
public class ProducerManager {

    private EventMeshGrpcServer eventMeshGrpcServer;

    private final ConcurrentHashMap<String, EventMeshProducer> producerTable = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `eventMeshHTTPServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
public class ProducerManager {

    private EventMeshHTTPServer eventMeshHTTPServer;

    private ConcurrentHashMap<String /** groupName*/, EventMeshProducer> producerTable = new ConcurrentHashMap<String, EventMeshProducer>();
```

### FieldMayBeFinal
Field `producerTable` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
    private EventMeshHTTPServer eventMeshHTTPServer;

    private ConcurrentHashMap<String /** groupName*/, EventMeshProducer> producerTable = new ConcurrentHashMap<String, EventMeshProducer>();

    public ProducerManager(EventMeshHTTPServer eventMeshHTTPServer) {
```

### FieldMayBeFinal
Field `consumerTable` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     * consumerGroup to ConsumerGroupManager.
     */
    private ConcurrentHashMap<String, ConsumerGroupManager> consumerTable = new ConcurrentHashMap<>(64);


```

### FieldMayBeFinal
Field `eventMeshHTTPServer` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendSyncMessageProcessor.java`
#### Snippet
```java
public class SendSyncMessageProcessor implements HttpRequestProcessor {

    private transient EventMeshHTTPServer eventMeshHTTPServer;

    private final Acl acl;
```

### FieldMayBeFinal
Field `groupName` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/ProducerGroupConf.java`
#### Snippet
```java
public class ProducerGroupConf {

    private String groupName;

    private String token;
```

### FieldMayBeFinal
Field `extensionMap` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshCloudEventWriter.java`
#### Snippet
```java
public class EventMeshCloudEventWriter implements CloudEventContextWriter {

    private Map<String, Object> extensionMap;

    public EventMeshCloudEventWriter() {
```

### FieldMayBeFinal
Field `metricsSchedule` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/metrics/http/HTTPMetricsServer.java`
#### Snippet
```java
    }

    private static ScheduledExecutorService metricsSchedule = Executors.newScheduledThreadPool(2,
        new EventMeshThreadFactory("eventMesh-metrics", true));

```

### FieldMayBeFinal
Field `PRINT_THREADPOOLSTATE_INTERVAL` may be 'final'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/metrics/tcp/EventMeshTcpMonitor.java`
#### Snippet
```java
    private static final int period = 60 * 1000;

    private static int PRINT_THREADPOOLSTATE_INTERVAL = 1;

    public ScheduledFuture<?> monitorTpsTask;
```

### FieldMayBeFinal
Field `manufacturerSet` may be 'final'
in `eventmesh-webhook/eventmesh-webhook-api/src/main/java/org/apache/eventmesh/webhook/api/Manufacturer.java`
#### Snippet
```java
public class Manufacturer {

    private Set<String> manufacturerSet = new HashSet<>();

    private Map<String, List<String>> manufacturerEventMap = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `hookMQProducer` may be 'final'
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/WebHookMQProducer.java`
#### Snippet
```java
public class WebHookMQProducer {

    private transient Producer hookMQProducer;

    public WebHookMQProducer(final Properties properties, String storagePluginType) throws Exception {
```

### FieldMayBeFinal
Field `cacheWebHookConfig` may be 'final'
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
    private final transient Map<WatchKey, String> watchKeyPathMap = new ConcurrentHashMap<>(); // WatchKey's path
    private transient String filePath;
    private transient Map<String, WebHookConfig> cacheWebHookConfig;

    public WebhookFileListener(final String filePath, final Map<String, WebHookConfig> cacheWebHookConfig) {
```

### FieldMayBeFinal
Field `filePath` may be 'final'
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
    private final transient Set<String> pathSet = new LinkedHashSet<>(); // monitored subdirectory
    private final transient Map<WatchKey, String> watchKeyPathMap = new ConcurrentHashMap<>(); // WatchKey's path
    private transient String filePath;
    private transient Map<String, WebHookConfig> cacheWebHookConfig;

```

### FieldMayBeFinal
Field `countDownLatch` may be 'final'
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/sub/service/SubService.java`
#### Snippet
```java

    // CountDownLatch size is the same as messageSize in AsyncPublishInstance.java (Publisher)
    private transient CountDownLatch countDownLatch = new CountDownLatch(AsyncPublishInstance.MESSAGE_SIZE);

    @Override
```

### FieldMayBeFinal
Field `publisherClient` may be 'final'
in `eventmesh-connectors/eventmesh-openfunction-connector/src/main/java/org/apache/eventmesh/connector/openfunction/service/ConsumerService.java`
#### Snippet
```java
    private final transient ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 10115).usePlaintext().build();

    private CallbackServiceBlockingStub publisherClient = CallbackServiceGrpc.newBlockingStub(channel);

    private final ExecutorService handleService = Executors.newSingleThreadExecutor();
```

### FieldMayBeFinal
Field `paramPairs` may be 'final'
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/metrics/PrometheusGrpcExporter.java`
#### Snippet
```java
     * Map structure : [metric name, description of name] -> the method of get corresponding metric.
     */
    private Map<String[], Function<GrpcSummaryMetrics, Number>> paramPairs;

    static {
```

### FieldMayBeFinal
Field `paramPairs` may be 'final'
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/metrics/PrometheusTcpExporter.java`
#### Snippet
```java
     * Map structure : [metric name, description of name] -> the method of get corresponding metric.
     */
    private Map<String[], Function<TcpSummaryMetrics, Number>> paramPairs;

    static {
```

### FieldMayBeFinal
Field `cloudEventToOffset` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/KafkaConsumerRunner.java`
#### Snippet
```java
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final KafkaConsumer<String, CloudEvent> consumer;
    private ConcurrentHashMap<CloudEvent, Long> cloudEventToOffset;
    private EventListener listener;

```

### FieldMayBeFinal
Field `topicsSet` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    private KafkaConsumerRunner kafkaConsumerRunner;
    private ExecutorService executorService;
    private Set<String> topicsSet;

    public ConsumerImpl(final Properties properties) {
```

### FieldMayBeFinal
Field `executorService` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    private EventListener eventListener;
    private KafkaConsumerRunner kafkaConsumerRunner;
    private ExecutorService executorService;
    private Set<String> topicsSet;

```

### FieldMayBeFinal
Field `kafkaConsumerRunner` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private KafkaConsumerRunner kafkaConsumerRunner;
    private ExecutorService executorService;
    private Set<String> topicsSet;
```

### FieldMayBeFinal
Field `started` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-kafka/src/main/java/org/apache/eventmesh/storage/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    private final KafkaConsumer<String, CloudEvent> kafkaConsumer;
    private final Properties properties;
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private KafkaConsumerRunner kafkaConsumerRunner;
```

### FieldMayBeFinal
Field `paramPairs` may be 'final'
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/metrics/PrometheusHttpExporter.java`
#### Snippet
```java
     * Map structure : [metric name, description of name] -> the method of get corresponding metric.
     */
    private Map<String[], Function<HttpSummaryMetrics, Number>> paramPairs;

    static {
```

### FieldMayBeFinal
Field `asyncHttpClient` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/producer/AbstractProducer.java`
#### Snippet
```java
    protected final transient AtomicBoolean started = new AtomicBoolean(false);
    protected final transient Properties properties;
    private transient AsyncHttpClient asyncHttpClient;

    AbstractProducer(final Properties properties) {
```

### FieldMayBeFinal
Field `asyncHttpClient` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/consumer/DefaultConsumer.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(DefaultConsumer.class);

    private transient AsyncHttpClient asyncHttpClient;


```

### FieldMayBeFinal
Field `subscriptionInner` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // Store received message:
    private transient ConcurrentMap<String /* topic */, String /* responseBody */> subscriptionInner;
    private transient EventListener eventListener;

```

### FieldMayBeFinal
Field `message` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-knative/src/main/java/org/apache/eventmesh/storage/knative/cloudevent/impl/KnativeMessageWriter.java`
#### Snippet
```java
public class KnativeMessageWriter implements MessageWriter<CloudEventWriter<String>, String>, CloudEventWriter<String> {

    private transient CloudEvent message;

    public CloudEvent getMessage() {
```

### FieldMayBeFinal
Field `queuePermission` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/admin/RocketMQAdmin.java`
#### Snippet
```java

    private int numOfQueue = 4;
    private int queuePermission = 6;

    public RocketMQAdmin() {
```

### FieldMayBeFinal
Field `numOfQueue` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/admin/RocketMQAdmin.java`
#### Snippet
```java
    protected String clusterName;

    private int numOfQueue = 4;
    private int queuePermission = 6;

```

### FieldMayBeFinal
Field `historyMessageClear` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/task/HistoryMessageClearTask.java`
#### Snippet
```java
public class HistoryMessageClearTask implements Runnable {

    private HistoryMessageClear historyMessageClear;

    public HistoryMessageClearTask(HistoryMessageClear historyMessageClear) {
```

### FieldMayBeFinal
Field `subscribe` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/task/SubscribeTask.java`
#### Snippet
```java
public class SubscribeTask implements Runnable {

    private Subscribe subscribe;

    public SubscribeTask(Subscribe subscribe) {
```

### FieldMayBeFinal
Field `topicName` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/broker/model/TopicMetadata.java`
#### Snippet
```java
public class TopicMetadata implements Serializable {

    private String topicName;

    public TopicMetadata(String topicName) {
```

### FieldMayBeFinal
Field `started` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-rocketmq/src/main/java/org/apache/eventmesh/storage/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
    private final DefaultMQPushConsumer rocketmqPushConsumer;
    private final Properties properties;
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private final ClientConfig clientConfig;
```

### FieldMayBeFinal
Field `isStarted` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/producer/StandaloneProducer.java`
#### Snippet
```java
    private StandaloneBroker standaloneBroker;

    private AtomicBoolean isStarted;

    public StandaloneProducer(Properties properties) {
```

### FieldMayBeFinal
Field `standaloneBroker` may be 'final'
in `eventmesh-storage-plugin/eventmesh-storage-standalone/src/main/java/org/apache/eventmesh/storage/standalone/producer/StandaloneProducer.java`
#### Snippet
```java
public class StandaloneProducer {

    private StandaloneBroker standaloneBroker;

    private AtomicBoolean isStarted;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientWrapper.java`
#### Snippet
```java
class EtcdClientWrapper implements Client {

    private volatile Client client;

    public EtcdClientWrapper(Client client) {
```

### FieldMayBeFinal
Field `extendedFields` may be 'final'
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclProperties.java`
#### Snippet
```java
    private String requestURI;
    private String token;
    private Map<String, Object> extendedFields = new ConcurrentHashMap<>();

    public String getClientIp() {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
                final NetworkInterface networkInterface = enumeration1.nextElement();
                if (!preferList.contains(networkInterface.getName())) {
                    continue;
                } else if (preferNetworkInterface == null
                        || preferList.indexOf(networkInterface.getName())
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `emitter`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/StreamPushRequest.java`
#### Snippet
```java
                // catch the error and retry, don't use eventEmitter.onNext() to hide the error
                StreamObserver<CloudEvent> emitter = eventEmitter.getEmitter();
                synchronized (emitter) {
                    emitter.onNext(eventMeshCloudEvent);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java

        //session must be synchronized to avoid SessionState be confound, for example adding subscribe when session closing
        synchronized (session) {

            if (SessionState.CLOSED == session.getSessionState()) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `localConsumerGroupMap`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/UnSubscribeProcessor.java`
#### Snippet
```java
                    }

                    synchronized (localConsumerGroupMap) {
                        final ConsumerGroupConf consumerGroupConf = localConsumerGroupMap.get(consumerGroup);

```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `clientInfoMap`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HeartBeatProcessor.java`
#### Snippet
```java
        ConcurrentHashMap<String, List<Client>> clientInfoMap =
                eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping();
        synchronized (clientInfoMap) {
            for (final Map.Entry<String, List<Client>> groupTopicClientMapping : tmpMap.entrySet()) {
                final List<Client> localClientList = clientInfoMap.get(groupTopicClientMapping.getKey());
```

## RuleId[id=SpringJavaAutowiredFieldsWarningInspection]
### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/sub/controller/SubController.java`
#### Snippet
```java
public class SubController {

    @Autowired
    private transient SubService subService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/sub/app/controller/SubController.java`
#### Snippet
```java
public class SubController {

    @Autowired
    private transient SubService subService;

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `cloudEvent` is redundant
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
    private static CloudEvent switchCloudEvent2EventMeshCloudEvent(io.cloudevents.CloudEvent message, EventMeshGrpcClientConfig clientConfig,
        EventMeshProtocolType protocolType) {
        final io.cloudevents.CloudEvent cloudEvent = message;
        CloudEventBuilder cloudEventBuilder = CloudEventBuilder.from(cloudEvent);
        if (null == cloudEvent.getExtension(ProtocolKey.ENV)) {
```

### UnnecessaryLocalVariable
Local variable `eventMeshMessage` is redundant
in `eventmesh-sdks/eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshCloudEventBuilder.java`
#### Snippet
```java
    private static CloudEvent switchEventMeshMessage2EventMeshCloudEvent(EventMeshMessage message, EventMeshGrpcClientConfig clientConfig,
        EventMeshProtocolType protocolType) {
        final EventMeshMessage eventMeshMessage = message;
        final String ttl = eventMeshMessage.getProp(Constants.EVENTMESH_MESSAGE_CONST_TTL) == null
            ? Constants.DEFAULT_EVENTMESH_MESSAGE_TTL : eventMeshMessage.getProp(Constants.EVENTMESH_MESSAGE_CONST_TTL);
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEventBatch.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            id_ = s;
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            source_ = s;
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            specVersion_ = s;
```

### UnnecessaryLocalVariable
Local variable `s` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            type_ = s;
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/cloudevents/CloudEvent.java`
#### Snippet
```java
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
```

### UnnecessaryLocalVariable
Local variable `taskExcuteTime` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

            long startTime = System.currentTimeMillis();
            long taskExcuteTime = startTime;
            send(new UpStreamMsgContext(null, event, null, startTime, taskExcuteTime),
                new SendCallback() {
```

### UnnecessaryLocalVariable
Local variable `array` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/utils/PrometheusExporterUtils.java`
#### Snippet
```java
     */
    public static String[] join(String metricName, String desc) {
        String[] array = {metricName, desc};
        return array;
    }
```

### UnnecessaryLocalVariable
Local variable `event` is redundant
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java

    public static io.cloudevents.CloudEvent buildEvent(CloudEvent cloudEvent) {
        io.cloudevents.CloudEvent event = eventFormat.deserialize(cloudEvent.toByteArray());
        return event;
    }
```

### UnnecessaryLocalVariable
Local variable `event` is redundant
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/grpc/GrpcEventMeshCloudEventProtocolResolver.java`
#### Snippet
```java
            return null;
        }
        io.cloudevents.CloudEvent event = eventFormat.deserialize(cloudEvent.toByteArray());
        return event;
    }
```

### UnnecessaryLocalVariable
Local variable `eventMeshAppSubTopicInfo` is redundant
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
            keyValues = client.getKVClient().get(keyByteSequence, getOption).get().getKvs();
            if (CollectionUtils.isNotEmpty(keyValues)) {
                EventMeshAppSubTopicInfo eventMeshAppSubTopicInfo =
                    JsonUtils.parseObject(
                        new String(keyValues.get(0).getValue().getBytes(), Constants.DEFAULT_CHARSET),
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\.\\{format\\})`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
    private static final Pattern URL_PARAMETER_PATTERN = Pattern.compile(URL_PARAMETER_REGEX);

    private static final String URL_FORMAT_REGEX = "(?:\\.\\{format\\})$";

    private static final String URL_FORMAT_MATCH_REGEX = "(?:\\\\.\\([\\\\w%]+?\\))?";
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`caculateLocal == true` can be simplified to 'caculateLocal'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
        });

        recommendProxyAddr = recommendProxy(eventMeshMap, (caculateLocal == true) ? localClientDistributionMap
            : remoteClientDistributionMap, group);

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
    }

    public RateLimiter getMsgRateLimiter() {
        return msgRateLimiter;
    }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
        initHttpClientPool();

        msgRateLimiter = RateLimiter.create(eventMeshGrpcConfiguration.getEventMeshMsgReqNumPerSecond());

        producerManager = new ProducerManager(this);
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
        initHttpClientPool();

        msgRateLimiter = RateLimiter.create(eventMeshGrpcConfiguration.getEventMeshMsgReqNumPerSecond());

        producerManager = new ProducerManager(this);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
    private List<CloseableHttpClient> httpClientPool;

    private RateLimiter msgRateLimiter;

    private final Registry registry;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
        initThreadPool();

        rateLimiter = RateLimiter.create(eventMeshTCPConfiguration.getEventMeshTcpMsgReqnumPerSecond());

        globalTrafficShapingHandler = newGTSHandler(scheduler, eventMeshTCPConfiguration.getGtc().getReadLimit());
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
        initThreadPool();

        rateLimiter = RateLimiter.create(eventMeshTCPConfiguration.getEventMeshTcpMsgReqnumPerSecond());

        globalTrafficShapingHandler = newGTSHandler(scheduler, eventMeshTCPConfiguration.getGtc().getReadLimit());
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    }

    public void setRateLimiter(final RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    private transient AdminWebHookConfigOperationManager adminWebHookConfigOperationManage;

    private transient RateLimiter rateLimiter;


```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    }

    public RateLimiter getRateLimiter() {
        return rateLimiter;
    }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    }

    public RateLimiter getMsgRateLimiter() {
        return msgRateLimiter;
    }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    private ThreadPoolExecutor webhookExecutor;

    private transient RateLimiter msgRateLimiter;

    private transient RateLimiter batchRateLimiter;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
        initThreadPool();

        msgRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshHttpMsgReqNumPerSecond());
        batchRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshBatchMsgRequestNumPerSecond());

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
        initThreadPool();

        msgRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshHttpMsgReqNumPerSecond());
        batchRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshBatchMsgRequestNumPerSecond());

```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java

        msgRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshHttpMsgReqNumPerSecond());
        batchRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshBatchMsgRequestNumPerSecond());

        // The MetricsRegistry is singleton, so we can use factory method to get.
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java

        msgRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshHttpMsgReqNumPerSecond());
        batchRateLimiter = RateLimiter.create(eventMeshHttpConfiguration.getEventMeshBatchMsgRequestNumPerSecond());

        // The MetricsRegistry is singleton, so we can use factory method to get.
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    private transient RateLimiter msgRateLimiter;

    private transient RateLimiter batchRateLimiter;

    private final transient HTTPClientPool httpClientPool = new HTTPClientPool(10);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    }

    public RateLimiter getBatchRateLimiter() {
        return batchRateLimiter;
    }
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java

            if (!eventMeshTCPServer.getRateLimiter()
                .tryAcquire(TRY_PERMIT_TIME_OUT, TimeUnit.MILLISECONDS)) {

                msg.setHeader(new Header(replyCmd, OPStatus.FAIL.getCode(), "Tps overload, global flow control", pkg.getHeader().getSeq()));
```

### UnstableApiUsage
'getRate()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                TraceUtils.finishSpanWithException(ctx, event, "Tps overload, global flow control", null);

                log.warn("======Tps overload, global flow control, rate:{}! PLEASE CHECK!========", eventMeshTCPServer.getRateLimiter().getRate());
                return;
            }
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/AbstractPublishCloudEventProcessor.java`
#### Snippet
```java

        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter().tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            log.error("Send message speed over limit.");
            ServiceUtils.streamCompleted(cloudEvent, StatusCode.EVENTMESH_SEND_MESSAGE_SPEED_OVER_LIMIT_ERR, emitter);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/ReplyMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            log.error("Send message speed over limit.");
            ServiceUtils.streamCompleted(message, StatusCode.EVENTMESH_SEND_MESSAGE_SPEED_OVER_LIMIT_ERR, emitter);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/AbstractPublishBatchCloudEventProcessor.java`
#### Snippet
```java

        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter().tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            log.error("Send message speed over limit.");
            ServiceUtils.completed(StatusCode.EVENTMESH_SEND_MESSAGE_SPEED_OVER_LIMIT_ERR, emitter);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendSyncMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            completeResponse(request, asyncContext, sendMessageResponseHeader,
                    EventMeshRetCode.EVENTMESH_HTTP_MES_SEND_OVER_LIMIT_ERR, null, SendMessageResponseBody.class);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/ReplyMessageProcessor.java`
#### Snippet
```java
        HttpSummaryMetrics summaryMetrics = eventMeshHTTPServer.getMetrics().getSummaryMetrics();
        if (!eventMeshHTTPServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            summaryMetrics.recordHTTPDiscard();
            completeResponse(request, asyncContext, replyMessageResponseHeader,
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncEventProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_HTTP_MES_SEND_OVER_LIMIT_ERR, responseHeaderMap,
                responseBodyMap, EventMeshUtil.getCloudEventExtensionMap(SpecVersion.V1.toString(), event));
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncRemoteEventProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            handlerSpecific.sendErrorResponse(EventMeshRetCode.EVENTMESH_HTTP_MES_SEND_OVER_LIMIT_ERR, responseHeaderMap,
                responseBodyMap, EventMeshUtil.getCloudEventExtensionMap(SpecVersion.V1.toString(), event));
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            completeResponse(request, asyncContext, sendMessageResponseHeader,
                    EventMeshRetCode.EVENTMESH_HTTP_MES_SEND_OVER_LIMIT_ERR, null, SendMessageResponseBody.class);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageV2Processor.java`
#### Snippet
```java
        HttpSummaryMetrics summaryMetrics = eventMeshHTTPServer.getMetrics().getSummaryMetrics();
        if (!eventMeshHTTPServer.getBatchRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            summaryMetrics.recordSendBatchMsgDiscard(1);
            completeResponse(request, asyncContext, sendMessageBatchV2ResponseHeader,
```

### UnstableApiUsage
'tryAcquire(int, long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageProcessor.java`
#### Snippet
```java
        HttpSummaryMetrics summaryMetrics = eventMeshHTTPServer.getMetrics().getSummaryMetrics();
        if (!eventMeshHTTPServer.getBatchRateLimiter()
            .tryAcquire(eventSize, EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            summaryMetrics.recordSendBatchMsgDiscard(eventSize);
            completeResponse(request, asyncContext, sendMessageBatchResponseHeader,
```

### UnstableApiUsage
'io.pravega.client.ClientConfig' is marked unstable with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        this.config = config;
        streamManager = StreamManager.create(config.getControllerURI());
        ClientConfig.ClientConfigBuilder clientConfigBuilder = ClientConfig.builder().controllerURI(config.getControllerURI());
        if (config.isAuthEnabled()) {
            clientConfigBuilder.credentials(new DefaultCredentials(config.getPassword(), config.getUsername()));
```

### UnstableApiUsage
'io.pravega.client.ClientConfig.ClientConfigBuilder' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        this.config = config;
        streamManager = StreamManager.create(config.getControllerURI());
        ClientConfig.ClientConfigBuilder clientConfigBuilder = ClientConfig.builder().controllerURI(config.getControllerURI());
        if (config.isAuthEnabled()) {
            clientConfigBuilder.credentials(new DefaultCredentials(config.getPassword(), config.getUsername()));
```

### UnstableApiUsage
'io.pravega.client.ClientConfig' is marked unstable with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        this.config = config;
        streamManager = StreamManager.create(config.getControllerURI());
        ClientConfig.ClientConfigBuilder clientConfigBuilder = ClientConfig.builder().controllerURI(config.getControllerURI());
        if (config.isAuthEnabled()) {
            clientConfigBuilder.credentials(new DefaultCredentials(config.getPassword(), config.getUsername()));
```

### UnstableApiUsage
'builder()' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        this.config = config;
        streamManager = StreamManager.create(config.getControllerURI());
        ClientConfig.ClientConfigBuilder clientConfigBuilder = ClientConfig.builder().controllerURI(config.getControllerURI());
        if (config.isAuthEnabled()) {
            clientConfigBuilder.credentials(new DefaultCredentials(config.getPassword(), config.getUsername()));
```

### UnstableApiUsage
'controllerURI(java.net.URI)' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        this.config = config;
        streamManager = StreamManager.create(config.getControllerURI());
        ClientConfig.ClientConfigBuilder clientConfigBuilder = ClientConfig.builder().controllerURI(config.getControllerURI());
        if (config.isAuthEnabled()) {
            clientConfigBuilder.credentials(new DefaultCredentials(config.getPassword(), config.getUsername()));
```

### UnstableApiUsage
'credentials(io.pravega.shared.security.auth.Credentials)' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        ClientConfig.ClientConfigBuilder clientConfigBuilder = ClientConfig.builder().controllerURI(config.getControllerURI());
        if (config.isAuthEnabled()) {
            clientConfigBuilder.credentials(new DefaultCredentials(config.getPassword(), config.getUsername()));
        }
        if (config.isTlsEnable()) {
```

### UnstableApiUsage
'trustStore(java.lang.String)' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        }
        if (config.isTlsEnable()) {
            clientConfigBuilder.trustStore(config.getTruststore()).validateHostName(false);
        }
        ClientConfig clientConfig = clientConfigBuilder.build();
```

### UnstableApiUsage
'validateHostName(boolean)' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        }
        if (config.isTlsEnable()) {
            clientConfigBuilder.trustStore(config.getTruststore()).validateHostName(false);
        }
        ClientConfig clientConfig = clientConfigBuilder.build();
```

### UnstableApiUsage
'io.pravega.client.ClientConfig' is marked unstable with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
            clientConfigBuilder.trustStore(config.getTruststore()).validateHostName(false);
        }
        ClientConfig clientConfig = clientConfigBuilder.build();
        clientFactory = EventStreamClientFactory.withScope(config.getScope(), clientConfig);
        readerGroupManager = ReaderGroupManager.withScope(config.getScope(), clientConfig);
```

### UnstableApiUsage
'build()' is declared in unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
            clientConfigBuilder.trustStore(config.getTruststore()).validateHostName(false);
        }
        ClientConfig clientConfig = clientConfigBuilder.build();
        clientFactory = EventStreamClientFactory.withScope(config.getScope(), clientConfig);
        readerGroupManager = ReaderGroupManager.withScope(config.getScope(), clientConfig);
```

### UnstableApiUsage
'withScope(java.lang.String, io.pravega.client.ClientConfig)' is unstable because its signature references unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        }
        ClientConfig clientConfig = clientConfigBuilder.build();
        clientFactory = EventStreamClientFactory.withScope(config.getScope(), clientConfig);
        readerGroupManager = ReaderGroupManager.withScope(config.getScope(), clientConfig);
    }
```

### UnstableApiUsage
'withScope(java.lang.String, io.pravega.client.ClientConfig)' is unstable because its signature references unstable class 'io.pravega.client.ClientConfig' marked with @Beta
in `eventmesh-storage-plugin/eventmesh-storage-pravega/src/main/java/org/apache/eventmesh/storage/pravega/client/PravegaClient.java`
#### Snippet
```java
        ClientConfig clientConfig = clientConfigBuilder.build();
        clientFactory = EventStreamClientFactory.withScope(config.getScope(), clientConfig);
        readerGroupManager = ReaderGroupManager.withScope(config.getScope(), clientConfig);
    }

```

### UnstableApiUsage
'io.etcd.jetcd.KV' is marked unstable with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientWrapper.java`
#### Snippet
```java

    @Override
    public KV getKVClient() {
        return client.getKVClient();
    }
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientWrapper.java`
#### Snippet
```java
    @Override
    public KV getKVClient() {
        return client.getKVClient();
    }

```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
            GetOption getOption = GetOption.newBuilder().withPrefix(keyByteSequence).build();
            keyValues = client.getKVClient().get(keyByteSequence, getOption).get().getKvs();
            if (CollectionUtils.isNotEmpty(keyValues)) {
                EventMeshAppSubTopicInfo eventMeshAppSubTopicInfo =
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
            GetOption getOption = GetOption.newBuilder().withPrefix(keyByteSequence).build();
            keyValues = client.getKVClient().get(keyByteSequence, getOption).get().getKvs();
            if (CollectionUtils.isNotEmpty(keyValues)) {
                EventMeshAppSubTopicInfo eventMeshAppSubTopicInfo =
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
            GetOption getOption = GetOption.newBuilder().withPrefix(keyByteSequence).build();
            keyValues = client.getKVClient().get(keyByteSequence, getOption).get().getKvs();


```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdCustomService.java`
#### Snippet
```java
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
            GetOption getOption = GetOption.newBuilder().withPrefix(keyByteSequence).build();
            keyValues = client.getKVClient().get(keyByteSequence, getOption).get().getKvs();


```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
            GetOption getOption = GetOption.newBuilder().withPrefix(keyByteSequence).build();
            List<KeyValue> keyValues = etcdClient.getKVClient().get(keyByteSequence, getOption).get().getKvs();

            if (CollectionUtils.isNotEmpty(keyValues)) {
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence keyByteSequence = ByteSequence.from(keyPrefix.getBytes(Constants.DEFAULT_CHARSET));
            GetOption getOption = GetOption.newBuilder().withPrefix(keyByteSequence).build();
            List<KeyValue> keyValues = etcdClient.getKVClient().get(keyByteSequence, getOption).get().getKvs();

            if (CollectionUtils.isNotEmpty(keyValues)) {
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence etcdKey = getEtcdKey(eventMeshClusterName, eventMeshName,
                eventMeshUnRegisterInfo.getEndPoint());
            etcdClient.getKVClient().delete(etcdKey);
            eventMeshRegisterInfoMap.remove(eventMeshName);
            log.info("EventMesh successfully logout to etcd, eventMeshClusterName: {}, eventMeshName: {}",
```

### UnstableApiUsage
'delete(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence etcdKey = getEtcdKey(eventMeshClusterName, eventMeshName,
                eventMeshUnRegisterInfo.getEndPoint());
            etcdClient.getKVClient().delete(etcdKey);
            eventMeshRegisterInfoMap.remove(eventMeshName);
            log.info("EventMesh successfully logout to etcd, eventMeshClusterName: {}, eventMeshName: {}",
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence etcdValue = ByteSequence.from(Objects.requireNonNull(JsonUtils.toJSONString(eventMeshDataInfo))
                                                 .getBytes(Constants.DEFAULT_CHARSET));
            etcdClient.getKVClient().put(etcdKey, etcdValue, PutOption.newBuilder().withLeaseId(getLeaseId()).build());
            eventMeshRegisterInfoMap.put(eventMeshName, eventMeshRegisterInfo);

```

### UnstableApiUsage
'put(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.PutOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence etcdValue = ByteSequence.from(Objects.requireNonNull(JsonUtils.toJSONString(eventMeshDataInfo))
                                                 .getBytes(Constants.DEFAULT_CHARSET));
            etcdClient.getKVClient().put(etcdKey, etcdValue, PutOption.newBuilder().withLeaseId(getLeaseId()).build());
            eventMeshRegisterInfoMap.put(eventMeshName, eventMeshRegisterInfo);

```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
                    List<KeyValue> keyValues = null;
                    try {
                        keyValues = etcdClient.getKVClient().get(etcdKey).get().getKvs();
                    } catch (InterruptedException | ExecutionException e) {
                        log.error("get etcdKey[{}] failed", etcdKey, e);
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
                    List<KeyValue> keyValues = null;
                    try {
                        keyValues = etcdClient.getKVClient().get(etcdKey).get().getKvs();
                    } catch (InterruptedException | ExecutionException e) {
                        log.error("get etcdKey[{}] failed", etcdKey, e);
```

