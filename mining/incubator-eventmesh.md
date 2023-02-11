# incubator-eventmesh 
 
# Bad smells
I found 1021 bad smells with 144 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 118 | false |
| PublicFieldAccessedInSynchronizedContext | 106 | false |
| UtilityClassWithoutPrivateConstructor | 89 | true |
| BoundedWildcard | 76 | false |
| DataFlowIssue | 61 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 60 | false |
| StringBufferReplaceableByString | 58 | false |
| UnstableApiUsage | 52 | false |
| RedundantFieldInitialization | 37 | false |
| UnusedAssignment | 22 | false |
| UnnecessarySuperQualifier | 17 | false |
| SizeReplaceableByIsEmpty | 16 | true |
| ConstantValue | 15 | false |
| DynamicRegexReplaceableByCompiledPattern | 15 | false |
| UnnecessaryFullyQualifiedName | 15 | false |
| EmptyMethod | 14 | false |
| CallToStringConcatCanBeReplacedByOperator | 14 | false |
| ExcessiveLambdaUsage | 11 | false |
| NonProtectedConstructorInAbstractClass | 11 | true |
| AssignmentToMethodParameter | 11 | false |
| CodeBlock2Expr | 9 | true |
| UnstableTypeUsedInSignature | 9 | false |
| Convert2Lambda | 9 | false |
| DefaultAnnotationParam | 8 | false |
| SynchronizeOnNonFinalField | 8 | false |
| UnnecessaryModifier | 7 | true |
| NestedAssignment | 7 | false |
| ReplaceAssignmentWithOperatorAssignment | 6 | false |
| SynchronizeOnThis | 6 | false |
| ZeroLengthArrayInitialization | 6 | false |
| AssignmentToLambdaParameter | 6 | false |
| UnnecessaryQualifierForThis | 5 | false |
| UnnecessaryReturn | 5 | true |
| RegExpSingleCharAlternation | 5 | false |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| AbstractClassNeverImplemented | 4 | false |
| RedundantMethodOverride | 4 | false |
| Lombok | 4 | false |
| MismatchedCollectionQueryUpdate | 4 | false |
| UseOfPropertiesAsHashtable | 4 | false |
| UnnecessarySemicolon | 4 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| RegExpRedundantEscape | 3 | false |
| MissortedModifiers | 3 | false |
| IgnoreResultOfCall | 3 | false |
| MalformedFormatString | 3 | false |
| UNUSED_IMPORT | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| RedundantSuppression | 3 | false |
| Java8MapApi | 3 | false |
| UseCompareMethod | 3 | false |
| EmptyTryBlock | 2 | false |
| InstanceofCatchParameter | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| OptionalContainsCollection | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| NestedSynchronizedStatement | 2 | false |
| StringEqualsEmptyString | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| BusyWait | 2 | false |
| UseBulkOperation | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| CommentedOutCode | 1 | false |
| CastToIncompatibleInterface | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| InfiniteLoopStatement | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| RedundantImplements | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| Java8MapForEach | 1 | false |
| RedundantLengthCheck | 1 | false |
| Convert2MethodRef | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| UnnecessaryContinue | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| PointlessBooleanExpression | 1 | true |
## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SubscribeProcessor.java`
#### Snippet
```java
        HttpCommand responseEventMeshCommand;
        final HttpCommand request = asyncContext.getRequest();
        final Integer requestCode = Integer.valueOf(asyncContext.getRequest().getRequestCode());
        final String localAddress = IPUtils.getLocalAddress();

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

### WrapperTypeMayBePrimitive
Type may be primitive
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
            String[] ipPort = eventMeshRegisterInfo.getEndPoint().split(ZookeeperConstant.IP_PORT_SEPARATOR);
            String ip = ipPort[0];
            Integer port = Integer.valueOf(ipPort[1]);
            String eventMeshName = eventMeshRegisterInfo.getEventMeshName();
            String eventMeshClusterName = eventMeshRegisterInfo.getEventMeshClusterName();
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/FileLoad.java`
#### Snippet
```java
    YamlFileLoad YAML_FILE_LOAD = new YamlFileLoad();

    public static FileLoad getFileLoad(String fileType) {
        if (Objects.equals("properties", fileType)) {
            return PROPERTIES_FILE_LOAD;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPMessageHandler.java`
#### Snippet
```java
    private static final Integer CONSUMER_GROUP_WAITING_REQUEST_THRESHOLD = 10000;

    public static final transient Map<String, Set<AbstractHTTPPushRequest>> waitingRequests = Maps.newConcurrentMap();

    private transient ThreadPoolExecutor pushExecutor;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPMessageHandler.java`
#### Snippet
```java
    private transient EventMeshConsumer eventMeshConsumer;

    private static final transient ScheduledExecutorService SCHEDULER =
            ThreadPoolFactory.createSingleScheduledExecutor("eventMesh-pushMsgTimeout-");

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

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
public abstract class TcpClient implements Closeable {

    protected static final transient int CLIENTNO = (new Random()).nextInt(1000);

    protected final transient ConcurrentHashMap<Object, RequestContext> contexts = new ConcurrentHashMap<>();
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
@Data
public class EventMeshGrpcConsumer implements AutoCloseable {
    private static final transient String SDK_STREAM_URL = "grpc_stream";
    private transient ManagedChannel channel;
    private final transient EventMeshGrpcClientConfig clientConfig;
```

## RuleId[ruleID=PointlessArithmeticExpression]
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

## RuleId[ruleID=EmptyTryBlock]
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

