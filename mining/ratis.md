# ratis 
 
# Bad smells
I found 220 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 42 | false |
| FieldMayBeFinal | 18 | false |
| ForLoopReplaceableByWhile | 17 | false |
| CatchMayIgnoreException | 14 | false |
| DuplicatedCode | 12 | false |
| FieldCanBeLocal | 10 | false |
| IOStreamConstructor | 9 | false |
| NullableProblems | 9 | false |
| AutoCloseableResource | 9 | false |
| TrivialStringConcatenation | 8 | false |
| UNUSED_IMPORT | 8 | false |
| PlaceholderCountMatchesArgumentCount | 7 | false |
| UNCHECKED_WARNING | 6 | false |
| PointlessArithmeticExpression | 4 | false |
| DataFlowIssue | 4 | false |
| JavadocDeclaration | 4 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnusedAssignment | 3 | false |
| UnnecessaryModifier | 2 | true |
| SimplifyStreamApiCallChains | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| IgnoreResultOfCall | 2 | false |
| DefaultAnnotationParam | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| ConstantValue | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| MismatchedJavadocCode | 1 | false |
| Deprecation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| UnnecessaryInitCause | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ClassInitializerMayBeStatic | 1 | false |
| RedundantCast | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.EnumMap'
in `ratis-client/src/main/java/org/apache/ratis/client/retry/RequestTypeDependentRetryPolicy.java`
#### Snippet
```java
  public static class Builder {
    private final EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, RetryPolicy>
        retryPolicyMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
    private EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, TimeDuration>
        timeoutMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `ratis-client/src/main/java/org/apache/ratis/client/retry/RequestTypeDependentRetryPolicy.java`
#### Snippet
```java
  public static class Builder {
    private final EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, RetryPolicy>
        retryPolicyMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
    private EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, TimeDuration>
        timeoutMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.EnumMap'
in `ratis-client/src/main/java/org/apache/ratis/client/retry/RequestTypeDependentRetryPolicy.java`
#### Snippet
```java
        retryPolicyMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
    private EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, TimeDuration>
        timeoutMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);

    /** Set the given policy for the given type. */
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `ratis-client/src/main/java/org/apache/ratis/client/retry/RequestTypeDependentRetryPolicy.java`
#### Snippet
```java
        retryPolicyMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
    private EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, TimeDuration>
        timeoutMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);

    /** Set the given policy for the given type. */
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.Map'
in `ratis-server/src/main/java/org/apache/ratis/server/impl/WatchRequests.java`
#### Snippet
```java

  private final String name;
  private final Map<ReplicationLevel, WatchQueue> queues = new EnumMap<>(ReplicationLevel.class);

  private final TimeDuration watchTimeoutNanos;
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `ratis-server/src/main/java/org/apache/ratis/server/impl/WatchRequests.java`
#### Snippet
```java

  private final String name;
  private final Map<ReplicationLevel, WatchQueue> queues = new EnumMap<>(ReplicationLevel.class);

  private final TimeDuration watchTimeoutNanos;
```

## RuleId[id=PointlessArithmeticExpression]
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
`1 * 1024 * 1024 * 1024L` can be replaced with '1024 \* 1024 \* 1024L'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
        SizeInBytes.valueOf(raftSegmentPreallocatedSize));
    RaftServerConfigKeys.Log.setSegmentSizeMax(raftProperties,
        SizeInBytes.valueOf(1 * 1024 * 1024 * 1024L));
    RaftConfigKeys.DataStream.setType(raftProperties, SupportedDataStreamType.NETTY);

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.ratis.proto.RaftProtos.RaftClientRequestProto.TypeCase`
in `ratis-common/src/main/java/org/apache/ratis/protocol/RaftClientReply.java`
#### Snippet
```java
  /**
   * This field is the log index of the transaction
   * if (1) the request is {@link org.apache.ratis.proto.RaftProtos.RaftClientRequestProto.TypeCase#WRITE} and (2) the
   * reply is success.
   * Otherwise, this field is not used.
```

### JavadocReference
Cannot resolve symbol `WRITE`
in `ratis-common/src/main/java/org/apache/ratis/protocol/RaftClientReply.java`
#### Snippet
```java
  /**
   * This field is the log index of the transaction
   * if (1) the request is {@link org.apache.ratis.proto.RaftProtos.RaftClientRequestProto.TypeCase#WRITE} and (2) the
   * reply is success.
   * Otherwise, this field is not used.
```

### JavadocReference
Cannot resolve symbol `org.apache.ratis.proto.RaftProtos.RaftPeerRole`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PeerConfiguration.java`
#### Snippet
```java
  /**
   * Listeners are non-voting members.
   * @see org.apache.ratis.proto.RaftProtos.RaftPeerRole#LISTENER
   */
  private final Map<RaftPeerId, RaftPeer> listeners;
```

### JavadocReference
Cannot resolve symbol `LISTENER`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PeerConfiguration.java`
#### Snippet
```java
  /**
   * Listeners are non-voting members.
   * @see org.apache.ratis.proto.RaftProtos.RaftPeerRole#LISTENER
   */
  private final Map<RaftPeerId, RaftPeer> listeners;
```

### JavadocReference
Cannot resolve symbol `org.apache.ratis.proto.RaftProtos.RaftPeerRole`
in `ratis-server/src/main/java/org/apache/ratis/server/impl/PeerConfiguration.java`
#### Snippet
```java
  /**
   * Peers are voting members such as LEADER, CANDIDATE and FOLLOWER
   * @see org.apache.ratis.proto.RaftProtos.RaftPeerRole
   */
  private final Map<RaftPeerId, RaftPeer> peers;
```

### JavadocReference
Cannot resolve symbol `InstallSnapshotRequestProto`
in `ratis-server/src/main/java/org/apache/ratis/server/leader/InstallSnapshotRequests.java`
#### Snippet
```java

/**
 * An {@link Iterable} of {@link InstallSnapshotRequestProto} for sending a snapshot.
 * <p>
 * The snapshot is sent by one or more requests, where
```

