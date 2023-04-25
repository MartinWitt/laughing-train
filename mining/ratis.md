# ratis 
 
# Bad smells
I found 664 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 183 | false |
| ReturnNull | 159 | false |
| SystemOutErr | 68 | false |
| RedundantFieldInitialization | 35 | false |
| AssignmentToMethodParameter | 35 | false |
| SynchronizeOnThis | 20 | false |
| ForLoopReplaceableByWhile | 17 | false |
| NestedAssignment | 14 | false |
| CatchMayIgnoreException | 14 | false |
| UnnecessaryFullyQualifiedName | 11 | false |
| TrivialStringConcatenation | 8 | false |
| UNUSED_IMPORT | 8 | false |
| SizeReplaceableByIsEmpty | 5 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 5 | false |
| IOResource | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| AssignmentToLambdaParameter | 5 | false |
| PointlessArithmeticExpression | 4 | false |
| DataFlowIssue | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| EmptyMethod | 3 | false |
| InstanceofCatchParameter | 3 | false |
| UnusedAssignment | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnnecessaryModifier | 2 | true |
| AbstractClassNeverImplemented | 2 | false |
| DefaultAnnotationParam | 2 | false |
| RedundantMethodOverride | 2 | false |
| CodeBlock2Expr | 2 | true |
| ConstantValue | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| NonShortCircuitBoolean | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| ClassInitializerMayBeStatic | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantImplements | 1 | false |
| NonFinalFieldOfException | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| Convert2MethodRef | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| UnnecessaryInitCause | 1 | false |
| UnnecessaryBoxing | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| Java8MapApi | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SegmentFileInfo\[toDelete.size()\]'
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
                       List<SegmentFileInfo> toDelete) {
      this.toDelete = toDelete == null ? null :
          toDelete.toArray(new SegmentFileInfo[toDelete.size()]);
      this.toTruncate = toTruncate;
    }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java

public interface GrpcUtil {
  static final Logger LOG = LoggerFactory.getLogger(GrpcUtil.class);

  Metadata.Key<String> EXCEPTION_TYPE_KEY =
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java

public interface GrpcUtil {
  static final Logger LOG = LoggerFactory.getLogger(GrpcUtil.class);

  Metadata.Key<String> EXCEPTION_TYPE_KEY =
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0*256` can be replaced with '0'
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
  //   org.apache.hadoop.util.TestPureJavaCrc32\$Table 82F63B78

  private static final int T8_0_START = 0*256;
  private static final int T8_1_START = 1*256;
  private static final int T8_2_START = 2*256;
```

### PointlessArithmeticExpression
`off+0` can be replaced with 'off'
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java

