# kafka 
 
# Bad smells
I found 1859 bad smells with 41 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 384 | false |
| AutoCloseableResource | 154 | false |
| FieldMayBeFinal | 132 | false |
| JavadocDeclaration | 115 | false |
| DuplicatedCode | 102 | false |
| UNCHECKED_WARNING | 78 | false |
| Deprecation | 59 | false |
| NullableProblems | 56 | false |
| FieldCanBeLocal | 51 | false |
| DataFlowIssue | 43 | false |
| OptionalGetWithoutIsPresent | 41 | false |
| IgnoreResultOfCall | 33 | false |
| JavadocReference | 31 | false |
| ConstantValue | 31 | false |
| UnusedAssignment | 26 | false |
| MarkedForRemoval | 24 | false |
| TrivialIf | 23 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 23 | false |
| ThrowableNotThrown | 22 | false |
| StaticInitializerReferencesSubClass | 21 | false |
| DeprecatedIsStillUsed | 21 | false |
| OptionalIsPresent | 19 | false |
| StringBufferReplaceableByString | 18 | false |
| JavadocLinkAsPlainText | 17 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 17 | false |
| UnnecessaryLocalVariable | 15 | true |
| RedundantTypeArguments | 13 | false |
| DanglingJavadoc | 13 | false |
| UseBulkOperation | 13 | false |
| EmptyStatementBody | 10 | false |
| SlowAbstractSetRemoveAll | 10 | false |
| SimplifyStreamApiCallChains | 9 | false |
| PlaceholderCountMatchesArgumentCount | 9 | false |
| ArrayHashCode | 9 | false |
| ArraysAsListWithZeroOrOneArgument | 9 | false |
| DefaultAnnotationParam | 9 | false |
| NonAtomicOperationOnVolatileField | 9 | false |
| RegExpRedundantEscape | 8 | false |
| TrivialStringConcatenation | 8 | false |
| PointlessBitwiseExpression | 8 | false |
| SuspiciousMethodCalls | 8 | false |
| RedundantMethodOverride | 7 | false |
| RedundantCast | 7 | false |
| BusyWait | 7 | false |
| UnnecessaryStringEscape | 7 | true |
| PointlessArithmeticExpression | 6 | false |
| NonStrictComparisonCanBeEquality | 6 | true |
| WrapperTypeMayBePrimitive | 5 | false |
| OptionalAssignedToNull | 5 | false |
| RegExpSimplifiable | 5 | false |
| UnnecessaryReturn | 5 | true |
| SwitchStatementWithTooFewBranches | 5 | false |
| UnnecessaryModifier | 4 | true |
| NonFinalFieldInEnum | 4 | false |
| DuplicateExpressions | 4 | false |
| IfStatementWithIdenticalBranches | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| UnnecessaryContinue | 4 | false |
| UnnecessarySemicolon | 3 | false |
| JavaReflectionInvocation | 3 | false |
| CaughtExceptionImmediatelyRethrown | 3 | false |
| NegativeIntConstantInLongContext | 3 | false |
| RedundantStringFormatCall | 3 | false |
| EqualsWhichDoesntCheckParameterClass | 3 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| StringConcatenationInLoops | 2 | false |
| ManualArrayToCollectionCopy | 2 | false |
| TypeParameterHidesVisibleType | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| RedundantCompareCall | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| SimplifiableConditionalExpression | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| InfiniteLoopStatement | 2 | false |
| RedundantUnmodifiable | 2 | false |
| MismatchedJavadocCode | 2 | false |
| CatchMayIgnoreException | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| FinalPrivateMethod | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ExcessiveLambdaUsage | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| AssignmentToCatchBlockParameter | 1 | false |
| ThrowablePrintedToSystemOut | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| MalformedFormatString | 1 | false |
| SlowListContainsAll | 1 | false |
| PointlessNullCheck | 1 | false |
| RedundantLengthCheck | 1 | false |
| RedundantCollectionOperation | 1 | false |
| IOStreamConstructor | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| NumericOverflow | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `clients/src/main/java/org/apache/kafka/common/security/scram/ScramLoginModule.java`
#### Snippet
```java
            subject.getPrivateCredentials().add(password);

        Boolean useTokenAuthentication = "true".equalsIgnoreCase((String) options.get(TOKEN_AUTH_CONFIG));
        if (useTokenAuthentication) {
            Map<String, String> scramExtensions = Collections.singletonMap(TOKEN_AUTH_CONFIG, "true");
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/StickyPartitionCache.java`
#### Snippet
```java
            List<PartitionInfo> availablePartitions = cluster.availablePartitionsForTopic(topic);
            if (availablePartitions.size() < 1) {
                Integer random = Utils.toPositive(ThreadLocalRandom.current().nextInt());
                newPart = random % partitions.size();
            } else if (availablePartitions.size() == 1) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/TimestampConverter.java`
#### Snippet
```java
                if (!(orig instanceof Long))
                    throw new DataException("Expected Unix timestamp to be a Long, but found " + orig.getClass());
                Long unixTime = (Long) orig;
                switch (config.unixPrecision) {
                    case UNIX_PRECISION_SECONDS:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/TimestampConverter.java`
#### Snippet
```java
            @Override
            public Long toType(Config config, Date orig) {
                Long unixTimeMillis = Timestamp.fromLogical(Timestamp.SCHEMA, orig);
                switch (config.unixPrecision) {
                    case UNIX_PRECISION_SECONDS:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `metadata/src/main/java/org/apache/kafka/image/node/TopicImageNode.java`
#### Snippet
```java
            return new MetadataLeafNode(image.id().toString());
        } else {
            Integer partitionId;
            try {
                partitionId = Integer.parseInt(name);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `clients/src/main/java/org/apache/kafka/clients/admin/ScramMechanism.java`
#### Snippet
```java
    private final String mechanismName;

    private ScramMechanism(byte type) {
        this.type = type;
        this.mechanismName = toString().replace('_', '-');
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `trogdor/src/main/java/org/apache/kafka/trogdor/common/Node.java`
#### Snippet
```java
 */
public interface Node {
    public static class Util {
        public static int getIntConfig(Node node, String key, int defaultVal) {
            String val = node.getConfig(key);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `trogdor/src/main/java/org/apache/kafka/trogdor/common/Node.java`
#### Snippet
```java
 */
public interface Node {
    public static class Util {
        public static int getIntConfig(Node node, String key, int defaultVal) {
            String val = node.getConfig(key);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `metadata/src/main/java/org/apache/kafka/metadata/LeaderRecoveryState.java`
#### Snippet
```java
    private final byte value;

    private LeaderRecoveryState(byte value) {
        this.value = value;
    }
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0 * 256` can be replaced with '0'
in `clients/src/main/java/org/apache/kafka/common/utils/PureJavaCrc32C.java`
#### Snippet
```java
    //   org.apache.hadoop.util.TestPureJavaCrc32\$Table 82F63B78

    private static final int T8_0_START = 0 * 256;
    private static final int T8_1_START = 1 * 256;
    private static final int T8_2_START = 2 * 256;
```

### PointlessArithmeticExpression
`1 * 256` can be replaced with '256'
in `clients/src/main/java/org/apache/kafka/common/utils/PureJavaCrc32C.java`
#### Snippet
```java

    private static final int T8_0_START = 0 * 256;
    private static final int T8_1_START = 1 * 256;
    private static final int T8_2_START = 2 * 256;
    private static final int T8_3_START = 3 * 256;
```

### PointlessArithmeticExpression
`off + 0` can be replaced with 'off'
in `clients/src/main/java/org/apache/kafka/common/utils/PureJavaCrc32C.java`
#### Snippet
```java

        while (len > 7) {
            final int c0 = (b[off + 0] ^ localCrc) & 0xff;
            final int c1 = (b[off + 1] ^ (localCrc >>>= 8)) & 0xff;
            final int c2 = (b[off + 2] ^ (localCrc >>>= 8)) & 0xff;
```

### PointlessArithmeticExpression
`1 * 60 * 1000L` can be replaced with '60 \* 1000L'
in `clients/src/main/java/org/apache/kafka/common/config/SaslConfigs.java`
#### Snippet
```java
    public static final String SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN = "sasl.kerberos.min.time.before.relogin";
    public static final String SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_DOC = "Login thread sleep time between refresh attempts.";
    public static final long DEFAULT_KERBEROS_MIN_TIME_BEFORE_RELOGIN = 1 * 60 * 1000L;

    public static final String SASL_LOGIN_REFRESH_WINDOW_FACTOR = "sasl.login.refresh.window.factor";
```

### PointlessArithmeticExpression
`i4 + 0` can be replaced with 'i4'
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
        for (int i = 0; i < length4; i++) {
            final int i4 = i * 4;
            int k = (data[i4 + 0] & 0xff) + ((data[i4 + 1] & 0xff) << 8) + ((data[i4 + 2] & 0xff) << 16) + ((data[i4 + 3] & 0xff) << 24);
            k *= m;
            k ^= k >>> r;
```

### PointlessArithmeticExpression
`1 * 1024 * 1024` can be replaced with '1024 \* 1024'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerConfig.java`
#### Snippet
```java
            "accepted by the broker is defined via <code>message.max.bytes</code> (broker config) or " +
            "<code>max.message.bytes</code> (topic config). See " + FETCH_MAX_BYTES_CONFIG + " for limiting the consumer request size.";
    public static final int DEFAULT_MAX_PARTITION_FETCH_BYTES = 1 * 1024 * 1024;

    /** <code>send.buffer.bytes</code> */
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

    RemoteStorageManager createRemoteStorageManager() {
        return AccessController.doPrivileged(new PrivilegedAction<RemoteStorageManager>() {
            private final String classPath = rlmConfig.remoteStorageManagerClassPath();

```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

    RemoteStorageManager createRemoteStorageManager() {
        return AccessController.doPrivileged(new PrivilegedAction<RemoteStorageManager>() {
            private final String classPath = rlmConfig.remoteStorageManagerClassPath();

```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

    RemoteLogMetadataManager createRemoteLogMetadataManager() {
        return AccessController.doPrivileged(new PrivilegedAction<RemoteLogMetadataManager>() {
            private final String classPath = rlmConfig.remoteLogMetadataManagerClassPath();

```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

    RemoteLogMetadataManager createRemoteLogMetadataManager() {
        return AccessController.doPrivileged(new PrivilegedAction<RemoteLogMetadataManager>() {
            private final String classPath = rlmConfig.remoteLogMetadataManagerClassPath();

```

### MarkedForRemoval
'getSubject(java.security.AccessControlContext)' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java
        if (callback.token() != null)
            throw new IllegalArgumentException("Callback had a token already");
        Subject subject = Subject.getSubject(AccessController.getContext());
        Set<OAuthBearerToken> privateCredentials = subject != null
            ? subject.getPrivateCredentials(OAuthBearerToken.class)
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java
        if (callback.token() != null)
            throw new IllegalArgumentException("Callback had a token already");
        Subject subject = Subject.getSubject(AccessController.getContext());
        Set<OAuthBearerToken> privateCredentials = subject != null
            ? subject.getPrivateCredentials(OAuthBearerToken.class)
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java
        if (callback.token() != null)
            throw new IllegalArgumentException("Callback had a token already");
        Subject subject = Subject.getSubject(AccessController.getContext());
        Set<OAuthBearerToken> privateCredentials = subject != null
            ? subject.getPrivateCredentials(OAuthBearerToken.class)
```

### MarkedForRemoval
'getSubject(java.security.AccessControlContext)' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java
                handleCallback((OAuthBearerTokenCallback) callback);
            else if (callback instanceof SaslExtensionsCallback)
                handleCallback((SaslExtensionsCallback) callback, Subject.getSubject(AccessController.getContext()));
            else
                throw new UnsupportedCallbackException(callback);
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java
                handleCallback((OAuthBearerTokenCallback) callback);
            else if (callback instanceof SaslExtensionsCallback)
                handleCallback((SaslExtensionsCallback) callback, Subject.getSubject(AccessController.getContext()));
            else
                throw new UnsupportedCallbackException(callback);
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java
                handleCallback((OAuthBearerTokenCallback) callback);
            else if (callback instanceof SaslExtensionsCallback)
                handleCallback((SaslExtensionsCallback) callback, Subject.getSubject(AccessController.getContext()));
            else
                throw new UnsupportedCallbackException(callback);
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientCallbackHandler.java`
#### Snippet
```java

import java.io.IOException;
import java.security.AccessController;
import java.util.Collections;
import java.util.Comparator;
```

### MarkedForRemoval
'getSubject(java.security.AccessControlContext)' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientCallbackHandler.java`
#### Snippet
```java
    @Override
    public void handle(Callback[] callbacks) throws UnsupportedCallbackException {
        Subject subject = Subject.getSubject(AccessController.getContext());
        for (Callback callback : callbacks) {
            if (callback instanceof NameCallback) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientCallbackHandler.java`
#### Snippet
```java
    @Override
    public void handle(Callback[] callbacks) throws UnsupportedCallbackException {
        Subject subject = Subject.getSubject(AccessController.getContext());
        for (Callback callback : callbacks) {
            if (callback instanceof NameCallback) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientCallbackHandler.java`
#### Snippet
```java
    @Override
    public void handle(Callback[] callbacks) throws UnsupportedCallbackException {
        Subject subject = Subject.getSubject(AccessController.getContext());
        for (Callback callback : callbacks) {
            if (callback instanceof NameCallback) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientCallbackHandler.java`
#### Snippet
```java
package org.apache.kafka.common.security.authenticator;

import java.security.AccessController;
import java.util.List;
import java.util.Map;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/Plugins.java`
#### Snippet
```java
    // VisibleForTesting
    protected DelegatingClassLoader newDelegatingClassLoader(final List<Path> pluginLocations, ClassLoader parent) {
        return AccessController.doPrivileged(
                (PrivilegedAction<DelegatingClassLoader>) () -> new DelegatingClassLoader(pluginLocations, parent)
        );
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/Plugins.java`
#### Snippet
```java
    // VisibleForTesting
    protected DelegatingClassLoader newDelegatingClassLoader(final List<Path> pluginLocations, ClassLoader parent) {
        return AccessController.doPrivileged(
                (PrivilegedAction<DelegatingClassLoader>) () -> new DelegatingClassLoader(pluginLocations, parent)
        );
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/Plugins.java`
#### Snippet
```java

import java.nio.file.Path;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/DelegatingClassLoader.java`
#### Snippet
```java
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.sql.Driver;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        // Apply here what java.sql.DriverManager does to discover and register classes
        // implementing the java.sql.Driver interface.
        AccessController.doPrivileged(
            (PrivilegedAction<Void>) () -> {
                ServiceLoader<Driver> loadedDrivers = ServiceLoader.load(
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        // Apply here what java.sql.DriverManager does to discover and register classes
        // implementing the java.sql.Driver interface.
        AccessController.doPrivileged(
            (PrivilegedAction<Void>) () -> {
                ServiceLoader<Driver> loadedDrivers = ServiceLoader.load(
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/DelegatingClassLoader.java`
#### Snippet
```java
            final ClassLoader parent
    ) {
        return AccessController.doPrivileged(
                (PrivilegedAction<PluginClassLoader>) () -> new PluginClassLoader(pluginLocation, urls, parent)
        );
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/DelegatingClassLoader.java`
#### Snippet
```java
            final ClassLoader parent
    ) {
        return AccessController.doPrivileged(
                (PrivilegedAction<PluginClassLoader>) () -> new PluginClassLoader(pluginLocation, urls, parent)
        );
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `connect/api/src/main/java/org/apache/kafka/connect/data/SchemaProjector.java`
#### Snippet
```java
                    throw new SchemaProjectorException("Error projecting " + sourceField.name(), e);
                }
            } else if (targetField.schema().isOptional()) {
                // Ignore missing field
            } else if (targetField.schema().defaultValue() != null) {
```

### EmptyStatementBody
`if` statement has empty body
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConnector.java`
#### Snippet
```java
    void createNewPartitions(Map<String, NewPartitions> newPartitions) {
        targetAdminClient.createPartitions(newPartitions).values().forEach((k, v) -> v.whenComplete((x, e) -> {
            if (e instanceof InvalidPartitionsException) {
                // swallow, this is normal
            } else if (e != null) {
```

### EmptyStatementBody
`else` statement has empty body
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ExactlyOnceWorkerSourceTask.java`
#### Snippet
```java
                    e
            );
        } else {
            // No-op; all asynchronously-reported producer exceptions should be bubbled up again by Producer::commitTransaction
        }
```

### EmptyStatementBody
`if` statement has empty body
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerConnector.java`
#### Snippet
```java
            }
            synchronized (this) {
                if (pendingTargetStateChange.get() != null || stopping) {
                    // An update occurred before we entered the synchronized block; no big deal,
                    // just start the loop again until we've handled everything
```

### EmptyStatementBody
`if` statement has empty body
in `streams/src/main/java/org/apache/kafka/streams/state/internals/StreamThreadStateStoreProvider.java`
#### Snippet
```java
                for (final Task task : tasks) {
                    final StateStore store = task.getStore(storeName);
                    if (store == null) {
                        // then this task doesn't have that store
                    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `streams/src/main/java/org/apache/kafka/streams/state/internals/StoreQueryUtils.java`
#### Snippet
```java
            final Map<Integer, Long> partitionBounds = bound.getPartitionPositions(topic);
            final Map<Integer, Long> seenPartitionPositions = position.getPartitionPositions(topic);
            if (!partitionBounds.containsKey(partition)) {
                // this topic isn't bounded for our partition, so just skip over it.
            } else {
```

### EmptyStatementBody
`if` statement has empty body
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/TaskMovement.java`
#### Snippet
```java
            final ClientState state = clientStateEntry.getValue();
            for (final TaskId task : state.standbyTasks()) {
                if (warmups.getOrDefault(destination, Collections.emptySet()).contains(task)) {
                    // this is a warmup, so we won't move it.
                } else if (taskIsNotCaughtUpOnClientAndOtherMoreCaughtUpClientsExist(task, destination, clientStates, tasksToCaughtUpClients, tasksToClientByLag)) {
```

### EmptyStatementBody
`if` statement has empty body
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/TaskMovement.java`
#### Snippet
```java
            }

            if (sourceClient == null) {
                // then there's no caught-up client that doesn't already have a copy of this task, so there's
                // nowhere to move it.
```

### EmptyStatementBody
`if` statement has empty body
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/TaskMovement.java`
#### Snippet
```java
        sourceClientState.assignStandby(task);

        if (remainingWarmupReplicas.getAndDecrement() > 0) {
            // Then we can leave it also assigned to the destination as a warmup
        } else {
```

### EmptyStatementBody
`while` statement has empty body
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/TaskManager.java`
#### Snippet
```java
     */
    public void waitForShutdown() throws InterruptedException {
        while (!executor.awaitTermination(1, TimeUnit.DAYS)) { }
    }

```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType UINT16 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType NULLABLE_BYTES = new DocumentedType() {
        @Override
        public boolean isNullable() {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType VARINT = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType NULLABLE_STRING = new DocumentedType() {
        @Override
        public boolean isNullable() {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType UUID = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType COMPACT_NULLABLE_BYTES = new DocumentedType() {
        @Override
        public boolean isNullable() {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType COMPACT_NULLABLE_STRING = new DocumentedType() {
        @Override
        public boolean isNullable() {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType COMPACT_STRING = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType INT32 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType RECORDS = new DocumentedType() {
        @Override
        public boolean isNullable() {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType INT64 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType VARLONG = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType COMPACT_RECORDS = new DocumentedType() {
        @Override
        public boolean isNullable() {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType COMPACT_BYTES = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType UNSIGNED_INT32 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
     * then any non-zero value will return true.
     */
    public static final DocumentedType BOOLEAN = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType BYTES = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType STRING = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType INT8 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType INT16 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DocumentedType from superclass Type initializer might lead to class loading deadlock
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
    };

    public static final DocumentedType FLOAT64 = new DocumentedType() {
        @Override
        public void write(ByteBuffer buffer, Object o) {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `clients/src/main/java/org/apache/kafka/common/utils/Sanitizer.java`
#### Snippet
```java
     * using {@link #sanitize(String)} are safe for JMX and hence included here.
     */
    private static final Pattern MBEAN_PATTERN = Pattern.compile("[\\w-%\\. \t]*");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `clients/src/main/java/org/apache/kafka/common/config/ConfigTransformer.java`
#### Snippet
```java
 */
public class ConfigTransformer {
    public static final Pattern DEFAULT_PATTERN = Pattern.compile("\\$\\{([^}]*?):(([^}]*?):)?([^}]*?)\\}");
    private static final String EMPTY_PATH = "";

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
    // This matches URIs of formats: host:port and protocol:\\host:port
    // IPv6 is supported with [ip] pattern
    private static final Pattern HOST_PORT_PATTERN = Pattern.compile(".*?\\[?([0-9a-zA-Z\\-%._:]*)\\]?:([0-9]+)");

    private static final Pattern VALID_HOST_CHARACTERS = Pattern.compile("([0-9a-zA-Z\\-%._:]*)");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosShortNamer.java`
#### Snippet
```java
     * A pattern for parsing a auth_to_local rule.
     */
    private static final Pattern RULE_PARSER = Pattern.compile("((DEFAULT)|((RULE:\\[(\\d*):([^\\]]*)](\\(([^)]*)\\))?(s/([^/]*)/([^/]*)/(g)?)?/?(L|U)?)))");

    /* Rules for the translation of the principal name into an operating system name */
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerClientInitialResponse.java`
#### Snippet
```java

    private static final String KVPAIRS = String.format("(%s=%s%s)*", KEY, VALUE, SEPARATOR);
    private static final Pattern AUTH_PATTERN = Pattern.compile("(?<scheme>[\\w]+)[ ]+(?<token>[-_\\.a-zA-Z0-9]+)");
    private static final Pattern CLIENT_INITIAL_RESPONSE_PATTERN = Pattern.compile(
            String.format("n,(a=(?<authzid>%s))?,%s(?<kvpairs>%s)%s", SASLNAME, SEPARATOR, KVPAIRS, SEPARATOR));
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/RestServer.java`
#### Snippet
```java
    private static final String ADMIN_SERVER_CONNECTOR_NAME = "Admin";

    private static final Pattern LISTENER_PATTERN = Pattern.compile("^(.*)://\\[?([0-9a-zA-Z\\-%._:]*)\\]?:(-?[0-9]+)");
    private static final long GRACEFUL_SHUTDOWN_TIMEOUT_MS = 60 * 1000;

```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `trogdor/src/main/java/org/apache/kafka/trogdor/common/StringExpander.java`
#### Snippet
```java
public class StringExpander {
    private final static Pattern NUMERIC_RANGE_PATTERN =
        Pattern.compile("(.*)\\[([0-9]*)\\-([0-9]*)\\](.*)");

    public static HashSet<String> expand(String val) {
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `trogdor/src/main/java/org/apache/kafka/trogdor/common/StringExpander.java`
#### Snippet
```java
public class StringExpander {
    private final static Pattern NUMERIC_RANGE_PATTERN =
        Pattern.compile("(.*)\\[([0-9]*)\\-([0-9]*)\\](.*)");

    public static HashSet<String> expand(String val) {
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `server-common/src/main/java/org/apache/kafka/timeline/BaseHashTable.java`
#### Snippet
```java
     * Expand the hash table to a new size.  Existing elements will be copied to new slots.
     */
    final private void rehash(int newSize) {
        Object[] prevElements = elements;
        elements = new Object[newSize];
```

## RuleId[id=Deprecation]
### Deprecation
'mapAsScalaMap(java.util.Map)' is deprecated
in `core/src/main/java/kafka/server/ReplicaFetcherTierStateMachine.java`
#### Snippet
```java
        Map<TopicPartition, OffsetForLeaderPartition> partitionsWithEpochs = new HashMap<>();
        partitionsWithEpochs.put(partition, new OffsetForLeaderPartition().setPartition(partition.partition()).setCurrentLeaderEpoch(currentLeaderEpoch).setLeaderEpoch(previousEpoch));
        Option<EpochEndOffset> maybeEpochEndOffset = leader.fetchEpochEndOffsets(JavaConverters.mapAsScalaMap(partitionsWithEpochs)).get(partition);
        if (maybeEpochEndOffset.isEmpty()) {
            throw new KafkaException("No response received for partition: " + partition);
```

### Deprecation
'asJavaIterator(scala.collection.Iterator)' is deprecated
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

        // Search in local segments
        collectAbortedTransactionInLocalSegments(startOffset, upperBoundOffset, accumulator, JavaConverters.asJavaIterator(log.logSegments().iterator()));
    }

```

### Deprecation
'Provider(java.lang.String, double, java.lang.String)' is deprecated
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslClientProvider.java`
#### Snippet
```java

    protected OAuthBearerSaslClientProvider() {
        super("SASL/OAUTHBEARER Client Provider", 1.0, "SASL/OAUTHBEARER Client Provider for Kafka");
        put("SaslClientFactory." + OAuthBearerLoginModule.OAUTHBEARER_MECHANISM,
                OAuthBearerSaslClientFactory.class.getName());
```

### Deprecation
'Provider(java.lang.String, double, java.lang.String)' is deprecated
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerSaslServerProvider.java`
#### Snippet
```java

    protected OAuthBearerSaslServerProvider() {
        super("SASL/OAUTHBEARER Server Provider", 1.0, "SASL/OAUTHBEARER Server Provider for Kafka");
        put("SaslServerFactory." + OAuthBearerLoginModule.OAUTHBEARER_MECHANISM,
                OAuthBearerSaslServerFactory.class.getName());
```

### Deprecation
'alterConfigs(java.util.Map)' is deprecated
in `clients/src/main/java/org/apache/kafka/clients/admin/AlterConfigsResult.java`
#### Snippet
```java

/**
 * The result of the {@link Admin#alterConfigs(Map)} call.
 *
 * The API of this class is evolving, see {@link Admin} for details.
```

### Deprecation
'alterConfigs(java.util.Map)' is deprecated
in `clients/src/main/java/org/apache/kafka/clients/admin/AlterConfigsOptions.java`
#### Snippet
```java

/**
 * Options for {@link Admin#incrementalAlterConfigs(Map)} and {@link Admin#alterConfigs(Map)}.
 *
 * The API of this class is evolving, see {@link Admin} for details.
```

### Deprecation
'org.apache.kafka.common.KafkaFuture.Function' is deprecated
in `clients/src/main/java/org/apache/kafka/clients/admin/Admin.java`
#### Snippet
```java
 * However, the {@link KafkaFuture KafkaFutures} returned from request methods are executed
 * by a single thread so it is important that any code which executes on that thread when they complete
 * (using {@link KafkaFuture#thenApply(KafkaFuture.Function)}, for example) doesn't block
 * for too long. If necessary, processing of results should be passed to another thread.
 * <p>
```

### Deprecation
'CACHE_MAX_BYTES_BUFFERING_CONFIG' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/TopologyConfig.java`
#### Snippet
```java
import static org.apache.kafka.streams.StreamsConfig.BUFFERED_RECORDS_PER_PARTITION_CONFIG;
import static org.apache.kafka.streams.StreamsConfig.BUFFERED_RECORDS_PER_PARTITION_DOC;
import static org.apache.kafka.streams.StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG;
import static org.apache.kafka.streams.StreamsConfig.CACHE_MAX_BYTES_BUFFERING_DOC;
import static org.apache.kafka.streams.StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG;
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ChangeLoggingKeyValueBytesStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        this.context = asInternalProcessorContext(context);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingSessionStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context, final StateStore root) {
        initInternal(asInternalProcessorContext(context));
        super.init(context, root);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredWindowStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        this.context = context instanceof InternalProcessorContext ? (InternalProcessorContext<?, ?>) context : null;
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ChangeLoggingWindowBytesStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        this.context = asInternalProcessorContext(context);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBTimeOrderedKeyValueBuffer.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context, final StateStore root) {
        wrapped().init(context, wrapped());
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/TimeOrderedCachingWindowStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context, final StateStore root) {
        initInternal(asInternalProcessorContext(context));
        super.init(context, root);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context, final StateStore root) {
        final String changelogTopic = ProcessorContextUtils.changelogFor(context, name(), Boolean.TRUE);
        initInternal(asInternalProcessorContext(context), changelogTopic);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredSessionStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        this.context = context instanceof InternalProcessorContext ? (InternalProcessorContext<?, ?>) context : null;
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ChangeLoggingSessionBytesStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context, final StateStore root) {
        this.context = asInternalProcessorContext(context);
        super.init(context, root);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredVersionedKeyValueStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context, final StateStore root) {
        internal.init(context, root);
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.MeteredKeyValueStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredVersionedKeyValueStore.java`
#### Snippet
```java
        @Deprecated
        @Override
        protected void initStoreSerde(final ProcessorContext context) {
            super.initStoreSerde(context);

```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/TransformerSupplier.java`
#### Snippet
```java
 *            arbitrarily)
 * @see Transformer
 * @see KStream#transform(TransformerSupplier, String...)
 * @see ValueTransformer
 * @see ValueTransformerSupplier
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/TransformerSupplier.java`
#### Snippet
```java
 * @see ValueTransformer
 * @see ValueTransformerSupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 */
public interface TransformerSupplier<K, V, R> extends ConnectedStoreProvider, Supplier<Transformer<K, V, R>> {
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredKeyValueStore.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        this.context = context instanceof InternalProcessorContext ? (InternalProcessorContext) context : null;
```

### Deprecation
'grace(java.time.Duration)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindowedKStream.java`
#### Snippet
```java
 * Furthermore, updates to the store are sent downstream into a windowed {@link KTable} changelog stream, where
 * "windowed" implies that the {@link KTable} key is a combined key of the original record key and a window ID.
 * New events are added to {@link TimeWindows} until their grace period ends (see {@link TimeWindows#grace(Duration)}).
 * <p>
 * A {@code TimeWindowedKStream} must be obtained from a {@link KGroupedStream} via
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformer.java`
#### Snippet
```java
 * @see ValueTransformerSupplier
 * @see ValueTransformerWithKeySupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformer.java`
#### Snippet
```java
 * @see ValueTransformerWithKeySupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
 */
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformer.java`
#### Snippet
```java
    /**
     * Transform the given value to a new value.
     * Additionally, any {@link StateStore} that is {@link KStream#transformValues(ValueTransformerSupplier, String...)
     * attached} to this operator can be accessed and modified arbitrarily (cf.
     * {@link ProcessorContext#getStateStore(String)}).
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKey.java`
#### Snippet
```java
    /**
     * Transform the given [key and] value to a new value.
     * Additionally, any {@link StateStore} that is {@link KStream#transformValues(ValueTransformerWithKeySupplier, String...)
     * attached} to this operator can be accessed and modified arbitrarily (cf.
     * {@link ProcessorContext#getStateStore(String)}).
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKey.java`
#### Snippet
```java
 * @see ValueTransformer
 * @see ValueTransformerWithKeySupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKey.java`
#### Snippet
```java
 * @see ValueTransformerWithKeySupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
 */
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKeySupplier.java`
#### Snippet
```java
 * @see ValueTransformer
 * @see ValueTransformerWithKey
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKeySupplier.java`
#### Snippet
```java
 * @see ValueTransformerWithKey
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
 * @see TransformerSupplier
```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKeySupplier.java`
#### Snippet
```java
 * @see Transformer
 * @see TransformerSupplier
 * @see KStream#transform(TransformerSupplier, String...)
 */
public interface ValueTransformerWithKeySupplier<K, V, VR> extends ConnectedStoreProvider, Supplier<ValueTransformerWithKey<K, V, VR>> {
```

### Deprecation
Overrides deprecated method in 'org.rocksdb.Options'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBGenericOptionsToDbOptionsColumnFamilyOptionsAdapter.java`
#### Snippet
```java
    @Deprecated
    @Override
    public int maxBackgroundCompactions() {
        return dbOptions.maxBackgroundCompactions();
    }
```

### Deprecation
Overrides deprecated method in 'org.rocksdb.Options'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBGenericOptionsToDbOptionsColumnFamilyOptionsAdapter.java`
#### Snippet
```java
    @Deprecated
    @Override
    public Options setMaxBackgroundFlushes(final int maxBackgroundFlushes) {
        dbOptions.setMaxBackgroundFlushes(maxBackgroundFlushes);
        return this;
```

### Deprecation
Overrides deprecated method in 'org.rocksdb.Options'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBGenericOptionsToDbOptionsColumnFamilyOptionsAdapter.java`
#### Snippet
```java
    @Deprecated
    @Override
    public int maxBackgroundFlushes() {
        return dbOptions.maxBackgroundFlushes();
    }
```

### Deprecation
Overrides deprecated method in 'org.rocksdb.Options'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBGenericOptionsToDbOptionsColumnFamilyOptionsAdapter.java`
#### Snippet
```java
    @Deprecated
    @Override
    public Options setMaxBackgroundCompactions(final int maxBackgroundCompactions) {
        dbOptions.setMaxBackgroundCompactions(maxBackgroundCompactions);
        return this;
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerSupplier.java`
#### Snippet
```java
 * @see ValueTransformerWithKey
 * @see ValueTransformerWithKeySupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerSupplier.java`
#### Snippet
```java
 * @see ValueTransformerWithKeySupplier
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see Transformer
 * @see TransformerSupplier
```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerSupplier.java`
#### Snippet
```java
 * @see Transformer
 * @see TransformerSupplier
 * @see KStream#transform(TransformerSupplier, String...)
 */
public interface ValueTransformerSupplier<V, VR> extends ConnectedStoreProvider {
```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/Transformer.java`
#### Snippet
```java
    /**
     * Transform the record with the given key and value.
     * Additionally, any {@link StateStore state} that is {@link KStream#transform(TransformerSupplier, String...)
     * attached} to this operator can be accessed and modified
     * arbitrarily (cf. {@link ProcessorContext#getStateStore(String)}).
```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/Transformer.java`
#### Snippet
```java
 *            arbitrarily)
 * @see TransformerSupplier
 * @see KStream#transform(TransformerSupplier, String...)
 * @see ValueTransformer
 * @see KStream#map(KeyValueMapper)
```

### Deprecation
'grace(java.time.Duration)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindowedCogroupedKStream.java`
#### Snippet
```java
 * Furthermore, updates to the store are sent downstream into a windowed {@link KTable} changelog stream, where
 * "windowed" implies that the {@link KTable} key is a combined key of the original record key and a window ID.
 * New events are added to windows until their grace period ends (see {@link TimeWindows#grace(Duration)}).
 * <p>
 * A {@code TimeWindowedCogroupedKStream} must be obtained from a {@link CogroupedKStream} via
```

### Deprecation
'grace(java.time.Duration)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindowedCogroupedKStream.java`
#### Snippet
```java
 * Furthermore, updates to the store are sent downstream into a windowed {@link KTable} changelog stream, where
 * "windowed" implies that the {@link KTable} key is a combined key of the original record key and a window ID.
 * New events are added to sessions until their grace period ends (see {@link SessionWindows#grace(Duration)}).
 * <p>
 * A {@code SessionWindowedCogroupedKStream} must be obtained from a {@link CogroupedKStream} via
```

### Deprecation
'CACHE_MAX_BYTES_BUFFERING_CONFIG' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/internals/StreamsConfigUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import static org.apache.kafka.streams.StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG;
import static org.apache.kafka.streams.StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG;

```

### Deprecation
'org.apache.kafka.streams.processor.Processor' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/RecordContext.java`
#### Snippet
```java
/**
 * The context associated with the current record being processed by
 * a {@link org.apache.kafka.streams.processor.Processor}
 */
public interface RecordContext {
```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#process(org.apache.kafka.streams.processor.api.ProcessorSupplier, String...)
 * @see KStream#process(org.apache.kafka.streams.processor.api.ProcessorSupplier, Named, String...)
 * @see KStream#transform(TransformerSupplier, String...)
 * @see KStream#transform(TransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
```

### Deprecation
'transform(org.apache.kafka.streams.kstream.TransformerSupplier\>, org.apache.kafka.streams.kstream.Named, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#process(org.apache.kafka.streams.processor.api.ProcessorSupplier, Named, String...)
 * @see KStream#transform(TransformerSupplier, String...)
 * @see KStream#transform(TransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, Named, String...)
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#transform(TransformerSupplier, String...)
 * @see KStream#transform(TransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier, org.apache.kafka.streams.kstream.Named, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#transform(TransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, Named, String...)
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#transformValues(ValueTransformerSupplier, String...)
 * @see KStream#transformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, Named, String...)
 * @see KStream#flatTransform(TransformerSupplier, String...)
```

### Deprecation
'transformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier, org.apache.kafka.streams.kstream.Named, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#transformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, Named, String...)
 * @see KStream#flatTransform(TransformerSupplier, String...)
 * @see KStream#flatTransform(TransformerSupplier, Named, String...)
```

### Deprecation
'flatTransform(org.apache.kafka.streams.kstream.TransformerSupplier\>\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, Named, String...)
 * @see KStream#flatTransform(TransformerSupplier, String...)
 * @see KStream#flatTransform(TransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, String...)
```

### Deprecation
'flatTransform(org.apache.kafka.streams.kstream.TransformerSupplier\>\>, org.apache.kafka.streams.kstream.Named, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#transformValues(ValueTransformerWithKeySupplier, Named, String...)
 * @see KStream#flatTransform(TransformerSupplier, String...)
 * @see KStream#flatTransform(TransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, Named, String...)
```

### Deprecation
'flatTransformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#flatTransform(TransformerSupplier, String...)
 * @see KStream#flatTransform(TransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, String...)
```

### Deprecation
'flatTransformValues(org.apache.kafka.streams.kstream.ValueTransformerSupplier\>, org.apache.kafka.streams.kstream.Named, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#flatTransform(TransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, Named, String...)
```

### Deprecation
'flatTransformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier\>, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#flatTransformValues(ValueTransformerSupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, Named, String...)
 */
```

### Deprecation
'flatTransformValues(org.apache.kafka.streams.kstream.ValueTransformerWithKeySupplier\>, org.apache.kafka.streams.kstream.Named, java.lang.String...)' is deprecated
in `streams/src/main/java/org/apache/kafka/streams/processor/ConnectedStoreProvider.java`
#### Snippet
```java
 * @see KStream#flatTransformValues(ValueTransformerSupplier, Named, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, String...)
 * @see KStream#flatTransformValues(ValueTransformerWithKeySupplier, Named, String...)
 */
public interface ConnectedStoreProvider {
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/AbstractReadOnlyDecorator.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
```

### Deprecation
Overrides deprecated method in 'org.apache.kafka.streams.state.internals.WrappedStateStore'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/AbstractReadWriteDecorator.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void init(final ProcessorContext context,
                     final StateStore root) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerConfig.java`
#### Snippet
```java
                JoinGroupRequest.validateGroupInstanceId(groupInstanceId);

            String groupInstanceIdPart = groupInstanceId != null ? groupInstanceId : CONSUMER_CLIENT_ID_SEQUENCE.getAndIncrement() + "";
            String generatedClientId = String.format("consumer-%s-%s", groupId, groupInstanceIdPart);
            configs.put(CLIENT_ID_CONFIG, generatedClientId);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `clients/src/main/java/org/apache/kafka/clients/producer/ProducerConfig.java`
#### Snippet
```java
    private static String parseAcks(String acksString) {
        try {
            return acksString.trim().equalsIgnoreCase("all") ? "-1" : Short.parseShort(acksString.trim()) + "";
        } catch (NumberFormatException e) {
            throw new ConfigException("Invalid configuration value for 'acks': " + acksString);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopicConfig.java`
#### Snippet
```java
        if (hasEnforcedNumberOfPartitions()) {
            throw new UnsupportedOperationException("number of partitions are enforced on topic " +
                                                    "" + name() + " and can't be altered.");
        }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `metadata/src/main/java/org/apache/kafka/image/node/ClientQuotaImageNode.java`
#### Snippet
```java
        Double result = image.quotaMap().get(name);
        if (result == null) return null;
        return new MetadataLeafNode(result + "");
    }
}
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metadata/src/main/java/org/apache/kafka/image/AclsDelta.java`
#### Snippet
```java
        return "AclsDelta(isSnapshotDelta=" + isSnapshotDelta +
            ", changes=" + changes.entrySet().stream().
                map(e -> "" + e.getKey() + "=" + e.getValue()).
                collect(Collectors.joining(", ")) + ")";
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metadata/src/main/java/org/apache/kafka/image/node/ProducerIdsImageNode.java`
#### Snippet
```java
    public MetadataNode child(String name) {
        if (name.equals("nextProducerId")) {
            return new MetadataLeafNode(image.nextProducerId() + "");
        } else {
            return null;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
        Properties kafkaProps =  new Properties();
        kafkaProps.put(KafkaConfig$.MODULE$.ZkConnectProp(), "zk");
        kafkaProps.put(KafkaConfig$.MODULE$.BrokerIdProp(), brokerId + "");
        KafkaConfig config = new KafkaConfig(kafkaProps);
        return new KafkaApisBuilder().
```

### TrivialStringConcatenation
Empty string used in concatenation
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private KafkaApis createKafkaApis() {
        Properties kafkaProps =  new Properties();
        kafkaProps.put(KafkaConfig$.MODULE$.NodeIdProp(), brokerId + "");
        kafkaProps.put(KafkaConfig$.MODULE$.ProcessRolesProp(), "broker");
        kafkaProps.put(KafkaConfig$.MODULE$.QuorumVotersProp(), "9000@foo:8092");
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java

    public Selector(long connectionMaxIdleMS, int failedAuthenticationDelayMs, Metrics metrics, Time time, String metricGrpPrefix, ChannelBuilder channelBuilder, LogContext logContext) {
        this(NetworkReceive.UNLIMITED, connectionMaxIdleMS, failedAuthenticationDelayMs, metrics, time, metricGrpPrefix, Collections.<String, String>emptyMap(), true, channelBuilder, logContext);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `clients/src/main/java/org/apache/kafka/clients/admin/MemberAssignment.java`
#### Snippet
```java
     */
    public MemberAssignment(Set<TopicPartition> topicPartitions) {
        this.topicPartitions = topicPartitions == null ? Collections.<TopicPartition>emptySet() :
            Collections.unmodifiableSet(new HashSet<>(topicPartitions));
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerNetworkClient.java`
#### Snippet
```java
        public Iterator<ClientRequest> requestIterator(Node node) {
            ConcurrentLinkedQueue<ClientRequest> requests = unsent.get(node);
            return requests == null ? Collections.<ClientRequest>emptyIterator() : requests.iterator();
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerNetworkClient.java`
#### Snippet
```java
            synchronized (unsent) {
                ConcurrentLinkedQueue<ClientRequest> requests = unsent.remove(node);
                return requests == null ? Collections.<ClientRequest>emptyList() : requests;
            }
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
        this(firstOffset, lastOffset, lastLeaderEpoch, maxTimestamp, offsetOfMaxTimestamp, logAppendTime, logStartOffset,
                recordConversionStats, sourceCompression, targetCompression, shallowCount, validBytes, offsetsMonotonic,
                lastOffsetOfFirstBatch, Collections.<RecordError>emptyList(), null, LeaderHwChange.NONE);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/task/TaskSpec.java`
#### Snippet
```java

    protected Map<String, String> configOrEmptyMap(Map<String, String> config) {
        return (config == null) ? Collections.<String, String>emptyMap() : config;
    }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
    public void createWorker(CreateWorkerRequest request) throws Exception {
        HttpResponse<Empty> resp =
            JsonRestServer.<Empty>httpRequest(
                url("/agent/worker/create"), "POST",
                request, new TypeReference<Empty>() { }, maxTries);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
        uriBuilder.queryParam("workerId", request.workerId());
        HttpResponse<Empty> resp =
            JsonRestServer.<Empty>httpRequest(uriBuilder.build().toString(), "DELETE",
                null, new TypeReference<Empty>() { }, maxTries);
        resp.body();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
    public AgentStatusResponse status() throws Exception {
        HttpResponse<AgentStatusResponse> resp =
            JsonRestServer.<AgentStatusResponse>httpRequest(url("/agent/status"), "GET",
                null, new TypeReference<AgentStatusResponse>() { }, maxTries);
        return resp.body();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
    public void stopWorker(StopWorkerRequest request) throws Exception {
        HttpResponse<Empty> resp =
            JsonRestServer.<Empty>httpRequest(url(
                "/agent/worker/stop"), "PUT",
                request, new TypeReference<Empty>() { }, maxTries);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
    public void invokeShutdown() throws Exception {
        HttpResponse<Empty> resp =
            JsonRestServer.<Empty>httpRequest(url(
                "/agent/shutdown"), "PUT",
                null, new TypeReference<Empty>() { }, maxTries);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
    public CoordinatorStatusResponse status() throws Exception {
        HttpResponse<CoordinatorStatusResponse> resp =
            JsonRestServer.<CoordinatorStatusResponse>httpRequest(url("/coordinator/status"), "GET",
                null, new TypeReference<CoordinatorStatusResponse>() { }, maxTries);
        return resp.body();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
            }
            case "showTasks": {
                TaskStateType taskStateType = res.<TaskStateType>get("taskStateType");
                List<String> taskIds = new ArrayList<>();
                Pattern taskIdPattern = null;
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Method is never used in 'invoke': it's unlikely that 'hashCode', 'equals' and 'toString' are implemented correctly
in `clients/src/main/java/org/apache/kafka/common/utils/LoggingSignalHandler.java`
#### Snippet
```java

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object signal = args[0];
                log.info("Terminating process due to signal {}", signal);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
                private final AtomicInteger sequence = new AtomicInteger();

                public Thread newThread(Runnable r) {
                    return KafkaThread.daemon("kafka-rlm-thread-pool-" + sequence.incrementAndGet(), r);
                }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `raft/src/main/java/org/apache/kafka/raft/Batch.java`
#### Snippet
```java

    @Override
    public Iterator<T> iterator() {
        return records.iterator();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/KafkaFuture.java`
#### Snippet
```java
     */
    @Override
    public abstract T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException,
        TimeoutException;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/ByteBufferInputStream.java`
#### Snippet
```java
    }

    public int read(byte[] bytes, int off, int len) {
        if (len == 0) {
            return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized V replace(K k, V v) {
        if (containsKey(k)) {
            return put(k, v);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashCollection.java`
#### Snippet
```java

        @Override
        public Iterator<E> iterator() {
            return ImplicitLinkedHashCollection.this.iterator();
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashCollection.java`
#### Snippet
```java
     */
    @Override
    final public Iterator<E> iterator() {
        return listIterator(0);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashCollection.java`
#### Snippet
```java

        @Override
        public ListIterator<E> listIterator(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized V replace(K k, V v) {
        if (containsKey(k)) {
            return put(k, v);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized boolean remove(Object k, Object v) {
        if (containsKey(k) && get(k).equals(v)) {
            remove(k);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized boolean replace(K k, V original, V replacement) {
        if (containsKey(k) && get(k).equals(original)) {
            put(k, replacement);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized boolean replace(K k, V original, V replacement) {
        if (containsKey(k) && get(k).equals(original)) {
            put(k, replacement);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized boolean replace(K k, V original, V replacement) {
        if (containsKey(k) && get(k).equals(original)) {
            put(k, replacement);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized V putIfAbsent(K k, V v) {
        if (!containsKey(k))
            return put(k, v);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/CopyOnWriteMap.java`
#### Snippet
```java

    @Override
    public synchronized void putAll(Map<? extends K, ? extends V> entries) {
        Map<K, V> copy = new HashMap<>(this.map);
        copy.putAll(entries);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/ByteBufferOutputStream.java`
#### Snippet
```java
    }

    public void write(byte[] bytes, int off, int len) {
        ensureRemaining(len);
        buffer.put(bytes, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/utils/ThreadUtils.java`
#### Snippet
```java

            @Override
            public Thread newThread(Runnable r) {
                String threadName;
                if (pattern.contains("%d")) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        net.jpountz.util.SafeUtils.checkRange(b, off, len);
        if (finished) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        net.jpountz.util.SafeUtils.checkRange(b, off, len);
        ensureNotFinished();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRecords.java`
#### Snippet
```java

        @Override
        public Iterator<ConsumerRecord<K, V>> iterator() {
            return new AbstractIterator<ConsumerRecord<K, V>>() {
                Iterator<? extends Iterable<ConsumerRecord<K, V>>> iters = iterables.iterator();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractPartitionAssignor.java`
#### Snippet
```java

        @Override
        public int compareTo(MemberInfo otherMemberInfo) {
            if (this.groupInstanceId.isPresent() &&
                    otherMemberInfo.groupInstanceId.isPresent()) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `clients/src/main/java/org/apache/kafka/clients/producer/KafkaProducer.java`
#### Snippet
```java

        @Override
        public RecordMetadata get(long timeout, TimeUnit unit) throws ExecutionException {
            throw this.exception;
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/ConvertingFutureCallback.java`
#### Snippet
```java

    @Override
    public T get(long l, TimeUnit timeUnit)
            throws InterruptedException, ExecutionException, TimeoutException {
        if (!finishedLatch.await(l, timeUnit))
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/errors/WorkerErrantRecordReporter.java`
#### Snippet
```java
        }

        public Void get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
            for (Future<RecordMetadata> future: futures) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/ConnectorOffsetBackingStore.java`
#### Snippet
```java

            @Override
            public Map<ByteBuffer, ByteBuffer> get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                long timeoutMs = unit.toMillis(timeout);
                long endTime = time.milliseconds() + timeoutMs;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `storage/src/main/java/org/apache/kafka/storage/internals/log/RemoteStorageThreadPool.java`
#### Snippet
```java

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, namePrefix + threadNumber.getAndIncrement());
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `streams/src/main/java/org/apache/kafka/streams/processor/TaskId.java`
#### Snippet
```java

    @Override
    public int compareTo(final TaskId other) {
        if (topologyName != null && other.topologyName != null) {
            final int comparingNamedTopologies = topologyName.compareTo(other.topologyName);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/Stamped.java`
#### Snippet
```java

    @Override
    public int compareTo(final Object other) {
        final long otherTimestamp = ((Stamped<?>) other).timestamp;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/util/KafkaScheduler.java`
#### Snippet
```java

        @Override
        public long getDelay(TimeUnit unit) {
            return 0L;
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/util/KafkaScheduler.java`
#### Snippet
```java

        @Override
        public Void get(long timeout, TimeUnit unit) {
            return null;
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/util/timer/TimerTaskList.java`
#### Snippet
```java

    @Override
    public int compareTo(Delayed o) {
        TimerTaskList other = (TimerTaskList) o;
        return Long.compare(getExpiration(), other.getExpiration());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/mutable/BoundedList.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> c) {
        return underlying.containsAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/mutable/BoundedList.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        return underlying.retainAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/mutable/BoundedList.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        return underlying.removeAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/mutable/BoundedList.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a) {
        return underlying.toArray(a);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableSet.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().retainAll(c);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableSet.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a) {
        return underlying().toArray(a);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableSet.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().removeAll(c);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableSet.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().addAll(c);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableSet.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> c) {
        return underlying().containsAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableMap.java`
#### Snippet
```java

    @Override
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().computeIfPresent(key, remappingFunction);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableMap.java`
#### Snippet
```java

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().merge(key, value, remappingFunction);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableMap.java`
#### Snippet
```java

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().merge(key, value, remappingFunction);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableMap.java`
#### Snippet
```java

    @Override
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().computeIfAbsent(key, mappingFunction);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableMap.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        underlying().putAll(m);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableMap.java`
#### Snippet
```java

    @Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        // will throw UnsupportedOperationException; delegate anyway for testability
        return underlying().compute(key, remappingFunction);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashSet.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        boolean modified = false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashSet.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        boolean modified = false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableNavigableSet.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // will throw UnsupportedOperationException
        return underlying().addAll(c);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableNavigableSet.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> c) {
        return underlying().containsAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableNavigableSet.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        // will throw UnsupportedOperationException
        return underlying().retainAll(c);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableNavigableSet.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a) {
        return underlying().toArray(a);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server-common/src/main/java/org/apache/kafka/server/immutable/pcollections/PCollectionsImmutableNavigableSet.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        // will throw UnsupportedOperationException
        return underlying().removeAll(c);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashMap.java`
#### Snippet
```java
        }

        public Iterator<V> iterator() {
            return new ValueIterator(epoch);
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashMap.java`
#### Snippet
```java
        }

        public Iterator<K> iterator() {
            return new KeyIterator(epoch);
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashMap.java`
#### Snippet
```java
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(epoch);
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ChunkedBytesStream.getBufIfOpen()` is ignored
in `clients/src/main/java/org/apache/kafka/common/utils/ChunkedBytesStream.java`
#### Snippet
```java
     */
    public int read(byte[] b, int off, int len) throws IOException {
        getBufIfOpen(); // Check for closed stream
        if ((off | len | (off + len) | (b.length - (off + len))) < 0) {
            throw new IndexOutOfBoundsException();
```

### IgnoreResultOfCall
Result of `ChunkedBytesStream.getBufIfOpen()` is ignored
in `clients/src/main/java/org/apache/kafka/common/utils/ChunkedBytesStream.java`
#### Snippet
```java
    @Override
    public long skip(long toSkip) throws IOException {
        getBufIfOpen(); // Check for closed stream
        if (toSkip <= 0) {
            return 0;
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
    public static void writeFully(FileChannel channel, ByteBuffer sourceBuffer) throws IOException {
        while (sourceBuffer.hasRemaining())
            channel.write(sourceBuffer);
    }

```

### IgnoreResultOfCall
Result of `ThreadPoolExecutor.awaitTermination()` is ignored
in `clients/src/main/java/org/apache/kafka/common/metrics/Metrics.java`
#### Snippet
```java
            this.metricsScheduler.shutdown();
            try {
                this.metricsScheduler.awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException ex) {
                // ignore and continue shutdown
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractCoordinator.java`
#### Snippet
```java
                this.failed.set(e);
            } catch (InterruptedException | InterruptException e) {
                Thread.interrupted();
                log.error("Unexpected interrupt received in heartbeat thread", e);
                this.failed.set(new RuntimeException(e));
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorUtils.java`
#### Snippet
```java
            log.info("Created topic '{}'", topicName);
        } catch (InterruptedException e) {
            Thread.interrupted();
            throw new ConnectException("Interrupted while attempting to create/find topic '" + topicName + "'", e);
        } catch (ExecutionException e) {
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/TopicAdmin.java`
#### Snippet
```java
                }
            } catch (InterruptedException e) {
                Thread.interrupted();
                String msg = String.format("Interrupted while attempting to describe topic configs '%s'", topicNameList);
                throw new RetriableException(msg, e);
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/TopicAdmin.java`
#### Snippet
```java
                throw new ConnectException("Error while attempting to describe topics '" + topicNameList + "'", e);
            } catch (InterruptedException e) {
                Thread.interrupted();
                throw new RetriableException("Interrupted while attempting to describe topics '" + topicNameList + "'", e);
            }
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/TopicAdmin.java`
#### Snippet
```java
                throw new ConnectException("Error while attempting to create/find topic(s) '" + topicNameList + "'", e);
            } catch (InterruptedException e) {
                Thread.interrupted();
                throw new ConnectException("Interrupted while attempting to create/find topic(s) '" + topicNameList + "'", e);
            }
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/TopicAdmin.java`
#### Snippet
```java
                }
            } catch (InterruptedException e) {
                Thread.interrupted();
                String msg = String.format("Interrupted while attempting to read end offsets for topic '%s' on brokers at %s", partition.topic(), bootstrapServers);
                throw new RetriableException(msg, e);
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/AbstractWorkerSourceTask.java`
#### Snippet
```java
                log.trace("{} About to send {} records to Kafka", this, toSend.size());
                if (!sendRecords()) {
                    stopRequestedLatch.await(SEND_FAILED_BACKOFF_MS, TimeUnit.MILLISECONDS);
                }
            }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
        log.debug("Sleeping for up to {} millis", delay);
        try {
            stopRequestedLatch.await(delay, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            return;
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `storage/src/main/java/org/apache/kafka/server/log/remote/metadata/storage/RemoteLogMetadataSnapshotFile.java`
#### Snippet
```java
            // Write header
            headerBuffer.flip();
            fileChannel.write(headerBuffer);

            // Write each entry
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `storage/src/main/java/org/apache/kafka/server/log/remote/metadata/storage/RemoteLogMetadataSnapshotFile.java`
#### Snippet
```java

                // Write entry bytes
                fileChannel.write(ByteBuffer.wrap(serializedBytes));
            }

```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateManager.java`
#### Snippet
```java

        try (FileChannel fileChannel = FileChannel.open(file.toPath(), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            fileChannel.write(buffer);
            fileChannel.force(true);
        }
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ClientUtils.java`
#### Snippet
```java
                throw new StreamsException(msg, cause);
            } catch (final InterruptedException e) {
                Thread.interrupted();
                final String msg = String.format("Interrupted while attempting to read end offsets for partition '%s'", partition.toString());
                throw new StreamsException(msg, e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/JsonRestServer.java`
#### Snippet
```java
    public void waitForShutdown() throws InterruptedException {
        while (!shutdownExecutor.isShutdown()) {
            shutdownExecutor.awaitTermination(1, TimeUnit.DAYS);
        }
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/WorkerManager.java`
#### Snippet
```java
    public void waitForShutdown() throws Exception {
        while (!shutdownExecutor.isShutdown()) {
            shutdownExecutor.awaitTermination(1, TimeUnit.DAYS);
        }
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/WorkerManager.java`
#### Snippet
```java
                stateChangeExecutor.shutdownNow();
                log.info("{}: Waiting for workerCleanupExecutor to terminate...", nodeName);
                workerCleanupExecutor.awaitTermination(1, TimeUnit.DAYS);
                log.info("{}: Waiting for stateChangeExecutor to terminate...", nodeName);
                stateChangeExecutor.awaitTermination(1, TimeUnit.DAYS);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/WorkerManager.java`
#### Snippet
```java
                workerCleanupExecutor.awaitTermination(1, TimeUnit.DAYS);
                log.info("{}: Waiting for stateChangeExecutor to terminate...", nodeName);
                stateChangeExecutor.awaitTermination(1, TimeUnit.DAYS);
                log.info("{}: Shutting down shutdownExecutor.", nodeName);
                shutdownExecutor.shutdown();
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConnectionStressWorker.java`
#### Snippet
```java
        this.statusUpdaterFuture.cancel(false);
        this.statusUpdaterExecutor.shutdown();
        this.statusUpdaterExecutor.awaitTermination(1, TimeUnit.DAYS);
        this.statusUpdaterExecutor = null;
        new StatusUpdater().run();
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConnectionStressWorker.java`
#### Snippet
```java
        doneFuture.complete("");
        workerExecutor.shutdownNow();
        workerExecutor.awaitTermination(1, TimeUnit.DAYS);
        this.workerExecutor = null;
        this.status = null;
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
        doneFuture.complete("");
        executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.DAYS);
        consumer.close();
        this.consumer = null;
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/SustainedConnectionWorker.java`
#### Snippet
```java
        this.statusUpdaterFuture.cancel(false);
        this.statusUpdaterExecutor.shutdown();
        this.statusUpdaterExecutor.awaitTermination(1, TimeUnit.HOURS);
        this.statusUpdaterExecutor = null;
        new StatusUpdater().run();
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/SustainedConnectionWorker.java`
#### Snippet
```java
        }
        workerExecutor.shutdownNow();
        workerExecutor.awaitTermination(1, TimeUnit.HOURS);
        this.workerExecutor = null;
        this.status = null;
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ExternalCommandWorker.java`
#### Snippet
```java
        if (!executor.awaitTermination(shutdownGracePeriodMs, TimeUnit.MILLISECONDS)) {
            terminatorActionQueue.add(TerminatorAction.DESTROY_FORCIBLY);
            executor.awaitTermination(1, TimeUnit.DAYS);
        }
        this.status = null;
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchWorker.java`
#### Snippet
```java
        doneFuture.complete("");
        executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.DAYS);
        this.executor = null;
        this.status = null;
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/RoundTripWorker.java`
#### Snippet
```java
        doneFuture.complete("");
        executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.DAYS);
        Utils.closeQuietly(consumer, "consumer");
        Utils.closeQuietly(producer, "producer");
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConfigurableProducerWorker.java`
#### Snippet
```java
        doneFuture.complete("");
        executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.DAYS);
        this.executor = null;
        this.status = null;
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/NodeManager.java`
#### Snippet
```java

    public void waitForShutdown() throws InterruptedException {
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
```

### IgnoreResultOfCall
Result of `InetAddress.getByName()` is ignored
in `metadata/src/main/java/org/apache/kafka/controller/ClientQuotaControlManager.java`
#### Snippet
```java
        if (ip == null) return true;
        try {
            InetAddress.getByName(ip);
            return true;
        } catch (UnknownHostException e) {
```

### IgnoreResultOfCall
Result of `Condition.awaitNanos()` is ignored
in `server-common/src/main/java/org/apache/kafka/queue/KafkaEventQueue.java`
#### Snippet
```java
                    } else {
                        try {
                            cond.awaitNanos(awaitNs);
                        } catch (InterruptedException e) {
                            log.warn("Interrupted while waiting for a deferred event. " +
```

### IgnoreResultOfCall
Result of `ThreadPoolExecutor.awaitTermination()` is ignored
in `server-common/src/main/java/org/apache/kafka/server/util/KafkaScheduler.java`
#### Snippet
```java
        }
        if (maybeExecutor != null)
            maybeExecutor.awaitTermination(1, TimeUnit.DAYS);
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `otherValueSerde()` is identical to its super method
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/JoinedInternal.java`
#### Snippet
```java
    }

    public Serde<VO> otherValueSerde() {
        return otherValueSerde;
    }
```

### RedundantMethodOverride
Method `keySerde()` is identical to its super method
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/JoinedInternal.java`
#### Snippet
```java
    }

    public Serde<K> keySerde() {
        return keySerde;
    }
```

### RedundantMethodOverride
Method `valueSerde()` is identical to its super method
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/JoinedInternal.java`
#### Snippet
```java
    }

    public Serde<V> valueSerde() {
        return valueSerde;
    }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamSlidingWindowAggregate.java`
#### Snippet
```java

        @Override
        public void close() {}

        @Override
```

### RedundantMethodOverride
Method `toString()` is identical to its super method
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/SourceNode.java`
#### Snippet
```java
     */
    @Override
    public String toString() {
        return toString("");
    }
```

### RedundantMethodOverride
Method `describe()` is identical to its super method
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java`
#### Snippet
```java

        @Override
        Processor describe() {
            return new Processor(name, new HashSet<>(stateStoreNames));
        }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountTransformerDemo.java`
#### Snippet
```java

                @Override
                public void close() {}
            };
        }
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasRequest.java`
#### Snippet
```java
            for (ClientQuotaFilterComponent component : filter.components()) {
                ComponentData fd = new ComponentData().setEntityType(component.entityType());
                if (component.match() == null) {
                    fd.setMatchType(MATCH_TYPE_SPECIFIED);
                    fd.setMatch(null);
```

### OptionalAssignedToNull
Optional value is compared with null
in `clients/src/main/java/org/apache/kafka/clients/admin/ConsumerGroupListing.java`
#### Snippet
```java
        if (isSimpleConsumerGroup != other.isSimpleConsumerGroup)
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
```

### OptionalAssignedToNull
Optional value is compared with null
in `clients/src/main/java/org/apache/kafka/clients/admin/ConsumerGroupListing.java`
#### Snippet
```java
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
```

### OptionalAssignedToNull
Optional value is compared with null
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/TasksRequest.java`
#### Snippet
```java
        this.firstEndMs = Math.max(0, firstEndMs);
        this.lastEndMs = Math.max(0, lastEndMs);
        this.state = state == null ? Optional.empty() : state;
    }

```

### OptionalAssignedToNull
Optional value is compared with null
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchSpec.java`
#### Snippet
```java
        this.valueGenerator = valueGenerator == null ?
            new ConstantPayloadGenerator(512, new byte[0]) : valueGenerator;
        this.transactionGenerator = txGenerator == null ? Optional.empty() : txGenerator;
        this.producerConf = configOrEmptyMap(producerConf);
        this.commonClientConf = configOrEmptyMap(commonClientConf);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Map.Entry;`
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
```

## RuleId[id=ExcessiveLambdaUsage]
### ExcessiveLambdaUsage
Excessive lambda usage
in `metadata/src/main/java/org/apache/kafka/metadata/authorizer/StandardAuthorizer.java`
#### Snippet
```java
        for (Endpoint endpoint : serverInfo.endpoints()) {
            if (serverInfo.earlyStartListeners().contains(
                    endpoint.listenerName().orElseGet(() -> ""))) {
                result.put(endpoint, CompletableFuture.completedFuture(null));
            } else {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `restoringPartitions` are updated, but never queried
in `streams/test-utils/src/main/java/org/apache/kafka/streams/TopologyTestDriver.java`
#### Snippet
```java

    static class MockChangelogRegister implements ChangelogRegister {
        private final Set<TopicPartition> restoringPartitions = new HashSet<>();

        @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `topicIds` are updated, but never queried
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetchsession/FetchSessionBenchmark.java`
#### Snippet
```java
    private LinkedHashMap<TopicPartition, FetchRequest.PartitionData> fetches;
    private FetchSessionHandler handler;
    private Map<String, Uuid> topicIds;

    @Setup(Level.Trial)
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`buffer[offset] << 0` can be replaced with 'buffer\[offset\]'
in `clients/src/main/java/org/apache/kafka/common/utils/ByteUtils.java`
#### Snippet
```java
     */
    public static int readUnsignedIntLE(byte[] buffer, int offset) {
        return (buffer[offset] << 0 & 0xff)
                | ((buffer[offset + 1] & 0xff) << 8)
                | ((buffer[offset + 2] & 0xff) << 16)
```

### PointlessBitwiseExpression
`bd >>> 0` can be replaced with 'bd'
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java

        public static BD fromByte(byte bd) {
            int reserved2 = (bd >>> 0) & 15;
            int blockMaximumSize = (bd >>> 4) & 7;
            int reserved3 = (bd >>> 7) & 1;
```

### PointlessBitwiseExpression
`flg >>> 0` can be replaced with 'flg'
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java

        public static FLG fromByte(byte flg) {
            int reserved = (flg >>> 0) & 3;
            int contentChecksum = (flg >>> 2) & 1;
            int contentSize = (flg >>> 3) & 1;
```

### PointlessBitwiseExpression
`(reserved2 & 15) << 0` can be replaced with '(reserved2 \& 15)'
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java

        public byte toByte() {
            return (byte) (((reserved2 & 15) << 0) | ((blockSizeValue & 7) << 4) | ((reserved3 & 1) << 7));
        }
    }
```

### PointlessBitwiseExpression
`(reserved & 3) << 0` can be replaced with '(reserved \& 3)'
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java

        public byte toByte() {
            return (byte) (((reserved & 3) << 0) | ((contentChecksum & 1) << 2)
                    | ((contentSize & 1) << 3) | ((blockChecksum & 1) << 4) | ((blockIndependence & 1) << 5) | ((version & 3) << 6));
        }
```

### PointlessBitwiseExpression
`0xffffffff & ((i * 2862933555777941757L) + 3037000493L)` can be replaced with '((i \* 2862933555777941757L) + 3037000493L)'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/timeline/TimelineHashMapBenchmark.java`
#### Snippet
```java
        HashMap<Integer, String> map = new HashMap<>(NUM_ENTRIES);
        for (int i = 0; i < NUM_ENTRIES; i++) {
            int key = (int) (0xffffffff & ((i * 2862933555777941757L) + 3037000493L));
            map.put(key, String.valueOf(key));
        }
```

### PointlessBitwiseExpression
`0xffffffff & ((i * 2862933555777941757L) + 3037000493L)` can be replaced with '((i \* 2862933555777941757L) + 3037000493L)'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/timeline/TimelineHashMapBenchmark.java`
#### Snippet
```java
        int j = 0;
        for (int i = 0; i < NUM_ENTRIES; i++) {
            int key = (int) (0xffffffff & ((i * 2862933555777941757L) + 3037000493L));
            if (j > 10 && key % 3 == 0) {
                snapshotRegistry.deleteSnapshotsUpTo(epoch - 1000);
```

### PointlessBitwiseExpression
`0xffffffff & ((i * 2862933555777941757L) + 3037000493L)` can be replaced with '((i \* 2862933555777941757L) + 3037000493L)'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/timeline/TimelineHashMapBenchmark.java`
#### Snippet
```java
            new TimelineHashMap<>(snapshotRegistry, NUM_ENTRIES);
        for (int i = 0; i < NUM_ENTRIES; i++) {
            int key = (int) (0xffffffff & ((i * 2862933555777941757L) + 3037000493L));
            map.put(key, String.valueOf(key));
        }
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `metadata/src/main/java/org/apache/kafka/image/node/ClientQuotasImageNode.java`
#### Snippet
```java
                char c = input.charAt(i++);
                if (escaping) {
                    value += c;
                    escaping = false;
                } else {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `metadata/src/main/java/org/apache/kafka/image/node/ClientQuotasImageNode.java`
#### Snippet
```java
                            break;
                        default:
                            value += c;
                            break;
                    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `8` assigned to `localCrc` is never used
in `clients/src/main/java/org/apache/kafka/common/utils/PureJavaCrc32C.java`
#### Snippet
```java
            final int c1 = (b[off + 1] ^ (localCrc >>>= 8)) & 0xff;
            final int c2 = (b[off + 2] ^ (localCrc >>>= 8)) & 0xff;
            final int c3 = (b[off + 3] ^ (localCrc >>>= 8)) & 0xff;
            localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
                    ^ (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### UnusedAssignment
The value changed at `off++` is never used
in `clients/src/main/java/org/apache/kafka/common/utils/PureJavaCrc32C.java`
#### Snippet
```java
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 1:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            default:
        /* nothing */
```

### UnusedAssignment
Variable `alive` initializer `true` is redundant
in `clients/src/main/java/org/apache/kafka/common/memory/GarbageCollectedMemoryPool.java`
#### Snippet
```java
    private final GarbageCollectionListener gcListener = new GarbageCollectionListener();
    private final Thread gcListenerThread;
    private volatile boolean alive = true;

    public GarbageCollectedMemoryPool(long sizeBytes, int maxSingleAllocationSize, boolean strict, Sensor oomPeriodSensor) {
```

### UnusedAssignment
Variable `uncompressedRecordsSizeInBytes` initializer `0` is redundant
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
    private short producerEpoch;
    private int baseSequence;
    private int uncompressedRecordsSizeInBytes = 0; // Number of bytes (excluding the header) written before compression
    private int numRecords = 0;
    private float actualCompressionRatio = 1;
```

### UnusedAssignment
Variable `maxTimestamp` initializer `RecordBatch.NO_TIMESTAMP` is redundant
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
    private int numRecords = 0;
    private float actualCompressionRatio = 1;
    private long maxTimestamp = RecordBatch.NO_TIMESTAMP;
    private long deleteHorizonMs;
    private long offsetOfMaxTimestamp = -1;
```

### UnusedAssignment
Variable `actualCompressionRatio` initializer `1` is redundant
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
    private int uncompressedRecordsSizeInBytes = 0; // Number of bytes (excluding the header) written before compression
    private int numRecords = 0;
    private float actualCompressionRatio = 1;
    private long maxTimestamp = RecordBatch.NO_TIMESTAMP;
    private long deleteHorizonMs;
```

### UnusedAssignment
Variable `numRecords` initializer `0` is redundant
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
    private int baseSequence;
    private int uncompressedRecordsSizeInBytes = 0; // Number of bytes (excluding the header) written before compression
    private int numRecords = 0;
    private float actualCompressionRatio = 1;
    private long maxTimestamp = RecordBatch.NO_TIMESTAMP;
```

### UnusedAssignment
Variable `allowableClockSkewMs` initializer `0` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerUnsecuredValidatorCallbackHandler.java`
#### Snippet
```java
    private int allowableClockSkewMs() {
        String allowableClockSkewMsValue = option(ALLOWABLE_CLOCK_SKEW_MILLIS_OPTION);
        int allowableClockSkewMs = 0;
        try {
            allowableClockSkewMs = Utils.isBlank(allowableClockSkewMsValue) ? 0 : Integer.parseInt(allowableClockSkewMsValue.trim());
```

### UnusedAssignment
Variable `sessionLifetimeMsToUse` initializer `0` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientAuthenticator.java`
#### Snippet
```java
        public void setAuthenticationEndAndSessionReauthenticationTimes(long nowNanos) {
            authenticationEndNanos = nowNanos;
            long sessionLifetimeMsToUse = 0;
            if (positiveSessionLifetimeMs != null) {
                // pick a random percentage between 85% and 95% for session re-authentication
```

### UnusedAssignment
Variable `producerIdAndEpoch` initializer `null` is redundant
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java

    private boolean shouldStopDrainBatchesForPartition(ProducerBatch first, TopicPartition tp) {
        ProducerIdAndEpoch producerIdAndEpoch = null;
        if (transactionManager != null) {
            if (!transactionManager.isSendToPartitionAllowed(tp))
```

### UnusedAssignment
The value changed at `orderInGroup++` is never used
in `connect/json/src/main/java/org/apache/kafka/connect/json/JsonConverterConfig.java`
#### Snippet
```java
                      orderInGroup++, Width.MEDIUM, SCHEMAS_ENABLE_DISPLAY);
        CONFIG.define(SCHEMAS_CACHE_SIZE_CONFIG, Type.INT, SCHEMAS_CACHE_SIZE_DEFAULT, Importance.HIGH, SCHEMAS_CACHE_SIZE_DOC, group,
                      orderInGroup++, Width.MEDIUM, SCHEMAS_CACHE_SIZE_DISPLAY);

        group = "Serialization";
```

### UnusedAssignment
The value changed at `orderInGroup++` is never used
in `connect/json/src/main/java/org/apache/kafka/connect/json/JsonConverterConfig.java`
#### Snippet
```java
        CONFIG.define(
                REPLACE_NULL_WITH_DEFAULT_CONFIG, Type.BOOLEAN, REPLACE_NULL_WITH_DEFAULT_DEFAULT,
                Importance.LOW, REPLACE_NULL_WITH_DEFAULT_DOC, group, orderInGroup++,
                Width.MEDIUM, REPLACE_NULL_WITH_DEFAULT_DISPLAY);
    }
```

### UnusedAssignment
Variable `lastError` initializer `null` is redundant
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/RetryUtil.java`
#### Snippet
```java
        final long end = time.milliseconds() + timeoutMs;
        int attempt = 0;
        Throwable lastError = null;
        do {
            attempt++;
```

### UnusedAssignment
The value `1` assigned to `orderInGroup` is never used
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/SourceConnectorConfig.java`
#### Snippet
```java
                        OFFSETS_TOPIC_DOC,
                        OFFSETS_TOPIC_GROUP,
                        orderInGroup = 1,
                        ConfigDef.Width.LONG,
                        OFFSETS_TOPIC_DISPLAY);
```

### UnusedAssignment
Variable `pos` initializer `0` is redundant
in `storage/src/main/java/org/apache/kafka/storage/internals/log/SkimpyOffsetMap.java`
#### Snippet
```java
        // search for the hash of this key by repeated probing until we find the hash we are looking for or we find an empty slot
        int attempt = 0;
        int pos = 0;
        //we need to guard against attempt integer overflow if the map is full
        //limit attempt to number of slots once positionOf(..) enters linear search mode
```

### UnusedAssignment
Variable `epochAndOffset` initializer `null` is redundant
in `storage/src/main/java/org/apache/kafka/storage/internals/epoch/LeaderEpochFileCache.java`
#### Snippet
```java
        lock.readLock().lock();
        try {
            Map.Entry<Integer, Long> epochAndOffset = null;
            if (requestedEpoch == UNDEFINED_EPOCH) {
                // This may happen if a bootstrapping follower sends a request with undefined epoch or
```

### UnusedAssignment
Variable `k` initializer `-1` is redundant
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
            if (tailLen > 0) {
                offset2 = (4 - tailLen);
                int k = -1;
                switch (tailLen) {
                    case 1:
```

### UnusedAssignment
Variable `store` initializer `null` is redundant
in `streams/src/main/java/org/apache/kafka/streams/state/internals/KeyValueStoreWrapper.java`
#### Snippet
```java
    // same as either timestampedStore or versionedStore above. kept merely as a convenience
    // to simplify implementation for methods which do not depend on store type.
    private StateStore store = null;

    public KeyValueStoreWrapper(final ProcessorContext<?, ?> context, final String storeName) {
```

### UnusedAssignment
Variable `controller` initializer `null` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/Agent.java`
#### Snippet
```java
     */
    boolean exec(TaskSpec spec, PrintStream out) throws Exception {
        TaskController controller = null;
        try {
            controller = spec.newController(EXEC_TASK_ID);
```

### UnusedAssignment
Variable `future` initializer `null` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/Agent.java`
#### Snippet
```java
            return false;
        }
        KafkaFuture<String> future = null;
        try {
            future = workerManager.createWorker(EXEC_WORKER_ID, EXEC_TASK_ID, spec);
```

### UnusedAssignment
Variable `node` initializer `null` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConnectionStressWorker.java`
#### Snippet
```java
            try {
                long lastTimeMs = Time.SYSTEM.milliseconds();
                JsonNode node = null;
                synchronized (ConnectionStressWorker.this) {
                    node = JsonUtil.JSON_SERDE.valueToTree(
```

### UnusedAssignment
Variable `process` initializer `null` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ExternalCommandWorker.java`
#### Snippet
```java
        this.executor = Executors.newCachedThreadPool(
            ThreadUtils.createThreadFactory("ExternalCommandWorkerThread%d", false));
        Process process = null;
        try {
            process = startProcess();
```

### UnusedAssignment
Variable `agentStatus` initializer `null` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/NodeManager.java`
#### Snippet
```java
            rescheduleNextHeartbeat(HEARTBEAT_DELAY_MS);
            try {
                AgentStatusResponse agentStatus = null;
                try {
                    agentStatus = client.status();
```

### UnusedAssignment
Variable `status` initializer `null` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
        } else if (taskState instanceof TaskDone) {
            TaskDone doneState = (TaskDone) taskState;
            String status = null;
            if (doneState.error() == null || doneState.error().isEmpty()) {
                if (doneState.cancelled()) {
```

### UnusedAssignment
The value `"_"` assigned to `prefix` is never used
in `metadata/src/main/java/org/apache/kafka/image/node/ClientQuotasImageNode.java`
#### Snippet
```java
        if (user != null) {
            bld.append(prefix).append("user(").append(escape(user)).append(")");
            prefix = "_";
        }
        return bld.toString();
```

### UnusedAssignment
Variable `spec` initializer `null` is redundant
in `generator/src/main/java/org/apache/kafka/message/ApiMessageTypeGenerator.java`
#### Snippet
```java
            }
            ApiData data = entry.getValue();
            MessageSpec spec = null;
            if (type.equals("request")) {
                spec = data.requestSpec;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `QuorumStateData`
in `raft/src/main/java/org/apache/kafka/raft/FileBasedStateStore.java`
#### Snippet
```java

/**
 * Local file based quorum state store. It takes the JSON format of {@link QuorumStateData}
 * with an extra data version number as part of the data for easy deserialization.
 *
```

### JavadocReference
Cannot resolve symbol `SnapshotFooterRecord`
in `raft/src/main/java/org/apache/kafka/snapshot/SnapshotWriter.java`
#### Snippet
```java
     * Freezes the snapshot by flushing all pending writes and marking it as immutable.
     *
     * Also adds a {@link SnapshotFooterRecord} to the end of the snapshot
     */
    void freeze();
```

### JavadocReference
Cannot resolve symbol `SnapshotFooterRecord`
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotWriter.java`
#### Snippet
```java

    /**
     * Adds a {@link SnapshotFooterRecord} to the snapshot
     *
     * No more records should be appended to the snapshot after calling this method
```

### JavadocReference
Cannot resolve symbol `SnapshotHeaderRecord`
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotWriter.java`
#### Snippet
```java

    /**
     * Adds a {@link SnapshotHeaderRecord} to snapshot
     *
     * @throws IllegalStateException if the snapshot is not empty
```

### JavadocReference
Cannot resolve symbol `SnapshotHeaderRecord`
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotWriter.java`
#### Snippet
```java
    /**
     * Create an instance of this class and initialize
     * the underlying snapshot with {@link SnapshotHeaderRecord}
     *
     * @param supplier a lambda to create the low level snapshot writer
```

### JavadocReference
Cannot resolve symbol `SnapshotFooterRecord`
in `raft/src/main/java/org/apache/kafka/raft/internals/BatchAccumulator.java`
#### Snippet
```java

    /**
     * Append a {@link SnapshotFooterRecord} record to the batch
     *
     * @param snapshotFooterRecord The record to append
```

### JavadocReference
Cannot resolve symbol `SnapshotHeaderRecord`
in `raft/src/main/java/org/apache/kafka/raft/internals/BatchAccumulator.java`
#### Snippet
```java

    /**
     * Append a {@link SnapshotHeaderRecord} record to the batch
     *
     * @param snapshotHeaderRecord The record to append
```

### JavadocReference
Cannot resolve symbol `LeaderChangeMessage`
in `raft/src/main/java/org/apache/kafka/raft/internals/BatchAccumulator.java`
#### Snippet
```java

    /**
     * Append a {@link LeaderChangeMessage} record to the batch
     *
     * @param leaderChangeMessage The message to append
```

### JavadocReference
Cannot resolve symbol `VoteRequestData`
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
 * These are the APIs in this protocol:
 *
 * 1) {@link VoteRequestData}: Sent by valid voters when their election timeout expires and they
 *    become a candidate. This request includes the last offset in the log which electors use
 *    to tell whether or not to grant the vote.
```

### JavadocReference
Cannot resolve symbol `BeginQuorumEpochRequestData`
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
 *    to tell whether or not to grant the vote.
 *
 * 2) {@link BeginQuorumEpochRequestData}: Sent by the leader of an epoch only to valid voters to
 *    assert its leadership of the new epoch. This request will be retried indefinitely for
 *    each voter until it acknowledges the request or a new election occurs.
```

### JavadocReference
Cannot resolve symbol `EndQuorumEpochRequestData`
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
 *    an election has completed.
 *
 * 3) {@link EndQuorumEpochRequestData}: Sent by the leader of an epoch to valid voters in order to
 *    gracefully resign from the current epoch. This causes remaining voters to immediately
 *    begin a new election.
```

### JavadocReference
Cannot resolve symbol `FetchRequestData`
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
 *    begin a new election.
 *
 * 4) {@link FetchRequestData}: This is the same as the usual Fetch API in Kafka, but we add snapshot
 *    check before responding, and we also piggyback some additional metadata on responses (i.e. current
 *    leader and epoch). Unlike partition replication, we also piggyback truncation detection on this API
```

### JavadocReference
Cannot resolve symbol `FetchSnapshotRequestData`
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
 *    rather than through a separate truncation state.
 *
 * 5) {@link FetchSnapshotRequestData}: Sent by the follower to the epoch leader in order to fetch a snapshot.
 *    This happens when a FetchResponse includes a snapshot ID due to the follower's log end offset being less
 *    than the leader's log start offset. This API is similar to the Fetch API since the snapshot is stored
```

### JavadocReference
Symbol `writeDefaultBatchHeader()` is inaccessible from here
in `clients/src/main/java/org/apache/kafka/common/record/CompressionType.java`
#### Snippet
```java
     * <p>
     * Note: Unlike {@link #wrapForInput}, {@link #wrapForOutput} cannot take {@link ByteBuffer}s directly.
     * Currently, {@link MemoryRecordsBuilder#writeDefaultBatchHeader()} and {@link MemoryRecordsBuilder#writeLegacyCompressedWrapperHeader()}
     * write to the underlying buffer in the given {@link ByteBufferOutputStream} after the compressed data has been written.
     * In the event that the buffer needs to be expanded while writing the data, access to the underlying buffer needs to be preserved.
```

### JavadocReference
Symbol `writeLegacyCompressedWrapperHeader()` is inaccessible from here
in `clients/src/main/java/org/apache/kafka/common/record/CompressionType.java`
#### Snippet
```java
     * <p>
     * Note: Unlike {@link #wrapForInput}, {@link #wrapForOutput} cannot take {@link ByteBuffer}s directly.
     * Currently, {@link MemoryRecordsBuilder#writeDefaultBatchHeader()} and {@link MemoryRecordsBuilder#writeLegacyCompressedWrapperHeader()}
     * write to the underlying buffer in the given {@link ByteBufferOutputStream} after the compressed data has been written.
     * In the event that the buffer needs to be expanded while writing the data, access to the underlying buffer needs to be preserved.
```

### JavadocReference
Cannot resolve symbol `UnifiedLog`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogOffsetSnapshot.java`
#### Snippet
```java
 * Container class which represents a snapshot of the significant offsets for a partition. This allows fetching
 * of these offsets atomically without the possibility of a leader change affecting their consistency relative
 * to each other. See {@link UnifiedLog#fetchOffsetSnapshot()}.
 */
public class LogOffsetSnapshot {
```

### JavadocReference
Cannot resolve symbol `fetchOffsetSnapshot()`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogOffsetSnapshot.java`
#### Snippet
```java
 * Container class which represents a snapshot of the significant offsets for a partition. This allows fetching
 * of these offsets atomically without the possibility of a leader change affecting their consistency relative
 * to each other. See {@link UnifiedLog#fetchOffsetSnapshot()}.
 */
public class LogOffsetSnapshot {
```

### JavadocReference
Cannot resolve symbol `kafka.cluster.Partition`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogReadInfo.java`
#### Snippet
```java

/**
 * Structure used for lower level reads using {@link kafka.cluster.Partition#fetchRecords()}.
 */
public class LogReadInfo {
```

### JavadocReference
Cannot resolve symbol `fetchRecords()`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogReadInfo.java`
#### Snippet
```java

/**
 * Structure used for lower level reads using {@link kafka.cluster.Partition#fetchRecords()}.
 */
public class LogReadInfo {
```

### JavadocReference
Cannot resolve symbol `org.apache.kafka.common.metadata.ZkMigrationStateRecord`
in `metadata/src/main/java/org/apache/kafka/metadata/migration/ZkMigrationState.java`
#### Snippet
```java
 * This information is persisted in the metadata log and image.
 *
 * @see org.apache.kafka.common.metadata.ZkMigrationStateRecord
 */
public enum ZkMigrationState {
```

### JavadocReference
Cannot resolve symbol `org.apache.kafka.common.metadata.RegisterBrokerRecord`
in `metadata/src/main/java/org/apache/kafka/controller/BrokerHeartbeatManager.java`
#### Snippet
```java
     * @param brokerId                     The broker id.
     * @param request                      The incoming heartbeat request.
     * @param registerBrokerRecordOffset   The offset of the broker's {@link org.apache.kafka.common.metadata.RegisterBrokerRecord}.
     * @param hasLeaderships               A callback which evaluates to true if the broker leads
     *                                     at least one partition.
```

### JavadocReference
Cannot resolve symbol `OffsetCommitRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#commitOffsets(RequestContext, OffsetCommitRequestData, BufferSupplier)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `LeaveGroupRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#leaveGroup(RequestContext, LeaveGroupRequestData)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `HeartbeatRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#heartbeat(RequestContext, HeartbeatRequestData)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `SyncGroupRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#syncGroup(RequestContext, SyncGroupRequestData, BufferSupplier)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `ConsumerGroupHeartbeatRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#consumerGroupHeartbeat(RequestContext, ConsumerGroupHeartbeatRequestData)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `JoinGroupRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#joinGroup(RequestContext, JoinGroupRequestData, BufferSupplier)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `ListGroupsRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#listGroups(RequestContext, ListGroupsRequestData)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `OffsetDeleteRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#deleteOffsets(RequestContext, OffsetDeleteRequestData, BufferSupplier)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `TxnOffsetCommitRequestData`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java

    /**
     * See {@link GroupCoordinator#commitTransactionalOffsets(RequestContext, TxnOffsetCommitRequestData, BufferSupplier)}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `ConsumerGroupTargetAssignmentMemberValue`
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/Assignment.java`
#### Snippet
```java

    /**
     * Creates a {{@link Assignment}} from a {{@link ConsumerGroupTargetAssignmentMemberValue}}.
     *
     * @param record The record.
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
    public static <T> Set<T> mkSet(T... elems) {
        Set<T> result = new HashSet<>((int) (elems.length / 0.75) + 1);
        for (T elem : elems)
            result.add(elem);
        return result;
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
    public static <T extends Comparable<T>> SortedSet<T> mkSortedSet(T... elems) {
        SortedSet<T> result = new TreeSet<>();
        for (T elem : elems)
            result.add(elem);
        return result;
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LeaderHwChange.java`
#### Snippet
```java
    INCREASED,
    SAME,
    NONE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `storage/src/main/java/org/apache/kafka/storage/internals/checkpoint/InMemoryLeaderEpochCheckpoint.java`
#### Snippet
```java
    public ByteBuffer readAsByteBuffer() throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream, StandardCharsets.UTF_8));) {
            CheckpointFile.CheckpointWriteBuffer<EpochEntry> writeBuffer = new CheckpointFile.CheckpointWriteBuffer<>(writer, 0, LeaderEpochCheckpointFile.FORMATTER);
            writeBuffer.write(epochs);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `metadata/src/main/java/org/apache/kafka/image/loader/LoaderManifestType.java`
#### Snippet
```java
public enum LoaderManifestType {
    LOG_DELTA,
    SNAPSHOT;
}

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `clients/src/main/java/org/apache/kafka/common/security/ssl/DefaultSslEngineFactory.java`
#### Snippet
```java
                "back to NONE.  Recognized client authentication configurations are {}.",
                key, String.join(", ", SslClientAuth.VALUES.stream().
                        map(Enum::name).collect(Collectors.toList())));
        return SslClientAuth.NONE;
    }
```

### SimplifyStreamApiCallChains
'Stream.noneMatch(x -\> !(...))' can be replaced with 'allMatch()'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerUnsecuredLoginCallbackHandler.java`
#### Snippet
```java
            return;
        }
        if (moduleOptions.keySet().stream().noneMatch(name -> !name.startsWith(EXTENSION_PREFIX))) {
            throw new OAuthBearerConfigException("Extensions provided in login context without a token");
        }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java
                 * so that all errors are consistent in that case.
                 */
                userIllegalAlterationExceptions.entrySet().stream().forEach(entry -> {
                    futures.get(entry.getKey()).completeExceptionally(entry.getValue());
                });
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/AbstractHerder.java`
#### Snippet
```java
    public void resetConnectorActiveTopics(String connName) {
        statusBackingStore.getAllTopics(connName).stream()
                .forEach(status -> statusBackingStore.deleteTopic(status.connector(), status.topic()));
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `metadata/src/main/java/org/apache/kafka/image/ScramImage.java`
#### Snippet
```java
                    scramImageString.append(mechanismEntry.getKey() + ":");
                    List<String> users = new ArrayList<>(mechanismEntry.getValue().keySet());
                    scramImageString.append(users.stream().collect(Collectors.joining(", ")));
                    scramImageString.append("},{");
                    isEmpty = false;
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `metadata/src/main/java/org/apache/kafka/image/FeaturesImage.java`
#### Snippet
```java
            features.sort(String::compareTo);
            options.handleLoss("feature flag(s): " +
                    features.stream().collect(Collectors.joining(", ")));
        }
    }
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerResultAndOffset.java`
#### Snippet
```java
        return String.format(
            "ControllerResultAndOffset(records=%s, response=%s, isAtomic=%s, offset=%s)",
            String.join(",", records().stream().map(ApiMessageAndVersion::toString).collect(Collectors.toList())),
            response(),
            isAtomic(),
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `metadata/src/main/java/org/apache/kafka/controller/AclControlManager.java`
#### Snippet
```java
            }
        }
        return ControllerResult.atomicOf(records.stream().collect(Collectors.toList()), results);
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerResult.java`
#### Snippet
```java
        return String.format(
            "ControllerResult(records=%s, response=%s, isAtomic=%s)",
            String.join(",", records.stream().map(ApiMessageAndVersion::toString).collect(Collectors.toList())),
            response,
            isAtomic
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `clients/src/main/java/org/apache/kafka/clients/producer/KafkaProducer.java`
#### Snippet
```java
     *  - partition callback
     */
    private class AppendCallbacks<K, V> implements RecordAccumulator.AppendCallbacks {
        private final Callback userCallback;
        private final ProducerInterceptors<K, V> interceptors;
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `clients/src/main/java/org/apache/kafka/clients/producer/KafkaProducer.java`
#### Snippet
```java
     *  - partition callback
     */
    private class AppendCallbacks<K, V> implements RecordAccumulator.AppendCallbacks {
        private final Callback userCallback;
        private final ProducerInterceptors<K, V> interceptors;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/ssl/SslPrincipalMapper.java`
#### Snippet
```java
                    final int groupStart = backRefMatcher.start(1);

                    sb.append(value.substring(0, groupStart - 1));
                    sb.append("\\");
                    sb.append(value.substring(groupStart - 1));
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
                close(channel, CloseMode.DISCARD_NO_NOTIFY);
                if (!(e instanceof CancelledKeyException)) {
                    log.error("Unexpected exception during send, closing connection {} and rethrowing exception {}",
                            connectionId, e);
                    throw e;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosError.java`
#### Snippet
```java
                return fromErrorCode(errorCode);
            } catch (Exception e) {
                log.trace("Kerberos return code could not be determined from {} due to {}", exception, e);
                return null;
            }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CommitRequestManager.java`
#### Snippet
```java
                .exceptionally(t -> {
                    if (t instanceof RetriableCommitFailedException) {
                        log.debug("Asynchronous auto-commit of offsets {} failed due to retriable error: {}", allConsumedOffsets, t);
                    } else {
                        log.warn("Asynchronous auto-commit of offsets {} failed: {}", allConsumedOffsets, t.getMessage());
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
            if (exception != null) {
                if (exception instanceof RetriableCommitFailedException) {
                    log.debug("Asynchronous auto-commit of offsets {} failed due to retriable error: {}", offsets,
                        exception);
                    nextAutoCommitTimer.updateAndReset(rebalanceConfig.retryBackoffMs);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
                                removeMembersFromConsumerGroupResult.memberResult(memberToRemove).get(remainingTimeMs, TimeUnit.MILLISECONDS);
                            } catch (final java.util.concurrent.TimeoutException e) {
                                log.error("Could not remove static member {} from consumer group {} due to a timeout: {}",
                                          groupInstanceID.get(), applicationConfigs.getString(StreamsConfig.APPLICATION_ID_CONFIG), e);
                                throw new TimeoutException(e.getMessage(), e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
                                Thread.currentThread().interrupt();
                            } catch (final ExecutionException e) {
                                log.error("Could not remove static member {} from consumer group {} due to: {}",
                                          groupInstanceID.get(), applicationConfigs.getString(StreamsConfig.APPLICATION_ID_CONFIG), e);
                                throw new StreamsException(
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
                        .get(remainingTimeMs, TimeUnit.MILLISECONDS);
                } catch (final Exception e) {
                    log.error("Could not remove static member {} from consumer group {} due to a: {}",
                        groupInstanceId.get(),
                        applicationConfigs.getString(StreamsConfig.APPLICATION_ID_CONFIG), e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/GlobalStateManagerImpl.java`
#### Snippet
```java
            checkpointFile.write(filteredOffsets);
        } catch (final IOException e) {
            log.warn("Failed to write offset checkpoint file to {} for global stores: {}." +
                " This may occur if OS cleaned the state.dir in case when it is located in the (default) ${java.io.tmpdir}/kafka-streams directory." +
                " Changing the location of state.dir may resolve the problem", checkpointFile, e);
        }
    }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
        public void complete(Throwable exception) {
            if (exception != null) {
                log.error("Execution of {} failed due to {}.", name, exception);
            }
        }
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerValidationUtils.java`
#### Snippet
```java
                return OAuthBearerValidationResult.newFailure(String.format(
                        "The provided scope (%s) was missing a required scope (%s).  All required scope elements: %s",
                        String.valueOf(tokenScope), requiredScopeElement, requiredScope),
                        requiredScope.toString(), null);
        }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/expiring/ExpiringCredentialRefreshingLogin.java`
#### Snippet
```java
                            log.error(
                                    "[Principal={}]: Interrupted while trying to perform a subsequent expiring credential re-login after one or more initial re-login failures: re-login thread exiting now: {}",
                                    principalLogText(), String.valueOf(loginException.getMessage()));
                            loginContextFactory.refresherThreadDone();
                            return;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/DeleteConsumerGroupOffsetsHandler.java`
#### Snippet
```java
            final Map<CoordinatorKey, Throwable> failed = new HashMap<>();
            final Set<CoordinatorKey> groupsToUnmap = new HashSet<>();

            handleGroupError(groupId, error, failed, groupsToUnmap);

            return new ApiResult<>(Collections.emptyMap(), failed, new ArrayList<>(groupsToUnmap));
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerConfig.java`
#### Snippet
```java
        Map<String, Object> newConfigs = new HashMap<>(configs);
        if (keyDeserializer != null)
            newConfigs.put(KEY_DESERIALIZER_CLASS_CONFIG, keyDeserializer.getClass());
        else if (newConfigs.get(KEY_DESERIALIZER_CLASS_CONFIG) == null)
            throw new ConfigException(KEY_DESERIALIZER_CLASS_CONFIG, null, "must be non-null.");
        if (valueDeserializer != null)
            newConfigs.put(VALUE_DESERIALIZER_CLASS_CONFIG, valueDeserializer.getClass());
        else if (newConfigs.get(VALUE_DESERIALIZER_CLASS_CONFIG) == null)
            throw new ConfigException(VALUE_DESERIALIZER_CLASS_CONFIG, null, "must be non-null.");
        return newConfigs;
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CommitRequestManager.java`
#### Snippet
```java
                OffsetCommitRequestData.OffsetCommitRequestTopic topic = requestTopicDataMap
                        .getOrDefault(topicPartition.topic(),
                                new OffsetCommitRequestData.OffsetCommitRequestTopic()
                                        .setName(topicPartition.topic())
                        );

                topic.partitions().add(new OffsetCommitRequestData.OffsetCommitRequestPartition()
                        .setPartitionIndex(topicPartition.partition())
                        .setCommittedOffset(offsetAndMetadata.offset())
                        .setCommittedLeaderEpoch(offsetAndMetadata.leaderEpoch().orElse(RecordBatch.NO_PARTITION_LEADER_EPOCH))
                        .setCommittedMetadata(offsetAndMetadata.metadata())
                );
                requestTopicDataMap.put(topicPartition.topic(), topic);
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CommitRequestManager.java`
#### Snippet
```java
            Set<String> unauthorizedTopics = null;
            Map<TopicPartition, OffsetFetchResponse.PartitionData> responseData =
                    response.partitionDataMap(groupState.groupId);
            Map<TopicPartition, OffsetAndMetadata> offsets = new HashMap<>(responseData.size());
            Set<TopicPartition> unstableTxnOffsetTopicPartitions = new HashSet<>();
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/network/SaslChannelBuilder.java`
#### Snippet
```java
            final String servicePrincipal = SaslClientAuthenticator.firstPrincipal(subject);
            KerberosName kerberosName;
            try {
                kerberosName = KerberosName.parse(servicePrincipal);
            } catch (IllegalArgumentException e) {
                throw new KafkaException("Principal has name with unexpected format " + servicePrincipal);
            }
            final String servicePrincipalName = kerberosName.serviceName();
            final String serviceHostname = kerberosName.hostName();
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/protocol/types/ArrayOf.java`
#### Snippet
```java
        if (size > buffer.remaining())
            throw new SchemaException("Error reading array of size " + size + ", only " + buffer.remaining() + " bytes available");
        Object[] objs = new Object[size];
        for (int i = 0; i < size; i++)
            objs[i] = type.read(buffer);
        return objs;
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
            if (size < 0)
                throw new SchemaException("Bytes size " + size + " cannot be negative");
            if (size > buffer.remaining())
                throw new SchemaException("Error reading bytes of size " + size + ", only " + buffer.remaining() + " bytes available");

            int limit = buffer.limit();
            int newPosition = buffer.position() + size;
            buffer.limit(newPosition);
            ByteBuffer val = buffer.slice();
            buffer.limit(limit);
            buffer.position(newPosition);
            return val;
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Type.java`
#### Snippet
```java
            if (size < 0)
                return null;
            if (size > buffer.remaining())
                throw new SchemaException("Error reading bytes of size " + size + ", only " + buffer.remaining() + " bytes available");

            int limit = buffer.limit();
            int newPosition = buffer.position() + size;
            buffer.limit(newPosition);
            ByteBuffer val = buffer.slice();
            buffer.limit(limit);
            buffer.position(newPosition);
            return val;
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/record/DefaultRecord.java`
#### Snippet
```java
            long timestampDelta = ByteUtils.readVarlong(buffer);
            long timestamp = baseTimestamp + timestampDelta;
            if (logAppendTime != null)
                timestamp = logAppendTime;

            int offsetDelta = ByteUtils.readVarint(buffer);
            long offset = baseOffset + offsetDelta;
            int sequence = baseSequence >= 0 ?
                    DefaultRecordBatch.incrementSequence(baseSequence, offsetDelta) :
                    RecordBatch.NO_SEQUENCE;

            // read key
            int keySize = ByteUtils.readVarint(buffer);
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/requests/AlterPartitionResponse.java`
#### Snippet
```java
        Map<Errors, Integer> counts = new HashMap<>();
        updateErrorCounts(counts, Errors.forCode(data.errorCode()));
        data.topics().forEach(topicResponse -> topicResponse.partitions().forEach(partitionResponse -> {
            updateErrorCounts(counts, Errors.forCode(partitionResponse.errorCode()));
        }));
        return counts;
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/security/ssl/SslPrincipalMapper.java`
#### Snippet
```java
            Matcher matcher = RULE_PARSER.matcher(rule);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException("Invalid rule: " + rule);
            }
            if (rule.length() != matcher.end()) {
                throw new IllegalArgumentException("Invalid rule: `" + rule + "`, unmatched substring: `" + rule.substring(matcher.end()) + "`");
            }
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/secured/ConfigurationUtils.java`
#### Snippet
```java
        if (value == null) {
            if (isRequired)
                throw new ConfigException(String.format("The OAuth configuration option %s value must be non-null", name));
            else
                return null;
        }

        value = value.trim();

        if (value.isEmpty()) {
            if (isRequired)
                throw new ConfigException(String.format("The OAuth configuration option %s value must not contain only whitespace", name));
            else
                return null;
        }

        return value;
```

### DuplicatedCode
Duplicated code
in `clients/src/main/java/org/apache/kafka/common/utils/ByteUtils.java`
#### Snippet
```java
        if ((value & (0xFFFFFFFF << 7)) == 0) {
            buffer.put((byte) value);
        } else {
            buffer.put((byte) (value & 0x7F | 0x80));
            if ((value & (0xFFFFFFFF << 14)) == 0) {
                buffer.put((byte) ((value >>> 7) & 0xFF));
            } else {
                buffer.put((byte) ((value >>> 7) & 0x7F | 0x80));
                if ((value & (0xFFFFFFFF << 21)) == 0) {
                    buffer.put((byte) ((value >>> 14) & 0xFF));
                } else {
                    buffer.put((byte) ((value >>> 14) & 0x7F | 0x80));
                    if ((value & (0xFFFFFFFF << 28)) == 0) {
                        buffer.put((byte) ((value >>> 21) & 0xFF));
                    } else {
                        buffer.put((byte) ((value >>> 21) & 0x7F | 0x80));
                        buffer.put((byte) ((value >>> 28) & 0xFF));
                    }
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
        Map<String, Object> props = new HashMap<>();
        props.putAll(originalsWithPrefix(SOURCE_CLUSTER_PREFIX));
        props.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        props.putAll(originalsWithPrefix(PRODUCER_CLIENT_PREFIX));
        props.putAll(originalsWithPrefix(SOURCE_PREFIX + PRODUCER_CLIENT_PREFIX));
        addClientId(props, role);
        return props;
```

### DuplicatedCode
Duplicated code
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/EagerAssignor.java`
#### Snippet
```java
        if (coordinator.configSnapshot().offset() < maxOffset) {
            // We might be able to take a new snapshot to catch up immediately and avoid another round of syncing here.
            // Alternatively, if this node has already passed the maximum reported by any other member of the group, it
            // is also safe to use this newer state.
            ClusterConfigState updatedSnapshot = coordinator.configFreshSnapshot();
            if (updatedSnapshot.offset() < maxOffset) {
                log.info("Was selected to perform assignments, but do not have latest config found in sync request. " +
                        "Returning an empty configuration to trigger re-sync.");
                return null;
            } else {
                coordinator.configSnapshot(updatedSnapshot);
                return updatedSnapshot.offset();
            }
        }
        return maxOffset;
```

### DuplicatedCode
Duplicated code
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/IncrementalCooperativeAssignor.java`
#### Snippet
```java
        Map<String, Collection<String>> nextConnectorAssignments = nextWorkerAssignment.stream()
                .collect(Collectors.toMap(
                        WorkerLoad::worker,
                        WorkerLoad::connectors
                ));
        Map<String, Collection<ConnectorTaskId>> nextTaskAssignments = nextWorkerAssignment.stream()
                .collect(Collectors.toMap(
                        WorkerLoad::worker,
                        WorkerLoad::tasks
                ));
```

### DuplicatedCode
Duplicated code
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaConfigBackingStore.java`
#### Snippet
```java
        Map<String, Object> consumerProps = new HashMap<>(originals);
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ByteArrayDeserializer.class.getName());
        consumerProps.put(CommonClientConfigs.CLIENT_ID_CONFIG, clientId);
        ConnectUtils.addMetricsContextProperties(consumerProps, config, clusterId);
```

### DuplicatedCode
Duplicated code
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaStatusBackingStore.java`
#### Snippet
```java
            @SuppressWarnings("unchecked")
            Map<String, Object> statusMap = (Map<String, Object>) schemaAndValue.value();
            TaskStatus.State state = TaskStatus.State.valueOf((String) statusMap.get(STATE_KEY_NAME));
            String trace = (String) statusMap.get(TRACE_KEY_NAME);
            String workerUrl = (String) statusMap.get(WORKER_ID_KEY_NAME);
            int generation = ((Long) statusMap.get(GENERATION_KEY_NAME)).intValue();
```

### DuplicatedCode
Duplicated code
in `connect/runtime/src/main/java/org/apache/kafka/connect/tools/SchemaSourceTask.java`
#### Snippet
```java
        partition = Collections.singletonMap(ID_FIELD, id);
        Map<String, Object> previousOffset = this.context.offsetStorageReader().offset(partition);
        if (previousOffset != null) {
            seqno = (Long) previousOffset.get(SEQNO_FIELD) + 1;
        } else {
            seqno = 0;
        }
        startingSeqno = seqno;
```

### DuplicatedCode
Duplicated code
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/InsertField.java`
#### Snippet
```java
        if (topicField != null) {
            updatedValue.put(topicField.name, record.topic());
        }
        if (partitionField != null && record.kafkaPartition() != null) {
            updatedValue.put(partitionField.name, record.kafkaPartition());
        }
        if (offsetField != null) {
            updatedValue.put(offsetField.name, requireSinkRecord(record, PURPOSE).kafkaOffset());
        }
```

### DuplicatedCode
Duplicated code
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/InsertField.java`
#### Snippet
```java
        final Struct value = requireStruct(operatingValue(record), PURPOSE);

        Schema updatedSchema = schemaUpdateCache.get(value.schema());
        if (updatedSchema == null) {
            updatedSchema = makeUpdatedSchema(value.schema());
            schemaUpdateCache.put(value.schema(), updatedSchema);
        }

        final Struct updatedValue = new Struct(updatedSchema);
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/org/apache/kafka/message/ApiMessageTypeGenerator.java`
#### Snippet
```java
        buffer.incrementIndent();
        generateEnumValues();
        buffer.printf("%n");
        generateInstanceVariables();
        buffer.printf("%n");
        generateEnumConstructor();
        buffer.printf("%n");
        generateFromApiKey();
        buffer.printf("%n");
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/org/apache/kafka/message/ApiMessageTypeGenerator.java`
#### Snippet
```java
        buffer.printf("default:%n");
        buffer.incrementIndent();
        headerGenerator.addImport(MessageGenerator.UNSUPPORTED_VERSION_EXCEPTION_CLASS);
        buffer.printf("throw new UnsupportedVersionException(\"Unsupported API key \"" +
            " + apiKey);%n");
        buffer.decrementIndent();
        buffer.decrementIndent();
        buffer.printf("}%n");
        buffer.decrementIndent();
        buffer.printf("}%n");
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/org/apache/kafka/message/MetadataJsonConvertersGenerator.java`
#### Snippet
```java
        if (spec.type() == MessageSpecType.METADATA) {
            short id = spec.apiKey().get();
            MessageSpec prevSpec = apis.put(id, spec);
            if (prevSpec != null) {
                throw new RuntimeException("Duplicate metadata record entry for type " +
                        id + ". Original claimant: " + prevSpec.name() + ". New " +
                        "claimant: " + spec.name());
            }
        }
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/org/apache/kafka/message/MetadataRecordTypeGenerator.java`
#### Snippet
```java
        buffer.printf("default:%n");
        buffer.incrementIndent();
        headerGenerator.addImport(MessageGenerator.UNSUPPORTED_VERSION_EXCEPTION_CLASS);
        buffer.printf("throw new UnsupportedVersionException(\"Unknown metadata id \"" +
            " + id);%n");
        buffer.decrementIndent();
        buffer.decrementIndent();
        buffer.printf("}%n");
        buffer.decrementIndent();
        buffer.printf("}%n");
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/org/apache/kafka/message/VersionConditional.java`
#### Snippet
```java
            buffer.incrementIndent();
            ifMember.generate(ifVersions);
            buffer.decrementIndent();
            if (ifNotMember != null) {
                buffer.printf("} else {%n");
                buffer.incrementIndent();
                ifNotMember.generate(ifNotVersions);
                buffer.decrementIndent();
            }
            buffer.printf("}%n");
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/org/apache/kafka/message/VersionConditional.java`
#### Snippet
```java
        if (ifMember != null) {
            if (alwaysEmitBlockScope) {
                buffer.printf("{%n");
                buffer.incrementIndent();
            }
            ifMember.generate(ifVersions);
            if (alwaysEmitBlockScope) {
                buffer.decrementIndent();
                buffer.printf("}%n");
            }
        }
```

### DuplicatedCode
Duplicated code
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
        MetadataRequest metadataRequest = MetadataRequest.Builder.allTopics().build();
        RequestHeader header = new RequestHeader(metadataRequest.apiKey(), metadataRequest.version(), "", 0);
        ByteBuffer bodyBuffer = metadataRequest.serialize();

        RequestContext context = new RequestContext(header, "1", null, principal,
                ListenerName.forSecurityProtocol(SecurityProtocol.PLAINTEXT),
                SecurityProtocol.PLAINTEXT, ClientInformation.EMPTY, false);
        return new RequestChannel.Request(1, context, 0, MemoryPool.NONE, bodyBuffer, requestChannelMetrics, Option.empty());
```

### DuplicatedCode
Duplicated code
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
        logManager = new LogManagerBuilder().
            setLogDirs(Collections.singletonList(logDir)).
            setInitialOfflineDirs(Collections.emptyList()).
            setConfigRepository(new MockConfigRepository()).
            setInitialDefaultConfig(logConfig).
            setCleanerConfig(new CleanerConfig(0, 0, 0, 0, 0, 0.0, 0, false)).
            setRecoveryThreadsPerDataDir(1).
            setFlushCheckMs(1000L).
            setFlushRecoveryOffsetCheckpointMs(10000L).
            setFlushStartOffsetCheckpointMs(10000L).
            setRetentionCheckMs(1000L).
            setProducerStateManagerConfig(60000, false).
            setInterBrokerProtocolVersion(MetadataVersion.latest()).
            setScheduler(scheduler).
            setBrokerTopicStats(brokerTopicStats).
            setLogDirFailureChannel(logDirFailureChannel).
            setTime(Time.SYSTEM).setKeepPartitionMetadataFile(true).
            build();
```

### DuplicatedCode
Duplicated code
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/CheckpointBench.java`
#### Snippet
```java
        this.scheduler = new KafkaScheduler(1, true, "scheduler-thread");
        this.brokerProperties = KafkaConfig.fromProps(TestUtils.createBrokerConfig(
                0, TestUtils.MockZkConnect(), true, true, 9092, Option.empty(), Option.empty(),
                Option.empty(), true, false, 0, false, 0, false, 0, Option.empty(), 1, true, 1,
                (short) 1, false));
        this.metrics = new Metrics();
```

### DuplicatedCode
Duplicated code
in `metadata/src/main/java/org/apache/kafka/controller/BrokersToIsrs.java`
#### Snippet
```java
        int[] prev;
        if (prevIsr == null) {
            prev = NONE;
        } else {
            if (prevLeader == NO_LEADER) {
                prev = Replicas.copyWith(prevIsr, NO_LEADER);
            } else {
                prev = Replicas.clone(prevIsr);
            }
            Arrays.sort(prev);
        }
```

### DuplicatedCode
Duplicated code
in `metadata/src/main/java/org/apache/kafka/image/TopicDelta.java`
#### Snippet
```java
        Set<TopicPartition> deletes = new HashSet<>();
        Map<TopicPartition, LocalReplicaChanges.PartitionInfo> leaders = new HashMap<>();
        Map<TopicPartition, LocalReplicaChanges.PartitionInfo> followers = new HashMap<>();
        Map<String, Uuid> topicIds = new HashMap<>();
```

### DuplicatedCode
Duplicated code
in `metadata/src/main/java/org/apache/kafka/image/TopicDelta.java`
#### Snippet
```java
                PartitionRegistration prevPartition = image.partitions().get(entry.getKey());
                if (prevPartition == null || prevPartition.partitionEpoch != entry.getValue().partitionEpoch) {
                    leaders.put(
                        new TopicPartition(name(), entry.getKey()),
                        new LocalReplicaChanges.PartitionInfo(id(), entry.getValue())
                    );
                    topicIds.putIfAbsent(name(), id());
                }
```

### DuplicatedCode
Duplicated code
in `server-common/src/main/java/org/apache/kafka/server/common/MetadataVersion.java`
#### Snippet
```java
        } else if (this.isAtLeast(IBP_0_11_0_IV1)) {
            return 5;
        } else if (this.isAtLeast(IBP_0_11_0_IV0)) {
            return 4;
        } else if (this.isAtLeast(IBP_0_10_1_IV1)) {
            return 3;
        } else if (this.isAtLeast(IBP_0_10_0_IV0)) {
            return 2;
        } else if (this.isAtLeast(IBP_0_9_0)) {
            return 1;
        } else {
            return 0;
        }
```

### DuplicatedCode
Duplicated code
in `server-common/src/main/java/org/apache/kafka/server/common/MetadataVersion.java`
#### Snippet
```java
        if (this.isAtLeast(IBP_2_8_IV0)) {
            return 4;
        } else if (this.isAtLeast(IBP_2_3_IV1)) {
            return 3;
        } else if (this.isAtLeast(IBP_2_1_IV1)) {
            return 2;
        } else if (this.isAtLeast(IBP_2_0_IV0)) {
            return 1;
        } else {
            return 0;
        }
```

### DuplicatedCode
Duplicated code
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountDemo.java`
#### Snippet
```java
        final Properties props = new Properties();
        if (args != null && args.length > 0) {
            try (final FileInputStream fis = new FileInputStream(args[0])) {
                props.load(fis);
            }
            if (args.length > 1) {
                System.out.println("Warning: Some command line arguments were ignored. This demo only accepts an optional configuration file.");
            }
        }
```

### DuplicatedCode
Duplicated code
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountDemo.java`
#### Snippet
```java
        final KafkaStreams streams = new KafkaStreams(builder.build(), props);
        final CountDownLatch latch = new CountDownLatch(1);

        // attach shutdown handler to catch control-c
        Runtime.getRuntime().addShutdownHook(new Thread("streams-wordcount-shutdown-hook") {
            @Override
            public void run() {
                streams.close();
                latch.countDown();
            }
        });

        try {
            streams.start();
            latch.await();
        } catch (final Throwable e) {
            System.exit(1);
        }
        System.exit(0);
```

### DuplicatedCode
Duplicated code
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountProcessorDemo.java`
#### Snippet
```java
        final CountDownLatch latch = new CountDownLatch(1);

        // attach shutdown handler to catch control-c
        Runtime.getRuntime().addShutdownHook(new Thread("streams-wordcount-shutdown-hook") {
            @Override
            public void run() {
                streams.close();
                latch.countDown();
            }
        });

        try {
            streams.start();
            latch.await();
        } catch (final Throwable e) {
            System.exit(1);
        }
        System.exit(0);
```

### DuplicatedCode
Duplicated code
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountProcessorDemo.java`
#### Snippet
```java
            context.schedule(Duration.ofSeconds(1), PunctuationType.STREAM_TIME, timestamp -> {
                try (final KeyValueIterator<String, Integer> iter = kvStore.all()) {
                    System.out.println("----------- " + timestamp + " ----------- ");

                    while (iter.hasNext()) {
                        final KeyValue<String, Integer> entry = iter.next();

                        System.out.println("[" + entry.key + ", " + entry.value + "]");

                        context.forward(new Record<>(entry.key, entry.value.toString(), timestamp));
                    }
                }
            });
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/StreamsBuilder.java`
#### Snippet
```java
        Objects.requireNonNull(topic, "topic can't be null");
        Objects.requireNonNull(consumed, "consumed can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");
        final ConsumedInternal<K, V> consumedInternal = new ConsumedInternal<>(consumed);
        materialized.withKeySerde(consumedInternal.keySerde()).withValueSerde(consumedInternal.valueSerde());

        final MaterializedInternal<K, V, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, internalStreamsBuilder, topic + "-");
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/StreamsBuilder.java`
#### Snippet
```java
        Objects.requireNonNull(topic, "topic can't be null");
        Objects.requireNonNull(consumed, "consumed can't be null");
        final ConsumedInternal<K, V> consumedInternal = new ConsumedInternal<>(consumed);

        final MaterializedInternal<K, V, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(
                Materialized.with(consumedInternal.keySerde(), consumedInternal.valueSerde()),
                internalStreamsBuilder,
                topic + "-");
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
        final Map<String, Object> consumerProps = getCommonConsumerConfigs();

        // Get main consumer override configs
        final Map<String, Object> mainConsumerProps = originalsWithPrefix(MAIN_CONSUMER_PREFIX);
        for (final Map.Entry<String, Object> entry: mainConsumerProps.entrySet()) {
            consumerProps.put(entry.getKey(), entry.getValue());
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindowedDeserializer.java`
#### Snippet
```java
        final String windowedInnerClassSerdeConfig = (String) configs.get(StreamsConfig.WINDOWED_INNER_CLASS_SERDE);

        Serde<T> windowInnerClassSerde = null;

        if (windowedInnerClassSerdeConfig != null) {
            try {
                windowInnerClassSerde = Utils.newInstance(windowedInnerClassSerdeConfig, Serde.class);
            } catch (final ClassNotFoundException e) {
                throw new ConfigException(StreamsConfig.WINDOWED_INNER_CLASS_SERDE, windowedInnerClassSerdeConfig,
                    "Serde class " + windowedInnerClassSerdeConfig + " could not be found.");
            }
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/AbstractKStreamTimeWindowAggregateProcessor.java`
#### Snippet
```java
        final String threadId = Thread.currentThread().getName();
        final String processorName = internalProcessorContext.currentNode().name();
        droppedRecordsSensor = droppedRecordsSensor(threadId, context.taskId().toString(), metrics);
        emittedRecordsSensor = emittedRecordsSensor(threadId, context.taskId().toString(), processorName, metrics);
        emitFinalLatencySensor = emitFinalLatencySensor(threadId, context.taskId().toString(), processorName, metrics);
        windowStore = context.getStateStore(storeName);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/AbstractKStreamTimeWindowAggregateProcessor.java`
#### Snippet
```java
            final Long lastEmitWindowCloseTime = internalProcessorContext.processorMetadataForKey(storeName);
            if (lastEmitWindowCloseTime != null) {
                this.lastEmitWindowCloseTime = lastEmitWindowCloseTime;
            }
            final long emitInterval = StreamsConfig.InternalConfig.getLong(
                context.appConfigs(),
                EMIT_INTERVAL_MS_KSTREAMS_WINDOWED_AGGREGATION,
                1000L
            );
            timeTracker.setEmitInterval(emitInterval);

            tupleForwarder = new TimestampedTupleForwarder<>(context, sendOldValues);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/CogroupedStreamAggregateBuilder.java`
#### Snippet
```java
            parentProcessors.add(parentProcessor);
            final StatefulProcessorNode<K, ?> statefulProcessorNode = getStatefulProcessorNode(
                named.suffixWithOrElseGet(
                    "-cogroup-agg-" + counter++,
                    builder,
                    CogroupedKStreamImpl.AGGREGATE_NAME),
                stateCreated,
                storeBuilder,
                parentProcessor);
            stateCreated = true;
            processors.add(statefulProcessorNode);
            builder.addGraphNode(parentNodes.get(kGroupedStream.getKey()), statefulProcessorNode);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/InternalStreamsBuilder.java`
#### Snippet
```java
        final String name = new NamedInternal(consumed.name()).orElseGenerateWithPrefix(this, KStreamImpl.SOURCE_NAME);
        final StreamSourceNode<K, V> streamSourceNode = new StreamSourceNode<>(name, topics, consumed);

        addGraphNode(root, streamSourceNode);

        return new KStreamImpl<>(name,
                                 consumed.keySerde(),
                                 consumed.valueSerde(),
                                 Collections.singleton(name),
                                 false,
                                 streamSourceNode,
                                 this);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
        final MaterializedInternal<K, V, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
        final MaterializedInternal<K, Long, KeyValueStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamAggregate.java`
#### Snippet
```java
            super.init(context);
            droppedRecordsSensor = droppedRecordsSensor(
                Thread.currentThread().getName(),
                context.taskId().toString(),
                (StreamsMetricsImpl) context.metrics());
            store = new KeyValueStoreWrapper<>(context, storeName);
            tupleForwarder = new TimestampedTupleForwarder<>(
                store.getStore(),
                context,
                new TimestampedCacheFlushListener<>(context),
                sendOldValues);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        final ProcessorGraphNode<? super K, ? super V> mapProcessorNode =
            new ProcessorGraphNode<>(name, processorParameters);
        mapProcessorNode.keyChangingOperation(true);

        builder.addGraphNode(graphNode, mapProcessorNode);

        // key and value serde cannot be preserved
        return new KStreamImpl<>(
            name,
            null,
            null,
            subTopologySourceNodes,
            true,
            mapProcessorNode,
            builder);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        final ProcessorGraphNode<? super K, ? super V> mapValuesProcessorNode =
            new ProcessorGraphNode<>(name, processorParameters);
        mapValuesProcessorNode.setValueChangingOperation(true);

        builder.addGraphNode(graphNode, mapValuesProcessorNode);

        // value serde cannot be preserved
        return new KStreamImpl<>(
            name,
            keySerde,
            null,
            subTopologySourceNodes,
            repartitionRequired,
            mapValuesProcessorNode,
            builder);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        Objects.requireNonNull(topic, "topic can't be null");
        Objects.requireNonNull(produced, "produced can't be null");

        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valueSerde);
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        Objects.requireNonNull(produced, "produced can't be null");

        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valueSerde);
        }
        to(topicExtractor, producedInternal);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        Objects.requireNonNull(table, "table can't be null");
        Objects.requireNonNull(joiner, "joiner can't be null");
        Objects.requireNonNull(joined, "joined can't be null");

        final JoinedInternal<K, V, VO> joinedInternal = new JoinedInternal<>(joined);
        final String name = joinedInternal.name();
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        Objects.requireNonNull(processorSupplier, "processorSupplier can't be null");
        Objects.requireNonNull(named, "named can't be null");
        Objects.requireNonNull(stateStoreNames, "stateStoreNames can't be a null array");
        ApiUtils.checkSupplier(processorSupplier);
        for (final String stateStoreName : stateStoreNames) {
            Objects.requireNonNull(stateStoreName, "stateStoreNames can't be null");
        }

        final String name = new NamedInternal(named).name();
        final StatefulProcessorNode<? super K, ? super V> processNode = new StatefulProcessorNode<>(
            name,
            new ProcessorParameters<>(processorSupplier, name),
            stateStoreNames);

        builder.addGraphNode(graphNode, processNode);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamSlidingWindowAggregate.java`
#### Snippet
```java
            final Set<Long> windowStartTimes = new HashSet<>();

            // aggregate that will go in the current record’s left/right window (if needed)
            ValueAndTimestamp<VAgg> leftWinAgg = null;
            ValueAndTimestamp<VAgg> rightWinAgg = null;

            //if current record's left/right windows already exist
            boolean leftWinAlreadyCreated = false;
            boolean rightWinAlreadyCreated = false;

            Long previousRecordTimestamp = null;
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamSlidingWindowAggregate.java`
#### Snippet
```java
                    final KeyValue<Windowed<KIn>, ValueAndTimestamp<VAgg>> windowBeingProcessed = iterator.next();
                    final long startTime = windowBeingProcessed.key.window().start();
                    windowStartTimes.add(startTime);
                    final long endTime = startTime + windows.timeDifferenceMs();
                    final long windowMaxRecordTimestamp = windowBeingProcessed.value.timestamp();
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableKTableInnerJoin.java`
#### Snippet
```java
            if (record.key() == null) {
                if (context().recordMetadata().isPresent()) {
                    final RecordMetadata recordMetadata = context().recordMetadata().get();
                    LOG.warn(
                        "Skipping record due to null key. "
                            + "topic=[{}] partition=[{}] offset=[{}]",
                        recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset()
                    );
                } else {
                    LOG.warn(
                        "Skipping record due to null key. Topic, partition, and offset not known."
                    );
                }
                droppedRecordsSensor.record();
                return;
            }

            // drop out-of-order records from versioned tables (cf. KIP-914)
            if (useVersionedSemantics && !record.value().isLatest) {
                LOG.info("Skipping out-of-order record from versioned table while performing table-table join.");
                droppedRecordsSensor.record();
                return;
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableKTableRightJoin.java`
#### Snippet
```java
            final long resultTimestamp;
            VOut oldValue = null;

            final ValueAndTimestamp<V2> valueAndTimestampLeft = valueGetter.get(record.key());
            final V2 valueLeft = getValueOrNull(valueAndTimestampLeft);
            if (valueLeft == null) {
                return;
            }

            resultTimestamp = Math.max(record.timestamp(), valueAndTimestampLeft.timestamp());
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableKTableInnerJoin.java`
#### Snippet
```java
            if (record.value().newValue != null) {
                newValue = joiner.apply(record.value().newValue, valueRight);
            }

            if (sendOldValues && record.value().oldValue != null) {
                oldValue = joiner.apply(record.value().oldValue, valueRight);
            }

            context().forward(record.withValue(new Change<>(newValue, oldValue, record.value().isLatest)).withTimestamp(resultTimestamp));
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedCogroupedKStreamImpl.java`
#### Snippet
```java
            final long retentionPeriod = materialized.retention() != null ?
                materialized.retention().toMillis() : sessionWindows.inactivityGap() + sessionWindows.gracePeriodMs();

            if ((sessionWindows.inactivityGap() + sessionWindows.gracePeriodMs()) > retentionPeriod) {
                throw new IllegalArgumentException("The retention period of the session store "
                    + materialized.storeName()
                    + " must be no smaller than the session inactivity gap plus the"
                    + " grace period."
                    + " Got gap=[" + sessionWindows.inactivityGap() + "],"
                    + " grace=[" + sessionWindows.gracePeriodMs() + "],"
                    + " retention=[" + retentionPeriod + "]");
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedCogroupedKStreamImpl.java`
#### Snippet
```java
            final long retentionPeriod = materialized.retention() != null ? materialized.retention().toMillis() : windows.gracePeriodMs() + 2 * windows.timeDifferenceMs();

            if ((windows.timeDifferenceMs() * 2 + windows.gracePeriodMs()) > retentionPeriod) {
                throw new IllegalArgumentException("The retention period of the window store "
                    + name
                    + " must be no smaller than 2 * time difference plus the grace period."
                    + " Got time difference=[" + windows.timeDifferenceMs() + "],"
                    + " grace=[" + windows.gracePeriodMs()
                    + "],"
                    + " retention=[" + retentionPeriod
                    + "]");
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
        final MaterializedInternal<K, Long, WindowStore<Bytes, byte[]>> materializedInternal =
                new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }

        final String aggregateName = new NamedInternal(named).orElseGenerateWithPrefix(builder, AGGREGATE_NAME);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
        Objects.requireNonNull(initializer, "initializer can't be null");
        Objects.requireNonNull(aggregator, "aggregator can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");
        final MaterializedInternal<K, VR, WindowStore<Bytes, byte[]>> materializedInternal =
                new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        final String aggregateName = new NamedInternal(named).orElseGenerateWithPrefix(builder, AGGREGATE_NAME);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
        Objects.requireNonNull(reducer, "reducer can't be null");
        Objects.requireNonNull(named, "named can't be null");
        Objects.requireNonNull(materialized, "materialized can't be null");

        final MaterializedInternal<K, V, WindowStore<Bytes, byte[]>> materializedInternal =
                new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }

        final String reduceName = new NamedInternal(named).orElseGenerateWithPrefix(builder, REDUCE_NAME);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedCogroupedKStreamImpl.java`
#### Snippet
```java
            final long retentionPeriod = materialized.retention() != null ?
                materialized.retention().toMillis() : windows.size() + windows.gracePeriodMs();

            if ((windows.size() + windows.gracePeriodMs()) > retentionPeriod) {
                throw new IllegalArgumentException("The retention period of the window store "
                        + name
                        + " must be no smaller than its window size plus the grace period."
                        + " Got size=[" + windows.size() + "],"
                        + " grace=[" + windows.gracePeriodMs()
                        + "],"
                        + " retention=[" + retentionPeriod
                        + "]");
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java`
#### Snippet
```java
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(supplier, "supplier must not be null");
        Objects.requireNonNull(predecessorNames, "predecessor names must not be null");
        ApiUtils.checkSupplier(supplier);
        if (nodeFactories.containsKey(name)) {
            throw new TopologyException("Processor " + name + " is already added.");
        }
        if (predecessorNames.length == 0) {
            throw new TopologyException("Processor " + name + " must have at least one parent");
        }

        for (final String predecessor : predecessorNames) {
            Objects.requireNonNull(predecessor, "predecessor name must not be null");
            if (predecessor.equals(name)) {
                throw new TopologyException("Processor " + name + " cannot be a predecessor of itself.");
            }
            if (!nodeFactories.containsKey(predecessor)) {
                throw new TopologyException("Predecessor processor " + predecessor + " is not added yet for " + name);
            }
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorContextUtils.java`
#### Snippet
```java
        final String prefix = getPrefix(context.appConfigs(), context.applicationId());
        if (context instanceof InternalProcessorContext && !newChangelogTopic) {
            final String changelogTopic = ((InternalProcessorContext) context).changelogFor(storeName);
            if (changelogTopic != null)
                return changelogTopic;

        }
        return ProcessorStateManager.storeChangelogTopic(prefix, storeName, context.taskId().topologyName());
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StandbyTask.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder();
        sb.append(indent);
        sb.append("TaskId: ");
        sb.append(id);
        sb.append("\n");

        // print topology
        if (topology != null) {
            sb.append(indent).append(topology.toString(indent + "\t"));
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java`
#### Snippet
```java
        final Set<TaskMetadata> activeTasksMetadata = new HashSet<>();
        for (final Map.Entry<TaskId, Task> task : activeTasks.entrySet()) {
            activeTasksMetadata.add(new TaskMetadataImpl(
                task.getValue().id(),
                task.getValue().inputPartitions(),
                task.getValue().committedOffsets(),
                task.getValue().highWaterMark(),
                task.getValue().timeCurrentIdlingStarted()
            ));
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java
                    final Set<TopicPartition> activePartitionsOnHost = new HashSet<>();
                    final Set<String> activeStoresOnHost = new HashSet<>();
                    if (activePartitionHostMap.containsKey(hostInfo)) {
                        // filter out partitions for topics that are not connected to this topology
                        activePartitionsOnHost.addAll(
                            activePartitionHostMap.get(hostInfo).stream()
                                .filter(tp -> topologyMetadata.fullSourceTopicNamesForTopology(topologyName).contains(tp.topic()))
                                .collect(Collectors.toSet())
                        );
                        activeStoresOnHost.addAll(getStoresOnHost(storeToSourceTopics, activePartitionsOnHost));
                    }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java
                final Set<TopicPartition> activePartitionsOnHost = new HashSet<>();
                final Set<String> activeStoresOnHost = new HashSet<>();
                if (activePartitionHostMap.containsKey(hostInfo)) {
                    activePartitionsOnHost.addAll(activePartitionHostMap.get(hostInfo));
                    activeStoresOnHost.addAll(getStoresOnHost(storeToSourceTopics, activePartitionsOnHost));
                }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java
        final Integer partition = getPartition.apply(partitioner.partitions(sourceTopicsInfo.topicWithMostPartitions, key, null, sourceTopicsInfo.maxPartitions));
        final Set<TopicPartition> matchingPartitions = new HashSet<>();
        for (final String sourceTopic : sourceTopicsInfo.sourceTopics) {
            matchingPartitions.add(new TopicPartition(sourceTopic, partition));
        }

        HostInfo activeHost = UNKNOWN_HOST;
        final Set<HostInfo> standbyHosts = new HashSet<>();
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java
            final Set<String> activeStateStoreNames = streamsMetadata.stateStoreNames();
            final Set<TopicPartition> topicPartitions = new HashSet<>(streamsMetadata.topicPartitions());
            final Set<String> standbyStateStoreNames = streamsMetadata.standbyStateStoreNames();
            final Set<TopicPartition> standbyTopicPartitions = new HashSet<>(streamsMetadata.standbyTopicPartitions());

            topicPartitions.retainAll(matchingPartitions);
            if (activeStateStoreNames.contains(storeName) && !topicPartitions.isEmpty()) {
                activeHost = streamsMetadata.hostInfo();
            }

            standbyTopicPartitions.retainAll(matchingPartitions);
            if (standbyStateStoreNames.contains(storeName) && !standbyTopicPartitions.isEmpty()) {
                standbyHosts.add(streamsMetadata.hostInfo());
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/TaskManager.java`
#### Snippet
```java
        try {
            // we call this function only to flush the case if necessary
            // before suspending and closing the topology
            task.prepareCommit();
        } catch (final RuntimeException swallow) {
            log.error("Error flushing caches of dirty task {} ", task.id(), swallow);
        }

        try {
            task.suspend();
        } catch (final RuntimeException swallow) {
            log.error("Error suspending dirty task {}: {}", task.id(), swallow.getMessage());
        }

        task.closeDirty();
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/TaskMovement.java`
#### Snippet
```java
        final BiFunction<UUID, TaskId, Boolean> caughtUpPredicate =
            (client, task) -> taskIsCaughtUpOnClient(task, client, tasksToCaughtUpClients);

        final ConstrainedPrioritySet caughtUpClientsByTaskLoad = new ConstrainedPrioritySet(
            caughtUpPredicate,
            client -> clientStates.get(client).assignedTaskLoad()
        );

        final Queue<TaskMovement> taskMovements = new PriorityQueue<>(
            Comparator.comparing(TaskMovement::numCaughtUpClients).thenComparing(TaskMovement::task)
        );
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/Stores.java`
#### Snippet
```java
        Objects.requireNonNull(name, "name cannot be null");
        final String rpMsgPrefix = prepareMillisCheckFailMsgPrefix(retentionPeriod, "retentionPeriod");
        final long retentionMs = validateMillisecondDuration(retentionPeriod, rpMsgPrefix);
        final String wsMsgPrefix = prepareMillisCheckFailMsgPrefix(windowSize, "windowSize");
        final long windowSizeMs = validateMillisecondDuration(windowSize, wsMsgPrefix);

        final long defaultSegmentInterval = Math.max(retentionMs / 2, 60_000L);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/Stores.java`
#### Snippet
```java
        if (retentionPeriod < 0L) {
            throw new IllegalArgumentException("retentionPeriod cannot be negative");
        }
        if (windowSize < 0L) {
            throw new IllegalArgumentException("windowSize cannot be negative");
        }
        if (segmentInterval < 1L) {
            throw new IllegalArgumentException("segmentInterval cannot be zero or negative");
        }
        if (windowSize > retentionPeriod) {
            throw new IllegalArgumentException("The retention period of the window store "
                + name + " must be no smaller than its window size. Got size=["
                + windowSize + "], retention=[" + retentionPeriod + "]");
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractRocksDBSegmentedBytesStore.java`
#### Snippet
```java
        final File positionCheckpointFile = new File(context.stateDir(), name() + ".position");
        this.positionCheckpoint = new OffsetCheckpoint(positionCheckpointFile);
        this.position = StoreQueryUtils.readPositionFromCheckpoint(positionCheckpoint);

        // register and possibly restore the state from the logs
        stateStoreContext.register(
            root,
            (RecordBatchingStateRestoreCallback) this::restoreAllInternal,
            () -> StoreQueryUtils.checkpointPosition(positionCheckpoint, position)
        );

        open = true;

        consistencyEnabled = StreamsConfig.InternalConfig.getBoolean(
                context.appConfigs(),
                IQ_CONSISTENCY_OFFSET_VECTOR_ENABLED,
                false);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractDualSchemaRocksDBSegmentedBytesStore.java`
#### Snippet
```java
        try {
            final Map<S, WriteBatch> writeBatchMap = getWriteBatches(records);
            for (final Map.Entry<S, WriteBatch> entry : writeBatchMap.entrySet()) {
                final S segment = entry.getKey();
                final WriteBatch batch = entry.getValue();
                segment.write(batch);
                batch.close();
            }
        } catch (final RocksDBException e) {
            throw new ProcessorStateException("Error restoring batch to store " + this.name, e);
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingSessionStore.java`
#### Snippet
```java
        if (keyFrom != null && keyTo != null && keyFrom.compareTo(keyTo) > 0) {
            LOG.warn(INVALID_RANGE_WARN_MSG);
            return KeyValueIterators.emptyIterator();
        }

        validateStoreOpen();

        final Bytes cacheKeyFrom = keyFrom == null ? null : cacheFunction.cacheKey(keySchema.lowerRange(keyFrom, earliestSessionEndTime));
        final Bytes cacheKeyTo = keyTo == null ? null : cacheFunction.cacheKey(keySchema.upperRange(keyTo, latestSessionStartTime));
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingSessionStore.java`
#### Snippet
```java
            if (current == null) {
                return false;
            }

            if (current.hasNext()) {
                return true;
            }

            while (!current.hasNext()) {
                getNextSegmentIterator();
                if (current == null) {
                    return false;
                }
            }
            return true;
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java`
#### Snippet
```java
        if (keyFrom != null && keyTo != null && keyFrom.compareTo(keyTo) > 0) {
            LOG.warn("Returning empty iterator for fetch with invalid key range: from > to. " +
                "This may be due to range arguments set in the wrong order, " +
                "or serdes that don't preserve ordering when lexicographically comparing the serialized bytes. " +
                "Note that the built-in numerical serdes do not follow this for negative numbers");
            return KeyValueIterators.emptyIterator();
        }

        // since this function may not access the underlying inner store, we need to validate
        // if store is open outside as well.
        validateStoreOpen();

        final KeyValueIterator<Windowed<Bytes>, byte[]> underlyingIterator =
            wrapped().fetch(keyFrom, keyTo, timeFrom, timeTo);
        if (context.cache() == null) {
            return underlyingIterator;
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java`
#### Snippet
```java
        if (keyFrom != null && keyTo != null && keyFrom.compareTo(keyTo) > 0) {
            LOG.warn("Returning empty iterator for fetch with invalid key range: from > to. "
                + "This may be due to serdes that don't preserve ordering when lexicographically comparing the serialized bytes. " +
                "Note that the built-in numerical serdes do not follow this for negative numbers");
            return KeyValueIterators.emptyIterator();
        }

        // since this function may not access the underlying inner store, we need to validate
        // if store is open outside as well.
        validateStoreOpen();

        final KeyValueIterator<Windowed<Bytes>, byte[]> underlyingIterator =
            wrapped().backwardFetch(keyFrom, keyTo, timeFrom, timeTo);
        if (context.cache() == null) {
            return underlyingIterator;
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java`
#### Snippet
```java
            this.segmentInterval = cacheFunction.getSegmentInterval();

            if (forward) {
                this.lastSegmentId = cacheFunction.segmentId(Math.min(timeTo, maxObservedTimestamp.get()));
                this.currentSegmentId = cacheFunction.segmentId(timeFrom);

                setCacheKeyRange(timeFrom, currentSegmentLastTime());
                this.current = context.cache().range(cacheName, cacheKeyFrom, cacheKeyTo);
            } else {
                this.currentSegmentId = cacheFunction.segmentId(Math.min(timeTo, maxObservedTimestamp.get()));
                this.lastSegmentId = cacheFunction.segmentId(timeFrom);

                setCacheKeyRange(currentSegmentBeginTime(), Math.min(timeTo, maxObservedTimestamp.get()));
                this.current = context.cache().reverseRange(cacheName, cacheKeyFrom, cacheKeyTo);
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java`
#### Snippet
```java
            if (forward) {
                ++currentSegmentId;
                // updating as maxObservedTimestamp can change while iterating
                lastSegmentId = cacheFunction.segmentId(Math.min(timeTo, maxObservedTimestamp.get()));

                if (currentSegmentId > lastSegmentId) {
                    current = null;
                    return;
                }

                setCacheKeyRange(currentSegmentBeginTime(), currentSegmentLastTime());

                current.close();

                current = context.cache().range(cacheName, cacheKeyFrom, cacheKeyTo);
            } else {
                --currentSegmentId;

                // last segment id is stable when iterating backward, therefore no need to update
                if (currentSegmentId < lastSegmentId) {
                    current = null;
                    return;
                }

                setCacheKeyRange(currentSegmentBeginTime(), currentSegmentLastTime());

                current.close();

                current = context.cache().reverseRange(cacheName, cacheKeyFrom, cacheKeyTo);
            }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/KeyValueToTimestampedKeyValueByteStoreAdapter.java`
#### Snippet
```java
        final long start = config.isCollectExecutionInfo() ? System.nanoTime() : -1L;
        final QueryResult<R> result = store.query(query, positionBound, config);
        if (config.isCollectExecutionInfo()) {
            final long end = System.nanoTime();
            result.addExecutionInfo(
                "Handled in " + getClass() + " in " + (end - start) + "ns"
            );
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredKeyValueStore.java`
#### Snippet
```java
        taskId = context.taskId();
        initStoreSerde(context);
        streamsMetrics = (StreamsMetricsImpl) context.metrics();

        registerMetrics();
        final Sensor restoreSensor =
            StateStoreMetrics.restoreSensor(taskId.toString(), metricsScope, name(), streamsMetrics);

        // register and possibly restore the state from the logs
        maybeMeasureLatency(() -> super.init(context, root), time, restoreSensor);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredKeyValueStore.java`
#### Snippet
```java
        this.context = context instanceof InternalProcessorContext ? (InternalProcessorContext<?, ?>) context : null;
        taskId = context.taskId();
        initStoreSerde(context);
        streamsMetrics = (StreamsMetricsImpl) context.metrics();

        registerMetrics();
        final Sensor restoreSensor =
            StateStoreMetrics.restoreSensor(taskId.toString(), metricsScope, name(), streamsMetrics);

        // register and possibly restore the state from the logs
        maybeMeasureLatency(() -> super.init(context, root), time, restoreSensor);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredKeyValueStore.java`
#### Snippet
```java
        final long start = time.nanoseconds();
        final QueryResult<R> result;

        final QueryHandler handler = queryHandlers.get(query.getClass());
        if (handler == null) {
            result = wrapped().query(query, positionBound, config);
            if (config.isCollectExecutionInfo()) {
                result.addExecutionInfo(
                    "Handled in " + getClass() + " in " + (time.nanoseconds() - start) + "ns");
            }
        } else {
            result = (QueryResult<R>) handler.apply(
                query,
                positionBound,
                config,
                this
            );
            if (config.isCollectExecutionInfo()) {
                result.addExecutionInfo(
                    "Handled in " + getClass() + " with serdes "
                        + serdes + " in " + (time.nanoseconds() - start) + "ns");
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredVersionedKeyValueStore.java`
#### Snippet
```java
            super.initStoreSerde(context);

            // additionally init raw value serde
            final String storeName = super.name();
            final String changelogTopic = ProcessorContextUtils.changelogFor(context, storeName, Boolean.FALSE);
            plainValueSerdes = new StateSerdes<>(
                changelogTopic,
                prepareKeySerde(keySerde, new SerdeGetter(context)),
                prepareValueSerde(plainValueSerde, new SerdeGetter(context))
            );
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
        hash ^= length;
        hash ^= (hash >>> 16);
        hash *= 0x85ebca6b;
        hash ^= (hash >>> 13);
        hash *= 0xc2b2ae35;
        hash ^= (hash >>> 16);

        return hash;
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
            long k = ((long) data[offset + i8] & 0xff)
                    | (((long) data[offset + i8 + 1] & 0xff) << 8)
                    | (((long) data[offset + i8 + 2] & 0xff) << 16)
                    | (((long) data[offset + i8 + 3] & 0xff) << 24)
                    | (((long) data[offset + i8 + 4] & 0xff) << 32)
                    | (((long) data[offset + i8 + 5] & 0xff) << 40)
                    | (((long) data[offset + i8 + 6] & 0xff) << 48)
                    | (((long) data[offset + i8 + 7] & 0xff) << 56);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
            k1 *= C1;
            k1 = Long.rotateLeft(k1, R1);
            k1 *= C2;
            h1 ^= k1;
            h1 = Long.rotateLeft(h1, R2);
            h1 += h2;
            h1 = h1 * M + N1;
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/PrefixedSessionKeySchemas.java`
#### Snippet
```java
                    final Bytes bytes = iterator.peekNextKey();
                    final byte prefix = extractPrefix(bytes.get());

                    if (prefix != TIME_FIRST_PREFIX) {
                        return false;
                    }

                    final Windowed<Bytes> windowedKey = from(bytes);
                    final long endTime = windowedKey.window().end();
                    final long startTime = windowedKey.window().start();
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/PrefixedSessionKeySchemas.java`
#### Snippet
```java
            if (noPrefixKey == null) {
                final byte prefix = upperRange ? KEY_FIRST_PREFIX + 1 : KEY_FIRST_PREFIX;
                final byte[] ret = ByteBuffer.allocate(PREFIX_SIZE)
                    .put(prefix)
                    .array();
                return Bytes.wrap(ret);
            }
            final byte[] ret = ByteBuffer.allocate(PREFIX_SIZE + noPrefixKey.get().length)
                .put(KEY_FIRST_PREFIX)
                .put(noPrefixKey.get())
                .array();
            return Bytes.wrap(ret);
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBRangeIterator.java`
#### Snippet
```java
        final KeyValue<Bytes, byte[]> next = super.makeNext();
        if (next == null) {
            return allDone();
        } else if (rawLastKey == null) {
            //null means range endpoint is open
            return next;

        } else {
            if (forward) {
                if (comparator.compare(next.key.get(), rawLastKey) < 0) {
                    return next;
                } else if (comparator.compare(next.key.get(), rawLastKey) == 0) {
                    return toInclusive ? next : allDone();
                } else {
                    return allDone();
                }
            } else {
                if (comparator.compare(next.key.get(), rawLastKey) >= 0) {
                    return next;
                } else {
                    return allDone();
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `streams/src/main/java/org/apache/kafka/streams/state/internals/metrics/RocksDBMetricsRecorder.java`
#### Snippet
```java
        long bytesWrittenToDatabase = 0;
        long bytesReadFromDatabase = 0;
        long memtableBytesFlushed = 0;
        long memtableHits = 0;
        long memtableMisses = 0;
        long blockCacheDataHits = 0;
        long blockCacheDataMisses = 0;
        long blockCacheIndexHits = 0;
        long blockCacheIndexMisses = 0;
```

### DuplicatedCode
Duplicated code
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/Agent.java`
#### Snippet
```java
        Namespace res = null;
        try {
            res = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            if (args.length == 0) {
                parser.printHelp();
                Exit.exit(0);
            } else {
                parser.handleError(e);
                Exit.exit(1);
            }
        }
        String configPath = res.getString("config");
        String nodeName = res.getString("node_name");
```

### DuplicatedCode
Duplicated code
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/GaussianTimestampConstantPayloadGenerator.java`
#### Snippet
```java
        random.setSeed(seed + position);

        // Calculate the next message size based on a gaussian distribution.
        if ((messageSize == 0) || (messageTracker >= messagesUntilSizeChange)) {
            messageTracker = 0;
            messageSize = Math.max((int) (random.nextGaussian() * messageSizeDeviation) + messageSizeAverage, Long.BYTES);
        }
        messageTracker += 1;

        // Generate the byte array before the timestamp generation.
        byte[] result = new byte[messageSize];
```

### DuplicatedCode
Duplicated code
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchWorker.java`
#### Snippet
```java
                Map<String, NewTopic> newTopics = new HashMap<>();
                HashSet<TopicPartition> active = new HashSet<>();
                for (Map.Entry<String, PartitionsSpec> entry :
                        spec.activeTopics().materialize().entrySet()) {
                    String topicName = entry.getKey();
                    PartitionsSpec partSpec = entry.getValue();
                    newTopics.put(topicName, partSpec.newTopic(topicName));
                    for (Integer partitionNumber : partSpec.partitionNumbers()) {
                        active.add(new TopicPartition(topicName, partitionNumber));
                    }
                }
                if (active.isEmpty()) {
                    throw new RuntimeException("You must specify at least one active topic.");
                }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `clients/src/main/java/org/apache/kafka/common/record/AbstractLegacyRecordBatch.java`
#### Snippet
```java
    private static final class DataLogInputStream implements LogInputStream<AbstractLegacyRecordBatch> {
        private final InputStream stream;
        protected final int maxMessageSize;
        private final ByteBuffer offsetAndSizeBuffer;

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `clients/src/main/java/org/apache/kafka/common/security/ssl/DefaultSslEngineFactory.java`
#### Snippet
```java

    // Visibility to override for testing
    protected SecurityStore createKeystore(String type, String path, Password password, Password keyPassword, Password privateKey, Password certificateChain) {
        if (privateKey != null) {
            if (!PEM_TYPE.equals(type))
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/FetchMetricsRegistry.java`
#### Snippet
```java
    public FetchMetricsRegistry(Set<String> tags, String metricGrpPrefix) {

        /***** Client level *****/
        String groupName = metricGrpPrefix + "-fetch-manager-metrics";

```

### DanglingJavadoc
Dangling Javadoc comment
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/FetchMetricsRegistry.java`
#### Snippet
```java
                "The maximum throttle time in ms", tags);

        /***** Topic level *****/
        Set<String> topicTags = new LinkedHashSet<>(tags);
        topicTags.add("topic");
```

### DanglingJavadoc
Dangling Javadoc comment
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/FetchMetricsRegistry.java`
#### Snippet
```java
                "The total number of records consumed for a topic", topicTags);

        /***** Partition level *****/
        Set<String> partitionTags = new HashSet<>(topicTags);
        partitionTags.add("partition");
```

### DanglingJavadoc
Dangling Javadoc comment
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/SenderMetricsRegistry.java`
#### Snippet
```java
        this.allTemplates = new ArrayList<>();
        
        /***** Client level *****/
        
        this.batchSizeAvg = createMetricName("batch-size-avg",
```

### DanglingJavadoc
Dangling Javadoc comment
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/SenderMetricsRegistry.java`
#### Snippet
```java
                "The maximum time in ms a request was throttled by a broker");

        /***** Topic level *****/
        this.topicTags = new LinkedHashSet<>(tags);
        this.topicTags.add("topic");
```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java

    public ConnectMetricsRegistry(Set<String> tags) {
        /***** Connector level *****/
        Set<String> connectorTags = new LinkedHashSet<>(tags);
        connectorTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java
                                          "The version of the connector class, as reported by the connector.", connectorTags);

        /***** Worker task level *****/
        Set<String> workerTaskTags = new LinkedHashSet<>(tags);
        workerTaskTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java
                                                     workerTaskTags);

        /***** Source worker task level *****/
        Set<String> sourceTaskTags = new LinkedHashSet<>(tags);
        sourceTaskTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java
                                            sourceTaskTags);

        /***** Sink worker task level *****/
        Set<String> sinkTaskTags = new LinkedHashSet<>(tags);
        sinkTaskTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java
                                                  sinkTaskTags);

        /***** Worker level *****/
        Set<String> workerTags = new LinkedHashSet<>(tags);

```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java
        connectorStatusMetrics = Collections.unmodifiableMap(connectorStatusMetrics);

        /***** Worker rebalance level *****/
        Set<String> rebalanceTags = new LinkedHashSet<>(tags);

```

### DanglingJavadoc
Dangling Javadoc comment
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetricsRegistry.java`
#### Snippet
```java
                                                "The time in milliseconds since this worker completed the most recent rebalance.", rebalanceTags);

        /***** Task Error Handling Metrics *****/
        Set<String> taskErrorHandlingTags = new LinkedHashSet<>(tags);
        taskErrorHandlingTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/util/ByteUtilsBenchmark.java`
#### Snippet
```java
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 1)
/**
 * This benchmark calculates the empirical evidence of different implementation for encoding/decoding a protobuf
 * <a href="https://protobuf.dev/programming-guides/encoding/#varints">VarInt</a> and VarLong.
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `handshakeResponse` declared in one 'switch' branch and used in another
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientAuthenticator.java`
#### Snippet
```java
                break;
            case RECEIVE_HANDSHAKE_RESPONSE:
                SaslHandshakeResponse handshakeResponse = (SaslHandshakeResponse) receiveKafkaResponse();
                if (handshakeResponse == null)
                    break;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/HelpCommandHandler.java`
#### Snippet
```java
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HelpCommandHandler)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/glob/GlobVisitor.java`
#### Snippet
```java
            MetadataNodeInfo other = (MetadataNodeInfo) o;
            if (!Arrays.equals(path, other.path)) return false;
            if (!node.equals(other.node)) return false;
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/FindCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof FindCommandHandler)) return false;
        FindCommandHandler o = (FindCommandHandler) other;
        if (!Objects.equals(o.paths, paths)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/ErroneousCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof ErroneousCommandHandler)) return false;
        ErroneousCommandHandler o = (ErroneousCommandHandler) other;
        if (!Objects.equals(o.message, message)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/NoOpCommandHandler.java`
#### Snippet
```java
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof NoOpCommandHandler)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/PwdCommandHandler.java`
#### Snippet
```java
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PwdCommandHandler)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/ManCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof ManCommandHandler)) return false;
        ManCommandHandler o = (ManCommandHandler) other;
        if (!o.cmd.equals(cmd)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/CdCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof CdCommandHandler)) return false;
        CdCommandHandler o = (CdCommandHandler) other;
        if (!o.target.equals(target)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/ExitCommandHandler.java`
#### Snippet
```java
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExitCommandHandler)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/CatCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof CatCommandHandler)) return false;
        CatCommandHandler o = (CatCommandHandler) other;
        if (!Objects.equals(o.targets, targets)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/TreeCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof TreeCommandHandler)) return false;
        TreeCommandHandler o = (TreeCommandHandler) other;
        if (!Objects.equals(o.targets, targets)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
        if (!(other instanceof LsCommandHandler)) return false;
        LsCommandHandler o = (LsCommandHandler) other;
        if (!Objects.equals(o.targets, targets)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
            ColumnSchema other = (ColumnSchema) o;
            if (entriesPerColumn != other.entriesPerColumn) return false;
            if (!Arrays.equals(columnWidths, other.columnWidths)) return false;
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `clients/src/main/java/org/apache/kafka/common/security/ssl/DefaultSslEngineFactory.java`
#### Snippet
```java
            return true;
        }
        if (keystore != null && keystore.modified()) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `clients/src/main/java/org/apache/kafka/clients/admin/ConsumerGroupListing.java`
#### Snippet
```java
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
```

### TrivialIf
`if` statement can be simplified
in `clients/src/main/java/org/apache/kafka/clients/admin/ConsumerGroupListing.java`
#### Snippet
```java
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java

            int firstInFlightSequence = transactionManager.firstInFlightSequence(first.topicPartition);
            if (firstInFlightSequence != RecordBatch.NO_SEQUENCE && first.hasSequence()
                && first.baseSequence() != firstInFlightSequence)
                // If the queued batch already has an assigned sequence, then it is being retried.
```

### TrivialIf
`if` statement can be simplified
in `connect/api/src/main/java/org/apache/kafka/connect/data/Values.java`
#### Snippet
```java
            if (knownType == null) {
                knownType = schema.type();
            } else if (knownType != schema.type()) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/TasksRequest.java`
#### Snippet
```java
        }

        if (this.state.isPresent() && !this.state.get().equals(state)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/Empty.java`
#### Snippet
```java
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `metadata/src/main/java/org/apache/kafka/controller/PartitionChangeBuilder.java`
#### Snippet
```java
        if (record.removingReplicas() != null) return false;
        if (record.addingReplicas() != null) return false;
        if (record.leaderRecoveryState() != LeaderRecoveryState.NO_CHANGE) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `metadata/src/main/java/org/apache/kafka/controller/errors/ControllerExceptions.java`
#### Snippet
```java
            if (exception == null) return false;
        }
        if (!(exception instanceof NotControllerException)) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `metadata/src/main/java/org/apache/kafka/controller/errors/ControllerExceptions.java`
#### Snippet
```java
            if (exception == null) return false;
        }
        if (!(exception instanceof TimeoutException)) return false;
        return true;
    }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `clients/src/main/java/org/apache/kafka/common/metrics/JmxReporter.java`
#### Snippet
```java
        mBeanName.append(metricName.group());
        for (Map.Entry<String, String> entry : metricName.tags().entrySet()) {
            if (entry.getKey().length() <= 0 || entry.getValue().length() <= 0)
                continue;
            mBeanName.append(",");
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `clients/src/main/java/org/apache/kafka/common/metrics/JmxReporter.java`
#### Snippet
```java
        mBeanName.append(metricName.group());
        for (Map.Entry<String, String> entry : metricName.tags().entrySet()) {
            if (entry.getKey().length() <= 0 || entry.getValue().length() <= 0)
                continue;
            mBeanName.append(",");
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerUnsecuredLoginCallbackHandler.java`
#### Snippet
```java

    private String listJsonText(String value) {
        if (value.isEmpty() || value.length() <= 1)
            return "[]";
        String delimiter;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java`
#### Snippet
```java

        String clientIdConfig = config.getString(CommonClientConfigs.CLIENT_ID_CONFIG);
        String clientId = clientIdConfig.length() <= 0 ? "connect-" + CONNECT_CLIENT_ID_SEQUENCE.getAndIncrement() : clientIdConfig;
        // Thread factory uses String.format and '%' is handled as a placeholder
        // need to escape if the client.id contains an actual % character
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
        final String userClientId = applicationConfigs.getString(StreamsConfig.CLIENT_ID_CONFIG);
        final String applicationId = applicationConfigs.getString(StreamsConfig.APPLICATION_ID_CONFIG);
        if (userClientId.length() <= 0) {
            clientId = applicationId + "-" + processId;
        } else {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/CopartitionedTopicsEnforcer.java`
#### Snippet
```java
            maxPartitions = Integer.max(maxPartitions, partitions.orElse(maxPartitions));
        }
        if (maxPartitions <= 0) {
            throw new IllegalStateException(logPrefix + "Could not validate the copartitioning of topics: " + repartitionTopicsInCopartitionGroup.keySet());
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authorizer'
in `core/src/main/java/kafka/server/builders/KafkaApisBuilder.java`
#### Snippet
```java
    private MetadataCache metadataCache = null;
    private Metrics metrics = null;
    private Optional<Authorizer> authorizer = Optional.empty();
    private QuotaManagers quotas = null;
    private FetchManager fetchManager = null;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authorizer'
in `core/src/main/java/kafka/server/builders/KafkaApisBuilder.java`
#### Snippet
```java
    }

    public KafkaApisBuilder setAuthorizer(Optional<Authorizer> authorizer) {
        this.authorizer = authorizer;
        return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'delayedProducePurgatory'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<RemoteLogManager> remoteLogManager = Optional.empty();
    private Optional<KafkaZkClient> zkClient = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedProduce>> delayedProducePurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedFetch>> delayedFetchPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedDeleteRecords>> delayedDeleteRecordsPurgatory = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'addPartitionsToTxnManager'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<String> threadNamePrefix = Optional.empty();
    private Long brokerEpoch = -1L;
    private Optional<AddPartitionsToTxnManager> addPartitionsToTxnManager = Optional.empty();

    public ReplicaManagerBuilder setConfig(KafkaConfig config) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'zkClient'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private AtomicBoolean isShuttingDown = new AtomicBoolean(false);
    private Optional<RemoteLogManager> remoteLogManager = Optional.empty();
    private Optional<KafkaZkClient> zkClient = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedProduce>> delayedProducePurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedFetch>> delayedFetchPurgatory = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'delayedElectLeaderPurgatory'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<DelayedOperationPurgatory<DelayedFetch>> delayedFetchPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedDeleteRecords>> delayedDeleteRecordsPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedElectLeader>> delayedElectLeaderPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedRemoteFetch>> delayedRemoteFetchPurgatory = Optional.empty();
    private Optional<String> threadNamePrefix = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'remoteLogManager'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private AtomicBoolean isShuttingDown = new AtomicBoolean(false);
    private Optional<RemoteLogManager> remoteLogManager = Optional.empty();
    private Optional<KafkaZkClient> zkClient = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedProduce>> delayedProducePurgatory = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'delayedFetchPurgatory'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<KafkaZkClient> zkClient = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedProduce>> delayedProducePurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedFetch>> delayedFetchPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedDeleteRecords>> delayedDeleteRecordsPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedElectLeader>> delayedElectLeaderPurgatory = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'threadNamePrefix'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<DelayedOperationPurgatory<DelayedElectLeader>> delayedElectLeaderPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedRemoteFetch>> delayedRemoteFetchPurgatory = Optional.empty();
    private Optional<String> threadNamePrefix = Optional.empty();
    private Long brokerEpoch = -1L;
    private Optional<AddPartitionsToTxnManager> addPartitionsToTxnManager = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'delayedDeleteRecordsPurgatory'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<DelayedOperationPurgatory<DelayedProduce>> delayedProducePurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedFetch>> delayedFetchPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedDeleteRecords>> delayedDeleteRecordsPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedElectLeader>> delayedElectLeaderPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedRemoteFetch>> delayedRemoteFetchPurgatory = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'delayedRemoteFetchPurgatory'
in `core/src/main/java/kafka/server/builders/ReplicaManagerBuilder.java`
#### Snippet
```java
    private Optional<DelayedOperationPurgatory<DelayedDeleteRecords>> delayedDeleteRecordsPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedElectLeader>> delayedElectLeaderPurgatory = Optional.empty();
    private Optional<DelayedOperationPurgatory<DelayedRemoteFetch>> delayedRemoteFetchPurgatory = Optional.empty();
    private Optional<String> threadNamePrefix = Optional.empty();
    private Long brokerEpoch = -1L;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'copiedOffsetOption'
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

        // The copiedOffsetOption is OptionalLong.empty() initially for a new leader RLMTask, and needs to be fetched inside the task's run() method.
        private volatile OptionalLong copiedOffsetOption = OptionalLong.empty();

        public void convertToLeader(int leaderEpochVal) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'endpoint'
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java

    // The endpoint for remote log metadata manager to connect to
    private Optional<EndPoint> endpoint = Optional.empty();
    private boolean closed = false;

```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'leaderIdOpt'
in `raft/src/main/java/org/apache/kafka/raft/ElectionState.java`
#### Snippet
```java
public class ElectionState {
    public final int epoch;
    public final OptionalInt leaderIdOpt;
    public final OptionalInt votedIdOpt;
    private final Set<Integer> voters;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'leaderIdOpt'
in `raft/src/main/java/org/apache/kafka/raft/ElectionState.java`
#### Snippet
```java

    ElectionState(int epoch,
                  OptionalInt leaderIdOpt,
                  OptionalInt votedIdOpt,
                  Set<Integer> voters) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'votedIdOpt'
in `raft/src/main/java/org/apache/kafka/raft/ElectionState.java`
#### Snippet
```java
    ElectionState(int epoch,
                  OptionalInt leaderIdOpt,
                  OptionalInt votedIdOpt,
                  Set<Integer> voters) {
        this.epoch = epoch;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'votedIdOpt'
in `raft/src/main/java/org/apache/kafka/raft/ElectionState.java`
#### Snippet
```java
    public final int epoch;
    public final OptionalInt leaderIdOpt;
    public final OptionalInt votedIdOpt;
    private final Set<Integer> voters;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/CandidateState.java`
#### Snippet
```java
    private final int retries;
    private final Map<Integer, State> voteStates = new HashMap<>();
    private final Optional<LogOffsetMetadata> highWatermark;
    private final int electionTimeoutMs;
    private final Timer electionTimer;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/CandidateState.java`
#### Snippet
```java
        int epoch,
        Set<Integer> voters,
        Optional<LogOffsetMetadata> highWatermark,
        int retries,
        int electionTimeoutMs,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'inFlightCorrelationId'
in `raft/src/main/java/org/apache/kafka/raft/RequestManager.java`
#### Snippet
```java
        private long lastSendTimeMs = 0L;
        private long lastFailTimeMs = 0L;
        private OptionalLong inFlightCorrelationId = OptionalLong.empty();

        public ConnectionState(long id) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'oldHighWatermark'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java

    private void logHighWatermarkUpdate(
        Optional<LogOffsetMetadata> oldHighWatermark,
        Optional<LogOffsetMetadata> newHighWatermark
    ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'newHighWatermark'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
    private void logHighWatermarkUpdate(
        Optional<LogOffsetMetadata> oldHighWatermark,
        Optional<LogOffsetMetadata> newHighWatermark
    ) {
        if (!oldHighWatermark.equals(newHighWatermark)) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'newHighWatermark'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
    }

    public boolean updateHighWatermark(OptionalLong newHighWatermark) {
        if (!newHighWatermark.isPresent() && highWatermark.isPresent()) {
            throw new IllegalArgumentException(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fetchingSnapshot'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
     * Fetch request are paused
     */
    private Optional<RawSnapshotWriter> fetchingSnapshot;

    private final Logger log;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'newSnapshot'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
    }

    public void setFetchingSnapshot(Optional<RawSnapshotWriter> newSnapshot) {
        if (fetchingSnapshot.isPresent()) {
            fetchingSnapshot.get().close();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
        int leaderId,
        Set<Integer> voters,
        Optional<LogOffsetMetadata> highWatermark,
        int fetchTimeoutMs,
        LogContext logContext
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
    // Used for tracking the expiration of both the Fetch and FetchSnapshot requests
    private final Timer fetchTimer;
    private Optional<LogOffsetMetadata> highWatermark;
    /* Used to track the currently fetching snapshot. When fetching snapshot regular
     * Fetch request are paused
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metadata'
in `raft/src/main/java/org/apache/kafka/raft/LogOffsetMetadata.java`
#### Snippet
```java

    public final long offset;
    public final Optional<OffsetMetadata> metadata;

    public LogOffsetMetadata(long offset) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'metadata'
in `raft/src/main/java/org/apache/kafka/raft/LogOffsetMetadata.java`
#### Snippet
```java
    }

    public LogOffsetMetadata(long offset, Optional<OffsetMetadata> metadata) {
        this.offset = offset;
        this.metadata = metadata;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/VotedState.java`
#### Snippet
```java
    private final int electionTimeoutMs;
    private final Timer electionTimer;
    private final Optional<LogOffsetMetadata> highWatermark;
    private final Logger log;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/VotedState.java`
#### Snippet
```java
        int votedId,
        Set<Integer> voters,
        Optional<LogOffsetMetadata> highWatermark,
        int electionTimeoutMs,
        LogContext logContext
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'leaderId'
in `raft/src/main/java/org/apache/kafka/raft/LeaderAndEpoch.java`
#### Snippet
```java

public class LeaderAndEpoch {
    private final OptionalInt leaderId;
    private final int epoch;
    public static final LeaderAndEpoch UNKNOWN = new LeaderAndEpoch(OptionalInt.empty(), 0);
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'leaderId'
in `raft/src/main/java/org/apache/kafka/raft/LeaderAndEpoch.java`
#### Snippet
```java
    public static final LeaderAndEpoch UNKNOWN = new LeaderAndEpoch(OptionalInt.empty(), 0);

    public LeaderAndEpoch(OptionalInt leaderId, int epoch) {
        this.leaderId = Objects.requireNonNull(leaderId);
        this.epoch = epoch;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'claimedEpoch'
in `raft/src/main/java/org/apache/kafka/raft/ReplicatedCounter.java`
#### Snippet
```java
    private int committed = 0;
    private int uncommitted = 0;
    private OptionalInt claimedEpoch = OptionalInt.empty();
    private long lastOffsetSnapshotted = -1;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/UnattachedState.java`
#### Snippet
```java
        int epoch,
        Set<Integer> voters,
        Optional<LogOffsetMetadata> highWatermark,
        long electionTimeoutMs,
        LogContext logContext
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/UnattachedState.java`
#### Snippet
```java
    private final long electionTimeoutMs;
    private final Timer electionTimer;
    private final Optional<LogOffsetMetadata> highWatermark;
    private final Logger log;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'oldHighWatermark'
in `raft/src/main/java/org/apache/kafka/raft/LeaderState.java`
#### Snippet
```java

    private void logHighWatermarkUpdate(
        Optional<LogOffsetMetadata> oldHighWatermark,
        LogOffsetMetadata newHighWatermark,
        int indexOfHw,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEndOffsetOpt'
in `raft/src/main/java/org/apache/kafka/raft/LeaderState.java`
#### Snippet
```java
            long currentTimeMs,
            LogOffsetMetadata fetchOffsetMetadata,
            Optional<LogOffsetMetadata> leaderEndOffsetOpt
        ) {
            // Update the `lastCaughtUpTimestamp` before we update the `lastFetchTimestamp`.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/LeaderState.java`
#### Snippet
```java
    private final Set<Integer> grantingVoters;

    private Optional<LogOffsetMetadata> highWatermark;
    private final Map<Integer, ReplicaState> voterStates = new HashMap<>();
    private final Map<Integer, ReplicaState> observerStates = new HashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'endOffset'
in `raft/src/main/java/org/apache/kafka/raft/LeaderState.java`
#### Snippet
```java
    private static class ReplicaState implements Comparable<ReplicaState> {
        final int nodeId;
        Optional<LogOffsetMetadata> endOffset;
        long lastFetchTimestamp;
        long lastFetchLeaderLogEndOffset;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'localId'
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
 */
public class QuorumState {
    private final OptionalInt localId;
    private final Time time;
    private final Logger log;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'localId'
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
    private volatile EpochState state;

    public QuorumState(OptionalInt localId,
                       Set<Integer> voters,
                       int electionTimeoutMs,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'nextBatch'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsBatchReader.java`
#### Snippet
```java
    private long lastReturnedOffset;

    private Optional<Batch<T>> nextBatch = Optional.empty();
    private boolean isClosed = false;

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'pollStartMs'
in `raft/src/main/java/org/apache/kafka/raft/internals/KafkaRaftMetrics.java`
#### Snippet
```java
    private volatile int numUnknownVoterConnections;
    private volatile OptionalLong electionStartMs;
    private volatile OptionalLong pollStartMs;

    private final MetricName currentLeaderIdMetricName;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'electionStartMs'
in `raft/src/main/java/org/apache/kafka/raft/internals/KafkaRaftMetrics.java`
#### Snippet
```java
    private volatile OffsetAndEpoch logEndOffset;
    private volatile int numUnknownVoterConnections;
    private volatile OptionalLong electionStartMs;
    private volatile OptionalLong pollStartMs;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'key'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java
    }

    private T decodeDataRecord(Optional<ByteBuffer> key, Optional<ByteBuffer> value) {
        if (key.isPresent()) {
            throw new IllegalArgumentException("Got key in the record when no key was expected");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java
    }

    private T decodeDataRecord(Optional<ByteBuffer> key, Optional<ByteBuffer> value) {
        if (key.isPresent()) {
            throw new IllegalArgumentException("Got key in the record when no key was expected");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'key'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java
    }

    private static ControlRecord decodeControlRecord(Optional<ByteBuffer> key, Optional<ByteBuffer> value) {
        if (!key.isPresent()) {
            throw new IllegalArgumentException("Missing key in the record when a key was expected");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java
    }

    private static ControlRecord decodeControlRecord(Optional<ByteBuffer> key, Optional<ByteBuffer> value) {
        if (!key.isPresent()) {
            throw new IllegalArgumentException("Missing key in the record when a key was expected");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'allocatedBuffer'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java
    private Optional<Batch<T>> nextBatch = Optional.empty();
    // Buffer used as the backing store for nextBatches if needed
    private Optional<ByteBuffer> allocatedBuffer = Optional.empty();
    // Number of bytes from records read up to now
    private int bytesRead = 0;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'nextBatch'
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java

    private Iterator<MutableRecordBatch> nextBatches = Collections.emptyIterator();
    private Optional<Batch<T>> nextBatch = Optional.empty();
    // Buffer used as the backing store for nextBatches if needed
    private Optional<ByteBuffer> allocatedBuffer = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastContainedLogTimestamp'
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotReader.java`
#### Snippet
```java

    private Optional<Batch<T>> nextBatch = Optional.empty();
    private OptionalLong lastContainedLogTimestamp = OptionalLong.empty();

    private RecordsSnapshotReader(
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'nextBatch'
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotReader.java`
#### Snippet
```java
    private final RecordsIterator<T> iterator;

    private Optional<Batch<T>> nextBatch = Optional.empty();
    private OptionalLong lastContainedLogTimestamp = OptionalLong.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'replicatedLog'
in `raft/src/main/java/org/apache/kafka/snapshot/FileRawSnapshotWriter.java`
#### Snippet
```java
        Path logDir,
        OffsetAndEpoch snapshotId,
        Optional<ReplicatedLog> replicatedLog
    ) {
        Path path = Snapshots.createTempFile(logDir, snapshotId);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'replicatedLog'
in `raft/src/main/java/org/apache/kafka/snapshot/FileRawSnapshotWriter.java`
#### Snippet
```java
        FileChannel channel,
        OffsetAndEpoch snapshotId,
        Optional<ReplicatedLog> replicatedLog
    ) {
        this.tempSnapshotPath = tempSnapshotPath;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'replicatedLog'
in `raft/src/main/java/org/apache/kafka/snapshot/FileRawSnapshotWriter.java`
#### Snippet
```java
    private final FileChannel channel;
    private final OffsetAndEpoch snapshotId;
    private final Optional<ReplicatedLog> replicatedLog;
    private boolean frozen = false;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'records'
in `raft/src/main/java/org/apache/kafka/raft/internals/BatchAccumulator.java`
#### Snippet
```java
        public final long baseOffset;
        public final int numRecords;
        public final Optional<List<T>> records;
        public final MemoryRecords data;
        private final MemoryPool pool;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'shell'
in `shell/src/main/java/org/apache/kafka/shell/command/Commands.java`
#### Snippet
```java
    public interface Handler {
        void run(
            Optional<InteractiveShell> shell,
            PrintWriter writer,
            MetadataShellState state
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `shell/src/main/java/org/apache/kafka/shell/command/CdCommandHandler.java`
#### Snippet
```java
    private final Optional<String> target;

    public CdCommandHandler(Optional<String> target) {
        this.target = target;
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'target'
in `shell/src/main/java/org/apache/kafka/shell/command/CdCommandHandler.java`
#### Snippet
```java
    }

    private final Optional<String> target;

    public CdCommandHandler(Optional<String> target) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'screenWidth'
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java

    static void printTargets(PrintWriter writer,
                             OptionalInt screenWidth,
                             List<String> targetFiles,
                             List<TargetDirectory> targetDirectories) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'screenWidth'
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
    static void printEntries(PrintWriter writer,
                             String intro,
                             OptionalInt screenWidth,
                             List<String> entries) {
        if (entries.isEmpty()) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'screenWidth'
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
    }

    static ColumnSchema calculateColumnSchema(OptionalInt screenWidth,
                                              List<String> entries) {
        if (!screenWidth.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'match'
in `clients/src/main/java/org/apache/kafka/common/quota/ClientQuotaFilterComponent.java`
#### Snippet
```java

    private final String entityType;
    private final Optional<String> match;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'match'
in `clients/src/main/java/org/apache/kafka/common/quota/ClientQuotaFilterComponent.java`
#### Snippet
```java
     *              if null, matches any specified name
     */
    private ClientQuotaFilterComponent(String entityType, Optional<String> match) {
        this.entityType = Objects.requireNonNull(entityType);
        this.match = match;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'leaderId'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java

    private void maybeTransition(
        OptionalInt leaderId,
        int epoch,
        long currentTimeMs
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'leaderId'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
    private Optional<Boolean> maybeHandleCommonResponse(
        Errors error,
        OptionalInt leaderId,
        int epoch,
        long currentTimeMs
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'nodeId'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
        int fetchMaxWaitMs,
        String clusterId,
        OptionalInt nodeId,
        LogContext logContext,
        Random random,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
        Records records,
        ValidOffsetAndEpoch validOffsetAndEpoch,
        Optional<LogOffsetMetadata> highWatermark
    ) {
        return RaftUtil.singletonFetchResponse(log.topicPartition(), log.topicId(), Errors.NONE, partitionData -> {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'nodeId'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
        LogContext logContext,
        String clusterId,
        OptionalInt nodeId,
        RaftConfig raftConfig
    ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'highWatermarkOpt'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
    private void updateFollowerHighWatermark(
        FollowerState state,
        OptionalLong highWatermarkOpt
    ) {
        highWatermarkOpt.ifPresent(highWatermark -> {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'leaderId'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
    }

    private boolean hasConsistentLeader(int epoch, OptionalInt leaderId) {
        // Only elected leaders are sent in the request/response header, so if we have an elected
        // leaderId, it should be consistent with what is in the message.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'highWatermark'
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
    private FetchResponseData buildEmptyFetchResponse(
        Errors error,
        Optional<LogOffsetMetadata> highWatermark
    ) {
        return buildFetchResponse(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/record/FileRecords.java`
#### Snippet
```java
        public final Optional<Integer> leaderEpoch;

        public TimestampAndOffset(long timestamp, long offset, Optional<Integer> leaderEpoch) {
            this.timestamp = timestamp;
            this.offset = offset;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/record/FileRecords.java`
#### Snippet
```java
        public final long timestamp;
        public final long offset;
        public final Optional<Integer> leaderEpoch;

        public TimestampAndOffset(long timestamp, long offset, Optional<Integer> leaderEpoch) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'version'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeAclsResponse.java`
#### Snippet
```java
    }

    private void validate(Optional<Short> version) {
        if (version.isPresent() && version.get() == 0) {
            final boolean unsupported = acls().stream()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchResponse.java`
#### Snippet
```java
        public final String metadata;
        public final Errors error;
        public final Optional<Integer> leaderEpoch;

        public PartitionData(long offset,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchResponse.java`
#### Snippet
```java

        public PartitionData(long offset,
                             Optional<Integer> leaderEpoch,
                             String metadata,
                             Errors error) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/TxnOffsetCommitRequest.java`
#### Snippet
```java
        public final Optional<Integer> leaderEpoch;

        public CommittedOffset(long offset, String metadata, Optional<Integer> leaderEpoch) {
            this.offset = offset;
            this.metadata = metadata;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/TxnOffsetCommitRequest.java`
#### Snippet
```java
        public final long offset;
        public final String metadata;
        public final Optional<Integer> leaderEpoch;

        public CommittedOffset(long offset, String metadata, Optional<Integer> leaderEpoch) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/common/requests/TxnOffsetCommitRequest.java`
#### Snippet
```java
                       final String memberId,
                       final int generationId,
                       final Optional<String> groupInstanceId) {
            super(ApiKeys.TXN_OFFSET_COMMIT);
            this.data = new TxnOffsetCommitRequestData()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'principalSerde'
in `clients/src/main/java/org/apache/kafka/common/requests/RequestContext.java`
#### Snippet
```java
                          ClientInformation clientInformation,
                          boolean fromPrivilegedListener,
                          Optional<KafkaPrincipalSerde> principalSerde) {
        this.header = header;
        this.connectionId = connectionId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'principalSerde'
in `clients/src/main/java/org/apache/kafka/common/requests/RequestContext.java`
#### Snippet
```java
    public final ClientInformation clientInformation;
    public final boolean fromPrivilegedListener;
    public final Optional<KafkaPrincipalSerde> principalSerde;

    public RequestContext(RequestHeader header,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderId'
in `clients/src/main/java/org/apache/kafka/common/requests/MetadataResponse.java`
#### Snippet
```java
        public final TopicPartition topicPartition;
        public final Errors error;
        public final Optional<Integer> leaderId;
        public final Optional<Integer> leaderEpoch;
        public final List<Integer> replicaIds;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/MetadataResponse.java`
#### Snippet
```java
        public final Errors error;
        public final Optional<Integer> leaderId;
        public final Optional<Integer> leaderEpoch;
        public final List<Integer> replicaIds;
        public final List<Integer> inSyncReplicaIds;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderId'
in `clients/src/main/java/org/apache/kafka/common/requests/MetadataResponse.java`
#### Snippet
```java
        public PartitionMetadata(Errors error,
                                 TopicPartition topicPartition,
                                 Optional<Integer> leaderId,
                                 Optional<Integer> leaderEpoch,
                                 List<Integer> replicaIds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/MetadataResponse.java`
#### Snippet
```java
                                 TopicPartition topicPartition,
                                 Optional<Integer> leaderId,
                                 Optional<Integer> leaderEpoch,
                                 List<Integer> replicaIds,
                                 List<Integer> inSyncReplicaIds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sslSession'
in `clients/src/main/java/org/apache/kafka/common/security/auth/SaslAuthenticationContext.java`
#### Snippet
```java
    private final InetAddress clientAddress;
    private final String listenerName;
    private final Optional<SSLSession> sslSession;

    public SaslAuthenticationContext(SaslServer server, SecurityProtocol securityProtocol, InetAddress clientAddress, String listenerName) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sslSession'
in `clients/src/main/java/org/apache/kafka/common/security/auth/SaslAuthenticationContext.java`
#### Snippet
```java
                                     InetAddress clientAddress,
                                     String listenerName,
                                     Optional<SSLSession> sslSession) {
        this.server = server;
        this.securityProtocol = securityProtocol;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lastFetchedEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/FetchRequest.java`
#### Snippet
```java
        public final int maxBytes;
        public final Optional<Integer> currentLeaderEpoch;
        public final Optional<Integer> lastFetchedEpoch;

        public PartitionData(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'currentLeaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/FetchRequest.java`
#### Snippet
```java
            long logStartOffset,
            int maxBytes,
            Optional<Integer> currentLeaderEpoch
        ) {
            this(topicId, fetchOffset, logStartOffset, maxBytes, currentLeaderEpoch, Optional.empty());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'currentLeaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/FetchRequest.java`
#### Snippet
```java
        public final long logStartOffset;
        public final int maxBytes;
        public final Optional<Integer> currentLeaderEpoch;
        public final Optional<Integer> lastFetchedEpoch;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'currentLeaderEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/FetchRequest.java`
#### Snippet
```java
            long logStartOffset,
            int maxBytes,
            Optional<Integer> currentLeaderEpoch,
            Optional<Integer> lastFetchedEpoch
        ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'lastFetchedEpoch'
in `clients/src/main/java/org/apache/kafka/common/requests/FetchRequest.java`
#### Snippet
```java
            int maxBytes,
            Optional<Integer> currentLeaderEpoch,
            Optional<Integer> lastFetchedEpoch
        ) {
            this.topicId = topicId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/GroupRebalanceConfig.java`
#### Snippet
```java
    public final int heartbeatIntervalMs;
    public final String groupId;
    public final Optional<String> groupInstanceId;
    public final long retryBackoffMs;
    public final boolean leaveGroupOnClose;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/GroupRebalanceConfig.java`
#### Snippet
```java
                                final int heartbeatIntervalMs,
                                String groupId,
                                Optional<String> groupInstanceId,
                                long retryBackoffMs,
                                boolean leaveGroupOnClose) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeAuthException'
in `clients/src/main/java/org/apache/kafka/clients/MetadataUpdater.java`
#### Snippet
```java
     * @param maybeAuthException Optional authentication error
     */
    void handleServerDisconnect(long now, String nodeId, Optional<AuthenticationException> maybeAuthException);

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeFatalException'
in `clients/src/main/java/org/apache/kafka/clients/MetadataUpdater.java`
#### Snippet
```java
     * @param maybeFatalException Optional fatal error (e.g. {@link UnsupportedVersionException})
     */
    void handleFailedRequest(long now, Optional<KafkaException> maybeFatalException);

    /**
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'coordinatorEpoch'
in `clients/src/main/java/org/apache/kafka/clients/admin/ProducerState.java`
#### Snippet
```java
        int lastSequence,
        long lastTimestamp,
        OptionalInt coordinatorEpoch,
        OptionalLong currentTransactionStartOffset
    ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'currentTransactionStartOffset'
in `clients/src/main/java/org/apache/kafka/clients/admin/ProducerState.java`
#### Snippet
```java
        long lastTimestamp,
        OptionalInt coordinatorEpoch,
        OptionalLong currentTransactionStartOffset
    ) {
        this.producerId = producerId;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'currentTransactionStartOffset'
in `clients/src/main/java/org/apache/kafka/clients/admin/ProducerState.java`
#### Snippet
```java
    private final long lastTimestamp;
    private final OptionalInt coordinatorEpoch;
    private final OptionalLong currentTransactionStartOffset;

    public ProducerState(
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'coordinatorEpoch'
in `clients/src/main/java/org/apache/kafka/clients/admin/ProducerState.java`
#### Snippet
```java
    private final int lastSequence;
    private final long lastTimestamp;
    private final OptionalInt coordinatorEpoch;
    private final OptionalLong currentTransactionStartOffset;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'state'
in `clients/src/main/java/org/apache/kafka/clients/admin/ConsumerGroupListing.java`
#### Snippet
```java
     * @param state The state of the consumer group
     */
    public ConsumerGroupListing(String groupId, boolean isSimpleConsumerGroup, Optional<ConsumerGroupState> state) {
        this.groupId = groupId;
        this.isSimpleConsumerGroup = isSimpleConsumerGroup;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'state'
in `clients/src/main/java/org/apache/kafka/clients/admin/ConsumerGroupListing.java`
#### Snippet
```java
    private final String groupId;
    private final boolean isSimpleConsumerGroup;
    private final Optional<ConsumerGroupState> state;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leader'
in `clients/src/main/java/org/apache/kafka/clients/Metadata.java`
#### Snippet
```java
        private static final LeaderAndEpoch NO_LEADER_OR_EPOCH = new LeaderAndEpoch(Optional.empty(), Optional.empty());

        public final Optional<Node> leader;
        public final Optional<Integer> epoch;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'epoch'
in `clients/src/main/java/org/apache/kafka/clients/Metadata.java`
#### Snippet
```java

        public final Optional<Node> leader;
        public final Optional<Integer> epoch;

        public LeaderAndEpoch(Optional<Node> leader, Optional<Integer> epoch) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leader'
in `clients/src/main/java/org/apache/kafka/clients/Metadata.java`
#### Snippet
```java
        public final Optional<Integer> epoch;

        public LeaderAndEpoch(Optional<Node> leader, Optional<Integer> epoch) {
            this.leader = Objects.requireNonNull(leader);
            this.epoch = Objects.requireNonNull(epoch);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'epoch'
in `clients/src/main/java/org/apache/kafka/clients/Metadata.java`
#### Snippet
```java
        public final Optional<Integer> epoch;

        public LeaderAndEpoch(Optional<Node> leader, Optional<Integer> epoch) {
            this.leader = Objects.requireNonNull(leader);
            this.epoch = Objects.requireNonNull(epoch);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/admin/ListOffsetsResult.java`
#### Snippet
```java
        private final long offset;
        private final long timestamp;
        private final Optional<Integer> leaderEpoch;

        public ListOffsetsResultInfo(long offset, long timestamp, Optional<Integer> leaderEpoch) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/admin/ListOffsetsResult.java`
#### Snippet
```java
        private final Optional<Integer> leaderEpoch;

        public ListOffsetsResultInfo(long offset, long timestamp, Optional<Integer> leaderEpoch) {
            this.offset = offset;
            this.timestamp = timestamp;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'finalizedFeaturesEpoch'
in `clients/src/main/java/org/apache/kafka/clients/admin/FeatureMetadata.java`
#### Snippet
```java
    private final Map<String, FinalizedVersionRange> finalizedFeatures;

    private final Optional<Long> finalizedFeaturesEpoch;

    private final Map<String, SupportedVersionRange> supportedFeatures;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'finalizedFeaturesEpoch'
in `clients/src/main/java/org/apache/kafka/clients/admin/FeatureMetadata.java`
#### Snippet
```java

    FeatureMetadata(final Map<String, FinalizedVersionRange> finalizedFeatures,
                           final Optional<Long> finalizedFeaturesEpoch,
                           final Map<String, SupportedVersionRange> supportedFeatures) {
        this.finalizedFeatures = new HashMap<>(finalizedFeatures);
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'transactionStartTimeMs'
in `clients/src/main/java/org/apache/kafka/clients/admin/TransactionDescription.java`
#### Snippet
```java
        int producerEpoch,
        long transactionTimeoutMs,
        OptionalLong transactionStartTimeMs,
        Set<TopicPartition> topicPartitions
    ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'transactionStartTimeMs'
in `clients/src/main/java/org/apache/kafka/clients/admin/TransactionDescription.java`
#### Snippet
```java
    private final int producerEpoch;
    private final long transactionTimeoutMs;
    private final OptionalLong transactionStartTimeMs;
    private final Set<TopicPartition> topicPartitions;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/admin/MemberDescription.java`
#### Snippet
```java

    public MemberDescription(String memberId,
                             Optional<String> groupInstanceId,
                             String clientId,
                             String host,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/admin/MemberDescription.java`
#### Snippet
```java
public class MemberDescription {
    private final String memberId;
    private final Optional<String> groupInstanceId;
    private final String clientId;
    private final String host;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastFetchTimestamp'
in `clients/src/main/java/org/apache/kafka/clients/admin/QuorumInfo.java`
#### Snippet
```java
        private final int replicaId;
        private final long logEndOffset;
        private final OptionalLong lastFetchTimestamp;
        private final OptionalLong lastCaughtUpTimestamp;

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'lastFetchTimestamp'
in `clients/src/main/java/org/apache/kafka/clients/admin/QuorumInfo.java`
#### Snippet
```java
            int replicaId,
            long logEndOffset,
            OptionalLong lastFetchTimestamp,
            OptionalLong lastCaughtUpTimestamp
        ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'lastCaughtUpTimestamp'
in `clients/src/main/java/org/apache/kafka/clients/admin/QuorumInfo.java`
#### Snippet
```java
            long logEndOffset,
            OptionalLong lastFetchTimestamp,
            OptionalLong lastCaughtUpTimestamp
        ) {
            this.replicaId = replicaId;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastCaughtUpTimestamp'
in `clients/src/main/java/org/apache/kafka/clients/admin/QuorumInfo.java`
#### Snippet
```java
        private final long logEndOffset;
        private final OptionalLong lastFetchTimestamp;
        private final OptionalLong lastCaughtUpTimestamp;

        ReplicaState() {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'usableBytes'
in `clients/src/main/java/org/apache/kafka/clients/admin/LogDirDescription.java`
#### Snippet
```java
    private final ApiException error;
    private final OptionalLong totalBytes;
    private final OptionalLong usableBytes;

    public LogDirDescription(ApiException error, Map<TopicPartition, ReplicaInfo> replicaInfos) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'totalBytes'
in `clients/src/main/java/org/apache/kafka/clients/admin/LogDirDescription.java`
#### Snippet
```java
    private final Map<TopicPartition, ReplicaInfo> replicaInfos;
    private final ApiException error;
    private final OptionalLong totalBytes;
    private final OptionalLong usableBytes;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'numPartitions'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewTopic.java`
#### Snippet
```java
     * respectively.
     */
    public NewTopic(String name, Optional<Integer> numPartitions, Optional<Short> replicationFactor) {
        this.name = name;
        this.numPartitions = numPartitions;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'replicationFactor'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewTopic.java`
#### Snippet
```java
     * respectively.
     */
    public NewTopic(String name, Optional<Integer> numPartitions, Optional<Short> replicationFactor) {
        this.name = name;
        this.numPartitions = numPartitions;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'replicationFactor'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewTopic.java`
#### Snippet
```java
    private final String name;
    private final Optional<Integer> numPartitions;
    private final Optional<Short> replicationFactor;
    private final Map<Integer, List<Integer>> replicasAssignments;
    private Map<String, String> configs = null;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'numPartitions'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewTopic.java`
#### Snippet
```java

    private final String name;
    private final Optional<Integer> numPartitions;
    private final Optional<Short> replicationFactor;
    private final Map<Integer, List<Integer>> replicasAssignments;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'brokerId'
in `clients/src/main/java/org/apache/kafka/clients/admin/DescribeProducersOptions.java`
#### Snippet
```java
@InterfaceStability.Evolving
public class DescribeProducersOptions extends AbstractOptions<DescribeProducersOptions> {
    private OptionalInt brokerId = OptionalInt.empty();

    public DescribeProducersOptions brokerId(int brokerId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'partitions'
in `clients/src/main/java/org/apache/kafka/clients/admin/Admin.java`
#### Snippet
```java
     * @return                The result.
     */
    ListPartitionReassignmentsResult listPartitionReassignments(Optional<Set<TopicPartition>> partitions,
                                                                ListPartitionReassignmentsOptions options);

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'inflightRequest'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/AdminApiDriver.java`
#### Snippet
```java
     */
    private class RequestState {
        private Optional<RequestSpec<K>> inflightRequest = Optional.empty();
        private int tries = 0;
        private long nextAllowedRetryMs = 0;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerGroupMetadata.java`
#### Snippet
```java
                                 int generationId,
                                 String memberId,
                                 Optional<String> groupInstanceId) {
        this.groupId = Objects.requireNonNull(groupId, "group.id can't be null");
        this.generationId = generationId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerGroupMetadata.java`
#### Snippet
```java
    final private int generationId;
    final private String memberId;
    final private Optional<String> groupInstanceId;

    public ConsumerGroupMetadata(String groupId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/OffsetAndTimestamp.java`
#### Snippet
```java
    }

    public OffsetAndTimestamp(long offset, long timestamp, Optional<Integer> leaderEpoch) {
        if (offset < 0)
            throw new IllegalArgumentException("Invalid negative offset");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/OffsetAndTimestamp.java`
#### Snippet
```java
    private final long timestamp;
    private final long offset;
    private final Optional<Integer> leaderEpoch;

    public OffsetAndTimestamp(long offset, long timestamp) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'brokerId'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/AllBrokersStrategy.java`
#### Snippet
```java
        public final OptionalInt brokerId;

        public BrokerKey(OptionalInt brokerId) {
            this.brokerId = brokerId;
        }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'brokerId'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/AllBrokersStrategy.java`
#### Snippet
```java

    public static class BrokerKey {
        public final OptionalInt brokerId;

        public BrokerKey(OptionalInt brokerId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRecord.java`
#### Snippet
```java
    private final K key;
    private final V value;
    private final Optional<Integer> leaderEpoch;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRecord.java`
#### Snippet
```java
                          V value,
                          Headers headers,
                          Optional<Integer> leaderEpoch) {
        this(topic, partition, offset, timestamp, timestampType, serializedKeySize, serializedValueSize, key, value, headers,
            leaderEpoch);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRecord.java`
#### Snippet
```java
                          V value,
                          Headers headers,
                          Optional<Integer> leaderEpoch) {
        if (topic == null)
            throw new IllegalArgumentException("Topic cannot be null");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/OffsetAndMetadata.java`
#### Snippet
```java
     * @param metadata Non-null metadata
     */
    public OffsetAndMetadata(long offset, Optional<Integer> leaderEpoch, String metadata) {
        if (offset < 0)
            throw new IllegalArgumentException("Invalid negative offset");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'generationId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java
        private final Optional<String> rackId;
        private Optional<String> groupInstanceId;
        private final Optional<Integer> generationId;

        public Subscription(List<String> topics, ByteBuffer userData, List<TopicPartition> ownedPartitions, int generationId, Optional<String> rackId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java
        private final Optional<Integer> generationId;

        public Subscription(List<String> topics, ByteBuffer userData, List<TopicPartition> ownedPartitions, int generationId, Optional<String> rackId) {
            this.topics = topics;
            this.userData = userData;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java
        }

        public void setGroupInstanceId(Optional<String> groupInstanceId) {
            this.groupInstanceId = groupInstanceId;
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java
        private final List<TopicPartition> ownedPartitions;
        private final Optional<String> rackId;
        private Optional<String> groupInstanceId;
        private final Optional<Integer> generationId;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java
        private final ByteBuffer userData;
        private final List<TopicPartition> ownedPartitions;
        private final Optional<String> rackId;
        private Optional<String> groupInstanceId;
        private final Optional<Integer> generationId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CompletedFetch.java`
#### Snippet
```java
     */
    ConsumerRecord<K, V> parseRecord(TopicPartition partition,
                                     Optional<Integer> leaderEpoch,
                                     TimestampType timestampType,
                                     Record record) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lastEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CompletedFetch.java`
#### Snippet
```java

    long nextFetchOffset;
    Optional<Integer> lastEpoch;
    boolean isConsumed = false;
    boolean initialized = false;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractPartitionAssignor.java`
#### Snippet
```java
    public static class MemberInfo implements Comparable<MemberInfo> {
        public final String memberId;
        public final Optional<String> groupInstanceId;
        public final Optional<String> rackId;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractPartitionAssignor.java`
#### Snippet
```java
        }

        public MemberInfo(String memberId, Optional<String> groupInstanceId) {
            this(memberId, groupInstanceId, Optional.empty());
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractPartitionAssignor.java`
#### Snippet
```java
        public final String memberId;
        public final Optional<String> groupInstanceId;
        public final Optional<String> rackId;

        public MemberInfo(String memberId, Optional<String> groupInstanceId, Optional<String> rackId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractPartitionAssignor.java`
#### Snippet
```java
        public final Optional<String> rackId;

        public MemberInfo(String memberId, Optional<String> groupInstanceId, Optional<String> rackId) {
            this.memberId = memberId;
            this.groupInstanceId = groupInstanceId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractPartitionAssignor.java`
#### Snippet
```java
        public final Optional<String> rackId;

        public MemberInfo(String memberId, Optional<String> groupInstanceId, Optional<String> rackId) {
            this.memberId = memberId;
            this.groupInstanceId = groupInstanceId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'offsetEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/SubscriptionState.java`
#### Snippet
```java
        }

        public FetchPosition(long offset, Optional<Integer> offsetEpoch, Metadata.LeaderAndEpoch currentLeader) {
            this.offset = offset;
            this.offsetEpoch = Objects.requireNonNull(offsetEpoch);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'offsetEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/SubscriptionState.java`
#### Snippet
```java
    public static class FetchPosition {
        public final long offset;
        final Optional<Integer> offsetEpoch;
        final Metadata.LeaderAndEpoch currentLeader;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'divergentOffsetOpt'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/SubscriptionState.java`
#### Snippet
```java
        public LogTruncation(TopicPartition topicPartition,
                             FetchPosition fetchPosition,
                             Optional<OffsetAndMetadata> divergentOffsetOpt) {
            this.topicPartition = topicPartition;
            this.fetchPosition = fetchPosition;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'divergentOffsetOpt'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/SubscriptionState.java`
#### Snippet
```java
        public final TopicPartition topicPartition;
        public final FetchPosition fetchPosition;
        public final Optional<OffsetAndMetadata> divergentOffsetOpt;

        public LogTruncation(TopicPartition topicPartition,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'autoCommitState'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CommitRequestManager.java`
#### Snippet
```java
    private final SubscriptionState subscriptionState;
    private final Logger log;
    private final Optional<AutoCommitState> autoCommitState;
    private final CoordinatorRequestManager coordinatorRequestManager;
    private final GroupState groupState;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/OffsetFetcherUtils.java`
#### Snippet
```java
        final long offset;
        final Long timestamp; //  null if the broker does not support returning timestamps
        final Optional<Integer> leaderEpoch; // empty if the leader epoch is not known

        ListOffsetData(long offset, Long timestamp, Optional<Integer> leaderEpoch) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'leaderEpoch'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/OffsetFetcherUtils.java`
#### Snippet
```java
        final Optional<Integer> leaderEpoch; // empty if the leader epoch is not known

        ListOffsetData(long offset, Long timestamp, Optional<Integer> leaderEpoch) {
            this.offset = offset;
            this.timestamp = timestamp;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/GroupState.java`
#### Snippet
```java
    public Generation generation = Generation.NO_GENERATION;

    public GroupState(String groupId, Optional<String> groupInstanceId) {
        this.groupId = groupId;
        this.groupInstanceId = groupInstanceId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/GroupState.java`
#### Snippet
```java
public class GroupState {
    public final String groupId;
    public final Optional<String> groupInstanceId;
    public Generation generation = Generation.NO_GENERATION;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'node'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/NetworkClientDelegate.java`
#### Snippet
```java
        private final AbstractRequest.Builder<?> requestBuilder;
        private final FutureCompletionHandler handler;
        private Optional<Node> node; // empty if random node can be chosen
        private Timer timer;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'node'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/NetworkClientDelegate.java`
#### Snippet
```java
        public UnsentRequest(
                final AbstractRequest.Builder<?> requestBuilder,
                final Optional<Node> node) {
            this(requestBuilder, node, new FutureCompletionHandler());
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'node'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/NetworkClientDelegate.java`
#### Snippet
```java
        public UnsentRequest(
                final AbstractRequest.Builder<?> requestBuilder,
                final Optional<Node> node,
                final FutureCompletionHandler handler) {
            Objects.requireNonNull(requestBuilder);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java`
#### Snippet
```java
    private Logger log;
    private final String clientId;
    private final Optional<String> groupId;
    private final ConsumerCoordinator coordinator;
    private final Deserializer<K> keyDeserializer;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'generation'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractStickyAssignor.java`
#### Snippet
```java
        public final Optional<String> rackId;

        public MemberData(List<TopicPartition> partitions, Optional<Integer> generation, Optional<String> rackId) {
            this.partitions = partitions;
            this.generation = generation;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractStickyAssignor.java`
#### Snippet
```java
        public final Optional<String> rackId;

        public MemberData(List<TopicPartition> partitions, Optional<Integer> generation, Optional<String> rackId) {
            this.partitions = partitions;
            this.generation = generation;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'generation'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractStickyAssignor.java`
#### Snippet
```java
        }

        public MemberData(List<TopicPartition> partitions, Optional<Integer> generation) {
            this(partitions, generation, Optional.empty());
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'generation'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractStickyAssignor.java`
#### Snippet
```java
    public static final class MemberData {
        public final List<TopicPartition> partitions;
        public final Optional<Integer> generation;
        public final Optional<String> rackId;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractStickyAssignor.java`
#### Snippet
```java
        public final List<TopicPartition> partitions;
        public final Optional<Integer> generation;
        public final Optional<String> rackId;

        public MemberData(List<TopicPartition> partitions, Optional<Integer> generation, Optional<String> rackId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/PrototypeAsyncConsumer.java`
#### Snippet
```java
            Metrics metrics,
            ClusterResourceListeners clusterResourceListeners,
            Optional<String> groupId,
            String clientId,
            int defaultApiTimeoutMs) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/PrototypeAsyncConsumer.java`
#### Snippet
```java
    private final EventHandler eventHandler;
    private final Time time;
    private final Optional<String> groupId;
    private final String clientId;
    private final Logger log;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientRack'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
        private final Map<String, List<PartitionRackInfo>> partitionsPerTopic;

        private MetadataSnapshot(Optional<String> clientRack, SubscriptionState subscription, Cluster cluster, int version) {
            Map<String, List<PartitionRackInfo>> partitionsPerTopic = new HashMap<>();
            for (String topic : subscription.metadataTopics()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rackId'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
    private ConsumerGroupMetadata groupMetadata;
    private final boolean throwOnFetchStableOffsetsUnsupported;
    private final Optional<String> rackId;

    // hold onto request&future for committed offset requests to enable async calls.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientRack'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
        private final Set<String> racks;

        PartitionRackInfo(Optional<String> clientRack, PartitionInfo partition) {
            if (clientRack.isPresent() && partition.replicas() != null) {
                racks = Arrays.stream(partition.replicas()).map(Node::rack).collect(Collectors.toSet());
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'producer'
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/KafkaBasedLog.java`
#### Snippet
```java
    private final boolean requireAdminForOffsets;
    private Consumer<K, V> consumer;
    private Optional<Producer<K, V>> producer;
    private TopicAdmin admin;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sourceTaskOffsetCommitter'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java`
#### Snippet
```java
    private final ConcurrentMap<String, WorkerConnector> connectors = new ConcurrentHashMap<>();
    private final ConcurrentMap<ConnectorTaskId, WorkerTask> tasks = new ConcurrentHashMap<>();
    private Optional<SourceTaskOffsetCommitter> sourceTaskOffsetCommitter;
    private final WorkerConfigTransformer workerConfigTransformer;
    private final ConnectorClientConfigOverridePolicy connectorClientConfigOverridePolicy;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'workerStore'
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/ConnectorOffsetBackingStore.java`
#### Snippet
```java
    private final Supplier<LoggingContext> loggingContext;
    private final String primaryOffsetsTopic;
    private final Optional<OffsetBackingStore> workerStore;
    private final Optional<KafkaOffsetBackingStore> connectorStore;
    private final Optional<TopicAdmin> connectorStoreAdmin;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'store'
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/ConnectorOffsetBackingStore.java`
#### Snippet
```java
    }

    private static Future<Map<ByteBuffer, ByteBuffer>> getFromStore(Optional<? extends OffsetBackingStore> store, Collection<ByteBuffer> keys) {
        return store.map(s -> s.get(keys)).orElseGet(() -> CompletableFuture.completedFuture(Collections.emptyMap()));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'connectorStoreAdmin'
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/ConnectorOffsetBackingStore.java`
#### Snippet
```java
    private final Optional<OffsetBackingStore> workerStore;
    private final Optional<KafkaOffsetBackingStore> connectorStore;
    private final Optional<TopicAdmin> connectorStoreAdmin;

    ConnectorOffsetBackingStore(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'connectorStore'
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/ConnectorOffsetBackingStore.java`
#### Snippet
```java
    private final String primaryOffsetsTopic;
    private final Optional<OffsetBackingStore> workerStore;
    private final Optional<KafkaOffsetBackingStore> connectorStore;
    private final Optional<TopicAdmin> connectorStoreAdmin;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'transactionIndex'
in `storage/api/src/main/java/org/apache/kafka/server/log/remote/storage/LogSegmentData.java`
#### Snippet
```java
                          Path offsetIndex,
                          Path timeIndex,
                          Optional<Path> transactionIndex,
                          Path producerSnapshotIndex,
                          ByteBuffer leaderEpochIndex) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'transactionIndex'
in `storage/api/src/main/java/org/apache/kafka/server/log/remote/storage/LogSegmentData.java`
#### Snippet
```java
    private final Path offsetIndex;
    private final Path timeIndex;
    private final Optional<Path> transactionIndex;
    private final Path producerSnapshotIndex;
    private final ByteBuffer leaderEpochIndex;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastStableOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
    public final Records records;
    public final Optional<FetchResponseData.EpochEndOffset> divergingEpoch;
    public final OptionalLong lastStableOffset;
    public final Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions;
    public final OptionalInt preferredReadReplica;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'divergingEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
    public final long logStartOffset;
    public final Records records;
    public final Optional<FetchResponseData.EpochEndOffset> divergingEpoch;
    public final OptionalLong lastStableOffset;
    public final Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'preferredReadReplica'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
    public final OptionalLong lastStableOffset;
    public final Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions;
    public final OptionalInt preferredReadReplica;
    public final boolean isReassignmentFetch;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'divergingEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
                              long logStartOffset,
                              Records records,
                              Optional<FetchResponseData.EpochEndOffset> divergingEpoch,
                              OptionalLong lastStableOffset,
                              Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'lastStableOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
                              Records records,
                              Optional<FetchResponseData.EpochEndOffset> divergingEpoch,
                              OptionalLong lastStableOffset,
                              Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions,
                              OptionalInt preferredReadReplica,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'abortedTransactions'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
                              Optional<FetchResponseData.EpochEndOffset> divergingEpoch,
                              OptionalLong lastStableOffset,
                              Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions,
                              OptionalInt preferredReadReplica,
                              boolean isReassignmentFetch) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'preferredReadReplica'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
                              OptionalLong lastStableOffset,
                              Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions,
                              OptionalInt preferredReadReplica,
                              boolean isReassignmentFetch) {
        this.error = error;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'abortedTransactions'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchPartitionData.java`
#### Snippet
```java
    public final Optional<FetchResponseData.EpochEndOffset> divergingEpoch;
    public final OptionalLong lastStableOffset;
    public final Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions;
    public final OptionalInt preferredReadReplica;
    public final boolean isReassignmentFetch;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java
    // note that the file is not created until we need it
    private Optional<FileChannel> maybeChannel = Optional.empty();
    private OptionalLong lastOffset = OptionalLong.empty();

    public TransactionIndex(long startOffset, File file) throws IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'maybeChannel'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java

    // note that the file is not created until we need it
    private Optional<FileChannel> maybeChannel = Optional.empty();
    private OptionalLong lastOffset = OptionalLong.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'divergingEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogReadInfo.java`
#### Snippet
```java

    public final FetchDataInfo fetchedData;
    public final Optional<FetchResponseData.EpochEndOffset> divergingEpoch;
    public final long highWatermark;
    public final long logStartOffset;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'divergingEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogReadInfo.java`
#### Snippet
```java

    public LogReadInfo(FetchDataInfo fetchedData,
                       Optional<FetchResponseData.EpochEndOffset> divergingEpoch,
                       long highWatermark,
                       long logStartOffset,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TxnMetadata.java`
#### Snippet
```java
    public final long producerId;
    public final LogOffsetMetadata firstOffset;
    public OptionalLong lastOffset;

    public TxnMetadata(long producerId,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'lastOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TxnMetadata.java`
#### Snippet
```java
    public TxnMetadata(long producerId,
                       LogOffsetMetadata firstOffset,
                       OptionalLong lastOffset) {
        Objects.requireNonNull(firstOffset, "firstOffset must be non null");
        this.producerId = producerId;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'lastDataOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LastRecord.java`
#### Snippet
```java
    public final short producerEpoch;

    public LastRecord(OptionalLong lastDataOffset, short producerEpoch) {
        Objects.requireNonNull(lastDataOffset, "lastDataOffset must be non null");
        this.lastDataOffset = lastDataOffset;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'lastDataOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LastRecord.java`
#### Snippet
```java
 */
public final class LastRecord {
    public final OptionalLong lastDataOffset;
    public final short producerEpoch;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'batchMetadata'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateEntry.java`
#### Snippet
```java
     * otherwise.
     */
    public ProducerStateEntry withProducerIdAndBatchMetadata(long producerId, Optional<BatchMetadata> batchMetadata) {
        return new ProducerStateEntry(producerId, this.producerEpoch(), this.coordinatorEpoch, this.lastTimestamp,
            this.currentTxnFirstOffset, batchMetadata);
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'currentTxnFirstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateEntry.java`
#### Snippet
```java
    private int coordinatorEpoch;
    private long lastTimestamp;
    private OptionalLong currentTxnFirstOffset;

    public static ProducerStateEntry empty(long producerId) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'currentTxnFirstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateEntry.java`
#### Snippet
```java

    private void update(short producerEpoch, int coordinatorEpoch, long lastTimestamp, Deque<BatchMetadata> batchMetadata,
                        OptionalLong currentTxnFirstOffset) {
        maybeUpdateProducerEpoch(producerEpoch);
        while (!batchMetadata.isEmpty())
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'currentTxnFirstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateEntry.java`
#### Snippet
```java
    }

    public ProducerStateEntry(long producerId, short producerEpoch, int coordinatorEpoch, long lastTimestamp, OptionalLong currentTxnFirstOffset, Optional<BatchMetadata> firstBatchMetadata) {
        this.producerId = producerId;
        this.producerEpoch = producerEpoch;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstBatchMetadata'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateEntry.java`
#### Snippet
```java
    }

    public ProducerStateEntry(long producerId, short producerEpoch, int coordinatorEpoch, long lastTimestamp, OptionalLong currentTxnFirstOffset, Optional<BatchMetadata> firstBatchMetadata) {
        this.producerId = producerId;
        this.producerEpoch = producerEpoch;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientMetadata'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchParams.java`
#### Snippet
```java
                       int maxBytes,
                       FetchIsolation isolation,
                       Optional<ClientMetadata> clientMetadata) {
        Objects.requireNonNull(isolation);
        Objects.requireNonNull(clientMetadata);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'clientMetadata'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchParams.java`
#### Snippet
```java
    public final int maxBytes;
    public final FetchIsolation isolation;
    public final Optional<ClientMetadata> clientMetadata;

    public FetchParams(short requestVersion,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
     *                               Same if high watermark is not changed. None is the default value and it means append failed
     */
    public LogAppendInfo(Optional<LogOffsetMetadata> firstOffset,
                         long lastOffset,
                         OptionalInt lastLeaderEpoch,
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'lastLeaderEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
    public LogAppendInfo(Optional<LogOffsetMetadata> firstOffset,
                         long lastOffset,
                         OptionalInt lastLeaderEpoch,
                         long maxTimestamp,
                         long offsetOfMaxTimestamp,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'firstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
            false, -1L);

    private Optional<LogOffsetMetadata> firstOffset;
    private long lastOffset;
    private long maxTimestamp;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
    }

    public void setFirstOffset(Optional<LogOffsetMetadata> firstOffset) {
        this.firstOffset = firstOffset;
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstOffset'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
     * @param lastOffsetOfFirstBatch The last offset of the first batch
     */
    public LogAppendInfo(Optional<LogOffsetMetadata> firstOffset,
                         long lastOffset,
                         OptionalInt lastLeaderEpoch,
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'lastLeaderEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
    public LogAppendInfo(Optional<LogOffsetMetadata> firstOffset,
                         long lastOffset,
                         OptionalInt lastLeaderEpoch,
                         long maxTimestamp,
                         long offsetOfMaxTimestamp,
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'lastLeaderEpoch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogAppendInfo.java`
#### Snippet
```java
    private RecordConversionStats recordConversionStats;

    private final OptionalInt lastLeaderEpoch;
    private final CompressionType sourceCompression;
    private final CompressionType targetCompression;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstOffsetMetadataOpt'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerAppendInfo.java`
#### Snippet
```java
    }

    public Optional<CompletedTxn> append(RecordBatch batch, Optional<LogOffsetMetadata> firstOffsetMetadataOpt) {
        if (batch.isControlBatch()) {
            Iterator<Record> recordIterator = batch.iterator();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fetchDataInfo'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/RemoteLogReadResult.java`
#### Snippet
```java

public class RemoteLogReadResult {
    public final Optional<FetchDataInfo> fetchDataInfo;
    public final Optional<Throwable> error;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fetchDataInfo'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/RemoteLogReadResult.java`
#### Snippet
```java
    public final Optional<Throwable> error;

    public RemoteLogReadResult(Optional<FetchDataInfo> fetchDataInfo, Optional<Throwable> error) {
        this.fetchDataInfo = fetchDataInfo;
        this.error = error;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'error'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/RemoteLogReadResult.java`
#### Snippet
```java
    public final Optional<Throwable> error;

    public RemoteLogReadResult(Optional<FetchDataInfo> fetchDataInfo, Optional<Throwable> error) {
        this.fetchDataInfo = fetchDataInfo;
        this.error = error;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'error'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/RemoteLogReadResult.java`
#### Snippet
```java
public class RemoteLogReadResult {
    public final Optional<FetchDataInfo> fetchDataInfo;
    public final Optional<Throwable> error;

    public RemoteLogReadResult(Optional<FetchDataInfo> fetchDataInfo, Optional<Throwable> error) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'abortedTransactions'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchDataInfo.java`
#### Snippet
```java
                         Records records,
                         boolean firstEntryIncomplete,
                         Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions) {
        this(fetchOffsetMetadata, records, firstEntryIncomplete, abortedTransactions, Optional.empty());
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'delayedRemoteStorageFetch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchDataInfo.java`
#### Snippet
```java
    public final boolean firstEntryIncomplete;
    public final Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions;
    public final Optional<RemoteStorageFetchInfo> delayedRemoteStorageFetch;

    public FetchDataInfo(LogOffsetMetadata fetchOffsetMetadata,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'abortedTransactions'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchDataInfo.java`
#### Snippet
```java
                         Records records,
                         boolean firstEntryIncomplete,
                         Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions,
                         Optional<RemoteStorageFetchInfo> delayedRemoteStorageFetch) {
        this.fetchOffsetMetadata = fetchOffsetMetadata;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'delayedRemoteStorageFetch'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchDataInfo.java`
#### Snippet
```java
                         boolean firstEntryIncomplete,
                         Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions,
                         Optional<RemoteStorageFetchInfo> delayedRemoteStorageFetch) {
        this.fetchOffsetMetadata = fetchOffsetMetadata;
        this.records = records;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'abortedTransactions'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/FetchDataInfo.java`
#### Snippet
```java
    public final Records records;
    public final boolean firstEntryIncomplete;
    public final Optional<List<FetchResponseData.AbortedTransaction>> abortedTransactions;
    public final Optional<RemoteStorageFetchInfo> delayedRemoteStorageFetch;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeFrom'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowKeyQuery.java`
#### Snippet
```java

    private final K key;
    private final Optional<Instant> timeFrom;
    private final Optional<Instant> timeTo;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeTo'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowKeyQuery.java`
#### Snippet
```java
    private final K key;
    private final Optional<Instant> timeFrom;
    private final Optional<Instant> timeTo;

    private WindowKeyQuery(final K key,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeTo'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowKeyQuery.java`
#### Snippet
```java

    private WindowKeyQuery(final K key,
                           final Optional<Instant> timeTo,
                           final Optional<Instant> timeFrom) {
        this.key = key;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeFrom'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowKeyQuery.java`
#### Snippet
```java
    private WindowKeyQuery(final K key,
                           final Optional<Instant> timeTo,
                           final Optional<Instant> timeFrom) {
        this.key = key;
        this.timeFrom = timeFrom;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'lower'
in `streams/src/main/java/org/apache/kafka/streams/query/RangeQuery.java`
#### Snippet
```java


    private RangeQuery(final Optional<K> lower, final Optional<K> upper) {
        this.lower = lower;
        this.upper = upper;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'upper'
in `streams/src/main/java/org/apache/kafka/streams/query/RangeQuery.java`
#### Snippet
```java


    private RangeQuery(final Optional<K> lower, final Optional<K> upper) {
        this.lower = lower;
        this.upper = upper;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'upper'
in `streams/src/main/java/org/apache/kafka/streams/query/RangeQuery.java`
#### Snippet
```java

    private final Optional<K> lower;
    private final Optional<K> upper;


```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lower'
in `streams/src/main/java/org/apache/kafka/streams/query/RangeQuery.java`
#### Snippet
```java


    private final Optional<K> lower;
    private final Optional<K> upper;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'key'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowRangeQuery.java`
#### Snippet
```java
public class WindowRangeQuery<K, V> implements Query<KeyValueIterator<Windowed<K>, V>> {

    private final Optional<K> key;
    private final Optional<Instant> timeFrom;
    private final Optional<Instant> timeTo;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeFrom'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowRangeQuery.java`
#### Snippet
```java

    private final Optional<K> key;
    private final Optional<Instant> timeFrom;
    private final Optional<Instant> timeTo;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'key'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowRangeQuery.java`
#### Snippet
```java
    private final Optional<Instant> timeTo;

    private WindowRangeQuery(final Optional<K> key,
                             final Optional<Instant> timeFrom,
                             final Optional<Instant> timeTo) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeFrom'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowRangeQuery.java`
#### Snippet
```java

    private WindowRangeQuery(final Optional<K> key,
                             final Optional<Instant> timeFrom,
                             final Optional<Instant> timeTo) {
        this.key = key;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeTo'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowRangeQuery.java`
#### Snippet
```java
    private WindowRangeQuery(final Optional<K> key,
                             final Optional<Instant> timeFrom,
                             final Optional<Instant> timeTo) {
        this.key = key;
        this.timeFrom = timeFrom;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeTo'
in `streams/src/main/java/org/apache/kafka/streams/query/WindowRangeQuery.java`
#### Snippet
```java
    private final Optional<K> key;
    private final Optional<Instant> timeFrom;
    private final Optional<Instant> timeTo;

    private WindowRangeQuery(final Optional<K> key,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'partitions'
in `streams/src/main/java/org/apache/kafka/streams/query/StateQueryRequest.java`
#### Snippet
```java
        final String storeName,
        final PositionBound position,
        final Optional<Set<Integer>> partitions,
        final Query<R> query,
        final boolean executionInfoEnabled,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'partitions'
in `streams/src/main/java/org/apache/kafka/streams/query/StateQueryRequest.java`
#### Snippet
```java
    private final String storeName;
    private final PositionBound position;
    private final Optional<Set<Integer>> partitions;
    private final Query<R> query;
    private final boolean executionInfoEnabled;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'indexKeySchema'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractDualSchemaRocksDBSegmentedBytesStore.java`
#### Snippet
```java
    AbstractDualSchemaRocksDBSegmentedBytesStore(final String name,
                                                 final KeySchema baseKeySchema,
                                                 final Optional<KeySchema> indexKeySchema,
                                                 final AbstractSegments<S> segments,
                                                 final long retentionPeriod) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'indexKeySchema'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractDualSchemaRocksDBSegmentedBytesStore.java`
#### Snippet
```java
    protected final AbstractSegments<S> segments;
    protected final KeySchema baseKeySchema;
    protected final Optional<KeySchema> indexKeySchema;
    private final long retentionPeriod;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'indexKeySchema'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractRocksDBTimeOrderedSegmentedBytesStore.java`
#### Snippet
```java
                                                  final long segmentInterval,
                                                  final KeySchema baseKeySchema,
                                                  final Optional<KeySchema> indexKeySchema) {
        super(name, baseKeySchema, indexKeySchema,
            new KeyValueSegments(name, metricsScope, retention, segmentInterval), retention);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'gracePeriod'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoin.java`
#### Snippet
```java
                      final ValueJoinerWithKey<? super K, ? super V1, ? super V2, VOut> joiner,
                      final boolean leftJoin,
                      final Optional<Duration> gracePeriod,
                      final Optional<TimeOrderedKeyValueBuffer<K, V1, V1>> buffer) {
        this.valueGetterSupplier = valueGetterSupplier;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'buffer'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoin.java`
#### Snippet
```java
                      final boolean leftJoin,
                      final Optional<Duration> gracePeriod,
                      final Optional<TimeOrderedKeyValueBuffer<K, V1, V1>> buffer) {
        this.valueGetterSupplier = valueGetterSupplier;
        this.joiner = joiner;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'gracePeriod'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoin.java`
#### Snippet
```java
    private final ValueJoinerWithKey<? super K, ? super V1, ? super V2, VOut> joiner;
    private final boolean leftJoin;
    private final Optional<Duration> gracePeriod;
    private final Optional<TimeOrderedKeyValueBuffer<K, V1, V1>> buffer;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'buffer'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoin.java`
#### Snippet
```java
    private final boolean leftJoin;
    private final Optional<Duration> gracePeriod;
    private final Optional<TimeOrderedKeyValueBuffer<K, V1, V1>> buffer;


```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerJoinWindowName'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKStreamJoin.java`
#### Snippet
```java
                       final ValueJoinerWithKey<? super K, ? super V1, ? super V2, ? extends VOut> joiner,
                       final boolean outer,
                       final Optional<String> outerJoinWindowName,
                       final TimeTrackerSupplier sharedTimeTrackerSupplier) {
        this.isLeftSide = isLeftSide;
```

### OptionalUsedAsFieldOrParameterType
`Optional`, LeftOrRightValue>> used as type for field 'outerJoinStore'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKStreamJoin.java`
#### Snippet
```java
        private WindowStore<K, V2> otherWindowStore;
        private Sensor droppedRecordsSensor;
        private Optional<KeyValueStore<TimestampedKeyAndJoinSide<K>, LeftOrRightValue<V1, V2>>> outerJoinStore = Optional.empty();
        private InternalProcessorContext<K, VOut> internalProcessorContext;
        private TimeTracker sharedTimeTracker;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outerJoinWindowName'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKStreamJoin.java`
#### Snippet
```java
    private final boolean outer;
    private final boolean isLeftSide;
    private final Optional<String> outerJoinWindowName;
    private final ValueJoinerWithKey<? super K, ? super V1, ? super V2, ? extends VOut> joiner;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'gracePeriod'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoinProcessor.java`
#### Snippet
```java
    private final boolean leftJoin;
    private Sensor droppedRecordsSensor;
    private final Optional<Duration> gracePeriod;
    private final Optional<TimeOrderedKeyValueBuffer<K1, V1, V1>> buffer;
    protected long observedStreamTime = ConsumerRecord.NO_TIMESTAMP;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'buffer'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoinProcessor.java`
#### Snippet
```java
    private Sensor droppedRecordsSensor;
    private final Optional<Duration> gracePeriod;
    private final Optional<TimeOrderedKeyValueBuffer<K1, V1, V1>> buffer;
    protected long observedStreamTime = ConsumerRecord.NO_TIMESTAMP;
    private InternalProcessorContext internalProcessorContext;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'gracePeriod'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoinProcessor.java`
#### Snippet
```java
                               final ValueJoinerWithKey<? super K1, ? super V1, ? super V2, ? extends VOut> joiner,
                               final boolean leftJoin,
                               final Optional<Duration> gracePeriod,
                               final Optional<TimeOrderedKeyValueBuffer<K1, V1, V1>> buffer) {
        this.valueGetter = valueGetter;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'buffer'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoinProcessor.java`
#### Snippet
```java
                               final boolean leftJoin,
                               final Optional<Duration> gracePeriod,
                               final Optional<TimeOrderedKeyValueBuffer<K1, V1, V1>> buffer) {
        this.valueGetter = valueGetter;
        this.keyMapper = keyMapper;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outputVersioned'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/GraphNode.java`
#### Snippet
```java
    // explicitly materialized (as either a versioned or an unversioned store) and therefore
    // whether the output is to be considered versioned or not depends on its parent(s)
    private Optional<Boolean> outputVersioned = Optional.empty();

    public GraphNode(final String nodeName) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`, LeftOrRightValue>>> used as type for field 'outerJoinWindowStoreBuilder'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamStreamJoinNode.java`
#### Snippet
```java
        private StoreBuilder<WindowStore<K, V1>> thisWindowStoreBuilder;
        private StoreBuilder<WindowStore<K, V2>> otherWindowStoreBuilder;
        private Optional<StoreBuilder<KeyValueStore<TimestampedKeyAndJoinSide<K>, LeftOrRightValue<V1, V2>>>> outerJoinWindowStoreBuilder;
        private Joined<K, V1, V2> joined;
        private boolean enableSpuriousResultFix = false;
```

### OptionalUsedAsFieldOrParameterType
`Optional`, LeftOrRightValue>>> used as type for parameter 'outerJoinWindowStoreBuilder'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamStreamJoinNode.java`
#### Snippet
```java
                                 final StoreBuilder<WindowStore<K, V1>> thisWindowStoreBuilder,
                                 final StoreBuilder<WindowStore<K, V2>> otherWindowStoreBuilder,
                                 final Optional<StoreBuilder<KeyValueStore<TimestampedKeyAndJoinSide<K>, LeftOrRightValue<V1, V2>>>> outerJoinWindowStoreBuilder,
                                 final Joined<K, V1, V2> joined,
                                 final boolean enableSpuriousResultFix,
```

### OptionalUsedAsFieldOrParameterType
`Optional`, LeftOrRightValue>>> used as type for parameter 'outerJoinWindowStoreBuilder'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamStreamJoinNode.java`
#### Snippet
```java
        }

        public StreamStreamJoinNodeBuilder<K, V1, V2, VR> withOuterJoinWindowStoreBuilder(final Optional<StoreBuilder<KeyValueStore<TimestampedKeyAndJoinSide<K>, LeftOrRightValue<V1, V2>>>> outerJoinWindowStoreBuilder) {
            this.outerJoinWindowStoreBuilder = outerJoinWindowStoreBuilder;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional`, LeftOrRightValue>>> used as type for field 'outerJoinWindowStoreBuilder'
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamStreamJoinNode.java`
#### Snippet
```java
    private final StoreBuilder<WindowStore<K, V1>> thisWindowStoreBuilder;
    private final StoreBuilder<WindowStore<K, V2>> otherWindowStoreBuilder;
    private final Optional<StoreBuilder<KeyValueStore<TimestampedKeyAndJoinSide<K>, LeftOrRightValue<V1, V2>>>> outerJoinWindowStoreBuilder;
    private final Joined<K, V1, V2> joined;
    private final boolean enableSpuriousResultFix;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeCurrentIdlingStarted'
in `streams/src/main/java/org/apache/kafka/streams/processor/TaskMetadata.java`
#### Snippet
```java
    private final Map<TopicPartition, Long> endOffsets;

    private final Optional<Long> timeCurrentIdlingStarted;

    public TaskMetadata(final String taskId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeCurrentIdlingStarted'
in `streams/src/main/java/org/apache/kafka/streams/processor/TaskMetadata.java`
#### Snippet
```java
                        final Map<TopicPartition, Long> committedOffsets,
                        final Map<TopicPartition, Long> endOffsets,
                        final Optional<Long> timeCurrentIdlingStarted) {
        this.taskId = taskId;
        this.topicPartitions = Collections.unmodifiableSet(topicPartitions);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeCurrentIdlingStarted'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/TaskMetadataImpl.java`
#### Snippet
```java
    private final Map<TopicPartition, Long> endOffsets;

    private final Optional<Long> timeCurrentIdlingStarted;

    public TaskMetadataImpl(final TaskId taskId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeCurrentIdlingStarted'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/TaskMetadataImpl.java`
#### Snippet
```java
                            final Map<TopicPartition, Long> committedOffsets,
                            final Map<TopicPartition, Long> endOffsets,
                            final Optional<Long> timeCurrentIdlingStarted) {
        this.taskId = taskId;
        this.topicPartitions = Collections.unmodifiableSet(topicPartitions);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'numberOfPartitions'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopicConfig.java`
#### Snippet
```java
    final boolean enforceNumberOfPartitions;

    private Optional<Integer> numberOfPartitions = Optional.empty();

    static final Map<String, String> INTERNAL_TOPIC_DEFAULT_OVERRIDES = new HashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeCurrentIdlingStarted'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java`
#### Snippet
```java
    private boolean commitRequested = false;
    private boolean hasPendingTxCommit = false;
    private Optional<Long> timeCurrentIdlingStarted;

    @SuppressWarnings("rawtypes")
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'getGroupInstanceID'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java`
#### Snippet
```java
    private volatile ThreadMetadata threadMetadata;
    private StreamThread.StateListener stateListener;
    private final Optional<String> getGroupInstanceID;

    private final ChangelogReader changelogReader;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'numberOfPartitions'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java`
#### Snippet
```java

    private RepartitionTopicConfig buildRepartitionTopicConfig(final String internalTopic,
                                                               final Optional<Integer> numberOfPartitions) {
        return numberOfPartitions
            .map(partitions -> new RepartitionTopicConfig(internalTopic,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'state'
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/TasksRequest.java`
#### Snippet
```java
            @JsonProperty("firstEndMs") long firstEndMs,
            @JsonProperty("lastEndMs") long lastEndMs,
            @JsonProperty("state") Optional<TaskStateType> state) {
        this.taskIds = Collections.unmodifiableSet((taskIds == null) ?
            new HashSet<String>() : new HashSet<>(taskIds));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'state'
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/TasksRequest.java`
#### Snippet
```java
     * An empty string will match all states.
     */
    private final Optional<TaskStateType> state;

    @JsonCreator
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'childName'
in `streams/test-utils/src/main/java/org/apache/kafka/streams/processor/api/MockProcessorContext.java`
#### Snippet
```java
        }

        public CapturedForward(final Record<K, V> record, final Optional<String> childName) {
            this.record = Objects.requireNonNull(record);
            this.childName = Objects.requireNonNull(childName);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'childName'
in `streams/test-utils/src/main/java/org/apache/kafka/streams/processor/api/MockProcessorContext.java`
#### Snippet
```java

        private final Record<K, V> record;
        private final Optional<String> childName;

        public CapturedForward(final Record<K, V> record) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'txGenerator'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchSpec.java`
#### Snippet
```java
                         @JsonProperty("keyGenerator") PayloadGenerator keyGenerator,
                         @JsonProperty("valueGenerator") PayloadGenerator valueGenerator,
                         @JsonProperty("transactionGenerator") Optional<TransactionGenerator> txGenerator,
                         @JsonProperty("producerConf") Map<String, String> producerConf,
                         @JsonProperty("commonClientConf") Map<String, String> commonClientConf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'transactionGenerator'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchSpec.java`
#### Snippet
```java
    private final PayloadGenerator keyGenerator;
    private final PayloadGenerator valueGenerator;
    private final Optional<TransactionGenerator> transactionGenerator;
    private final Map<String, String> producerConf;
    private final Map<String, String> adminClientConf;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchSpec.java`
#### Snippet
```java
    private final String consumerGroup;
    private final int threadsPerWorker;
    private final Optional<RecordProcessor> recordProcessor;

    @JsonCreator
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchSpec.java`
#### Snippet
```java
                            @JsonProperty("adminClientConf") Map<String, String> adminClientConf,
                            @JsonProperty("threadsPerWorker") Integer threadsPerWorker,
                            @JsonProperty("recordProcessor") Optional<RecordProcessor> recordProcessor,
                            @JsonProperty("activeTopics") List<String> activeTopics) {
        super(startMs, durationMs);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'flushGenerator'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConfigurableProducerSpec.java`
#### Snippet
```java
                                    @JsonProperty("producerNode") String producerNode,
                                    @JsonProperty("bootstrapServers") String bootstrapServers,
                                    @JsonProperty("flushGenerator") Optional<FlushGenerator> flushGenerator,
                                    @JsonProperty("throughputGenerator") ThroughputGenerator throughputGenerator,
                                    @JsonProperty("keyGenerator") PayloadGenerator keyGenerator,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'flushGenerator'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConfigurableProducerSpec.java`
#### Snippet
```java
    private final String producerNode;
    private final String bootstrapServers;
    private final Optional<FlushGenerator> flushGenerator;
    private final ThroughputGenerator throughputGenerator;
    private final PayloadGenerator keyGenerator;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'shutdownGracePeriodMs'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ExternalCommandSpec.java`
#### Snippet
```java
    private final List<String> command;
    private final JsonNode workload;
    private final Optional<Integer> shutdownGracePeriodMs;

    @JsonCreator
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'shutdownGracePeriodMs'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ExternalCommandSpec.java`
#### Snippet
```java
            @JsonProperty("command") List<String> command,
            @JsonProperty("workload") JsonNode workload,
            @JsonProperty("shutdownGracePeriodMs") Optional<Integer> shutdownGracePeriodMs) {
        super(startMs, durationMs);
        this.commandNode = (commandNode == null) ? "" : commandNode;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
        }
        ConsumeMessages(ThreadSafeConsumer consumer,
                        Optional<RecordProcessor> recordProcessor,
                        List<TopicPartition> partitions) {
            this(consumer, recordProcessor);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
        private final Histogram messageSizeHistogram;
        private final ThreadSafeConsumer consumer;
        private final Optional<RecordProcessor> recordProcessor;

        ConsumeStatusUpdater(Histogram latencyHistogram,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recordProcessorStatus'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
        private final int p95LatencyMs;
        private final int p99LatencyMs;
        private final Optional<JsonNode> recordProcessorStatus;

        /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordProcessorStatus'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
                   @JsonProperty("p95LatencyMs") int p95latencyMs,
                   @JsonProperty("p99LatencyMs") int p99latencyMs,
                   @JsonProperty("recordProcessorStatus") Optional<JsonNode> recordProcessorStatus) {
            this.assignedPartitions = assignedPartitions;
            this.totalMessagesReceived = totalMessagesReceived;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java

        ConsumeMessages(ThreadSafeConsumer consumer,
                        Optional<RecordProcessor> recordProcessor,
                        Set<String> topics) {
            this(consumer, recordProcessor);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java

        private ConsumeMessages(ThreadSafeConsumer consumer,
                                Optional<RecordProcessor> recordProcessor) {
            this.latencyHistogram = new Histogram(10000);
            this.messageSizeHistogram = new Histogram(2 * 1024 * 1024);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
        private final String clientId;
        private final ThreadSafeConsumer consumer;
        private final Optional<RecordProcessor> recordProcessor;

        private ConsumeMessages(ThreadSafeConsumer consumer,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordProcessor'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
                             Histogram messageSizeHistogram,
                             ThreadSafeConsumer consumer,
                             Optional<RecordProcessor> recordProcessor) {
            this.latencyHistogram = latencyHistogram;
            this.messageSizeHistogram = messageSizeHistogram;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'transactionGenerator'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchWorker.java`
#### Snippet
```java
        private final PayloadIterator values;

        private final Optional<TransactionGenerator> transactionGenerator;

        private final Throttle throttle;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'instanceId'
in `examples/src/main/java/kafka/examples/Consumer.java`
#### Snippet
```java
    private final String topic;
    private final String groupId;
    private final Optional<String> instanceId;
    private final boolean readCommitted;
    private final int numRecords;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'instanceId'
in `examples/src/main/java/kafka/examples/Consumer.java`
#### Snippet
```java
                    String topic,
                    String groupId,
                    Optional<String> instanceId,
                    boolean readCommitted,
                    int numRecords,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'asBoolean'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistrationFencingChange.java`
#### Snippet
```java
    }

    BrokerRegistrationFencingChange(int value, Optional<Boolean> asBoolean) {
        this.value = (byte) value;
        this.asBoolean = asBoolean;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'asBoolean'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistrationFencingChange.java`
#### Snippet
```java
    private final byte value;

    private final Optional<Boolean> asBoolean;

    private final static Map<Byte, BrokerRegistrationFencingChange> VALUE_TO_ENUM =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
    private final Map<String, Endpoint> listeners;
    private final Map<String, VersionRange> supportedFeatures;
    private final Optional<String> rack;
    private final boolean fenced;
    private final boolean inControlledShutdown;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
                              Map<String, Endpoint> listeners,
                              Map<String, VersionRange> supportedFeatures,
                              Optional<String> rack,
                              boolean fenced,
                              boolean inControlledShutdown,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fencingChange'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java

    public BrokerRegistration cloneWith(
        Optional<Boolean> fencingChange,
        Optional<Boolean> inControlledShutdownChange
    ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'inControlledShutdownChange'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
    public BrokerRegistration cloneWith(
        Optional<Boolean> fencingChange,
        Optional<Boolean> inControlledShutdownChange
    ) {
        boolean newFenced = fencingChange.orElse(fenced);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
                              List<Endpoint> listeners,
                              Map<String, VersionRange> supportedFeatures,
                              Optional<String> rack,
                              boolean fenced,
                              boolean inControlledShutdown) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
                              Map<String, Endpoint> listeners,
                              Map<String, VersionRange> supportedFeatures,
                              Optional<String> rack,
                              boolean fenced,
                              boolean inControlledShutdown) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
                              List<Endpoint> listeners,
                              Map<String, VersionRange> supportedFeatures,
                              Optional<String> rack,
                              boolean fenced,
                              boolean inControlledShutdown,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'asBoolean'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistrationInControlledShutdownChange.java`
#### Snippet
```java
    }

    BrokerRegistrationInControlledShutdownChange(int value, Optional<Boolean> asBoolean) {
        this.value = (byte) value;
        this.asBoolean = asBoolean;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'asBoolean'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistrationInControlledShutdownChange.java`
#### Snippet
```java
    private final byte value;

    private final Optional<Boolean> asBoolean;

    private final static Map<Byte, BrokerRegistrationInControlledShutdownChange> VALUE_TO_ENUM =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ibp'
in `metadata/src/main/java/org/apache/kafka/metadata/bootstrap/BootstrapDirectory.java`
#### Snippet
```java

    private final String directoryPath;
    private final Optional<String> ibp;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ibp'
in `metadata/src/main/java/org/apache/kafka/metadata/bootstrap/BootstrapDirectory.java`
#### Snippet
```java
    public BootstrapDirectory(
        String directoryPath,
        Optional<String> ibp
    ) {
        this.directoryPath = Objects.requireNonNull(directoryPath);
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'highWaterMark'
in `metadata/src/main/java/org/apache/kafka/metadata/util/SnapshotFileReader.java`
#### Snippet
```java
    private final MetadataRecordSerde serde = new MetadataRecordSerde();
    private long lastOffset = -1L;
    private volatile OptionalLong highWaterMark = OptionalLong.empty();

    public SnapshotFileReader(String snapshotPath, RaftClient.Listener<ApiMessageAndVersion> listener) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/placement/UsableBroker.java`
#### Snippet
```java
    private final int id;

    private final Optional<String> rack;

    private final boolean fenced;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rack'
in `metadata/src/main/java/org/apache/kafka/metadata/placement/UsableBroker.java`
#### Snippet
```java
    private final boolean fenced;

    public UsableBroker(int id, Optional<String> rack, boolean fenced) {
        this.id = id;
        this.rack = rack;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerRequestContext.java`
#### Snippet
```java
    public ControllerRequestContext(
        AuthorizableRequestContext requestContext,
        OptionalLong deadlineNs,
        Consumer<Integer> partitionChangeQuotaApplier
    ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerRequestContext.java`
#### Snippet
```java

    private final KafkaPrincipal principal;
    private final OptionalLong deadlineNs;
    private final RequestHeaderData requestHeader;

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerRequestContext.java`
#### Snippet
```java
    public ControllerRequestContext(
        AuthorizableRequestContext requestContext,
        OptionalLong deadlineNs
    ) {
        this(requestContext, deadlineNs, __ -> { });
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerRequestContext.java`
#### Snippet
```java
        RequestHeaderData requestHeader,
        KafkaPrincipal principal,
        OptionalLong deadlineNs
    ) {
        this(requestHeader, principal, deadlineNs, __ -> { });
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/ControllerRequestContext.java`
#### Snippet
```java
        RequestHeaderData requestHeader,
        KafkaPrincipal principal,
        OptionalLong deadlineNs,
        Consumer<Integer> partitionChangeQuotaApplier
    ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'snapshotId'
in `metadata/src/main/java/org/apache/kafka/controller/AclControlManager.java`
#### Snippet
```java

    public void replay(RemoveAccessControlEntryRecord record,
                       Optional<OffsetAndEpoch> snapshotId) {
        StandardAcl acl = idToAcl.remove(record.id());
        if (acl == null) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authorizer'
in `metadata/src/main/java/org/apache/kafka/controller/AclControlManager.java`
#### Snippet
```java

    AclControlManager(SnapshotRegistry snapshotRegistry,
                      Optional<ClusterMetadataAuthorizer> authorizer) {
        this.idToAcl = new TimelineHashMap<>(snapshotRegistry, 0);
        this.existingAcls = new TimelineHashSet<>(snapshotRegistry, 0);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authorizer'
in `metadata/src/main/java/org/apache/kafka/controller/AclControlManager.java`
#### Snippet
```java
    private final TimelineHashMap<Uuid, StandardAcl> idToAcl;
    private final TimelineHashSet<StandardAcl> existingAcls;
    private final Optional<ClusterMetadataAuthorizer> authorizer;

    AclControlManager(SnapshotRegistry snapshotRegistry,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'snapshotId'
in `metadata/src/main/java/org/apache/kafka/controller/AclControlManager.java`
#### Snippet
```java

    public void replay(AccessControlEntryRecord record,
                       Optional<OffsetAndEpoch> snapshotId) {
        StandardAclWithId aclWithId = StandardAclWithId.fromRecord(record);
        idToAcl.put(aclWithId.id(), aclWithId.acl());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'readyBrokersFuture'
in `metadata/src/main/java/org/apache/kafka/controller/ClusterControlManager.java`
#### Snippet
```java
     * ready.
     */
    private Optional<ReadyBrokersFuture> readyBrokersFuture;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fencingChange'
in `metadata/src/main/java/org/apache/kafka/controller/ClusterControlManager.java`
#### Snippet
```java
        int brokerId,
        long brokerEpoch,
        Optional<Boolean> fencingChange,
        Optional<Boolean> inControlledShutdownChange
    ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'inControlledShutdownChange'
in `metadata/src/main/java/org/apache/kafka/controller/ClusterControlManager.java`
#### Snippet
```java
        long brokerEpoch,
        Optional<Boolean> fencingChange,
        Optional<Boolean> inControlledShutdownChange
    ) {
        BrokerRegistration curRegistration = brokerRegistrations.get(brokerId);
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'controllerId'
in `metadata/src/main/java/org/apache/kafka/controller/errors/ControllerExceptions.java`
#### Snippet
```java
     * @return                  The new NotControllerException.
     */
    public static NotControllerException newWrongControllerException(OptionalInt controllerId) {
        if (controllerId.isPresent()) {
            return new NotControllerException("The active controller appears to be node " +
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'controllerId'
in `metadata/src/main/java/org/apache/kafka/controller/errors/ControllerExceptions.java`
#### Snippet
```java
     * @return                  The new NotControllerException.
     */
    public static NotControllerException newPreMigrationException(OptionalInt controllerId) {
        if (controllerId.isPresent()) {
            return new NotControllerException("The controller is in pre-migration mode.");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ConfigurationControlManager.java`
#### Snippet
```java
        }

        Builder setAlterConfigPolicy(Optional<AlterConfigPolicy> alterConfigPolicy) {
            this.alterConfigPolicy = alterConfigPolicy;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ConfigurationControlManager.java`
#### Snippet
```java
        private KafkaConfigSchema configSchema = KafkaConfigSchema.EMPTY;
        private Consumer<ConfigResource> existenceChecker = __ -> { };
        private Optional<AlterConfigPolicy> alterConfigPolicy = Optional.empty();
        private ConfigurationValidator validator = ConfigurationValidator.NO_OP;
        private Map<String, Object> staticConfig = Collections.emptyMap();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ConfigurationControlManager.java`
#### Snippet
```java
    private final KafkaConfigSchema configSchema;
    private final Consumer<ConfigResource> existenceChecker;
    private final Optional<AlterConfigPolicy> alterConfigPolicy;
    private final ConfigurationValidator validator;
    private final TimelineHashMap<ConfigResource, TimelineHashMap<String, String>> configData;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ConfigurationControlManager.java`
#### Snippet
```java
            KafkaConfigSchema configSchema,
            Consumer<ConfigResource> existenceChecker,
            Optional<AlterConfigPolicy> alterConfigPolicy,
            ConfigurationValidator validator,
            Map<String, Object> staticConfig,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'registry'
in `metadata/src/main/java/org/apache/kafka/controller/metrics/QuorumControllerMetrics.java`
#### Snippet
```java

    public QuorumControllerMetrics(
        Optional<MetricsRegistry> registry,
        Time time
    ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'registry'
in `metadata/src/main/java/org/apache/kafka/controller/metrics/QuorumControllerMetrics.java`
#### Snippet
```java
        "KafkaController", "LastAppliedRecordLagMs");

    private final Optional<MetricsRegistry> registry;
    private volatile boolean active;
    private final AtomicLong lastAppliedRecordOffset = new AtomicLong(0);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'registry'
in `metadata/src/main/java/org/apache/kafka/controller/metrics/ControllerMetadataMetrics.java`
#### Snippet
```java
     * @param registry  The metrics registry, or Optional.empty if this is a test and we don't have one.
     */
    public ControllerMetadataMetrics(Optional<MetricsRegistry> registry) {
        this.registry = registry;
        registry.ifPresent(r -> r.newGauge(FENCED_BROKER_COUNT, new Gauge<Integer>() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'registry'
in `metadata/src/main/java/org/apache/kafka/controller/metrics/ControllerMetadataMetrics.java`
#### Snippet
```java
        "KafkaController", "ZkMigrationState");

    private final Optional<MetricsRegistry> registry;
    private final AtomicInteger fencedBrokerCount = new AtomicInteger(0);
    private final AtomicInteger activeBrokerCount = new AtomicInteger(0);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'apiKey'
in `generator/src/main/java/org/apache/kafka/message/MessageSpec.java`
#### Snippet
```java
    private final StructSpec struct;

    private final Optional<Short> apiKey;

    private final MessageSpecType type;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
        }

        Builder setCreateTopicPolicy(Optional<CreateTopicPolicy> createTopicPolicy) {
            this.createTopicPolicy = createTopicPolicy;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
        ConfigurationControlManager configurationControl,
        ClusterControlManager clusterControl,
        Optional<CreateTopicPolicy> createTopicPolicy,
        FeatureControlManager featureControl
    ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
        private ConfigurationControlManager configurationControl = null;
        private ClusterControlManager clusterControl = null;
        private Optional<CreateTopicPolicy> createTopicPolicy = Optional.empty();
        private FeatureControlManager featureControl = null;

```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'replicationFactor'
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
    void validateManualPartitionAssignment(
        PartitionAssignment assignment,
        OptionalInt replicationFactor
    ) {
        if (assignment.replicas().isEmpty()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
     * The policy to use to validate that topic assignments are valid, if one is present.
     */
    private final Optional<CreateTopicPolicy> createTopicPolicy;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trailingAdditionalMessage'
in `server-common/src/main/java/org/apache/kafka/server/util/CommandLineUtils.java`
#### Snippet
```java
                                           Set<OptionSpec<?>> usedOptions,
                                           Set<OptionSpec<?>> invalidOptions,
                                           Optional<String> trailingAdditionalMessage) {
        if (usedOptions.stream().filter(options::has).count() == usedOptions.size()) {
            for (OptionSpec<?> arg : invalidOptions) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'tag'
in `generator/src/main/java/org/apache/kafka/message/FieldSpec.java`
#### Snippet
```java
    private final Optional<Versions> flexibleVersions;

    private final Optional<Integer> tag;

    private final boolean zeroCopy;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'flexibleVersions'
in `generator/src/main/java/org/apache/kafka/message/FieldSpec.java`
#### Snippet
```java
    private final Versions taggedVersions;

    private final Optional<Versions> flexibleVersions;

    private final Optional<Integer> tag;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'deadlineNs'
in `server-common/src/main/java/org/apache/kafka/queue/KafkaEventQueue.java`
#### Snippet
```java
         * If it is not in the map, this is null.
         */
        private OptionalLong deadlineNs = OptionalLong.empty();

        /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authorizer'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
     * Optional.empty() if an Authorizer is configured that doesn't use __cluster_metadata.
     */
    private final Optional<ClusterMetadataAuthorizer> authorizer;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        }

        public Builder setAlterConfigPolicy(Optional<AlterConfigPolicy> alterConfigPolicy) {
            this.alterConfigPolicy = alterConfigPolicy;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authorizer'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private Optional<AlterConfigPolicy> alterConfigPolicy = Optional.empty();
        private ConfigurationValidator configurationValidator = ConfigurationValidator.NO_OP;
        private Optional<ClusterMetadataAuthorizer> authorizer = Optional.empty();
        private Map<String, Object> staticConfig = Collections.emptyMap();
        private BootstrapMetadata bootstrapMetadata = null;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private long sessionTimeoutNs = ClusterControlManager.DEFAULT_SESSION_TIMEOUT_NS;
        private QuorumControllerMetrics controllerMetrics = null;
        private Optional<CreateTopicPolicy> createTopicPolicy = Optional.empty();
        private Optional<AlterConfigPolicy> alterConfigPolicy = Optional.empty();
        private ConfigurationValidator configurationValidator = ConfigurationValidator.NO_OP;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'startProcessingTimeNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private final Supplier<T> handler;
        private final long eventCreatedTimeNs = time.nanoseconds();
        private OptionalLong startProcessingTimeNs = OptionalLong.empty();

        ControllerReadEvent(String name, Supplier<T> handler) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
    <T> CompletableFuture<T> appendReadEvent(
        String name,
        OptionalLong deadlineNs,
        Supplier<T> handler
    ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'leaderImbalanceCheckIntervalNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private int defaultNumPartitions = 1;
        private ReplicaPlacer replicaPlacer = new StripedReplicaPlacer(new Random());
        private OptionalLong leaderImbalanceCheckIntervalNs = OptionalLong.empty();
        private OptionalLong maxIdleIntervalNs = OptionalLong.empty();
        private long sessionTimeoutNs = ClusterControlManager.DEFAULT_SESSION_TIMEOUT_NS;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'startProcessingTimeNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private final long eventCreatedTimeNs = time.nanoseconds();
        private final EnumSet<ControllerOperationFlag> flags;
        private OptionalLong startProcessingTimeNs = OptionalLong.empty();
        private ControllerResultAndOffset<T> resultAndOffset;

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
    <T> CompletableFuture<T> appendWriteEvent(
        String name,
        OptionalLong deadlineNs,
        ControllerWriteOperation<T> op
    ) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'maxIdleIntervalNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
     * How log to delay between appending NoOpRecord to the log.
     */
    private final OptionalLong maxIdleIntervalNs;

    private enum ImbalanceSchedule {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'maxIdleIntervalNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private ReplicaPlacer replicaPlacer = new StripedReplicaPlacer(new Random());
        private OptionalLong leaderImbalanceCheckIntervalNs = OptionalLong.empty();
        private OptionalLong maxIdleIntervalNs = OptionalLong.empty();
        private long sessionTimeoutNs = ClusterControlManager.DEFAULT_SESSION_TIMEOUT_NS;
        private QuorumControllerMetrics controllerMetrics = null;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'leaderImbalanceCheckIntervalNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        int defaultNumPartitions,
        ReplicaPlacer replicaPlacer,
        OptionalLong leaderImbalanceCheckIntervalNs,
        OptionalLong maxIdleIntervalNs,
        long sessionTimeoutNs,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'maxIdleIntervalNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        ReplicaPlacer replicaPlacer,
        OptionalLong leaderImbalanceCheckIntervalNs,
        OptionalLong maxIdleIntervalNs,
        long sessionTimeoutNs,
        QuorumControllerMetrics controllerMetrics,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        long sessionTimeoutNs,
        QuorumControllerMetrics controllerMetrics,
        Optional<CreateTopicPolicy> createTopicPolicy,
        Optional<AlterConfigPolicy> alterConfigPolicy,
        ConfigurationValidator configurationValidator,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        QuorumControllerMetrics controllerMetrics,
        Optional<CreateTopicPolicy> createTopicPolicy,
        Optional<AlterConfigPolicy> alterConfigPolicy,
        ConfigurationValidator configurationValidator,
        Optional<ClusterMetadataAuthorizer> authorizer,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authorizer'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        Optional<AlterConfigPolicy> alterConfigPolicy,
        ConfigurationValidator configurationValidator,
        Optional<ClusterMetadataAuthorizer> authorizer,
        Map<String, Object> staticConfig,
        BootstrapMetadata bootstrapMetadata,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'value'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        }

        public Builder setMaxIdleIntervalNs(OptionalLong value) {
            this.maxIdleIntervalNs = value;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'deadlineNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
    <T> CompletableFuture<T> appendWriteEvent(
        String name,
        OptionalLong deadlineNs,
        ControllerWriteOperation<T> op,
        EnumSet<ControllerOperationFlag> flags
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'alterConfigPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private QuorumControllerMetrics controllerMetrics = null;
        private Optional<CreateTopicPolicy> createTopicPolicy = Optional.empty();
        private Optional<AlterConfigPolicy> alterConfigPolicy = Optional.empty();
        private ConfigurationValidator configurationValidator = ConfigurationValidator.NO_OP;
        private Optional<ClusterMetadataAuthorizer> authorizer = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'startProcessingTimeNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        private final Runnable handler;
        private final long eventCreatedTimeNs = time.nanoseconds();
        private OptionalLong startProcessingTimeNs = OptionalLong.empty();

        ControllerEvent(String name, Runnable handler) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'value'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        }

        public Builder setLeaderImbalanceCheckIntervalNs(OptionalLong value) {
            this.leaderImbalanceCheckIntervalNs = value;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'startProcessingTimeNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java

    private Throwable handleEventException(String name,
                                           OptionalLong startProcessingTimeNs,
                                           Throwable exception) {
        Throwable externalException =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'createTopicPolicy'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        }

        public Builder setCreateTopicPolicy(Optional<CreateTopicPolicy> createTopicPolicy) {
            this.createTopicPolicy = createTopicPolicy;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'leaderImbalanceCheckIntervalNs'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
     * How long to delay partition leader balancing operations.
     */
    private final OptionalLong leaderImbalanceCheckIntervalNs;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'snapshotId'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
     *                          if this record is from a snapshot, this is used along with RegisterBrokerRecord
     */
    private void replay(ApiMessage message, Optional<OffsetAndEpoch> snapshotId, long batchLastOffset) {
        if (log.isTraceEnabled()) {
            if (snapshotId.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authorizer'
in `server-common/src/main/java/org/apache/kafka/server/network/EndpointReadyFutures.java`
#### Snippet
```java
         */
        public EndpointReadyFutures build(
            Optional<Authorizer> authorizer,
            AuthorizerServerInfo info
        ) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topLevelMessageSpec'
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
    }

    private void generateClass(Optional<MessageSpec> topLevelMessageSpec,
                               String className,
                               StructSpec struct,
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'groupMetadataPartitionLeaderEpoch'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinator.java`
#### Snippet
```java
    void onResignation(
        int groupMetadataPartitionIndex,
        OptionalInt groupMetadataPartitionLeaderEpoch
    );

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'groupInstanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroupMember.java`
#### Snippet
```java
     * The group instance id.
     */
    private final Optional<String> groupInstanceId;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroupMember.java`
#### Snippet
```java
    public GenericGroupMember(
        String memberId,
        Optional<String> groupInstanceId,
        String clientId,
        String clientHost,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroupMember.java`
#### Snippet
```java
    public GenericGroupMember(
        String memberId,
        Optional<String> groupInstanceId,
        String clientId,
        String clientHost,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rackId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/assignor/AssignmentMemberSpec.java`
#### Snippet
```java
     * The rack ID if provided.
     */
    private final Optional<String> rackId;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'instanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/assignor/AssignmentMemberSpec.java`
#### Snippet
```java
     * The instance ID if provided.
     */
    private final Optional<String> instanceId;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'instanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/assignor/AssignmentMemberSpec.java`
#### Snippet
```java

    public AssignmentMemberSpec(
        Optional<String> instanceId,
        Optional<String> rackId,
        Collection<Uuid> subscribedTopicIds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rackId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/assignor/AssignmentMemberSpec.java`
#### Snippet
```java
    public AssignmentMemberSpec(
        Optional<String> instanceId,
        Optional<String> rackId,
        Collection<Uuid> subscribedTopicIds,
        Map<Uuid, Set<Integer>> assignedPartitions
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupInstanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * @return the generated id.
     */
    public String generateMemberId(String clientId, Optional<String> groupInstanceId) {
        return groupInstanceId.map(s -> s + MEMBER_ID_DELIMITER + UUID.randomUUID())
            .orElseGet(() -> clientId + MEMBER_ID_DELIMITER + UUID.randomUUID());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'leaderId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * The id of the group's leader.
     */
    private Optional<String> leaderId = Optional.empty();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'currentStateTimestamp'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * to its current state.
     */
    private Optional<Long> currentStateTimestamp;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'subscribedTopics'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * The list of topics to which the group members are subscribed.
     */
    private Optional<Set<String>> subscribedTopics = Optional.empty();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'protocolName'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * The protocol name used for rebalance.
     */
    private Optional<String> protocolName = Optional.empty();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'protocolType'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * The protocol type used for rebalance.
     */
    private Optional<String> protocolType = Optional.empty();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'clientAssignors'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateClientAssignors(Optional<List<ClientAssignor>> clientAssignors) {
            this.clientAssignors = clientAssignors.orElse(this.clientAssignors);
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'subscribedTopicRegex'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateSubscribedTopicRegex(Optional<String> subscribedTopicRegex) {
            this.subscribedTopicRegex = subscribedTopicRegex.orElse(this.subscribedTopicRegex);
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'instanceId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateInstanceId(Optional<String> instanceId) {
            this.instanceId = instanceId.orElse(this.instanceId);
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'subscribedTopicNames'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateSubscribedTopicNames(Optional<List<String>> subscribedTopicNames) {
            this.subscribedTopicNames = subscribedTopicNames.orElse(this.subscribedTopicNames);
            this.subscribedTopicNames.sort(Comparator.naturalOrder());
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'rebalanceTimeoutMs'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateRebalanceTimeoutMs(OptionalInt rebalanceTimeoutMs) {
            this.rebalanceTimeoutMs = rebalanceTimeoutMs.orElse(this.rebalanceTimeoutMs);
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'serverAssignorName'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateServerAssignorName(Optional<String> serverAssignorName) {
            this.serverAssignorName = serverAssignorName.orElse(this.serverAssignorName);
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rackId'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
        }

        public Builder maybeUpdateRackId(Optional<String> rackId) {
            this.rackId = rackId.orElse(this.rackId);
            return this;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'CandidateState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
        }

        int retries = isCandidate() ? candidateStateOrThrow().retries() + 1 : 1;
        int newEpoch = epoch() + 1;
        int electionTimeoutMs = randomElectionTimeoutMs();
```

### AutoCloseableResource
'CandidateState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
        }

        CandidateState candidateState = candidateStateOrThrow();
        if (!candidateState.isVoteGranted())
            throw new IllegalStateException("Cannot become leader without majority votes granted");
```

### AutoCloseableResource
'CandidateState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
            electionTimeoutMs = Long.MAX_VALUE;
        } else if (isCandidate()) {
            electionTimeoutMs = candidateStateOrThrow().remainingElectionTimeMs(time.milliseconds());
        } else if (isVoted()) {
            electionTimeoutMs = votedStateOrThrow().remainingElectionTimeMs(time.milliseconds());
```

### AutoCloseableResource
'VotedState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
            electionTimeoutMs = candidateStateOrThrow().remainingElectionTimeMs(time.milliseconds());
        } else if (isVoted()) {
            electionTimeoutMs = votedStateOrThrow().remainingElectionTimeMs(time.milliseconds());
        } else if (isUnattached()) {
            electionTimeoutMs = unattachedStateOrThrow().remainingElectionTimeMs(time.milliseconds());
```

### AutoCloseableResource
'UnattachedState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/QuorumState.java`
#### Snippet
```java
            electionTimeoutMs = votedStateOrThrow().remainingElectionTimeMs(time.milliseconds());
        } else if (isUnattached()) {
            electionTimeoutMs = unattachedStateOrThrow().remainingElectionTimeMs(time.milliseconds());
        } else {
            electionTimeoutMs = randomElectionTimeoutMs();
```

### AutoCloseableResource
'VotedState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/internals/KafkaRaftMetrics.java`
#### Snippet
```java
                return state.localIdOrThrow();
            } else if (state.isVoted()) {
                return state.votedStateOrThrow().votedId();
            } else {
                return -1;
```

### AutoCloseableResource
'LeaderState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
        }

        LeaderState<T> leaderState = quorum.leaderStateOrThrow();
        return DescribeQuorumResponse.singletonResponse(
            log.topicPartition(),
```

### AutoCloseableResource
'ResignedState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
            return handled.get();
        } else if (partitionError == Errors.NONE) {
            ResignedState resignedState = quorum.resignedStateOrThrow();
            resignedState.acknowledgeResignation(responseMetadata.sourceId());
            return true;
```

### AutoCloseableResource
'LeaderState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java

    private long append(int epoch, List<T> records, boolean isAtomic) {
        LeaderState<T> leaderState = quorum.<T>maybeLeaderState().orElseThrow(
            () -> new NotLeaderException("Append failed because the replication is not the current leader")
        );
```

### AutoCloseableResource
'VotedState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java

    private long pollVoted(long currentTimeMs) {
        VotedState state = quorum.votedStateOrThrow();
        GracefulShutdown shutdown = this.shutdown.get();

```

### AutoCloseableResource
'FollowerState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java

        if (quorum.isFollower()) {
            FollowerState state = quorum.followerStateOrThrow();
            if (state.leaderId() == requestLeaderId) {
                List<Integer> preferredSuccessors = partitionRequest.preferredSuccessors();
```

### AutoCloseableResource
'ResignedState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java

    private long pollResigned(long currentTimeMs) {
        ResignedState state = quorum.resignedStateOrThrow();
        long endQuorumBackoffMs = maybeSendRequests(
            currentTimeMs,
```

### AutoCloseableResource
'LeaderState' used without 'try'-with-resources statement
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
        } else if (partitionError == Errors.NONE) {
            if (quorum.isLeader()) {
                LeaderState<T> state = quorum.leaderStateOrThrow();
                state.addAcknowledgementFrom(remoteNodeId);
            } else {
```

### AutoCloseableResource
'MemoryRecordsBuilder' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/record/RecordsUtil.java`
#### Snippet
```java
                recordBatchAndRecords.batch.writeTo(buffer);
            } else {
                MemoryRecordsBuilder builder = convertRecordBatch(toMagic, buffer, recordBatchAndRecords);
                buffer = builder.buffer();
                temporaryMemoryBytes += builder.uncompressedBytesWritten();
```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/record/FileRecords.java`
#### Snippet
```java
                        StandardOpenOption.WRITE);
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(initFileSize);
                return randomAccessFile.getChannel();
```

### AutoCloseableResource
'SelectableChannel' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/network/SslChannelBuilder.java`
#### Snippet
```java

    protected SslTransportLayer buildTransportLayer(SslFactory sslFactory, String id, SelectionKey key, ChannelMetadataRegistry metadataRegistry) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        return SslTransportLayer.create(id, key, sslFactory.createSslEngine(socketChannel.socket()),
            metadataRegistry);
```

### AutoCloseableResource
'KafkaChannel' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
            if (key != null)
                immediatelyConnectedKeys.remove(key);
            channels.remove(id);
            socketChannel.close();
            throw e;
```

### AutoCloseableResource
'SelectableChannel' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
                        this.sensors.connectionCreated.record();

                        SocketChannel socketChannel = (SocketChannel) key.channel();
                        log.debug("Created socket with SO_RCVBUF = {}, SO_SNDBUF = {}, SO_TIMEOUT = {} to node {}",
                                socketChannel.socket().getReceiveBufferSize(),
```

### AutoCloseableResource
'KafkaChannel' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
            doClose(channel, closeMode.notifyDisconnect);
        }
        this.channels.remove(channel.id());

        if (delayedClosingChannels != null)
```

### AutoCloseableResource
'SslEngineFactory' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/security/ssl/SslFactory.java`
#### Snippet
```java
    @Override
    public void validateReconfiguration(Map<String, ?> newConfigs) {
        createNewSslEngineFactory(newConfigs);
    }

```

### AutoCloseableResource
'SslFactory' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/secured/JaasOptionsUtils.java`
#### Snippet
```java
    public SSLSocketFactory createSSLSocketFactory() {
        Map<String, ?> sslClientConfig = getSslClientConfig();
        SslFactory sslFactory = new SslFactory(Mode.CLIENT);
        sslFactory.configure(sslClientConfig);
        SSLSocketFactory socketFactory = ((DefaultSslEngineFactory) sslFactory.sslEngineFactory()).sslContext().getSocketFactory();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/serialization/ListDeserializer.java`
#### Snippet
```java
        try {
            if (innerSerdeClassOrName instanceof String) {
                inner = Utils.newInstance((String) innerSerdeClassOrName, Serde.class).deserializer();
            } else if (innerSerdeClassOrName instanceof Class) {
                inner = (Deserializer<Inner>) ((Serde) Utils.newInstance((Class) innerSerdeClassOrName)).deserializer();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `clients/src/main/java/org/apache/kafka/common/serialization/ListSerializer.java`
#### Snippet
```java
        try {
            if (innerSerdeClassOrName instanceof String) {
                inner = Utils.newInstance((String) innerSerdeClassOrName, Serde.class).serializer();
            } else if (innerSerdeClassOrName instanceof Class) {
                inner = (Serializer<Inner>) ((Serde) Utils.newInstance((Class) innerSerdeClassOrName)).serializer();
```

### AutoCloseableResource
'Producer' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/KafkaBasedLog.java`
#### Snippet
```java
     */
    public Future<RecordMetadata> sendWithReceipt(K key, V value, org.apache.kafka.clients.producer.Callback callback) {
        return producer.orElseThrow(() ->
                new IllegalStateException("This KafkaBasedLog was created in read-only mode and does not support write operations")
        ).send(new ProducerRecord<>(topic, key, value), callback);
```

### AutoCloseableResource
'Metrics' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetrics.java`
#### Snippet
```java
        public <T> void addImmutableValueMetric(MetricNameTemplate nameTemplate, final T value) {
            MetricName metricName = metricName(nameTemplate);
            metrics().addMetricIfAbsent(metricName, null, (Gauge<T>) (config, now) -> value);
        }

```

### AutoCloseableResource
'Metrics' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetrics.java`
#### Snippet
```java
        public <T> void addValueMetric(MetricNameTemplate nameTemplate, final LiteralSupplier<T> supplier) {
            MetricName metricName = metricName(nameTemplate);
            metrics().addMetricIfAbsent(metricName, null, (Gauge<T>) (config, now) -> supplier.metricValue(now));
        }

```

### AutoCloseableResource
'WorkerConfigTransformer' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/AbstractHerder.java`
#### Snippet
```java

    ConfigInfos validateConnectorConfig(Map<String, String> connectorProps, boolean doLog) {
        if (worker.configTransformer() != null) {
            connectorProps = worker.configTransformer().transform(connectorProps);
        }
```

### AutoCloseableResource
'WorkerConfigTransformer' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/AbstractHerder.java`
#### Snippet
```java
    ConfigInfos validateConnectorConfig(Map<String, String> connectorProps, boolean doLog) {
        if (worker.configTransformer() != null) {
            connectorProps = worker.configTransformer().transform(connectorProps);
        }
        String connType = connectorProps.get(ConnectorConfig.CONNECTOR_CLASS_CONFIG);
```

### AutoCloseableResource
'ServerConnector' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/RestServer.java`
#### Snippet
```java

        String advertisedSecurityProtocol = determineAdvertisedProtocol();
        ServerConnector serverConnector = findConnector(advertisedSecurityProtocol);
        builder.scheme(advertisedSecurityProtocol);

```

### AutoCloseableResource
'ErrorReporter' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/errors/ProcessingContext.java`
#### Snippet
```java
    public Future<Void> report() {
        if (reporters.size() == 1) {
            return new ErrantRecordFuture(Collections.singletonList(reporters.iterator().next().report(this)));
        }

```

### AutoCloseableResource
'MetricGroup' used without 'try'-with-resources statement
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java`
#### Snippet
```java
            if (tasks.keySet().stream().noneMatch(id -> id.connector().equals(connectorTaskId.connector()))) {
                connectorStatusMetrics.get(connectorTaskId.connector()).close();
                connectorStatusMetrics.remove(connectorTaskId.connector());
            }
        }
```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java

    private Iterable<AbortedTxnWithPosition> iterable(Supplier<ByteBuffer> allocate) {
        FileChannel channel = channelOrNull();
        if (channel == null)
            return Collections.emptyList();
```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java
            long position = txnWithPosition.position;
            if (abortedTxn.lastOffset() >= offset) {
                channel().truncate(position);
                lastOffset = newLastOffset;
                return;
```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java

        if (file.exists())
            openChannel();
    }

```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java

    public void flush() throws IOException {
        FileChannel channel = channelOrNull();
        if (channel != null)
            channel.force(true);
```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java
     */
    public void reset() throws IOException {
        FileChannel channel = channelOrNull();
        if (channel != null)
            channel.truncate(0);
```

### AutoCloseableResource
'MemoryRecordsBuilder' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogValidator.java`
#### Snippet
```java
        // cardinality is low, so don't use it here
        ByteBuffer newBuffer = ByteBuffer.allocate(sizeInBytesAfterConversion);
        MemoryRecordsBuilder builder = MemoryRecords.builder(newBuffer, toMagic, CompressionType.NONE,
            timestampType, offsetCounter.value, now, producerId, producerEpoch, sequence, isTransactional,
            partitionLeaderEpoch);
```

### AutoCloseableResource
'MemoryRecordsBuilder' used without 'try'-with-resources statement
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogValidator.java`
#### Snippet
```java
        // cardinality is low, so don't use it here
        ByteBuffer buffer = ByteBuffer.allocate(estimatedSize);
        MemoryRecordsBuilder builder = MemoryRecords.builder(buffer, toMagic, targetCompression,
            timestampType, offsetCounter.value, logAppendTime, firstBatch.producerId(),
            firstBatch.producerEpoch(), firstBatch.baseSequence(), firstBatch.isTransactional(),
```

### AutoCloseableResource
'Serializer' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/StateSerdes.java`
#### Snippet
```java
                                    "(key type: %s). Change the default Serdes in StreamConfig or " +
                                    "provide correct Serdes via method parameters.",
                            keySerializer().getClass().getName(),
                            keyClass),
                    e);
```

### AutoCloseableResource
'Serializer' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/StateSerdes.java`
#### Snippet
```java
            final String valueClass;
            final Class<? extends Serializer> serializerClass;
            if (valueSerializer() instanceof ValueAndTimestampSerializer) {
                serializerClass = ((ValueAndTimestampSerializer) valueSerializer()).valueSerializer.getClass();
                valueClass = value == null ? "unknown because value is null" : ((ValueAndTimestamp) value).value().getClass().getName();
```

### AutoCloseableResource
'Serializer' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/StateSerdes.java`
#### Snippet
```java
            final Class<? extends Serializer> serializerClass;
            if (valueSerializer() instanceof ValueAndTimestampSerializer) {
                serializerClass = ((ValueAndTimestampSerializer) valueSerializer()).valueSerializer.getClass();
                valueClass = value == null ? "unknown because value is null" : ((ValueAndTimestamp) value).value().getClass().getName();
            } else {
```

### AutoCloseableResource
'Serializer' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/StateSerdes.java`
#### Snippet
```java
                valueClass = value == null ? "unknown because value is null" : ((ValueAndTimestamp) value).value().getClass().getName();
            } else {
                serializerClass = valueSerializer().getClass();
                valueClass = value == null ? "unknown because value is null" : value.getClass().getName();
            }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/TimestampedKeyAndJoinSideDeserializer.java`
#### Snippet
```java
    public void setIfUnset(final SerdeGetter getter) {
        if (keyDeserializer == null) {
            keyDeserializer = (Deserializer<K>) getter.keySerde().deserializer();
        }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/TimestampedKeyAndJoinSideSerializer.java`
#### Snippet
```java
    public void setIfUnset(final SerdeGetter getter) {
        if (keySerializer == null) {
            keySerializer = (Serializer<K>) getter.keySerde().serializer();
        }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/LeftOrRightValueDeserializer.java`
#### Snippet
```java
    public void setIfUnset(final SerdeGetter getter) {
        if (leftDeserializer == null) {
            leftDeserializer = (Deserializer<V1>) getter.valueSerde().deserializer();
        }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/LeftOrRightValueDeserializer.java`
#### Snippet
```java

        if (rightDeserializer == null) {
            rightDeserializer = (Deserializer<V2>) getter.valueSerde().deserializer();
        }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/InMemoryTimeOrderedKeyValueChangeBuffer.java`
#### Snippet
```java
            final byte[] serializedValue = internalPriorValueForBuffered(serializedKey);

            final V deserializedValue = valueSerde.innerSerde().deserializer().deserialize(
                changelogTopic,
                serializedValue
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/StoreQueryUtils.java`
#### Snippet
```java
    public static <V> Function<byte[], V> getDeserializeValue(final StateSerdes<?, V> serdes,
                                                              final StateStore wrapped) {
        final Serde<V> valueSerde = serdes.valueSerde();
        final boolean timestamped = WrappedStateStore.isTimestamped(wrapped);
        final Deserializer<V> deserializer;
```

### AutoCloseableResource
'KeyValueIterator' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/StoreQueryUtils.java`
#### Snippet
```java
        try {
            if (!lowerRange.isPresent() && !upperRange.isPresent()) {
                iterator = kvStore.all();
            } else {
                iterator = kvStore.range(lowerRange.orElse(null), upperRange.orElse(null));
```

### AutoCloseableResource
'KeyValueIterator' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/StoreQueryUtils.java`
#### Snippet
```java
                iterator = kvStore.all();
            } else {
                iterator = kvStore.range(lowerRange.orElse(null), upperRange.orElse(null));
            }
            final R result = (R) iterator;
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/LeftOrRightValueSerializer.java`
#### Snippet
```java
    public void setIfUnset(final SerdeGetter getter) {
        if (leftSerializer == null) {
            leftSerializer = (Serializer<V1>) getter.valueSerde().serializer();
        }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/LeftOrRightValueSerializer.java`
#### Snippet
```java

        if (rightSerializer == null) {
            rightSerializer = (Serializer<V2>) getter.valueSerde().serializer();
        }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindowedDeserializer.java`
#### Snippet
```java
        if (windowedInnerClassSerdeConfig != null) {
            try {
                windowInnerClassSerde = Utils.newInstance(windowedInnerClassSerdeConfig, Serde.class);
            } catch (final ClassNotFoundException e) {
                throw new ConfigException(StreamsConfig.WINDOWED_INNER_CLASS_SERDE, windowedInnerClassSerdeConfig,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindowedDeserializer.java`
#### Snippet
```java
        if (windowedInnerClassSerdeConfig != null) {
            try {
                windowInnerClassSerde = Utils.newInstance(windowedInnerClassSerdeConfig, Serde.class);
            } catch (final ClassNotFoundException e) {
                throw new ConfigException(StreamsConfig.WINDOWED_INNER_CLASS_SERDE, windowedInnerClassSerdeConfig,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindowedSerializer.java`
#### Snippet
```java
        if (windowedInnerClassSerdeConfig != null) {
            try {
                windowInnerClassSerde = Utils.newInstance(windowedInnerClassSerdeConfig, Serde.class);
            } catch (final ClassNotFoundException e) {
                throw new ConfigException(StreamsConfig.WINDOWED_INNER_CLASS_SERDE, windowedInnerClassSerdeConfig,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindowedSerializer.java`
#### Snippet
```java
        if (windowedInnerClassSerdeConfig != null) {
            try {
                windowInnerClassSerde = Utils.newInstance(windowedInnerClassSerdeConfig, Serde.class);
            } catch (final ClassNotFoundException e) {
                throw new ConfigException(StreamsConfig.WINDOWED_INNER_CLASS_SERDE, windowedInnerClassSerdeConfig,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/WrappingNullableUtils.java`
#### Snippet
```java

        if (specificDeserializer == null) {
            final Deserializer<?> contextKeyDeserializer = context.keySerde().deserializer();
            final Deserializer<?> contextValueDeserializer = context.valueSerde().deserializer();
            deserializerToUse = (Deserializer<T>) (isKey ? contextKeyDeserializer : contextValueDeserializer);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/WrappingNullableUtils.java`
#### Snippet
```java
        if (specificDeserializer == null) {
            final Deserializer<?> contextKeyDeserializer = context.keySerde().deserializer();
            final Deserializer<?> contextValueDeserializer = context.valueSerde().deserializer();
            deserializerToUse = (Deserializer<T>) (isKey ? contextKeyDeserializer : contextValueDeserializer);
        } else {
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/WrappingNullableUtils.java`
#### Snippet
```java
        final Serializer<T> serializerToUse;
        if (specificSerializer == null) {
            final Serializer<?> contextKeySerializer = context.keySerde().serializer();
            final Serializer<?> contextValueSerializer = context.valueSerde().serializer();
            serializerToUse = (Serializer<T>) (isKey ? contextKeySerializer : contextValueSerializer);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/WrappingNullableUtils.java`
#### Snippet
```java
        if (specificSerializer == null) {
            final Serializer<?> contextKeySerializer = context.keySerde().serializer();
            final Serializer<?> contextValueSerializer = context.valueSerde().serializer();
            serializerToUse = (Serializer<T>) (isKey ? contextKeySerializer : contextValueSerializer);
        } else {
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
                sessionMerger),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new WindowedSerdes.SessionWindowedSerde<>(materializedInternal.keySerde()) : null,
            materializedInternal.valueSerde(),
            false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
                countMerger),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new WindowedSerdes.SessionWindowedSerde<>(materializedInternal.keySerde()) : null,
            materializedInternal.valueSerde(),
            false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
        final MaterializedInternal<K, V, SessionStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, REDUCE_NAME);
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java`
#### Snippet
```java
            ),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new WindowedSerdes.SessionWindowedSerde<>(materializedInternal.keySerde()) : null,
            materializedInternal.valueSerde(),
            false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedCogroupedKStreamImpl.java`
#### Snippet
```java
            new NamedInternal(named),
            materialize(materializedInternal),
            materializedInternal.keySerde() != null ?
                new WindowedSerdes.SessionWindowedSerde<>(
                    materializedInternal.keySerde()) :
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/InternalStreamsBuilder.java`
#### Snippet
```java

        for (final OptimizableRepartitionNode<?, ?> repartitionNode : repartitionNodes) {
            if (keySerde == null && repartitionNode.keySerde() != null) {
                keySerde = (Serde<K>) repartitionNode.keySerde();
            }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/InternalStreamsBuilder.java`
#### Snippet
```java
            }

            if (valueSerde == null && repartitionNode.valueSerde() != null) {
                valueSerde = (Serde<V>) repartitionNode.valueSerde();
            }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/FullChangeSerde.java`
#### Snippet
```java
            return null;
        }
        final Deserializer<T> innerDeserializer = innerSerde().deserializer();

        final T oldValue =
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/FullChangeSerde.java`
#### Snippet
```java
            return null;
        }
        final Serializer<T> innerSerializer = innerSerde().serializer();
        final byte[] oldBytes = data.oldValue == null ? null : innerSerializer.serialize(topic, data.oldValue);
        final byte[] newBytes = data.newValue == null ? null : innerSerializer.serialize(topic, data.newValue);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/ChangedDeserializer.java`
#### Snippet
```java
    public void setIfUnset(final SerdeGetter getter) {
        if (inner == null) {
            inner = (Deserializer<T>) getter.valueSerde().deserializer();
        }
    }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedCogroupedKStreamImpl.java`
#### Snippet
```java
            new NamedInternal(named),
            materialize(materializedInternal),
            materializedInternal.keySerde() != null ?
                new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.size())
                : null,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/ChangedSerializer.java`
#### Snippet
```java
    public void setIfUnset(final SerdeGetter getter) {
        if (inner == null) {
            inner = (Serializer<T>) getter.valueSerde().serializer();
        }
    }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
                new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
                new KStreamSlidingWindowAggregate<>(windows, materializedInternal.storeName(), emitStrategy, aggregateBuilder.reduceInitializer, aggregatorForReducer(reducer)),
                materializedInternal.queryableStoreName(),
                materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.timeDifferenceMs()) : null,
                materializedInternal.valueSerde(),
                false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
        final MaterializedInternal<K, VR, WindowStore<Bytes, byte[]>> materializedInternal =
                new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
                new KStreamSlidingWindowAggregate<>(windows, materializedInternal.storeName(), emitStrategy, initializer, aggregator),
                materializedInternal.queryableStoreName(),
                materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.timeDifferenceMs()) : null,
                materializedInternal.valueSerde(),
                false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
                new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedKStreamImpl.java`
#### Snippet
```java
                new KStreamSlidingWindowAggregate<>(windows, materializedInternal.storeName(), emitStrategy, aggregateBuilder.countInitializer, aggregateBuilder.countAggregator),
                materializedInternal.queryableStoreName(),
                materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.timeDifferenceMs()) : null,
                materializedInternal.valueSerde(),
                false);
```

### AutoCloseableResource
'KeyValueIterator, VAgg\>' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamSessionWindowAggregate.java`
#### Snippet
```java
            // this function, otherwise a not-supported exception would throw
            final KeyValueIterator<Windowed<KIn>, VAgg> windowToEmit = store
                .findSessions(emitRangeLowerBound, emitRangeUpperBound);

            int emittedCount = 0;
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedTableImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedTableImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedTableImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedTableImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedTableImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KGroupedStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/SlidingWindowedCogroupedKStreamImpl.java`
#### Snippet
```java
            new NamedInternal(named),
            materialize(materializedInternal),
            materializedInternal.keySerde() != null ?
                new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.timeDifferenceMs())
                : null,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
        final MaterializedInternal<K, VR, WindowStore<Bytes, byte[]>> materializedInternal =
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
                aggregator),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.size()) : null,
            materializedInternal.valueSerde(),
            false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, REDUCE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
                aggregatorForReducer(reducer)),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.size()) : null,
            materializedInternal.valueSerde(),
            false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, AGGREGATE_NAME);

        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
            materializedInternal.withKeySerde(keySerde);
        }
        if (materializedInternal.valueSerde() == null) {
            materializedInternal.withValueSerde(Serdes.Long());
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/TimeWindowedKStreamImpl.java`
#### Snippet
```java
                aggregateBuilder.countAggregator),
            materializedInternal.queryableStoreName(),
            materializedInternal.keySerde() != null ? new FullTimeWindowedSerde<>(materializedInternal.keySerde(), windows.size()) : null,
            materializedInternal.valueSerde(),
            false);
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableImpl.java`
#### Snippet
```java
            // don't inherit parent value serde, since this operation may change the value type, more specifically:
            // we preserve the key following the order of 1) materialized, 2) parent, 3) null
            keySerde = materializedInternal.keySerde() != null ? materializedInternal.keySerde() : this.keySerde;
            // we preserve the value following the order of 1) materialized, 2) null
            valueSerde = materializedInternal.valueSerde();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableImpl.java`
#### Snippet
```java
                builder.newStoreName(MAPVALUES_NAME);
            }
            keySerde = materializedInternal.keySerde() != null ? materializedInternal.keySerde() : this.keySerde;
            valueSerde = materializedInternal.valueSerde();
            queryableStoreName = materializedInternal.queryableStoreName();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableImpl.java`
#### Snippet
```java
        // If we have a key serde, it's still valid, but we don't know the value serde, since it's the result
        // of the joiner (VR).
        if (materializedInternal.keySerde() == null) {
            materializedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableImpl.java`
#### Snippet
```java
            // we can inherit parent key and value serde if user do not provide specific overrides, more specifically:
            // we preserve the key following the order of 1) materialized, 2) parent
            keySerde = materializedInternal.keySerde() != null ? materializedInternal.keySerde() : this.keySerde;
            // we preserve the value following the order of 1) materialized, 2) parent
            valueSerde = materializedInternal.valueSerde() != null ? materializedInternal.valueSerde() : this.valueSerde;
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableImpl.java`
#### Snippet
```java
            keySerde = materializedInternal.keySerde() != null ? materializedInternal.keySerde() : this.keySerde;
            // we preserve the value following the order of 1) materialized, 2) parent
            valueSerde = materializedInternal.valueSerde() != null ? materializedInternal.valueSerde() : this.valueSerde;
            queryableStoreName = materializedInternal.queryableStoreName();
            // only materialize if materialized is specified and it has queryable name
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableImpl.java`
#### Snippet
```java

        if (materializedInternal != null) {
            if (materializedInternal.keySerde() == null) {
                materializedInternal.withKeySerde(this.keySerde);
            }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamSinkNode.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public void writeToTopology(final InternalTopologyBuilder topologyBuilder) {
        final Serializer<K> keySerializer = producedInternal.keySerde() == null ? null : producedInternal.keySerde().serializer();
        final Serializer<V> valSerializer = producedInternal.valueSerde() == null ? null : producedInternal.valueSerde().serializer();
        final String[] parentNames = parentNodeNames();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamSinkNode.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public void writeToTopology(final InternalTopologyBuilder topologyBuilder) {
        final Serializer<K> keySerializer = producedInternal.keySerde() == null ? null : producedInternal.keySerde().serializer();
        final Serializer<V> valSerializer = producedInternal.valueSerde() == null ? null : producedInternal.valueSerde().serializer();
        final String[] parentNames = parentNodeNames();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamSinkNode.java`
#### Snippet
```java
    public void writeToTopology(final InternalTopologyBuilder topologyBuilder) {
        final Serializer<K> keySerializer = producedInternal.keySerde() == null ? null : producedInternal.keySerde().serializer();
        final Serializer<V> valSerializer = producedInternal.valueSerde() == null ? null : producedInternal.valueSerde().serializer();
        final String[] parentNames = parentNodeNames();

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamSinkNode.java`
#### Snippet
```java
    public void writeToTopology(final InternalTopologyBuilder topologyBuilder) {
        final Serializer<K> keySerializer = producedInternal.keySerde() == null ? null : producedInternal.keySerde().serializer();
        final Serializer<V> valSerializer = producedInternal.valueSerde() == null ? null : producedInternal.valueSerde().serializer();
        final String[] parentNames = parentNodeNames();

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/CombinedKeySchema.java`
#### Snippet
```java
        primaryKeySerdeTopic = undecoratedPrimaryKeySerdeTopicSupplier.get();
        foreignKeySerdeTopic = undecoratedForeignKeySerdeTopicSupplier.get();
        primaryKeySerializer = primaryKeySerializer == null ? (Serializer<K>) context.keySerde().serializer() : primaryKeySerializer;
        primaryKeyDeserializer = primaryKeyDeserializer == null ? (Deserializer<K>) context.keySerde().deserializer() : primaryKeyDeserializer;
        foreignKeySerializer = foreignKeySerializer == null ? (Serializer<KO>) context.keySerde().serializer() : foreignKeySerializer;
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/CombinedKeySchema.java`
#### Snippet
```java
        foreignKeySerdeTopic = undecoratedForeignKeySerdeTopicSupplier.get();
        primaryKeySerializer = primaryKeySerializer == null ? (Serializer<K>) context.keySerde().serializer() : primaryKeySerializer;
        primaryKeyDeserializer = primaryKeyDeserializer == null ? (Deserializer<K>) context.keySerde().deserializer() : primaryKeyDeserializer;
        foreignKeySerializer = foreignKeySerializer == null ? (Serializer<KO>) context.keySerde().serializer() : foreignKeySerializer;
        foreignKeyDeserializer = foreignKeyDeserializer == null ? (Deserializer<KO>) context.keySerde().deserializer() : foreignKeyDeserializer;
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/CombinedKeySchema.java`
#### Snippet
```java
        primaryKeySerializer = primaryKeySerializer == null ? (Serializer<K>) context.keySerde().serializer() : primaryKeySerializer;
        primaryKeyDeserializer = primaryKeyDeserializer == null ? (Deserializer<K>) context.keySerde().deserializer() : primaryKeyDeserializer;
        foreignKeySerializer = foreignKeySerializer == null ? (Serializer<KO>) context.keySerde().serializer() : foreignKeySerializer;
        foreignKeyDeserializer = foreignKeyDeserializer == null ? (Deserializer<KO>) context.keySerde().deserializer() : foreignKeyDeserializer;
    }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/CombinedKeySchema.java`
#### Snippet
```java
        primaryKeyDeserializer = primaryKeyDeserializer == null ? (Deserializer<K>) context.keySerde().deserializer() : primaryKeyDeserializer;
        foreignKeySerializer = foreignKeySerializer == null ? (Serializer<KO>) context.keySerde().serializer() : foreignKeySerializer;
        foreignKeyDeserializer = foreignKeyDeserializer == null ? (Deserializer<KO>) context.keySerde().deserializer() : foreignKeyDeserializer;
    }

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/ResponseJoinProcessorSupplier.java`
#### Snippet
```java
                valueGetter.init(context);
                if (runtimeValueSerializer == null) {
                    runtimeValueSerializer = (Serializer<V>) context.valueSerde().serializer();
                }
            }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionWrapperSerde.java`
#### Snippet
```java
        public void setIfUnset(final SerdeGetter getter) {
            if (primaryKeyDeserializer == null) {
                primaryKeyDeserializer = (Deserializer<K>) getter.keySerde().deserializer();
            }
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionWrapperSerde.java`
#### Snippet
```java
        public void setIfUnset(final SerdeGetter getter) {
            if (primaryKeySerializer == null) {
                primaryKeySerializer = (Serializer<K>) getter.keySerde().serializer();
            }
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionSendProcessorSupplier.java`
#### Snippet
```java
            // get default key serde if it wasn't supplied directly at construction
            if (foreignKeySerializer == null) {
                foreignKeySerializer = (Serializer<KO>) context.keySerde().serializer();
            }
            if (valueSerializer == null) {
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionSendProcessorSupplier.java`
#### Snippet
```java
            }
            if (valueSerializer == null) {
                valueSerializer = (Serializer<V>) context.valueSerde().serializer();
            }
            droppedRecordsSensor = TaskMetrics.droppedRecordsSensor(
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java

        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
        return new KStreamImpl<>(
            name,
            joined.keySerde() != null ? joined.keySerde() : keySerde,
            null,
            allSourceNodes,
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java

        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java

        final ProducedInternal<K, V> producedInternal = new ProducedInternal<>(produced);
        if (producedInternal.keySerde() == null) {
            producedInternal.withKeySerde(keySerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
            producedInternal.withKeySerde(keySerde);
        }
        if (producedInternal.valueSerde() == null) {
            producedInternal.withValueSerde(valueSerde);
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
            new MaterializedInternal<>(materialized, builder, TO_KTABLE_NAME);

        final Serde<K> keySerdeOverride = materializedInternal.keySerde() == null
            ? keySerde
            : materializedInternal.keySerde();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
            ? keySerde
            : materializedInternal.keySerde();
        final Serde<V> valueSerdeOverride = materializedInternal.valueSerde() == null
            ? valueSerde
            : materializedInternal.valueSerde();
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java
            .newProcessorName(REPARTITION_NAME);

        final Serde<V> valueSerde = repartitionedInternal.valueSerde() == null ? this.valueSerde : repartitionedInternal.valueSerde();
        final Serde<K> keySerde = repartitionedInternal.keySerde() == null ? this.keySerde : repartitionedInternal.keySerde();

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java`
#### Snippet
```java

        final Serde<V> valueSerde = repartitionedInternal.valueSerde() == null ? this.valueSerde : repartitionedInternal.valueSerde();
        final Serde<K> keySerde = repartitionedInternal.keySerde() == null ? this.keySerde : repartitionedInternal.keySerde();

        final UnoptimizableRepartitionNodeBuilder<K, V> unoptimizableRepartitionNodeBuilder = UnoptimizableRepartitionNode
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionResponseWrapperSerde.java`
#### Snippet
```java
        public void setIfUnset(final SerdeGetter getter) {
            if (deserializer == null) {
                deserializer = (Deserializer<V>) getter.valueSerde().deserializer();
            }
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionResponseWrapperSerde.java`
#### Snippet
```java
        public void setIfUnset(final SerdeGetter getter) {
            if (serializer == null) {
                serializer = (Serializer<V>) getter.valueSerde().serializer();
            }
        }
```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/pipe/PipeDemo.java`
#### Snippet
```java
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "streams-pipe");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/pipe/PipeDemo.java`
#### Snippet
```java
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        // setting offset reset to earliest so that we can re-run the demo code with the same pre-loaded data
```

### AutoCloseableResource
'KafkaStreams' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/pipe/PipeDemo.java`
#### Snippet
```java
        builder.stream("streams-plaintext-input").to("streams-pipe-output");

        final KafkaStreams streams = new KafkaStreams(builder.build(), props);
        final CountDownLatch latch = new CountDownLatch(1);

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountDemo.java`
#### Snippet
```java
        props.putIfAbsent(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.putIfAbsent(StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG, 0);
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountDemo.java`
#### Snippet
```java
        props.putIfAbsent(StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG, 0);
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

        // setting offset reset to earliest so that we can re-run the demo code with the same pre-loaded data
```

### AutoCloseableResource
'KafkaStreams' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountDemo.java`
#### Snippet
```java
        final StreamsBuilder builder = new StreamsBuilder();
        createWordCountStream(builder);
        final KafkaStreams streams = new KafkaStreams(builder.build(), props);
        final CountDownLatch latch = new CountDownLatch(1);

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/temperature/TemperatureDemo.java`
#### Snippet
```java
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "streams-temperature");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/temperature/TemperatureDemo.java`
#### Snippet
```java
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
```

### AutoCloseableResource
'KafkaStreams' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/temperature/TemperatureDemo.java`
#### Snippet
```java
        max.to("iot-temperature-max", Produced.with(windowedSerde, Serdes.String()));

        final KafkaStreams streams = new KafkaStreams(builder.build(), props);
        final CountDownLatch latch = new CountDownLatch(1);

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountTransformerDemo.java`
#### Snippet
```java
        props.putIfAbsent(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.putIfAbsent(StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG, 0);
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountTransformerDemo.java`
#### Snippet
```java
        props.putIfAbsent(StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG, 0);
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        // setting offset reset to earliest so that we can re-run the demo code with the same pre-loaded data
```

### AutoCloseableResource
'KafkaStreams' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountTransformerDemo.java`
#### Snippet
```java
                .to("streams-wordcount-processor-output");

        final KafkaStreams streams = new KafkaStreams(builder.build(), props);
        final CountDownLatch latch = new CountDownLatch(1);

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountProcessorDemo.java`
#### Snippet
```java
        props.putIfAbsent(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.putIfAbsent(StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG, 0);
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

```

### AutoCloseableResource
'Serde' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountProcessorDemo.java`
#### Snippet
```java
        props.putIfAbsent(StreamsConfig.STATESTORE_CACHE_MAX_BYTES_CONFIG, 0);
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        // setting offset reset to earliest so that we can re-run the demo code with the same pre-loaded data
```

### AutoCloseableResource
'KafkaStreams' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/wordcount/WordCountProcessorDemo.java`
#### Snippet
```java
        builder.addSink("Sink", "streams-wordcount-processor-output", "Process");

        final KafkaStreams streams = new KafkaStreams(builder, props);
        final CountDownLatch latch = new CountDownLatch(1);

```

### AutoCloseableResource
'KafkaStreams' used without 'try'-with-resources statement
in `streams/examples/src/main/java/org/apache/kafka/streams/examples/pageview/PageViewTypedDemo.java`
#### Snippet
```java
        regionCount.to("streams-pageviewstats-typed-output", Produced.with(new JSONSerde<>(), new JSONSerde<>()));

        final KafkaStreams streams = new KafkaStreams(builder.build(), props);
        final CountDownLatch latch = new CountDownLatch(1);

```

### AutoCloseableResource
'MetadataPublisher' used without 'try'-with-resources statement
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                // because the loader itself might not be ready. Therefore, we schedule a background
                // task.
                newPublishers.forEach(p -> uninitializedPublishers.put(p.name(), p));
                scheduleInitializeNewPublishers(0);
                future.complete(null);
```

### AutoCloseableResource
'MemoryRecordsBuilder' used without 'try'-with-resources statement
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

        final MemoryRecordsBuilder builder =
            MemoryRecords.builder(buf, messageVersion, compressionType(), TimestampType.CREATE_TIME, startingOffset);

        for (int i = 0; i < batchSize; ++i) {
```

## RuleId[id=RedundantCompareCall]
### RedundantCompareCall
Redundant call to `Byte.compare()`
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionWrapperSerde.java`
#### Snippet
```java

            //7-bit (0x7F) maximum for data version.
            if (Byte.compare((byte) 0x7F, data.getVersion()) < 0) {
                throw new UnsupportedVersionException("SubscriptionWrapper version is larger than maximum supported 0x7F");
            }
```

### RedundantCompareCall
Redundant call to `Byte.compare()`
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionResponseWrapperSerde.java`
#### Snippet
```java

            //7-bit (0x7F) maximum for data version.
            if (Byte.compare((byte) 0x7F, data.getVersion()) < 0) {
                throw new UnsupportedVersionException("SubscriptionResponseWrapper version is larger than maximum supported 0x7F");
            }
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `Void` is redundant
in `clients/src/main/java/org/apache/kafka/clients/admin/CreateTopicsResult.java`
#### Snippet
```java
    public Map<String, KafkaFuture<Void>> values() {
        return futures.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().thenApply(v -> (Void) null)));
    }

```

### RedundantCast
Casting `() -> {...}` to `Runnable` is redundant
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaStatusBackingStore.java`
#### Snippet
```java
                    }

                    sendRetryExecutor.submit((Runnable) () -> kafkaLog.send(key, value, this));
                } else {
                    log.error("Failed to write status update", exception);
```

### RedundantCast
Casting `() -> {...}` to `Runnable` is redundant
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaStatusBackingStore.java`
#### Snippet
```java
                // TODO: retry more gracefully and not forever
                if (exception instanceof RetriableException) {
                    sendRetryExecutor.submit((Runnable) () -> kafkaLog.send(key, value, this));
                } else {
                    log.error("Failed to write status update", exception);
```

### RedundantCast
Casting `(data[offset + tailStart + 8] & 0xff)` to `long` is redundant
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
                k2 ^= (long) (data[offset + tailStart + 9] & 0xff) << 8;
            case 9:
                k2 ^= (long) (data[offset + tailStart + 8] & 0xff);
                k2 *= C2;
                k2 = Long.rotateLeft(k2, R3);
```

### RedundantCast
Casting `(data[offset + tailStart] & 0xff)` to `long` is redundant
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
                k1 ^= (long) (data[offset + tailStart + 1] & 0xff) << 8;
            case 1:
                k1 ^= (long) (data[offset + tailStart] & 0xff);
                k1 *= C1;
                k1 = Long.rotateLeft(k1, R1);
```

### RedundantCast
Casting `getStateStore(...)` to `T` is redundant
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalProcessorContext.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    default <T extends StateStore> T getStateStore(final StoreBuilder<T> builder) {
        return (T) getStateStore(builder.name());
    }

```

### RedundantCast
Casting `nodeFactory` to `ProcessorNodeFactory` is redundant
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java`
#### Snippet
```java
                sourceNodes.add((SourceNodeFactory<?, ?>) nodeFactory);
            } else if (nodeFactory instanceof ProcessorNodeFactory) {
                sourceNodes.addAll(findSourcesForProcessorPredecessors(((ProcessorNodeFactory<?, ?, ?, ?>) nodeFactory).predecessors));
            }
        }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param clusterId` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/ClusterResource.java`
#### Snippet
```java
     * metadata request was sent to a broker without support for cluster ids. The first version of Kafka
     * to support cluster id is 0.10.1.0.
     * @param clusterId
     */
    public ClusterResource(String clusterId) {
```

### JavadocDeclaration
`@param partition` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/Cluster.java`
#### Snippet
```java
    /**
     * Get the node by node id if the replica for the given partition is online
     * @param partition
     * @param id
     * @return the node
```

### JavadocDeclaration
`@param id` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/Cluster.java`
#### Snippet
```java
     * Get the node by node id if the replica for the given partition is online
     * @param partition
     * @param id
     * @return the node
     */
```

### JavadocDeclaration
Class reference expected
in `clients/src/main/java/org/apache/kafka/common/config/provider/ConfigProvider.java`
#### Snippet
```java
     * @param keys the keys whose values will be retrieved
     * @param callback the callback to invoke upon change
     * @throws {@link UnsupportedOperationException} if the subscribe operation is not supported
     */
    default void subscribe(String path, Set<String> keys, ConfigChangeCallback callback) {
```

### JavadocDeclaration
Class reference expected
in `clients/src/main/java/org/apache/kafka/common/config/provider/ConfigProvider.java`
#### Snippet
```java
     * @param keys the keys whose values will be retrieved
     * @param callback the callback to be unsubscribed from changes
     * @throws {@link UnsupportedOperationException} if the unsubscribe operation is not supported
     */
    default void unsubscribe(String path, Set<String> keys, ConfigChangeCallback callback) {
```

### JavadocDeclaration
Class reference expected
in `clients/src/main/java/org/apache/kafka/common/config/provider/ConfigProvider.java`
#### Snippet
```java
     * Clears all subscribers (optional operation).
     *
     * @throws {@link UnsupportedOperationException} if the unsubscribeAll operation is not supported
     */
    default void unsubscribeAll() {
```

### JavadocDeclaration
`@param other` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
    /**
     * Returns an empty collection if this list is null
     * @param other
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
     * Returns an empty collection if this list is null
     * @param other
     * @return
     */
    public static <T> List<T> safe(List<T> other) {
```

### JavadocDeclaration
`@return` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
     * Formats a byte number as a human readable String ("3.2 MB")
     * @param bytes some size in bytes
     * @return
     */
    public static String formatBytes(long bytes) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `clients/src/main/java/org/apache/kafka/common/record/CompressionType.java`
#### Snippet
```java
     * Wrap bufferStream with an OutputStream that will compress data with this CompressionType.
     * <p>
     * Note: Unlike {@link #wrapForInput}, {@link #wrapForOutput} cannot take {@link ByteBuffer}s directly.
     * Currently, {@link MemoryRecordsBuilder#writeDefaultBatchHeader()} and {@link MemoryRecordsBuilder#writeLegacyCompressedWrapperHeader()}
     * write to the underlying buffer in the given {@link ByteBufferOutputStream} after the compressed data has been written.
```

### JavadocDeclaration
Illegal character
in `clients/src/main/java/org/apache/kafka/common/config/ConfigDef.java`
#### Snippet
```java
 * // check {@link #define(String, Type, Object, Validator, Importance, String)} for more details.
 * defs.define(&quot;config_with_validator&quot;, Type.INT, 42, Range.atLeast(0), Importance.High, &quot;Configuration with user provided validator.&quot;);
 * // check {@link #define(String, Type, Importance, String, String, int, Width, String, List<String>)} for more details.
 * defs.define(&quot;config_with_dependents&quot;, Type.INT, Importance.LOW, &quot;Configuration with dependents.&quot;, &quot;group&quot;, 1, Width.SHORT, &quot;Config With Dependents&quot;, Arrays.asList(&quot;config_with_default&quot;,&quot;config_with_validator&quot;));
 *
```

### JavadocDeclaration
Illegal character
in `clients/src/main/java/org/apache/kafka/common/config/ConfigDef.java`
#### Snippet
```java
 * // check {@link #define(String, Type, Object, Validator, Importance, String)} for more details.
 * defs.define(&quot;config_with_validator&quot;, Type.INT, 42, Range.atLeast(0), Importance.High, &quot;Configuration with user provided validator.&quot;);
 * // check {@link #define(String, Type, Importance, String, String, int, Width, String, List<String>)} for more details.
 * defs.define(&quot;config_with_dependents&quot;, Type.INT, Importance.LOW, &quot;Configuration with dependents.&quot;, &quot;group&quot;, 1, Width.SHORT, &quot;Config With Dependents&quot;, Arrays.asList(&quot;config_with_default&quot;,&quot;config_with_validator&quot;));
 *
```

### JavadocDeclaration
Javadoc pointing to itself
in `clients/src/main/java/org/apache/kafka/common/record/RecordsSend.java`
#### Snippet
```java
     * appropriately for every subsequent invocation. See {@link #writeTo} for example expected usage.
     * @param channel The channel to write to
     * @param previouslyWritten Bytes written in previous calls to {@link #writeTo(TransferableChannel, int, int)}; 0 if being called for the first time
     * @param remaining Number of bytes remaining to be written
     * @return The number of bytes actually written
```

### JavadocDeclaration
`@param metric` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/metrics/MetricsReporter.java`
#### Snippet
```java
    /**
     * This is called whenever a metric is updated or added
     * @param metric
     */
    void metricChange(KafkaMetric metric);
```

### JavadocDeclaration
`@param metric` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/metrics/MetricsReporter.java`
#### Snippet
```java
    /**
     * This is called whenever a metric is removed
     * @param metric
     */
    void metricRemoval(KafkaMetric metric);
```

### JavadocDeclaration
`@param metricName` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/metrics/JmxReporter.java`
#### Snippet
```java

    /**
     * @param metricName
     * @return standard JMX MBean name in the following format domainName:type=metricType,key1=val1,key2=val2
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/network/Selectable.java`
#### Snippet
```java
     * Do I/O. Reads, writes, connection establishment, etc.
     * @param timeout The amount of time to block if there is nothing to do
     * @throws IOException
     */
    void poll(long timeout) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/network/KafkaChannel.java`
#### Snippet
```java
    /**
     * Finish up any processing on {@link #prepare()} failure.
     * @throws IOException
     */
    void completeCloseOnAuthenticationFailure() throws IOException {
```

### JavadocDeclaration
Class reference expected
in `clients/src/main/java/org/apache/kafka/common/protocol/Message.java`
#### Snippet
```java
     * @param version       The version to use.
     *
     * @throws {@see org.apache.kafka.common.errors.UnsupportedVersionException}
     *                      If the specified version is too new to be supported
     *                      by this software.
```

### JavadocDeclaration
Class reference expected
in `clients/src/main/java/org/apache/kafka/common/protocol/Message.java`
#### Snippet
```java
     * @param version       The version to use.
     *
     * @throws {@see org.apache.kafka.common.errors.UnsupportedVersionException}
     *                      If the specified version is too new to be supported
     *                      by this software.
```

### JavadocDeclaration
Class reference expected
in `clients/src/main/java/org/apache/kafka/common/protocol/Message.java`
#### Snippet
```java
     * @param version       The version to use.
     *
     * @throws {@see org.apache.kafka.common.errors.UnsupportedVersionException}
     *                      If the specified version is too new to be supported
     *                      by this software.
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockInputStream.java`
#### Snippet
```java
     * result to a buffer.
     *
     * @throws IOException
     */
    private void readBlock() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockInputStream.java`
#### Snippet
```java
     * Reads the magic number and frame descriptor from input buffer.
     *
     * @throws IOException
     */
    private void readHeader() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockInputStream.java`
#### Snippet
```java
     * @param in The byte buffer to decompress
     * @param ignoreFlagDescriptorChecksum for compatibility with old kafka clients, ignore incorrect HC byte
     * @throws IOException
     */
    public KafkaLZ4BlockInputStream(ByteBuffer in, BufferSupplier bufferSupplier, boolean ignoreFlagDescriptorChecksum) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     * Writes the magic number and frame descriptor to the underlying {@link OutputStream}.
     *
     * @throws IOException
     */
    private void writeHeader() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     * of the block stream.
     *
     * @throws IOException
     */
    private void writeEndMark() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     * {@link OutputStream}.
     *
     * @throws IOException
     */
    private void writeBlock() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     *
     * @param out The output stream to compress
     * @throws IOException
     */
    public KafkaLZ4BlockOutputStream(OutputStream out) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     * @param blockChecksum Default: false. When true, a XXHash32 checksum is computed and appended to the stream for
     *            every block of data
     * @throws IOException
     */
    public KafkaLZ4BlockOutputStream(OutputStream out, int blockSize, boolean blockChecksum) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     * @param useBrokenFlagDescriptorChecksum Default: false. When true, writes an incorrect FrameDescriptor checksum
     *            compatible with older kafka clients.
     * @throws IOException
     */
    public KafkaLZ4BlockOutputStream(OutputStream out, int blockSize, boolean blockChecksum, boolean useBrokenFlagDescriptorChecksum) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockOutputStream.java`
#### Snippet
```java
     * @param blockSize Default: 4. The block size used during compression. 4=64kb, 5=256kb, 6=1mb, 7=4mb. All other
     *            values will generate an exception
     * @throws IOException
     */
    public KafkaLZ4BlockOutputStream(OutputStream out, int blockSize) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/network/SslTransportLayer.java`
#### Snippet
```java
    * @param doWrite boolean
    * @return SSLEngineResult
    * @throws IOException
    */
    private SSLEngineResult handshakeWrap(boolean doWrite) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/network/SslTransportLayer.java`
#### Snippet
```java
     * @param ignoreHandshakeStatus If true, continue to unwrap if data available regardless of handshake status
     * @return SSLEngineResult
     * @throws IOException
     */
    private SSLEngineResult handshakeUnwrap(boolean doRead, boolean ignoreHandshakeStatus) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/network/SslTransportLayer.java`
#### Snippet
```java
    * @param buf ByteBuffer
    * @return boolean true if the buffer has been emptied out, false otherwise
    * @throws IOException
    */
    protected boolean flush(ByteBuffer buf) throws IOException {
```

### JavadocDeclaration
`@param name` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Struct.java`
#### Snippet
```java
    /**
     * Check if the struct contains a field.
     * @param name
     * @return Whether a field exists.
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
     * clear `completedSends` and `completedReceives` as soon as they are processed to avoid
     * holding onto large request/response buffers from multiple connections longer than necessary.
     * Clients rely on Selector invoking {@link #clear()} at the start of each poll() since memory usage
     * is less critical and clearing once-per-poll provides the flexibility to process these results in
     * any order before the next poll.
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/security/auth/KafkaPrincipalSerde.java`
#### Snippet
```java
     * @param principal principal to be serialized
     * @return serialized bytes
     * @throws SerializationException
     */
    byte[] serialize(KafkaPrincipal principal) throws SerializationException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/security/auth/KafkaPrincipalSerde.java`
#### Snippet
```java
     * @param bytes byte array to be deserialized
     * @return the deserialized principal
     * @throws SerializationException
     */
    KafkaPrincipal deserialize(byte[] bytes) throws SerializationException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosShortNamer.java`
#### Snippet
```java
     * user name.
     * @return the short name
     * @throws IOException
     */
    public String shortName(KerberosName kerberosName) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosRule.java`
#### Snippet
```java
     * @param to the string to replace matches of the pattern with
     * @param repeat whether the substitution should be repeated
     * @return
     */
    static String replaceSubstitution(String base, Pattern from, String to,
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosRule.java`
#### Snippet
```java
     * @param params the list of parameters
     * @return the generated string with the parameter references replaced.
     * @throws BadFormatString
     */
    static String replaceParameters(String format,
```

### JavadocDeclaration
`@param owners` tag description is missing
in `clients/src/main/java/org/apache/kafka/clients/admin/DescribeDelegationTokenOptions.java`
#### Snippet
```java
     * if owners is null, all the user owned tokens and tokens where user have Describe permission
     * will be returned.
     * @param owners
     * @return this instance
     */
```

### JavadocDeclaration
`@param topicPartition` tag description is missing
in `clients/src/main/java/org/apache/kafka/clients/Metadata.java`
#### Snippet
```java
     * follows a different code path ({@link #update}).
     *
     * @param topicPartition
     * @param leaderEpoch
     * @return true if we updated the last seen epoch, false otherwise
```

### JavadocDeclaration
`@param leaderEpoch` tag description is missing
in `clients/src/main/java/org/apache/kafka/clients/Metadata.java`
#### Snippet
```java
     *
     * @param topicPartition
     * @param leaderEpoch
     * @return true if we updated the last seen epoch, false otherwise
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.java`
#### Snippet
```java
     * It is guaranteed that under normal conditions all the processes in a consumer group will execute their
     * {@link #onPartitionsRevoked(Collection)} callback before any instance executes its
     * {@link #onPartitionsAssigned(Collection)} callback. During exceptional scenarios, partitions may be migrated
     * without the old owner being notified (i.e. their {@link #onPartitionsRevoked(Collection)} callback not triggered),
     * and later when the old owner consumer realized this event, the {@link #onPartitionsLost(Collection)} (Collection)} callback
```

### JavadocDeclaration
Tag `return` is not allowed here
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/NetworkClientDelegate.java`
#### Snippet
```java
     * @param timeoutMs     timeout time
     * @param currentTimeMs current time
     * @return a list of client response
     */
    public void poll(final long timeoutMs, final long currentTimeMs) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java`
#### Snippet
```java
     * Manual topic assignment through this method does not use the consumer's group management
     * functionality. As such, there will be no rebalance operation triggered when group membership or cluster and topic
     * metadata change. Note that it is not possible to use both manual partition assignment with {@link #assign(Collection)}
     * and group assignment with {@link #subscribe(Collection, ConsumerRebalanceListener)}.
     * <p>
```

### JavadocDeclaration
Wrong tag `ConsumerBackgroundThread`
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/DefaultEventHandler.java`
#### Snippet
```java
/**
 * An {@code EventHandler} that uses a single background thread to consume {@code ApplicationEvent} and produce
 * {@code BackgroundEvent} from the {@ConsumerBackgroundThread}.
 */
public class DefaultEventHandler implements EventHandler {
```

### JavadocDeclaration
Javadoc pointing to itself
in `connect/api/src/main/java/org/apache/kafka/connect/data/Struct.java`
#### Snippet
```java
     * @param fieldName the name of the field to set
     * @param value the value of the field
     * @return the Struct, to allow chaining of {@link #put(String, Object)} calls
     */
    public Struct put(String fieldName, Object value) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `connect/api/src/main/java/org/apache/kafka/connect/source/SourceTask.java`
#### Snippet
```java
     * @param record {@link SourceRecord} that was successfully sent via the producer, filtered by a transformation, or dropped on producer exception
     * @param metadata {@link RecordMetadata} record metadata returned from the broker, or null if the record was filtered or if producer exceptions are ignored
     * @throws InterruptedException
     */
    public void commitRecord(SourceRecord record, RecordMetadata metadata)
```

### JavadocDeclaration
`@throws` tag description is missing
in `connect/api/src/main/java/org/apache/kafka/connect/source/SourceTask.java`
#### Snippet
```java
     *
     * @param record {@link SourceRecord} that was successfully sent via the producer or filtered by a transformation
     * @throws InterruptedException
     * @deprecated Use {@link #commitRecord(SourceRecord, RecordMetadata)} instead.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerTask.java`
#### Snippet
```java
     *
     * @return true if the task's target state is not paused, false if the task is shutdown before resumption
     * @throws InterruptedException
     */
    protected boolean awaitUnpause() throws InterruptedException {
```

### JavadocDeclaration
`@param key` tag description is missing
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectorConfig.java`
#### Snippet
```java
         * Return {@link ConfigDef} from {@code cls}, which is expected to be a non-null {@code Class<T>},
         * by instantiating it and invoking {@link #config(T)}.
         * @param key
         * @param cls The subclass of the baseclass.
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/PluginUtils.java`
#### Snippet
```java
     * @param topPath the path to use as root of plugin search.
     * @return a list of potential plugin paths, or empty list if no such paths exist.
     * @throws IOException
     */
    public static List<Path> pluginUrls(Path topPath) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `storage/src/main/java/org/apache/kafka/server/log/remote/metadata/storage/ProducerManager.java`
#### Snippet
```java
     *
     * @param remoteLogMetadata RemoteLogMetadata to be published
     * @return
     */
    public CompletableFuture<RecordMetadata> publishMessage(RemoteLogMetadata remoteLogMetadata) {
```

### JavadocDeclaration
`@return` tag description is missing
in `storage/src/main/java/org/apache/kafka/server/log/remote/metadata/storage/RemoteLogMetadataCache.java`
#### Snippet
```java
     * Returns all the segments stored in this cache.
     *
     * @return
     */
    public Iterator<RemoteLogSegmentMetadata> listAllRemoteLogSegments() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogDirFailureChannel.java`
#### Snippet
```java
     * 
     * @return The next offline log dir.
     * @throws InterruptedException
     */
    public String takeNextOfflineLogDir() throws InterruptedException {
```

### JavadocDeclaration
`@return` tag description is missing
in `storage/src/main/java/org/apache/kafka/server/log/remote/metadata/storage/TopicBasedRemoteLogMetadataManager.java`
#### Snippet
```java
     * @param topicIdPartition partition of the given remoteLogMetadata.
     * @param remoteLogMetadata RemoteLogMetadata to be stored.
     * @return
     * @throws RemoteStorageException if there are any storage errors occur.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `storage/src/main/java/org/apache/kafka/storage/internals/log/AbstractIndex.java`
#### Snippet
```java
    /**
     * Get offset relative to base offset of this index
     * @throws IndexOffsetOverflowException
     */
    public int relativeOffset(long offset) {
```

### JavadocDeclaration
`@param listener` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachedStateStore.java`
#### Snippet
```java
     * Set the {@link CacheFlushListener} to be notified when entries are flushed from the
     * cache to the underlying {@link org.apache.kafka.streams.processor.StateStore}
     * @param listener
     * @param sendOldValues
     */
```

### JavadocDeclaration
`@param sendOldValues` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachedStateStore.java`
#### Snippet
```java
     * cache to the underlying {@link org.apache.kafka.streams.processor.StateStore}
     * @param listener
     * @param sendOldValues
     */
    boolean setFlushListener(final CacheFlushListener<K, V> listener,
```

### JavadocDeclaration
`@param key` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * prefixed queries.
         *
         * @param key
         * @param timestamp
         * @return  The key that represents the prefixed Segmented key in bytes.
```

### JavadocDeclaration
`@param timestamp` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         *
         * @param key
         * @param timestamp
         * @return  The key that represents the prefixed Segmented key in bytes.
         */
```

### JavadocDeclaration
`@param key` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
     * should be a composite of the record key, and the timestamp information etc
     * as described by the {@link KeySchema}
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
     * as described by the {@link KeySchema}
     * @param key
     * @param value
     */
    void put(Bytes key, byte[] value);
```

### JavadocDeclaration
`@param key` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @see SessionKeySchema#lowerRange
         * @see WindowKeySchema#lowerRange
         * @param key
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @see WindowKeySchema#lowerRange
         * @param key
         * @return
         */
        long segmentTimestamp(final Bytes key);
```

### JavadocDeclaration
`@param key` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @see SessionKeySchema#upperRange
         * @see WindowKeySchema#upperRange
         * @param key
         * @param to
         * @return      The key that represents the upper range to search for in the store
```

### JavadocDeclaration
`@param to` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @see WindowKeySchema#upperRange
         * @param key
         * @param to
         * @return      The key that represents the upper range to search for in the store
         */
```

### JavadocDeclaration
`@param key` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @see SessionKeySchema#lowerRange
         * @see WindowKeySchema#lowerRange
         * @param key
         * @param from
         * @return      The key that represents the lower range to search for in the store
```

### JavadocDeclaration
`@param from` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @see WindowKeySchema#lowerRange
         * @param key
         * @param from
         * @return      The key that represents the lower range to search for in the store
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @param to            ending time range
         * @param forward       forward or backward
         * @return
         */
        HasNextCondition hasNextCondition(final Bytes binaryKeyFrom, final Bytes binaryKeyTo, final long from, final long to, final boolean forward);
```

### JavadocDeclaration
`@param key` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
     * should be a composite of the record key, and the timestamp information etc
     * as described by the {@link KeySchema}
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
     * as described by the {@link KeySchema}
     * @param key
     * @return
     */
    byte[] get(Bytes key);
```

### JavadocDeclaration
`@param segments` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * Used during {@link SegmentedBytesStore#fetch(Bytes, long, long)} operations to determine
         * which segments should be scanned.
         * @param segments
         * @param from
         * @param to
```

### JavadocDeclaration
`@param from` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * which segments should be scanned.
         * @param segments
         * @param from
         * @param to
         * @return  List of segments to search
```

### JavadocDeclaration
`@param to` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/state/internals/SegmentedBytesStore.java`
#### Snippet
```java
         * @param segments
         * @param from
         * @param to
         * @return  List of segments to search
         */
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/TransformerSupplier.java`
#### Snippet
```java
    /**
     * Return a newly constructed {@link Transformer} instance.
     * The supplier should always generate a new instance each time {@link  TransformerSupplier#get() gets called}.
     * <p>
     * Creating a single {@link Transformer} object and returning the same object reference in {@link TransformerSupplier#get()}
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/TransformerSupplier.java`
#### Snippet
```java
     * The supplier should always generate a new instance each time {@link  TransformerSupplier#get() gets called}.
     * <p>
     * Creating a single {@link Transformer} object and returning the same object reference in {@link TransformerSupplier#get()}
     * is a violation of the supplier pattern and leads to runtime exceptions.
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformer.java`
#### Snippet
```java
     * This is called once per instance when the topology gets initialized.
     * When the framework is done with the transformer, {@link #close()} will be called on it; the
     * framework may later re-use the transformer by calling {@link #init(ProcessorContext)} again.
     * <p>
     * The provided {@link ProcessorContext context} can be used to access topology and record meta data, to
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/TimeWindows.java`
#### Snippet
```java
     * @return this updated builder
     * @throws IllegalArgumentException if {@code afterWindowEnd} is negative or can't be represented as {@code long milliseconds}
     * @throws IllegalStateException if {@link #grace(Duration)} is called after {@link #ofSizeAndGrace(Duration, Duration)} or {@link #ofSizeWithNoGrace(Duration)}
     * @deprecated since 3.0. Use {@link #ofSizeAndGrace(Duration, Duration)} instead
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKeySupplier.java`
#### Snippet
```java
    /**
     * Return a newly constructed {@link ValueTransformerWithKey} instance.
     * The supplier should always generate a new instance each time {@link  ValueTransformerWithKeySupplier#get()} gets called.
     * <p>
     * Creating a single {@link ValueTransformerWithKey} object and returning the same object reference in {@link ValueTransformerWithKeySupplier#get()}
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKeySupplier.java`
#### Snippet
```java
     * The supplier should always generate a new instance each time {@link  ValueTransformerWithKeySupplier#get()} gets called.
     * <p>
     * Creating a single {@link ValueTransformerWithKey} object and returning the same object reference in {@link ValueTransformerWithKeySupplier#get()}
     * is a violation of the supplier pattern and leads to runtime exceptions.
     *
```

### JavadocDeclaration
Duplicate @return tag
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerWithKeySupplier.java`
#### Snippet
```java
     *
     * @return  a new {@link ValueTransformerWithKey} instance
     * @return  a newly constructed {@link ValueTransformerWithKey} instance
     */
    ValueTransformerWithKey<K, V, VR> get();
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/JoinWindows.java`
#### Snippet
```java
     * @return this updated builder
     * @throws IllegalArgumentException if the {@code afterWindowEnd} is negative or can't be represented as {@code long milliseconds}
     * @throws IllegalStateException if {@link #grace(Duration)} is called after {@link #ofTimeDifferenceAndGrace(Duration, Duration)} or {@link #ofTimeDifferenceWithNoGrace(Duration)}
     * @deprecated since 3.0. Use {@link #ofTimeDifferenceAndGrace(Duration, Duration)} instead
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerSupplier.java`
#### Snippet
```java
    /**
     * Return a newly constructed {@link ValueTransformer} instance.
     * The supplier should always generate a new instance each time {@link  ValueTransformerSupplier#get()} gets called.
     * <p>
     * Creating a single {@link ValueTransformer} object and returning the same object reference in {@link ValueTransformerSupplier#get()}
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerSupplier.java`
#### Snippet
```java
     * The supplier should always generate a new instance each time {@link  ValueTransformerSupplier#get()} gets called.
     * <p>
     * Creating a single {@link ValueTransformer} object and returning the same object reference in {@link ValueTransformerSupplier#get()}
     * is a violation of the supplier pattern and leads to runtime exceptions.
     *
```

### JavadocDeclaration
Duplicate @return tag
in `streams/src/main/java/org/apache/kafka/streams/kstream/ValueTransformerSupplier.java`
#### Snippet
```java
     *
     * @return  a new {@link ValueTransformer} instance
     * @return  a newly constructed {@link ValueTransformer} instance
     */
    ValueTransformer<V, VR> get();
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/Transformer.java`
#### Snippet
```java
     * This is called once per instance when the topology gets initialized.
     * When the framework is done with the transformer, {@link #close()} will be called on it; the
     * framework may later re-use the transformer by calling {@link #init(ProcessorContext)} again.
     * <p>
     * The provided {@link ProcessorContext context} can be used to access topology and record meta data, to
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/kstream/SessionWindows.java`
#### Snippet
```java
     * @return this updated builder
     * @throws IllegalArgumentException if the {@code afterWindowEnd} is negative or can't be represented as {@code long milliseconds}
     * @throws IllegalStateException if {@link #grace(Duration)} is called after {@link #ofInactivityGapAndGrace(Duration, Duration)} or {@link #ofInactivityGapWithNoGrace(Duration)}
     * @deprecated since 3.0. Use {@link #ofInactivityGapAndGrace(Duration, Duration)} instead
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/processor/ProcessorSupplier.java`
#### Snippet
```java
    /**
     * Return a newly constructed {@link Processor} instance.
     * The supplier should always generate a new instance each time {@link  ProcessorSupplier#get()} gets called.
     * <p>
     * Creating a single {@link Processor} object and returning the same object reference in {@link ProcessorSupplier#get()}
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/processor/ProcessorSupplier.java`
#### Snippet
```java
     * The supplier should always generate a new instance each time {@link  ProcessorSupplier#get()} gets called.
     * <p>
     * Creating a single {@link Processor} object and returning the same object reference in {@link ProcessorSupplier#get()}
     * is a violation of the supplier pattern and leads to runtime exceptions.
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/processor/api/ProcessorSupplier.java`
#### Snippet
```java
    /**
     * Return a newly constructed {@link Processor} instance.
     * The supplier should always generate a new instance each time {@link  ProcessorSupplier#get()} gets called.
     * <p>
     * Creating a single {@link Processor} object and returning the same object reference in {@link ProcessorSupplier#get()}
```

### JavadocDeclaration
Javadoc pointing to itself
in `streams/src/main/java/org/apache/kafka/streams/processor/api/ProcessorSupplier.java`
#### Snippet
```java
     * The supplier should always generate a new instance each time {@link  ProcessorSupplier#get()} gets called.
     * <p>
     * Creating a single {@link Processor} object and returning the same object reference in {@link ProcessorSupplier#get()}
     * is a violation of the supplier pattern and leads to runtime exceptions.
     *
```

### JavadocDeclaration
Wrong tag `Link`
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java
     * @param activePartitionHostMap  the current mapping of {@link HostInfo} -> {@link TopicPartition}s for active partitions
     * @param standbyPartitionHostMap the current mapping of {@link HostInfo} -> {@link TopicPartition}s for standby partitions
     * @param topicPartitionInfo      the current mapping of {@link TopicPartition} -> {@Link PartitionInfo}
     */
    synchronized void onChange(final Map<HostInfo, Set<TopicPartition>> activePartitionHostMap,
```

### JavadocDeclaration
`@throws` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsProducer.java`
#### Snippet
```java
    /**
     * @throws IllegalStateException if EOS is disabled
     * @throws TaskMigratedException
     */
    protected void commitTransaction(final Map<TopicPartition, OffsetAndMetadata> offsets,
```

### JavadocDeclaration
`@throws` tag description is missing
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/TaskManager.java`
#### Snippet
```java

    /**
     * @throws TaskMigratedException
     */
    boolean handleCorruption(final Set<TaskId> corruptedTasks) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `trogdor/src/main/java/org/apache/kafka/trogdor/fault/DegradedNetworkFaultWorker.java`
#### Snippet
```java
    /**
     * Delete any previously defined qdisc for the given network interface.
     * @throws IOException
     */
    private void disableTrafficControl(Platform platform, String networkDevice) throws IOException {
```

### JavadocDeclaration
Wrong tag `link{org.apache.kafka.controller.metrics.ControllerMetadataMetrics},`
in `metadata/src/main/java/org/apache/kafka/controller/metrics/QuorumControllerMetrics.java`
#### Snippet
```java
 *
 * IMPORTANT: Metrics which relate to the metadata itself (like number of topics, etc.) should go in
 * @link{org.apache.kafka.controller.metrics.ControllerMetadataMetrics}, not here.
 */
public class QuorumControllerMetrics implements AutoCloseable {
```

### JavadocDeclaration
Wrong tag `link{org.apache.kafka.controller.metrics.QuorumControllerMetrics},`
in `metadata/src/main/java/org/apache/kafka/controller/metrics/ControllerMetadataMetrics.java`
#### Snippet
```java
 *
 * IMPORTANT: Metrics which are managed by the QuorumController class itself should go in
 * @link{org.apache.kafka.controller.metrics.QuorumControllerMetrics}, not here.
 */
public final class ControllerMetadataMetrics implements AutoCloseable {
```

### JavadocDeclaration
`@param timeoutMs` tag description is missing
in `server-common/src/main/java/org/apache/kafka/server/util/timer/Timer.java`
#### Snippet
```java
     * Advance the internal clock, executing any tasks whose expiration has been
     * reached within the duration of the passed timeout.
     * @param timeoutMs
     * @return whether or not any tasks were executed
     */
```

### JavadocDeclaration
Wrong tag `SnapshottableHashTable`
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashSet.java`
#### Snippet
```java
 * This is a hash set which can be snapshotted.
 *
 * See {@SnapshottableHashTable} for more details about the implementation.
 *
 * This class requires external synchronization.  Null values are not supported.
```

### JavadocDeclaration
Wrong tag `SnapshottableHashTable`
in `server-common/src/main/java/org/apache/kafka/timeline/TimelineHashMap.java`
#### Snippet
```java
 * This is a hash map which can be snapshotted.
 *
 * See {@SnapshottableHashTable} for more details about the implementation.
 *
 * This class requires external synchronization.  Null keys and values are not supported.
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/util/ByteUtilsBenchmark.java`
#### Snippet
```java
         * Generates a random int32 number which occupies exactly bytesSet in the variable length encoding for int32
         *
         * @see {@link #generateRandomLongWithExactBytesSet(int)} for implementation details.
         *
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/ReplicatedGroupCoordinator.java`
#### Snippet
```java

     * @param record The record to apply to the state machine.
     * @throws RuntimeException
     */
    @Override
```

### JavadocDeclaration
`@param logContext` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java
    /**
     *
     * @param logContext
     * @param config
     * @param runtime
```

### JavadocDeclaration
`@param config` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java
     *
     * @param logContext
     * @param config
     * @param runtime
     */
```

### JavadocDeclaration
`@param runtime` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupCoordinatorService.java`
#### Snippet
```java
     * @param logContext
     * @param config
     * @param runtime
     */
    GroupCoordinatorService(
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupMetadataManager.java`
#### Snippet
```java
     * @param value The value.
     * @param error The error message.
     * @throws InvalidRequestException
     */
    private void throwIfNotNull(
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupMetadataManager.java`
#### Snippet
```java
     * @param value The value.
     * @param error The error message.
     * @throws InvalidRequestException
     */
    private void throwIfEmptyString(
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
    /**
     * @return The coordinator context if the coordinator is active or an exception otherwise.
     * @throws NotCoordinatorException
     * @throws CoordinatorLoadInProgressException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
     * @return The coordinator context if the coordinator is active or an exception otherwise.
     * @throws NotCoordinatorException
     * @throws CoordinatorLoadInProgressException
     */
    private CoordinatorContext activeContextOrThrow(TopicPartition tp) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
     * in the runtime.
     *
     * @throws Exception
     */
    public void close() throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
         * @param coordinator The coordinator state machine.
         * @return A result containing a list of records and the RPC result.
         * @throws KafkaException
         */
        CoordinatorResult<T, U> generateRecordsAndResult(S coordinator) throws KafkaException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
         * @param offset    The last committed offset.
         * @return A response.
         * @throws KafkaException
         */
        T generateResponse(S state, long offset) throws KafkaException;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `producerIdExpirationCheckIntervalMs` may be 'final'
in `core/src/main/java/kafka/server/builders/LogManagerBuilder.java`
#### Snippet
```java
    private int maxTransactionTimeoutMs = 15 * 60 * 1000;
    private ProducerStateManagerConfig producerStateManagerConfig = new ProducerStateManagerConfig(60000, false);
    private int producerIdExpirationCheckIntervalMs = 600000;
    private MetadataVersion interBrokerProtocolVersion = MetadataVersion.latest();
    private Scheduler scheduler = null;
```

### FieldMayBeFinal
Field `replicaMgr` may be 'final'
in `core/src/main/java/kafka/server/ReplicaFetcherTierStateMachine.java`
#### Snippet
```java

    private LeaderEndPoint leader;
    private ReplicaManager replicaMgr;

    public ReplicaFetcherTierStateMachine(LeaderEndPoint leader,
```

### FieldMayBeFinal
Field `leader` may be 'final'
in `core/src/main/java/kafka/server/ReplicaFetcherTierStateMachine.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ReplicaFetcherTierStateMachine.class);

    private LeaderEndPoint leader;
    private ReplicaManager replicaMgr;

```

### FieldMayBeFinal
Field `last` may be 'final'
in `shell/src/main/java/org/apache/kafka/shell/InteractiveShell.java`
#### Snippet
```java
    public class HistoryIterator implements  Iterator<Entry<Integer, String>> {
        private int index;
        private int last;

        HistoryIterator(int index, int last) {
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/MetricName.java`
#### Snippet
```java
    private final String group;
    private final String description;
    private Map<String, String> tags;
    private int hash = 0;

```

### FieldMayBeFinal
Field `tags` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/MetricNameTemplate.java`
#### Snippet
```java
    private final String group;
    private final String description;
    private LinkedHashSet<String> tags;

    /**
```

### FieldMayBeFinal
Field `convertedRecordsIterator` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/record/LazyDownConversionRecordsSend.java`
#### Snippet
```java
    private RecordConversionStats recordConversionStats;
    private RecordsSend convertedRecordsWriter;
    private Iterator<ConvertedRecords<?>> convertedRecordsIterator;

    public LazyDownConversionRecordsSend(LazyDownConversionRecords records) {
```

### FieldMayBeFinal
Field `recordConversionStats` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/record/LazyDownConversionRecordsSend.java`
#### Snippet
```java
    static final int MIN_OVERFLOW_MESSAGE_LENGTH = Records.LOG_OVERHEAD;

    private RecordConversionStats recordConversionStats;
    private RecordsSend convertedRecordsWriter;
    private Iterator<ConvertedRecords<?>> convertedRecordsIterator;
```

### FieldMayBeFinal
Field `metricName` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/metrics/KafkaMetric.java`
#### Snippet
```java
public final class KafkaMetric implements Metric {

    private MetricName metricName;
    private final Object lock;
    private final Time time;
```

### FieldMayBeFinal
Field `deleteHorizonMs` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
    private float actualCompressionRatio = 1;
    private long maxTimestamp = RecordBatch.NO_TIMESTAMP;
    private long deleteHorizonMs;
    private long offsetOfMaxTimestamp = -1;
    private Long lastOffset = null;
```

### FieldMayBeFinal
Field `initialValue` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/metrics/stats/SampledStat.java`
#### Snippet
```java
public abstract class SampledStat implements MeasurableStat {

    private double initialValue;
    private int current = 0;
    protected List<Sample> samples;
```

### FieldMayBeFinal
Field `mode` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/network/SslChannelBuilder.java`
#### Snippet
```java
    private final boolean isInterBrokerListener;
    private SslFactory sslFactory;
    private Mode mode;
    private Map<String, ?> configs;
    private SslPrincipalMapper sslPrincipalMapper;
```

### FieldMayBeFinal
Field `connectionsMaxReauthMsByMechanism` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/network/SaslChannelBuilder.java`
#### Snippet
```java
    private KerberosShortNamer kerberosShortNamer;
    private Map<String, AuthenticateCallbackHandler> saslCallbackHandlers;
    private Map<String, Long> connectionsMaxReauthMsByMechanism;
    private final Time time;
    private final LogContext logContext;
```

### FieldMayBeFinal
Field `saslCallbackHandlers` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/network/SaslChannelBuilder.java`
#### Snippet
```java

    private KerberosShortNamer kerberosShortNamer;
    private Map<String, AuthenticateCallbackHandler> saslCallbackHandlers;
    private Map<String, Long> connectionsMaxReauthMsByMechanism;
    private final Time time;
```

### FieldMayBeFinal
Field `codeToError` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/protocol/Errors.java`
#### Snippet
```java

    private static Map<Class<?>, Errors> classToError = new HashMap<>();
    private static Map<Short, Errors> codeToError = new HashMap<>();

    static {
```

### FieldMayBeFinal
Field `classToError` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/protocol/Errors.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(Errors.class);

    private static Map<Class<?>, Errors> classToError = new HashMap<>();
    private static Map<Short, Errors> codeToError = new HashMap<>();

```

### FieldMayBeFinal
Field `data` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/requests/DeleteTopicsRequest.java`
#### Snippet
```java
    }

    private DeleteTopicsRequestData data;

    private DeleteTopicsRequest(DeleteTopicsRequestData data, short version) {
```

### FieldMayBeFinal
Field `data` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/requests/DeleteTopicsRequest.java`
#### Snippet
```java

    public static class Builder extends AbstractRequest.Builder<DeleteTopicsRequest> {
        private DeleteTopicsRequestData data;

        public Builder(DeleteTopicsRequestData data) {
```

### FieldMayBeFinal
Field `data` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/requests/DeleteRecordsRequest.java`
#### Snippet
```java

    public static class Builder extends AbstractRequest.Builder<DeleteRecordsRequest> {
        private DeleteRecordsRequestData data;

        public Builder(DeleteRecordsRequestData data) {
```

### FieldMayBeFinal
Field `data` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/requests/ListPartitionReassignmentsRequest.java`
#### Snippet
```java
    }

    private ListPartitionReassignmentsRequestData data;

    private ListPartitionReassignmentsRequest(ListPartitionReassignmentsRequestData data, short version) {
```

### FieldMayBeFinal
Field `hmac` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/token/delegation/DelegationToken.java`
#### Snippet
```java
public class DelegationToken {
    private TokenInformation tokenInformation;
    private byte[] hmac;

    public DelegationToken(TokenInformation tokenInformation, byte[] hmac) {
```

### FieldMayBeFinal
Field `tokenInformation` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/token/delegation/DelegationToken.java`
#### Snippet
```java
@InterfaceStability.Evolving
public class DelegationToken {
    private TokenInformation tokenInformation;
    private byte[] hmac;

```

### FieldMayBeFinal
Field `tokenIdHmacCache` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/token/delegation/internals/DelegationTokenCache.java`
#### Snippet
```java

    //Cache to hold tokenId->hmac mapping. This is required for removing entry from hmacTokenIdCache using tokenId.
    private Map<String, String> tokenIdHmacCache = new ConcurrentHashMap<>();

    public DelegationTokenCache(Collection<String> scramMechanisms) {
```

### FieldMayBeFinal
Field `hmacTokenIdCache` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/token/delegation/internals/DelegationTokenCache.java`
#### Snippet
```java

    //Cache to hold hmac->tokenId mapping. This is required for renew, expire requests
    private Map<String, String> hmacTokenIdCache = new ConcurrentHashMap<>();

    //Cache to hold tokenId->hmac mapping. This is required for removing entry from hmacTokenIdCache using tokenId.
```

### FieldMayBeFinal
Field `credentialCache` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/token/delegation/internals/DelegationTokenCache.java`
#### Snippet
```java
public class DelegationTokenCache {

    private CredentialCache credentialCache = new CredentialCache();

    //Cache to hold all the tokens
```

### FieldMayBeFinal
Field `tokenCache` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/token/delegation/internals/DelegationTokenCache.java`
#### Snippet
```java

    //Cache to hold all the tokens
    private Map<String, TokenInformation> tokenCache = new ConcurrentHashMap<>();

    //Cache to hold hmac->tokenId mapping. This is required for renew, expire requests
```

### FieldMayBeFinal
Field `saslExtensions` may be 'final'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerClientInitialResponse.java`
#### Snippet
```java
    private final String tokenValue;
    private final String authorizationId;
    private SaslExtensions saslExtensions;

    public static final Pattern EXTENSION_KEY_PATTERN = Pattern.compile(KEY);
```

### FieldMayBeFinal
Field `reconnectBackoff` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/ClusterConnectionStates.java`
#### Snippet
```java
    private final HostResolver hostResolver;
    private Set<String> connectingNodes;
    private ExponentialBackoff reconnectBackoff;
    private ExponentialBackoff connectionSetupTimeout;

```

### FieldMayBeFinal
Field `connectingNodes` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/ClusterConnectionStates.java`
#### Snippet
```java
    private final Logger log;
    private final HostResolver hostResolver;
    private Set<String> connectingNodes;
    private ExponentialBackoff reconnectBackoff;
    private ExponentialBackoff connectionSetupTimeout;
```

### FieldMayBeFinal
Field `connectionSetupTimeout` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/ClusterConnectionStates.java`
#### Snippet
```java
    private Set<String> connectingNodes;
    private ExponentialBackoff reconnectBackoff;
    private ExponentialBackoff connectionSetupTimeout;

    public ClusterConnectionStates(long reconnectBackoffMs, long reconnectBackoffMaxMs,
```

### FieldMayBeFinal
Field `topicNames` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/FetchSessionHandler.java`
#### Snippet
```java
         */
        private LinkedHashMap<TopicPartition, PartitionData> next;
        private Map<Uuid, String> topicNames;
        private final boolean copySessionPartitions;
        private int partitionsWithoutTopicIds = 0;
```

### FieldMayBeFinal
Field `members` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/admin/RemoveMembersFromConsumerGroupOptions.java`
#### Snippet
```java
public class RemoveMembersFromConsumerGroupOptions extends AbstractOptions<RemoveMembersFromConsumerGroupOptions> {

    private Set<MemberToRemove> members;
    private String reason;

```

### FieldMayBeFinal
Field `offset` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/admin/RecordsToDelete.java`
#### Snippet
```java
public class RecordsToDelete {

    private long offset;

    private RecordsToDelete(long offset) {
```

### FieldMayBeFinal
Field `newAssignments` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewPartitions.java`
#### Snippet
```java
    private int totalCount;

    private List<List<Integer>> newAssignments;

    private NewPartitions(int totalCount, List<List<Integer>> newAssignments) {
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewPartitions.java`
#### Snippet
```java
public class NewPartitions {

    private int totalCount;

    private List<List<Integer>> newAssignments;
```

### FieldMayBeFinal
Field `iters` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerRecords.java`
#### Snippet
```java
        public Iterator<ConsumerRecord<K, V>> iterator() {
            return new AbstractIterator<ConsumerRecord<K, V>>() {
                Iterator<? extends Iterable<ConsumerRecord<K, V>>> iters = iterables.iterator();
                Iterator<ConsumerRecord<K, V>> current;

```

### FieldMayBeFinal
Field `partitions` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java

    final class Assignment {
        private List<TopicPartition> partitions;
        private ByteBuffer userData;

```

### FieldMayBeFinal
Field `userData` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/ConsumerPartitionAssignor.java`
#### Snippet
```java
    final class Assignment {
        private List<TopicPartition> partitions;
        private ByteBuffer userData;

        public Assignment(List<TopicPartition> partitions, ByteBuffer userData) {
```

### FieldMayBeFinal
Field `map` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/Utils.java`
#### Snippet
```java
    final static class PartitionComparator implements Comparator<TopicPartition>, Serializable {
        private static final long serialVersionUID = 1L;
        private Map<String, List<String>> map;

        PartitionComparator(Map<String, List<String>> map) {
```

### FieldMayBeFinal
Field `wakeup` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/MockConsumer.java`
#### Snippet
```java
    private KafkaException pollException;
    private KafkaException offsetsException;
    private AtomicBoolean wakeup;
    private Duration lastPollTimeout;
    private boolean closed;
```

### FieldMayBeFinal
Field `records` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/MockConsumer.java`
#### Snippet
```java
    private final Set<TopicPartition> paused;

    private Map<TopicPartition, List<ConsumerRecord<K, V>>> records;
    private KafkaException pollException;
    private KafkaException offsetsException;
```

### FieldMayBeFinal
Field `node` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/NetworkClientDelegate.java`
#### Snippet
```java
        private final AbstractRequest.Builder<?> requestBuilder;
        private final FutureCompletionHandler handler;
        private Optional<Node> node; // empty if random node can be chosen
        private Timer timer;

```

### FieldMayBeFinal
Field `autoComplete` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/producer/MockProducer.java`
#### Snippet
```java
    private final Serializer<K> keySerializer;
    private final Serializer<V> valueSerializer;
    private boolean autoComplete;
    private boolean closed;
    private boolean transactionInitialized;
```

### FieldMayBeFinal
Field `key` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/ErrorLoggingCallback.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ErrorLoggingCallback.class);
    private String topic;
    private byte[] key;
    private byte[] value;
    private int valueLength;
```

### FieldMayBeFinal
Field `topic` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/ErrorLoggingCallback.java`
#### Snippet
```java
public class ErrorLoggingCallback implements Callback {
    private static final Logger log = LoggerFactory.getLogger(ErrorLoggingCallback.class);
    private String topic;
    private byte[] key;
    private byte[] value;
```

### FieldMayBeFinal
Field `valueLength` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/ErrorLoggingCallback.java`
#### Snippet
```java
    private byte[] key;
    private byte[] value;
    private int valueLength;
    private boolean logAsString;

```

### FieldMayBeFinal
Field `logAsString` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/ErrorLoggingCallback.java`
#### Snippet
```java
    private byte[] value;
    private int valueLength;
    private boolean logAsString;

    public ErrorLoggingCallback(String topic, byte[] key, byte[] value, boolean logAsString) {
```

### FieldMayBeFinal
Field `asyncCommitFenced` may be 'final'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
    private MetadataSnapshot assignmentSnapshot;
    private Timer nextAutoCommitTimer;
    private AtomicBoolean asyncCommitFenced;
    private ConsumerGroupMetadata groupMetadata;
    private final boolean throwOnFetchStableOffsetsUnsupported;
```

### FieldMayBeFinal
Field `promotable` may be 'final'
in `connect/api/src/main/java/org/apache/kafka/connect/data/SchemaProjector.java`
#### Snippet
```java
public class SchemaProjector {

    private static Set<AbstractMap.SimpleImmutableEntry<Type, Type>> promotable = new HashSet<>();

    static {
```

### FieldMayBeFinal
Field `noAclAuthorizer` may be 'final'
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConnector.java`
#### Snippet
```java
    private Admin offsetSyncsAdminClient;
    private volatile boolean useIncrementalAlterConfigs;
    private AtomicBoolean noAclAuthorizer = new AtomicBoolean(false);

    public MirrorSourceConnector() {
```

### FieldMayBeFinal
Field `crypto` may be 'final'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedConfig.java`
#### Snippet
```java
        + "The algorithm(s) '" + INTER_WORKER_VERIFICATION_ALGORITHMS_DEFAULT + "' will be used as a default on JVMs that provide them; "
        + "on other JVMs, no default is used and a value for this property must be manually specified in the worker config.";
    private Crypto crypto;

    public enum ExactlyOnceSourceSupport {
```

### FieldMayBeFinal
Field `moveSchemaCache` may be 'final'
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/HeaderFrom.java`
#### Snippet
```java
    private Operation operation;

    private Cache<Schema, Schema> moveSchemaCache = new SynchronizedCache<>(new LRUCache<>(16));

    @Override
```

### FieldMayBeFinal
Field `credentialPropertiesMap` may be 'final'
in `connect/basic-auth-extension/src/main/java/org/apache/kafka/connect/rest/basic/auth/extension/PropertyFileLoginModule.java`
#### Snippet
```java
    private boolean authenticated;

    private static Map<String, Properties> credentialPropertiesMap = new ConcurrentHashMap<>();

    @Override
```

### FieldMayBeFinal
Field `password` may be 'final'
in `connect/basic-auth-extension/src/main/java/org/apache/kafka/connect/rest/basic/auth/extension/JaasBasicAuthFilter.java`
#### Snippet
```java

        private String username;
        private String password;

        public BasicAuthCallBackHandler(BasicAuthCredentials credentials) {
```

### FieldMayBeFinal
Field `username` may be 'final'
in `connect/basic-auth-extension/src/main/java/org/apache/kafka/connect/rest/basic/auth/extension/JaasBasicAuthFilter.java`
#### Snippet
```java
    public static class BasicAuthCallBackHandler implements CallbackHandler {

        private String username;
        private String password;

```

### FieldMayBeFinal
Field `transactionVerificationEnabled` may be 'final'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateManagerConfig.java`
#### Snippet
```java

    private volatile int producerIdExpirationMs;
    private boolean transactionVerificationEnabled;

    public ProducerStateManagerConfig(int producerIdExpirationMs, boolean transactionVerificationEnabled) {
```

### FieldMayBeFinal
Field `position` may be 'final'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MemoryLRUCache.java`
#### Snippet
```java

    protected StateStoreContext context;
    private Position position = Position.emptyPosition();

    public interface EldestEntryRemovalListener {
```

### FieldMayBeFinal
Field `logPrefix` may be 'final'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorStateManager.java`
#### Snippet
```java

    private Logger log;
    private String logPrefix;

    private final TaskId taskId;
```

### FieldMayBeFinal
Field `nowMs` may be 'final'
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/UptimeResponse.java`
#### Snippet
```java

    private long serverStartMs;
    private long nowMs;

    @JsonCreator
```

### FieldMayBeFinal
Field `serverStartMs` may be 'final'
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/UptimeResponse.java`
#### Snippet
```java
public class UptimeResponse extends Message {

    private long serverStartMs;
    private long nowMs;

```

### FieldMayBeFinal
Field `enableTransactions` may be 'final'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchWorker.java`
#### Snippet
```java
        private Future<RecordMetadata> sendFuture;
        private AtomicLong transactionsCommitted;
        private boolean enableTransactions;

        SendRecords(HashSet<TopicPartition> activePartitions) {
```

### FieldMayBeFinal
Field `transactionsCommitted` may be 'final'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchWorker.java`
#### Snippet
```java
        private Iterator<TopicPartition> partitionsIterator;
        private Future<RecordMetadata> sendFuture;
        private AtomicLong transactionsCommitted;
        private boolean enableTransactions;

```

### FieldMayBeFinal
Field `shutdown` may be 'final'
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/TaskManager.java`
#### Snippet
```java
     * True if the TaskManager is shut down.
     */
    private AtomicBoolean shutdown = new AtomicBoolean(false);

    /**
```

### FieldMayBeFinal
Field `quorumFeatures` may be 'final'
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationDriver.java`
#### Snippet
```java
    private volatile ZkMigrationLeadershipState migrationLeadershipState;
    private volatile MetadataImage image;
    private volatile QuorumFeatures quorumFeatures;
    private volatile boolean firstPublish;

```

### FieldMayBeFinal
Field `metaLogListener` may be 'final'
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
     * was not from a previous registration.
     */
    private QuorumMetaLogListener metaLogListener;

    /**
```

### FieldMayBeFinal
Field `aclsToAdd` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/acl/StandardAuthorizerUpdateBenchmark.java`
#### Snippet
```java
    private final Set<Uuid> ids = new HashSet<>();

    private List<StandardAclWithId> aclsToAdd = prepareAcls();

    int index = 0;
```

### FieldMayBeFinal
Field `compressionType` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/CompressedRecordBatchValidationBenchmark.java`
#### Snippet
```java

    @Param(value = {"LZ4", "SNAPPY", "GZIP", "ZSTD"})
    private CompressionType compressionType = CompressionType.LZ4;

    @Override
```

### FieldMayBeFinal
Field `maxBatchSize` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"1", "2", "10", "50", "200", "500"})
    private int maxBatchSize = 200;

    @Param(value = {"1", "2"})
```

### FieldMayBeFinal
Field `messageSize` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"100", "1000", "10000", "100000"})
    private int messageSize = 1000;

    @Param(value = {"RANDOM", "ONES"})
```

### FieldMayBeFinal
Field `bytes` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"RANDOM", "ONES"})
    private Bytes bytes = Bytes.RANDOM;

    @Param(value = {"NO_CACHING", "CREATE"})
```

### FieldMayBeFinal
Field `bufferSupplierStr` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"NO_CACHING", "CREATE"})
    private String bufferSupplierStr = "NO_CACHING";

    // zero starting offset is much faster for v1 batches, but that will almost never happen
```

### FieldMayBeFinal
Field `compressionType` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/RecordBatchIterationBenchmark.java`
#### Snippet
```java

    @Param(value = {"LZ4", "SNAPPY", "GZIP", "ZSTD", "NONE"})
    private CompressionType compressionType = CompressionType.NONE;

    @Override
```

### FieldMayBeFinal
Field `aclToUpdate` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/acl/AuthorizerBenchmark.java`
#### Snippet
```java
    private String authorizeByResourceTypeHostName = "127.0.0.2";

    private HashMap<ResourcePattern, AclAuthorizer.VersionedAcls> aclToUpdate = new HashMap<>();

    Random rand = new Random(System.currentTimeMillis());
```

### FieldMayBeFinal
Field `supplier` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/acl/AuthorizerBenchmark.java`
#### Snippet
```java
        KRAFT(StandardAuthorizer::new);

        private Supplier<Authorizer> supplier;

        AuthorizerType(Supplier<Authorizer> supplier) {
```

### FieldMayBeFinal
Field `authorizeByResourceTypeHostName` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/acl/AuthorizerBenchmark.java`
#### Snippet
```java
    private RequestContext authorizeContext;
    private RequestContext authorizeByResourceTypeContext;
    private String authorizeByResourceTypeHostName = "127.0.0.2";

    private HashMap<ResourcePattern, AclAuthorizer.VersionedAcls> aclToUpdate = new HashMap<>();
```

### FieldMayBeFinal
Field `controllerMutationQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
```

### FieldMayBeFinal
Field `clientRequestQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
        MetadataVersion.latest(), BrokerFeatures.createEmpty(), null);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
```

### FieldMayBeFinal
Field `kafkaController` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
```

### FieldMayBeFinal
Field `metadataCache` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ZkMetadataCache metadataCache = MetadataCache.zkMetadataCache(brokerId,
        MetadataVersion.latest(), BrokerFeatures.createEmpty(), null);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
```

### FieldMayBeFinal
Field `kafkaZkClient` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
```

### FieldMayBeFinal
Field `logDir` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
    private TopicPartition topicPartition = new TopicPartition(UUID.randomUUID().toString(), 0);
    private Option<Uuid> topicId = OptionConverters.toScala(Optional.of(Uuid.randomUuid()));
    private File logDir = new File(System.getProperty("java.io.tmpdir"), topicPartition.toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
```

### FieldMayBeFinal
Field `groupCoordinator` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
```

### FieldMayBeFinal
Field `topicPartition` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class UpdateFollowerFetchStateBenchmark {
    private TopicPartition topicPartition = new TopicPartition(UUID.randomUUID().toString(), 0);
    private Option<Uuid> topicId = OptionConverters.toScala(Optional.of(Uuid.randomUuid()));
    private File logDir = new File(System.getProperty("java.io.tmpdir"), topicPartition.toString());
```

### FieldMayBeFinal
Field `fetchManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
        clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
        replicaQuotaManager, replicaQuotaManager, Option.empty());
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
```

### FieldMayBeFinal
Field `logDirFailureChannel` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private LogDirFailureChannel logDirFailureChannel = Mockito.mock(LogDirFailureChannel.class);
    private long nextOffset = 0;
    private LogManager logManager;
```

### FieldMayBeFinal
Field `metrics` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ZkMetadataCache metadataCache = MetadataCache.zkMetadataCache(brokerId,
```

### FieldMayBeFinal
Field `brokerTopicStats` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
    private File logDir = new File(System.getProperty("java.io.tmpdir"), topicPartition.toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private LogDirFailureChannel logDirFailureChannel = Mockito.mock(LogDirFailureChannel.class);
    private long nextOffset = 0;
```

### FieldMayBeFinal
Field `transactionCoordinator` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
```

### FieldMayBeFinal
Field `topicId` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
public class UpdateFollowerFetchStateBenchmark {
    private TopicPartition topicPartition = new TopicPartition(UUID.randomUUID().toString(), 0);
    private Option<Uuid> topicId = OptionConverters.toScala(Optional.of(Uuid.randomUuid()));
    private File logDir = new File(System.getProperty("java.io.tmpdir"), topicPartition.toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
```

### FieldMayBeFinal
Field `brokerTopicStats` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
        replicaQuotaManager, replicaQuotaManager, Option.empty());
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
    private KafkaApis kafkaApis;
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
    private Option<Uuid> topicId = OptionConverters.toScala(Optional.of(Uuid.randomUuid()));
    private File logDir = new File(System.getProperty("java.io.tmpdir"), topicPartition.toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private LogDirFailureChannel logDirFailureChannel = Mockito.mock(LogDirFailureChannel.class);
```

### FieldMayBeFinal
Field `requestChannelMetrics` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java

    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
```

### FieldMayBeFinal
Field `autoTopicCreationManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
    private Metrics metrics = new Metrics();
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
    private LogManager logManager;
    private File logDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Pool<TopicPartition, Partition> pool = new Pool<TopicPartition, Partition>(Option.empty());
    private Metrics metrics = new Metrics();
```

### FieldMayBeFinal
Field `logDir` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
    private ReplicaFetcherBenchThread fetcher;
    private LogManager logManager;
    private File logDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Pool<TopicPartition, Partition> pool = new Pool<TopicPartition, Partition>(Option.empty());
```

### FieldMayBeFinal
Field `topicId` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
    private ReplicaManager replicaManager;
    private ReplicaQuota replicaQuota;
    private Option<Uuid> topicId = Option.apply(Uuid.randomUuid());

    @Setup(Level.Trial)
```

### FieldMayBeFinal
Field `quotaManagers` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
        clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
        replicaQuotaManager, replicaQuotaManager, Option.empty());
```

### FieldMayBeFinal
Field `metrics` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Pool<TopicPartition, Partition> pool = new Pool<TopicPartition, Partition>(Option.empty());
    private Metrics metrics = new Metrics();
    private ReplicaManager replicaManager;
    private ReplicaQuota replicaQuota;
```

### FieldMayBeFinal
Field `clientQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ZkMetadataCache metadataCache = MetadataCache.zkMetadataCache(brokerId,
        MetadataVersion.latest(), BrokerFeatures.createEmpty(), null);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
```

### FieldMayBeFinal
Field `pool` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
    private File logDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Pool<TopicPartition, Partition> pool = new Pool<TopicPartition, Partition>(Option.empty());
    private Metrics metrics = new Metrics();
    private ReplicaManager replicaManager;
```

### FieldMayBeFinal
Field `adminManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
```

### FieldMayBeFinal
Field `requestChannel` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private int partitionCount;

    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
```

### FieldMayBeFinal
Field `principal` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
    private KafkaApis kafkaApis;
    private RequestChannel.Request allTopicMetadataRequest;
```

### FieldMayBeFinal
Field `replicaQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
        clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
```

### FieldMayBeFinal
Field `replicaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
```

### FieldMayBeFinal
Field `brokerId` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ZkMetadataCache metadataCache = MetadataCache.zkMetadataCache(brokerId,
        MetadataVersion.latest(), BrokerFeatures.createEmpty(), null);
```

### FieldMayBeFinal
Field `offsetCheckpoints` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private Partition partition;
    private List<Integer> replicas = Arrays.asList(0, 1, 2);
    private OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
    private DelayedOperations delayedOperations  = Mockito.mock(DelayedOperations.class);
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
```

### FieldMayBeFinal
Field `delayedOperations` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private List<Integer> replicas = Arrays.asList(0, 1, 2);
    private OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
    private DelayedOperations delayedOperations  = Mockito.mock(DelayedOperations.class);
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private Option<Uuid> topicId;
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private LogManager logManager;
    private File logDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Partition partition;
    private List<Integer> replicas = Arrays.asList(0, 1, 2);
```

### FieldMayBeFinal
Field `executorService` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
    private DelayedOperations delayedOperations  = Mockito.mock(DelayedOperations.class);
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private Option<Uuid> topicId;

```

### FieldMayBeFinal
Field `replicas` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Partition partition;
    private List<Integer> replicas = Arrays.asList(0, 1, 2);
    private OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
    private DelayedOperations delayedOperations  = Mockito.mock(DelayedOperations.class);
```

### FieldMayBeFinal
Field `logDir` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
public class PartitionMakeFollowerBenchmark {
    private LogManager logManager;
    private File logDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
    private KafkaScheduler scheduler = new KafkaScheduler(1, true, "scheduler");
    private Partition partition;
```

### FieldMayBeFinal
Field `brokerTopicStats` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
            replicaQuotaManager, replicaQuotaManager, Option.empty());
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
    private KafkaApis kafkaApis;
```

### FieldMayBeFinal
Field `groupCoordinator` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
```

### FieldMayBeFinal
Field `quotaManagers` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
            clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
            replicaQuotaManager, replicaQuotaManager, Option.empty());
```

### FieldMayBeFinal
Field `replicaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
```

### FieldMayBeFinal
Field `requestChannelMetrics` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java

    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
```

### FieldMayBeFinal
Field `metadataCache` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private int brokerId = 1;
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
```

### FieldMayBeFinal
Field `forwardingManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
```

### FieldMayBeFinal
Field `principal` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
    private KafkaApis kafkaApis;
    private RequestChannel.Request allTopicMetadataRequest;
```

### FieldMayBeFinal
Field `metrics` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
```

### FieldMayBeFinal
Field `fetchManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
            clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
            replicaQuotaManager, replicaQuotaManager, Option.empty());
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
```

### FieldMayBeFinal
Field `controllerMutationQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
```

### FieldMayBeFinal
Field `clientRequestQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
```

### FieldMayBeFinal
Field `transactionCoordinator` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private Metrics metrics = new Metrics();
```

### FieldMayBeFinal
Field `brokerId` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
```

### FieldMayBeFinal
Field `requestChannel` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private int partitionCount;

    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
```

### FieldMayBeFinal
Field `replicaQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
            clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
```

### FieldMayBeFinal
Field `autoTopicCreationManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
```

### FieldMayBeFinal
Field `clientQuotaManager` may be 'final'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
```

### FieldMayBeFinal
Field `topicsImage` may be 'final'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/GroupMetadataManager.java`
#### Snippet
```java
     * The topics metadata (or image).
     */
    private TopicsImage topicsImage;

    private GroupMetadataManager(
```

### FieldMayBeFinal
Field `newMemberAdded` may be 'final'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/generic/GenericGroup.java`
#### Snippet
```java
     * to further delay initial joins (new group).
     */
    private boolean newMemberAdded = false;

    public GenericGroup(
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'sun.misc.Signal'
in `clients/src/main/java/org/apache/kafka/common/utils/LoggingSignalHandler.java`
#### Snippet
```java

            private void handle(Object signalHandler, Object signal) throws ReflectiveOperationException {
                signalHandlerHandleMethod.invoke(signalHandler, signal);
            }

```

### JavaReflectionInvocation
Argument is not assignable to 'sun.misc.Signal'
in `clients/src/main/java/org/apache/kafka/common/utils/LoggingSignalHandler.java`
#### Snippet
```java
        Object signal = signalConstructor.newInstance(signalName);
        Object signalHandler = createSignalHandler(jvmSignalHandlers);
        Object oldHandler = signalHandleMethod.invoke(null, signal, signalHandler);
        if (oldHandler != null)
            jvmSignalHandlers.put(signalName, oldHandler);
```

### JavaReflectionInvocation
Argument is not assignable to 'sun.misc.SignalHandler'
in `clients/src/main/java/org/apache/kafka/common/utils/LoggingSignalHandler.java`
#### Snippet
```java
        Object signal = signalConstructor.newInstance(signalName);
        Object signalHandler = createSignalHandler(jvmSignalHandlers);
        Object oldHandler = signalHandleMethod.invoke(null, signal, signalHandler);
        if (oldHandler != null)
            jvmSignalHandlers.put(signalName, oldHandler);
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/PrototypeAsyncConsumer.java`
#### Snippet
```java
        } catch (final ExecutionException e) {
            throw new KafkaException(e);
        } catch (final Exception e) {
            throw e;
        }
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/PrototypeAsyncConsumer.java`
#### Snippet
```java
            // Execution exception is thrown here
            throw new KafkaException(e);
        } catch (Exception e) {
            throw e;
        }
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConfigurableProducerWorker.java`
#### Snippet
```java
                        sentMessages++;
                    }
                } catch (Exception e) {
                    throw e;
                } finally {
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `obj`
in `clients/src/main/java/org/apache/kafka/common/utils/SystemTime.java`
#### Snippet
```java
    @Override
    public void waitObject(Object obj, Supplier<Boolean> condition, long deadlineMs) throws InterruptedException {
        synchronized (obj) {
            while (true) {
                if (condition.get())
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `compressionRatioForTopic`
in `clients/src/main/java/org/apache/kafka/common/record/CompressionRatioEstimator.java`
#### Snippet
```java
        float[] compressionRatioForTopic = getAndCreateEstimationIfAbsent(topic);
        float currentEstimation = compressionRatioForTopic[type.id];
        synchronized (compressionRatioForTopic) {
            if (observedRatio > currentEstimation)
                compressionRatioForTopic[type.id] = Math.max(currentEstimation + COMPRESSION_RATIO_DETERIORATE_STEP, observedRatio);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `compressionRatioForTopic`
in `clients/src/main/java/org/apache/kafka/common/record/CompressionRatioEstimator.java`
#### Snippet
```java
    public static void setEstimation(String topic, CompressionType type, float ratio) {
        float[] compressionRatioForTopic = getAndCreateEstimationIfAbsent(topic);
        synchronized (compressionRatioForTopic) {
            compressionRatioForTopic[type.id] = ratio;
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `compressionRatioForTopic`
in `clients/src/main/java/org/apache/kafka/common/record/CompressionRatioEstimator.java`
#### Snippet
```java
    public static void resetEstimation(String topic) {
        float[] compressionRatioForTopic = getAndCreateEstimationIfAbsent(topic);
        synchronized (compressionRatioForTopic) {
            for (CompressionType type : CompressionType.values()) {
                compressionRatioForTopic[type.id] = type.rate;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `sensor`
in `clients/src/main/java/org/apache/kafka/common/metrics/Metrics.java`
#### Snippet
```java
        if (sensor != null) {
            List<Sensor> childSensors = null;
            synchronized (sensor) {
                synchronized (this) {
                    if (sensors.remove(name, sensor)) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `principals`
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientAuthenticator.java`
#### Snippet
```java
    public static String firstPrincipal(Subject subject) {
        Set<Principal> principals = subject.getPrincipals();
        synchronized (principals) {
            Iterator<Principal> iterator = principals.iterator();
            if (iterator.hasNext())
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
            Deque<ProducerBatch> dq = getDeque(batch.topicPartition);
            boolean aborted = false;
            synchronized (dq) {
                if ((transactionManager != null && !batch.hasSequence()) || (transactionManager == null && !batch.isClosed())) {
                    aborted = true;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deque`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java

            final ProducerBatch batch;
            synchronized (deque) {
                // invariant: !isMuted(tp,now) && deque != null
                ProducerBatch first = deque.peekFirst();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deque`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
        for (TopicInfo topicInfo : topicInfoMap.values()) {
            for (Deque<ProducerBatch> deque : topicInfo.batches.values()) {
                synchronized (deque) {
                    if (!deque.isEmpty())
                        return true;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
                // check if we have an in-progress batch
                Deque<ProducerBatch> dq = topicInfo.batches.computeIfAbsent(effectivePartition, k -> new ArrayDeque<>());
                synchronized (dq) {
                    // After taking the lock, validate that the partition hasn't changed and retry.
                    if (partitionChanged(topic, topicInfo, partitionInfo, dq, nowMs, cluster))
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
                }

                synchronized (dq) {
                    // After taking the lock, validate that the partition hasn't changed and retry.
                    if (partitionChanged(topic, topicInfo, partitionInfo, dq, nowMs, cluster))
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `partitionDequeue`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
            incomplete.add(batch);
            // We treat the newly split batches as if they are not even tried.
            synchronized (partitionDequeue) {
                if (transactionManager != null) {
                    // We should track the newly created batches since they already have assigned sequences.
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deque`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
            for (Deque<ProducerBatch> deque : topicInfo.batches.values()) {
                // expire the batches in the order of sending
                synchronized (deque) {
                    while (!deque.isEmpty()) {
                        ProducerBatch batch = deque.getFirst();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deque`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
            // attempting to append() to a partition/batch.

            synchronized (deque) {
                // Deques are often empty in this path, esp with large partition counts,
                // so we exit early if we can.
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deque`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
        batch.reenqueued(now);
        Deque<ProducerBatch> deque = getOrCreateDeque(batch.topicPartition);
        synchronized (deque) {
            if (transactionManager != null)
                insertInSequenceOrder(deque, batch);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `dq`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
        for (ProducerBatch batch : incomplete.copyAll()) {
            Deque<ProducerBatch> dq = getDeque(batch.topicPartition);
            synchronized (dq) {
                batch.abortRecordAppends();
                dq.remove(batch);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cache`
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ThreadCache.java`
#### Snippet
```java
        }

        synchronized (cache) {
            final long oldSize = cache.sizeInBytes();
            cache.flush();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cache`
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ThreadCache.java`
#### Snippet
```java
            while (sizeInBytes.get() > maxCacheSizeBytes) {
                final NamedCache cache = circularIterator.next();
                synchronized (cache) {
                    final long oldSize = cache.sizeInBytes();
                    cache.evict();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cache`
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ThreadCache.java`
#### Snippet
```java
        final NamedCache cache = getOrCreateCache(namespace);

        synchronized (cache) {
            final long oldSize = cache.sizeInBytes();
            cache.put(key, value);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cache`
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ThreadCache.java`
#### Snippet
```java
        final NamedCache cache = getOrCreateCache(namespace);
        final LRUCacheEntry result;
        synchronized (cache) {
            final long oldSize = cache.sizeInBytes();
            result = cache.putIfAbsent(key, value);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cache`
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ThreadCache.java`
#### Snippet
```java

        final LRUCacheEntry entry;
        synchronized (cache) {
            final long oldSize = cache.sizeInBytes();
            entry = cache.delete(key);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `timerTaskEntry`
in `server-common/src/main/java/org/apache/kafka/server/util/timer/TimerTaskList.java`
#### Snippet
```java

    public synchronized void remove(TimerTaskEntry timerTaskEntry) {
        synchronized (timerTaskEntry) {
            if (timerTaskEntry.list == this) {
                timerTaskEntry.next.prev = timerTaskEntry.prev;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `timerTaskEntry`
in `server-common/src/main/java/org/apache/kafka/server/util/timer/TimerTaskList.java`
#### Snippet
```java

            synchronized (this) {
                synchronized (timerTaskEntry) {
                    if (timerTaskEntry.list == null) {
                        // put the timer task entry to the end of the list. (root.prev points to the tail entry)
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `toOffset` is redundant
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
                    // Copy segments only till the last-stable-offset as remote storage should contain only committed/acked
                    // messages
                    long toOffset = lso;
                    logger.debug("Checking for segments to copy, copiedOffset: {} and toOffset: {}", copiedOffset, toOffset);
                    long activeSegBaseOffset = log.activeSegment().baseOffset();
```

### UnnecessaryLocalVariable
Local variable `unmapper` is redundant
in `clients/src/main/java/org/apache/kafka/common/utils/ByteBufferUnmapper.java`
#### Snippet
```java
                methodType(boolean.class, Object.class)).asType(methodType(boolean.class, cleanerClass));
        MethodHandle noop = dropArguments(constant(Void.class, null).asType(methodType(void.class)), 0, cleanerClass);
        MethodHandle unmapper = filterReturnValue(directBufferCleanerMethod, guardWithTest(nonNullTest, cleanMethod, noop))
                .asType(methodType(void.class, ByteBuffer.class));
        return unmapper;
```

### UnnecessaryLocalVariable
Local variable `token` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/secured/LoginAccessTokenValidator.java`
#### Snippet
```java
            issuedAtRaw != null ? issuedAtRaw.longValue() * 1000L : null);

        OAuthBearerToken token = new BasicOAuthBearerToken(accessToken,
            scopes,
            expiration,
```

### UnnecessaryLocalVariable
Local variable `token` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/secured/ValidatorAccessTokenValidator.java`
#### Snippet
```java
            issuedAtRaw != null ? issuedAtRaw.getValueInMillis() : null);

        OAuthBearerToken token = new BasicOAuthBearerToken(accessToken,
            scopes,
            expiration,
```

### UnnecessaryLocalVariable
Local variable `unmodifiableModuleOptions` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerUnsecuredValidatorCallbackHandler.java`
#### Snippet
```java
                    String.format("Must supply exactly 1 non-null JAAS mechanism configuration (size was %d)",
                            jaasConfigEntries.size()));
        final Map<String, String> unmodifiableModuleOptions = Collections
                .unmodifiableMap((Map<String, String>) jaasConfigEntries.get(0).getOptions());
        this.moduleOptions = unmodifiableModuleOptions;
```

### UnnecessaryLocalVariable
Local variable `netInBufferFromChannel` is redundant
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/SaslClientAuthenticator.java`
#### Snippet
```java
        reauthInfo.reauthenticating(apiVersionsResponseFromOriginalAuthentication,
                reauthenticationContext.reauthenticationBeginNanos());
        NetworkReceive netInBufferFromChannel = reauthenticationContext.networkReceive();
        netInBuffer = netInBufferFromChannel;
        setSaslState(SaslState.REAUTH_PROCESS_ORIG_APIVERSIONS_RESPONSE); // Will set immediately
```

### UnnecessaryLocalVariable
Local variable `l` is redundant
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerMetrics.java`
#### Snippet
```java

    private List<MetricNameTemplate> getAllTemplates() {
        List<MetricNameTemplate> l = new ArrayList<>(this.fetcherMetrics.getAllTemplates());
        return l;
    }
```

### UnnecessaryLocalVariable
Local variable `l` is redundant
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/ProducerMetrics.java`
#### Snippet
```java

    private List<MetricNameTemplate> getAllTemplates() {
        List<MetricNameTemplate> l = new ArrayList<>(this.senderMetrics.allTemplates());
        return l;
    }
```

### UnnecessaryLocalVariable
Local variable `collect` is redundant
in `connect/runtime/src/main/java/org/apache/kafka/connect/tools/PredicateDoc.java`
#### Snippet
```java
    private static final List<DocInfo> PREDICATES;
    static {
        List<DocInfo> collect = new Plugins(Collections.emptyMap()).predicates().stream()
            .map(p -> {
                try {
```

### UnnecessaryLocalVariable
Local variable `newTopicPartitions` is redundant
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConnector.java`
#### Snippet
```java
        if (!knownSourceTopicPartitionsSet.equals(sourceTopicPartitionsSet) || !missingInTarget.isEmpty()) {

            Set<TopicPartition> newTopicPartitions = sourceTopicPartitionsSet;
            newTopicPartitions.removeAll(knownSourceTopicPartitions);

```

### UnnecessaryLocalVariable
Local variable `deletedTopicPartitions` is redundant
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConnector.java`
#### Snippet
```java
            newTopicPartitions.removeAll(knownSourceTopicPartitions);

            Set<TopicPartition> deletedTopicPartitions = knownSourceTopicPartitionsSet;
            deletedTopicPartitions.removeAll(sourceTopicPartitions);

```

### UnnecessaryLocalVariable
Local variable `activeTaskAssignment` is redundant
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsPartitionAssignor.java`
#### Snippet
```java
            // Combine activeTaskStatefulAssignment and activeTaskStatelessAssignment together into
            // activeTaskStatelessAssignment
            final Map<String, List<TaskId>> activeTaskAssignment = activeTaskStatefulAssignment;
            for (final Map.Entry<String, List<TaskId>> threadEntry : activeTaskStatelessAssignment.entrySet()) {
                activeTaskAssignment.get(threadEntry.getKey()).addAll(threadEntry.getValue());
```

### UnnecessaryLocalVariable
Local variable `config` is redundant
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java`
#### Snippet
```java
                                                                                  final String name) {
        if (factory.isVersionedStore()) {
            final VersionedChangelogTopicConfig config = new VersionedChangelogTopicConfig(name, factory.logConfig(), factory.historyRetention());
            return config;
        } else if (factory.isWindowStore()) {
```

### UnnecessaryLocalVariable
Local variable `config` is redundant
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/InternalTopologyBuilder.java`
#### Snippet
```java
            return config;
        } else if (factory.isWindowStore()) {
            final WindowedChangelogTopicConfig config = new WindowedChangelogTopicConfig(name, factory.logConfig(), factory.retentionPeriod());
            return config;
        } else {
```

### UnnecessaryLocalVariable
Local variable `process` is redundant
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ExternalCommandWorker.java`
#### Snippet
```java
        }
        ProcessBuilder bld = new ProcessBuilder(spec.command());
        Process process = bld.start();
        return process;
    }
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `shell/src/main/java/org/apache/kafka/shell/glob/GlobVisitor.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(path, node);
        }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(columnWidths, entriesPerColumn);
        }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/ContextualRecord.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(value, recordContext);
    }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `metadata/src/main/java/org/apache/kafka/metadata/ScramCredentialData.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(salt, storedKey, serverKey, iterations);
    }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `metadata/src/main/java/org/apache/kafka/metadata/ScramCredentialData.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(salt, storedKey, serverKey, iterations);
    }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `metadata/src/main/java/org/apache/kafka/metadata/ScramCredentialData.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(salt, storedKey, serverKey, iterations);
    }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `metadata/src/main/java/org/apache/kafka/controller/ScramControlManager.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(salt, storedKey, serverKey, iterations);
        }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `metadata/src/main/java/org/apache/kafka/controller/ScramControlManager.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(salt, storedKey, serverKey, iterations);
        }

```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `metadata/src/main/java/org/apache/kafka/controller/ScramControlManager.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            return Objects.hash(salt, storedKey, serverKey, iterations);
        }

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `shell/src/main/java/org/apache/kafka/shell/MetadataShell.java`
#### Snippet
```java
                return;
            }
            Thread.sleep(10);
        }
        //snapshotFileReader.caughtUpFuture().get();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java`
#### Snippet
```java
                    log.info("[Principal={}]: TGT refresh sleeping until: {}", principal, until);
                    try {
                        Thread.sleep(nextRefresh - now);
                    } catch (InterruptedException ie) {
                        log.warn("[Principal={}]: TGT renewal thread has been interrupted and will exit.", principal);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java`
#### Snippet
```java
                                // sleep for 10 seconds
                                try {
                                    Thread.sleep(10 * 1000);
                                } catch (InterruptedException ie) {
                                    log.error("[Principal={}]: Interrupted while renewing TGT, exiting Login thread", principal);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java`
#### Snippet
```java
                                // sleep for 10 seconds.
                                try {
                                    Thread.sleep(10 * 1000);
                                } catch (InterruptedException e) {
                                    log.error("[Principal={}]: Interrupted during login retry after LoginException:", principal, le);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorCheckpointTask.java`
#### Snippet
```java
            long deadline = System.currentTimeMillis() + interval.toMillis();
            while (!stopping && System.currentTimeMillis() < deadline) {
                Thread.sleep(pollTimeout.toMillis());
            }
            if (stopping) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/namedtopology/KafkaStreamsNamedTopologyWrapper.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(100);
            } catch (final InterruptedException ex) {
                ex.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchWorker.java`
#### Snippet
```java
            while (!consumeTasks.stream().allMatch(Future::isDone)) {
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    log.debug("{} was interrupted. Closing...", this.getClass().getName());
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/rest/MirrorRestServer.java`
#### Snippet
```java
    @Override
    protected Collection<ConnectResource> regularResources() {
        return Arrays.asList(
                new InternalMirrorResource(herders, restClient)
        );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/ConnectRestServer.java`
#### Snippet
```java
    @Override
    protected Collection<ConnectResource> adminResources() {
        return Arrays.asList(
                new LoggingResource()
        );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java

                    return ControllerResult.of(
                        Arrays.asList(new ApiMessageAndVersion(new NoOpRecord(), (short) 0)),
                        null
                    );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server-common/src/main/java/org/apache/kafka/server/config/ServerTopicConfigSynonyms.java`
#### Snippet
```java

    private static Entry<String, List<ConfigSynonym>> singleWithLogPrefix(String topicConfigName, String brokerConfigName) {
        return Utils.mkEntry(topicConfigName, asList(new ConfigSynonym(LOG_PREFIX + brokerConfigName)));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server-common/src/main/java/org/apache/kafka/server/config/ServerTopicConfigSynonyms.java`
#### Snippet
```java

    private static Entry<String, List<ConfigSynonym>> singleWithLogCleanerPrefix(String topicConfigName, String brokerConfigName) {
        return Utils.mkEntry(topicConfigName, asList(new ConfigSynonym(LOG_CLEANER_PREFIX + brokerConfigName)));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server-common/src/main/java/org/apache/kafka/server/config/ServerTopicConfigSynonyms.java`
#### Snippet
```java

    private static Entry<String, List<ConfigSynonym>> single(String topicConfigName, String brokerConfigName) {
        return Utils.mkEntry(topicConfigName, asList(new ConfigSynonym(brokerConfigName)));
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server-common/src/main/java/org/apache/kafka/server/config/ServerTopicConfigSynonyms.java`
#### Snippet
```java

    private static Entry<String, List<ConfigSynonym>> sameNameWithLogCleanerPrefix(String configName) {
        return Utils.mkEntry(configName, asList(new ConfigSynonym(LOG_CLEANER_PREFIX + configName)));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server-common/src/main/java/org/apache/kafka/server/config/ServerTopicConfigSynonyms.java`
#### Snippet
```java

    private static Entry<String, List<ConfigSynonym>> sameNameWithLogPrefix(String configName) {
        return Utils.mkEntry(configName, asList(new ConfigSynonym(LOG_PREFIX + configName)));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server-common/src/main/java/org/apache/kafka/server/config/ServerTopicConfigSynonyms.java`
#### Snippet
```java

    private static Entry<String, List<ConfigSynonym>> sameName(String configName) {
        return Utils.mkEntry(configName, asList(new ConfigSynonym(configName)));
    }

```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashCollection.java`
#### Snippet
```java
        array.sort(comparator);
        for (E e : array) {
            add(e);
        }
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
        final Properties result = new Properties();
        for (final Map.Entry<String, Object> entry : properties.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
        Set<T> result = new HashSet<>((int) (elems.length / 0.75) + 1);
        for (T elem : elems)
            result.add(elem);
        return result;
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
        SortedSet<T> result = new TreeSet<>();
        for (T elem : elems)
            result.add(elem);
        return result;
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java`
#### Snippet
```java
        Map<String, Object> configUpdates = postProcessParsedConfig(Collections.unmodifiableMap(this.values));
        for (Map.Entry<String, Object> update : configUpdates.entrySet()) {
            this.values.put(update.getKey(), update.getValue());
        }
        definition.parse(this.values);
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `clients/src/main/java/org/apache/kafka/clients/admin/DescribeConsumerGroupsResult.java`
#### Snippet
```java
    public Map<String, KafkaFuture<ConsumerGroupDescription>> describedGroups() {
        Map<String, KafkaFuture<ConsumerGroupDescription>> describedGroups = new HashMap<>();
        futures.forEach((key, future) -> describedGroups.put(key, future));
        return describedGroups;
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `clients/src/main/java/org/apache/kafka/clients/admin/DeleteConsumerGroupsResult.java`
#### Snippet
```java
    public Map<String, KafkaFuture<Void>> deletedGroups() {
        Map<String, KafkaFuture<Void>> deletedGroups = new HashMap<>(futures.size());
        futures.forEach((key, future) -> deletedGroups.put(key, future));
        return deletedGroups;
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `clients/src/main/java/org/apache/kafka/clients/consumer/MockConsumer.java`
#### Snippet
```java
        ensureNotClosed();
        for (Map.Entry<TopicPartition, OffsetAndMetadata> entry : offsets.entrySet())
            committed.put(entry.getKey(), entry.getValue());
        if (callback != null) {
            callback.onComplete(offsets, null);
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogConfig.java`
#### Snippet
```java
    public static LogConfig fromProps(Map<?, ?> defaults, Properties overrides) {
        Properties props = new Properties();
        defaults.forEach((k, v) -> props.put(k, v));
        props.putAll(overrides);
        Set<String> overriddenKeys = overrides.keySet().stream().map(k -> (String) k).collect(Collectors.toSet());
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
        final Map<String, Object> restoreConsumerProps = originalsWithPrefix(RESTORE_CONSUMER_PREFIX);
        for (final Map.Entry<String, Object> entry: restoreConsumerProps.entrySet()) {
            baseConsumerProps.put(entry.getKey(), entry.getValue());
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
        final Map<String, Object> globalConsumerProps = originalsWithPrefix(GLOBAL_CONSUMER_PREFIX);
        for (final Map.Entry<String, Object> entry: globalConsumerProps.entrySet()) {
            baseConsumerProps.put(entry.getKey(), entry.getValue());
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
        final Map<String, Object> mainConsumerProps = originalsWithPrefix(MAIN_CONSUMER_PREFIX);
        for (final Map.Entry<String, Object> entry: mainConsumerProps.entrySet()) {
            consumerProps.put(entry.getKey(), entry.getValue());
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `trogdor/src/main/java/org/apache/kafka/trogdor/fault/NetworkPartitionFaultWorker.java`
#### Snippet
```java
            if (!partitionSet.contains(curNode.name())) {
                for (String nodeName : partitionSet) {
                    toBlock.add(nodeName);
                }
            }
```

## RuleId[id=AssignmentToCatchBlockParameter]
### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `t`
in `server-common/src/main/java/org/apache/kafka/server/util/FutureUtils.java`
#### Snippet
```java
            if (t instanceof ExecutionException) {
                ExecutionException executionException = (ExecutionException) t;
                t = executionException.getCause();
            }
            log.error("{}Received a fatal error while waiting for {}", prefix, action, t);
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `clients/src/main/java/org/apache/kafka/common/security/plain/internals/PlainSaslServer.java`
#### Snippet
```java

            if (!PLAIN_MECHANISM.equals(mechanism))
                throw new SaslException(String.format("Mechanism \'%s\' is not supported. Only PLAIN is supported.", mechanism));

            return new PlainSaslServer(cbh);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `clients/src/main/java/org/apache/kafka/common/security/plain/internals/PlainSaslServer.java`
#### Snippet
```java

            if (!PLAIN_MECHANISM.equals(mechanism))
                throw new SaslException(String.format("Mechanism \'%s\' is not supported. Only PLAIN is supported.", mechanism));

            return new PlainSaslServer(cbh);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `streams/src/main/java/org/apache/kafka/streams/state/HostInfo.java`
#### Snippet
```java
    public String toString() {
        return "HostInfo{" +
                "host=\'" + host + '\'' +
                ", port=" + port +
                '}';
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `generator/src/main/java/org/apache/kafka/message/JsonConverterGenerator.java`
#### Snippet
```java
                ifMember(__ -> {
                    buffer.printf("throw new RuntimeException(\"%s: unable to locate " +
                            "field \'%s\', which is mandatory in version \" + _version);%n",
                        className, field.camelCaseName());
                }).
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `generator/src/main/java/org/apache/kafka/message/JsonConverterGenerator.java`
#### Snippet
```java
                ifMember(__ -> {
                    buffer.printf("throw new RuntimeException(\"%s: unable to locate " +
                            "field \'%s\', which is mandatory in version \" + _version);%n",
                        className, field.camelCaseName());
                }).
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `generator/src/main/java/org/apache/kafka/message/JsonConverterGenerator.java`
#### Snippet
```java
                        curVersions);
                }).ifNotMember(__ -> {
                    buffer.printf("throw new RuntimeException(\"%s: field \'%s\' is not " +
                        "supported in version \" + _version);%n",
                        className, field.camelCaseName());
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `generator/src/main/java/org/apache/kafka/message/JsonConverterGenerator.java`
#### Snippet
```java
                        curVersions);
                }).ifNotMember(__ -> {
                    buffer.printf("throw new RuntimeException(\"%s: field \'%s\' is not " +
                        "supported in version \" + _version);%n",
                        className, field.camelCaseName());
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamTask.java`
#### Snippet
```java

            case RESTORING:
                transitToSuspend();
                break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
                    break;
                case SHUTDOWN_NOW:
                    handleBrokerFenced(brokerId, records);
                    break;
            }
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `codeToError` in enum 'Errors'
in `clients/src/main/java/org/apache/kafka/common/protocol/Errors.java`
#### Snippet
```java

    private static Map<Class<?>, Errors> classToError = new HashMap<>();
    private static Map<Short, Errors> codeToError = new HashMap<>();

    static {
```

### NonFinalFieldInEnum
Non-final field `classToError` in enum 'Errors'
in `clients/src/main/java/org/apache/kafka/common/protocol/Errors.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(Errors.class);

    private static Map<Class<?>, Errors> classToError = new HashMap<>();
    private static Map<Short, Errors> codeToError = new HashMap<>();

```

### NonFinalFieldInEnum
Non-final field `notifyDisconnect` in enum 'CloseMode'
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
        DISCARD_NO_NOTIFY(false);  // discard any outstanding receives, no disconnect notification

        boolean notifyDisconnect;

        CloseMode(boolean notifyDisconnect) {
```

### NonFinalFieldInEnum
Non-final field `supplier` in enum 'AuthorizerType'
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/acl/AuthorizerBenchmark.java`
#### Snippet
```java
        KRAFT(StandardAuthorizer::new);

        private Supplier<Authorizer> supplier;

        AuthorizerType(Supplier<Authorizer> supplier) {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerClientInitialResponse.java`
#### Snippet
```java

    private static final String KVPAIRS = String.format("(%s=%s%s)*", KEY, VALUE, SEPARATOR);
    private static final Pattern AUTH_PATTERN = Pattern.compile("(?<scheme>[\\w]+)[ ]+(?<token>[-_\\.a-zA-Z0-9]+)");
    private static final Pattern CLIENT_INITIAL_RESPONSE_PATTERN = Pattern.compile(
            String.format("n,(a=(?<authzid>%s))?,%s(?<kvpairs>%s)%s", SASLNAME, SEPARATOR, KVPAIRS, SEPARATOR));
```

### RegExpSimplifiable
`[ ]` can be simplified to ' '
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/OAuthBearerClientInitialResponse.java`
#### Snippet
```java

    private static final String KVPAIRS = String.format("(%s=%s%s)*", KEY, VALUE, SEPARATOR);
    private static final Pattern AUTH_PATTERN = Pattern.compile("(?<scheme>[\\w]+)[ ]+(?<token>[-_\\.a-zA-Z0-9]+)");
    private static final Pattern CLIENT_INITIAL_RESPONSE_PATTERN = Pattern.compile(
            String.format("n,(a=(?<authzid>%s))?,%s(?<kvpairs>%s)%s", SASLNAME, SEPARATOR, KVPAIRS, SEPARATOR));
```

### RegExpSimplifiable
`{` can be simplified to '\*'
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/TimestampRouter.java`
#### Snippet
```java
public class TimestampRouter<R extends ConnectRecord<R>> implements Transformation<R>, AutoCloseable {

    private static final Pattern TOPIC = Pattern.compile("${topic}", Pattern.LITERAL);

    private static final Pattern TIMESTAMP = Pattern.compile("${timestamp}", Pattern.LITERAL);
```

### RegExpSimplifiable
`{` can be simplified to '\*'
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/TimestampRouter.java`
#### Snippet
```java
    private static final Pattern TOPIC = Pattern.compile("${topic}", Pattern.LITERAL);

    private static final Pattern TIMESTAMP = Pattern.compile("${timestamp}", Pattern.LITERAL);

    public static final String OVERVIEW_DOC =
```

### RegExpSimplifiable
`[\\d]` can be simplified to '\\d'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConsumeBenchSpec.java`
#### Snippet
```java
public class ConsumeBenchSpec extends TaskSpec {

    private static final String VALID_EXPANDED_TOPIC_NAME_PATTERN = "^[^:]+(:[\\d]+|[^:]*)$";
    private final String consumerNode;
    private final String bootstrapServers;
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get(directoryPath)`
in `metadata/src/main/java/org/apache/kafka/metadata/bootstrap/BootstrapDirectory.java`
#### Snippet
```java

    public BootstrapMetadata read() throws Exception {
        if (!Files.isDirectory(Paths.get(directoryPath))) {
            if (Files.exists(Paths.get(directoryPath))) {
                throw new RuntimeException("Path " + directoryPath + " exists, but is not " +
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(directoryPath)`
in `metadata/src/main/java/org/apache/kafka/metadata/bootstrap/BootstrapDirectory.java`
#### Snippet
```java
    public BootstrapMetadata read() throws Exception {
        if (!Files.isDirectory(Paths.get(directoryPath))) {
            if (Files.exists(Paths.get(directoryPath))) {
                throw new RuntimeException("Path " + directoryPath + " exists, but is not " +
                        "a directory.");
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(outputDir)`
in `generator/src/main/java/org/apache/kafka/message/MessageGenerator.java`
#### Snippet
```java
                                          List<String> typeClassGeneratorTypes,
                                          List<String> messageClassGeneratorTypes) throws Exception {
        Files.createDirectories(Paths.get(outputDir));
        int numProcessed = 0;

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(outputDir)`
in `generator/src/main/java/org/apache/kafka/message/MessageGenerator.java`
#### Snippet
```java
        }
        try (DirectoryStream<Path> directoryStream = Files.
                newDirectoryStream(Paths.get(outputDir))) {
            for (Path outputPath : directoryStream) {
                Path fileName = outputPath.getFileName();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/requests/UpdateMetadataRequest.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder bld = new StringBuilder();
            bld.append("(type: UpdateMetadataRequest=").
                append(", controllerId=").append(controllerId).
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/requests/LeaderAndIsrRequest.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder bld = new StringBuilder();
            bld.append("(type=LeaderAndIsRequest")
                .append(", controllerId=").append(controllerId)
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/requests/StopReplicaRequest.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder bld = new StringBuilder();
            bld.append("(type=StopReplicaRequest").
                append(", controllerId=").append(controllerId).
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/requests/FetchRequest.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder bld = new StringBuilder();
            bld.append("(type=FetchRequest").
                    append(", replicaId=").append(replicaId).
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/secured/RefreshingHttpsJwksVerificationKeyResolver.java`
#### Snippet
```java
                log.debug("Refreshing JWKs from {} as no suitable verification key for JWS w/ header {} was found in {}", refreshingHttpsJwks.getLocation(), jws.getHeaders().getFullHeaderAsJsonString(), jwks);

            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find a suitable verification key for JWS w/ header ").append(jws.getHeaders().getFullHeaderAsJsonString());
            sb.append(" from JWKs ").append(jwks).append(" obtained from ").append(
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/secured/RefreshingHttpsJwksVerificationKeyResolver.java`
#### Snippet
```java
            throw new UnresolvableKeyException(sb.toString());
        } catch (JoseException | IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find a suitable verification key for JWS w/ header ").append(jws.getHeaders().getFullHeaderAsJsonString());
            sb.append(" due to an unexpected exception (").append(e).append(") while obtaining or using keys from JWKS endpoint at ").append(
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/clients/NodeApiVersions.java`
#### Snippet
```java
        for (ApiKeys apiKey : ApiKeys.zkBrokerApis()) {
            if (!apiKeysText.containsKey(apiKey.id)) {
                StringBuilder bld = new StringBuilder();
                bld.append(apiKey.name).append("(").
                        append(apiKey.id).append("): ").append("UNSUPPORTED");
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeLogDirsResponse.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("(size=")
                .append(size)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeLogDirsResponse.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("(error=")
                    .append(error)
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `clients/src/main/java/org/apache/kafka/clients/admin/NewTopic.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        bld.append("(name=").append(name).
                append(", numPartitions=").append(numPartitions.map(String::valueOf).orElse("default")).
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/entities/ConfigInfos.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[")
            .append(name)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/entities/ConfigValueInfo.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[")
            .append(name)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[")
            .append(name)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java

    public String toString(final String indent) {
        final StringBuilder builder = new StringBuilder();
        builder.append(indent).append("GlobalMetadata: ").append(allMetadata).append("\n");
        builder.append(indent).append("GlobalStores: ").append(globalStores).append("\n");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/SinkNode.java`
#### Snippet
```java
    @Override
    public String toString(final String indent) {
        final StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append(indent).append("\ttopic:\t\t");
        sb.append(topicExtractor);
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        bld.append("BrokerRegistration(id=").append(id);
        bld.append(", epoch=").append(epoch);
```

### StringBufferReplaceableByString
`StringBuilder bld` can be replaced with 'String'
in `metadata/src/main/java/org/apache/kafka/metadata/FinalizedControllerFeatures.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        bld.append("{");
        bld.append("featureMap=").append(featureMap.toString());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `metadata/src/main/java/org/apache/kafka/metadata/PartitionRegistration.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("PartitionRegistration(");
        builder.append("replicas=").append(Arrays.toString(replicas));
        builder.append(", isr=").append(Arrays.toString(isr));
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `raft/src/main/java/org/apache/kafka/raft/KafkaRaftClient.java`
#### Snippet
```java
            logger.debug("Ignoring call to resign from epoch {} since it is smaller than the " +
                "current epoch {}", epoch, currentEpoch);
            return;
        } else if (!leaderAndEpoch.isLeader(quorum.localIdOrThrow())) {
            throw new IllegalArgumentException("Cannot resign from epoch " + epoch +
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/TransactionManager.java`
#### Snippet
```java
                    " to transaction while in state  " + currentState);
            } else if (isPartitionAdded(topicPartition) || isPartitionPendingAdd(topicPartition)) {
                return;
            } else {
                log.debug("Begin adding new partition {} to transaction", topicPartition);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
            stopRequestedLatch.await(delay, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ChangelogRecordDeserializationHelper.java`
#### Snippet
```java
                ChangelogRecordDeserializationHelper.CHANGELOG_VERSION_HEADER_KEY);
        if (versionHeader == null) {
            return;
        } else {
            switch (versionHeader.value()[0]) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `server-common/src/main/java/org/apache/kafka/timeline/BaseHashTable.java`
#### Snippet
```java
        Object value = elements[slot];
        if (value == null) {
            return;
        } else if (value instanceof Object[]) {
            Object[] array = (Object[]) value;
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`optional == null ? false : optional` can be simplified to 'optional!=null \&\& optional'
in `connect/api/src/main/java/org/apache/kafka/connect/data/SchemaBuilder.java`
#### Snippet
```java
    @Override
    public boolean isOptional() {
        return optional == null ? false : optional;
    }

```

### SimplifiableConditionalExpression
`negate == null ? false : Boolean.parseBoolean(negate.toString())` can be simplified to 'negate!=null \&\& Boolean.parseBoolean(negate.toString())'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectorConfig.java`
#### Snippet
```java
                    Predicate<R> predicate = Utils.newInstance(getClass(predicatePrefix + "type"), Predicate.class);
                    predicate.configure(originalsWithPrefix(predicatePrefix));
                    transformations.add(new TransformationStage<>(predicate, negate == null ? false : Boolean.parseBoolean(negate.toString()), transformation));
                } else {
                    transformations.add(new TransformationStage<>(transformation));
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `clients/src/main/java/org/apache/kafka/common/utils/ChunkedBytesStream.java`
#### Snippet
```java
            if (avail <= 0) return -1;
        }
        int cnt = (avail < len) ? avail : len;
        System.arraycopy(getBufIfOpen(), pos, b, off, cnt);
        pos += cnt;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `server-common/src/main/java/org/apache/kafka/server/util/ToolsUtils.java`
#### Snippet
```java
                MetricName mName = metric.metricName();
                String mergedName = mName.group() + ":" + mName.name() + ":" + mName.tags();
                maxLengthOfDisplayName = maxLengthOfDisplayName < mergedName.length() ? mergedName.length() : maxLengthOfDisplayName;
                sortedMetrics.put(mergedName, metric.metricValue());
            }
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/timeline/TimelineHashMapBenchmark.java`
#### Snippet
```java
        HashMap<Integer, String> map = new HashMap<>(NUM_ENTRIES);
        for (int i = 0; i < NUM_ENTRIES; i++) {
            int key = (int) (0xffffffff & ((i * 2862933555777941757L) + 3037000493L));
            map.put(key, String.valueOf(key));
        }
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/timeline/TimelineHashMapBenchmark.java`
#### Snippet
```java
        int j = 0;
        for (int i = 0; i < NUM_ENTRIES; i++) {
            int key = (int) (0xffffffff & ((i * 2862933555777941757L) + 3037000493L));
            if (j > 10 && key % 3 == 0) {
                snapshotRegistry.deleteSnapshotsUpTo(epoch - 1000);
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/timeline/TimelineHashMapBenchmark.java`
#### Snippet
```java
            new TimelineHashMap<>(snapshotRegistry, NUM_ENTRIES);
        for (int i = 0; i < NUM_ENTRIES; i++) {
            int key = (int) (0xffffffff & ((i * 2862933555777941757L) + 3037000493L));
            map.put(key, String.valueOf(key));
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `clients/src/main/java/org/apache/kafka/common/utils/LoggingSignalHandler.java`
#### Snippet
```java
     *
     * @implNote sun.misc.Signal and sun.misc.SignalHandler are described as "not encapsulated" in
     * http://openjdk.java.net/jeps/260. However, they are not available in the compile classpath if the `--release`
     * flag is used. As a workaround, we rely on reflection.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `clients/src/main/java/org/apache/kafka/common/record/CompressionType.java`
#### Snippet
```java
         * Size of intermediate buffer which contains uncompressed data.
         * This size should be <= ZSTD_BLOCKSIZE_MAX
         * see: https://github.com/facebook/zstd/blob/189653a9c10c9f4224a5413a6d6a69dd01d7c3bd/lib/zstd.h#L854
         */
        @Override
```

### JavadocLinkAsPlainText
Link specified as plain text
in `clients/src/main/java/org/apache/kafka/common/compress/KafkaLZ4BlockInputStream.java`
#### Snippet
```java
    /**
     * Checks whether the version of lz4 on the classpath has the fix for reading from ByteBuffers with
     * non-zero array offsets (see https://github.com/lz4/lz4-java/pull/65)
     */
    static void detectBrokenLz4Version() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/OAuthBearerExtensionsValidatorCallback.java`
#### Snippet
```java
 * {@link #error(String, String)} method to communicate validation errors back to
 * the SASL Server.
 * As per RFC-7628 (https://tools.ietf.org/html/rfc7628#section-3.1), unknown extensions must be ignored by the server.
 * The callback handler implementation should simply ignore unknown extensions,
 * not calling {@link #error(String, String)} nor {@link #valid(String)}.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/OAuthBearerLoginModule.java`
#### Snippet
```java
 * implementation through using the configurable option {@code unsecuredLoginExtension_<extensionname>}. Note that there
 * are validations for the key/values in order to conform to the SASL/OAUTHBEARER standard
 * (https://tools.ietf.org/html/rfc7628#section-3.1), including the reserved key at
 * {@link org.apache.kafka.common.security.oauthbearer.internals.OAuthBearerClientInitialResponse#AUTH_KEY}.
 * The {@code OAuthBearerLoginModule} instance also asks its configured {@link AuthenticateCallbackHandler}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `clients/src/main/java/org/apache/kafka/server/authorizer/AuthorizableRequestContext.java`
#### Snippet
```java
    /**
     * 16-bit API key of the request from the request header. See
     * https://kafka.apache.org/protocol#protocol_api_keys for request types.
     */
    int requestType();
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streams/src/main/java/org/apache/kafka/streams/query/Query.java`
#### Snippet
```java
 * them (via {@link org.apache.kafka.streams.state.StoreSupplier}s.
 * <p>
 * See KIP-796 (https://cwiki.apache.org/confluence/x/34xnCw) for more details.
 *
 * @param <R> The type of the result returned by this query.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
/**
 * This class was taken from Hive org.apache.hive.common.util;
 * https://github.com/apache/hive/blob/master/storage-api/src/java/org/apache/hive/common/util/Murmur3.java
 * Commit: dffa3a16588bc8e95b9d0ab5af295a74e06ef702
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
 *
 * Murmur3 32 and 128 bit variants.
 * 32-bit Java port of https://code.google.com/p/smhasher/source/browse/trunk/MurmurHash3.cpp#94
 * 128-bit Java port of https://code.google.com/p/smhasher/source/browse/trunk/MurmurHash3.cpp#255
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
 * Murmur3 32 and 128 bit variants.
 * 32-bit Java port of https://code.google.com/p/smhasher/source/browse/trunk/MurmurHash3.cpp#94
 * 128-bit Java port of https://code.google.com/p/smhasher/source/browse/trunk/MurmurHash3.cpp#255
 *
 * This is a public domain code with no copyrights.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streams/src/main/java/org/apache/kafka/streams/state/internals/Murmur3.java`
#### Snippet
```java
 *
 * This is a public domain code with no copyrights.
 * From homepage of MurmurHash (https://code.google.com/p/smhasher/),
 * "All MurmurHash versions are public domain software, and the author disclaims all copyright
 * to their code."
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
     * <p>
     * This method allows callers outside of the Streams runtime to access the internal state of
     * stateful processors. See https://kafka.apache.org/documentation/streams/developer-guide/interactive-queries.html
     * for more information.
     * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/cache/LRUCacheBenchmark.java`
#### Snippet
```java
 *
 * The sample code provided by the JMH project is a great place to start learning how to write correct benchmarks:
 * http://hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/
 */
@State(Scope.Thread)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/util/ByteUtilsBenchmark.java`
#### Snippet
```java
    /**
     * Implementation extended from Int implementation from Netty
     * see: https://github.com/netty/netty/blob/59aa6e635b9996cf21cd946e64353270679adc73/codec/src/main/java/io/netty/handler/codec/protobuf/ProtobufVarint32FrameDecoder.java#L73
     */
    private static long readUnsignedVarlongNetty(ByteBuffer buffer) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/util/ByteUtilsBenchmark.java`
#### Snippet
```java
    /**
     * Implementation copied from Protobuf's implementation.
     * see: https://github.com/protocolbuffers/protobuf/blob/f1c7820c9bd0e31f8b7d091092851441ad2716b6/java/core/src/main/java/com/google/protobuf/CodedInputStream.java#L1048
     */
    private static int readUnsignedVarintProtoBuf(ByteBuffer buf) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/util/ByteUtilsBenchmark.java`
#### Snippet
```java
    /**
     * Implementation copied from Netty
     * see: https://github.com/netty/netty/blob/59aa6e635b9996cf21cd946e64353270679adc73/codec/src/main/java/io/netty/handler/codec/protobuf/ProtobufVarint32FrameDecoder.java#L73
     */
    private static int readUnsignedVarintNetty(ByteBuffer buffer) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/producer/ProducerResponseBenchmark.java`
#### Snippet
```java
    /**
     * this method is still used by production so we benchmark it.
     * see https://issues.apache.org/jira/browse/KAFKA-10730
     */
    @SuppressWarnings("deprecation")
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/kafka/server/builders/LogManagerBuilder.java`
#### Snippet
```java
    private int maxTransactionTimeoutMs = 15 * 60 * 1000;
    private ProducerStateManagerConfig producerStateManagerConfig = new ProducerStateManagerConfig(60000, false);
    private int producerIdExpirationCheckIntervalMs = 600000;
    private MetadataVersion interBrokerProtocolVersion = MetadataVersion.latest();
    private Scheduler scheduler = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `raft/src/main/java/org/apache/kafka/raft/ReplicatedCounter.java`
#### Snippet
```java
    private final Logger log;
    private final RaftClient<Integer> client;
    private final int snapshotDelayInRecords = 10;

    private int committed = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shell/src/main/java/org/apache/kafka/shell/InteractiveShell.java`
#### Snippet
```java
    private final MetadataShellState state;
    private final Terminal terminal;
    private final Parser parser;
    private final History history;
    private final MetadataShellCompleter completer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shell/src/main/java/org/apache/kafka/shell/InteractiveShell.java`
#### Snippet
```java
    private final Parser parser;
    private final History history;
    private final MetadataShellCompleter completer;
    private final LineReader reader;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/utils/LoggingSignalHandler.java`
#### Snippet
```java
    private final Constructor<?> signalConstructor;
    private final Class<?> signalHandlerClass;
    private final Class<?> signalClass;
    private final Method signalHandleMethod;
    private final Method signalGetNameMethod;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/memory/GarbageCollectedMemoryPool.java`
#### Snippet
```java
    //to ever be enqueued), 2nd keeps some (small) metadata for every buffer allocated
    private final Map<BufferReference, BufferMetadata> buffersInFlight = new ConcurrentHashMap<>();
    private final GarbageCollectionListener gcListener = new GarbageCollectionListener();
    private final Thread gcListenerThread;
    private volatile boolean alive = true;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/metrics/stats/Histogram.java`
#### Snippet
```java
        private static final int MIN_BIN_NUMBER = 0;
        private final double min;
        private final double max;
        private final int bins;
        private final double bucketWidth;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/network/SslChannelBuilder.java`
#### Snippet
```java
    private Map<String, ?> configs;
    private SslPrincipalMapper sslPrincipalMapper;
    private final Logger log;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/requests/IncrementalAlterConfigsRequest.java`
#### Snippet
```java

    private final IncrementalAlterConfigsRequestData data;
    private final short version;

    public IncrementalAlterConfigsRequest(IncrementalAlterConfigsRequestData data, short version) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeUserScramCredentialsRequest.java`
#### Snippet
```java

    private final DescribeUserScramCredentialsRequestData data;
    private final short version;

    private DescribeUserScramCredentialsRequest(DescribeUserScramCredentialsRequestData data, short version) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/common/security/scram/internals/ScramSaslServer.java`
#### Snippet
```java
    private final CallbackHandler callbackHandler;
    private State state;
    private String username;
    private ClientFirstMessage clientFirstMessage;
    private ServerFirstMessage serverFirstMessage;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/events/ErrorBackgroundEvent.java`
#### Snippet
```java

public class ErrorBackgroundEvent extends BackgroundEvent {
    private final Throwable exception;

    public ErrorBackgroundEvent(Throwable e) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/ProducerMetrics.java`
#### Snippet
```java

    public final SenderMetricsRegistry senderMetrics;
    private final Metrics metrics;

    public ProducerMetrics(Metrics metrics) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java

    private class ConsumerCoordinatorMetrics {
        private final String metricGrpName;
        private final Sensor commitSensor;
        private final Sensor revokeCallbackSensor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerSinkTask.java`
#### Snippet
```java

    static class SinkTaskMetricsGroup {
        private final ConnectorTaskId id;
        private final ConnectMetrics metrics;
        private final MetricGroup metricGroup;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerSinkTask.java`
#### Snippet
```java
        private final Sensor putBatchTime;
        private final Sensor sinkRecordActiveCount;
        private long activeRecords;
        private Map<TopicPartition, OffsetAndMetadata> consumedOffsets = new HashMap<>();
        private Map<TopicPartition, OffsetAndMetadata> committedOffsets = new HashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerSinkTask.java`
#### Snippet
```java
    static class SinkTaskMetricsGroup {
        private final ConnectorTaskId id;
        private final ConnectMetrics metrics;
        private final MetricGroup metricGroup;
        private final Sensor sinkRecordRead;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/TopologyConfig.java`
#### Snippet
```java
                DEFAULT_DSL_STORE_DOC);
    }
    private final Logger log = LoggerFactory.getLogger(TopologyConfig.class);

    public final String topologyName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/state/internals/InMemorySessionStore.java`
#### Snippet
```java

    private final String name;
    private final String metricScope;
    private Sensor expiredRecordSensor;
    private InternalProcessorContext context;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/state/internals/InMemoryWindowStore.java`
#### Snippet
```java

    private final String name;
    private final String metricScope;
    private final long retentionPeriod;
    private final long windowSize;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractRocksDBSegmentedBytesStore.java`
#### Snippet
```java
    private final String name;
    private final AbstractSegments<S> segments;
    private final String metricScope;
    private final long retentionPeriod;
    private final KeySchema keySchema;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredWindowedKeyValueIterator.java`
#### Snippet
```java
    private final KeyValueIterator<Windowed<Bytes>, byte[]> iter;
    private final Sensor sensor;
    private final StreamsMetrics metrics;
    private final Function<byte[], K> deserializeKey;
    private final Function<byte[], V> deserializeValue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/state/internals/MeteredWindowStoreIterator.java`
#### Snippet
```java
    private final WindowStoreIterator<byte[]> iter;
    private final Sensor sensor;
    private final StreamsMetrics metrics;
    private final Function<byte[], V> valueFrom;
    private final long startNs;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java`
#### Snippet
```java
 */
public class StreamsMetadataState {
    private final Logger log;
    public static final HostInfo UNKNOWN_HOST = HostInfo.unavailable();
    private final TopologyMetadata topologyMetadata;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
 */
public class AgentClient {
    private final Logger log;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/RoundTripWorker.java`
#### Snippet
```java

    class ConsumerRunnable implements Runnable {
        private final Properties props;

        ConsumerRunnable(HashSet<TopicPartition> partitions) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `examples/src/main/java/kafka/examples/ExactlyOnceMessageProcessor.java`
#### Snippet
```java
    private volatile boolean closed;

    private final KafkaProducer<Integer, String> producer;
    private final KafkaConsumer<Integer, String> consumer;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `examples/src/main/java/kafka/examples/ExactlyOnceMessageProcessor.java`
#### Snippet
```java

    private final KafkaProducer<Integer, String> producer;
    private final KafkaConsumer<Integer, String> consumer;

    public ExactlyOnceMessageProcessor(String threadName,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `metadata/src/main/java/org/apache/kafka/image/publisher/SnapshotGenerator.java`
#### Snippet
```java
     * The node ID.
     */
    private final int nodeId;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationDriver.java`
#### Snippet
```java

    private final Time time;
    private final LogContext logContext;
    private final Logger log;
    private final int nodeId;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `metadata/src/main/java/org/apache/kafka/controller/LogReplayTracker.java`
#### Snippet
```java
     * The slf4j logger.
     */
    private final Logger log;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server-common/src/main/java/org/apache/kafka/server/util/timer/TimingWheel.java`
#### Snippet
```java
public class TimingWheel {
    private final long tickMs;
    private final long startMs;
    private final int wheelSize;
    private final AtomicInteger taskCounter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
     * A predicate that returns information about whether a ConfigResource exists.
     */
    private final Consumer<ConfigResource> resourceExists;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"1", "2", "10", "50", "200", "500"})
    private int maxBatchSize = 200;

    @Param(value = {"1", "2"})
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"100", "1000", "10000", "100000"})
    private int messageSize = 1000;

    @Param(value = {"RANDOM", "ONES"})
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/record/BaseRecordBatchBenchmark.java`
#### Snippet
```java

    @Param(value = {"NO_CACHING", "CREATE"})
    private String bufferSupplierStr = "NO_CACHING";

    // zero starting offset is much faster for v1 batches, but that will almost never happen
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/acl/AuthorizerBenchmark.java`
#### Snippet
```java
    private AuthorizerType authorizerType;

    private final int hostPreCount = 1000;
    private final String resourceNamePrefix = "foo-bar35_resource-";
    private final KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/CheckpointBench.java`
#### Snippet
```java
    private ReplicaManager replicaManager;
    private QuotaFactory.QuotaManagers quotaManagers;
    private LogDirFailureChannel failureChannel;
    private LogManager logManager;
    private AlterPartitionManager alterPartitionManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/CheckpointBench.java`
#### Snippet
```java
    private MockTime time;

    private KafkaConfig brokerProperties;

    private ReplicaManager replicaManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/CheckpointBench.java`
#### Snippet
```java
    public int numPartitions;

    private final String topicName = "foo";

    private Scheduler scheduler;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/CheckpointBench.java`
#### Snippet
```java
    private Metrics metrics;

    private MockTime time;

    private KafkaConfig brokerProperties;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/CheckpointBench.java`
#### Snippet
```java
    private LogDirFailureChannel failureChannel;
    private LogManager logManager;
    private AlterPartitionManager alterPartitionManager;


```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/PartitionCreationBench.java`
#### Snippet
```java
    private Metrics metrics;
    private Time time;
    private KafkaConfig brokerProperties;

    private ReplicaManager replicaManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/PartitionCreationBench.java`
#### Snippet
```java
    private QuotaFactory.QuotaManagers quotaManagers;
    private KafkaZkClient zkClient;
    private LogDirFailureChannel failureChannel;
    private LogManager logManager;
    private AlterPartitionManager alterPartitionManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/PartitionCreationBench.java`
#### Snippet
```java
    private LogDirFailureChannel failureChannel;
    private LogManager logManager;
    private AlterPartitionManager alterPartitionManager;
    private List<TopicPartition> topicPartitions;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/PartitionCreationBench.java`
#### Snippet
```java
    public int numPartitions;

    private final String topicName = "foo";

    private Option<Uuid> topicId;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/PartitionCreationBench.java`
#### Snippet
```java
    private LogManager logManager;
    private AlterPartitionManager alterPartitionManager;
    private List<TopicPartition> topicPartitions;

    @SuppressWarnings("deprecation")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/server/PartitionCreationBench.java`
#### Snippet
```java
    private Scheduler scheduler;
    private Metrics metrics;
    private Time time;
    private KafkaConfig brokerProperties;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
    private Metrics metrics = new Metrics();
    private ReplicaManager replicaManager;
    private ReplicaQuota replicaQuota;
    private Option<Uuid> topicId = Option.apply(Uuid.randomUuid());

```

### FieldCanBeLocal
Field can be converted to a local variable
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetchsession/FetchSessionBenchmark.java`
#### Snippet
```java
    private LinkedHashMap<TopicPartition, FetchRequest.PartitionData> fetches;
    private FetchSessionHandler handler;
    private Map<String, Uuid> topicIds;

    @Setup(Level.Trial)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/runtime/CoordinatorRuntime.java`
#### Snippet
```java
     * The log context.
     */
    private final LogContext logContext;

    /**
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/PrototypeAsyncConsumer.java`
#### Snippet
```java
            }
        }).exceptionally(e -> {
            System.out.println(e);
            throw new KafkaException(e);
        });
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `clients/src/main/java/org/apache/kafka/common/utils/Utils.java`
#### Snippet
```java
        for (int i = 0; i < first.length; ++i) {
            int j = i < second.length ? i : 0;
            if (first[i] != second[j]) {
                matches = false;
            }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/WorkerState.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "state")
@JsonSubTypes(value = {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/TaskState.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "state")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/task/TaskSpec.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,
              include = JsonTypeInfo.As.PROPERTY,
              property = "class")
public abstract class TaskSpec {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/fault/Kibosh.java`
#### Snippet
```java

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
    @JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/RecordProcessor.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes(value = {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/FlushGenerator.java`
#### Snippet
```java

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
@JsonSubTypes(value = {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/TransactionGenerator.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
@JsonSubTypes(value = {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ThroughputGenerator.java`
#### Snippet
```java

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
@JsonSubTypes(value = {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/PayloadGenerator.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
@JsonSubTypes(value = {
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotReader.java`
#### Snippet
```java
            nextBatch.ifPresent(batch -> {
                throw new IllegalStateException(
                    String.format(
                        "nextBatch was present when last contained log timestamp was not present",
                        batch
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashCollection.java`
#### Snippet
```java
     */
    final public void clear(int expectedNumElements) {
        if (expectedNumElements == 0) {
            // Optimize away object allocations for empty sets.
            this.head = HeadElement.EMPTY;
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `streams/src/main/java/org/apache/kafka/streams/query/Position.java`
#### Snippet
```java
     */
    public Position merge(final Position other) {
        if (other == null) {
            return this;
        } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `server-common/src/main/java/org/apache/kafka/queue/KafkaEventQueue.java`
#### Snippet
```java
                        EventContext eventContext = entry.getValue();
                        if (timeoutNs <= now) {
                            if (eventContext.insertionType == EventInsertionType.DEFERRED) {
                                // The deferred event is ready to run.  Prepend it to the
                                // queue.  (The value for deferred events is a schedule time
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `server-common/src/main/java/org/apache/kafka/timeline/SnapshottableHashTable.java`
#### Snippet
```java

    int snapshottableSize(long epoch) {
        if (epoch == LATEST_EPOCH) {
            return baseSize();
        } else {
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `server-common/src/main/java/org/apache/kafka/server/mutable/BoundedList.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection<?> c) {
        return underlying.containsAll(c);
    }

```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ConfigurableProducerWorker.java`
#### Snippet
```java
                try {
                    long sentMessages = 0;
                    while (true) {
                        sendMessage();
                        sentMessages++;
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
            };
            int initialOffSet = 0;
            while (true) {
                MemoryRecords memoryRecords =  MemoryRecords.withRecords(initialOffSet, CompressionType.NONE, 0, simpleRecords);
                partition.appendRecordsToFollowerOrFutureReplica(memoryRecords, false);
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `clients/src/main/java/org/apache/kafka/clients/consumer/RangeAssignor.java`
#### Snippet
```java
            if (numAssigned > numPartitionsPerConsumer)
                remainingConsumersWithExtraPartition--;
            unassignedPartitions.removeAll(newlyAssignedPartitions);
        }

```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
            final Assignment assignment = entry.getValue();
            final Set<TopicPartition> addedPartitions = new HashSet<>(assignment.partitions());
            addedPartitions.removeAll(ownedPartitions.get(entry.getKey()));
            final Set<TopicPartition> revokedPartitions = new HashSet<>(ownedPartitions.get(entry.getKey()));
            revokedPartitions.removeAll(assignment.partitions());
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
            addedPartitions.removeAll(ownedPartitions.get(entry.getKey()));
            final Set<TopicPartition> revokedPartitions = new HashSet<>(ownedPartitions.get(entry.getKey()));
            revokedPartitions.removeAll(assignment.partitions());

            totalAddedPartitions.addAll(addedPartitions);
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorCheckpointConnector.java`
#### Snippet
```java
        Set<String> newConsumerGroups = new HashSet<>();
        newConsumerGroups.addAll(consumerGroups);
        newConsumerGroups.removeAll(knownConsumerGroups);
        Set<String> deadConsumerGroups = new HashSet<>();
        deadConsumerGroups.addAll(knownConsumerGroups);
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorCheckpointConnector.java`
#### Snippet
```java
        Set<String> deadConsumerGroups = new HashSet<>();
        deadConsumerGroups.addAll(knownConsumerGroups);
        deadConsumerGroups.removeAll(consumerGroups);
        if (!newConsumerGroups.isEmpty() || !deadConsumerGroups.isEmpty()) {
            log.info("Found {} consumer groups for {}. {} are new. {} were removed. Previously had {}.",
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConnector.java`
#### Snippet
```java

            Set<TopicPartition> newTopicPartitions = sourceTopicPartitionsSet;
            newTopicPartitions.removeAll(knownSourceTopicPartitions);

            Set<TopicPartition> deletedTopicPartitions = knownSourceTopicPartitionsSet;
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConnector.java`
#### Snippet
```java

            Set<TopicPartition> deletedTopicPartitions = knownSourceTopicPartitionsSet;
            deletedTopicPartitions.removeAll(sourceTopicPartitions);

            log.info("Found {} new topic-partitions on {}. " +
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerSinkTaskContext.java`
#### Snippet
```java
        }
        try {
            pausedPartitions.removeAll(Arrays.asList(partitions));
            if (sinkTask.shouldPause()) {
                log.debug("{} Connector is paused, so not resuming consumer's partitions {}", this, partitions);
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `storage/src/main/java/org/apache/kafka/storage/internals/log/ProducerStateManager.java`
#### Snippet
```java

    private void removeProducerIds(List<Long> keys) {
        producers.keySet().removeAll(keys);
        producerIdCount = producers.size();
    }
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `metadata/src/main/java/org/apache/kafka/controller/PartitionReassignmentReplicas.java`
#### Snippet
```java
    private static Set<Integer> calculateDifference(List<Integer> a, List<Integer> b) {
        Set<Integer> result = new TreeSet<>(a);
        result.removeAll(b);
        return result;
    }
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `examples/src/main/java/kafka/examples/Utils.java`
#### Snippet
```java

    public static void printHelp(String message, Object... args) {
        System.out.println(format(message, args));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `server-common/src/main/java/org/apache/kafka/server/util/ToolsUtils.java`
#### Snippet
```java
            String doubleOutputFormat = "%-" + maxLengthOfDisplayName + "s : %.3f";
            String defaultOutputFormat = "%-" + maxLengthOfDisplayName + "s : %s";
            System.out.println(String.format("\n%-" + maxLengthOfDisplayName + "s   %s", "Metric Name", "Value"));

            for (Map.Entry<String, Object> entry : sortedMetrics.entrySet()) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `server-common/src/main/java/org/apache/kafka/server/util/ToolsUtils.java`
#### Snippet
```java
                else
                    outputFormat = defaultOutputFormat;
                System.out.println(String.format(outputFormat, entry.getKey(), entry.getValue()));
            }
        }
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java`
#### Snippet
```java
            }

            if (keyFrom != null && keyTo != null && keyFrom.equals(keyTo)) {
                cacheKeyFrom = cacheFunction.cacheKey(segmentLowerRangeFixedSize(keyFrom, lowerRangeEndTime));
                cacheKeyTo = cacheFunction.cacheKey(segmentUpperRangeFixedSize(keyTo, upperRangeEndTime));
```

## RuleId[id=RedundantUnmodifiable]
### RedundantUnmodifiable
Redundant usage of the 'unmodifiableMap' wrapper
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorTopology.java`
#### Snippet
```java

    public Map<String, String> storeToChangelogTopic() {
        return Collections.unmodifiableMap(storeToChangelogTopic);
    }

```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ProcessorTopology.java`
#### Snippet
```java

    public List<StateStore> globalStateStores() {
        return Collections.unmodifiableList(globalStateStores);
    }

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
            try {
                maybeUpdateReadOffset(log);
                long copiedOffset = copiedOffsetOption.getAsLong();

                // LSO indicates the offset below are ready to be consumed (high-watermark or committed)
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsBatchReader.java`
#### Snippet
```java
        }

        Batch<T> batch = nextBatch.get();
        nextBatch = Optional.empty();

```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `raft/src/main/java/org/apache/kafka/raft/internals/KafkaRaftMetrics.java`
#### Snippet
```java
    public void maybeUpdateElectionLatency(long currentTimeMs) {
        if (electionStartMs.isPresent()) {
            electionTimeSensor.record(currentTimeMs - electionStartMs.getAsLong(), currentTimeMs);
            electionStartMs = OptionalLong.empty();
        }
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `raft/src/main/java/org/apache/kafka/raft/internals/KafkaRaftMetrics.java`
#### Snippet
```java
    public void updatePollEnd(long currentTimeMs) {
        if (pollStartMs.isPresent()) {
            long pollDurationMs = Math.max(currentTimeMs - pollStartMs.getAsLong(), 0L);
            this.pollDurationSensor.record(pollDurationMs);
            this.pollStartMs = OptionalLong.empty();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `raft/src/main/java/org/apache/kafka/raft/internals/RecordsIterator.java`
#### Snippet
```java
        }

        Batch<T> batch = nextBatch.get();
        nextBatch = Optional.empty();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `raft/src/main/java/org/apache/kafka/snapshot/RecordsSnapshotReader.java`
#### Snippet
```java
        }

        Batch<T> batch = nextBatch.get();
        nextBatch = Optional.empty();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `clients/src/main/java/org/apache/kafka/common/protocol/Protocol.java`
#### Snippet
```java
            fields.add(field);
            if (field.def.type.isArray()) {
                Type innerType = field.def.type.arrayElementType().get();
                if (innerType instanceof Schema)
                    populateSchemaFields((Schema) innerType, fields);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `clients/src/main/java/org/apache/kafka/common/protocol/Protocol.java`
#### Snippet
```java
                b.append("] ");
                if (!subTypes.containsKey(field.def.name)) {
                    subTypes.put(field.def.name, type.arrayElementType().get());
                }
            } else if (type instanceof TaggedFields) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Schema.java`
#### Snippet
```java
        } else if (node.isArray()) {
            visitor.visit(node);
            handleNode(node.arrayElementType().get(), visitor);
        } else {
            visitor.visit(node);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `clients/src/main/java/org/apache/kafka/common/protocol/types/Struct.java`
#### Snippet
```java
            return new Struct((Schema) field.def.type);
        } else if (field.def.type.isArray()) {
            return new Struct((Schema) field.def.type.arrayElementType().get());
        } else {
            throw new SchemaException("Field '" + field.def.name + "' is not a container type, it is of type " + field.def.type);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java
                    }

                    Integer authorizedOperations = response.topicAuthorizedOperations(topicName).get();
                    TopicDescription topicDescription = getTopicDescriptionFromCluster(cluster, topicName, topicId, authorizedOperations);
                    future.complete(topicDescription);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java
                    }
                    Uuid topicId = cluster.topicId(topicName);
                    Integer authorizedOperations = response.topicAuthorizedOperations(topicName).get();
                    TopicDescription topicDescription = getTopicDescriptionFromCluster(cluster, topicName, topicId, authorizedOperations);
                    future.complete(topicDescription);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/IncrementalCooperativeAssignor.java`
#### Snippet
```java
        // even if some members have fallen behind. The config offset used to generate the assignment is included in
        // the response so members that have fallen behind will not use the assignment until they have caught up.
        long maxOffset = memberConfigs.values().stream().map(ExtendedWorkerState::offset).max(Long::compare).get();
        log.debug("Max config offset root: {}, local snapshot config offsets root: {}",
                  maxOffset, coordinator.configSnapshot().offset());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractDualSchemaRocksDBSegmentedBytesStore.java`
#### Snippet
```java
        }

        final long timestamp = indexKeySchema.get().segmentTimestamp(indexKey);
        final long segmentId = segments.segmentId(timestamp);
        final S segment = segments.getOrCreateSegmentIfLive(segmentId, context, observedStreamTime);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractDualSchemaRocksDBSegmentedBytesStore.java`
#### Snippet
```java
        }

        final long timestamp = indexKeySchema.get().segmentTimestamp(indexKey);
        final long segmentId = segments.segmentId(timestamp);
        final S segment = segments.getOrCreateSegmentIfLive(segmentId, context, observedStreamTime);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/state/internals/AbstractDualSchemaRocksDBSegmentedBytesStore.java`
#### Snippet
```java
        }

        final long timestamp = indexKeySchema.get().segmentTimestamp(indexKey);
        final long segmentId = segments.segmentId(timestamp);
        final S segment = segments.getOrCreateSegmentIfLive(segmentId, context, observedStreamTime);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/InternalStreamsBuilder.java`
#### Snippet
```java
            final StreamStreamJoinNode joinNode = (StreamStreamJoinNode) currentNode;
            // Remove JoinOtherWindowed node
            final GraphNode parent = joinNode.parentNodes().stream().findFirst().get();
            GraphNode left = null, right = null;
            for (final GraphNode child: parent.children()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoinProcessor.java`
#### Snippet
```java
            doJoin(record);
        } else {
            if (!buffer.get().put(observedStreamTime, record, internalProcessorContext.recordContext())) {
                doJoin(record);
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamKTableJoinProcessor.java`
#### Snippet
```java
            }

            buffer.get().setSerdesIfNull(new SerdeGetter(context));
            buffer.get().init((org.apache.kafka.streams.processor.StateStoreContext) context(), null);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamSourceNode.java`
#### Snippet
```java
                                      consumedInternal().keyDeserializer(),
                                      consumedInternal().valueDeserializer(),
                                      topicNames().get().toArray(new String[0]));
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionSendProcessorSupplier.java`
#### Snippet
```java
                Murmur3.hash128(valueSerializer.serialize(valueSerdeTopic, record.value().newValue));

            final int partition = context().recordMetadata().get().partition();
            if (record.value().oldValue != null) {
                final KO oldForeignKey = foreignKeyExtractor.apply(record.value().oldValue);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/DefaultStateUpdater.java`
#### Snippet
```java

        private void handleStreamsExceptionWithTask(final StreamsException streamsException) {
            final TaskId failedTaskId = streamsException.taskId().get();
            if (!updatingTasks.containsKey(failedTaskId)) {
                throw new IllegalStateException("Task " + failedTaskId + " failed but is not updating. " + BUG_ERROR_MESSAGE);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/CopartitionedTopicsEnforcer.java`
#### Snippet
```java
                    .entrySet()
                    .stream()
                    .collect(Collectors.toMap(Entry::getKey, entry -> entry.getValue().numberOfPartitions().get()));

                final String msg = String.format("%sFollowing topics do not have the same number of partitions: [%s]",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/ProduceBenchWorker.java`
#### Snippet
```java
        private boolean takeTransactionAction() {
            boolean tookAction = true;
            TransactionAction nextAction = transactionGenerator.get().nextAction();
            switch (nextAction) {
                case BEGIN_TRANSACTION:
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
        Map<String, Endpoint> listenersMap = new HashMap<>();
        for (Endpoint endpoint : listeners) {
            listenersMap.put(endpoint.listenerName().get(), endpoint);
        }
        return listenersMap;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MetadataJsonConvertersGenerator.java`
#### Snippet
```java
    public void registerMessageType(MessageSpec spec) {
        if (spec.type() == MessageSpecType.METADATA) {
            short id = spec.apiKey().get();
            MessageSpec prevSpec = apis.put(id, spec);
            if (prevSpec != null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MetadataRecordTypeGenerator.java`
#### Snippet
```java
    public void registerMessageType(MessageSpec spec) {
        if (spec.type() == MessageSpecType.METADATA) {
            short id = spec.apiKey().get();
            MessageSpec prevSpec = apis.put(id, spec);
            if (prevSpec != null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/SchemaGenerator.java`
#### Snippet
```java
                field.flexibleVersions().orElse(messageFlexibleVersions);
            buffer.printf("%d, new Field(\"%s\", %s, \"%s\")%s%n",
                field.tag().get(),
                field.snakeCaseName(),
                fieldTypeToSchemaType(field, version, fieldFlexibleVersions),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/ApiMessageTypeGenerator.java`
#### Snippet
```java
        switch (spec.type()) {
            case REQUEST: {
                short apiKey = spec.apiKey().get();
                ApiData data = apis.get(apiKey);
                if (!apis.containsKey(apiKey)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/ApiMessageTypeGenerator.java`
#### Snippet
```java
            }
            case RESPONSE: {
                short apiKey = spec.apiKey().get();
                ApiData data = apis.get(apiKey);
                if (!apis.containsKey(apiKey)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
                log.info("maybeCompleteAuthorizerInitialLoad: completing authorizer " +
                    "initial load at last committed offset {}.", lastCommittedOffset);
                authorizer.get().completeInitialLoad();
                needToCompleteAuthorizerLoad = false;
            } else {
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        public void complete(Throwable exception) {
            if (exception == null) {
                handleEventEnd(this.toString(), startProcessingTimeNs.getAsLong());
                future.complete(resultAndOffset.response());
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
                            buffer.decrementIndent();
                            buffer.printf("}%n");
                            if (taggedFields.put(field.tag().get(), field) != null) {
                                throw new RuntimeException("Field " + field.name() + " has tag " +
                                    field.tag() + ", but another field already used that tag.");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
                int prevTag = -1;
                for (FieldSpec field : taggedFields.values()) {
                    if (prevTag + 1 != field.tag().get()) {
                        buffer.printf("_rawWriter.writeRawTags(_writable, %d);%n", field.tag().get());
                    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
                                    } else {
                                        buffer.printf("_writable.writeUnsignedVarint(%d);%n",
                                            field.type().fixedLength().get());
                                        buffer.printf("%s;%n",
                                            primitiveWriteExpression(field.type(), field.camelCaseName()));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
                                buffer.printf("_numTaggedFields++;%n");
                                buffer.printf("_size.addBytes(%d);%n",
                                    MessageGenerator.sizeOfUnsignedVarint(field.tag().get()));
                                buffer.printf("_size.addBytes(%d);%n", MessageGenerator.sizeOfUnsignedVarint(
                                    MessageGenerator.sizeOfUnsignedVarint(0)));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
                    buffer.printf("_numTaggedFields++;%n");
                    buffer.printf("_size.addBytes(%d);%n",
                        MessageGenerator.sizeOfUnsignedVarint(field.tag().get()));
                }
                if (field.type().isString()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
            buffer.printf("_numTaggedFields++;%n");
            buffer.printf("_size.addBytes(%d);%n",
                MessageGenerator.sizeOfUnsignedVarint(field.tag().get()));
            // Account for the tagged field prefix length.
            buffer.printf("_size.addBytes(%d);%n",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
            // Account for the tagged field prefix length.
            buffer.printf("_size.addBytes(%d);%n",
                MessageGenerator.sizeOfUnsignedVarint(field.type().fixedLength().get()));
            buffer.printf("_size.addBytes(%d);%n", field.type().fixedLength().get());
            buffer.decrementIndent();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
            buffer.printf("_size.addBytes(%d);%n",
                MessageGenerator.sizeOfUnsignedVarint(field.type().fixedLength().get()));
            buffer.printf("_size.addBytes(%d);%n", field.type().fixedLength().get());
            buffer.decrementIndent();
            buffer.printf("}%n");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/org/apache/kafka/message/MessageDataGenerator.java`
#### Snippet
```java
            buffer.printf("}%n");
        } else {
            buffer.printf("_size.addBytes(%d);%n", field.type().fixedLength().get());
        }
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `message` is always 'null'
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
            case LEADER_CHANGE:
                if (!(message instanceof LeaderChangeMessage)) {
                    throwIllegalArgument(recordType, message);
                }
                break;
```

### ConstantValue
Value `message` is always 'null'
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
            case SNAPSHOT_HEADER:
                if (!(message instanceof SnapshotHeaderRecord)) {
                    throwIllegalArgument(recordType, message);
                }
                break;
```

### ConstantValue
Value `message` is always 'null'
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
            case SNAPSHOT_FOOTER:
                if (!(message instanceof SnapshotFooterRecord)) {
                    throwIllegalArgument(recordType, message);
                }
                break;
```

### ConstantValue
Condition `delegateBytesSkipped < 0` is always `false` when reached
in `clients/src/main/java/org/apache/kafka/common/utils/ChunkedBytesStream.java`
#### Snippet
```java
                    // one byte read so decrement number to skip
                    remaining--;
                } else if (delegateBytesSkipped > remaining || delegateBytesSkipped < 0) { // skipped negative or too many bytes
                    throw new IOException("Unable to skip exactly");

```

### ConstantValue
Value `res` is always 'null'
in `clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java`
#### Snippet
```java
    public String getString(String key) {
        final String res = (String) get(key);
        return res == null ? res : res.trim();
    }

```

### ConstantValue
Condition `mbeanName != null` is always `true`
in `clients/src/main/java/org/apache/kafka/common/metrics/JmxReporter.java`
#### Snippet
```java
        synchronized (LOCK) {
            String mbeanName = addAttribute(metric);
            if (mbeanName != null && mbeanPredicate.test(mbeanName)) {
                reregister(mbeans.get(mbeanName));
            }
```

### ConstantValue
Value `flush` is always 'true'
in `clients/src/main/java/org/apache/kafka/common/network/SslTransportLayer.java`
#### Snippet
```java
        // are flushed. If write fails because remote end has closed the channel, log the I/O exception and  continue to
        // handle the handshake failure as an authentication exception.
        if (!flush || handshakeWrapAfterFailure(flush))
            throw handshakeException;
        else
```

### ConstantValue
Condition `name == null` is always `false`
in `clients/src/main/java/org/apache/kafka/common/resource/Resource.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "(resourceType=" + resourceType + ", name=" + ((name == null) ? "<any>" : name) + ")";
    }

```

### ConstantValue
Condition `password != null` is always `true` when reached
in `clients/src/main/java/org/apache/kafka/common/security/ssl/DefaultSslEngineFactory.java`
#### Snippet
```java
        } else if (path != null && password == null) {
            throw new InvalidConfigurationException("SSL key store is specified, but key store password is not specified.");
        } else if (path != null && password != null) {
            return new FileBasedStore(type, path, password, keyPassword, true);
        } else
```

### ConstantValue
Condition `retry >= 0` is always `true`
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java`
#### Snippet
```java
                    String kinitArgs = "-R";
                    int retry = 1;
                    while (retry >= 0) {
                        try {
                            log.debug("[Principal={}]: Running ticket cache refresh command: {} {}", principal, kinitCmd, kinitArgs);
```

### ConstantValue
Condition `retry >= 0` is always `true`
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java`
#### Snippet
```java
                try {
                    int retry = 1;
                    while (retry >= 0) {
                        try {
                            reLogin();
```

### ConstantValue
Condition `principal == KafkaPrincipal.ANONYMOUS` is always `false` when reached
in `clients/src/main/java/org/apache/kafka/common/security/authenticator/DefaultKafkaPrincipalBuilder.java`
#### Snippet
```java
    private KafkaPrincipal applySslPrincipalMapper(Principal principal) {
        try {
            if (!(principal instanceof X500Principal) || principal == KafkaPrincipal.ANONYMOUS) {
                return new KafkaPrincipal(KafkaPrincipal.USER_TYPE, principal.getName());
            } else {
```

### ConstantValue
Result of `keys.size()` is always '0'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/CoordinatorStrategy.java`
#### Snippet
```java
    private void ensureSameType(Set<CoordinatorKey> keys) {
        if (keys.size() < 1) {
            throw new IllegalArgumentException("Unexpected size of key set: expected >= 1, but got " + keys.size());
        }
        if (keys.stream().filter(k -> k.type == type).collect(Collectors.toSet()).size() != keys.size()) {
```

### ConstantValue
Condition `includeTasks` is always `true` when reached
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/RestartRequest.java`
#### Snippet
```java
        if (onlyFailed && !includeTasks) { //restarts only failed connector so least impactful
            return 0;
        } else if (onlyFailed && includeTasks) { //restarts only failed connector and tasks
            return 1;
        } else if (!onlyFailed && !includeTasks) { //restart connector in any state but no tasks
```

### ConstantValue
Condition `!onlyFailed` is always `true`
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/RestartRequest.java`
#### Snippet
```java
        } else if (onlyFailed && includeTasks) { //restarts only failed connector and tasks
            return 1;
        } else if (!onlyFailed && !includeTasks) { //restart connector in any state but no tasks
            return 2;
        }
```

### ConstantValue
Condition `topicAdminSupplier != null` is always `true`
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaOffsetBackingStore.java`
#### Snippet
```java
        ConnectUtils.addMetricsContextProperties(adminProps, config, clusterId);
        Supplier<TopicAdmin> adminSupplier;
        if (topicAdminSupplier != null) {
            adminSupplier = topicAdminSupplier;
        } else {
```

### ConstantValue
Value `needsReconfigRebalance` is always 'true'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java`
#### Snippet
```java
                // processed until it completes.
                log.debug("Requesting rebalance due to reconfiguration of tasks (needsReconfigRebalance: {})",
                        needsReconfigRebalance);
                member.requestRejoin();
                needsReconfigRebalance = false;
```

### ConstantValue
Value `needsReconfigRebalance` is always 'true'
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java`
#### Snippet
```java
            if (needsReconfigRebalance) {
                log.debug("Requesting rebalance due to reconfiguration of tasks (needsReconfigRebalance: {})",
                        needsReconfigRebalance);
                member.requestRejoin();
                needsReconfigRebalance = false;
```

### ConstantValue
Condition `defaultSegmentInterval < 1L` is always `false`
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDbIndexedTimeOrderedWindowBytesStoreSupplier.java`
#### Snippet
```java
            throw new IllegalArgumentException("windowSize cannot be negative");
        }
        if (defaultSegmentInterval < 1L) {
            throw new IllegalArgumentException("segmentInterval cannot be zero or negative");
        }
```

### ConstantValue
Condition `Byte.compare((byte) 0x7F, data.getVersion()) < 0` is always `false`
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionWrapperSerde.java`
#### Snippet
```java

            //7-bit (0x7F) maximum for data version.
            if (Byte.compare((byte) 0x7F, data.getVersion()) < 0) {
                throw new UnsupportedVersionException("SubscriptionWrapper version is larger than maximum supported 0x7F");
            }
```

### ConstantValue
Condition `Byte.compare((byte) 0x7F, data.getVersion()) < 0` is always `false`
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/foreignkeyjoin/SubscriptionResponseWrapperSerde.java`
#### Snippet
```java

            //7-bit (0x7F) maximum for data version.
            if (Byte.compare((byte) 0x7F, data.getVersion()) < 0) {
                throw new UnsupportedVersionException("SubscriptionResponseWrapper version is larger than maximum supported 0x7F");
            }
```

### ConstantValue
Condition `exactMatch.containsKey(component.entityType())` is always `false`
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
            if (component.entityType().isEmpty()) {
                throw new InvalidRequestException("Invalid empty entity type.");
            } else if (exactMatch.containsKey(component.entityType()) ||
                    typeMatch.contains(component.entityType())) {
                throw new InvalidRequestException("Entity type " + component.entityType() +
```

### ConstantValue
Condition `exactMatch.containsKey(component.entityType()) || typeMatch.contains(component.e...` is always `false`
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
            if (component.entityType().isEmpty()) {
                throw new InvalidRequestException("Invalid empty entity type.");
            } else if (exactMatch.containsKey(component.entityType()) ||
                    typeMatch.contains(component.entityType())) {
                throw new InvalidRequestException("Entity type " + component.entityType() +
                    " cannot appear more than once in the filter.");
```

### ConstantValue
Condition `typeMatch.contains(component.entityType())` is always `false` when reached
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
                throw new InvalidRequestException("Invalid empty entity type.");
            } else if (exactMatch.containsKey(component.entityType()) ||
                    typeMatch.contains(component.entityType())) {
                throw new InvalidRequestException("Entity type " + component.entityType() +
                    " cannot appear more than once in the filter.");
```

### ConstantValue
Condition `exactMatch.containsKey(IP)` is always `false`
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
            }
        }
        if (exactMatch.containsKey(IP) || typeMatch.contains(IP)) {
            if ((exactMatch.containsKey(USER) || typeMatch.contains(USER)) ||
                    (exactMatch.containsKey(CLIENT_ID) || typeMatch.contains(CLIENT_ID))) {
```

### ConstantValue
Condition `exactMatch.containsKey(IP) || typeMatch.contains(IP)` is always `false`
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
            }
        }
        if (exactMatch.containsKey(IP) || typeMatch.contains(IP)) {
            if ((exactMatch.containsKey(USER) || typeMatch.contains(USER)) ||
                    (exactMatch.containsKey(CLIENT_ID) || typeMatch.contains(CLIENT_ID))) {
```

### ConstantValue
Condition `typeMatch.contains(IP)` is always `false` when reached
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
            }
        }
        if (exactMatch.containsKey(IP) || typeMatch.contains(IP)) {
            if ((exactMatch.containsKey(USER) || typeMatch.contains(USER)) ||
                    (exactMatch.containsKey(CLIENT_ID) || typeMatch.contains(CLIENT_ID))) {
```

### ConstantValue
Condition `entry.getValue().leader != brokerId` is always `true`
in `metadata/src/main/java/org/apache/kafka/image/TopicDelta.java`
#### Snippet
```java
                }
            } else if (
                entry.getValue().leader != brokerId &&
                Replicas.contains(entry.getValue().replicas, brokerId)
            ) {
```

### ConstantValue
Value `isMigratingZkBroker` is always 'true'
in `metadata/src/main/java/org/apache/kafka/metadata/BrokerRegistration.java`
#### Snippet
```java
        if (isMigratingZkBroker) {
            if (options.metadataVersion().isMigrationSupported()) {
                registrationRecord.setIsMigratingZkBroker(isMigratingZkBroker);
            } else {
                options.handleLoss("the isMigratingZkBroker state of one or more brokers");
```

### ConstantValue
Condition `type instanceof FieldType.Int64FieldType` is always `true`
in `generator/src/main/java/org/apache/kafka/message/FieldSpec.java`
#### Snippet
```java
                    return fieldDefault;
                }
            } else if (type instanceof FieldType.Int64FieldType) {
                if (defaultString.isEmpty()) {
                    return "0L";
```

### ConstantValue
Value `wasInterrupted` is always 'true'
in `server-common/src/main/java/org/apache/kafka/queue/KafkaEventQueue.java`
#### Snippet
```java
                        size--;
                        if (wasInterrupted) {
                            interrupted = wasInterrupted;
                        }
                        toDeliver = null;
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `file`
in `clients/src/main/java/org/apache/kafka/common/record/FileRecords.java`
#### Snippet
```java
     */
    public void updateParentDir(File parentDir) {
        this.file = new File(parentDir, file.getName());
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `file`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/TransactionIndex.java`
#### Snippet
```java

    public void updateParentDir(File parentDir) {
        this.file = new File(parentDir, file.getName());
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `file`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LazyIndex.java`
#### Snippet
```java
        @Override
        public void updateParentDir(File parentDir) {
            file = new File(parentDir, file.getName());
        }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `entries`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/AbstractIndex.java`
#### Snippet
```java
    // The caller is expected to hold `lock` when calling this method
    protected void incrementEntries() {
        ++entries;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `file`
in `storage/src/main/java/org/apache/kafka/storage/internals/log/AbstractIndex.java`
#### Snippet
```java

    public void updateParentDir(File parentDir) {
        this.file = new File(parentDir, file.getName());
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `data`
in `metadata/src/main/java/org/apache/kafka/metadata/authorizer/StandardAuthorizer.java`
#### Snippet
```java
            newData.addAcl(entry.getKey(), entry.getValue());
        }
        data = data.copyWithNewAcls(newData.getAclCache());
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `data`
in `metadata/src/main/java/org/apache/kafka/metadata/authorizer/StandardAuthorizer.java`
#### Snippet
```java
    @Override
    public void completeInitialLoad() {
        data = data.copyWithNewLoadingComplete(true);
        data.log.info("Completed initial ACL load process.");
        initialLoadFuture.complete(null);
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `data`
in `metadata/src/main/java/org/apache/kafka/metadata/authorizer/StandardAuthorizer.java`
#### Snippet
```java
            nodeId = -1;
        }
        data = data.copyWithNewConfig(nodeId, superUsers, defaultResult);
        this.data.log.info("set super.users={}, default result={}", String.join(",", superUsers), defaultResult);
    }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `data`
in `metadata/src/main/java/org/apache/kafka/metadata/authorizer/StandardAuthorizer.java`
#### Snippet
```java
    @Override
    public void setAclMutator(AclMutator aclMutator) {
        this.data = data.copyWithNewAclMutator(aclMutator);
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `clients/src/main/java/org/apache/kafka/common/config/ConfigDef.java`
#### Snippet
```java

    private static void addConfigDetail(StringBuilder builder, String name, String value) {
        builder.append("<tr>" +
                "<th>" + name + ":</th>" +
                "<td>" + value + "</td>" +
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `clients/src/main/java/org/apache/kafka/common/protocol/Protocol.java`
#### Snippet
```java
            // Key
            b.append("<h5>");
            b.append("<a name=\"The_Messages_" + key.name + "\">");
            b.append(key.name);
            b.append(" API (Key: ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `clients/src/main/java/org/apache/kafka/common/protocol/ApiKeys.java`
#### Snippet
```java
            b.append("<tr>\n");
            b.append("<td>");
            b.append("<a href=\"#The_Messages_" + key.name + "\">" + key.name + "</a>");
            b.append("</td>");
            b.append("<td>");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `metadata/src/main/java/org/apache/kafka/image/ScramImage.java`
#### Snippet
```java
            for (Entry<ScramMechanism, Map<String, ScramCredentialData>> mechanismEntry : mechanisms.entrySet()) {
                if (!mechanismEntry.getValue().isEmpty()) {
                    scramImageString.append(mechanismEntry.getKey() + ":");
                    List<String> users = new ArrayList<>(mechanismEntry.getValue().keySet());
                    scramImageString.append(users.stream().collect(Collectors.joining(", ")));
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java
    @Override
    public void close() {
        if (fetchingSnapshot.isPresent()) {
            fetchingSnapshot.get().close();
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `raft/src/main/java/org/apache/kafka/raft/FollowerState.java`
#### Snippet
```java

    public void setFetchingSnapshot(Optional<RawSnapshotWriter> newSnapshot) {
        if (fetchingSnapshot.isPresent()) {
            fetchingSnapshot.get().close();
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `raft/src/main/java/org/apache/kafka/raft/LeaderState.java`
#### Snippet
```java
            else if (!this.endOffset.isPresent())
                return 1;
            else if (!that.endOffset.isPresent())
                return -1;
            else
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
            }));
        }
        OptionalInt screenWidth = shell.isPresent() ?
            OptionalInt.of(shell.get().screenWidth()) : OptionalInt.empty();
        log.trace("LS : targetFiles = {}, targetDirectories = {}, screenWidth = {}",
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `clients/src/main/java/org/apache/kafka/clients/consumer/StickyAssignor.java`
#### Snippet
```java
        }
        struct.set(TOPIC_PARTITIONS_KEY_NAME, topicAssignments.toArray());
        if (memberData.generation.isPresent())
            struct.set(GENERATION_KEY_NAME, memberData.generation.get());
        ByteBuffer buffer = ByteBuffer.allocate(STICKY_ASSIGNOR_USER_DATA_V1.sizeOf(struct));
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `clients/src/main/java/org/apache/kafka/clients/consumer/KafkaConsumer.java`
#### Snippet
```java

            // If group.instance.id is set, we will append it to the log context.
            if (groupRebalanceConfig.groupInstanceId.isPresent()) {
                logContext = new LogContext("[Consumer instanceId=" + groupRebalanceConfig.groupInstanceId.get() +
                        ", clientId=" + clientId + ", groupId=" + groupId.orElse("null") + "] ");
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/PrototypeAsyncConsumer.java`
#### Snippet
```java
        this.defaultApiTimeoutMs = config.getInt(ConsumerConfig.DEFAULT_API_TIMEOUT_MS_CONFIG);
        // If group.instance.id is set, we will append it to the log context.
        if (groupRebalanceConfig.groupInstanceId.isPresent()) {
            logContext = new LogContext("[Consumer instanceId=" + groupRebalanceConfig.groupInstanceId.get() +
                    ", clientId=" + clientId + ", groupId=" + groupId.orElse("null") + "] ");
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `storage/src/main/java/org/apache/kafka/storage/internals/epoch/LeaderEpochFileCache.java`
#### Snippet
```java
    public OptionalInt latestEpoch() {
        Optional<EpochEntry> entry = latestEntry();
        return entry.isPresent() ? OptionalInt.of(entry.get().epoch) : OptionalInt.empty();
    }

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `storage/src/main/java/org/apache/kafka/storage/internals/epoch/LeaderEpochFileCache.java`
#### Snippet
```java
        try {
            Optional<Map.Entry<Integer, EpochEntry>> lowerEntry = latestEntry().flatMap(entry -> Optional.ofNullable(epochs.lowerEntry(entry.epoch)));
            return lowerEntry.isPresent() ? OptionalInt.of(lowerEntry.get().getKey()) : OptionalInt.empty();
        } finally {
            lock.readLock().unlock();
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/image/ConfigurationDelta.java`
#### Snippet
```java
            if (change == null) {
                newData.put(entry.getKey(), entry.getValue());
            } else if (change.isPresent()) {
                newData.put(entry.getKey(), change.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/image/FeaturesDelta.java`
#### Snippet
```java
            if (change == null) {
                newFinalizedVersions.put(name, entry.getValue());
            } else if (change.isPresent()) {
                newFinalizedVersions.put(name, change.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/image/FeaturesDelta.java`
#### Snippet
```java
            Optional<Short> change = entry.getValue();
            if (!newFinalizedVersions.containsKey(name)) {
                if (change.isPresent()) {
                    newFinalizedVersions.put(name, change.get());
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/image/ClusterDelta.java`
#### Snippet
```java
            if (change == null) {
                newBrokers.put(nodeId, entry.getValue());
            } else if (change.isPresent()) {
                newBrokers.put(nodeId, change.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/image/ClusterDelta.java`
#### Snippet
```java
            Optional<BrokerRegistration> brokerRegistration = entry.getValue();
            if (!newBrokers.containsKey(nodeId)) {
                if (brokerRegistration.isPresent()) {
                    newBrokers.put(nodeId, brokerRegistration.get());
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/image/AclsDelta.java`
#### Snippet
```java
                if (change == null) {
                    newAcls.put(entry.getKey(), entry.getValue());
                } else if (change.isPresent()) {
                    newAcls.put(entry.getKey(), change.get());
                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/controller/PartitionChangeBuilder.java`
#### Snippet
```java
            .filter(this::isValidNewLeader)
            .findFirst();
        if (onlineLeader.isPresent()) {
            return new ElectionResult(onlineLeader.get(), false);
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/controller/ConfigurationControlManager.java`
#### Snippet
```java
                existenceChecker.accept(configResource);
            }
            if (alterConfigPolicy.isPresent()) {
                alterConfigPolicy.get().validate(new RequestMetadata(configResource, alteredConfigsForAlterConfigPolicyCheck));
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `metadata/src/main/java/org/apache/kafka/controller/ReplicationControlManager.java`
#### Snippet
```java
            Optional<OngoingPartitionReassignment> ongoing =
                getOngoingPartitionReassignment(topicInfo, partitionId);
            if (ongoing.isPresent()) {
                ongoingTopic.partitions().add(ongoing.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `generator/src/main/java/org/apache/kafka/message/FieldSpec.java`
#### Snippet
```java
    @JsonProperty("flexibleVersions")
    public String flexibleVersionsString() {
        return flexibleVersions.isPresent() ? flexibleVersions.get().toString() : null;
    }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StateDirectory.java`
#### Snippet
```java

        // if the task is stateless, storeDirs would be null
        if (storeDirs != null && storeDirs.length > 0) {
            for (final File file : storeDirs) {
                // We removed the task directory locking but some upgrading applications may still have old lock files on disk,
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
                    // 2) enabling the remote log for the first time
                    long fromOffset = Math.max(copiedOffset + 1, log.logStartOffset());
                    ArrayList<LogSegment> sortedSegments = new ArrayList<>(JavaConverters.asJavaCollection(log.logSegments(fromOffset, toOffset)));
                    sortedSegments.sort(Comparator.comparingLong(LogSegment::baseOffset));
                    List<Long> sortedBaseOffsets = sortedSegments.stream().map(LogSegment::baseOffset).collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
                    // 2) enabling the remote log for the first time
                    long fromOffset = Math.max(copiedOffset + 1, log.logStartOffset());
                    ArrayList<LogSegment> sortedSegments = new ArrayList<>(JavaConverters.asJavaCollection(log.logSegments(fromOffset, toOffset)));
                    sortedSegments.sort(Comparator.comparingLong(LogSegment::baseOffset));
                    List<Long> sortedBaseOffsets = sortedSegments.stream().map(LogSegment::baseOffset).collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
    private <T> T createDelegate(ClassLoader classLoader, String className) {
        try {
            return (T) classLoader.loadClass(className)
                    .getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 ClassNotFoundException e) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `core/src/main/java/kafka/log/remote/RemoteLogManager.java`
#### Snippet
```java
                fetchInfo.records,
                fetchInfo.firstEntryIncomplete,
                Optional.of(abortedTransactions.isEmpty() ? Collections.emptyList() : new ArrayList<>(abortedTransactions)));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.Map\>'
in `clients/src/main/java/org/apache/kafka/common/protocol/ApiKeys.java`
#### Snippet
```java

    private static final Map<ApiMessageType.ListenerType, EnumSet<ApiKeys>> APIS_BY_LISTENER =
        new EnumMap<>(ApiMessageType.ListenerType.class);

    static {
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `clients/src/main/java/org/apache/kafka/common/protocol/ApiKeys.java`
#### Snippet
```java

    private static final Map<ApiMessageType.ListenerType, EnumSet<ApiKeys>> APIS_BY_LISTENER =
        new EnumMap<>(ApiMessageType.ListenerType.class);

    static {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/AlterClientQuotasRequest.java`
#### Snippet
```java

    public List<ClientQuotaAlteration> entries() {
        List<ClientQuotaAlteration> entries = new ArrayList<>(data.entries().size());
        for (EntryData entryData : data.entries()) {
            Map<String, String> entity = new HashMap<>(entryData.entity().size());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `clients/src/main/java/org/apache/kafka/common/requests/AlterClientQuotasRequest.java`
#### Snippet
```java
        List<ClientQuotaAlteration> entries = new ArrayList<>(data.entries().size());
        for (EntryData entryData : data.entries()) {
            Map<String, String> entity = new HashMap<>(entryData.entity().size());
            for (EntityData entityData : entryData.entity()) {
                entity.put(entityData.entityType(), entityData.entityName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/AlterClientQuotasRequest.java`
#### Snippet
```java
            }

            List<ClientQuotaAlteration.Op> ops = new ArrayList<>(entryData.ops().size());
            for (OpData opData : entryData.ops()) {
                Double value = opData.remove() ? null : opData.value();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `clients/src/main/java/org/apache/kafka/common/requests/AlterClientQuotasResponse.java`
#### Snippet
```java
    public void complete(Map<ClientQuotaEntity, KafkaFutureImpl<Void>> futures) {
        for (EntryData entryData : data.entries()) {
            Map<String, String> entityEntries = new HashMap<>(entryData.entity().size());
            for (EntityData entityData : entryData.entity()) {
                entityEntries.put(entityData.entityType(), entityData.entityName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchRequest.java`
#### Snippet
```java
                        offsetFetchRequestTopicMap.put(topicName, topic);
                    }
                    topics = new ArrayList<>(offsetFetchRequestTopicMap.values());
                } else {
                    topics = ALL_TOPIC_PARTITIONS_BATCH;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchRequest.java`
#### Snippet
```java
                        offsetFetchRequestTopicMap.put(topicName, topic);
                    }
                    topics = new ArrayList<>(offsetFetchRequestTopicMap.values());
                } else {
                    topics = ALL_TOPIC_PARTITIONS_BATCH;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map\>'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchRequest.java`
#### Snippet
```java
    public Map<String, List<OffsetFetchRequestTopics>> groupIdsToTopics() {
        Map<String, List<OffsetFetchRequestTopics>> groupIdsToTopics =
            new HashMap<>(data.groups().size());
        data.groups().forEach(g -> groupIdsToTopics.put(g.groupId(), g.topics()));
        return groupIdsToTopics;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchRequest.java`
#### Snippet
```java
                    offsetFetchRequestTopicMap.put(topicName, topic);
                }
                topics = new ArrayList<>(offsetFetchRequestTopicMap.values());
            } else {
                // If passed in partition list is null, it is requesting offsets for all topic partitions.
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchResponse.java`
#### Snippet
```java

        this.data = new OffsetFetchResponseData()
            .setTopics(new ArrayList<>(offsetFetchResponseTopicMap.values()))
            .setErrorCode(error.code())
            .setThrottleTimeMs(throttleTimeMs);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchResponse.java`
#### Snippet
```java
            groupList.add(new OffsetFetchResponseGroup()
                .setGroupId(groupName)
                .setTopics(new ArrayList<>(offsetFetchResponseTopicsMap.values()))
                .setErrorCode(errors.get(groupName).code()));
            groupLevelErrors.put(groupName, errors.get(groupName));
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetFetchRequest.java`
#### Snippet
```java
                    offsetFetchRequestTopicMap.put(topicName, topic);
                }
                topics = new ArrayList<>(offsetFetchRequestTopicMap.values());
            } else {
                // If passed in partition list is null, it is requesting offsets for all topic partitions.
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/TxnOffsetCommitResponse.java`
#### Snippet
```java

        data = new TxnOffsetCommitResponseData()
                   .setTopics(new ArrayList<>(responseTopicDataMap.values()))
                   .setThrottleTimeMs(requestThrottleMs);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/UpdateMetadataRequest.java`
#### Snippet
```java
            if (version >= 5) {
                Map<String, UpdateMetadataTopicState> topicStatesMap = groupByTopic(topicIds, partitionStates);
                data.setTopicStates(new ArrayList<>(topicStatesMap.values()));
            } else {
                data.setUngroupedPartitionStates(partitionStates);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/LeaderAndIsrRequest.java`
#### Snippet
```java
            if (version >= 2) {
                Map<String, LeaderAndIsrTopicState> topicStatesMap = groupByTopic(partitionStates, topicIds);
                data.setTopicStates(new ArrayList<>(topicStatesMap.values()));
            } else {
                data.setUngroupedPartitionStates(partitionStates);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/LeaderAndIsrRequest.java`
#### Snippet
```java
        } else {
            for (LeaderAndIsrTopicState topicState : data.topicStates()) {
                List<LeaderAndIsrPartitionError> partitions = new ArrayList<>(
                    topicState.partitionStates().size());
                for (LeaderAndIsrPartitionState partition : topicState.partitionStates()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map\>'
in `clients/src/main/java/org/apache/kafka/common/requests/WriteTxnMarkersRequest.java`
#### Snippet
```java
        Errors error = Errors.forException(e);

        final Map<Long, Map<TopicPartition, Errors>> errors = new HashMap<>(data.markers().size());
        for (WritableTxnMarker markerEntry : data.markers()) {
            Map<TopicPartition, Errors> errorsPerPartition = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/WriteTxnMarkersRequest.java`
#### Snippet
```java
                                    .setCoordinatorEpoch(marker.coordinatorEpoch)
                                    .setTransactionResult(marker.transactionResult().id)
                                    .setTopics(new ArrayList<>(topicMap.values())));
            }
            this.data = new WriteTxnMarkersRequestData().setMarkers(dataMarkers);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/AlterPartitionRequest.java`
#### Snippet
```java
                data.topics().forEach(topicData -> {
                    topicData.partitions().forEach(partitionData -> {
                        List<Integer> newIsr = new ArrayList<>(partitionData.newIsrWithEpochs().size());
                        partitionData.newIsrWithEpochs().forEach(brokerState -> {
                            newIsr.add(brokerState.brokerId());
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/OffsetCommitResponse.java`
#### Snippet
```java

        data = new OffsetCommitResponseData()
                .setTopics(new ArrayList<>(responseTopicDataMap.values()))
                .setThrottleTimeMs(requestThrottleMs);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map\>'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasResponse.java`
#### Snippet
```java
        }

        Map<ClientQuotaEntity, Map<String, Double>> result = new HashMap<>(data.entries().size());
        for (EntryData entries : data.entries()) {
            Map<String, String> entity = new HashMap<>(entries.entity().size());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasResponse.java`
#### Snippet
```java
        Map<ClientQuotaEntity, Map<String, Double>> result = new HashMap<>(data.entries().size());
        for (EntryData entries : data.entries()) {
            Map<String, String> entity = new HashMap<>(entries.entity().size());
            for (EntityData entityData : entries.entity()) {
                entity.put(entityData.entityType(), entityData.entityName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasResponse.java`
#### Snippet
```java
            }

            Map<String, Double> values = new HashMap<>(entries.values().size());
            for (ValueData valueData : entries.values()) {
                values.put(valueData.key(), valueData.value());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/ListOffsetsRequest.java`
#### Snippet
```java
            topic.partitions().add(entry.getValue());
        }
        return new ArrayList<>(topics.values());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/ListOffsetsRequest.java`
#### Snippet
```java
            topic.partitions().add(entry.getValue());
        }
        return new ArrayList<>(topics.values());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/common/requests/WriteTxnMarkersResponse.java`
#### Snippet
```java
            markers.add(new WritableTxnMarkerResult()
                            .setProducerId(markerEntry.getKey())
                            .setTopics(new ArrayList<>(responseTopicDataMap.values()))
            );
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasRequest.java`
#### Snippet
```java

    public ClientQuotaFilter filter() {
        List<ClientQuotaFilterComponent> components = new ArrayList<>(data.components().size());
        for (ComponentData componentData : data.components()) {
            ClientQuotaFilterComponent component;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/AlterConsumerGroupOffsetsHandler.java`
#### Snippet
```java
        OffsetCommitRequestData data = new OffsetCommitRequestData()
            .setGroupId(groupId.idValue)
            .setTopics(new ArrayList<>(offsetData.values()));

        return new OffsetCommitRequest.Builder(data);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/ListOffsetsHandler.java`
#### Snippet
```java
        return ListOffsetsRequest.Builder
            .forConsumer(true, options.isolationLevel(), supportsMaxTimestamp)
            .setTargetTimes(new ArrayList<>(topicsByName.values()));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/clients/admin/internals/ListOffsetsHandler.java`
#### Snippet
```java
        return ListOffsetsRequest.Builder
            .forConsumer(true, options.isolationLevel(), supportsMaxTimestamp)
            .setTargetTimes(new ArrayList<>(topicsByName.values()));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CommitRequestManager.java`
#### Snippet
```java
                            .setMemberId(generation.memberId)
                            .setGroupInstanceId(groupInstanceId)
                            .setTopics(new ArrayList<>(requestTopicDataMap.values())));
            return new NetworkClientDelegate.UnsentRequest(
                    builder,
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java
                            return new DeleteRecordsRequest.Builder(new DeleteRecordsRequestData()
                                    .setTimeoutMs(timeoutMs)
                                    .setTopics(new ArrayList<>(partitionDeleteOffsets.values())));
                        }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java
                    }

                    listData.setTopics(new ArrayList<>(reassignmentTopicByTopicName.values()));
                }
                return new ListPartitionReassignmentsRequest.Builder(listData);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java

    private static Map<String, LogDirDescription> logDirDescriptions(DescribeLogDirsResponse response) {
        Map<String, LogDirDescription> result = new HashMap<>(response.data().results().size());
        for (DescribeLogDirsResponseData.DescribeLogDirsResult logDirResult : response.data().results()) {
            Map<TopicPartition, ReplicaInfo> replicaInfoMap = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerCoordinator.java`
#### Snippet
```java
                        .setMemberId(generation.memberId)
                        .setGroupInstanceId(groupInstanceId)
                        .setTopics(new ArrayList<>(requestTopicDataMap.values()))
        );

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
            setKeepPartitionMetadataFile(true).
            build();
        OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
        Mockito.when(offsetCheckpoints.fetch(logDir.getAbsolutePath(), topicPartition)).thenReturn(Option.apply(0L));
        DelayedOperations delayedOperations = new DelayedOperationsMock();
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
            .setReplicas(replicas)
            .setIsNew(true);
        AlterPartitionListener alterPartitionListener = Mockito.mock(AlterPartitionListener.class);
        AlterPartitionManager alterPartitionManager = Mockito.mock(AlterPartitionManager.class);
        partition = new Partition(topicPartition, 100,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
            .setIsNew(true);
        AlterPartitionListener alterPartitionListener = Mockito.mock(AlterPartitionListener.class);
        AlterPartitionManager alterPartitionManager = Mockito.mock(AlterPartitionManager.class);
        partition = new Partition(topicPartition, 100,
                MetadataVersion.latest(), 0, () -> -1, Time.SYSTEM,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/UpdateFollowerFetchStateBenchmark.java`
#### Snippet
```java
                MetadataVersion.latest(), 0, () -> -1, Time.SYSTEM,
                alterPartitionListener, delayedOperations,
                Mockito.mock(MetadataCache.class), logManager, alterPartitionManager);
        partition.makeLeader(partitionState, offsetCheckpoints, topicId);
        replica1 = partition.getReplica(1).get();
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
                    .setIsNew(true);

            AlterPartitionListener alterPartitionListener = Mockito.mock(AlterPartitionListener.class);
            OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
            Mockito.when(offsetCheckpoints.fetch(logDir.getAbsolutePath(), tp)).thenReturn(Option.apply(0L));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java

            AlterPartitionListener alterPartitionListener = Mockito.mock(AlterPartitionListener.class);
            OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
            Mockito.when(offsetCheckpoints.fetch(logDir.getAbsolutePath(), tp)).thenReturn(Option.apply(0L));
            AlterPartitionManager isrChannelManager = Mockito.mock(AlterPartitionManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
            OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
            Mockito.when(offsetCheckpoints.fetch(logDir.getAbsolutePath(), tp)).thenReturn(Option.apply(0L));
            AlterPartitionManager isrChannelManager = Mockito.mock(AlterPartitionManager.class);
            Partition partition = new Partition(tp, 100, MetadataVersion.latest(),
                    0, () -> -1, Time.SYSTEM, alterPartitionListener, new DelayedOperationsMock(tp),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
            Partition partition = new Partition(tp, 100, MetadataVersion.latest(),
                    0, () -> -1, Time.SYSTEM, alterPartitionListener, new DelayedOperationsMock(tp),
                    Mockito.mock(MetadataCache.class), logManager, isrChannelManager);

            partition.makeFollower(partitionState, offsetCheckpoints, topicId);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
        MetadataVersion.latest(), BrokerFeatures.createEmpty(), null);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
            setMetrics(metrics).
            setTime(new MockTime()).
            setZkClient(Mockito.mock(KafkaZkClient.class)).
            setScheduler(scheduler).
            setLogManager(logManager).
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/fetcher/ReplicaFetcherThreadBenchmark.java`
#### Snippet
```java
            setScheduler(scheduler).
            setLogManager(logManager).
            setQuotaManagers(Mockito.mock(QuotaFactory.QuotaManagers.class)).
            setBrokerTopicStats(brokerTopicStats).
            setMetadataCache(metadataCache).
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java

    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private KafkaZkClient kafkaZkClient = Mockito.mock(KafkaZkClient.class);
    private Metrics metrics = new Metrics();
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
        clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
        replicaQuotaManager, replicaQuotaManager, Option.empty());
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ZkMetadataCache metadataCache = MetadataCache.zkMetadataCache(brokerId,
        MetadataVersion.latest(), BrokerFeatures.createEmpty(), null);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private KafkaController kafkaController = Mockito.mock(KafkaController.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
        clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private ZkAdminManager adminManager = Mockito.mock(ZkAdminManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private Partition partition;
    private List<Integer> replicas = Arrays.asList(0, 1, 2);
    private OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
    private DelayedOperations delayedOperations  = Mockito.mock(DelayedOperations.class);
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
    private List<Integer> replicas = Arrays.asList(0, 1, 2);
    private OffsetCheckpoints offsetCheckpoints = Mockito.mock(OffsetCheckpoints.class);
    private DelayedOperations delayedOperations  = Mockito.mock(DelayedOperations.class);
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private Option<Uuid> topicId;
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java

        Mockito.when(offsetCheckpoints.fetch(logDir.getAbsolutePath(), tp)).thenReturn(Option.apply(0L));
        AlterPartitionListener alterPartitionListener = Mockito.mock(AlterPartitionListener.class);
        AlterPartitionManager alterPartitionManager = Mockito.mock(AlterPartitionManager.class);
        partition = new Partition(tp, 100,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
        Mockito.when(offsetCheckpoints.fetch(logDir.getAbsolutePath(), tp)).thenReturn(Option.apply(0L));
        AlterPartitionListener alterPartitionListener = Mockito.mock(AlterPartitionListener.class);
        AlterPartitionManager alterPartitionManager = Mockito.mock(AlterPartitionManager.class);
        partition = new Partition(tp, 100,
            MetadataVersion.latest(), 0, () -> -1, Time.SYSTEM,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/partition/PartitionMakeFollowerBenchmark.java`
#### Snippet
```java
            MetadataVersion.latest(), 0, () -> -1, Time.SYSTEM,
            alterPartitionListener, delayedOperations,
            Mockito.mock(MetadataCache.class), logManager, alterPartitionManager);
        partition.createLogIfNotExists(true, false, offsetCheckpoints, topicId);
        executorService.submit((Runnable) () -> {
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private Metrics metrics = new Metrics();
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java

    private RequestChannel requestChannel = Mockito.mock(RequestChannel.class, Mockito.withSettings().stubOnly());
    private RequestChannel.Metrics requestChannelMetrics = Mockito.mock(RequestChannel.Metrics.class);
    private ReplicaManager replicaManager = Mockito.mock(ReplicaManager.class);
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
            clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
            replicaQuotaManager, replicaQuotaManager, Option.empty());
    private FetchManager fetchManager = Mockito.mock(FetchManager.class);
    private BrokerTopicStats brokerTopicStats = new BrokerTopicStats();
    private KafkaPrincipal principal = new KafkaPrincipal(KafkaPrincipal.USER_TYPE, "test-user");
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
    private QuotaFactory.QuotaManagers quotaManagers = new QuotaFactory.QuotaManagers(clientQuotaManager,
            clientQuotaManager, clientRequestQuotaManager, controllerMutationQuotaManager, replicaQuotaManager,
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
    private ReplicationQuotaManager replicaQuotaManager = Mockito.mock(ReplicationQuotaManager.class);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private GroupCoordinator groupCoordinator = Mockito.mock(GroupCoordinator.class);
    private TransactionCoordinator transactionCoordinator = Mockito.mock(TransactionCoordinator.class);
    private AutoTopicCreationManager autoTopicCreationManager = Mockito.mock(AutoTopicCreationManager.class);
    private Metrics metrics = new Metrics();
    private int brokerId = 1;
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
    private ForwardingManager forwardingManager = Mockito.mock(ForwardingManager.class);
    private KRaftMetadataCache metadataCache = MetadataCache.kRaftMetadataCache(brokerId);
    private ClientQuotaManager clientQuotaManager = Mockito.mock(ClientQuotaManager.class);
    private ClientRequestQuotaManager clientRequestQuotaManager = Mockito.mock(ClientRequestQuotaManager.class);
    private ControllerMutationQuotaManager controllerMutationQuotaManager = Mockito.mock(ControllerMutationQuotaManager.class);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `group-coordinator/src/main/java/org/apache/kafka/coordinator/group/consumer/ConsumerGroupMember.java`
#### Snippet
```java
            return topicPartitionsList.stream().collect(Collectors.toMap(
                ConsumerGroupCurrentMemberAssignmentValue.TopicPartitions::topicId,
                topicPartitions -> Collections.unmodifiableSet(new HashSet<>(topicPartitions.partitions()))));
        }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `message instanceof LeaderChangeMessage` is redundant and can be replaced with a null check
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
        switch (recordType) {
            case LEADER_CHANGE:
                if (!(message instanceof LeaderChangeMessage)) {
                    throwIllegalArgument(recordType, message);
                }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
            case LEADER_CHANGE:
                if (!(message instanceof LeaderChangeMessage)) {
                    throwIllegalArgument(recordType, message);
                }
                break;
```

### DataFlowIssue
Condition `message instanceof SnapshotHeaderRecord` is redundant and can be replaced with a null check
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
                break;
            case SNAPSHOT_HEADER:
                if (!(message instanceof SnapshotHeaderRecord)) {
                    throwIllegalArgument(recordType, message);
                }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
            case SNAPSHOT_HEADER:
                if (!(message instanceof SnapshotHeaderRecord)) {
                    throwIllegalArgument(recordType, message);
                }
                break;
```

### DataFlowIssue
Condition `message instanceof SnapshotFooterRecord` is redundant and can be replaced with a null check
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
                break;
            case SNAPSHOT_FOOTER:
                if (!(message instanceof SnapshotFooterRecord)) {
                    throwIllegalArgument(recordType, message);
                }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `raft/src/main/java/org/apache/kafka/raft/ControlRecord.java`
#### Snippet
```java
            case SNAPSHOT_FOOTER:
                if (!(message instanceof SnapshotFooterRecord)) {
                    throwIllegalArgument(recordType, message);
                }
                break;
```

### DataFlowIssue
Variable is already assigned to this value
in `shell/src/main/java/org/apache/kafka/shell/glob/GlobComponent.java`
#### Snippet
```java
                case ',':
                    if (processingGroup) {
                        literal = false;
                        output.append(")|(?:");
                    } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `shell/src/main/java/org/apache/kafka/shell/glob/GlobComponent.java`
#### Snippet
```java
                case '}':
                    if (processingGroup) {
                        literal = false;
                        output.append("))");
                        processingGroup = false;
```

### DataFlowIssue
Variable is already assigned to this value
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
        this.numRecords = 0;
        this.uncompressedRecordsSizeInBytes = 0;
        this.actualCompressionRatio = 1;
        this.maxTimestamp = RecordBatch.NO_TIMESTAMP;
        this.producerId = producerId;
```

### DataFlowIssue
Variable is already assigned to this value
in `clients/src/main/java/org/apache/kafka/common/record/MemoryRecordsBuilder.java`
#### Snippet
```java
        this.uncompressedRecordsSizeInBytes = 0;
        this.actualCompressionRatio = 1;
        this.maxTimestamp = RecordBatch.NO_TIMESTAMP;
        this.producerId = producerId;
        this.producerEpoch = producerEpoch;
```

### DataFlowIssue
Switch label `MATCH_TYPE_EXACT` is unreachable
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasRequest.java`
#### Snippet
```java
            ClientQuotaFilterComponent component;
            switch (componentData.matchType()) {
                case MATCH_TYPE_EXACT:
                    component = ClientQuotaFilterComponent.ofEntity(componentData.entityType(), componentData.match());
                    break;
```

### DataFlowIssue
Switch label `MATCH_TYPE_DEFAULT` is unreachable
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasRequest.java`
#### Snippet
```java
                    component = ClientQuotaFilterComponent.ofEntity(componentData.entityType(), componentData.match());
                    break;
                case MATCH_TYPE_DEFAULT:
                    component = ClientQuotaFilterComponent.ofDefaultEntity(componentData.entityType());
                    break;
```

### DataFlowIssue
Switch label `MATCH_TYPE_SPECIFIED` is unreachable
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeClientQuotasRequest.java`
#### Snippet
```java
                    component = ClientQuotaFilterComponent.ofDefaultEntity(componentData.entityType());
                    break;
                case MATCH_TYPE_SPECIFIED:
                    component = ClientQuotaFilterComponent.ofEntityType(componentData.entityType());
                    break;
```

### DataFlowIssue
Method invocation `producerId` may produce `NullPointerException`
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CompletedFetch.java`
#### Snippet
```java
        while (!abortedTransactions.isEmpty() && abortedTransactions.peek().firstOffset() <= offset) {
            FetchResponseData.AbortedTransaction abortedTransaction = abortedTransactions.poll();
            abortedProducerIds.add(abortedTransaction.producerId());
        }
    }
```

### DataFlowIssue
Function may return null, but it's not allowed here
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/OffsetFetcherUtils.java`
#### Snippet
```java
        return partitionMap.entrySet()
                .stream()
                .collect(Collectors.groupingBy(entry -> metadata.fetch().leaderFor(entry.getKey()),
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
```

### DataFlowIssue
Unboxing of `n` may produce `NullPointerException`
in `clients/src/main/java/org/apache/kafka/clients/consumer/RangeAssignor.java`
#### Snippet
```java

        void onAssigned(String consumer, List<TopicPartition> newlyAssignedPartitions) {
            int numAssigned = numAssignedByConsumer.compute(consumer, (c, n) -> n + newlyAssignedPartitions.size());
            if (numAssigned > numPartitionsPerConsumer)
                remainingConsumersWithExtraPartition--;
```

### DataFlowIssue
Method invocation `hasSequence` may produce `NullPointerException`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
                ProducerIdAndEpoch producerIdAndEpoch =
                    transactionManager != null ? transactionManager.producerIdAndEpoch() : null;
                if (producerIdAndEpoch != null && !batch.hasSequence()) {
                    // If the producer id/epoch of the partition do not match the latest one
                    // of the producer, we update it and reset the sequence. This should be
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
            // close() is particularly expensive

            batch.close();
            size += batch.records().sizeInBytes();
            ready.add(batch);
```

### DataFlowIssue
Method invocation `baseSequence` may produce `NullPointerException`
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/RecordAccumulator.java`
#### Snippet
```java
            // is a simple linear scan of a subset of the in flight batches to find the right place in the queue each time.
            List<ProducerBatch> orderedBatches = new ArrayList<>();
            while (deque.peekFirst() != null && deque.peekFirst().hasSequence() && deque.peekFirst().baseSequence() < batch.baseSequence())
                orderedBatches.add(deque.pollFirst());

```

### DataFlowIssue
Method invocation `onCompletion` may produce `NullPointerException`
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/KafkaBasedLog.java`
#### Snippet
```java
                        for (int i = 0; i < numCallbacks; i++) {
                            Callback<Void> cb = readLogEndOffsetCallbacks.poll();
                            cb.onCompletion(null, null);
                        }
                    }
```

### DataFlowIssue
Method invocation `offset` may produce `NullPointerException`
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/SubmittedRecords.java`
#### Snippet
```java
        Map<String, Object> result = null;
        while (canCommitHead(queuedRecords)) {
            result = queuedRecords.poll().offset();
        }
        return result;
```

### DataFlowIssue
Unboxing of `maxOffset` may produce `NullPointerException`
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/EagerAssignor.java`
#### Snippet
```java
        log.debug("Max config offset root: {}, local snapshot config offsets root: {}",
                  maxOffset, coordinator.configSnapshot().offset());
        return maxOffset;
    }

```

### DataFlowIssue
Argument `parsedBootstrapServers` might be null
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java`
#### Snippet
```java
            @SuppressWarnings("unchecked")
            List<String> parsedBootstrapServers = (List<String>) ConfigDef.parseType(BOOTSTRAP_SERVERS_CONFIG, rawBootstrapServers, ConfigDef.Type.LIST);
            producerBootstrapServers.addAll(parsedBootstrapServers);
        } catch (Exception e) {
            // Should never happen by this point, but if it does, make sure to present a readable error message to the user
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `connect/runtime/src/main/java/org/apache/kafka/connect/converters/NumberConverter.java`
#### Snippet
```java
            return serializer.serialize(topic, value == null ? null : cast(value));
        } catch (ClassCastException e) {
            throw new DataException("Failed to serialize to " + typeName + " (was " + value.getClass() + "): ", e);
        } catch (SerializationException e) {
            throw new DataException("Failed to serialize to " + typeName + ": ", e);
```

### DataFlowIssue
Unboxing of `parseType( transactionTimeoutConfigKey, originals().get(transactionTimeoutConfigKey), Ty...` may produce `NullPointerException`
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
        final long commitInterval = getLong(COMMIT_INTERVAL_MS_CONFIG);
        final String transactionTimeoutConfigKey = producerPrefix(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG);
        final int transactionTimeout = originals().containsKey(transactionTimeoutConfigKey) ? (int) parseType(
            transactionTimeoutConfigKey, originals().get(transactionTimeoutConfigKey), Type.INT) : DEFAULT_TRANSACTION_TIMEOUT;

        if (transactionTimeout < commitInterval) {
```

### DataFlowIssue
Method invocation `materialized` may produce `NullPointerException`
in `streams/src/main/java/org/apache/kafka/streams/kstream/internals/graph/StreamToTableNode.java`
#### Snippet
```java
        topologyBuilder.addProcessor(processorName, processorParameters.processorSupplier(), parentNodeNames());

        if (storeBuilder != null && tableSource.materialized()) {
            topologyBuilder.addStateStore(storeBuilder, processorName);
        }
```

### DataFlowIssue
Method invocation `valueSerde` may produce `NullPointerException`
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/SerdeGetter.java`
#### Snippet
```java
    public Serde valueSerde() {
        return oldProcessorContext != null ? oldProcessorContext.valueSerde() :
            newProcessorContext != null ? newProcessorContext.valueSerde() : stateStorecontext.valueSerde();
    }

```

### DataFlowIssue
Method invocation `keySerde` may produce `NullPointerException`
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/SerdeGetter.java`
#### Snippet
```java
    public Serde keySerde() {
        return oldProcessorContext != null ? oldProcessorContext.keySerde() :
            newProcessorContext != null ? newProcessorContext.keySerde() : stateStorecontext.keySerde();
    }
    public Serde valueSerde() {
```

### DataFlowIssue
Method invocation `getString` may produce `NullPointerException`
in `trogdor/src/main/java/org/apache/kafka/trogdor/agent/Agent.java`
#### Snippet
```java
            }
        }
        String configPath = res.getString("config");
        String nodeName = res.getString("node_name");
        String taskSpec = res.getString("task_spec");
```

### DataFlowIssue
Dereference of `exc` may produce `NullPointerException`
in `trogdor/src/main/java/org/apache/kafka/trogdor/rest/JsonRestServer.java`
#### Snippet
```java
            }
        }
        throw exc;
    }

```

### DataFlowIssue
Dereference of `lastException` may produce `NullPointerException`
in `trogdor/src/main/java/org/apache/kafka/trogdor/common/WorkerUtils.java`
#### Snippet
```java
            }
        }
        throw lastException;
    }

```

### DataFlowIssue
Method invocation `getString` may produce `NullPointerException`
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/Coordinator.java`
#### Snippet
```java
            }
        }
        String configPath = res.getString("config");
        String nodeName = res.getString("node_name");

```

### DataFlowIssue
Switch label `MATCH_TYPE_EXACT` is unreachable
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
            }
            switch (component.matchType()) {
                case MATCH_TYPE_EXACT:
                    if (component.match() == null) {
                        throw new InvalidRequestException("Request specified " +
```

### DataFlowIssue
Switch label `MATCH_TYPE_DEFAULT` is unreachable
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
                    exactMatch.put(component.entityType(), component.match());
                    break;
                case MATCH_TYPE_DEFAULT:
                    if (component.match() != null) {
                        throw new InvalidRequestException("Request specified " +
```

### DataFlowIssue
Switch label `MATCH_TYPE_SPECIFIED` is unreachable
in `metadata/src/main/java/org/apache/kafka/image/ClientQuotasImage.java`
#### Snippet
```java
                    exactMatch.put(component.entityType(), null);
                    break;
                case MATCH_TYPE_SPECIFIED:
                    if (component.match() != null) {
                        throw new InvalidRequestException("Request specified " +
```

### DataFlowIssue
Method invocation `spec` may produce `NullPointerException`
in `trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
                } else {
                    System.out.printf("Task %s of type %s is %s. %s%n", taskId,
                        taskState.spec().getClass().getCanonicalName(),
                        taskState.stateType(), prettyPrintTaskInfo(taskState, localOffset));
                    if (taskState instanceof TaskDone) {
```

### DataFlowIssue
Condition `record instanceof FeatureLevelRecord` is redundant and can be replaced with a null check
in `metadata/src/main/java/org/apache/kafka/metadata/bootstrap/BootstrapMetadata.java`
#### Snippet
```java

    public static Optional<MetadataVersion> recordToMetadataVersion(ApiMessage record) {
        if (record instanceof FeatureLevelRecord) {
            FeatureLevelRecord featureLevel = (FeatureLevelRecord) record;
            if (featureLevel.name().equals(MetadataVersion.FEATURE_NAME)) {
```

### DataFlowIssue
Method invocation `mechanisms` may produce `NullPointerException`
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationZkWriter.java`
#### Snippet
```java
            public void visitScramCredential(String userName, ScramMechanism scramMechanism, ScramCredential scramCredential) {
                // For each ZK entity, see if it exists in the image and if it's equal
                ScramCredentialData data = scramImage.mechanisms().getOrDefault(scramMechanism, Collections.emptyMap()).get(userName);
                if (data == null || !data.toCredential(scramMechanism).equals(scramCredential)) {
                    changedUsers.add(userName);
```

### DataFlowIssue
Method invocation `entities` may produce `NullPointerException`
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationZkWriter.java`
#### Snippet
```java

        changedNonUserEntities.forEach(entity -> {
            Map<String, Double> quotaMap = clientQuotasImage.entities().getOrDefault(entity, ClientQuotaImage.EMPTY).quotaMap();
            opConsumer.accept(UPDATE_CLIENT_QUOTA, "Update client quotas for " + entity, migrationState ->
                migrationClient.configClient().writeClientQuotas(entity.entries(), quotaMap, Collections.emptyMap(), migrationState));
```

### DataFlowIssue
Method invocation `entities` may produce `NullPointerException`
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationZkWriter.java`
#### Snippet
```java
        changedUsers.forEach(userName -> {
            ClientQuotaEntity entity = new ClientQuotaEntity(Collections.singletonMap(ClientQuotaEntity.USER, userName));
            Map<String, Double> quotaMap = clientQuotasImage.entities().
                getOrDefault(entity, ClientQuotaImage.EMPTY).quotaMap();
            Map<String, String> scramMap = getScramCredentialStringsForUser(scramImage, userName);
```

### DataFlowIssue
Method invocation `entities` may produce `NullPointerException`
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationZkWriter.java`
#### Snippet
```java
                entityDataList.forEach(entityData -> entityMap.put(entityData.entityType(), entityData.entityName()));
                ClientQuotaEntity entity = new ClientQuotaEntity(entityMap);
                if (!clientQuotasImage.entities().getOrDefault(entity, ClientQuotaImage.EMPTY).quotaMap().equals(quotas)) {
                    if (entity.entries().containsKey(ClientQuotaEntity.USER) &&
                        !entity.entries().containsKey(ClientQuotaEntity.CLIENT_ID)) {
```

### DataFlowIssue
Variable is already assigned to this value
in `server-common/src/main/java/org/apache/kafka/queue/KafkaEventQueue.java`
#### Snippet
```java
                                // rather than a timeout.)
                                remove(eventContext);
                                toDeliver = null;
                                toRun = eventContext;
                            } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `server-common/src/main/java/org/apache/kafka/queue/KafkaEventQueue.java`
#### Snippet
```java
                            toDeliver = new InterruptedException("The event handler thread is interrupted");
                        } else {
                            toDeliver = null;
                        }
                        toRun = head.next;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'MESSAGE_FORMAT_VERSION_DOC' is still used
in `clients/src/main/java/org/apache/kafka/common/config/TopicConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String MESSAGE_FORMAT_VERSION_DOC = "[DEPRECATED] Specify the message format version the broker " +
        "will use to append messages to the logs. The value of this config is always assumed to be `3.0` if " +
        "`inter.broker.protocol.version` is 3.0 or higher (the actual config value is ignored). Otherwise, the value should " +
```

### DeprecatedIsStillUsed
Deprecated member 'NotLeaderForPartitionException' is still used
in `clients/src/main/java/org/apache/kafka/common/errors/NotLeaderForPartitionException.java`
#### Snippet
```java
 */
@Deprecated
public class NotLeaderForPartitionException extends InvalidMetadataException {

    private static final long serialVersionUID = 1L;
```

### DeprecatedIsStillUsed
Deprecated member 'createIOThreadRatioMeterLegacy' is still used
in `clients/src/main/java/org/apache/kafka/common/network/Selector.java`
#### Snippet
```java
         */
        @Deprecated
        private Meter createIOThreadRatioMeterLegacy(Metrics metrics, String groupName,  Map<String, String> metricTags,
                String baseName, String action) {
            MetricName rateMetricName = metrics.metricName(baseName + "-ratio", groupName,
```

### DeprecatedIsStillUsed
Deprecated member 'LogDirInfo' is still used
in `clients/src/main/java/org/apache/kafka/common/requests/DescribeLogDirsResponse.java`
#### Snippet
```java
     */
    @Deprecated
    static public class LogDirInfo {
        public final Errors error;
        public final Map<TopicPartition, ReplicaInfo> replicaInfos;
```

### DeprecatedIsStillUsed
Deprecated member 'onNewBatch' is still used
in `clients/src/main/java/org/apache/kafka/clients/producer/Partitioner.java`
#### Snippet
```java
     */
    @Deprecated
    default void onNewBatch(String topic, Cluster cluster, int prevPartition) {
    }
}
```

### DeprecatedIsStillUsed
Deprecated member 'UniformStickyPartitioner' is still used
in `clients/src/main/java/org/apache/kafka/clients/producer/UniformStickyPartitioner.java`
#### Snippet
```java
 */
@Deprecated
public class UniformStickyPartitioner implements Partitioner {

    private final StickyPartitionCache stickyPartitionCache = new StickyPartitionCache();
```

### DeprecatedIsStillUsed
Deprecated member 'onPartitionsAssigned' is still used
in `connect/api/src/main/java/org/apache/kafka/connect/sink/SinkTask.java`
#### Snippet
```java
     */
    @Deprecated
    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'onPartitionsRevoked' is still used
in `connect/api/src/main/java/org/apache/kafka/connect/sink/SinkTask.java`
#### Snippet
```java
     */
    @Deprecated
    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'USE_INCREMENTAL_ALTER_CONFIGS' is still used
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorSourceConfig.java`
#### Snippet
```java
    public static final long SYNC_TOPIC_CONFIGS_INTERVAL_SECONDS_DEFAULT = 10 * 60;
    @Deprecated
    public static final String USE_INCREMENTAL_ALTER_CONFIGS = "use.incremental.alter.configs";
    private static final String USE_INCREMENTAL_ALTER_CONFIG_DOC = "Deprecated. Which API to use for syncing topic configs. " +
            "The valid values are 'requested', 'required' and 'never'. " +
```

### DeprecatedIsStillUsed
Deprecated member 'AUTO_INCLUDE_JMX_REPORTER_CONFIG' is still used
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/WorkerConfig.java`
#### Snippet
```java

    @Deprecated
    public static final String AUTO_INCLUDE_JMX_REPORTER_CONFIG = CommonClientConfigs.AUTO_INCLUDE_JMX_REPORTER_CONFIG;

    public static final String TOPIC_TRACKING_ENABLE_CONFIG = "topic.tracking.enable";
```

### DeprecatedIsStillUsed
Deprecated member 'KafkaStatusBackingStore' is still used
in `connect/runtime/src/main/java/org/apache/kafka/connect/storage/KafkaStatusBackingStore.java`
#### Snippet
```java

    @Deprecated
    public KafkaStatusBackingStore(Time time, Converter converter) {
        this(time, converter, null, "connect-distributed-");
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_MESSAGE_FORMAT_VERSION' is still used
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogConfig.java`
#### Snippet
```java
    /* See `TopicConfig.MESSAGE_FORMAT_VERSION_CONFIG` for details */
    @Deprecated
    public static final String DEFAULT_MESSAGE_FORMAT_VERSION = IBP_3_0_IV1.version();

    // Leave these out of TopicConfig for now as they are replication quota configs
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_WINDOWED_KEY_SERDE_INNER_CLASS' is still used
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
    @SuppressWarnings("WeakerAccess")
    @Deprecated
    public static final String DEFAULT_WINDOWED_KEY_SERDE_INNER_CLASS = "default.windowed.key.serde.inner";
    private static final String DEFAULT_WINDOWED_KEY_SERDE_INNER_CLASS_DOC = "Default serializer / deserializer for the inner class of a windowed key. Must implement the " +
        "<code>org.apache.kafka.common.serialization.Serde</code> interface.";
```

### DeprecatedIsStillUsed
Deprecated member 'AUTO_INCLUDE_JMX_REPORTER_CONFIG' is still used
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
    /** {@code auto.include.jmx.reporter} */
    @Deprecated
    public static final String AUTO_INCLUDE_JMX_REPORTER_CONFIG = CommonClientConfigs.AUTO_INCLUDE_JMX_REPORTER_CONFIG;

    /** {@code num.standby.replicas} */
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_WINDOWED_VALUE_SERDE_INNER_CLASS' is still used
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
    @SuppressWarnings("WeakerAccess")
    @Deprecated
    public static final String DEFAULT_WINDOWED_VALUE_SERDE_INNER_CLASS = "default.windowed.value.serde.inner";
    private static final String DEFAULT_WINDOWED_VALUE_SERDE_INNER_CLASS_DOC = "Default serializer / deserializer for the inner class of a windowed value. Must implement the " +
        "<code>org.apache.kafka.common.serialization.Serde</code> interface.";
```

### DeprecatedIsStillUsed
Deprecated member 'CACHE_MAX_BYTES_BUFFERING_CONFIG' is still used
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
    @SuppressWarnings("WeakerAccess")
    @Deprecated
    public static final String CACHE_MAX_BYTES_BUFFERING_CONFIG = "cache.max.bytes.buffering";
    public static final String CACHE_MAX_BYTES_BUFFERING_DOC = "Maximum number of memory bytes to be used for buffering across all threads";

```

### DeprecatedIsStillUsed
Deprecated member 'RETRIES_CONFIG' is still used
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
    @SuppressWarnings("WeakerAccess")
    @Deprecated
    public static final String RETRIES_CONFIG = CommonClientConfigs.RETRIES_CONFIG;

    /** {@code retry.backoff.ms} */
```

### DeprecatedIsStillUsed
Deprecated member 'EXACTLY_ONCE_BETA' is still used
in `streams/src/main/java/org/apache/kafka/streams/StreamsConfig.java`
#### Snippet
```java
    @SuppressWarnings("WeakerAccess")
    @Deprecated
    public static final String EXACTLY_ONCE_BETA = "exactly_once_beta";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'withTimeDifferenceAndGrace' is still used
in `streams/src/main/java/org/apache/kafka/streams/kstream/SlidingWindows.java`
#### Snippet
```java
     */
    @Deprecated
    public static SlidingWindows withTimeDifferenceAndGrace(final Duration timeDifference, final Duration grace) throws IllegalArgumentException {
        final String msgPrefixSize = prepareMillisCheckFailMsgPrefix(timeDifference, "timeDifference");
        final long timeDifferenceMs = validateMillisecondDuration(timeDifference, msgPrefixSize);
```

### DeprecatedIsStillUsed
Deprecated member 'topicGroupId' is still used
in `streams/src/main/java/org/apache/kafka/streams/processor/TaskId.java`
#### Snippet
```java
    /** The ID of the subtopology, aka topicGroupId. */
    @Deprecated
    public final int topicGroupId;
    /** The ID of the partition. */
    @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'AbstractProcessor' is still used
in `streams/src/main/java/org/apache/kafka/streams/processor/AbstractProcessor.java`
#### Snippet
```java
 */
@Deprecated
public abstract class AbstractProcessor<K, V> implements Processor<K, V> {

    protected ProcessorContext context;
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `metadata/src/main/java/org/apache/kafka/metadata/util/BatchFileReader.java`
#### Snippet
```java
            log.error("Error closing fileRecords", e);
        }
        this.batchIterator = Collections.<FileChannelRecordBatch>emptyList().iterator();
    }
}
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/PositionSerde.java`
#### Snippet
```java
        final byte version = buffer.get();

        switch (version) {
            case (byte) 0: // actual position, v0
                final int nTopics = buffer.getInt();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `streams/src/main/java/org/apache/kafka/streams/state/internals/OffsetCheckpoint.java`
#### Snippet
```java
            try (final BufferedReader reader = Files.newBufferedReader(file.toPath())) {
                final int version = readInt(reader);
                switch (version) {
                    case 0:
                        int expectedSize = readInt(reader);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/ChangelogRecordDeserializationHelper.java`
#### Snippet
```java
            return;
        } else {
            switch (versionHeader.value()[0]) {
                case 0:
                    final Header vectorHeader = record.headers().lastHeader(CHANGELOG_POSITION_HEADER_KEY);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `metadata/src/main/java/org/apache/kafka/metadata/util/SnapshotFileReader.java`
#### Snippet
```java
                short typeId = ControlRecordType.parseTypeId(record.key());
                ControlRecordType type = ControlRecordType.fromTypeId(typeId);
                switch (type) {
                    case LEADER_CHANGE:
                        LeaderChangeMessage message = new LeaderChangeMessage();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `metadata/src/main/java/org/apache/kafka/metadata/migration/KRaftMigrationDriver.java`
#### Snippet
```java
        @Override
        public void run() throws Exception {
            switch (migrationState) {
                case WAIT_FOR_BROKERS:
                    if (areZkBrokersReadyForMigration()) {
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/events/ApplicationEvent.java`
#### Snippet
```java
     * process the application event. Return true upon successful execution,
     * false otherwise.
     * @return true if the event was successfully executed; false otherwise.
     */

```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/events/ApplicationEvent.java`
#### Snippet
```java
     * process the application event. Return true upon successful execution,
     * false otherwise.
     * @return true if the event was successfully executed; false otherwise.
     */

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `clients/src/main/java/org/apache/kafka/common/utils/Checksums.java`
#### Snippet
```java
                buffer.position(start);
                BYTE_BUFFER_UPDATE.invokeExact(checksum, buffer);
            } catch (Throwable t) {
                handleUpdateThrowable(t);
            } finally {
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `clients/src/main/java/org/apache/kafka/common/utils/Checksums.java`
#### Snippet
```java
                byteBufferUpdate = MethodHandles.publicLookup().findVirtual(Checksum.class, "update",
                    MethodType.methodType(void.class, ByteBuffer.class));
            } catch (Throwable t) {
                handleUpdateThrowable(t);
            }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `storage/src/main/java/org/apache/kafka/server/log/remote/metadata/storage/RemoteLogMetadataSnapshotFile.java`
#### Snippet
```java
        }

        try (ReadableByteChannel channel = Channels.newChannel(new FileInputStream(metadataStoreFile))) {

            // header: <version:short><metadata-partition:int><metadata-partition-offset:long>
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `shell/src/main/java/org/apache/kafka/shell/command/LsCommandHandler.java`
#### Snippet
```java
                    if (node.isDirectory()) {
                        List<String> children = new ArrayList<>();
                        children.addAll(node.childNames());
                        targetDirectories.add(
                            new TargetDirectory(info.lastPathComponent(), children));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `clients/src/main/java/org/apache/kafka/common/config/AbstractConfig.java`
#### Snippet
```java
        Map<String, String> indirectVariables = extractPotentialVariables(originals);

        resolvedOriginals.putAll(originals);
        if (configProviderProps == null || configProviderProps.isEmpty()) {
            providerConfigString = indirectVariables;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/CommitRequestManager.java`
#### Snippet
```java

            // Add all unsent offset commit requests to the unsentRequests list
            unsentRequests.addAll(
                    unsentOffsetCommits.stream()
                            .map(OffsetCommitRequestState::toUnsentRequest)
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorCheckpointConnector.java`
#### Snippet
```java
        List<String> consumerGroups = findConsumerGroups();
        Set<String> newConsumerGroups = new HashSet<>();
        newConsumerGroups.addAll(consumerGroups);
        newConsumerGroups.removeAll(knownConsumerGroups);
        Set<String> deadConsumerGroups = new HashSet<>();
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorCheckpointConnector.java`
#### Snippet
```java
        newConsumerGroups.removeAll(knownConsumerGroups);
        Set<String> deadConsumerGroups = new HashSet<>();
        deadConsumerGroups.addAll(knownConsumerGroups);
        deadConsumerGroups.removeAll(consumerGroups);
        if (!newConsumerGroups.isEmpty() || !deadConsumerGroups.isEmpty()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
    Map<String, Object> targetAdminConfig(String role) {
        Map<String, Object> props = new HashMap<>();
        props.putAll(originalsWithPrefix(TARGET_CLUSTER_PREFIX));
        props.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        props.putAll(originalsWithPrefix(ADMIN_CLIENT_PREFIX));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
    static Map<String, Object> sourceConsumerConfig(Map<String, ?> props) {
        Map<String, Object> result = new HashMap<>();
        result.putAll(Utils.entriesWithPrefix(props, SOURCE_CLUSTER_PREFIX));
        result.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        result.putAll(Utils.entriesWithPrefix(props, CONSUMER_CLIENT_PREFIX));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
    Map<String, Object> targetProducerConfig(String role) {
        Map<String, Object> props = new HashMap<>();
        props.putAll(originalsWithPrefix(TARGET_CLUSTER_PREFIX));
        props.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        props.putAll(originalsWithPrefix(PRODUCER_CLIENT_PREFIX));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
    Map<String, Object> sourceProducerConfig(String role) {
        Map<String, Object> props = new HashMap<>();
        props.putAll(originalsWithPrefix(SOURCE_CLUSTER_PREFIX));
        props.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        props.putAll(originalsWithPrefix(PRODUCER_CLIENT_PREFIX));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
    Map<String, Object> sourceAdminConfig(String role) {
        Map<String, Object> props = new HashMap<>();
        props.putAll(originalsWithPrefix(SOURCE_CLUSTER_PREFIX));
        props.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        props.putAll(originalsWithPrefix(ADMIN_CLIENT_PREFIX));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorConnectorConfig.java`
#### Snippet
```java
    Map<String, Object> targetConsumerConfig(String role) {
        Map<String, Object> props = new HashMap<>();
        props.putAll(originalsWithPrefix(TARGET_CLUSTER_PREFIX));
        props.keySet().retainAll(MirrorClientConfig.CLIENT_CONFIG_DEF.names());
        props.putAll(originalsWithPrefix(CONSUMER_CLIENT_PREFIX));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorMakerConfig.java`
#### Snippet
```java
        Map<String, String> props = new HashMap<>();

        props.putAll(rawProperties);
        props.keySet().retainAll(allConfigNames());
        
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror/src/main/java/org/apache/kafka/connect/mirror/MirrorMakerConfig.java`
#### Snippet
```java
        Map<String, String> props = new HashMap<>();

        props.putAll(stringsWithPrefixStripped(cluster + "."));

        for (String k : MirrorClientConfig.CLIENT_CONFIG_DEF.names()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/ConnectMetrics.java`
#### Snippet
```java

        Map<String, Object> contextLabels = new HashMap<>();
        contextLabels.putAll(config.originalsWithPrefix(CommonClientConfigs.METRICS_CONTEXT_PREFIX));
        contextLabels.put(WorkerConfig.CONNECT_KAFKA_CLUSTER_ID, clusterId);
        Object groupId = config.originals().get(DistributedConfig.GROUP_ID_CONFIG);
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/WorkerGroupMember.java`
#### Snippet
```java

            Map<String, Object> contextLabels = new HashMap<>();
            contextLabels.putAll(config.originalsWithPrefix(CommonClientConfigs.METRICS_CONTEXT_PREFIX));
            contextLabels.put(WorkerConfig.CONNECT_KAFKA_CLUSTER_ID, config.kafkaClusterId());
            contextLabels.put(WorkerConfig.CONNECT_GROUP_ID, config.getString(DistributedConfig.GROUP_ID_CONFIG));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `connect/mirror-client/src/main/java/org/apache/kafka/connect/mirror/MirrorClientConfig.java`
#### Snippet
```java
    private Map<String, Object> clientConfig(String prefix) {
        Map<String, Object> props = new HashMap<>();
        props.putAll(valuesWithPrefixOverride(prefix));
        props.keySet().retainAll(CLIENT_CONFIG_DEF.names());
        props.entrySet().removeIf(x -> x.getValue() == null);
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/TopicsSpec.java`
#### Snippet
```java
    public TopicsSpec immutableCopy() {
        HashMap<String, PartitionsSpec> mapCopy = new HashMap<>();
        mapCopy.putAll(map);
        return new TopicsSpec(Collections.unmodifiableMap(mapCopy));
    }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `RocksDBDualCFIterator` may be 'static'
in `streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBTimestampedStore.java`
#### Snippet
```java
    }

    private class RocksDBDualCFIterator extends AbstractIterator<KeyValue<Bytes, byte[]>>
        implements ManagedKeyValueIterator<Bytes, byte[]> {

```

### InnerClassMayBeStatic
Inner class `ClaimableConnection` may be 'static'
in `trogdor/src/main/java/org/apache/kafka/trogdor/workload/SustainedConnectionWorker.java`
#### Snippet
```java
    }

    private abstract class ClaimableConnection implements SustainedConnection {

        protected long nextUpdate = 0;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java`
#### Snippet
```java
                                                recordsToDelete.partitions().stream().map(partitionsToDelete ->
                                                    new TopicPartition(recordsToDelete.name(), partitionsToDelete.partitionIndex()))
                                    ).map(futures::get);
                            completeAllExceptionally(callFutures, throwable);
                        }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogConfig.java`
#### Snippet
```java
        Map<String, Object> overriddenTopicProps = new HashMap<>();
        props.forEach((k, v) -> {
            if (overriddenConfigs.contains(k))
                overriddenTopicProps.put((String) k, v);
        });
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `storage/src/main/java/org/apache/kafka/storage/internals/log/LogConfig.java`
#### Snippet
```java
        List<String> names = configNames();
        for (Object name : props.keySet())
            if (!names.contains(name))
                throw new InvalidConfigurationException("Unknown topic config name: " + name);
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.remove()'
in `streams/src/main/java/org/apache/kafka/streams/KafkaStreams.java`
#### Snippet
```java
    private void defaultStreamsUncaughtExceptionHandler(final Throwable throwable, final boolean skipThreadReplacement) {
        if (oldHandler) {
            threads.remove(Thread.currentThread());
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException) throwable;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `server-common/src/main/java/org/apache/kafka/server/util/TranslatedValueMapView.java`
#### Snippet
```java
    @Override
    public V get(Object key) {
        if (!underlyingMap.containsKey(key)) return null;
        B value = underlyingMap.get(key);
        return valueMapping.apply(value);
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `server-common/src/main/java/org/apache/kafka/server/util/TranslatedValueMapView.java`
#### Snippet
```java
            if (!(o instanceof Entry)) return false;
            Entry other = (Entry) o;
            if (!underlyingMap.containsKey(other.getKey())) return false;
            B value = underlyingMap.get(other.getKey());
            V translatedValue = valueMapping.apply(value);
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `server-common/src/main/java/org/apache/kafka/server/util/TranslatedValueMapView.java`
#### Snippet
```java
            Entry other = (Entry) o;
            if (!underlyingMap.containsKey(other.getKey())) return false;
            B value = underlyingMap.get(other.getKey());
            V translatedValue = valueMapping.apply(value);
            return Objects.equals(translatedValue, other.getValue());
```

### SuspiciousMethodCalls
Suspicious call to 'BlockingQueue.contains()'
in `server-common/src/main/java/org/apache/kafka/server/util/KafkaScheduler.java`
#### Snippet
```java
    public boolean taskRunning(ScheduledFuture<?> task) {
        ScheduledThreadPoolExecutor e = executor;
        return e != null && e.getQueue().contains(task);
    }
}
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `config.format`
in `connect/transforms/src/main/java/org/apache/kafka/connect/transforms/TimestampConverter.java`
#### Snippet
```java
            @Override
            public String toType(Config config, Date orig) {
                synchronized (config.format) {
                    return config.format.format(orig);
                }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'value.isEmpty()' covered by subsequent condition 'value.length() \<= 1'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerUnsecuredLoginCallbackHandler.java`
#### Snippet
```java

    private String listJsonText(String value) {
        if (value.isEmpty() || value.length() <= 1)
            return "[]";
        String delimiter;
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosShortNamer.java`
#### Snippet
```java
     * A pattern for parsing a auth_to_local rule.
     */
    private static final Pattern RULE_PARSER = Pattern.compile("((DEFAULT)|((RULE:\\[(\\d*):([^\\]]*)](\\(([^)]*)\\))?(s/([^/]*)/([^/]*)/(g)?)?/?(L|U)?)))");

    /* Rules for the translation of the principal name into an operating system name */
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `clients/src/main/java/org/apache/kafka/clients/consumer/internals/TopicMetadataFetcher.java`
#### Snippet
```java
                            // if a requested topic is unknown, we just continue and let it be absent
                            // in the returned map
                            continue;
                        else if (error.exception() instanceof RetriableException)
                            shouldRetry = true;
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/TransactionManager.java`
#### Snippet
```java
                        || error == Errors.COORDINATOR_LOAD_IN_PROGRESS) {
                    // If the topic is unknown or the coordinator is loading, retry with the current coordinator
                    continue;
                } else if (error == Errors.GROUP_AUTHORIZATION_FAILED) {
                    abortableError(GroupAuthorizationException.forGroupId(builder.data.groupId()));
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `clients/src/main/java/org/apache/kafka/clients/producer/internals/TransactionManager.java`
#### Snippet
```java

                if (error == Errors.NONE) {
                    continue;
                } else if (error == Errors.COORDINATOR_NOT_AVAILABLE || error == Errors.NOT_COORDINATOR) {
                    lookupCoordinator(FindCoordinatorRequest.CoordinatorType.TRANSACTION, transactionalId);
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `connect/runtime/src/main/java/org/apache/kafka/connect/util/KafkaBasedLog.java`
#### Snippet
```java
                    } catch (WakeupException e) {
                        // See previous comment, both possible causes of this wakeup are handled by starting this loop again
                        continue;
                    }
                }
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `maybeCleanEmptyNamedTopologyDirs()` not thrown
in `streams/src/main/java/org/apache/kafka/streams/processor/internals/StateDirectory.java`
#### Snippet
```java
        }
        // Ok to ignore returned exception as it should be swallowed
        maybeCleanEmptyNamedTopologyDirs(true);
    }

```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/publisher/SnapshotGenerator.java`
#### Snippet
```java
                    emitter.maybeEmit(image);
                } catch (Throwable e) {
                    faultHandler.handleFault("KRaft snapshot file generation error", e);
                }
            }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                    delta.replay(record.message());
                } catch (Throwable e) {
                    faultHandler.handleFault("Error loading metadata log record from offset " +
                            batch.baseOffset() + indexWithinBatch, e);
                }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                    publisher.onControllerChange(currentLeaderAndEpoch);
                } catch (Throwable e) {
                    faultHandler.handleFault("Unhandled error publishing the new leader " +
                        "change to " + currentLeaderAndEpoch + " with publisher " +
                        publisher.name(), e);
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                    initializeNewPublishers();
                } catch (Throwable e) {
                    faultHandler.handleFault("Unhandled error initializing new publishers", e);
                }
            });
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
            publisher.close();
        } catch (Throwable e) {
            faultHandler.handleFault("Got unexpected exception while closing " +
                    "publisher " + publisher.name(), e);
        }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                    image = delta.apply(manifest.provenance());
                } catch (Throwable e) {
                    faultHandler.handleFault("Error generating new metadata image from " +
                        "metadata delta between offset " + image.offset() +
                            " and " + manifest.provenance().lastContainedOffset(), e);
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                        publisher.onMetadataUpdate(delta, image, manifest);
                    } catch (Throwable e) {
                        faultHandler.handleFault("Unhandled error publishing the new metadata " +
                            "image ending at " + manifest.provenance().lastContainedOffset() +
                                " with publisher " + publisher.name(), e);
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                // This is a general catch-all block where we don't expect to end up;
                // failure-prone operations should have individual try/catch blocks around them.
                faultHandler.handleFault("Unhandled fault in MetadataLoader#handleCommit. " +
                    "Last image offset was " + image.offset(), e);
            } finally {
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                publishers.put(publisher.name(), publisher);
            } catch (Throwable e) {
                faultHandler.handleFault("Unhandled error initializing " + publisher.name() +
                        " with a snapshot at offset " + image.highestOffsetAndEpoch().offset(), e);
            }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                    image = delta.apply(manifest.provenance());
                } catch (Throwable e) {
                    faultHandler.handleFault("Error generating new metadata image from " +
                            "snapshot at offset " + reader.lastContainedLogOffset(), e);
                    return;
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                        publisher.onMetadataUpdate(delta, image, manifest);
                    } catch (Throwable e) {
                        faultHandler.handleFault("Unhandled error publishing the new metadata " +
                                "image from snapshot at offset " + reader.lastContainedLogOffset() +
                                    " with publisher " + publisher.name(), e);
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                // This is a general catch-all block where we don't expect to end up;
                // failure-prone operations should have individual try/catch blocks around them.
                faultHandler.handleFault("Unhandled fault in MetadataLoader#handleLoadSnapshot. " +
                        "Snapshot offset was " + reader.lastContainedLogOffset(), e);
            } finally {
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/image/loader/MetadataLoader.java`
#### Snippet
```java
                    delta.replay(record.message());
                } catch (Throwable e) {
                    faultHandler.handleFault("Error loading metadata log record " + snapshotIndex +
                            " in snapshot at offset " + reader.lastContainedLogOffset(), e);
                }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/metrics/ControllerMetadataMetricsPublisher.java`
#### Snippet
```java
                    publishDelta(delta);
                } catch (Throwable e) {
                    faultHandler.handleFault("Failed to publish controller metrics from log delta " +
                            " ending at offset " + manifest.provenance().lastContainedOffset(), e);
                } finally {
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/metrics/ControllerMetadataMetricsPublisher.java`
#### Snippet
```java
                    publishSnapshot(newImage);
                } catch (Throwable e) {
                    faultHandler.handleFault("Failed to publish controller metrics from " +
                            manifest.provenance().snapshotName(), e);
                } finally {
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
            cancelNextWriteNoOpRecord();
        } catch (Throwable e) {
            fatalFaultHandler.handleFault("exception while renouncing leadership", e);
        }
    }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        @Override
        public void abortMigration() {
            fatalFaultHandler.handleFault("Aborting the ZK migration");
            // TODO use KIP-868 transaction
        }
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
            queue.prepend(activationEvent);
        } catch (Throwable e) {
            fatalFaultHandler.handleFault("exception while claiming leadership", e);
        }
    }
```

### ThrowableNotThrown
Result of `handleEventException()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        @Override
        public void handleException(Throwable exception) {
            handleEventException(name, startProcessingTimeNs, exception);
        }

```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
        }
        if (isActiveController()) {
            nonFatalFaultHandler.handleFault(String.format("%s: failed with unexpected server " +
                    "exception %s at epoch %d in %d us. Renouncing leadership and reverting " +
                    "to the last committed offset %d.",
```

### ThrowableNotThrown
Result of `handleFault()` not thrown
in `metadata/src/main/java/org/apache/kafka/controller/QuorumController.java`
#### Snippet
```java
            renounce();
        } else {
            nonFatalFaultHandler.handleFault(String.format("%s: failed with unexpected server " +
                    "exception %s in %d us. The controller is already in standby mode.",
                    name, exception.getClass().getSimpleName(), deltaUs),
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/entities/PluginInfo.java`
#### Snippet
```java
    public static final class NoVersionFilter {
        // This method is used by Jackson to filter the version field for plugins that don't have a version
        public boolean equals(Object obj) {
            return DelegatingClassLoader.UNDEFINED_VERSION.equals(obj);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `connect/mirror-client/src/main/java/org/apache/kafka/connect/mirror/SourceAndTarget.java`
#### Snippet
```java

    @Override
    public boolean equals(Object other) {
        return other != null && toString().equals(other.toString());
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `server-common/src/main/java/org/apache/kafka/server/mutable/BoundedList.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return underlying.equals(o);
    }
```

## RuleId[id=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `clients/src/main/java/org/apache/kafka/clients/NetworkClient.java`
#### Snippet
```java
        if (SaslClientAuthenticator.isReserved(correlation)) {
            // the numeric overflow is fine as negative values is acceptable
            correlation = SaslClientAuthenticator.MAX_RESERVED_CORRELATION_ID + 1;
        }
        return correlation++;
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'unmap' to 'MethodHandle'
in `clients/src/main/java/org/apache/kafka/common/utils/ByteBufferUnmapper.java`
#### Snippet
```java
        }
        if (unmap != null) {
            UNMAP = (MethodHandle) unmap;
            UNMAP_NOT_SUPPORTED_EXCEPTION = null;
        } else {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'scopeClaimValue' to 'List'
in `clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/unsecured/OAuthBearerUnsecuredJws.java`
#### Snippet
```java
            return Collections.emptySet();
        @SuppressWarnings("unchecked")
        List<String> stringList = (List<String>) scopeClaimValue;
        Set<String> retval = new HashSet<>();
        for (String scope : stringList) {
```