### JavadocReference
Cannot resolve symbol `FileChunkProto`
in `ratis-server/src/main/java/org/apache/ratis/server/storage/FileChunkReader.java`
#### Snippet
```java
import java.security.MessageDigest;

/** Read {@link FileChunkProto}s from a file. */
public class FileChunkReader implements Closeable {
  private final FileInfo info;
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/TransactionContextImpl.java`
#### Snippet
```java

  /**
   * Construct a {@link TransactionContext} from a {@link LogEntryProto}.
   * Used by followers for applying committed entries to the state machine.
   * @param logEntry the log entry to be applied
```

### JavadocReference
Cannot resolve symbol `org.apache.ratis.proto.RaftProtos.RaftPeerRole`
in `ratis-server-api/src/main/java/org/apache/ratis/server/RaftConfiguration.java`
#### Snippet
```java
 * The objects of this class are immutable.
 *
 * @see org.apache.ratis.proto.RaftProtos.RaftPeerRole
 */
public interface RaftConfiguration {
```

### JavadocReference
Cannot resolve symbol `AppendEntriesReplyProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LeaderState.java`
#### Snippet
```java
  boolean isFollowerBootstrapping(FollowerInfo follower);

  /** Received an {@link AppendEntriesReplyProto} */
  void onAppendEntriesReply(LogAppender appender, AppendEntriesReplyProto reply);

```

### JavadocReference
Cannot resolve symbol `AppendEntriesRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LeaderState.java`
#### Snippet
```java
  void restart(LogAppender appender);

  /** @return a new {@link AppendEntriesRequestProto} object. */
  AppendEntriesRequestProto newAppendEntriesRequestProto(FollowerInfo follower,
      List<LogEntryProto> entries, TermIndex previous, long callId);
```

### JavadocReference
Cannot resolve symbol `AppendEntriesRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java

  /**
   * Create a {@link AppendEntriesRequestProto} object using the {@link FollowerInfo} of this {@link LogAppender}.
   * The {@link AppendEntriesRequestProto} object may contain zero or more log entries.
   * When there is zero log entries, the {@link AppendEntriesRequestProto} object is a heartbeat.
```

### JavadocReference
Cannot resolve symbol `AppendEntriesRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
  /**
   * Create a {@link AppendEntriesRequestProto} object using the {@link FollowerInfo} of this {@link LogAppender}.
   * The {@link AppendEntriesRequestProto} object may contain zero or more log entries.
   * When there is zero log entries, the {@link AppendEntriesRequestProto} object is a heartbeat.
   *
```

### JavadocReference
Cannot resolve symbol `AppendEntriesRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
   * Create a {@link AppendEntriesRequestProto} object using the {@link FollowerInfo} of this {@link LogAppender}.
   * The {@link AppendEntriesRequestProto} object may contain zero or more log entries.
   * When there is zero log entries, the {@link AppendEntriesRequestProto} object is a heartbeat.
   *
   * @param callId The call id of the returned request.
```

### JavadocReference
Cannot resolve symbol `AppendEntriesRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
   * @param heartbeat the returned request must be a heartbeat.
   *
   * @return a new {@link AppendEntriesRequestProto} object.
   */
  AppendEntriesRequestProto newAppendEntriesRequest(long callId, boolean heartbeat) throws RaftLogIOException;
```

### JavadocReference
Cannot resolve symbol `InstallSnapshotRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
  InstallSnapshotRequestProto newInstallSnapshotNotificationRequest(TermIndex firstAvailableLogTermIndex);

  /** @return an {@link Iterable} of {@link InstallSnapshotRequestProto} for sending the given snapshot. */
  Iterable<InstallSnapshotRequestProto> newInstallSnapshotRequests(String requestId, SnapshotInfo snapshot);

```

### JavadocReference
Cannot resolve symbol `InstallSnapshotRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
  AppendEntriesRequestProto newAppendEntriesRequest(long callId, boolean heartbeat) throws RaftLogIOException;

  /** @return a new {@link InstallSnapshotRequestProto} object. */
  InstallSnapshotRequestProto newInstallSnapshotNotificationRequest(TermIndex firstAvailableLogTermIndex);

```

