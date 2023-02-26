# incubator-celeborn 
 
# Bad smells
I found 296 bad smells with 41 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 36 | false |
| PublicFieldAccessedInSynchronizedContext | 24 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 21 | false |
| AssignmentToMethodParameter | 19 | false |
| ReturnNull | 15 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| UnnecessarySuperQualifier | 11 | false |
| SynchronizeOnThis | 10 | false |
| UnusedAssignment | 10 | false |
| DataFlowIssue | 9 | false |
| SizeReplaceableByIsEmpty | 8 | true |
| BoundedWildcard | 8 | false |
| IOResource | 8 | false |
| UnstableApiUsage | 8 | false |
| IgnoreResultOfCall | 7 | false |
| NonProtectedConstructorInAbstractClass | 7 | true |
| EmptyMethod | 6 | false |
| UnnecessaryToStringCall | 5 | true |
| Convert2MethodRef | 4 | false |
| BusyWait | 4 | false |
| ThreadStartInConstruction | 4 | false |
| UNUSED_IMPORT | 3 | false |
| CodeBlock2Expr | 3 | true |
| ConstantValue | 3 | false |
| FieldMayBeStatic | 3 | false |
| UnnecessarySemicolon | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| WhileCanBeForeach | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| InstanceofCatchParameter | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| RedundantSuppression | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| SystemOutErr | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| Convert2Lambda | 2 | false |
| DoubleCheckedLocking | 1 | false |
| RefusedBequest | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| NullableProblems | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| DoubleBraceInitialization | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| CovariantEquals | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[ruleID=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java

  private void startRecycleThread() {
    if (recycleThread == null) {
      synchronized (lock) {
        if (recycleThread == null) {
```

## RuleId[ruleID=WhileCanBeForeach]
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

## RuleId[ruleID=RefusedBequest]
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

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
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

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `MapDataPartition` on 'this' is unnecessary in this context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
            fileInfo.getBufferSize(),
            (allocatedBuffers, throwable) ->
                MapDataPartition.this.onBuffer(new LinkedBlockingDeque<>(allocatedBuffers)));
      } else {
        triggerRead();
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
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
`userBufferStatuses.size() == 0` can be replaced with 'userBufferStatuses.isEmpty()'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java

  public long getPotentialConsumeSpeed() {
    if (userBufferStatuses.size() == 0) {
      return 0;
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
`fileGroups.partitionGroups.size() == 0` can be replaced with 'fileGroups.partitionGroups.isEmpty()'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
    ReduceFileGroups fileGroups = loadFileGroup(applicationId, shuffleKey, shuffleId, partitionId);

    if (fileGroups.partitionGroups.size() == 0
        || !fileGroups.partitionGroups.containsKey(partitionId)) {
      logger.warn("Shuffle data is empty for shuffle {} partition {}.", shuffleId, partitionId);
```

### SizeReplaceableByIsEmpty
`buffers.size() > 0` can be replaced with '!buffers.isEmpty()'
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    public synchronized void readBuffers() {
      PriorityQueue<DataPartitionReader> sortedReaders = new PriorityQueue<>(readers);
      while (buffers.size() > 0 && !sortedReaders.isEmpty()) {
        DataPartitionReader reader = sortedReaders.poll();
        try {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
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

## RuleId[ruleID=BoundedWildcard]
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
Can generalize to `? extends PartitionLocation`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java

  private boolean waitRevivedLocation(
      ConcurrentHashMap<Integer, PartitionLocation> map, int partitionId, int epoch) {
    PartitionLocation currentLocation = map.get(partitionId);
    if (currentLocation != null && currentLocation.getEpoch() > epoch) {
```

### BoundedWildcard
Can generalize to `? super ByteBuf`
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    }

    public void recycle(ByteBuf buffer, Queue<ByteBuf> bufferQueue) {
      buffer.clear();
      bufferQueue.add(buffer);
```

### BoundedWildcard
Can generalize to `? extends ByteBuf`
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    }

    public synchronized boolean readAndSend(Queue<ByteBuf> bufferQueue, Consumer<ByteBuf> consumer)
        throws IOException {
      boolean hasRemaing = hasRemaining();
```

### BoundedWildcard
Can generalize to `? super Long`
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java

  public long registerStream(
      Consumer<Long> callback,
      Channel channel,
      int initialCredit,
```

## RuleId[ruleID=NullableProblems]
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

## RuleId[ruleID=AnonymousHasLambdaAlternative]
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

## RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `StateMachine` is the same as one of its superclass' names
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
import org.apache.celeborn.service.deploy.master.clustermeta.ResourceProtos.ResourceResponse;

public class StateMachine extends BaseStateMachine {
  private static final Logger LOG = LoggerFactory.getLogger(StateMachine.class);

```

## RuleId[ruleID=UnnecessarySuperQualifier]
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
in `common/src/main/java/org/apache/celeborn/common/network/protocol/OneWayMessage.java`
#### Snippet
```java
    if (other instanceof OneWayMessage) {
      OneWayMessage o = (OneWayMessage) other;
      return super.equals(o);
    }
    return false;
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.celeborn.common.protocol.CompressionCodec.*;`
in `client/src/main/java/org/apache/celeborn/client/compress/Compressor.java`
#### Snippet
```java
import org.apache.celeborn.common.CelebornConf;
import org.apache.celeborn.common.protocol.CompressionCodec;
import org.apache.celeborn.common.protocol.CompressionCodec.*;

public interface Compressor {
```

### UNUSED_IMPORT
Unused import `import org.apache.celeborn.common.protocol.CompressionCodec.*;`
in `client/src/main/java/org/apache/celeborn/client/compress/Decompressor.java`
#### Snippet
```java
import org.apache.celeborn.common.CelebornConf;
import org.apache.celeborn.common.protocol.CompressionCodec;
import org.apache.celeborn.common.protocol.CompressionCodec.*;

public interface Decompressor {
```

### UNUSED_IMPORT
Unused import `import org.apache.celeborn.common.meta.*;`
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
import org.apache.celeborn.common.CelebornConf;
import org.apache.celeborn.common.identity.UserIdentifier;
import org.apache.celeborn.common.meta.*;
import org.apache.celeborn.common.protocol.PbSnapshotMetaInfo;
import org.apache.celeborn.common.quota.ResourceConsumption;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`remainReviveTimes = remainReviveTimes - 1` could be simplified to 'remainReviveTimes -= 1'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
              // async retry push data
              if (!mapperEnded(shuffleId, mapId, attemptId)) {
                remainReviveTimes = remainReviveTimes - 1;
                pushDataRetryPool.submit(
                    () ->
```

## RuleId[ruleID=CodeBlock2Expr]
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
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
                      .setNameFormat("reader-thread-%d")
                      .setUncaughtExceptionHandler(
                          (t1, t2) -> {
                            logger.warn("StorageFetcherPool thread:{}:{}", t1, t2);
                          })
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `channelIndex` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
  private long regionStartingOffset;
  private long numDataRegions;
  private FileChannel channelIndex;

  public MapPartitionFileWriter(
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
Field `workerGroup` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java

  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  private PooledByteBufAllocator pooledAllocator;

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
Field `timestamp` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java

  private static class UserBufferInfo {
    long timestamp;
    final BufferStatusHub bufferStatusHub;

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
Field `bytesFlushed` is accessed in both synchronized and unsynchronized contexts
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java

  protected final AtomicInteger numPendingWrites = new AtomicInteger();
  protected long bytesFlushed;

  public final Flusher flusher;
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
Field `streamId` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    private FileInfo fileInfo;
    private int INDEX_ENTRY_SIZE = 16;
    private long streamId;
    protected final Object lock = new Object();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `fileInfo` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    private volatile long currentPartitionRemainingBytes;
    private boolean isClosed;
    private FileInfo fileInfo;
    private int INDEX_ENTRY_SIZE = 16;
    private long streamId;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isReleased` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    /** Whether this partition reader has been released or not. */
    @GuardedBy("lock")
    protected boolean isReleased;

    /** Exception causing the release of this partition reader. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recycleThread` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java

  @GuardedBy("lock")
  private Thread recycleThread;

  private final Object lock = new Object();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `errorCause` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    /** Exception causing the release of this partition reader. */
    @GuardedBy("lock")
    protected Throwable errorCause;

    /** Whether there is any error at the consumer side or not. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataFileChanel` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    protected Queue<ByteBuf> buffers;

    protected FileChannel dataFileChanel;
    protected FileChannel indexChannel;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `indexChannel` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java

    protected FileChannel dataFileChanel;
    protected FileChannel indexChannel;

    public MapDataPartition(FileInfo fileInfo) throws FileNotFoundException {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isClosed` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    private long dataConsumingOffset;
    private volatile long currentPartitionRemainingBytes;
    private boolean isClosed;
    private FileInfo fileInfo;
    private int INDEX_ENTRY_SIZE = 16;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffers` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java

    /** All available buffers can be used by the partition readers for reading. */
    protected Queue<ByteBuf> buffers;

    protected FileChannel dataFileChanel;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isError` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    /** Whether there is any error at the consumer side or not. */
    @GuardedBy("lock")
    protected boolean isError;

    private FileChannel dataFileChannel;
```

## RuleId[ruleID=EmptyMethod]
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

## RuleId[ruleID=RedundantFieldInitialization]
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
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
  private final AtomicReference<IOException> exception = new AtomicReference<>();
  private final int fetchMaxReqsInFlight;
  private boolean closed = false;

  // for test
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
in `common/src/main/java/org/apache/celeborn/common/meta/FileManagedBuffers.java`
#### Snippet
```java
  private final TransportConf conf;

  private volatile boolean fullyRead = false;

  public FileManagedBuffers(FileInfo fileInfo, TransportConf conf) {
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

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
  private static final String RECOVERY_SORTED_FILES_FILE_NAME = "sortedFiles.ldb";
  private File recoverFile;
  private volatile boolean shutdown = false;
  private final ConcurrentHashMap<String, Set<String>> sortedShuffleFiles =
      new ConcurrentHashMap<>();
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
in `common/src/main/java/org/apache/celeborn/reflect/DynConstructors.java`
#### Snippet
```java
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();

    private Ctor ctor = null;
    private Map<String, Throwable> problems = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/ChunkStreamManager.java`
#### Snippet
```java
    // Used to keep track of the index of the buffer that the user has retrieved, just to ensure
    // that the caller only requests each chunk one at a time, in order.
    int curChunk = 0;

    // Used to keep track of the number of chunks being transferred and not finished yet.
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/ChunkStreamManager.java`
#### Snippet
```java

    // Used to keep track of the number of chunks being transferred and not finished yet.
    volatile long chunksBeingTransferred = 0L;

    StreamState(String shuffleKey, FileManagedBuffers buffers) {
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
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
public class MemoryManager {
  private static final Logger logger = LoggerFactory.getLogger(MemoryManager.class);
  private static volatile MemoryManager _INSTANCE = null;
  private long maxDirectorMemory = 0;
  private final long pausePushDataThreshold;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
  // For buffer stream
  private final AtomicLong readBufferCounter = new AtomicLong(0);
  private long readBufferThreshold = 0;
  private final ReadBufferDispatcher readBufferDispatcher;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(MemoryManager.class);
  private static volatile MemoryManager _INSTANCE = null;
  private long maxDirectorMemory = 0;
  private final long pausePushDataThreshold;
  private final long pauseReplicateThreshold;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
  // For memory shuffle storage
  private final AtomicLong memoryShuffleStorageCounter = new AtomicLong(0);
  private long memoryShuffleStorageThreshold = 0;

  public static MemoryManager initialize(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
      ThreadUtils.newDaemonSingleThreadExecutor("memory-manager-actor");

  private AtomicLong nettyMemoryCounter = null;
  private final AtomicLong sortMemoryCounter = new AtomicLong(0);
  private final AtomicLong diskBufferCounter = new AtomicLong(0);
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
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/CongestionController.java`
#### Snippet
```java

  private static final Logger logger = LoggerFactory.getLogger(CongestionController.class);
  private static volatile CongestionController _INSTANCE = null;
  private final WorkerSource workerSource;

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
Field initialization to `false` is redundant
in `common/src/main/java/org/apache/celeborn/common/protocol/StorageInfo.java`
#### Snippet
```java
  private String mountPoint = UNKNOWN_DISK;
  // if a file is committed, field "finalResult" will be true
  private boolean finalResult = false;
  private String filePath;

```

## RuleId[ruleID=InstanceofCatchParameter]
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

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
      } catch (Exception e) {
        currentException = e;
        if (e instanceof InterruptedException) {
          Thread.currentThread().interrupt();
        }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/org/apache/celeborn/common/network/util/JavaUtils.java`
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

## RuleId[ruleID=SynchronizeOnThis]
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
      RpcEndpointRef driverRef, CelebornConf conf, UserIdentifier userIdentifier) {
    if (null == _instance || !initialized) {
      synchronized (ShuffleClient.class) {
        if (null == _instance) {
          // During the execution of Spark tasks, each task may be interrupted due to speculative
```

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
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java

  public void releaseSortMemory(long size) {
    synchronized (this) {
      if (sortMemoryCounter.get() - size < 0) {
        sortMemoryCounter.set(0);
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
                congestionController.produceBytes(fileInfo.getUserIdentifier(), numBytes));

    synchronized (this) {
      if (closed) {
        String msg = "FileWriter has already closed!, fileName " + fileInfo.getFilePath();
```

## RuleId[ruleID=DoubleBraceInitialization]
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

## RuleId[ruleID=NonExceptionNameEndsWithException]
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

## RuleId[ruleID=UnusedAssignment]
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

### UnusedAssignment
Variable `readBufferThreshold` initializer `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
  // For buffer stream
  private final AtomicLong readBufferCounter = new AtomicLong(0);
  private long readBufferThreshold = 0;
  private final ReadBufferDispatcher readBufferDispatcher;

```

### UnusedAssignment
Variable `maxMemMethod` initializer `null` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
        };

    Method maxMemMethod = null;
    for (String[] provider : providers) {
      String clazz = provider[0];
```

### UnusedAssignment
Variable `memoryShuffleStorageThreshold` initializer `0` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
  // For memory shuffle storage
  private final AtomicLong memoryShuffleStorageCounter = new AtomicLong(0);
  private long memoryShuffleStorageThreshold = 0;

  public static MemoryManager initialize(
```

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
Variable `fileInCanonicalDir` initializer `null` is redundant
in `common/src/main/java/org/apache/celeborn/common/network/util/JavaUtils.java`
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
in `common/src/main/java/org/apache/celeborn/common/network/util/JavaUtils.java`
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
The value `buffersRead.isEmpty()` assigned to `notifyDataAvailable` is never used
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java

        if (!recycleBuffer) {
          notifyDataAvailable = buffersRead.isEmpty();
          buffersRead.add(new Buffer(buffer, consumer));
        }
```

## RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=IOResource]
### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapPartitionFileWriter.java`
#### Snippet
```java
        rangeReadFilter);
    if (!fileInfo.isHdfs()) {
      channelIndex = new FileOutputStream(fileInfo.getIndexPath()).getChannel();
    } else {
      try {
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
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      this.fileInfo = fileInfo;
      readExecutor = storageFetcherPool.getExecutorPool(fileInfo.getMountPoint());
      this.dataFileChanel = new FileInputStream(fileInfo.getFile()).getChannel();
      this.indexChannel = new FileInputStream(fileInfo.getIndexPath()).getChannel();
    }
```

### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      readExecutor = storageFetcherPool.getExecutorPool(fileInfo.getMountPoint());
      this.dataFileChanel = new FileInputStream(fileInfo.getFile()).getChannel();
      this.indexChannel = new FileInputStream(fileInfo.getIndexPath()).getChannel();
    }

```

## RuleId[ruleID=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'Stream.mapToLong().sum()'
in `common/src/main/java/org/apache/celeborn/common/network/server/ChunkStreamManager.java`
#### Snippet
```java
  @VisibleForTesting
  public long numShuffleSteams() {
    return shuffleStreamIds.values().stream().flatMap(Set::stream).count();
  }
}
```

## RuleId[ruleID=FieldMayBeStatic]
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

  final int BATCH_HEADER_SIZE = 4 * 4;

  // key: shuffleId, value: (partitionId, PartitionLocation)
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
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
Class `ExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/util/ExceptionUtils.java`
#### Snippet
```java
import org.apache.celeborn.common.exception.CelebornIOException;

public class ExceptionUtils {

  public static void wrapAndThrowIOException(Exception exception) throws IOException {
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
Class `JavaUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/apache/celeborn/common/network/util/JavaUtils.java`
#### Snippet
```java
 * Utils, just accessible within this package.
 */
public class JavaUtils {
  private static final Logger logger = LoggerFactory.getLogger(JavaUtils.class);

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

## RuleId[ruleID=UnnecessarySemicolon]
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

## RuleId[ruleID=DataFlowIssue]
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
Variable is already assigned to this value
in `common/src/main/java/org/apache/celeborn/common/meta/FileManagedBuffers.java`
#### Snippet
```java
    } else {
      offsets = new long[1];
      offsets[0] = 0;
    }
    chunkTracker = new BitSet(numChunks);
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
Method invocation `setAccessible` may produce `NullPointerException`
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/MemoryManager.java`
#### Snippet
```java
        }
      }
      field.setAccessible(true);
      nettyMemoryCounter = ((AtomicLong) field.get(PlatformDependent.class));
    } catch (Exception e) {
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
        throw (IOException) currentException;
      } else {
        throw new CelebornIOException(currentException.getMessage(), currentException);
      }
    }
```

### DataFlowIssue
Dereference of `readBuf` may produce `NullPointerException`
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
          logger.debug(
              "send {} to stream {} ,fileInfo: {}",
              readBuf.byteBuf.readableBytes(),
              streamId,
              fileInfo.getFilePath());
```

## RuleId[ruleID=MethodOverloadsParentMethod]
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

## RuleId[ruleID=Convert2MethodRef]
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
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
        ThreadUtils.newDaemonSingleThreadScheduledExecutor("push-timeout-checker-" + this);
    pushTimeoutChecker.scheduleAtFixedRate(
        () -> failExpiredPushRequest(),
        pushTimeoutCheckerInterval,
        pushTimeoutCheckerInterval,
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
          () -> {
            // Key for IO schedule.
            readBuffers();
          });
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
        storageFetcherPool
            .getExecutorPool(streamReader.fileInfo.getMountPoint())
            .submit(() -> streamReader.sendData());
      }
    }
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
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

## RuleId[ruleID=UnnecessaryToStringCall]
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

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
              attemptId,
              location.getUniqueId());
          logger.debug("RegionStart  for location {}.", location.toString());
          TransportClient client = createClientWaitingInFlightRequest(location, mapKey, pushState);
          RegionStart regionStart =
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
              attemptId,
              location.getUniqueId());
          logger.debug("PushDataHandShake location {}", location.toString());
          TransportClient client = createClientWaitingInFlightRequest(location, mapKey, pushState);
          PushDataHandShake handShake =
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
              attemptId,
              location.getUniqueId());
          logger.debug("RegionFinish for location {}.", location.toString());
          TransportClient client = createClientWaitingInFlightRequest(location, mapKey, pushState);
          RegionFinish regionFinish =
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TrimCache` may be 'static'
in `common/src/main/java/org/apache/celeborn/common/network/server/ChannelsLimiter.java`
#### Snippet
```java
  }

  class TrimCache {}
}

```

### InnerClassMayBeStatic
Inner class `StreamState` may be 'static'
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
  private final Object lock = new Object();

  protected class StreamState {
    private Channel associatedChannel;
    private int bufferSize;
```

### InnerClassMayBeStatic
Inner class `Buffer` may be 'static'
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
  }

  private class Buffer {
    private ByteBuf byteBuf;
    private Consumer<ByteBuf> byteBufferConsumer;
```

## RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
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

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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
        mapIdBitMap.add(mapId);
      }
      if (flushBuffer.readableBytes() != 0
          && flushBuffer.readableBytes() + numBytes >= this.flusherBufferSize) {
        flush(false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `flushBuffer` accessed in synchronized context
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
      }
      if (flushBuffer.readableBytes() != 0
          && flushBuffer.readableBytes() + numBytes >= this.flusherBufferSize) {
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
Non-private field `buffers` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
    public synchronized void readBuffers() {
      PriorityQueue<DataPartitionReader> sortedReaders = new PriorityQueue<>(readers);
      while (buffers.size() > 0 && !sortedReaders.isEmpty()) {
        DataPartitionReader reader = sortedReaders.poll();
        try {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `buffers` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
        DataPartitionReader reader = sortedReaders.poll();
        try {
          if (!reader.readAndSend(buffers, (buffer) -> this.recycle(buffer, buffers))) {
            readers.remove(reader);
          }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `dataFileChanel` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      DataPartitionReader dataPartitionReader =
          new DataPartitionReader(startSubIndex, endSubIndex, fileInfo, streamId);
      dataPartitionReader.open(dataFileChanel, indexChannel);
      // allocate resources when the first reader is registered
      boolean allocateResources = readers.isEmpty();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `indexChannel` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      DataPartitionReader dataPartitionReader =
          new DataPartitionReader(startSubIndex, endSubIndex, fileInfo, streamId);
      dataPartitionReader.open(dataFileChanel, indexChannel);
      // allocate resources when the first reader is registered
      boolean allocateResources = readers.isEmpty();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `minReadBuffers` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      if (allocateResources) {
        memoryManager.requestReadBuffers(
            minReadBuffers,
            maxReadBuffers,
            fileInfo.getBufferSize(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxReadBuffers` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
        memoryManager.requestReadBuffers(
            minReadBuffers,
            maxReadBuffers,
            fileInfo.getBufferSize(),
            (allocatedBuffers, throwable) ->
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isReleased` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      final Throwable throwable;
      synchronized (lock) {
        recycleBuffer = isReleased || isFinished || isError;
        throwable = errorCause;
        isFinished = !hasRemaining;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isFinished` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      final Throwable throwable;
      synchronized (lock) {
        recycleBuffer = isReleased || isFinished || isError;
        throwable = errorCause;
        isFinished = !hasRemaining;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isError` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      final Throwable throwable;
      synchronized (lock) {
        recycleBuffer = isReleased || isFinished || isError;
        throwable = errorCause;
        isFinished = !hasRemaining;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `errorCause` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
      synchronized (lock) {
        recycleBuffer = isReleased || isFinished || isError;
        throwable = errorCause;
        isFinished = !hasRemaining;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isFinished` accessed in synchronized context
in `common/src/main/java/org/apache/celeborn/common/network/server/BufferStreamManager.java`
#### Snippet
```java
        recycleBuffer = isReleased || isFinished || isError;
        throwable = errorCause;
        isFinished = !hasRemaining;

        if (!recycleBuffer) {
```

## RuleId[ruleID=RedundantSuppression]
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

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

## RuleId[ruleID=SystemOutErr]
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

## RuleId[ruleID=CovariantEquals]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
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
Constructor `FileWriter()` of an abstract class should not be declared 'public'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
  protected final FlushNotifier notifier = new FlushNotifier();

  public FileWriter(
      FileInfo fileInfo,
      Flusher flusher,
```

## RuleId[ruleID=Convert2Lambda]
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

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
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

## RuleId[ruleID=AssignmentToMethodParameter]
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

### AssignmentToMethodParameter
Assignment to method parameter `pushState`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
        return null;
      }
      pushState = getPushState(mapKey);
      // force data has been send
      limitZeroInFlight(mapKey, pushState);
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

## RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/write/DataPushQueue.java`
#### Snippet
```java
      }
    }
    return null;
  }

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
in `common/src/main/java/org/apache/celeborn/common/haclient/RssHARetryClient.java`
#### Snippet
```java
      return new Tuple2<>(requestId.split(SPLITER)[0], Long.valueOf(requestId.split(SPLITER)[1]));
    } else {
      return null;
    }
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
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
                  bufferSize);
          client.sendRpcSync(handShake.toByteBuffer(), conf.pushDataTimeoutMs());
          return null;
        });
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

### ReturnNull
Return of `null`
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
            mapId,
            attemptId);
        return null;
      }
      pushState = getPushState(mapKey);
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
              new RegionFinish(MASTER_MODE, shuffleKey, location.getUniqueId(), attemptId);
          client.sendRpcSync(regionFinish.toByteBuffer(), conf.pushDataTimeoutMs());
          return null;
        });
  }
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `common/src/main/java/org/apache/celeborn/common/network/server/ChunkStreamManager.java`
#### Snippet
```java
        (key, value) -> {
          if (value == null) {
            value = ConcurrentHashMap.newKeySet();
          }
          value.add(myStreamId);
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `isIOException` is redundant
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java

  private boolean shouldRetry(Throwable e) {
    boolean isIOException =
        e instanceof IOException
            || e instanceof TimeoutException
```

## RuleId[ruleID=BusyWait]
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
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
                  memoryManager.reserveSortMemory(reservedMemoryPerPartition);
                  while (!memoryManager.sortMemoryReady()) {
                    Thread.sleep(20);
                  }
                  fileSorterExecutors.submit(
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
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/ReadBufferDispatcher.java`
#### Snippet
```java
              // If dispatcher can not allocate minimum buffers, it will wait here until necessary
              // buffers are get.
              Thread.sleep(3);
            } catch (InterruptedException e) {
              logger.info("Buffer dispatcher is closing");
```

## RuleId[ruleID=ThreadStartInConstruction]
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
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
              }
            });
    fileSorterSchedulerThread.start();
  }

```

### ThreadStartInConstruction
Call to `start()` during object construction
in `common/src/main/java/org/apache/celeborn/common/network/server/memory/ReadBufferDispatcher.java`
#### Snippet
```java
    this.memoryManager = memoryManager;
    this.setName("Read-Buffer-Dispatcher");
    this.start();
  }

```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
                fetchChunkRetryCnt,
                fetchChunkMaxRetry);
            Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
          }
        }
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
                fetchChunkRetryCnt,
                fetchChunkMaxRetry);
            Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
          }
        }
```

### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
            } else {
              logger.warn("Fetch chunk failed {}/{} times", fetchChunkRetryCnt, fetchChunkMaxRetry);
              Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
              currentReader = createReaderWithRetry(currentReader.getLocation());
            }
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
            } else {
              logger.warn("Fetch chunk failed {}/{} times", fetchChunkRetryCnt, fetchChunkMaxRetry);
              Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
              currentReader = createReaderWithRetry(currentReader.getLocation());
            }
```

### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
        if (shouldRetry(e)) {
          retryTimes++;
          Uninterruptibles.sleepUninterruptibly(
              conf.networkIoRetryWaitMs(TransportModuleConstants.PUSH_MODULE),
              TimeUnit.MILLISECONDS);
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
        if (shouldRetry(e)) {
          retryTimes++;
          Uninterruptibles.sleepUninterruptibly(
              conf.networkIoRetryWaitMs(TransportModuleConstants.PUSH_MODULE),
              TimeUnit.MILLISECONDS);
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

