# RemoteShuffleService 
 
# Bad smells
I found 491 bad smells with 55 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 59 | false |
| RedundantFieldInitialization | 53 | false |
| UNUSED_IMPORT | 46 | false |
| ReturnNull | 36 | false |
| Convert2MethodRef | 28 | false |
| UtilityClassWithoutPrivateConstructor | 26 | true |
| BoundedWildcard | 23 | false |
| UnnecessaryLocalVariable | 18 | true |
| SynchronizeOnThis | 15 | false |
| UnusedAssignment | 12 | false |
| DataFlowIssue | 11 | false |
| FinalStaticMethod | 9 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 8 | false |
| RedundantStringFormatCall | 8 | false |
| SimplifyStreamApiCallChains | 8 | false |
| SystemOutErr | 7 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| IgnoreResultOfCall | 6 | false |
| BusyWait | 6 | false |
| DuplicateExpressions | 5 | false |
| ConstantValue | 5 | false |
| FieldMayBeStatic | 5 | false |
| Convert2Lambda | 5 | false |
| WrapperTypeMayBePrimitive | 4 | false |
| IntegerMultiplicationImplicitCastToLong | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| SynchronizeOnNonFinalField | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| UnstableApiUsage | 4 | false |
| RedundantMethodOverride | 3 | false |
| CodeBlock2Expr | 3 | true |
| NonFinalFieldOfException | 3 | false |
| RedundantSuppression | 3 | false |
| UnnecessaryBoxing | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| UnnecessaryContinue | 3 | false |
| FinalPrivateMethod | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| EmptyMethod | 2 | false |
| RedundantImplements | 2 | false |
| InstanceofCatchParameter | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| NestedSynchronizedStatement | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| SillyAssignment | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| ExplicitArrayFilling | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| MalformedFormatString | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| FuseStreamOperations | 1 | false |
| IOResource | 1 | false |
| Java8MapForEach | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ImplicitArrayToString | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| Java8MapApi | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| ThreadStartInConstruction | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                // We wanted to keep 500 ms offset to compare
                long offfset = 500;
                Long latency1 = o1.getRequestLatency();
                Long latency2 = o2.getRequestLatency();

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                long offfset = 500;
                Long latency1 = o1.getRequestLatency();
                Long latency2 = o2.getRequestLatency();

                long diff = latency1 - latency2;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                    }
                }
                Long connections1 = o1.getConcurrentConnections();
                Long connections2 = o2.getConcurrentConnections();
                return Long.compare(connections1,connections2);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                }
                Long connections1 = o1.getConcurrentConnections();
                Long connections2 = o2.getConcurrentConnections();
                return Long.compare(connections1,connections2);
            })
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `filePaths` are written to, but never read
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java

    private int numFiles = 1;
    private String[] filePaths;
    private FileOutputStream[] fileStreams;

```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    }
    
    private final void checkHeaderResponseStatus(int responseStatus) {
        if (responseStatus == MessageConstants.RESPONSE_STATUS_SERVER_BUSY) {
            throw new RssServerBusyException(String.format("Server busy: %s", connectionInfo));
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    }

    private final void checkOKResponseStatus(int responseStatus) {
        switch (responseStatus) {
            case MessageConstants.RESPONSE_STATUS_OK:
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`serverDetails.size() == 0` can be replaced with 'serverDetails.isEmpty()'
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java

    List<ServerDetail> serverDetails = new ArrayList<>(servers.values());
    if (serverDetails.size() == 0) {
      return;
    }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `strLower.substring(0, strLower.length() - 1).trim()`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
                scale = KB_SIZE;
            } if (strLower.endsWith("k")) {
                strLower = strLower.substring(0, strLower.length() - 1).trim();
                scale = KB_SIZE;
            } else if (strLower.endsWith("mb")) {
```

