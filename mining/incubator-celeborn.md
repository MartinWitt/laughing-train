# incubator-celeborn 
 
# Bad smells
I found 318 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 43 | false |
| PublicFieldAccessedInSynchronizedContext | 23 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 22 | false |
| AssignmentToMethodParameter | 18 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| SynchronizeOnThis | 13 | false |
| ReturnNull | 12 | false |
| UnnecessarySuperQualifier | 11 | false |
| DataFlowIssue | 11 | false |
| BoundedWildcard | 9 | false |
| UnusedAssignment | 9 | false |
| ConstantValue | 9 | false |
| IOResource | 8 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| IgnoreResultOfCall | 7 | false |
| NonProtectedConstructorInAbstractClass | 7 | true |
| EmptyMethod | 6 | false |
| BusyWait | 6 | false |
| UnstableApiUsage | 6 | false |
| Convert2MethodRef | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| ThreadStartInConstruction | 4 | false |
| CodeBlock2Expr | 3 | true |
| FieldMayBeStatic | 3 | false |
| UnnecessarySemicolon | 3 | false |
| SynchronizeOnNonFinalField | 3 | false |
| SystemOutErr | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| WhileCanBeForeach | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| InnerClassMayBeStatic | 2 | true |
| RedundantSuppression | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| Convert2Lambda | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| RefusedBequest | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| UnnecessaryReturn | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| NullableProblems | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| NestedAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| FuseStreamOperations | 1 | false |
| DoubleBraceInitialization | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| CatchMayIgnoreException | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| CovariantEquals | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
  public static void timeOutOrMeetCondition(Callable<Boolean> callable) throws Exception {
    int timeout = 10000; // 10s
    while (true) {
      if (callable.call() || timeout < 0) {
        break;
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
    long currentTime = System.currentTimeMillis();
    Iterator<Map.Entry<Long, PushRequestInfo>> iter = outstandingPushes.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Long, PushRequestInfo> entry = iter.next();
      if (entry.getValue().dueTime <= currentTime) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java
      Iterator<Map.Entry<UserIdentifier, UserBufferInfo>> iterator =
          userBufferStatuses.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<UserIdentifier, UserBufferInfo> next = iterator.next();
        UserIdentifier userIdentifier = next.getKey();
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `pushTimeoutChecker` from instance context
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
    synchronized (TransportResponseHandler.class) {
      if (pushTimeoutChecker == null) {
        pushTimeoutChecker =
            ThreadUtils.newDaemonThreadPoolScheduledExecutor(
                "push-timeout-checker", conf.pushDataTimeoutCheckerThreads());
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/BufferStatusHub.java`
#### Snippet
```java

    @Override
    public TimeSlidingNode clone() {
      return new BufferStatusNode(numBytes());
    }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `workerToAllocatedSlots.keySet()` may be replaced with 'entrySet()' iteration
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HAMasterMetaManager.java`
#### Snippet
```java
              .setShuffleKey(shuffleKey)
              .setHostName(hostName);
      for (String workerUniqueId : workerToAllocatedSlots.keySet()) {
        builder.putWorkerAllocations(
            workerUniqueId,
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedShuffleFiles.keySet()` may be replaced with 'entrySet()' iteration
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
  @VisibleForTesting
  public void updateSortedShuffleFilesInDB() {
    for (String shuffleKey : sortedShuffleFiles.keySet()) {
      try {
        sortedFilesDb.put(
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `MapDataPartition` on 'this' is unnecessary in this context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
      }
      while (bufferQueue.bufferAvailable() && !sortedReaders.isEmpty()) {
        BufferRecycler bufferRecycler = new BufferRecycler(MapDataPartition.this::recycle);
        MapDataPartitionReader reader = sortedReaders.poll();
        try {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sortedChunkOffset.size() == 0` can be replaced with 'sortedChunkOffset.isEmpty()'
in `common/src/main/java/org/apache/celeborn/common/util/ShuffleBlockInfoUtils.java`
#### Snippet
```java
      if (blockInfos != null) {
        for (ShuffleBlockInfo info : blockInfos) {
          if (sortedChunkOffset.size() == 0) {
            sortedChunkOffset.add(info.offset);
          }
```

### SizeReplaceableByIsEmpty
`results.size() > 0` can be replaced with '!results.isEmpty()'
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
      closed = true;
    }
    if (results.size() > 0) {
      results.forEach(ReferenceCounted::release);
    }
```

### SizeReplaceableByIsEmpty
`userBufferStatuses.size() == 0` can be replaced with 'userBufferStatuses.isEmpty()'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java
   */
  public boolean isUserCongested(UserIdentifier userIdentifier) {
    if (userBufferStatuses.size() == 0) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`results.size() > 0` can be replaced with '!results.isEmpty()'
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
      logger.warn("close hdfs input stream failed.", e);
    }
    if (results.size() > 0) {
      results.forEach(ReferenceCounted::release);
    }
```

### SizeReplaceableByIsEmpty
`userBufferStatuses.size() == 0` can be replaced with 'userBufferStatuses.isEmpty()'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java
   */
  public long getPotentialConsumeSpeed() {
    if (userBufferStatuses.size() == 0) {
      return 0;
    }
```

### SizeReplaceableByIsEmpty
`_deque.size() == 0` can be replaced with '_deque.isEmpty()'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java

  public synchronized void add(long currentTimestamp, N newNode) {
    if (_deque.size() == 0) {
      _deque.add(Pair.of(currentTimestamp, (N) newNode.clone()));
      sumNode = (N) newNode.clone();
```

### SizeReplaceableByIsEmpty
`fileGroups.partitionGroups.size() == 0` can be replaced with 'fileGroups.partitionGroups.isEmpty()'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
    ReduceFileGroups fileGroups = loadFileGroup(applicationId, shuffleKey, shuffleId, partitionId);

    if (fileGroups.partitionGroups.size() == 0
        || !fileGroups.partitionGroups.containsKey(partitionId)) {
      logger.warn("Shuffle data is empty for shuffle {} partition {}.", shuffleId, partitionId);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("DelayedStreamId{");
      sb.append("createMillis=").append(createMillis);
      sb.append(", streamId=").append(streamId);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DataPartitionReader{");
    sb.append("startPartitionIndex=").append(startPartitionIndex);
    sb.append(", endPartitionIndex=").append(endPartitionIndex);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
  public static void shuffleArray(int[] arr, int[] inversed) {
    if (arr == null || inversed == null || arr.length != inversed.length) {
      return;
    } else {
      for (int i = 0; i < arr.length; i++) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ByteBuf`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferQueue.java`
#### Snippet
```java
   * buffer queue is released.
   */
  public void add(Collection<ByteBuf> availableBuffers) {
    synchronized (buffers) {
      if (!isReleased) {
```

### BoundedWildcard
Can generalize to `? super SingleFileSnapshotInfo`
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java

        private boolean filePatternMatches(
            Pattern pattern, List<SingleFileSnapshotInfo> result, Path filePath) {
          Matcher md5Matcher = pattern.matcher(filePath.getFileName().toString());
          if (md5Matcher.matches()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `common/src/main/java/org/apache/celeborn/common/util/ShuffleBlockInfoUtils.java`
#### Snippet
```java
      int endMapIndex,
      long fetchChunkSize,
      Map<Integer, List<ShuffleBlockInfo>> indexMap) {
    List<Long> sortedChunkOffset = new ArrayList<>();
    ShuffleBlockInfo lastBlock = null;
```

### BoundedWildcard
Can generalize to `? super ByteBuf`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferRecycler.java`
#### Snippet
```java
  private Consumer<ByteBuf> recycleConsumer;

  public BufferRecycler(Consumer<ByteBuf> recycleConsumer) {
    this.recycleConsumer = recycleConsumer;
  }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `client/src/main/java/org/apache/celeborn/client/write/DataPusher.java`
#### Snippet
```java
      CelebornConf conf,
      ShuffleClient client,
      Consumer<Integer> afterPush,
      LongAdder[] mapStatusLengths)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? super Long`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java

  public long registerStream(
      Consumer<Long> callback,
      Channel channel,
      int initialCredit,
```

### BoundedWildcard
Can generalize to `? extends C`
in `common/src/main/java/org/apache/celeborn/reflect/DynConstructors.java`
#### Snippet
```java
    private final Class<? extends C> constructed;

    private Ctor(Constructor<C> constructor, Class<? extends C> constructed) {
      super(null, "newInstance");
      this.ctor = constructor;
```

### BoundedWildcard
Can generalize to `? super Long`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
      int threadsPerMountPoint,
      FileInfo fileInfo,
      Consumer<Long> recycleStream,
      int minBuffersToTriggerRead)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? extends PartitionLocation`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java

  private boolean waitRevivedLocation(
      ConcurrentHashMap<Integer, PartitionLocation> map, int partitionId, int epoch) {
    PartitionLocation currentLocation = map.get(partitionId);
    if (currentLocation != null && currentLocation.getEpoch() > epoch) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ConfigProvider` has no concrete subclass
in `common/src/main/java/org/apache/celeborn/common/network/util/ConfigProvider.java`
#### Snippet
```java
 * Provides a mechanism for constructing a {@link TransportConf} using some sort of configuration.
 */
public abstract class ConfigProvider {
  /** Obtains the value of the given config, throws NoSuchElementException if it doesn't exist. */
  public abstract String get(String name);
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/MessageWithHeader.java`
#### Snippet
```java
class MessageWithHeader extends AbstractFileRegion {

  @Nullable private final ManagedBuffer managedBuffer;
  private final ByteBuf header;
  private final int headerLength;
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `common/src/main/java/org/apache/celeborn/common/util/ShutdownHookManager.java`
#### Snippet
```java
      Runtime.getRuntime()
          .addShutdownHook(
              new Thread() {
                @Override
                public void run() {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
      LOG.info("Renaming a snapshot file {} to {}.", tempFile, snapshotFile);
      if (!tempFile.renameTo(snapshotFile)) {
        tempFile.delete();
        LOG.warn("Failed to rename snapshot from {} to {}.", tempFile, snapshotFile);
        return RaftLog.INVALID_LOG_INDEX;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
      storage.loadLatestSnapshot();
    } catch (Exception e) {
      tempFile.delete();
      LOG.warn("Failed to complete snapshot: {}.", snapshotFile, e);
      return RaftLog.INVALID_LOG_INDEX;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java
      }
    } else {
      getFile().delete();
      new File(getIndexPath()).delete();
      new File(getSortedPath()).delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java
    } else {
      getFile().delete();
      new File(getIndexPath()).delete();
      new File(getSortedPath()).delete();
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java
      getFile().delete();
      new File(getIndexPath()).delete();
      new File(getSortedPath()).delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
        File sortedFile = new File(this.sortedFilePath);
        if (sortedFile.exists()) {
          sortedFile.delete();
        }
        File indexFile = new File(this.indexFilePath);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
        File indexFile = new File(this.indexFilePath);
        if (indexFile.exists()) {
          indexFile.delete();
        }
      } else {
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `StateMachine` is the same as one of its superclass' names
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
import org.apache.celeborn.service.deploy.master.clustermeta.ResourceProtos.ResourceResponse;

public class StateMachine extends BaseStateMachine {
  private static final Logger LOG = LoggerFactory.getLogger(StateMachine.class);

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/RegionStart.java`
#### Snippet
```java
          && currentRegionIndex == o.currentRegionIndex
          && isBroadcast == o.isBroadcast
          && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/RegionFinish.java`
#### Snippet
```java
          && partitionUniqueId.equals((o.partitionUniqueId))
          && attemptId == o.attemptId
          && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/ChunkFetchSuccess.java`
#### Snippet
```java
    if (other instanceof ChunkFetchSuccess) {
      ChunkFetchSuccess o = (ChunkFetchSuccess) other;
      return streamChunkSlice.equals(o.streamChunkSlice) && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/PushDataHandShake.java`
#### Snippet
```java
          && numPartitions == o.numPartitions
          && bufferSize == o.bufferSize
          && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/RpcResponse.java`
#### Snippet
```java
    if (other instanceof RpcResponse) {
      RpcResponse o = (RpcResponse) other;
      return requestId == o.requestId && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/PushMergedData.java`
#### Snippet
```java
          && Arrays.equals(partitionUniqueIds, o.partitionUniqueIds)
          && Arrays.equals(batchOffsets, o.batchOffsets)
          && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ReducePartitionFileWriter.java`
#### Snippet
```java

  public synchronized long close() throws IOException {
    return super.close(
        () -> {
          if (!isChunkOffsetValid()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
  @Override
  public synchronized long close() throws IOException {
    return super.close(
        () -> {
          flushIndex();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/RpcRequest.java`
#### Snippet
```java
    if (other instanceof RpcRequest) {
      RpcRequest o = (RpcRequest) other;
      return requestId == o.requestId && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/PushData.java`
#### Snippet
```java
          && shuffleKey.equals(o.shuffleKey)
          && partitionUniqueId.equals((o.partitionUniqueId))
          && super.equals(o);
    }
    return false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/protocol/OneWayMessage.java`
#### Snippet
```java
    if (other instanceof OneWayMessage) {
      OneWayMessage o = (OneWayMessage) other;
      return super.equals(o);
    }
    return false;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
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
`this.createMillis = createMillis + delayTime` could be simplified to 'this.createMillis += delayTime'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java

    public DelayedStreamId(long streamId) {
      this.createMillis = createMillis + delayTime;
      this.streamId = streamId;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`timeout = timeout - 100` could be simplified to 'timeout -= 100'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      }

      timeout = timeout - 100;
      Thread.sleep(100);
    }
```

### ReplaceAssignmentWithOperatorAssignment
`tmpRemainReviveTimes = tmpRemainReviveTimes - 1` could be simplified to 'tmpRemainReviveTimes -= 1'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
              // For blacklisted partition location, Celeborn should not use retry quota.
              if (!pushStatusIsBlacklisted(cause)) {
                tmpRemainReviveTimes = tmpRemainReviveTimes - 1;
              }
              int finalRemainReviveTimes = tmpRemainReviveTimes;
```

### ReplaceAssignmentWithOperatorAssignment
`remainReviveTimes = remainReviveTimes - 1` could be simplified to 'remainReviveTimes -= 1'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
                // For blacklisted partition location, Celeborn should not use retry quota.
                if (!pushStatusIsBlacklisted(cause)) {
                  remainReviveTimes = remainReviveTimes - 1;
                }
                pushDataRetryPool.submit(
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/MetaHandler.java`
#### Snippet
```java
              .getWorkerAllocationsMap()
              .forEach(
                  (k, v) -> {
                    workerAllocations.put(k, new HashMap<>(v.getSlotMap()));
                  });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
  public synchronized long close() throws IOException {
    return super.close(
        () -> {
          flushIndex();
        },
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
                        .setNameFormat(fileInfo.getMountPoint() + "-reader-thread-%d")
                        .setUncaughtExceptionHandler(
                            (t1, t2) -> {
                              logger.warn("StorageFetcherPool thread:{}:{}", t1, t2);
                            })
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `pooledAllocator` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java
  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  protected ByteBufAllocator pooledAllocator;

  public TransportClientFactory(TransportContext context) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `workerGroup` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java

  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  protected ByteBufAllocator pooledAllocator;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `left` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java
public final class LimitedInputStream extends FilterInputStream {
  private final boolean closeWrappedStream;
  private long left;
  private long mark = -1;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `totalSize` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/write/DataBatches.java`
#### Snippet
```java

public class DataBatches {
  private int totalSize = 0;
  private ArrayList<DataBatch> batches = new ArrayList<>();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `batches` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/write/DataBatches.java`
#### Snippet
```java
public class DataBatches {
  private int totalSize = 0;
  private ArrayList<DataBatch> batches = new ArrayList<>();

  public static class DataBatch {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bytesFlushed` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  protected final AtomicInteger numPendingWrites = new AtomicInteger();
  protected long bytesFlushed;

  public final Flusher flusher;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `flushBuffer` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  public final Flusher flusher;
  private final int flushWorkerIndex;
  protected CompositeByteBuf flushBuffer;

  private final long writerCloseTimeoutMs;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mapIdBitMap` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  private final boolean rangeReadFilter;
  protected boolean deleted = false;
  private RoaringBitmap mapIdBitMap = null;
  protected final FlushNotifier notifier = new FlushNotifier();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `channel` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  protected final FileInfo fileInfo;
  private FileChannel channel;
  private volatile boolean closed;
  private volatile boolean destroyed;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastNotifiedTarget` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  private ReadBufferDispatcher readBufferDispatcher;
  private List<ReadBufferTargetChangeListener> readBufferTargetChangeListeners;
  private long lastNotifiedTarget = 0;
  private final ScheduledExecutorService readBufferTargetUpdateService =
      ThreadUtils.newDaemonSingleThreadScheduledExecutor(
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `readBufferTargetChangeListeners` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  private long readBufferTarget = 0;
  private ReadBufferDispatcher readBufferDispatcher;
  private List<ReadBufferTargetChangeListener> readBufferTargetChangeListeners;
  private long lastNotifiedTarget = 0;
  private final ScheduledExecutorService readBufferTargetUpdateService =
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `timestamp` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java

  private static class UserBufferInfo {
    long timestamp;
    final BufferStatusHub bufferStatusHub;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sumNode` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
  private final int intervalPerBucketInMills = 1000;
  private final int maxQueueSize;
  private N sumNode;

  private final LinkedBlockingDeque<Pair<Long, N>> _deque;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `indexChannel` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
  private long regionStartingOffset;
  private long numDataRegions;
  private FileChannel indexChannel;

  public MapPartitionFileWriter(
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `readFinished` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  /** Whether all the data has been successfully read or not. */
  @GuardedBy("lock")
  private boolean readFinished;

  /** Whether this partition reader has been released or not. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isReleased` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  /** Whether this partition reader has been released or not. */
  @GuardedBy("lock")
  protected boolean isReleased;

  /** Exception causing the release of this partition reader. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `streamId` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private FileInfo fileInfo;
  private int INDEX_ENTRY_SIZE = 16;
  private long streamId;
  protected final Object lock = new Object();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `numInUseBuffers` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private Runnable recycleStream;

  private AtomicInteger numInUseBuffers = new AtomicInteger(0);
  private boolean isOpen = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `associatedChannel` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private FileChannel indexFileChannel;

  private Channel associatedChannel;

  private Runnable recycleStream;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataFileChanel` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private final ConcurrentHashMap<Long, MapDataPartitionReader> readers =
      JavaUtils.newConcurrentHashMap();
  private FileChannel dataFileChanel;
  private FileChannel indexChannel;
  private long indexSize;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `indexChannel` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
      JavaUtils.newConcurrentHashMap();
  private FileChannel dataFileChanel;
  private FileChannel indexChannel;
  private long indexSize;
  private volatile boolean isReleased = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `hasReadingTask` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private int maxReadBuffers;
  private int minBuffersToTriggerRead;
  private AtomicBoolean hasReadingTask = new AtomicBoolean(false);

  public MapDataPartition(
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `common/src/main/java/org/apache/celeborn/common/network/server/BaseMessageHandler.java`
#### Snippet
```java

  /** Invoked when the channel associated with the given client is active. */
  public void channelActive(TransportClient client) {}

  /**
```

### EmptyMethod
The method is empty
in `common/src/main/java/org/apache/celeborn/common/network/server/BaseMessageHandler.java`
#### Snippet
```java
   * come from this client.
   */
  public void channelInactive(TransportClient client) {}

  public void exceptionCaught(Throwable cause, TransportClient client) {}
```

### EmptyMethod
The method is empty
in `common/src/main/java/org/apache/celeborn/common/network/server/BaseMessageHandler.java`
#### Snippet
```java
  public void channelInactive(TransportClient client) {}

  public void exceptionCaught(Throwable cause, TransportClient client) {}
}

```

### EmptyMethod
The method is empty
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  // trait can not be used as an interface with default implementation.
  @Override
  public void notifyHealthy(String mountPoint) {}

  @Override
```

### EmptyMethod
The method is empty
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  @Override
  public void notifyHighDiskUsage(String mountPoint) {}

  @Override
```

### EmptyMethod
The method is empty
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  @Override
  public void notifyNonCriticalError(String mountPoint, DiskStatus diskStatus) {}

  public PartitionType getPartitionType() {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferQueue.java`
#### Snippet
```java
  private volatile boolean isReleased = false;

  private volatile int localBuffersTarget = 0;

  /** Returns the number of available buffers in this buffer queue. */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferQueue.java`
#### Snippet
```java

  /** Whether this buffer queue is released or not. */
  private volatile boolean isReleased = false;

  private volatile int localBuffersTarget = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/util/TransportFrameDecoder.java`
#### Snippet
```java
  private final LinkedList<ByteBuf> buffers = new LinkedList<>();

  private long totalSize = 0;
  private long nextFrameSize = UNKNOWN_FRAME_SIZE;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java

  private final long pushTimeoutCheckerInterval;
  private static ScheduledExecutorService pushTimeoutChecker = null;
  private ScheduledFuture scheduleFuture;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/write/DataBatches.java`
#### Snippet
```java

public class DataBatches {
  private int totalSize = 0;
  private ArrayList<DataBatch> batches = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  private final boolean rangeReadFilter;
  protected boolean deleted = false;
  private RoaringBitmap mapIdBitMap = null;
  protected final FlushNotifier notifier = new FlushNotifier();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  private final PartitionType partitionType;
  private final boolean rangeReadFilter;
  protected boolean deleted = false;
  private RoaringBitmap mapIdBitMap = null;
  protected final FlushNotifier notifier = new FlushNotifier();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  protected final AbstractSource source; // metrics

  private long splitThreshold = 0;
  private final PartitionSplitMode splitMode;
  private final PartitionType partitionType;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
      ThreadUtils.newDaemonSingleThreadScheduledExecutor(
          "memory-mananger-readBufferTarget-updater");
  private CreditStreamManager creditStreamManager = null;

  // For memory shuffle storage
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  // For memory shuffle storage
  private final AtomicLong memoryShuffleStorageCounter = new AtomicLong(0);
  private long memoryShuffleStorageThreshold = 0;

  public static MemoryManager initialize(CelebornConf conf) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  private ReadBufferDispatcher readBufferDispatcher;
  private List<ReadBufferTargetChangeListener> readBufferTargetChangeListeners;
  private long lastNotifiedTarget = 0;
  private final ScheduledExecutorService readBufferTargetUpdateService =
      ThreadUtils.newDaemonSingleThreadScheduledExecutor(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  private final AtomicLong readBufferCounter = new AtomicLong(0);
  private long readBufferThreshold = 0;
  private long readBufferTarget = 0;
  private ReadBufferDispatcher readBufferDispatcher;
  private List<ReadBufferTargetChangeListener> readBufferTargetChangeListeners;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  // For credit stream
  private final AtomicLong readBufferCounter = new AtomicLong(0);
  private long readBufferThreshold = 0;
  private long readBufferTarget = 0;
  private ReadBufferDispatcher readBufferDispatcher;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(MemoryManager.class);
  private static volatile MemoryManager _INSTANCE = null;
  private long maxDirectorMemory = 0;
  private final long pausePushDataThreshold;
  private final long pauseReplicateThreshold;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
      ThreadUtils.newDaemonSingleThreadExecutor("memory-manager-actor");

  private AtomicLong nettyMemoryCounter = null;
  private final AtomicLong sortMemoryCounter = new AtomicLong(0);
  private final AtomicLong diskBufferCounter = new AtomicLong(0);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
public class MemoryManager {
  private static final Logger logger = LoggerFactory.getLogger(MemoryManager.class);
  private static volatile MemoryManager _INSTANCE = null;
  private long maxDirectorMemory = 0;
  private final long pausePushDataThreshold;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
  private static final Random rand = new Random();
  private static boolean initialized = false;
  private static double[] taskAllocationRatio = null;

  public static Map<WorkerInfo, Tuple2<List<PartitionLocation>, List<PartitionLocation>>>
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(SlotsAllocator.class);
  private static final Random rand = new Random();
  private static boolean initialized = false;
  private static double[] taskAllocationRatio = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
  private final AtomicReference<IOException> exception = new AtomicReference<>();
  private final int fetchMaxReqsInFlight;
  private boolean closed = false;

  // for test
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/celeborn/reflect/DynClasses.java`
#### Snippet
```java
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private Class<?> foundClass = null;
    private boolean nullOk = false;
    private final Set<String> classNames = new LinkedHashSet<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/reflect/DynClasses.java`
#### Snippet
```java
  public static class Builder {
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private Class<?> foundClass = null;
    private boolean nullOk = false;
    private final Set<String> classNames = new LinkedHashSet<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/reflect/DynConstructors.java`
#### Snippet
```java
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();

    private Ctor ctor = null;
    private Map<String, Throwable> problems = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/celeborn/common/protocol/StorageInfo.java`
#### Snippet
```java
  private String mountPoint = UNKNOWN_DISK;
  // if a file is committed, field "finalResult" will be true
  private boolean finalResult = false;
  private String filePath;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
  public final LongAdder partitionTotalWritten = new LongAdder();
  public final LongAdder partitionTotalFileCount = new LongAdder();
  public AppDiskUsageMetric appDiskUsageMetric = null;

  public void updateRequestSlotsMeta(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
  private int numChunks = 0;
  private int returnedChunks = 0;
  private int currentChunkIndex = 0;

  public DfsPartitionReader(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
  private FSDataInputStream hdfsInputStream;
  private int numChunks = 0;
  private int returnedChunks = 0;
  private int currentChunkIndex = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
  private Thread fetchThread;
  private FSDataInputStream hdfsInputStream;
  private int numChunks = 0;
  private int returnedChunks = 0;
  private int currentChunkIndex = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
  private final LinkedBlockingQueue<ByteBuf> results;
  private final AtomicReference<IOException> exception = new AtomicReference<>();
  private volatile boolean closed = false;
  private Thread fetchThread;
  private FSDataInputStream hdfsInputStream;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java

  private static final Logger logger = LoggerFactory.getLogger(CongestionController.class);
  private static volatile CongestionController _INSTANCE = null;
  private final WorkerSource workerSource;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
    private PartitionReader currentReader;
    private final int fetchChunkMaxRetry;
    private int fetchChunkRetryCnt = 0;
    int retryWaitMs;
    private int fileIndex;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ReadBufferDispatcher.java`
#### Snippet
```java
  private final LongAdder allocatedReadBuffers = new LongAdder();
  private final long readBufferAllocationWait;
  private volatile boolean stopFlag = false;

  public ReadBufferDispatcher(MemoryManager memoryManager, long readBufferAllocationWait) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
public abstract class ShuffleClient {
  private static volatile ShuffleClient _instance;
  private static volatile boolean initialized = false;
  private static volatile FileSystem hdfsFs;
  private static Logger logger = LoggerFactory.getLogger(ShuffleClient.class);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java

  private AtomicInteger numInUseBuffers = new AtomicInteger(0);
  private boolean isOpen = false;

  public MapDataPartitionReader(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/reflect/DynFields.java`
#### Snippet
```java
  public static class Builder {
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private UnboundField<?> field = null;
    private final Set<String> candidates = new HashSet<>();
    private boolean defaultAlwaysNull = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/celeborn/reflect/DynFields.java`
#### Snippet
```java
    private UnboundField<?> field = null;
    private final Set<String> candidates = new HashSet<>();
    private boolean defaultAlwaysNull = false;

    private Builder() {}
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java

    // Used to keep track of the number of chunks being transferred and not finished yet.
    volatile long chunksBeingTransferred = 0L;

    StreamState(String shuffleKey, FileManagedBuffers buffers, TimeWindow fetchTimeMetric) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private FileChannel indexChannel;
  private long indexSize;
  private volatile boolean isReleased = false;
  private final BufferQueue bufferQueue = new BufferQueue();
  private AtomicBoolean bufferQueueInitialized = new AtomicBoolean(false);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/reflect/DynMethods.java`
#### Snippet
```java
    private final String name;
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private UnboundMethod method = null;

    public Builder(String methodName) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
  private static final String RECOVERY_SORTED_FILES_FILE_NAME = "sortedFiles.ldb";
  private File recoverFile;
  private volatile boolean shutdown = false;
  private final ConcurrentHashMap<String, Set<String>> sortedShuffleFiles =
      JavaUtils.newConcurrentHashMap();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
    private FSDataOutputStream hdfsSortedOutput = null;
    private FileChannel originFileChannel = null;
    private FileChannel sortedFileChannel = null;

    FileSorter(FileInfo fileInfo, String fileId, String shuffleKey) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java

    private FSDataInputStream hdfsOriginInput = null;
    private FSDataOutputStream hdfsSortedOutput = null;
    private FileChannel originFileChannel = null;
    private FileChannel sortedFileChannel = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
    private FSDataInputStream hdfsOriginInput = null;
    private FSDataOutputStream hdfsSortedOutput = null;
    private FileChannel originFileChannel = null;
    private FileChannel sortedFileChannel = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
    private final boolean isHdfs;

    private FSDataInputStream hdfsOriginInput = null;
    private FSDataOutputStream hdfsSortedOutput = null;
    private FileChannel originFileChannel = null;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `common/src/main/java/org/apache/celeborn/reflect/DynConstructors.java`
#### Snippet
```java
        return newInstanceChecked(args);
      } catch (Exception e) {
        if (e instanceof RuntimeException) {
          throw (RuntimeException) e;
        }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing PriorityQueue
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
              readers.values().stream()
                  .filter(MapDataPartitionReader::shouldReadData)
                  .collect(Collectors.toList()));
      for (MapDataPartitionReader reader : sortedReaders) {
        reader.open(dataFileChanel, indexChannel, indexSize);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      return files;
    } else {
      return new File[0];
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
          dataClientFactory,
          shuffleKey,
          fileGroups.partitionGroups.get(partitionId).toArray(new PartitionLocation[0]),
          fileGroups.mapAttempts,
          attemptNumber,
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/org/apache/celeborn/common/network/server/TransportChannelHandler.java`
#### Snippet
```java
    if (evt instanceof IdleStateEvent) {
      IdleStateEvent e = (IdleStateEvent) evt;
      synchronized (this) {
        boolean isActuallyOverdue =
            System.nanoTime() - responseHandler.getTimeOfLastRequestNs() > requestTimeoutNs;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferQueue.java`
#### Snippet
```java
  public void trim() {
    List<ByteBuf> buffersToFree = new ArrayList<>();
    synchronized (this) {
      while (numBuffersOccupied.get() > localBuffersTarget) {
        ByteBuf buffer = poll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferQueue.java`
#### Snippet
```java
      int readerSize, int bufferSize, ReadBufferListener readBufferListener) {
    if (readerSize != 0) {
      synchronized (this) {
        int occupiedSnapshot = numBuffersOccupied.get();
        int pendingSnapShot = pendingRequestBuffers.get();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
    this.timeOfLastRequestNs = new AtomicLong(0);
    pushTimeoutCheckerInterval = conf.pushDataTimeoutCheckIntervalMs();
    synchronized (TransportResponseHandler.class) {
      if (pushTimeoutChecker == null) {
        pushTimeoutChecker =
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  public void flushOnMemoryPressure() throws IOException {
    synchronized (this) {
      if (flushBuffer != null && flushBuffer.readableBytes() != 0) {
        flush(false);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
      closed = true;

      synchronized (this) {
        if (flushBuffer.readableBytes() > 0) {
          flush(true);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
                congestionController.produceBytes(fileInfo.getUserIdentifier(), numBytes));

    synchronized (this) {
      if (closed) {
        String msg = "FileWriter has already closed!, fileName " + fileInfo.getFilePath();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java

  public void releaseSortMemory(long size) {
    synchronized (this) {
      if (sortMemoryCounter.get() - size < 0) {
        sortMemoryCounter.set(0);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java

  public void close() {
    synchronized (this) {
      closed = true;
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
          public void onSuccess(int chunkIndex, ManagedBuffer buffer) {
            // only add the buffer to results queue if this reader is not closed.
            synchronized (this) {
              ByteBuf buf = ((NettyManagedBuffer) buffer).getBuf();
              if (!closed) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
      String driverHost, int port, CelebornConf conf, UserIdentifier userIdentifier) {
    if (null == _instance || !initialized) {
      synchronized (ShuffleClient.class) {
        if (null == _instance) {
          // During the execution of Spark tasks, each task may be interrupted due to speculative
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
  public static FileSystem getHdfsFs(CelebornConf conf) {
    if (null == hdfsFs) {
      synchronized (ShuffleClient.class) {
        if (null == hdfsFs) {
          Configuration hdfsConfiguration = new Configuration();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
      RpcEndpointRef driverRef, CelebornConf conf, UserIdentifier userIdentifier) {
    if (null == _instance || !initialized) {
      synchronized (ShuffleClient.class) {
        if (null == _instance) {
          // During the execution of Spark tasks, each task may be interrupted due to speculative
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `common/src/main/java/org/apache/celeborn/common/protocol/StorageInfo.java`
#### Snippet
```java

  public static Map<Integer, Type> typesMap =
      new HashMap() {
        {
          for (Type type : Type.values()) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `splitThreshold` initializer `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  protected final AbstractSource source; // metrics

  private long splitThreshold = 0;
  private final PartitionSplitMode splitMode;
  private final PartitionType partitionType;
```

### UnusedAssignment
Variable `memoryShuffleStorageThreshold` initializer `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  // For memory shuffle storage
  private final AtomicLong memoryShuffleStorageCounter = new AtomicLong(0);
  private long memoryShuffleStorageThreshold = 0;

  public static MemoryManager initialize(CelebornConf conf) {
```

### UnusedAssignment
Variable `readBufferTarget` initializer `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  private final AtomicLong readBufferCounter = new AtomicLong(0);
  private long readBufferThreshold = 0;
  private long readBufferTarget = 0;
  private ReadBufferDispatcher readBufferDispatcher;
  private List<ReadBufferTargetChangeListener> readBufferTargetChangeListeners;
```

### UnusedAssignment
Variable `readBufferThreshold` initializer `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  // For credit stream
  private final AtomicLong readBufferCounter = new AtomicLong(0);
  private long readBufferThreshold = 0;
  private long readBufferTarget = 0;
  private ReadBufferDispatcher readBufferDispatcher;
```

### UnusedAssignment
Variable `fileInCanonicalDir` initializer `null` is redundant
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
  private static boolean isSymlink(File file) throws IOException {
    Preconditions.checkNotNull(file);
    File fileInCanonicalDir = null;
    if (file.getParent() == null) {
      fileInCanonicalDir = file;
```

### UnusedAssignment
Variable `exitCode` initializer `-1` is redundant
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
    ProcessBuilder builder = new ProcessBuilder("rm", "-rf", file.getAbsolutePath());
    Process process = null;
    int exitCode = -1;

    try {
```

### UnusedAssignment
The value changed at `off++` is never used
in `client/src/main/java/org/apache/celeborn/client/compress/Compressor.java`
#### Snippet
```java
    buf[off++] = (byte) (i >>> 8);
    buf[off++] = (byte) (i >>> 16);
    buf[off++] = (byte) (i >>> 24);
  }

```

### UnusedAssignment
Variable `deleteSuccess` initializer `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java

    private void deleteOriginFiles() throws IOException {
      boolean deleteSuccess = false;
      if (isHdfs) {
        deleteSuccess = StorageManager.hadoopFs().delete(new Path(originFilePath), false);
```

### UnusedAssignment
Variable `indexSize` initializer `0` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
      FSDataInputStream hdfsIndexStream = null;
      boolean isHdfs = Utils.isHdfsPath(indexFilePath);
      int indexSize = 0;
      try {
        if (isHdfs) {
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RunnableWithException` ends with 'Exception'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  @FunctionalInterface
  public interface RunnableWithException<R extends IOException> {
    void run() throws R;
  }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `throwable instanceof IOException` is always `false`
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
    if (throwable instanceof FileNotFoundException || throwable instanceof FileCorruptedException) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else if (throwable instanceof IOException && convertAllIOException2UnRetryable) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else {
```

### ConstantValue
Condition `throwable instanceof IOException && convertAllIOException2UnRetryable` is always `false`
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
    if (throwable instanceof FileNotFoundException || throwable instanceof FileCorruptedException) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else if (throwable instanceof IOException && convertAllIOException2UnRetryable) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else {
```

### ConstantValue
Value `throwable` is always 'null'
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
    if (throwable instanceof FileNotFoundException || throwable instanceof FileCorruptedException) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else if (throwable instanceof IOException && convertAllIOException2UnRetryable) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else {
```

### ConstantValue
Value `throwable` is always 'null'
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else {
      return throwable;
    }
  }
```

### ConstantValue
Condition `exception instanceof IOException` is always `false`
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
    if (exception instanceof CelebornIOException) {
      throw (CelebornIOException) exception;
    } else if (exception instanceof IOException) {
      throw new CelebornIOException(exception);
    } else {
```

### ConstantValue
Value `exception` is always 'null'
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
    if (exception instanceof CelebornIOException) {
      throw (CelebornIOException) exception;
    } else if (exception instanceof IOException) {
      throw new CelebornIOException(exception);
    } else {
```

### ConstantValue
Condition `DBB_CLEANER_FIELD != null` is always `true` when reached
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java

      // no point continuing if the above failed:
      if (DBB_CONSTRUCTOR != null && DBB_CLEANER_FIELD != null) {
        Class<?> cleanerClass = Class.forName(cleanerClassName);
        Method createMethod = cleanerClass.getMethod("create", Object.class, Runnable.class);
```

### ConstantValue
Condition `e instanceof CelebornIOException` is always `true`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
            }
            if (remainReviveTimes <= 0) {
              if (e instanceof CelebornIOException) {
                callback.onFailure(e);
              } else {
```

### ConstantValue
Condition `e instanceof CelebornIOException` is always `true`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java

              if (remainReviveTimes <= 0) {
                if (e instanceof CelebornIOException) {
                  callback.onFailure(e);
                } else {
```

## RuleId[id=IOResource]
### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
    this.rangeReadFilter = rangeReadFilter;
    if (!fileInfo.isHdfs()) {
      channel = new FileOutputStream(fileInfo.getFilePath()).getChannel();
    } else {
      // We open the stream and close immediately because HDFS output stream will
```

### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
        rangeReadFilter);
    if (!fileInfo.isHdfs()) {
      indexChannel = new FileOutputStream(fileInfo.getIndexPath()).getChannel();
    } else {
      try {
```

### IOResource
'RandomAccessFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `common/src/main/java/org/apache/celeborn/common/network/buffer/FileSegmentManagedBuffer.java`
#### Snippet
```java
    FileChannel channel = null;
    try {
      channel = new RandomAccessFile(file, "r").getChannel();
      // Just copy the buffer if it's sufficiently small, as memory mapping has a high overhead.
      if (length < conf.memoryMapBytes()) {
```

### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
                            })
                        .build()));
    this.dataFileChanel = new FileInputStream(fileInfo.getFile()).getChannel();
    this.indexChannel = new FileInputStream(fileInfo.getIndexPath()).getChannel();
    this.indexSize = indexChannel.size();
```

### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
                        .build()));
    this.dataFileChanel = new FileInputStream(fileInfo.getFile()).getChannel();
    this.indexChannel = new FileInputStream(fileInfo.getIndexPath()).getChannel();
    this.indexSize = indexChannel.size();

```

### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
        hdfsSortedOutput = StorageManager.hadoopFs().create(new Path(sortedFilePath));
      } else {
        originFileChannel = new FileInputStream(originFilePath).getChannel();
        sortedFileChannel = new FileOutputStream(sortedFilePath).getChannel();
      }
```

### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
      } else {
        originFileChannel = new FileInputStream(originFilePath).getChannel();
        sortedFileChannel = new FileOutputStream(sortedFilePath).getChannel();
      }
    }
```

### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
      hdfsIndexOutput = StorageManager.hadoopFs().create(new Path(indexFilePath));
    } else {
      indexFileChannel = new FileOutputStream(indexFilePath).getChannel();
    }

```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'Stream.mapToLong().sum()'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java
  @VisibleForTesting
  public long numShuffleSteams() {
    return shuffleStreamIds.values().stream().flatMap(Set::stream).count();
  }
}
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `BATCH_HEADER_SIZE` may be 'static'
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java

    // mapId, attemptId, batchId, size
    private final int BATCH_HEADER_SIZE = 4 * 4;
    private final byte[] sizeBuf = new byte[BATCH_HEADER_SIZE];
    private LongAdder skipCount = new LongAdder();
```

### FieldMayBeStatic
Field `intervalPerBucketInMills` may be 'static'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java

  // 1 second.
  private final int intervalPerBucketInMills = 1000;
  private final int maxQueueSize;
  private N sumNode;
```

### FieldMayBeStatic
Field `BATCH_HEADER_SIZE` may be 'static'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
  protected TransportClientFactory dataClientFactory;

  protected final int BATCH_HEADER_SIZE = 4 * 4;

  // key: shuffleId, value: (partitionId, PartitionLocation)
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `HAHelper` has only 'static' members, and lacks a 'private' constructor
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HAHelper.java`
#### Snippet
```java
import org.apache.celeborn.service.deploy.master.clustermeta.ResourceProtos;

public class HAHelper {

  public static boolean checkShouldProcess(
```

### UtilityClassWithoutPrivateConstructor
Class `IntArrays` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/network/protocol/Encoders.java`
#### Snippet
```java

  /** Int arrays are encoded with their length followed by ints. */
  public static class IntArrays {
    public static int encodedLength(int[] ints) {
      return 4 + 4 * ints.length;
```

### UtilityClassWithoutPrivateConstructor
Class `StringArrays` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/network/protocol/Encoders.java`
#### Snippet
```java

  /** String arrays are encoded with the number of strings followed by per-String encoding. */
  public static class StringArrays {
    public static int encodedLength(String[] strings) {
      int totalLength = 4;
```

### UtilityClassWithoutPrivateConstructor
Class `Strings` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/network/protocol/Encoders.java`
#### Snippet
```java

  /** Strings are encoded with their length followed by UTF-8 bytes. */
  public static class Strings {
    public static int encodedLength(String s) {
      return 4 + s.getBytes(StandardCharsets.UTF_8).length;
```

### UtilityClassWithoutPrivateConstructor
Class `ShuffleBlockInfoUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/util/ShuffleBlockInfoUtils.java`
#### Snippet
```java
import java.util.Map;

public class ShuffleBlockInfoUtils {

  public static class ShuffleBlockInfo {
```

### UtilityClassWithoutPrivateConstructor
Class `LevelDBProvider` has only 'static' members, and lacks a 'private' constructor
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/LevelDBProvider.java`
#### Snippet
```java
 * <p>Note: code copied from Apache Spark's LevelDBProvider.
 */
public class LevelDBProvider {
  private static final Logger logger = LoggerFactory.getLogger(LevelDBProvider.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RpcNameConstants` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/protocol/RpcNameConstants.java`
#### Snippet
```java
package org.apache.celeborn.common.protocol;

public class RpcNameConstants {
  // For Master
  public static String MASTER_SYS = "MasterSys";
```

### UtilityClassWithoutPrivateConstructor
Class `SlotsAllocator` has only 'static' members, and lacks a 'private' constructor
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
import org.apache.celeborn.common.protocol.StorageInfo;

public class SlotsAllocator {
  static class UsableDiskInfo {
    DiskInfo diskInfo;
```

### UtilityClassWithoutPrivateConstructor
Class `TransportModuleConstants` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/protocol/TransportModuleConstants.java`
#### Snippet
```java
package org.apache.celeborn.common.protocol;

public class TransportModuleConstants {
  public static final String PUSH_MODULE = "push";
  public static final String REPLICATE_MODULE = "replicate";
```

### UtilityClassWithoutPrivateConstructor
Class `JavaUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
 * Utils, just accessible within this package.
 */
public class JavaUtils {
  private static final Logger logger = LoggerFactory.getLogger(JavaUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `PackedPartitionId` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/util/PackedPartitionId.java`
#### Snippet
```java
 * @see org.apache.celeborn.common.protocol.PartitionLocation#id
 */
public class PackedPartitionId {

  /** The maximum partition identifier that can be encoded. Note that partition ids start from 0. */
```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
import org.apache.celeborn.common.exception.PartitionUnRetryAbleException;

public class ExceptionUtils {

  public static void wrapAndThrowIOException(Exception exception) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `Platform` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
import sun.misc.Unsafe;

public final class Platform {

  private static final Unsafe _UNSAFE;
```

### UtilityClassWithoutPrivateConstructor
Class `NettyUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/network/util/NettyUtils.java`
#### Snippet
```java

/** Utilities for creating various Netty constructs based on whether we're using EPOLL or NIO. */
public class NettyUtils {
  /** Creates a new ThreadFactory which prefixes each thread with the given name. */
  public static ThreadFactory createThreadFactory(String threadPoolPrefix) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `dbFile.listFiles()` may produce `NullPointerException`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/LevelDBProvider.java`
#### Snippet
```java
              e);
          if (dbFile.isDirectory()) {
            for (File f : dbFile.listFiles()) {
              if (!f.delete()) {
                logger.warn("error deleting {}", f.getPath());
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
        }
      }
      field.setAccessible(true);
      nettyMemoryCounter = ((AtomicLong) field.get(PlatformDependent.class));
    } catch (Exception e) {
```

### DataFlowIssue
Variable is already assigned to this value
in `common/src/main/java/org/apache/celeborn/common/meta/FileManagedBuffers.java`
#### Snippet
```java
    } else {
      offsets = new long[1];
      offsets[0] = 0;
    }
    this.conf = conf;
```

### DataFlowIssue
Method invocation `getReaders` may produce `NullPointerException`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
                fileInfo,
                (k, v) -> {
                  if (v.getReaders().isEmpty()) {
                    v.close();
                    return null;
```

### DataFlowIssue
Method invocation `tryRequestBufferOrRead` may produce `NullPointerException`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
      throw exception.get();
    }
    mapDataPartition.tryRequestBufferOrRead();

    callback.accept(streamId);
```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
      }
      for (int i = startMapIndex; i < endMapIndex; i++) {
        if (bitmap.contains(i)) {
          return false;
        }
```

### DataFlowIssue
Condition `throwable instanceof FileCorruptedException` is redundant and can be replaced with a null check
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
  public static Throwable wrapIOExceptionToUnRetryable(
      Throwable throwable, boolean convertAllIOException2UnRetryable) {
    if (throwable instanceof FileNotFoundException || throwable instanceof FileCorruptedException) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else if (throwable instanceof IOException && convertAllIOException2UnRetryable) {
```

### DataFlowIssue
Condition `exception instanceof CelebornIOException` is redundant and can be replaced with a null check
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java

  public static void wrapAndThrowIOException(Exception exception) throws IOException {
    if (exception instanceof CelebornIOException) {
      throw (CelebornIOException) exception;
    } else if (exception instanceof IOException) {
```

### DataFlowIssue
Method invocation `getMessage` will produce `NullPointerException`
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
      throw new CelebornIOException(exception);
    } else {
      throw new CelebornIOException(exception.getMessage(), exception);
    }
  }
```

### DataFlowIssue
Dereference of `throwable` may produce `NullPointerException`
in `common/src/main/java/org/apache/celeborn/common/haclient/RssHARetryClient.java`
#### Snippet
```java

    LOG.error("Send rpc with failure, has tried {}, max try {}!", numTries, maxRetries, throwable);
    throw throwable;
  }

```

### DataFlowIssue
Dereference of `wrappedBuffer` may produce `NullPointerException`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java

      int backlog = buffersToSend.size();
      int readableBytes = wrappedBuffer.byteBuf.readableBytes();
      logger.debug("send data start: {}, {}, {}", streamId, readableBytes, backlog);
      ReadData readData = new ReadData(streamId, wrappedBuffer.byteBuf);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/apache/celeborn/common/protocol/CompressionCodec.java`
#### Snippet
```java
public enum CompressionCodec {
  LZ4,
  ZSTD;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/apache/celeborn/common/protocol/ShuffleMode.java`
#### Snippet
```java
public enum ShuffleMode {
  HASH,
  SORT;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/apache/celeborn/common/protocol/SlotsAssignPolicy.java`
#### Snippet
```java
public enum SlotsAssignPolicy {
  ROUNDROBIN,
  LOADAWARE;
}

```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `equals()` overloads a compatible method of a superclass, when overriding might have been intended
in `common/src/main/java/org/apache/celeborn/common/network/protocol/Message.java`
#### Snippet
```java
  }

  protected boolean equals(Message other) {
    return Objects.equal(body, other.body);
  }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
    scheduleFuture =
        pushTimeoutChecker.scheduleAtFixedRate(
            () -> failExpiredPushRequest(),
            pushTimeoutCheckerInterval,
            pushTimeoutCheckerInterval,
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
                          threadsPerMountPoint,
                          fileInfo,
                          id -> recycleStream(id),
                          minBuffersToTriggerRead);
                } catch (IOException e) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
    return super.close(
        () -> {
          flushIndex();
        },
        () -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
    if (streamReader != null) {
      streamReader.addCredit(numCredit);
      readExecutor.submit(() -> streamReader.sendData());
    }
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
    // Key for IO schedule.
    if (hasReadingTask.compareAndSet(false, true)) {
      readExecutor.submit(() -> readBuffers());
    }
  }
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `newEmptyNode()` during object construction
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
    this._deque = new LinkedBlockingDeque<>();
    this.maxQueueSize = timeWindowsInSecs * 1000 / intervalPerBucketInMills;
    this.sumNode = newEmptyNode();
  }

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
        | NoSuchMethodException
        | IllegalAccessException
        | InvocationTargetException ignored) {
      System.out.println("exception " + ignored);
      // Ignore Exception
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/org/apache/celeborn/common/util/ShutdownHookManager.java`
#### Snippet
```java
                + entry.getHook().getClass().getSimpleName()
                + "' timeout, "
                + ex.toString(),
            ex);
      } catch (Throwable ex) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/org/apache/celeborn/common/util/ShutdownHookManager.java`
#### Snippet
```java
                + entry.getHook().getClass().getSimpleName()
                + "' failed, "
                + ex.toString(),
            ex);
      }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `StreamState` may be 'static'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
  }

  protected class StreamState {
    private Channel associatedChannel;
    private int bufferSize;
```

### InnerClassMayBeStatic
Inner class `TrimCache` may be 'static'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ChannelsLimiter.java`
#### Snippet
```java
  }

  class TrimCache {}
}

```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `time` declared in one 'switch' branch and used in another
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/MetaHandler.java`
#### Snippet
```java
          appId = request.getAppHeartbeatRequest().getAppId();
          LOG.debug("Handle app heartbeat for {}", appId);
          long time = request.getAppHeartbeatRequest().getTime();
          long totalWritten = request.getAppHeartbeatRequest().getTotalWritten();
          long fileCount = request.getAppHeartbeatRequest().getFileCount();
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java
  @Override
  public synchronized void mark(int readLimit) {
    in.mark(readLimit);
    mark = left;
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java
  @Override
  public synchronized void reset() throws IOException {
    if (!in.markSupported()) {
      throw new IOException("Mark not supported");
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java
      throw new IOException("Mark not set");
    }
    in.reset();
    left = mark;
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  public void flushOnMemoryPressure() throws IOException {
    synchronized (this) {
      if (flushBuffer != null && flushBuffer.readableBytes() != 0) {
        flush(false);
        takeBuffer();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  public void flushOnMemoryPressure() throws IOException {
    synchronized (this) {
      if (flushBuffer != null && flushBuffer.readableBytes() != 0) {
        flush(false);
        takeBuffer();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

      synchronized (this) {
        if (flushBuffer.readableBytes() > 0) {
          flush(true);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytesFlushed` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
      }
    }
    return bytesFlushed;
  }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  protected synchronized void returnBuffer() {
    if (flushBuffer != null) {
      flusher.returnBuffer(flushBuffer);
      flushBuffer = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  protected synchronized void returnBuffer() {
    if (flushBuffer != null) {
      flusher.returnBuffer(flushBuffer);
      flushBuffer = null;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
    if (flushBuffer != null) {
      flusher.returnBuffer(flushBuffer);
      flushBuffer = null;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
        mapIdBitMap.add(mapId);
      }
      if (flushBuffer.readableBytes() != 0
          && flushBuffer.readableBytes() + numBytes >= flusherBufferSize) {
        flush(false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
      }
      if (flushBuffer.readableBytes() != 0
          && flushBuffer.readableBytes() + numBytes >= flusherBufferSize) {
        flush(false);
        takeBuffer();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

      data.retain();
      flushBuffer.addComponent(true, data);

      numPendingWrites.decrementAndGet();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `errorNotified` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  public void recycleOnError(Throwable throwable) {
    synchronized (lock) {
      if (!errorNotified) {
        errorNotified = true;
        errorCause = throwable;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `errorNotified` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
    synchronized (lock) {
      if (!errorNotified) {
        errorNotified = true;
        errorCause = throwable;
        notifyError(throwable);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `errorCause` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
      if (!errorNotified) {
        errorNotified = true;
        errorCause = throwable;
        notifyError(throwable);
        recycle();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
    synchronized (lock) {
      // ensure every buffer are return to bufferQueue or release in buffersRead
      return numInUseBuffers.get() == 0 && isReleased;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  public void recycle() {
    synchronized (lock) {
      if (!isReleased) {
        release();
        recycleStream.run();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
      RecyclableBuffer wrappedBuffer;
      synchronized (lock) {
        if (!isReleased) {
          wrappedBuffer = buffersToSend.poll();
        } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
    }
    synchronized (lock) {
      if (!isReleased) {
        buffersToSend.add(new RecyclableBuffer(buffer, bufferRecycler));
      } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `errorCause` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
        bufferRecycler.recycle(buffer);
        numInUseBuffers.decrementAndGet();
        throw new RuntimeException("Partition reader has been failed or finished.", errorCause);
      }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
    // we can safely release if reader reaches error or (read/send finished)
    synchronized (lock) {
      if (!isReleased) {
        logger.debug("release reader for stream {}", this.streamId);
        if (!buffersToSend.isEmpty()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
          buffersToSend.clear();
        }
        isReleased = true;
      }
    }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `common/src/main/java/org/apache/celeborn/common/network/util/AbstractFileRegion.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("deprecation")
  public final long transfered() {
    return transferred();
  }
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
  /** Allocate a DirectByteBuffer, potentially bypassing the JVM's MaxDirectMemorySize limit. */
  @SuppressWarnings("unchecked")
  public static ByteBuffer allocateDirectBuffer(int size) {
    try {
      if (CLEANER_CREATE_METHOD == null) {
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `readBufferTargetChangeListeners`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
                  if (Math.abs(lastNotifiedTarget - currentTarget)
                      > readBufferTargetNotifyThreshold) {
                    synchronized (readBufferTargetChangeListeners) {
                      logger.debug(
                          "read buffer target changed {} -> {} active map partition count {}",
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `readBufferTargetChangeListeners`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java

  public void addReadBufferTargetChangeListener(ReadBufferTargetChangeListener listener) {
    synchronized (readBufferTargetChangeListeners) {
      readBufferTargetChangeListeners.add(listener);
    }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `readBufferTargetChangeListeners`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java

  public void removeReadBufferTargetChangeListener(ReadBufferTargetChangeListener listener) {
    synchronized (readBufferTargetChangeListeners) {
      readBufferTargetChangeListeners.remove(listener);
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cachedLeaderPeerRpcEndpoint'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
  private final ReentrantReadWriteLock roleCheckLock = new ReentrantReadWriteLock();
  private Optional<RaftProtos.RaftPeerRole> cachedPeerRole = Optional.empty();
  private Optional<String> cachedLeaderPeerRpcEndpoint = Optional.empty();

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cachedPeerRole'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
  private long roleCheckIntervalMs;
  private final ReentrantReadWriteLock roleCheckLock = new ReentrantReadWriteLock();
  private Optional<RaftProtos.RaftPeerRole> cachedPeerRole = Optional.empty();
  private Optional<String> cachedLeaderPeerRpcEndpoint = Optional.empty();

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
        | IllegalAccessException
        | InvocationTargetException ignored) {
      System.out.println("exception " + ignored);
      // Ignore Exception
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
            hdfsFs = FileSystem.get(hdfsConfiguration);
          } catch (IOException e) {
            System.err.println("Rss initialize hdfs failed.");
            e.printStackTrace(System.err);
          }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
          } catch (IOException e) {
            System.err.println("Rss initialize hdfs failed.");
            e.printStackTrace(System.err);
          }
        }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'throwable instanceof FileNotFoundException' covered by subsequent condition 'throwable instanceof FileCorruptedException'
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
  public static Throwable wrapIOExceptionToUnRetryable(
      Throwable throwable, boolean convertAllIOException2UnRetryable) {
    if (throwable instanceof FileNotFoundException || throwable instanceof FileCorruptedException) {
      return new PartitionUnRetryAbleException(throwable.getMessage(), throwable);
    } else if (throwable instanceof IOException && convertAllIOException2UnRetryable) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary and can be removed
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java

  static {
    sun.misc.Unsafe unsafe;
    try {
      Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
```

### UnnecessaryFullyQualifiedName
Qualifier `sun.misc` is unnecessary and can be removed
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
      Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
      unsafeField.setAccessible(true);
      unsafe = (sun.misc.Unsafe) unsafeField.get(null);
    } catch (Throwable cause) {
      unsafe = null;
```

## RuleId[id=CovariantEquals]
### CovariantEquals
`equals()` should take 'Object' as its argument
in `common/src/main/java/org/apache/celeborn/common/network/protocol/Message.java`
#### Snippet
```java
  }

  protected boolean equals(Message other) {
    return Objects.equal(body, other.body);
  }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `PushStrategy()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/celeborn/common/write/PushStrategy.java`
#### Snippet
```java
  }

  public PushStrategy(CelebornConf conf) {
    this.conf = conf;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `FileWriter()` of an abstract class should not be declared 'public'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  protected final FlushNotifier notifier = new FlushNotifier();

  public FileWriter(
      FileInfo fileInfo,
      Flusher flusher,
```

### NonProtectedConstructorInAbstractClass
Constructor `ResponseMessage()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/ResponseMessage.java`
#### Snippet
```java
  }

  public ResponseMessage(ManagedBuffer buffer) {
    super(buffer);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ResponseMessage()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/ResponseMessage.java`
#### Snippet
```java
/** Messages from the server to the client. */
public abstract class ResponseMessage extends Message {
  public ResponseMessage() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TimeSlidingHub()` of an abstract class should not be declared 'public'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
  private final LinkedBlockingDeque<Pair<Long, N>> _deque;

  public TimeSlidingHub(int timeWindowsInSecs) {
    this._deque = new LinkedBlockingDeque<>();
    this.maxQueueSize = timeWindowsInSecs * 1000 / intervalPerBucketInMills;
```

### NonProtectedConstructorInAbstractClass
Constructor `RequestMessage()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/RequestMessage.java`
#### Snippet
```java
  }

  public RequestMessage(ManagedBuffer buffer) {
    super(buffer);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `RequestMessage()` of an abstract class should not be declared 'public'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/RequestMessage.java`
#### Snippet
```java
/** Messages from the client to the server. */
public abstract class RequestMessage extends Message {
  public RequestMessage() {
    super();
  }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Thread.UncaughtExceptionHandler() can be replaced with lambda
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
              "Dfs-fetch-thread" + location.getStorageInfo().getFilePath());
      fetchThread.setUncaughtExceptionHandler(
          new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `common/src/main/java/org/apache/celeborn/common/util/ShutdownHookManager.java`
#### Snippet
```java
    Collections.sort(
        list,
        new Comparator<HookEntry>() {

          // reversing comparison so highest priority hooks are first
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/celeborn/reflect/DynConstructors.java`
#### Snippet
```java
          return ctor.newInstance(args);
        }
      } catch (InstantiationException | IllegalAccessException e) {
        throw e;
      } catch (InvocationTargetException e) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `n`
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java
  @Override
  public long skip(long n) throws IOException {
    n = Math.min(n, left);
    long skipped = in.skip(n);
    left -= skipped;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java
      return -1;
    }
    len = (int) Math.min(len, left);
    int result = in.read(b, off, len);
    if (result != -1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `common/src/main/java/org/apache/celeborn/common/protocol/PartitionSplitMode.java`
#### Snippet
```java
    assert (value >= 0 && value < 256);
    if (value > 1) {
      value = 0;
    }
    this.value = (byte) value;
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
      }
      if (location.getPeer() != null && attemptNumber % 2 == 1) {
        location = location.getPeer();
        logger.debug("Read peer {} for attempt {}.", location, attemptNumber);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
          fetchChunkRetryCnt++;
          if (location.getPeer() != null) {
            location = location.getPeer();
            logger.warn(
                "CreatePartitionReader failed {}/{} times, change to peer",
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
        long size = Math.min(length, UNSAFE_COPY_THRESHOLD);
        _UNSAFE.copyMemory(src, srcOffset, dst, dstOffset, size);
        length -= size;
        srcOffset += size;
        dstOffset += size;
```

### AssignmentToMethodParameter
Assignment to method parameter `srcOffset`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
        _UNSAFE.copyMemory(src, srcOffset, dst, dstOffset, size);
        length -= size;
        srcOffset += size;
        dstOffset += size;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `dstOffset`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
        length -= size;
        srcOffset += size;
        dstOffset += size;
      }
    } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `srcOffset`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
      }
    } else {
      srcOffset += length;
      dstOffset += length;
      while (length > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `dstOffset`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
    } else {
      srcOffset += length;
      dstOffset += length;
      while (length > 0) {
        long size = Math.min(length, UNSAFE_COPY_THRESHOLD);
```

### AssignmentToMethodParameter
Assignment to method parameter `srcOffset`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
      while (length > 0) {
        long size = Math.min(length, UNSAFE_COPY_THRESHOLD);
        srcOffset -= size;
        dstOffset -= size;
        _UNSAFE.copyMemory(src, srcOffset, dst, dstOffset, size);
```

### AssignmentToMethodParameter
Assignment to method parameter `dstOffset`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
        long size = Math.min(length, UNSAFE_COPY_THRESHOLD);
        srcOffset -= size;
        dstOffset -= size;
        _UNSAFE.copyMemory(src, srcOffset, dst, dstOffset, size);
        length -= size;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `common/src/main/java/org/apache/celeborn/common/unsafe/Platform.java`
#### Snippet
```java
        dstOffset -= size;
        _UNSAFE.copyMemory(src, srcOffset, dst, dstOffset, size);
        length -= size;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `client/src/main/java/org/apache/celeborn/client/compress/Compressor.java`
#### Snippet
```java

  default void writeIntLE(int i, byte[] buf, int off) {
    buf[off++] = (byte) i;
    buf[off++] = (byte) (i >>> 8);
    buf[off++] = (byte) (i >>> 16);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `client/src/main/java/org/apache/celeborn/client/compress/Compressor.java`
#### Snippet
```java
  default void writeIntLE(int i, byte[] buf, int off) {
    buf[off++] = (byte) i;
    buf[off++] = (byte) (i >>> 8);
    buf[off++] = (byte) (i >>> 16);
    buf[off++] = (byte) (i >>> 24);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `client/src/main/java/org/apache/celeborn/client/compress/Compressor.java`
#### Snippet
```java
    buf[off++] = (byte) i;
    buf[off++] = (byte) (i >>> 8);
    buf[off++] = (byte) (i >>> 16);
    buf[off++] = (byte) (i >>> 24);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `client/src/main/java/org/apache/celeborn/client/compress/Compressor.java`
#### Snippet
```java
    buf[off++] = (byte) (i >>> 8);
    buf[off++] = (byte) (i >>> 16);
    buf[off++] = (byte) (i >>> 24);
  }

```

### AssignmentToMethodParameter
Assignment to method parameter `numCores`
in `common/src/main/java/org/apache/celeborn/common/network/util/NettyUtils.java`
#### Snippet
```java
      boolean allowDirectBufs, boolean allowCache, int numCores) {
    if (numCores == 0) {
      numCores = Runtime.getRuntime().availableProcessors();
    }
    return new PooledByteBufAllocator(
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
              for (Path path : stream) {
                if (filePatternMatches(SNAPSHOT_REGEX, allSnapshotFiles, path)) {
                  continue;
                } else {
                  filePatternMatches(MD5_REGEX, allMD5Files, path);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `handler`
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java
      TransportChannelHandler handler =
          cachedClient.getChannel().pipeline().get(TransportChannelHandler.class);
      synchronized (handler) {
        handler.getResponseHandler().updateTimeOfLastRequest();
      }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `sorting`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
    String indexFilePath = Utils.getIndexFilePath(fileInfo.getFilePath());

    synchronized (sorting) {
      if (sorted.contains(fileId)) {
        return resolve(
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `sorting`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
        closeFiles();
        Set<String> sorting = sortingShuffleFiles.get(shuffleKey);
        synchronized (sorting) {
          sorting.remove(fileId);
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/celeborn/common/network/util/TransportFrameDecoder.java`
#### Snippet
```java
    long frameSize = decodeFrameSize();
    if (frameSize == UNKNOWN_FRAME_SIZE || totalSize < frameSize) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
      ExitUtils.terminate(1, errorMessage, e, LOG);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
      return notifier.exception.get();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
    } else {
      if (deleted) {
        return null;
      } else {
        return new StorageInfo(StorageInfo.Type.HDFS, true, fileInfo.getFilePath());
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
      int locationCount = locations.length;
      if (fileIndex >= locationCount) {
        return null;
      }
      PartitionLocation currentLocation = locations[fileIndex];
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
        fileIndex++;
        if (fileIndex == locationCount) {
          return null;
        }
        currentLocation = locations[fileIndex];
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/celeborn/common/haclient/RssHARetryClient.java`
#### Snippet
```java
      return new Tuple2<>(requestId.split(SPLITTER)[0], Long.valueOf(requestId.split(SPLITTER)[1]));
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java
      return state.fetchTimeMetric;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `common/src/main/java/org/apache/celeborn/reflect/DynMethods.java`
#### Snippet
```java
          @Override
          public <R> R invokeChecked(Object target, Object... args) throws Exception {
            return null;
          }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
        if (driverRssMetaService == null) {
          logger.warn("Driver endpoint is null!");
          return null;
        }

```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
        logger.error("Exception raised while call GetReducerFileGroup for {}.", shuffleKey, e);
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
    }

    return null;
  }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
              if (v == null) {
                try {
                  v =
                      new MapDataPartition(
                          minReadBuffers,
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java
        (key, value) -> {
          if (value == null) {
            value = ConcurrentHashMap.newKeySet();
          }
          value.add(myStreamId);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `nextChunk` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java

    FileManagedBuffers buffers = state.buffers;
    ManagedBuffer nextChunk = buffers.chunk(chunkIndex, offset, len);

    return nextChunk;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/apache/celeborn/client/write/DataPushQueue.java`
#### Snippet
```java
      try {
        // Reaching here means no available tasks can be pushed to any worker, wait for a while
        Thread.sleep(takeTaskWaitTimeMs);
      } catch (InterruptedException ie) {
        ExceptionUtils.wrapAndThrowIOException(ie);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java

      timeout = timeout - 100;
      Thread.sleep(100);
    }
  }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
                  while (!closed && currentChunkIndex < numChunks) {
                    while (results.size() >= fetchMaxReqsInFlight) {
                      Thread.sleep(50);
                    }
                    long offset = chunkOffsets.get(currentChunkIndex);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ReadBufferDispatcher.java`
#### Snippet
```java
              // If dispatcher can not allocate requested buffers, it will wait here until necessary
              // buffers are get.
              Thread.sleep(this.readBufferAllocationWait);
            } catch (InterruptedException e) {
              logger.info("Buffer dispatcher is closing");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
      if (sorting.contains(fileId)) {
        try {
          Thread.sleep(50);
          if (System.currentTimeMillis() - sortStartTime > sortTimeout) {
            logger.error("Sorting file {} timeout after {}ms", fileId, sortTimeout);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
                  memoryManager.reserveSortMemory(reservedMemoryPerPartition);
                  while (!memoryManager.sortMemoryReady()) {
                    Thread.sleep(20);
                  }
                  fileSorterExecutors.submit(
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `client/src/main/java/org/apache/celeborn/client/write/DataPusher.java`
#### Snippet
```java
        };
    pushThread.setDaemon(true);
    pushThread.start();
  }

```

### ThreadStartInConstruction
Call to `start()` during object construction
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java
            }
          });
      fetchThread.start();
      logger.debug("Start dfs read on location {}", location);
    }
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ReadBufferDispatcher.java`
#### Snippet
```java
    this.memoryManager = memoryManager;
    this.setName("Read-Buffer-Dispatcher");
    this.start();
  }

```

### ThreadStartInConstruction
Call to `start()` during object construction
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
              }
            });
    fileSorterSchedulerThread.start();
  }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
              logger.warn(
                  "Fetch chunk failed {}/{} times", fetchChunkRetryCnt, fetchChunkMaxRetry, e);
              Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
              currentReader = createReaderWithRetry(currentReader.getLocation());
            }
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
              logger.warn(
                  "Fetch chunk failed {}/{} times", fetchChunkRetryCnt, fetchChunkMaxRetry, e);
              Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
              currentReader = createReaderWithRetry(currentReader.getLocation());
            }
```

### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
                fetchChunkMaxRetry,
                e);
            Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
          }
        }
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
                fetchChunkMaxRetry,
                e);
            Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
          }
        }
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `common/src/main/java/org/apache/celeborn/common/network/buffer/FileSegmentManagedBuffer.java`
#### Snippet
```java
    try {
      is = new FileInputStream(file);
      ByteStreams.skipFully(is, offset);
      InputStream r = new LimitedInputStream(is, length);
      shouldClose = false;
```

### UnstableApiUsage
'skipFully(java.io.InputStream, long)' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `common/src/main/java/org/apache/celeborn/common/network/buffer/FileSegmentManagedBuffer.java`
#### Snippet
```java
    try {
      is = new FileInputStream(file);
      ByteStreams.skipFully(is, offset);
      InputStream r = new LimitedInputStream(is, length);
      shouldClose = false;
```

