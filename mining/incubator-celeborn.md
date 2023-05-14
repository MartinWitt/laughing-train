# incubator-celeborn 
 
# Bad smells
I found 212 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 57 | false |
| UNCHECKED_WARNING | 24 | false |
| JavadocDeclaration | 16 | false |
| DataFlowIssue | 11 | false |
| IgnoreResultOfCall | 10 | false |
| UnstableApiUsage | 10 | false |
| UnusedAssignment | 9 | false |
| ConstantValue | 9 | false |
| BusyWait | 7 | false |
| FieldCanBeLocal | 6 | false |
| NullableProblems | 5 | false |
| UnnecessarySemicolon | 3 | false |
| DuplicatedCode | 3 | false |
| SynchronizeOnNonFinalField | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| NonAtomicOperationOnVolatileField | 3 | false |
| JavadocReference | 2 | false |
| Deprecation | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| InnerClassMayBeStatic | 2 | true |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| AutoCloseableResource | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| ReplaceInefficientStreamCount | 1 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| RefusedBequest | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CatchMayIgnoreException | 1 | false |
| IOStreamConstructor | 1 | false |
| UnnecessaryReturn | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
| FuseStreamOperations | 1 | false |
| StringConcatenationInLoops | 1 | false |
| WriteOnlyObject | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.apache.celeborn.service.deploy.worker.congestcontrol.TimeSlidingHub.TimeSlidingNode' to 'N'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
  public synchronized void add(long currentTimestamp, N newNode) {
    if (_deque.size() == 0) {
      _deque.add(Pair.of(currentTimestamp, (N) newNode.clone()));
      sumNode = (N) newNode.clone();
      return;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.celeborn.service.deploy.worker.congestcontrol.TimeSlidingHub.TimeSlidingNode' to 'N'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
    if (_deque.size() == 0) {
      _deque.add(Pair.of(currentTimestamp, (N) newNode.clone()));
      sumNode = (N) newNode.clone();
      return;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.celeborn.service.deploy.worker.congestcontrol.TimeSlidingHub.TimeSlidingNode' to 'N'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
        // and create a new sliding list
        _deque.clear();
        _deque.add(Pair.of(currentTimestamp, (N) newNode.clone()));
        sumNode = (N) newNode.clone();
        return;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.celeborn.service.deploy.worker.congestcontrol.TimeSlidingHub.TimeSlidingNode' to 'N'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
        _deque.clear();
        _deque.add(Pair.of(currentTimestamp, (N) newNode.clone()));
        sumNode = (N) newNode.clone();
        return;
      }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.celeborn.service.deploy.worker.congestcontrol.TimeSlidingHub.TimeSlidingNode' to 'N'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
      }

      _deque.add(Pair.of(lastNode.getLeft() + intervalPerBucketInMills, (N) newNode.clone()));
      sumNode.combineNode(newNode);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/MetaHandler.java`
#### Snippet
```java
              .forEach(
                  (k, v) -> {
                    workerAllocations.put(k, new HashMap<>(v.getSlotMap()));
                  });
          LOG.debug("Handle request slots for {}", shuffleKey);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
        new HashMap<>();
    List<Integer> remainPartitions =
        roundRobin(
            slots,
            partitionIds,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
            slots,
            partitionIds,
            new ArrayList<>(restriction.keySet()),
            restriction,
            shouldReplicate);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
            slots,
            partitionIds,
            new ArrayList<>(restriction.keySet()),
            restriction,
            shouldReplicate);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
            shouldReplicate);
    if (!remainPartitions.isEmpty()) {
      roundRobin(slots, remainPartitions, new ArrayList<>(workers), null, shouldReplicate);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
            shouldReplicate);
    if (!remainPartitions.isEmpty()) {
      roundRobin(slots, remainPartitions, new ArrayList<>(workers), null, shouldReplicate);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.atomic.AtomicReference' to 'java.util.concurrent.atomic.AtomicReference'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
        fileInfo);

    AtomicReference<IOException> exception = new AtomicReference();
    MapDataPartition mapDataPartition =
        activeMapPartitions.compute(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java
    this(
        file.getAbsolutePath(),
        new ArrayList(Arrays.asList(0L)),
        userIdentifier,
        PartitionType.REDUCE);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java
    this(
        file.getAbsolutePath(),
        new ArrayList(Arrays.asList(0L)),
        userIdentifier,
        PartitionType.REDUCE);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java

  public FileInfo(String filePath, UserIdentifier userIdentifier, PartitionType partitionType) {
    this(filePath, new ArrayList(Arrays.asList(0L)), userIdentifier, partitionType);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java

  public FileInfo(String filePath, UserIdentifier userIdentifier, PartitionType partitionType) {
    this(filePath, new ArrayList(Arrays.asList(0L)), userIdentifier, partitionType);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ConcurrentHashMap' to 'java.util.concurrent.ConcurrentHashMap'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
  public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap() {
    if (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_9)) {
      return new ConcurrentHashMap();
    } else {
      return new ConcurrentHashMapForJDK8();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.celeborn.common.util.JavaUtils.ConcurrentHashMapForJDK8' to 'java.util.concurrent.ConcurrentHashMap'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      return new ConcurrentHashMap();
    } else {
      return new ConcurrentHashMapForJDK8();
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ConcurrentHashMap' to 'java.util.concurrent.ConcurrentHashMap'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      Map<? extends K, ? extends V> m) {
    if (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_9)) {
      return new ConcurrentHashMap(m);
    } else {
      return new ConcurrentHashMapForJDK8(m);
```

### UNCHECKED_WARNING
Unchecked call to 'ConcurrentHashMap(Map)' as a member of raw type 'java.util.concurrent.ConcurrentHashMap'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      Map<? extends K, ? extends V> m) {
    if (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_9)) {
      return new ConcurrentHashMap(m);
    } else {
      return new ConcurrentHashMapForJDK8(m);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.celeborn.common.util.JavaUtils.ConcurrentHashMapForJDK8' to 'java.util.concurrent.ConcurrentHashMap'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      return new ConcurrentHashMap(m);
    } else {
      return new ConcurrentHashMapForJDK8(m);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'ConcurrentHashMapForJDK8(Map)' as a member of raw type 'org.apache.celeborn.common.util.JavaUtils.ConcurrentHashMapForJDK8'
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java
      return new ConcurrentHashMap(m);
    } else {
      return new ConcurrentHashMapForJDK8(m);
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `common/src/main/java/org/apache/celeborn/common/protocol/StorageInfo.java`
#### Snippet
```java

  public static Map<Integer, Type> typesMap =
      new HashMap() {
        {
          for (Type type : Type.values()) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `common/src/main/java/org/apache/celeborn/common/protocol/StorageInfo.java`
#### Snippet
```java
        {
          for (Type type : Type.values()) {
            put(type.value, type);
          }
        }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `sumNode`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
/**
 * A time sliding list that group different {@link TimeSlidingNode} with corresponding timestamp by
 * exact interval 1 second. Internally hold a {@link sumNode} to get the sum of the nodes in the
 * list.
 *
```

### JavadocReference
Cannot resolve symbol `sum`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/congestcontrol/TimeSlidingHub.java`
#### Snippet
```java
 * list.
 *
 * <p>This list is thread-safe, but {@link TimeSlidingNode} returned by the method {@link sum}
 * should only be readable, do not try to update it.
 */
```

## RuleId[id=UnnecessarySemicolon]
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
in `common/src/main/java/org/apache/celeborn/common/protocol/SlotsAssignPolicy.java`
#### Snippet
```java
public enum SlotsAssignPolicy {
  ROUNDROBIN,
  LOADAWARE;
}

```

## RuleId[id=DataFlowIssue]
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
Dereference of `throwable` may produce `NullPointerException`
in `common/src/main/java/org/apache/celeborn/common/haclient/RssHARetryClient.java`
#### Snippet
```java

    LOG.error("Send rpc with failure, has tried {}, max try {}!", numTries, maxRetries, throwable);
    throw throwable;
  }

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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has only 'default' case
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/MetaHandler.java`
#### Snippet
```java
    ResourceResponse.Builder responseBuilder = getMasterMetaResponseBuilder(request);
    try {
      switch (cmdType) {
        default:
          throw new IOException("Can not parse this command!" + request);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
              StatusCode cause = getPushDataFailCause(e.getMessage());

              if (pushState.exception.get() != null) {
                return;
              }

              if (remainReviveTimes <= 0) {
                if (e instanceof CelebornIOException) {
                  callback.onFailure(e);
                } else {
                  callback.onFailure(new CelebornIOException(cause, e));
                }
                return;
              }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/celeborn/client/compress/RssLz4Compressor.java`
#### Snippet
```java
    final int compressMethod;
    if (compressedLength >= length) {
      compressMethod = COMPRESSION_METHOD_RAW;
      compressedLength = length;
      System.arraycopy(data, offset, compressedBuffer, HEADER_LENGTH, length);
    } else {
      compressMethod = COMPRESSION_METHOD_LZ4;
    }

    compressedBuffer[MAGIC_LENGTH] = (byte) compressMethod;
    writeIntLE(compressedLength, compressedBuffer, MAGIC_LENGTH + 1);
    writeIntLE(length, compressedBuffer, MAGIC_LENGTH + 5);
    writeIntLE(check, compressedBuffer, MAGIC_LENGTH + 9);

    compressedTotalSize = HEADER_LENGTH + compressedLength;
```

### DuplicatedCode
Duplicated code
in `master/src/main/java/org/apache/celeborn/service/deploy/master/SlotsAllocator.java`
#### Snippet
```java
      if (restrictions != null) {
        while (restrictions.get(workers.get(nextMasterInd)).stream()
                .mapToLong(i -> i.usableSlots)
                .sum()
            <= 0) {
          nextMasterInd = (nextMasterInd + 1) % workers.size();
          if (nextMasterInd == masterIndex) {
            break outer;
          }
        }
        storageInfo =
            getStorageInfo(workers, nextMasterInd, restrictions, workerDiskIndexForMaster);
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
   */
  public void restoreMetaFromFile(File file) throws IOException {
    try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
      PbSnapshotMetaInfo snapshotMetaInfo = PbSnapshotMetaInfo.parseFrom(in);

```

## RuleId[id=Deprecation]
### Deprecation
'closeQuietly(java.io.Closeable)' is deprecated
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
    isReleased = true;

    IOUtils.closeQuietly(dataFileChanel);
    IOUtils.closeQuietly(indexChannel);

```

### Deprecation
'closeQuietly(java.io.Closeable)' is deprecated
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java

    IOUtils.closeQuietly(dataFileChanel);
    IOUtils.closeQuietly(indexChannel);

    MemoryManager.instance().removeReadBufferTargetChangeListener(this);
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`allowCache ? PooledByteBufAllocator.defaultUseCacheForAllThreads() : false` can be simplified to 'allowCache \&\& PooledByteBufAllocator.defaultUseCacheForAllThreads()'
in `common/src/main/java/org/apache/celeborn/common/network/util/NettyUtils.java`
#### Snippet
```java
        allowCache ? PooledByteBufAllocator.defaultSmallCacheSize() : 0,
        allowCache ? PooledByteBufAllocator.defaultNormalCacheSize() : 0,
        allowCache ? PooledByteBufAllocator.defaultUseCacheForAllThreads() : false);
  }
}
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
Inner class `TrimCache` may be 'static'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ChannelsLimiter.java`
#### Snippet
```java
  }

  class TrimCache {}
}

```

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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java

    @Override
    public int compareTo(Delayed o) {
      long otherCreateMillis = ((DelayedStreamId) o).getCreateMillis();
      if (this.createMillis < otherCreateMillis) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
          return -1;
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
      if (b == null) {
        throw new NullPointerException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/org/apache/celeborn/common/network/util/LimitedInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    if (left == 0) {
      return -1;
```

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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
  private final StateMachine masterStateMachine;

  private final ScheduledExecutorService scheduledRoleChecker =
      ThreadUtils.newDaemonSingleThreadScheduledExecutor("ratis-role-checker");
  private long roleCheckIntervalMs;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
  // For memory shuffle storage
  private final AtomicLong memoryShuffleStorageCounter = new AtomicLong(0);
  private long memoryShuffleStorageThreshold = 0;

  public static MemoryManager initialize(CelebornConf conf) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/org/apache/celeborn/common/network/util/NettyMemoryMetrics.java`
#### Snippet
```java
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  private final PooledByteBufAllocator pooledAllocator;

  private final boolean verboseMetricsEnabled;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
  protected final CelebornConf conf;

  private final UserIdentifier userIdentifier;

  private final int registerShuffleMaxRetries;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
  private final AtomicLong timeOfLastRequestNs;

  private final long pushTimeoutCheckerInterval;
  private static ScheduledExecutorService pushTimeoutChecker = null;
  private ScheduledFuture scheduleFuture;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/org/apache/celeborn/common/haclient/MasterNotLeaderException.java`
#### Snippet
```java
public class MasterNotLeaderException extends IOException {

  private final String currentPeer;
  private final String leaderPeer;

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
Result of `Condition.await()` is ignored
in `client/src/main/java/org/apache/celeborn/client/write/DataPusher.java`
#### Snippet
```java
    try {
      while (idleQueue.remainingCapacity() > 0 && exceptionRef.get() == null) {
        idleFull.await(WAIT_TIME_NANOS, TimeUnit.NANOSECONDS);
      }
    } catch (InterruptedException e) {
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

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
    } else {
      while (indexBuf.hasRemaining()) {
        indexFileChannel.write(indexBuf);
      }
      indexFileChannel.close();
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
      try {
        fileSorterExecutors.shutdown();
        fileSorterExecutors.awaitTermination(
            partitionSorterShutdownAwaitTime, TimeUnit.MILLISECONDS);
        if (!fileSorterExecutors.isShutdown()) {
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

## RuleId[id=SynchronizeOnNonFinalField]
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

  public void removeReadBufferTargetChangeListener(ReadBufferTargetChangeListener listener) {
    synchronized (readBufferTargetChangeListeners) {
      readBufferTargetChangeListeners.remove(listener);
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cachedPeerRole'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
  private long roleCheckIntervalMs;
  private final ReentrantReadWriteLock roleCheckLock = new ReentrantReadWriteLock();
  private Optional<RaftProtos.RaftPeerRole> cachedPeerRole = Optional.empty();
  private Optional<String> cachedLeaderPeerRpcEndpoint = Optional.empty();
  private final CelebornConf conf;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cachedLeaderPeerRpcEndpoint'
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
  private final ReentrantReadWriteLock roleCheckLock = new ReentrantReadWriteLock();
  private Optional<RaftProtos.RaftPeerRole> cachedPeerRole = Optional.empty();
  private Optional<String> cachedLeaderPeerRpcEndpoint = Optional.empty();
  private final CelebornConf conf;
  private long workerTimeoutDeadline;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `common/src/main/java/org/apache/celeborn/common/network/buffer/FileSegmentManagedBuffer.java`
#### Snippet
```java
    FileChannel channel = null;
    try {
      channel = new RandomAccessFile(file, "r").getChannel();
      // Just copy the buffer if it's sufficiently small, as memory mapping has a high overhead.
      if (length < conf.memoryMapBytes()) {
```

### AutoCloseableResource
'TransportClient' used without 'try'-with-resources statement
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java
        }
      }
      clientPool.clients[clientIndex] = internalCreateClient(resolvedAddress, decoder);
      return clientPool.clients[clientIndex];
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
         *
         * @param snapshotRetentionPolicy snapshot retention policy
         * @throws IOException
         */
        @Override
```

### JavadocDeclaration
`@param raftClientRequest` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/StateMachine.java`
#### Snippet
```java
   * Handle the RaftClientRequest and return TransactionContext object.
   *
   * @param raftClientRequest
   * @return TransactionContext
   */
```

### JavadocDeclaration
`@param file` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
   * Used for ratis state machine to load snapshot
   *
   * @param file
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
   *
   * @param file
   * @throws IOException
   */
  public void restoreMetaFromFile(File file) throws IOException {
```

### JavadocDeclaration
`@param file` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
   * Used for ratis state machine to take snapshot
   *
   * @param file
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/AbstractMetaManager.java`
#### Snippet
```java
   *
   * @param file
   * @throws IOException
   */
  public void writeMetaInfoToFile(File file) throws IOException, RuntimeException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
   * Start the Ratis server.
   *
   * @throws IOException
   */
  public void start() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HARaftServer.java`
#### Snippet
```java
   * @param ratisAddr address of the ratis server
   * @param raftPeers peer nodes in the raft ring
   * @throws IOException
   */
  private HARaftServer(
```

### JavadocDeclaration
`@param data` tag description is missing
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/FileWriter.java`
#### Snippet
```java
   * assume data size is less than chunk capacity
   *
   * @param data
   */
  public void write(ByteBuf data) throws IOException {
```

### JavadocDeclaration
`@param workerStatus` tag description is missing
in `client/src/main/java/org/apache/celeborn/client/listener/WorkerStatusListener.java`
#### Snippet
```java
   * shutdownWorkers
   *
   * @param workerStatus
   */
  void notifyChangedWorkersStatus(WorkersStatus workerStatus);
```

### JavadocDeclaration
`@param addressPair` tag description is missing
in `common/src/main/java/org/apache/celeborn/common/write/PushState.java`
#### Snippet
```java
   * Not thread-safe
   *
   * @param addressPair
   * @param loc
   * @param batchId
```

### JavadocDeclaration
`@param loc` tag description is missing
in `common/src/main/java/org/apache/celeborn/common/write/PushState.java`
#### Snippet
```java
   *
   * @param addressPair
   * @param loc
   * @param batchId
   * @param body
```

### JavadocDeclaration
`@param batchId` tag description is missing
in `common/src/main/java/org/apache/celeborn/common/write/PushState.java`
#### Snippet
```java
   * @param addressPair
   * @param loc
   * @param batchId
   * @param body
   * @return
```

### JavadocDeclaration
`@param body` tag description is missing
in `common/src/main/java/org/apache/celeborn/common/write/PushState.java`
#### Snippet
```java
   * @param loc
   * @param batchId
   * @param body
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/celeborn/common/write/PushState.java`
#### Snippet
```java
   * @param batchId
   * @param body
   * @return
   */
  public boolean addBatchData(String addressPair, PartitionLocation loc, int batchId, byte[] body) {
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/celeborn/common/haclient/RssHARetryClient.java`
#### Snippet
```java
   * manually.
   *
   * @return
   */
  public static String genRequestId() {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `logger` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClient.java`
#### Snippet
```java
  private static volatile boolean initialized = false;
  private static volatile FileSystem hdfsFs;
  private static Logger logger = LoggerFactory.getLogger(ShuffleClient.class);

  // for testing
```

### FieldMayBeFinal
Field `INDEX_ENTRY_SIZE` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private volatile long currentPartitionRemainingBytes;
  private FileInfo fileInfo;
  private int INDEX_ENTRY_SIZE = 16;
  private long streamId;
  protected final Object lock = new Object();
```

### FieldMayBeFinal
Field `fileInfo` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private long dataConsumingOffset;
  private volatile long currentPartitionRemainingBytes;
  private FileInfo fileInfo;
  private int INDEX_ENTRY_SIZE = 16;
  private long streamId;
```

### FieldMayBeFinal
Field `numInUseBuffers` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private Runnable recycleStream;

  private AtomicInteger numInUseBuffers = new AtomicInteger(0);
  private boolean isOpen = false;

```

### FieldMayBeFinal
Field `associatedChannel` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private FileChannel indexFileChannel;

  private Channel associatedChannel;

  private Runnable recycleStream;
```

### FieldMayBeFinal
Field `recycleStream` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private Channel associatedChannel;

  private Runnable recycleStream;

  private AtomicInteger numInUseBuffers = new AtomicInteger(0);
```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
  private FileInfo fileInfo;
  private int INDEX_ENTRY_SIZE = 16;
  private long streamId;
  protected final Object lock = new Object();

```

### FieldMayBeFinal
Field `needTrimChannels` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ChannelsLimiter.java`
#### Snippet
```java
  private final String moduleName;
  private final AtomicBoolean isPaused = new AtomicBoolean(false);
  private AtomicInteger needTrimChannels = new AtomicInteger(0);
  private long waitTrimInterval;

```

### FieldMayBeFinal
Field `waitTrimInterval` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ChannelsLimiter.java`
#### Snippet
```java
  private final AtomicBoolean isPaused = new AtomicBoolean(false);
  private AtomicInteger needTrimChannels = new AtomicInteger(0);
  private long waitTrimInterval;

  public ChannelsLimiter(String moduleName, CelebornConf conf) {
```

### FieldMayBeFinal
Field `recycleConsumer` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/BufferRecycler.java`
#### Snippet
```java
public class BufferRecycler {

  private Consumer<ByteBuf> recycleConsumer;

  public BufferRecycler(Consumer<ByteBuf> recycleConsumer) {
```

### FieldMayBeFinal
Field `minBuffersToTriggerRead` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
  private int maxReadBuffers;
  private int threadsPerMountPoint;
  private int minBuffersToTriggerRead;
  private final BlockingQueue<DelayedStreamId> recycleStreamIds = new DelayQueue<>();

```

### FieldMayBeFinal
Field `bufferSize` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
  protected class StreamState {
    private Channel associatedChannel;
    private int bufferSize;
    private MapDataPartition mapDataPartition;

```

### FieldMayBeFinal
Field `threadsPerMountPoint` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
  private int minReadBuffers;
  private int maxReadBuffers;
  private int threadsPerMountPoint;
  private int minBuffersToTriggerRead;
  private final BlockingQueue<DelayedStreamId> recycleStreamIds = new DelayQueue<>();
```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
    private long createMillis = System.currentTimeMillis();

    private long streamId;

    public DelayedStreamId(long streamId) {
```

### FieldMayBeFinal
Field `mapDataPartition` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
    private Channel associatedChannel;
    private int bufferSize;
    private MapDataPartition mapDataPartition;

    public StreamState(
```

### FieldMayBeFinal
Field `associatedChannel` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java

  protected class StreamState {
    private Channel associatedChannel;
    private int bufferSize;
    private MapDataPartition mapDataPartition;
```

### FieldMayBeFinal
Field `maxReadBuffers` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
  private final HashMap<String, ExecutorService> storageFetcherPool = new HashMap<>();
  private int minReadBuffers;
  private int maxReadBuffers;
  private int threadsPerMountPoint;
  private int minBuffersToTriggerRead;
```

### FieldMayBeFinal
Field `minReadBuffers` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/CreditStreamManager.java`
#### Snippet
```java
  private final ConcurrentHashMap<FileInfo, MapDataPartition> activeMapPartitions;
  private final HashMap<String, ExecutorService> storageFetcherPool = new HashMap<>();
  private int minReadBuffers;
  private int maxReadBuffers;
  private int threadsPerMountPoint;
```

### FieldMayBeFinal
Field `streamHandle` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
  private PartitionLocation location;
  private final TransportClientFactory clientFactory;
  private StreamHandle streamHandle;

  private int returnedChunks;
```

### FieldMayBeFinal
Field `fetchChunkRetryCnt` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java

  // for test
  private int fetchChunkRetryCnt;
  private int fetchChunkMaxRetry;
  private final boolean testFetch;
```

### FieldMayBeFinal
Field `location` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
public class WorkerPartitionReader implements PartitionReader {
  private final Logger logger = LoggerFactory.getLogger(WorkerPartitionReader.class);
  private PartitionLocation location;
  private final TransportClientFactory clientFactory;
  private StreamHandle streamHandle;
```

### FieldMayBeFinal
Field `fetchChunkMaxRetry` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/read/WorkerPartitionReader.java`
#### Snippet
```java
  // for test
  private int fetchChunkRetryCnt;
  private int fetchChunkMaxRetry;
  private final boolean testFetch;

```

### FieldMayBeFinal
Field `indexChannel` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
      JavaUtils.newConcurrentHashMap();
  private FileChannel dataFileChanel;
  private FileChannel indexChannel;
  private long indexSize;
  private volatile boolean isReleased = false;
```

### FieldMayBeFinal
Field `minBuffersToTriggerRead` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private int minReadBuffers;
  private int maxReadBuffers;
  private int minBuffersToTriggerRead;
  private AtomicBoolean hasReadingTask = new AtomicBoolean(false);

```

### FieldMayBeFinal
Field `bufferQueueInitialized` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private volatile boolean isReleased = false;
  private final BufferQueue bufferQueue = new BufferQueue();
  private AtomicBoolean bufferQueueInitialized = new AtomicBoolean(false);
  private MemoryManager memoryManager = MemoryManager.instance();
  private Consumer<Long> recycleStream;
```

### FieldMayBeFinal
Field `hasReadingTask` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private int maxReadBuffers;
  private int minBuffersToTriggerRead;
  private AtomicBoolean hasReadingTask = new AtomicBoolean(false);

  public MapDataPartition(
```

### FieldMayBeFinal
Field `memoryManager` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private final BufferQueue bufferQueue = new BufferQueue();
  private AtomicBoolean bufferQueueInitialized = new AtomicBoolean(false);
  private MemoryManager memoryManager = MemoryManager.instance();
  private Consumer<Long> recycleStream;
  private int minReadBuffers;
```

### FieldMayBeFinal
Field `indexSize` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private FileChannel dataFileChanel;
  private FileChannel indexChannel;
  private long indexSize;
  private volatile boolean isReleased = false;
  private final BufferQueue bufferQueue = new BufferQueue();
```

### FieldMayBeFinal
Field `dataFileChanel` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private final ConcurrentHashMap<Long, MapDataPartitionReader> readers =
      JavaUtils.newConcurrentHashMap();
  private FileChannel dataFileChanel;
  private FileChannel indexChannel;
  private long indexSize;
```

### FieldMayBeFinal
Field `maxReadBuffers` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private Consumer<Long> recycleStream;
  private int minReadBuffers;
  private int maxReadBuffers;
  private int minBuffersToTriggerRead;
  private AtomicBoolean hasReadingTask = new AtomicBoolean(false);
```

### FieldMayBeFinal
Field `minReadBuffers` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private MemoryManager memoryManager = MemoryManager.instance();
  private Consumer<Long> recycleStream;
  private int minReadBuffers;
  private int maxReadBuffers;
  private int minBuffersToTriggerRead;
```

### FieldMayBeFinal
Field `recycleStream` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartition.java`
#### Snippet
```java
  private AtomicBoolean bufferQueueInitialized = new AtomicBoolean(false);
  private MemoryManager memoryManager = MemoryManager.instance();
  private Consumer<Long> recycleStream;
  private int minReadBuffers;
  private int maxReadBuffers;
```

### FieldMayBeFinal
Field `trimInProcess` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/MemoryManager.java`
#### Snippet
```java
      ThreadUtils.newDaemonSingleThreadExecutor("memory-manager-actor");

  private AtomicBoolean trimInProcess = new AtomicBoolean(false);

  private AtomicLong nettyMemoryCounter = null;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/read/DfsPartitionReader.java`
#### Snippet
```java

public class DfsPartitionReader implements PartitionReader {
  private static Logger logger = LoggerFactory.getLogger(DfsPartitionReader.class);
  PartitionLocation location;
  private final int shuffleChunkSize;
```

### FieldMayBeFinal
Field `pushThread` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/write/DataPusher.java`
#### Snippet
```java
  private volatile boolean terminated;
  private final LongAdder[] mapStatusLengths;
  private Thread pushThread;

  public DataPusher(
```

### FieldMayBeFinal
Field `gracefulShutdown` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
  protected final long shuffleChunkSize;
  protected final long reservedMemoryPerPartition;
  private boolean gracefulShutdown;
  private long partitionSorterShutdownAwaitTime;
  private DB sortedFilesDb;
```

### FieldMayBeFinal
Field `memoryManager` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
  private long partitionSorterShutdownAwaitTime;
  private DB sortedFilesDb;
  private MemoryManager memoryManager;

  protected final AbstractSource source;
```

### FieldMayBeFinal
Field `partitionSorterShutdownAwaitTime` may be 'final'
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/PartitionFilesSorter.java`
#### Snippet
```java
  protected final long reservedMemoryPerPartition;
  private boolean gracefulShutdown;
  private long partitionSorterShutdownAwaitTime;
  private DB sortedFilesDb;
  private MemoryManager memoryManager;
```

### FieldMayBeFinal
Field `skipCount` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
    private final int BATCH_HEADER_SIZE = 4 * 4;
    private final byte[] sizeBuf = new byte[BATCH_HEADER_SIZE];
    private LongAdder skipCount = new LongAdder();
    private final boolean rangeReadFilter;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java

public class FileInfo {
  private static Logger logger = LoggerFactory.getLogger(FileInfo.class);
  private String mountPoint;
  private final String filePath;
```

### FieldMayBeFinal
Field `shutdownInProgress` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/util/ShutdownHookManager.java`
#### Snippet
```java
  private final Set<HookEntry> hooks = Collections.synchronizedSet(new HashSet<HookEntry>());

  private AtomicBoolean shutdownInProgress = new AtomicBoolean(false);

  // private to constructor to ensure singularity
```

### FieldMayBeFinal
Field `headerBuf` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/util/TransportFrameDecoder.java`
#### Snippet
```java
  private int bodySize = -1;
  private Message.Type curType = Message.Type.UNKNOWN_TYPE;
  private ByteBuf headerBuf = Unpooled.buffer(HEADER_SIZE, HEADER_SIZE);
  private static final int MAX_FRAME_SIZE = Integer.MAX_VALUE;
  private static final int UNKNOWN_FRAME_SIZE = -1;
```

### FieldMayBeFinal
Field `maxReviveTimes` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
  private final int registerShuffleMaxRetries;
  private final long registerShuffleRetryWaitMs;
  private int maxReviveTimes;
  private boolean testRetryRevive;
  private final int pushBufferMaxSize;
```

### FieldMayBeFinal
Field `testRetryRevive` may be 'final'
in `client/src/main/java/org/apache/celeborn/client/ShuffleClientImpl.java`
#### Snippet
```java
  private final long registerShuffleRetryWaitMs;
  private int maxReviveTimes;
  private boolean testRetryRevive;
  private final int pushBufferMaxSize;
  protected final long pushDataTimeout;
```

### FieldMayBeFinal
Field `enableHeartbeat` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/server/TransportChannelHandler.java`
#### Snippet
```java
  private ScheduledFuture<?> heartbeatFuture;
  private boolean heartbeatFutureCanceled = false;
  private boolean enableHeartbeat;

  public TransportChannelHandler(
```

### FieldMayBeFinal
Field `workerGroup` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java

  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  protected ByteBufAllocator pooledAllocator;

```

### FieldMayBeFinal
Field `scheduleFuture` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportResponseHandler.java`
#### Snippet
```java
  private final long pushTimeoutCheckerInterval;
  private static ScheduledExecutorService pushTimeoutChecker = null;
  private ScheduledFuture scheduleFuture;

  public TransportResponseHandler(TransportConf conf, Channel channel) {
```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/BufferStreamEnd.java`
#### Snippet
```java

public class BufferStreamEnd extends RequestMessage {
  private long streamId;

  public BufferStreamEnd(long streamId) {
```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/ReadAddCredit.java`
#### Snippet
```java

public class ReadAddCredit extends RequestMessage {
  private long streamId;
  private int credit;

```

### FieldMayBeFinal
Field `credit` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/ReadAddCredit.java`
#### Snippet
```java
public class ReadAddCredit extends RequestMessage {
  private long streamId;
  private int credit;

  public ReadAddCredit(long streamId, int credit) {
```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/ReadData.java`
#### Snippet
```java
// It doesn't need decode in worker.
public class ReadData extends RequestMessage {
  private long streamId;

  public ReadData(long streamId, ByteBuf buf) {
```

### FieldMayBeFinal
Field `backlog` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/BacklogAnnouncement.java`
#### Snippet
```java
public class BacklogAnnouncement extends RequestMessage {
  private long streamId;
  private int backlog;

  public BacklogAnnouncement(long streamId, int backlog) {
```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/BacklogAnnouncement.java`
#### Snippet
```java
// This RPC is sent to flink plugin to tell flink client to be ready for buffers.
public class BacklogAnnouncement extends RequestMessage {
  private long streamId;
  private int backlog;

```

### FieldMayBeFinal
Field `streamId` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/TransportableError.java`
#### Snippet
```java

public class TransportableError extends RequestMessage {
  private long streamId;
  private byte[] errorMessage;

```

### FieldMayBeFinal
Field `errorMessage` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/network/protocol/TransportableError.java`
#### Snippet
```java
public class TransportableError extends RequestMessage {
  private long streamId;
  private byte[] errorMessage;

  public TransportableError(long streamId, Throwable throwable) {
```

### FieldMayBeFinal
Field `_hostPushPort` may be 'final'
in `common/src/main/java/org/apache/celeborn/common/protocol/PartitionLocation.java`
#### Snippet
```java
  private StorageInfo storageInfo;
  private RoaringBitmap mapIdBitMap;
  private transient String _hostPushPort;

  public PartitionLocation(PartitionLocation loc) {
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `common/src/main/java/org/apache/celeborn/reflect/DynConstructors.java`
#### Snippet
```java

    private Ctor ctor = null;
    private Map<String, Throwable> problems = new HashMap<>();

    public Builder(Class<?> baseClass) {
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

### UnnecessaryLocalVariable
Local variable `ratisServer` is redundant
in `master/src/main/java/org/apache/celeborn/service/deploy/master/clustermeta/ha/HAHelper.java`
#### Snippet
```java
  public static HARaftServer getRatisServer(AbstractMetaManager masterStatusSystem) {
    if ((masterStatusSystem instanceof HAMasterMetaManager)) {
      HARaftServer ratisServer = ((HAMasterMetaManager) masterStatusSystem).getRatisServer();
      return ratisServer;
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

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/memory/ChannelsLimiter.java`
#### Snippet
```java
      try {
        retryTime += 1;
        Thread.sleep(delta);
      } catch (InterruptedException e) {
        // Do nothing
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
in `common/src/main/java/org/apache/celeborn/common/util/JavaUtils.java`
#### Snippet
```java

      timeout = timeout - 100;
      Thread.sleep(100);
    }
  }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java
    this(
        file.getAbsolutePath(),
        new ArrayList(Arrays.asList(0L)),
        userIdentifier,
        PartitionType.REDUCE);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/org/apache/celeborn/common/meta/FileInfo.java`
#### Snippet
```java

  public FileInfo(String filePath, UserIdentifier userIdentifier, PartitionType partitionType) {
    this(filePath, new ArrayList(Arrays.asList(0L)), userIdentifier, partitionType);
  }

```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/org/apache/celeborn/common/meta/DiskStatus.java`
#### Snippet
```java
      int len = fragment.length();
      if (len >= 1) {
        metric += fragment.substring(0, 1).toUpperCase();
        metric += fragment.substring(1, len).toLowerCase();
      }
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
            }
            if (remainReviveTimes <= 0) {
              if (e instanceof CelebornIOException) {
                callback.onFailure(e);
              } else {
```

## RuleId[id=WriteOnlyObject]
### WriteOnlyObject
Write-only object
in `common/src/main/java/org/apache/celeborn/common/network/client/TransportClientFactory.java`
#### Snippet
```java

    final AtomicReference<TransportClient> clientRef = new AtomicReference<>();
    final AtomicReference<Channel> channelRef = new AtomicReference<>();

    bootstrap.handler(
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
              // so sleep before next try.
              if (fetchChunkRetryCnt % 2 == 0) {
                Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
              }
              currentReader = createReaderWithRetry(currentReader.getLocation().getPeer());
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
              // so sleep before next try.
              if (fetchChunkRetryCnt % 2 == 0) {
                Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
              }
              currentReader = createReaderWithRetry(currentReader.getLocation().getPeer());
```

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
            // so sleep before next try.
            if (fetchChunkRetryCnt % 2 == 0) {
              Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
            }
            location = location.getPeer();
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `client/src/main/java/org/apache/celeborn/client/read/RssInputStream.java`
#### Snippet
```java
            // so sleep before next try.
            if (fetchChunkRetryCnt % 2 == 0) {
              Uninterruptibles.sleepUninterruptibly(retryWaitMs, TimeUnit.MILLISECONDS);
            }
            location = location.getPeer();
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

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `chunksBeingTransferred`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java
    StreamState streamState = streams.get(streamId);
    if (streamState != null) {
      streamState.chunksBeingTransferred++;
    }
  }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `chunksBeingTransferred`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/ChunkStreamManager.java`
#### Snippet
```java
    StreamState streamState = streams.get(streamId);
    if (streamState != null) {
      streamState.chunksBeingTransferred--;
    }
  }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currentPartitionRemainingBytes`
in `worker/src/main/java/org/apache/celeborn/service/deploy/worker/storage/MapDataPartitionReader.java`
#### Snippet
```java
              buffer,
              headerBuffer.capacity());
      currentPartitionRemainingBytes -= readSize;

      logger.debug(
```

