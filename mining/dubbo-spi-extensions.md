# dubbo-spi-extensions 
 
# Bad smells
I found 416 bad smells with 75 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 82 | false |
| UtilityClassWithoutPrivateConstructor | 20 | true |
| MissortedModifiers | 18 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 17 | false |
| SizeReplaceableByIsEmpty | 16 | true |
| RedundantFieldInitialization | 16 | false |
| AssignmentToMethodParameter | 16 | false |
| UnnecessaryFullyQualifiedName | 14 | false |
| UnnecessaryModifier | 13 | true |
| UnusedAssignment | 12 | false |
| ZeroLengthArrayInitialization | 10 | false |
| RedundantSuppression | 10 | false |
| NestedAssignment | 9 | false |
| InstanceofCatchParameter | 9 | false |
| ConstantValue | 9 | false |
| InnerClassMayBeStatic | 9 | true |
| Convert2Lambda | 9 | false |
| AbstractClassNeverImplemented | 7 | false |
| SynchronizeOnThis | 7 | false |
| BoundedWildcard | 5 | false |
| UnnecessarySemicolon | 5 | false |
| UnnecessaryBoxing | 5 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| UnnecessaryQualifierForThis | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| Convert2MethodRef | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| SystemOutErr | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| CommentedOutCode | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| CodeBlock2Expr | 3 | true |
| EmptyMethod | 3 | false |
| DataFlowIssue | 3 | false |
| TypeParameterHidesVisibleType | 3 | false |
| UnstableApiUsage | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| RedundantImplements | 2 | false |
| NonFinalFieldOfException | 2 | false |
| IndexOfReplaceableByContains | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| CatchMayIgnoreException | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| BusyWait | 2 | false |
| ThreadStartInConstruction | 2 | false |
| LoopStatementsThatDontLoop | 1 | false |
| StaticCallOnSubclass | 1 | false |
| WhileCanBeForeach | 1 | false |
| RegExpSimplifiable | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| FinalStaticMethod | 1 | false |
| TrivialStringConcatenation | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| FuseStreamOperations | 1 | false |
| DuplicateThrows | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| InfiniteRecursion | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| IOResource | 1 | false |
| FieldMayBeStatic | 1 | false |
| RedundantLengthCheck | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
            try {
                String timeoutString = messageExt.getUserProperty(CommonConstants.TIMEOUT_KEY);
                Long timeout = Long.valueOf(timeoutString);
                if (logger.isDebugEnabled()) {
                    logger.debug(String.format("reply message ext is : %s", messageExt));
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
            }
            message.putUserProperty(RocketMQProtocolConstant.SEND_ADDRESS, NetUtils.getLocalHost());
            Long messageTimeout = System.currentTimeMillis() + timeout;
            message.putUserProperty(CommonConstants.TIMEOUT_KEY, messageTimeout.toString());
            message.putUserProperty(RocketMQProtocolConstant.URL_STRING, getUrl().toString());
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java


    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java


    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
    }

    private static interface BuiltinMarshaller<T> {
        Any marshal(T obj) throws IOException;

```

## RuleId[ruleID=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`do` statement does not loop
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyCodecAdapter.java`
#### Snippet
```java
                int savedReadIndex;

                do {
                    savedReadIndex = frame.readerIndex();
                    try {
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `appendRuntimeParameters()` declared in class 'org.apache.dubbo.config.AbstractInterfaceConfig' but referenced via subclass 'org.apache.dubbo.config.ReferenceConfigBase'
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java
            URL url = urls.get(0);
            Map<String, String> map = new HashMap<>();
            ReferenceConfigBase.appendRuntimeParameters(map);
            map.put(INTERFACE_KEY, MockService.class.getName());
            map.put(SIDE_KEY, CONSUMER_SIDE);
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                String service = null;
                Iterator<Event> iterator = response.getEventsList().iterator();
                while (iterator.hasNext()) {
                    Event event = iterator.next();
                    switch (event.getType()) {
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/DemoParamBean1SubBean1.java`
#### Snippet
```java

    // Circular reference for test
//    @RequestParam("====bean")
//    private DemoParamBean1 bean;

```

### CommentedOutCode
Commented out code (7 lines)
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java
    }

//    @Override
//    public String getConfigs(String key, String group, long timeout) throws IllegalStateException {
//        if (StringUtils.isEmpty(group)) {
```

### CommentedOutCode
Commented out code (5 lines)
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
        public T parse(InputStream stream) throws InvalidProtocolBufferException {
            return parser.parseDelimitedFrom(stream, globalRegistry);
//            CodedInputStream cis = CodedInputStream.newInstance(stream);
//            // Pre-create the CodedInputStream so that we can remove the size limit restriction
//            // when parsing.
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `decayTime` from instance context
in `dubbo-cluster-extensions/dubbo-cluster-loadbalance-peakewma/src/main/java/org/apache/dubbo/rpc/cluster/loadbalance/PeakEwmaLoadBalance.java`
#### Snippet
```java
    @Override
    public void setApplicationModel(ApplicationModel applicationModel) {
        decayTime = applicationModel.getModelEnvironment().getConfiguration().getInt(PEAK_EWMA_DECAY_TIME, 10_000);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SERIALIZER_FACTORY` from instance context
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/dubbo/AbstractHessian2FactoryInitializer.java`
#### Snippet
```java
        }
        synchronized (this) {
            SERIALIZER_FACTORY = createSerializerFactory();
        }
        return SERIALIZER_FACTORY;
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `PolarisRegistry` on 'this' is unnecessary in this context
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/PolarisRegistry.java`
#### Snippet
```java
            urls.add(routerURL);
        }
        PolarisRegistry.this.notify(url, listener, urls);
    }

```

### UnnecessaryQualifierForThis
Qualifier `EtcdRegistry` on 'this' is unnecessary in this context
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
                                    .orElseGet(() -> {
                                        ChildListener watchListener, prev;
                                        prev = listeners.putIfAbsent(listener, watchListener = (parentPath, currentChildren) -> EtcdRegistry.this.notify(url, listener,
                                                toUrlsWithEmpty(url, parentPath, currentChildren)));
                                        return prev != null ? prev : watchListener;
```

### UnnecessaryQualifierForThis
Qualifier `JEtcdClient` on 'this' is unnecessary in this context
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            clientWrapper.setConnectionStateListener((client, state) -> {
                if (state == StateListener.CONNECTED) {
                    JEtcdClient.this.stateChanged(StateListener.CONNECTED);
                } else if (state == StateListener.DISCONNECTED) {
                    JEtcdClient.this.stateChanged(StateListener.DISCONNECTED);
```

### UnnecessaryQualifierForThis
Qualifier `JEtcdClient` on 'this' is unnecessary in this context
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                    JEtcdClient.this.stateChanged(StateListener.CONNECTED);
                } else if (state == StateListener.DISCONNECTED) {
                    JEtcdClient.this.stateChanged(StateListener.DISCONNECTED);
                }
            });
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[:]` can be simplified to ':'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java

    private JedisCluster jedisCluster;
    private Pattern COLON_SPLIT_PATTERN = Pattern.compile("\\s*[:]+\\s*");

    public ClusterRedisClient(URL url) {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`line.trim().length() == 0` can be replaced with 'line.trim().isEmpty()'
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectInput.java`
#### Snippet
```java
    private String readLine() throws IOException {
        String line = reader.readLine();
        if (line == null || line.trim().length() == 0) {
            throw new EOFException();
        }
```