### DuplicateExpressions
Multiple occurrences of `strLower.substring(0, strLower.length() - 1).trim()`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
                scale = MB_SIZE;
            } else if (strLower.endsWith("m")) {
                strLower = strLower.substring(0, strLower.length() - 1).trim();
                scale = MB_SIZE;
            } else if (strLower.endsWith("gb")) {
```

### DuplicateExpressions
Multiple occurrences of `strLower.substring(0, strLower.length() - 1).trim()`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
                scale = GB_SIZE;
            } else if (strLower.endsWith("g")) {
                strLower = strLower.substring(0, strLower.length() - 1).trim();
                scale = GB_SIZE;
            } else if (strLower.endsWith("bytes")) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, STATE_DIR_NAME)`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  public LocalFileStateStore(String rootDir, long fileRotationMillis, long fileRetentionMillis) {
    this.stateDir = Paths.get(rootDir, STATE_DIR_NAME).toString();
    this.fileRotationMillis = fileRotationMillis;
    this.fileRetentionMillis = fileRetentionMillis;
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, STATE_DIR_NAME)`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
    this.fileRotationMillis = fileRotationMillis;
    this.fileRetentionMillis = fileRetentionMillis;
    Paths.get(rootDir, STATE_DIR_NAME).toFile().mkdirs();
    createNewFileIfNecessary();
  }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java

public class ByteBufUtils {
    public static final byte[] convertIntToBytes(int value) {
        byte[] bytes = new byte[Integer.BYTES];
        writeInt(bytes, 0, value);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final int readInt(byte[] bytes, int index) {
        return (bytes[index] & 0xff) << 24 |
            (bytes[index + 1] & 0xff) << 16 |
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final long readLong(byte[] bytes, int index) {
        return ((long) bytes[index] & 0xff) << 56 |
            ((long) bytes[index + 1] & 0xff) << 48 |
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final byte[] readBytes(ByteBuf buf) {
        // TODO a better implementation?
        byte[] bytes = new byte[buf.readableBytes()];
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void writeLengthAndString(ByteBuf buf, String str) {
        if (str == null) {
            buf.writeInt(-1);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void writeLong(byte[] bytes, int index, long value) {
        bytes[index] = (byte) (value >>> 56);
        bytes[index + 1] = (byte) (value >>> 48);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void writeInt(byte[] bytes, int index, int value) {
        bytes[index] = (byte) (value >>> 24);
        bytes[index + 1] = (byte) (value >>> 16);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void readBytesToStream(ByteBuf buf, OutputStream stream) throws IOException {
        final int maxNumBytes = 64000;
        byte[] bytes = new byte[maxNumBytes];
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }
    
    public static final String readLengthAndString(ByteBuf buf) {
        int length = buf.readInt();
        if (length == -1) {
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'zooKeeperServersBackup' is assigned to itself
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java

  public void setZooKeeperServersBackup(String value) {
    this.zooKeeperServersBackup = zooKeeperServersBackup;
  }

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `StreamDecoderBase` has no concrete subclass
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
import java.util.LinkedList;

public abstract class StreamDecoderBase<TState, TDecodeResult> {
    protected final LinkedList<byte[]> list = new LinkedList<>();

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super NettyServerSideMetricsKey`
in `src/main/java/com/uber/rss/metrics/NettyServerSideMetricGroupContainer.java`
#### Snippet
```java
    private MetricGroupContainer<NettyServerSideMetricsKey, M> metricGroupContainer;
    
    public NettyServerSideMetricGroupContainer(Function<NettyServerSideMetricsKey, ? extends M> createFunction) {
        this.metricGroupContainer = new MetricGroupContainer<NettyServerSideMetricsKey, M>(createFunction);
    }
```

### BoundedWildcard
Can generalize to `? extends PartitionFilePathAndLength`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  }

  private void checkDuplicateFiles(List<PartitionFilePathAndLength> result) {
    List<String> filePaths = result.stream().map(t->t.getPath()).collect(Collectors.toList());
    List<String> distinctFilePaths = filePaths.stream().distinct().collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends FilePathAndLength`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  }

  private void checkDuplicateFiles(List<FilePathAndLength> result, int partition) {
    List<String> filePaths = result.stream().map(t->t.getPath()).collect(Collectors.toList());
    List<String> distinctFilePaths = filePaths.stream().distinct().collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends PartitionFilePathAndLength`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  }

  public synchronized void addFinalizedFiles(Collection<PartitionFilePathAndLength> finalizedFiles) {
    for (PartitionFilePathAndLength entry: finalizedFiles) {
      Map<String, Long> map = this.finalizedFiles.get(entry.getPartition());
```

### BoundedWildcard
Can generalize to `? super ByteBuf`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    }

    protected <R extends BaseMessage> R readMessageLengthAndContent(Function<ByteBuf, R> deserializer) {
        int len = SocketUtils.readInt(inputStream);
        byte[] bytes = SocketUtils.readBytes(inputStream, len);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/com/uber/rss/util/AsyncSocketCompletionHandler.java`
#### Snippet
```java
    private Consumer<Throwable> exceptionCallback;
    
    public AsyncSocketCompletionHandler(Consumer<Throwable> exceptionCallback) {
        this.exceptionCallback = exceptionCallback;
    }
```

### BoundedWildcard
Can generalize to `? extends ServerDetail`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
    }

    public static List<ServerDetail>  excludeByHosts(List<ServerDetail> servers, int maxCount, Collection<String> excludeHosts) {
        return servers.stream().filter(t->!shouldExclude(t.getConnectionString(), excludeHosts))
          .limit(maxCount)
```

### BoundedWildcard
Can generalize to `? extends ServerDetail`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
   * @param servers servers to check
   */
    public static void checkServersAlive(ServiceRegistry serviceRegistry, String dataCenter, String cluster, Collection<ServerDetail> servers) {
      List<String> serverIds = servers.stream().map(t->t.getServerId()).collect(Collectors.toList());
      List<ServerDetail> latestServers;
```

### BoundedWildcard
Can generalize to `? extends ServerDetail`
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * @return
   */
  public static List<ServerReplicationGroup> createReplicationGroups(Collection<ServerDetail> servers, int numReplicas) {
    if (servers.isEmpty()) {
      throw new IllegalArgumentException("Invalid argument: servers is empty");
```

### BoundedWildcard
Can generalize to `? super ZooKeeperServiceRegistry`
in `src/main/java/com/uber/rss/metadata/ZooKeeperFaultTolerantServiceRegistry.java`
#### Snippet
```java
    }

    private <T> T invokeUnderlyingRegistries(Function<ZooKeeperServiceRegistry, T> func) {
        List<Throwable> exceptions = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends SingleServerWriteClient`
in `src/main/java/com/uber/rss/clients/ServerBusyRetriableWriteClient.java`
#### Snippet
```java
    private WriteClientMetrics metrics = null;

    public ServerBusyRetriableWriteClient(Callable<SingleServerWriteClient> creator, long maxTryingMillis, String user, String appId, String appAttempt) {
        this.creator = creator;
        this.maxTryingMillis = maxTryingMillis;
```

### BoundedWildcard
Can generalize to `? super ServerIdAwareSyncWriteClient`
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
  }

  private void runAllActiveClients(Consumer<ServerIdAwareSyncWriteClient> action) {
    Exception exception = null;
    boolean succeeded = false;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    }

    private void loadStateImpl(BaseMessage stateItem, Set<String> appIds, Set<String> deletedApps, Set<AppShuffleId> stages, Set<AppShuffleId> corruptedStages) {
        if (stateItem instanceof StageInfoStateItem) {
            StageInfoStateItem stageInfoStateItem = (StageInfoStateItem)stateItem;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    }

    private void loadStateImpl(BaseMessage stateItem, Set<String> appIds, Set<String> deletedApps, Set<AppShuffleId> stages, Set<AppShuffleId> corruptedStages) {
        if (stateItem instanceof StageInfoStateItem) {
            StageInfoStateItem stageInfoStateItem = (StageInfoStateItem)stateItem;
```

### BoundedWildcard
Can generalize to `? super AppShuffleId`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    }

    private void loadStateImpl(BaseMessage stateItem, Set<String> appIds, Set<String> deletedApps, Set<AppShuffleId> stages, Set<AppShuffleId> corruptedStages) {
        if (stateItem instanceof StageInfoStateItem) {
            StageInfoStateItem stageInfoStateItem = (StageInfoStateItem)stateItem;
```

### BoundedWildcard
Can generalize to `? super AppShuffleId`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    }

    private void loadStateImpl(BaseMessage stateItem, Set<String> appIds, Set<String> deletedApps, Set<AppShuffleId> stages, Set<AppShuffleId> corruptedStages) {
        if (stateItem instanceof StageInfoStateItem) {
            StageInfoStateItem stageInfoStateItem = (StageInfoStateItem)stateItem;
```

### BoundedWildcard
Can generalize to `? extends ServerDetail`
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
    private Runnable actionToSimulateBadServer = null;

    public void setRssServers(List<ServerDetail> rssServers, int numReplicas) {
        this.rssServers = new ArrayList<>(rssServers);
        this.numReplicas = numReplicas;
```

### BoundedWildcard
Can generalize to `? super Long`
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
  }

  private void increaseRecordCount(Map<Long, Long> recordCountMap, long taskAttemptId) {
    try {
      long oldValue = recordCountMap.getOrDefault(taskAttemptId, 0L);
```

### BoundedWildcard
Can generalize to `? extends ServerDetail`
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java
  }

  public void addServers(Collection<ServerDetail> serverDetails) {
    for (ServerDetail s: serverDetails) {
      addServer(s);
```

### BoundedWildcard
Can generalize to `? extends FilePathAndLength`
in `src/main/java/com/uber/rss/handlers/DownloadServerHandler.java`
#### Snippet
```java
    }

    public ChannelFuture sendFiles(ChannelHandlerContext ctx, List<FilePathAndLength> nonEmptyFiles, ChannelIdleCheck idleCheck) {
        String connectionInfo = NettyUtils.getServerConnectionInfo(ctx);

```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                                    boolean simulateEmptyData,
                                    RateCounter rateCounter,
                                    ConcurrentHashMap<Integer, AtomicLong> numPartitionRecords) {
        if (mapDelay > 0) {
            int delayMillis = random.nextInt(mapDelay);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    }

    public void setServerPorts(List<Integer> serverPorts) {
        this.serverPorts = serverPorts;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private ConcurrentHashMap<Integer, Object> usedPartitionIds = new ConcurrentHashMap<>();

    public void setServerHosts(List<String> serverHosts) {
        this.serverHosts = serverHosts;
    }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/clients/PooledShuffleDataSyncWriteClient.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(PooledShuffleDataSyncWriteClient.class);

  private final static AtomicLong clientIdGenerator = new AtomicLong();

  private final long clientId = clientIdGenerator.getAndIncrement();
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/clients/ServerConnectionStringCache.java`
#### Snippet
```java
public class ServerConnectionStringCache {

  private final static ServerConnectionStringCache instance = new ServerConnectionStringCache();

  public static ServerConnectionStringCache getInstance() {
```

### MissortedModifiers
Missorted modifiers `final private`
in `src/main/java/com/uber/rss/common/ServerList.java`
#### Snippet
```java

public class ServerList {
  final private List<ServerDetail> serverList;

  @JsonCreator
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `src/main/java/com/uber/rss/metrics/MetricGroup.java`
#### Snippet
```java
    }

    abstract protected Scope createScope(K key);
    
    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
          .build());

  private final static PooledWriteClientFactory instance = new PooledWriteClientFactory(ClientConstants.DEFAULT_CONNECTION_IDLE_TIMEOUT_MILLIS);

  public static PooledWriteClientFactory getInstance() {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `src/main/java/com/uber/rss/clients/ShuffleDataSyncWriteClientBase.java`
#### Snippet
```java

  @Override
  abstract public void writeDataBlock(int partition, ByteBuffer value);

  @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/clients/UnpooledWriteClientFactory.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(UnpooledWriteClientFactory.class);

  private final static UnpooledWriteClientFactory instance = new UnpooledWriteClientFactory();

  public static UnpooledWriteClientFactory getInstance() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java

    public final static int MESSAGE_GetServersResponse = -16;
    public final static int MESSAGE_RegisterServerResponse = -19;

    public final static int MESSAGE_ConnectUploadRequest = -301;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_FinishApplicationJobRequest = -12;

    public final static int MESSAGE_GetServersResponse = -16;
    public final static int MESSAGE_RegisterServerResponse = -19;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_RegisterServerResponse = -19;

    public final static int MESSAGE_ConnectUploadRequest = -301;
    public final static int MESSAGE_ConnectUploadResponse = -302;
    public final static int MESSAGE_StartUploadMessage = -303;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte RESPONSE_STATUS_OK = 20;
    public final static byte RESPONSE_STATUS_SHUFFLE_STAGE_NOT_STARTED = 44;
    public final static byte RESPONSE_STATUS_FILE_CORRUPTED = 45;
    public final static byte RESPONSE_STATUS_SERVER_BUSY = 53;
    public final static byte RESPONSE_STATUS_APP_TOO_MUCH_DATA = 54;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectNotifyRequest = -311;
    public final static int MESSAGE_ConnectNotifyResponse = -312;
    public final static int MESSAGE_ConnectRegistryRequest = -313;
    public final static int MESSAGE_ConnectRegistryResponse = -314;
    public final static int MESSAGE_GetBusyStatusRequest = -320;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_GetBusyStatusRequest = -320;
    public final static int MESSAGE_GetBusyStatusResponse = -321;
    public final static int MESSAGE_ConnectDownloadRequestMessage = -351;
    public final static int MESSAGE_GetDataAvailabilityRequestMessage = -352;
    // State store data item
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte REGISTRY_UPLINK_VERSION_3 = 3;

    public final static byte RESPONSE_STATUS_OK = 20;
    public final static byte RESPONSE_STATUS_SHUFFLE_STAGE_NOT_STARTED = 44;
    public final static byte RESPONSE_STATUS_FILE_CORRUPTED = 45;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    // State store data item
    public final static int MESSAGE_StageInfoStateItem = -401;
    public final static int MESSAGE_AppDeletionStateItem = -404;
    public final static int MESSAGE_StageCorruptionStateItem = -405;
    public final static int MESSAGE_TaskAttemptCommitStateItem = -407;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectDownloadResponse = -307;
    public final static int MESSAGE_GetDataAvailabilityRequest = -310;
    public final static int MESSAGE_GetDataAvailabilityResponse = -309;
    public final static int MESSAGE_ConnectNotifyRequest = -311;
    public final static int MESSAGE_ConnectNotifyResponse = -312;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_HeartbeatMessage = -319;
    public final static int MESSAGE_ConnectDownloadRequest = -318;
    public final static int MESSAGE_ConnectDownloadResponse = -307;
    public final static int MESSAGE_GetDataAvailabilityRequest = -310;
    public final static int MESSAGE_GetDataAvailabilityResponse = -309;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_StartUploadMessage = -303;
    public final static int MESSAGE_FinishUploadMessage = -317;
    public final static int MESSAGE_HeartbeatMessage = -319;
    public final static int MESSAGE_ConnectDownloadRequest = -318;
    public final static int MESSAGE_ConnectDownloadResponse = -307;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte UPLOAD_UPLINK_VERSION_3 = 3;
    public final static byte DOWNLOAD_UPLINK_VERSION_3 = 3;
    public final static byte NOTIFY_UPLINK_VERSION_3 = 3;
    public final static byte REGISTRY_UPLINK_VERSION_3 = 3;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_RegisterServerRequest = -9;
    public final static int MESSAGE_GetServersRequest = -10;
    public final static int MESSAGE_FinishApplicationJobRequest = -12;

    public final static int MESSAGE_GetServersResponse = -16;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte RESPONSE_STATUS_FILE_CORRUPTED = 45;
    public final static byte RESPONSE_STATUS_SERVER_BUSY = 53;
    public final static byte RESPONSE_STATUS_APP_TOO_MUCH_DATA = 54;
    public final static byte RESPONSE_STATUS_STALE_TASK_ATTEMPT = 55;
    public final static byte RESPONSE_STATUS_UNSPECIFIED = 0;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectRegistryResponse = -314;
    public final static int MESSAGE_GetBusyStatusRequest = -320;
    public final static int MESSAGE_GetBusyStatusResponse = -321;
    public final static int MESSAGE_ConnectDownloadRequestMessage = -351;
    public final static int MESSAGE_GetDataAvailabilityRequestMessage = -352;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectDownloadRequest = -318;
    public final static int MESSAGE_ConnectDownloadResponse = -307;
    public final static int MESSAGE_GetDataAvailabilityRequest = -310;
    public final static int MESSAGE_GetDataAvailabilityResponse = -309;
    public final static int MESSAGE_ConnectNotifyRequest = -311;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte RESPONSE_STATUS_APP_TOO_MUCH_DATA = 54;
    public final static byte RESPONSE_STATUS_STALE_TASK_ATTEMPT = 55;
    public final static byte RESPONSE_STATUS_UNSPECIFIED = 0;

    // Control messages
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_GetDataAvailabilityResponse = -309;
    public final static int MESSAGE_ConnectNotifyRequest = -311;
    public final static int MESSAGE_ConnectNotifyResponse = -312;
    public final static int MESSAGE_ConnectRegistryRequest = -313;
    public final static int MESSAGE_ConnectRegistryResponse = -314;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectUploadRequest = -301;
    public final static int MESSAGE_ConnectUploadResponse = -302;
    public final static int MESSAGE_StartUploadMessage = -303;
    public final static int MESSAGE_FinishUploadMessage = -317;
    public final static int MESSAGE_HeartbeatMessage = -319;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_GetDataAvailabilityRequestMessage = -352;
    // State store data item
    public final static int MESSAGE_StageInfoStateItem = -401;
    public final static int MESSAGE_AppDeletionStateItem = -404;
    public final static int MESSAGE_StageCorruptionStateItem = -405;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_GetBusyStatusResponse = -321;
    public final static int MESSAGE_ConnectDownloadRequestMessage = -351;
    public final static int MESSAGE_GetDataAvailabilityRequestMessage = -352;
    // State store data item
    public final static int MESSAGE_StageInfoStateItem = -401;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectRegistryRequest = -313;
    public final static int MESSAGE_ConnectRegistryResponse = -314;
    public final static int MESSAGE_GetBusyStatusRequest = -320;
    public final static int MESSAGE_GetBusyStatusResponse = -321;
    public final static int MESSAGE_ConnectDownloadRequestMessage = -351;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte RESPONSE_STATUS_SHUFFLE_STAGE_NOT_STARTED = 44;
    public final static byte RESPONSE_STATUS_FILE_CORRUPTED = 45;
    public final static byte RESPONSE_STATUS_SERVER_BUSY = 53;
    public final static byte RESPONSE_STATUS_APP_TOO_MUCH_DATA = 54;
    public final static byte RESPONSE_STATUS_STALE_TASK_ATTEMPT = 55;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectUploadResponse = -302;
    public final static int MESSAGE_StartUploadMessage = -303;
    public final static int MESSAGE_FinishUploadMessage = -317;
    public final static int MESSAGE_HeartbeatMessage = -319;
    public final static int MESSAGE_ConnectDownloadRequest = -318;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java

    public final static byte RESPONSE_STATUS_OK = 20;
    public final static byte RESPONSE_STATUS_SHUFFLE_STAGE_NOT_STARTED = 44;
    public final static byte RESPONSE_STATUS_FILE_CORRUPTED = 45;
    public final static byte RESPONSE_STATUS_SERVER_BUSY = 53;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_GetDataAvailabilityRequest = -310;
    public final static int MESSAGE_GetDataAvailabilityResponse = -309;
    public final static int MESSAGE_ConnectNotifyRequest = -311;
    public final static int MESSAGE_ConnectNotifyResponse = -312;
    public final static int MESSAGE_ConnectRegistryRequest = -313;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_StageInfoStateItem = -401;
    public final static int MESSAGE_AppDeletionStateItem = -404;
    public final static int MESSAGE_StageCorruptionStateItem = -405;
    public final static int MESSAGE_TaskAttemptCommitStateItem = -407;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_FinishApplicationAttemptRequest = -7;
    public final static int MESSAGE_RegisterServerRequest = -9;
    public final static int MESSAGE_GetServersRequest = -10;
    public final static int MESSAGE_FinishApplicationJobRequest = -12;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    // Other constants

    public final static int DEFAULT_SHUFFLE_DATA_MESSAGE_SIZE = 32 * 1024;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
public class MessageConstants {
    public final static byte UPLOAD_UPLINK_MAGIC_BYTE = 'u';
    public final static byte DOWNLOAD_UPLINK_MAGIC_BYTE = 'd';
    public final static byte NOTIFY_UPLINK_MAGIC_BYTE = 'c';
    public final static byte REGISTRY_UPLINK_MAGIC_BYTE = 'r';
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java

    public final static int MESSAGE_ConnectUploadRequest = -301;
    public final static int MESSAGE_ConnectUploadResponse = -302;
    public final static int MESSAGE_StartUploadMessage = -303;
    public final static int MESSAGE_FinishUploadMessage = -317;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_ConnectNotifyResponse = -312;
    public final static int MESSAGE_ConnectRegistryRequest = -313;
    public final static int MESSAGE_ConnectRegistryResponse = -314;
    public final static int MESSAGE_GetBusyStatusRequest = -320;
    public final static int MESSAGE_GetBusyStatusResponse = -321;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_FinishUploadMessage = -317;
    public final static int MESSAGE_HeartbeatMessage = -319;
    public final static int MESSAGE_ConnectDownloadRequest = -318;
    public final static int MESSAGE_ConnectDownloadResponse = -307;
    public final static int MESSAGE_GetDataAvailabilityRequest = -310;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte DOWNLOAD_UPLINK_MAGIC_BYTE = 'd';
    public final static byte NOTIFY_UPLINK_MAGIC_BYTE = 'c';
    public final static byte REGISTRY_UPLINK_MAGIC_BYTE = 'r';

    public final static byte UPLOAD_UPLINK_VERSION_3 = 3;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java

    // Control messages
    public final static int MESSAGE_FinishApplicationAttemptRequest = -7;
    public final static int MESSAGE_RegisterServerRequest = -9;
    public final static int MESSAGE_GetServersRequest = -10;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte DOWNLOAD_UPLINK_VERSION_3 = 3;
    public final static byte NOTIFY_UPLINK_VERSION_3 = 3;
    public final static byte REGISTRY_UPLINK_VERSION_3 = 3;

    public final static byte RESPONSE_STATUS_OK = 20;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte REGISTRY_UPLINK_MAGIC_BYTE = 'r';

    public final static byte UPLOAD_UPLINK_VERSION_3 = 3;
    public final static byte DOWNLOAD_UPLINK_VERSION_3 = 3;
    public final static byte NOTIFY_UPLINK_VERSION_3 = 3;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte RESPONSE_STATUS_SERVER_BUSY = 53;
    public final static byte RESPONSE_STATUS_APP_TOO_MUCH_DATA = 54;
    public final static byte RESPONSE_STATUS_STALE_TASK_ATTEMPT = 55;
    public final static byte RESPONSE_STATUS_UNSPECIFIED = 0;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java

    public final static byte UPLOAD_UPLINK_VERSION_3 = 3;
    public final static byte DOWNLOAD_UPLINK_VERSION_3 = 3;
    public final static byte NOTIFY_UPLINK_VERSION_3 = 3;
    public final static byte REGISTRY_UPLINK_VERSION_3 = 3;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static byte UPLOAD_UPLINK_MAGIC_BYTE = 'u';
    public final static byte DOWNLOAD_UPLINK_MAGIC_BYTE = 'd';
    public final static byte NOTIFY_UPLINK_MAGIC_BYTE = 'c';
    public final static byte REGISTRY_UPLINK_MAGIC_BYTE = 'r';

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    // Control messages
    public final static int MESSAGE_FinishApplicationAttemptRequest = -7;
    public final static int MESSAGE_RegisterServerRequest = -9;
    public final static int MESSAGE_GetServersRequest = -10;
    public final static int MESSAGE_FinishApplicationJobRequest = -12;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java

public class MessageConstants {
    public final static byte UPLOAD_UPLINK_MAGIC_BYTE = 'u';
    public final static byte DOWNLOAD_UPLINK_MAGIC_BYTE = 'd';
    public final static byte NOTIFY_UPLINK_MAGIC_BYTE = 'c';
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
    public final static int MESSAGE_AppDeletionStateItem = -404;
    public final static int MESSAGE_StageCorruptionStateItem = -405;
    public final static int MESSAGE_TaskAttemptCommitStateItem = -407;

    // Other constants
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/util/HttpUtils.java`
#### Snippet
```java

public class HttpUtils {
    private final static MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
    
    public static String getUrl(String url) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/common/Compression.java`
#### Snippet
```java

    public final static String COMPRESSION_CODEC_LZ4 = "lz4";
    public final static String COMPRESSION_CODEC_ZSTD = "zstd";

    private static final int defaultLz4BlockSize = 65536;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/common/Compression.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(Compression.class);

    public final static String COMPRESSION_CODEC_LZ4 = "lz4";
    public final static String COMPRESSION_CODEC_ZSTD = "zstd";

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  public final static String STATE_DIR_NAME = "state";
  public final static String STATE_FILE_PREFIX = "v1_";

  public final static long DEFAULT_ROTATION_MILLIS = 60 * 60 * 1000L;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(LocalFileStateStore.class);

  public final static String STATE_DIR_NAME = "state";
  public final static String STATE_FILE_PREFIX = "v1_";

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  public final static long DEFAULT_RETENTION_MILLIS = ShuffleExecutor.DEFAULT_APP_FILE_RETENTION_MILLIS;

  private final static TimeZone utcTimeZone;
  private final static DateFormat dateFormat;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  public final static String STATE_FILE_PREFIX = "v1_";

  public final static long DEFAULT_ROTATION_MILLIS = 60 * 60 * 1000L;
  public final static long DEFAULT_RETENTION_MILLIS = ShuffleExecutor.DEFAULT_APP_FILE_RETENTION_MILLIS;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  private final static TimeZone utcTimeZone;
  private final static DateFormat dateFormat;

  static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  public final static long DEFAULT_ROTATION_MILLIS = 60 * 60 * 1000L;
  public final static long DEFAULT_RETENTION_MILLIS = ShuffleExecutor.DEFAULT_APP_FILE_RETENTION_MILLIS;

  private final static TimeZone utcTimeZone;
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
    runAllActiveClients(t->t.close());

    for (int i = 0; i < clients.length; i++) {
      clients[i] = null;
    }
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
        exceptionMetricGroupContainer = new ExceptionMetricGroupContainer();
        
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
    public void deleteFile(String path) {
        try {
            new File(path).delete();
        } catch (Throwable e) {
            throw new RssException("Failed to delete file: " + path, e);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
            try {
                logger.info("Deleting file: " + fileToDelete);
                fileToDelete.delete();
            } catch (Throwable ex) {
                logger.info("Failed to delete file: " + fileToDelete, ex);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
            try {
                logger.info("Deleting dir: " + rootDir);
                rootDir.delete();
            } catch (Throwable ex) {
                logger.info("Failed to delete dir: " + rootDir, ex);
```

### IgnoreResultOfCall
Result of `ByteArrayInputStream.read()` is ignored
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
                }

                byteArrayInputStream.read(bytesBuffer, 0, objectSize);

                HashMap<String, String> object = serializer.deserialize(ByteBuffer.wrap(bytesBuffer), classTag);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
      for (int i = 0; i < dirCount; i++) {
        Path dirPath = Paths.get(rootDir, "dir" + i);
        dirPath.toFile().mkdirs();
        dirPath.toFile().deleteOnExit();
        System.out.println(String.format("Creating files under %s, current file descriptors: %s", dirPath.toAbsolutePath(), SystemUtils.getFileDescriptorCount()));
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
    this.fileRotationMillis = fileRotationMillis;
    this.fileRetentionMillis = fileRetentionMillis;
    Paths.get(rootDir, STATE_DIR_NAME).toFile().mkdirs();
    createNewFileIfNecessary();
  }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
    });

    if (succeeded == null || !succeeded.booleanValue()) {
      if (exceptionWrapper.getException() != null) {
        throw exceptionWrapper.getException();
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
                throw new RssFileCorruptedException(String.format("Shuffle file corrupted or application writing too much data: %s", connectionInfo));
            case MessageConstants.RESPONSE_STATUS_STALE_TASK_ATTEMPT:
                throw new RssStaleTaskAttemptException(String.format("Task attempt is stale (there is a new task retry, thus the old task is not valid any more)", responseStatus, connectionInfo));
            default:
                throw new RssNetworkException(String.format("Response not ok: %s, %s", responseStatus, connectionInfo));
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `close()` only delegates to its super method
in `src/main/java/com/uber/rss/clients/HeartbeatSocketClient.java`
#### Snippet
```java

  @Override
  public void close() {
    super.close();
  }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `src/main/java/com/uber/rss/metrics/ExceptionMetrics.java`
#### Snippet
```java

    @Override
    public void close() {
        M3Stats.decreaseNumM3Scopes();
    }
```

### RedundantMethodOverride
Method `close()` only delegates to its super method
in `src/main/java/com/uber/rss/clients/BusyStatusSocketClient.java`
#### Snippet
```java

  @Override
  public void close() {
    super.close();
  }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
pollInterval \* 10: integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/clients/LazyWriteClient.java`
#### Snippet
```java
     */
    private void lazyConnect() {
        RetryUtils.retry(pollInterval, pollInterval * 10, maxWaitMillis, "create write client", () -> {
            writeClient.connect();
            return 0;
```

### IntegerMultiplicationImplicitCastToLong
runMinutes \* 60 \* 1000: integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/tools/StreamServerStressToolLongRun.java`
#### Snippet
```java
        String[] compressCodecValues = new String[] {"", Compression.COMPRESSION_CODEC_LZ4};

        while (System.currentTimeMillis() - startTime < runMinutes * 60 * 1000) {
            int writeClientQueueSize = 0;
            int writeClientThreads = 0;
```

### IntegerMultiplicationImplicitCastToLong
timeoutMillis \* serverReplicationGroup.getServers().size(): integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
    long startTime = currentTime;

    long maxRetryTimeoutMillis = timeoutMillis * serverReplicationGroup.getServers().size();
    long sleepMillis = dataAvailablePollInterval;

```

### IntegerMultiplicationImplicitCastToLong
networkTimeoutMillis \* 4: integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
                try {
                    // TODO optimize the max wait time for poll
                    long pollMaxWait = networkTimeoutMillis * 4;
                    while (exceptions.isEmpty()) {
                        long startTime = System.nanoTime();
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        byte value;

        if (currentReadCursor <= list.peek().length - 1) {
            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
        List<ServerReplicationGroup> serverReplicationGroups = ServerReplicationGroupUtil.createReplicationGroups(serverDetails, numReplicas);
        boolean finishUploadAck = true; // TODO make this configurable
        if (writeClientQueueSize == 0) {
            // Use sync write client (MultiServerSyncWriteClient)
            writeClient = new MultiServerSyncWriteClient(serverReplicationGroups, partitionFanout, networkTimeoutMillis, maxTryingMillis, null, finishUploadAck, useConnectionPool, "user1", appId, appAttempt, shuffleWriteConfig);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppShuffleId;`
in `src/main/java/com/uber/rss/StreamServer.java`
#### Snippet
```java
package com.uber.rss;

import com.uber.rss.common.AppShuffleId;
import com.uber.rss.common.ServerDetail;
import com.uber.rss.common.ServerDetailCollection;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.Compression;`
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java

import com.uber.rss.clients.ClientConstants;
import com.uber.rss.common.Compression;
import com.uber.rss.execution.ShuffleExecutor;
import com.uber.rss.handlers.UploadChannelManager;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssMissingShuffleWriteConfigException;`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
import com.uber.rss.exceptions.RssFileCorruptedException;
import com.uber.rss.exceptions.RssInvalidDataException;
import com.uber.rss.exceptions.RssMissingShuffleWriteConfigException;
import com.uber.rss.exceptions.RssNetworkException;
import com.uber.rss.exceptions.RssShuffleStageNotStartedException;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Supplier;`
in `src/main/java/com/uber/rss/clients/LazyWriteClient.java`
#### Snippet
```java

import java.nio.ByteBuffer;
import java.util.function.Supplier;

/**
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.util.NetworkUtils;`
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java

import com.uber.rss.common.ServerDetail;
import com.uber.rss.util.NetworkUtils;
import com.uber.rss.util.ServerHostAndPort;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssException;`
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
import com.uber.rss.common.ServerReplicationGroup;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `src/main/java/com/uber/rss/common/MapTaskCommitStatus.java`
#### Snippet
```java
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

// TODO remove mapper count
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppMapId;`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java

import com.uber.rss.clients.ShuffleWriteConfig;
import com.uber.rss.common.AppMapId;
import com.uber.rss.common.FilePathAndLength;
import com.uber.rss.common.MapTaskCommitStatus;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppMapId;`
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java
package com.uber.rss.execution;

import com.uber.rss.common.AppMapId;

import java.util.Comparator;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java
import com.uber.rss.common.AppMapId;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppMapId;`
in `src/main/java/com/uber/rss/execution/TaskAttemptIdAndState.java`
#### Snippet
```java
package com.uber.rss.execution;

import com.uber.rss.common.AppMapId;
import com.uber.rss.exceptions.RssInvalidStateException;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppShufflePartitionId;`
in `src/main/java/com/uber/rss/handlers/DownloadServerHandler.java`
#### Snippet
```java
import com.uber.rss.clients.ShuffleWriteConfig;
import com.uber.rss.common.AppShuffleId;
import com.uber.rss.common.AppShufflePartitionId;
import com.uber.rss.common.FilePathAndLength;
import com.uber.rss.exceptions.RssInvalidStateException;
```

### UNUSED_IMPORT
Unused import `import com.uber.m3.tally.Stopwatch;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java

import com.uber.m3.tally.Gauge;
import com.uber.m3.tally.Stopwatch;
import com.uber.rss.metrics.M3Stats;
import com.uber.rss.tools.FileDescriptorStressTest;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.tools.FileDescriptorStressTest;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
import com.uber.m3.tally.Stopwatch;
import com.uber.rss.metrics.M3Stats;
import com.uber.rss.tools.FileDescriptorStressTest;
import com.uber.rss.util.ExceptionUtils;
import com.uber.rss.util.FileUtils;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.util.FileUtils;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
import com.uber.rss.tools.FileDescriptorStressTest;
import com.uber.rss.util.ExceptionUtils;
import com.uber.rss.util.FileUtils;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
```

### UNUSED_IMPORT
Unused import `import org.spark_project.guava.util.concurrent.RateLimiter;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spark_project.guava.util.concurrent.RateLimiter;

import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.MemoryMonitor;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
package com.uber.rss.handlers;

import com.uber.rss.common.MemoryMonitor;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppTaskAttemptId;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java

import com.uber.rss.common.MemoryMonitor;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
import com.uber.rss.exceptions.RssInvalidStateException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import com.uber.rss.common.MemoryMonitor;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssMaxConnectionsException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssInvalidStateException;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssMaxConnectionsException;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ConcurrentHashMap;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ScheduledExecutorService;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppTaskAttemptId;`
in `src/main/java/com/uber/rss/messages/StageCorruptionStateItem.java`
#### Snippet
```java

import com.uber.rss.common.AppShuffleId;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.util.ByteBufUtils;
import io.netty.buffer.ByteBuf;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.messages.MessageConstants;`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import com.uber.rss.exceptions.RssServerDownException;
import com.uber.rss.messages.GetBusyStatusResponse;
import com.uber.rss.messages.MessageConstants;
import com.uber.rss.metrics.M3Stats;
import com.uber.rss.util.NetworkUtils;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Proxy;`
in `src/main/java/com/uber/rss/metadata/ZooKeeperFaultTolerantServiceRegistry.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Proxy;`
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLDecoder;
import java.net.URLEncoder;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedInputStream;`
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
```

### UNUSED_IMPORT
Unused import `import io.airlift.compress.zstd.ZstdDecompressor;`
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
import com.uber.rss.util.ByteBufUtils;
import com.uber.rss.util.StreamUtils;
import io.airlift.compress.zstd.ZstdDecompressor;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
```

### UNUSED_IMPORT
Unused import `import java.nio.ByteBuffer;`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.FileOutputStream;`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
```

### UNUSED_IMPORT
Unused import `import java.net.ServerSocket;`
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java

import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssException;`
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
package com.uber.rss.util;

import com.uber.rss.exceptions.RssException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssNetworkException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssNetworkException;`
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
import com.uber.rss.exceptions.RssException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssNetworkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/rss/StreamServer.java`
#### Snippet
```java

        if (serverConfig.getStorage() instanceof ShuffleFileStorage) {
            CompletableFuture.runAsync(() -> {
                FileUtils.cleanupOldFiles(serverConfig.getRootDirectory(), System.currentTimeMillis()
                        - serverConfig.getAppFileRetentionMillis());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
      // succeeded, log exceptions as warning
      if (exceptions != null) {
        exceptions.forEach(t -> {
          logger.warn(t.logMsg, t.exception);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
            if (numReplicas > 1) {
                List<ServerReplicationGroup> serverReplicationGroups = ServerReplicationGroupUtil.createReplicationGroups(serverDetails, numReplicas);
                serverReplicationGroups.forEach(t -> {
                    logger.info(String.format(String.format("Server replication group: %s", t)));
                });
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reporters` are queried, but never updated
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
    private static final Gauge numM3Scopes;
    
    private static final ConcurrentLinkedQueue<StatsReporter> reporters = new ConcurrentLinkedQueue<>();

    private static final ExceptionMetricGroupContainer exceptionMetricGroupContainer;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `zk` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java

    private final String servers;
    private CuratorFramework zk;

    public static ServiceRegistry createTimingInstance(String zkServers, int timeoutMillis, int maxRetries) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `closed` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/execution/ShufflePartitionWriter.java`
#### Snippet
```java
    
    private final ShuffleOutputStream[] outputStreams;
    private boolean closed = true;

    // dirty means having unflushed data
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `fileStartIndex` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  private final Map<Integer, Map<String, Long>> finalizedFiles = new HashMap<>();

  private int fileStartIndex;

  private int numPartitions;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastActiveTime` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  private class ClientAndState {
    final PooledShuffleDataSyncWriteClient client;
    long lastActiveTime = 0;

    public ClientAndState(PooledShuffleDataSyncWriteClient client) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `nextClientIndex` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/clients/MultiServerSocketReadClient.java`
#### Snippet
```java
  private final List<ServerReplicationGroup> servers;

  private int nextClientIndex = 0;
  private long shuffleReadBytesOfFinishedClients = 0;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentClient` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/clients/MultiServerSocketReadClient.java`
#### Snippet
```java
  private long shuffleReadBytesOfFinishedClients = 0;

  private ReplicatedReadClient currentClient;

  public MultiServerSocketReadClient(Collection<ServerReplicationGroup> servers,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentFileCreateTime` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  private String currentFilePath;
  private FileOutputStream currentFileStream;
  private long currentFileCreateTime = 0;

  private boolean closed = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `servers` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private ScheduledMetricCollector scheduledMetricCollector;
    
    private List<StreamServer> servers = new ArrayList<>();

    // store servers to shut down, this is to simulate failed servers during shuffle write/read, when there are shuffle replicas.
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `src/main/java/com/uber/rss/clients/BusyStatusSocketClient.java`
#### Snippet
```java

  @Override
  public void close() {
    super.close();
  }
```

### EmptyMethod
Method only calls its super
in `src/main/java/com/uber/rss/clients/HeartbeatSocketClient.java`
#### Snippet
```java

  @Override
  public void close() {
    super.close();
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/PooledShuffleDataSyncWriteClient.java`
#### Snippet
```java
  private ConnectUploadResponse connectUploadResponse;

  private volatile boolean reusable = false;

  public PooledShuffleDataSyncWriteClient(ShuffleDataSyncWriteClient delegate, PooledWriteClientFactory writeClientFactory) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
    
    private static final Scope defaultScope;
    private static boolean defaultScopeClosed = false;
    private static Object defaultScopeClosedLock = new Object();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
  private final List<String> files;

  private int nextFileIndex = 0;

  private String currentFile;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java

  private final List<BaseMessage> messages = new ArrayList<>();
  private int nextMessageIndex = 0;

  public LocalFileStateStoreIterator(Collection<String> files) {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `src/main/java/com/uber/rss/storage/ShuffleFileOutputStream.java`
#### Snippet
```java
    private final String filePath;
    private OutputStream outputStream;
    private long initialFileSize = 0L;
    private CountedOutputStream internalCountedOutputStream;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/execution/ShufflePartitionWriter.java`
#### Snippet
```java

    // dirty means having unflushed data
    private boolean isDirty = false;

    private final ConcurrentHashMap<String, Long> streamPersistedBytesSnapshots = new ConcurrentHashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  private final TaskAttemptCollection taskAttempts = new TaskAttemptCollection();

  private boolean stateSaved = false;

  /***
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/clients/ShuffleDataSocketReadClient.java`
#### Snippet
```java
  private long shuffleReadBytes;

  private ReadClientMetrics metrics = null;

  protected ShuffleDataSocketReadClient(String host, int port, int timeoutMillis, String user, AppShufflePartitionId appShufflePartitionId, Collection<Long> fetchTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
    private long shuffleReadBytes;

    private ReadClientMetrics metrics = null;

    protected RecordSocketReadClient(String host, int port, int timeoutMillis, String user, AppShufflePartitionId appShufflePartitionId, Collection<Long> fetchTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/util/CountedOutputStream.java`
#### Snippet
```java

public class CountedOutputStream extends OutputStream {
    private long writtenBytes = 0;

    private OutputStream underlyingStream;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/handlers/ChannelIdleCheck.java`
#### Snippet
```java

  private volatile long lastReadTime = System.currentTimeMillis();
  private volatile boolean canceled = false;

  public ChannelIdleCheck(ChannelHandlerContext ctx, long idleTimeoutMillis, Counter closedIdleChannelCounterMetric) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/LazyWriteClient.java`
#### Snippet
```java
    private final long maxWaitMillis;

    private boolean connectedToWriteClient = false;

    private static final Logger logger =
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/clients/ServerBusyRetriableWriteClient.java`
#### Snippet
```java
    private SingleServerWriteClient delegate;

    private WriteClientMetrics metrics = null;

    public ServerBusyRetriableWriteClient(Callable<SingleServerWriteClient> creator, long maxTryingMillis, String user, String appId, String appAttempt) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  public static final String DEFAULT_DATA_CENTER = "dataCenter1";

  private boolean useEpoll = false;

  private int shufflePort = 19190;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private String zooKeeperServersBackup = null;

  private String registryServer = null;

  private int maxConnections = UploadChannelManager.DEFAULT_MAX_CONNECTIONS;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private long appMaxWriteBytes = ShuffleExecutor.DEFAULT_APP_MAX_WRITE_BYTES;

  private String keytab = null;

  private String principal = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private String principal = null;

  private Configuration hadoopConfig = null;

  private long stateCommitIntervalMillis = 60000;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private String zooKeeperServers = ZooKeeperServiceRegistry.getDefaultServers();

  private String zooKeeperServersBackup = null;

  private String registryServer = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private String keytab = null;

  private String principal = null;

  private Configuration hadoopConfig = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/BlockingQueueReadClient.java`
#### Snippet
```java
    private final long maxBlockingMillis;

    private volatile boolean stopped = false;

    public BlockingQueueReadClient(BlockingSingleServerReadClient delegate, int queueSize, long maxBlockingMillis) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  private class ClientAndState {
    final PooledShuffleDataSyncWriteClient client;
    long lastActiveTime = 0;

    public ClientAndState(PooledShuffleDataSyncWriteClient client) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    private final long idleTimeoutMillis;

    private volatile boolean canceled = false;

    public IdleCheck(long idleTimeoutMillis) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

    final int MaxClients = 5000;
    int numCreatedClients = 0;

    final List<ClientAndState> idleClients = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/MultiServerSocketReadClient.java`
#### Snippet
```java

  private int nextClientIndex = 0;
  private long shuffleReadBytesOfFinishedClients = 0;

  private ReplicatedReadClient currentClient;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/MultiServerSocketReadClient.java`
#### Snippet
```java
  private final List<ServerReplicationGroup> servers;

  private int nextClientIndex = 0;
  private long shuffleReadBytesOfFinishedClients = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java

    private String connectionInfo = "";
    private AppShufflePartitionId appShufflePartitionId = null;
    private List<Long> fetchTaskAttemptIds = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
    
    // Expected total records in the files
    private long expectedTotalRecords = 0;

    private Map<Integer, Long> expectedTotalRecordsForEachPartition;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
    private int maxValueLen = 10000;

    private Runnable actionToSimulateBadServer = null;

    public void setRssServers(List<ServerDetail> rssServers, int numReplicas) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/util/MovingAverageCalculator.java`
#### Snippet
```java
    private final AtomicLongArray values;
    private AtomicInteger index = new AtomicInteger(0);
    private volatile boolean fullyFilled = false;

    public MovingAverageCalculator(int capacity) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java

    private String connectionInfo = "";
    private String appId = null;
    private String appAttempt = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private String appAttempt = null;

    private StartUploadMessage startUploadMessage = null;

    private ChannelIdleCheck idleCheck;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private String connectionInfo = "";
    private String appId = null;
    private String appAttempt = null;

    private StartUploadMessage startUploadMessage = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
  private Set<Long> commitTaskAttemptIds;

  private boolean downloadStarted = false;
  private long dataLength = -1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
  private long dataLength = -1;

  private int totalReadDataBlocks = 0;
  private FixedLengthInputStream fixedLengthInputStream;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/clients/NotifyClient.java`
#### Snippet
```java
  private final String user;

  private NotifyClientMetrics metrics = null;

  public NotifyClient(String host, int port, int timeoutMillis, String user) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java

  private long startTime = System.currentTimeMillis();
  private long numIncomingBytes = 0;

  private String user = "uninitialized";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java

  private State state = State.READ_MAGIC_BYTE_AND_VERSION;
  private int requiredBytes = 0;
  private final ByteBuf shuffleDataBuffer;
  private int controlMessageType = INVALID_CONTROL_MESSAGE_TYPE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java

  private int currentClientIndex = 0;
  private boolean endOfRead = false;

  private long shuffleReadBytes = -1;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
  private final boolean checkDataConsistency;

  private int currentClientIndex = 0;
  private boolean endOfRead = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
    protected TState state;

    protected long totalBytes = 0;

    protected int currentReadCursor = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
    protected long totalBytes = 0;

    protected int currentReadCursor = 0;

    protected long totalReadBytes = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
    protected int currentReadCursor = 0;

    protected long totalReadBytes = 0;

    protected StreamDecoderBase(TState initialState) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSyncWriteClient.java`
#### Snippet
```java
  private long startUploadShuffleByteSnapshot = 0;

  private WriteClientMetrics metrics = null;

  public DataBlockSyncWriteClient(String host, int port, int timeoutMillis, String user, String appId, String appAttempt) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSyncWriteClient.java`
#### Snippet
```java

  private long totalWriteBytes = 0;
  private long startUploadShuffleByteSnapshot = 0;

  private WriteClientMetrics metrics = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSyncWriteClient.java`
#### Snippet
```java
  private final String appAttempt;

  private long totalWriteBytes = 0;
  private long startUploadShuffleByteSnapshot = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
    private final CopyOnWriteArrayList<Throwable> exceptions = new CopyOnWriteArrayList<>();

    private boolean threadStarted = false;
    private AppTaskAttemptId currentAppTaskAttemptId;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java

    private static class Record {
        private boolean isStopMarker = false;

        private int partition;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  private long currentFileCreateTime = 0;

  private boolean closed = false;

  public LocalFileStateStore(String rootDir) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  private String currentFilePath;
  private FileOutputStream currentFileStream;
  private long currentFileCreateTime = 0;

  private boolean closed = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private List<ServerDetail> serverDetails = new ArrayList<>();

    private boolean useEpoll = false;
    
    private String workDir = "/tmp/rss";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    // If this value is not zero, map tasks will sleep that amount of milliseconds after uploading
    // each record.
    private int mapSlowness = 0;
    
    // How long the client should wait before timeout
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

    // Whether to use connection pool
    private boolean useConnectionPool = false;

    // Total number of bytes for all map tasks to generate
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    // This tool generates a range of map tasks to simulate uploading data.
    // This field specifies the lower bound (inclusive) of the map id.
    private int startMapId = 0;

    // This tool generates a range of map tasks to simulate uploading data.
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `src/main/java/com/uber/rss/clients/ShuffleDataSocketReadClient.java`
#### Snippet
```java
 * Shuffle read client to download data from shuffle server.
 */
public class ShuffleDataSocketReadClient implements AutoCloseable, SingleServerReadClient {
  private static final Logger logger =
      LoggerFactory.getLogger(ShuffleDataSocketReadClient.class);
```

### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
 * Shuffle read client to download data from shuffle server.
 */
public class RecordSocketReadClient implements AutoCloseable, SingleServerReadClient {
    private static final Logger logger =
            LoggerFactory.getLogger(ShuffleDataSocketReadClient.class);
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `socketException`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
                    break;
                } catch (UnknownHostException | NoRouteToHostException | ConnectException socketException) {
                    if (socketException instanceof ConnectException && !ExceptionUtils.isTimeoutException(socketException)) {
                        // not timeout exception, e.g. may be connection refused, no need to retry and throw out exception
                        throw socketException;
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
                    object = deserializationStream.readObject(classTag);
                } catch (Throwable ex) {
                    if (ex instanceof EOFException) {
                        break;
                    } else {
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
          taskAttemptIdInfo = String.format("no task attempt committed");
        } else {
          List<Long> taskAttemptIds = mapTaskCommitStatus.getTaskAttemptIds().values().stream().collect(Collectors.toList());
          Collections.sort(taskAttemptIds);
          taskAttemptIdInfo = String.format("committed task ids: %s, fetching tasks: %s",
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `message` of exception class
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java

public class RssMaxConnectionsException extends Exception {
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;
```

### NonFinalFieldOfException
Non-final field `maxConnections` of exception class
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;

    public RssMaxConnectionsException(int currentConnections, int maxConnections, String message) {
```

### NonFinalFieldOfException
Non-final field `currentConnections` of exception class
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java
public class RssMaxConnectionsException extends Exception {
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  private void closeLongIdleClients() {
    List<ClientPool> poolsToCheck = new ArrayList<>();
    synchronized (this) {
      poolsToCheck.addAll(pools.values());
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

  public int getNumIdleClients() {
    synchronized (this) {
      return pools.values().stream().mapToInt(t->t.idleClients.size()).sum();
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

    public void returnClientToPool(PooledShuffleDataSyncWriteClient client) {
      synchronized (this) {
        for (ClientAndState entry: idleClients) {
          if (entry.client.getClientId() == client.getClientId()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    idleCheck.cancel();

    synchronized (this) {
      pools.values().stream().forEach(pool -> pool.idleClients.forEach(clientAndState -> {
        try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

  public int getNumCreatedClients() {
    synchronized (this) {
      return pools.values().stream().mapToInt(t->t.numCreatedClients).sum();
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    public ShuffleDataSyncWriteClient getOrCreateClient(int timeoutMillis, boolean finishUploadAck, ShuffleWriteConfig shuffleWriteConfig) {
      ClientAndState clientAndState;
      synchronized (this) {
        if (!idleClients.isEmpty()) {
          clientAndState = idleClients.remove(0);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

    public PooledShuffleDataSyncWriteClient getConnectedClient() {
      synchronized (this) {
        if (lastActiveTime > 0) {
          return client;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

  private ClientPool getPool(ClientKey clientKey) {
    synchronized (this) {
      return pools.computeIfAbsent(clientKey, t->new ClientPool(clientKey));
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
      List<ClientAndState> closeCandidates = new ArrayList<>();

      synchronized (this) {
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < idleClients.size();) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

    public void closeClient() {
      synchronized (this) {
        try {
          client.closeWithoutReuse();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  private void createNewFileIfNecessary() {
    synchronized (this) {
      if (closed) {
        logger.info(String.format("State store already closed, do not create new file, %s", this));
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  public void commit() {
    synchronized (this) {
      try {
        currentFileStream.flush();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  @Override
  public String toString() {
    synchronized (this) {
      return "StateStore{" +
          "currentFilePath='" + currentFilePath + '\'' +
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
    byte[] messageTypeBytes = ByteBufUtils.convertIntToBytes(item.getMessageType());
    byte[] lengthBytes = ByteBufUtils.convertIntToBytes(bytes.length);
    synchronized (this) {
      try {
        currentFileStream.write(messageTypeBytes);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
  public void close() {
    try {
      synchronized (this) {
        closed = true;
        closeFileNoLock();
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
        byte[] dataBlockBytes = StreamUtils.readBytes(inputStream, dataBlockLength);
        dataBlockStreamData.writeBytes(dataBlockBytes);
        System.out.println(String.format("Got data block from task attempt %s, %s bytes", taskAttemptId, dataBlockLength));
      }
    } catch (Throwable e) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    public void stop(boolean wait) {
        // Logging mechanism (e.g. log4j, kafka) may not work in shutdown hook, thus use println() to log.
        System.out.println(String.format("%s Stop shuffle executor during shutdown", System.currentTimeMillis()));

        if (wait) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        stageStates.values().parallelStream().forEach(stageState -> saveShuffleStage(stageState));

        System.out.println(String.format("%s Close state store during shutdown", System.currentTimeMillis()));

        stateStore.close();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        stateStore.close();

        System.out.println(String.format("%s Stopped shuffle executor during shutdown", System.currentTimeMillis()));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
        MapTaskCommitStatus mapTaskCommitStatus = getDataAvailabilityRetryResult.getMapTaskCommitStatus();
        if (mapTaskCommitStatus.getTaskAttemptIds().isEmpty()) {
          taskAttemptIdInfo = String.format("no task attempt committed");
        } else {
          List<Long> taskAttemptIds = mapTaskCommitStatus.getTaskAttemptIds().values().stream().collect(Collectors.toList());
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
    int filesPerDir = 1000;
    int dirCount = (int)Math.ceil(((double)fileCount)/filesPerDir);
    System.out.println(String.format("Creating %s files with %s directories inside %s", fileCount, dirCount, rootDir));

    List<FileOutputStream> fileStreams = new ArrayList<>();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
        dirPath.toFile().mkdirs();
        dirPath.toFile().deleteOnExit();
        System.out.println(String.format("Creating files under %s, current file descriptors: %s", dirPath.toAbsolutePath(), SystemUtils.getFileDescriptorCount()));
        for (int j = 0; j < filesPerDir; j++) {
          if (fileStreams.size() >= fileCount) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
      }
    } finally {
      System.out.println(String.format("Created %s files, current file descriptors: %s", fileStreams.size(), SystemUtils.getFileDescriptorCount()));
      fileStreams.forEach(t-> {
        try {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/rss/util/StreamUtils.java`
#### Snippet
```java
    public static byte[] readBytes(InputStream stream, int numBytes) {
        if (numBytes == 0) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
    public static byte[] readBytes(InputStream stream, int numBytes) {
        if (numBytes == 0) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
            }

            writeClient.writeDataBlock(partitionId, ByteBuffer.wrap(new byte[0]));

            totalShuffleWrittenBytes.addAndGet(SHUFFLE_RECORD_EXTRA_BYTES);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

        testValues.add(null);
        testValues.add(new byte[0]);
        testValues.add("".getBytes(StandardCharsets.UTF_8));

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `initialFileSize` initializer `0L` is redundant
in `src/main/java/com/uber/rss/storage/ShuffleFileOutputStream.java`
#### Snippet
```java
    private final String filePath;
    private OutputStream outputStream;
    private long initialFileSize = 0L;
    private CountedOutputStream internalCountedOutputStream;

```

### UnusedAssignment
Variable `bytes` initializer `null` is redundant
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java
    private ServerDetail getServerInfo(String path, String node) {
        String nodePath = String.format("%s/%s", path, node);
        byte[] bytes = null;
        try {
            bytes = zk.getData().forPath(nodePath);
```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/ShuffleDataSocketReadClient.java`
#### Snippet
```java
  private long shuffleReadBytes;

  private ReadClientMetrics metrics = null;

  protected ShuffleDataSocketReadClient(String host, int port, int timeoutMillis, String user, AppShufflePartitionId appShufflePartitionId, Collection<Long> fetchTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
    private long shuffleReadBytes;

    private ReadClientMetrics metrics = null;

    protected RecordSocketReadClient(String host, int port, int timeoutMillis, String user, AppShufflePartitionId appShufflePartitionId, Collection<Long> fetchTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
```

### UnusedAssignment
Variable `connectionInfo` initializer `""` is redundant
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    protected OutputStream outputStream;

    protected String connectionInfo = "";

    private final long internalClientId = internalClientIdSeed.getAndIncrement();
```

### UnusedAssignment
The value `args[i++]` assigned to `hadoopConfFiles` is never used
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
        serverConfig.appMaxWriteBytes = Long.parseLong(args[i++]);
      } else if (argName.equalsIgnoreCase("-hadoopConf")) {
        hadoopConfFiles = args[i++];
      } else if (argName.equalsIgnoreCase("-keytab")) {
        serverConfig.keytab = args[i++];
```

### UnusedAssignment
Variable `elapsedMinutes` initializer `0` is redundant
in `src/main/java/com/uber/rss/tools/StreamServerStressToolLongRun.java`
#### Snippet
```java
        long startTime = System.currentTimeMillis();
        long numIterations = 0;
        long elapsedMinutes = 0;
        
        Random random = new Random();
```

### UnusedAssignment
Variable `maxConnections` initializer `-1` is redundant
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;

    public RssMaxConnectionsException(int currentConnections, int maxConnections, String message) {
```

### UnusedAssignment
Variable `currentConnections` initializer `-1` is redundant
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java
public class RssMaxConnectionsException extends Exception {
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;

```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/NotifyClient.java`
#### Snippet
```java
  private final String user;

  private NotifyClientMetrics metrics = null;

  public NotifyClient(String host, int port, int timeoutMillis, String user) {
```

### UnusedAssignment
Variable `decodeResult` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        }

        TDecodeResult decodeResult = null;
        do {
            TState oldState = state;
```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSyncWriteClient.java`
#### Snippet
```java
  private long startUploadShuffleByteSnapshot = 0;

  private WriteClientMetrics metrics = null;

  public DataBlockSyncWriteClient(String host, int port, int timeoutMillis, String user, String appId, String appAttempt) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                        synchronized (serverIdsToShutdownDuringShuffleWrite) {
                            for (String serverId : serverIdsToShutdownDuringShuffleWrite) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
                                logger.info(String.format("Simulate bad server during shuffle write by shutting down server: %s", server));
                                shutdownServer(server);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                        synchronized (serverIdsToShutdownDuringShuffleRead) {
                            for (String serverId : serverIdsToShutdownDuringShuffleRead) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
                                logger.info(String.format("Simulate bad server during shuffle read by shutting down server: %s", server));
                                shutdownServer(server);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `nextItem != null` is always `true`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      // TODO messages was originally designed to read data in batches, now we do not need it anymore
      // delete it later.
      if (nextItem != null) {
        messages.add(nextItem);
      }
```

### ConstantValue
Condition `i < 2` is always `true`
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java
        // Two loops because first loop will only fail in the unlikely situation that the ephemeral node already exists
        // and needs to be deleted before trying again.
        for (int i = 0; i < 2; i++) {
            try {
                zk.create()
```

### ConstantValue
Condition `exception == null` is always `false`
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java

    if (!succeeded) {
      if (exception == null) {
        throw new RssInvalidStateException(String.format("No underlying client succeeded, but no exception as well, %s", this));
      }
```

### ConstantValue
Condition `ex instanceof EOFException` is always `false`
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
                    object = deserializationStream.readObject(classTag);
                } catch (Throwable ex) {
                    if (ex instanceof EOFException) {
                        break;
                    } else {
```

### ConstantValue
Condition `decodeResult == null` is always `true`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
                return null;
            }
        } while (decodeResult == null);

        return decodeResult;
```

## RuleId[id=IOResource]
### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
                filePaths[i] = tempFile.getAbsolutePath();

                FileOutputStream stream = new FileOutputStream(tempFile);
                fileStreams[i] = stream;

```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

    private void convertMapToString(StringBuilder sb, Map<?, ?> map) {
        map.entrySet().forEach(t->{
            sb.append(System.lineSeparator());
            sb.append(t.getKey());
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `metricCollectingIntervalSeconds` may be 'static'
in `src/main/java/com/uber/rss/metrics/ScheduledMetricCollector.java`
#### Snippet
```java
    private final MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
    
    private final int metricCollectingIntervalSeconds = 60;
    
    public ScheduledMetricCollector(ServiceRegistry serviceRegistry) {
```

### FieldMayBeStatic
Field `MaxClients` may be 'static'
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    final ClientKey clientKey;

    final int MaxClients = 5000;
    int numCreatedClients = 0;

```

### FieldMayBeStatic
Field `INTERNAL_WAKEUP_MILLIS` may be 'static'
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    public static final long DEFAULT_APP_MAX_WRITE_BYTES = 3*1024L*1024L*1024L*1024L; // 3TB

    private final int INTERNAL_WAKEUP_MILLIS = 1000;

    private final String rootDir;
```

### FieldMayBeStatic
Field `CONCURRENT_CONNS` may be 'static'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private ChannelIdleCheck idleCheck;

    final int CONCURRENT_CONNS = 1;

    public UploadChannelInboundHandler(String serverId,
```

### FieldMayBeStatic
Field `logInterval` may be 'static'
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java

    private long lastLogTime = System.currentTimeMillis();
    private final long logInterval = 30000;

    private final AtomicLong queueInsertTime = new AtomicLong();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `M3Stats` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class M3Stats {
    private static final Logger logger = LoggerFactory.getLogger(M3Stats.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RssBuildInfo` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/RssBuildInfo.java`
#### Snippet
```java
import java.util.Properties;

public class RssBuildInfo {
    public static String UnknownValue = "<unknown>";

```

### UtilityClassWithoutPrivateConstructor
Class `NetworkUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
import java.util.Map;

public class NetworkUtils {
    public static final int DEFAULT_REACHABLE_TIMEOUT = 30000;

```

### UtilityClassWithoutPrivateConstructor
Class `StreamUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/StreamUtils.java`
#### Snippet
```java
import java.io.InputStream;

public class StreamUtils {
    
    /***
```

### UtilityClassWithoutPrivateConstructor
Class `LogUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/LogUtils.java`
#### Snippet
```java
package com.uber.rss.util;

public class LogUtils {

    public static double calculateMegaBytesPerSecond(long durationMillis, long bytes) {
```

### UtilityClassWithoutPrivateConstructor
Class `NettyUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/NettyUtils.java`
#### Snippet
```java
import io.netty.channel.ChannelHandlerContext;

public class NettyUtils {
    public static String getRemoteAddressAsString(ChannelHandlerContext ctx) {
        return ctx.channel().remoteAddress().toString();
```

### UtilityClassWithoutPrivateConstructor
Class `SystemUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/SystemUtils.java`
#### Snippet
```java
import java.lang.management.OperatingSystemMXBean;

public class SystemUtils {

    public static long getFileDescriptorCount() {
```

### UtilityClassWithoutPrivateConstructor
Class `ClientConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/clients/ClientConstants.java`
#### Snippet
```java
package com.uber.rss.clients;

public class ClientConstants {
    public static final long DEFAULT_CONNECTION_IDLE_TIMEOUT_MILLIS = 3 * 60 * 1000;
}
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceRegistryUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ServiceRegistryUtils {
    private static final Logger logger = LoggerFactory.getLogger(ServiceRegistryUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ServerReplicationGroupUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
import java.util.List;

public class ServerReplicationGroupUtil {
  private static final Logger logger = LoggerFactory.getLogger(ServerReplicationGroupUtil.class);

```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
import java.util.List;

public class StringUtils {
    private static final int KB_SIZE = 1024;
    private static final int MB_SIZE = 1024 * 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `StreamServerStressToolWrite64GB` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/tools/StreamServerStressToolWrite64GB.java`
#### Snippet
```java
 * This tool repeatedly runs StreamServerStressTool with writing 64GB data which exceeds max integer value.
 */
public class StreamServerStressToolWrite64GB {
    private static final Logger logger = LoggerFactory.getLogger(StreamServerStressToolWrite64GB.class);

```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class FileUtils {
    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `HandlerUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/handlers/HandlerUtil.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class HandlerUtil {
    private static final Logger logger = LoggerFactory.getLogger(HandlerUtil.class);

```

### UtilityClassWithoutPrivateConstructor
Class `MonitorUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/MonitorUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class MonitorUtils {

  private static final Pattern pattern = Pattern.compile("Rss\\w*Exception");
```

### UtilityClassWithoutPrivateConstructor
Class `TestUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/tools/TestUtils.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class TestUtils {
    /**
     * Serialize a string with putting length first and then bytes.
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/ThreadUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ThreadUtils {
  private static final Logger logger =
      LoggerFactory.getLogger(ThreadUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `MessageConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/messages/MessageConstants.java`
#### Snippet
```java
package com.uber.rss.messages;

public class MessageConstants {
    public final static byte UPLOAD_UPLINK_MAGIC_BYTE = 'u';
    public final static byte DOWNLOAD_UPLINK_MAGIC_BYTE = 'd';
```

### UtilityClassWithoutPrivateConstructor
Class `SocketUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
import java.util.concurrent.Future;

public class SocketUtils {
    public static byte[] readBytes(InputStream stream, int numBytes) {
        if (numBytes == 0) {
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/JsonUtils.java`
#### Snippet
```java
import java.io.IOException;

public class JsonUtils {
    protected static ObjectMapper mapper = new ObjectMapper();

```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/ExceptionUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ExceptionUtils {
  private static final Logger logger = LoggerFactory.getLogger(ExceptionUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/HttpUtils.java`
#### Snippet
```java
import org.apache.commons.io.IOUtils;

public class HttpUtils {
    private final static MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
    
```

### UtilityClassWithoutPrivateConstructor
Class `Compression` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/common/Compression.java`
#### Snippet
```java
import java.util.zip.Checksum;

public class Compression {
    private static final Logger logger = LoggerFactory.getLogger(Compression.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ByteBufUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
// HeapByteBufUtil: https://github.com/netty/netty/blob/4.1/buffer/src/main/java/io/netty/buffer/HeapByteBufUtil.java.

public class ByteBufUtils {
    public static final byte[] convertIntToBytes(int value) {
        byte[] bytes = new byte[Integer.BYTES];
```

### UtilityClassWithoutPrivateConstructor
Class `RetryUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
import java.util.function.Supplier;

public class RetryUtils {
    private static final Logger logger = LoggerFactory.getLogger(RetryUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ShuffleFileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/rss/storage/ShuffleFileUtils.java`
#### Snippet
```java
 * Utility methods for shuffle files.
 */
public class ShuffleFileUtils {
    public static final int MAX_SPLITS = 10000;

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `bytes` might be null
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
        long taskAttemptId = ByteBufUtils.readLong(bytes, 0);
        bytes = StreamUtils.readBytes(inputStream, Integer.BYTES);
        int dataBlockLength = ByteBufUtils.readInt(bytes, 0);
        byte[] dataBlockBytes = StreamUtils.readBytes(inputStream, dataBlockLength);
        dataBlockStreamData.writeBytes(dataBlockBytes);
```

### DataFlowIssue
Dereference of `rootDirFile.listFiles()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java

        // delete empty directories
        for (File childFile: rootDirFile.listFiles()) {
            if (childFile.isDirectory()) {
                deleteDirRecursively(childFile);
```

### DataFlowIssue
Dereference of `childFiles` may produce `NullPointerException`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
    private static void deleteDirRecursively(File rootDir) {
        File[] childFiles = rootDir.listFiles();
        if (childFiles.length == 0) {
            try {
                logger.info("Deleting dir: " + rootDir);
```

### DataFlowIssue
Argument `bytes` might be null
in `src/main/java/com/uber/rss/tools/TestUtils.java`
#### Snippet
```java

        bytes = StreamUtils.readBytes(stream, len);
        return new String(bytes, StandardCharsets.UTF_8);
    }

```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        int countIntValue = (int)count;
        while (countIntValue > 0) {
            int batchSize = Math.min(countIntValue, list.peek().length - currentReadCursor);
            byteBuffer.put(list.peek(), currentReadCursor, batchSize);
            countIntValue -= batchSize;
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java

    private void checkAndAdjustReadCursor() {
        if (currentReadCursor == list.peek().length) {
            list.pop();
            currentReadCursor = 0;
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
            list.pop();
            currentReadCursor = 0;
        } else if (currentReadCursor > list.peek().length) {
            throw new RssInvalidStateException(String.format("Read cursor %s should not exceed max length %s", currentReadCursor, list.peek().length));
        }
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
            currentReadCursor = 0;
        } else if (currentReadCursor > list.peek().length) {
            throw new RssInvalidStateException(String.format("Read cursor %s should not exceed max length %s", currentReadCursor, list.peek().length));
        }
    }
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        byte value;

        if (currentReadCursor <= list.peek().length - 1) {
            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
```

### DataFlowIssue
Array access `list.peek()[currentReadCursor++]` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        if (currentReadCursor <= list.peek().length - 1) {
            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
        } else {
            list.pop();
```

### DataFlowIssue
Array access `list.peek()[currentReadCursor++]` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java

            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
        }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                        logger.info(String.format(
                            "Trying to look up RSS servers (data center: %s, cluster: %s) for %s",
                            dataCenter, cluster, serverIds.stream().collect(Collectors.joining(","))));
                        return serviceRegistry.lookupServers(dataCenter, cluster, serverIds);
                    } catch (Throwable ex) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/metadata/ZooKeeperFaultTolerantServiceRegistry.java`
#### Snippet
```java
    @Override
    public void registerServer(String dataCenter, String cluster, String serverId, String runningVersion, String hostAndPort) {
        zooKeeperServiceRegistries.stream().forEach(t->t.registerServer(dataCenter, cluster, serverId, runningVersion, hostAndPort));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

    synchronized (this) {
      pools.values().stream().forEach(pool -> pool.idleClients.forEach(clientAndState -> {
        try {
          clientAndState.closeClient();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            // Close writers in case there are still writers not closed
            removedAppShuffleStageStates.stream().forEach(t -> t.closeWriters());

            try {
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
                String str = args[i++];
                String[] strArray = str.split(":");
                List<ServerDetail> serverDetails = Arrays.asList(strArray).stream().map(t->{
                    ServerHostAndPort hostAndPort = ServerHostAndPort.fromString(t);
                    return TestUtils.getServerDetail(hostAndPort.getHost(), hostAndPort.getPort());
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
          taskAttemptIdInfo = String.format("no task attempt committed");
        } else {
          List<Long> taskAttemptIds = mapTaskCommitStatus.getTaskAttemptIds().values().stream().collect(Collectors.toList());
          Collections.sort(taskAttemptIds);
          taskAttemptIdInfo = String.format("committed task ids: %s, fetching tasks: %s",
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

    private void deleteDirectories(List<String> directories) {
        directories.stream().forEach(t -> {
            logger.info("Deleting directory: " + t);
            if (!storage.exists(t)) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

                Map<Integer, Long> expectedTotalRecordsForEachPartition = new HashMap<>();
                numPartitionRecords.entrySet().stream().forEach(t -> expectedTotalRecordsForEachPartition.put(t.getKey(), t.getValue().get()));

                StreamReadClientVerify streamReadClientVerify = new StreamReadClientVerify();
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
        }
        String result = address.getCanonicalHostName();
        if (result.toLowerCase().equals("localhost")) {
            result = address.getHostName();
        }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/metrics/NotifyServerMetricsContainer.java`
#### Snippet
```java
    public NotifyServerMetricsContainer() {
        this.applicationJobStatusMetricsContainer = new MetricGroupContainer<>(
                t->new ApplicationJobStatusMetrics(t));
        
        this.applicationMetricsContainer = new MetricGroupContainer<>(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/metrics/NotifyServerMetricsContainer.java`
#### Snippet
```java
        
        this.applicationMetricsContainer = new MetricGroupContainer<>(
                t->new ApplicationMetrics(t));
    }
    
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/metrics/MetadataClientMetricsContainer.java`
#### Snippet
```java
    public MetadataClientMetricsContainer() {
        this.metricGroupContainer = new MetricGroupContainer<>(
                t->new MetadataClientMetrics(t));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java

  private void checkDuplicateFiles(List<PartitionFilePathAndLength> result) {
    List<String> filePaths = result.stream().map(t->t.getPath()).collect(Collectors.toList());
    List<String> distinctFilePaths = filePaths.stream().distinct().collect(Collectors.toList());
    if (filePaths.size() != distinctFilePaths.size()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java

  private void checkDuplicateFiles(List<FilePathAndLength> result, int partition) {
    List<String> filePaths = result.stream().map(t->t.getPath()).collect(Collectors.toList());
    List<String> distinctFilePaths = filePaths.stream().distinct().collect(Collectors.toList());
    if (filePaths.size() != distinctFilePaths.size()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
          }
        })
            .filter(t -> t != null)
            .sorted((o1, o2) -> {
                // We wanted to keep 500 ms offset to compare
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
   */
    public static void checkServersAlive(ServiceRegistry serviceRegistry, String dataCenter, String cluster, Collection<ServerDetail> servers) {
      List<String> serverIds = servers.stream().map(t->t.getServerId()).collect(Collectors.toList());
      List<ServerDetail> latestServers;
      try {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
        latestServers = serviceRegistry.lookupServers(dataCenter, cluster, serverIds);
      } catch (Throwable ex) {
        String serversInfo = servers.stream().map(t->t.toString()).collect(Collectors.joining(", "));
        throw new RssServerDownException(String.format("Some of the servers were down: %s", serversInfo));
      }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
            return Files.walk(Paths.get(dir))
                    .filter(Files::isRegularFile)
                    .map(t->t.toString()).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RssException("Failed to list directory: " + dir, e);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
            } else if (request.uri().startsWith("/threadDump")) {
                responseMessage = Arrays.stream(org.apache.spark.util.Utils.getThreadDump())
                        .map(t->String.valueOf(t))
                        .collect(Collectors.joining(System.lineSeparator() + "----------" + System.lineSeparator()));
                status = HttpResponseStatus.OK;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
  @Override
  public synchronized void finishUpload() {
    runAllActiveClients(t->t.finishUpload());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
    shuffleWriteBytes = getShuffleWriteBytes();

    runAllActiveClients(t->t.close());

    for (int i = 0; i < clients.length; i++) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
  @Override
  public synchronized void connect() {
    runAllActiveClients(t->t.connect());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java
        closeMetrics();

        Arrays.stream(clients).parallel().forEach(t -> closeClient(t));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java
    @Override
    public void connect() {
        servers.parallelStream().forEach(t -> connectSingleClient(t));

        // use synchronize to make sure reads on clients array element getting latest value from other threads
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        }

        stageStates.values().parallelStream().forEach(stageState -> saveShuffleStage(stageState));

        System.out.println(String.format("%s Close state store during shutdown", System.currentTimeMillis()));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
            List<ExecutorShuffleStageState> removedAppShuffleStageStates = 
                    expiredAppShuffleIds.stream()
                            .map(t->stageStates.remove(t))
                            .filter(t->t!=null)
                            .collect(Collectors.toList());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
                    expiredAppShuffleIds.stream()
                            .map(t->stageStates.remove(t))
                            .filter(t->t!=null)
                            .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            // Close writers in case there are still writers not closed
            removedAppShuffleStageStates.stream().forEach(t -> t.closeWriters());

            try {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java
            }

            long dataLength = files.stream().mapToLong(t->t.getLength()).sum();
            ByteBuf dataLengthBuf = ctx.alloc().buffer(Long.BYTES);
            dataLengthBuf.writeLong(dataLength);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java

  public List<Long> getCommittedTaskIds() {
    return tasks.values().stream().filter(t->t.isCommitted()).map(t->t.getTaskAttemptId()).collect(Collectors.toList());
  }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java

  public List<Long> getCommittedTaskIds() {
    return tasks.values().stream().filter(t->t.isCommitted()).map(t->t.getTaskAttemptId()).collect(Collectors.toList());
  }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/handlers/DownloadServerHandler.java`
#### Snippet
```java
        }

        long totalFileLength = persistedBytes.stream().mapToLong(t->t.getLength()).sum();
        if (totalFileLength == 0) {
            logger.info(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
            waitThreadsExit();
        } finally {
            Arrays.stream(clients).parallel().forEach(t -> closeClient(t));
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
    @Override
    public void connect() {
        servers.parallelStream().forEach(t -> connectSingleClient(t));

        // use synchronize to make sure reads on clients array element getting latest value from other threads
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                        synchronized (serverIdsToShutdownDuringShuffleWrite) {
                            for (String serverId : serverIdsToShutdownDuringShuffleWrite) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
                                logger.info(String.format("Simulate bad server during shuffle write by shutting down server: %s", server));
                                shutdownServer(server);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
        
        // Start map task threads
        allMapThreads.forEach(t->t.start());
        
        // Wait for map tasks to finish
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                        synchronized (serverIdsToShutdownDuringShuffleRead) {
                            for (String serverId : serverIdsToShutdownDuringShuffleRead) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
                                logger.info(String.format("Simulate bad server during shuffle read by shutting down server: %s", server));
                                shutdownServer(server);
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `createScope()` during object construction
in `src/main/java/com/uber/rss/metrics/MetricGroup.java`
#### Snippet
```java
    public MetricGroup(K key) {
        this.key = key;
        this.scope = createScope(key);
    }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
    byte[] bytes = StreamUtils.readBytes(inputStream, header.getLength());
    if (bytes == null) {
      throw new RssEndOfStreamException("Failed to read data block: " + this.toString());
    }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ClientAndState` may be 'static'
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  }

  private class ClientAndState {
    final PooledShuffleDataSyncWriteClient client;
    long lastActiveTime = 0;
```

### InnerClassMayBeStatic
Inner class `DataCenterAndCluster` may be 'static'
in `src/main/java/com/uber/rss/common/ServerDetailCollection.java`
#### Snippet
```java
    }

    private class DataCenterAndCluster {
        private String dataCenter;
        private String cluster;
```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                if (totalShuffleWrittenBytesOldValue < hitPointToShutdownServers && totalShuffleWrittenBytes.get() >= hitPointToShutdownServers) {
                    synchronized (servers) {
                        synchronized (serverIdsToShutdownDuringShuffleWrite) {
                            for (String serverId : serverIdsToShutdownDuringShuffleWrite) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                streamReadClientVerify.setActionToSimulateBadServer(() -> {
                    synchronized (servers) {
                        synchronized (serverIdsToShutdownDuringShuffleRead) {
                            for (String serverId : serverIdsToShutdownDuringShuffleRead) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public MultiServerSyncWriteClient(Collection<ServerReplicationGroup> servers, int partitionFanout, int networkTimeoutMillis, long maxTryingMillis, ServerConnectionRefresher serverConnectionRefresher, boolean finishUploadAck, boolean usePooledConnection, String user, String appId, String appAttempt, ShuffleWriteConfig shuffleWriteConfig) {
        for (ServerReplicationGroup entry: servers) {
            this.servers.add(new ServerConnectionInfo(this.servers.size(), entry));
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/rss/metrics/M3DummyScope.java`
#### Snippet
```java
  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public Histogram histogram(String s, Buckets buckets) {
    return new Histogram() {
      @Override
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/rss/metrics/M3DummyScopeBuilder.java`
#### Snippet
```java
  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public ScopeBuilder defaultBuckets(Buckets defaultBuckets) {
    return this;
  }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
        final int serverCandidateCount = maxServerCount + extraServerCount;

        final Long CONCURRENT_CONNS = new Long(1);

        int retryIntervalMillis = 100;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
                Map<Long, Long> metricsMap = new HashMap<>();
                GetBusyStatusResponse getBusyStatusResponse = new GetBusyStatusResponse(metricsMap, new HashMap<>());
                getBusyStatusResponse.getMetrics().put(new Long(CONCURRENT_CONNS),
                                                            new Long (concurrentChannelsAtomicInteger.get()));
                ChannelFuture channelFuture = HandlerUtil.writeResponseMsg(ctx, MessageConstants.RESPONSE_STATUS_OK,
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
                GetBusyStatusResponse getBusyStatusResponse = new GetBusyStatusResponse(metricsMap, new HashMap<>());
                getBusyStatusResponse.getMetrics().put(new Long(CONCURRENT_CONNS),
                                                            new Long (concurrentChannelsAtomicInteger.get()));
                ChannelFuture channelFuture = HandlerUtil.writeResponseMsg(ctx, MessageConstants.RESPONSE_STATUS_OK,
                                                                            getBusyStatusResponse, true);
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `defaultScopeClosedLock`
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
    
    public static void closeDefaultScope() {
        synchronized (defaultScopeClosedLock) {
            if (defaultScopeClosed) {
                logger.info("M3 scope already closed, do not close again");
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `servers`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                long hitPointToShutdownServers = numBytes/2;
                if (totalShuffleWrittenBytesOldValue < hitPointToShutdownServers && totalShuffleWrittenBytes.get() >= hitPointToShutdownServers) {
                    synchronized (servers) {
                        synchronized (serverIdsToShutdownDuringShuffleWrite) {
                            for (String serverId : serverIdsToShutdownDuringShuffleWrite) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `servers`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

                streamReadClientVerify.setActionToSimulateBadServer(() -> {
                    synchronized (servers) {
                        synchronized (serverIdsToShutdownDuringShuffleRead) {
                            for (String serverId : serverIdsToShutdownDuringShuffleRead) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `servers`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                PooledWriteClientFactory.getInstance().shutdown();

                synchronized (servers) {
                    servers.forEach(t -> {
                        if (t != null) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
        byte[] dataBlockBytes = StreamUtils.readBytes(inputStream, dataBlockLength);
        dataBlockStreamData.writeBytes(dataBlockBytes);
        System.out.println(String.format("Got data block from task attempt %s, %s bytes", taskAttemptId, dataBlockLength));
      }
    } catch (Throwable e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    public void stop(boolean wait) {
        // Logging mechanism (e.g. log4j, kafka) may not work in shutdown hook, thus use println() to log.
        System.out.println(String.format("%s Stop shuffle executor during shutdown", System.currentTimeMillis()));

        if (wait) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        stageStates.values().parallelStream().forEach(stageState -> saveShuffleStage(stageState));

        System.out.println(String.format("%s Close state store during shutdown", System.currentTimeMillis()));

        stateStore.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        stateStore.close();

        System.out.println(String.format("%s Stopped shuffle executor during shutdown", System.currentTimeMillis()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
    int filesPerDir = 1000;
    int dirCount = (int)Math.ceil(((double)fileCount)/filesPerDir);
    System.out.println(String.format("Creating %s files with %s directories inside %s", fileCount, dirCount, rootDir));

    List<FileOutputStream> fileStreams = new ArrayList<>();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
        dirPath.toFile().mkdirs();
        dirPath.toFile().deleteOnExit();
        System.out.println(String.format("Creating files under %s, current file descriptors: %s", dirPath.toAbsolutePath(), SystemUtils.getFileDescriptorCount()));
        for (int j = 0; j < filesPerDir; j++) {
          if (fileStreams.size() >= fileCount) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
      }
    } finally {
      System.out.println(String.format("Created %s files, current file descriptors: %s", fileStreams.size(), SystemUtils.getFileDescriptorCount()));
      fileStreams.forEach(t-> {
        try {
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `record.getPayload()`
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
                        throw new RuntimeException(String.format(
                                "Read wrong value len %s after reading %s records for %s from server %s",
                                record.getPayload(), numReadPartitionRecords, appShufflePartitionId, serverReplicationGroups));
                    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
            }

            strLower = strLower.replace(",", "");

            if (!NumberUtils.isDigits(strLower)) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.uber.rss.clients` is unnecessary and can be removed
in `src/main/java/com/uber/rss/clients/RegistryClient.java`
#### Snippet
```java
 * Client connecting to registry server.
 */
public class RegistryClient extends com.uber.rss.clients.ClientBase {
  private static final Logger logger =
      LoggerFactory.getLogger(RegistryClient.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
                }
            } else if (request.uri().startsWith("/threadDump")) {
                responseMessage = Arrays.stream(org.apache.spark.util.Utils.getThreadDump())
                        .map(t->String.valueOf(t))
                        .collect(Collectors.joining(System.lineSeparator() + "----------" + System.lineSeparator()));
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.rss.util` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/rss/tools/StreamServerStressToolLongRun.java`
#### Snippet
```java
                longRun.maxNumServers = Integer.parseInt(args[i++]);
            } else if (argName.equalsIgnoreCase("-maxNumBytes")) {
                longRun.maxNumBytes = com.uber.rss.util.StringUtils.getBytesValue(args[i++]);
            } else if (argName.equalsIgnoreCase("-maxNumMaps")) {
                longRun.maxNumMaps = Integer.parseInt(args[i++]);
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.reflect` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java

    public void run(int numIterations) {
        ClassTag<HashMap<String, String>> classTag = scala.reflect.ClassTag$.MODULE$.apply(HashMap.class);

        long startTime = System.nanoTime();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.rss.clients` is unnecessary and can be removed
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
 * Shuffle read client to download data (data blocks) from shuffle server.
 */
public class DataBlockSocketReadClient extends com.uber.rss.clients.ClientBase {
  private static final Logger logger =
      LoggerFactory.getLogger(DataBlockSocketReadClient.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.rss.clients` is unnecessary and can be removed
in `src/main/java/com/uber/rss/clients/NotifyClient.java`
#### Snippet
```java
 * Client connecting to notify server.
 */
public class NotifyClient extends com.uber.rss.clients.ClientBase {
  private static final Logger logger =
      LoggerFactory.getLogger(NotifyClient.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.rss.clients` is unnecessary and can be removed
in `src/main/java/com/uber/rss/clients/DataBlockSyncWriteClient.java`
#### Snippet
```java
 * Shuffle write client to upload data (data blocks) to shuffle server.
 */
public class DataBlockSyncWriteClient extends com.uber.rss.clients.ClientBase {
  private static final Logger logger =
      LoggerFactory.getLogger(DataBlockSyncWriteClient.class);
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
            lowPriorityExecutorService.awaitTermination(3, TimeUnit.MINUTES);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } else {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
          t.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `MetricGroup()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/rss/metrics/MetricGroup.java`
#### Snippet
```java
    protected final Scope scope;

    public MetricGroup(K key) {
        this.key = key;
        this.scope = createScope(key);
```

### NonProtectedConstructorInAbstractClass
Constructor `ClientBase()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    private final long internalClientId = internalClientIdSeed.getAndIncrement();

    public ClientBase(String host, int port, int timeoutMillis) {
        this.host = host;
        this.port = port;
```

### NonProtectedConstructorInAbstractClass
Constructor `ServerResponseMessage()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/rss/messages/ServerResponseMessage.java`
#### Snippet
```java
    }

    public ServerResponseMessage(byte status) {
        this.status = status;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ServerResponseMessage()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/rss/messages/ServerResponseMessage.java`
#### Snippet
```java
    protected byte status;

    public ServerResponseMessage() {
        this.status = MessageConstants.RESPONSE_STATUS_UNSPECIFIED;
    }
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
    for (PartitionFilePathAndLength entry: finalizedFiles) {
      Map<String, Long> map = this.finalizedFiles.get(entry.getPartition());
      if (map == null) {
        map = new HashMap<>();
        this.finalizedFiles.put(entry.getPartition(), map);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/com/uber/rss/metrics/ScheduledMetricCollector.java`
#### Snippet
```java
            // this is to make sure there is only one server to do such checking to avoid servers ping each other too much
            if (nodes != null && !nodes.isEmpty()) {
                String firstServerConnectionString = nodes.stream().min(new Comparator<ServerDetail>() {
                    @Override
                    public int compare(ServerDetail o1, ServerDetail o2) {
```

### Convert2Lambda
Anonymous new Thread.UncaughtExceptionHandler() can be replaced with lambda
in `src/main/java/com/uber/rss/tools/StreamServerStressToolWrite64GB.java`
#### Snippet
```java

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
```

### Convert2Lambda
Anonymous new Thread.UncaughtExceptionHandler() can be replaced with lambda
in `src/main/java/com/uber/rss/tools/StreamServerStressToolLongRun.java`
#### Snippet
```java
    
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
    List<String> files;
    try (Stream<Path> stream = Files.list(Paths.get(stateDir))) {
      files = stream.sorted(new Comparator<Path>() {
        @Override
        public int compare(Path o1, Path o2) {
```

### Convert2Lambda
Anonymous new Thread.UncaughtExceptionHandler() can be replaced with lambda
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
            thread.setName(String.format("[Map Thread %s]", appMapId));

            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `partitionIds`
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java

        if (partitionIds == null) {
            partitionIds = IntStream.range(0, numPartitions).boxed().collect(Collectors.toList());
            logger.info(String.format("Verifying record for partitions: [%s, %s)", 0, numPartitions));
        } else {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
        fileStream = null;
        fileSize = 0;
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/uber/rss/clients/RetriableSocketReadClient.java`
#### Snippet
```java
          ThreadUtils.sleep(waitMillis);
        }
        continue;
      }
    } while (System.currentTimeMillis() <= startTime + retryOptions.getRetryMaxMillis());
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
                    }
                }
                continue;
            }
        } while (System.currentTimeMillis() <= startTime + retryMaxMillis);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `attachment`
in `src/main/java/com/uber/rss/util/AsyncSocketCompletionHandler.java`
#### Snippet
```java
        ByteBuffer byteBuffer;
        
        synchronized (attachment) {
            byteBuffer = attachment.peekBuffer();
            if (byteBuffer == null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `attachment`
in `src/main/java/com/uber/rss/util/AsyncSocketCompletionHandler.java`
#### Snippet
```java
        
        if (byteBuffer.remaining() == 0) {
            synchronized (attachment) {
                ByteBuffer removed = attachment.removeBuffer();
                if (removed != byteBuffer) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `stageState`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

    private void saveShuffleStage(ExecutorShuffleStageState stageState) {
      synchronized (stageState) {
        if (!stageState.isStateSaved()) {
          stageState.closeWriters();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `stageState`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

      ExecutorShuffleStageState stageState = getStageState(appShuffleId);
      synchronized (stageState) {
        stageState.commitMapTask(taskAttemptId);
      }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/common/ServerList.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
    if (bytes == null) {
      closeCurrentFileStream();
      return null;
    }
    int messageType = ByteBufUtils.readInt(bytes, 0);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      logger.warn(String.format("Failed to read length field in state file %s", currentFile));
      closeCurrentFileStream();
      return null;
    }
    int length = ByteBufUtils.readInt(bytes, 0);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      logger.warn(String.format("Hit invalid length field %s in state file %s", length, currentFile));
      closeCurrentFileStream();
      return null;
    }
    // read bytes after length
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      logger.warn(String.format("Failed to read payload field in state file %s", currentFile));
      closeCurrentFileStream();
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
          logger.warn(String.format("Hit unsupported message type %s in state file %s", messageType, currentFile));
          closeCurrentFileStream();
          return null;
      }
    } catch (Throwable ex) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      logger.warn(String.format("Failed to deserialize message type %s from state file: %s", messageType, currentFile), ex);
      closeCurrentFileStream();
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      return messages.get(nextMessageIndex++);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      long position = fileStream.getChannel().position();
      if (position >= fileSize) {
        return null;
      }
      byte[] bytes = StreamUtils.readBytes(fileStream, numBytes);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      if (bytes == null) {
        logger.info(String.format("Finished reading state file %s after reading %s bytes", currentFile, position));
        return null;
      } else if (bytes.length < numBytes) {
        logger.warn(String.format("Hit corrupted state file %s after reading %s bytes", currentFile, position));
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      } else if (bytes.length < numBytes) {
        logger.warn(String.format("Hit corrupted state file %s after reading %s bytes", currentFile, position));
        return null;
      } else {
        return bytes;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
    } catch (Throwable e) {
      logger.warn(String.format("Failed to read state file %s", currentFile), e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/ShuffleDataSocketReadClient.java`
#### Snippet
```java
      DataBlock dataBlock = dataBlockSocketReadClient.readDataBlock();
      if (dataBlock == null) {
        return null;
      }
      shuffleReadBytes += DataBlockHeader.NUM_BYTES + dataBlock.getPayload().length;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
            DataBlock dataBlock = dataBlockSocketReadClient.readDataBlock();
            if (dataBlock == null) {
                return null;
            }
            shuffleReadBytes += DataBlockHeader.NUM_BYTES + dataBlock.getPayload().length;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
        }
        
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                    } catch (Throwable ex) {
                        logger.warn("Failed to call ServiceRegistry.lookupServers", ex);
                        return null;
                    }
                });
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                    } catch (Throwable ex) {
                        logger.warn("Failed to call ServiceRegistry.getServers", ex);
                        return null;
                    }
                });
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
            logger.warn(String.format("Detected unreachable host %s", host), ex);
            unreachableHosts.add(host);
            return null;
          }
        })
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
    public static Long getBytesValue(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/BlockingQueueReadClient.java`
#### Snippet
```java

        if (record instanceof EofRecordKeyValuePair) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/MultiServerSocketReadClient.java`
#### Snippet
```java
      currentClient = null;
      if (nextClientIndex == servers.size()) {
        return null;
      } else if (nextClientIndex < servers.size()) {
        connectAndInitializeClient();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/MultiServerSocketReadClient.java`
#### Snippet
```java
        exceptionWrapper.setException(ex);
        closeClient(aClient);
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
        int len = readInt(stream);
        if (len < 0) {
            return null;
        }
        
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/AsyncSocketState.java`
#### Snippet
```java
    public ByteBuffer peekBuffer() {
        if (byteBuffers.isEmpty()) {
            return null;
        }
        
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
    DataBlockHeader header = readDataBlockHeader(inputStream);
    if (header == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
            fixedLengthInputStream.getLength(), fixedLengthInputStream.getRemaining()));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
          return getDataAvailabilityResponse;
        } else {
          return null;
        }
      });
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
        exceptionWrapper.setException(ex);
        logger.warn(String.format("Did not find data in server side, server may not run fast enough to get data from client or server hits some issue, %s", appShufflePartitionId), ex);
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
        int length = buf.readInt();
        if (length == -1) {
            return null;
        }
        
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
  public synchronized TaskDataBlock readDataBlock() {
    if (endOfRead) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
    while (currentClientIndex < clients.length) {
      if (endOfRead) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
        checkRecordDataConsistency();
        endOfRead = true;
        return null;
      } catch (RssInconsistentReplicaException | RssNonRecoverableException ex) {
        M3Stats.addException(ex, this.getClass().getSimpleName());
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
            }
            if (state.equals(oldState) && readableBytes() == oldReadableBytes) {
                return null;
            }
            if (readableBytes() == 0) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
            }
            if (readableBytes() == 0) {
                return null;
            }
        } while (decodeResult == null);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `scope` is redundant
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
        }

        Scope scope = scopeBuilder.reportEvery(Duration.ofSeconds(30));
        return scope;
    }
```

### UnnecessaryLocalVariable
Local variable `streamer` is redundant
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
      String path = ShuffleFileUtils.getShuffleFilePath(
          rootDir, appShuffleId, partition);
      ShufflePartitionWriter streamer
          = new ShufflePartitionWriter(appShufflePartitionId,
          path, fileStartIndex, storage, appConfig.getNumSplits());
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        try {
            R response = deserializer.apply(buf);
            return response;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `ratePerMillis` is redundant
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
        }

        double ratePerMillis = (double)totalValue.get() / (double)duration;
        return ratePerMillis;
    }
```

### UnnecessaryLocalVariable
Local variable `ratePerMillis` is redundant
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
            checkpointTime.set(currentTime);
            long prevCheckpointValue = checkpointValue.getAndSet(newValue);
            double ratePerMillis = (double)(newValue - prevCheckpointValue) / (double)(currentTime - lastCheckpointTime);
            return ratePerMillis;
        }
```

### UnnecessaryLocalVariable
Local variable `client` is redundant
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    ClientKey clientKey = new ClientKey(host, port, user, appId, appAttempt);
    ClientPool pool = getPool(clientKey);
    ShuffleDataSyncWriteClient client = pool.getOrCreateClient(timeoutMillis, finishUploadAck, shuffleWriteConfig);
    return client;
  }
```

### UnnecessaryLocalVariable
Local variable `numValueBytes` is redundant
in `src/main/java/com/uber/rss/clients/ShuffleDataSyncWriteClientBase.java`
#### Snippet
```java

  protected int getRecordSerializedSize(ByteBuffer value) {
    int numValueBytes = value == null ? 0 : value.remaining();
    return numValueBytes;
  }
```

### UnnecessaryLocalVariable
Local variable `writeClient` is redundant
in `src/main/java/com/uber/rss/clients/UnpooledWriteClientFactory.java`
#### Snippet
```java
  @Override
  public ShuffleDataSyncWriteClient getOrCreateClient(String host, int port, int timeoutMillis, boolean finishUploadAck, String user, String appId, String appAttempt, ShuffleWriteConfig shuffleWriteConfig) {
    final ShuffleDataSyncWriteClient writeClient = new PlainShuffleDataSyncWriteClient(
        host,
        port,
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        try {
            int value = buf.readInt();
            return value;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        try {
            long value = buf.readLong();
            return value;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `persistedBytes` is redundant
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

        ExecutorShuffleStageState stageState = getStageState(appShuffleId);
        List<FilePathAndLength>  persistedBytes = stageState.getPersistedBytesSnapshot(partition);
        return persistedBytes;
    }
```

### UnnecessaryLocalVariable
Local variable `targetState` is redundant
in `src/main/java/com/uber/rss/execution/TaskAttemptIdAndState.java`
#### Snippet
```java

  public void markCommitted() {
    TaskAttemptState targetState = TaskAttemptState.COMMITTED;
    state = targetState;
  }
```

### UnnecessaryLocalVariable
Local variable `getDataAvailabilityResponse` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
    GetDataAvailabilityRequest request = new GetDataAvailabilityRequest();
    writeControlMessageAndWaitResponseStatus(request);
    GetDataAvailabilityResponse getDataAvailabilityResponse = readResponseMessage(MessageConstants.MESSAGE_GetDataAvailabilityResponse, GetDataAvailabilityResponse::deserialize);
    return getDataAvailabilityResponse;
  }
```

### UnnecessaryLocalVariable
Local variable `heartbeatMessage` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
        return FinishUploadMessage.deserialize(in);
      case MessageConstants.MESSAGE_HeartbeatMessage:
        HeartbeatMessage heartbeatMessage = HeartbeatMessage.deserialize(in);
        return heartbeatMessage;
      case MessageConstants.MESSAGE_GetBusyStatusRequest:
```

### UnnecessaryLocalVariable
Local variable `getBusyStatusRequest` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
        return heartbeatMessage;
      case MessageConstants.MESSAGE_GetBusyStatusRequest:
        GetBusyStatusRequest getBusyStatusRequest = GetBusyStatusRequest.deserialize(in);
        return getBusyStatusRequest;
      case MessageConstants.MESSAGE_GetBusyStatusResponse:
```

### UnnecessaryLocalVariable
Local variable `getBusyStatusResponse` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
        return getBusyStatusRequest;
      case MessageConstants.MESSAGE_GetBusyStatusResponse:
        GetBusyStatusResponse getBusyStatusResponse = GetBusyStatusResponse.deserialize(in);
        return getBusyStatusResponse;
      case MessageConstants.MESSAGE_ConnectDownloadRequest:
```

### UnnecessaryLocalVariable
Local variable `getBusyStatusResponse` is redundant
in `src/main/java/com/uber/rss/clients/BusyStatusSocketClient.java`
#### Snippet
```java
    writeControlMessageAndWaitResponseStatus(getBusyStatusRequest);

    GetBusyStatusResponse getBusyStatusResponse = readResponseMessage(MessageConstants.MESSAGE_GetBusyStatusResponse,
                                                                        GetBusyStatusResponse::deserialize);
    return getBusyStatusResponse;
```

### UnnecessaryLocalVariable
Local variable `path` is redundant
in `src/main/java/com/uber/rss/storage/ShuffleFileUtils.java`
#### Snippet
```java
        String fileName = getShuffleFileName(
                appShuffleId.getShuffleId(), partitionId);
        String path = Paths.get(
                getAppShuffleDir(rootDir, appShuffleId.getAppId()), 
                appShuffleId.getAppAttempt(),
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            try {
                Thread.sleep(INTERNAL_WAKEUP_MILLIS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            try {
                Thread.sleep(INTERNAL_WAKEUP_MILLIS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java

        try {
          Thread.sleep(heartbeatIntervalMillis);
        } catch (Throwable e) {
          logger.info("RSS Heartbeat thread got interrupted", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                logger.warn("Interrupted when waiting in retry", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                logger.warn("Interrupted when waiting in retry", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                if (mapSlowness > 0) {
                    try {
                        Thread.sleep(mapSlowness);
                    } catch (InterruptedException e) {
                        M3Stats.addException(e, M3Stats.TAG_VALUE_STRESS_TOOL);
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java
    thread.setName("RSS_Heartbeat_" + thread.hashCode());
    thread.setDaemon(true);
    thread.start();
    logger.info("Started RSS heartbeat thread {} with interval {} millis", thread, heartbeatIntervalMillis);
  }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
        try {
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
        try {
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
                inetAddress = InetAddress.getByName(host);
```

### UnstableApiUsage
'forString(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
                inetAddress = InetAddress.getByName(host);
```

