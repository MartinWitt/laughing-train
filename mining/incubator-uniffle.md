# incubator-uniffle 
 
# Bad smells
I found 373 bad smells with 60 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 49 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 35 | false |
| ReturnNull | 29 | false |
| RedundantFieldInitialization | 28 | false |
| UnstableApiUsage | 22 | false |
| UtilityClassWithoutPrivateConstructor | 21 | true |
| ZeroLengthArrayInitialization | 17 | false |
| PublicFieldAccessedInSynchronizedContext | 17 | false |
| UnusedAssignment | 14 | false |
| UnnecessaryLocalVariable | 11 | true |
| NonProtectedConstructorInAbstractClass | 10 | true |
| CodeBlock2Expr | 8 | true |
| SynchronizeOnThis | 8 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 8 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| StringConcatenationInsideStringBufferAppend | 7 | false |
| AssignmentToMethodParameter | 7 | false |
| FinalStaticMethod | 6 | false |
| Convert2MethodRef | 6 | false |
| BusyWait | 5 | false |
| InstanceofCatchParameter | 4 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| NestedAssignment | 3 | false |
| InfiniteLoopStatement | 3 | false |
| EmptyMethod | 3 | false |
| ConstantValue | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| AnonymousHasLambdaAlternative | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| FuseStreamOperations | 2 | false |
| UnstableTypeUsedInSignature | 2 | false |
| DataFlowIssue | 2 | false |
| NestedSynchronizedStatement | 2 | false |
| StringEqualsEmptyString | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| Convert2Lambda | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| ThreadStartInConstruction | 2 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| Java8MapForEach | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| Java8MapApi | 1 | false |
| JavaReflectionInvocation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[storageBasePaths.size()\]'
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
            event.getStartPartition(),
            event.getEndPartition(),
            storageBasePaths.toArray(new String[storageBasePaths.size()]),
            getShuffleServerId(),
            hadoopConf,
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[deletePaths.size()\]'
in `server/src/main/java/org/apache/uniffle/server/storage/LocalStorageManager.java`
#### Snippet
```java
    }).collect(Collectors.toList());

    deleteHandler.delete(deletePaths.toArray(new String[deletePaths.size()]), appId, user);
  }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      return "";
    }
    return hostName.replaceAll("[\\.-]", "_");
  }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`bufferSegments.size() > 0` can be replaced with '!bufferSegments.isEmpty()'
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java
        boolean conditionOfDiscontinuousBlocks =
            lastExpectedBlockIndex != -1
                && bufferSegments.size() > 0
                && expectTaskIds.contains(taskAttemptId)
                && index - lastExpectedBlockIndex != 1;
```

### SizeReplaceableByIsEmpty
`tags.size() == 0` can be replaced with 'tags.isEmpty()'
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append(Constants.SHUFFLE_SERVER_VERSION);
    if (tags == null || tags.size() == 0) {
      return sb.toString();
    }
```

### SizeReplaceableByIsEmpty
`blocks.size() == 0` can be replaced with 'blocks.isEmpty()'
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java

  private void updateCommittedBlockIds(String appId, int shuffleId, List<ShufflePartitionedBlock> blocks) {
    if (blocks == null || blocks.size() == 0) {
      return;
    }
```

### SizeReplaceableByIsEmpty
`remoteStorageConf.size() > 0` can be replaced with '!remoteStorageConf.isEmpty()'
in `server/src/main/java/org/apache/uniffle/server/storage/HdfsStorageManager.java`
#### Snippet
```java
      Map<String, String> remoteStorageConf = remoteStorageInfo.getConfItems();
      Configuration remoteStorageHadoopConf = new Configuration(hadoopConf);
      if (remoteStorageConf != null && remoteStorageConf.size() > 0) {
        for (Map.Entry<String, String> entry : remoteStorageConf.entrySet()) {
          remoteStorageHadoopConf.setStrings(entry.getKey(), entry.getValue());
```