### JavadocReference
Cannot resolve symbol `AppendEntriesRequestProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/leader/LogAppender.java`
#### Snippet
```java
  }

  /** @return the call id for the next {@link AppendEntriesRequestProto}. */
  long getCallId();

```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
    int getSerializedSize();

    /** @return the {@link LogEntryProto} containing both the log entry and the state machine data. */
    LogEntryProto getEntry(TimeDuration timeout) throws RaftLogIOException, TimeoutException;
  }
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   * Log entry with state machine data.
   *
   * When both {@link LogEntryProto#hasStateMachineLogEntry()} and
   * {@link StateMachineLogEntryProto#hasStateMachineEntry()} are true,
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
```

### JavadocReference
Cannot resolve symbol `hasStateMachineLogEntry()`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   * Log entry with state machine data.
   *
   * When both {@link LogEntryProto#hasStateMachineLogEntry()} and
   * {@link StateMachineLogEntryProto#hasStateMachineEntry()} are true,
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
```

### JavadocReference
Cannot resolve symbol `StateMachineLogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   *
   * When both {@link LogEntryProto#hasStateMachineLogEntry()} and
   * {@link StateMachineLogEntryProto#hasStateMachineEntry()} are true,
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
   * before appending to this log.
```

### JavadocReference
Cannot resolve symbol `hasStateMachineEntry()`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   *
   * When both {@link LogEntryProto#hasStateMachineLogEntry()} and
   * {@link StateMachineLogEntryProto#hasStateMachineEntry()} are true,
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
   * before appending to this log.
```

### JavadocReference
Cannot resolve symbol `StateMachineEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   * When both {@link LogEntryProto#hasStateMachineLogEntry()} and
   * {@link StateMachineLogEntryProto#hasStateMachineEntry()} are true,
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
   * before appending to this log.
   * The {@link StateMachineEntryProto} is stored by the state machine but not in this log.
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   * When both {@link LogEntryProto#hasStateMachineLogEntry()} and
   * {@link StateMachineLogEntryProto#hasStateMachineEntry()} are true,
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
   * before appending to this log.
   * The {@link StateMachineEntryProto} is stored by the state machine but not in this log.
```

### JavadocReference
Cannot resolve symbol `StateMachineEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   * the {@link StateMachineEntryProto} is removed from the original {@link LogEntryProto}
   * before appending to this log.
   * The {@link StateMachineEntryProto} is stored by the state machine but not in this log.
   * When reading the log entry, this class rebuilds the original {@link LogEntryProto}
   * containing both the log entry and the state machine data.
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLog.java`
#### Snippet
```java
   * before appending to this log.
   * The {@link StateMachineEntryProto} is stored by the state machine but not in this log.
   * When reading the log entry, this class rebuilds the original {@link LogEntryProto}
   * containing both the log entry and the state machine data.
   */
```

### JavadocReference
Cannot resolve symbol `LogEntryBodyCase`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/LogEntryHeader.java`
#### Snippet
```java
  }

  /** @return the {@link LogEntryBodyCase}. */
  LogEntryBodyCase getLogEntryBodyCase();

```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/LogEntryHeader.java`
#### Snippet
```java
import java.util.Comparator;

/** The header of a {@link LogEntryProto} including {@link TermIndex} and {@link LogEntryBodyCase}. */
public interface LogEntryHeader extends Comparable<LogEntryHeader> {
  LogEntryHeader[] EMPTY_ARRAY = {};
```

### JavadocReference
Cannot resolve symbol `LogEntryBodyCase`
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/LogEntryHeader.java`
#### Snippet
```java
import java.util.Comparator;

/** The header of a {@link LogEntryProto} including {@link TermIndex} and {@link LogEntryBodyCase}. */
public interface LogEntryHeader extends Comparable<LogEntryHeader> {
  LogEntryHeader[] EMPTY_ARRAY = {};
```

### JavadocReference
Cannot resolve symbol `TermIndexProto`
in `ratis-server-api/src/main/java/org/apache/ratis/server/protocol/TermIndex.java`
#### Snippet
```java
  long getIndex();

  /** @return the {@link TermIndexProto}. */
  default TermIndexProto toProto() {
    return TermIndexProto.newBuilder()
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/TransactionContext.java`
#### Snippet
```java

  /**
   * Initialize {@link LogEntryProto} using the internal {@link StateMachineLogEntryProto}.
   * @param term The current term.
   * @param index The index of the log entry.
```

### JavadocReference
Cannot resolve symbol `StateMachineLogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/TransactionContext.java`
#### Snippet
```java

  /**
   * Initialize {@link LogEntryProto} using the internal {@link StateMachineLogEntryProto}.
   * @param term The current term.
   * @param index The index of the log entry.
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/TransactionContext.java`
#### Snippet
```java
   * @param term The current term.
   * @param index The index of the log entry.
   * @return the result {@link LogEntryProto}
   */
  LogEntryProto initLogEntry(long term, long index);
```

### JavadocReference
Cannot resolve symbol `RaftConfigurationProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
    /**
     * Notify the {@link StateMachine} a configuration change.
     * This method will be invoked when a {@link RaftConfigurationProto} is processed.
     *
     * @param term term of the current log entry
```

### JavadocReference
Cannot resolve symbol `LogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
     *
     * When there is an error, this method is invoked to clean up the associated resources.
     * If this stream is not yet linked (see {@link DataApi#link(DataStream, LogEntryProto)}),
     * the state machine may choose to remove the data or to keep the data internally for future recovery.
     * If this stream is already linked, the data must not be removed.
```

### JavadocReference
Cannot resolve symbol `MetadataProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
    /**
     * Notify the {@link StateMachine} a term-index update event.
     * This method will be invoked when a {@link MetadataProto}
     * or {@link RaftConfigurationProto} is processed.
     * For {@link StateMachineLogEntryProto}, this method will not be invoked.
```

### JavadocReference
Cannot resolve symbol `RaftConfigurationProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
     * Notify the {@link StateMachine} a term-index update event.
     * This method will be invoked when a {@link MetadataProto}
     * or {@link RaftConfigurationProto} is processed.
     * For {@link StateMachineLogEntryProto}, this method will not be invoked.
     *
```

### JavadocReference
Cannot resolve symbol `StateMachineLogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
     * This method will be invoked when a {@link MetadataProto}
     * or {@link RaftConfigurationProto} is processed.
     * For {@link StateMachineLogEntryProto}, this method will not be invoked.
     *
     * @param term The term of the log entry
```

### JavadocReference
Cannot resolve symbol `InstallSnapshotResult`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
     * completely done. Could trigger the cleanup of snapshots.
     *
     * @param result {@link InstallSnapshotResult}
     * @param snapshotIndex the index of installed snapshot
     * @param peer the peer who installed the snapshot
```

### JavadocReference
Cannot resolve symbol `StateMachineLogEntryProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
   * This method can be invoked in parallel when there are multiple requests.
   * The implementation should validate the request,
   * prepare a {@link StateMachineLogEntryProto},
   * and then build a {@link TransactionContext}.
   * The implementation should also be light-weighted.
```

### JavadocReference
Cannot resolve symbol `RoleInfoProto`
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
    default void notifyFollowerSlowness(RoleInfoProto leaderInfo, RaftPeer slowFollower) {}

    /** @deprecated Use {@link #notifyFollowerSlowness(RoleInfoProto, RaftPeer)}. */
    @Deprecated
    default void notifyFollowerSlowness(RoleInfoProto leaderInfo) {}
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/server/GrpcLogAppender.java`
#### Snippet
```java
      grpcServerMetrics.onInstallSnapshot();
    } catch (Exception e) {
      LOG.warn("{}: failed to install snapshot {}: {}", this, snapshot.getFiles(), e);
      if (snapshotRequestObserver != null) {
        snapshotRequestObserver.onError(e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `ratis-client/src/main/java/org/apache/ratis/client/impl/UnorderedAsync.java`
#### Snippet
```java
            LOG.trace(clientId + ": attempt #" + attemptCount + " failed~ " + request, e);
          } else {
            LOG.debug("{}: attempt #{} failed {} with {}", clientId, attemptCount, request, e);
          }
          e = JavaUtils.unwrapCompletionException(e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `ratis-client/src/main/java/org/apache/ratis/client/impl/OrderedAsync.java`
#### Snippet
```java
        LOG.trace(client.getId() + ": Failed* " + request, e);
      } else {
        LOG.debug("{}: Failed* {} with {}", client.getId(), request, e);
      }
      e = JavaUtils.unwrapCompletionException(e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (3) than placeholders specified (4)
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftClientImpl.java`
#### Snippet
```java
  void handleIOException(RaftClientRequest request, IOException ioe,
      RaftPeerId newLeader, Consumer<RaftClientRequest> handler) {
    LOG.debug("{}: suggested new leader: {}. Failed {} with {}",
        clientId, newLeader, request, ioe);
    if (LOG.isTraceEnabled()) {
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderBase.java`
#### Snippet
```java

    final List<LogEntryProto> protos = buffer.pollList(getHeartbeatWaitTimeMs(), EntryWithData::getEntry,
        (entry, time, exception) -> LOG.warn("Failed to get {} in {}: {}", entry, time, exception));
    buffer.clear();
    assertProtos(protos, followerNext, previous, snapshotIndex);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderDefault.java`
#### Snippet
```java
      throw iioe;
    } catch (Exception ioe) {
      LOG.warn("{}: Failed to installSnapshot {}: {}", this, snapshot, ioe);
      handleException(ioe);
      return null;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `ratis-server/src/main/java/org/apache/ratis/server/leader/LogAppenderDefault.java`
#### Snippet
```java
        // TODO should have more detailed retry policy here.
        if (retry++ % 10 == 0) { // to reduce the number of messages
          LOG.warn("{}: Failed to appendEntries (retry={}): {}", this, retry++, ioe);
        }
        handleException(ioe);
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
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
          final ByteBuffer buffer = data.asReadOnlyByteBuffer();
          try {
            for (; buffer.remaining() > 0; ) {
              n += out.write(buffer);
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `ratis-client/src/main/java/org/apache/ratis/client/impl/ClientProtoUtils.java`
#### Snippet
```java
    final ClientId clientId = ClientId.valueOf(m.getRequestorId());
    final RaftPeerId serverId = RaftPeerId.valueOf(m.getReplyId());
    switch(p.getOpCase()) {
      case CREATE:
        return SnapshotManagementRequest.newCreate(clientId, serverId,
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Server.java`
#### Snippet
```java
    final int port = NetUtils.createSocketAddr(getPeer(peerId).getAddress()).getPort();
    GrpcConfigKeys.Server.setPort(properties, port);

    Optional.ofNullable(getPeer(peerId).getClientAddress()).ifPresent(address ->
        GrpcConfigKeys.Client.setPort(properties, NetUtils.createSocketAddr(address).getPort()));
    Optional.ofNullable(getPeer(peerId).getAdminAddress()).ifPresent(address ->
        GrpcConfigKeys.Admin.setPort(properties, NetUtils.createSocketAddr(address).getPort()));
```

### DuplicatedCode
Duplicated code
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Server.java`
#### Snippet
```java
    final RaftGroup raftGroup = RaftGroup.valueOf(RaftGroupId.valueOf(ByteString.copyFromUtf8(getRaftGroupId())),
            getPeers());
    RaftServer raftServer = RaftServer.newBuilder()
        .setServerId(RaftPeerId.valueOf(id))
        .setStateMachine(stateMachine).setProperties(properties)
        .setGroup(raftGroup)
        .build();
    raftServer.start();

    for(; raftServer.getLifeCycleState() != LifeCycle.State.CLOSED;) {
      TimeUnit.SECONDS.sleep(1);
    }
```

### DuplicatedCode
Duplicated code
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileStoreStateMachine.java`
#### Snippet
```java
    final StateMachineLogEntryProto smLog = entry.getStateMachineLogEntry();
    final ByteString data = smLog.getLogData();
    final FileStoreRequestProto proto;
    try {
      proto = FileStoreRequestProto.parseFrom(data);
    } catch (InvalidProtocolBufferException e) {
      return FileStoreCommon.completeExceptionally(
          entry.getIndex(), "Failed to parse data, entry=" + entry, e);
    }
    if (proto.getRequestCase() != FileStoreRequestProto.RequestCase.WRITEHEADER) {
      return null;
    }

    final WriteRequestHeaderProto h = proto.getWriteHeader();
```

### DuplicatedCode
Duplicated code
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
    long endTime = System.currentTimeMillis();

    System.out.println("Total files written: " + getNumFiles());
    System.out.println("Each files size: " + getFileSizeInBytes());
    System.out.println("Total data written: " + totalWrittenBytes + " bytes");
    System.out.println("Total time taken: " + (endTime - startTime) + " millis");

    stop(clients);
```

### DuplicatedCode
Duplicated code
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcTlsConfig.java`
#### Snippet
```java
    final Builder b = newBuilder().setMutualTls(mTlsEnabled);
    Optional.ofNullable(trustStore).map(CertificatesConf::new).ifPresent(b::setTrustCertificates);
    Optional.ofNullable(privateKey).map(PrivateKeyConf::new).ifPresent(b::setPrivateKey);
    Optional.ofNullable(certChain).map(CertificatesConf::new).ifPresent(b::setKeyCertificates);
    return b;
```

### DuplicatedCode
Duplicated code
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
    final KeyManager keyManager = keyManagerConfig.getKeyManager();
    if (keyManager != null) {
      return SslContextBuilder.forServer(keyManager);
    }
    final PrivateKeyConf privateKey = keyManagerConfig.getPrivateKey();
    final CertificatesConf certificates = keyManagerConfig.getKeyCertificates();

    if (keyManagerConfig.isFileBased()) {
      return SslContextBuilder.forServer(certificates.getFile(), privateKey.getFile());
    } else {
      return SslContextBuilder.forServer(privateKey.get(), certificates.get());
    }
```

### DuplicatedCode
Duplicated code
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
    if (trustManagerConfig == null) {
      return;
    }
    final TrustManager trustManager = trustManagerConfig.getTrustManager();
    if (trustManager != null) {
      b.trustManager(trustManager);
      return;
    }
    final CertificatesConf certificates = trustManagerConfig.getTrustCertificates();
    if (certificates.isFileBased()) {
      b.trustManager(certificates.getFile());
    } else {
      b.trustManager(certificates.get());
    }
```

### DuplicatedCode
Duplicated code
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java
    if (keyManagerConfig == null) {
      return;
    }
    final KeyManager keyManager = keyManagerConfig.getKeyManager();
    if (keyManager != null) {
      b.keyManager(keyManager);
      return;
    }
    final PrivateKeyConf privateKey = keyManagerConfig.getPrivateKey();
    final CertificatesConf certificates = keyManagerConfig.getKeyCertificates();

    if (keyManagerConfig.isFileBased()) {
      b.keyManager(certificates.getFile(), privateKey.getFile());
    } else {
      b.keyManager(privateKey.get(), certificates.get());
    }
```

### DuplicatedCode
Duplicated code
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/MetricRegistriesImpl.java`
#### Snippet
```java
    return registries.put(info, () -> {
      if (reporterRegistrations.isEmpty()) {
        if (LOG.isDebugEnabled()) {
          LOG.debug("First MetricRegistry has been created without registering reporters. " +
              "Hence registering JMX reporter by default.");
        }
        enableJmxReporter();
      }
      RatisMetricRegistry registry = factory.create(info);
      reporterRegistrations.forEach(reg -> reg.accept(registry));
      return registry;
    });
```

### DuplicatedCode
Duplicated code
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RatisMetricRegistryImpl.java`
#### Snippet
```java
    for (Map.Entry<String, Metric> entry : metricSet.getMetrics().entrySet()) {
      if (entry.getValue() instanceof MetricSet) {
        registerAll(prefix + "." + entry.getKey(), (MetricSet) entry.getValue());
      } else {
        register(prefix + "." + entry.getKey(), entry.getValue());
      }
    }
```

### DuplicatedCode
Duplicated code
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/RatisObjectNameFactory.java`
#### Snippet
```java
    try {
      ObjectName objectName = new ObjectName(domain, "name", name);
      if (objectName.isPattern()) {
        objectName = new ObjectName(domain, "name", ObjectName.quote(name));
      }
      return objectName;
    } catch (MalformedObjectNameException e) {
      try {
        return new ObjectName(domain, "name", ObjectName.quote(name));
      } catch (MalformedObjectNameException mone) {
        throw new IllegalArgumentException(
            "Failed to register " + name + ", type=" + type + ", domain=" + domain, mone);
      }
    }
```

### DuplicatedCode
Duplicated code
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
    final RaftPeerId selfId = server.getId();
    final RaftConfigurationImpl conf = server.getRaftConf();

    final CurrentOldFollowerInfos infos = followerInfoMap.getFollowerInfos(conf);
    final List<FollowerInfo> followers = infos.getCurrent();
    final boolean includeSelf = conf.containsInConf(selfId);
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `ratis-common/src/main/java/org/apache/ratis/util/AtomicFileOutputStream.java`
#### Snippet
```java

  public AtomicFileOutputStream(File outFile, File tmpFile) throws FileNotFoundException {
    super(new FileOutputStream(tmpFile));
    this.outFile = outFile.getAbsoluteFile();
    this.tmpFile = tmpFile.getAbsoluteFile();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-common/src/main/java/org/apache/ratis/util/MD5FileUtil.java`
#### Snippet
```java
  private static Matcher readStoredMd5(File md5File) throws IOException {
    BufferedReader reader =
          new BufferedReader(new InputStreamReader(new FileInputStream(
            md5File), StandardCharsets.UTF_8));
    String md5Line;
    try {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java
    this.file = file;
    this.limiter = new LimitedInputStream(
        new BufferedInputStream(new FileInputStream(file)));
    in = new DataInputStream(limiter);
    checksum = new PureJavaCrc32C();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-server/src/main/java/org/apache/ratis/server/storage/FileChunkReader.java`
#### Snippet
```java
    if (info.getFileDigest() == null) {
      digester = MD5Hash.getDigester();
      this.in = new DigestInputStream(new FileInputStream(f), digester);
    } else {
      digester = null;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-server/src/main/java/org/apache/ratis/server/storage/FileChunkReader.java`
#### Snippet
```java
    } else {
      digester = null;
      this.in = new FileInputStream(f);
    }
  }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-server/src/main/java/org/apache/ratis/server/storage/RaftStorageMetadataFileImpl.java`
#### Snippet
```java
    }
    try(BufferedReader br = new BufferedReader(new InputStreamReader(
        new FileInputStream(file), StandardCharsets.UTF_8))) {
      Properties properties = new Properties();
      properties.load(br);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/Constants.java`
#### Snippet
```java
    final Properties properties = new Properties();
    final String conf = "ratis-examples/src/main/resources/conf.properties";
    try(InputStream inputStream = new FileInputStream(conf);
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(reader)) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/ArithmeticStateMachine.java`
#### Snippet
```java

    try(ObjectOutputStream out = new ObjectOutputStream(
        new BufferedOutputStream(new FileOutputStream(snapshotFile)))) {
      out.writeObject(copy);
    } catch(IOException ioe) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/ArithmeticStateMachine.java`
#### Snippet
```java
    try(AutoCloseableLock writeLock = writeLock();
        ObjectInputStream in = new ObjectInputStream(
            new BufferedInputStream(new FileInputStream(snapshotFile)))) {
      reset();
      setLastAppliedTermIndex(last);
```

## RuleId[id=Deprecation]
### Deprecation
'notifyFollowerSlowness(RoleInfoProto)' is deprecated
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderStateImpl.java`
#### Snippet
```java
    if (elapsedTime.compareTo(server.properties().rpcSlownessTimeout()) > 0) {
      final RoleInfoProto leaderInfo = server.getInfo().getRoleInfoProto();
      server.getStateMachine().leaderEvent().notifyFollowerSlowness(leaderInfo);
      server.getStateMachine().leaderEvent().notifyFollowerSlowness(leaderInfo, follower.getPeer());
    }
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

## RuleId[id=TrivialStringConcatenation]
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

  public enum Op implements UnaryOperator<Expression>, DoubleFunction<Expression> {
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-client/src/main/java/org/apache/ratis/client/impl/RaftOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    checkClosed();
    if (off < 0 || len < 0 || off > b.length - len) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegmentStartEnd.java`
#### Snippet
```java

  @Override
  public int compareTo(LogSegmentStartEnd that) {
    return Comparator.comparingLong(LogSegmentStartEnd::getStartIndex)
        .thenComparingLong(LogSegmentStartEnd::getEndIndex)
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegmentPath.java`
#### Snippet
```java
  @Override
  @SuppressFBWarnings("EQ_COMPARETO_USE_OBJECT_EQUALS")
  public int compareTo(LogSegmentPath that) {
    return Comparator.comparing(LogSegmentPath::getStartEnd).compare(this, that);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogReader.java`
#### Snippet
```java

    @Override
    public int read(byte[] data, int offset, int length) throws IOException {
      checkLimit(length);
      int ret = super.read(data, offset, length);
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java

    @Override
    public LogEntryProto load(LogRecord key) throws IOException {
      final File file = getFile();
      // note the loading should not exceed the endIndex: it is possible that
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java

    @Override
    public LogEntryProto load(LogRecord key) throws IOException {
      final File file = getFile();
      // note the loading should not exceed the endIndex: it is possible that
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
  @Override
  @SuppressFBWarnings("EQ_COMPARETO_USE_OBJECT_EQUALS")
  public int compareTo(Long l) {
    return (l >= getStartIndex() && l <= getEndIndex()) ? 0 :
        (this.getEndIndex() < l ? -1 : 1);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/LogEntryHeader.java`
#### Snippet
```java

      @Override
      public int compareTo(LogEntryHeader that) {
        return Comparator.comparing(LogEntryHeader::getTermIndex)
            .thenComparing(LogEntryHeader::getLogEntryBodyCase)
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `ratis-server-api/src/main/java/org/apache/ratis/server/protocol/TermIndex.java`
#### Snippet
```java

  @Override
  default int compareTo(TermIndex that) {
    return Comparator.comparingLong(TermIndex::getTerm)
        .thenComparingLong(TermIndex::getIndex)
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `ratis-server/src/main/java/org/apache/ratis/server/impl/LeaderElection.java`
#### Snippet
```java
 * See
 * Ongaro, D. Consensus: Bridging Theory and Practice. PhD thesis, Stanford University, 2014.
 * Available at https://github.com/ongardie/dissertation
 */
class LeaderElection implements Runnable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `ratis-server-api/src/main/java/org/apache/ratis/statemachine/StateMachine.java`
#### Snippet
```java
 * StateMachine is the entry point for the custom implementation of replicated state as defined in
 * the "State Machine Approach" in the literature
 * (see https://en.wikipedia.org/wiki/State_machine_replication).
 *
 *  A {@link StateMachine} implementation must be threadsafe.
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/metrics/intercept/server/MetricServerCallListener.java`
#### Snippet
```java
public class MetricServerCallListener<R> extends ForwardingServerCallListener<R> {
  private final ServerCall.Listener<R> delegate;
  private final String metricNamePrefix;
  private MessageMetrics metrics;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/metrics/intercept/server/MetricServerCallListener.java`
#### Snippet
```java
  private final ServerCall.Listener<R> delegate;
  private final String metricNamePrefix;
  private MessageMetrics metrics;

  MetricServerCallListener(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/metrics/intercept/server/MetricServerCall.java`
#### Snippet
```java
  private final MessageMetrics metrics;
  private final String metricNamPrefix;
  private final ServerCall<R,S> delegate;

  MetricServerCall(ServerCall<R,S> delegate,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/client/GrpcClientProtocolClient.java`
#### Snippet
```java
    private final ReplyMap replies = new ReplyMap();

    private final StreamObserver<RaftClientReplyProto> replyStreamObserver
        = new StreamObserver<RaftClientReplyProto>() {
      @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/SubCommandBase.java`
#### Snippet
```java
  @Parameter(names = {"--raftGroup",
      "-g"}, description = "Raft group identifier")
  private String raftGroupId = "demoRaftGroup123";

  @Parameter(names = {"--peers", "-r"}, description =
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--writeThreadNum"}, description = "Number of write thread")
  private int writeThreadNum = 20;

  @Parameter(names = {"--readThreadNum"}, description = "Number of read thread")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--readThreadNum"}, description = "Number of read thread")
  private int readThreadNum = 20;

  @Parameter(names = {"--commitThreadNum"}, description = "Number of commit thread")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--commitThreadNum"}, description = "Number of commit thread")
  private int commitThreadNum = 3;

  @Parameter(names = {"--deleteThreadNum"}, description = "Number of delete thread")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--deleteThreadNum"}, description = "Number of delete thread")
  private int deleteThreadNum = 3;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

  @Parameter(names = {"--sync"}, description = "Whether sync every bufferSize", required = false)
  private int sync = 0;

  @Override
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/NettyRpcService.java`
#### Snippet
```java
    workerGroup.shutdownGracefully(0, 100, TimeUnit.MILLISECONDS);
    try {
      bossGroup.awaitTermination(1000, TimeUnit.MILLISECONDS);
      workerGroup.awaitTermination(1000, TimeUnit.MILLISECONDS);
    } catch (InterruptedException e) {
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `ratis-netty/src/main/java/org/apache/ratis/netty/server/NettyRpcService.java`
#### Snippet
```java
    try {
      bossGroup.awaitTermination(1000, TimeUnit.MILLISECONDS);
      workerGroup.awaitTermination(1000, TimeUnit.MILLISECONDS);
    } catch (InterruptedException e) {
      LOG.error("Interrupt EventLoopGroup terminate", e);
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

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java
public class LoadGen extends Client {

  @Parameter(names = {"--sync"}, description = "Whether sync every bufferSize", required = false)
  private int sync = 0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java

  @Parameter(names = {"--bufferSize"}, description = "Size of buffer in bytes, should less than 4MB, " +
      "i.e BUFFER_BYTE_LIMIT_DEFAULT", required = false)
  private int bufferSizeInBytes = 1024;

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `ratis-common/src/main/java/org/apache/ratis/util/FileUtils.java`
#### Snippet
```java
        () -> {
          try (FileOutputStream out = new FileOutputStream(f, true)) {
            out.getChannel().truncate(target);
          }
        },
```

### AutoCloseableResource
'RaftServerImpl' used without 'try'-with-resources statement
in `ratis-server/src/main/java/org/apache/ratis/server/impl/RaftServerProxy.java`
#### Snippet
```java

    String toString(RaftGroupId groupId, CompletableFuture<RaftServerImpl> f) {
      return "" + (f != null && f.isDone()? f.join(): groupId + ":" + f);
    }
  }
```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/BufferedWriteChannel.java`
#### Snippet
```java
class BufferedWriteChannel implements Closeable {
  static BufferedWriteChannel open(File file, boolean append, ByteBuffer buffer) throws IOException {
    final RandomAccessFile raf = new RandomAccessFile(file, "rw");
    final FileChannel fc = raf.getChannel();
    if (append) {
```

### AutoCloseableResource
'RaftServer' used without 'try'-with-resources statement
in `ratis-server/src/main/java/org/apache/ratis/statemachine/impl/BaseStateMachine.java`
#### Snippet
```java

  public RaftPeerId getId() {
    return server.isDone()? server.join().getId(): null;
  }

```

### AutoCloseableResource
'CounterServer' used without 'try'-with-resources statement
in `ratis-examples/src/main/java/org/apache/ratis/examples/debug/server/Server.java`
#### Snippet
```java

    final File storageDir = new File(Constants.PATH, currentPeer.getId().toString());
    final CounterServer counterServer = new CounterServer(currentPeer, storageDir, TimeDuration.ZERO);
    counterServer.start();
  }
```

### AutoCloseableResource
'RaftServer' used without 'try'-with-resources statement
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java
        .setStateMachine(stateMachine).setProperties(properties)
        .setGroup(raftGroup)
        .build();

    raftServer.start();
```

### AutoCloseableResource
'RaftServer' used without 'try'-with-resources statement
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Server.java`
#### Snippet
```java
        .setStateMachine(stateMachine).setProperties(properties)
        .setGroup(raftGroup)
        .build();
    raftServer.start();

```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `ratis-metrics-default/src/main/java/org/apache/ratis/metrics/impl/DefaultTimekeeperImpl.java`
#### Snippet
```java
  @Override
  public Context time() {
    final Timer.Context context = timer.time();
    return context::stop;
  }
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `ratis-metrics-dropwizard3/src/main/java/org/apache/ratis/metrics/dropwizard3/Dm3TimekeeperImpl.java`
#### Snippet
```java
  @Override
  public Context time() {
    final Timer.Context context = timer.time();
    return context::stop;
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `response` to `DoubleValue` is redundant
in `ratis-examples/src/main/java/org/apache/ratis/examples/arithmetic/cli/Get.java`
#### Snippet
```java
    Expression response =
        Expression.Utils.bytes2Expression(getValue.getMessage().getContent().toByteArray(), 0);
    System.out.println(String.format("%s=%s", name, (DoubleValue) response).toString());
  }
}
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param source` tag description is missing
in `ratis-common/src/main/java/org/apache/ratis/util/FileUtils.java`
#### Snippet
```java
   * Moves the directory. If any file is locked, the exception is caught
   * and logged and continues to other files.
   * @param source
   * @param dest
   * @throws IOException
```

### JavadocDeclaration
`@param dest` tag description is missing
in `ratis-common/src/main/java/org/apache/ratis/util/FileUtils.java`
#### Snippet
```java
   * and logged and continues to other files.
   * @param source
   * @param dest
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `ratis-common/src/main/java/org/apache/ratis/util/FileUtils.java`
#### Snippet
```java
   * @param source
   * @param dest
   * @throws IOException
   */
  static void moveDirectory(Path source, Path dest) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/SegmentedRaftLogInputStream.java`
#### Snippet
```java
   *                      potentially being updated.
   * @return Result of the validation
   * @throws IOException
   */
  static LogValidation scanEditLog(File file, long maxTxIdToScan, SizeInBytes maxOpSize)
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `metrics` may be 'final'
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/metrics/intercept/server/MetricServerCallListener.java`
#### Snippet
```java
  private final ServerCall.Listener<R> delegate;
  private final String metricNamePrefix;
  private MessageMetrics metrics;

  MetricServerCallListener(
```

### FieldMayBeFinal
Field `trailers` may be 'final'
in `ratis-grpc/src/main/java/org/apache/ratis/grpc/GrpcUtil.java`
#### Snippet
```java

  class StatusRuntimeExceptionMetadataBuilder {
    private Metadata trailers = new Metadata();

    StatusRuntimeExceptionMetadataBuilder(Throwable t) {
```

### FieldMayBeFinal
Field `timeoutMap` may be 'final'
in `ratis-client/src/main/java/org/apache/ratis/client/retry/RequestTypeDependentRetryPolicy.java`
#### Snippet
```java
        retryPolicyMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);
    private EnumMap<RaftProtos.RaftClientRequestProto.TypeCase, TimeDuration>
        timeoutMap = new EnumMap<>(RaftProtos.RaftClientRequestProto.TypeCase.class);

    /** Set the given policy for the given type. */
```

### FieldMayBeFinal
Field `pos` may be 'final'
in `ratis-common/src/main/java/org/apache/ratis/protocol/exceptions/ChecksumException.java`
#### Snippet
```java
public class ChecksumException extends IOException {
  private static final long serialVersionUID = 1L;
  private long pos;
  public ChecksumException(String description, long pos) {
    super(description);
```

### FieldMayBeFinal
Field `storage` may be 'final'
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
  /** Segment end index, inclusive. */
  private volatile long endIndex;
  private RaftStorage storage;
  private final SizeInBytes maxOpSize;
  private final LogEntryLoader cacheLoader;
```

### FieldMayBeFinal
Field `totalCacheSize` may be 'final'
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
  private volatile boolean isOpen;
  private long totalFileSize = SegmentedRaftLogFormat.getHeaderLength();
  private AtomicLong totalCacheSize = new AtomicLong(0);
  /** Segment start index, inclusive. */
  private long startIndex;
```

### FieldMayBeFinal
Field `startIndex` may be 'final'
in `ratis-server/src/main/java/org/apache/ratis/server/raftlog/segmented/LogSegment.java`
#### Snippet
```java
  private AtomicLong totalCacheSize = new AtomicLong(0);
  /** Segment start index, inclusive. */
  private long startIndex;
  /** Segment end index, inclusive. */
  private volatile long endIndex;
```

### FieldMayBeFinal
Field `raftGroupId` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/SubCommandBase.java`
#### Snippet
```java
  @Parameter(names = {"--raftGroup",
      "-g"}, description = "Raft group identifier")
  private String raftGroupId = "demoRaftGroup123";

  @Parameter(names = {"--peers", "-r"}, description =
```

### FieldMayBeFinal
Field `writeThreadNum` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--writeThreadNum"}, description = "Number of write thread")
  private int writeThreadNum = 20;

  @Parameter(names = {"--readThreadNum"}, description = "Number of read thread")
```

### FieldMayBeFinal
Field `readThreadNum` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--readThreadNum"}, description = "Number of read thread")
  private int readThreadNum = 20;

  @Parameter(names = {"--commitThreadNum"}, description = "Number of commit thread")
```

### FieldMayBeFinal
Field `commitThreadNum` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--commitThreadNum"}, description = "Number of commit thread")
  private int commitThreadNum = 3;

  @Parameter(names = {"--deleteThreadNum"}, description = "Number of delete thread")
```

### FieldMayBeFinal
Field `deleteThreadNum` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java

  @Parameter(names = {"--deleteThreadNum"}, description = "Number of delete thread")
  private int deleteThreadNum = 3;

  @Override
```

### FieldMayBeFinal
Field `storageDir` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Server.java`
#### Snippet
```java
  @Parameter(names = {"--storage", "-s"}, description = "Storage dir, eg. --storage dir1 --storage dir2",
      required = true)
  private List<File> storageDir = new ArrayList<>();

  @Parameter(names = {"--writeThreadNum"}, description = "Number of write thread")
```

### FieldMayBeFinal
Field `sync` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/LoadGen.java`
#### Snippet
```java

  @Parameter(names = {"--sync"}, description = "Whether sync every bufferSize", required = false)
  private int sync = 0;

  @Override
```

### FieldMayBeFinal
Field `bufferSizeInBytes` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
  @Parameter(names = {"--bufferSize"}, description = "Size of buffer in bytes, should less than 4MB, " +
      "i.e BUFFER_BYTE_LIMIT_DEFAULT", required = false)
  private int bufferSizeInBytes = 1024;

  @Parameter(names = {"--numFiles"}, description = "Number of files to be written", required = true)
```

### FieldMayBeFinal
Field `storageDir` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/Client.java`
#### Snippet
```java
  @Parameter(names = {"--storage", "-s"}, description = "Storage dir, eg. --storage dir1 --storage dir2",
      required = true)
  private List<File> storageDir = new ArrayList<>();

  private static final int MAX_THREADS_NUM = 1000;
```

### FieldMayBeFinal
Field `dataStreamType` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java

  @Parameter(names = {"--type"}, description = DESCRIPTION, required = true)
  private String dataStreamType = Type.NettyFileRegion.name();

  @Parameter(names = {"--syncSize"}, description = "Sync every syncSize, syncSize % bufferSize should be zero," +
```

### FieldMayBeFinal
Field `syncSize` may be 'final'
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/cli/DataStream.java`
#### Snippet
```java
  @Parameter(names = {"--syncSize"}, description = "Sync every syncSize, syncSize % bufferSize should be zero," +
      "-1 means on sync", required = true)
  private int syncSize = -1;

  int getSyncSize() {
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

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `Runner`
in `ratis-examples/src/main/java/org/apache/ratis/examples/common/Runner.java`
#### Snippet
```java
    }
    List<SubCommandBase> commands = initializeCommands(args[0]);
    Runner runner = new Runner();

    if (commands == null) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `ratis-common/src/main/java/org/apache/ratis/conf/RaftProperties.java`
#### Snippet
```java
  /**
   * This is a manual implementation of the following regex
   * "\\$\\{[^\\}\\$\u0020]+\\}".
   *
   * @param eval a string that may contain variables requiring expansion.
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ratis-shell/src/main/java/org/apache/ratis/shell/cli/sh/command/SnapshotCommand.java`
#### Snippet
```java
public class SnapshotCommand extends AbstractParentCommand {
  private static final List<Function<Context, AbstractRatisCommand>> SUB_COMMAND_CONSTRUCTORS
      = Collections.unmodifiableList(Arrays.asList(TakeSnapshotCommand::new));

  /**
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ratis-server-api/src/main/java/org/apache/ratis/server/raftlog/RaftLogSequentialOps.java`
#### Snippet
```java
  @Deprecated
  default List<CompletableFuture<Long>> append(LogEntryProto... entries) {
    return append(Arrays.asList(entries));
  }

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

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `committedSize`
in `ratis-examples/src/main/java/org/apache/ratis/examples/filestore/FileInfo.java`
#### Snippet
```java
              + ") + size (=" + size + ") > writeSize = " + writeSize);
        }
        committedSize += size;

        if (close) {
```