### EmptyTryBlock
Empty `try` block
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
        INIT_STATUS.compareAndSet(true, false);
        START_STATUS.compareAndSet(true, false);
        try (CuratorFramework closedClient = zkClient) {
            //
        } catch (Exception e) {
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (10 lines)
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/response/GetConfigurationResponse.java`
#### Snippet
```java
    public boolean eventMeshGrpcServerUseTls;

    //    public String eventMeshConnectorPluginType;
    //    public String eventMeshSecurityPluginType;
    //    public String eventMeshRegistryPluginType;
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `aclService` from instance context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/acl/Acl.java`
#### Snippet
```java

    public void init(String aclPluginType) throws AclException {
        aclService = EventMeshExtensionFactory.getExtension(AclService.class, aclPluginType);
        if (aclService == null) {
            logger.error("can't load the aclService plugin, please check.");
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `trace` from instance context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshServer.java`
#### Snippet
```java
        this.acl = new Acl();
        this.registry = new Registry();
        trace = new Trace(configuration.isEventMeshServerTraceEnable());
        this.connectorResource = new ConnectorResource();
        trace = new Trace(configuration.isEventMeshServerTraceEnable());
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `trace` from instance context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshServer.java`
#### Snippet
```java
        trace = new Trace(configuration.isEventMeshServerTraceEnable());
        this.connectorResource = new ConnectorResource();
        trace = new Trace(configuration.isEventMeshServerTraceEnable());

        final List<String> provideServerProtocols = configuration.getEventMeshProvideServerProtocols();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `connectorResourceService` from instance context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/connector/ConnectorResource.java`
#### Snippet
```java

    public void init(String connectorResourcePluginType) throws Exception {
        connectorResourceService = EventMeshExtensionFactory.getExtension(ConnectorResourceService.class, connectorResourcePluginType);
        if (connectorResourceService == null) {
            logger.error("can't load the connectorResourceService plugin, please check.");
```

## RuleId[ruleID=RegExpRedundantEscape]
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
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
            for (Map.Entry<Object, Object> entry : entries) {
                String entryKey = entry.getKey().toString();
                String[] keyGroup = entryKey.split("[\\._]");
                for (int i = 0; i < keyGroup.length; i++) {
                    keyGroup[i] = keyGroup[i].toLowerCase();
```

## RuleId[ruleID=CastToIncompatibleInterface]
### CastToIncompatibleInterface
Cast to incompatible interface `AbstractContext`
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java
            };

            eventMeshAsyncConsumeContext.setAbstractContext((AbstractContext) context);

            // Consume received message:
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `messageContainer.keySet()` may be replaced with 'entrySet()' iteration
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/admin/StandaloneAdmin.java`
#### Snippet
```java
        ConcurrentHashMap<TopicMetadata, MessageQueue> messageContainer = this.standaloneBroker.getMessageContainer();
        List<TopicProperties> topicList = new ArrayList<>();
        for (TopicMetadata topicMetadata : messageContainer.keySet()) {
            MessageQueue messageQueue = messageContainer.get(topicMetadata);
            topicList.add(new TopicProperties(
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `WebhookPushRequest` on 'this' is unnecessary in this context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/WebhookPushRequest.java`
#### Snippet
```java
    private ResponseHandler<Object> handleResponse(String selectedPushUrl) {
        return response -> {
            removeWaitingMap(WebhookPushRequest.this);
            long cost = System.currentTimeMillis() - lastPushTime;
            //eventMeshHTTPServer.metrics.summaryMetrics.recordHTTPPushTimeCost(cost);
```

### UnnecessaryQualifierForThis
Qualifier `EventMeshConsumer` on 'this' is unnecessary in this context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
                    EventMeshUtil.buildPushMsgSeqNo(),
                    consumerGroupConf.getConsumerGroup(),
                    EventMeshConsumer.this,
                    topic, event, subscriptionItem, eventMeshAsyncConsumeContext.getAbstractContext(),
                    consumerGroupConf, eventMeshHTTPServer, bizSeqNo, uniqueId, currentTopicConfig);
```

### UnnecessaryQualifierForThis
Qualifier `EventMeshConsumer` on 'this' is unnecessary in this context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
                HandleMsgContext handleMsgContext =
                    new HandleMsgContext(EventMeshUtil.buildPushMsgSeqNo(),
                        consumerGroupConf.getConsumerGroup(), EventMeshConsumer.this,
                        topic, event, subscriptionItem,
                        eventMeshAsyncConsumeContext.getAbstractContext(),
```

### UnnecessaryQualifierForThis
Qualifier `ProducerImpl` on 'this' is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/producer/ProducerImpl.java`
#### Snippet
```java
            throw new IllegalStateException("HTTP response code error: " + response.getStatusCode());
        } catch (Exception e) {
            ConnectorRuntimeException onsEx = ProducerImpl.this.checkProducerException(cloudEvent, e);
            OnExceptionContext context = new OnExceptionContext();
            context.setTopic(KnativeMessageFactory.createReader(cloudEvent));
```

### UnnecessaryQualifierForThis
Qualifier `ConsumeMessageConcurrentlyService` on 'this' is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
            log.warn(String.format("consumeMessageDirectly exception: %s Group: %s Msgs: %s MQ: %s",
                RemotingHelper.exceptionSimpleDesc(e),
                ConsumeMessageConcurrentlyService.this.consumerGroup,
                msgs,
                mq), e);
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`addr.length() > 0` can be replaced with '!addr.isEmpty()'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
        final String addr = remote != null ? remote.toString() : "";

        if (addr.length() > 0) {
            int index = addr.lastIndexOf("/");
            if (index >= 0) {
```

### SizeReplaceableByIsEmpty
`keyPrefix.length() > 0` can be replaced with '!keyPrefix.isEmpty()'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ObjectConverter.java`
#### Snippet
```java
        StringBuilder keyPrefix = new StringBuilder(Objects.isNull(prefix) ? "" : prefix);

        if (configFiled == null || configFiled.field().isEmpty() && keyPrefix.length() > 0) {
            key = keyPrefix.deleteCharAt(keyPrefix.length() - 1).toString();
        } else {
```

### SizeReplaceableByIsEmpty
`unAckMsg.size() > 0` can be replaced with '!unAckMsg.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
        ConcurrentHashMap<String /** seq */, DownStreamMsgContext> unAckMsg = session.getPusher().getUnAckMsg();
        ClientGroupWrapper clientGroupWrapper = Objects.requireNonNull(session.getClientGroupWrapper().get());
        if (unAckMsg.size() > 0 && clientGroupWrapper.getGroupConsumerSessions().size() > 0) {
            for (Map.Entry<String, DownStreamMsgContext> entry : unAckMsg.entrySet()) {
                DownStreamMsgContext downStreamMsgContext = entry.getValue();
```

### SizeReplaceableByIsEmpty
`clientGroupWrapper.getGroupConsumerSessions().size() > 0` can be replaced with '!clientGroupWrapper.getGroupConsumerSessions().isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
        ConcurrentHashMap<String /** seq */, DownStreamMsgContext> unAckMsg = session.getPusher().getUnAckMsg();
        ClientGroupWrapper clientGroupWrapper = Objects.requireNonNull(session.getClientGroupWrapper().get());
        if (unAckMsg.size() > 0 && clientGroupWrapper.getGroupConsumerSessions().size() > 0) {
            for (Map.Entry<String, DownStreamMsgContext> entry : unAckMsg.entrySet()) {
                DownStreamMsgContext downStreamMsgContext = entry.getValue();
```

### SizeReplaceableByIsEmpty
`0 == localEventMeshDistributeData.size()` can be replaced with 'localEventMeshDistributeData.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
            }

            if (0 == localEventMeshDistributeData.size()) {
                logger.warn("doRebalance failed,found no distribute data of localIDC in regitry,cluster:{},group:{}, purpose:{},localIDC:{}",
                        cluster, group, purpose, localIdc);
```

### SizeReplaceableByIsEmpty
`0 == localEventMeshMap.size()` can be replaced with 'localEventMeshMap.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
            }

            if (0 == localEventMeshMap.size()) {
                logger.warn("doRebalance failed,query eventmesh instances of localIDC is null from registry,localIDC:{},cluster:{}",
                        localIdc, cluster);
```

### SizeReplaceableByIsEmpty
`addr.length() > 0` can be replaced with '!addr.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/RemotingHelper.java`
#### Snippet
```java
        final String addr = channel.localAddress() != null ? channel.localAddress().toString() : "";

        if (addr.length() > 0) {
            final int index = addr.lastIndexOf('/');
            if (index >= 0) {
```

### SizeReplaceableByIsEmpty
`addr.length() > 0` can be replaced with '!addr.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/RemotingHelper.java`
#### Snippet
```java
        final String addr = channel.remoteAddress() != null ? channel.remoteAddress().toString() : "";

        if (addr.length() > 0) {
            final int index = addr.lastIndexOf('/');
            if (index >= 0) {
```

### SizeReplaceableByIsEmpty
`json.length() == 0` can be replaced with 'json.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/JsonUtils.java`
#### Snippet
```java

    public static <T> T deserialize(Class<T> clazz, String json) throws IOException {
        if (json == null || json.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`listenSessionSet.size() > 0` can be replaced with '!listenSessionSet.isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/ShowListenClientByTopicHandler.java`
#### Snippet
```java
                for (ClientGroupWrapper cgw : clientGroupMap.values()) {
                    Set<Session> listenSessionSet = cgw.getTopic2sessionInGroupMapping().get(topic);
                    if (listenSessionSet != null && listenSessionSet.size() > 0) {
                        result.append(String.format("group:%s", cgw.getGroup())).append(newLine);
                        for (Session session : listenSessionSet) {
```

### SizeReplaceableByIsEmpty
`sendMessageRequestBody.getExtFields().size() > 0` can be replaced with '!sendMessageRequestBody.getExtFields().isEmpty()'
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/http/SendMessageRequestProtocolResolver.java`
#### Snippet
```java
                    cloudEventBuilder = cloudEventBuilder.withExtension(SendMessageRequestBody.TAG, sendMessageRequestBody.getTag());
                }
                if (sendMessageRequestBody.getExtFields() != null && sendMessageRequestBody.getExtFields().size() > 0) {
                    for (Map.Entry<String, String> entry : sendMessageRequestBody.getExtFields().entrySet()) {
                        cloudEventBuilder = cloudEventBuilder.withExtension(entry.getKey(), entry.getValue());
```

### SizeReplaceableByIsEmpty
`sendMessageRequestBody.getExtFields().size() > 0` can be replaced with '!sendMessageRequestBody.getExtFields().isEmpty()'
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/http/SendMessageRequestProtocolResolver.java`
#### Snippet
```java
                    cloudEventBuilder = cloudEventBuilder.withExtension(SendMessageRequestBody.TAG, sendMessageRequestBody.getTag());
                }
                if (sendMessageRequestBody.getExtFields() != null && sendMessageRequestBody.getExtFields().size() > 0) {
                    for (Map.Entry<String, String> entry : sendMessageRequestBody.getExtFields().entrySet()) {
                        cloudEventBuilder = cloudEventBuilder.withExtension(entry.getKey(), entry.getValue());
```

### SizeReplaceableByIsEmpty
`eventMeshRegisterInfoMap.size() > 0` can be replaced with '!eventMeshRegisterInfoMap.isEmpty()'
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
        @Override
        public void run() {
            if (eventMeshRegisterInfoMap.size() > 0) {
                for (Map.Entry<String, EventMeshRegisterInfo> eventMeshRegisterInfoEntry : eventMeshRegisterInfoMap.entrySet()) {
                    EventMeshRegisterInfo eventMeshRegisterInfo = eventMeshRegisterInfoEntry.getValue();
```

### SizeReplaceableByIsEmpty
`tags.length() > 0` can be replaced with '!tags.isEmpty()'
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/cloudevent/impl/RocketMQMessageWriter.java`
#### Snippet
```java
        message.setTopic(topic);

        if (tags != null && tags.length() > 0) {
            message.setTags(tags);
        }
```

### SizeReplaceableByIsEmpty
`keys.length() > 0` can be replaced with '!keys.isEmpty()'
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/cloudevent/impl/RocketMQMessageWriter.java`
#### Snippet
```java
        }

        if (keys != null && keys.length() > 0) {
            message.setKeys(keys);
        }
```

### SizeReplaceableByIsEmpty
`keys.length() > 0` can be replaced with '!keys.isEmpty()'
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/cloudevent/impl/RocketMQMessageWriter.java`
#### Snippet
```java
        message.setTopic(topic);

        if (keys != null && keys.length() > 0) {
            message.setKeys(keys);
        }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/response/TopicResponse.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopicResponse {topic=" + this.topic + ",");
        sb.append("created_time=" + this.createdTime + "}");
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
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/BaseRequestHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("baseRequestHeader={code=")
                .append(code).append("}");
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
    public static String buildMeshTcpClientID(final String clientSysId, final String purpose,
                                              final String meshCluster) {
        return new StringBuilder().append(StringUtils.trim(clientSysId))
                .append('-')
                .append(StringUtils.trim(purpose))
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

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
            notification.consumerGroupConfig = EventMeshUtil.cloneObject(latestConsumerGroupConfig);
            eventMeshHTTPServer.getEventBus().post(notification);
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
            if (event.action == ConsumerGroupStateEvent.ConsumerGroupStateAction.DELETE) {
                delConsumer(event.consumerGroup);
                return;
            }
        } catch (Exception ex) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendSyncMessageProcessor.java`
#### Snippet
```java
        }

        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncMessageProcessor.java`
#### Snippet
```java
        }

        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageProcessor.java`
#### Snippet
```java
        asyncContext.onComplete(responseEventMeshCommand);

        return;
    }

```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ThreadPoolFactory` has no concrete subclass
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/ThreadPoolFactory.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public abstract class ThreadPoolFactory {

    private ThreadPoolFactory() {
```

### AbstractClassNeverImplemented
Abstract class `RemotingHelper` has no concrete subclass
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/RemotingHelper.java`
#### Snippet
```java


public abstract class RemotingHelper {

    public static String exceptionSimpleDesc(final Throwable e) {
```

### AbstractClassNeverImplemented
Abstract class `AbstractWebHookConfigOperation` has no concrete subclass
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/AbstractWebHookConfigOperation.java`
#### Snippet
```java
package org.apache.eventmesh.webhook.receive.storage;

public abstract class AbstractWebHookConfigOperation {

}
```

### AbstractClassNeverImplemented
Abstract class `Command` has no concrete subclass
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/admin/command/Command.java`
#### Snippet
```java

@Data
public abstract class Command {
    protected DefaultMQAdminExt adminExt;

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends InetSocketAddress`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java
    }

    public static String addressToString(List<InetSocketAddress> clients) {
        if (clients.isEmpty()) {
            return "no session had been closed";
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
    }

    private static void getIpResult(List<String> ipv4Result, List<String> ipv6Result,
                                    Enumeration<InetAddress> en) {
        while (en.hasMoreElements()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
    }

    private static void getIpResult(List<String> ipv4Result, List<String> ipv6Result,
                                    Enumeration<InetAddress> en) {
        while (en.hasMoreElements()) {
```

### BoundedWildcard
Can generalize to `? extends InetAddress`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java

    private static void getIpResult(List<String> ipv4Result, List<String> ipv6Result,
                                    Enumeration<InetAddress> en) {
        while (en.hasMoreElements()) {
            final InetAddress address = en.nextElement();
```

### BoundedWildcard
Can generalize to `? extends IPAddress`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
    }

    private static boolean isReservedIp(IPAddress ipAddress, List<IPAddress> reservedIps) {
        for (IPAddress address : reservedIps) {
            if (address.contains(ipAddress)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/Header.java`
#### Snippet
```java
    }

    public Header(int code, String desc, String seq, Map<String, Object> properties) {
        this.code = code;
        this.desc = desc;
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/RegRequestBody.java`
#### Snippet
```java
    }

    public static RegRequestBody buildBody(Map<String, Object> bodyParam) {
        RegRequestBody body = new RegRequestBody();
        body.setClientType(MapUtils.getString(bodyParam, CLIENTTYPE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/SubscribeRequestBody.java`
#### Snippet
```java
    }

    public static SubscribeRequestBody buildBody(Map<String, Object> bodyParam) {
        SubscribeRequestBody body = new SubscribeRequestBody();
        body.setUrl(MapUtils.getString(bodyParam, URL));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/HeartbeatRequestBody.java`
#### Snippet
```java
    private List<HeartbeatEntity> heartbeatEntities;

    public static HeartbeatRequestBody buildBody(Map<String, Object> bodyParam) {
        HeartbeatRequestBody body = new HeartbeatRequestBody();
        body.setClientType(MapUtils.getString(bodyParam, CLIENTTYPE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/UnSubscribeRequestBody.java`
#### Snippet
```java
    }

    public static UnSubscribeRequestBody buildBody(Map<String, Object> bodyParam) {
        UnSubscribeRequestBody body = new UnSubscribeRequestBody();
        body.setUrl(MapUtils.getString(bodyParam, URL));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/client/UnRegRequestBody.java`
#### Snippet
```java
    }

    public static UnRegRequestBody buildBody(Map<String, Object> bodyParam) {
        UnRegRequestBody body = new UnRegRequestBody();
        body.setClientType(MapUtils.getString(bodyParam, CLIENTTYPE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchV2RequestBody.java`
#### Snippet
```java
    }

    public static SendMessageBatchV2RequestBody buildBody(final Map<String, Object> bodyParam) {
        String bizSeqno = MapUtils.getString(bodyParam,
                BIZSEQNO);
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageRequestBody.java`
#### Snippet
```java
    }

    public static SendMessageRequestBody buildBody(Map<String, Object> bodyParam) {
        SendMessageRequestBody body = new SendMessageRequestBody();
        body.setTopic(MapUtils.getString(bodyParam, TOPIC));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/BaseRequestHeader.java`
#### Snippet
```java
    }

    public static BaseRequestHeader buildHeader(Map<String, Object> headerParam) {
        BaseRequestHeader header = new BaseRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/SendMessageBatchRequestBody.java`
#### Snippet
```java
    }

    public static SendMessageBatchRequestBody buildBody(final Map<String, Object> bodyParam) {
        String batchId = MapUtils.getString(bodyParam,
                BATCHID);
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/PushMessageRequestBody.java`
#### Snippet
```java
    }

    public static PushMessageRequestBody buildBody(final Map<String, Object> bodyParam) {
        PushMessageRequestBody pushMessageRequestBody = new PushMessageRequestBody();
        pushMessageRequestBody.setContent(MapUtils.getString(bodyParam, CONTENT));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/body/message/ReplyMessageRequestBody.java`
#### Snippet
```java
    }

    public static ReplyMessageRequestBody buildBody(Map<String, Object> bodyParam) {
        ReplyMessageRequestBody body = new ReplyMessageRequestBody();
        body.setBizSeqNo(MapUtils.getString(bodyParam, BIZSEQNO));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/RegRequestHeader.java`
#### Snippet
```java
    private String passwd;

    public static RegRequestHeader buildHeader(Map<String, Object> headerParam) {
        RegRequestHeader header = new RegRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/UnSubscribeRequestHeader.java`
#### Snippet
```java
    private String passwd;

    public static UnSubscribeRequestHeader buildHeader(Map<String, Object> headerParam) {
        UnSubscribeRequestHeader header = new UnSubscribeRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/SubscribeRequestHeader.java`
#### Snippet
```java
    private String passwd;

    public static SubscribeRequestHeader buildHeader(Map<String, Object> headerParam) {
        SubscribeRequestHeader header = new SubscribeRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/UnRegRequestHeader.java`
#### Snippet
```java
    private String passwd = "user@123";

    public static UnRegRequestHeader buildHeader(Map<String, Object> headerParam) {
        UnRegRequestHeader header = new UnRegRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/client/HeartbeatRequestHeader.java`
#### Snippet
```java
    }

    public static HeartbeatRequestHeader buildHeader(Map<String, Object> headerParam) {
        HeartbeatRequestHeader header = new HeartbeatRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageBatchRequestHeader.java`
#### Snippet
```java
    }

    public static SendMessageBatchRequestHeader buildHeader(final Map<String, Object> headerParam) {
        SendMessageBatchRequestHeader header = new SendMessageBatchRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageBatchV2RequestHeader.java`
#### Snippet
```java
    }

    public static SendMessageBatchV2RequestHeader buildHeader(final Map<String, Object> headerParam) {
        SendMessageBatchV2RequestHeader header = new SendMessageBatchV2RequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/ReplyMessageRequestHeader.java`
#### Snippet
```java
    }

    public static ReplyMessageRequestHeader buildHeader(Map<String, Object> headerParam) {
        ReplyMessageRequestHeader header = new ReplyMessageRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/SendMessageRequestHeader.java`
#### Snippet
```java
    }

    public static SendMessageRequestHeader buildHeader(Map<String, Object> headerParam) {
        SendMessageRequestHeader header = new SendMessageRequestHeader();
        header.setCode(MapUtils.getString(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/header/message/PushMessageRequestHeader.java`
#### Snippet
```java
    }

    public static PushMessageRequestHeader buildHeader(final Map<String, Object> headerParam) {
        PushMessageRequestHeader pushMessageRequestHeader = new PushMessageRequestHeader();
        pushMessageRequestHeader.setCode(MapUtils.getIntValue(headerParam, ProtocolKey.REQUEST_CODE));
```

### BoundedWildcard
Can generalize to `? extends Weight`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/loadbalance/WeightRoundRobinLoadBalanceSelector.java`
#### Snippet
```java
    private final transient int totalWeight;

    public WeightRoundRobinLoadBalanceSelector(List<Weight<T>> clusterGroup) {
        int totalWeight = 0;
        for (Weight<T> weight : clusterGroup) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/loadbalance/RandomLoadBalanceSelector.java`
#### Snippet
```java
    private final transient List<T> clusterGroup;

    public RandomLoadBalanceSelector(List<T> clusterGroup) {
        this.clusterGroup = clusterGroup;
    }
```

### BoundedWildcard
Can generalize to `? extends Weight`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/loadbalance/WeightRandomLoadBalanceSelector.java`
#### Snippet
```java
    private transient boolean sameWeightGroup = true;

    public WeightRandomLoadBalanceSelector(List<Weight<T>> clusterGroup) throws EventMeshException {
        if (CollectionUtils.isEmpty(clusterGroup)) {
            throw new EventMeshException("clusterGroup can not be empty");
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumer/SubscriptionManager.java`
#### Snippet
```java

    public void registerClient(final ClientInfo clientInfo, final String consumerGroup,
                               final List<SubscriptionItem> subscriptionItems, final String url) {
        for (final SubscriptionItem subscription : subscriptionItems) {
            final String groupTopicKey = consumerGroup + "@" + subscription.getTopic();
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumer/SubscriptionManager.java`
#### Snippet
```java

    public void updateSubscription(ClientInfo clientInfo, String consumerGroup,
                                   String url, List<SubscriptionItem> subscriptionList) {
        for (final SubscriptionItem subscription : subscriptionList) {
            final List<Client> groupTopicClients = localClientInfoMapping
```

### BoundedWildcard
Can generalize to `? extends Session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/dispatch/FreePriorityDispatchStrategy.java`
#### Snippet
```java

    @Override
    public Session select(final String group, final String topic, final Set<Session> groupConsumerSessions) {
        if (CollectionUtils.isEmpty(groupConsumerSessions)
                || StringUtils.isBlank(topic)
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
    }

    public void subscribe(List<SubscriptionItem> items) throws Exception {
        for (SubscriptionItem item : items) {
            sessionContext.subscribeTopics.putIfAbsent(item.getTopic(), item);
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
    }

    public void unsubscribe(List<SubscriptionItem> items) throws Exception {
        for (SubscriptionItem item : items) {
            sessionContext.subscribeTopics.remove(item.getTopic());
```

### BoundedWildcard
Can generalize to `? super SimpleMessage`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java

    public static void sendStreamResp(RequestHeader header, StatusCode code, String message,
                                      EventEmitter<SimpleMessage> emitter) {
        Map<String, String> resp = new HashMap<>();
        resp.put(EventMeshConstants.RESP_CODE, code.getRetCode());
```

### BoundedWildcard
Can generalize to `? super Response`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
    }

    public static void sendRespAndDone(StatusCode code, String message, EventEmitter<Response> emitter) {
        Response response = Response.newBuilder()
                .setRespCode(code.getRetCode())
```

### BoundedWildcard
Can generalize to `? super SimpleMessage`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java

    public static void sendStreamRespAndDone(RequestHeader header, StatusCode code,
                                             EventEmitter<SimpleMessage> emitter) {
        Map<String, String> resp = new HashMap<>();
        resp.put(EventMeshConstants.RESP_CODE, code.getRetCode());
```

### BoundedWildcard
Can generalize to `? super Response`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
    }

    public static void sendRespAndDone(StatusCode code, EventEmitter<Response> emitter) {
        Response response = Response.newBuilder()
                .setRespCode(code.getRetCode())
```

### BoundedWildcard
Can generalize to `? extends List`>
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/StreamTopicConfig.java`
#### Snippet
```java

    private static List<EventEmitter<SimpleMessage>> buildTotalEmitter(
            final Map<String, List<EventEmitter<SimpleMessage>>> idcEmitters) {
        final List<EventEmitter<SimpleMessage>> emitterList = new LinkedList<>();
        idcEmitters.values().forEach(emitterList::addAll);
```

### BoundedWildcard
Can generalize to `? extends Map`>
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/StreamTopicConfig.java`
#### Snippet
```java

    private static Map<String, List<EventEmitter<SimpleMessage>>> buildIdcEmitter(
            final Map<String, Map<String, EventEmitter<SimpleMessage>>> idcEmitterMap) {
        final Map<String, List<EventEmitter<SimpleMessage>>> result = new HashMap<>();
        idcEmitterMap.forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/async/AsyncContext.java`
#### Snippet
```java
    }

    public void onComplete(final T response, CompleteHandler<T> handler) {
        Preconditions.checkState(Objects.nonNull(response), "response cant be null");
        Preconditions.checkState(Objects.nonNull(handler), "handler cant be null");
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java

    private void registerClientForSub(final SubscribeRequestHeader subscribeRequestHeader, final String consumerGroup,
                                      final List<SubscriptionItem> subscriptionItems, final String url) {
        Objects.requireNonNull(subscribeRequestHeader, "subscribeRequestHeader can not be null");
        Objects.requireNonNull(consumerGroup, "consumerGroup can not be null");
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java

    public boolean addSubscription(final String consumerGroup, final String url, final String clientIdc,
                                   final List<SubscriptionItem> subscriptionList) {
        Objects.requireNonNull(url, "url can not be null");
        Objects.requireNonNull(consumerGroup, "consumerGroup can not be null");
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AsyncHTTPPushRequest.java`
#### Snippet
```java

    public AsyncHTTPPushRequest(HandleMsgContext handleMsgContext,
                                Map<String, Set<AbstractHTTPPushRequest>> waitingRequests) {
        super(handleMsgContext);
        this.waitingRequests = waitingRequests;
```

### BoundedWildcard
Can generalize to `? extends Client`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HeartBeatProcessor.java`
#### Snippet
```java
    }

    private void supplyClientInfoList(final List<Client> tmpClientList, final List<Client> localClientList) {
        Objects.requireNonNull(tmpClientList, "tmpClientList can not be null");
        Objects.requireNonNull(localClientList, "localClientList can not be null");
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/AbstractEventProcessor.java`
#### Snippet
```java


    protected String getTargetMesh(String consumerGroup, List<SubscriptionItem> subscriptionList)
            throws Exception {
        // Currently only supports http
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
    }

    private static void getIpResult(final List<String> ipv4Result, final List<String> ipv6Result,
                                    final Enumeration<InetAddress> en) {
        while (en.hasMoreElements()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
    }

    private static void getIpResult(final List<String> ipv4Result, final List<String> ipv6Result,
                                    final Enumeration<InetAddress> en) {
        while (en.hasMoreElements()) {
```

### BoundedWildcard
Can generalize to `? extends InetAddress`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java

    private static void getIpResult(final List<String> ipv4Result, final List<String> ipv6Result,
                                    final Enumeration<InetAddress> en) {
        while (en.hasMoreElements()) {
            final InetAddress address = en.nextElement();
```

### BoundedWildcard
Can generalize to `? extends InetSocketAddress`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/RejectClientBySubSystemHandler.java`
#### Snippet
```java
    }

    private String printClients(List<InetSocketAddress> clients) {
        if (clients == null || clients.isEmpty()) {
            return "no session had been closed";
```

### BoundedWildcard
Can generalize to `? extends MetricsRegistry`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/metrics/http/HTTPMetricsServer.java`
#### Snippet
```java

    public HTTPMetricsServer(final EventMeshHTTPServer eventMeshHTTPServer,
        final List<MetricsRegistry> metricsRegistries) {
        Objects.requireNonNull(eventMeshHTTPServer, "EventMeshHTTPServer can not be null");
        Objects.requireNonNull(metricsRegistries, "List<MetricsRegistry> can not be null");
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
    private transient Map<String, WebHookConfig> cacheWebHookConfig;

    public WebhookFileListener(final String filePath, final Map<String, WebHookConfig> cacheWebHookConfig) {
        this.filePath = WebHookOperationConstant.getFilePath(filePath);
        this.cacheWebHookConfig = cacheWebHookConfig;
```

### BoundedWildcard
Can generalize to `? super WebHookConfig`
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
    private transient Map<String, WebHookConfig> cacheWebHookConfig;

    public WebhookFileListener(final String filePath, final Map<String, WebHookConfig> cacheWebHookConfig) {
        this.filePath = WebHookOperationConstant.getFilePath(filePath);
        this.cacheWebHookConfig = cacheWebHookConfig;
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/WebhookFileListener.java`
#### Snippet
```java
     * @param pathSet folder's path set
     */
    private void loopDirInsertToSet(final File parent, final Set<String> pathSet) {
        if (!parent.isDirectory()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends RequestContext`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/AbstractEventMeshTCPPubHandler.java`
#### Snippet
```java
    private final ConcurrentHashMap<Object, RequestContext> contexts;

    public AbstractEventMeshTCPPubHandler(ConcurrentHashMap<Object, RequestContext> contexts) {
        this.contexts = contexts;
    }
```

### BoundedWildcard
Can generalize to `? super CloudEvent`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPSubClient.java`
#### Snippet
```java

    @Override
    public void registerBusiHandler(ReceiveMsgHook<CloudEvent> handler) throws EventMeshException {
        this.callback = handler;
    }
```

### BoundedWildcard
Can generalize to `? super CloudEvent`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java

    @Override
    public void registerBusiHandler(ReceiveMsgHook<CloudEvent> handler) throws EventMeshException {
        callback = handler;
    }
```

### BoundedWildcard
Can generalize to `? super EventMeshMessage`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java

    @Override
    public void registerBusiHandler(ReceiveMsgHook<EventMeshMessage> receiveMsgHook) throws EventMeshException {
        this.callback = receiveMsgHook;
    }
```

### BoundedWildcard
Can generalize to `? super EventMeshMessage`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPSubClient.java`
#### Snippet
```java

    @Override
    public void registerBusiHandler(ReceiveMsgHook<EventMeshMessage> receiveMsgHook) throws EventMeshException {
        this.callback = receiveMsgHook;
    }
```

### BoundedWildcard
Can generalize to `? extends CloudEvent`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java
    }

    public Response publish(final List<CloudEvent> events) {
        if (log.isInfoEnabled()) {
            log.info("BatchPublish message, batch size={}", events.size());
```

### BoundedWildcard
Can generalize to `? super ProtocolMessage`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/RRCallbackResponseHandlerAdapter.java`
#### Snippet
```java
    private final transient long timeout;

    public RRCallbackResponseHandlerAdapter(final ProtocolMessage protocolMessage, final RRCallback<ProtocolMessage> rrCallback,
                                            final long timeout) {
        Objects.requireNonNull(rrCallback, "rrCallback invalid");
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/consumer/EventMeshHttpConsumer.java`
#### Snippet
```java

    // todo: remove http heartBeat?
    public void heartBeat(final List<SubscriptionItem> topicList, final String subscribeUrl) {
        Objects.requireNonNull(topicList, "Subscribe item cannot be null");
        Objects.requireNonNull(subscribeUrl, "SubscribeUrl cannot be null");
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/consumer/EventMeshHttpConsumer.java`
#### Snippet
```java
     * @throws EventMeshException if subscribe failed
     */
    public void subscribe(final List<SubscriptionItem> topicList, final String subscribeUrl) throws EventMeshException {
        Objects.requireNonNull(topicList, "Subscribe item cannot be null");
        Objects.requireNonNull(subscribeUrl, "SubscribeUrl cannot be null");
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-trace-plugin/eventmesh-trace-jaeger/src/main/java/org/apache/eventmesh/trace/jaeger/JaegerTraceService.java`
#### Snippet
```java

    @Override
    public void inject(final Context context, final Map<String, Object> carrier) {
        textMapPropagator.inject(context, carrier, (cr, key, value) -> {
            if (cr != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/PinpointTraceService.java`
#### Snippet
```java

    @Override
    public void inject(final Context context, final Map<String, Object> carrier) {
        textMapPropagator.inject(context, carrier, (cr, key, value) -> {
            if (cr != null) {
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
    }

    public Subscription buildSubscription(final List<SubscriptionItem> subscriptionItems, final String url) {
        Objects.requireNonNull(subscriptionItems, "subscriptionItems can not be null");

```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
    }

    private void addSubscription(final List<SubscriptionItem> subscriptionItems, final String url) {
        for (SubscriptionItem item : subscriptionItems) {
            subscriptionMap.putIfAbsent(item.getTopic(), new SubscriptionInfo(item, url));
```

### BoundedWildcard
Can generalize to `? extends SubscriptionItem`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
    }

    private void removeSubscription(final List<SubscriptionItem> subscriptionItems) {
        Objects.requireNonNull(subscriptionItems, "subscriptionItems can not be null");
        subscriptionItems.forEach(item -> {
```

### BoundedWildcard
Can generalize to `? extends CloudEvent`
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    }

    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        Long maxOffset = cloudEvents.stream().map(cloudEvent -> this.kafkaConsumerRunner.getOffset(cloudEvent)).max(Long::compare).get();
        cloudEvents.forEach(cloudEvent -> this.updateOffset(cloudEvent.getSubject(), maxOffset));
```

### BoundedWildcard
Can generalize to `? extends CloudEvent`
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // todo: offset
    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        cloudEvents.forEach(cloudEvent -> this.updateOffset(
                cloudEvent.getSubject(), (Long) cloudEvent.getExtension("offset"))
```

### BoundedWildcard
Can generalize to `? extends CloudEvent`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
    }

    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        ConsumeMessageService consumeMessageService = rocketmqPushConsumer
            .getDefaultMQPushConsumerImpl().getConsumeMessageService();
```

### BoundedWildcard
Can generalize to `? super String`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java
     * @param <V>        v
     */
    private static <T, V> void initProperty(T source, V target, Function<T, String> function, BiConsumer<V, String> biConsumer) {
        String apply = function.apply(source);
        if (Objects.nonNull(apply)) {
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/task/HistoryMessageClearTask.java`
#### Snippet
```java
    private static final long MESSAGE_STORE_WINDOW = 60 * 60 * 1000;

    public HistoryMessageClearTask(ConcurrentHashMap<TopicMetadata, MessageQueue> messageContainer) {
        this.messageContainer = messageContainer;
    }
```

### BoundedWildcard
Can generalize to `? extends CloudEvent`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/consumer/StandaloneConsumer.java`
#### Snippet
```java

    @Override
    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        cloudEvents.forEach(cloudEvent -> standaloneBroker.updateOffset(
                new TopicMetadata(cloudEvent.getSubject()), Objects.requireNonNull((Long) cloudEvent.getExtension("offset")))
```

### BoundedWildcard
Can generalize to `? extends MessageExt`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
    }

    public void resetRetryTopic(final List<MessageExt> msgs) {
        final String groupTopic = MixAll.getRetryTopic(consumerGroup);
        for (MessageExt msg : msgs) {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @Nullable`
in `eventmesh-trace-plugin/eventmesh-trace-jaeger/src/main/java/org/apache/eventmesh/trace/jaeger/JaegerTraceService.java`
#### Snippet
```java
            @Nullable
            @Override
            public String get(final @Nullable Map<String, Object> carrier, final String key) {
                return Optional.ofNullable(carrier.get(key)).map(Objects::toString).orElse(null);
            }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/PinpointTraceService.java`
#### Snippet
```java

            @Override
            public String get(final Map<String, Object> carrier, final @Nonnull String key) {
                return Optional.ofNullable(carrier.get(key)).map(Objects::toString).orElse(null);
            }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/PinpointTraceService.java`
#### Snippet
```java
        textMapPropagator.extract(context, carrier, new TextMapGetter<Map<String, Object>>() {
            @Override
            public Iterable<String> keys(final @Nonnull Map<String, Object> carrier) {
                return carrier.keySet();
            }
```

## RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/MessageQueue.java`
#### Snippet
```java
        lock.lockInterruptibly();
        try {
            while (count == 0) {
                notEmpty.await();
            }
```

## RuleId[ruleID=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/producer/AbstractProducer.java`
#### Snippet
```java
    ConnectorRuntimeException checkProducerException(CloudEvent cloudEvent, Throwable e) {
        if (cloudEvent.getData() == null) {
            return new ConnectorRuntimeException(String.format("CloudEvent message data does not exist.", e));
        }
        return new ConnectorRuntimeException(String.format("Unknown connector runtime exception.", e));
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/producer/AbstractProducer.java`
#### Snippet
```java
            return new ConnectorRuntimeException(String.format("CloudEvent message data does not exist.", e));
        }
        return new ConnectorRuntimeException(String.format("Unknown connector runtime exception.", e));
    }

```

### MalformedFormatString
Format string `"Failed to connect pulsar with exception: %"` is malformed
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/consumer/PulsarConsumerImpl.java`
#### Snippet
```java
        } catch (Exception ex) {
            throw new ConnectorRuntimeException(
              String.format("Failed to connect pulsar with exception: %", ex.getMessage()));
        }
    }
```

## RuleId[ruleID=DefaultAnnotationParam]
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshTCPConfiguration.java`
#### Snippet
```java
    public boolean eventMeshTcpSendBackEnabled = Boolean.TRUE;

    @ConfigFiled(field = "")
    public int eventMeshTcpSendBackMaxTimes = 3;

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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshGrpcConfiguration.java`
#### Snippet
```java
    private int eventMeshMsgReqNumPerSecond = 15000;

    @ConfigFiled(field = "", reload = true)
    private String eventMeshIp;

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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshHTTPConfiguration.java`
#### Snippet
```java
    private int eventMeshServerSendMsgBlockQSize = 1000;

    @ConfigFiled(field = "")
    private int eventMeshServerRemoteMsgBlockQSize = 1000;

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
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/config/PinpointConfiguration.java`
#### Snippet
```java
    private String applicationName;

    @ConfigFiled(field = "", reload = true)
    private Properties grpcTransportProperties;

```

## RuleId[ruleID=RedundantMethodOverride]
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
Method `getGrpcType()` is identical to its super method
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
    }

    public GrpcType getGrpcType() {
        return grpcType;
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

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
retryTimes \* EventMeshConstants.DEFAULT_PUSH_RETRY_TIME_DISTANCE_IN_MILLSECONDS: integer multiplication implicitly cast to long
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AbstractHTTPPushRequest.java`
#### Snippet
```java
        if (retryTimes < EventMeshConstants.DEFAULT_PUSH_RETRY_TIMES) {
            retryTimes++;
            delay(retryTimes * EventMeshConstants.DEFAULT_PUSH_RETRY_TIME_DISTANCE_IN_MILLSECONDS);
            retryer.pushRetry(this);
        } else {
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ListConverter.java`
#### Snippet
```java
        @Override
        public List<Object> convert(ConvertInfo convertInfo) {
            return super.convert(convertInfo, this.getSeparator());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
            LOGGER.info("==================EventMeshHTTPServer Initialing==================");
        }
        super.init("eventMesh-http");

        initThreadPool();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java

    private void initThreadPool() throws Exception {
        super.init("eventMesh-tcp");

        scheduler = ThreadPoolFactory.createScheduledExecutor(eventMeshTCPConfiguration.eventMeshTcpGlobalScheduler,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
    public void init() throws EventMeshException {
        try {
            super.open(new CloudEventTCPPubHandler(contexts));
            super.hello();
            super.heartbeat();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
        try {
            super.open(new CloudEventTCPPubHandler(contexts));
            super.hello();
            super.heartbeat();
        } catch (Exception ex) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
            super.open(new CloudEventTCPPubHandler(contexts));
            super.hello();
            super.heartbeat();
        } catch (Exception ex) {
            throw new EventMeshException("Initialize EventMeshMessageTCPPubClient error", ex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
        try {
            super.reconnect();
            super.hello();
        } catch (Exception ex) {
            throw new EventMeshException("reconnect error", ex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
            log.info("{}|publish|send|type={}|protocol={}|msg={}", CLIENTNO, msg.getHeader().getCmd(),
                    msg.getHeader().getProperty(Constants.PROTOCOL_TYPE), msg);
            super.send(msg);
        } catch (Exception ex) {
            throw new EventMeshException("Broadcast message error", ex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
        try {
            Package msg = MessageUtils.buildPackage(event, Command.REQUEST_TO_SERVER);
            super.send(msg);
            this.callbackConcurrentHashMap.put((String) RequestContext.key(msg), callback);
        } catch (Exception ex) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java
            log.info("{}|publish|send|type={}|protocol={}|msg={}", CLIENTNO, msg.getHeader().getCmd(),
                    msg.getHeader().getProperty(Constants.PROTOCOL_TYPE), msg);
            super.send(msg);
        } catch (Exception e) {
            throw new EventMeshException("Broadcast message error", e);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java
        try {
            Package msg = MessageUtils.buildPackage(eventMeshMessage, Command.REQUEST_TO_SERVER);
            super.send(msg);
            this.callbackConcurrentHashMap.put((String) RequestContext.key(msg), callback);
        } catch (Exception e) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/producer/ProducerImpl.java`
#### Snippet
```java
        // Set HTTP header, body and send CloudEvent message:
        try {
            ListenableFuture<Response> execute = super.getAsyncHttpClient().preparePost("http://" + this.attributes().getProperty("url"))
                .addHeader(KnativeHeaders.CONTENT_TYPE, cloudEvent.getDataContentType())
                .addHeader(KnativeHeaders.CE_ID, cloudEvent.getId())
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java

    public void setExtFields() {
        super.getRocketmqProducer().setRetryTimesWhenSendFailed(0);
        super.getRocketmqProducer().setRetryTimesWhenSendAsyncFailed(0);
        super.getRocketmqProducer().setPollNameServerInterval(60000);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
    public void setExtFields() {
        super.getRocketmqProducer().setRetryTimesWhenSendFailed(0);
        super.getRocketmqProducer().setRetryTimesWhenSendAsyncFailed(0);
        super.getRocketmqProducer().setPollNameServerInterval(60000);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        super.getRocketmqProducer().setRetryTimesWhenSendFailed(0);
        super.getRocketmqProducer().setRetryTimesWhenSendAsyncFailed(0);
        super.getRocketmqProducer().setPollNameServerInterval(60000);

        super.getRocketmqProducer().getDefaultMQProducerImpl().getmQClientFactory().getNettyClientConfig()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        super.getRocketmqProducer().setPollNameServerInterval(60000);

        super.getRocketmqProducer().getDefaultMQProducerImpl().getmQClientFactory().getNettyClientConfig()
                .setClientAsyncSemaphoreValue(eventMeshServerAsyncAccumulationThreshold);
        super.getRocketmqProducer().setCompressMsgBodyOverHowmuch(10);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        super.getRocketmqProducer().getDefaultMQProducerImpl().getmQClientFactory().getNettyClientConfig()
                .setClientAsyncSemaphoreValue(eventMeshServerAsyncAccumulationThreshold);
        super.getRocketmqProducer().setCompressMsgBodyOverHowmuch(10);
    }

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.http.Consts;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;

import java.io.BufferedReader;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedReader;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java
import org.apache.http.Consts;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.ByteArrayInputStream;`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
```

## RuleId[ruleID=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/task/HistoryMessageClearTask.java`
#### Snippet
```java
    @Override
    public void run() {
        while (true) {
            messageContainer.forEach((topicMetadata, messageQueue) -> {
                long currentTimeMillis = System.currentTimeMillis();
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`wholePushCost = wholePushCost + cost` could be simplified to 'wholePushCost += cost'
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    public void recordHTTPPushTimeCost(long cost) {
        wholePushRequestNum.incrementAndGet();
        wholePushCost = wholePushCost + cost;
        if (cost > maxHttpPushLatency.longValue()) {
            maxHttpPushLatency.set(cost);
```

### ReplaceAssignmentWithOperatorAssignment
`httpDecodeTimeCost = httpDecodeTimeCost + cost` could be simplified to 'httpDecodeTimeCost += cost'
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    public void recordDecodeTimeCost(long cost) {
        httpDecodeNum.incrementAndGet();
        httpDecodeTimeCost = httpDecodeTimeCost + cost;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`batchSend2MQWholeCost = batchSend2MQWholeCost + cost` could be simplified to 'batchSend2MQWholeCost += cost'
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    public void recordBatchSendMsgCost(long cost) {
        batchSend2MQNum.incrementAndGet();
        batchSend2MQWholeCost = batchSend2MQWholeCost + cost;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`wholeCost = wholeCost + cost` could be simplified to 'wholeCost += cost'
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    public void recordHTTPReqResTimeCost(long cost) {
        wholeRequestNum.incrementAndGet();
        wholeCost = wholeCost + cost;
        if (cost > maxCost.longValue()) {
            maxCost.set(cost);
```

### ReplaceAssignmentWithOperatorAssignment
`reply2MQWholeCost = reply2MQWholeCost + cost` could be simplified to 'reply2MQWholeCost += cost'
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    public void recordReplyMsgCost(long cost) {
        reply2MQNum.incrementAndGet();
        reply2MQWholeCost = reply2MQWholeCost + cost;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`send2MQWholeCost = send2MQWholeCost + cost` could be simplified to 'send2MQWholeCost += cost'
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    public void recordSendMsgCost(long cost) {
        send2MQNum.incrementAndGet();
        send2MQWholeCost = send2MQWholeCost + cost;
    }

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java
            char[] buffer = new char[256];
            int readIndex;
            while ((readIndex = reader.read(buffer)) != -1) {
                body.append(buffer, 0, readIndex);
            }
```

### NestedAssignment
Result of assignment expression used
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
                                Object pending = hierarchical.get(hierarchicalKey);
                                if (pending == null) {
                                    hierarchical.put(hierarchicalKey, hierarchical = new Properties());
                                } else if (pending instanceof Properties) {
                                    hierarchical = (Properties) pending;
```

### NestedAssignment
Result of assignment expression used
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/EventMeshTcpRetryer.java`
#### Snippet
```java
            try {
                RetryContext retryContext;
                while ((retryContext = retrys.take()) != null) {
                    pool.execute(retryContext::retry);
                }
```

### NestedAssignment
Result of assignment expression used
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/retry/GrpcRetryer.java`
#### Snippet
```java
                DelayRetryable retryObj = null;
                while (!Thread.currentThread().isInterrupted()
                    && (retryObj = failed.take()) != null) {
                    final DelayRetryable delayRetryable = retryObj;
                    pool.execute(() -> {
```

### NestedAssignment
Result of assignment expression used
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/retry/HttpRetryer.java`
#### Snippet
```java
            try {
                DelayRetryable retryObj;
                while (!Thread.currentThread().isInterrupted() && (retryObj = failed.take()) != null) {
                    final DelayRetryable delayRetryable = retryObj;
                    pool.execute(() -> {
```

### NestedAssignment
Result of assignment expression used
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/HttpExchangeUtils.java`
#### Snippet
```java
        int b;
        StringBuilder buffer = new StringBuilder();
        while ((b = bufferedReader.read()) != -1) {
            buffer.append((char) b);
        }
```

### NestedAssignment
Result of assignment expression used
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
                StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContent.append(line);
            }
```

## RuleId[ruleID=ExcessiveLambdaUsage]
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

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                for (Client client : clientList) {
                    GetClientResponse getClientResponse = new GetClientResponse(
                            Optional.ofNullable(client.getEnv()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getSys()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getUrl()).orElseGet(() -> ""),
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                    GetClientResponse getClientResponse = new GetClientResponse(
                            Optional.ofNullable(client.getEnv()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getSys()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getUrl()).orElseGet(() -> ""),
                            "0",
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                            Optional.ofNullable(client.getEnv()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getSys()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getUrl()).orElseGet(() -> ""),
                            "0",
                            Optional.ofNullable(client.getHostname()).orElseGet(() -> ""),
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                            Optional.ofNullable(client.getUrl()).orElseGet(() -> ""),
                            "0",
                            Optional.ofNullable(client.getHostname()).orElseGet(() -> ""),
                            0,
                            Optional.ofNullable(client.getApiVersion()).orElseGet(() -> ""),
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                            Optional.ofNullable(client.getHostname()).orElseGet(() -> ""),
                            0,
                            Optional.ofNullable(client.getApiVersion()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getIdc()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getConsumerGroup()).orElseGet(() -> ""),
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                            0,
                            Optional.ofNullable(client.getApiVersion()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getIdc()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getConsumerGroup()).orElseGet(() -> ""),
                            "",
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/HTTPClientHandler.java`
#### Snippet
```java
                            Optional.ofNullable(client.getApiVersion()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getIdc()).orElseGet(() -> ""),
                            Optional.ofNullable(client.getConsumerGroup()).orElseGet(() -> ""),
                            "",
                            "HTTP"
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshClientUtil.java`
#### Snippet
```java
                        .setSeqNum(message.getBizSeqNo())
                        .setTtl(Optional.ofNullable(message.getProp(Constants.EVENTMESH_MESSAGE_CONST_TTL))
                                .orElseGet(() -> Constants.DEFAULT_EVENTMESH_MESSAGE_TTL))
                        .putAllProperties(message.getProp())
                        .build();
```

## RuleId[ruleID=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshTCPConfiguration.java`
#### Snippet
```java
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Config(prefix = "eventMesh.server")
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshGrpcConfiguration.java`
#### Snippet
```java
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Config(prefix = "eventMesh.server")
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshHTTPConfiguration.java`
#### Snippet
```java
import inet.ipaddr.IPAddress;

@Data
@NoArgsConstructor
@Config(prefix = "eventMesh.server")
```

### Lombok
@Builder.Default requires an initializing expression (' = something;').
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/config/EventMeshGrpcClientConfig.java`
#### Snippet
```java

@Data
@Builder
public class EventMeshGrpcClientConfig {

```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/ConsumerManager.java`
#### Snippet
```java

                final List<ConsumerGroupClient> clientList = new LinkedList<>();
                clientTable.values().forEach(clients -> {
                    clientList.addAll(clients);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/StreamTopicConfig.java`
#### Snippet
```java
            final Map<String, Map<String, EventEmitter<SimpleMessage>>> idcEmitterMap) {
        final Map<String, List<EventEmitter<SimpleMessage>>> result = new HashMap<>();
        idcEmitterMap.forEach((k, v) -> {
            result.put(k, new LinkedList<EventEmitter<SimpleMessage>>(v.values()));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/HTTPMessageHandler.java`
#### Snippet
```java

    private void checkTimeout() {
        waitingRequests.forEach((key, value) -> {
            value.forEach(r -> {
                r.timeout();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/metrics/grpc/EventMeshGrpcMonitor.java`
#### Snippet
```java

    public void start() throws Exception {
        metricsRegistries.forEach(metricsRegistry -> {
            metricsRegistry.register(grpcSummaryMetrics);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/MessageUtils.java`
#### Snippet
```java
    private static String generateRandomString(int length) {
        final StringBuilder builder = new StringBuilder(length);
        IntStream.range(0, length).forEach(i -> {
            builder.append((char) ThreadLocalRandom.current().nextInt(48, 57));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshClientUtil.java`
#### Snippet
```java
                    .putProperties(ProtocolKey.CONTENT_TYPE, contentType);

            cloudEvent.getExtensionNames().forEach(extName -> {
                builder.putProperties(extName, Objects.requireNonNull(cloudEvent.getExtension(extName)).toString());
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
    private void removeSubscription(final List<SubscriptionItem> subscriptionItems) {
        Objects.requireNonNull(subscriptionItems, "subscriptionItems can not be null");
        subscriptionItems.forEach(item -> {
            subscriptionMap.remove(item.getTopic());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/client/PulsarClientWrapper.java`
#### Snippet
```java
                .resolveFormat(JsonFormat.CONTENT_TYPE)
                .serialize(cloudEvent);
            producer.sendAsync(serializedCloudEvent).thenAccept(messageId -> {
                sendCallback.onSuccess(CloudEventUtils.convertSendResult(cloudEvent));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java

    private void cleanExpireMsg() {
        this.defaultMQPushConsumerImpl.getRebalanceImpl().getProcessQueueTable().forEach((k, pq) -> {
            pq.cleanExpiredMsg(this.defaultMQPushConsumer);
        });
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `callbackConcurrentHashMap` are updated, but never queried
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java
    private ReceiveMsgHook<CloudEvent> callback;

    private final ConcurrentHashMap<String, AsyncRRCallback> callbackConcurrentHashMap = new ConcurrentHashMap<>();

    public CloudEventTCPPubClient(EventMeshTCPClientConfig eventMeshTcpClientConfig) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `callbackConcurrentHashMap` are updated, but never queried
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java
    private transient ReceiveMsgHook<EventMeshMessage> callback;

    private final transient ConcurrentHashMap<String, AsyncRRCallback> callbackConcurrentHashMap = new ConcurrentHashMap<>();

    public EventMeshMessageTCPPubClient(EventMeshTCPClientConfig eventMeshTcpClientConfig) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `subscriptionInner` are updated, but never queried
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // Store received message:
    private transient ConcurrentMap<String /* topic */, String /* responseBody */> subscriptionInner;
    private transient EventListener eventListener;

```

### MismatchedCollectionQueryUpdate
Contents of collection `wrapperMap` are updated, but never queried
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
    }

    private static final Map<Class<?>, Class<?>> wrapperMap = new HashMap<>();

    static {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `meshMQProducer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Producer meshMQProducer;

    public MQProducerWrapper(String connectorPluginType) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `meshMQAdmin` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Admin meshMQAdmin;

    public MQAdminWrapper(String connectorPluginType) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `meshMQPushConsumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java
    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Consumer meshMQPushConsumer;

    public MQConsumerWrapper(String connectorPluginType) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventMeshTCPServer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientSessionGroupMapping.java`
#### Snippet
```java
            new ConcurrentHashMap<String, Object>();

    private EventMeshTCPServer eventMeshTCPServer;

    public ClientSessionGroupMapping(EventMeshTCPServer eventMeshTCPServer) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventMeshTcpMonitor` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
    private EventMeshTcpRetryer eventMeshTcpRetryer;

    private EventMeshTcpMonitor eventMeshTcpMonitor;

    private DownstreamDispatchStrategy downstreamDispatchStrategy;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `group` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
    private final String sysId;

    private String group;

    private EventMeshTCPConfiguration eventMeshTCPConfiguration;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventMeshTCPConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
    private String group;

    private EventMeshTCPConfiguration eventMeshTCPConfiguration;

    private final EventMeshTCPServer eventMeshTCPServer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `broadCastMsgConsumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
    private MQConsumerWrapper persistentMsgConsumer;

    private MQConsumerWrapper broadCastMsgConsumer;

    private final ConcurrentHashMap<String, Set<Session>> topic2sessionInGroupMapping =
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `persistentMsgConsumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
    public AtomicBoolean inited4Broadcast = new AtomicBoolean(Boolean.FALSE);

    private MQConsumerWrapper persistentMsgConsumer;

    private MQConsumerWrapper broadCastMsgConsumer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `totalUrls` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
    private final Map<String, List<String>> idcUrls = new ConcurrentHashMap<>();

    private List<String> totalUrls = new LinkedList<>();

    public WebhookTopicConfig(String consumerGroup, String topic, SubscriptionMode subscriptionMode) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producerTable` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/ProducerManager.java`
#### Snippet
```java
    private EventMeshGrpcServer eventMeshGrpcServer;

    private ConcurrentHashMap<String, EventMeshProducer> producerTable = new ConcurrentHashMap<>();

    public ProducerManager(EventMeshGrpcServer eventMeshGrpcServer) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serviceState` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/EventMeshProducer.java`
#### Snippet
```java
    private MQProducerWrapper mqProducerWrapper;

    private ServiceState serviceState;

    public void send(SendMessageContext sendMsgContext, SendCallback sendCallback)
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mqProducerWrapper` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/EventMeshProducer.java`
#### Snippet
```java
    private ProducerGroupConf producerGroupConfig;

    private MQProducerWrapper mqProducerWrapper;

    private ServiceState serviceState;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producerGroupConfig` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/EventMeshProducer.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private ProducerGroupConf producerGroupConfig;

    private MQProducerWrapper mqProducerWrapper;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serviceState` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/EventMeshConsumer.java`
#### Snippet
```java
    private final transient MessageHandler messageHandler;

    private transient ServiceState serviceState;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `idcEmitters` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/StreamTopicConfig.java`
#### Snippet
```java
     * Value: list of emitters
     */
    private transient Map<String, List<EventEmitter<SimpleMessage>>> idcEmitters = new ConcurrentHashMap<>();

    private transient List<EventEmitter<SimpleMessage>> totalEmitters = new ArrayList<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `totalEmitters` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/StreamTopicConfig.java`
#### Snippet
```java
    private transient Map<String, List<EventEmitter<SimpleMessage>>> idcEmitters = new ConcurrentHashMap<>();

    private transient List<EventEmitter<SimpleMessage>> totalEmitters = new ArrayList<>();

    public StreamTopicConfig(final String consumerGroup, final String topic, final SubscriptionMode subscriptionMode) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventMeshConsumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
    private EventMeshHTTPServer eventMeshHTTPServer;

    private EventMeshConsumer eventMeshConsumer;

    private ConsumerGroupConf consumerGroupConfig;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerGroupConfig` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
    private EventMeshConsumer eventMeshConsumer;

    private ConsumerGroupConf consumerGroupConfig;

    public ConsumerGroupManager(EventMeshHTTPServer eventMeshHTTPServer, ConsumerGroupConf consumerGroupConfig) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producerTable` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
    private EventMeshHTTPServer eventMeshHTTPServer;

    private ConcurrentHashMap<String /** groupName*/, EventMeshProducer> producerTable = new ConcurrentHashMap<String, EventMeshProducer>();

    public ProducerManager(EventMeshHTTPServer eventMeshHTTPServer) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventMeshHTTPServer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/ProducerManager.java`
#### Snippet
```java
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    private EventMeshHTTPServer eventMeshHTTPServer;

    private ConcurrentHashMap<String /** groupName*/, EventMeshProducer> producerTable = new ConcurrentHashMap<String, EventMeshProducer>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producerGroupConfig` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
    }

    protected ProducerGroupConf producerGroupConfig;

    protected EventMeshHTTPConfiguration eventMeshHttpConfiguration;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mqProducerWrapper` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
    }

    protected MQProducerWrapper mqProducerWrapper;

    public MQProducerWrapper getMqProducerWrapper() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inited` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
    protected AtomicBoolean started = new AtomicBoolean(Boolean.FALSE);

    protected AtomicBoolean inited = new AtomicBoolean(Boolean.FALSE);

    public Logger logger = LoggerFactory.getLogger(this.getClass());
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `started` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
public class EventMeshProducer {

    protected AtomicBoolean started = new AtomicBoolean(Boolean.FALSE);

    protected AtomicBoolean inited = new AtomicBoolean(Boolean.FALSE);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventMeshHTTPServer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
public class ConsumerManager {

    private EventMeshHTTPServer eventMeshHTTPServer;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
    private static final int DEFAULT_UPDATE_TIME = 3 * 30 * 1000;

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    private ScheduledExecutorService scheduledExecutorService =
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerTable` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     * consumerGroup to ConsumerGroupManager.
     */
    private ConcurrentHashMap<String, ConsumerGroupManager> consumerTable =
            new ConcurrentHashMap<>();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
    private final AtomicBoolean inited4Broadcast = new AtomicBoolean(Boolean.FALSE);

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    public Logger messageLogger = LoggerFactory.getLogger("message");
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `httpMessageHandler` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
    }

    private MessageHandler httpMessageHandler;

    public synchronized void init() throws Exception {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerGroupConf` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
    public Logger messageLogger = LoggerFactory.getLogger("message");

    private ConsumerGroupConf consumerGroupConf;

    private final MQConsumerWrapper persistentMqConsumer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `registryService` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/registry/Registry.java`
#### Snippet
```java
    private volatile boolean started = false;

    private RegistryService registryService;

    public synchronized void init(String registryPluginType) throws Exception {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `channel` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
    private final transient EventLoopGroup workers = new NioEventLoopGroup();

    private transient Channel channel;

    private transient ScheduledFuture<?> heartTask;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `heartTask` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
    private transient Channel channel;

    private transient ScheduledFuture<?> heartTask;

    protected static final ScheduledExecutorService scheduler = ThreadPoolFactory.createScheduledExecutor(Runtime.getRuntime().availableProcessors(),
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sender` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
#### Snippet
```java
    private final transient EventMeshGrpcClientConfig clientConfig;

    private transient StreamObserver<Subscription> sender;

    private final transient ReceiveMsgHook<T> listener;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `prometheusConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/PrometheusMetricsRegistry.java`
#### Snippet
```java
     * Unified configuration class corresponding to prometheus.properties
     */
    private PrometheusConfiguration prometheusConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `subStreamHandler` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java

    private transient ReceiveMsgHook<?> listener;
    private transient SubStreamHandler<?> subStreamHandler;

    public EventMeshGrpcConsumer(final EventMeshGrpcClientConfig clientConfig) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listener` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
    private transient HeartbeatServiceBlockingStub heartbeatClient;

    private transient ReceiveMsgHook<?> listener;
    private transient SubStreamHandler<?> subStreamHandler;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerAsyncClient` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java

    private transient ConsumerServiceBlockingStub consumerClient;
    private transient ConsumerServiceStub consumerAsyncClient;
    private transient HeartbeatServiceBlockingStub heartbeatClient;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/producer/KafkaProducerImpl.java`
#### Snippet
```java
public class KafkaProducerImpl implements Producer {

    private ProducerImpl producer;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/producer/KafkaProducerImpl.java`
#### Snippet
```java
     * Unified configuration class corresponding to kafka-client.properties
     */
    private ClientConfiguration clientConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listener` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/consumer/KafkaConsumerRunner.java`
#### Snippet
```java
    private final KafkaConsumer<String, CloudEvent> consumer;
    private ConcurrentHashMap<CloudEvent, Long> cloudEventToOffset;
    private EventListener listener;
    private AtomicInteger offset;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/consumer/KafkaConsumerImpl.java`
#### Snippet
```java
@Config(field = "clientConfiguration")
public class KafkaConsumerImpl implements Consumer {
    private ConsumerImpl consumer;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/consumer/KafkaConsumerImpl.java`
#### Snippet
```java
     * Unified configuration class corresponding to kafka-client.properties
     */
    private ClientConfiguration clientConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `redisson` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-redis/src/main/java/org/apache/eventmesh/connector/redis/producer/RedisProducer.java`
#### Snippet
```java
public class RedisProducer implements Producer {

    private Redisson redisson;

    private volatile boolean started = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `redisson` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-redis/src/main/java/org/apache/eventmesh/connector/redis/consumer/RedisConsumer.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(RedisConsumer.class);

    private Redisson redisson;

    private EventMeshMessageListener messageListener;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messageListener` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-redis/src/main/java/org/apache/eventmesh/connector/redis/consumer/RedisConsumer.java`
#### Snippet
```java
    private Redisson redisson;

    private EventMeshMessageListener messageListener;

    private volatile boolean started = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `started` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java
    private final KafkaConsumer<String, CloudEvent> kafkaConsumer;
    private final Properties properties;
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private KafkaConsumerRunner kafkaConsumerRunner;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/producer/PulsarProducerImpl.java`
#### Snippet
```java
public class PulsarProducerImpl implements Producer {

    private ProducerImpl producer;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/producer/PulsarProducerImpl.java`
#### Snippet
```java
     * Unified configuration class corresponding to pulsar-client.properties
     */
    private ClientConfiguration clientConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/producer/KnativeProducerImpl.java`
#### Snippet
```java
     * Unified configuration class corresponding to knative-client.properties
     */
    private ClientConfiguration clientConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/producer/KnativeProducerImpl.java`
#### Snippet
```java
public class KnativeProducerImpl implements Producer {

    private transient ProducerImpl producer;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pullConsumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/KnativeConsumerImpl.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(KnativeConsumerImpl.class);

    private transient PullConsumerImpl pullConsumer;


```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/KnativeConsumerImpl.java`
#### Snippet
```java
     * Unified configuration class corresponding to knative-client.properties
     */
    private ClientConfiguration clientConfiguration;

    private static final Logger logger = LoggerFactory.getLogger(KnativeConsumerImpl.class);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pushConsumer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/RocketMQConsumerImpl.java`
#### Snippet
```java
    public Logger messageLogger = LoggerFactory.getLogger("message");

    private PushConsumerImpl pushConsumer;

    private ClientConfiguration clientConfiguration;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/RocketMQConsumerImpl.java`
#### Snippet
```java
    private PushConsumerImpl pushConsumer;

    private ClientConfiguration clientConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producer` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/RocketMQProducerImpl.java`
#### Snippet
```java
public class RocketMQProducerImpl implements Producer {

    private ProducerImpl producer;

    private ClientConfiguration clientConfiguration;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/RocketMQProducerImpl.java`
#### Snippet
```java
    private ProducerImpl producer;

    private ClientConfiguration clientConfiguration;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `started` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
    private final DefaultMQPushConsumer rocketmqPushConsumer;
    private final Properties properties;
    private AtomicBoolean started = new AtomicBoolean(false);
    private EventListener eventListener;
    private final ClientConfig clientConfig;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listener` is accessed in both synchronized and unsynchronized contexts
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/consumer/StandaloneConsumer.java`
#### Snippet
```java
    private final StandaloneBroker standaloneBroker;

    private EventListener listener;

    private final AtomicBoolean isStarted;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
                            }
                            if (idx < hierarchicalKeys.length - 1) {
                                Object pending = hierarchical.get(hierarchicalKey);
                                if (pending == null) {
                                    hierarchical.put(hierarchicalKey, hierarchical = new Properties());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/config/AdminConfiguration.java`
#### Snippet
```java
    public void processOperationProperties() {
        String prefix = operationMode + "Mode";
        this.operationProperties = (Properties) operationProperties.get(prefix);
    }
}
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/config/ReceiveConfiguration.java`
#### Snippet
```java
    public void processOperationProperties() {
        final String prefix = operationMode + "Mode";
        this.operationProperties = (Properties) operationProperties.get(prefix);
    }
}
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/cloudevent/impl/KnativeMessageWriter.java`
#### Snippet
```java

    public KnativeMessageWriter(Properties properties) {
        String s = "{ \"msg\": [\"" + properties.get("data") + "\"]}";
        this.message = new CloudEventBuilder()
                .withId(properties.getProperty(KnativeHeaders.CE_ID))
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/producer/ProducerImpl.java`
#### Snippet
```java
    }

    public void sendOneway(CloudEvent message) {
    }

```

### EmptyMethod
The method is empty
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/producer/StandaloneProducer.java`
#### Snippet
```java
    }

    public void setExtFields() {

    }
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/MetricsRegistry.java`
#### Snippet
```java
     * @param metric
     */
    void unRegister(Metric metric);
}

```

### EmptyMethod
The method is empty
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/EventMeshTcpRetryer.java`
#### Snippet
```java
    }

    public void printRetryThreadPoolState() {
        //ThreadPoolHelper.printState(pool);
    }
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
@EventMeshSPI(eventMeshExtensionType = EventMeshExtensionType.SECURITY)
public interface AclService {
    void init() throws AclException;

    void start() throws AclException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
    void init() throws AclException;

    void start() throws AclException;

    void shutdown() throws AclException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
    void start() throws AclException;

    void shutdown() throws AclException;

    void doAclCheckInConnect(Properties aclProperties) throws AclException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
    void shutdown() throws AclException;

    void doAclCheckInConnect(Properties aclProperties) throws AclException;

    void doAclCheckInHeartbeat(Properties aclProperties) throws AclException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
    void doAclCheckInConnect(Properties aclProperties) throws AclException;

    void doAclCheckInHeartbeat(Properties aclProperties) throws AclException;

    void doAclCheckInSend(Properties aclProperties) throws AclException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
    void doAclCheckInHeartbeat(Properties aclProperties) throws AclException;

    void doAclCheckInSend(Properties aclProperties) throws AclException;

    void doAclCheckInReceive(Properties aclProperties) throws AclException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclService.java`
#### Snippet
```java
    void doAclCheckInSend(Properties aclProperties) throws AclException;

    void doAclCheckInReceive(Properties aclProperties) throws AclException;

}
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/auth/AuthService.java`
#### Snippet
```java
public interface AuthService {

    void init() throws AuthException;

    void start() throws AuthException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/auth/AuthService.java`
#### Snippet
```java
    void init() throws AuthException;

    void start() throws AuthException;

    void shutdown() throws AuthException;
```

### EmptyMethod
All implementations of this method are empty
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/auth/AuthService.java`
#### Snippet
```java
    void start() throws AuthException;

    void shutdown() throws AuthException;

    Map<String, String> getAuthParams() throws AuthException;
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/CommonConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "server.security.enabled")
    private boolean eventMeshServerSecurityEnable = false;

    @ConfigFiled(field = "server.registry.enabled")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/CommonConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "server.hostIp", reload = true)
    private String eventMeshServerIp = null;

    @ConfigFiled(field = "registry.plugin.server-addr", notEmpty = true)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/CommonConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "server.registry.enabled")
    private boolean eventMeshServerRegistryEnable = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/CommonConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "server.trace.enabled")
    private boolean eventMeshServerTraceEnable = false;

    @ConfigFiled(field = "server.security.enabled")
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/UserAgent.java`
#### Snippet
```java
    private String purpose;
    @Builder.Default
    private int unack = 0;

    public UserAgent() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/RetryContext.java`
#### Snippet
```java
    public String seq;

    public int retryTimes = 0;

    public long executeTime = System.currentTimeMillis();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
    private SessionContext sessionContext = new SessionContext(this);

    private boolean listenRspSend = false;

    private ReentrantLock listenRspLock = new ReentrantLock();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
    private ReentrantLock listenRspLock = new ReentrantLock();

    private String listenRequestSeq = null;

    protected SessionState sessionState = SessionState.CREATED;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
    private long lastHeartbeatTime = System.currentTimeMillis();

    private long isolateTime = 0;

    private SessionContext sessionContext = new SessionContext(this);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/retry/RetryContext.java`
#### Snippet
```java
public abstract class RetryContext implements DelayRetryable {

    public int retryTimes = 0;

    public long executeTime = System.currentTimeMillis();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/retry/RetryContext.java`
#### Snippet
```java
public abstract class RetryContext implements DelayRetryable {

    public int retryTimes = 0;

    public long executeTime = System.currentTimeMillis();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshCloudEventWriter.java`
#### Snippet
```java

public class EventMeshCloudEventWriter implements CloudEventContextWriter {
    private Map<String, Object> extensionMap = null;

    public EventMeshCloudEventWriter() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/registry/Registry.java`
#### Snippet
```java
    private volatile boolean inited = false;

    private volatile boolean started = false;

    private RegistryService registryService;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/registry/Registry.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(Registry.class);

    private volatile boolean inited = false;

    private volatile boolean started = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshTCPConfiguration.java`
#### Snippet
```java
    @AllArgsConstructor
    public static class TrafficShapingConfig {
        long writeLimit = 0;
        long readLimit = 1000;
        long checkInterval = 1000;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/config/AdminConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "admin.start")
    private boolean adminStart = false;

    @ConfigFiled(field = "operationMode")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshGrpcConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "consumer.enabled")
    private boolean eventMeshServerConsumerEnabled = false;

    @ConfigFiled(field = "useTls.enabled")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshGrpcConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "useTls.enabled")
    private boolean eventMeshServerUseTls = false;

    @ConfigFiled(field = "batchmsg.reqNumPerSecond")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshHTTPConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "consumer.enabled")
    private boolean eventMeshServerConsumerEnabled = false;

    @ConfigFiled(field = "useTls.enabled")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/configuration/EventMeshHTTPConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "useTls.enabled")
    private boolean eventMeshServerUseTls = false;

    @ConfigFiled(field = "ssl.protocol")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/conf/EventMeshHttpClientConfig.java`
#### Snippet
```java

    @Builder.Default
    private transient boolean useTls = false;

    @Builder.Default
```

### RedundantFieldInitialization
Field initialization to `0f` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    private AtomicLong batchSend2MQNum = new AtomicLong(0);

    private float send2MQWholeCost = 0f;

    private AtomicLong send2MQNum = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `0f` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    }
    
    private float wholePushCost = 0f;

    private AtomicLong wholePushRequestNum = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `0f` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    }

    private float httpDecodeTimeCost = 0f;

    private AtomicLong httpDecodeNum = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `0f` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    }
    
    private float batchSend2MQWholeCost = 0f;

    private AtomicLong batchSend2MQNum = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `0f` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    private AtomicLong send2MQNum = new AtomicLong(0);

    private float reply2MQWholeCost = 0f;

    private AtomicLong reply2MQNum = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `0f` is redundant
in `eventmesh-metrics-plugin/eventmesh-metrics-api/src/main/java/org/apache/eventmesh/metrics/api/model/HttpSummaryMetrics.java`
#### Snippet
```java
    }

    private float wholeCost = 0f;

    private AtomicLong wholeRequestNum = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/config/ClientConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "client.comsumeTimeoutInMin")
    public long consumeTimeout = 0L;

    @ConfigFiled(field = "client.pollNameServerInterval")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-redis/src/main/java/org/apache/eventmesh/connector/redis/producer/RedisProducer.java`
#### Snippet
```java
    private Redisson redisson;

    private volatile boolean started = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-redis/src/main/java/org/apache/eventmesh/connector/redis/consumer/RedisConsumer.java`
#### Snippet
```java
    private EventMeshMessageListener messageListener;

    private volatile boolean started = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // Topics to subscribe:
    private transient List<SubscriptionItem> topicList = null;
    private final transient ConcurrentHashMap<String, AtomicLong> offsetMap;
    private final transient AtomicBoolean started = new AtomicBoolean(false);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
    private String serverAddr;

    public CuratorFramework zkClient = null;

    private Map<String, EventMeshRegisterInfo> eventMeshRegisterInfoMap;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/config/PravegaConnectorConfig.java`
#### Snippet
```java

    @ConfigFiled(field = "tlsEnabled")
    private boolean tlsEnable = false;

    @ConfigFiled(field = "truststore")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/config/PravegaConnectorConfig.java`
#### Snippet
```java

    @ConfigFiled(field = "authEnabled", reload = true)
    private boolean authEnabled = false;

    @ConfigFiled(field = "username")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-rabbitmq/src/main/java/org/apache/eventmesh/connector/rabbitmq/consumer/RabbitmqConsumer.java`
#### Snippet
```java
    private Channel channel;

    private volatile boolean started = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-rabbitmq/src/main/java/org/apache/eventmesh/connector/rabbitmq/producer/RabbitmqProducer.java`
#### Snippet
```java
    private Channel channel;

    private volatile boolean started = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/config/ClientConfiguration.java`
#### Snippet
```java

    @ConfigFiled(field = "client.comsumeTimeoutInMin")
    public long consumeTimeout = 0L;

    @ConfigFiled(field = "client.pollNameServerInterval")
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `settings.gradle`
#### Snippet
```java

rootProject.name = 'incubator-eventmesh'
String jdkVersion = "${jdk}"
include 'eventmesh-runtime'
include 'eventmesh-sdk-java'
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/consumer/EventMeshHttpConsumer.java`
#### Snippet
```java

@Slf4j
public class EventMeshHttpConsumer extends AbstractHttpClient implements AutoCloseable {

    private final transient ThreadPoolExecutor consumeExecutor;
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
            String eventMeshName = configuration.getEventMeshName();
            try {
                String serviceName = eventMeshName.concat("-").concat(key);
                String servicePath = formatServicePath(clusterName, serviceName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
            String eventMeshName = configuration.getEventMeshName();
            try {
                String serviceName = eventMeshName.concat("-").concat(key);
                String servicePath = formatServicePath(clusterName, serviceName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

                for (String endpoint : instances) {
                    String instancePath = servicePath.concat(ZookeeperConstant.PATH_SEPARATOR).concat(endpoint);

                    Stat stat = new Stat();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

                for (String endpoint : instances) {
                    String instancePath = servicePath.concat(ZookeeperConstant.PATH_SEPARATOR).concat(endpoint);

                    Stat stat = new Stat();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

                for (String endpoint : instances) {
                    String instancePath = servicePath.concat(ZookeeperConstant.PATH_SEPARATOR).concat(endpoint);

                    Stat stat = new Stat();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

                for (String endpoint : instances) {
                    String instancePath = servicePath.concat(ZookeeperConstant.PATH_SEPARATOR).concat(endpoint);

                    Stat stat = new Stat();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

    private String formatInstancePath(String clusterName, String serviceName, String endPoint) {
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(endPoint);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
    private String formatInstancePath(String clusterName, String serviceName, String endPoint) {
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(endPoint);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
    private String formatInstancePath(String clusterName, String serviceName, String endPoint) {
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(endPoint);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(endPoint);
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(endPoint);
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

    private String formatServicePath(String clusterName, String serviceName) {
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
    private String formatServicePath(String clusterName, String serviceName) {
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName);
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
    private String formatServicePath(String clusterName, String serviceName) {
        return ZookeeperConstant.PATH_SEPARATOR.concat(clusterName)
            .concat(ZookeeperConstant.PATH_SEPARATOR).concat(serviceName);
    }

```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/SessionSender.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.warn("SessionSender send failed", e);
            if (!(e instanceof InterruptedException)) {
                upstreamBuff.release();
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java
                send(tcpPackage);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                } else {
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ThreadUtils.java`
#### Snippet
```java
    public static long getPID() {
        if (currentPID == -1) {
            synchronized (ThreadUtils.class) {
                if (currentPID == -1) {
                    currentPID = Long.parseLong(ProcessIdUtil.getProcessId());
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
    protected void heartbeat() {
        if (heartTask == null) {
            synchronized (TcpClient.class) {
                heartTask = scheduler.scheduleAtFixedRate(() -> {
                    try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
#### Snippet
```java

    public void sendSubscription(final Subscription subscription) {
        synchronized (this) {
            if (this.sender == null) {
                this.sender = consumerAsyncClient.subscribeStream(createReceiver());
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `eventmesh-metrics-plugin/eventmesh-metrics-prometheus/src/main/java/org/apache/eventmesh/metrics/prometheus/PrometheusMetricsRegistry.java`
#### Snippet
```java
    public void start() {
        if (prometheusHttpServer == null) {
            synchronized (PrometheusMetricsRegistry.class) {
                if (prometheusHttpServer == null) {
                    SdkMeterProvider sdkMeterProvider = SdkMeterProvider.builder().buildAndRegisterGlobal();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java

            // there is no stream subscriptions, stop the subscription stream handler
            synchronized (this) {
                if (MapUtils.isEmpty(subscriptionMap) && subStreamHandler != null) {
                    subStreamHandler.close();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
        final Subscription subscription = buildSubscription(subscriptionItems, null);

        synchronized (this) {
            if (subStreamHandler == null) {
                subStreamHandler = new SubStreamHandler<>(consumerAsyncClient, clientConfig, listener);
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `eventmesh-spi/src/main/java/org/apache/eventmesh/spi/loader/EventMeshUrlClassLoader.java`
#### Snippet
```java

    private static class EventMeshUrlClassLoaderHolder {
        private static EventMeshUrlClassLoader instance = new EventMeshUrlClassLoader(new URL[0], Thread.currentThread().getContextClassLoader());
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
    private static byte[] serializeBytes(String str) {
        if (str == null) {
            return new byte[0];
        }
        return str.getBytes(Constants.DEFAULT_CHARSET);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/SSLContextFactory.java`
#### Snippet
```java
            password = eventMeshHttpConfiguration.getEventMeshServerSSLPass();

            char[] filePass = StringUtils.isNotBlank(password) ? password.toCharArray() : new char[0];
            final KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(inputStream, filePass);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HandlerService.java`
#### Snippet
```java
        byte[] requestBody = Optional.ofNullable(JsonUtils.serialize(bodyMap))
            .map(s -> s.getBytes(StandardCharsets.UTF_8))
            .orElse(new byte[0]);

        httpEventWrapper.setBody(requestBody);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/ssl/MyX509TrustManager.java`
#### Snippet
```java
        final String fileName = System.getProperty("ssl.client.cer", "");
        final String pass = System.getProperty("ssl.client.pass", "");
        final char[] filePass = StringUtils.isNotBlank(pass) ? pass.toCharArray() : new char[0];

        try (InputStream in = Files.newInputStream(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `eventmesh-connector-plugin/eventmesh-connector-rabbitmq/src/main/java/org/apache/eventmesh/connector/rabbitmq/cloudevent/RabbitmqCloudEvent.java`
#### Snippet
```java
    public static byte[] toByteArray(RabbitmqCloudEvent rabbitmqCloudEvent) throws Exception {
        Optional<byte[]> optionalBytes = ByteArrayUtils.objectToBytes(rabbitmqCloudEvent);
        return optionalBytes.orElseGet(() -> new byte[]{});
    }

```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
    }

    public RateLimiter getMsgRateLimiter() {
        return msgRateLimiter;
    }
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshGrpcServer.java`
#### Snippet
```java
    private List<CloseableHttpClient> httpClientPool;

    private RateLimiter msgRateLimiter;

    private Registry registry;
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    }

    public RateLimiter getMsgRateLimiter() {
        return msgRateLimiter;
    }
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    public ThreadPoolExecutor webhookExecutor;

    private transient RateLimiter msgRateLimiter;

    private transient RateLimiter batchRateLimiter;
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    private transient RateLimiter msgRateLimiter;

    private transient RateLimiter batchRateLimiter;

    public transient HTTPClientPool httpClientPool = new HTTPClientPool(10);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshHTTPServer.java`
#### Snippet
```java
    }

    public RateLimiter getBatchRateLimiter() {
        return batchRateLimiter;
    }
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    private transient AdminWebHookConfigOperationManager adminWebHookConfigOperationManage;

    private transient RateLimiter rateLimiter;

    public void setClientSessionGroupMapping(final ClientSessionGroupMapping clientSessionGroupMapping) {
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    }

    public RateLimiter getRateLimiter() {
        return rateLimiter;
    }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    }

    public void setRateLimiter(final RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }
```

## RuleId[ruleID=UnusedAssignment]
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
Variable `localEventMeshDistributeData` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
                                                                   Map<String, String> eventMeshMap) {
        Map<String, Integer> localEventMeshDistributeData = null;
        Map<String, Map<String, Integer>> eventMeshClientDistributionDataMap = null;
        try {
            eventMeshClientDistributionDataMap = eventMeshTCPServer.getRegistry().findEventMeshClientDistributionData(
```

### UnusedAssignment
Variable `sessionSet` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
    private void doRedirect(String group, String purpose, int judge, List<String> eventMeshRecommendResult) throws Exception {
        logger.info("doRebalance redirect start---------------------group:{},judge:{}", group, judge);
        Set<Session> sessionSet = null;
        if (EventMeshConstants.PURPOSE_SUB.equals(purpose)) {
            sessionSet = eventMeshTCPServer.getClientSessionGroupMapping().getClientGroupMap().get(group).getGroupConsumerSessions();
```

### UnusedAssignment
Variable `rebalanceResult` initializer `0` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java

    private Map<String, String> queryLocalEventMeshMap(String cluster) {
        Map<String, String> localEventMeshMap = null;
        List<EventMeshDataInfo> eventMeshDataInfoList = null;
        try {
```

### UnusedAssignment
Variable `eventMeshDataInfoList` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
    private Map<String, String> queryLocalEventMeshMap(String cluster) {
        Map<String, String> localEventMeshMap = null;
        List<EventMeshDataInfo> eventMeshDataInfoList = null;
        try {
            eventMeshDataInfoList = eventMeshTCPServer.getRegistry().findEventMeshInfoByCluster(cluster);
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
Variable `res` initializer `""` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AsyncHTTPPushRequest.java`
#### Snippet
```java
                    if (processResponseStatus(response.getStatusLine().getStatusCode(), response)) {
                        // this is successful response, process response payload
                        String res = "";
                        try {
                            res = EntityUtils.toString(response.getEntity(),
```

### UnusedAssignment
Variable `extensionMap` initializer `null` is redundant
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshCloudEventWriter.java`
#### Snippet
```java

public class EventMeshCloudEventWriter implements CloudEventContextWriter {
    private Map<String, Object> extensionMap = null;

    public EventMeshCloudEventWriter() {
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
Variable `topicList` initializer `null` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java

    // Topics to subscribe:
    private transient List<SubscriptionItem> topicList = null;
    private final transient ConcurrentHashMap<String, AtomicLong> offsetMap;
    private final transient AtomicBoolean started = new AtomicBoolean(false);
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/consumer/ConsumerImpl.java`
#### Snippet
```java

    public void updateOffset(List<CloudEvent> cloudEvents, AbstractContext context) {
        Long maxOffset = cloudEvents.stream().map(cloudEvent -> this.kafkaConsumerRunner.getOffset(cloudEvent)).max(Long::compare).get();
        cloudEvents.forEach(cloudEvent -> this.updateOffset(cloudEvent.getSubject(), maxOffset));
    }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `topicResponse != null` is always `false`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/handler/TopicsHandler.java`
#### Snippet
```java
            //TBD: A new rocketmq service will be implemented for creating topics
            TopicResponse topicResponse = null;
            if (topicResponse != null) {
                logger.info("create a new topic: {}", topic);
                httpExchange.getResponseHeaders().add(CONTENT_TYPE, APPLICATION_JSON);
```

### ConstantValue
Condition `headerData != null` is always `true`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
            out.writeInt(length);
            out.writeInt(headerLength);
            if (headerData != null) {
                out.writeBytes(headerData);
            }
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
                    pool.execute(retryContext::retry);
                }
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
Condition `this.cloudEventTCPPubClient != null` is always `true`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPClient.java`
#### Snippet
```java
    @Override
    public void close() throws EventMeshException {
        if (this.cloudEventTCPPubClient != null) {
            this.cloudEventTCPPubClient.close();
        }
```

### ConstantValue
Condition `this.cloudEventTCPSubClient != null` is always `true`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPClient.java`
#### Snippet
```java
        }

        if (this.cloudEventTCPSubClient != null) {
            this.cloudEventTCPSubClient.close();
        }
```

### ConstantValue
Condition `this.eventMeshTCPPubClient != null` is always `true`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/openmessage/OpenMessageTCPClient.java`
#### Snippet
```java
    public void close() throws EventMeshException {

        if (this.eventMeshTCPPubClient != null) {
            try {
                this.eventMeshTCPPubClient.close();
```

### ConstantValue
Condition `this.eventMeshTCPSubClient != null` is always `true`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/openmessage/OpenMessageTCPClient.java`
#### Snippet
```java
        }

        if (this.eventMeshTCPSubClient != null) {
            try {
                this.eventMeshTCPSubClient.close();
```

### ConstantValue
Condition `this.eventMeshMessageTCPPubClient != null` is always `true`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPClient.java`
#### Snippet
```java
    @Override
    public void close() throws EventMeshException {
        if (this.eventMeshMessageTCPPubClient != null) {
            try {
                this.eventMeshMessageTCPPubClient.close();
```

### ConstantValue
Condition `this.eventMeshMessageTCPSubClient != null` is always `true`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPClient.java`
#### Snippet
```java
        }

        if (this.eventMeshMessageTCPSubClient != null) {
            try {
                this.eventMeshMessageTCPSubClient.close();
```

### ConstantValue
Value `status` is always 'null'
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/patch/EventMeshMessageListenerConcurrently.java`
#### Snippet
```java
                        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                    default:
                        return status;
                }
            } catch (Throwable e) {
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/response/TopicResponse.java`
#### Snippet
```java
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopicResponse {topic=" + this.topic + ",");
        sb.append("created_time=" + this.createdTime + "}");
        return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/response/TopicResponse.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("TopicResponse {topic=" + this.topic + ",");
        sb.append("created_time=" + this.createdTime + "}");
        return sb.toString();
    }
```

## RuleId[ruleID=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
        final Map<String, Integer> remoteClientDistributionMap = new HashMap<>();

        eventMeshClientDistributionDataMap.entrySet().forEach(entry -> {
            final String idc = entry.getKey().split("-")[0];
            if (StringUtils.isNotBlank(idc)) {
```

## RuleId[ruleID=RedundantLengthCheck]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `EventMeshExtensionConstant` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-spi/src/main/java/org/apache/eventmesh/spi/loader/EventMeshExtensionConstant.java`
#### Snippet
```java
package org.apache.eventmesh.spi.loader;

public class EventMeshExtensionConstant {
    /**
     * eventmesh plugin base path
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/Constants.java`
#### Snippet
```java
package org.apache.eventmesh.admin.rocketmq;

public class Constants {

    public static final String TOPIC_MANAGE_PATH = "/topicManage";
```

### UtilityClassWithoutPrivateConstructor
Class `RequestMapping` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/RequestMapping.java`
#### Snippet
```java
import com.sun.net.httpserver.HttpExchange;

public class RequestMapping {

    public static boolean postMapping(String value, HttpExchange httpExchange) {
```

### UtilityClassWithoutPrivateConstructor
Class `RandomStringUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/RandomStringUtils.java`
#### Snippet
```java
import org.apache.commons.text.RandomStringGenerator;

public class RandomStringUtils {

    private static final RandomStringGenerator RANDOM_NUM_GENERATOR = new RandomStringGenerator.Builder()
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/Constants.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class Constants {

    public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
```

### UtilityClassWithoutPrivateConstructor
Class `WatchFileManager` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/file/WatchFileManager.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class WatchFileManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatchFileManager.class);
```

### UtilityClassWithoutPrivateConstructor
Class `AssertUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/AssertUtils.java`
#### Snippet
```java
 * Assert
 */
public final class AssertUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ThreadUtils.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    private static volatile long currentPID = -1;
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigurationContextUtil` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/ConfigurationContextUtil.java`
#### Snippet
```java
 * ConfigurationContextUtil.
 */
public class ConfigurationContextUtil {

    private static final ConcurrentHashMap<String, CommonConfiguration> CONFIGURATION_MAP = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `NetUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/NetUtils.java`
#### Snippet
```java
 */
@Slf4j
public class NetUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PropertiesUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/PropertiesUtils.java`
#### Snippet
```java
import com.google.common.base.Preconditions;

public class PropertiesUtils {

    public static Properties getPropertiesByPrefix(final Properties from, final String prefix) {
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
 * Json serialize or deserialize utils.
 */
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `ConverterMap` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/ConverterMap.java`
#### Snippet
```java
 * Use to map the field clazz and the converter for the field clazz
 */
public class ConverterMap {

    public static final Logger LOGGER = LoggerFactory.getLogger(ConverterMap.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IPUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
import inet.ipaddr.IPAddressString;

public class IPUtils {

    private static final Logger LOG = LoggerFactory.getLogger(IPUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ProtocolKey` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/grpc/common/ProtocolKey.java`
#### Snippet
```java
package org.apache.eventmesh.common.protocol.grpc.common;

public class ProtocolKey {

    public static final String ENV = "env";
```

### UtilityClassWithoutPrivateConstructor
Class `Codec` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
import com.google.common.base.Preconditions;

public class Codec {
    private static final Logger LOG = LoggerFactory.getLogger(Codec.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ProtocolKey` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/common/ProtocolKey.java`
#### Snippet
```java
package org.apache.eventmesh.common.protocol.http.common;

public class ProtocolKey {

    public static final String REQUEST_CODE = "code";
```

### UtilityClassWithoutPrivateConstructor
Class `CloudEventsKey` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/common/ProtocolKey.java`
#### Snippet
```java
    }

    public static class CloudEventsKey {
        public static final String ID = "id";
        public static final String SOURCE = "source";
```

### UtilityClassWithoutPrivateConstructor
Class `ClientInstanceKey` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/common/ProtocolKey.java`
#### Snippet
```java
    public static final String CONTENT_TYPE = "contenttype";

    public static class ClientInstanceKey {
        ////////////////////////////////////Protocol layer requester description///////////
        public static final String ENV = "env";
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshInstanceKey` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/common/ProtocolKey.java`
#### Snippet
```java


    public static class EventMeshInstanceKey {
        ///////////////////////////////////////////////Protocol layer EventMesh description
        public static final String EVENTMESHCLUSTER = "eventmeshcluster";
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshStartup` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshStartup.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class EventMeshStartup {

    public static final Logger LOGGER = LoggerFactory.getLogger(EventMeshStartup.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SSLContextFactory` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/SSLContextFactory.java`
#### Snippet
```java
import javax.net.ssl.SSLContext;

public class SSLContextFactory {
    private static String protocol = "TLSv1.1";

```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshTcp2Client` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
import io.netty.channel.ChannelHandlerContext;

public class EventMeshTcp2Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventMeshTcp2Client.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/service/ServiceUtils.java`
#### Snippet
```java
import java.util.Map;

public class ServiceUtils {

    public static boolean validateHeader(RequestHeader header) {
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
import io.netty.handler.codec.http.HttpRequest;

public class Utils {
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
    private static final Logger MESSAGE_LOGGER = LoggerFactory.getLogger("message");
```

### UtilityClassWithoutPrivateConstructor
Class `WebhookUtil` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/WebhookUtil.java`
#### Snippet
```java
 */
@Slf4j
public class WebhookUtil {
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String REQUEST_ORIGIN_HEADER = "WebHook-Request-Origin";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpResponseUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/HttpResponseUtils.java`
#### Snippet
```java
import io.netty.handler.codec.http.HttpVersion;

public class HttpResponseUtils {

    public static HttpResponse createSuccess() {
```

### UtilityClassWithoutPrivateConstructor
Class `HttpExchangeUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/HttpExchangeUtils.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class HttpExchangeUtils {
    public static String streamToString(InputStream stream) throws IOException {
        InputStreamReader isr = new InputStreamReader(stream, StandardCharsets.UTF_8);
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/JsonUtils.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtils {
    private static final ObjectMapper objectMapper;

```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshUtil` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java


public class EventMeshUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventMeshUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `HttpTinyClient` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/HttpTinyClient.java`
#### Snippet
```java
import java.util.Objects;

public class HttpTinyClient {

    public static HttpResult httpGet(String url, List<String> headers, List<String> paramValues,
```

### UtilityClassWithoutPrivateConstructor
Class `MonitorMetricConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/metrics/MonitorMetricConstants.java`
#### Snippet
```java
package org.apache.eventmesh.runtime.metrics;

public class MonitorMetricConstants {
    public static final String EVENTMESH_MONITOR_FORMAT_COMMON = "{\"protocol\":\"%s\",\"s\":\"%s\",\"t\":\"%s\"}";

```

### UtilityClassWithoutPrivateConstructor
Class `SpanKey` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/SpanKey.java`
#### Snippet
```java
 * Makes span keys for specific instrumentation accessible to enrich and suppress spans.
 */
public final class SpanKey {
    // server span key
    public static final ContextKey<Span> SERVER_KEY =
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshVersion` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/constants/EventMeshVersion.java`
#### Snippet
```java
package org.apache.eventmesh.runtime.constants;

public class EventMeshVersion {

    public static final String CURRENT_VERSION = Version.V3_0_0.name();
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/constants/EventMeshConstants.java`
#### Snippet
```java
import org.apache.eventmesh.common.Constants;

public class EventMeshConstants {

    public static final String EVENT_STORE_PROPERTIES = "eventstore";
```

### UtilityClassWithoutPrivateConstructor
Class `StartUp` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-starter/src/main/java/org/apache/eventmesh/starter/StartUp.java`
#### Snippet
```java
import org.apache.eventmesh.runtime.boot.EventMeshStartup;

public class StartUp {
    public static void main(String[] args) throws Exception {
        EventMeshStartup.main(args);
```

### UtilityClassWithoutPrivateConstructor
Class `WebHookOperationConstant` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-webhook/eventmesh-webhook-api/src/main/java/org/apache/eventmesh/webhook/api/WebHookOperationConstant.java`
#### Snippet
```java
import java.io.File;

public class WebHookOperationConstant {

    public static final String FILE_SEPARATOR = File.separator;
```

### UtilityClassWithoutPrivateConstructor
Class `ClassUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-webhook/eventmesh-webhook-api/src/main/java/org/apache/eventmesh/webhook/api/utils/ClassUtils.java`
#### Snippet
```java
package org.apache.eventmesh.webhook.api.utils;

public class ClassUtils {

    public static String convertResourcePathToClassName(String path) {
```

### UtilityClassWithoutPrivateConstructor
Class `SyncRequest` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/cloudevents/SyncRequest.java`
#### Snippet
```java

@Slf4j
public class SyncRequest {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncPublishBroadcast` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/eventmeshmessage/AsyncPublishBroadcast.java`
#### Snippet
```java

@Slf4j
public class AsyncPublishBroadcast {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncPublish` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/eventmeshmessage/AsyncPublish.java`
#### Snippet
```java

@Slf4j
public class AsyncPublish {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SyncRequest` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/eventmeshmessage/SyncRequest.java`
#### Snippet
```java

@Slf4j
public class SyncRequest {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncPublish` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/demo/pub/cloudevents/AsyncPublish.java`
#### Snippet
```java

@Slf4j
public class AsyncPublish {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshTestUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/common/EventMeshTestUtils.java`
#### Snippet
```java
import io.cloudevents.core.builder.CloudEventBuilder;

public class EventMeshTestUtils {

    private static final int SEQ_LENGTH = 10;
```

### UtilityClassWithoutPrivateConstructor
Class `TraceUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/TraceUtils.java`
#### Snippet
```java
import io.opentelemetry.context.Context;

public class TraceUtils {
    private static Logger logger = LoggerFactory.getLogger(TraceUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootDemoApplication` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/sub/app/SpringBootDemoApplication.java`
#### Snippet
```java

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootDemoApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootDemoApplication` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/sub/SpringBootDemoApplication.java`
#### Snippet
```java

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootDemoApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExampleConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/common/ExampleConstants.java`
#### Snippet
```java
package org.apache.eventmesh.common;

public class ExampleConstants {

    public static final String CONFIG_FILE_NAME = "application.properties";
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-examples/src/main/java/org/apache/eventmesh/util/Utils.java`
#### Snippet
```java
import java.util.Properties;

public class Utils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshCommon` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/EventMeshCommon.java`
#### Snippet
```java
package org.apache.eventmesh.client.tcp.common;

public class EventMeshCommon {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MessageUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/MessageUtils.java`
#### Snippet
```java
import io.openmessaging.api.Message;

public class MessageUtils {
    private static final int SEQ_LENGTH = 10;

```

### UtilityClassWithoutPrivateConstructor
Class `ProtocolConstant` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/ProtocolConstant.java`
#### Snippet
```java
package org.apache.eventmesh.client.http;

public final class ProtocolConstant {
    public static final String CE_PROTOCOL = "cloudevents";
    public static final String EM_MESSAGE_PROTOCOL = "eventmeshmessage";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpLoadBalanceUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/util/HttpLoadBalanceUtils.java`
#### Snippet
```java
import com.google.common.base.Splitter;

public class HttpLoadBalanceUtils {

    private static final Pattern IP_PORT_PATTERN = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}:\\d{4,5}");
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshClientUtil` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/util/EventMeshClientUtil.java`
#### Snippet
```java
import com.fasterxml.jackson.core.type.TypeReference;

public class EventMeshClientUtil {

    public static RequestHeader buildHeader(EventMeshGrpcClientConfig clientConfig, String protocolType) {
```

### UtilityClassWithoutPrivateConstructor
Class `SelectorFactory` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/selector/SelectorFactory.java`
#### Snippet
```java
import java.util.Map;

public class SelectorFactory {
    private static final Map<String, Selector> SELECTOR_MAP = new HashMap<>();

```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshTraceConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-trace-plugin/eventmesh-trace-api/src/main/java/org/apache/eventmesh/trace/api/common/EventMeshTraceConstants.java`
#### Snippet
```java


public class EventMeshTraceConstants {

    public static final String TRACE_EVENTMESH_SDK_CLIENT_SPAN = "eventmesh-sdk-client-span";
```

### UtilityClassWithoutPrivateConstructor
Class `JaegerConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-trace-plugin/eventmesh-trace-jaeger/src/main/java/org/apache/eventmesh/trace/jaeger/common/JaegerConstants.java`
#### Snippet
```java
package org.apache.eventmesh.trace.jaeger.common;

public class JaegerConstants {

    public static final String SERVICE_NAME = "eventmesh_trace";
```

### UtilityClassWithoutPrivateConstructor
Class `ZipkinConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-trace-plugin/eventmesh-trace-zipkin/src/main/java/org/apache/eventmesh/trace/zipkin/common/ZipkinConstants.java`
#### Snippet
```java
package org.apache.eventmesh.trace.zipkin.common;

public class ZipkinConstants {
    // Name of the service(using the instrumentationName)
    public static final String SERVICE_NAME = "eventmesh_trace";
```

### UtilityClassWithoutPrivateConstructor
Class `PinpointConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/common/PinpointConstants.java`
#### Snippet
```java
package org.apache.eventmesh.trace.pinpoint.common;

public class PinpointConstants {

    public static final String SERVICE_NAME = "eventmesh_trace";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/util/HttpUtils.java`
#### Snippet
```java

@Slf4j
public final class HttpUtils {

    public static String post(final CloseableHttpClient client,
```

### UtilityClassWithoutPrivateConstructor
Class `HttpRequestProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-http/src/main/java/org/apache/eventmesh/protocol/http/resolver/HttpRequestProtocolResolver.java`
#### Snippet
```java
import com.fasterxml.jackson.core.type.TypeReference;

public class HttpRequestProtocolResolver {

    public static CloudEvent buildEvent(HttpEventWrapper httpEventWrapper) throws ProtocolHandleException {
```

### UtilityClassWithoutPrivateConstructor
Class `SendMessageBatchProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.CloudEvent;

public class SendMessageBatchProtocolResolver {
    public static CloudEvent buildEvent(Header header, Body body) {
        return null;
```

### UtilityClassWithoutPrivateConstructor
Class `TcpMessageProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/tcp/TcpMessageProtocolResolver.java`
#### Snippet
```java
import com.google.common.base.Preconditions;

public class TcpMessageProtocolResolver {

    public static CloudEvent buildEvent(Header header, String cloudEventJson)
```

### UtilityClassWithoutPrivateConstructor
Class `SendMessageRequestProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageRequestProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.jackson.JsonFormat;

public class SendMessageRequestProtocolResolver {

    public static CloudEvent buildEvent(Header header, Body body) throws ProtocolHandleException {
```

### UtilityClassWithoutPrivateConstructor
Class `SendMessageBatchV2ProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchV2ProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.jackson.JsonFormat;

public class SendMessageBatchV2ProtocolResolver {
    public static CloudEvent buildEvent(Header header, Body body) throws ProtocolHandleException {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `SendMessageBatchProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/http/SendMessageBatchProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.CloudEvent;

public class SendMessageBatchProtocolResolver {
    public static CloudEvent buildEvent(Header header, Body body) {
        return null;
```

### UtilityClassWithoutPrivateConstructor
Class `TcpMessageProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/tcp/TcpMessageProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.core.builder.CloudEventBuilder;

public class TcpMessageProtocolResolver {


```

### UtilityClassWithoutPrivateConstructor
Class `SendMessageRequestProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/http/SendMessageRequestProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.core.builder.CloudEventBuilder;

public class SendMessageRequestProtocolResolver {

    public static CloudEvent buildEvent(Header header, Body body) throws ProtocolHandleException {
```

### UtilityClassWithoutPrivateConstructor
Class `EtcdConstant` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/constant/EtcdConstant.java`
#### Snippet
```java
 * EtcdConstant.
 */
public class EtcdConstant {

    public static final String SERVER_ADDR = "serverAddr";
```

### UtilityClassWithoutPrivateConstructor
Class `NacosConstant` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-registry-plugin/eventmesh-registry-nacos/src/main/java/org/apache/eventmesh/registry/nacos/constant/NacosConstant.java`
#### Snippet
```java
 * NacosConstant.
 */
public class NacosConstant {

    public static final String SERVER_ADDR = "serverAddr";
```

### UtilityClassWithoutPrivateConstructor
Class `GrpcMessageProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/grpc/GrpcMessageProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.core.provider.EventFormatProvider;

public class GrpcMessageProtocolResolver {

    public static CloudEvent buildEvent(SimpleMessage message) {
```

### UtilityClassWithoutPrivateConstructor
Class `SendMessageBatchV2ProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/http/SendMessageBatchV2ProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.core.builder.CloudEventBuilder;

public class SendMessageBatchV2ProtocolResolver {
    public static CloudEvent buildEvent(Header header, Body body) throws ProtocolHandleException {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `ZookeeperConstant` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/constant/ZookeeperConstant.java`
#### Snippet
```java


public class ZookeeperConstant {

    public static final String NAMESPACE = "eventmesh";
```

### UtilityClassWithoutPrivateConstructor
Class `AclPropertyKeys` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-security-plugin/eventmesh-security-api/src/main/java/org/apache/eventmesh/api/acl/AclPropertyKeys.java`
#### Snippet
```java
package org.apache.eventmesh.api.acl;

public class AclPropertyKeys {
    public static final String CLIENT_IP = "clientIp";
    public static final String USER = "user";
```

### UtilityClassWithoutPrivateConstructor
Class `GrpcMessageProtocolResolver` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/grpc/GrpcMessageProtocolResolver.java`
#### Snippet
```java
import io.cloudevents.core.builder.CloudEventBuilder;

public class GrpcMessageProtocolResolver {

    public static CloudEvent buildEvent(SimpleMessage message) throws ProtocolHandleException {
```

### UtilityClassWithoutPrivateConstructor
Class `EtcdClientFactory` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/factory/EtcdClientFactory.java`
#### Snippet
```java


public class EtcdClientFactory {

    private static final Logger logger = LoggerFactory.getLogger(EtcdClientFactory.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/common/Constants.java`
#### Snippet
```java
package org.apache.eventmesh.connector.kafka.common;

public class Constants {

    public static final String BROADCAST_PREFIX = "broadcast-";
```

### UtilityClassWithoutPrivateConstructor
Class `ConnectorPluginFactory` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-api/src/main/java/org/apache/eventmesh/api/factory/ConnectorPluginFactory.java`
#### Snippet
```java
 * The factory to get connector {@link Admin}, {@link Producer} and {@link Consumer}
 */
public class ConnectorPluginFactory {
    /**
     * Get MeshMQAdmin instance by plugin name
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/common/EventMeshConstants.java`
#### Snippet
```java
package org.apache.eventmesh.connector.kafka.common;

public class EventMeshConstants {

    public static final String EVENTMESH_CONF_FILE = "kafka-client.properties";
```

### UtilityClassWithoutPrivateConstructor
Class `CloudEventUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/utils/CloudEventUtils.java`
#### Snippet
```java
import io.cloudevents.CloudEvent;

public class CloudEventUtils {
    public static SendResult convertSendResult(CloudEvent cloudEvent) {
        SendResult sendResult = new SendResult();
```

### UtilityClassWithoutPrivateConstructor
Class `RedissonClient` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-redis/src/main/java/org/apache/eventmesh/connector/redis/client/RedissonClient.java`
#### Snippet
```java
 * so a single instance is fine, and it can save resources and improve performance.
 */
public final class RedissonClient {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `CloudEventUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/utils/CloudEventUtils.java`
#### Snippet
```java
import io.cloudevents.CloudEvent;

public class CloudEventUtils {

    public static SendResult convertSendResult(CloudEvent cloudEvent) {
```

### UtilityClassWithoutPrivateConstructor
Class `NonStandardKeys` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/domain/NonStandardKeys.java`
#### Snippet
```java
 * NonStandardKeys
 */
public class NonStandardKeys {

    public static final String MESSAGE_CONSUME_STATUS = "em.message.consume.status";
```

### UtilityClassWithoutPrivateConstructor
Class `KnativeHeaders` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/cloudevent/impl/KnativeHeaders.java`
#### Snippet
```java
package org.apache.eventmesh.connector.knative.cloudevent.impl;

public class KnativeHeaders {

    public static final String CONTENT_TYPE = "Content-Type";
```

### UtilityClassWithoutPrivateConstructor
Class `OMSUtil` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/OMSUtil.java`
#### Snippet
```java
import org.apache.rocketmq.common.UtilAll;

public class OMSUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `EventMeshConstants` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/common/EventMeshConstants.java`
#### Snippet
```java
package org.apache.eventmesh.connector.rocketmq.common;

public class EventMeshConstants {

    public static final String EVENTMESH_CONF_FILE = "rocketmq-client.properties";
```

### UtilityClassWithoutPrivateConstructor
Class `BeanUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
import java.util.Set;

public final class BeanUtils {

    private static final InternalLogger LOG = ClientLogger.getLog();
```

### UtilityClassWithoutPrivateConstructor
Class `CloudEventUtils` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class CloudEventUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(CloudEventUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `RocketMQHeaders` has only 'static' members, and lacks a 'private' constructor
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/cloudevent/impl/RocketMQHeaders.java`
#### Snippet
```java
import io.cloudevents.core.v1.CloudEventV1;

public class RocketMQHeaders {

    public static final String CE_PREFIX = "CE_";
```

## RuleId[ruleID=UnnecessarySemicolon]
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
    STOPING,

    STOPED;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/patch/EventMeshConsumeConcurrentlyStatus.java`
#### Snippet
```java
     * Success consumption but ack later manually
     */
    CONSUME_FINISH;
}

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/handler/TopicsHandler.java`
#### Snippet
```java
            TopicCreateRequest topicCreateRequest =
                JsonUtils.deserialize(params, TopicCreateRequest.class);
            String topic = topicCreateRequest.getName();

            if (StringUtils.isBlank(topic)) {
```

### DataFlowIssue
Argument `getClass().getResourceAsStream(configInfo.getResourceUrl())` might be null
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/FileLoad.java`
#### Snippet
```java
            final Properties properties = new Properties();
            if (StringUtils.isNotBlank(configInfo.getResourceUrl())) {
                properties.load(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(configInfo.getResourceUrl()))));
            } else {
                properties.load(new BufferedReader(new FileReader(configInfo.getFilePath())));
```

### DataFlowIssue
Argument `resourceUrl` might be null
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/ConfigService.java`
#### Snippet
```java

        if (filePath.contains(".jar")) {
            try (final InputStream inputStream = getClass().getResourceAsStream(resourceUrl)) {
                if (inputStream == null) {
                    throw new RuntimeException("file is not exists");
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpEventWrapper.java`
#### Snippet
```java
        responseBodyMap.put("retCode", eventMeshRetCode.getRetCode());
        responseBodyMap.put("retMessage", eventMeshRetCode.getErrMsg());
        response.setBody(JsonUtils.serialize(responseBodyMap).getBytes(StandardCharsets.UTF_8));
        response.setResTime(System.currentTimeMillis());
        return response;
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpEventWrapper.java`
#### Snippet
```java
        response.setReqTime(this.reqTime);
        response.setHeaderMap(responseHeaderMap);
        response.setBody(JsonUtils.serialize(responseBodyMap).getBytes(StandardCharsets.UTF_8));
        response.setResTime(System.currentTimeMillis());
        return response;
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/HTTPTrace.java`
#### Snippet
```java
            }
            try (Scope ignored = span.makeCurrent()) {
                TraceUtils.finishSpanWithException(span, map, ex.getMessage(), ex);
            }
        }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/push/ClientAckContext.java`
#### Snippet
```java
        this.createTime = System.currentTimeMillis();
        String ttlStr = events.get(0).getExtension(EventMeshConstants.PROPERTY_MESSAGE_TTL) == null ? "" :
            events.get(0).getExtension(EventMeshConstants.PROPERTY_MESSAGE_TTL).toString();
        long ttl = StringUtils.isNumeric(ttlStr) ? Long.parseLong(ttlStr) : EventMeshConstants.DEFAULT_TIMEOUT_IN_MILLISECONDS;
        this.expireTime = System.currentTimeMillis() + ttl;
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
Method invocation `get` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/WebhookPushRequest.java`
#### Snippet
```java
                    JsonUtils.deserialize(content, new TypeReference<Map<String, Object>>() {
                    });
            Integer retCode = (Integer) ret.get("retCode");
            if (retCode != null && ClientRetCode.contains(retCode)) {
                return ClientRetCode.get(retCode);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/BatchPublishMessageProcessor.java`
#### Snippet
```java
        for (CloudEvent event : cloudEvents) {
            String seqNum = event.getId();
            String uniqueId = (event.getExtension(ProtocolKey.UNIQUE_ID) == null) ? "" : event.getExtension(ProtocolKey.UNIQUE_ID).toString();
            ProducerManager producerManager = eventMeshGrpcServer.getProducerManager();
            EventMeshProducer eventMeshProducer = producerManager.getEventMeshProducer(producerGroup);
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
Method invocation `get` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AsyncHTTPPushRequest.java`
#### Snippet
```java
                JsonUtils.deserialize(content, new TypeReference<Map<String, Object>>() {
                });
            Integer retCode = (Integer) ret.get("retCode");
            if (retCode != null && ClientRetCode.contains(retCode)) {
                return ClientRetCode.get(retCode);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
        for (final String extensionKey : event.getExtensionNames()) {
            propMap.put(extensionKey, event.getExtension(extensionKey) == null ? ""
                    : event.getExtension(extensionKey).toString());
        }
        return propMap;
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/QueryWebHookConfigByManufacturerHandler.java`
#### Snippet
```java
        try (OutputStream out = httpExchange.getResponseBody()) {
            List<WebHookConfig> result = operation.queryWebHookConfigByManufacturer(webHookConfig, pageNum, pageSize); // operating result
            out.write(JsonUtils.serialize(result).getBytes(Constants.DEFAULT_CHARSET));
        } catch (Exception e) {
            LOGGER.error("get WebHookConfigOperation implementation Failed.", e);
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/EventHandler.java`
#### Snippet
```java
            CloudEvent event = EventFormatProvider
                .getInstance()
                .resolveFormat(JsonFormat.CONTENT_TYPE).deserialize(rawRequest);
            admin.publish(event);
            httpExchange.sendResponseHeaders(200, 0);
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/EventHandler.java`
#### Snippet
```java
                    .getInstance()
                    .resolveFormat(JsonFormat.CONTENT_TYPE)
                    .serialize(event);
                eventJsonList.add(new String(serializedEvent, StandardCharsets.UTF_8));
            }
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/QueryWebHookConfigByIdHandler.java`
#### Snippet
```java
        try (OutputStream out = httpExchange.getResponseBody()) {
            WebHookConfig result = operation.queryWebHookConfigById(webHookConfig); // operating result
            out.write(JsonUtils.serialize(result).getBytes(Constants.DEFAULT_CHARSET));
        } catch (Exception e) {
            logger.error("get WebHookConfigOperation implementation Failed.", e);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java

        for (String entry : cloudEvent.getExtensionNames()) {
            span.setAttribute(entry, cloudEvent.getExtension(entry) == null ? "" : cloudEvent.getExtension(entry).toString());
        }
        return span;
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
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/common/EventMeshTestUtils.java`
#### Snippet
```java
                .withDataContentType(ExampleConstants.CLOUDEVENT_CONTENT_TYPE)
                .withType(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME)
                .withData(JsonUtils.serialize(content).getBytes(StandardCharsets.UTF_8))
                .withExtension(UtilsConstants.TTL, DEFAULT_TTL_MS)
                .build();
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/tcp/common/EventMeshTestUtils.java`
#### Snippet
```java
                .withDataContentType(ExampleConstants.CLOUDEVENT_CONTENT_TYPE)
                .withType(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME)
                .withData(JsonUtils.serialize(content).getBytes(StandardCharsets.UTF_8))
                .withExtension(UtilsConstants.TTL, DEFAULT_TTL_MS)
                .withExtension(UtilsConstants.MSG_TYPE, "persistent")
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/grpc/GrpcAbstractDemo.java`
#### Snippet
```java
                .withDataContentType(ExampleConstants.CLOUDEVENT_CONTENT_TYPE)
                .withType(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME)
                .withData(JsonUtils.serialize(content).getBytes(StandardCharsets.UTF_8))
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
                .withData(JsonUtils.serialize(content).getBytes(StandardCharsets.UTF_8))
                .withExtension(Constants.EVENTMESH_MESSAGE_CONST_TTL, String.valueOf(4_000))
                .build();
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/http/demo/sub/controller/SubController.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        final Map<String, String> contentMap = JsonUtils.deserialize(content, HashMap.class);
        if (StringUtils.equals(EventMeshCommon.CLOUD_EVENTS_PROTOCOL_NAME, contentMap.get(ProtocolKey.PROTOCOL_TYPE))) {
            final EventFormat eventFormat = EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE);
            if (eventFormat != null) {
```

### DataFlowIssue
Argument `cloudEvent.getDataContentType()` might be null
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/MessageUtils.java`
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
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/MessageUtils.java`
#### Snippet
```java
            msg.getHeader().putProperty(Constants.PROTOCOL_DESC, "tcp");
            final byte[] bodyByte = EventFormatProvider.getInstance().resolveFormat(cloudEvent.getDataContentType())
                    .serialize((CloudEvent) message);
            msg.setBody(bodyByte);
        } else if (message instanceof EventMeshMessage) {
```

### DataFlowIssue
Argument `IPUtils.getLocalAddress()` might be null
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java
                .withExtension(ProtocolKey.ENV, clientConfig.getEnv())
                .withExtension(ProtocolKey.IDC, clientConfig.getIdc())
                .withExtension(ProtocolKey.IP, IPUtils.getLocalAddress())
                .withExtension(ProtocolKey.PID, Long.toString(ThreadUtils.getPID()))
                .withExtension(ProtocolKey.SYS, clientConfig.getSys())
```

### DataFlowIssue
Argument `cloudEvent.getDataContentType()` might be null
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/CloudEventProducer.java`
#### Snippet
```java
    private RequestParam buildCommonPostParam(final CloudEvent cloudEvent) {
        validateCloudEvent(cloudEvent);
        final byte[] bodyByte = EventFormatProvider.getInstance().resolveFormat(cloudEvent.getDataContentType())
            .serialize(cloudEvent);
        final String content = new String(bodyByte, StandardCharsets.UTF_8);
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/CloudEventProducer.java`
#### Snippet
```java
        validateCloudEvent(cloudEvent);
        final byte[] bodyByte = EventFormatProvider.getInstance().resolveFormat(cloudEvent.getDataContentType())
            .serialize(cloudEvent);
        final String content = new String(bodyByte, StandardCharsets.UTF_8);

```

### DataFlowIssue
Dereference of `replyMessage` may produce `NullPointerException`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/EventMeshMessageProducer.java`
#### Snippet
```java
            SendMessageResponseBody.ReplyMessage.class);
        return EventMeshMessage.builder()
            .content(replyMessage.body)
            .prop(replyMessage.properties)
            .topic(replyMessage.topic).build();
```

### DataFlowIssue
Casting `Arrays.asList(...).toArray()` to `String[]` will produce `ClassCastException` for any non-null value
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/model/RequestParam.java`
#### Snippet
```java
            queryParams.put(key, new String[]{value});
        } else {
            queryParams.put(key, (String[]) Arrays.asList(queryParams.get(key), value).toArray());
        }
        return this;
```

### DataFlowIssue
Method invocation `getRetCode` may produce `NullPointerException`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/consumer/EventMeshHttpConsumer.java`
#### Snippet
```java
                final String res = HttpUtils.post(httpClient, target, requestParam);
                final EventMeshRetObj ret = JsonUtils.deserialize(res, EventMeshRetObj.class);
                if (EventMeshRetCode.SUCCESS.getRetCode() != ret.getRetCode()) {
                    throw new EventMeshException(ret.getRetCode(), ret.getRetMsg());
                }
```

### DataFlowIssue
Method invocation `getRetCode` may produce `NullPointerException`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/consumer/EventMeshHttpConsumer.java`
#### Snippet
```java
            final EventMeshRetObj ret = JsonUtils.deserialize(unSubRes, EventMeshRetObj.class);

            if (EventMeshRetCode.SUCCESS.getRetCode() != ret.getRetCode()) {
                throw new EventMeshException(ret.getRetCode(), ret.getRetMsg());
            }
```

### DataFlowIssue
Method invocation `getRetCode` may produce `NullPointerException`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/consumer/EventMeshHttpConsumer.java`
#### Snippet
```java
            final String subRes = HttpUtils.post(httpClient, target, subscribeParam);
            final EventMeshRetObj ret = JsonUtils.deserialize(subRes, EventMeshRetObj.class);
            if (ret.getRetCode() != EventMeshRetCode.SUCCESS.getRetCode()) {
                throw new EventMeshException(ret.getRetCode(), ret.getRetMsg());
            }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-http/src/main/java/org/apache/eventmesh/protocol/http/HttpProtocolAdaptor.java`
#### Snippet
```java
                new TypeReference<Map<String, Object>>() {
                });
            String requestHeader = JsonUtils.serialize(dataContentMap.get(CONSTANTS_KEY_HEADERS));
            byte[] requestBody = JsonUtils.serialize(dataContentMap.get(CONSTANTS_KEY_BODY)).getBytes(StandardCharsets.UTF_8);
            Map<String, Object> requestHeaderMap = JsonUtils.deserialize(requestHeader, new TypeReference<Map<String, Object>>() {
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-http/src/main/java/org/apache/eventmesh/protocol/http/HttpProtocolAdaptor.java`
#### Snippet
```java
                });
            String requestHeader = JsonUtils.serialize(dataContentMap.get(CONSTANTS_KEY_HEADERS));
            byte[] requestBody = JsonUtils.serialize(dataContentMap.get(CONSTANTS_KEY_BODY)).getBytes(StandardCharsets.UTF_8);
            Map<String, Object> requestHeaderMap = JsonUtils.deserialize(requestHeader, new TypeReference<Map<String, Object>>() {
            });
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-http/src/main/java/org/apache/eventmesh/protocol/http/resolver/HttpRequestProtocolResolver.java`
#### Snippet
```java
            data.put(HttpProtocolConstant.CONSTANTS_KEY_METHOD, httpEventWrapper.getHttpMethod());
            // with data
            return builder.withData(JsonUtils.serialize(data).getBytes(StandardCharsets.UTF_8)).build();
        } catch (Exception e) {
            throw new ProtocolHandleException(e.getMessage(), e);
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/tcp/TcpMessageProtocolResolver.java`
#### Snippet
```java
            // todo:resolve different format
            CloudEvent event = EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE)
                    .deserialize(cloudEventJson.getBytes(StandardCharsets.UTF_8));
            cloudEventBuilder = CloudEventBuilder.v03(event);

```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/CloudEventsProtocolAdaptor.java`
#### Snippet
```java
                public Map<String, Object> toMap() {
                    byte[] eventByte =
                        EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE).serialize(cloudEvent);
                    map.put("content", new String(eventByte, StandardCharsets.UTF_8));
                    return map;
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/CloudEventsProtocolAdaptor.java`
#### Snippet
```java
    public ProtocolTransportObject fromCloudEvent(CloudEvent cloudEvent) throws ProtocolHandleException {
        Preconditions.checkNotNull(cloudEvent, "cloudEvent cannot be null");
        String protocolDesc = cloudEvent.getExtension(Constants.PROTOCOL_DESC).toString();
        if (StringUtils.equals("http", protocolDesc)) {
            HttpCommand httpCommand = new HttpCommand();
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/MeshMessageProtocolAdaptor.java`
#### Snippet
```java
        String protocolDesc =
            cloudEvent.getExtension(Constants.PROTOCOL_DESC) == null ? null :
                cloudEvent.getExtension(Constants.PROTOCOL_DESC).toString();

        if (StringUtils.equals(MeshMessageProtocolConstant.PROTOCOL_DESC_HTTP, protocolDesc)) {
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchV2ProtocolResolver.java`
#### Snippet
```java
            if (StringUtils.equals(SpecVersion.V1.toString(), protocolVersion)) {
                event = EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE)
                        .deserialize(content.getBytes(StandardCharsets.UTF_8));
                event = CloudEventBuilder.from(event)
                        .withExtension(ProtocolKey.REQUEST_CODE, code)
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchV2ProtocolResolver.java`
#### Snippet
```java
            } else if (StringUtils.equals(SpecVersion.V03.toString(), protocolVersion)) {
                event = EventFormatProvider.getInstance().resolveFormat(JsonFormat.CONTENT_TYPE)
                        .deserialize(content.getBytes(StandardCharsets.UTF_8));
                event = CloudEventBuilder.from(event)
                        .withExtension(ProtocolKey.REQUEST_CODE, code)
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `eventmesh-trace-plugin/eventmesh-trace-jaeger/src/main/java/org/apache/eventmesh/trace/jaeger/JaegerTraceService.java`
#### Snippet
```java
            @Override
            public String get(final @Nullable Map<String, Object> carrier, final String key) {
                return Optional.ofNullable(carrier.get(key)).map(Objects::toString).orElse(null);
            }
        });
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
                    new EventMeshDataInfo(eventMeshClusterName, eventMeshName,
                            endPoint, System.currentTimeMillis(), eventMeshRegisterInfo.getMetadata());
            ByteSequence etcdValue = ByteSequence.from(JsonUtils.serialize(eventMeshDataInfo).getBytes(Constants.DEFAULT_CHARSET));
            etcdClient.getKVClient().put(etcdKey, etcdValue, PutOption.newBuilder().withLeaseId(getLeaseId()).build());
            eventMeshRegisterInfoMap.put(eventMeshName, eventMeshRegisterInfo);
```

### DataFlowIssue
Argument `cloudEvent.getSubject()` might be null
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/producer/ProducerImpl.java`
#### Snippet
```java
    public void sendAsync(CloudEvent cloudEvent, SendCallback sendCallback) {
        try {
            this.producer.send(new ProducerRecord<>(cloudEvent.getSubject(), cloudEvent), (metadata, exception) -> {
                if (exception != null) {
                    ConnectorRuntimeException onsEx = new ConnectorRuntimeException(exception.getMessage(), exception);
```

### DataFlowIssue
Argument `cloudEvent.getSubject()` might be null
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/producer/ProducerImpl.java`
#### Snippet
```java
    public void send(CloudEvent cloudEvent) {
        try {
            this.producer.send(new ProducerRecord<>(cloudEvent.getSubject(), cloudEvent));
        } catch (Exception e) {
            log.error(String.format("Send message oneway Exception, %s", cloudEvent), e);
```

### DataFlowIssue
Method invocation `serialize` may produce `NullPointerException`
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/client/PulsarClientWrapper.java`
#### Snippet
```java
                .getInstance()
                .resolveFormat(JsonFormat.CONTENT_TYPE)
                .serialize(cloudEvent);
            producer.sendAsync(serializedCloudEvent).thenAccept(messageId -> {
                sendCallback.onSuccess(CloudEventUtils.convertSendResult(cloudEvent));
```

### DataFlowIssue
Method invocation `deserialize` may produce `NullPointerException`
in `eventmesh-connector-plugin/eventmesh-connector-pulsar/src/main/java/org/apache/eventmesh/connector/pulsar/consumer/PulsarConsumerImpl.java`
#### Snippet
```java
                      .getInstance()
                      .resolveFormat(JsonFormat.CONTENT_TYPE)
                      .deserialize(msg.getData());
                  eventListener.consume(cloudEvent, consumeContext);
                  try {
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
                .creatingParentsIfNeeded()
                .withMode(CreateMode.EPHEMERAL)
                .forPath(path, JsonUtils.serialize(eventMeshInstance).getBytes(StandardCharsets.UTF_8));

            eventMeshRegisterInfoMap.put(eventMeshName, eventMeshRegisterInfo);
```

### DataFlowIssue
Method invocation `getMetaData` may produce `NullPointerException`
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

                    EventMeshDataInfo eventMeshDataInfo =
                        new EventMeshDataInfo(clusterName, serviceName, endpoint, stat.getMtime(), eventMeshInstance.getMetaData());

                    eventMeshDataInfoList.add(eventMeshDataInfo);
```

### DataFlowIssue
Method invocation `getMetaData` may produce `NullPointerException`
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java

                    EventMeshDataInfo eventMeshDataInfo =
                        new EventMeshDataInfo(clusterName, serviceName, endpoint, stat.getMtime(), eventMeshInstance.getMetaData());

                    eventMeshDataInfoList.add(eventMeshDataInfo);
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaEvent.java`
#### Snippet
```java

    public static byte[] toByteArray(PravegaEvent pravegaEvent) {
        return JsonUtils.serialize(pravegaEvent).getBytes(StandardCharsets.UTF_8);
    }

```

### DataFlowIssue
Argument `msg.getSubject()` might be null
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
            if (msg != null) {
                msgExtList.add(CloudEventUtils.msgConvertExt(
                    RocketMQMessageFactory.createWriter(msg.getSubject()).writeBinary(msg)));
            }
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        org.apache.rocketmq.common.message.Message msg =
                RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);
        msg = supplySysProp(msg, cloudEvent);
        try {
            this.rocketmqProducer.send(msg, this.sendCallbackConvert(msg, sendCallback));
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        for (String sysPropKey : MessageConst.STRING_HASH_SET) {
            String ceKey = sysPropKey.toLowerCase().replaceAll("_", Constants.MESSAGE_PROP_SEPARATOR);
            if (cloudEvent.getExtension(ceKey) != null && StringUtils.isNotEmpty(cloudEvent.getExtension(ceKey).toString())) {
                MessageAccessor.putProperty(msg, sysPropKey, Objects.requireNonNull(cloudEvent.getExtension(ceKey)).toString());
                msg.getProperties().remove(ceKey);
```

### DataFlowIssue
Variable is already assigned to this value
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
                returnType = ConsumeReturnType.FAILED;
            } else if (ConsumeConcurrentlyStatus.CONSUME_SUCCESS == status) {
                returnType = ConsumeReturnType.SUCCESS;
            }

```

### DataFlowIssue
Method invocation `getProps` may produce `NullPointerException`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java

            if (ConsumeMessageConcurrentlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                consumeMessageContext.getProps().put(MixAll.CONSUME_CONTEXT_TYPE, returnType.name());
            }

```

### DataFlowIssue
Method invocation `setStatus` may produce `NullPointerException`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java

            if (ConsumeMessageConcurrentlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                consumeMessageContext.setStatus(status.toString());
                consumeMessageContext.setSuccess(ConsumeConcurrentlyStatus.CONSUME_SUCCESS == status);
                ConsumeMessageConcurrentlyService.this.defaultMQPushConsumerImpl.executeHookAfter(consumeMessageContext);
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `byte[]`
in `eventmesh-connector-plugin/eventmesh-connector-rabbitmq/src/main/java/org/apache/eventmesh/connector/rabbitmq/cloudevent/RabbitmqCloudEvent.java`
#### Snippet
```java

    public static byte[] toByteArray(RabbitmqCloudEvent rabbitmqCloudEvent) throws Exception {
        Optional<byte[]> optionalBytes = ByteArrayUtils.objectToBytes(rabbitmqCloudEvent);
        return optionalBytes.orElseGet(() -> new byte[]{});
    }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `eventmesh-connector-plugin/eventmesh-connector-rabbitmq/src/main/java/org/apache/eventmesh/connector/rabbitmq/producer/RabbitmqProducer.java`
#### Snippet
```java
    public void sendOneway(CloudEvent cloudEvent) {
        try {
            Optional<byte[]> optionalBytes = ByteArrayUtils.objectToBytes(cloudEvent);
            if (optionalBytes.isPresent()) {
                byte[] data = optionalBytes.get();
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/ConsumerManager.java`
#### Snippet
```java
                final List<ConsumerGroupClient> clientList = new LinkedList<>();
                clientTable.values().forEach(clients -> {
                    clientList.addAll(clients);
                });

```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reconnect()` overrides synchronized method
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPSubClient.java`
#### Snippet
```java

    @Override
    public void reconnect() throws EventMeshException {
        try {
            super.reconnect();
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reconnect()` overrides synchronized method
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/cloudevent/CloudEventTCPPubClient.java`
#### Snippet
```java

    @Override
    public void reconnect() throws EventMeshException {
        try {
            super.reconnect();
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reconnect()` overrides synchronized method
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPPubClient.java`
#### Snippet
```java

    @Override
    public void reconnect() throws EventMeshException {
        try {
            super.reconnect();
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reconnect()` overrides synchronized method
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/eventmeshmessage/EventMeshMessageTCPSubClient.java`
#### Snippet
```java

    @Override
    public void reconnect() throws EventMeshException {
        try {
            super.reconnect();
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'body' in a Serializable class
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/Package.java`
#### Snippet
```java
    private static final long serialVersionUID = 3353018029137072737L;
    private transient Header header;
    private Object body;

    public Header getHeader() {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/consumergroup/WebhookTopicConfig.java`
#### Snippet
```java
        if (client.getGrpcType() != grpcType) {
            logger.warn("Invalid grpc type: {}, expecting grpc type: {}, can not register client {}",
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

## RuleId[ruleID=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '('
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
        acquireParamNames();
        String parsedPattern =
                getUrlMappingPattern().replaceFirst(URL_FORMAT_REGEX, URL_FORMAT_MATCH_REGEX);
        parsedPattern = parsedPattern.replaceAll(URL_PARAMETER_REGEX, URL_PARAMETER_MATCH_REGEX);
        this.compiledUrlMappingPattern = Pattern.compile(parsedPattern + URL_QUERY_STRING_REGEX);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '('
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
        String parsedPattern =
                getUrlMappingPattern().replaceFirst(URL_FORMAT_REGEX, URL_FORMAT_MATCH_REGEX);
        parsedPattern = parsedPattern.replaceAll(URL_PARAMETER_REGEX, URL_PARAMETER_MATCH_REGEX);
        this.compiledUrlMappingPattern = Pattern.compile(parsedPattern + URL_QUERY_STRING_REGEX);
    }
```

## RuleId[ruleID=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'List' may not contain objects of type 'String'
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/consumer/PullConsumerImpl.java`
#### Snippet
```java
        try {
            // Unsubscribe topic:
            topicList.remove(topic);
        } catch (Exception e) {
            LOG.error("unsubscribe topic error", e);
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `HttpConnectionHandler` may be 'static'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
    }

    private class HttpConnectionHandler extends ChannelDuplexHandler {

        public final transient AtomicInteger connections = new AtomicInteger(0);
```

## RuleId[ruleID=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                    }

                    synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping()) {
                        final ConsumerGroupConf consumerGroupConf =
                                eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup);
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/UnSubscribeProcessor.java`
#### Snippet
```java

                    }
                    synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping()) {
                        final ConsumerGroupConf consumerGroupConf =
                                eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup);
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java

    public synchronized void start() throws Exception {
        if (started.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQProducer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
        }

        meshMQProducer.start();

        started.compareAndSet(false, true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
        meshMQProducer.start();

        started.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java

    public synchronized void init(Properties keyValue) throws Exception {
        if (inited.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQProducer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
        }

        meshMQProducer.init(keyValue);
        inited.compareAndSet(false, true);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java

        meshMQProducer.init(keyValue);
        inited.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java

    public synchronized void shutdown() throws Exception {
        if (!inited.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
        }

        if (!started.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQProducer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
        }

        meshMQProducer.shutdown();

        inited.compareAndSet(true, false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java
        meshMQProducer.shutdown();

        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQProducerWrapper.java`
#### Snippet
```java

        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java

    public synchronized void shutdown() throws Exception {
        if (!inited.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
        }

        if (!started.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQAdmin` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
        }

        meshMQAdmin.shutdown();

        inited.compareAndSet(true, false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
        meshMQAdmin.shutdown();

        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java

        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java

    public synchronized void init(Properties keyValue) throws Exception {
        if (inited.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQAdmin` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
        }

        meshMQAdmin.init(keyValue);
        inited.compareAndSet(false, true);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java

        meshMQAdmin.init(keyValue);
        inited.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java

    public synchronized void start() throws Exception {
        if (started.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQAdmin` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
        }

        meshMQAdmin.start();

        started.compareAndSet(false, true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQAdminWrapper.java`
#### Snippet
```java
        meshMQAdmin.start();

        started.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQPushConsumer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java
    public synchronized void init(Properties keyValue) throws Exception {

        meshMQPushConsumer.init(keyValue);
        inited.compareAndSet(false, true);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java

        meshMQPushConsumer.init(keyValue);
        inited.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQPushConsumer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java

    public synchronized void start() throws Exception {
        meshMQPushConsumer.start();
        started.compareAndSet(false, true);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java
    public synchronized void start() throws Exception {
        meshMQPushConsumer.start();
        started.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `meshMQPushConsumer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java

    public synchronized void shutdown() throws Exception {
        meshMQPushConsumer.shutdown();
        inited.compareAndSet(false, true);
        started.compareAndSet(false, true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java
    public synchronized void shutdown() throws Exception {
        meshMQPushConsumer.shutdown();
        inited.compareAndSet(false, true);
        started.compareAndSet(false, true);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/plugin/MQConsumerWrapper.java`
#### Snippet
```java
        meshMQPushConsumer.shutdown();
        inited.compareAndSet(false, true);
        started.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/ListenTask.java`
#### Snippet
```java
        session.setListenRequestSeq(pkg.getHeader().getSeq());
        try {
            synchronized (session) {
                eventMeshTCPServer.getClientSessionGroupMapping().readySession(session);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshTCPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/ListenTask.java`
#### Snippet
```java
        try {
            synchronized (session) {
                eventMeshTCPServer.getClientSessionGroupMapping().readySession(session);
            }
        } catch (Exception e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/ListenTask.java`
#### Snippet
```java
        try {
            synchronized (session) {
                eventMeshTCPServer.getClientSessionGroupMapping().readySession(session);
            }
        } catch (Exception e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
        Package msg = new Package();
        try {
            synchronized (session) {
                List<SubscriptionItem> topics = new ArrayList<SubscriptionItem>();
                if (MapUtils.isNotEmpty(session.getSessionContext().subscribeTopics)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
            synchronized (session) {
                List<SubscriptionItem> topics = new ArrayList<SubscriptionItem>();
                if (MapUtils.isNotEmpty(session.getSessionContext().subscribeTopics)) {
                    for (Map.Entry<String, SubscriptionItem> entry : session.getSessionContext().subscribeTopics.entrySet()) {
                        topics.add(entry.getValue());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
                List<SubscriptionItem> topics = new ArrayList<SubscriptionItem>();
                if (MapUtils.isNotEmpty(session.getSessionContext().subscribeTopics)) {
                    for (Map.Entry<String, SubscriptionItem> entry : session.getSessionContext().subscribeTopics.entrySet()) {
                        topics.add(entry.getValue());
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
                        topics.add(entry.getValue());
                    }
                    session.unsubscribe(topics);
                    MESSAGE_LOGGER.info("UnSubscriberTask succeed|user={}|topics={}", session.getClient(), topics);
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/UnSubscribeTask.java`
#### Snippet
```java
                    }
                    session.unsubscribe(topics);
                    MESSAGE_LOGGER.info("UnSubscriberTask succeed|user={}|topics={}", session.getClient(), topics);
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/SubscribeTask.java`
#### Snippet
```java
            });

            synchronized (session) {
                session.subscribe(subscriptionItems);
                if (LOGGER.isInfoEnabled()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/SubscribeTask.java`
#### Snippet
```java

            synchronized (session) {
                session.subscribe(subscriptionItems);
                if (LOGGER.isInfoEnabled()) {
                    LOGGER.info("SubscribeTask succeed|user={}|topics={}", session.getClient(), subscriptionItems);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/SubscribeTask.java`
#### Snippet
```java
                session.subscribe(subscriptionItems);
                if (LOGGER.isInfoEnabled()) {
                    LOGGER.info("SubscribeTask succeed|user={}|topics={}", session.getClient(), subscriptionItems);
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
            }

            synchronized (session) {
                long sendTime = System.currentTimeMillis();
                event = addTimestamp(event, cmd, sendTime);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                event = addTimestamp(event, cmd, sendTime);

                sendStatus = session
                        .upstreamMsg(pkg.getHeader(), event,
                                createSendCallback(replyCmd, taskExecuteTime, event),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pkg` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java

                sendStatus = session
                        .upstreamMsg(pkg.getHeader(), event,
                                createSendCallback(replyCmd, taskExecuteTime, event),
                                startTime, taskExecuteTime);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `startTime` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                        .upstreamMsg(pkg.getHeader(), event,
                                createSendCallback(replyCmd, taskExecuteTime, event),
                                startTime, taskExecuteTime);

                if (StringUtils.equals(EventMeshTcpSendStatus.SUCCESS.name(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                    MESSAGE_LOGGER.info("pkg|eventMesh2mq|cmd={}|Msg={}|user={}|wait={}ms|cost={}ms",
                            cmd, event,
                            session.getClient(), taskExecuteTime - startTime, sendTime - startTime);
                } else {
                    throw new Exception(sendStatus.getDetail());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `startTime` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                    MESSAGE_LOGGER.info("pkg|eventMesh2mq|cmd={}|Msg={}|user={}|wait={}ms|cost={}ms",
                            cmd, event,
                            session.getClient(), taskExecuteTime - startTime, sendTime - startTime);
                } else {
                    throw new Exception(sendStatus.getDetail());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `startTime` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                    MESSAGE_LOGGER.info("pkg|eventMesh2mq|cmd={}|Msg={}|user={}|wait={}ms|cost={}ms",
                            cmd, event,
                            session.getClient(), taskExecuteTime - startTime, sendTime - startTime);
                } else {
                    throw new Exception(sendStatus.getDetail());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `simpleMessage` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/StreamPushRequest.java`
#### Snippet
```java
                StreamObserver<SimpleMessage> emitter = eventEmitter.getEmitter();
                synchronized (emitter) {
                    emitter.onNext(simpleMessage);
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
    public synchronized void shutdownPersistentConsumer() throws Exception {

        if (started4Persistent.get()) {
            persistentMsgConsumer.shutdown();
            if (log.isInfoEnabled()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
            }
        }
        started4Persistent.compareAndSet(true, false);
        inited4Persistent.compareAndSet(true, false);
        persistentMsgConsumer = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        }
        started4Persistent.compareAndSet(true, false);
        inited4Persistent.compareAndSet(true, false);
        persistentMsgConsumer = null;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerStarted` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void startClientGroupProducer() throws Exception {
        if (producerStarted.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerStarted` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        mqProducerWrapper.init(keyValue);
        mqProducerWrapper.start();
        producerStarted.compareAndSet(false, true);
        log.info("starting producer success, group:{}", group);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void initClientGroupBroadcastConsumer() throws Exception {
        if (inited4Broadcast.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        broadCastMsgConsumer.registerEventListener(listener);

        inited4Broadcast.compareAndSet(false, true);
        if (log.isInfoEnabled()) {
            log.info("init broadCastMsgConsumer success, group:{}", group);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void shutdownBroadCastConsumer() throws Exception {
        if (started4Broadcast.get()) {
            broadCastMsgConsumer.shutdown();
            if (log.isInfoEnabled()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
            }
        }
        started4Broadcast.compareAndSet(true, false);
        inited4Broadcast.compareAndSet(true, false);
        broadCastMsgConsumer = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        }
        started4Broadcast.compareAndSet(true, false);
        inited4Broadcast.compareAndSet(true, false);
        broadCastMsgConsumer = null;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerStarted` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void shutdownProducer() throws Exception {
        if (!producerStarted.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerStarted` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        }
        mqProducerWrapper.shutdown();
        producerStarted.compareAndSet(true, false);
        log.info("shutdown producer success for group:{}", group);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void initClientGroupPersistentConsumer() throws Exception {
        if (inited4Persistent.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        persistentMsgConsumer.registerEventListener(listener);

        inited4Persistent.compareAndSet(false, true);
        if (log.isInfoEnabled()) {
            log.info("init persistentMsgConsumer success, group:{}", group);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void startClientGroupPersistentConsumer() throws Exception {
        if (started4Persistent.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Persistent` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        }
        persistentMsgConsumer.start();
        started4Persistent.compareAndSet(false, true);
        if (log.isInfoEnabled()) {
            log.info("starting persistentMsgConsumer success, group:{}", group);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java

    public synchronized void startClientGroupBroadcastConsumer() throws Exception {
        if (started4Broadcast.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started4Broadcast` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
        }
        broadCastMsgConsumer.start();
        started4Broadcast.compareAndSet(false, true);
        log.info("starting broadCastMsgConsumer success, group:{}", group);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
        }

        if (started.get()) {
            shutdown();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
    public synchronized void init() throws Exception {
        eventMeshConsumer.init();
        inited.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
        setupEventMeshConsumer(consumerGroupConfig);
        eventMeshConsumer.start();
        started.compareAndSet(false, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerGroupManager.java`
#### Snippet
```java
    public synchronized void shutdown() throws Exception {
        eventMeshConsumer.shutdown();
        started.compareAndSet(true, false);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java

    public synchronized void shutdown() throws Exception {
        if (!inited.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        }

        if (!started.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `mqProducerWrapper` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
            return;
        }
        mqProducerWrapper.shutdown();
        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        }
        mqProducerWrapper.shutdown();
        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
        logger.info("EventMeshProducer [{}] shutdown.............", producerGroupConfig.getGroupName());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        mqProducerWrapper.shutdown();
        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
        logger.info("EventMeshProducer [{}] shutdown.............", producerGroupConfig.getGroupName());
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
        logger.info("EventMeshProducer [{}] shutdown.............", producerGroupConfig.getGroupName());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerGroupConfig` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        inited.compareAndSet(true, false);
        started.compareAndSet(true, false);
        logger.info("EventMeshProducer [{}] shutdown.............", producerGroupConfig.getGroupName());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java

    public synchronized void start() throws Exception {
        if (started.get()) {
            return;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `mqProducerWrapper` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        }

        mqProducerWrapper.start();
        started.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] started.............", producerGroupConfig.getGroupName());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java

        mqProducerWrapper.start();
        started.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] started.............", producerGroupConfig.getGroupName());
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        mqProducerWrapper.start();
        started.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] started.............", producerGroupConfig.getGroupName());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `producerGroupConfig` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        mqProducerWrapper.start();
        started.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] started.............", producerGroupConfig.getGroupName());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.producerGroupConfig` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
    public synchronized void init(EventMeshHTTPConfiguration eventMeshHttpConfiguration,
                                  ProducerGroupConf producerGroupConfig) throws Exception {
        this.producerGroupConfig = producerGroupConfig;
        this.eventMeshHttpConfiguration = eventMeshHttpConfiguration;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.eventMeshHttpConfiguration` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
                                  ProducerGroupConf producerGroupConfig) throws Exception {
        this.producerGroupConfig = producerGroupConfig;
        this.eventMeshHttpConfiguration = eventMeshHttpConfiguration;

        Properties keyValue = new Properties();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `mqProducerWrapper` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        //TODO for defibus
        keyValue.put("eventMeshIDC", eventMeshHttpConfiguration.getEventMeshIDC());
        mqProducerWrapper = new MQProducerWrapper(eventMeshHttpConfiguration.getEventMeshConnectorPluginType());
        mqProducerWrapper.init(keyValue);
        inited.compareAndSet(false, true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `mqProducerWrapper` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        keyValue.put("eventMeshIDC", eventMeshHttpConfiguration.getEventMeshIDC());
        mqProducerWrapper = new MQProducerWrapper(eventMeshHttpConfiguration.getEventMeshConnectorPluginType());
        mqProducerWrapper.init(keyValue);
        inited.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] inited.............", producerGroupConfig.getGroupName());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inited` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        mqProducerWrapper = new MQProducerWrapper(eventMeshHttpConfiguration.getEventMeshConnectorPluginType());
        mqProducerWrapper.init(keyValue);
        inited.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] inited.............", producerGroupConfig.getGroupName());
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/producer/EventMeshProducer.java`
#### Snippet
```java
        mqProducerWrapper.init(keyValue);
        inited.compareAndSet(false, true);
        logger.info("EventMeshProducer [{}] inited.............", producerGroupConfig.getGroupName());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
     */
    public synchronized void delConsumer(String consumerGroup) throws Exception {
        logger.info("start delConsumer with consumerGroup {}", consumerGroup);
        if (consumerTable.containsKey(consumerGroup)) {
            ConsumerGroupManager cgm = consumerTable.remove(consumerGroup);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
        if (consumerTable.containsKey(consumerGroup)) {
            ConsumerGroupManager cgm = consumerTable.remove(consumerGroup);
            logger.info("start unsubscribe topic with consumer group manager {}",
                    JsonUtils.serialize(cgm));
            cgm.unsubscribe(consumerGroup);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/ConsumerManager.java`
#### Snippet
```java
            cgm.shutdown();
        }
        logger.info("end delConsumer with consumerGroup {}", consumerGroup);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logger` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
        inited4Persistent.compareAndSet(false, true);
        inited4Broadcast.compareAndSet(false, true);
        logger.info("EventMeshConsumer [{}] inited.............", consumerGroupConf.getConsumerGroup());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
        final String pid = sysHeaderMap.get(ProtocolKey.ClientInstanceKey.PID).toString();

        synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping()) {
            boolean isChange = true;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java

            for (final String unSubTopic : unSubTopicList) {
                final List<Client> groupTopicClients = eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping()
                        .get(consumerGroup + "@" + unSubTopic);
                final Iterator<Client> clientIterator = groupTopicClients.iterator();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                    }

                    synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping()) {
                        final ConsumerGroupConf consumerGroupConf =
                                eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                    synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping()) {
                        final ConsumerGroupConf consumerGroupConf =
                                eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup);
                        final Map<String, ConsumerGroupTopicConf> map =
                                consumerGroupConf.getConsumerGroupTopicConf();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                            }
                        }
                        eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().put(consumerGroup, consumerGroupConf);
                    }
                } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
            if (isChange) {
                try {
                    eventMeshHTTPServer.getConsumerManager().notifyConsumerManager(consumerGroup,
                            eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup));

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                try {
                    eventMeshHTTPServer.getConsumerManager().notifyConsumerManager(consumerGroup,
                            eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup));

                    responseBodyMap.put(EventMeshConstants.RET_CODE, EventMeshRetCode.SUCCESS.getRetCode());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                //remove
                try {
                    eventMeshHTTPServer.getConsumerManager()
                            .notifyConsumerManager(consumerGroup, null);
                    responseBodyMap.put(EventMeshConstants.RET_CODE, EventMeshRetCode.SUCCESS.getRetCode());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                    handlerSpecific.sendResponse(responseHeaderMap, responseBodyMap);
                    // clean ClientInfo
                    eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping().keySet()
                            .removeIf(s -> StringUtils.contains(s, consumerGroup));
                    // clean ConsumerGroupInfo
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                            .removeIf(s -> StringUtils.contains(s, consumerGroup));
                    // clean ConsumerGroupInfo
                    eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().keySet()
                            .removeIf(s -> StringUtils.equals(consumerGroup, s));
                } catch (Exception e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalSubscribeEventProcessor.java`
#### Snippet
```java
        }

        synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping()) {
            ClientInfo clientInfo = getClientInfo(requestWrapper);
            SubscriptionManager subscriptionManager = eventMeshHTTPServer.getSubscriptionManager();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalSubscribeEventProcessor.java`
#### Snippet
```java
        synchronized (eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping()) {
            ClientInfo clientInfo = getClientInfo(requestWrapper);
            SubscriptionManager subscriptionManager = eventMeshHTTPServer.getSubscriptionManager();
            subscriptionManager.registerClient(clientInfo, consumerGroup, subscriptionList, url);
            subscriptionManager.updateSubscription(clientInfo, consumerGroup, url, subscriptionList);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalSubscribeEventProcessor.java`
#### Snippet
```java
            try {
                // subscription relationship change notification
                eventMeshHTTPServer.getConsumerManager().notifyConsumerManager(consumerGroup,
                        eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup));
                responseBodyMap.put("retCode", EventMeshRetCode.SUCCESS.getRetCode());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `eventMeshHTTPServer` accessed in synchronized context
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalSubscribeEventProcessor.java`
#### Snippet
```java
                // subscription relationship change notification
                eventMeshHTTPServer.getConsumerManager().notifyConsumerManager(consumerGroup,
                        eventMeshHTTPServer.getSubscriptionManager().getLocalConsumerGroupMapping().get(consumerGroup));
                responseBodyMap.put("retCode", EventMeshRetCode.SUCCESS.getRetCode());
                responseBodyMap.put("retMsg", EventMeshRetCode.SUCCESS.getErrMsg());
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
        // return the host ip about this docker located from environment value
        String dockerHostIp = System.getenv("docker_host_ip");
        if (dockerHostIp != null && !"".equals(dockerHostIp)) {
            return dockerHostIp;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/EventHandler.java`
#### Snippet
```java
        try {
            String queryString = httpExchange.getRequestURI().getQuery();
            if (queryString == null || queryString.equals("")) {
                httpExchange.sendResponseHeaders(401, 0);
                out.close();
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/loadbalance/WeightRoundRobinLoadBalanceSelector.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("ConstantConditions")
    public T select() {
        if (CollectionUtils.isEmpty(clusterGroup)) {
            LOG.warn("No servers available");
```

### RedundantSuppression
Redundant suppression
in `eventmesh-connector-plugin/eventmesh-connector-kafka/src/main/java/org/apache/eventmesh/connector/kafka/producer/ProducerImpl.java`
#### Snippet
```java
@Slf4j
@SuppressWarnings("deprecation")
public class ProducerImpl {
    private KafkaProducer<String, CloudEvent> producer;
    Properties properties;
```

### RedundantSuppression
Redundant suppression
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/WebhookUtil.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static Map<String, String> getHttpAuthParam(final String authType) {
        if (StringUtils.isEmpty(authType)) {
            return new HashMap<String, String>();
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
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
                List<SubscriptionItem> topics = new ArrayList<SubscriptionItem>();
                if (MapUtils.isNotEmpty(session.getSessionContext().subscribeTopics)) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/SubscribeTask.java`
#### Snippet
```java
            });

            synchronized (session) {
                session.subscribe(subscriptionItems);
                if (LOGGER.isInfoEnabled()) {
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/producer/ProducerManager.java`
#### Snippet
```java
        EventMeshProducer eventMeshProducer = null;
        if (!producerTable.containsKey(producerGroup)) {
            synchronized (producerTable) {
                if (!producerTable.containsKey(producerGroup)) {
                    ProducerGroupConf producerGroupConfig = new ProducerGroupConf(producerGroup);
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

### SynchronizeOnNonFinalField
Synchronization on a non-final field `sender`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
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
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/SubStreamHandler.java`
#### Snippet
```java
    private void senderOnNext(final Subscription subscription) {
        try {
            synchronized (sender) {
                sender.onNext(subscription);
            }
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
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

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
            rebalanceResult = 1;
        } else {
            rebalanceResult = (modNum != 0 && index < modNum && index >= 0) ? avgNum + 1 : avgNum;
        }
        logger.info("rebalance caculateRedirectNum,group:{}, purpose:{},sum:{},avgNum:{},"
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java

    public String getMappingPattern() {
        return getUrlMappingPattern().replaceFirst(URL_FORMAT_REGEX, "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
        acquireParamNames();
        String parsedPattern =
                getUrlMappingPattern().replaceFirst(URL_FORMAT_REGEX, URL_FORMAT_MATCH_REGEX);
        parsedPattern = parsedPattern.replaceAll(URL_PARAMETER_REGEX, URL_PARAMETER_MATCH_REGEX);
        this.compiledUrlMappingPattern = Pattern.compile(parsedPattern + URL_QUERY_STRING_REGEX);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
        String parsedPattern =
                getUrlMappingPattern().replaceFirst(URL_FORMAT_REGEX, URL_FORMAT_MATCH_REGEX);
        parsedPattern = parsedPattern.replaceAll(URL_PARAMETER_REGEX, URL_PARAMETER_MATCH_REGEX);
        this.compiledUrlMappingPattern = Pattern.compile(parsedPattern + URL_QUERY_STRING_REGEX);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/constants/EventMeshVersion.java`
#### Snippet
```java

    public static String getCurrentVersionDesc() {
        return CURRENT_VERSION.replaceAll("V", "")
                .replaceAll("_", ".")
                .replaceAll("_SNAPSHOT", "-SNAPSHOT");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/constants/EventMeshVersion.java`
#### Snippet
```java
    public static String getCurrentVersionDesc() {
        return CURRENT_VERSION.replaceAll("V", "")
                .replaceAll("_", ".")
                .replaceAll("_SNAPSHOT", "-SNAPSHOT");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/constants/EventMeshVersion.java`
#### Snippet
```java
        return CURRENT_VERSION.replaceAll("V", "")
                .replaceAll("_", ".")
                .replaceAll("_SNAPSHOT", "-SNAPSHOT");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-webhook/eventmesh-webhook-api/src/main/java/org/apache/eventmesh/webhook/api/WebHookOperationConstant.java`
#### Snippet
```java
            String configPath = Constants.EVENTMESH_CONF_HOME;

            filePath = filePath.replace(EVENTMESH_HOME, configPath.substring(0, configPath.lastIndexOf(FILE_SEPARATOR)));
        }
        return filePath;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
            for (Map.Entry<Object, Object> entry : entries) {
                String entryKey = entry.getKey().toString();
                String[] keyGroup = entryKey.split("[\\._]");
                for (int i = 0; i < keyGroup.length; i++) {
                    keyGroup[i] = keyGroup[i].toLowerCase();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
                if (StringUtils.isNotEmpty(msg.getProperty(sysPropKey))) {
                    String prop = msg.getProperty(sysPropKey);
                    sysPropKey = sysPropKey.toLowerCase().replaceAll("_", Constants.MESSAGE_PROP_SEPARATOR);
                    cloudEventBuilder = CloudEventBuilder.from(cloudEvent).withExtension(sysPropKey, prop);
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
                if (StringUtils.isNotEmpty(msg.getProperty(sysPropKey))) {
                    String prop = msg.getProperty(sysPropKey);
                    sysPropKey = sysPropKey.toLowerCase().replaceAll("_", Constants.MESSAGE_PROP_SEPARATOR);
                    cloudEventBuilder = CloudEventBuilder.from(cloudEvent).withExtension(sysPropKey, prop);
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java
            if (StringUtils.isNotEmpty(message.getProperty(sysPropKey))) {
                String prop = message.getProperty(sysPropKey);
                String tmpPropKey = sysPropKey.toLowerCase().replaceAll("_", Constants.MESSAGE_PROP_SEPARATOR);
                MessageAccessor.putProperty(message, tmpPropKey, prop);
                message.getProperties().remove(sysPropKey);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
#### Snippet
```java

    private String buildReaderId(String instanceName) {
        return String.format("%s-reader", instanceName).replaceAll("\\(", "-").replaceAll("\\)", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
#### Snippet
```java

    private String buildReaderId(String instanceName) {
        return String.format("%s-reader", instanceName).replaceAll("\\(", "-").replaceAll("\\)", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
    private Message supplySysProp(Message msg, CloudEvent cloudEvent) {
        for (String sysPropKey : MessageConst.STRING_HASH_SET) {
            String ceKey = sysPropKey.toLowerCase().replaceAll("_", Constants.MESSAGE_PROP_SEPARATOR);
            if (cloudEvent.getExtension(ceKey) != null && StringUtils.isNotEmpty(cloudEvent.getExtension(ceKey).toString())) {
                MessageAccessor.putProperty(msg, sysPropKey, Objects.requireNonNull(cloudEvent.getExtension(ceKey)).toString());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
                    if (StringUtils.isNotEmpty(message.getProperty(sysPropKey))) {
                        String prop = message.getProperty(sysPropKey);
                        String tmpPropKey = sysPropKey.toLowerCase().replaceAll("_", Constants.MESSAGE_PROP_SEPARATOR);
                        MessageAccessor.putProperty(message, tmpPropKey, prop);
                        message.getProperties().remove(sysPropKey);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/file/FileChangeListener.java`
#### Snippet
```java
/**
 * Users can register {@link FileChangeListener} with WatchFileManager via the
 * {@link WatchFileManager#registerFileChangeListener(java.lang.String, org.apache.eventmesh.common.file.FileChangeListener)} method.
 * The {@link FileChangeListener#onChanged(org.apache.eventmesh.common.file.FileChangeContext)} method fires when a file changes,
 * and the {@link FileChangeListener#support(org.apache.eventmesh.common.file.FileChangeContext)} method let the user customize
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.eventmesh.common.file` is unnecessary and can be removed
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/file/FileChangeListener.java`
#### Snippet
```java
/**
 * Users can register {@link FileChangeListener} with WatchFileManager via the
 * {@link WatchFileManager#registerFileChangeListener(java.lang.String, org.apache.eventmesh.common.file.FileChangeListener)} method.
 * The {@link FileChangeListener#onChanged(org.apache.eventmesh.common.file.FileChangeContext)} method fires when a file changes,
 * and the {@link FileChangeListener#support(org.apache.eventmesh.common.file.FileChangeContext)} method let the user customize
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.eventmesh.common.file` is unnecessary and can be removed
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/file/FileChangeListener.java`
#### Snippet
```java
 * Users can register {@link FileChangeListener} with WatchFileManager via the
 * {@link WatchFileManager#registerFileChangeListener(java.lang.String, org.apache.eventmesh.common.file.FileChangeListener)} method.
 * The {@link FileChangeListener#onChanged(org.apache.eventmesh.common.file.FileChangeContext)} method fires when a file changes,
 * and the {@link FileChangeListener#support(org.apache.eventmesh.common.file.FileChangeContext)} method let the user customize
 * which files are supported
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.eventmesh.common.file` is unnecessary and can be removed
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/file/FileChangeListener.java`
#### Snippet
```java
 * {@link WatchFileManager#registerFileChangeListener(java.lang.String, org.apache.eventmesh.common.file.FileChangeListener)} method.
 * The {@link FileChangeListener#onChanged(org.apache.eventmesh.common.file.FileChangeContext)} method fires when a file changes,
 * and the {@link FileChangeListener#support(org.apache.eventmesh.common.file.FileChangeContext)} method let the user customize
 * which files are supported
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.lang3` is unnecessary and can be removed
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/ReplyMessageProcessor.java`
#### Snippet
```java
            .map(Objects::toString)
            .orElse("");
        if (!org.apache.commons.lang3.StringUtils.isEmpty(replyMQCluster)) {
            replyTopic = replyMQCluster + "-" + replyTopic;
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.eventmesh.common.protocol` is unnecessary and can be removed
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/consumergroup/ConsumerGroupTopicConf.java`
#### Snippet
```java

    /**
     * @see org.apache.eventmesh.common.protocol.SubscriptionItem
     */
    private SubscriptionItem subscriptionItem;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java
    }

    public static org.apache.rocketmq.common.message.MessageExt msgConvertExt(Message message) {

        org.apache.rocketmq.common.message.MessageExt rmqMessageExt =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java
    public static org.apache.rocketmq.common.message.MessageExt msgConvertExt(Message message) {

        org.apache.rocketmq.common.message.MessageExt rmqMessageExt =
            new org.apache.rocketmq.common.message.MessageExt();
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java

        org.apache.rocketmq.common.message.MessageExt rmqMessageExt =
            new org.apache.rocketmq.common.message.MessageExt();
        try {
            initProperty(message, rmqMessageExt, Message::getKeys, Message::setKeys);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
    public void sendAsync(CloudEvent cloudEvent, SendCallback sendCallback) {
        this.checkProducerServiceState(this.rocketmqProducer.getDefaultMQProducerImpl());
        org.apache.rocketmq.common.message.Message msg =
                RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);
        msg = supplySysProp(msg, cloudEvent);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java

        this.checkProducerServiceState(this.rocketmqProducer.getDefaultMQProducerImpl());
        org.apache.rocketmq.common.message.Message msg =
                RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
    public SendResult send(CloudEvent cloudEvent) {
        this.checkProducerServiceState(rocketmqProducer.getDefaultMQProducerImpl());
        org.apache.rocketmq.common.message.Message msg =
                RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);
        supplySysProp(msg, cloudEvent);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
        return new RequestCallback() {
            @Override
            public void onSuccess(org.apache.rocketmq.common.message.Message message) {
                // clean the message property to lowercase
                for (String sysPropKey : MessageConst.STRING_HASH_SET) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
    public void reply(final CloudEvent cloudEvent, final SendCallback sendCallback) {
        this.checkProducerServiceState(this.rocketmqProducer.getDefaultMQProducerImpl());
        org.apache.rocketmq.common.message.Message msg =
                RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);
        MessageAccessor.putProperty(msg, MessageConst.PROPERTY_MESSAGE_TYPE, MixAll.REPLY_MESSAGE_FLAG);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.common.message` is unnecessary and can be removed
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/producer/ProducerImpl.java`
#### Snippet
```java
    public void sendOneway(CloudEvent cloudEvent) {
        this.checkProducerServiceState(this.rocketmqProducer.getDefaultMQProducerImpl());
        org.apache.rocketmq.common.message.Message msg =
                RocketMQMessageFactory.createWriter(Objects.requireNonNull(cloudEvent.getSubject())).writeBinary(cloudEvent);
        supplySysProp(msg, cloudEvent);
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/CloudEventUtils.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.error("Error with msgConvertExt", e);
            e.printStackTrace();
        }
        return rmqMessageExt;
```

## RuleId[ruleID=RegExpSingleCharAlternation]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractTask()` of an abstract class should not be declared 'public'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/AbstractTask.java`
#### Snippet
```java
    protected EventMeshTCPServer eventMeshTCPServer;

    public AbstractTask(final Package pkg, final ChannelHandlerContext ctx, long startTime, final EventMeshTCPServer eventMeshTCPServer) {
        this.eventMeshTCPServer = eventMeshTCPServer;
        this.pkg = pkg;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPushRequest()` of an abstract class should not be declared 'public'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/AbstractPushRequest.java`
#### Snippet
```java
    private final AtomicBoolean complete = new AtomicBoolean(Boolean.FALSE);

    public AbstractPushRequest(HandleMsgContext handleMsgContext, Map<String, Set<AbstractPushRequest>> waitingRequests) {
        this.eventMeshGrpcServer = handleMsgContext.getEventMeshGrpcServer();
        this.handleMsgContext = handleMsgContext;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHTTPServer()` of an abstract class should not be declared 'public'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
            eventProcessorTable = new ConcurrentHashMap<>(64);

    public AbstractHTTPServer(final int port, final boolean useTLS,
                              final EventMeshHTTPConfiguration eventMeshHttpConfiguration) {
        super();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHTTPPushRequest()` of an abstract class should not be declared 'public'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AbstractHTTPPushRequest.java`
#### Snippet
```java
    private AtomicBoolean complete = new AtomicBoolean(Boolean.FALSE);

    public AbstractHTTPPushRequest(HandleMsgContext handleMsgContext) {
        this.eventMeshHTTPServer = handleMsgContext.getEventMeshHTTPServer();
        this.handleMsgContext = handleMsgContext;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEventProcessor()` of an abstract class should not be declared 'public'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/inf/AbstractEventProcessor.java`
#### Snippet
```java
    protected transient EventMeshHTTPServer eventMeshHTTPServer;

    public AbstractEventProcessor(EventMeshHTTPServer eventMeshHTTPServer) {
        this.eventMeshHTTPServer = eventMeshHTTPServer;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHttpHandler()` of an abstract class should not be declared 'public'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/AbstractHttpHandler.java`
#### Snippet
```java
    private final HttpHandlerManager httpHandlerManager;

    public AbstractHttpHandler(HttpHandlerManager httpHandlerManager) {
        this.httpHandlerManager = httpHandlerManager;
        this.httpHandlerManager.register(this);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEventMeshTCPPubHandler()` of an abstract class should not be declared 'public'
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/AbstractEventMeshTCPPubHandler.java`
#### Snippet
```java
    private final ConcurrentHashMap<Object, RequestContext> contexts;

    public AbstractEventMeshTCPPubHandler(ConcurrentHashMap<Object, RequestContext> contexts) {
        this.contexts = contexts;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEventMeshTCPSubHandler()` of an abstract class should not be declared 'public'
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/AbstractEventMeshTCPSubHandler.java`
#### Snippet
```java
    protected final ConcurrentHashMap<Object, RequestContext> contexts;

    public AbstractEventMeshTCPSubHandler(ConcurrentHashMap<Object, RequestContext> contexts) {
        this.contexts = contexts;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TcpClient()` of an abstract class should not be declared 'public'
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/common/TcpClient.java`
#### Snippet
```java
        new EventMeshThreadFactory("TCPClientScheduler", true));

    public TcpClient(EventMeshTCPClientConfig eventMeshTcpClientConfig) {
        Preconditions.checkNotNull(eventMeshTcpClientConfig, "EventMeshTcpClientConfig cannot be null");
        Preconditions.checkNotNull(eventMeshTcpClientConfig.getHost(), "Host cannot be null");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractProducerHttpClient()` of an abstract class should not be declared 'public'
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/AbstractProducerHttpClient.java`
#### Snippet
```java
public abstract class AbstractProducerHttpClient<T> extends AbstractHttpClient implements EventMeshProtocolProducer<T> {

    public AbstractProducerHttpClient(final EventMeshHttpClientConfig eventMeshHttpClientConfig)
            throws EventMeshException {
        super(eventMeshHttpClientConfig);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHttpClient()` of an abstract class should not be declared 'public'
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/AbstractHttpClient.java`
#### Snippet
```java
    protected final CloseableHttpClient httpClient;

    public AbstractHttpClient(final EventMeshHttpClientConfig eventMeshHttpClientConfig) throws EventMeshException {
        Objects.requireNonNull(eventMeshHttpClientConfig, "liteClientConfig can't be null");
        Objects.requireNonNull(eventMeshHttpClientConfig.getLiteEventMeshAddr(), "liteServerAddr can't be null");
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java
                    eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping().get(groupTopicKey);

            if (localClients == null) {
                localClients = new ArrayList<>();
                eventMeshHTTPServer.getSubscriptionManager().getLocalClientInfoMapping().put(groupTopicKey, localClients);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/LocalUnSubscribeEventProcessor.java`
#### Snippet
```java

                            List<String> urls = idcUrls.get(client.getIdc());
                            if (urls == null) {
                                urls = new ArrayList<>();
                                idcUrls.put(client.getIdc(), urls);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/UnSubscribeProcessor.java`
#### Snippet
```java

                            List<String> urls = idcUrls.get(client.getIdc());
                            if (urls == null) {
                                urls = new ArrayList<String>();
                                idcUrls.put(client.getIdc(), urls);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
            pkg.setHeader(new Header(REDIRECT_TO_CLIENT, OPStatus.SUCCESS.getCode(), null, null));
            pkg.setBody(new RedirectInfo(newEventMeshIp, port));
            eventMeshTCPServer.getScheduler().schedule(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
            Package msg = new Package();
            msg.setHeader(new Header(SERVER_GOODBYE_REQUEST, eventMeshStatus, errMsg, null));
            eventMeshTCPServer.getScheduler().schedule(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
    public static void closeSessionIfTimeout(EventMeshTCPServer eventMeshTCPServer, Session session,
                                             ClientSessionGroupMapping mapping) {
        eventMeshTCPServer.getScheduler().schedule(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
                    "graceful normal quit from eventmesh", null));

            eventMeshTCPServer.getScheduler().submit(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/GoodbyeTask.java`
#### Snippet
```java
                    pkg.getHeader().getSeq()));
        } finally {
            this.eventMeshTCPServer.getScheduler().submit(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
                    //downstream broadcast msg asynchronously
                    eventMeshTCPServer.getBroadcastMsgDownstreamExecutorService()
                            .submit(new Runnable() {
                                @Override
                                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
    ) {

        this.scheduledExecutorService.schedule(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
        log.warn("rejected by thread pool, try resubmit {} times, consumerGroup:{}", times,
            defaultMQPushConsumerImpl.getDefaultMQPushConsumer().getConsumerGroup());
        this.scheduledExecutorService.schedule(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
    public void start() {
        if (this.defaultMQPushConsumer.getConsumeTimeout() > 0) {
            this.cleanExpireMsgExecutors.scheduleAtFixedRate(new Runnable() {

                @Override
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `needReload`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/ObjectConverter.java`
#### Snippet
```java
    private boolean checkNeedReload(boolean needReload, ConfigFiled configFiled) {
        if (!needReload && configFiled != null && configFiled.reload()) {
            needReload = Boolean.TRUE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
    private CloudEvent addTimestamp(CloudEvent event, Command cmd, long sendTime) {
        if (cmd == RESPONSE_TO_SERVER) {
            event = CloudEventBuilder.from(event)
                    .withExtension(EventMeshConstants.RSP_C2EVENTMESH_TIMESTAMP,
                            String.valueOf(startTime))
```

### AssignmentToMethodParameter
Assignment to method parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                    .build();
        } else {
            event = CloudEventBuilder.from(event)
                    .withExtension(EventMeshConstants.REQ_C2EVENTMESH_TIMESTAMP,
                            String.valueOf(startTime))
```

### AssignmentToMethodParameter
Assignment to method parameter `header`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/Session.java`
#### Snippet
```java
                if (!listenRspSend) {
                    if (header == null) {
                        header = new Header(LISTEN_RESPONSE, OPStatus.SUCCESS.getCode(), "succeed", null);
                    }
                    Package msg = new Package();
```

### AssignmentToMethodParameter
Assignment to method parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/SessionSender.java`
#### Snippet
```java
                String seq = header.getSeq();
                // TODO: How to assign values here
                event = CloudEventBuilder.from(event)
                        .withExtension(EventMeshConstants.RSP_MQ2EVENTMESH_TIMESTAMP, String.valueOf(System.currentTimeMillis()))
                        .withExtension(EventMeshConstants.RSP_RECEIVE_EVENTMESH_IP,
```

### AssignmentToMethodParameter
Assignment to method parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/SessionSender.java`
#### Snippet
```java
                    return;
                }
                event = CloudEventBuilder.from(event)
                        .withExtension(EventMeshConstants.RSP_EVENTMESH2C_TIMESTAMP, String.valueOf(System.currentTimeMillis()))
                        .build();
```

### AssignmentToMethodParameter
Assignment to method parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/send/SessionSender.java`
#### Snippet
```java
                        String replyTopic = EventMeshConstants.RR_REPLY_TOPIC;
                        replyTopic = cluster + "-" + replyTopic;
                        event = CloudEventBuilder.from(event).withSubject(replyTopic).build();
                    }

```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/ReplyMessageProcessor.java`
#### Snippet
```java
        String mqCluster = message.getPropertiesOrDefault(EventMeshConstants.PROPERTY_MESSAGE_CLUSTER, "defaultCluster");
        String replyTopic = mqCluster + "-" + EventMeshConstants.RR_REPLY_TOPIC;
        message = SimpleMessage.newBuilder(message).setTopic(replyTopic).build();

        String protocolType = requestHeader.getProtocolType();
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/HttpTinyClient.java`
#### Snippet
```java
                                     String encoding, long readTimeoutMs) throws IOException {
        String encodedContent = encodingParams(paramValues, encoding);
        url += (null == encodedContent) ? "" : ("?" + encodedContent);

        HttpURLConnection conn = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `filePath`
in `eventmesh-webhook/eventmesh-webhook-api/src/main/java/org/apache/eventmesh/webhook/api/WebHookOperationConstant.java`
#### Snippet
```java
            String configPath = Constants.EVENTMESH_CONF_HOME;

            filePath = filePath.replace(EVENTMESH_HOME, configPath.substring(0, configPath.lastIndexOf(FILE_SEPARATOR)));
        }
        return filePath;
```

### AssignmentToMethodParameter
Assignment to method parameter `routingKey`
in `eventmesh-connector-plugin/eventmesh-connector-rabbitmq/src/main/java/org/apache/eventmesh/connector/rabbitmq/client/RabbitmqClient.java`
#### Snippet
```java
            channel.queueDeclare(queueName, false, false,
                    false, null);
            routingKey = builtinExchangeType.getType().equals(BuiltinExchangeType.FANOUT.getType()) ? "" : routingKey;
            channel.queueBind(queueName, exchangeName, routingKey);
        } catch (Exception ex) {
```

## RuleId[ruleID=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
                final NetworkInterface networkInterface = enumeration1.nextElement();
                if (!preferList.contains(networkInterface.getName())) {
                    continue;
                } else if (preferNetworkInterface == null) {
                    preferNetworkInterface = networkInterface;
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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
Synchronization on local variable `emitter`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/StreamPushRequest.java`
#### Snippet
```java
                // catch the error and retry, don't use eventEmitter.onNext() to hide the error
                StreamObserver<SimpleMessage> emitter = eventEmitter.getEmitter();
                synchronized (emitter) {
                    emitter.onNext(simpleMessage);
                }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
            return extractParameters(matcher);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/EventMeshMessage.java`
#### Snippet
```java
    public String getProp(String key) {
        if (prop == null) {
            return null;
        }
        return prop.get(key);
```

### ReturnNull
Return of `null`
in `eventmesh-spi/src/main/java/org/apache/eventmesh/spi/EventMeshExtensionFactory.java`
#### Snippet
```java
        try {
            if (extensionInstanceClass == null) {
                return null;
            }
            T extensionInstance = extensionInstanceClass.getDeclaredConstructor().newInstance();
```

### ReturnNull
Return of `null`
in `eventmesh-spi/src/main/java/org/apache/eventmesh/spi/EventMeshExtensionFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/ConvertValue.java`
#### Snippet
```java

        if (Objects.isNull(value)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/ConvertValue.java`
#### Snippet
```java
        @Override
        public Object convert(ConvertInfo convertInfo) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/config/convert/converter/PropertiesConverter.java`
#### Snippet
```java

        if (StringUtils.isBlank(prefix)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T deserialize(String str, TypeReference<T> typeReference) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> byte[] serialize(String topic, Class<T> data) throws JsonProcessingException {
        if (Objects.isNull(data)) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
    public static String serialize(Object obj) {
        if (Objects.isNull(obj)) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
    public static JsonNode getJsonNode(String json) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T deserialize(String json, Class<T> clz) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T deserialize(Class<T> clazz, byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
        } catch (MalformedURLException e) {
            LOG.error("Invalid URL format url={}", url, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/utils/IPUtils.java`
#### Snippet
```java
            LOG.error("socket or unknown host exception:", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/Header.java`
#### Snippet
```java
        Object property = getProperty(name);
        if (null == property) {
            return null;
        }
        return property.toString();
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/Header.java`
#### Snippet
```java
    public Object getProperty(final String name) {
        if (null == this.properties) {
            return null;
        }
        return this.properties.get(name);
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
                    LOG.warn("Invalidate TCP command: {}", command);
                }
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
        private Header parseHeader(ByteBuf in, int headerLength) throws JsonProcessingException {
            if (headerLength <= 0) {
                return null;
            }
            final byte[] headerData = new byte[headerLength];
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/tcp/codec/Codec.java`
#### Snippet
```java
        private Object parseBody(ByteBuf in, Header header, int bodyLength) throws JsonProcessingException {
            if (bodyLength <= 0 || header == null) {
                return null;
            }
            final byte[] bodyData = new byte[bodyLength];
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpCommand.java`
#### Snippet
```java
    public HttpCommand createHttpCommandResponse(EventMeshRetCode eventMeshRetCode) {
        if (StringUtils.isBlank(requestCode)) {
            return null;
        }
        HttpCommand response = new HttpCommand(this.httpMethod, this.httpVersion, this.requestCode);
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpCommand.java`
#### Snippet
```java
    public HttpCommand createHttpCommandResponse(Header header, Body body) {
        if (StringUtils.isBlank(requestCode)) {
            return null;
        }
        HttpCommand response = new HttpCommand(this.httpMethod, this.httpVersion, this.requestCode);
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpCommand.java`
#### Snippet
```java
    public DefaultFullHttpResponse httpResponse() throws Exception {
        if (cmdType == CmdType.REQ) {
            return null;
        }
        DefaultFullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK,
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpEventWrapper.java`
#### Snippet
```java
    public HttpEventWrapper createHttpResponse(EventMeshRetCode eventMeshRetCode) {
        if (StringUtils.isBlank(requestURI)) {
            return null;
        }
        HttpEventWrapper response = new HttpEventWrapper(this.httpMethod, this.httpVersion, this.requestURI);
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/HttpEventWrapper.java`
#### Snippet
```java
    public HttpEventWrapper createHttpResponse(Map<String, Object> responseHeaderMap, Map<String, Object> responseBodyMap) {
        if (StringUtils.isBlank(requestURI)) {
            return null;
        }
        HttpEventWrapper response = new HttpEventWrapper(this.httpMethod, this.httpVersion, this.requestURI);
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/common/ClientType.java`
#### Snippet
```java
            return SUB;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/protocol/http/common/ProtocolVersion.java`
#### Snippet
```java
            return V2;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/loadbalance/WeightRoundRobinLoadBalanceSelector.java`
#### Snippet
```java
        if (CollectionUtils.isEmpty(clusterGroup)) {
            LOG.warn("No servers available");
            return null;
        }
        Weight<T> targetWeight = null;
```

### ReturnNull
Return of `null`
in `eventmesh-common/src/main/java/org/apache/eventmesh/common/loadbalance/RandomLoadBalanceSelector.java`
#### Snippet
```java
        if (CollectionUtils.isEmpty(clusterGroup)) {
            LOG.warn("No servers available");
            return null;
        }
        return clusterGroup.get(ThreadLocalRandom.current().nextInt(clusterGroup.size()));
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/acl/Acl.java`
#### Snippet
```java
            return serviceLoader.iterator().next();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.error("exception occur while redirectClient2NewEventMesh", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.error("exception occur while goodbye2client", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/EventMeshTcp2Client.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.error("exception occur while serverGoodby2Client", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/RecommendTask.java`
#### Snippet
```java
    private String getGroupOfClient(UserAgent userAgent) {
        if (userAgent == null) {
            return null;
        }
        return userAgent.getGroup();
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/dispatch/FreePriorityDispatchStrategy.java`
#### Snippet
```java
                || StringUtils.isBlank(topic)
                || StringUtils.isBlank(group)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/dispatch/FreePriorityDispatchStrategy.java`
#### Snippet
```java
                    LOGGER.warn("all sessions can't downstream msg");
                }
                return null;
            } else {
                if (LOGGER.isWarnEnabled()) {
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/AbstractPushRequest.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.error("Error in getting EventMeshMessage from CloudEvent", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/push/AbstractPushRequest.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.error("Error in getting CloudEvent from EventMeshMessage", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/AbstractHTTPServer.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/push/AbstractHTTPPushRequest.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
                logger.warn("doRebalance failed,found no distribute data in regitry, cluster:{}, group:{}, purpose:{}",
                        cluster, group, purpose);
                return null;
            }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
                logger.warn("doRebalance failed,found no distribute data of localIDC in regitry,cluster:{},group:{}, purpose:{},localIDC:{}",
                        cluster, group, purpose, localIdc);
                return null;
            }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
                                    + "distributionMap,cluster:{},grpup:{},purpose:{},eventMeshName:{}",
                            cluster, group, purpose, eventMeshName);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
            logger.warn("doRebalance failed,cluster:{},group:{},purpose:{},findProxyClientDistributionData failed, errMsg:{}",
                    cluster, group, purpose, e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
            if (eventMeshDataInfoList == null || CollectionUtils.isEmpty(eventMeshDataInfoList)) {
                logger.warn("doRebalance failed,query eventmesh instances is null from registry,cluster:{}", cluster);
                return null;
            }
            localEventMeshMap = new HashMap<>();
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
                logger.warn("doRebalance failed,query eventmesh instances of localIDC is null from registry,localIDC:{},cluster:{}",
                        localIdc, cluster);
                return null;
            }
        } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/rebalance/EventmeshRebalanceImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            logger.warn("doRebalance failed,findEventMeshInfoByCluster failed,cluster:{},errMsg:{}", cluster, e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
            final List<String> tmpProxyAddrList = new ArrayList<>(eventMeshMap.values());
            if (CollectionUtils.isEmpty(tmpProxyAddrList)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
                log.warn("EventMeshRecommend failed,params illegal,group:{},purpose:{}", group, purpose);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
                        cluster, group, purpose, e);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
                        cluster, group, purpose);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
        } else {
            log.error("localEventMeshMap or remoteEventMeshMap size error");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
                log.warn("exist proxy not register but exist in distributionMap");
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
                log.error("no legal distribute data,check eventMeshMap and distributeData, group:{}", group);
            }
            return null;
        } else {
            final List<Map.Entry<String, Integer>> list = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/AsyncHttpProcessor.java`
#### Snippet
```java

    default HttpResponse handler(HttpRequest httpRequest) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/Utils.java`
#### Snippet
```java
            return topicStrArr[2];
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/WebhookUtil.java`
#### Snippet
```java

        final AuthService authService = getHttpAuthPlugin(authType);
        return authService != null ? authService.getAuthParams() : null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/JsonUtils.java`
#### Snippet
```java
    public static String toJson(Object obj) throws JsonProcessingException {
        if (obj == null) {
            return null;
        }
        return objectMapper.writeValueAsString(obj);
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T deserialize(Class<T> clazz, byte[] bytes) throws IOException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> byte[] serialize(String topic, Class<T> data) throws JsonProcessingException {
        if (data == null) {
            return null;
        }
        return objectMapper.writeValueAsBytes(data);
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T deserialize(Class<T> clazz, String json) throws IOException {
        if (json == null || json.length() == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
    public static String buildUserAgentClientId(final UserAgent client) {
        if (client == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java
    public static String stackTrace(final Throwable e, final int level) {
        if (e == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/HttpTinyClient.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        if (null == paramValues) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/admin/handler/EventHandler.java`
#### Snippet
```java
    private Map<String, String> queryToMap(String query) {
        if (query == null) {
            return null;
        }
        Map<String, String> result = new HashMap<>();
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/HandlerService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/NacosWebHookConfigOperation.java`
#### Snippet
```java
            log.error("queryWebHookConfigById failed", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-webhook/eventmesh-webhook-receive/src/main/java/org/apache/eventmesh/webhook/receive/storage/HookConfigOperationManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
    public Span addTraceInfoToSpan(Span span, CloudEvent cloudEvent) {
        if (!useTrace) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
        if (span == null) {
            logger.warn("span is null when finishSpan");
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
    public Context extractFrom(Context context, Map<String, Object> map) {
        if (!useTrace) {
            return null;
        }
        if (map == null) {
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
    public Span addTraceInfoToSpan(Span span, Map<String, Object> map) {
        if (!useTrace) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
        if (span == null) {
            logger.warn("span is null when finishSpan");
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
    public Span addTraceInfoToSpan(ChannelHandlerContext ctx, CloudEvent cloudEvent) {
        if (!useTrace) {
            return null;
        }
        Context context = ctx.channel().attr(AttributeKeys.SERVER_CONTEXT).get();
```

### ReturnNull
Return of `null`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/trace/Trace.java`
#### Snippet
```java
        if (span == null) {
            logger.warn("span is null when finishSpan");
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
                log.error("webhookConfig {} is not existed", webHookConfig.getCallbackPath());
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-webhook/eventmesh-webhook-admin/src/main/java/org/apache/eventmesh/webhook/admin/FileWebHookConfigOperation.java`
#### Snippet
```java
                log.error("get webhook from file {} error", webhookConfigFile.getPath(), e);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-examples/src/main/java/org/apache/eventmesh/selector/NacosSelector.java`
#### Snippet
```java
            final Instance instance = namingService.selectOneHealthyInstance(serviceName);
            if (instance == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/openmessage/OpenMessageTCPPubClient.java`
#### Snippet
```java
    @Override
    public Package publish(Message cloudEvent, long timeout) throws EventMeshException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/tcp/impl/openmessage/OpenMessageTCPPubClient.java`
#### Snippet
```java
    @Override
    public Package rr(Message msg, long timeout) throws EventMeshException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java
                return (EventMeshMessage) msg;
            } else {
                return null;
            }
        } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java

        if (CollectionUtils.isEmpty(messageList)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/EventMeshGrpcProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java
                return (CloudEvent) msg;
            } else {
                return null;
            }
        } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java

        if (CollectionUtils.isEmpty(events)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/producer/CloudEventProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/CloudEventProducer.java`
#### Snippet
```java
            SendMessageResponseBody.ReplyMessage.class);
        // todo: deserialize message
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/http/producer/OpenMessageProducer.java`
#### Snippet
```java
                SendMessageResponseBody.ReplyMessage.class);
        // todo: deserialize message
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-trace-plugin/eventmesh-trace-pinpoint/src/main/java/org/apache/eventmesh/trace/pinpoint/exporter/PinpointSpanExporter.java`
#### Snippet
```java
    private static String getEndpoint(final Resource resource) {
        if (resource == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `eventmesh-protocol-plugin/eventmesh-protocol-http/src/main/java/org/apache/eventmesh/protocol/http/HttpProtocolAdaptor.java`
#### Snippet
```java
    public List<CloudEvent> toBatchCloudEvent(ProtocolTransportObject protocol)
        throws ProtocolHandleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-protocol-plugin/eventmesh-protocol-cloudevents/src/main/java/org/apache/eventmesh/protocol/cloudevents/resolver/http/SendMessageBatchProtocolResolver.java`
#### Snippet
```java
public class SendMessageBatchProtocolResolver {
    public static CloudEvent buildEvent(Header header, Body body) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-protocol-plugin/eventmesh-protocol-meshmessage/src/main/java/org/apache/eventmesh/protocol/meshmessage/resolver/http/SendMessageBatchProtocolResolver.java`
#### Snippet
```java
public class SendMessageBatchProtocolResolver {
    public static CloudEvent buildEvent(Header header, Body body) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-protocol-plugin/eventmesh-protocol-openmessage/src/main/java/org/apache/eventmesh/protocol/openmessage/OpenMessageProtocolAdaptor.java`
#### Snippet
```java
    @Override
    public List<CloudEvent> toBatchCloudEvent(ProtocolTransportObject protocol) throws ProtocolHandleException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-protocol-plugin/eventmesh-protocol-openmessage/src/main/java/org/apache/eventmesh/protocol/openmessage/OpenMessageProtocolAdaptor.java`
#### Snippet
```java
    @Override
    public ProtocolTransportObject fromCloudEvent(CloudEvent cloudEvent) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-protocol-plugin/eventmesh-protocol-openmessage/src/main/java/org/apache/eventmesh/protocol/openmessage/OpenMessageProtocolAdaptor.java`
#### Snippet
```java
    @Override
    public CloudEvent toCloudEvent(ProtocolTransportObject message) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
            log.error("Error in subscribe.", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
            log.error("Error in unsubscribe.", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-sdk-java/src/main/java/org/apache/eventmesh/client/grpc/consumer/EventMeshGrpcConsumer.java`
#### Snippet
```java
            log.error("Error in unsubscribe.", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-registry-plugin/eventmesh-registry-nacos/src/main/java/org/apache/eventmesh/registry/nacos/service/NacosRegistryService.java`
#### Snippet
```java
            throws RegistryException {
        // todo find metadata
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            throws RegistryException {
        // todo find metadata
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/cloudevent/impl/KnativeMessageWriter.java`
#### Snippet
```java
    @Override
    public CloudEventWriter<String> create(SpecVersion version) throws CloudEventRWException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/cloudevent/impl/KnativeMessageWriter.java`
#### Snippet
```java
    @Override
    public String setEvent(EventFormat format, byte[] value) throws CloudEventRWException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-knative/src/main/java/org/apache/eventmesh/connector/knative/cloudevent/impl/KnativeMessageWriter.java`
#### Snippet
```java
    @Override
    public CloudEventContextWriter withContextAttribute(String name, String value) throws CloudEventRWException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-registry-plugin/eventmesh-registry-zookeeper/src/main/java/org/apache/eventmesh/registry/zookeeper/service/ZookeeperRegistryService.java`
#### Snippet
```java
        throws RegistryException {
        // todo find metadata
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/admin/RocketMQAdmin.java`
#### Snippet
```java
    @Override
    public List<CloudEvent> getEvent(String topicName, int offset, int length) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/cloudevent/RocketMQMessageFactory.java`
#### Snippet
```java

        return MessageUtils.parseStructuredOrBinaryMessage(
            () -> null,
            format -> null,
            () -> props.get(RocketMQHeaders.SPEC_VERSION),
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/eventmesh/connector/rocketmq/cloudevent/RocketMQMessageFactory.java`
#### Snippet
```java
        return MessageUtils.parseStructuredOrBinaryMessage(
            () -> null,
            format -> null,
            () -> props.get(RocketMQHeaders.SPEC_VERSION),
            sv -> new RocketMQBinaryMessageReader(sv, props, body)
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/MessageQueue.java`
#### Snippet
```java
            MessageEntity head = getHead();
            if (head == null) {
                return null;
            }
            if (head.getOffset() > offset) {
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/MessageQueue.java`
#### Snippet
```java
            MessageEntity tail = getTail();
            if (tail == null || tail.getOffset() < offset) {
                return null;
            }
            int offsetDis = (int) (head.getOffset() - offset);
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/MessageQueue.java`
#### Snippet
```java
        try {
            if (count == 0) {
                return null;
            }
            int tailIndex = putIndex - 1;
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/StandaloneBroker.java`
#### Snippet
```java
        MessageEntity messageEntity = messageContainer.computeIfAbsent(topicMetadata, k -> new MessageQueue()).getByOffset(offset);
        if (messageEntity == null) {
            return null;
        }
        return messageEntity.getMessage();
```

### ReturnNull
Return of `null`
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/StandaloneBroker.java`
#### Snippet
```java
        MessageEntity head = messageContainer.computeIfAbsent(topicMetadata, k -> new MessageQueue()).getHead();
        if (head == null) {
            return null;
        }
        return head.getMessage();
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
                eventMeshTcpMonitor.getTcpSummaryMetrics().getMq2eventMeshMsgNum()
                        .incrementAndGet();
                event = CloudEventBuilder.from(event)
                        .withExtension(EventMeshConstants.REQ_MQ2EVENTMESH_TIMESTAMP,
                                String.valueOf(System.currentTimeMillis()))
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
                eventMeshTcpMonitor.getTcpSummaryMetrics().getMq2eventMeshMsgNum()
                        .incrementAndGet();
                event = CloudEventBuilder.from(event)
                        .withExtension(EventMeshConstants.REQ_MQ2EVENTMESH_TIMESTAMP,
                                String.valueOf(System.currentTimeMillis()))
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/group/ClientGroupWrapper.java`
#### Snippet
```java
                        } else {
                            sendBackTimes++;
                            event = CloudEventBuilder.from(event)
                                    .withExtension(EventMeshConstants.EVENTMESH_SEND_BACK_TIMES,
                                            sendBackTimes.toString())
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/consumer/EventMeshConsumer.java`
#### Snippet
```java
    private EventListener createEventListener(final SubscriptionMode subscriptionMode) {
        return (event, context) -> {
            event = CloudEventBuilder.from(event)
                    .withExtension(EventMeshConstants.REQ_MQ2EVENTMESH_TIMESTAMP,
                            String.valueOf(System.currentTimeMillis()))
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
                String uniqueId = Objects.requireNonNull(event.getExtension(ProtocolKey.ClientInstanceKey.UNIQUEID)).toString();

                event = CloudEventBuilder.from(event)
                    .withExtension(EventMeshConstants.REQ_MQ2EVENTMESH_TIMESTAMP, String.valueOf(System.currentTimeMillis()))
                    .withExtension(EventMeshConstants.REQ_RECEIVE_EVENTMESH_IP,
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `event`
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/EventMeshConsumer.java`
#### Snippet
```java
            try {

                event = CloudEventBuilder.from(event)
                    .withExtension(EventMeshConstants.REQ_MQ2EVENTMESH_TIMESTAMP,
                        String.valueOf(System.currentTimeMillis()))
```

## RuleId[ruleID=UnnecessaryLocalVariable]
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
Local variable `listener` is redundant
in `eventmesh-connector-plugin/eventmesh-connector-rocketmq/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
            }

            MessageListenerConcurrently listener = ConsumeMessageConcurrentlyService.this.messageListener;
            EventMeshConsumeConcurrentlyContext context = new EventMeshConsumeConcurrentlyContext(messageQueue, processQueue);
            ConsumeConcurrentlyStatus status = null;
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/task/HistoryMessageClearTask.java`
#### Snippet
```java
            });
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            } catch (InterruptedException e) {
                logger.error("Thread is interrupted, thread name: {}", Thread.currentThread().getName(), e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `eventmesh-connector-plugin/eventmesh-connector-standalone/src/main/java/org/apache/eventmesh/connector/standalone/broker/task/SubScribeTask.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error("Thread is interrupted, topic: {}, offset: {} thread name: {}",
```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/session/retry/RetryContext.java`
#### Snippet
```java
    public int compareTo(Delayed delayed) {
        RetryContext obj = (RetryContext) delayed;
        if (this.executeTime > obj.executeTime) {
            return 1;
        } else if (this.executeTime == obj.executeTime) {
```

### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/retry/RetryContext.java`
#### Snippet
```java
    public int compareTo(Delayed delayed) {
        RetryContext obj = (RetryContext) delayed;
        if (this.executeTime > obj.executeTime) {
            return 1;
        } else if (this.executeTime == obj.executeTime) {
```

### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/retry/RetryContext.java`
#### Snippet
```java
    public int compareTo(Delayed delayed) {
        RetryContext obj = (RetryContext) delayed;
        if (this.executeTime > obj.executeTime) {
            return 1;
        } else if (this.executeTime == obj.executeTime) {
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\.\\{format\\})`
in `eventmesh-admin/eventmesh-admin-rocketmq/src/main/java/org/apache/eventmesh/admin/rocketmq/util/UrlMappingPattern.java`
#### Snippet
```java
    private static final Pattern URL_PARAMETER_PATTERN = Pattern.compile(URL_PARAMETER_REGEX);

    private static final String URL_FORMAT_REGEX = "(?:\\.\\{format\\})$";

    private static final String URL_FORMAT_MATCH_REGEX = "(?:\\\\.\\([\\\\w%]+?\\))?";
```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`caculateLocal == true` can be simplified to 'caculateLocal'
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/recommend/EventMeshRecommendImpl.java`
#### Snippet
```java
        });

        recommendProxyAddr = recommendProxy(eventMeshMap, (caculateLocal == true) ? localClientDistributionMap
                : remoteClientDistributionMap, group);

```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/consumer/HttpClientGroupMapping.java`
#### Snippet
```java

                for (final ConsumerGroupTopicConf consumerGroupTopicConf : consumerGroupConf.getConsumerGroupTopicConf().values()) {
                    consumerGroupTopicConfList.add(consumerGroupTopicConf);
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/util/EventMeshUtil.java`
#### Snippet
```java

        final List<String> preferList = new ArrayList<>();
        Arrays.stream(priority.split("<")).forEach(preferList::add);

        NetworkInterface preferNetworkInterface = null;
```

## RuleId[ruleID=UnstableApiUsage]
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

    private Registry registry;
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
    public ThreadPoolExecutor webhookExecutor;

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

    public transient HTTPClientPool httpClientPool = new HTTPClientPool(10);
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
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    private transient AdminWebHookConfigOperationManager adminWebHookConfigOperationManage;

    private transient RateLimiter rateLimiter;

    public void setClientSessionGroupMapping(final ClientSessionGroupMapping clientSessionGroupMapping) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
        initThreadPool();

        rateLimiter = RateLimiter.create(eventMeshTCPConfiguration.eventMeshTcpMsgReqnumPerSecond);

        globalTrafficShapingHandler = newGTSHandler(scheduler, eventMeshTCPConfiguration.getGtc().getReadLimit());
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
        initThreadPool();

        rateLimiter = RateLimiter.create(eventMeshTCPConfiguration.eventMeshTcpMsgReqnumPerSecond);

        globalTrafficShapingHandler = newGTSHandler(scheduler, eventMeshTCPConfiguration.getGtc().getReadLimit());
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/boot/EventMeshTCPServer.java`
#### Snippet
```java
    }

    public void setRateLimiter(final RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java

            if (!eventMeshTCPServer.getRateLimiter()
                    .tryAcquire(TRY_PERMIT_TIME_OUT, TimeUnit.MILLISECONDS)) {

                msg.setHeader(new Header(replyCmd, OPStatus.FAIL.getCode(),
```

### UnstableApiUsage
'getRate()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/tcp/client/task/MessageTransferTask.java`
#### Snippet
```java
                LOGGER.warn(
                        "======Tps overload, global flow control, rate:{}! PLEASE CHECK!========",
                        eventMeshTCPServer.getRateLimiter().getRate());
                return;
            }
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/ReplyMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            logger.error("Send message speed over limit.");
            ServiceUtils.sendStreamRespAndDone(requestHeader, StatusCode.EVENTMESH_SEND_MESSAGE_SPEED_OVER_LIMIT_ERR, emitter);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/SendAsyncMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            logger.error("Send message speed over limit.");
            ServiceUtils.sendRespAndDone(StatusCode.EVENTMESH_BATCH_SPEED_OVER_LIMIT_ERR, emitter);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/BatchPublishMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            logger.error("Send message speed over limit.");
            ServiceUtils.sendRespAndDone(StatusCode.EVENTMESH_BATCH_SPEED_OVER_LIMIT_ERR, emitter);
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/grpc/processor/RequestMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshGrpcServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            logger.error("Send message speed over limit.");
            ServiceUtils.sendStreamRespAndDone(message.getHeader(), StatusCode.EVENTMESH_SEND_MESSAGE_SPEED_OVER_LIMIT_ERR, emitter);
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/ReplyMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
                .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            responseEventMeshCommand = asyncContext.getRequest().createHttpCommandResponse(
                replyMessageResponseHeader,
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
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendSyncMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
                .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS,
                        TimeUnit.MILLISECONDS)) {
            responseEventMeshCommand = asyncContext.getRequest().createHttpCommandResponse(
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/SendAsyncMessageProcessor.java`
#### Snippet
```java
        // control flow rate limit
        if (!eventMeshHTTPServer.getMsgRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            responseEventMeshCommand = request.createHttpCommandResponse(
                sendMessageResponseHeader,
```

### UnstableApiUsage
'tryAcquire(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageV2Processor.java`
#### Snippet
```java

        if (!eventMeshHTTPServer.getBatchRateLimiter()
            .tryAcquire(EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS,
                TimeUnit.MILLISECONDS)) {
            responseEventMeshCommand = request.createHttpCommandResponse(
```

### UnstableApiUsage
'tryAcquire(int, long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `eventmesh-runtime/src/main/java/org/apache/eventmesh/runtime/core/protocol/http/processor/BatchSendMessageProcessor.java`
#### Snippet
```java

        if (!eventMeshHTTPServer.getBatchRateLimiter()
                .tryAcquire(eventSize, EventMeshConstants.DEFAULT_FASTFAIL_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
            responseEventMeshCommand = asyncContext.getRequest().createHttpCommandResponse(
                sendMessageBatchResponseHeader,
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
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
            ByteSequence etcdKey = getEtcdKey(eventMeshClusterName, eventMeshName,
                    eventMeshUnRegisterInfo.getEndPoint());
            etcdClient.getKVClient().delete(etcdKey);
            eventMeshRegisterInfoMap.remove(eventMeshName);
            logger.info("EventMesh successfully logout to etcd, eventMeshClusterName: {}, eventMeshName: {}",
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
            logger.info("EventMesh successfully logout to etcd, eventMeshClusterName: {}, eventMeshName: {}",
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
                            endPoint, System.currentTimeMillis(), eventMeshRegisterInfo.getMetadata());
            ByteSequence etcdValue = ByteSequence.from(JsonUtils.serialize(eventMeshDataInfo).getBytes(Constants.DEFAULT_CHARSET));
            etcdClient.getKVClient().put(etcdKey, etcdValue, PutOption.newBuilder().withLeaseId(getLeaseId()).build());
            eventMeshRegisterInfoMap.put(eventMeshName, eventMeshRegisterInfo);

```

### UnstableApiUsage
'put(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.PutOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `eventmesh-registry-plugin/eventmesh-registry-etcd/src/main/java/org/apache/eventmesh/registry/etcd/service/EtcdRegistryService.java`
#### Snippet
```java
                            endPoint, System.currentTimeMillis(), eventMeshRegisterInfo.getMetadata());
            ByteSequence etcdValue = ByteSequence.from(JsonUtils.serialize(eventMeshDataInfo).getBytes(Constants.DEFAULT_CHARSET));
            etcdClient.getKVClient().put(etcdKey, etcdValue, PutOption.newBuilder().withLeaseId(getLeaseId()).build());
            eventMeshRegisterInfoMap.put(eventMeshName, eventMeshRegisterInfo);

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
                    List<KeyValue> keyValues = null;
                    try {
                        keyValues = etcdClient.getKVClient().get(etcdKey).get().getKvs();
                    } catch (InterruptedException | ExecutionException e) {
                        logger.error("get etcdKey[{}] failed", etcdKey, e);
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
                        logger.error("get etcdKey[{}] failed", etcdKey, e);
```

### UnstableApiUsage
'io.pravega.client.ClientConfig' is marked unstable with @Beta
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
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
in `eventmesh-connector-plugin/eventmesh-connector-pravega/src/main/java/org/apache/eventmesh/connector/pravega/client/PravegaClient.java`
#### Snippet
```java
        ClientConfig clientConfig = clientConfigBuilder.build();
        clientFactory = EventStreamClientFactory.withScope(config.getScope(), clientConfig);
        readerGroupManager = ReaderGroupManager.withScope(config.getScope(), clientConfig);
    }

```