### SizeReplaceableByIsEmpty
`blocks.size() == 0` can be replaced with 'blocks.isEmpty()'
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java

  private ShufflePartitionedBlock[] toPartitionedBlock(List<ShuffleBlock> blocks) {
    if (blocks == null || blocks.size() == 0) {
      return new ShufflePartitionedBlock[]{};
    }
```

### SizeReplaceableByIsEmpty
`blocks.size() > 0` can be replaced with '!blocks.isEmpty()'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
    }
    // try to read from cached blocks which is not in flush queue
    if (blocks.size() > 0 && offset < readBufferSize) {
      if (nextBlockId == Constants.INVALID_BLOCK_ID) {
        updateSegmentsWithoutBlockId(offset, blocks, readBufferSize, bufferSegments, resultBlocks, expectedTaskIds);
```

### SizeReplaceableByIsEmpty
`blocks.size() > 0` can be replaced with '!blocks.isEmpty()'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      }
    }
    if ((!inFlushBlockMap.isEmpty() || blocks.size() > 0) && offset == 0 && !hasLastBlockId) {
      // can't find lastBlockId, it should be flushed
      // but there still has data in memory
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    if ((isHugePartition || this.bufferFlushEnabled) && buffer.getSize() > this.bufferFlushThreshold) {
      flushBuffer(buffer, appId, shuffleId, startPartition, endPartition, isHugePartition);
      return;
    }
  }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
  }

  public static final void copyByteBuf(ByteBuf from, ByteBuf to) {
    to.writeInt(from.readableBytes());
    to.writeBytes(from);
```

### FinalStaticMethod
'static' method declared `final`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
  }

  public static final ByteBuf readSlice(ByteBuf from) {
    int length = from.readInt();
    return from.retain().readSlice(length);
```

### FinalStaticMethod
'static' method declared `final`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
  }

  public static final byte[] readByteArray(ByteBuf byteBuf) {
    int length = byteBuf.readInt();
    byte[] data = new byte[length];
```

### FinalStaticMethod
'static' method declared `final`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
  }

  public static final String readLengthAndString(ByteBuf buf) {
    int length = buf.readInt();
    if (length == -1) {
```

### FinalStaticMethod
'static' method declared `final`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
  }

  public static final byte[] readBytes(ByteBuf buf) {
    byte[] bytes = new byte[buf.readableBytes()];
    buf.readBytes(bytes);
```

### FinalStaticMethod
'static' method declared `final`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
  }

  public static final void writeLengthAndString(ByteBuf buf, String str) {
    if (str == null) {
      buf.writeInt(-1);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
        + "], eventNumInFlush[" + eventNumInFlush
        + "], timestamp[" + timestamp
        + "], tags" + tags.toString() + ""
        + ", healthy[" + isHealthy
        + ", status[" + status
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/QuotaManager.java`
#### Snippet
```java
  }

  public void registerApplicationInfo(String appId, Map<String, Long> appAndTime) {
    long currentTimeMillis = System.currentTimeMillis();
    String[] appIdAndUuid = appId.split("_");
```

### BoundedWildcard
Can generalize to `? super Long`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/QuotaManager.java`
#### Snippet
```java
  }

  public void registerApplicationInfo(String appId, Map<String, Long> appAndTime) {
    long currentTimeMillis = System.currentTimeMillis();
    String[] appIdAndUuid = appId.split("_");
```

### BoundedWildcard
Can generalize to `? extends Response`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/BaseServlet.java`
#### Snippet
```java

  private Response handlerRequest(
      Callable<Response> function) {
    Response response;
    try {
```

### BoundedWildcard
Can generalize to `? extends ServerNode`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/host/MustDiffHostAssignmentStrategy.java`
#### Snippet
```java
public class MustDiffHostAssignmentStrategy implements HostAssignmentStrategy {
  @Override
  public List<ServerNode> assign(List<ServerNode> allNodes, int expectNum) {
    List<ServerNode> candidatesNodes = new ArrayList<>();
    Set<String> hostIpCandidate = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends ServerNode`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/partition/RoundSelectPartitionStrategy.java`
#### Snippet
```java
  public SortedMap<PartitionRange, List<ServerNode>> assign(
      int totalPartitionNum, int partitionNumPerRange, int replica,
      List<ServerNode> candidatesNodes, int estimateTaskConcurrency) {
    SortedMap<PartitionRange, List<ServerNode>> assignments = new TreeMap<>();
    int idx = 0;
```

### BoundedWildcard
Can generalize to `? extends ServerNode`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/partition/ContinuousSelectPartitionStrategy.java`
#### Snippet
```java
  public SortedMap<PartitionRange, List<ServerNode>> assign(
      int totalPartitionNum, int partitionNumPerRange, int replica,
      List<ServerNode> candidatesNodes, int estimateTaskConcurrency) {
    SortedMap<PartitionRange, List<ServerNode>> assignments = new TreeMap<>();
    int serverNum = candidatesNodes.size();
```

### BoundedWildcard
Can generalize to `? super String`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/LowestIOSampleCostSelectStorageStrategy.java`
#### Snippet
```java
  public LowestIOSampleCostSelectStorageStrategy(
      Map<String, RankValue> remoteStoragePathRankValue,
      Map<String, RemoteStorageInfo> appIdToRemoteStorageInfo,
      Map<String, RemoteStorageInfo> availableRemoteStorageInfo,
      CoordinatorConf conf) {
```

### BoundedWildcard
Can generalize to `? extends RemoteStorageInfo`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/LowestIOSampleCostSelectStorageStrategy.java`
#### Snippet
```java
      Map<String, RankValue> remoteStoragePathRankValue,
      Map<String, RemoteStorageInfo> appIdToRemoteStorageInfo,
      Map<String, RemoteStorageInfo> availableRemoteStorageInfo,
      CoordinatorConf conf) {
    super(remoteStoragePathRankValue, conf);
```

### BoundedWildcard
Can generalize to `? super String`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
  public AppBalanceSelectStorageStrategy(
      Map<String, RankValue> remoteStoragePathRankValue,
      Map<String, RemoteStorageInfo> appIdToRemoteStorageInfo,
      Map<String, RemoteStorageInfo> availableRemoteStorageInfo,
      CoordinatorConf conf) {
```

### BoundedWildcard
Can generalize to `? extends RemoteStorageInfo`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
      Map<String, RankValue> remoteStoragePathRankValue,
      Map<String, RemoteStorageInfo> appIdToRemoteStorageInfo,
      Map<String, RemoteStorageInfo> availableRemoteStorageInfo,
      CoordinatorConf conf) {
    super(remoteStoragePathRankValue, conf);
```

### BoundedWildcard
Can generalize to `? extends Collector.MetricFamilySamples`
in `common/src/main/java/org/apache/uniffle/common/web/CommonMetricsServlet.java`
#### Snippet
```java
  }

  public void toJson(Writer writer, Enumeration<Collector.MetricFamilySamples> mfs) throws IOException {

    List<Collector.MetricFamilySamples.Sample> metrics = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends Pair`>
in `common/src/main/java/org/apache/uniffle/common/rpc/GrpcServer.java`
#### Snippet
```java
  protected GrpcServer(
      RssBaseConf conf,
      List<Pair<BindableService, List<ServerInterceptor>>> servicesWithInterceptors,
      GRPCMetrics grpcMetrics) {
    this.rssConf = conf;
```

### BoundedWildcard
Can generalize to `? super E`
in `common/src/main/java/org/apache/uniffle/common/config/ConfigOptions.java`
#### Snippet
```java
    }

    public ListConfigOptionBuilder<E> checkValue(Function<E, Boolean> checkValueFunc, String errMsg) {
      final Function<Object, List<E>> listConverFunc = asListConverter;
      Function<Object, List<E>> newConverter = (v) -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `common/src/main/java/org/apache/uniffle/common/config/ConfigOptions.java`
#### Snippet
```java

    // todo: errorMsg shouldn't contain key
    public TypedConfigOptionBuilder<T> checkValue(Function<T, Boolean> checkValue, String errMsg) {
      Function<Object, T> newConverter = (v) -> {
        T newValue = this.converter.apply(v);
```

### BoundedWildcard
Can generalize to `? extends FileBasedShuffleSegment`
in `storage/src/main/java/org/apache/uniffle/storage/util/ShuffleStorageUtils.java`
#### Snippet
```java

  public static List<DataFileSegment> mergeSegments(
      String path, List<FileBasedShuffleSegment> segments, int readBufferSize) {
    List<DataFileSegment> dataFileSegments = Lists.newArrayList();
    if (segments != null && !segments.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends ClientReadHandler`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/MultiReplicaClientReadHandler.java`
#### Snippet
```java

  public MultiReplicaClientReadHandler(
      List<ClientReadHandler> handlers,
      List<ShuffleServerInfo> shuffleServerInfos,
      Roaring64NavigableMap blockIdBitmap,
```

### BoundedWildcard
Can generalize to `? extends ShuffleServerInfo`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/MultiReplicaClientReadHandler.java`
#### Snippet
```java
  public MultiReplicaClientReadHandler(
      List<ClientReadHandler> handlers,
      List<ShuffleServerInfo> shuffleServerInfos,
      Roaring64NavigableMap blockIdBitmap,
      Roaring64NavigableMap processedBlockIds) {
```

### BoundedWildcard
Can generalize to `? extends ShufflePartitionedBlock`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleWriteHandler.java`
#### Snippet
```java
  @Override
  public void write(
      List<ShufflePartitionedBlock> shuffleBlocks) throws Exception {
    final long start = System.currentTimeMillis();
    writeLock.lock();
```

### BoundedWildcard
Can generalize to `? extends ShufflePartitionedBlock`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriteHandler.java`
#### Snippet
```java
  @Override
  public synchronized void write(
      List<ShufflePartitionedBlock> shuffleBlocks) throws Exception {

    // Ignore this write, if the shuffle directory is deleted after being uploaded in multi mode
```

### BoundedWildcard
Can generalize to `? super Integer`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/PooledHdfsShuffleWriteHandler.java`
#### Snippet
```java
      LinkedBlockingDeque<ShuffleWriteHandler> queue,
      int maxConcurrency,
      Function<Integer, ShuffleWriteHandler> createWriterFunc) {
    this.queue = queue;
    this.maxConcurrency = maxConcurrency;
```

### BoundedWildcard
Can generalize to `? extends ShuffleWriteHandler`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/PooledHdfsShuffleWriteHandler.java`
#### Snippet
```java
      LinkedBlockingDeque<ShuffleWriteHandler> queue,
      int maxConcurrency,
      Function<Integer, ShuffleWriteHandler> createWriterFunc) {
    this.queue = queue;
    this.maxConcurrency = maxConcurrency;
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `client/src/main/java/org/apache/uniffle/client/util/ClientUtils.java`
#### Snippet
```java
  }

  public static boolean waitUntilDoneOrFail(List<CompletableFuture<Boolean>> futures, boolean allowFastFail) {
    int expected = futures.size();
    int failed = 0;
```

### BoundedWildcard
Can generalize to `? extends T`
in `common/src/main/java/org/apache/uniffle/common/config/RssConf.java`
#### Snippet
```java
  }

  public <T> Optional<T> getOptional(ConfigOption<T> option) {
    Optional<Object> rawValue = getRawValueFromOption(option);
    Class<?> clazz = option.getClazz();
```

### BoundedWildcard
Can generalize to `? extends ConfigOption`
in `common/src/main/java/org/apache/uniffle/common/config/RssConf.java`
#### Snippet
```java
  public boolean loadConf(
      Map<String, String> properties,
      List<ConfigOption<Object>> configOptions,
      boolean includeMissingKey) {
    if (properties == null || configOptions == null) {
```

### BoundedWildcard
Can generalize to `? super ClientReadHandlerMetric`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/ComposedClientReadHandler.java`
#### Snippet
```java
  }

  private String getMetricsInfo(String name, Function<ClientReadHandlerMetric, Long> consumed,
      Function<ClientReadHandlerMetric, Long> skipped) {
    StringBuilder sb = new StringBuilder("Client read ").append(consumed.apply(readHandlerMetric))
```

### BoundedWildcard
Can generalize to `? super ClientReadHandlerMetric`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/ComposedClientReadHandler.java`
#### Snippet
```java

  private String getMetricsInfo(String name, Function<ClientReadHandlerMetric, Long> consumed,
      Function<ClientReadHandlerMetric, Long> skipped) {
    StringBuilder sb = new StringBuilder("Client read ").append(consumed.apply(readHandlerMetric))
        .append(" ").append(name).append(" from [").append(serverInfo).append("], Consumed[");
```

### BoundedWildcard
Can generalize to `? extends ShufflePartitionedBlock`
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
  }

  private void updateCommittedBlockIds(String appId, int shuffleId, List<ShufflePartitionedBlock> blocks) {
    if (blocks == null || blocks.size() == 0) {
      return;
```

### BoundedWildcard
Can generalize to `? extends K`
in `server/src/main/java/org/apache/uniffle/server/storage/LocalStorageManager.java`
#### Snippet
```java
  }

  private <K, V> void deleteElement(Map<K, V> map, Function<K, Boolean> deleteConditionFunc) {
    map.entrySet().removeIf(entry -> deleteConditionFunc.apply(entry.getKey()));
  }
```

### BoundedWildcard
Can generalize to `? super K`
in `server/src/main/java/org/apache/uniffle/server/storage/LocalStorageManager.java`
#### Snippet
```java
  }

  private <K, V> void deleteElement(Map<K, V> map, Function<K, Boolean> deleteConditionFunc) {
    map.entrySet().removeIf(entry -> deleteConditionFunc.apply(entry.getKey()));
  }
```

### BoundedWildcard
Can generalize to `? extends PartitionRange`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
      String appId,
      int shuffleId,
      List<PartitionRange> partitionRanges,
      RemoteStorageInfo remoteStorageInfo,
      String user,
```

### BoundedWildcard
Can generalize to `? extends Set`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  // flush the buffer with required map which is <appId -> shuffleId>
  public synchronized void flush(Map<String, Set<Integer>> requiredFlush) {
    for (Map.Entry<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>>
        appIdToBuffers : bufferPool.entrySet()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  }

  private void addPickedShuffle(String key, Map<String, Set<Integer>> pickedShuffle) {
    String[] splits = key.split(Constants.KEY_SPLIT_CHAR);
    String appId = splits[0];
```

### BoundedWildcard
Can generalize to `? extends ShufflePartitionedBlock`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  private void updateSegmentsWithoutBlockId(
      int offset,
      List<ShufflePartitionedBlock> cachedBlocks,
      long readBufferSize,
      List<BufferSegment> bufferSegments,
```

### BoundedWildcard
Can generalize to `? super BufferSegment`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      List<ShufflePartitionedBlock> cachedBlocks,
      long readBufferSize,
      List<BufferSegment> bufferSegments,
      List<ShufflePartitionedBlock> readBlocks,
      Roaring64NavigableMap expectedTaskIds) {
```

### BoundedWildcard
Can generalize to `? super ShufflePartitionedBlock`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      long readBufferSize,
      List<BufferSegment> bufferSegments,
      List<ShufflePartitionedBlock> readBlocks,
      Roaring64NavigableMap expectedTaskIds) {
    int currentOffset = offset;
```

### BoundedWildcard
Can generalize to `? extends BufferSegment`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  }

  private int calculateDataLength(List<BufferSegment> bufferSegments) {
    BufferSegment bufferSegment = bufferSegments.get(bufferSegments.size() - 1);
    return bufferSegment.getOffset() + bufferSegment.getLength();
```

### BoundedWildcard
Can generalize to `? extends ShufflePartitionedBlock`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  }

  private void updateShuffleData(List<ShufflePartitionedBlock> readBlocks, byte[] data) {
    int offset = 0;
    for (ShufflePartitionedBlock block : readBlocks) {
```

### BoundedWildcard
Can generalize to `? extends ShufflePartitionedBlock`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  private boolean updateSegmentsWithBlockId(
      int offset,
      List<ShufflePartitionedBlock> cachedBlocks,
      long readBufferSize,
      long lastBlockId,
```

### BoundedWildcard
Can generalize to `? super BufferSegment`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      long readBufferSize,
      long lastBlockId,
      List<BufferSegment> bufferSegments,
      List<ShufflePartitionedBlock> readBlocks,
      Roaring64NavigableMap expectedTaskIds) {
```

### BoundedWildcard
Can generalize to `? super ShufflePartitionedBlock`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      long lastBlockId,
      List<BufferSegment> bufferSegments,
      List<ShufflePartitionedBlock> readBlocks,
      Roaring64NavigableMap expectedTaskIds) {
    int currentOffset = offset;
```

### BoundedWildcard
Can generalize to `? extends ShuffleServerInfo`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   */
  @Override
  public boolean sendCommit(Set<ShuffleServerInfo> shuffleServerInfoSet, String appId, int shuffleId, int numMaps) {
    ForkJoinPool forkJoinPool = new ForkJoinPool(
        dataCommitPoolSize == -1 ? shuffleServerInfoSet.size() : dataCommitPoolSize
```

### BoundedWildcard
Can generalize to `? extends List`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
      int shuffleId,
      long taskAttemptId,
      Map<Integer, List<Long>> partitionToBlockIds,
      int bitmapNum) {
    Map<ShuffleServerInfo, List<Integer>> groupedPartitions = Maps.newHashMap();
```

### BoundedWildcard
Can generalize to `? extends ShuffleBlockInfo`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   */
  @Override
  public SendShuffleDataResult sendShuffleData(String appId, List<ShuffleBlockInfo> shuffleBlockInfoList,
      Supplier<Boolean> needCancelRequest) {

```

### BoundedWildcard
Can generalize to `? extends List`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
      String appId,
      Map<ShuffleServerInfo, Map<Integer, Map<Integer, List<ShuffleBlockInfo>>>> serverToBlocks,
      Map<ShuffleServerInfo, List<Long>> serverToBlockIds,
      Map<Long, AtomicInteger> blockIdsTracker, boolean allowFastFail,
      Supplier<Boolean> needCancelRequest) {
```

### BoundedWildcard
Can generalize to `? extends AtomicInteger`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
      Map<ShuffleServerInfo, Map<Integer, Map<Integer, List<ShuffleBlockInfo>>>> serverToBlocks,
      Map<ShuffleServerInfo, List<Long>> serverToBlockIds,
      Map<Long, AtomicInteger> blockIdsTracker, boolean allowFastFail,
      Supplier<Boolean> needCancelRequest) {

```

### BoundedWildcard
Can generalize to `? extends ShuffleServerInfo`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java

  @Override
  public Roaring64NavigableMap getShuffleResult(String clientType, Set<ShuffleServerInfo> shuffleServerInfoSet,
      String appId, int shuffleId, int partitionId) {
    RssGetShuffleResultRequest request = new RssGetShuffleResultRequest(
```

### BoundedWildcard
Can generalize to `? super ShuffleServerInfo`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
      List<ShuffleServerInfo> serverList,
      int replicaNum,
      Collection<ShuffleServerInfo> excludeServers,
      Map<ShuffleServerInfo, Map<Integer, Map<Integer, List<ShuffleBlockInfo>>>> serverToBlocks,
      Map<ShuffleServerInfo, List<Long>> serverToBlockIds,
```

### BoundedWildcard
Can generalize to `? super ShuffleServerInfo`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
      int replicaNum,
      Collection<ShuffleServerInfo> excludeServers,
      Map<ShuffleServerInfo, Map<Integer, Map<Integer, List<ShuffleBlockInfo>>>> serverToBlocks,
      Map<ShuffleServerInfo, List<Long>> serverToBlockIds,
      boolean excludeDefectiveServers) {
```

### BoundedWildcard
Can generalize to `? super ShuffleServerInfo`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
      Collection<ShuffleServerInfo> excludeServers,
      Map<ShuffleServerInfo, Map<Integer, Map<Integer, List<ShuffleBlockInfo>>>> serverToBlocks,
      Map<ShuffleServerInfo, List<Long>> serverToBlockIds,
      boolean excludeDefectiveServers) {
    if (replicaNum <= 0) {
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `coordinator/src/main/java/org/apache/uniffle/coordinator/CoordinatorServer.java`
#### Snippet
```java
    }

    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java

    registerHeartBeat.startHeartBeat();
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `common/src/main/java/org/apache/uniffle/common/config/ConfigOptions.java`
#### Snippet
```java
          }
          return Arrays.stream(trimmedVal.split(LIST_SPILTTER))
                  .map(atomicConverter::apply).collect(Collectors.toList());
        }
      };
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `coordinator/src/main/java/org/apache/uniffle/coordinator/QuotaManager.java`
#### Snippet
```java
    try (BufferedReader bufferedReader =
             new BufferedReader(new InputStreamReader(fsDataInputStream, StandardCharsets.UTF_8))) {
      while ((content = bufferedReader.readLine()) != null) {
        // to avoid reading comments
        if (!content.startsWith("#") && !content.isEmpty()) {
```

### NestedAssignment
Result of assignment expression used
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
    try (BufferedReader br = new BufferedReader(new InputStreamReader(fsDataInputStream, StandardCharsets.UTF_8))) {
      String line;
      while ((line = br.readLine()) != null) {
        if (!StringUtils.isEmpty(line)) {
          nodes.add(line.trim());
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/org/apache/uniffle/common/util/JavaUtils.java`
#### Snippet
```java
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
      V result;
      if (null == (result = get(key))) {
        result = super.computeIfAbsent(key, mappingFunction);
      }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`nextOffset = nextOffset + data.length` could be simplified to 'nextOffset += data.length'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriter.java`
#### Snippet
```java
    if (data != null && data.length > 0) {
      dataOutputStream.write(data);
      nextOffset = nextOffset + data.length;
    }
  }
```

### ReplaceAssignmentWithOperatorAssignment
`retryMax = retryMax / 2` could be simplified to 'retryMax /= 2'
in `client/src/main/java/org/apache/uniffle/client/factory/ShuffleClientFactory.java`
#### Snippet
```java
    // We need retry less times in this case for let the first round fail fast.
    if (replicaSkipEnabled && replica > replicaWrite) {
      retryMax = retryMax / 2;
    }
    return new ShuffleWriteClientImpl(
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`for` statement cannot complete without throwing an exception
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
      @Override
      public void run() {
        for (; ; ) {
          try {
            processPendingEvents();
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java

  protected void eventLoop() {
    while (true) {
      processNextEvent();
    }
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
    // the thread for clear expired resources
    clearResourceThread = () -> {
      while (true) {
        try {
          PurgeEvent event = expiredAppIdQueue.take();
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `server/src/main/java/org/apache/uniffle/server/LocalStorageChecker.java`
#### Snippet
```java
        } catch (IOException ioe) {
          LOG.error("delete directory fail. Storage dir: {}", storageDir, ioe);
          return false;
        }
      }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/DecommissionServlet.java`
#### Snippet
```java
    }
    ClusterManager clusterManager = coordinator.getClusterManager();
    params.getServerIds().forEach((serverId) -> {
      clusterManager.decommission(serverId);
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/CancelDecommissionServlet.java`
#### Snippet
```java
    }
    ClusterManager clusterManager = coordinator.getClusterManager();
    params.getServerIds().forEach((serverId) -> {
      clusterManager.cancelDecommission(serverId);
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `storage/src/main/java/org/apache/uniffle/storage/factory/ShuffleHandlerFactory.java`
#### Snippet
```java
    if (request.getShuffleServerInfoList().size() > 1) {
      List<ClientReadHandler> handlers = Lists.newArrayList();
      request.getShuffleServerInfoList().forEach((ssi) -> {
        handlers.add(ShuffleHandlerFactory.getInstance().createSingleReplicaClientReadHandler(request, ssi));
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
    AtomicInteger successfulCommit = new AtomicInteger(0);
    try {
      forkJoinPool.submit(() -> {
        shuffleServerInfoSet.parallelStream().forEach(ssi -> {
          RssSendCommitRequest request = new RssSendCommitRequest(appId, shuffleId);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
    RssApplicationInfoRequest request = new RssApplicationInfoRequest(appId, timeoutMs, user);
    List<Callable<Void>> callableList = Lists.newArrayList();
    coordinatorClients.forEach(coordinatorClient -> {
      callableList.add(() -> {
        try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
    }

    shuffleServerInfos.forEach(shuffleServerInfo -> {
          callableList.add(() -> {
            try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
    List<Callable<Void>> callableList = Lists.newArrayList();
    Set<ShuffleServerInfo> allShuffleServers = getAllShuffleServers(appId);
    allShuffleServers.forEach(shuffleServerInfo -> {
          callableList.add(() -> {
            try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
    );

    coordinatorClients.forEach(coordinatorClient -> {
      callableList.add(() -> {
        try {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `metricsManager` is accessed in both synchronized and unsynchronized contexts
in `coordinator/src/main/java/org/apache/uniffle/coordinator/metric/CoordinatorMetrics.java`
#### Snippet
```java
  public static final Map<String, Gauge> GAUGE_USED_REMOTE_STORAGE = JavaUtils.newConcurrentMap();

  private static MetricsManager metricsManager;
  private static boolean isRegister = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isRegister` is accessed in both synchronized and unsynchronized contexts
in `coordinator/src/main/java/org/apache/uniffle/coordinator/metric/CoordinatorMetrics.java`
#### Snippet
```java

  private static MetricsManager metricsManager;
  private static boolean isRegister = false;

  public static synchronized void register(CollectorRegistry collectorRegistry) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serverToPartitions` is accessed in both synchronized and unsynchronized contexts
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/PartitionBalanceAssignmentStrategy.java`
#### Snippet
```java

  private ClusterManager clusterManager;
  private Map<ServerNode, PartitionAssignmentInfo> serverToPartitions = JavaUtils.newConcurrentMap();

  public PartitionBalanceAssignmentStrategy(ClusterManager clusterManager, CoordinatorConf conf) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `workerGroup` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClientFactory.java`
#### Snippet
```java

  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  private PooledByteBufAllocator pooledAllocator;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `path` is accessed in both synchronized and unsynchronized contexts
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(LocalFileReader.class);
  private String path;
  private DataInputStream dataInputStream;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataInputStream` is accessed in both synchronized and unsynchronized contexts
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(LocalFileReader.class);
  private String path;
  private DataInputStream dataInputStream;

  public LocalFileReader(String path) throws Exception {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataOutputStream` is accessed in both synchronized and unsynchronized contexts
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriter.java`
#### Snippet
```java
public class LocalFileWriter implements FileWriter, Closeable {

  private DataOutputStream dataOutputStream;
  private FileOutputStream fileOutputStream;
  private long nextOffset;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `fsDataOutputStream` is accessed in both synchronized and unsynchronized contexts
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsFileWriter.java`
#### Snippet
```java
  private Path path;
  private Configuration hadoopConf;
  private FSDataOutputStream fsDataOutputStream;
  private long nextOffset;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `fsDataInputStream` is accessed in both synchronized and unsynchronized contexts
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsFileReader.java`
#### Snippet
```java
  private Path path;
  private Configuration hadoopConf;
  private FSDataInputStream fsDataInputStream;
  private FileSystem fileSystem;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `basePath` is accessed in both synchronized and unsynchronized contexts
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriteHandler.java`
#### Snippet
```java

  private String fileNamePrefix;
  private String basePath;

  public LocalFileWriteHandler(
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shuffleTaskManager` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
  private ShuffleServerConf shuffleServerConf;
  private JettyServer jettyServer;
  private ShuffleTaskManager shuffleTaskManager;
  private ServerInterface server;
  private ShuffleFlushManager shuffleFlushManager;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `executorService` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
  private volatile ServerStatus serverStatus = ServerStatus.ACTIVE;
  private volatile boolean running;
  private ExecutorService executorService;
  private Future<?> decommissionFuture;
  private boolean nettyServerEnabled;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shuffleServerConf` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
  private int grpcPort;
  private int nettyPort;
  private ShuffleServerConf shuffleServerConf;
  private JettyServer jettyServer;
  private ShuffleTaskManager shuffleTaskManager;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterRemoteStorageFailedWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Counter counterRemoteStorageTotalWrite;
  public static Counter counterRemoteStorageRetryWrite;
  public static Counter counterRemoteStorageFailedWrite;
  public static Counter counterRemoteStorageSuccessWrite;
  private static String tags;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterRemoteStorageTotalWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Gauge.Child gaugeAppNum;
  public static Gauge.Child gaugeTotalPartitionNum;
  public static Counter counterRemoteStorageTotalWrite;
  public static Counter counterRemoteStorageRetryWrite;
  public static Counter counterRemoteStorageFailedWrite;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterLocalStorageSuccessWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Counter.Child  counterLocalStorageRetryWrite;
  public static Counter.Child  counterLocalStorageFailedWrite;
  public static Counter.Child  counterLocalStorageSuccessWrite;
  public static Counter.Child  counterTotalRequireReadMemoryNum;
  public static Counter.Child  counterTotalRequireReadMemoryRetryNum;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterLocalStorageTotalWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Counter.Child  counterTotalRequireBufferFailedForRegularPartition;

  public static Counter.Child  counterLocalStorageTotalWrite;
  public static Counter.Child  counterLocalStorageRetryWrite;
  public static Counter.Child  counterLocalStorageFailedWrite;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isRegister` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java

  private static MetricsManager metricsManager;
  private static boolean isRegister = false;

  public static synchronized void register(CollectorRegistry collectorRegistry, String tags) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterLocalStorageRetryWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java

  public static Counter.Child  counterLocalStorageTotalWrite;
  public static Counter.Child  counterLocalStorageRetryWrite;
  public static Counter.Child  counterLocalStorageFailedWrite;
  public static Counter.Child  counterLocalStorageSuccessWrite;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `metricsManager` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  private static String tags;

  private static MetricsManager metricsManager;
  private static boolean isRegister = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterLocalStorageFailedWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Counter.Child  counterLocalStorageTotalWrite;
  public static Counter.Child  counterLocalStorageRetryWrite;
  public static Counter.Child  counterLocalStorageFailedWrite;
  public static Counter.Child  counterLocalStorageSuccessWrite;
  public static Counter.Child  counterTotalRequireReadMemoryNum;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterRemoteStorageSuccessWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Counter counterRemoteStorageRetryWrite;
  public static Counter counterRemoteStorageFailedWrite;
  public static Counter counterRemoteStorageSuccessWrite;
  private static String tags;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `counterRemoteStorageRetryWrite` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
  public static Gauge.Child gaugeTotalPartitionNum;
  public static Counter counterRemoteStorageTotalWrite;
  public static Counter counterRemoteStorageRetryWrite;
  public static Counter counterRemoteStorageFailedWrite;
  public static Counter counterRemoteStorageSuccessWrite;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pathToStorages` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/storage/HdfsStorageManager.java`
#### Snippet
```java
  private final Configuration hadoopConf;
  private Map<String, HdfsStorage> appIdToStorages = JavaUtils.newConcurrentMap();
  private Map<String, HdfsStorage> pathToStorages = JavaUtils.newConcurrentMap();

  HdfsStorageManager(ShuffleServerConf conf) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `conf` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private final StorageManager storageManager;
  private AtomicLong requireBufferId = new AtomicLong(0);
  private ShuffleServerConf conf;
  private long appExpiredWithoutHB;
  private long preAllocationExpired;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `capacity` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private ShuffleTaskManager shuffleTaskManager;
  private final ShuffleFlushManager shuffleFlushManager;
  private long capacity;
  private long readCapacity;
  private int retryNum;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inFlushSize` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  protected long bufferSize = 0;
  protected AtomicLong preAllocatedSize = new AtomicLong(0L);
  protected AtomicLong inFlushSize = new AtomicLong(0L);
  protected AtomicLong usedMemory = new AtomicLong(0L);
  private AtomicLong readDataMemory = new AtomicLong(0L);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `readCapacity` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private final ShuffleFlushManager shuffleFlushManager;
  private long capacity;
  private long readCapacity;
  private int retryNum;
  private long highWaterMark;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `preAllocatedSize` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  protected long bufferSize = 0;
  protected AtomicLong preAllocatedSize = new AtomicLong(0L);
  protected AtomicLong inFlushSize = new AtomicLong(0L);
  protected AtomicLong usedMemory = new AtomicLong(0L);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `readDataMemory` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  protected AtomicLong inFlushSize = new AtomicLong(0L);
  protected AtomicLong usedMemory = new AtomicLong(0L);
  private AtomicLong readDataMemory = new AtomicLong(0L);
  // appId -> shuffleId -> partitionId -> ShuffleBuffer to avoid too many appId
  protected Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> bufferPool;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `usedMemory` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  protected AtomicLong preAllocatedSize = new AtomicLong(0L);
  protected AtomicLong inFlushSize = new AtomicLong(0L);
  protected AtomicLong usedMemory = new AtomicLong(0L);
  private AtomicLong readDataMemory = new AtomicLong(0L);
  // appId -> shuffleId -> partitionId -> ShuffleBuffer to avoid too many appId
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bufferPool` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private AtomicLong readDataMemory = new AtomicLong(0L);
  // appId -> shuffleId -> partitionId -> ShuffleBuffer to avoid too many appId
  protected Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> bufferPool;
  // appId -> shuffleId -> shuffle size in buffer
  protected Map<String, Map<Integer, AtomicLong>> shuffleSizeMap = JavaUtils.newConcurrentMap();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `size` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java

  private final long capacity;
  private long size;
  // blocks will be added to inFlushBlockMap as <eventId, blocks> pair
  // it will be removed after flush to storage
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `blocks` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  // it will be removed after flush to storage
  // the strategy ensure that shuffle is in memory or storage
  private List<ShufflePartitionedBlock> blocks;
  private Map<Long, List<ShufflePartitionedBlock>> inFlushBlockMap;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inFlushBlockMap` is accessed in both synchronized and unsynchronized contexts
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  // the strategy ensure that shuffle is in memory or storage
  private List<ShufflePartitionedBlock> blocks;
  private Map<Long, List<ShufflePartitionedBlock>> inFlushBlockMap;

  public ShuffleBuffer(long capacity) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `server/src/main/java/org/apache/uniffle/server/netty/decoder/StreamServerInitDecoder.java`
#### Snippet
```java
  }

  private void addDecoder(ChannelHandlerContext ctx, byte type) {

  }
```

### EmptyMethod
All implementations of this method are empty
in `server/src/main/java/org/apache/uniffle/server/storage/StorageManager.java`
#### Snippet
```java
  void removeResources(PurgeEvent event);

  void start();

  void stop();
```

### EmptyMethod
All implementations of this method are empty
in `server/src/main/java/org/apache/uniffle/server/storage/StorageManager.java`
#### Snippet
```java
  void start();

  void stop();

  void registerRemoteStorage(String appId, RemoteStorageInfo remoteStorageInfo);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ClientConfManager.java`
#### Snippet
```java
  private final AtomicLong lastCandidatesUpdateMS = new AtomicLong(0L);
  private Path path;
  private ScheduledExecutorService updateClientConfSES = null;
  private FileSystem fileSystem;
  private static final String WHITESPACE_REGEX = "\\s+";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ApplicationManager.java`
#### Snippet
```java
  private QuotaManager quotaManager;
  // it's only for test case to check if status check has problem
  private boolean hasErrorInStatusCheck = false;

  public ApplicationManager(CoordinatorConf conf) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  private boolean startupSilentPeriodEnabled;
  private long startupSilentPeriodDurationMs;
  private boolean readyForServe = false;

  public SimpleClusterManager(CoordinatorConf conf, Configuration hadoopConf) throws Exception {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  private FileSystem hadoopFileSystem;

  private long outputAliveServerCount = 0;
  private final long periodicOutputIntervalTimes;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/metric/CoordinatorMetrics.java`
#### Snippet
```java

  private static MetricsManager metricsManager;
  private static boolean isRegister = false;

  public static synchronized void register(CollectorRegistry collectorRegistry) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/uniffle/common/util/ExitUtils.java`
#### Snippet
```java
public class ExitUtils {

  private static boolean isSystemExitDisabled = false;

  public static class ExitException extends RuntimeException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/uniffle/common/netty/TransportFrameDecoder.java`
#### Snippet
```java
  private final LinkedList<ByteBuf> buffers = new LinkedList<>();

  private long totalSize = 0;
  private long nextFrameSize = UNKNOWN_FRAME_SIZE;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/uniffle/common/metrics/JvmMetrics.java`
#### Snippet
```java
public class JvmMetrics {
  private static CollectorRegistry collectorRegistry;
  private static boolean initialized = false;

  public JvmMetrics() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/uniffle/common/metrics/GRPCMetrics.java`
#### Snippet
```java
  private static final String GRPC_TOTAL = "grpc_total";

  private boolean isRegistered = false;
  protected Map<String, Counter.Child> counterMap = JavaUtils.newConcurrentMap();
  protected Map<String, Gauge.Child> gaugeMap = JavaUtils.newConcurrentMap();
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/ClientReadHandlerMetric.java`
#### Snippet
```java
  private long skippedReadBlockNum = 0L;
  private long skippedReadLength = 0L;
  private long skippedReadUncompressLength = 0L;

  public long getReadBlockNum() {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/ClientReadHandlerMetric.java`
#### Snippet
```java

  private long skippedReadBlockNum = 0L;
  private long skippedReadLength = 0L;
  private long skippedReadUncompressLength = 0L;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/ClientReadHandlerMetric.java`
#### Snippet
```java
  private long readUncompressLength = 0L;

  private long skippedReadBlockNum = 0L;
  private long skippedReadLength = 0L;
  private long skippedReadUncompressLength = 0L;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/ClientReadHandlerMetric.java`
#### Snippet
```java
  private long readBlockNum = 0L;
  private long readLength = 0L;
  private long readUncompressLength = 0L;

  private long skippedReadBlockNum = 0L;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/ClientReadHandlerMetric.java`
#### Snippet
```java
public class ClientReadHandlerMetric {
  private long readBlockNum = 0L;
  private long readLength = 0L;
  private long readUncompressLength = 0L;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/ClientReadHandlerMetric.java`
#### Snippet
```java

public class ClientReadHandlerMetric {
  private long readBlockNum = 0L;
  private long readLength = 0L;
  private long readUncompressLength = 0L;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorage.java`
#### Snippet
```java
  private final StorageMedia media;
  private boolean isSpaceEnough = true;
  private volatile boolean isCorrupted = false;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/DataSkippableReadHandler.java`
#### Snippet
```java

  protected List<ShuffleDataSegment> shuffleDataSegments = Lists.newArrayList();
  protected int segmentIndex = 0;

  protected Roaring64NavigableMap expectBlockIds;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleWriteHandler.java`
#### Snippet
```java
  private String fileNamePrefix;
  private Lock writeLock = new ReentrantLock();
  private int failTimes = 0;
  private String user;
  private FileSystem fileSystem;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsClientReadHandler.java`
#### Snippet
```java
  private ShuffleDataDistributionType distributionType;
  private Roaring64NavigableMap expectTaskIds;
  private boolean offHeapEnable = false;

  public HdfsClientReadHandler(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/PooledHdfsShuffleWriteHandler.java`
#### Snippet
```java
  private final String basePath;
  private Function<Integer, ShuffleWriteHandler> createWriterFunc;
  private volatile int initializedHandlerCnt = 0;

  // Only for tests
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private IdHelper idHelper;
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
  private boolean expectedTaskIdsBitmapFilterEnable = false;
  private boolean offHeapEnabled = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
  private boolean expectedTaskIdsBitmapFilterEnable = false;
  private boolean offHeapEnabled = false;

  public CreateShuffleReadClientRequest(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `server/src/main/java/org/apache/uniffle/server/HealthCheck.java`
#### Snippet
```java
  private final long checkIntervalMs;
  private final Thread thread;
  private volatile boolean isStop = false;
  private List<Checker> checkers = Lists.newArrayList();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleDataFlushEvent.java`
#### Snippet
```java
  private final List<Runnable> cleanupCallbackChains;

  private boolean ownedByHugePartition = false;

  public ShuffleDataFlushEvent(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleDataFlushEvent.java`
#### Snippet
```java
  private final AtomicInteger retryTimes = new AtomicInteger();

  private boolean isPended = false;
  private Storage underStorage;
  private final List<Runnable> cleanupCallbackChains;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
  private final BlockingQueue<PendingShuffleFlushEvent> pendingEvents = Queues.newLinkedBlockingQueue();
  private final long pendingEventTimeoutSec;
  private int processPendingEventIndex = 0;
  private final int maxConcurrencyOfSingleOnePartition;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java

  private static MetricsManager metricsManager;
  private static boolean isRegister = false;

  public static synchronized void register(CollectorRegistry collectorRegistry, String tags) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private long hugePartitionMemoryLimitSize;

  protected long bufferSize = 0;
  protected AtomicLong preAllocatedSize = new AtomicLong(0L);
  protected AtomicLong inFlushSize = new AtomicLong(0L);
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `common/src/main/java/org/apache/uniffle/common/util/RetryUtils.java`
#### Snippet
```java
        retry++;
        if ((exceptionClasses != null && !isInstanceOf(exceptionClasses, t)) || retry >= retryTimes
            || t instanceof NotRetryException) {
          throw t;
        } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsClientReadHandler.java`
#### Snippet
```java
              && (shuffleServerId == null || file.getName().startsWith(shuffleServerId)));
    } catch (Exception e) {
      if (e instanceof FileNotFoundException) {
        LOG.info("Directory[" + baseFolder
            + "] not found. The data may not be flushed to this directory. Nothing will be read.");
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerInternalGrpcService.java`
#### Snippet
```java
    } catch (Exception e) {
      StatusCode statusCode = StatusCode.INTERNAL_ERROR;
      if (e instanceof InvalidRequestException) {
        statusCode = StatusCode.INVALID_REQUEST;
      }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerInternalGrpcService.java`
#### Snippet
```java
    } catch (Exception e) {
      StatusCode statusCode = StatusCode.INTERNAL_ERROR;
      if (e instanceof InvalidRequestException) {
        statusCode = StatusCode.INVALID_REQUEST;
      }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorageMeta.java`
#### Snippet
```java
        .stream()
        .filter(e -> (!checkRead || e.getValue().isStartRead.get()) && e.getValue().getNotUploadedSize() > 0)
        .collect(Collectors.toList());

    shuffleMetaList.sort((Entry<String, ShuffleMeta> o1, Entry<String, ShuffleMeta> o2) -> {
```

### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `server/src/main/java/org/apache/uniffle/server/storage/LocalStorageManager.java`
#### Snippet
```java
        return Stream.of(basicPath);
      }
    }).collect(Collectors.toList());

    deleteHandler.delete(deletePaths.toArray(new String[deletePaths.size()]), appId, user);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/apache/uniffle/common/ShufflePartitionedData.java`
#### Snippet
```java
  public ShufflePartitionedBlock[] getBlockList() {
    if (blockList == null) {
      return new ShufflePartitionedBlock[]{};
    }
    return blockList;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/apache/uniffle/common/ShuffleIndexResult.java`
#### Snippet
```java

  public ShuffleIndexResult() {
    this(new byte[0], -1);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/apache/uniffle/common/ShuffleDataResult.java`
#### Snippet
```java

  public ShuffleDataResult() {
    this(new byte[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/apache/uniffle/common/metrics/MetricsManager.java`
#### Snippet
```java
      this.collectorRegistry = collectorRegistry;
    }
    this.defaultLabelNames = defaultLabels.keySet().toArray(new String[0]);
    this.defaultLabelValues = Arrays.stream(defaultLabelNames)
        .map(defaultLabels::get)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java
      LOG.warn("Can't read data for path:" + path + " with offset[" + offset + "], length[" + length + "]", e);
    }
    return new byte[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java
    } catch (IOException e) {
      LOG.error("Fail to read all data from {}", path, e);
      return new byte[0];
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleReadHandler.java`
#### Snippet
```java
      LOG.warn("Fail to read expected[{}] data, actual[{}] from file {}.data",
          expectedLength, data.length, filePrefix);
      return new byte[0];
    }
    return data;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsFileReader.java`
#### Snippet
```java
          + offset + "], length[" + length + "]", e);
    }
    return new byte[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsFileReader.java`
#### Snippet
```java
    } catch (IOException e) {
      LOG.error("Fail to read all data from {}", path, e);
      return new byte[0];
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileServerReadHandler.java`
#### Snippet
```java
  @Override
  public ShuffleDataResult getShuffleData(long offset, int length) {
    byte[] readBuffer = new byte[0];

    try {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `client/src/main/java/org/apache/uniffle/client/util/ClientUtils.java`
#### Snippet
```java
    int failed = 0;

    CompletableFuture allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

    List<Future> finished = new ArrayList<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/org/apache/uniffle/server/storage/HdfsStorageManager.java`
#### Snippet
```java
        }
      }
      deleteHandler.delete(deletePaths.toArray(new String[0]), appId, event.getUser());
    } else {
      LOG.warn("Storage gotten is null when removing resources for event: {}", event);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
  private ShufflePartitionedBlock[] toPartitionedBlock(List<ShuffleBlock> blocks) {
    if (blocks == null || blocks.size() == 0) {
      return new ShufflePartitionedBlock[]{};
    }
    ShufflePartitionedBlock[] ret = new ShufflePartitionedBlock[blocks.size()];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
                expectedTaskIds
            );
        byte[] data = new byte[]{};
        List<BufferSegment> bufferSegments = Lists.newArrayList();
        if (shuffleDataResult != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
        LOG.error(msg, e);
        reply = GetMemoryShuffleDataResponse.newBuilder()
            .setData(UnsafeByteOperations.unsafeWrap(new byte[]{}))
            .addAllShuffleDataBlockSegments(Lists.newArrayList())
            .setStatus(status.toProto())
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
      LOG.error(msg + " for " + requestInfo);
      reply = GetMemoryShuffleDataResponse.newBuilder()
          .setData(UnsafeByteOperations.unsafeWrap(new byte[]{}))
          .addAllShuffleDataBlockSegments(Lists.newArrayList())
          .setStatus(status.toProto())
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
    Roaring64NavigableMap[] blockIds = shuffleIdToPartitions.get(shuffleId);
    if (blockIds == null) {
      return new byte[]{};
    }
    Map<Integer, Set<Integer>> bitmapIndexToPartitions = Maps.newHashMap();
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `coordinator/src/main/java/org/apache/uniffle/coordinator/QuotaManager.java`
#### Snippet
```java
    String uuidFromApp = appIdAndUuid[appIdAndUuid.length - 1];
    // if appId created successfully, we need to remove the uuid
    synchronized (this) {
      appAndTime.remove(uuidFromApp);
      appAndTime.put(appId, currentTimeMillis);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `coordinator/src/main/java/org/apache/uniffle/coordinator/QuotaManager.java`
#### Snippet
```java
    Map<String, Long> appAndTimes = currentUserAndApp.computeIfAbsent(user, x -> JavaUtils.newConcurrentMap());
    Integer defaultAppNum = defaultUserApps.computeIfAbsent(user, x -> quotaAppNum);
    synchronized (this) {
      int currentAppNum = appAndTimes.size();
      if (currentAppNum >= defaultAppNum) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/PartitionBalanceAssignmentStrategy.java`
#### Snippet
```java

    SortedMap<PartitionRange, List<ServerNode>> assignments;
    synchronized (this) {
      List<ServerNode> nodes = clusterManager.getServerList(requiredTags);
      Map<ServerNode, PartitionAssignmentInfo> newPartitionInfos = JavaUtils.newConcurrentMap();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/PooledHdfsShuffleWriteHandler.java`
#### Snippet
```java
  public void write(List<ShufflePartitionedBlock> shuffleBlocks) throws Exception {
    if (queue.isEmpty() && initializedHandlerCnt < maxConcurrency) {
      synchronized (this) {
        if (initializedHandlerCnt < maxConcurrency) {
          queue.add(createWriterFunc.apply(initializedHandlerCnt++));
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `server/src/main/java/org/apache/uniffle/server/storage/HdfsStorageManager.java`
#### Snippet
```java
  public HdfsStorage getStorageByAppId(String appId) {
    if (!appIdToStorages.containsKey(appId)) {
      synchronized (this) {
        FileSystem fs;
        try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    }
    updateShuffleSize(appId, shuffleId, size);
    synchronized (this) {
      flushSingleBufferIfNecessary(
          buffer,
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    ShuffleServerMetrics.counterTotalRequireReadMemoryNum.inc();
    for (int i = 0; i < retryNum; i++) {
      synchronized (this) {
        if (readDataMemory.get() + size < readCapacity) {
          readDataMemory.addAndGet(size);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
    long mSize = 0;

    synchronized (this) {
      for (ShufflePartitionedBlock block : data.getBlockList()) {
        blocks.add(block);
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.collect.RangeMap'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private AtomicLong readDataMemory = new AtomicLong(0L);
  // appId -> shuffleId -> partitionId -> ShuffleBuffer to avoid too many appId
  protected Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> bufferPool;
  // appId -> shuffleId -> shuffle size in buffer
  protected Map<String, Map<Integer, AtomicLong>> shuffleSizeMap = JavaUtils.newConcurrentMap();
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeMap'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  @VisibleForTesting
  public Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> getBufferPool() {
    return bufferPool;
  }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `latestPosition` initializer `-1` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/util/ShuffleStorageUtils.java`
#### Snippet
```java
        Collections.sort(segments);
        long start = -1;
        long latestPosition = -1;
        long skipThreshold = readBufferSize / 2;
        long lastPosition = Long.MAX_VALUE;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/MemoryClientReadHandler.java`
#### Snippet
```java
  @Override
  public ShuffleDataResult readShuffleData() {
    ShuffleDataResult result = null;

    RssGetInMemoryShuffleDataRequest request = new RssGetInMemoryShuffleDataRequest(
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileClientReadHandler.java`
#### Snippet
```java
  @Override
  public ShuffleDataResult readShuffleData(ShuffleDataSegment shuffleDataSegment) {
    ShuffleDataResult result = null;
    int expectedLength = shuffleDataSegment.getLength();
    if (expectedLength <= 0) {
```

### UnusedAssignment
Variable `shuffleIndexResult` initializer `null` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileClientReadHandler.java`
#### Snippet
```java
  @Override
  public ShuffleIndexResult readShuffleIndex() {
    ShuffleIndexResult shuffleIndexResult = null;
    RssGetShuffleIndexRequest request = new RssGetShuffleIndexRequest(
        appId, shuffleId, partitionId, partitionNumPerRange, partitionNum);
```

### UnusedAssignment
Variable `indexFiles` initializer `null` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsClientReadHandler.java`
#### Snippet
```java
    }

    FileStatus[] indexFiles = null;
    try {
      // get all index files
```

### UnusedAssignment
Variable `offHeapEnable` initializer `false` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsClientReadHandler.java`
#### Snippet
```java
  private ShuffleDataDistributionType distributionType;
  private Roaring64NavigableMap expectTaskIds;
  private boolean offHeapEnable = false;

  public HdfsClientReadHandler(
```

### UnusedAssignment
Variable `bs` initializer `null` is redundant
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java

    // get next buffer segment
    BufferSegment bs = null;

    // blocks in bufferSegmentQueue may be from different partition in range partition mode,
```

### UnusedAssignment
Variable `expectedTaskIdsBitmapFilterEnable` initializer `false` is redundant
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private IdHelper idHelper;
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
  private boolean expectedTaskIdsBitmapFilterEnable = false;
  private boolean offHeapEnabled = false;

```

### UnusedAssignment
Variable `offHeapEnabled` initializer `false` is redundant
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
  private boolean expectedTaskIdsBitmapFilterEnable = false;
  private boolean offHeapEnabled = false;

  public CreateShuffleReadClientRequest(
```

### UnusedAssignment
Variable `readBytes` initializer `-1` is redundant
in `server/src/main/java/org/apache/uniffle/server/LocalStorageChecker.java`
#### Snippet
```java
        }
        byte[] readData = new byte[1024];
        int readBytes = -1;
        try (FileInputStream fis = new FileInputStream(writeFile)) {
          int hasReadBytes = 0;
```

### UnusedAssignment
Variable `reply` initializer `null` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    StatusCode status = StatusCode.SUCCESS;
    String msg = "OK";
    GetLocalShuffleDataResponse reply = null;
    ShuffleDataResult sdr;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitionId["
```

### UnusedAssignment
Variable `serializedBlockIds` initializer `null` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    String msg = "OK";
    GetShuffleResultForMultiPartResponse reply;
    byte[] serializedBlockIds = null;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitions" + partitionsList;
    ByteString serializedBlockIdsBytes = ByteString.EMPTY;
```

### UnusedAssignment
Variable `serializedBlockIds` initializer `null` is redundant
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    String msg = "OK";
    GetShuffleResultResponse reply;
    byte[] serializedBlockIds = null;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitionId[" + partitionId + "]";
    ByteString serializedBlockIdsBytes = ByteString.EMPTY;
```

### UnusedAssignment
Variable `dataCommitPoolSize` initializer `-1` is redundant
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private int replicaRead;
  private boolean replicaSkipEnabled;
  private int dataCommitPoolSize = -1;
  private final ExecutorService dataTransferPool;
  private final int unregisterThreadPoolSize;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `realSkip == -1` is always `false`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java
      while (targetSkip > 0) {
        long realSkip = dataInputStream.skip(targetSkip);
        if (realSkip == -1) {
          throw new RssException("Unexpected EOF when skip bytes");
        }
```

### ConstantValue
Value `isPreAllocated` is always 'true'
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
            + "], partitionId[" + spd.getPartitionId() + "]";
        try {
          ret = manager.cacheShuffleData(appId, shuffleId, isPreAllocated, spd);
          if (ret != StatusCode.SUCCESS) {
            String errorMsg = "Error happened when shuffleEngine.write for "
```

### ConstantValue
Condition `buffers != null` is always `true`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      }
      Collection<ShuffleBuffer> buffers = bufferRangeMap.asMapOfRanges().values();
      if (buffers != null) {
        for (ShuffleBuffer buffer : buffers) {
          ShuffleServerMetrics.gaugeTotalPartitionNum.dec();
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("ShuffleBlockInfo:");
    sb.append("shuffleId[" + shuffleId + "],");
    sb.append("partitionId[" + partitionId + "],");
    sb.append("blockId[" + blockId + "],");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
    sb.append("ShuffleBlockInfo:");
    sb.append("shuffleId[" + shuffleId + "],");
    sb.append("partitionId[" + partitionId + "],");
    sb.append("blockId[" + blockId + "],");
    sb.append("length[" + length + "],");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
    sb.append("shuffleId[" + shuffleId + "],");
    sb.append("partitionId[" + partitionId + "],");
    sb.append("blockId[" + blockId + "],");
    sb.append("length[" + length + "],");
    sb.append("uncompressLength[" + uncompressLength + "],");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
    sb.append("partitionId[" + partitionId + "],");
    sb.append("blockId[" + blockId + "],");
    sb.append("length[" + length + "],");
    sb.append("uncompressLength[" + uncompressLength + "],");
    sb.append("crc[" + crc + "],");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
    sb.append("blockId[" + blockId + "],");
    sb.append("length[" + length + "],");
    sb.append("uncompressLength[" + uncompressLength + "],");
    sb.append("crc[" + crc + "],");
    if (shuffleServerInfos != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
    sb.append("length[" + length + "],");
    sb.append("uncompressLength[" + uncompressLength + "],");
    sb.append("crc[" + crc + "],");
    if (shuffleServerInfos != null) {
      sb.append("shuffleServer[");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
      sb.append("shuffleServer[");
      for (ShuffleServerInfo ssi : shuffleServerInfos) {
        sb.append(ssi.getId() + ",");
      }
      sb.append("]");
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java

    // check success and failed blocks according to the replicaWrite
    blockIdsTracker.entrySet().forEach(blockCt -> {
      long blockId = blockCt.getKey();
      int count = blockCt.getValue().get();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CoordinatorMetrics` has only 'static' members, and lacks a 'private' constructor
in `coordinator/src/main/java/org/apache/uniffle/coordinator/metric/CoordinatorMetrics.java`
#### Snippet
```java
import org.apache.uniffle.common.util.RssUtils;

public class CoordinatorMetrics {

  private static final String TOTAL_SERVER_NUM = "total_server_num";
```

### UtilityClassWithoutPrivateConstructor
Class `CoordinatorUtils` has only 'static' members, and lacks a 'private' constructor
in `coordinator/src/main/java/org/apache/uniffle/coordinator/util/CoordinatorUtils.java`
#### Snippet
```java
import org.apache.uniffle.proto.RssProtos.GetShuffleAssignmentsResponse;

public class CoordinatorUtils {

  private static final Logger LOG = LoggerFactory.getLogger(CoordinatorUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `UnionKey` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/UnionKey.java`
#### Snippet
```java
 * This class is to wrap multi elements to be as union key.
 */
public class UnionKey {
  private static final String SPLIT_KEY = "_";

```

### UtilityClassWithoutPrivateConstructor
Class `JavaUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/JavaUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class JavaUtils {
  private static final Logger logger = LoggerFactory.getLogger(JavaUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `NettyUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/NettyUtils.java`
#### Snippet
```java
import org.apache.uniffle.common.netty.protocol.Message;

public class NettyUtils {
  private static final Logger logger = LoggerFactory.getLogger(NettyUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ChecksumUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/ChecksumUtils.java`
#### Snippet
```java
import java.util.zip.CRC32;

public class ChecksumUtils {

  private static final int LENGTH_PER_CRC = 4 * 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `ByteBufUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
import io.netty.buffer.ByteBuf;

public class ByteBufUtils {

  public static int encodedLength(String s) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExitUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/ExitUtils.java`
#### Snippet
```java
import org.slf4j.Logger;

public class ExitUtils {

  private static boolean isSystemExitDisabled = false;
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/ThreadUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ThreadUtils {
  private static final Logger LOGGER = LoggerFactory.getLogger(ThreadUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `Encoders` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/Encoders.java`
#### Snippet
```java
import org.apache.uniffle.common.util.ByteBufUtils;

public class Encoders {
  public static void encodeShuffleServerInfo(ShuffleServerInfo shuffleServerInfo, ByteBuf byteBuf) {
    ByteBufUtils.writeLengthAndString(byteBuf, shuffleServerInfo.getId());
```

### UtilityClassWithoutPrivateConstructor
Class `Decoders` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/Decoders.java`
#### Snippet
```java
import org.apache.uniffle.common.util.ByteBufUtils;

public class Decoders {
  public static ShuffleServerInfo decodeShuffleServerInfo(ByteBuf byteBuf) {
    String id = ByteBufUtils.readLengthAndString(byteBuf);
```

### UtilityClassWithoutPrivateConstructor
Class `RssClientConf` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/config/RssClientConf.java`
#### Snippet
```java
import static org.apache.uniffle.common.compression.Codec.Type.LZ4;

public class RssClientConf {

  public static final ConfigOption<Codec.Type> COMPRESSION_TYPE = ConfigOptions
```

### UtilityClassWithoutPrivateConstructor
Class `RetryUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/util/RetryUtils.java`
#### Snippet
```java
import org.apache.uniffle.common.exception.NotRetryException;

public class RetryUtils {
  private static final Logger LOG = LoggerFactory.getLogger(RetryUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `MetricReporterFactory` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/metrics/MetricReporterFactory.java`
#### Snippet
```java
import org.apache.uniffle.common.config.RssConf;

public class MetricReporterFactory {

  public static MetricReporter getMetricReporter(RssConf conf, String instanceId) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `JvmMetrics` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/metrics/JvmMetrics.java`
#### Snippet
```java
import io.prometheus.client.hotspot.VersionInfoExports;

public class JvmMetrics {
  private static CollectorRegistry collectorRegistry;
  private static boolean initialized = false;
```

### UtilityClassWithoutPrivateConstructor
Class `StorageInfoUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfoUtils.java`
#### Snippet
```java


public class StorageInfoUtils {
  public static Map<String, RssProtos.StorageInfo> toProto(
      Map<String, StorageInfo> info) {
```

### UtilityClassWithoutPrivateConstructor
Class `LazyHolder` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/security/SecurityContextFactory.java`
#### Snippet
```java
  private SecurityContext securityContext = new NoOpSecurityContext();

  static class LazyHolder {
    static final SecurityContextFactory SECURITY_CONTEXT_FACTORY = new SecurityContextFactory();
  }
```

### UtilityClassWithoutPrivateConstructor
Class `HadoopFilesystemProvider` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/uniffle/common/filesystem/HadoopFilesystemProvider.java`
#### Snippet
```java
 * the dfs cluster is kerberos enabled or not.
 */
public class HadoopFilesystemProvider {
  private static final Logger LOGGER = LoggerFactory.getLogger(HadoopFilesystemProvider.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RssClientConfig` has only 'static' members, and lacks a 'private' constructor
in `client/src/main/java/org/apache/uniffle/client/util/RssClientConfig.java`
#### Snippet
```java
package org.apache.uniffle.client.util;

public class RssClientConfig {

  public static final String RSS_CLIENT_TYPE = "rss.client.type";
```

### UtilityClassWithoutPrivateConstructor
Class `ClientUtils` has only 'static' members, and lacks a 'private' constructor
in `client/src/main/java/org/apache/uniffle/client/util/ClientUtils.java`
#### Snippet
```java
import org.apache.uniffle.storage.util.StorageType;

public class ClientUtils {

  // BlockId is long and composed of partitionId, executorId and AtomicInteger.
```

### UtilityClassWithoutPrivateConstructor
Class `ShuffleServerMetrics` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
import org.apache.uniffle.storage.common.LocalStorage;

public class ShuffleServerMetrics {

  private static final String TOTAL_RECEIVED_DATA = "total_received_data";
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
        .expireAfterAccess(clientExpiredTime, TimeUnit.MILLISECONDS)
        .maximumSize(maxClient)
        .removalListener(notify -> ((ShuffleServerInternalGrpcClient) notify.getValue()).close())
        .build();
    this.startTime = System.currentTimeMillis();
```

### DataFlowIssue
Unboxing of `partitions.computeIfPresent(partitionId, (k, v) -> v + delta)` may produce `NullPointerException`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
    Map<Integer, Long> partitions = partitionDataSizes.get(shuffleId);
    partitions.putIfAbsent(partitionId, 0L);
    return partitions.computeIfPresent(partitionId, (k, v) -> v + delta);
  }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
        LOG.info("Alive servers number: {}, ids: {}",
            servers.size(),
            servers.keySet().stream().collect(Collectors.toList())
        );
      }
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/host/PreferDiffHostAssignmentStrategy.java`
#### Snippet
```java
  public List<ServerNode> assign(List<ServerNode> allNodes, int expectNum) {
    List<ServerNode> candidatesNodes = strategy.assign(allNodes, expectNum);
    Set<ServerNode> candidatesNodeSet = candidatesNodes.stream().collect(Collectors.toSet());
    if (candidatesNodes.size() < expectNum) {
      for (ServerNode node : allNodes) {
```

### SimplifyStreamApiCallChains
'!Stream.noneMatch(...)' can be replaced with 'anyMatch()'
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    } else if (e instanceof MultiException) {
      return !((MultiException) e).getThrowables().stream()
          .noneMatch((Throwable throwable) -> isServerPortBindCollision(throwable));
    } else if (e instanceof Errors.NativeIoException) {
      return (e.getMessage() != null && e.getMessage().startsWith("bind() failed: "))
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/DecommissionServlet.java`
#### Snippet
```java
    ClusterManager clusterManager = coordinator.getClusterManager();
    params.getServerIds().forEach((serverId) -> {
      clusterManager.decommission(serverId);
    });
    return Response.success(null);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/CancelDecommissionServlet.java`
#### Snippet
```java
    ClusterManager clusterManager = coordinator.getClusterManager();
    params.getServerIds().forEach((serverId) -> {
      clusterManager.cancelDecommission(serverId);
    });
    return Response.success(null);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    } else if (e instanceof MultiException) {
      return !((MultiException) e).getThrowables().stream()
          .noneMatch((Throwable throwable) -> isServerPortBindCollision(throwable));
    } else if (e instanceof Errors.NativeIoException) {
      return (e.getMessage() != null && e.getMessage().startsWith("bind() failed: "))
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java
  private List<Long> getExpectedTaskIds(Roaring64NavigableMap expectTaskIds) {
    List<Long> taskIds = new ArrayList<>();
    expectTaskIds.forEach(value -> taskIds.add(value));
    return taskIds;
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java

  public int getHugePartitionSize() {
    return hugePartitionTags.values().stream().map(x -> x.size()).reduce((x, y) -> x + y).orElse(0);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java

  public int getHugePartitionSize() {
    return hugePartitionTags.values().stream().map(x -> x.size()).reduce((x, y) -> x + y).orElse(0);
  }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'coordinator' in a Serializable class
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/DecommissionServlet.java`
#### Snippet
```java

public class DecommissionServlet extends BaseServlet {
  private final CoordinatorServer coordinator;

  public DecommissionServlet(CoordinatorServer coordinator) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'coordinator' in a Serializable class
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/NodesServlet.java`
#### Snippet
```java

public class NodesServlet extends BaseServlet {
  private final CoordinatorServer coordinator;

  public NodesServlet(CoordinatorServer coordinator) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'coordinator' in a Serializable class
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/CancelDecommissionServlet.java`
#### Snippet
```java

public class CancelDecommissionServlet extends BaseServlet {
  private final CoordinatorServer coordinator;

  public CancelDecommissionServlet(CoordinatorServer coordinator) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'registry' in a Serializable class
in `common/src/main/java/org/apache/uniffle/common/web/CommonMetricsServlet.java`
#### Snippet
```java

  final boolean isPrometheus;
  private CollectorRegistry registry;

  public CommonMetricsServlet(CollectorRegistry registry) {
```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
        throw new RssException("Shuffle data commit timeout for " + commitTimeout + " ms");
      }
      synchronized (cachedBlockIds) {
        cloneBlockIds = RssUtils.cloneBitMap(cachedBlockIds);
      }
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
      while (true) {
        committedBlockIds = shuffleFlushManager.getCommittedBlockIds(appId, shuffleId);
        synchronized (committedBlockIds) {
          cloneCommittedBlockIds = RssUtils.cloneBitMap(committedBlockIds);
        }
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/LowestIOSampleCostSelectStorageStrategy.java`
#### Snippet
```java
  @Override
  public synchronized RemoteStorageInfo pickStorage(String appId) {
    LOG.info("The sorted remote path list is: {}", uris);
    for (Map.Entry<String, RankValue> uri : uris) {
      String storagePath = uri.getKey();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/LowestIOSampleCostSelectStorageStrategy.java`
#### Snippet
```java
  public synchronized RemoteStorageInfo pickStorage(String appId) {
    LOG.info("The sorted remote path list is: {}", uris);
    for (Map.Entry<String, RankValue> uri : uris) {
      String storagePath = uri.getKey();
      if (availableRemoteStorageInfo.containsKey(storagePath)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
  public synchronized RemoteStorageInfo pickStorage(String appId) {
    boolean isUnhealthy =
        uris.stream().noneMatch(rv -> rv.getValue().getCostTime().get() != Long.MAX_VALUE);
    if (!isUnhealthy) {
      // If there is only one unhealthy path, then filter that path
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
    if (!isUnhealthy) {
      // If there is only one unhealthy path, then filter that path
      uris = uris.stream().filter(rv -> rv.getValue().getCostTime().get() != Long.MAX_VALUE).sorted(
          Comparator.comparingInt(entry -> entry.getValue().getAppNum().get())).collect(Collectors.toList());
    } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
    if (!isUnhealthy) {
      // If there is only one unhealthy path, then filter that path
      uris = uris.stream().filter(rv -> rv.getValue().getCostTime().get() != Long.MAX_VALUE).sorted(
          Comparator.comparingInt(entry -> entry.getValue().getAppNum().get())).collect(Collectors.toList());
    } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
    } else {
      // If all paths are unhealthy, assign paths according to the number of apps
      uris = uris.stream().sorted(Comparator.comparingInt(
          entry -> entry.getValue().getAppNum().get())).collect(Collectors.toList());
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
    } else {
      // If all paths are unhealthy, assign paths according to the number of apps
      uris = uris.stream().sorted(Comparator.comparingInt(
          entry -> entry.getValue().getAppNum().get())).collect(Collectors.toList());
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
          entry -> entry.getValue().getAppNum().get())).collect(Collectors.toList());
    }
    LOG.info("The sorted remote path list is: {}", uris);
    for (Map.Entry<String, RankValue> entry : uris) {
      String storagePath = entry.getKey();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `uris` accessed in synchronized context
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
    }
    LOG.info("The sorted remote path list is: {}", uris);
    for (Map.Entry<String, RankValue> entry : uris) {
      String storagePath = entry.getKey();
      if (availableRemoteStorageInfo.containsKey(storagePath)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bufferPool` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  public synchronized void commitShuffleTask(String appId, int shuffleId) {
    RangeMap<Integer, ShuffleBuffer> buffers = bufferPool.get(appId).get(shuffleId);
    for (Map.Entry<Range<Integer>, ShuffleBuffer> entry : buffers.asMapOfRanges().entrySet()) {
      ShuffleBuffer buffer = entry.getValue();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bufferPool` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  public synchronized void flush(Map<String, Set<Integer>> requiredFlush) {
    for (Map.Entry<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>>
        appIdToBuffers : bufferPool.entrySet()) {
      String appId = appIdToBuffers.getKey();
      if (requiredFlush.containsKey(appId)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `usedMemory` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  public synchronized boolean requireMemory(long size, boolean isPreAllocated) {
    if (capacity - usedMemory.get() >= size) {
      usedMemory.addAndGet(size);
      ShuffleServerMetrics.gaugeUsedBufferSize.set(usedMemory.get());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `usedMemory` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  public synchronized boolean requireMemory(long size, boolean isPreAllocated) {
    if (capacity - usedMemory.get() >= size) {
      usedMemory.addAndGet(size);
      ShuffleServerMetrics.gaugeUsedBufferSize.set(usedMemory.get());
      if (isPreAllocated) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `usedMemory` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    if (capacity - usedMemory.get() >= size) {
      usedMemory.addAndGet(size);
      ShuffleServerMetrics.gaugeUsedBufferSize.set(usedMemory.get());
      if (isPreAllocated) {
        requirePreAllocatedSize(size);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `usedMemory` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      return true;
    }
    LOG.debug("Require memory failed with " + size + " bytes, usedMemory[" + usedMemory.get()
        + "] include preAllocation[" + preAllocatedSize.get()
        + "], inFlushSize[" + inFlushSize.get() + "]");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `preAllocatedSize` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    }
    LOG.debug("Require memory failed with " + size + " bytes, usedMemory[" + usedMemory.get()
        + "] include preAllocation[" + preAllocatedSize.get()
        + "], inFlushSize[" + inFlushSize.get() + "]");
    return false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inFlushSize` accessed in synchronized context
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    LOG.debug("Require memory failed with " + size + " bytes, usedMemory[" + usedMemory.get()
        + "] include preAllocation[" + preAllocatedSize.get()
        + "], inFlushSize[" + inFlushSize.get() + "]");
    return false;
  }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/AccessManager.java`
#### Snippet
```java
      }
      String resultUuid = accessCheckResult.getUuid();
      if (!"".equals(resultUuid)) {
        uuid = resultUuid;
      }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/access/checker/AccessQuotaChecker.java`
#### Snippet
```java
    final String user = accessInfo.getUser();
    // low version client user attribute is an empty string
    if (!"".equals(user) && quotaManager.checkQuota(user, uuid)) {
      String msg = "Denied by AccessQuotaChecker => "
          + "User: " + user + ", current app num is: " + quotaManager.getCurrentUserAndApp().get(user).size()
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `JvmMetrics` has only 'static' members, and a 'public' constructor
in `common/src/main/java/org/apache/uniffle/common/metrics/JvmMetrics.java`
#### Snippet
```java
import io.prometheus.client.hotspot.VersionInfoExports;

public class JvmMetrics {
  private static CollectorRegistry collectorRegistry;
  private static boolean initialized = false;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ClientConfManager.java`
#### Snippet
```java
      String confItem = item.trim();
      if (!StringUtils.isEmpty(confItem)) {
        String[] confKV = confItem.split(WHITESPACE_REGEX);
        if (confKV.length == 2) {
          if (CoordinatorConf.COORDINATOR_REMOTE_STORAGE_PATH.key().equals(confKV[0])) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      return "";
    }
    return hostName.replaceAll("[\\.-]", "_");
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `storage/src/main/java/org/apache/uniffle/storage/common/ShuffleSegment.java`
#### Snippet
```java
package org.apache.uniffle.storage.common;

public abstract class ShuffleSegment implements java.io.Serializable {

}
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
        return 1;
      }
      return -1;
    });
    return eventIdList;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractSelectStorageStrategy()` of an abstract class should not be declared 'public'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AbstractSelectStorageStrategy.java`
#### Snippet
```java
  protected List<Map.Entry<String, RankValue>> uris;

  public AbstractSelectStorageStrategy(
      Map<String, RankValue> remoteStoragePathRankValue,
      CoordinatorConf conf) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAssignmentStrategy()` of an abstract class should not be declared 'public'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/AbstractAssignmentStrategy.java`
#### Snippet
```java
  private SelectPartitionStrategy selectPartitionStrategy;

  public AbstractAssignmentStrategy(CoordinatorConf conf) {
    this.conf = conf;
    loadHostAssignmentStrategy();
```

### NonProtectedConstructorInAbstractClass
Constructor `ReconfigurableBase()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/uniffle/common/config/ReconfigurableBase.java`
#### Snippet
```java
  private final AtomicLong lastModify = new AtomicLong(0L);

  public ReconfigurableBase(RssConf rssConf) {
    this.rssConf = rssConf;
    scheduledExecutorService = ThreadUtils.getDaemonSingleThreadScheduledExecutor("ReconfigurableThread");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMetricReporter()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/uniffle/common/metrics/AbstractMetricReporter.java`
#### Snippet
```java
  protected List<CollectorRegistry> registryList = new ArrayList<>();

  public AbstractMetricReporter(RssConf conf, String instanceId) {
    this.conf = conf;
    this.instanceId = instanceId;
```

### NonProtectedConstructorInAbstractClass
Constructor `GRPCMetrics()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/uniffle/common/metrics/GRPCMetrics.java`
#### Snippet
```java
  protected String tags;

  public GRPCMetrics(String tags) {
    this.tags = tags;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DataSkippableReadHandler()` of an abstract class should not be declared 'public'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/DataSkippableReadHandler.java`
#### Snippet
```java
  protected Roaring64NavigableMap expectTaskIds;

  public DataSkippableReadHandler(
      String appId,
      int shuffleId,
```

### NonProtectedConstructorInAbstractClass
Constructor `PurgeEvent()` of an abstract class should not be declared 'public'
in `server/src/main/java/org/apache/uniffle/server/event/PurgeEvent.java`
#### Snippet
```java
  private List<Integer> shuffleIds;

  public PurgeEvent(String appId, String user, List<Integer> shuffleIds) {
    this.appId = appId;
    this.user = user;
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleStorageManager()` of an abstract class should not be declared 'public'
in `server/src/main/java/org/apache/uniffle/server/storage/SingleStorageManager.java`
#### Snippet
```java
  private final long eventSizeThresholdL3;

  public SingleStorageManager(ShuffleServerConf conf) {
    writeSlowThreshold = conf.getSizeAsBytes(ShuffleServerConf.SERVER_WRITE_SLOW_THRESHOLD);
    eventSizeThresholdL1 = conf.getSizeAsBytes(ShuffleServerConf.SERVER_EVENT_SIZE_THRESHOLD_L1);
```

### NonProtectedConstructorInAbstractClass
Constructor `FallbackBasedStorageManagerSelector()` of an abstract class should not be declared 'public'
in `server/src/main/java/org/apache/uniffle/server/storage/multi/FallbackBasedStorageManagerSelector.java`
#### Snippet
```java
  private final AbstractStorageManagerFallbackStrategy fallbackStrategy;

  public FallbackBasedStorageManagerSelector(
      StorageManager warmStorageManager,
      StorageManager coldStorageManager,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStorageManagerFallbackStrategy()` of an abstract class should not be declared 'public'
in `server/src/main/java/org/apache/uniffle/server/storage/AbstractStorageManagerFallbackStrategy.java`
#### Snippet
```java
  protected ShuffleServerConf conf;

  public AbstractStorageManagerFallbackStrategy(ShuffleServerConf conf) {
    this.conf = conf;
  }
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
    }
    Set<ShuffleServerInfo> shuffleServerInfos = appServerMap.get(shuffleId);
    if (shuffleServerInfos == null) {
      shuffleServerInfos = Sets.newConcurrentHashSet();
      appServerMap.put(shuffleId, shuffleServerInfos);
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
2 arguments are expected
in `server/src/main/java/org/apache/uniffle/server/storage/MultiStorageManager.java`
#### Snippet
```java
    try {
      constructor = klass.getConstructor(conf.getClass(), Boolean.TYPE);
      instance = (AbstractStorageManagerFallbackStrategy) constructor.newInstance(conf);
    } catch (NoSuchMethodException e) {
      constructor = klass.getConstructor(conf.getClass());
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/PartitionBalanceAssignmentStrategy.java`
#### Snippet
```java
      int averagePartitions = totalPartitionNum * replica / clusterManager.getShuffleNodesMax();
      int assignPartitions = Math.max(averagePartitions, 1);
      nodes.sort(new Comparator<ServerNode>() {
        @Override
        public int compare(ServerNode o1, ServerNode o2) {
```

### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileServerReadHandler.java`
#### Snippet
```java
    try {
      // get all index files
      indexFiles = baseFolder.listFiles(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/uniffle/common/rpc/GrpcServer.java`
#### Snippet
```java
      server.start();
      listenPort = server.getPort();
    } catch (Exception e) {
      throw e;
    }
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `server/src/main/java/org/apache/uniffle/server/netty/StreamServer.java`
#### Snippet
```java
      LOG.info("bind localAddress is " + channelFuture.channel().localAddress());
      LOG.info("Start stream server successfully with port " + port);
    } catch (Exception e) {
      throw e;
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `estimateTaskConcurrency`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/util/CoordinatorUtils.java`
#### Snippet
```java
      return res;
    }
    estimateTaskConcurrency = Math.min(totalPartitionNum, estimateTaskConcurrency);
    int rangePerGroup = estimateTaskConcurrency > serverNum * partitionNumPerRange
                            ? Math.floorDiv(estimateTaskConcurrency, serverNum * partitionNumPerRange) : 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `idx`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/util/CoordinatorUtils.java`
#### Snippet
```java

  public static int nextIdx(int idx, int size) {
    ++idx;
    if (idx >= size) {
      idx = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `idx`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/util/CoordinatorUtils.java`
#### Snippet
```java
    ++idx;
    if (idx >= size) {
      idx = 0;
    }
    return idx;
```

### AssignmentToMethodParameter
Assignment to method parameter `numCores`
in `common/src/main/java/org/apache/uniffle/common/util/NettyUtils.java`
#### Snippet
```java
      boolean allowDirectBufs, boolean allowCache, int numCores) {
    if (numCores == 0) {
      numCores = Runtime.getRuntime().availableProcessors();
    }
    return new PooledByteBufAllocator(
```

### AssignmentToMethodParameter
Assignment to method parameter `filename`
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java

      LOGGER.info("Conf file is null use {}'s server.conf", rssHome);
      filename = rssHome + "/server.conf";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `storage/src/main/java/org/apache/uniffle/storage/common/DefaultStorageMediaProvider.java`
#### Snippet
```java
  FileStore getFileStore(Path path) throws IOException {
    while (!Files.exists(path)) {
      path = path.getParent();
      if (path == null) {
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `retryMax`
in `client/src/main/java/org/apache/uniffle/client/factory/ShuffleClientFactory.java`
#### Snippet
```java
    // We need retry less times in this case for let the first round fail fast.
    if (replicaSkipEnabled && replica > replicaWrite) {
      retryMax = retryMax / 2;
    }
    return new ShuffleWriteClientImpl(
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bitmap`
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorageMeta.java`
#### Snippet
```java
    if (shuffleMeta != null) {
      RoaringBitmap bitmap = shuffleMeta.partitionBitmap;
      synchronized (bitmap) {
        partitions.forEach(bitmap::add);
      }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bitmap`
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorageMeta.java`
#### Snippet
```java
    if (shuffleMeta != null) {
      RoaringBitmap bitmap = shuffleMeta.uploadedPartitionBitmap;
      synchronized (bitmap) {
        partitions.forEach(bitmap::add);
      }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bitmap`
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
    shuffleToBlockIds.putIfAbsent(shuffleId, Roaring64NavigableMap.bitmapOf());
    Roaring64NavigableMap bitmap = shuffleToBlockIds.get(shuffleId);
    synchronized (bitmap) {
      for (ShufflePartitionedBlock spb : blocks) {
        bitmap.addLong(spb.getBlockId());
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `lock`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
    ShuffleTaskInfo shuffleTaskInfo = shuffleTaskInfos.computeIfAbsent(appId, x -> new ShuffleTaskInfo(appId));
    Object lock = shuffleTaskInfo.getCommitLocks().computeIfAbsent(shuffleId, x -> new Object());
    synchronized (lock) {
      long commitTimeout = conf.get(ShuffleServerConf.SERVER_COMMIT_TIMEOUT);
      if (System.currentTimeMillis() - start > commitTimeout) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cachedBlockIds`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
        throw new RssException("Shuffle data commit timeout for " + commitTimeout + " ms");
      }
      synchronized (cachedBlockIds) {
        cloneBlockIds = RssUtils.cloneBitMap(cachedBlockIds);
      }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `committedBlockIds`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
      while (true) {
        committedBlockIds = shuffleFlushManager.getCommittedBlockIds(appId, shuffleId);
        synchronized (committedBlockIds) {
          cloneCommittedBlockIds = RssUtils.cloneBitMap(committedBlockIds);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bitmap`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java

    long size = 0L;
    synchronized (bitmap) {
      for (ShufflePartitionedBlock spb : spbs) {
        bitmap.addLong(spb.getBlockId());
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bitmap`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
      Integer partitionId = entry.getKey();
      Roaring64NavigableMap bitmap = blockIds[partitionId % bitmapNum];
      synchronized (bitmap) {
        for (long blockId : entry.getValue()) {
          bitmap.addLong(blockId);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AbstractSelectStorageStrategy.java`
#### Snippet
```java
   */
  protected Comparator<Map.Entry<String, RankValue>> getComparator() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/ShuffleDataResult.java`
#### Snippet
```java
  public byte[] getData() {
    if (data == null) {
      return null;
    }
    if (data.hasArray()) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/util/ByteBufUtils.java`
#### Snippet
```java
    int length = buf.readInt();
    if (length == -1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/netty/TransportFrameDecoder.java`
#### Snippet
```java
    long frameSize = decodeFrameSize();
    if (frameSize == UNKNOWN_FRAME_SIZE || totalSize < frameSize) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/metrics/MetricReporterFactory.java`
#### Snippet
```java
    String name = conf.get(RssBaseConf.RSS_METRICS_REPORTER_CLASS);
    if (StringUtils.isEmpty(name)) {
      return null;
    }
    Class<?> klass = Class.forName(name);
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      if (rssHome == null) {
        LOGGER.error("Both conf file and RSS_HOME env is null");
        return null;
      }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    if (!file.exists()) {
      LOGGER.error("Properties file " + filename + " does not exist");
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    if (!file.isFile()) {
      LOGGER.error("Properties file " + filename + " is not a normal file");
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/uniffle/common/security/NoOpSecurityContext.java`
#### Snippet
```java
  @Override
  public String getContextLoginUser() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/common/DefaultStorageMediaProvider.java`
#### Snippet
```java
      path = path.getParent();
      if (path == null) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/AbstractClientReadHandler.java`
#### Snippet
```java
  @Override
  public ShuffleDataResult readShuffleData() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorageMeta.java`
#### Snippet
```java
  public ReadWriteLock getLock(String shuffleKey) {
    ShuffleMeta shuffleMeta = getShuffleMeta(shuffleKey);
    return shuffleMeta == null ? null : shuffleMeta.getLock();
  }

```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/DataSkippableReadHandler.java`
#### Snippet
```java
      ShuffleIndexResult shuffleIndexResult = readShuffleIndex();
      if (shuffleIndexResult == null || shuffleIndexResult.isEmpty()) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleReadHandler.java`
#### Snippet
```java
    if (expectedLength <= 0) {
      LOG.warn("Invalid data segment is {} from file {}.data", shuffleDataSegment, filePrefix);
      return null;
    }

```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleReadHandler.java`
#### Snippet
```java
      LOG.warn("Fail to read expected[{}] data, actual[{}] and segment is {} from file {}.data",
          expectedLength, length, shuffleDataSegment, filePrefix);
      return null;
    }

```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleReadHandler.java`
#### Snippet
```java
      LOG.warn("Shuffle data is empty, expected length {}, data length {}, segment {} in file {}.data",
          expectedLength, length, shuffleDataSegment, filePrefix);
      return null;
    }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
    // empty data expected, just return null
    if (blockIdBitmap.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
    // All blocks are processed, so just return
    if (pendingBlockIds.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
    if (bufferSegmentQueue.isEmpty()) {
      if (read() <= 0) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/ComposedClientReadHandler.java`
#### Snippet
```java
  public ShuffleDataResult readShuffleData() {
    ClientReadHandler handler = handlerMap.computeIfAbsent(currentTier,
        key -> supplierMap.getOrDefault(key, () -> null).get());
    if (handler == null) {
      throw new RssException("Unexpected null when getting " + currentTier.name() + " handler");
```

### ReturnNull
Return of `null`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/ComposedClientReadHandler.java`
#### Snippet
```java
        currentTier = currentTier.next();
      } else {
        return null;
      }
      return readShuffleData();
```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/storage/HdfsStorageManager.java`
#### Snippet
```java
        // outside should deal with null situation
        // todo: it's better to have a fake storage for null situation
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
    Map<Integer, Roaring64NavigableMap[]> shuffleIdToPartitions = partitionsToBlockIds.get(appId);
    if (shuffleIdToPartitions == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    if (shuffleIdToBuffers == null) {
      return null;
    }
    RangeMap<Integer, ShuffleBuffer> rangeToBuffers = shuffleIdToBuffers.get(shuffleId);
```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    RangeMap<Integer, ShuffleBuffer> rangeToBuffers = shuffleIdToBuffers.get(shuffleId);
    if (rangeToBuffers == null) {
      return null;
    }
    Entry<Range<Integer>, ShuffleBuffer> entry = rangeToBuffers.getEntry(partitionId);
```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    Entry<Range<Integer>, ShuffleBuffer> entry = rangeToBuffers.getEntry(partitionId);
    if (entry == null) {
      return null;
    }
    return entry;
```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
        appId, shuffleId, partitionId);
    if (entry == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    ShuffleBuffer buffer = entry.getValue();
    if (buffer == null) {
      return null;
    }
    return buffer.getShuffleData(blockId, readBufferSize, expectedTaskIds);
```

### ReturnNull
Return of `null`
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      ShuffleDataDistributionType dataDistributionType) {
    if (blocks.isEmpty()) {
      return null;
    }
    // buffer will be cleared, and new list must be created for async flush
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `pool` is redundant
in `common/src/main/java/org/apache/uniffle/common/web/JettyServer.java`
#### Snippet
```java
    int corePoolSize = conf.getInteger(RssBaseConf.JETTY_CORE_POOL_SIZE);
    int maxPoolSize = conf.getInteger(RssBaseConf.JETTY_MAX_POOL_SIZE);
    ExecutorThreadPool pool = new ExecutorThreadPool(
        new ThreadPoolExecutor(corePoolSize, maxPoolSize, 60L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(), ThreadUtils.getThreadFactory("Jetty")));
```

### UnnecessaryLocalVariable
Local variable `newConverter` is redundant
in `common/src/main/java/org/apache/uniffle/common/config/ConfigOptions.java`
#### Snippet
```java
    public ListConfigOptionBuilder<E> checkValue(Function<E, Boolean> checkValueFunc, String errMsg) {
      final Function<Object, List<E>> listConverFunc = asListConverter;
      Function<Object, List<E>> newConverter = (v) -> {
        List<E> list = listConverFunc.apply(v);
        if (list.stream().anyMatch(x -> !checkValueFunc.apply(x))) {
```

### UnnecessaryLocalVariable
Local variable `shufflePath` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileDeleteHandler.java`
#### Snippet
```java
  public void delete(String[] shuffleDataStoredPath, String appId, String user) {
    for (String basePath : shuffleDataStoredPath) {
      final String shufflePath = basePath;
      long start = System.currentTimeMillis();
      try {
```

### UnnecessaryLocalVariable
Local variable `memoryClientReadHandler` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/factory/ShuffleHandlerFactory.java`
#### Snippet
```java
      expectTaskIds = RssUtils.generateTaskIdBitMap(realExceptBlockIds, request.getIdHelper());
    }
    ClientReadHandler memoryClientReadHandler = new MemoryClientReadHandler(
        request.getAppId(),
        request.getShuffleId(),
```

### UnnecessaryLocalVariable
Local variable `writer` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HdfsShuffleWriteHandler.java`
#### Snippet
```java
  public HdfsFileWriter createWriter(String fileName) throws IOException, IllegalStateException {
    Path path = new Path(basePath, fileName);
    HdfsFileWriter writer = new HdfsFileWriter(fileSystem, path, hadoopConf);
    return writer;
  }
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `common/src/main/java/org/apache/uniffle/common/config/RssConf.java`
#### Snippet
```java
    Optional<Object> rawValue = getRawValueFromOption(option);
    Class<?> clazz = option.getClazz();
    Optional<T> value = rawValue.map(v -> option.convertValue(v, clazz));
    return value;
  }
```

### UnnecessaryLocalVariable
Local variable `tt` is redundant
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/CoordinatorGrpcClient.java`
#### Snippet
```java
          .stream()
          .collect(Collectors.toMap(RemoteStorageConfItem::getKey, RemoteStorageConfItem::getValue));
      RssFetchRemoteStorageResponse tt = new RssFetchRemoteStorageResponse(
          StatusCode.SUCCESS,
          new RemoteStorageInfo(rpcResponse.getRemoteStorage().getPath(), remoteStorageConf));
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
    while (retryNum < maxRetryAttempts) {
      try {
        ReportShuffleResultResponse response = getBlockingStub().reportShuffleResult(rpcRequest);
        return response;
      } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
    while (retryNum <= maxRetryAttempts) {
      try {
        ShuffleCommitResponse response = getBlockingStub().commitShuffleTask(request);
        return response;
      } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `instance` is redundant
in `server/src/main/java/org/apache/uniffle/server/storage/MultiStorageManager.java`
#### Snippet
```java
        conf.getClass()
    );
    StorageManagerSelector instance = (StorageManagerSelector) constructor.newInstance(
        warmStorageManager,
        coldStorageManager,
```

### UnnecessaryLocalVariable
Local variable `hdfsStorage` is redundant
in `server/src/main/java/org/apache/uniffle/server/storage/HdfsStorageManager.java`
#### Snippet
```java
        }
      }
      HdfsStorage hdfsStorage = new HdfsStorage(remoteStorage, remoteStorageHadoopConf);
      return hdfsStorage;
    });
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `common/src/main/java/org/apache/uniffle/common/util/RetryUtils.java`
#### Snippet
```java
          LOG.info("Retry due to Throwable, " + t.getClass().getName() + " " + t.getMessage());
          LOG.info("Waiting " + intervalMs + " milliseconds before next connection attempt.");
          Thread.sleep(intervalMs);
          if (callBack != null) {
            callBack.execute();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
        long backoffTime =
            Math.min(retryIntervalMax, backOffBase * (1L << Math.min(retry, 16)) + random.nextInt(backOffBase));
        Thread.sleep(backoffTime);
      } catch (Exception e) {
        LOG.warn("Exception happened when require pre allocation from " + host + ":" + port, e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
      LOG.info("Shuffle server is decommissioning, remaining {} applications not finished.", remainApplicationNum);
      try {
        Thread.sleep(checkInterval);
      } catch (InterruptedException e) {
        LOG.warn("Interrupted while waiting for decommission to finish");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
          break;
        }
        Thread.sleep(checkInterval);
        if (System.currentTimeMillis() - start > commitTimeout) {
          throw new RssException("Shuffle data commit timeout for " + commitTimeout + " ms");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      ShuffleServerMetrics.counterTotalRequireReadMemoryRetryNum.inc();
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        LOG.warn("Error happened when require memory", e);
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
    };
    thread.setDaemon(true);
    thread.start();
  }

```

### ThreadStartInConstruction
Call to `start()` during object construction
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
    thread.setName("clearResourceThread");
    thread.setDaemon(true);
    thread.start();
  }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    String ip = System.getenv("RSS_IP");
    if (ip != null) {
      if (!InetAddresses.isInetAddress(ip)) {
        throw new RssException("Environment RSS_IP: " + ip + " is wrong format");
      }
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    String ip = System.getenv("RSS_IP");
    if (ip != null) {
      if (!InetAddresses.isInetAddress(ip)) {
        throw new RssException("Environment RSS_IP: " + ip + " is wrong format");
      }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  public StatusCode registerBuffer(String appId, int shuffleId, int startPartition, int endPartition) {
    bufferPool.putIfAbsent(appId, JavaUtils.newConcurrentMap());
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.putIfAbsent(shuffleId, TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    bufferPool.putIfAbsent(appId, JavaUtils.newConcurrentMap());
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.putIfAbsent(shuffleId, TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    bufferPool.putIfAbsent(appId, JavaUtils.newConcurrentMap());
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.putIfAbsent(shuffleId, TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.putIfAbsent(shuffleId, TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
      ShuffleServerMetrics.counterTotalPartitionNum.inc();
```

### UnstableApiUsage
'get(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    shuffleIdToBuffers.putIfAbsent(shuffleId, TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
      ShuffleServerMetrics.counterTotalPartitionNum.inc();
      ShuffleServerMetrics.gaugeTotalPartitionNum.inc();
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      ShuffleServerMetrics.counterTotalPartitionNum.inc();
      ShuffleServerMetrics.gaugeTotalPartitionNum.inc();
      bufferRangeMap.put(Range.closed(startPartition, endPartition), new ShuffleBuffer(bufferSize));
    } else {
      LOG.warn("Already register for appId[" + appId + "], shuffleId[" + shuffleId + "], startPartition["
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  public Entry<Range<Integer>, ShuffleBuffer> getShuffleBufferEntry(
      String appId, int shuffleId, int partitionId) {
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    if (shuffleIdToBuffers == null) {
      return null;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      return null;
    }
    RangeMap<Integer, ShuffleBuffer> rangeToBuffers = shuffleIdToBuffers.get(shuffleId);
    if (rangeToBuffers == null) {
      return null;
```

### UnstableApiUsage
'getEntry(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      return null;
    }
    Entry<Range<Integer>, ShuffleBuffer> entry = rangeToBuffers.getEntry(partitionId);
    if (entry == null) {
      return null;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  public synchronized void commitShuffleTask(String appId, int shuffleId) {
    RangeMap<Integer, ShuffleBuffer> buffers = bufferPool.get(appId).get(shuffleId);
    for (Map.Entry<Range<Integer>, ShuffleBuffer> entry : buffers.asMapOfRanges().entrySet()) {
      ShuffleBuffer buffer = entry.getValue();
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  public synchronized void commitShuffleTask(String appId, int shuffleId) {
    RangeMap<Integer, ShuffleBuffer> buffers = bufferPool.get(appId).get(shuffleId);
    for (Map.Entry<Range<Integer>, ShuffleBuffer> entry : buffers.asMapOfRanges().entrySet()) {
      ShuffleBuffer buffer = entry.getValue();
      Range<Integer> range = entry.getKey();
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  // flush the buffer with required map which is <appId -> shuffleId>
  public synchronized void flush(Map<String, Set<Integer>> requiredFlush) {
    for (Map.Entry<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>>
        appIdToBuffers : bufferPool.entrySet()) {
      String appId = appIdToBuffers.getKey();
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      String appId = appIdToBuffers.getKey();
      if (requiredFlush.containsKey(appId)) {
        for (Map.Entry<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers :
            appIdToBuffers.getValue().entrySet()) {
          int shuffleId = shuffleIdToBuffers.getKey();
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
          if (requiredShuffleId != null && requiredShuffleId.contains(shuffleId)) {
            for (Map.Entry<Range<Integer>, ShuffleBuffer> rangeEntry :
                shuffleIdToBuffers.getValue().asMapOfRanges().entrySet()) {
              Range<Integer> range = rangeEntry.getKey();
              flushBuffer(
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  public void removeBuffer(String appId) {
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    if (shuffleIdToBuffers == null) {
      return;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  public void removeBufferByShuffleId(String appId, Collection<Integer> shuffleIds) {
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    if (shuffleIdToBuffers == null) {
      return;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
      long size = 0;

      RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.remove(shuffleId);
      if (bufferRangeMap == null) {
        continue;
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
        continue;
      }
      Collection<ShuffleBuffer> buffers = bufferRangeMap.asMapOfRanges().values();
      if (buffers != null) {
        for (ShuffleBuffer buffer : buffers) {
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private AtomicLong readDataMemory = new AtomicLong(0L);
  // appId -> shuffleId -> partitionId -> ShuffleBuffer to avoid too many appId
  protected Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> bufferPool;
  // appId -> shuffleId -> shuffle size in buffer
  protected Map<String, Map<Integer, AtomicLong>> shuffleSizeMap = JavaUtils.newConcurrentMap();
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java

  @VisibleForTesting
  public Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> getBufferPool() {
    return bufferPool;
  }
```