    while(len > 7) {
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
```

### PointlessArithmeticExpression
`1*256` can be replaced with '256'
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java

  private static final int T8_0_START = 0*256;
  private static final int T8_1_START = 1*256;
  private static final int T8_2_START = 2*256;
  private static final int T8_3_START = 3*256;
```

### PointlessArithmeticExpression
`1 * 1024 * 1024 * 1024L` can be replaced with '1024 \* 1024 \* 1024L'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
        SizeInBytes.valueOf(raftSegmentPreallocatedSize));
    RaftServerConfigKeys.Log.setSegmentSizeMax(raftProperties,
        SizeInBytes.valueOf(1 * 1024 * 1024 * 1024L));
    RaftConfigKeys.DataStream.setType(raftProperties, SupportedDataStreamType.NETTY);

```

## RuleId[id=ForLoopReplaceableByWhile]
### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/util/StreamObserverWithTimeout.java`
#### Snippet
```java
    }
    boolean acquired = false;
    for (; !acquired && !isClose.get(); ) {
      try {
        acquired = semaphore.tryAcquire(timeout.getDuration(), timeout.getUnit());
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftOutputStream.java`
#### Snippet
```java
    final long pos = byteFlushed;
    flushAsync();
    for(; !flushFutures.isEmpty();) {
      final Long flushed = flushFutures.poll().join();
      if (flushed == null) {
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java

    RaftPeer highest = i.next();
    for(; i.hasNext(); ) {
      final RaftPeer peer = i.next();
      if (peer.getPriority() > highest.getPriority()) {
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-common/src/main/java/org/apache/ratis/util/ResourceSemaphore.java`
#### Snippet
```java
        }
      } catch (Exception e) {
        for (; --i >= 0;) {
          resources.get(i).release(permits[i]);
        }
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-common/src/main/java/org/apache/ratis/util/IOUtils.java`
#### Snippet
```java

    long allocated = 0;
    for(; allocated < size; ) {
      final long required = size - allocated;
      final int n = remaining < required? remaining: Math.toIntExact(required);
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java

    final StringBuilder s = new StringBuilder(2 * bytes.remaining());
    for(; bytes.remaining() > 0; ) {
      s.append(format("%02x", bytes.get()));
    }
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-common/src/main/java/org/apache/ratis/util/JvmPauseMonitor.java`
#### Snippet
```java
    LOG.info("{}: Started", this);
    try {
      for (; Thread.currentThread().equals(threadRef.get()); ) {
        detectPause();
      }
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/server/impl/StateMachineUpdater.java`
#### Snippet
```java
    // Thus it is possible to have applied > committed initially.
    final long applied = getLastAppliedIndex();
    for(; applied >= raftLog.getLastCommittedIndex() && state == State.RUNNING && !shouldStop(); ) {
      if (awaitForSignal.await(100, TimeUnit.MILLISECONDS)) {
        return;
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/server/impl/StateMachineUpdater.java`
#### Snippet
```java
  @Override
  public void run() {
    for(; state != State.STOP; ) {
      try {
        waitForCommit();
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/server/impl/WatchRequests.java`
#### Snippet
```java
      index = newIndex;

      for(; !q.isEmpty();) {
        final PendingWatch first = q.firstKey();
        if (first.getIndex() > newIndex) {
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
          // fail all requests starting at truncateIndex
          failClientRequest.accept(storedEntry);
          for(; i.hasNext(); ) {
            failClientRequest.accept(i.next());
          }
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/SimpleStateMachineStorage.java`
#### Snippet
```java

    SingleFileSnapshotInfo latest = i.next();
    for(; i.hasNext(); ) {
      final SingleFileSnapshotInfo info = i.next();
      if (info.getIndex() > latest.getIndex()) {
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogWorker.java`
#### Snippet
```java
    LOG.debug("{} adds IO task {}", name, task);
    try(UncheckedAutoCloseable ignored = raftLogMetrics.startQueuingDelayTimer()) {
      for(; !queue.offer(task, ONE_SECOND); ) {
        Preconditions.assertTrue(isAlive(),
            "the worker thread is not alive");
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-server/src/main/java/org/apache/ratis/server/storage/StorageImplUtils.java`
#### Snippet
```java
      }

      for (; !dirsPerVol.isEmpty(); ) {
        final File vol = chooseMin(dirsPerVol);
        final File dir = new File(vol, storageDirName);
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java
    raftServer.start();

    for (; raftServer.getLifeCycleState() != LifeCycle.State.CLOSED; ) {
      TimeUnit.SECONDS.sleep(1);
    }
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Server.java`
#### Snippet
```java
    raftServer.start();

    for(; raftServer.getLifeCycleState() != LifeCycle.State.CLOSED;) {
      TimeUnit.SECONDS.sleep(1);
    }
```

### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
          final ByteBuffer buffer = data.asReadOnlyByteBuffer();
          try {
            for (; buffer.remaining() > 0; ) {
              n += out.write(buffer);
            }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`newPeers.size() > 0` can be replaced with '!newPeers.isEmpty()'
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java

  private void refreshPeers(Collection<RaftPeer> newPeers) {
    if (newPeers != null && newPeers.size() > 0) {
      peers.set(newPeers);
      // also refresh the rpc proxies for these peers
```

### SizeReplaceableByIsEmpty
`val.length() == 0` can be replaced with 'val.isEmpty()'
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
            if (c == ':' && i < v.length() - 1 && v.charAt(i + 1) == '-') {
              val = getenv(v.substring(0, i));
              if (val == null || val.length() == 0) {
                val = v.substring(i + 2);
              }
```

### SizeReplaceableByIsEmpty
`id.size() > 0` can be replaced with '!id.isEmpty()'
in `ratis-common/src/main/java/org/apache/ratis/protocol/RaftPeerId.java`
#### Snippet
```java
  private RaftPeerId(ByteString id) {
    this.id = Objects.requireNonNull(id, "id == null");
    Preconditions.assertTrue(id.size() > 0, "id is empty.");
    this.idString = id.toString(StandardCharsets.UTF_8);
    this.raftPeerIdProto = JavaUtils.memoize(this::buildRaftPeerIdProto);
```

### SizeReplaceableByIsEmpty
`entries.size() == 0` can be replaced with 'entries.isEmpty()'
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/LogProtoUtils.java`
#### Snippet
```java
  public static String toLogEntriesShortString(List<LogEntryProto> entries) {
    return entries == null ? null
        : entries.size() == 0 ? "<empty>"
        : "size=" + entries.size() + ", first=" + LogProtoUtils.toLogEntryString(entries.get(0));
  }
```

### SizeReplaceableByIsEmpty
`higherPriorityPeers.size() == 0` can be replaced with 'higherPriorityPeers.isEmpty()'
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderElection.java`
#### Snippet
```java
          votedPeers.add(replierId);
          // If majority and all peers with higher priority have voted, candidate pass vote
          if (higherPriorityPeers.size() == 0 && conf.hasMajority(votedPeers, server.getId())) {
            return logAndReturn(phase, Result.PASSED, responses, exceptions);
          }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasConfiguration |= entry.getLogEntryBodyCase() == LogEntryBodyCase.CONFIGURATIONENTRY`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
        break;
      }
      hasConfiguration |= entry.getLogEntryBodyCase() == LogEntryBodyCase.CONFIGURATIONENTRY;
      raftLog.getRaftLogMetrics().onLogEntryCommitted(entry);
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
    @Override
    public synchronized String toString() {
      return "" + sorted.keySet();
    }
  }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
        return "COMPLETED";
      }
      return "" + future.join();
    }
  }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java

    String toString(RaftGroupId groupId, CompletableFuture<RaftServerImpl> f) {
      return "" + (f != null && f.isDone()? f.join(): groupId + ":" + f);
    }
  }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-common/src/main/java/org/apache/ratis/conf/ConfUtils.java`
#### Snippet
```java
  static void assertKey(String fieldName, int toTruncate, Object keyName, Class<?> confClass) {
    final String normalizedFieldName = normalizeName(fieldName.substring(0, fieldName.length() - toTruncate));
    final String normalizedKeyName = normalizeName("" + keyName);

    if (!normalizedKeyName.endsWith(normalizedFieldName)) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/LogProtoUtils.java`
#### Snippet
```java
    if (entry.hasStateMachineLogEntry()) {
      s = ", " + Optional.ofNullable(function)
          .orElseGet(() -> proto -> "" + ClientInvocationId.valueOf(proto))
          .apply(entry.getStateMachineLogEntry());
    } else if (entry.hasMetadataEntry()) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/BaseStateMachine.java`
#### Snippet
```java
    this.groupId = raftGroupId;
    this.server.complete(raftServer);
    lifeCycle.setName("" + this);
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/expression/UnaryExpression.java`
#### Snippet
```java

public class UnaryExpression implements Expression {
  static final BiFunction<Op, Expression, String> PREFIX_OP_TO_STRING = (op, e) -> op + "" + e;
  static final BiFunction<Op, Expression, String> POSTFIX_OP_TO_STRING = (op, e) -> e + "" + op;

```

### TrivialStringConcatenation
Empty string used in concatenation
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/expression/UnaryExpression.java`
#### Snippet
```java
public class UnaryExpression implements Expression {
  static final BiFunction<Op, Expression, String> PREFIX_OP_TO_STRING = (op, e) -> op + "" + e;
  static final BiFunction<Op, Expression, String> POSTFIX_OP_TO_STRING = (op, e) -> e + "" + op;

  public enum Op implements UnaryOperator<Expression>, DoubleFunction<Expression> {
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/RaftLogBase.java`
#### Snippet
```java
    TermIndex lastTermIndex = getLastEntryTermIndex();
    if (lastTermIndex != null) {
      long lastIndex = lastTermIndex.getIndex() > latestSnapshotIndex ?
          lastTermIndex.getIndex() : latestSnapshotIndex;
      Preconditions.assertTrue(entry.getTerm() >= lastTermIndex.getTerm(),
          "Entry term less than RaftLog's last term: %d, entry: %s", lastTermIndex.getTerm(), entry);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `StaticResolution` has no concrete subclass
in `ratis-common/src/main/java/org/apache/ratis/util/NetUtils.java`
#### Snippet
```java
  Logger LOG = LoggerFactory.getLogger(NetUtils.class);

  abstract class StaticResolution {
    /** Host -> resolved name */
    private static final Map<String, String> HOST_TO_RESOLVED = new ConcurrentHashMap<>();
```

### AbstractClassNeverImplemented
Abstract class `MD5FileUtil` has no concrete subclass
in `ratis-common/src/main/java/org/apache/ratis/util/MD5FileUtil.java`
#### Snippet
```java
import java.util.regex.Pattern;

public abstract class MD5FileUtil {
  public static final Logger LOG = LoggerFactory.getLogger(MD5FileUtil.class);

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super RaftPeer`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/client/GrpcClientProtocolProxy.java`
#### Snippet
```java

  public GrpcClientProtocolProxy(ClientId clientId, RaftPeer target,
      Function<RaftPeer, CloseableStreamObserver> responseHandlerCreation,
      RaftProperties properties, GrpcTlsConfig tlsConfig) {
    proxy = new GrpcClientProtocolClient(clientId, target, properties, tlsConfig, tlsConfig);
```

### BoundedWildcard
Can generalize to `? extends CloseableStreamObserver`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/client/GrpcClientProtocolProxy.java`
#### Snippet
```java

  public GrpcClientProtocolProxy(ClientId clientId, RaftPeer target,
      Function<RaftPeer, CloseableStreamObserver> responseHandlerCreation,
      RaftProperties properties, GrpcTlsConfig tlsConfig) {
    proxy = new GrpcClientProtocolClient(clientId, target, properties, tlsConfig, tlsConfig);
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcFactory.java`
#### Snippet
```java
  }

  static boolean checkPooledByteBufAllocatorUseCacheForAllThreads(Consumer<String> log) {
    final boolean value = PooledByteBufAllocator.defaultUseCacheForAllThreads();
    if (value) {
```

### BoundedWildcard
Can generalize to `? super T`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/util/StreamObserverWithTimeout.java`
#### Snippet
```java
  private final ResourceSemaphore semaphore;

  private StreamObserverWithTimeout(String name, Function<T, String> requestToStringFunction,
      TimeDuration timeout, IntSupplier responseCount, ResourceSemaphore semaphore, StreamObserver<T> observer) {
    this.name = JavaUtils.getClassSimpleName(getClass()) + "-" + name;
```

### BoundedWildcard
Can generalize to `? super T`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/util/StreamObserverWithTimeout.java`
#### Snippet
```java

  private StreamObserverWithTimeout(String name, Function<T, String> requestToStringFunction,
      TimeDuration timeout, IntSupplier responseCount, ResourceSemaphore semaphore, StreamObserver<T> observer) {
    this.name = JavaUtils.getClassSimpleName(getClass()) + "-" + name;
    this.requestToStringFunction = requestToStringFunction;
```

### BoundedWildcard
Can generalize to `? super ClientInterceptor`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/util/StreamObserverWithTimeout.java`
#### Snippet
```java
      String name, Function<T, String> request2String,
      TimeDuration timeout, int outstandingLimit,
      Function<ClientInterceptor, StreamObserver<T>> newStreamObserver) {
    final AtomicInteger responseCount = new AtomicInteger();
    final ResourceSemaphore semaphore = outstandingLimit > 0? new ResourceSemaphore(outstandingLimit): null;
```

### BoundedWildcard
Can generalize to `? extends StreamObserver`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/util/StreamObserverWithTimeout.java`
#### Snippet
```java
      String name, Function<T, String> request2String,
      TimeDuration timeout, int outstandingLimit,
      Function<ClientInterceptor, StreamObserver<T>> newStreamObserver) {
    final AtomicInteger responseCount = new AtomicInteger();
    final ResourceSemaphore semaphore = outstandingLimit > 0? new ResourceSemaphore(outstandingLimit): null;
```

### BoundedWildcard
Can generalize to `? extends StatusRuntimeException`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/client/GrpcClientProtocolClient.java`
#### Snippet
```java

  private static RaftClientReplyProto blockingCall(
      CheckedSupplier<RaftClientReplyProto, StatusRuntimeException> supplier
      ) throws IOException {
    try {
```

### BoundedWildcard
Can generalize to `? super CompletableFuture`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/client/GrpcClientProtocolClient.java`
#### Snippet
```java
    }

    private void handleReplyFuture(long callId, Consumer<CompletableFuture<RaftClientReply>> handler) {
      replies.remove(callId).ifPresent(handler);
    }
```

### BoundedWildcard
Can generalize to `? super REPLY_PROTO`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java

  static <REPLY extends RaftClientReply, REPLY_PROTO> void asyncCall(
      StreamObserver<REPLY_PROTO> responseObserver,
      CheckedSupplier<CompletableFuture<REPLY>, IOException> supplier,
      Function<REPLY, REPLY_PROTO> toProto) {
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
  static <REPLY extends RaftClientReply, REPLY_PROTO> void asyncCall(
      StreamObserver<REPLY_PROTO> responseObserver,
      CheckedSupplier<CompletableFuture<REPLY>, IOException> supplier,
      Function<REPLY, REPLY_PROTO> toProto) {
    try {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
  static <REPLY extends RaftClientReply, REPLY_PROTO> void asyncCall(
      StreamObserver<REPLY_PROTO> responseObserver,
      CheckedSupplier<CompletableFuture<REPLY>, IOException> supplier,
      Function<REPLY, REPLY_PROTO> toProto) {
    try {
```

### BoundedWildcard
Can generalize to `? super REPLY`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
      StreamObserver<REPLY_PROTO> responseObserver,
      CheckedSupplier<CompletableFuture<REPLY>, IOException> supplier,
      Function<REPLY, REPLY_PROTO> toProto) {
    try {
      supplier.get().whenCompleteAsync((reply, exception) -> {
```

### BoundedWildcard
Can generalize to `? extends REPLY_PROTO`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
      StreamObserver<REPLY_PROTO> responseObserver,
      CheckedSupplier<CompletableFuture<REPLY>, IOException> supplier,
      Function<REPLY, REPLY_PROTO> toProto) {
    try {
      supplier.get().whenCompleteAsync((reply, exception) -> {
```

### BoundedWildcard
Can generalize to `? super REPLY`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcServerProtocolService.java`
#### Snippet
```java
    private final AtomicBoolean isClosed = new AtomicBoolean(false);

    ServerRequestStreamObserver(RaftServer.Op op, StreamObserver<REPLY> responseObserver) {
      this.op = op;
      this.responseObserver = responseObserver;
```

### BoundedWildcard
Can generalize to `? super RaftClientReply`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcClientProtocolService.java`
#### Snippet
```java
    }

    CompletableFuture<Void> processClientRequest(RaftClientRequest request, Consumer<RaftClientReply> replyHandler) {
      try {
        final String errMsg = LOG.isDebugEnabled() ? "processClientRequest for " + request : "";
```

### BoundedWildcard
Can generalize to `? super TlsConf`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyUtils.java`
#### Snippet
```java
  }

  static SslContext buildSslContext(String name, TlsConf tlsConf, Function<TlsConf, SslContextBuilder> builder) {
    if (tlsConf == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? super RequestType`
in `ratis-netty/src/main/java/org/apache/ratis/netty/metrics/NettyServerStreamRpcMetrics.java`
#### Snippet
```java
    private final Function<RequestType, String> stringFunction;

    Op(Function<RequestType, String> stringFunction) {
      this.stringFunction = stringFunction;
    }
```

### BoundedWildcard
Can generalize to `? super ByteBuf`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
  }

  static <DATA> DATA decodeData(ByteBuf buf, DataStreamPacketHeader header, Function<ByteBuf, DATA> toData) {
    final int dataLength = Math.toIntExact(header.getDataLength());
    final DATA data;
```

### BoundedWildcard
Can generalize to `? extends ChannelInitializer`
in `ratis-netty/src/main/java/org/apache/ratis/netty/client/NettyClientStreamRpc.java`
#### Snippet
```java

    Connection(InetSocketAddress address, WorkerGroupGetter workerGroup,
        Supplier<ChannelInitializer<SocketChannel>> channelInitializerSupplier) {
      this.address = address;
      this.workerGroup = workerGroup;
```

### BoundedWildcard
Can generalize to `? extends DataStreamClient`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/NettyServerStreamRpc.java`
#### Snippet
```java
    private final PeerProxyMap<DataStreamClient> map;

    Proxies(PeerProxyMap<DataStreamClient> map) {
      this.map = map;
    }
```

### BoundedWildcard
Can generalize to `? super DataStreamOutputRpc`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/NettyServerStreamRpc.java`
#### Snippet
```java
    }

    private void getDataStreamOutput(RaftClientRequest request, Set<RaftPeer> peers, Set<DataStreamOutputRpc> outs)
        throws IOException {
      for (RaftPeer peer : peers) {
```

### BoundedWildcard
Can generalize to `? super RaftPeerId`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
  }

  protected List<RaftPeerId> getIds(String[] optionValues, BiConsumer<RaftPeerId, InetSocketAddress> consumer) {
    if (optionValues == null) {
      return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super InetSocketAddress`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
  }

  protected List<RaftPeerId> getIds(String[] optionValues, BiConsumer<RaftPeerId, InetSocketAddress> consumer) {
    if (optionValues == null) {
      return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
   * @return the value returned by the given function.
   */
  public static <T, K, E extends Throwable> K run(Collection<T> list, CheckedFunction<T, K, E> function) {
    for (T t : list) {
      try {
```

### BoundedWildcard
Can generalize to `? super T`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
   * @return the value returned by the given function.
   */
  public static <T, K, E extends Throwable> K run(Collection<T> list, CheckedFunction<T, K, E> function) {
    for (T t : list) {
      try {
```

### BoundedWildcard
Can generalize to `? extends RaftClientRequest`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/UnorderedAsync.java`
#### Snippet
```java
    private final Supplier<RaftClientRequest> requestConstructor;

    PendingUnorderedRequest(Supplier<RaftClientRequest> requestConstructor) {
      this.requestConstructor = requestConstructor;
    }
```

### BoundedWildcard
Can generalize to `? extends RaftClientRequest`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/BlockingImpl.java`
#### Snippet
```java
  }

  RaftClientReply sendRequestWithRetry(Supplier<RaftClientRequest> supplier) throws IOException {
    RaftClientImpl.PendingClientRequest pending = new RaftClientImpl.PendingClientRequest() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends DataStreamWindowRequest`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedStreamAsync.java`
#### Snippet
```java

  private void sendRequestToNetwork(DataStreamWindowRequest request,
      SlidingWindow.Client<DataStreamWindowRequest, DataStreamReply> slidingWindow) {
    CompletableFuture<DataStreamReply> f = request.getReplyFuture();
    if(f.isDone()) {
```

### BoundedWildcard
Can generalize to `? super DataStreamReply`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedStreamAsync.java`
#### Snippet
```java

  private void sendRequestToNetwork(DataStreamWindowRequest request,
      SlidingWindow.Client<DataStreamWindowRequest, DataStreamReply> slidingWindow) {
    CompletableFuture<DataStreamReply> f = request.getReplyFuture();
    if(f.isDone()) {
```

### BoundedWildcard
Can generalize to `? extends WriteOption`
in `ratis-common/src/main/java/org/apache/ratis/io/WriteOption.java`
#### Snippet
```java
  WriteOption[] EMPTY_ARRAY = {};

  static boolean containsOption(Iterable<WriteOption> options,
                                WriteOption target) {
    for (WriteOption option : options) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-common/src/main/java/org/apache/ratis/conf/Parameters.java`
#### Snippet
```java

  /** Put the key-value pair to the map. */
  public <T> T put(String key, T value, Class<T> valueClass) {
    return valueClass.cast(map.put(
        Objects.requireNonNull(key, "key is null"),
```

### BoundedWildcard
Can generalize to `? super RaftClientRequest`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java

  void handleIOException(RaftClientRequest request, IOException ioe,
      RaftPeerId newLeader, Consumer<RaftClientRequest> handler) {
    LOG.debug("{}: suggested new leader: {}. Failed {} with {}",
        clientId, newLeader, request, ioe);
```

### BoundedWildcard
Can generalize to `? super RaftException`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java

  static <E extends Throwable> RaftClientReply handleRaftException(
      RaftClientReply reply, Function<RaftException, E> converter) throws E {
    if (reply != null) {
      final RaftException e = reply.getException();
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedSupplier.java`
#### Snippet
```java
   * @param initializer to supply at most one non-null value.
   */
  private MemoizedSupplier(Supplier<T> initializer) {
    Objects.requireNonNull(initializer, "initializer == null");
    this.initializer = initializer;
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `ratis-common/src/main/java/org/apache/ratis/util/JmxRegister.java`
#### Snippet
```java
   * @return the registered name, or, if it fails, return null.
   */
  public synchronized String register(Object mBean, Iterable<Supplier<String>> names) {
    if (registeredName == null) {
      for (Supplier<String> supplier : names) {
```

### BoundedWildcard
Can generalize to `? extends DataStreamReply`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
    }

    private CompletableFuture<DataStreamReply> combineHeader(CompletableFuture<DataStreamReply> future) {
      return future.thenCombine(headerFuture, (reply, headerReply) -> headerReply.isSuccess()? reply : headerReply);
    }
```

### BoundedWildcard
Can generalize to `? extends BASE`
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
   */
  public <BASE> Class<? extends BASE> getClass(
      String name, Class<? extends BASE> defaultValue, Class<BASE> xface) {
    try {
      Class<?> theClass = getClass(name, defaultValue);
```

### BoundedWildcard
Can generalize to `? extends File`
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
  }

  public void setFiles(String name, List<File> value) {
    String paths = value.stream().map(File::getAbsolutePath)
        .collect(Collectors.joining(","));
```

### BoundedWildcard
Can generalize to `? super ClientInvocationId`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java
    private final ConcurrentMap<ClientInvocationId, StreamInfo> map = new ConcurrentHashMap<>();

    StreamInfo computeIfAbsent(ClientInvocationId key, Function<ClientInvocationId, StreamInfo> function) {
      final StreamInfo info = map.computeIfAbsent(key, function);
      LOG.debug("computeIfAbsent({}) returns {}", key, info);
```

### BoundedWildcard
Can generalize to `? extends StreamInfo`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java
    private final ConcurrentMap<ClientInvocationId, StreamInfo> map = new ConcurrentHashMap<>();

    StreamInfo computeIfAbsent(ClientInvocationId key, Function<ClientInvocationId, StreamInfo> function) {
      final StreamInfo info = map.computeIfAbsent(key, function);
      LOG.debug("computeIfAbsent({}) returns {}", key, info);
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java
    private final RequestMetrics metrics;

    LocalStream(CompletableFuture<DataStream> streamFuture, RequestMetrics metrics) {
      this.streamFuture = streamFuture;
      this.writeFuture = new AtomicReference<>(streamFuture.thenApply(s -> 0L));
```

### BoundedWildcard
Can generalize to `? super RemoteStream`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java
    }

    <T> List<T> applyToRemotes(Function<RemoteStream, T> function) {
      return remotes.isEmpty()?Collections.emptyList(): remotes.stream().map(function).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java
    }

    <T> List<T> applyToRemotes(Function<RemoteStream, T> function) {
      return remotes.isEmpty()?Collections.emptyList(): remotes.stream().map(function).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java

  static <T> CompletableFuture<T> composeAsync(AtomicReference<CompletableFuture<T>> future, Executor executor,
      Function<T, CompletableFuture<T>> function) {
    return future.updateAndGet(previous -> previous.thenComposeAsync(function, executor));
  }
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java

  static <T> CompletableFuture<T> composeAsync(AtomicReference<CompletableFuture<T>> future, Executor executor,
      Function<T, CompletableFuture<T>> function) {
    return future.updateAndGet(previous -> previous.thenComposeAsync(function, executor));
  }
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/DataStreamManagement.java`
#### Snippet
```java
  }

  static boolean checkSuccessRemoteWrite(List<CompletableFuture<DataStreamReply>> replyFutures, long bytesWritten,
      final DataStreamRequestByteBuf request) {
    for (CompletableFuture<DataStreamReply> replyFuture : replyFutures) {
```

### BoundedWildcard
Can generalize to `? super TimeDuration`
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java
  }

  static void shutdownAndWait(TimeDuration waitTime, ExecutorService executor, Consumer<TimeDuration> timoutHandler) {
    executor.shutdown();
    try {
```

### BoundedWildcard
Can generalize to `? super E`
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java
   */
  static <E, THROWABLE extends Throwable> E updateAndGet(AtomicReference<E> reference,
      CheckedFunction<E, E, THROWABLE> update) throws THROWABLE {
    final AtomicReference<Throwable> throwableRef = new AtomicReference<>();
    final E updated = reference.updateAndGet(value -> {
```

### BoundedWildcard
Can generalize to `? extends E`
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java
   */
  static <E, THROWABLE extends Throwable> E updateAndGet(AtomicReference<E> reference,
      CheckedFunction<E, E, THROWABLE> update) throws THROWABLE {
    final AtomicReference<Throwable> throwableRef = new AtomicReference<>();
    final E updated = reference.updateAndGet(value -> {
```

### BoundedWildcard
Can generalize to `? super Long`
in `ratis-common/src/main/java/org/apache/ratis/util/TimeDuration.java`
#### Snippet
```java
  /** Apply the given function to the (duration, unit) of this object. */
  public <OUTPUT, THROWABLE extends Throwable> OUTPUT apply(
      CheckedBiFunction<Long, TimeUnit, OUTPUT, THROWABLE> function) throws THROWABLE {
    return function.apply(getDuration(), getUnit());
  }
```

### BoundedWildcard
Can generalize to `? super TimeUnit`
in `ratis-common/src/main/java/org/apache/ratis/util/TimeDuration.java`
#### Snippet
```java
  /** Apply the given function to the (duration, unit) of this object. */
  public <OUTPUT, THROWABLE extends Throwable> OUTPUT apply(
      CheckedBiFunction<Long, TimeUnit, OUTPUT, THROWABLE> function) throws THROWABLE {
    return function.apply(getDuration(), getUnit());
  }
```

### BoundedWildcard
Can generalize to `? extends OUTPUT`
in `ratis-common/src/main/java/org/apache/ratis/util/TaskQueue.java`
#### Snippet
```java
   */
  public <OUTPUT, THROWABLE extends Throwable> CompletableFuture<OUTPUT> submit(
      CheckedSupplier<OUTPUT, THROWABLE> task, ExecutorService executor,
      Function<Throwable, Throwable> newThrowable) {
    final CompletableFuture<OUTPUT> f = new CompletableFuture<>();
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `ratis-common/src/main/java/org/apache/ratis/util/TaskQueue.java`
#### Snippet
```java
  public <OUTPUT, THROWABLE extends Throwable> CompletableFuture<OUTPUT> submit(
      CheckedSupplier<OUTPUT, THROWABLE> task, ExecutorService executor,
      Function<Throwable, Throwable> newThrowable) {
    final CompletableFuture<OUTPUT> f = new CompletableFuture<>();
    final Runnable runnable = LogUtils.newRunnable(LOG, () -> {
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `ratis-common/src/main/java/org/apache/ratis/util/TaskQueue.java`
#### Snippet
```java
  public <OUTPUT, THROWABLE extends Throwable> CompletableFuture<OUTPUT> submit(
      CheckedSupplier<OUTPUT, THROWABLE> task, ExecutorService executor,
      Function<Throwable, Throwable> newThrowable) {
    final CompletableFuture<OUTPUT> f = new CompletableFuture<>();
    final Runnable runnable = LogUtils.newRunnable(LOG, () -> {
```

### BoundedWildcard
Can generalize to `? super E`
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java
  /** Poll a list of the results within the given timeout. */
  public <RESULT, THROWABLE extends Throwable> List<RESULT> pollList(long timeoutMs,
      CheckedFunctionWithTimeout<E, RESULT, THROWABLE> getResult,
      TriConsumer<E, TimeDuration, TimeoutException> timeoutHandler) throws THROWABLE {
    if (timeoutMs <= 0 || q.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends RESULT`
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java
  /** Poll a list of the results within the given timeout. */
  public <RESULT, THROWABLE extends Throwable> List<RESULT> pollList(long timeoutMs,
      CheckedFunctionWithTimeout<E, RESULT, THROWABLE> getResult,
      TriConsumer<E, TimeDuration, TimeoutException> timeoutHandler) throws THROWABLE {
    if (timeoutMs <= 0 || q.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super E`
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java
  public <RESULT, THROWABLE extends Throwable> List<RESULT> pollList(long timeoutMs,
      CheckedFunctionWithTimeout<E, RESULT, THROWABLE> getResult,
      TriConsumer<E, TimeDuration, TimeoutException> timeoutHandler) throws THROWABLE {
    if (timeoutMs <= 0 || q.isEmpty()) {
      return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super TimeDuration`
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java
  public <RESULT, THROWABLE extends Throwable> List<RESULT> pollList(long timeoutMs,
      CheckedFunctionWithTimeout<E, RESULT, THROWABLE> getResult,
      TriConsumer<E, TimeDuration, TimeoutException> timeoutHandler) throws THROWABLE {
    if (timeoutMs <= 0 || q.isEmpty()) {
      return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super TimeoutException`
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java
  public <RESULT, THROWABLE extends Throwable> List<RESULT> pollList(long timeoutMs,
      CheckedFunctionWithTimeout<E, RESULT, THROWABLE> getResult,
      TriConsumer<E, TimeDuration, TimeoutException> timeoutHandler) throws THROWABLE {
    if (timeoutMs <= 0 || q.isEmpty()) {
      return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super E`
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java

  public DataQueue(Object name, SizeInBytes byteLimit, int elementLimit,
      ToLongFunction<E> getNumBytes) {
    this.name = name != null? name: this;
    this.byteLimit = byteLimit.getSize();
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-common/src/main/java/org/apache/ratis/util/AutoCloseableReadWriteLock.java`
#### Snippet
```java
  }

  private void logLocking(StackTraceElement caller, boolean read, boolean acquire, Consumer<String> log) {
    if (caller != null && log != null) {
      final int d = acquire? depth.getAndIncrement(): depth.decrementAndGet();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-common/src/main/java/org/apache/ratis/util/FileUtils.java`
#### Snippet
```java
  TimeDuration SLEEP_TIME = TimeDuration.ONE_SECOND;

  static <T> T attempt(CheckedSupplier<T, IOException> op, Supplier<?> name) throws IOException {
    try {
      return JavaUtils.attempt(op, NUM_ATTEMPTS, SLEEP_TIME, name, LOG);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `ratis-common/src/main/java/org/apache/ratis/util/TimeoutScheduler.java`
#### Snippet
```java
  }

  private synchronized void onTimeout(TimeDuration timeout, Consumer<Integer> toSchedule) {
    numTasks++;
    final int sid = scheduleID++;
```

### BoundedWildcard
Can generalize to `? super RaftPeer`
in `ratis-common/src/main/java/org/apache/ratis/util/PeerProxyMap.java`
#### Snippet
```java
  private final CheckedFunction<RaftPeer, PROXY, IOException> createProxy;

  public PeerProxyMap(String name, CheckedFunction<RaftPeer, PROXY, IOException> createProxy) {
    this.name = name;
    this.createProxy = createProxy;
```

### BoundedWildcard
Can generalize to `? extends PROXY`
in `ratis-common/src/main/java/org/apache/ratis/util/PeerProxyMap.java`
#### Snippet
```java
  private final CheckedFunction<RaftPeer, PROXY, IOException> createProxy;

  public PeerProxyMap(String name, CheckedFunction<RaftPeer, PROXY, IOException> createProxy) {
    this.name = name;
    this.createProxy = createProxy;
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-common/src/main/java/org/apache/ratis/util/PeerProxyMap.java`
#### Snippet
```java
  private final CheckedFunction<RaftPeer, PROXY, IOException> createProxy;

  public PeerProxyMap(String name, CheckedFunction<RaftPeer, PROXY, IOException> createProxy) {
    this.name = name;
    this.createProxy = createProxy;
```

### BoundedWildcard
Can generalize to `? extends RETURN`
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedCheckedSupplier.java`
#### Snippet
```java
   * @param initializer to supply at most one non-null value.
   */
  private MemoizedCheckedSupplier(CheckedSupplier<RETURN, THROW> initializer) {
    Objects.requireNonNull(initializer, "initializer == null");
    this.initializer = initializer;
```

### BoundedWildcard
Can generalize to `? extends THROW`
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedCheckedSupplier.java`
#### Snippet
```java
   * @param initializer to supply at most one non-null value.
   */
  private MemoizedCheckedSupplier(CheckedSupplier<RETURN, THROW> initializer) {
    Objects.requireNonNull(initializer, "initializer == null");
    this.initializer = initializer;
```

### BoundedWildcard
Can generalize to `? super REQUEST`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
    }

    private void sendRepliesFromHead(Consumer<REQUEST> replyMethod) {
      for(final Iterator<REQUEST> i = requests.iterator(); i.hasNext(); i.remove()) {
        final REQUEST r = i.next();
```

### BoundedWildcard
Can generalize to `? extends REQUEST`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
     */
    public synchronized REQUEST submitNewRequest(
        LongFunction<REQUEST> requestConstructor, Consumer<REQUEST> sendMethod) {
      if (!requests.isEmpty()) {
        Preconditions.assertTrue(nextSeqNum == requests.lastSeqNum() + 1,
```

### BoundedWildcard
Can generalize to `? super REQUEST`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
    }

    void endOfRequests(long nextToProcess, REQUEST end, Consumer<REQUEST> replyMethod) {
      final REQUEST nextToProcessRequest = requests.get(nextToProcess);
      Preconditions.assertNull(nextToProcessRequest,
```

### BoundedWildcard
Can generalize to `? super REQUEST`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
    }

    private void processRequestsFromHead(Consumer<REQUEST> processingMethod) {
      for(REQUEST r : requests) {
        if (r.getSeqNum() > nextToProcess) {
```

### BoundedWildcard
Can generalize to `? super REQUEST`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
    }

    private boolean sendOrDelayRequest(REQUEST request, Consumer<REQUEST> sendMethod) {
      final long seqNum = request.getSeqNum();
      Preconditions.assertTrue(requests.getNonRepliedRequest(seqNum, "sendOrDelayRequest") == request);
```

### BoundedWildcard
Can generalize to `? super INPUT`
in `ratis-common/src/main/java/org/apache/ratis/util/function/FunctionUtils.java`
#### Snippet
```java
   * such that the returned function always returns null.
   */
  static <INPUT, OUTPUT> Function<INPUT, OUTPUT> consumerAsNullFunction(Consumer<INPUT> consumer) {
    return input -> {
      consumer.accept(input);
```

### BoundedWildcard
Can generalize to `? extends THROWABLE`
in `ratis-common/src/main/java/org/apache/ratis/util/function/CheckedRunnable.java`
#### Snippet
```java

  static <THROWABLE extends Throwable> CheckedSupplier<?, THROWABLE> asCheckedSupplier(
      CheckedRunnable<THROWABLE> runnable) {
    return () -> {
      runnable.run();
```

### BoundedWildcard
Can generalize to `? super INPUT`
in `ratis-common/src/main/java/org/apache/ratis/util/function/CheckedConsumer.java`
#### Snippet
```java
  /** @return a {@link CheckedFunction} with {@link Void} return type. */
  static <INPUT, THROWABLE extends Throwable> CheckedFunction<INPUT, Void, THROWABLE> asCheckedFunction(
      CheckedConsumer<INPUT, THROWABLE> consumer) {
    return input -> {
      consumer.accept(input);
```

### BoundedWildcard
Can generalize to `? extends THROWABLE`
in `ratis-common/src/main/java/org/apache/ratis/util/function/CheckedConsumer.java`
#### Snippet
```java
  /** @return a {@link CheckedFunction} with {@link Void} return type. */
  static <INPUT, THROWABLE extends Throwable> CheckedFunction<INPUT, Void, THROWABLE> asCheckedFunction(
      CheckedConsumer<INPUT, THROWABLE> consumer) {
    return input -> {
      consumer.accept(input);
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
  }

  private static <E> E parseElement(String[] elements, int i, String input, Function<String, E> parser) {
    final String s = elements[i].trim().replace("_", "");
    try {
```

### BoundedWildcard
Can generalize to `? super TimeDuration`
in `ratis-common/src/main/java/org/apache/ratis/util/JvmPauseMonitor.java`
#### Snippet
```java
  private final CheckedConsumer<TimeDuration, IOException> handler;

  public JvmPauseMonitor(Object name, CheckedConsumer<TimeDuration, IOException> handler) {
    this.name = JavaUtils.getClassSimpleName(getClass()) + "-" + name;
    this.handler = handler;
```

### BoundedWildcard
Can generalize to `? extends ByteString`
in `ratis-common/src/main/java/org/apache/ratis/protocol/RaftId.java`
#### Snippet
```java
  private final Supplier<String> uuidString;

  private RaftId(UUID uuid, Supplier<ByteString> uuidBytes) {
    this.uuid = Preconditions.assertNotNull(uuid, "uuid");
    this.uuidBytes = uuidBytes;
```

### BoundedWildcard
Can generalize to `? super V`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  }

  static <V> BiConsumer<V, Throwable> asBiConsumer(CompletableFuture<V> future) {
    return (v, t) -> {
      if (t != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  }

  static void dumpAllThreads(Consumer<String> println) {
    final ThreadMXBean threadMxBean = ManagementFactory.getThreadMXBean();
    for (ThreadInfo ti : threadMxBean.dumpAllThreads(true, true)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  }

  static <T> T doPrivileged(Supplier<T> action, Function<SecurityException, T> exceptionHandler) {
    try {
      return System.getSecurityManager() == null? action.get()
```

### BoundedWildcard
Can generalize to `? super SecurityException`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  }

  static <T> T doPrivileged(Supplier<T> action, Function<SecurityException, T> exceptionHandler) {
    try {
      return System.getSecurityManager() == null? action.get()
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  }

  static <T> T doPrivileged(Supplier<T> action, Function<SecurityException, T> exceptionHandler) {
    try {
      return System.getSecurityManager() == null? action.get()
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-common/src/main/java/org/apache/ratis/util/LifeCycle.java`
#### Snippet
```java
  /** Assert if the current state equals to one of the expected states. */
  public <T extends Throwable> State assertCurrentState(
      BiFunction<String, State, T> newThrowable, Set<State> expected) throws T {
    final State c = getCurrentState();
    if (!expected.contains(c)) {
```

### BoundedWildcard
Can generalize to `? super State`
in `ratis-common/src/main/java/org/apache/ratis/util/LifeCycle.java`
#### Snippet
```java
  /** Assert if the current state equals to one of the expected states. */
  public <T extends Throwable> State assertCurrentState(
      BiFunction<String, State, T> newThrowable, Set<State> expected) throws T {
    final State c = getCurrentState();
    if (!expected.contains(c)) {
```

### BoundedWildcard
Can generalize to `? super State`
in `ratis-common/src/main/java/org/apache/ratis/util/LifeCycle.java`
#### Snippet
```java
    }

    static void put(State key, Map<State, List<State>> map, State... values) {
      map.put(key, Collections.unmodifiableList(Arrays.asList(values)));
    }
```

### BoundedWildcard
Can generalize to `? super List`
in `ratis-common/src/main/java/org/apache/ratis/util/LifeCycle.java`
#### Snippet
```java
    }

    static void put(State key, Map<State, List<State>> map, State... values) {
      map.put(key, Collections.unmodifiableList(Arrays.asList(values)));
    }
```

### BoundedWildcard
Can generalize to `? super RaftPeerId`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/FollowerInfoImpl.java`
#### Snippet
```java
  private volatile boolean ackInstallSnapshotAttempt = false;

  FollowerInfoImpl(RaftGroupMemberId id, RaftPeer peer, Function<RaftPeerId, RaftPeer> getPeer,
      Timestamp lastRpcTime, long nextIndex, boolean caughtUp) {
    this.name = id + "->" + peer.getId();
```

### BoundedWildcard
Can generalize to `? super TransferLeadershipRequest`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingStepDown.java`
#### Snippet
```java
    }

    void complete(Function<TransferLeadershipRequest, RaftClientReply> newSuccessReply) {
      LOG.info("Successfully step down leader at {} for request {}", leader, request);
      replyFuture.complete(newSuccessReply.apply(request));
```

### BoundedWildcard
Can generalize to `? extends RaftClientReply`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingStepDown.java`
#### Snippet
```java
    }

    void complete(Function<TransferLeadershipRequest, RaftClientReply> newSuccessReply) {
      LOG.info("Successfully step down leader at {} for request {}", leader, request);
      replyFuture.complete(newSuccessReply.apply(request));
```

### BoundedWildcard
Can generalize to `? extends PendingRequest`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingStepDown.java`
#### Snippet
```java
    }

    PendingRequest getAndUpdate(Supplier<PendingRequest> supplier) {
      return ref.getAndUpdate(p -> p != null? p: supplier.get());
    }
```

### BoundedWildcard
Can generalize to `? super AtomicInteger`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/FollowerState.java`
#### Snippet
```java
    private final ToIntFunction<AtomicInteger> updateFunction;

    UpdateType(ToIntFunction<AtomicInteger> updateFunction) {
      this.updateFunction = updateFunction;
    }
```

### BoundedWildcard
Can generalize to `? super Long`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/StateMachineUpdater.java`
#### Snippet
```java

  StateMachineUpdater(StateMachine stateMachine, RaftServerImpl server,
      ServerState serverState, long lastAppliedIndex, RaftProperties properties, Consumer<Long> appliedIndexConsumer) {
    this.name = serverState.getMemberId() + "-" + JavaUtils.getClassSimpleName(getClass());
    this.appliedIndexConsumer = appliedIndexConsumer;
```

### BoundedWildcard
Can generalize to `? extends List`>
in `ratis-server/src/main/java/org/apache/ratis/server/impl/StateMachineUpdater.java`
#### Snippet
```java
  }

  private void checkAndTakeSnapshot(MemoizedSupplier<List<CompletableFuture<Message>>> futures)
      throws ExecutionException, InterruptedException {
    // check if need to trigger a snapshot
```

### BoundedWildcard
Can generalize to `? super Long`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/ReadIndexHeartbeats.java`
#### Snippet
```java
    private final NavigableMap<Long, AppendEntriesListener> sorted = new TreeMap<>();

    synchronized AppendEntriesListener add(long commitIndex, Function<Long, AppendEntriesListener> constructor) {
      return sorted.computeIfAbsent(commitIndex, constructor);
    }
```

### BoundedWildcard
Can generalize to `? extends AppendEntriesListener`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/ReadIndexHeartbeats.java`
#### Snippet
```java
    private final NavigableMap<Long, AppendEntriesListener> sorted = new TreeMap<>();

    synchronized AppendEntriesListener add(long commitIndex, Function<Long, AppendEntriesListener> constructor) {
      return sorted.computeIfAbsent(commitIndex, constructor);
    }
```

### BoundedWildcard
Can generalize to `? extends PendingRequest`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/SnapshotManagementRequestHandler.java`
#### Snippet
```java
    }

    PendingRequest getAndUpdate(Supplier<PendingRequest> supplier) {
      return ref.getAndUpdate(p -> p != null? p: supplier.get());
    }
```

### BoundedWildcard
Can generalize to `? super ClientInvocationId`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/DataStreamMapImpl.java`
#### Snippet
```java
  @Override
  public CompletableFuture<DataStream> computeIfAbsent(ClientInvocationId invocationId,
      Function<ClientInvocationId, CompletableFuture<DataStream>> newDataStream) {
    return map.computeIfAbsent(invocationId, newDataStream);
  }
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/DataStreamMapImpl.java`
#### Snippet
```java
  @Override
  public CompletableFuture<DataStream> computeIfAbsent(ClientInvocationId invocationId,
      Function<ClientInvocationId, CompletableFuture<DataStream>> newDataStream) {
    return map.computeIfAbsent(invocationId, newDataStream);
  }
```

### BoundedWildcard
Can generalize to `? super RaftClientRequest`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
  }

  void replySetConfiguration(Function<RaftClientRequest, RaftClientReply> newSuccessReply) {
    // we allow the pendingRequest to be null in case that the new leader
    // commits the new configuration while it has not received the retry
```

### BoundedWildcard
Can generalize to `? extends RaftClientReply`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
  }

  void replySetConfiguration(Function<RaftClientRequest, RaftClientReply> newSuccessReply) {
    // we allow the pendingRequest to be null in case that the new leader
    // commits the new configuration while it has not received the retry
```

### BoundedWildcard
Can generalize to `? extends LogAppender`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/TransferLeadership.java`
#### Snippet
```java
    private final Supplier<LogAppender> transferee;

    Context(TransferLeadershipRequest request, Supplier<LogAppender> transferee) {
      this.request = request;
      this.transferee = transferee;
```

### BoundedWildcard
Can generalize to `? extends V`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  }

  static <K, V> V computeIfAbsent(ConcurrentMap<K, V> map, K key, Supplier<V> supplier,
      Runnable actionIfAbsent) {
    V v = map.get(key);
```

### BoundedWildcard
Can generalize to `? extends V`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  }

  static <V> boolean equalsIgnoreOrder(List<V> left, List<V> right, Comparator<V> comparator) {
    if (left == right) {
      return true;
```

### BoundedWildcard
Can generalize to `? extends V`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  }

  static <V> boolean equalsIgnoreOrder(List<V> left, List<V> right, Comparator<V> comparator) {
    if (left == right) {
      return true;
```

### BoundedWildcard
Can generalize to `? super V`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  }

  static <V> boolean equalsIgnoreOrder(List<V> left, List<V> right, Comparator<V> comparator) {
    if (left == right) {
      return true;
```

### BoundedWildcard
Can generalize to `? super T`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java

public interface CollectionUtils {
  static <T> T min(T left, T right, Comparator<T> comparator) {
    return comparator.compare(left, right) < 0? left: right;
  }
```

### BoundedWildcard
Can generalize to `? super V`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  }

  static <K, V> V putNew(K key, V value, BiFunction<K, V, V> putMethod, Supplier<Object> name) {
    final V returned = putMethod.apply(key, value);
    Preconditions.assertNull(returned,
```

### BoundedWildcard
Can generalize to `? extends V`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  }

  static <K, V> V putNew(K key, V value, BiFunction<K, V, V> putMethod, Supplier<Object> name) {
    final V returned = putMethod.apply(key, value);
    Preconditions.assertNull(returned,
```

### BoundedWildcard
Can generalize to `? super INPUT`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java

  static <INPUT, OUTPUT> Iterable<OUTPUT> as(
      Iterable<INPUT> iteration, Function<INPUT, OUTPUT> converter) {
    return () -> new Iterator<OUTPUT>() {
      private final Iterator<INPUT> i = iteration.iterator();
```

### BoundedWildcard
Can generalize to `? extends OUTPUT`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java

  static <INPUT, OUTPUT> Iterable<OUTPUT> as(
      Iterable<INPUT> iteration, Function<INPUT, OUTPUT> converter) {
    return () -> new Iterator<OUTPUT>() {
      private final Iterator<INPUT> i = iteration.iterator();
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
   *  @return a randomly picked element which is not the given element.
   */
  static <T> T random(final T given, Iterable<T> iteration) {
    Objects.requireNonNull(given, "given == null");
    Objects.requireNonNull(iteration, "iteration == null");
```

### BoundedWildcard
Can generalize to `? super RaftGroupId`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
  }

  private void initGroupDir(File sub, Predicate<RaftGroupId> shouldAdd) {
    try {
      LOG.info("{}: found a subdirectory {}", getId(), sub);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
    }

    String toString(Map.Entry<RaftGroupId, CompletableFuture<RaftServerImpl>> e) {
      return toString(e.getKey(), e.getValue());
    }
```

### BoundedWildcard
Can generalize to `? extends RaftServerImpl`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
    }

    private void close(RaftGroupId groupId, CompletableFuture<RaftServerImpl> future) {
      final RaftServerImpl impl;
      try {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogFormat.java`
#### Snippet
```java
  }

  static <T> T applyHeaderTo(CheckedFunction<byte[], T, IOException> function) throws IOException {
    final T t = function.apply(Internal.HEADER_BYTES);
    Internal.assertHeader(); // assert that the header is unmodified by the function.
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-common/src/main/java/org/apache/ratis/conf/ConfUtils.java`
#### Snippet
```java
  }

  static <T> void logFallback(String key, String fallbackKey, T fallbackValue, Consumer<String> logger) {
    if (logger != null) {
      logger.accept(String.format("%s = %s (fallback to %s)", key, fallbackValue, fallbackKey));
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-common/src/main/java/org/apache/ratis/conf/ConfUtils.java`
#### Snippet
```java
  Logger LOG = LoggerFactory.getLogger(ConfUtils.class);

  static <T> void logGet(String key, T value, T defaultValue, Consumer<String> logger) {
    if (logger != null) {
      logger.accept(String.format("%s = %s (%s)", key, value,
```

### BoundedWildcard
Can generalize to `? extends RetryCache.Statistics`
in `ratis-server/src/main/java/org/apache/ratis/server/metrics/RaftServerMetricsImpl.java`
#### Snippet
```java
  }

  private void addRetryCacheMetric(Supplier<RetryCache.Statistics> retryCacheStatistics) {
    getRegistry().gauge(RETRY_CACHE_ENTRY_COUNT_METRIC, () -> () -> retryCacheStatistics.get().size());
    getRegistry().gauge(RETRY_CACHE_HIT_COUNT_METRIC  , () -> () -> retryCacheStatistics.get().hitCount());
```

### BoundedWildcard
Can generalize to `? super FileChannel`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/BufferedWriteChannel.java`
#### Snippet
```java
  }

  void preallocateIfNecessary(long size, CheckedBiFunction<FileChannel, Long, Long, IOException> preallocate)
      throws IOException {
    final long outstanding = writeBuffer.position() + size;
```

### BoundedWildcard
Can generalize to `? super Long`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/BufferedWriteChannel.java`
#### Snippet
```java
  }

  void preallocateIfNecessary(long size, CheckedBiFunction<FileChannel, Long, Long, IOException> preallocate)
      throws IOException {
    final long outstanding = writeBuffer.position() + size;
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/BufferedWriteChannel.java`
#### Snippet
```java
  }

  void preallocateIfNecessary(long size, CheckedBiFunction<FileChannel, Long, Long, IOException> preallocate)
      throws IOException {
    final long outstanding = writeBuffer.position() + size;
```

### BoundedWildcard
Can generalize to `? extends File`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/StorageImplUtils.java`
#### Snippet
```java

  /** @return a volume with the min dirs. */
  static File chooseMin(Map<File, Integer> dirsPerVol) throws IOException {
    return dirsPerVol.entrySet().stream()
        .min(Map.Entry.comparingByValue())
```

### BoundedWildcard
Can generalize to `? extends File`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/StorageImplUtils.java`
#### Snippet
```java

  /** @return a list of existing subdirectories matching the given storage directory name from the given volumes. */
  static List<File> getExistingStorageSubs(List<File> volumes, String targetSubDir, Map<File, Integer> dirsPerVol) {
    return volumes.stream().flatMap(volume -> {
          final File[] dirs = Optional.ofNullable(volume.listFiles()).orElse(EMPTY_FILE_ARRAY);
```

### BoundedWildcard
Can generalize to `? super File`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/StorageImplUtils.java`
#### Snippet
```java

  /** @return a list of existing subdirectories matching the given storage directory name from the given volumes. */
  static List<File> getExistingStorageSubs(List<File> volumes, String targetSubDir, Map<File, Integer> dirsPerVol) {
    return volumes.stream().flatMap(volume -> {
          final File[] dirs = Optional.ofNullable(volume.listFiles()).orElse(EMPTY_FILE_ARRAY);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/StorageImplUtils.java`
#### Snippet
```java

  /** @return a list of existing subdirectories matching the given storage directory name from the given volumes. */
  static List<File> getExistingStorageSubs(List<File> volumes, String targetSubDir, Map<File, Integer> dirsPerVol) {
    return volumes.stream().flatMap(volume -> {
          final File[] dirs = Optional.ofNullable(volume.listFiles()).orElse(EMPTY_FILE_ARRAY);
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/AssignmentMessage.java`
#### Snippet
```java

  @Override
  public Double evaluate(Map<String, Double> variableMap) {
    final Double value = expression.evaluate(variableMap);
    final String name = variable.getName();
```

### BoundedWildcard
Can generalize to `? super Double`
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/AssignmentMessage.java`
#### Snippet
```java

  @Override
  public Double evaluate(Map<String, Double> variableMap) {
    final Double value = expression.evaluate(variableMap);
    final String name = variable.getName();
```

### BoundedWildcard
Can generalize to `? extends FileStoreClient`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java

  @SuppressFBWarnings("DM_EXIT")
  protected void stop(List<FileStoreClient> clients) throws IOException {
    for (FileStoreClient client : clients) {
      client.close();
```

### BoundedWildcard
Can generalize to `? super Path`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStore.java`
#### Snippet
```java
    }

    private FileInfo applyFunction(String relative, Function<Path, FileInfo> f)
        throws FileNotFoundException {
      final FileInfo info = f.apply(normalize(relative));
```

### BoundedWildcard
Can generalize to `? extends FileInfo`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStore.java`
#### Snippet
```java
    }

    private FileInfo applyFunction(String relative, Function<Path, FileInfo> f)
        throws FileNotFoundException {
      final FileInfo info = f.apply(normalize(relative));
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStore.java`
#### Snippet
```java

  static <T> CompletableFuture<T> submit(
      CheckedSupplier<T, IOException> task, ExecutorService executor) {
    final CompletableFuture<T> f = new CompletableFuture<>();
    executor.submit(() -> {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStore.java`
#### Snippet
```java

  static <T> CompletableFuture<T> submit(
      CheckedSupplier<T, IOException> task, ExecutorService executor) {
    final CompletableFuture<T> f = new CompletableFuture<>();
    executor.submit(() -> {
```

### BoundedWildcard
Can generalize to `? super Message`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreClient.java`
#### Snippet
```java

  static CompletableFuture<ByteString> sendAsync(
      Message request, Function<Message, CompletableFuture<RaftClientReply>> sendFunction) {
    return sendFunction.apply(request).thenApply(reply -> {
      final StateMachineException sme = reply.getStateMachineException();
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreClient.java`
#### Snippet
```java

  static CompletableFuture<ByteString> sendAsync(
      Message request, Function<Message, CompletableFuture<RaftClientReply>> sendFunction) {
    return sendFunction.apply(request).thenApply(reply -> {
      final StateMachineException sme = reply.getStateMachineException();
```

### BoundedWildcard
Can generalize to `? super Message`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreClient.java`
#### Snippet
```java

  static ByteString send(
      Message request, CheckedFunction<Message, RaftClientReply, IOException> sendFunction)
      throws IOException {
    final RaftClientReply reply = sendFunction.apply(request);
```

### BoundedWildcard
Can generalize to `? extends RaftClientReply`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreClient.java`
#### Snippet
```java

  static ByteString send(
      Message request, CheckedFunction<Message, RaftClientReply, IOException> sendFunction)
      throws IOException {
    final RaftClientReply reply = sendFunction.apply(request);
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreClient.java`
#### Snippet
```java

  static ByteString send(
      Message request, CheckedFunction<Message, RaftClientReply, IOException> sendFunction)
      throws IOException {
    final RaftClientReply reply = sendFunction.apply(request);
```

### BoundedWildcard
Can generalize to `? extends FileStoreClient`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

  private Map<String, CompletableFuture<List<CompletableFuture<Long>>>> writeByHeapByteBuffer(
      List<String> paths, List<FileStoreClient> clients, ExecutorService executor) {
    Map<String, CompletableFuture<List<CompletableFuture<Long>>>> fileMap = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`>>
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
  }

  private long waitWriteFinish(Map<String, CompletableFuture<List<CompletableFuture<Long>>>> fileMap)
      throws ExecutionException, InterruptedException {
    long totalBytes = 0;
```

### BoundedWildcard
Can generalize to `? super CompletableFuture`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

  long write(FileChannel in, long offset, FileStoreClient fileStoreClient, String path,
      List<CompletableFuture<Long>> futures) throws IOException {
    final int bufferSize = getBufferSizeInBytes();
    final ByteBuf buf = PooledByteBufAllocator.DEFAULT.heapBuffer(bufferSize);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`>>
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
  }

  private long waitStreamFinish(Map<String, CompletableFuture<List<CompletableFuture<DataStreamReply>>>> fileMap)
      throws ExecutionException, InterruptedException {
    long totalBytes = 0;
```

### BoundedWildcard
Can generalize to `? super CompletableFuture`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

    @Override
    long write(FileChannel in, DataStreamOutput out, long offset, List<CompletableFuture<DataStreamReply>> futures) {
      final long packetSize = getPacketSize(offset);
      futures.add(isSync(offset + packetSize) ?
```

### BoundedWildcard
Can generalize to `? extends FileStoreClient`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

  private Map<String, CompletableFuture<List<CompletableFuture<DataStreamReply>>>> streamWrite(
      List<String> paths, List<FileStoreClient> clients, RoutingTable routingTable,
      ExecutorService executor) {
    Map<String, CompletableFuture<List<CompletableFuture<DataStreamReply>>>> fileMap = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super CompletableFuture`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

    @Override
    long write(FileChannel in, DataStreamOutput out, long offset, List<CompletableFuture<DataStreamReply>> futures)
        throws IOException {
      final long packetSize = getPacketSize(offset);
```

### BoundedWildcard
Can generalize to `? super CompletableFuture`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

    @Override
    long write(FileChannel in, DataStreamOutput out, long offset, List<CompletableFuture<DataStreamReply>> futures)
        throws IOException {
      final int bufferSize = getBufferSize();
```

### BoundedWildcard
Can generalize to `? extends FollowerInfo`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
  }

  private long[] getSorted(List<FollowerInfo> followerInfos, boolean includeSelf,
      ToLongFunction<FollowerInfo> getFollowerIndex, LongSupplier getLogIndex) {
    final int length = includeSelf ? followerInfos.size() + 1 : followerInfos.size();
```

### BoundedWildcard
Can generalize to `? super FollowerInfo`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java

  private long[] getSorted(List<FollowerInfo> followerInfos, boolean includeSelf,
      ToLongFunction<FollowerInfo> getFollowerIndex, LongSupplier getLogIndex) {
    final int length = includeSelf ? followerInfos.size() + 1 : followerInfos.size();
    if (length == 0) {
```

### BoundedWildcard
Can generalize to `? extends LogAppender`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
  }

  private static LogAppender chooseUpToDateFollower(List<LogAppender> followers, TermIndex leaderLastEntry) {
    for(LogAppender f : followers) {
      if (TransferLeadership.isFollowerUpToDate(f.getFollower(), leaderLastEntry)
```

### BoundedWildcard
Can generalize to `? super LogAppender`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
  }

  private void stopAndRemoveSenders(Predicate<LogAppender> predicate) {
    stopAndRemoveSenders(getLogAppenders().filter(predicate).collect(Collectors.toList()));
  }
```

### BoundedWildcard
Can generalize to `? super RaftPeerId`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
  }

  private boolean hasMajority(Predicate<RaftPeerId> isAcked, List<FollowerInfo> followers, boolean includeSelf) {
    if (followers.isEmpty() && !includeSelf) {
      return true;
```

### BoundedWildcard
Can generalize to `? extends FollowerInfo`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
  }

  private boolean hasMajority(Predicate<RaftPeerId> isAcked, List<FollowerInfo> followers, boolean includeSelf) {
    if (followers.isEmpty() && !includeSelf) {
      return true;
```

### BoundedWildcard
Can generalize to `? extends LogAppender`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
    }

    void addAll(Collection<LogAppender> newSenders) {
      if (newSenders.isEmpty()) {
        return;
```

### BoundedWildcard
Can generalize to `? super UnderConstruction`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java

    CompletableFuture<Integer> submitCommit(
        long offset, int size, Function<UnderConstruction, ReadOnly> closeFunction,
        ExecutorService executor, RaftPeerId id, long index) {
      final boolean close = closeFunction != null;
```

### BoundedWildcard
Can generalize to `? extends ReadOnly`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java

    CompletableFuture<Integer> submitCommit(
        long offset, int size, Function<UnderConstruction, ReadOnly> closeFunction,
        ExecutorService executor, RaftPeerId id, long index) {
      final boolean close = closeFunction != null;
```

### BoundedWildcard
Can generalize to `? super Path`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
  }

  ByteString read(CheckedFunction<Path, Path, IOException> resolver, long offset, long length, boolean readCommitted)
      throws IOException {
    if (readCommitted && offset + length > getCommittedSize()) {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
  }

  ByteString read(CheckedFunction<Path, Path, IOException> resolver, long offset, long length, boolean readCommitted)
      throws IOException {
    if (readCommitted && offset + length > getCommittedSize()) {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
  }

  ByteString read(CheckedFunction<Path, Path, IOException> resolver, long offset, long length, boolean readCommitted)
      throws IOException {
    if (readCommitted && offset + length > getCommittedSize()) {
```

### BoundedWildcard
Can generalize to `? super Path`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java

    CompletableFuture<Integer> submitCreate(
        CheckedFunction<Path, Path, IOException> resolver, ByteString data, boolean close, boolean sync,
        ExecutorService executor, RaftPeerId id, long index) {
      final Supplier<String> name = () -> "create(" + getRelativePath() + ", "
```

### BoundedWildcard
Can generalize to `? extends Path`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java

    CompletableFuture<Integer> submitCreate(
        CheckedFunction<Path, Path, IOException> resolver, ByteString data, boolean close, boolean sync,
        ExecutorService executor, RaftPeerId id, long index) {
      final Supplier<String> name = () -> "create(" + getRelativePath() + ", "
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java

    CompletableFuture<Integer> submitCreate(
        CheckedFunction<Path, Path, IOException> resolver, ByteString data, boolean close, boolean sync,
        ExecutorService executor, RaftPeerId id, long index) {
      final Supplier<String> name = () -> "create(" + getRelativePath() + ", "
```

### BoundedWildcard
Can generalize to `? extends MetricRegistries`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/MetricRegistriesLoader.java`
#### Snippet
```java
   */
  @VisibleForTesting
  static MetricRegistries load(List<MetricRegistries> availableImplementations) {

    if (availableImplementations.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RefCountingMap.java`
#### Snippet
```java
  private final ConcurrentMap<K, Payload<V>> map = new ConcurrentHashMap<>();

  V put(K k, Supplier<V> supplier) {
    return map.compute(k, (k1, old) -> old != null? old: new Payload<>(supplier.get())).increment();
  }
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RatisMetricRegistryImpl.java`
#### Snippet
```java

  @Override
  public <T> void gauge(String name, Supplier<Supplier<T>> gaugeSupplier) {
    metricRegistry.gauge(getMetricName(name), () -> toGauge(gaugeSupplier.get()));
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RatisMetricRegistryImpl.java`
#### Snippet
```java
  }

  static <T> Gauge<T> toGauge(Supplier<T> supplier) {
    return supplier::get;
  }
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
     *   the content of the buffer could possibly be changed unexpectedly, and it will cause data corruption.
     */
    default int write(ReferenceCountedObject<ByteBuffer> referenceCountedBuffer) throws IOException {
      return write(referenceCountedBuffer.get());
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/RefCountingMap.java`
#### Snippet
```java
  private final ConcurrentMap<K, Payload<V>> map = new ConcurrentHashMap<>();

  V put(K k, Supplier<V> supplier) {
    return map.compute(k, (k1, old) -> old != null? old: new Payload<>(supplier.get())).increment();
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/RatisMetrics.java`
#### Snippet
```java
  }

  private static <T> Function<Boolean, T> newHeartbeatFunction(String prefix, Function<String, T> function) {
    final T trueValue = function.apply(prefix + getHeartbeatSuffix(true));
    final T falseValue = function.apply(prefix + getHeartbeatSuffix(false));
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/RatisMetrics.java`
#### Snippet
```java
  }

  private static <T> Function<Boolean, T> newHeartbeatFunction(String prefix, Function<String, T> function) {
    final T trueValue = function.apply(prefix + getHeartbeatSuffix(true));
    final T falseValue = function.apply(prefix + getHeartbeatSuffix(false));
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/RatisMetrics.java`
#### Snippet
```java
  }

  protected static <T extends Enum<T>> Map<T, Map<String, LongCounter>> newCounterMaps(Class<T> clazz) {
    final EnumMap<T,Map<String, LongCounter>> maps = new EnumMap<>(clazz);
    Arrays.stream(clazz.getEnumConstants()).forEach(t -> maps.put(t, new ConcurrentHashMap<>()));
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/RatisMetrics.java`
#### Snippet
```java

  protected static <T extends Enum<T>> Map<T, Timekeeper> newTimerMap(
      Class<T> clazz, Function<T, Timekeeper> constructor) {
    final EnumMap<T, Timekeeper> map = new EnumMap<>(clazz);
    Arrays.stream(clazz.getEnumConstants()).forEach(t -> map.put(t, constructor.apply(t)));
```

### BoundedWildcard
Can generalize to `? super T`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/RatisMetrics.java`
#### Snippet
```java

  protected static <T extends Enum<T>> Map<T, Timekeeper> newTimerMap(
      Class<T> clazz, Function<T, Timekeeper> constructor) {
    final EnumMap<T, Timekeeper> map = new EnumMap<>(clazz);
    Arrays.stream(clazz.getEnumConstants()).forEach(t -> map.put(t, constructor.apply(t)));
```

### BoundedWildcard
Can generalize to `? extends Timekeeper`
in `ratis-metrics-api/src/main/java/org/apache/ratis/metrics/RatisMetrics.java`
#### Snippet
```java

  protected static <T extends Enum<T>> Map<T, Timekeeper> newTimerMap(
      Class<T> clazz, Function<T, Timekeeper> constructor) {
    final EnumMap<T, Timekeeper> map = new EnumMap<>(clazz);
    Arrays.stream(clazz.getEnumConstants()).forEach(t -> map.put(t, constructor.apply(t)));
```

### BoundedWildcard
Can generalize to `? extends REPLY`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java

  static <REPLY extends RaftClientReply> REPLY waitForReply(
      Object id, RaftClientRequest request, CompletableFuture<REPLY> future,
      Function<RaftException, REPLY> exceptionReply)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? super RaftException`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
  static <REPLY extends RaftClientReply> REPLY waitForReply(
      Object id, RaftClientRequest request, CompletableFuture<REPLY> future,
      Function<RaftException, REPLY> exceptionReply)
      throws IOException {
    try {
```

### BoundedWildcard
Can generalize to `? extends REPLY`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
  static <REPLY extends RaftClientReply> REPLY waitForReply(
      Object id, RaftClientRequest request, CompletableFuture<REPLY> future,
      Function<RaftException, REPLY> exceptionReply)
      throws IOException {
    try {
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java

  <REPLY> CompletableFuture<REPLY> executeSubmitServerRequestAsync(
      CheckedSupplier<CompletableFuture<REPLY>, IOException> submitFunction) {
    return CompletableFuture.supplyAsync(
        () -> JavaUtils.callAsUnchecked(submitFunction, CompletionException::new),
```

### BoundedWildcard
Can generalize to `? extends Message`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java

  CompletableFuture<RaftClientReply> processQueryFuture(
      CompletableFuture<Message> queryFuture, RaftClientRequest request) {
    return queryFuture.thenApply(r -> newReplyBuilder(request).setSuccess().setMessage(r).build())
        .exceptionally(e -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/Dm3RatisMetricRegistryImpl.java`
#### Snippet
```java
  }

  static <T> Gauge<T> toGauge(Supplier<T> supplier) {
    return supplier::get;
  }
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/Dm3RatisMetricRegistryImpl.java`
#### Snippet
```java

  @Override
  public <T> void gauge(String name, Supplier<Supplier<T>> gaugeSupplier) {
    metricRegistry.gauge(getMetricName(name), () -> toGauge(gaugeSupplier.get()));
  }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java

  @Parameter(names = {"--bufferSize"}, description = "Size of buffer in bytes, should less than 4MB, " +
      "i.e BUFFER_BYTE_LIMIT_DEFAULT", required = false)
  private int bufferSizeInBytes = 1024;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
public class LoadGen extends Client {

  @Parameter(names = {"--sync"}, description = "Whether sync every bufferSize", required = false)
  private int sync = 0;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getOptions()` only delegates to its super method
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/group/GroupInfoCommand.java`
#### Snippet
```java

  @Override
  public Options getOptions() {
    return super.getOptions();
  }
```

### RedundantMethodOverride
Method `getOptions()` only delegates to its super method
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/election/StepDownCommand.java`
#### Snippet
```java

  @Override
  public Options getOptions() {
    return super.getOptions();
  }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java

        synchronized void logDebug() {
          LOG.debug(super.toString());
          for (REQUEST r : requests) {
            LOG.debug("  {}: {}", r.getSeqNum(), r.hasReply() ? "replied"
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.ClientId;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.io.WriteOption;
import org.apache.ratis.proto.RaftProtos.DataStreamPacketHeaderProto.Type;
import org.apache.ratis.protocol.ClientId;
import org.apache.ratis.protocol.ClientInvocationId;
import org.apache.ratis.protocol.DataStreamReply;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.ClientInvocationId;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.proto.RaftProtos.DataStreamPacketHeaderProto.Type;
import org.apache.ratis.protocol.ClientId;
import org.apache.ratis.protocol.ClientInvocationId;
import org.apache.ratis.protocol.DataStreamReply;
import org.apache.ratis.protocol.DataStreamRequestHeader;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.DataStreamReply;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.protocol.ClientId;
import org.apache.ratis.protocol.ClientInvocationId;
import org.apache.ratis.protocol.DataStreamReply;
import org.apache.ratis.protocol.DataStreamRequestHeader;
import org.apache.ratis.protocol.RaftClientReply;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.DataStreamRequestHeader;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.protocol.ClientInvocationId;
import org.apache.ratis.protocol.DataStreamReply;
import org.apache.ratis.protocol.DataStreamRequestHeader;
import org.apache.ratis.protocol.RaftClientReply;
import org.apache.ratis.protocol.RaftClientRequest;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.RaftClientReply;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.protocol.DataStreamReply;
import org.apache.ratis.protocol.DataStreamRequestHeader;
import org.apache.ratis.protocol.RaftClientReply;
import org.apache.ratis.protocol.RaftClientRequest;
import org.apache.ratis.protocol.RaftGroupId;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.RaftClientRequest;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.protocol.DataStreamRequestHeader;
import org.apache.ratis.protocol.RaftClientReply;
import org.apache.ratis.protocol.RaftClientRequest;
import org.apache.ratis.protocol.RaftGroupId;
import org.apache.ratis.protocol.RaftPeer;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.RaftGroupId;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.protocol.RaftClientReply;
import org.apache.ratis.protocol.RaftClientRequest;
import org.apache.ratis.protocol.RaftGroupId;
import org.apache.ratis.protocol.RaftPeer;
import org.apache.ratis.protocol.exceptions.AlreadyClosedException;
```

### UNUSED_IMPORT
Unused import `import org.apache.ratis.protocol.RaftPeer;`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
import org.apache.ratis.protocol.RaftClientRequest;
import org.apache.ratis.protocol.RaftGroupId;
import org.apache.ratis.protocol.RaftPeer;
import org.apache.ratis.protocol.exceptions.AlreadyClosedException;
import org.apache.ratis.rpc.CallId;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/io/MD5Hash.java`
#### Snippet
```java

    final MessageDigest digester = getDigester();
    for(int n; (n = in.read(buffer)) != -1; ) {
      digester.update(buffer, 0, n);
    }
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedSupplier.java`
#### Snippet
```java
        v = value;
        if (v == null) {
          v = value = Objects.requireNonNull(initializer.get(),
              "initializer.get() returns null");
        }
      }
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
    while(len > 7) {
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
          ^ (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedCheckedSupplier.java`
#### Snippet
```java
        v = value;
        if (v == null) {
          v = value = Objects.requireNonNull(initializer.get(), "initializer.get() returns null");
        }
      }
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/LongMinMax.java`
#### Snippet
```java
  public void accumulate(long n) {
    if (!initialized) {
      min = max = n;
      initialized = true;
    } else if (n < min) {
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
  public static String[] getTrimmedStrings(String s) {
    return s == null? EMPTY_STRING_ARRAY
        : (s = s.trim()).isEmpty()? EMPTY_STRING_ARRAY
        : s.split("\\s*,\\s*");
  }
```

### NestedAssignment
Result of assignment expression used
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  Supplier<ThreadGroup> ROOT_THREAD_GROUP = memoize(() -> {
    for (ThreadGroup g = Thread.currentThread().getThreadGroup(), p;; g = p) {
      if ((p = g.getParent()) == null) {
        return g;
      }
```

### NestedAssignment
Result of assignment expression used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/StateMachineUpdater.java`
#### Snippet
```java
    final MemoizedSupplier<List<CompletableFuture<Message>>> futures = MemoizedSupplier.valueOf(ArrayList::new);
    final long committed = raftLog.getLastCommittedIndex();
    for(long applied; (applied = getLastAppliedIndex()) < committed && state == State.RUNNING && !shouldStop(); ) {
      final long nextIndex = applied + 1;
      final LogEntryProto next = raftLog.get(nextIndex);
```

### NestedAssignment
Result of assignment expression used
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
      LogRecord record;
      if (currentSegment == null ||
          (record = currentSegment.getLogRecord(nextIndex)) == null) {
        throw new NoSuchElementException();
      }
```

### NestedAssignment
Result of assignment expression used
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
    try (SegmentedRaftLogInputStream in = new SegmentedRaftLogInputStream(
        file, startEnd.getStartIndex(), startEnd.getEndIndex(), startEnd.isOpen(), maxOpSize, raftLogMetrics)) {
      for(LogEntryProto prev = null, next; (next = in.nextEntry()) != null; prev = next) {
        if (prev != null) {
          Preconditions.assertTrue(next.getIndex() == prev.getIndex() + 1,
```

### NestedAssignment
Result of assignment expression used
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/TransactionContextImpl.java`
#### Snippet
```java
    Preconditions.assertNull(logEntry, "logEntry");
    Objects.requireNonNull(stateMachineLogEntry, "stateMachineLogEntry == null");
    return logEntry = LogProtoUtils.toLogEntryProto(stateMachineLogEntry, term, index);
  }

```

### NestedAssignment
Result of assignment expression used
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/BaseStateMachine.java`
#### Snippet
```java

    synchronized (transactionFutures) {
      for(long i; !transactionFutures.isEmpty() && (i = transactionFutures.firstKey()) <= newTI.getIndex(); ) {
        transactionFutures.remove(i).complete(null);
      }
```

## RuleId[id=ClassInitializerMayBeStatic]
### ClassInitializerMayBeStatic
Class initializer may be 'static'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
  private static final String DESCRIPTION = "[DirectByteBuffer, MappedByteBuffer, NettyFileRegion]";

  {
    // Assert if the description is correct.
    final String expected = Arrays.asList(Type.values()).toString();
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyClient.java`
#### Snippet
```java
  @Override
  public void close() {
    lifeCycle.checkStateAndClose(() -> {
      channel.close().syncUninterruptibly();
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `ratis-server/src/main/java/org/apache/ratis/server/impl/ReadRequests.java`
#### Snippet
```java

    private void handleTimeout(long readIndex) {
      Optional.ofNullable(sorted.remove(readIndex)).ifPresent(consumer -> {
        consumer.completeExceptionally(
          new ReadException(new TimeoutIOException("Read timeout for index " + readIndex)));
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `storageDir` are queried, but never updated
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
  @Parameter(names = {"--storage", "-s"}, description = "Storage dir, eg. --storage dir1 --storage dir2",
      required = true)
  private List<File> storageDir = new ArrayList<>();

  private static final int MAX_THREADS_NUM = 1000;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `nextSeqNum` is accessed in both synchronized and unsynchronized contexts
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java

    /** The seqNum for the next new request. */
    private long nextSeqNum = 1;
    /** The seqNum of the first request. */
    private long firstSeqNum = -1;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `requestIndex` is accessed in both synchronized and unsynchronized contexts
in `ratis-server/src/main/java/org/apache/ratis/server/leader/InstallSnapshotRequests.java`
#### Snippet
```java

  /** The index of the current request. */
  private int requestIndex = 0;

  /** The index of the current file. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `startIndex` is accessed in both synchronized and unsynchronized contexts
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
  private AtomicLong totalCacheSize = new AtomicLong(0);
  /** Segment start index, inclusive. */
  private long startIndex;
  /** Segment end index, inclusive. */
  private volatile long endIndex;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `totalFileSize` is accessed in both synchronized and unsynchronized contexts
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java

  private volatile boolean isOpen;
  private long totalFileSize = SegmentedRaftLogFormat.getHeaderLength();
  private AtomicLong totalCacheSize = new AtomicLong(0);
  /** Segment start index, inclusive. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `out` is accessed in both synchronized and unsynchronized contexts
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java

  static class UnderConstruction extends FileInfo {
    private FileStore.FileStoreDataChannel out;

    /** The size written to a local file. */
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachineStorage.java`
#### Snippet
```java
  // is waiting for deleting these files.

  void format() throws IOException;

  void cleanupOldSnapshots(SnapshotRetentionPolicy snapshotRetentionPolicy) throws IOException;
```

### EmptyMethod
Method only calls its super
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/election/StepDownCommand.java`
#### Snippet
```java

  @Override
  public Options getOptions() {
    return super.getOptions();
  }
```

### EmptyMethod
Method only calls its super
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/group/GroupInfoCommand.java`
#### Snippet
```java

  @Override
  public Options getOptions() {
    return super.getOptions();
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/client/GrpcClientProtocolProxy.java`
#### Snippet
```java
    private final StreamObserver<RaftClientRequestProto> requestObserver;
    private final CloseableStreamObserver responseHandler;
    private boolean hasError = false;

    RpcSession(CloseableStreamObserver responseHandler) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcLogAppender.java`
#### Snippet
```java
  private final RequestMap pendingRequests = new RequestMap();
  private final int maxPendingRequestsNum;
  private volatile boolean firstResponseReceived = false;
  private final boolean installSnapshotEnabled;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
  public static class Builder {
    private File file = null;
    private Function<StateMachineLogEntryProto, String> smLogToString = null;
    private SizeInBytes maxOpSize = SizeInBytes.valueOf("32MB");

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java

  public static class Builder {
    private File file = null;
    private Function<StateMachineLogEntryProto, String> smLogToString = null;
    private SizeInBytes maxOpSize = SizeInBytes.valueOf("32MB");
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedAsync.java`
#### Snippet
```java
    private final long seqNum;
    private final AtomicReference<Function<SlidingWindowEntry, RaftClientRequest>> requestConstructor;
    private volatile boolean isFirst = false;

    PendingOrderedRequest(long callId, long seqNum,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedSupplier.java`
#### Snippet
```java

  private final Supplier<T> initializer;
  private volatile T value = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-client/src/main/java/org/apache/ratis/client/impl/DataStreamClientImpl.java`
#### Snippet
```java
    });

    private long streamOffset = 0;

    private DataStreamOutputImpl(RaftClientRequest request) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/ExitUtils.java`
#### Snippet
```java
    private static final States INSTANCE = new States();

    private volatile boolean systemExitDisabled = false;
    private volatile boolean terminateOnUncaughtException = true;
    private final AtomicReference<ExitException> firstExitException = new AtomicReference<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/DataQueue.java`
#### Snippet
```java
  private final Queue<E> q;

  private long numBytes = 0;

  public DataQueue(Object name, SizeInBytes byteLimit, int elementLimit,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/TimeoutScheduler.java`
#### Snippet
```java
  private int numTasks = 0;
  /** The scheduleID for each task */
  private int scheduleID = 0;

  private ShutdownTask shutdownTask = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/TimeoutScheduler.java`
#### Snippet
```java

  /** The number of scheduled tasks. */
  private int numTasks = 0;
  /** The scheduleID for each task */
  private int scheduleID = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/TimeoutScheduler.java`
#### Snippet
```java
  private int scheduleID = 0;

  private ShutdownTask shutdownTask = null;

  private final Scheduler scheduler = new Scheduler();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/PeerProxyMap.java`
#### Snippet
```java
  private class PeerAndProxy {
    private final RaftPeer peer;
    private volatile PROXY proxy = null;
    private final LifeCycle lifeCycle;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedCheckedSupplier.java`
#### Snippet
```java

  private final CheckedSupplier<RETURN, THROW> initializer;
  private volatile RETURN value = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/LongMinMax.java`
#### Snippet
```java
  private long min;
  private long max;
  private boolean initialized = false;

  /** @return the min */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-common/src/main/java/org/apache/ratis/retry/ExponentialBackoffRetry.java`
#### Snippet
```java

    private TimeDuration baseSleepTime;
    private TimeDuration maxSleepTime = null;
    private int maxAttempts = Integer.MAX_VALUE;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/FollowerInfoImpl.java`
#### Snippet
```java
  private final RaftLogIndex snapshotIndex = new RaftLogIndex("snapshotIndex", 0L);
  private volatile boolean caughtUp;
  private volatile boolean ackInstallSnapshotAttempt = false;

  FollowerInfoImpl(RaftGroupMemberId id, RaftPeer peer, Function<RaftPeerId, RaftPeer> getPeer,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RetryCacheImpl.java`
#### Snippet
```java
     * applying the transaction.
     */
    private volatile boolean failed = false;

    CacheEntry(ClientInvocationId key) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/ReadIndexHeartbeats.java`
#### Snippet
```java
    private final LogAppender appender;
    private final long minCallId;
    private volatile boolean acknowledged = false;

    HeartbeatAck(LogAppender appender) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/leader/InstallSnapshotRequests.java`
#### Snippet
```java

  /** The index of the current request. */
  private int requestIndex = 0;

  /** The index of the current file. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/leader/InstallSnapshotRequests.java`
#### Snippet
```java

  /** The index of the current file. */
  private int fileIndex = 0;
  /** The current file. */
  private FileChunkReader current;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftConfigurationImpl.java`
#### Snippet
```java
    private long logEntryIndex = RaftLog.INVALID_LOG_INDEX;

    private boolean forceStable = false;
    private boolean forceTransitional = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftConfigurationImpl.java`
#### Snippet
```java

    private boolean forceStable = false;
    private boolean forceTransitional = false;

    private Builder() {}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
  class ImplMap implements Closeable {
    private final ConcurrentMap<RaftGroupId, CompletableFuture<RaftServerImpl>> map = new ConcurrentHashMap<>();
    private boolean isClosed = false;

    synchronized CompletableFuture<RaftServerImpl> addNew(RaftGroup group, StartupOption option) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java
   */
  static class LimitedInputStream extends FilterInputStream {
    private long curPos = 0;
    private long markPos = -1;
    private long limitPos = Long.MAX_VALUE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/RaftLogBase.java`
#### Snippet
```java
  private final long purgePreservation;

  private volatile LogEntryProto lastMetadataEntry = null;

  protected RaftLogBase(RaftGroupMemberId memberId,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/storage/FileChunkReader.java`
#### Snippet
```java
  private final MessageDigest digester;
  /** The offset position of the current chunk. */
  private long offset = 0;
  /** The index of the current chunk. */
  private int chunkIndex = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/storage/FileChunkReader.java`
#### Snippet
```java
  private long offset = 0;
  /** The index of the current chunk. */
  private int chunkIndex = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/SimpleStateMachineStorage.java`
#### Snippet
```java
      .isPresent();

  private volatile File stateMachineDir = null;
  private final AtomicReference<SingleFileSnapshotInfo> latestSnapshot = new AtomicReference<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogWorker.java`
#### Snippet
```java
  private class TruncateLog extends Task {
    private final TruncationSegments segments;
    private CompletableFuture<Void> stateMachineFuture = null;

    TruncateLog(TruncationSegments ts, long index) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogWorker.java`
#### Snippet
```java
  /** the index of the last entry that has been written */
  private long lastWrittenIndex;
  private volatile int flushBatchSize = 0;
  /** the largest index of the entry that has been flushed */
  private final RaftLogIndex flushIndex = new RaftLogIndex("flushIndex", 0);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogWorker.java`
#### Snippet
```java
   * has not been flushed.
   */
  private int pendingFlushNum = 0;
  /** the index of the last entry that has been written */
  private long lastWrittenIndex;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

  @Parameter(names = {"--sync"}, description = "Whether sync every bufferSize", required = false)
  private int sync = 0;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
    private final int bufferSize;
    private final long syncSize;
    private long syncPosition = 0;

    TransferType(String path, DataStream cli) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ratis-server-api/src/main/java/org/apache/ratis/server/RaftServer.java`
#### Snippet
```java
    private RaftPeerId serverId;
    private StateMachine.Registry stateMachineRegistry ;
    private RaftGroup group = null;
    private RaftStorage.StartupOption option = RaftStorage.StartupOption.FORMAT;
    private RaftProperties properties;
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Closeable`
in `ratis-client/src/main/java/org/apache/ratis/client/DataStreamClient.java`
#### Snippet
```java
 * A user interface extending {@link DataStreamRpcApi}.
 */
public interface DataStreamClient extends DataStreamRpcApi, Closeable {
  Logger LOG = LoggerFactory.getLogger(DataStreamClient.class);

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/StateMachineUpdater.java`
#### Snippet
```java
        }
      } catch (Throwable t) {
        if (t instanceof InterruptedException && state == State.STOP) {
          LOG.info("{} was interrupted.  Exiting ...", this);
        } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogWorker.java`
#### Snippet
```java
      }
    } catch (Exception e) {
      if (e instanceof InterruptedException && !running) {
        LOG.info("Got InterruptedException when adding task " + task
            + ". The SegmentedRaftLogWorker already stopped.");
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/StorageImplUtils.java`
#### Snippet
```java
        return storage;
      } catch (Throwable e) {
        if (e instanceof IOException) {
          throw e;
        }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `pos` of exception class
in `ratis-common/src/main/java/org/apache/ratis/protocol/exceptions/ChecksumException.java`
#### Snippet
```java
public class ChecksumException extends IOException {
  private static final long serialVersionUID = 1L;
  private long pos;
  public ChecksumException(String description, long pos) {
    super(description);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `ratis-common/src/main/java/org/apache/ratis/util/NetUtils.java`
#### Snippet
```java
      throw new UncheckedIOException(e);
    } finally {
      IOUtils.cleanup(null, sockets.toArray(new Closeable[0]));
    }
    return list;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedSupplier.java`
#### Snippet
```java
    T v = value;
    if (v == null) {
      synchronized (this) {
        v = value;
        if (v == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-common/src/main/java/org/apache/ratis/util/PeerProxyMap.java`
#### Snippet
```java
    PROXY getProxy() throws IOException {
      if (proxy == null) {
        synchronized (this) {
          if (proxy == null) {
            final LifeCycle.State current = lifeCycle.getCurrentState();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-common/src/main/java/org/apache/ratis/util/PeerProxyMap.java`
#### Snippet
```java
    Optional<PROXY> setNullProxyAndClose() {
      final PROXY p;
      synchronized (this) {
        p = proxy;
        lifeCycle.checkStateAndClose(() -> proxy = null);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-common/src/main/java/org/apache/ratis/util/MemoizedCheckedSupplier.java`
#### Snippet
```java
    RETURN v = value;
    if (v == null) {
      synchronized (this) {
        v = value;
        if (v == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RetryCacheImpl.java`
#### Snippet
```java

    // the previous attempt failed, replace it with a new one.
    synchronized (this) {
      // need to recheck, since there may be other retry attempts being
      // processed at the same time. The recheck+replacement should be protected
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/ReadIndexHeartbeats.java`
#### Snippet
```java
        return false;
      }
      synchronized (this) {
        if (!acknowledged && isValid(reply)) {
          acknowledged = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/WatchRequests.java`
#### Snippet
```java

      final PendingWatch computed;
      synchronized (this) {
        final long queueIndex = getIndex();
        if (pending.getIndex() <= queueIndex) { // compare again synchronized
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
    Collection<TransactionContext> setNotLeaderException(NotLeaderException nle,
                                                         Collection<CommitInfoProto> commitInfos) {
      synchronized (this) {
        resource.close();
        permits.clear();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/SnapshotInstallationHandler.java`
#### Snippet
```java
        request.getNotification().getFirstAvailableTermIndex());
    final long firstAvailableLogIndex = firstAvailableLogTermIndex.getIndex();
    synchronized (this) {
      final boolean recognized = state.recognizeLeader(leaderId, leaderTerm);
      currentTerm = state.getCurrentTerm();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/SnapshotInstallationHandler.java`
#### Snippet
```java
    final TermIndex lastIncluded = TermIndex.valueOf(snapshotChunkRequest.getTermIndex());
    final long lastIncludedIndex = lastIncluded.getIndex();
    synchronized (this) {
      final boolean recognized = state.recognizeLeader(leaderId, leaderTerm);
      currentTerm = state.getCurrentTerm();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    final SetConfigurationRequest.Arguments arguments = request.getArguments();
    final PendingRequest pending;
    synchronized (this) {
      reply = checkLeaderState(request, null, false);
      if (reply != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java

    final PendingRequest pending;
    synchronized (this) {
      reply = checkLeaderState(request, cacheEntry, true);
      if (reply != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    final Optional<FollowerState> followerState;
    final Timekeeper.Context timer = raftServerMetrics.getFollowerAppendEntryTimer(isHeartbeat).time();
    synchronized (this) {
      // Check life cycle state again to avoid the PAUSING/PAUSED state.
      assertLifeCycleState(LifeCycle.States.STARTING_OR_RUNNING);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    ).thenApply(v -> {
      final AppendEntriesReplyProto reply;
      synchronized(this) {
        final long commitIndex = ServerImplUtils.effectiveCommitIndex(leaderCommit, previous, entries.size());
        state.updateCommitIndex(commitIndex, currentTerm, false);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    assertGroup(request.getRequestorId(), request.getRaftGroupId());

    synchronized (this) {
      CompletableFuture<RaftClientReply> reply = checkLeaderState(request, null, false);
      if (reply != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    assertGroup(leaderId, leaderGroupId);

    synchronized (this) {
      // leaderLastEntry should not be null because LeaderStateImpl#start append a placeHolder entry
      // so leader at each term should has at least one entry
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    boolean shouldShutdown = false;
    final RequestVoteReplyProto reply;
    synchronized (this) {
      // Check life cycle state again to avoid the PAUSING/PAUSED state.
      assertLifeCycleState(LifeCycle.States.RUNNING);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    // Pause() should pause ongoing operations:
    //  a. call {@link StateMachine#pause()}.
    synchronized (this) {
      if (!lifeCycle.compareAndTransition(RUNNING, PAUSING)) {
        return false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java

  boolean resume() throws IOException {
    synchronized (this) {
      if (!lifeCycle.compareAndTransition(PAUSED, STARTING)) {
        return false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    }

    synchronized (this) {
      final long installSnapshot = snapshotInstallationHandler.getInProgressInstallSnapshotIndex();
      // check snapshot install/load
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `8` assigned to `localCrc` is never used
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
          ^ (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### UnusedAssignment
The value changed at `off++` is never used
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
        /* nothing */
```

### UnusedAssignment
Variable `reason` initializer `""` is redundant
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
   */
  private void startAsPeer(RaftPeerRole newRole) {
    Object reason = "";
    if (newRole == RaftPeerRole.FOLLOWER) {
      reason = "startAsFollower";
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `includeSelf` is always 'false'
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
    final int length = includeSelf ? followerInfos.size() + 1 : followerInfos.size();
    if (length == 0) {
      throw new IllegalArgumentException("followerInfos is empty and includeSelf == " + includeSelf);
    }

```

### ConstantValue
Value `updated` is always 'true'
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLogIndex.java`
#### Snippet
```java
    if (updated) {
      log.accept(StringUtils.stringSupplierAsObject(
          () -> name + ": updateToMax old=" + old + ", new=" + newIndex + ", updated? " + updated));
    }
    return updated;
```

## RuleId[id=IOResource]
### IOResource
'RatisShell' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/RatisShell.java`
#### Snippet
```java
   */
  public static void main(String[] args) {
    final RatisShell shell = new RatisShell(System.out);
    System.exit(shell.run(args));
  }
```

### IOResource
'DataStreamServerImpl' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
    this.lifeCycle = new LifeCycle(this.id + "-" + JavaUtils.getClassSimpleName(getClass()));

    this.dataStreamServerRpc = new DataStreamServerImpl(this, parameters).getServerRpc();

    this.implExecutor = ConcurrentUtils.newSingleThreadExecutor(id + "-groupManagement");
```

### IOResource
'RandomAccessFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/BufferedWriteChannel.java`
#### Snippet
```java
class BufferedWriteChannel implements Closeable {
  static BufferedWriteChannel open(File file, boolean append, ByteBuffer buffer) throws IOException {
    final RandomAccessFile raf = new RandomAccessFile(file, "rw");
    final FileChannel fc = raf.getChannel();
    if (append) {
```

### IOResource
'CounterServer' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ratis-examples/src/main/java/org/apache/ratis/examples/debug/server/Server.java`
#### Snippet
```java

    final File storageDir = new File(Constants.PATH, currentPeer.getId().toString());
    final CounterServer counterServer = new CounterServer(currentPeer, storageDir, TimeDuration.ZERO);
    counterServer.start();
  }
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java

      //exit when any input entered
      new Scanner(System.in, UTF_8.name()).nextLine();
    }
  }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `ratis-client/src/main/java/org/apache/ratis/client/api/AdminApi.java`
#### Snippet
```java
  default RaftClientReply transferLeadership(RaftPeerId newLeader, long timeoutMs) throws IOException {
    return transferLeadership(newLeader, null, timeoutMs);
  };

  RaftClientReply transferLeadership(RaftPeerId newLeader, RaftPeerId leaderId, long timeoutMs) throws IOException;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
    if (t instanceof StatusRuntimeException) {
      final Metadata trailers = ((StatusRuntimeException)t).getTrailers();
      String callId = trailers.get(CALL_ID);
      return callId != null ? Integer.parseInt(callId) : -1;
    }
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/metrics/intercept/client/MetricClientInterceptor.java`
#### Snippet
```java
  private String getMethodMetricPrefix(MethodDescriptor<?, ?> method){
    String serviceName = MethodDescriptor.extractFullServiceName(method.getFullMethodName());
    String methodName = method.getFullMethodName().substring(serviceName.length() + 1);
    return identifier + "_" + serviceName + "_" + methodName;
  }
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/metrics/intercept/server/MetricServerInterceptor.java`
#### Snippet
```java
  private String getMethodMetricPrefix(MethodDescriptor<?, ?> method){
    String serviceName = MethodDescriptor.extractFullServiceName(method.getFullMethodName());
    String methodName = method.getFullMethodName().substring(serviceName.length() + 1);
    return identifier + "_" + serviceName + "_" + methodName;
  }
```

### DataFlowIssue
Method invocation `getTerm` may produce `NullPointerException`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLog.java`
#### Snippet
```java
        fileLogWorker.rollLogSegment(currentOpenSegment);
      } else if (currentOpenSegment.numOfEntries() > 0 &&
          currentOpenSegment.getLastTermIndex().getTerm() != entry.getTerm()) {
        // the term changes
        final long currentTerm = currentOpenSegment.getLastTermIndex().getTerm();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyRpcProxy.java`
#### Snippet
```java
      if (!replies.isEmpty()) {
        final IOException e = new IOException("Connection to " + peer + " is closed.");
        replies.stream().forEach(f -> f.completeExceptionally(e));
        replies.clear();
      }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
    } else {
      final StringBuilder b = new StringBuilder("{");
      map.entrySet().stream().forEach(e -> b.append("\n  ").append(e.getKey()).append(" -> ").append(e.getValue()));
      return b.append("\n}").toString();
    }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Get.java`
#### Snippet
```java
    Expression response =
        Expression.Utils.bytes2Expression(getValue.getMessage().getContent().toByteArray(), 0);
    System.out.println(String.format("%s=%s", name, (DoubleValue) response).toString());
  }
}
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'notifyFollowerSlowness' is still used
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
    /** @deprecated Use {@link #notifyFollowerSlowness(RoleInfoProto, RaftPeer)}. */
    @Deprecated
    default void notifyFollowerSlowness(RoleInfoProto leaderInfo) {}

    /**
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/peer/AddCommand.java`
#### Snippet
```java
      List<InetSocketAddress> addresses =
          Arrays.stream(cl.getOptionValue(ADDRESS_OPTION_NAME).split(","))
              .map(s -> parseInetSocketAddress(s)).collect(Collectors.toList());
      assert ids.size() == addresses.size();
      for (int i = 0; i < ids.size(); i++) {
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java

    @Override
    public void mark(int limit) {
      super.mark(limit);
      markPos = curPos;
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
      if (markPos == -1) {
        throw new IOException("Not marked!");
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'suggestedLeader' in a Serializable class
in `ratis-common/src/main/java/org/apache/ratis/protocol/exceptions/NotLeaderException.java`
#### Snippet
```java

public class NotLeaderException extends RaftException {
  private final RaftPeer suggestedLeader;
  /** the client may need to update its RaftPeer list */
  private final Collection<RaftPeer> peers;
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `loadCommands()` during object construction
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
  public AbstractShell(Context context) {
    closer = Closer.create();
    mCommands = loadCommands(context);
    // Register all loaded commands under closer.
    mCommands.values().forEach(closer::register);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
    try {
      ConcurrentUtils.shutdownAndWait(implExecutor);
    } catch (Exception ignored) {
      LOG.warn(getId() + ": Failed to shutdown implExecutor", ignored);
    }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
      try {
        getServerRpc().close();
      } catch(IOException ignored) {
        LOG.warn(getId() + ": Failed to close " + getRpcType() + " server", ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
      try {
        getDataStreamServerRpc().close();
      } catch (IOException ignored) {
        LOG.warn(getId() + ": Failed to close " + SupportedDataStreamType.NETTY + " server", ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
      try {
        ConcurrentUtils.shutdownAndWait(executor);
      } catch (Exception ignored) {
        LOG.warn(getId() + ": Failed to shutdown executor", ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
        } catch (NoSuchFileException e) {
          LOG.warn("{}: Some file does not exist {}", getMemberId(), dir, e);
        } catch (Exception ignored) {
          LOG.error("{}: Failed to remove RaftStorageDirectory {}", getMemberId(), dir, ignored);
          break;
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try {
        jmxAdapter.unregister();
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to un-register RaftServer JMX bean", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try {
        role.shutdownFollowerState();
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to shutdown FollowerState", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try{
        role.shutdownLeaderElection();
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to shutdown LeaderElection", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try{
        role.shutdownLeaderState(true);
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to shutdown LeaderState monitor", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try{
        state.close();
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to close state", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
        raftServerMetrics.unregister();
        RaftServerMetricsImpl.removeRaftServerMetrics(getMemberId());
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to unregister metric", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
          raftClient.get().close();
        }
      } catch (Exception ignored) {
        LOG.warn("{}: Failed to close raft client", getMemberId(), ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try {
        ConcurrentUtils.shutdownAndWait(clientExecutor);
      } catch (Exception ignored) {
        LOG.warn(getMemberId() + ": Failed to shutdown clientExecutor", ignored);
      }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      try {
        ConcurrentUtils.shutdownAndWait(serverExecutor);
      } catch (Exception ignored) {
        LOG.warn(getMemberId() + ": Failed to shutdown serverExecutor", ignored);
      }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is map
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
   * Map structure: Command name => {@link Command} instance.
   *
   * @return a set of commands which can be executed under this shell
   */
  protected abstract Map<String, Command> loadCommands(Context context);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ratis-server/src/main/java/org/apache/ratis/server/storage/RaftStorageDirectoryImpl.java`
#### Snippet
```java
      res = file.getChannel().tryLock();
      if (null == res) {
        LOG.error("Unable to acquire file lock on path " + lockF.toString());
        throw new OverlappingFileLockException();
      }
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
  Supplier<ThreadGroup> ROOT_THREAD_GROUP = memoize(() -> {
    for (ThreadGroup g = Thread.currentThread().getThreadGroup(), p;; g = p) {
      if ((p = g.getParent()) == null) {
        return g;
      }
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreCommon.java`
#### Snippet
```java
      String message, Throwable cause) {
    return JavaUtils.completeExceptionally(
        new IOException(message).initCause(cause));
  }
}
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
      final Metadata trailers = ((StatusRuntimeException)t).getTrailers();
      String isHeartbeat = trailers != null ? trailers.get(HEARTBEAT) : null;
      return isHeartbeat != null && Boolean.valueOf(isHeartbeat);
    }
    return false;
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `out`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
      }

      synchronized (out) {
        int n = 0;
        if (data != null) {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/AssignmentMessage.java`
#### Snippet
```java

public class AssignmentMessage implements Message, Evaluable {
  public static final Charset UTF8 = Charset.forName("UTF-8");

  private final Variable variable;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
    if (command == null) {
      // Unknown command (we didn't find the cmd in our dict)
      System.err.printf("%s is an unknown command.%n", cmd);
      printUsage();
      return -1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
    } catch (IllegalArgumentException e) {
      // It outputs a prompt message when passing wrong args to CLI
      System.out.println(e.getMessage());
      System.out.println("Usage: " + command.getUsage());
      System.out.println(command.getDescription());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
      // It outputs a prompt message when passing wrong args to CLI
      System.out.println(e.getMessage());
      System.out.println("Usage: " + command.getUsage());
      System.out.println(command.getDescription());
      LOG.error("Invalid arguments for command {}:", command.getCommandName(), e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
      System.out.println(e.getMessage());
      System.out.println("Usage: " + command.getUsage());
      System.out.println(command.getDescription());
      LOG.error("Invalid arguments for command {}:", command.getCommandName(), e);
      return -1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
      return command.run(cmdline);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      LOG.error("Error running" + Arrays.stream(argv).reduce("", (a, b) -> a + " " + b), e);
      return -1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
   */
  protected void printUsage() {
    System.out.println("Usage: ratis " + getShellName() + " [generic options]");
    SortedSet<String> sortedCmds = new TreeSet<>(mCommands.keySet());
    for (String cmd : sortedCmds) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
    SortedSet<String> sortedCmds = new TreeSet<>(mCommands.keySet());
    for (String cmd : sortedCmds) {
      System.out.format("%-60s%n", "\t [" + mCommands.get(cmd).getUsage() + "]");
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/RatisShell.java`
#### Snippet
```java
   */
  public static void main(String[] args) {
    final RatisShell shell = new RatisShell(System.out);
    System.exit(shell.run(args));
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/peer/RemoveCommand.java`
#### Snippet
```java
      final List<RaftPeer> listeners = getPeerStream(RaftPeerRole.LISTENER)
          .filter(raftPeer -> !ids.contains(raftPeer.getId())).collect(Collectors.toList());
      System.out.println("New peer list: " + peers);
      System.out.println("New listener list:  " + listeners);
      final RaftClientReply reply = client.admin().setConfiguration(peers, listeners);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/peer/RemoveCommand.java`
#### Snippet
```java
          .filter(raftPeer -> !ids.contains(raftPeer.getId())).collect(Collectors.toList());
      System.out.println("New peer list: " + peers);
      System.out.println("New listener list:  " + listeners);
      final RaftClientReply reply = client.admin().setConfiguration(peers, listeners);
      processReply(reply, () -> "Failed to change raft peer");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/peer/AddCommand.java`
#### Snippet
```java
      final List<RaftPeer> listeners = getPeerStream(RaftPeerRole.LISTENER)
          .collect(Collectors.toList());
      System.out.println("New peer list: " + peers);
      System.out.println("New listener list:  " + listeners);
      RaftClientReply reply = client.admin().setConfiguration(peers, listeners);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/peer/AddCommand.java`
#### Snippet
```java
          .collect(Collectors.toList());
      System.out.println("New peer list: " + peers);
      System.out.println("New listener list:  " + listeners);
      RaftClientReply reply = client.admin().setConfiguration(peers, listeners);
      processReply(reply, () -> "Failed to change raft peer");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/DefaultLogDump.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    String filePath = args[0];
    System.out.println("file path is " + filePath);
    File logFile = new File(filePath);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
      numStateMachineEntries++;
    } else {
      System.out.println("Found invalid entry" + proto.toString());
      numInvalidEntries++;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java

    String str = LogProtoUtils.toLogEntryString(proto, smLogToString);
    System.out.println(str);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
    final LogSegmentPath pi = LogSegmentPath.matchLogSegment(file.toPath());
    if (pi == null) {
      System.out.println("Invalid segment file");
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
    }

    System.out.println("Processing Raft Log file: " + file.getAbsolutePath() + " size:" + file.length());
    final int entryCount = LogSegment.readSegmentFile(file, pi.getStartEnd(), maxOpSize,
        RaftServerConfigKeys.Log.CorruptionPolicy.EXCEPTION, null, this::processLogEntry);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
    final int entryCount = LogSegment.readSegmentFile(file, pi.getStartEnd(), maxOpSize,
        RaftServerConfigKeys.Log.CorruptionPolicy.EXCEPTION, null, this::processLogEntry);
    System.out.println("Num Total Entries: " + entryCount);
    System.out.println("Num Conf Entries: " + numConfEntries);
    System.out.println("Num Metadata Entries: " + numMetadataEntries);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
        RaftServerConfigKeys.Log.CorruptionPolicy.EXCEPTION, null, this::processLogEntry);
    System.out.println("Num Total Entries: " + entryCount);
    System.out.println("Num Conf Entries: " + numConfEntries);
    System.out.println("Num Metadata Entries: " + numMetadataEntries);
    System.out.println("Num StateMachineEntries Entries: " + numStateMachineEntries);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
    System.out.println("Num Total Entries: " + entryCount);
    System.out.println("Num Conf Entries: " + numConfEntries);
    System.out.println("Num Metadata Entries: " + numMetadataEntries);
    System.out.println("Num StateMachineEntries Entries: " + numStateMachineEntries);
    System.out.println("Num Invalid Entries: " + numInvalidEntries);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
    System.out.println("Num Conf Entries: " + numConfEntries);
    System.out.println("Num Metadata Entries: " + numMetadataEntries);
    System.out.println("Num StateMachineEntries Entries: " + numStateMachineEntries);
    System.out.println("Num Invalid Entries: " + numInvalidEntries);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-tools/src/main/java/org/apache/ratis/tools/ParseRatisLog.java`
#### Snippet
```java
    System.out.println("Num Metadata Entries: " + numMetadataEntries);
    System.out.println("Num StateMachineEntries Entries: " + numStateMachineEntries);
    System.out.println("Num Invalid Entries: " + numInvalidEntries);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-common/src/main/java/org/apache/ratis/conf/ConfUtils.java`
#### Snippet
```java

  static void printAll(Class<?> confClass) {
    ConfUtils.printAll(confClass, System.out::println);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/debug/server/Server.java`
#### Snippet
```java
  public static void main(String[] args) throws IOException {
    if (args.length < 1) {
      System.err.println("The arguments should be <ip:port>");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/Runner.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.err.println("No command type specified: ");
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/Runner.java`
#### Snippet
```java

    if (commands == null) {
      System.err.println("Wrong command type: " + args[0]);
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/Runner.java`
#### Snippet
```java
      }
    } catch (ParameterException exception) {
      System.err.println("Wrong parameters: " + exception.getMessage());
      jc.usage();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
    } catch (Throwable e) {
      e.printStackTrace();
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      e.printStackTrace();
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.client.CounterClient [increment] [async|io]");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.client.CounterClient [increment] [async|io]");
      System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.client.CounterClient [increment] [async|io]");
      System.err.println();
      System.err.println("       increment: the number of INCREMENT commands to be sent (default is 10)");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.client.CounterClient [increment] [async|io]");
      System.err.println();
      System.err.println("       increment: the number of INCREMENT commands to be sent (default is 10)");
      System.err.println("       async    : use the AsyncApi (default)");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      System.err.println("Usage: java org.apache.ratis.examples.counter.client.CounterClient [increment] [async|io]");
      System.err.println();
      System.err.println("       increment: the number of INCREMENT commands to be sent (default is 10)");
      System.err.println("       async    : use the AsyncApi (default)");
      System.err.println("       io       : use the BlockingApi");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      System.err.println();
      System.err.println("       increment: the number of INCREMENT commands to be sent (default is 10)");
      System.err.println("       async    : use the AsyncApi (default)");
      System.err.println("       io       : use the BlockingApi");
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      System.err.println("       increment: the number of INCREMENT commands to be sent (default is 10)");
      System.err.println("       async    : use the AsyncApi (default)");
      System.err.println("       io       : use the BlockingApi");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java

  private void run(int increment, boolean blocking) throws Exception {
    System.out.printf("Sending %d %s command(s) using the %s ...%n",
        increment, CounterCommand.INCREMENT, blocking? "BlockingApi": "AsyncApi");
    final List<Future<RaftClientReply>> futures = new ArrayList<>(increment);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      if (reply.isSuccess()) {
        final String count = reply.getMessage().getContent().toStringUtf8();
        System.out.println("Counter is incremented to " + count);
      } else {
        System.err.println("Failed " + reply);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
        System.out.println("Counter is incremented to " + count);
      } else {
        System.err.println("Failed " + reply);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
    final RaftClientReply reply = client.io().sendReadOnly(CounterCommand.GET.getMessage());
    final String count = reply.getMessage().getContent().toStringUtf8();
    System.out.println("Current counter value: " + count);

    // using Linearizable Read
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
                  return client.io().sendReadOnly(CounterCommand.GET.getMessage(), p.getId());
                } catch (IOException e) {
                  System.err.println("Failed read-only request");
                  return RaftClientReply.newBuilder().setSuccess(false).build();
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
              }, executor).whenCompleteAsync((r, ex) -> {
                if (ex != null || !r.isSuccess()) {
                  System.err.println("Failed " + r);
                  return;
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
                final long elapsedSec = (endTime-startTime) / 1000;
                final String countValue = r.getMessage().getContent().toStringUtf8();
                System.out.println("read from " + p.getId() + " and get counter value: " + countValue
                    + ", time elapsed: " + elapsedSec + " seconds");
              });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
    } catch(Throwable e) {
      e.printStackTrace();
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
      e.printStackTrace();
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.server.CounterServer peer_index");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.server.CounterServer peer_index");
      System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
      System.err.println("args = " + Arrays.toString(args));
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.server.CounterServer peer_index");
      System.err.println();
      System.err.println("       peer_index must be 0, 1 or 2");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
      System.err.println();
      System.err.println("Usage: java org.apache.ratis.examples.counter.server.CounterServer peer_index");
      System.err.println();
      System.err.println("       peer_index must be 0, 1 or 2");
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
      System.err.println("Usage: java org.apache.ratis.examples.counter.server.CounterServer peer_index");
      System.err.println();
      System.err.println("       peer_index must be 0, 1 or 2");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/ArithmeticLogDump.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    String filePath = args[0];
    System.out.println("file path is " + filePath);
    File logFile = new File(filePath);

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
      pro.waitFor();
    } catch (Throwable t) {
      System.err.println("Failed to run command:" + Arrays.toString(cmds) + ":" + t.getMessage());
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
      long size = futures.get(i).join();
      if (size != fileSizeInBytes) {
        System.err.println("Error: path:" + paths.get(i) + " write:" + size +
            " mismatch expected size:" + fileSizeInBytes);
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
    List<String> paths = generateFiles(executor);
    dropCache();
    System.out.println("Starting Async write now ");

    long startTime = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
    long endTime = System.currentTimeMillis();

    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");

    stop(clients);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

      if (writtenLen != getFileSizeInBytes()) {
        System.out.println("File written:" + writtenLen + " does not match expected:" + getFileSizeInBytes());
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Get.java`
#### Snippet
```java
    Expression response =
        Expression.Utils.bytes2Expression(getValue.getMessage().getContent().toByteArray(), 0);
    System.out.println(String.format("%s=%s", name, (DoubleValue) response).toString());
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Assign.java`
#### Snippet
```java
    RaftClientReply send = client.io().send(
        new AssignmentMessage(new Variable(name), createExpression(value)));
    System.out.println("Success: " + send.isSuccess());
    System.out.println("Response: " + send.getMessage().getClass());
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Assign.java`
#### Snippet
```java
        new AssignmentMessage(new Variable(name), createExpression(value)));
    System.out.println("Success: " + send.isSuccess());
    System.out.println("Response: " + send.getMessage().getClass());
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

      if (writtenLen != getFileSizeInBytes()) {
        System.out.println("File written:" + writtenLen + " does not match expected:" + getFileSizeInBytes());
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
    List<String> paths = generateFiles(executor);
    dropCache();
    System.out.println("Starting DataStream write now ");

    RoutingTable routingTable = getRoutingTable(Arrays.asList(getPeers()), getPrimary());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
    long endTime = System.currentTimeMillis();

    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");

    stop(clients);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
  private boolean checkParam() {
    if (syncSize != -1 && syncSize % getBufferSizeInBytes() != 0) {
      System.err.println("Error: syncSize % bufferSize should be zero");
      return false;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

    if (Type.valueOfIgnoreCase(dataStreamType) == null) {
      System.err.println("Error: dataStreamType should be one of " + DESCRIPTION);
      return false;
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof Variable)'
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/expression/Variable.java`
#### Snippet
```java
    if (obj == this) {
      return true;
    } else if (obj == null || !(obj instanceof Variable)) {
      return false;
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/peer/SetPriorityCommand.java`
#### Snippet
```java
    Map<String, Integer> addressPriorityMap = new HashMap<>();
    for (String optionValue : cl.getOptionValues(PEER_WITH_NEW_PRIORITY_OPTION_NAME)) {
      String[] str = optionValue.split("[|]");
      if (str.length < 2) {
        println("The format of the parameter is wrong");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ratis-common/src/main/java/org/apache/ratis/util/TimeDuration.java`
#### Snippet
```java
  public static TimeDuration valueOf(String timeString, TimeUnit defaultUnit) {
    Objects.requireNonNull(timeString, "timeString = null");
    final String lower = timeString.trim().replace("_", "").toLowerCase();
    for(Abbreviation a : Abbreviation.values()) {
      for(String s : a.getSymbols()) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
    return s == null? EMPTY_STRING_ARRAY
        : (s = s.trim()).isEmpty()? EMPTY_STRING_ARRAY
        : s.split("\\s*,\\s*");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java

  private static <E> E parseElement(String[] elements, int i, String input, Function<String, E> parser) {
    final String s = elements[i].trim().replace("_", "");
    try {
      return parser.apply(s);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ratis-common/src/main/java/org/apache/ratis/conf/ConfUtils.java`
#### Snippet
```java

  static String normalizeName(String name) {
    return name.replaceAll("[._-]", "").toLowerCase();
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java

  /**
   * The same as {@link java.util.concurrent.Executors#newCachedThreadPool(ThreadFactory)}
   * except that this method takes a maximumPoolSize parameter.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java
   * @param maximumPoolSize the maximum number of threads to allow in the pool.
   *                        When maximumPoolSize == 0, this method is the same as
   *                        {@link java.util.concurrent.Executors#newCachedThreadPool(ThreadFactory)}.
   * @return a new {@link ExecutorService}.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java

  /**
    * This method is similar to {@link java.util.concurrent.Executors#newSingleThreadExecutor(ThreadFactory)}
    * except that this method takes a specific thread name as there is only one thread.g
    *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/ConcurrentUtils.java`
#### Snippet
```java
   * Create a new {@link ExecutorService} with a maximum pool size.
   * If it is cached, this method is similar to {@link #newCachedThreadPool(int, ThreadFactory)}.
   * Otherwise, this method is similar to {@link java.util.concurrent.Executors#newFixedThreadPool(int)}.
   *
   * @param cached Use cached thread pool?  If not, use a fixed thread pool.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/AwaitForSignal.java`
#### Snippet
```java
  }

  /** The same as {@link java.util.concurrent.locks.Condition#await()} */
  public void await() throws InterruptedException {
    lock.lock();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/AwaitForSignal.java`
#### Snippet
```java

/**
 * This class is a partial implementation of {@link java.util.concurrent.locks.Condition}.
 * Only some of the await and signal methods are implemented.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/AwaitForSignal.java`
#### Snippet
```java
  }

  /** The same as {@link java.util.concurrent.locks.Condition#await(long, TimeUnit)} */
  public boolean await(long time, TimeUnit unit) throws InterruptedException {
    if (time <= 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `ratis-common/src/main/java/org/apache/ratis/util/AwaitForSignal.java`
#### Snippet
```java
  }

  /** The same as {@link java.util.concurrent.locks.Condition#signal()} */
  public void signal() {
    lock.lock();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.ratis.conf` is unnecessary, and can be replaced with an import
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
      builder.setRaftGroup(raftGroup);
      builder.setClientRpc(
          new GrpcFactory(new org.apache.ratis.conf.Parameters())
              .newRaftClientRpc(ClientId.randomId(), raftProperties));
      RaftPeer[] peers = getPeers();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `ratis-server-api/src/main/java/org/apache/ratis/server/DataStreamMap.java`
#### Snippet
```java
      Function<ClientInvocationId, CompletableFuture<DataStream>> newDataStream);

  /** Similar to {@link java.util.Map#remove(java.lang.Object). */
  CompletableFuture<DataStream> remove(ClientInvocationId invocationId);
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.ratis.server.raftlog` is unnecessary and can be removed
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLogSequentialOps.java`
#### Snippet
```java
   *
   * @return the index of the new log entry if it is appended;
   *         otherwise, return {@link org.apache.ratis.server.raftlog.RaftLog#INVALID_LOG_INDEX}.
   */
  long appendMetadata(long term, long commitIndex);
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
        }
      } catch (Throwable e) {
        e.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/client/CounterClient.java`
#### Snippet
```java
      client.run(increment, io);
    } catch (Throwable e) {
      e.printStackTrace();
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `ratis-examples/src/main/java/org/apache/ratis/examples/counter/server/CounterServer.java`
#### Snippet
```java
      startServer(peerIndex, simulatedSlowness);
    } catch(Throwable e) {
      e.printStackTrace();
      System.err.println();
      System.err.println("args = " + Arrays.toString(args));
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractShell()` of an abstract class should not be declared 'public'
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/AbstractShell.java`
#### Snippet
```java
   * Creates a new instance of {@link AbstractShell}.
   */
  public AbstractShell(Context context) {
    closer = Closer.create();
    mCommands = loadCommands(context);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractParentCommand()` of an abstract class should not be declared 'public'
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractParentCommand.java`
#### Snippet
```java
  private final Map<String, Command> subs;

  public AbstractParentCommand(Context context, List<Function<Context, AbstractRatisCommand>> subCommandConstructors) {
    super(context);
    this.subs = Collections.unmodifiableMap(subCommandConstructors.stream()
```

### NonProtectedConstructorInAbstractClass
Constructor `ReconfigurationBase()` of an abstract class should not be declared 'public'
in `ratis-common/src/main/java/org/apache/ratis/conf/ReconfigurationBase.java`
#### Snippet
```java
   * @param properties raft properties.
   */
  public ReconfigurationBase(String name, RaftProperties properties) {
    this.name = name;
    this.properties = properties;
```

### NonProtectedConstructorInAbstractClass
Constructor `DataStreamPacketImpl()` of an abstract class should not be declared 'public'
in `ratis-common/src/main/java/org/apache/ratis/datastream/impl/DataStreamPacketImpl.java`
#### Snippet
```java
  private final long streamOffset;

  public DataStreamPacketImpl(ClientId clientId, Type type, long streamId, long streamOffset) {
    this.clientId = clientId;
    this.type = type;
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `ratis-common/src/main/java/org/apache/ratis/util/ReflectionUtils.java`
#### Snippet
```java
      synchronized (CLASSES) {
        map = CLASSES.get(CLASS_LOADER);
        if (map == null) {
          map = Collections.synchronizedMap(new WeakHashMap<>());
          CLASSES.put(CLASS_LOADER, map);
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `t`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java

  static StatusRuntimeException wrapException(Throwable t, long callId) {
    t = JavaUtils.unwrapCompletionException(t);
    Metadata trailers = new StatusRuntimeExceptionMetadataBuilder(t)
        .addCallId(callId)
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java

  static StatusRuntimeException wrapException(Throwable t, long callId, boolean isHeartbeat) {
    t = JavaUtils.unwrapCompletionException(t);
    Metadata trailers = new StatusRuntimeExceptionMetadataBuilder(t)
        .addCallId(callId)
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcClientProtocolService.java`
#### Snippet
```java
    boolean responseError(Throwable t, Supplier<String> message) {
      if (setClose()) {
        t = JavaUtils.unwrapCompletionException(t);
        if (LOG.isDebugEnabled()) {
          LOG.debug(name + ": Failed " + message.get(), t);
```

### AssignmentToMethodParameter
Assignment to method parameter `slidingWindowEntry`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/ClientProtoUtils.java`
#### Snippet
```java
      SlidingWindowEntry slidingWindowEntry, RoutingTable routingTable, long timeoutMs) {
    if (slidingWindowEntry == null) {
      slidingWindowEntry = SlidingWindowEntry.getDefaultInstance();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `newLeader`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java
    final boolean stillLeader = oldLeader.equals(curLeader);
    if (newLeader == null && stillLeader) {
      newLeader = CollectionUtils.random(oldLeader,
          CollectionUtils.as(peers, RaftPeer::getId));
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
           ^ (T[T8_1_START + c6] ^ T[T8_0_START + c7]);

      off += 8;
      len -= 8;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java

      off += 8;
      len -= 8;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
    /* loop unroll - duff's device style */
    switch(len) {
      case 7: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
    switch(len) {
      case 7: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      case 7: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/PureJavaCrc32C.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
        /* nothing */
```

### AssignmentToMethodParameter
Assignment to method parameter `symbol`
in `ratis-common/src/main/java/org/apache/ratis/util/TraditionalBinaryPrefix.java`
#### Snippet
```java
   */
  public static TraditionalBinaryPrefix valueOf(char symbol) {
    symbol = Character.toUpperCase(symbol);
    for(TraditionalBinaryPrefix prefix : TraditionalBinaryPrefix.values()) {
      if (symbol == prefix.symbol) {
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `ratis-common/src/main/java/org/apache/ratis/util/TraditionalBinaryPrefix.java`
#### Snippet
```java
   */
  public static long string2long(String s) {
    s = s.trim();
    final int lastpos = s.length() - 1;
    final char lastchar = s.charAt(lastpos);
```

### AssignmentToMethodParameter
Assignment to method parameter `unit`
in `ratis-common/src/main/java/org/apache/ratis/util/TraditionalBinaryPrefix.java`
#### Snippet
```java
  public static String long2String(long n, String unit, int decimalPlaces) {
    if (unit == null) {
      unit = "";
    }
    //take care a special case
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `ratis-common/src/main/java/org/apache/ratis/util/TraditionalBinaryPrefix.java`
#### Snippet
```java
    if (n < 0) {
      b.append('-');
      n = -n;
    }
    if (n < KILO.value) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `ratis-common/src/main/java/org/apache/ratis/util/IOUtils.java`
#### Snippet
```java
      throws IOException {
    do {
      offset += fc.write(buf, offset);
    } while (buf.remaining() > 0);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `ratis-common/src/main/java/org/apache/ratis/util/IOUtils.java`
#### Snippet
```java
      }
      toRead -= ret;
      off += ret;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `ratis-common/src/main/java/org/apache/ratis/util/NetUtils.java`
#### Snippet
```java
   */
  static InetSocketAddress createSocketAddr(String target, int defaultPort) {
    target = Objects.requireNonNull(target, "target == null").trim();
    boolean hasScheme = target.contains("://");
    if (!hasScheme && target.charAt(0) == '/') {
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `ratis-common/src/main/java/org/apache/ratis/util/NetUtils.java`
#### Snippet
```java
    boolean hasScheme = target.contains("://");
    if (!hasScheme && target.charAt(0) == '/') {
      target = target.substring(1);
    }
    final URI uri;
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `ratis-common/src/main/java/org/apache/ratis/util/SizeInBytes.java`
#### Snippet
```java

  public static SizeInBytes valueOf(String input) {
    input = Objects.requireNonNull(input, "input = null").trim();

    final int last = input.length() - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
  public static String[] getTrimmedStrings(String s) {
    return s == null? EMPTY_STRING_ARRAY
        : (s = s.trim()).isEmpty()? EMPTY_STRING_ARRAY
        : s.split("\\s*,\\s*");
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `curRetry`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
    int i = 0;
    for(; i < pairs.size() && curRetry > pairs.get(i).numRetries; i++) {
      curRetry -= pairs.get(i).numRetries;
    }
    return i == pairs.size()? null: pairs.get(i);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/TransferLeadership.java`
#### Snippet
```java
      } else {
        if (result.getType() == Result.Type.SUCCESS) {
          result = Result.DIFFERENT_LEADER;
        }
        final TransferLeadershipException tle = new TransferLeadershipException(server.getMemberId()
```

### AssignmentToMethodParameter
Assignment to method parameter `left`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
      return false;
    }
    left = new ArrayList<>(left);
    left.sort(comparator);
    right = new ArrayList<>(right);
```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
    left = new ArrayList<>(left);
    left.sort(comparator);
    right = new ArrayList<>(right);
    right.sort(comparator);
    return left.equals(right);
```

### AssignmentToMethodParameter
Assignment to method parameter `logData`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/LogProtoUtils.java`
#### Snippet
```java
      RaftClientRequest request, ByteString logData, ByteString stateMachineData) {
    if (logData == null) {
      logData = request.getMessage().getContent();
    }
    final StateMachineLogEntryProto.Type type = toStateMachineLogEntryProtoType(request.getType().getTypeCase());
```

### AssignmentToMethodParameter
Assignment to method parameter `suggestedIndex`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/RaftLogBase.java`
#### Snippet
```java
    if (purgePreservation > 0) {
      final long currentIndex = getNextIndex() - 1;
      suggestedIndex = Math.min(suggestedIndex, currentIndex - purgePreservation);
    }
    final long lastPurge = purgeIndex.get();
```

### AssignmentToMethodParameter
Assignment to method parameter `operation`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/RaftLogBase.java`
#### Snippet
```java
      // the SM wants to attach a logic depending on ordered execution in the log commit order.
      try {
        operation = operation.preAppendTransaction();
      } catch (StateMachineException e) {
        throw e;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/expression/DoubleValue.java`
#### Snippet
```java
  public int toBytes(byte[] buf, int offset) {
    Preconditions.assertTrue(offset + length() <= buf.length);
    buf[offset++] = Type.DOUBLE.byteValue();
    Utils.double2bytes(value, buf, offset);
    return length();
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java

  private RaftClientReply exception2RaftClientReply(RaftClientRequest request, Throwable e) {
    e = JavaUtils.unwrapCompletionException(e);
    if (e instanceof NotReplicatedException) {
      final NotReplicatedException nre = (NotReplicatedException)e;
```

### AssignmentToMethodParameter
Assignment to method parameter `request`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
            return f.thenApply(r -> null);
          }
          request = f.join();
          type = request.getType();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java

  private RaftClientReply readException2Reply(RaftClientRequest request, Throwable e) {
    e = JavaUtils.unwrapCompletionException(e);
    if (e instanceof StateMachineException ) {
      return newExceptionReply(request, (StateMachineException) e);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
    final Metadata trailers = se.getTrailers();
    if (trailers == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcServerProtocolService.java`
#### Snippet
```java
          handleError(e, request);
          current.getFuture().completeExceptionally(e);
          return null;
        }).thenCombine(previousFuture, (reply, v) -> {
          handleReply(reply);
```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcServerProtocolService.java`
#### Snippet
```java
          handleReply(reply);
          current.getFuture().complete(null);
          return null;
        });
      } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcLogAppender.java`
#### Snippet
```java
    final long followerNextIndex = follower.getNextIndex();
    if (followerNextIndex >= leaderNextIndex) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcLogAppender.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcConfigKeys.java`
#### Snippet
```java
    Class<GrpcTlsConfig> TLS_CONF_CLASS = TLS.CONF_CLASS;
    static GrpcTlsConfig tlsConf(Parameters parameters) {
      return parameters != null ? parameters.get(TLS_CONF_PARAMETER, TLS_CONF_CLASS): null;
    }
    static void setTlsConf(Parameters parameters, GrpcTlsConfig conf) {
```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcConfigKeys.java`
#### Snippet
```java
    Class<GrpcTlsConfig> TLS_CONF_CLASS = TLS.CONF_CLASS;
    static GrpcTlsConfig tlsConf(Parameters parameters) {
      return parameters != null ? parameters.get(TLS_CONF_PARAMETER, TLS_CONF_CLASS): null;
    }
    static void setTlsConf(Parameters parameters, GrpcTlsConfig conf) {
```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcConfigKeys.java`
#### Snippet
```java
    Class<GrpcTlsConfig> CONF_CLASS = GrpcTlsConfig.class;
    static GrpcTlsConfig conf(Parameters parameters) {
      return parameters != null ? parameters.get(CONF_PARAMETER, CONF_CLASS): null;
    }
    static void setConf(Parameters parameters, GrpcTlsConfig conf) {
```

### ReturnNull
Return of `null`
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcConfigKeys.java`
#### Snippet
```java
    Class<GrpcTlsConfig> TLS_CONF_CLASS = TLS.CONF_CLASS;
    static GrpcTlsConfig tlsConf(Parameters parameters) {
      return parameters != null ? parameters.get(TLS_CONF_PARAMETER, TLS_CONF_CLASS): null;
    }
    static void setTlsConf(Parameters parameters, GrpcTlsConfig conf) {
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyUtils.java`
#### Snippet
```java
  static SslContext buildSslContext(String name, TlsConf tlsConf, Function<TlsConf, SslContextBuilder> builder) {
    if (tlsConf == null) {
      return null;
    }
    final SslContext sslContext;
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
  static <HEADER extends DataStreamPacketHeader> HEADER checkHeader(HEADER header, ByteBuf buf) {
    if (header == null) {
      return null;
    }
    if (buf.readableBytes() < header.getDataLength()) {
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
    if (buf.readableBytes() < header.getDataLength()) {
      buf.resetReaderIndex();
      return null;
    }
    return header;
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
  static DataStreamReplyHeader decodeDataStreamReplyHeader(ByteBuf buf) {
    if (DataStreamPacketHeader.getSizeOfHeaderLen() > buf.readableBytes()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
    if (headerBufLen > buf.readableBytes()) {
      buf.resetReaderIndex();
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
      } else {
        buf.resetReaderIndex();
        return null;
      }
    } catch (InvalidProtocolBufferException e) {
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
      LOG.error("Fail to decode reply header:", e);
      buf.resetReaderIndex();
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
  static DataStreamRequestHeader decodeDataStreamRequestHeader(ByteBuf buf) {
    if (DataStreamPacketHeader.getSizeOfHeaderBodyLen() > buf.readableBytes()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
    if (headerBodyBufLen > buf.readableBytes()) {
      buf.resetReaderIndex();
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
    if (headerBufLen > buf.readableBytes()) {
      buf.resetReaderIndex();
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
      } else {
        buf.resetReaderIndex();
        return null;
      }
    } catch (InvalidProtocolBufferException e) {
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/NettyDataStreamUtils.java`
#### Snippet
```java
      LOG.error("Fail to decode request header:", e);
      buf.resetReaderIndex();
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/client/NettyClientStreamRpc.java`
#### Snippet
```java
      final ChannelFuture future = ref.get();
      if (future == null) {
        return null; //closed
      }
      final Channel channel = future.syncUninterruptibly().channel();
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/client/NettyClientStreamRpc.java`
#### Snippet
```java
      }
      ChannelFuture f = reconnect();
      return f == null ? null : f.syncUninterruptibly().channel();
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/client/NettyClientStreamRpc.java`
#### Snippet
```java
    /** @return an empty ID if the queue is empty; otherwise, the queue is non-empty, return null. */
    synchronized Integer getEmptyId() {
      return queue.isEmpty()? emptyId: null;
    }

```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/client/NettyClientStreamRpc.java`
#### Snippet
```java

      final MemoizedSupplier<ChannelFuture> supplier = MemoizedSupplier.valueOf(this::connect);
      final ChannelFuture previous = ref.getAndUpdate(prev -> prev == null? null: supplier.get());
      if (previous != null) {
        previous.channel().close();
```

### ReturnNull
Return of `null`
in `ratis-netty/src/main/java/org/apache/ratis/netty/client/NettyClientStreamRpc.java`
#### Snippet
```java
        previous.channel().close();
      }
      return supplier.isInitialized() ? supplier.get() : null;
    }

```

### ReturnNull
Return of `null`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
  protected RaftPeerProto getLeader(RoleInfoProto roleInfo) {
    if (roleInfo == null) {
      return null;
    }
    if (roleInfo.getRole() == RaftPeerRole.LEADER) {
```

### ReturnNull
Return of `null`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
    FollowerInfoProto followerInfo = roleInfo.getFollowerInfo();
    if (followerInfo == null) {
      return null;
    }
    return followerInfo.getLeaderInfo().getId();
```

### ReturnNull
Return of `null`
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/AbstractRatisCommand.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedAsync.java`
#### Snippet
```java
      }
      failAllAsyncRequests(request, e);
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftOutputStream.java`
#### Snippet
```java
        Message.valueOf(ProtoUtils.toByteString(buffer, 0, byteCount))
    ).thenApply(reply -> RaftClientImpl.handleRaftException(reply, CompletionException::new)
    ).thenApply(reply -> reply != null && reply.isSuccess()? pos: null);
    flushFutures.offer(f);

```

### ReturnNull
Return of `null`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/ClientProtoUtils.java`
#### Snippet
```java
  static RoutingTable getRoutingTable(RaftRpcRequestProto p) {
    if (!p.hasRoutingTable()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java
        : nle.getSuggestedLeader().getId();
    handleIOException(request, nle, newLeader, handler);
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java
  RaftClientReply handleLeaderException(RaftClientRequest request, RaftClientReply reply) {
    if (reply == null || reply.getException() instanceof LeaderNotReadyException) {
      return null;
    }
    final NotLeaderException nle = reply.getNotLeaderException();
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/JmxRegister.java`
#### Snippet
```java

    // failed
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/JmxRegister.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.error("Failed to register JMX Bean with name " + name, e);
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
        return theClass.asSubclass(xface);
      } else {
        return null;
      }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
      return hexString;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java

    if (null == value) {
      return null;
    } else {
      return value.trim();
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
  private String substituteVars(String expr) {
    if (expr == null) {
      return null;
    }
    String eval = expr;
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/ReflectionUtils.java`
#### Snippet
```java
        // Leave a marker that the class isn't found
        map.put(name, new WeakReference<>(Classes.NEGATIVE_CACHE_SENTINEL));
        return null;
      }
      // two putters can race here, but they'll put the same class
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/ReflectionUtils.java`
#### Snippet
```java
      return clazz;
    } else if (clazz == Classes.NEGATIVE_CACHE_SENTINEL) {
      return null; // not found
    } else {
      // cache hit
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/NetUtils.java`
#### Snippet
```java
  static String address2String(InetSocketAddress address) {
    if (address == null) {
      return null;
    }
    final StringBuilder b = new StringBuilder(address.getHostName());
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
      if (request == null) {
        LOG.debug("{}: {}, seq={} not found in {}", getName(), op, seqNum, this);
        return null;
      }
      if (request.hasReply()) {
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/SlidingWindow.java`
#### Snippet
```java
      if (request.hasReply()) {
        LOG.debug("{}: {}, seq={} already has replied in {}", getName(), op, seqNum, this);
        return null;
      }
      return request;
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/DataBlockingQueue.java`
#### Snippet
```java
        }
        if (nanos <= 0) {
          return null;
        }
        nanos = notEmpty.awaitNanos(nanos);
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/MD5FileUtil.java`
#### Snippet
```java
    final File md5File = getDigestFileForFile(dataFile);
    if (!md5File.exists()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/function/FunctionUtils.java`
#### Snippet
```java
    return input -> {
      consumer.accept(input);
      return null;
    };
  }
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/function/CheckedRunnable.java`
#### Snippet
```java
    return () -> {
      runnable.run();
      return null;
    };
  }
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/RetryPolicy.java`
#### Snippet
```java

    default Throwable getCause() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
   */
  public static String weakIntern(String sample) {
    return sample == null? null: WEAK_INTERNER.intern(sample);
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/StringUtils.java`
#### Snippet
```java
  public static <K, V> String map2String(Map<K, V> map) {
    if (map == null) {
      return null;
    } else if (map.isEmpty()) {
      return "<EMPTY_MAP>";
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
    if (elements.length == 0) {
      LOG.warn("Illegal value: there is no element in \"{}\".", input);
      return null;
    }
    if (elements.length % 2 != 0) {
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
      LOG.warn("Illegal value: the number of elements in \"{}\" is {} but an even number of elements is expected.",
          input, elements.length);
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
      final TimeDuration sleep = parseElement(elements, i++, input, MultipleLinearRandomRetry::parsePositiveTime);
      if (sleep == null) {
        return null; //parse fails
      }
      //parse the i-th number-of-retries
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
      final Integer retries = parseElement(elements, i++, input, MultipleLinearRandomRetry::parsePositiveInt);
      if (retries == null) {
        return null; //parse fails
      }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
    } catch(Exception t) {
      LOG.warn("Failed to parse \"{}\", which is the index {} element in \"{}\"", s, i, input, t);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/retry/MultipleLinearRandomRetry.java`
#### Snippet
```java
      curRetry -= pairs.get(i).numRetries;
    }
    return i == pairs.size()? null: pairs.get(i);
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
   */
  static <T> T cast(Object obj, Class<T> clazz) {
    return clazz.isInstance(obj)? clazz.cast(obj): null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/JavaUtils.java`
#### Snippet
```java
    return doPrivileged(action, e -> {
      LOG.warn("Failed to " + name.get(), e);
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/protocol/SnapshotManagementRequest.java`
#### Snippet
```java

  public SnapshotManagementRequest.Create getCreate() {
    return op instanceof Create ? (Create)op: null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/protocol/LeaderElectionManagementRequest.java`
#### Snippet
```java

  public Resume getResume() {
    return op instanceof Resume ? (Resume) op : null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/protocol/LeaderElectionManagementRequest.java`
#### Snippet
```java

  public Pause getPause() {
    return op instanceof Pause ? (Pause) op: null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/protocol/RaftPeerId.java`
#### Snippet
```java

  public static RaftPeerId getRaftPeerId(String id) {
    return id == null || id.isEmpty() ? null : RaftPeerId.valueOf(id);
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/protocol/GroupManagementRequest.java`
#### Snippet
```java

  public Add getAdd() {
    return op instanceof Add? (Add)op: null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/protocol/GroupManagementRequest.java`
#### Snippet
```java

  public Remove getRemove() {
    return op instanceof Remove? (Remove)op: null;
  }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/LifeCycle.java`
#### Snippet
```java
      final State applied = operator.apply(previous);
      if (previous == applied) {
        return null; // no change required
      }
      State.validate(name, previous, applied);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/DisabledDataStreamServerFactory.java`
#### Snippet
```java
      @Override
      public InetSocketAddress getInetSocketAddress() {
        return null;
      }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/security/TlsConf.java`
#### Snippet
```java
        return new KeyManagerConf(keyManager);
      } else if (privateKey == null && keyCertificates == null) {
        return null;
      } else if (privateKey != null && keyCertificates != null) {
        return new KeyManagerConf(privateKey, keyCertificates);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/VoteContext.java`
#### Snippet
```java
    final RaftPeer candidate = checkConf();
    if (candidate == null) {
      return null;
    }
    final CheckTermResult r = checkTerm(candidateTerm);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/VoteContext.java`
#### Snippet
```java
    final CheckTermResult r = checkTerm(candidateTerm);
    if (r == CheckTermResult.FAILED) {
      return null;
    }
    if (r == CheckTermResult.CHECK_LEADER && !checkLeader()) {
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/VoteContext.java`
#### Snippet
```java
    }
    if (r == CheckTermResult.CHECK_LEADER && !checkLeader()) {
      return null;
    }
    return candidate;
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/VoteContext.java`
#### Snippet
```java
    if (!conf.containsInConf(candidateId)) {
      reject(candidateId + " is not in current conf " + conf.getCurrentPeers());
      return null;
    }
    return conf.getPeer(candidateId);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PeerConfiguration.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PeerConfiguration.java`
#### Snippet
```java
  RaftPeerRole contains(RaftPeerId id, EnumSet<RaftPeerRole> roles) {
    if (roles == null || roles.isEmpty()) {
      return peers.containsKey(id)? RaftPeerRole.FOLLOWER: null;
    }
    for(RaftPeerRole r : roles) {
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PeerConfiguration.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/ReadIndexHeartbeats.java`
#### Snippet
```java
                                                              Function<Long, AppendEntriesListener> constructor) {
    if (commitIndex <= ackedCommitIndex.get()) {
      return null;
    }
    return appendEntriesListeners.add(commitIndex, constructor);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
        raftServerMetrics.onRequestQueueLimitHit();
        raftServerMetrics.onResourceLimitHit();
        return null;
      } else if (acquired == Acquired.FAILED_IN_BYTE_SIZE_LIMIT) {
        raftServerMetrics.onRequestByteSizeLimitHit();
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
        raftServerMetrics.onRequestByteSizeLimitHit();
        raftServerMetrics.onResourceLimitHit();
        return null;
      }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
    // it is possible that the pendingRequest is null if this peer just becomes
    // the new leader and commits transactions received by the previous leader
    return pendingRequest != null ? pendingRequest.getEntry() : null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
      final Permit removed = permits.remove(permit);
      if (removed == null) {
        return null;
      }
      Preconditions.assertTrue(removed == permit);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
    private synchronized Permit putPermit() {
      if (resource.isClosed()) {
        return null;
      }
      final Permit permit = new Permit();
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PendingRequests.java`
#### Snippet
```java
      LOG.debug("{}: PendingRequests.remove {} returns {}", name, index, r);
      if (r == null) {
        return null;
      }
      final int messageSize = Message.getSize(r.getRequest().getMessage());
```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
  static <T> T random(Collection<T> elements) {
    if (elements == null || elements.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-common/src/main/java/org/apache/ratis/util/CollectionUtils.java`
#### Snippet
```java
        .collect(Collectors.toList());
    final int size = list.size();
    return size == 0? null: list.get(ThreadLocalRandom.current().nextInt(size));
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/util/ServerStringUtils.java`
#### Snippet
```java
  public static String toAppendEntriesReplyString(AppendEntriesReplyProto reply) {
    if (reply == null) {
      return null;
    }
    return ProtoUtils.toString(reply.getServerReply())
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/util/ServerStringUtils.java`
#### Snippet
```java
  public static String toAppendEntriesRequestString(AppendEntriesRequestProto request) {
    if (request == null) {
      return null;
    }
    return ProtoUtils.toString(request.getServerRequest())
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/util/ServerStringUtils.java`
#### Snippet
```java
  public static String toInstallSnapshotRequestString(InstallSnapshotRequestProto request) {
    if (request == null) {
      return null;
    }
    final String s;
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/util/ServerStringUtils.java`
#### Snippet
```java
  public static String toRequestVoteReplyString(RequestVoteReplyProto proto) {
    if (proto == null) {
      return null;
    }
    return ProtoUtils.toString(proto.getServerReply()) + "-t" + proto.getTerm();
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/util/ServerStringUtils.java`
#### Snippet
```java
  public static String toInstallSnapshotReplyString(InstallSnapshotReplyProto reply) {
    if (reply == null) {
      return null;
    }
    final String s;
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderBase.java`
#### Snippet
```java
    }
    if (buffer.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderBase.java`
#### Snippet
```java
  private TermIndex getPrevious(long nextIndex) {
    if (nextIndex == RaftLog.LEAST_VALID_LOG_INDEX) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderBase.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderDefault.java`
#### Snippet
```java
        if (request == null) {
          LOG.trace("{} no entries to send now, wait ...", this);
          return null;
        } else if (!isRunning()) {
          LOG.info("{} is stopped. Skip appendEntries.", this);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderDefault.java`
#### Snippet
```java
        } else if (!isRunning()) {
          LOG.info("{} is stopped. Skip appendEntries.", this);
          return null;
        }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderDefault.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderDefault.java`
#### Snippet
```java
      LOG.warn("{}: Failed to installSnapshot {}: {}", this, snapshot, ioe);
      handleException(ioe);
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftConfigurationImpl.java`
#### Snippet
```java
  public RaftPeer getPeer(RaftPeerId id, RaftPeerRole... roles) {
    if (id == null) {
      return null;
    }
    final RaftPeer peer = conf.getPeer(id, roles);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftConfigurationImpl.java`
#### Snippet
```java
      return oldConf.getPeer(id, roles);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
  @Override
  public GroupInfoReply getGroupInfo(GroupInfoRequest request) throws IOException {
    return RaftServerImpl.waitForReply(getId(), request, getGroupInfoAsync(request), r -> null);
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java
      if (!map.containsKey(groupId)) {
        LOG.warn("{}: does not contain group: {}", getId(), groupId);
        return null;
      }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/memory/MemoryRaftLog.java`
#### Snippet
```java
    try(AutoCloseableLock readLock = readLock()) {
      if (startIndex >= entries.size()) {
        return null;
      }
      final int from = Math.toIntExact(startIndex);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/memory/MemoryRaftLog.java`
#### Snippet
```java

    LogEntryProto get(int i) {
      return i >= 0 && i < entries.size() ? entries.get(i) : null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/LogProtoUtils.java`
#### Snippet
```java
  public static String toLogEntryString(LogEntryProto entry, Function<StateMachineLogEntryProto, String> function) {
    if (entry == null) {
      return null;
    }
    final String s;
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/LogProtoUtils.java`
#### Snippet
```java

  public static String toLogEntriesShortString(List<LogEntryProto> entries) {
    return entries == null ? null
        : entries.size() == 0 ? "<empty>"
        : "size=" + entries.size() + ", first=" + LogProtoUtils.toLogEntryString(entries.get(0));
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/LogProtoUtils.java`
#### Snippet
```java

  public static String toLogEntriesString(List<LogEntryProto> entries) {
    return entries == null ? null
        : entries.stream().map(LogProtoUtils::toLogEntryString).collect(Collectors.toList()).toString();
  }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/metrics/RaftServerMetricsImpl.java`
#### Snippet
```java
      return writeTimer;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java
    } catch (EOFException eof) {
      // EOF at an opcode boundary is expected.
      return null;
    }
    // Each log entry starts with a var-int. Thus a valid entry's first byte
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java
    if (SegmentedRaftLogFormat.isTerminator(nextByte)) {
      verifyTerminator();
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java
        LOG.trace("Ignoring the last partial written log entry in " + file , eof);
      }
      return null;
    } catch (IOException e) {
      in.reset();
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegmentPath.java`
#### Snippet
```java
      return newInstance(path, matcher.group(1), matcher.group(2));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegmentPath.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogInputStream.java`
#### Snippet
```java
        return entry;
    } else if (state.isClosed()) {
      return null;
    }
    throw new IOException("Failed to get next entry from " + this, state.getThrowable());
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
                  + segmentIndex + ", segments=" + segments);
        }
        return list.isEmpty() ? null : new TruncationSegments(null, list);
      }
    }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
    LogSegment getLast() {
      try(AutoCloseableLock readLock = readLock()) {
        return segments.isEmpty()? null: segments.get(segments.size() - 1);
      }
    }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
      return (openSegment != null && openSegment.numOfEntries() > 0) ?
          openSegment.getLastTermIndex() :
          (closedSegments.isEmpty() ? null :
              closedSegments.get(closedSegments.size() - 1).getLastTermIndex());
    }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
          return new TruncationSegments(t, list);
        }
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
  LogRecord getLogRecord(long index) {
    LogSegment segment = getSegment(index);
    return segment == null ? null : segment.getLogRecord(index);
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogCache.java`
#### Snippet
```java
      try(AutoCloseableLock readLock = readLock()) {
        final int i = Collections.binarySearch(segments, index);
        return i < 0? null: segments.get(i);
      }
    }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
      // The segment does not have any entries, delete the file.
      FileUtils.deleteFile(file);
      return null;
    } else if (file.length() > segment.getTotalFileSize()) {
      // The segment has extra padding, truncate it.
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
  TermIndex getLastTermIndex() {
    LogRecord last = getLastRecord();
    return last == null ? null : last.getTermIndex();
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java

  private LogRecord getLastRecord() {
    return records.isEmpty() ? null : records.get(records.size() - 1);
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
      return records.get(Math.toIntExact(index - startIndex));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/RaftStorageImpl.java`
#### Snippet
```java
      return LogProtoUtils.toRaftConfiguration(confProto);
    } catch (FileNotFoundException e) {
      return null;
    } catch (Exception e) {
      LOG.error("Failed reading configuration from file:" + confFile, e);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/RaftStorageImpl.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.error("Failed reading configuration from file:" + confFile, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/SimpleStateMachineStorage.java`
#### Snippet
```java
    final File dir = stateMachineDir;
    if (dir == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/BaseStateMachine.java`
#### Snippet
```java
      @Override
      public SnapshotInfo getLatestSnapshot() {
        return null;
      }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/BaseStateMachine.java`
#### Snippet
```java

  public RaftPeerId getId() {
    return server.isDone()? server.join().getId(): null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/SimpleStateMachineStorage.java`
#### Snippet
```java
      return updateLatestSnapshot(findLatestSnapshot(dir.toPath()));
    } catch (IOException ignored) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/SimpleStateMachineStorage.java`
#### Snippet
```java
    final Iterator<SingleFileSnapshotInfo> i = getSingleFileSnapshotInfos(dir).iterator();
    if (!i.hasNext()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLog.java`
#### Snippet
```java
      segment = cache.getSegment(index);
      if (segment == null) {
        return null;
      }
      record = segment.getLogRecord(index);
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLog.java`
#### Snippet
```java
      record = segment.getLogRecord(index);
      if (record == null) {
        return null;
      }
      final LogEntryProto entry = segment.getEntryFromCache(record.getTermIndex());
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLog.java`
#### Snippet
```java

    default long[] getFollowerNextIndices() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLog.java`
#### Snippet
```java
    try(AutoCloseableLock readLock = readLock()) {
      LogRecord record = cache.getLogRecord(index);
      return record != null ? record.getTermIndex() : null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/Runner.java`
#### Snippet
```java
      return Arithmetic.getSubCommands();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreStateMachine.java`
#### Snippet
```java
    }
    if (proto.getRequestCase() != FileStoreRequestProto.RequestCase.WRITEHEADER) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreStateMachine.java`
#### Snippet
```java
        smLog.getStateMachineEntry().getStateMachineData());
    // sync only if closing the file
    return h.getClose()? f: null;
  }

```

### ReturnNull
Return of `null`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreStateMachine.java`
#### Snippet
```java
    }
    if (proto.getRequestCase() != FileStoreRequestProto.RequestCase.WRITEHEADER) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/expression/NullValue.java`
#### Snippet
```java
  @Override
  public Double evaluate(Map<String, Double> variableMap) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
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
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
        if (isStopped.get()) {
          LOG.info(s + " gracefully");
          return null;
        } else {
          throw new IllegalStateException(s + " UNEXPECTEDLY", ie);
```

### ReturnNull
Return of `null`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLogSequentialOps.java`
#### Snippet
```java
        } finally {
          // prev is expected to be current
          final Thread got = runner.getAndUpdate(prev -> prev != current? prev: null);
          Preconditions.assertTrue(got == current,
              () -> name + ": Unexpected runner " + got + " != " + current);
```

### ReturnNull
Return of `null`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachineStorage.java`
#### Snippet
```java
  /** @return the state machine directory. */
  default File getSnapshotDir() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachineStorage.java`
#### Snippet
```java
  /** @return the temporary directory. */
  default File getTmpDir() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RefCountingMap.java`
#### Snippet
```java

    V increment() {
      return refCount.incrementAndGet() > 0? value: null;
    }

```

### ReturnNull
Return of `null`
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RefCountingMap.java`
#### Snippet
```java

    Payload<V> decrement() {
      return refCount.decrementAndGet() > 0? this: null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RefCountingMap.java`
#### Snippet
```java

  static <V> V get(Payload<V> p) {
    return p == null ? null : p.get();
  }

```

### ReturnNull
Return of `null`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
     */
    default Executor getExecutor() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/RefCountingMap.java`
#### Snippet
```java

    V increment() {
      return refCount.incrementAndGet() > 0? value: null;
    }

```

### ReturnNull
Return of `null`
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/RefCountingMap.java`
#### Snippet
```java

  static <V> V get(Payload<V> p) {
    return p == null ? null : p.get();
  }

```

### ReturnNull
Return of `null`
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/RefCountingMap.java`
#### Snippet
```java

    Payload<V> decrement() {
      return refCount.decrementAndGet() > 0? this: null;
    }
  }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
          final CompletableFuture<RaftClientRequest> f = streamEndOfRequestAsync(request);
          if (f.isCompletedExceptionally()) {
            return f.thenApply(r -> null);
          }
          request = f.join();
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
        return leaderId.toString();
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    final long replyNextIndex = checkInconsistentAppendEntries(previous, entries);
    if (replyNextIndex == -1) {
      return null;
    }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `reply`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/UnorderedAsync.java`
#### Snippet
```java
        LOG.debug("{}: attempt #{} receive~ {}", clientId, attemptCount, reply);
        final RaftException replyException = reply != null? reply.getException(): null;
        reply = client.handleLeaderException(request, reply);
        if (reply != null) {
          client.handleReply(request, reply);
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/UnorderedAsync.java`
#### Snippet
```java
            LOG.debug("{}: attempt #{} failed {} with {}", clientId, attemptCount, request, e);
          }
          e = JavaUtils.unwrapCompletionException(e);

          if (e instanceof IOException) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedAsync.java`
#### Snippet
```java
    }).exceptionally(e -> {
      if (e instanceof CompletionException) {
        e = JavaUtils.unwrapCompletionException(e);
        scheduleWithTimeout(pending, request, retryPolicy, e);
        return null;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedAsync.java`
#### Snippet
```java
        LOG.debug("{}: Failed* {} with {}", client.getId(), request, e);
      }
      e = JavaUtils.unwrapCompletionException(e);
      if (e instanceof IOException && !(e instanceof GroupMismatchException)) {
        pending.incrementExceptionCount(e);
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerImpl.java`
#### Snippet
```java
    return queryFuture.thenApply(r -> newReplyBuilder(request).setSuccess().setMessage(r).build())
        .exceptionally(e -> {
          e = JavaUtils.unwrapCompletionException(e);
          if (e instanceof StateMachineException) {
            return newExceptionReply(request, (StateMachineException)e);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `r` is redundant
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcServerProtocolClient.java`
#### Snippet
```java

  public StartLeaderElectionReplyProto startLeaderElection(StartLeaderElectionRequestProto request) {
    StartLeaderElectionReplyProto r =
        blockingStub.withDeadlineAfter(requestTimeoutDuration.getDuration(), requestTimeoutDuration.getUnit())
            .startLeaderElection(request);
```

### UnnecessaryLocalVariable
Local variable `r` is redundant
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcServerProtocolClient.java`
#### Snippet
```java
  public RequestVoteReplyProto requestVote(RequestVoteRequestProto request) {
    // the StatusRuntimeException will be handled by the caller
    RequestVoteReplyProto r =
        blockingStub.withDeadlineAfter(requestTimeoutDuration.getDuration(), requestTimeoutDuration.getUnit())
            .requestVote(request);
```

### UnnecessaryLocalVariable
Local variable `throwable` is redundant
in `ratis-common/src/main/java/org/apache/ratis/util/LogUtils.java`
#### Snippet
```java
        log.warn("Failed to " + name.get() + ": " + e);
      }
      final THROWABLE throwable = JavaUtils.cast(e);
      throw throwable;
    }
```