### SizeReplaceableByIsEmpty
`desc.length() > 0` can be replaced with '!desc.isEmpty()'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcInvocation.java`
#### Snippet
```java
            Object[] args = RocketMQCodec.EMPTY_OBJECT_ARRAY;
            Class<?>[] pts = RocketMQCodec.EMPTY_CLASS_ARRAY;
            if (desc.length() > 0) {
                FrameworkServiceRepository repository = frameworkModel.getServiceRepository();
                List<ProviderModel> providerModels = repository.lookupExportedServicesWithoutGroup(keyWithoutGroup(path, version));
```

### SizeReplaceableByIsEmpty
`newInvokerCache.size() > 0` can be replaced with '!newInvokerCache.isEmpty()'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
            cacheLock.lock();
            try {
                if (newInvokerCache.size() > 0) {
                    Iterator<Map.Entry<URL, InvokerCache<Invoker<T>>>> iterator = newInvokerCache.entrySet().iterator();
                    while (iterator.hasNext()) {
```

### SizeReplaceableByIsEmpty
`allFields.size() > 0` can be replaced with '!allFields.isEmpty()'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
        // get all fields
        List<Field> allFields = ClassTypeUtil.getAllFields(null, argClass);
        if (allFields.size() > 0) {
            for (Field field : allFields) {
                if (SKIP_FIELD_SERIALVERSIONUID.equals(field.getName()) || SKIP_FIELD_THIS$0.equals(field.getName())) {
```

### SizeReplaceableByIsEmpty
`newInvokerCache.size() > 0` can be replaced with '!newInvokerCache.isEmpty()'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
            cacheLock.lock();
            try {
                if (newInvokerCache.size() > 0) {
                    Iterator<Map.Entry<URL, InvokerCache<Invoker<T>>>> iterator = newInvokerCache.entrySet().iterator();
                    while (iterator.hasNext()) {
```

### SizeReplaceableByIsEmpty
`backup.length() > 0` can be replaced with '!backup.isEmpty()'
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
            String address = url.getAddress();
            String backup = url.getParameter(RemotingConstants.BACKUP_KEY);
            if (backup != null && backup.length() > 0) {
                address += "," + backup;
            }
```

### SizeReplaceableByIsEmpty
`clients.size() > 0` can be replaced with '!clients.isEmpty()'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/ServerPeer.java`
#### Snippet
```java
    public Collection<Channel> getChannels() {
        Collection<Channel> channels = super.getChannels();
        if (clients.size() > 0) {
            channels = channels == null ? new ArrayList<Channel>() : new ArrayList<Channel>(channels);
            channels.addAll(clients.values());
```

### SizeReplaceableByIsEmpty
`clients.size() > 0` can be replaced with '!clients.isEmpty()'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/ExchangeServerPeer.java`
#### Snippet
```java
    public Collection<ExchangeChannel> getExchangeChannels() {
        Collection<ExchangeChannel> channels = super.getExchangeChannels();
        if (clients.size() > 0) {
            channels = channels == null ? new ArrayList<ExchangeChannel>() : new ArrayList<ExchangeChannel>(channels);
            channels.addAll(clients.values());
```

### SizeReplaceableByIsEmpty
`prefix.size() > 0` can be replaced with '!prefix.isEmpty()'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/option/OptionUtil.java`
#### Snippet
```java
    public static final ByteSequence prefixEndOf(ByteSequence prefix) {
        byte[] endKey = prefix.getBytes().clone();
        if (prefix.size() > 0) {
            endKey[endKey.length - 1] = (byte) (endKey[endKey.length - 1] + 1);
            return ByteSequence.from(endKey);
```

### SizeReplaceableByIsEmpty
`client.length() > 0` can be replaced with '!client.isEmpty()'
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocol.java`
#### Snippet
```java
            factory.setHessianProxyFactory(hessianProxyFactory);
            hessianProxyFactory.setConnectionFactory(factory);
        } else if (client != null && client.length() > 0 && !DEFAULT_HTTP_CLIENT.equals(client)) {
            throw new IllegalStateException("Unsupported http protocol client=\"" + client + "\"!");
        } else {
```

### SizeReplaceableByIsEmpty
`providers.size() > 0` can be replaced with '!providers.isEmpty()'
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
    protected List<URL> toUrlsWithoutEmpty(URL consumer, List<String> providers) {
        List<URL> urls = new ArrayList<>();
        if (providers != null && providers.size() > 0) {
            for (String provider : providers) {
                provider = URL.decode(provider);
```

### SizeReplaceableByIsEmpty
`address.length() > 0` can be replaced with '!address.isEmpty()'
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java

    protected static String appendDefaultPort(String address) {
        if (address != null && address.length() > 0) {
            int i = address.indexOf(':');
            if (i < 0) {
```

### SizeReplaceableByIsEmpty
`line.trim().length() == 0` can be replaced with 'line.trim().isEmpty()'
in `dubbo-serialization-extensions/dubbo-serialization-fastjson/src/main/java/org/apache/dubbo/common/serialize/fastjson/FastJsonObjectInput.java`
#### Snippet
```java
    private String readLine() throws IOException, EOFException {
        String line = reader.readLine();
        if (line == null || line.trim().length() == 0) {
            throw new EOFException();
        }
```

### SizeReplaceableByIsEmpty
`invokers.size() == 0` can be replaced with 'invokers.isEmpty()'
in `dubbo-cluster-extensions/dubbo-cluster-polaris-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/router/PolarisRouter.java`
#### Snippet
```java
    @Override
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        if (null == invokers || invokers.size() == 0) {
            return invokers;
        }
```

### SizeReplaceableByIsEmpty
`channels.size() > 0` can be replaced with '!channels.isEmpty()'
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServer.java`
#### Snippet
```java
        try {
            Collection<org.apache.dubbo.remoting.Channel> channels = getChannels();
            if (channels != null && channels.size() > 0) {
                for (org.apache.dubbo.remoting.Channel channel : channels) {
                    try {
```

### SizeReplaceableByIsEmpty
`line.trim().length() == 0` can be replaced with 'line.trim().isEmpty()'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectInput.java`
#### Snippet
```java
    private String readLine() throws IOException {
        String line = reader.readLine();
        if (line == null || line.trim().length() == 0) {
            throw new EOFException();
        }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/SentinelRedisClient.java`
#### Snippet
```java
        super(url);
        String masterName = url.getParameter("master.name", "Sentinel-master");
        String address = (new StringBuilder()).append(url.getAddress()).toString();
        String[] backupAddresses = url.getParameter(RemotingConstants.BACKUP_KEY, new String[0]);
        if (backupAddresses.length == 0) {
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/option/OptionUtil.java`
#### Snippet
```java
    public static final byte[] NO_PREFIX_END = {0};

    public static final ByteSequence prefixEndOf(ByteSequence prefix) {
        byte[] endKey = prefix.getBytes().clone();
        if (prefix.size() > 0) {
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyCodecAdapter.java`
#### Snippet
```java
                    } else {
                        int size = previousData.readableBytes() + grizzlyBuffer.remaining();
                        frame = ChannelBuffers.dynamicBuffer(size > bufferSize ? size : bufferSize);
                        frame.writeBytes(previousData, previousData.readableBytes());
                        frame.writeBytes(grizzlyBuffer.toByteBuffer());
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaCodecAdapter.java`
#### Snippet
```java
                } else {
                    int size = buffer.readableBytes() + in.remaining();
                    frame = ChannelBuffers.dynamicBuffer(size > bufferSize ? size : bufferSize);
                    frame.writeBytes(buffer, buffer.readableBytes());
                    frame.writeBytes(in.buf());
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
        builder.addParameter(RegistryConstants.CATEGORY_KEY, "providers");
        builder.addParameter(CommonConstants.PROTOCOL_KEY, "rocketmq");
        builder.addParameter("queueId", queue + "");
        builder.addParameter("topic", serviceName.getValue());
        return builder.build();
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractRedisClient` has no concrete subclass
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/support/AbstractRedisClient.java`
#### Snippet
```java
import java.util.Set;

public abstract class AbstractRedisClient implements RedisClient {
    private URL url;

```

### AbstractClassNeverImplemented
Abstract class `AbstractKryoFactory` has no concrete subclass
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/AbstractKryoFactory.java`
#### Snippet
```java
import java.util.regex.Pattern;

public abstract class AbstractKryoFactory extends Pool<Kryo> {

    private final Set<Class> registrations = new LinkedHashSet<Class>();
```

### AbstractClassNeverImplemented
Abstract class `AbstractHessian2FactoryInitializer` has no concrete subclass
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/dubbo/AbstractHessian2FactoryInitializer.java`
#### Snippet
```java
import com.caucho.hessian.io.SerializerFactory;

public abstract class AbstractHessian2FactoryInitializer implements Hessian2FactoryInitializer {
    private static SerializerFactory SERIALIZER_FACTORY;

```

### AbstractClassNeverImplemented
Abstract class `AbstractGroup` has no concrete subclass
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/AbstractGroup.java`
#### Snippet
```java
 * AbstractGroup
 */
public abstract class AbstractGroup implements Group {

    // log output
```

### AbstractClassNeverImplemented
Abstract class `AbstractExchangeGroup` has no concrete subclass
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/AbstractExchangeGroup.java`
#### Snippet
```java
 * AbstractGroup
 */
public abstract class AbstractExchangeGroup implements ExchangeGroup {

    // log  output
```

### AbstractClassNeverImplemented
Abstract class `AbstractRetryPolicy` has no concrete subclass
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/AbstractRetryPolicy.java`
#### Snippet
```java
package org.apache.dubbo.remoting.etcd;

public abstract class AbstractRetryPolicy implements RetryPolicy {

    private final int maxRetried;
```

### AbstractClassNeverImplemented
Abstract class `AbstractEtcdClient` has no concrete subclass
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java
import static org.apache.dubbo.remoting.etcd.Constants.ROUTERS_CATEGORY;

public abstract class AbstractEtcdClient<WatcherListener> implements EtcdClient {

    protected static final Logger logger = LoggerFactory.getLogger(AbstractEtcdClient.class);
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends HealthService`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    }

    private List<ServiceInstance> convert(List<HealthService> services) {
        return services.stream()
            .map(HealthService::getService)
```

### BoundedWildcard
Can generalize to `? extends Invoker`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java


    private Map<String, Invoker<T>> processIp(List<Invoker<T>> invokerList) {
        Map<String, Invoker<T>> ip2Invoker = new HashMap<>();
        for (Invoker<T> invoker : invokerList) {
```

### BoundedWildcard
Can generalize to `? extends Invoker`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    }

    private Map<String, Invoker<T>> processAddress(List<Invoker<T>> addresses) {
        Map<String, Invoker<T>> address2Invoker = new HashMap<>();
        for (Invoker<T> invoker : addresses) {
```

### BoundedWildcard
Can generalize to `? extends Invoker`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    }

    private Map<String, Invoker<T>> processIp(List<Invoker<T>> invokerList) {
        Map<String, Invoker<T>> ip2Invoker = new HashMap<>();
        for (Invoker<T> invoker : invokerList) {
```

### BoundedWildcard
Can generalize to `? extends Invoker`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    }

    private Map<String, Invoker<T>> processAddress(List<Invoker<T>> addresses) {
        Map<String, Invoker<T>> address2Invoker = new HashMap<>();
        for (Invoker<T> invoker : addresses) {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-common/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressUtil.java`
#### Snippet
```java

public class UserSpecifiedAddressUtil {
    private final static InternalThreadLocal<Address> ADDRESS = new InternalThreadLocal<>();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/RocketMQCodecSupport.java`
#### Snippet
```java
public class RocketMQCodecSupport {

    private final static String DEFAULT_REMOTING_SERIALIZATION_PROPERTY = "hessian2";

    public static Serialization getRequestSerialization(URL url, Invocation invocation) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
     * To decide the frequency of execute DNS poll (in ms)
     */
    public final static String DNS_POLLING_CYCLE = "dnsPollingCycle";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
     * To decide how many threads used to execute DNS poll
     */
    public final static String DNS_POLLING_POOL_SIZE_KEY = "dnsPollingPoolSize";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
    public final static String ADDRESS_PREFIX = "addressPrefix";

    public final static String ADDRESS_SUFFIX = "addressSuffix";

    public final static String MAX_QUERIES_PER_RESOLVE = "maxQueriesPerResolve";
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
     * Default value for check frequency: 60000 (ms)
     */
    public final static int DEFAULT_DNS_POLLING_CYCLE = 60000;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
    public final static String ADDRESS_SUFFIX = "addressSuffix";

    public final static String MAX_QUERIES_PER_RESOLVE = "maxQueriesPerResolve";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
public class DNSClientConst {

    public final static String ADDRESS_PREFIX = "addressPrefix";

    public final static String ADDRESS_SUFFIX = "addressSuffix";
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
     * Default value for DNS pool thread: 1
     */
    public final static int DEFAULT_DNS_POLLING_POOL_SIZE = 1;

}
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

public class UserSpecifiedAddressRouter<T> extends AbstractRouter {
    private final static Logger logger = LoggerFactory.getLogger(UserSpecifiedAddressRouter.class);
    // protected for ut purpose
    protected static int EXPIRE_TIME = 10 * 60 * 1000;
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/DefaultUserSpecifiedServiceAddressBuilder.java`
#### Snippet
```java

public class DefaultUserSpecifiedServiceAddressBuilder implements UserSpecifiedServiceAddressBuilder {
    public final static String NAME = "default";

    private final ExtensionLoader<Protocol> protocolExtensionLoader;
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

public class UserSpecifiedAddressRouter<T> extends AbstractStateRouter<T> {
    private final static Logger logger = LoggerFactory.getLogger(UserSpecifiedAddressRouter.class);
    // protected for ut purpose
    protected static int EXPIRE_TIME = 10 * 60 * 1000;
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // protected for ut purpose
    protected static int EXPIRE_TIME = 10 * 60 * 1000;
    private final static String USER_SPECIFIED_SERVICE_ADDRESS_BUILDER_KEY = "userSpecifiedServiceAddressBuilder";

    private volatile BitList<Invoker<T>> invokers = BitList.emptyList();
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocolFilter.java`
#### Snippet
```java
@Activate(group = CommonConstants.PROVIDER, order = Integer.MIN_VALUE, before = "context")
public class HessianProtocolFilter implements Filter {
    private final static InternalThreadLocal<Map<String, String>> attachments = new InternalThreadLocal<>();

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocolClientFilter.java`
#### Snippet
```java
@Activate(group = CommonConstants.CONSUMER, order = Integer.MAX_VALUE)
public class HessianProtocolClientFilter implements Filter {
    private final static InternalThreadLocal<Map<String, String>> attachments = new InternalThreadLocal<>();

    @Override
```

### MissortedModifiers
Missorted modifiers `final public`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/NettyCodecAdapter.java`
#### Snippet
```java
 * NettyCodecAdapter.
 */
final public class NettyCodecAdapter {

    private final ChannelHandler encoder = new InternalEncoder();
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
public class ProtobufAttachmentUtils {
    private static Map<String, BuiltinMarshaller> marshallers = new HashMap<>();
    private final static String NULL_CLASS_NAME = "null";

    private final static JsonFormat.TypeRegistry typeRegistry;
```

### MissortedModifiers
Missorted modifiers `final static`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
    private final static String NULL_CLASS_NAME = "null";

    private final static JsonFormat.TypeRegistry typeRegistry;

    static {
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
        int length = dis.readInt();
        byte[] bytes = new byte[length];
        dis.read(bytes, 0, length);
        return bytes;
    }
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
        int length = dis.readInt();
        byte[] bytes = new byte[length];
        dis.read(bytes, 0, length);
        return new String(bytes);
    }
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

        Invoker<?> targetInvoker;
        if (port != 0) {
            targetInvoker = address2Invoker.get(ip + ":" + port);
            if (targetInvoker != null) {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

        Invoker<T> targetInvoker;
        if (port != 0) {
            targetInvoker = address2Invoker.get(ip + ":" + port);
            if (targetInvoker != null) {
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            Status status = Status.fromThrowable(e);
            // system may be recover later, current connect won't be lost
            if (OptionUtil.isHaltError(status) || OptionUtil.isNoLeaderError(status)) {
                reconnectSchedule.schedule(this::reconnect, new Random().nextInt(delayPeriod), TimeUnit.MILLISECONDS);
                return;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java

    public void destroy() {
        if (super.isDestroyed()) {
            return;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
        try {
            destroyLock.lock();
            if (super.isDestroyed()) {
                return;
            }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java

        public Notifier(String service) {
            super.setDaemon(true);
            super.setName("DubboRedisSubscribe");
            this.service = service;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
        public Notifier(String service) {
            super.setDaemon(true);
            super.setName("DubboRedisSubscribe");
            this.service = service;
        }
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
                                .orElseGet(() -> {
                                    ConcurrentMap<NotifyListener, ChildListener> container, prev;
                                    prev = etcdListeners.putIfAbsent(url, container = new ConcurrentHashMap<>());
                                    return prev != null ? prev : container;
                                });
```

### NestedAssignment
Result of assignment expression used
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
eGet(() -> {
                                    ChildListener childListener, prev;
                                    prev = listeners.putIfAbsent(listener, childListener = (parentPath, currentChildren) -> {
                                        /*
                                         *  because etcd3 does not support direct children watch events,
                                         *  we should filter not interface events. if we watch /dubbo
                                         *  and /dubbo/interface, when we put a key-value pair {/dubbo/interface/hello hello},
                                         *  we will got events in watching path /dubbo.
                                         */
                                        for (String child : currentChildren) {
                                            child = URL.decode(child);
                                            if (!anyServices.contains(child)) {
                                                anyServices.add(child);
                                                /*
                                                 *  if new interface event arrived, we watch their direct children,
                                                 *  eg: /dubbo/interface, /dubbo/interface and so on.
                                                 */
                                                subscribe(url.setPath(child).addParameters(INTERFACE_KEY, child,
                                                        CHECK_KEY, String.valueOf(false)), listener);
                                            }
                                        }
                                    });
                                    return prev != null ? prev : childListener;
                                });
```

### NestedAssignment
Result of assignment expression used
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
                                        ConcurrentMap<NotifyListener, ChildListener> container, prev;
                                        prev = etcdListeners.putIfAbsent(url,
                                                container = new ConcurrentHashMap<>());
                                        return prev != null ? prev : container;
                                    });
```

### NestedAssignment
Result of assignment expression used
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
                                    .orElseGet(() -> {
                                        ChildListener watchListener, prev;
                                        prev = listeners.putIfAbsent(listener, watchListener = (parentPath, currentChildren) -> EtcdRegistry.this.notify(url, listener,
                                                toUrlsWithEmpty(url, parentPath, currentChildren)));
                                        return prev != null ? prev : watchListener;
                                    });
```

### NestedAssignment
Result of assignment expression used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                        int index = len, count = 0;
                        if (child.length() > len) {
                            for (; (index = child.indexOf(PATH_SEPARATOR, index)) != -1; ++index) {
                                if (count++ > 1) {
                                    break;
```

### NestedAssignment
Result of assignment expression used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                    switch (event.getType()) {
                        case PUT: {
                            if (((service = find(event)) != null)
                                    && safeUpdate(service, true)) {
                                modified++;
```

### NestedAssignment
Result of assignment expression used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                        }
                        case DELETE: {
                            if (((service = find(event)) != null)
                                    && safeUpdate(service, false)) {
                                modified++;
```

### NestedAssignment
Result of assignment expression used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            int len = path.length(), index = len, count = 0;
            if (key.length() >= index) {
                for (; (index = key.indexOf(PATH_SEPARATOR, index)) != -1; ++index) {
                    if (count++ > 1) {
                        break;
```

### NestedAssignment
Result of assignment expression used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                                    int index = len, count = 0;
                                    if (key.length() > len) {
                                        for (; (index = key.indexOf(PATH_SEPARATOR, index)) != -1; ++index) {
                                            if (count++ > 1) {
                                                break;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`group = group + PATH_SEPARATOR` could be simplified to 'group += PATH_SEPARATOR'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
        }
        if (!group.endsWith(PATH_SEPARATOR)) {
            group = group + PATH_SEPARATOR;
        }
        this.root = group;
```

### ReplaceAssignmentWithOperatorAssignment
`endKey[endKey.length - 1] = (byte) (endKey[endKey.length - 1] + 1)` could be simplified to 'endKey\[endKey.length - 1\] += 1'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/option/OptionUtil.java`
#### Snippet
```java
        byte[] endKey = prefix.getBytes().clone();
        if (prefix.size() > 0) {
            endKey[endKey.length - 1] = (byte) (endKey[endKey.length - 1] + 1);
            return ByteSequence.from(endKey);
        }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
        public void start() {
            final CountDownLatch latch = new CountDownLatch(1);
            SubscriberRegistration subscriberRegistration = new SubscriberRegistration(serviceName, (dataId, data) -> {
                handleRegistryData(dataId, data, latch);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
        if (allApiModuleInfo == null) {
            allApiModuleInfo = new ArrayList<>(apiModulesCache.size());
            apiModulesCache.forEach((k, v) -> {
                allApiModuleInfo.add(v);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
        if (basicApiModuleInfo == null) {
            List<ModuleCacheItem> tempList = new ArrayList<>(apiModulesCache.size());
            apiModulesCache.forEach((k, v) -> {
                tempList.add(v);
            });
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `_deserializerMap` are updated, but never queried
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java
public class Hessian2SerializerFactory extends SerializerFactory {
    private HashMap _serializerMap = new HashMap();
    private HashMap _deserializerMap = new HashMap();

    public Hessian2SerializerFactory() {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `destinationRegistry` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private ServerFactoryBean serverFactoryBean = null;

    private DestinationRegistry destinationRegistry = null;

    private HttpBinder httpBinder;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `transportFactory` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private final ExtensionManagerBus bus = new ExtensionManagerBus();

    private SoapTransportFactory transportFactory = null;

    private ServerFactoryBean serverFactoryBean = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serverFactoryBean` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private SoapTransportFactory transportFactory = null;

    private ServerFactoryBean serverFactoryBean = null;

    private DestinationRegistry destinationRegistry = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `server` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private HttpBinder httpBinder;

    private Server server = null;

    public WebServiceProtocol() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `notifiers` is accessed in both synchronized and unsynchronized contexts
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private ExecutorService notifierExecutor = newCachedThreadPool(
        new NamedThreadFactory("dubbo-service-discovery-consul-notifier", true));
    private Map<String, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
    private TtlScheduler ttlScheduler;
    private long checkPassInterval;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `notifierExecutor` is accessed in both synchronized and unsynchronized contexts
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private String tag;
    private ConsulClient client;
    private ExecutorService notifierExecutor = newCachedThreadPool(
        new NamedThreadFactory("dubbo-service-discovery-consul-notifier", true));
    private Map<String, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `address` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    private DefaultMQPushConsumer defaultMQPushConsumer;

    private String address;

    private String namespace;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `executor` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    private int sendMsgTimeout;

    private ExecutorService executor;


```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messageListenerConcurrently` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
public class RocketMQProtocolServer implements ProtocolServer {

    private MessageListenerConcurrently messageListenerConcurrently;

    private DefaultMQProducer defaultMQProducer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `defaultMQProducer` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    private MessageListenerConcurrently messageListenerConcurrently;

    private DefaultMQProducer defaultMQProducer;

    private DefaultMQPushConsumer defaultMQPushConsumer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `url` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    private String namespace;

    private URL url;

    private String model;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `model` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    private URL url;

    private String model;

    private String inistanceName;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `defaultMQPushConsumer` is accessed in both synchronized and unsynchronized contexts
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    private DefaultMQProducer defaultMQProducer;

    private DefaultMQPushConsumer defaultMQPushConsumer;

    private String address;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mockService` is accessed in both synchronized and unsynchronized contexts
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java
    private static final Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();

    private MockService mockService;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `SERIALIZER_FACTORY` is accessed in both synchronized and unsynchronized contexts
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/dubbo/AbstractHessian2FactoryInitializer.java`
#### Snippet
```java

public abstract class AbstractHessian2FactoryInitializer implements Hessian2FactoryInitializer {
    private static SerializerFactory SERIALIZER_FACTORY;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
public class JEtcdClientWrapper {

    private Logger logger = LoggerFactory.getLogger(JEtcdClientWrapper.class);

    private final URL url;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `expirePeriod` is accessed in both synchronized and unsynchronized contexts
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private ConnectionStateListener connectionStateListener;

    private long expirePeriod;

    private CompletableFuture<Client> completableFuture;
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryFactory.java`
#### Snippet
```java
     * @param url URL
     */
    protected void initEnvironment(URL url) {
    }
}
```

### EmptyMethod
The method is empty
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/PrototypeKryoFactory.java`
#### Snippet
```java

    @Override
    public void returnKryo(Kryo kryo) {
        // do nothing
    }
```

### EmptyMethod
The method is empty
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/ThreadLocalKryoFactory.java`
#### Snippet
```java

    @Override
    public void returnKryo(Kryo kryo) {
        // do nothing
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectOutput.java`
#### Snippet
```java

    private final PrintWriter writer;
    private Gson gson = null;

    public GsonJsonObjectOutput(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private ServerFactoryBean serverFactoryBean = null;

    private DestinationRegistry destinationRegistry = null;

    private HttpBinder httpBinder;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private final ExtensionManagerBus bus = new ExtensionManagerBus();

    private SoapTransportFactory transportFactory = null;

    private ServerFactoryBean serverFactoryBean = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private SoapTransportFactory transportFactory = null;

    private ServerFactoryBean serverFactoryBean = null;

    private DestinationRegistry destinationRegistry = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    private HttpBinder httpBinder;

    private Server server = null;

    public WebServiceProtocol() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-common/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/Address.java`
#### Snippet
```java
    // address - priority: 1
    private URL urlAddress;
    private boolean needToCreate = false;

    public Address(String ip, int port) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
    private static Map<String, String> apiParamsAndRespStrCache = new ConcurrentHashMap<>(16);

    private static List<ModuleCacheItem> allApiModuleInfo = null;

    private static String basicApiModuleInfo = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
    private static List<ModuleCacheItem> allApiModuleInfo = null;

    private static String basicApiModuleInfo = null;

    public static void addApiModule(String key, ModuleCacheItem moduleCacheItem) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
    private final int expirePeriod;

    private volatile boolean admin = false;

    private final Map<URL, Long> expireCache = new ConcurrentHashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/RetryLoops.java`
#### Snippet
```java
    private final long startTimeMs = System.currentTimeMillis();
    private boolean isDone = false;
    private int retriedCount = 0;
    private Logger logger = LoggerFactory.getLogger(RetryLoops.class);

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/RetryLoops.java`
#### Snippet
```java

    private final long startTimeMs = System.currentTimeMillis();
    private boolean isDone = false;
    private int retriedCount = 0;
    private Logger logger = LoggerFactory.getLogger(RetryLoops.class);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java
    private final List<String> categories = Arrays.asList(PROVIDERS_CATEGORY, CONSUMERS_CATEGORY, ROUTERS_CATEGORY,
            CONFIGURATORS_CATEGORY);
    private volatile boolean closed = false;

    public AbstractEtcdClient(URL url) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private volatile long globalLeaseId;

    private volatile boolean cancelKeepAlive = false;

    public static final Charset UTF_8 = StandardCharsets.UTF_8;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private final URL url;
    private volatile Client client;
    private volatile boolean started = false;
    private volatile boolean connectState = false;
    private ScheduledFuture future;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java

    private final Set<String> registeredPaths = new ConcurrentHashSet<>();
    private volatile CloseableClient keepAlive = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private volatile Client client;
    private volatile boolean started = false;
    private volatile boolean connectState = false;
    private ScheduledFuture future;
    private ScheduledExecutorService reconnectNotify;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `InitializingBean`
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/JsonRpcProxyFactoryBean.java`
#### Snippet
```java
public class JsonRpcProxyFactoryBean extends RemoteInvocationBasedAccessor
    implements MethodInterceptor,
    InitializingBean,
    FactoryBean<Object>,
    ApplicationContextAware {
```

### RedundantImplements
Redundant interface declaration `RemotingServer`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServer.java`
#### Snippet
```java
 * NettyServer.
 */
public class QuicNettyServer extends AbstractServer implements RemotingServer {

    private static final Logger logger = LoggerFactory.getLogger(QuicNettyServer.class);
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        RpcException re = new RpcException("Failed to invoke redis service method. interface: " + type.getName() + ", method: " + invocation.getMethodName() + ", url: " + url + ", cause: " + t.getMessage(), t);
                        if (t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof JedisConnectionException || t instanceof IOException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                        if (t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof JedisConnectionException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        } else if (t instanceof JedisDataException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                        if (t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof JedisConnectionException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        } else if (t instanceof JedisDataException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                        } else if (t instanceof JedisConnectionException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        } else if (t instanceof JedisDataException) {
                            re.setCode(RpcException.SERIALIZATION_EXCEPTION);
                        }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSResolver.java`
#### Snippet
```java
            }
        } catch (Throwable t) {
            if (t instanceof UnknownHostException) {
                if (logger.isInfoEnabled()) {
                    logger.info(t.getLocalizedMessage());
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        RpcException re = new RpcException("Failed to invoke memcached service method. interface: " + type.getName() + ", method: " + invocation.getMethodName() + ", url: " + url + ", cause: " + t.getMessage(), t);
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        RpcException re = new RpcException("Failed to invoke memcached service method. interface: " + type.getName() + ", method: " + invocation.getMethodName() + ", url: " + url + ", cause: " + t.getMessage(), t);
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        }
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer stringBuffer` may be declared as 'StringBuilder'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
            throw new RuntimeException("group and version is not null");
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean isGroup = false;
        if (Objects.nonNull(url.getParameter(CommonConstants.GROUP_KEY))) {
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `originalMessage` of exception class
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufWrappedException.java`
#### Snippet
```java

    private String originalClassName;
    private String originalMessage;

    public ProtobufWrappedException(ThrowableProto throwableProto) {
```

### NonFinalFieldOfException
Non-final field `originalClassName` of exception class
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufWrappedException.java`
#### Snippet
```java
    private static final long serialVersionUID = -1792808536714102039L;

    private String originalClassName;
    private String originalMessage;

```

## RuleId[ruleID=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                        ? address
                        : HTTP_KEY + address)
                .collect(toList());
        Collections.shuffle(addresses);
        return addresses.toArray(new String[0]);
```

## RuleId[ruleID=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `dubbo-serialization-extensions/dubbo-serialization-fastjson/src/main/java/org/apache/dubbo/common/serialize/fastjson/FastJsonObjectInput.java`
#### Snippet
```java
    }

    private String readLine() throws IOException, EOFException {
        String line = reader.readLine();
        if (line == null || line.trim().length() == 0) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-serialization-extensions/dubbo-serialization-fst/src/main/java/org/apache/dubbo/common/serialize/fst/FstObjectInput.java`
#### Snippet
```java
            return null;
        } else if (len == 0) {
            return new byte[]{};
        } else {
            byte[] b = new byte[len];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/SentinelRedisClient.java`
#### Snippet
```java
        String masterName = url.getParameter("master.name", "Sentinel-master");
        String address = (new StringBuilder()).append(url.getAddress()).toString();
        String[] backupAddresses = url.getParameter(RemotingConstants.BACKUP_KEY, new String[0]);
        if (backupAddresses.length == 0) {
            throw new IllegalStateException("Sentinel addresses can not be empty");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java
        hostAndPorts.add(new HostAndPort(url.getHost(), url.getPort()));
        String backupAddresses = url.getBackupAddress(6379);
        String[] nodes = StringUtils.isEmpty(backupAddresses) ? new String[0] : COMMA_SPLIT_PATTERN.split(backupAddresses);
        if (nodes.length > 0) {
            for (String node : nodes) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/KryoObjectInput.java`
#### Snippet
```java
                return null;
            } else if (len == 0) {
                return new byte[]{};
            } else {
                return input.readBytes(len);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectInput2.java`
#### Snippet
```java
                return null;
            } else if (len == 0) {
                return new byte[]{};
            } else {
                return input.readBytes(len);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/FileGroup.java`
#### Snippet
```java
                saves.add(line);
            }
            IOUtils.appendLines(file, saves.toArray(new String[0]));
        } catch (IOException e) {
            throw new RemotingException(new InetSocketAddress(NetUtils.getLocalHost(), 0), getUrl().toInetSocketAddress(), e.getMessage(), e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
        long now = System.currentTimeMillis();
        List<URL> result = new ArrayList<>();
        List<String> categories = Arrays.asList(url.getParameter(CATEGORY_KEY, new String[0]));
        String consumerService = url.getServiceInterface();
        for (String key : keys) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/FileExchangeGroup.java`
#### Snippet
```java
                saves.add(line);
            }
            IOUtils.appendLines(file, saves.toArray(new String[0]));
        } catch (IOException e) {
            throw new RemotingException(new InetSocketAddress(NetUtils.getLocalHost(), 0), getUrl().toInetSocketAddress(), e.getMessage(), e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
            }
        } else {
            types = new Type[0];
        }
        return types;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                .collect(toList());
        Collections.shuffle(addresses);
        return addresses.toArray(new String[0]);
    }

```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
                    return;
                }
                synchronized (this) {
                    if (servletController == null) {

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
        ProtocolServer server = serverMap.get(key);
        if (server == null) {
            synchronized (this) {
                server = serverMap.get(key);
                if (server == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java
            return mockService;
        }
        synchronized (this) {
            if (Objects.nonNull(mockService)) {
                return mockService;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (ip2Invoker != null) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/dubbo/AbstractHessian2FactoryInitializer.java`
#### Snippet
```java
            return SERIALIZER_FACTORY;
        }
        synchronized (this) {
            SERIALIZER_FACTORY = createSerializerFactory();
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (ip2Invoker != null) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private void keepAlive() throws Exception {
        if (keepAlive == null) {
            synchronized (this) {
                if (keepAlive == null) {
                    this.globalLeaseId = client.getLeaseClient()
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
    private static Builder getMessageBuilder(Class<?> requestType) throws Exception {
        Method method = requestType.getMethod("newBuilder");
        return (Builder) method.invoke(null, null);
    }

```

## RuleId[ruleID=InfiniteRecursion]
### InfiniteRecursion
Method `scan()` recurses infinitely, and can only end by throwing an exception
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/SentinelRedisClient.java`
#### Snippet
```java

    @Override
    public Set<String> scan(String pattern) {
        Jedis jedis = sentinelPool.getResource();
        Set<String> result = scan(jedis, pattern);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value `null` assigned to `bytes` is never used
in `dubbo-serialization-extensions/dubbo-serialization-msgpack/src/main/java/org/apache/dubbo/common/serialize/msgpack/MsgpackObjectOutput.java`
#### Snippet
```java
        out.write(bytes);
        out.flush();
        bytes = null;
    }

```

### UnusedAssignment
Variable `gson` initializer `null` is redundant
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectOutput.java`
#### Snippet
```java

    private final PrintWriter writer;
    private Gson gson = null;

    public GsonJsonObjectOutput(OutputStream out) {
```

### UnusedAssignment
The value `null` assigned to `json` is never used
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectOutput.java`
#### Snippet
```java
        writer.println();
        writer.flush();
        json = null;
    }

```

### UnusedAssignment
Variable `datas` initializer `null` is redundant
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
    protected List<String> getUserData(String dataId, UserData userData) {

        List<String> datas = null;
        if (userData == null) {
            datas = new ArrayList<>(0);
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/ServiceName.java`
#### Snippet
```java

    private String toValue() {
        String value = null;
        if (Objects.equals(this.groupModel, "topic")) {
            value = category +
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQExporter.java`
#### Snippet
```java
        String group = url.getParameter(GROUP_KEY, DEFAULT_PARAM_VALUE);

        String value = null;
        if (Objects.equals(url.getParameter("groupModel"), "topic")) {
            value = DEFAULT_CATEGORY + NAME_SEPARATOR + serviceInterface + NAME_SEPARATOR + version + NAME_SEPARATOR + group;
```

### UnusedAssignment
Variable `isNotRoute` initializer `true` is redundant
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    private MQAdminExt mqAdminExt;

    private boolean isNotRoute = true;

    private ClusterInfo clusterInfo;
```

### UnusedAssignment
Variable `timeout` initializer `1000` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private int calculateTimeout(Invocation invocation, String methodName) {
        Object countdown = RpcContext.getContext().get().get(CommonConstants.TIME_COUNTDOWN_KEY);
        int timeout = 1000;
        if (countdown == null) {
            timeout = (int) RpcUtils.getTimeout(getUrl(), methodName, RpcContext.getContext(), this.timeout);
```

### UnusedAssignment
Variable `requestParam` initializer `null` is redundant
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
            paramBean.setName(parameter.getName());
            paramBean.setJavaType(argClass.getCanonicalName());
            RequestParam requestParam = null;
            if (parameter.isAnnotationPresent(RequestParam.class)) {
                // Handling @RequestParam annotations on properties
```

### UnusedAssignment
Variable `handle` initializer `null` is redundant
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/Java8TimeSerializer.java`
#### Snippet
```java
        }

        T handle = null;
        try {
            Constructor<T> constructor = handleType.getConstructor(Object.class);
```

### UnusedAssignment
Variable `rpcException` initializer `null` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java

    private RpcException getRpcException(Throwable throwable) {
        RpcException rpcException = null;
        if (throwable instanceof RpcException) {
            rpcException = (RpcException) throwable;
```

### UnusedAssignment
Variable `service` initializer `null` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            if (listener != null) {
                int modified = 0;
                String service = null;
                Iterator<Event> iterator = response.getEventsList().iterator();
                while (iterator.hasNext()) {
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                                .getKvs().stream()
                                .mapToLong(keyValue -> Long.valueOf(keyValue.getValue().toString(UTF_8)))
                                .findFirst().getAsLong();
                    }, retryPolicy);
        } catch (Exception e) {
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`className.indexOf(GENERIC_START_SYMBOL) == -1` can be replaced with '!className.contains(GENERIC_START_SYMBOL)'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
        className = className.trim();
        try {
            if (className.indexOf(GENERIC_START_SYMBOL) == -1) {
                // classes in CompletableFuture have no generics
                return Class.forName(className);
```

### IndexOfReplaceableByContains
`typeName.indexOf(GENERIC_START_SYMBOL) == -1` can be replaced with '!typeName.contains(GENERIC_START_SYMBOL)'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java

    public static ParameterizedType makeParameterizedType(String typeName) {
        if (typeName.indexOf(GENERIC_START_SYMBOL) == -1) {
            return null;
        }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `metadata` is always 'null'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private Map<String, String> decodeMetadata(Map<String, String> metadata) {
        if (metadata == null) {
            return metadata;
        }
        Map<String, String> decoded = new HashMap<>(metadata.size());
```

### ConstantValue
Condition `t instanceof UnknownHostException` is always `false`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSResolver.java`
#### Snippet
```java
            }
        } catch (Throwable t) {
            if (t instanceof UnknownHostException) {
                if (logger.isInfoEnabled()) {
                    logger.info(t.getLocalizedMessage());
```

### ConstantValue
Condition `Objects.isNull(serviceType)` is always `false`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
            if (Objects.isNull(resultContext.getTargetType())) {
                Class<?> serviceType = Class.forName(resultContext.getServiceName());
                if (Objects.isNull(serviceType)) {
                    return null;
                }
```

### ConstantValue
Condition `apiParamsList != null` is always `true`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
                // Not a basic type, handling properties in method parameters
                List<ParamBean> apiParamsList = processField(argClass, parameterType, methodParameter);
                if (apiParamsList != null && !apiParamsList.isEmpty()) {
                    paramListItem.setParamInfo(apiParamsList);
                }
```

### ConstantValue
Condition `t instanceof SocketTimeoutException` is always `false` when reached
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        RpcException re = new RpcException("Failed to invoke memcached service method. interface: " + type.getName() + ", method: " + invocation.getMethodName() + ", url: " + url + ", cause: " + t.getMessage(), t);
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
```

### ConstantValue
Condition `t instanceof IOException` is always `false` when reached
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        }
```

### ConstantValue
Condition `e instanceof HttpProtocolErrorCode` is always `true`
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/HttpProtocol.java`
#### Snippet
```java
            }

            if (e instanceof HttpProtocolErrorCode) {
                return ((HttpProtocolErrorCode) e).getErrorCode();
            }
```

### ConstantValue
Value `e` is always 'null'
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/HttpProtocol.java`
#### Snippet
```java
            }
        }
        return super.getErrorCode(e);
    }

```

### ConstantValue
Condition `getClass() != obj.getClass()` is always `true`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
```

## RuleId[ruleID=IOResource]
### IOResource
'JedisPool' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                config.setMinEvictableIdleTimeMillis(url.getParameter("min.evictable.idle.time.millis", 0));
            }
            final JedisPool jedisPool = new JedisPool(config, url.getHost(), url.getPort(DEFAULT_PORT),
                    url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT),
                    StringUtils.isBlank(url.getPassword()) ? null : url.getPassword(),
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `root` may be 'static'
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdServiceDiscovery.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(EtcdServiceDiscovery.class);

    private final String root = "/services";

    private final Set<String> services = new ConcurrentHashSet<>();
```

## RuleId[ruleID=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java
        String backupAddresses = url.getBackupAddress(6379);
        String[] nodes = StringUtils.isEmpty(backupAddresses) ? new String[0] : COMMA_SPLIT_PATTERN.split(backupAddresses);
        if (nodes.length > 0) {
            for (String node : nodes) {
                String[] hostAndPort = COLON_SPLIT_PATTERN.split(node);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AbstractConsulRegistry` has only 'static' members, and lacks a 'private' constructor
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/AbstractConsulRegistry.java`
#### Snippet
```java
 * @author cvictory ON 2019-08-02
 */
public class AbstractConsulRegistry {

    static final String SERVICE_TAG = "dubbo";
```

### UtilityClassWithoutPrivateConstructor
Class `SofaRegistryConstants` has only 'static' members, and lacks a 'private' constructor
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryConstants.java`
#### Snippet
```java
 * @since 2.7.2
 */
public class SofaRegistryConstants {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `UserSpecifiedAddressUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-common/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressUtil.java`
#### Snippet
```java
import org.apache.dubbo.common.threadlocal.InternalThreadLocal;

public class UserSpecifiedAddressUtil {
    private final static InternalThreadLocal<Address> ADDRESS = new InternalThreadLocal<>();

```

### UtilityClassWithoutPrivateConstructor
Class `RocketMQCodecSupport` has only 'static' members, and lacks a 'private' constructor
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/RocketMQCodecSupport.java`
#### Snippet
```java
import org.apache.dubbo.rpc.Invocation;

public class RocketMQCodecSupport {

    private final static String DEFAULT_REMOTING_SERIALIZATION_PROPERTY = "hessian2";
```

### UtilityClassWithoutPrivateConstructor
Class `DNSClientConst` has only 'static' members, and lacks a 'private' constructor
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSClientConst.java`
#### Snippet
```java
package org.apache.dubbo.registry.dns.util;

public class DNSClientConst {

    public final static String ADDRESS_PREFIX = "addressPrefix";
```

### UtilityClassWithoutPrivateConstructor
Class `WrapperUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/utils/WrapperUtils.java`
#### Snippet
```java
 * Use WrapperUtils to wrap object to {@link Wrapper}
 */
public class WrapperUtils {
    private static final Set<Class<?>> WRAPPER_SET = new HashSet<>();

```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/Constants.java`
#### Snippet
```java
 * @date 2021/2/3 10:19
 */
public class Constants {

    public static final String DOT = ".";
```

### UtilityClassWithoutPrivateConstructor
Class `DubboApiDocsCache` has only 'static' members, and lacks a 'private' constructor
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
 * dubbo doc cache.
 */
public class DubboApiDocsCache {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `KryoUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/KryoUtils.java`
#### Snippet
```java
 * @since 2.6.0
 */
public class KryoUtils {
    private static AbstractKryoFactory kryoFactory = new ThreadLocalKryoFactory();

```

### UtilityClassWithoutPrivateConstructor
Class `PolarisRegistryUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/PolarisRegistryUtils.java`
#### Snippet
```java
import org.apache.dubbo.common.URL;

public class PolarisRegistryUtils {

    public static PolarisOperator getOrCreatePolarisOperator(URL registryURL) {
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-common-extensions/src/main/java/org/apache/dubbo/common/utils/Utils.java`
#### Snippet
```java
package org.apache.dubbo.common.utils;

public final class Utils {

    public static boolean checkZeroArgConstructor(Class clazz) {
```

### UtilityClassWithoutPrivateConstructor
Class `Networkers` has only 'static' members, and lacks a 'private' constructor
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Networkers.java`
#### Snippet
```java
 * <a href="http://en.wikipedia.org/wiki/Peer-to-peer">Peer-to-peer</a>
 */
public class Networkers {

    public static Peer join(String group, String peer, ChannelHandler handler) throws RemotingException {
```

### UtilityClassWithoutPrivateConstructor
Class `ExchangeNetworkers` has only 'static' members, and lacks a 'private' constructor
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/ExchangeNetworkers.java`
#### Snippet
```java
 * Networkers
 */
public class ExchangeNetworkers {

    public static ExchangePeer join(String group, String peer, ExchangeHandler handler) throws RemotingException {
```

### UtilityClassWithoutPrivateConstructor
Class `ExampleApplication` has only 'static' members, and lacks a 'private' constructor
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/ExampleApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo(scanBasePackages = {"org.apache.dubbo.apidocs.examples.api"})
public class ExampleApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `OptionUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/option/OptionUtil.java`
#### Snippet
```java
import io.netty.handler.codec.http2.Http2Exception;

public class OptionUtil {

    public static final byte[] NO_PREFIX_END = {0};
```

### UtilityClassWithoutPrivateConstructor
Class `ClassTypeUtil` has only 'static' members, and lacks a 'private' constructor
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
 * Java class tool class, special for Dubbo doc.
 */
public class ClassTypeUtil {

    private static final Logger LOG = LoggerFactory.getLogger(ClassTypeUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ExampleScaApplication` has only 'static' members, and lacks a 'private' constructor
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/ExampleScaApplication.java`
#### Snippet
```java
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = {"org.apache.dubbo.apidocs.examples.api"})
public class ExampleScaApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `QuicNettyEventLoopFactory` has only 'static' members, and lacks a 'private' constructor
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyEventLoopFactory.java`
#### Snippet
```java
import java.util.concurrent.ThreadFactory;

public class QuicNettyEventLoopFactory {
    public static EventLoopGroup eventLoopGroup(int threads, String threadFactoryName) {
        ThreadFactory threadFactory = new DefaultThreadFactory(threadFactoryName, true);
```

### UtilityClassWithoutPrivateConstructor
Class `ProtobufAttachmentUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
 * ProtobufAttachmentUtils
 */
public class ProtobufAttachmentUtils {
    private static Map<String, BuiltinMarshaller> marshallers = new HashMap<>();
    private final static String NULL_CLASS_NAME = "null";
```

### UtilityClassWithoutPrivateConstructor
Class `ProtobufUtils` has only 'static' members, and lacks a 'private' constructor
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentMap;

public class ProtobufUtils {

    static boolean isSupported(Class<?> clazz) {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Condition `ann instanceof RequestParam` is redundant and can be replaced with a null check
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
            // Handling @RequestParam annotations on parameters
            for (Annotation ann : argAnns) {
                if (ann instanceof RequestParam) {
                    requestParam = (RequestParam) ann;
                }
```

### DataFlowIssue
Method invocation `getException` may produce `NullPointerException`
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java
                }
            } catch (Throwable ex) {
                RpcException exception = getRpcException(result.getException());
                br.setExceptionMsg(exception.getMessage());
                br.setException(exception);
```

### DataFlowIssue
Method invocation `getRemoteAddress` may produce `NullPointerException`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServerHandler.java`
#### Snippet
```java

        if (logger.isInfoEnabled()) {
            logger.info("The connection of " + channel.getRemoteAddress() + " -> " + channel.getLocalAddress() + " is established.");
        }
    }
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java

    private final TypeHandler typeHandler = new CommonTypeHandler();
    ;

    private static final boolean ENABLE_ADMIN_MOCK = Boolean.parseBoolean(System.getProperty(ENABLE_MOCK_KEY, Boolean.FALSE.toString()));
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java

    private static final boolean ENABLE_ADMIN_MOCK = Boolean.parseBoolean(System.getProperty(ENABLE_MOCK_KEY, Boolean.FALSE.toString()));
    ;

    private static final ProxyFactory proxyFactory = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/beans/HtmlTypeEnum.java`
#### Snippet
```java
     */
    DATETIME_SELECTOR,
    ;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/TestEnum.java`
#### Snippet
```java
    TEST_ENUM_1,
    TEST_ENUM_2,
    TEST_ENUM_3;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyClient.java`
#### Snippet
```java
                        .addLast("client-idle-handler", new IdleStateHandler(heartbeatInterval, 0, 0, TimeUnit.MILLISECONDS))
                        .addLast("handler", nettyClientHandler);
                    ;
                }
            }
```

## RuleId[ruleID=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {

        Object addressObj = invocation.get(Address.name);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java


    public <T> URL buildAddress(List<Invoker<T>> invokers, Address address, URL consumerUrl) {
        if (!invokers.isEmpty()) {
            URL template = invokers.iterator().next().getUrl();
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

    @Override
    public <T> void notify(List<Invoker<T>> invokers) {
        this.invokers = (List) invokers;
        // do not build cache until first Specify Invoke happened
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java

        return new InvokeResult(resultList.stream().map(BroadcastResult::getException)
            .filter(it -> null != it).findFirst().orElse(null), resultList);

    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java
        if (i > 0) {
            String parentPath = fixedPath.substring(0, i);
            if (categories.stream().anyMatch(c -> fixedPath.endsWith(c))) {
                if (!checkExists(parentPath)) {
                    this.doCreatePersistent(parentPath);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java
                    this.doCreatePersistent(parentPath);
                }
            } else if (categories.stream().anyMatch(c -> parentPath.endsWith(c))) {
                String grandfather = parentPath.substring(0, parentPath.lastIndexOf('/'));
                if (!checkExists(grandfather)) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
        Map<String, String> stringAttachments = map.getAttachmentsMap();
        if (stringAttachments != null) {
            stringAttachments.forEach((k, v) -> attachments.put(k, v));
        }

```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/ServiceName.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        crc32.update(value.getBytes());
        value = value.replace(".", "-") + NAME_SEPARATOR + Long.toString(crc32.getValue());
        return value;
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQExporter.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        crc32.update(value.getBytes());
        value = value.replace(".", "-") + NAME_SEPARATOR + Long.toString(crc32.getValue());
        return value;
    }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'arguments' in a Serializable class
in `dubbo-mock-extensions/dubbo-mock-api/src/main/java/org/apache/dubbo/mock/api/MockContext.java`
#### Snippet
```java
     * method params of consumer
     */
    private Object[] arguments;

    public MockContext() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'data' in a Serializable class
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastResult.java`
#### Snippet
```java
    private int port;

    private Object data;

    private String exceptionMsg;
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                    this.watchRequest.onNext(cancelRequest);
                }
            } catch (Exception ignored) {
                logger.warn("Failed to cancel watch for path '" + path + "'", ignored);
            }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                }
                onFailed.accept(null);
            } catch (Exception ignored) {
                logger.warn("Failed to recover from global lease expired or lease deadline exceeded. lease '" + leaseId + "'", ignored);
            }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistry.java`
#### Snippet
```java
            logger.info("Receive updated RPC service addresses: service[" + dataId
                    + "]\n  .Available target addresses size [" + datas.size() + "]\n"
                    + sb.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
            LOGGER.info("Receive updated RPC service addresses: service[" + dataId
                    + "]\n  .Available target addresses size [" + datas.size() + "]\n"
                    + sb.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/PolarisRegistry.java`
#### Snippet
```java
            return;
        }
        LOGGER.info(String.format("[POLARIS] register service to polaris: %s", url.toString()));
        Map<String, String> metadata = new HashMap<>(url.getParameters());
        metadata.put(CommonConstants.PATH_KEY, url.getPath());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/PolarisRegistry.java`
#### Snippet
```java
            return;
        }
        LOGGER.info(String.format("[POLARIS] unregister service from polaris: %s", url.toString()));
        int port = url.getPort();
        if (port > 0) {
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `URLHashMethodNameSoapActionServiceConfiguration` may be 'static'
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    }

    private class URLHashMethodNameSoapActionServiceConfiguration extends AbstractServiceConfiguration {
        public String getAction(OperationInfo op, Method method) {
            String uri = op.getName().getNamespaceURI();
```

### InnerClassMayBeStatic
Inner class `RegistryInfoWrapper` may be 'static'
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    }

    private class RegistryInfoWrapper {

        private NotifyListener listener;
```

### InnerClassMayBeStatic
Inner class `InvokeResult` may be 'static'
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java


    private class InvokeResult {
        public RpcException exception;
        public List<BroadcastResult> resultList;
```

### InnerClassMayBeStatic
Inner class `InnerRespBean2` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
    }

    public class InnerRespBean2 {
        @ResponseProperty("InnerRespBean2#String2")
        private String string2;
```

### InnerClassMayBeStatic
Inner class `InnerRespBean1` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
    private InnerRespBean3 innerRespBean3;

    class InnerRespBean1 {
        @ResponseProperty("InnerRespBean1#String1")
        private String string1;
```

### InnerClassMayBeStatic
Inner class `InnerRespBean3` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
    }

    private class InnerRespBean3 {
        @ResponseProperty("InnerRespBean3#String3")
        private String string3;
```

### InnerClassMayBeStatic
Inner class `InnerReqBean2` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
    }

    public class InnerReqBean2 {
        @RequestParam("InnerReqBean2#string2")
        private String string2;
```

### InnerClassMayBeStatic
Inner class `InnerReqBean3` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
    }

    private class InnerReqBean3 {
        @RequestParam("InnerReqBean3#string3")
        private String string3;
```

### InnerClassMayBeStatic
Inner class `InnerReqBean1` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
    private InnerReqBean3 innerReqBean3;

    class InnerReqBean1 {
        @RequestParam("InnerReqBean1#string1")
        private String string1;
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    protected BitList<Invoker<T>> doRoute(BitList<Invoker<T>> invokers, URL url, Invocation invocation,
                                          boolean needToPrintMessage, Holder<RouterSnapshotNode<T>> nodeHolder,
                                          Holder<String> messageHolder) throws RpcException {
```

### RedundantSuppression
Redundant suppression
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/JsonRpcProxyFactoryBean.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public void afterPropertiesSet() {
        jsonProxyFactoryBean.afterPropertiesSet();
    }
```

### RedundantSuppression
Redundant suppression
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
        @SuppressWarnings("deprecation")
        @Override
        public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
            for (MessageExt messageExt : msgs) {
                rocketMQProtocolServer.getExecutorService().submit(new Runnable() {
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/KryoObjectInput.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> T readObject(Class<T> clazz, Type type) throws IOException, ClassNotFoundException {
        // TODO optimization
        return readObject(clazz);
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectInput2.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> T readObject(Class<T> clazz) throws IOException, ClassNotFoundException {
        try {
            return kryo.readObjectOrNull(input, clazz);
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectInput2.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> T readObject(Class<T> clazz, Type type) throws IOException, ClassNotFoundException {
        return readObject(clazz);
    }
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectInput.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> T readObject(Class<T> cls, Type type) throws IOException {
        return readObject(cls);
    }
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufObjectInput.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private <T> T read(Class<T> cls) throws IOException {
        if (!ProtobufUtils.isSupported(cls)) {
            throw new IllegalArgumentException("This serialization only support google protobuf messages, but the actual input type is :" + cls.getName());
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufObjectOutput.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public void writeObject(Object obj) throws IOException {
        /**
         * Protobuf does not allow writing of non-protobuf generated messages, including null value.
```

### RedundantSuppression
Redundant suppression
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Override
    public Object readObject() throws IOException, ClassNotFoundException {
        int classNameLength = dis.readInt();
        int bytesLength = dis.readInt();
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java
            for (String node : nodes) {
                String[] hostAndPort = COLON_SPLIT_PATTERN.split(node);
                hostAndPorts.add(new HostAndPort(hostAndPort[0], Integer.valueOf(hostAndPort[1])));
            }
        }
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java
    private static boolean isJava8() {
        String javaVersion = System.getProperty("java.specification.version");
        return Double.valueOf(javaVersion) >= 1.8;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                                .get(DEFAULT_REQUEST_TIMEOUT, TimeUnit.MILLISECONDS)
                                .getKvs().stream()
                                .mapToLong(keyValue -> Long.valueOf(keyValue.getValue().toString(UTF_8)))
                                .findFirst().getAsLong();
                    }, retryPolicy);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
        int maxInboundSize = DEFAULT_INBOUND_SIZE;
        if (StringUtils.isNotEmpty(System.getProperty(GRPC_MAX_INBOUND_SIZE_KEY))) {
            maxInboundSize = Integer.valueOf(System.getProperty(GRPC_MAX_INBOUND_SIZE_KEY));
        }

```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private static int obtainRequestTimeout() {
        if (StringUtils.isNotEmpty(System.getProperty(ETCD_REQUEST_TIMEOUT_KEY))) {
            return Integer.valueOf(System.getProperty(ETCD_REQUEST_TIMEOUT_KEY));
        }
        /**
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                return Collections.emptyList();
            }
            if (children.size() <= 0) {
                return children;
            }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/TestConfigInitializer.java`
#### Snippet
```java
    @Override
    public void initServiceConfig(ServiceConfig serviceConfig) {
        System.out.println("====initServiceConfig");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/DubboDocExporterListener.java`
#### Snippet
```java
    @Override
    public void unexported(Exporter<?> exporter) {
        System.out.println("=============unexported=============");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/DubboDocExporterListener.java`
#### Snippet
```java
    @Override
    public void exported(Exporter<?> exporter) throws RpcException {
        System.out.println("=============exported=============");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/TestConfigPostProcessor.java`
#### Snippet
```java
//        ((ServiceBean)serviceConfig).applicationContext.getBean(((ServiceBean) serviceConfig).getInterfaceClass());
        serviceConfig.getRef();  // 拿实例
        System.out.println("====postProcessServiceConfig");
    }

```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'null != genericType' covered by subsequent condition 'genericType instanceof GenericArrayType'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
        } else if (classType.isArray()) {
            Object obj;
            if (null != genericType && genericType instanceof GenericArrayType) {
                GenericArrayType pt = (GenericArrayType) genericType;
                String subTypeName = pt.getGenericComponentType().getTypeName();
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/ServiceName.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        crc32.update(value.getBytes());
        value = value.replace(".", "-") + NAME_SEPARATOR + Long.toString(crc32.getValue());
        return value;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQExporter.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        crc32.update(value.getBytes());
        value = value.replace(".", "-") + NAME_SEPARATOR + Long.toString(crc32.getValue());
        return value;
    }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.remoting` is unnecessary and can be removed
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/RocketMQCodecSupport.java`
#### Snippet
```java
        }
        return url.getOrDefaultFrameworkModel().getExtensionLoader(Serialization.class).getExtension(
            url.getParameter(org.apache.dubbo.remoting.Constants.SERIALIZATION_KEY, DEFAULT_REMOTING_SERIALIZATION_PROPERTY));
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.common.constants` is unnecessary and can be removed
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    public void doSubscribe(URL url, NotifyListener listener) {
        if (Objects.equals(url.getCategory(),
            org.apache.dubbo.common.constants.RegistryConstants.CONFIGURATORS_CATEGORY)) {
            return;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/delegate/SqlDateDelegate.java`
#### Snippet
```java

    @Override
    public java.sql.Date readFrom(Input input) throws IOException {
        return new java.sql.Date(input.readFixed64());
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/delegate/SqlDateDelegate.java`
#### Snippet
```java
    @Override
    public java.sql.Date readFrom(Input input) throws IOException {
        return new java.sql.Date(input.readFixed64());
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/delegate/SqlDateDelegate.java`
#### Snippet
```java

    @Override
    public void writeTo(Output output, int number, java.sql.Date value, boolean repeated) throws IOException {
        output.writeFixed64(number, value.getTime(), repeated);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/delegate/SqlDateDelegate.java`
#### Snippet
```java
    @Override
    public Class<?> typeClass() {
        return java.sql.Date.class;
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/delegate/SqlDateDelegate.java`
#### Snippet
```java
 * Custom {@link java.sql.Date} delegate
 */
public class SqlDateDelegate implements Delegate<java.sql.Date> {
    @Override
    public WireFormat.FieldType getFieldType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/QuickStartRequestBean.java`
#### Snippet
```java
 * quick start demo request parameter bean.
 */
public class QuickStartRequestBean implements java.io.Serializable {

    private static final long serialVersionUID = -7214413446084107294L;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/QuickStartRespBean.java`
#### Snippet
```java
 * quick star demo response bean.
 */
public class QuickStartRespBean implements java.io.Serializable {

    private static final long serialVersionUID = 7598240511561924368L;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/QuickStartRequestBean2.java`
#### Snippet
```java
 * quick start demo request parameter bean.
 */
public class QuickStartRequestBean2 implements java.io.Serializable {

    private static final long serialVersionUID = -7214413446084107294L;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/responses/BaseResponse.java`
#### Snippet
```java
 * BaseResponse.
 */
public class BaseResponse<T> implements java.io.Serializable {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/QuickStartRequestBase.java`
#### Snippet
```java
 * @date 2021/1/26 15:24
 */
public class QuickStartRequestBase<E, T> implements java.io.Serializable {

    private static final long serialVersionUID = 373497393757790262L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.remoting` is unnecessary and can be removed
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServer.java`
#### Snippet
```java
        }
        try {
            Collection<org.apache.dubbo.remoting.Channel> channels = getChannels();
            if (channels != null && channels.size() > 0) {
                for (org.apache.dubbo.remoting.Channel channel : channels) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dubbo.remoting` is unnecessary and can be removed
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServer.java`
#### Snippet
```java
            Collection<org.apache.dubbo.remoting.Channel> channels = getChannels();
            if (channels != null && channels.size() > 0) {
                for (org.apache.dubbo.remoting.Channel channel : channels) {
                    try {
                        channel.close();
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractRedisClient()` of an abstract class should not be declared 'public'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/support/AbstractRedisClient.java`
#### Snippet
```java
    private JedisPoolConfig config;

    public AbstractRedisClient(URL url) {
        this.url = url;
        config = new JedisPoolConfig();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKryoFactory()` of an abstract class should not be declared 'public'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/AbstractKryoFactory.java`
#### Snippet
```java
    private volatile boolean kryoCreated;

    public AbstractKryoFactory() {
        super(true, true);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractGroup()` of an abstract class should not be declared 'public'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/AbstractGroup.java`
#### Snippet
```java
    protected final ChannelHandlerDispatcher dispatcher = new ChannelHandlerDispatcher();

    public AbstractGroup(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("url == null");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractExchangeGroup()` of an abstract class should not be declared 'public'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/AbstractExchangeGroup.java`
#### Snippet
```java
    protected final ExchangeHandlerDispatcher dispatcher = new ExchangeHandlerDispatcher();

    public AbstractExchangeGroup(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("url == null");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEtcdClient()` of an abstract class should not be declared 'public'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java
    private volatile boolean closed = false;

    public AbstractEtcdClient(URL url) {
        this.url = url;
    }
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
        serverFactoryBean.getServiceFactory().getConfigurations().add(new URLHashMethodNameSoapActionServiceConfiguration());
        server = serverFactoryBean.create();
        return new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
        public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
            for (MessageExt messageExt : msgs) {
                rocketMQProtocolServer.getExecutorService().submit(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/org/apache/dubbo/rpc/protocol/rmi/RmiProtocol.java`
#### Snippet
```java
        RmiServiceExporter rmiServiceExporter = createExporter(impl, type, url, false);
        RmiServiceExporter genericServiceExporter = createExporter(impl, GenericService.class, url, true);
        return new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/PolarisRegistry.java`
#### Snippet
```java
    public void doUnsubscribe(URL url, NotifyListener listener) {
        LOGGER.info(String.format("[polaris] unsubscribe service: %s", url.toString()));
        taskScheduler.submitWatchTask(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/FileGroup.java`
#### Snippet
```java
        String path = url.getAbsolutePath();
        file = new File(path);
        checkModifiedFuture = scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/MulticastGroup.java`
#### Snippet
```java
            multicastSocket.setLoopbackMode(false);
            multicastSocket.joinGroup(multicastAddress);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/MulticastExchangeGroup.java`
#### Snippet
```java
            multicastSocket.setLoopbackMode(false);
            multicastSocket.joinGroup(multicastAddress);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/FileExchangeGroup.java`
#### Snippet
```java
            throw new IllegalStateException("The group file not exists. file: " + path);
        }
        checkModifiedFuture = scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocol.java`
#### Snippet
```java
        skeletonMap.put(genericPath, new HessianSkeleton(impl, GenericService.class));

        return new Runnable() {
            @Override
            public void run() {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `e`
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    protected int getErrorCode(Throwable e) {
        if (e instanceof Fault) {
            e = e.getCause();
        }
        if (e instanceof SocketTimeoutException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
        String servicePathPrefix = url.getParameter(SERVICE_PATH_PREFIX);
        if (!StringUtils.isEmpty(servicePathPrefix) && PROTOCOL_SERVER_SERVLET.equals(url.getParameter(PROTOCOL_SERVER))) {
            url = url.setPath(servicePathPrefix + "/" + url.getPath());
        }
        String key = new URL("http", url.getHost(), url.getPort(), url.getPath(), url.getParameters()).toIdentityString();
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/org/apache/dubbo/rpc/protocol/rmi/RmiProtocol.java`
#### Snippet
```java
    protected int getErrorCode(Throwable e) {
        if (e instanceof RemoteAccessException) {
            e = e.getCause();
        }
        if (e != null && e.getCause() != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
    private ParamBean processHtmlType(Class<?> classType, RequestParam annotation, ParamBean param) {
        if (param == null) {
            param = new ParamBean();
        }
        if (annotation != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
    private String getSupplierValueIfAbsent(String value, Supplier<String> supplier) {
        if (StringUtils.isBlank(value)) {
            value = supplier.get();

            if (StringUtils.isBlank(value)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java

            if (StringUtils.isBlank(value)) {
                value = "";
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `cls`
in `dubbo-serialization-extensions/dubbo-serialization-avro/src/main/java/org/apache/dubbo/common/serialize/avro/AvroObjectInput.java`
#### Snippet
```java
        //Map interface class change to HashMap implement
        if (cls == Map.class) {
            cls = (Class<T>) HashMap.class;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/HttpProtocol.java`
#### Snippet
```java
    protected int getErrorCode(Throwable e) {
        if (e instanceof RemoteAccessException) {
            e = e.getCause();
        }
        if (e != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocol.java`
#### Snippet
```java
        if (isGeneric) {
            RpcContext.getContext().setAttachment(GENERIC_KEY, generic);
            url = url.setPath(url.getPath() + "/" + GENERIC_KEY);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java

    public static Class<?> makeClass(String className) {
        className = className.trim();
        try {
            if (className.indexOf(GENERIC_START_SYMBOL) == -1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `processCount`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
            return null;
        }
        processCount++;

        Object initResult = initClassTypeWithDefaultValueNoProceeField(genericType, classType, processCount,
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldList`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
        }
        if (fieldList == null) {
            fieldList = new ArrayList<>(Arrays.asList(classz.getDeclaredFields()));
        } else {
            fieldList.addAll(Arrays.asList(classz.getDeclaredFields()));
```

### AssignmentToMethodParameter
Assignment to method parameter `th`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectOutput.java`
#### Snippet
```java
    public void writeThrowable(Object th) throws IOException {
        if (th instanceof Throwable && !ProtobufUtils.isSupported(th.getClass())) {
            th = ProtobufUtils.convertToThrowableProto((Throwable) th);
        }
        writer.write(ProtobufUtils.serializeJson(th));
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectOutput.java`
#### Snippet
```java
    public void writeEvent(Object data) throws IOException {
        if (data == HEARTBEAT_EVENT) {
            data = MOCK_HEARTBEAT_EVENT;
        }
        writeUTF((String) data);
```

### AssignmentToMethodParameter
Assignment to method parameter `obj`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufObjectOutput.java`
#### Snippet
```java
    public void writeThrowable(Object obj) throws IOException {
        if (obj instanceof Throwable && !(obj instanceof MessageLite)) {
            obj = ProtobufUtils.convertToThrowableProto((Throwable) obj);
        }
        ProtobufUtils.serialize(obj, os);
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufObjectOutput.java`
#### Snippet
```java
    public void writeEvent(Object data) throws IOException {
        if (data == HEARTBEAT_EVENT) {
            data = MOCK_HEARTBEAT_EVENT;
        }
        writeUTF((String) data);
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQChannel.java`
#### Snippet
```java
    @Override
    public ChannelHandler getChannelHandler() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
                } else {
                    // if server is starting, return and do nothing here
                    return null;
                }

```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
        final TServer thriftServer = getTServer(impl, type, url);
        if (thriftServer == null) {
            return null;
        }
        SERVER_MAP.put(url.getAddress(), thriftServer);
```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java
    @Override
    public Map<String, Object> getAttributes() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolServer.java`
#### Snippet
```java

    public RemotingServer getRemotingServer() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-fst/src/main/java/org/apache/dubbo/common/serialize/fst/FstObjectInput.java`
#### Snippet
```java
        int len = input.readInt();
        if (len < 0) {
            return null;
        } else if (len == 0) {
            return new byte[]{};
```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
                    if (timeout < System.currentTimeMillis()) {
                        logger.warn(String.format("message timeoute time is %d invocation is %s ", timeout, inv));
                        return null;
                    }
                    Invoker<?> invoker = exporterMap.get(topic).getInvoker();
```

### ReturnNull
Return of `null`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
    public Object handleResult(ResultContext resultContext) {
        if (Objects.isNull(resultContext.getData())) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
                Class<?> serviceType = Class.forName(resultContext.getServiceName());
                if (Objects.isNull(serviceType)) {
                    return null;
                }
                Method[] methods = serviceType.getMethods();
```

### ReturnNull
Return of `null`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/UnknownTypeHandler.java`
#### Snippet
```java
                }
            }
            return null;
        } catch (Exception e) {
            return null;
```

### ReturnNull
Return of `null`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/UnknownTypeHandler.java`
#### Snippet
```java
            return null;
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java
    private Object[] solveParams(Object[] arguments) {
        if (Objects.isNull(arguments)) {
            return null;
        }
        Object[] params = new Object[arguments.length];
```

### ReturnNull
Return of `null`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java
            List<URL> urls = ConfigValidationUtils.loadRegistries(mockServiceConfig, false);
            if (CollectionUtils.isEmpty(urls)) {
                return null;
            }
            // build the URL parameters
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/KryoObjectInput.java`
#### Snippet
```java
            int len = input.readInt();
            if (len < 0) {
                return null;
            } else if (len == 0) {
                return new byte[]{};
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectInput2.java`
#### Snippet
```java
            int len = input.readInt();
            if (len < 0) {
                return null;
            } else if (len == 0) {
                return new byte[]{};
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/LocalDateTimeHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
            return param;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/YearHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/OffsetTimeHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/LocalDateHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/DurationHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/ZoneIdHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/ZonedDateTimeHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/InstantHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/LocalTimeHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/PeriodHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/MonthDayHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/ZoneOffsetHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/OffsetDateTimeHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/YearMonthHandle.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyClient.java`
#### Snippet
```java
        Connection<?> c = connection;
        if (c == null || !c.isOpen()) {
            return null;
        }
        return GrizzlyChannel.getOrAddChannel(c, getUrl(), this);
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java
    static GrizzlyChannel getOrAddChannel(Connection<?> connection, URL url, ChannelHandler handler) {
        if (connection == null) {
            return null;
        }
        GrizzlyChannel ret = ATTRIBUTE.get(connection);
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/AbstractGroup.java`
#### Snippet
```java
    protected Client connect(URL url) throws RemotingException {
        if (servers.containsKey(url)) {
            return null;
        }
        Client client = clients.get(url);
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/AbstractExchangeGroup.java`
#### Snippet
```java
    protected Client connect(URL url) throws RemotingException {
        if (servers.containsKey(url)) {
            return null;
        }
        ExchangeClient client = clients.get(url);
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaServer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaChannel.java`
#### Snippet
```java
    static MinaChannel getOrAddChannel(IoSession session, URL url, ChannelHandler handler) {
        if (session == null) {
            return null;
        }
        MinaChannel ret = (MinaChannel) session.getAttribute(CHANNEL_KEY);
```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map without generics", responseClassDescription = "Map without generics")
    public Map demoApi6() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @Override
    public String demoApi3(String param1) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List without generics", responseClassDescription = "List without generics")
    public List demoApi10() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List generic with Object", responseClassDescription = "List generic with Object")
    public List<Object> demoApi9() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map generic with Object", responseClassDescription = "Map generic with Object")
    public Map<Object, Object> demoApi7() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Object", responseClassDescription = "Object")
    public Object demoApi8() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map generic with Object", responseClassDescription = "Map generic with Object")
    public CompletableFuture<Map<Object, Object>> demoApi7() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "many generics", responseClassDescription = "many generics")
    public CompletableFuture<List<List<String>>> demoApi12() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map without generics", responseClassDescription = "Map without generics")
    public CompletableFuture<Map> demoApi6() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List without generics", responseClassDescription = "List without generics")
    public CompletableFuture<List> demoApi10() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List generic with Object", responseClassDescription = "List generic with Object")
    public CompletableFuture<List<Object>> demoApi9() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Integer", responseClassDescription = "Integer")
    public CompletableFuture<Integer> demoApi11() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Object", responseClassDescription = "Object")
    public CompletableFuture<Object> demoApi8() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-metadata-report-extensions/dubbo-metadata-report-consul/src/main/java/org/apache/dubbo/metadata/store/consul/ConsulMetadataReport.java`
#### Snippet
```java
                return value.getValue().getValue();
            }
            return null;
        } catch (Throwable t) {
            logger.error("Failed to get " + identifier + " from consul , cause: " + t.getMessage(), t);
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java`
#### Snippet
```java
        IoSession s = session;
        if (s == null || !s.isConnected()) {
            return null;
        }
        return MinaChannel.getOrAddChannel(s, getUrl(), this);
```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java
        ConcurrentMap<ChildListener, WatcherListener> listeners = childListeners.get(path);
        if (listeners == null) {
            return null;
        }
        return listeners.computeIfAbsent(listener, k -> createChildWatcherListener(path, k));
```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
        } catch (ClassNotFoundException e) {
            LOG.warn("Exception getting generics in completabilefuture", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
    public static ParameterizedType makeParameterizedType(String typeName) {
        if (typeName.indexOf(GENERIC_START_SYMBOL) == -1) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
        } catch (ClassNotFoundException e) {
            LOG.warn("Exception getting generics in completabilefuture", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
            return 0;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
            LOG.warn("The depth of bean has exceeded 10 layers, the deeper layer will be ignored! " +
                "Please modify the parameter structure or check whether there is circular reference in bean!");
            return null;
        }
        processCount++;
```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HttpClientConnection.java`
#### Snippet
```java
    @Override
    public String getStatusMessage() {
        return response == null || response.getStatusLine() == null ? null : response.getStatusLine().getReasonPhrase();
    }

```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HttpClientConnection.java`
#### Snippet
```java
    @Override
    public String getContentEncoding() {
        return (response == null || response.getEntity() == null || response.getEntity().getContentEncoding() == null) ? null : response.getEntity().getContentEncoding().getValue();
    }

```

### ReturnNull
Return of `null`
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HttpClientConnection.java`
#### Snippet
```java
    @Override
    public InputStream getInputStream() throws IOException {
        return response == null || response.getEntity() == null ? null : response.getEntity().getContent();
    }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "many generics", responseClassDescription = "many generics")
    public CompletableFuture<List<List<String>>> demoApi12() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Integer", responseClassDescription = "Integer")
    public CompletableFuture<Integer> demoApi11() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List without generics", responseClassDescription = "List without generics")
    public CompletableFuture<List> demoApi10() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map generic with Object", responseClassDescription = "Map generic with Object")
    public CompletableFuture<Map<Object, Object>> demoApi7() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List generic with Object", responseClassDescription = "List generic with Object")
    public CompletableFuture<List<Object>> demoApi9() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map without generics", responseClassDescription = "Map without generics")
    public CompletableFuture<Map> demoApi6() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/AsyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Object", responseClassDescription = "Object")
    public CompletableFuture<Object> demoApi8() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Object", responseClassDescription = "Object")
    public Object demoApi8() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @Override
    public String demoApi3(String prarm1) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List without generics", responseClassDescription = "List without generics")
    public List demoApi10() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map generic with Object", responseClassDescription = "Map generic with Object")
    public Map<Object, Object> demoApi7() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "Map without generics", responseClassDescription = "Map without generics")
    public Map demoApi6() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
    @ApiDoc(value = "List generic with Object", responseClassDescription = "List generic with Object")
    public List<Object> demoApi9() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
    static QuicNettyChannel getOrAddChannel(Channel ch, URL url, ChannelHandler handler) {
        if (ch == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    public String getKVValue(String key) {
        if (null == key) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyBackedChannelBuffer.java`
#### Snippet
```java
    @Override
    public ChannelBufferFactory factory() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyClient.java`
#### Snippet
```java
        Channel c = this.schannel;
        if (c == null) {
            return null;
        }
        return QuicNettyChannel.getOrAddChannel(c, getUrl(), this);
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
        @Override
        public Object unmarshal(Any any) throws InvalidProtocolBufferException {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java

    public static Object convertEmptyToNull(Empty empty) {
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `rocketMQProtocolServer` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
                server = serverMap.get(key);

                RocketMQProtocolServer rocketMQProtocolServer = (RocketMQProtocolServer) server;
                return rocketMQProtocolServer;
            }
```

### UnnecessaryLocalVariable
Local variable `rocketMQInvoker` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
        try {
            RocketMQProtocolServer rocketMQProtocolServer = this.openServer(url, CommonConstants.CONSUMER);
            RocketMQInvoker<T> rocketMQInvoker = new RocketMQInvoker<>(type, url, rocketMQProtocolServer);
            return rocketMQInvoker;
        } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `tasks` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java

    private List<Callable<BroadcastResult>> getCallables(List<Invoker<T>> invokers, Invocation invocation) {
        List<Callable<BroadcastResult>> tasks = invokers.stream().map(it -> (Callable<BroadcastResult>) () -> {
            BroadcastResult br = new BroadcastResult(it.getUrl().getIp(), it.getUrl().getPort());
            Result result = null;
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
    public InetSocketAddress getLocalAddress() {
        int port = this.getUrl().getPort();
        InetSocketAddress res = new InetSocketAddress(port);
        return res;
    }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
                                logger.warn("Failed to subscribe service from redis registry. registry: " + getUrl().getAddress() + ", cause: " + t.getMessage(), t);
                                // If you only have a single redis, you need to take a rest to avoid overtaking a lot of CPU resources
                                sleep(reconnectPeriod);
                            }
                        } catch (Throwable t) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
                        } catch (Throwable t) {
                            logger.error(t.getMessage(), t);
                            sleep(reconnectPeriod);
                        }
                    }
```

## RuleId[ruleID=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/MulticastGroup.java`
#### Snippet
```java
            }, "MulticastGroupReceiver");
            thread.setDaemon(true);
            thread.start();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/MulticastExchangeGroup.java`
#### Snippet
```java
            }, "MulticastGroupReceiver");
            thread.setDaemon(true);
            thread.start();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
        Map<String, String> stringAttachments = map.getAttachmentsMap();
        if (stringAttachments != null) {
            stringAttachments.forEach((k, v) -> attachments.put(k, v));
        }

```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'withHostAndPort(com.google.common.net.HostAndPort)' is unstable because its signature references unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
        int port = ConsulConstants.INVALID_PORT != url.getPort() ? url.getPort() : ConsulConstants.DEFAULT_PORT;
        Consul.Builder builder = Consul.builder()
                .withHostAndPort(HostAndPort.fromParts(host, port));
        String token = url.getParameter(ConsulConstants.TOKEN, (String) null);
        if (StringUtils.isNotEmpty(token)) {
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
        int port = ConsulConstants.INVALID_PORT != url.getPort() ? url.getPort() : ConsulConstants.DEFAULT_PORT;
        Consul.Builder builder = Consul.builder()
                .withHostAndPort(HostAndPort.fromParts(host, port));
        String token = url.getParameter(ConsulConstants.TOKEN, (String) null);
        if (StringUtils.isNotEmpty(token)) {
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
        int port = ConsulConstants.INVALID_PORT != url.getPort() ? url.getPort() : ConsulConstants.DEFAULT_PORT;
        Consul.Builder builder = Consul.builder()
                .withHostAndPort(HostAndPort.fromParts(host, port));
        String token = url.getParameter(ConsulConstants.TOKEN, (String) null);
        if (StringUtils.isNotEmpty(token)) {
```

