# async-shuffle-upload 
 
# Bad smells
I found 78 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 37 | false |
| OptionalUsedAsFieldOrParameterType | 18 | false |
| ConstantValue | 6 | false |
| AbstractClassNeverImplemented | 3 | false |
| DataFlowIssue | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ZeroLengthArrayInitialization | 2 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| Convert2MethodRef | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| BoundedWildcard | 1 | false |
| UnstableTypeUsedInSignature | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| UnnecessaryBoxing | 1 | false |
## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataSizedInput'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java

    private Optional<ShuffleUploadTaskMetrics> doWriteFilesAndClose(
            Optional<SizedInput> dataSizedInput,
            SizedInput indexSizedInput,
            int shuffleId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataSizedInput'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java

    private void doSubmitUpload(
            Optional<SizedInput> dataSizedInput,
            SizedInput indexSizedInput,
            int shuffleId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'customUploadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
    private final ScheduledExecutorService timeoutExecutorService;
    private final Optional<Clock> customClock;
    private final Optional<ExecutorService> customUploadExecutorService;
    private final Optional<ExecutorService> customDownloadExecutorService;
    private final Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'customClock'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
    private final ExecutorService enqueuerExecutorService;
    private final ScheduledExecutorService timeoutExecutorService;
    private final Optional<Clock> customClock;
    private final Optional<ExecutorService> customUploadExecutorService;
    private final Optional<ExecutorService> customDownloadExecutorService;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customClock'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
            SparkConf sparkConf,
            ShuffleExecutorComponents delegate,
            Optional<Clock> customClock,
            Supplier<SparkEnv> sparkEnvSupplier,
            Supplier<ShuffleFileLocator> shuffleFileLocatorSupplier,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customUploadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
            Supplier<ShuffleFileLocator> shuffleFileLocatorSupplier,
            Supplier<CompressionCodec> compressionCodecSupplier,
            Optional<ExecutorService> customUploadExecutorService,
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customDownloadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
            Supplier<CompressionCodec> compressionCodecSupplier,
            Optional<ExecutorService> customUploadExecutorService,
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
            Optional<Supplier<S3AsyncShuffleMetricsFactory>> metrics) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customUploadCoordinatorExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
            Optional<ExecutorService> customUploadExecutorService,
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
            Optional<Supplier<S3AsyncShuffleMetricsFactory>> metrics) {
        this.sparkConf = sparkConf;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'metrics'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
            Optional<Supplier<S3AsyncShuffleMetricsFactory>> metrics) {
        this.sparkConf = sparkConf;
        this.delegate = delegate;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'maybeClient'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java

    private SerializerManager serializerManager;
    private Optional<ShuffleClient> maybeClient;
    private boolean shouldCompressShuffle;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'maybeReadSupport'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java

    // Read support is split off primarily to reduce the number of lines in the class.
    private Optional<S3AsyncShuffleReadSupport> maybeReadSupport;

    public S3AsyncShuffleExecutorComponents(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'customUploadCoordinatorExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
    private final Optional<ExecutorService> customUploadExecutorService;
    private final Optional<ExecutorService> customDownloadExecutorService;
    private final Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService;
    private final Supplier<SparkEnv> sparkEnvSupplier;
    private final Supplier<ShuffleFileLocator> shuffleFileLocatorSupplier;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'customDownloadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
    private final Optional<Clock> customClock;
    private final Optional<ExecutorService> customUploadExecutorService;
    private final Optional<ExecutorService> customDownloadExecutorService;
    private final Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService;
    private final Supplier<SparkEnv> sparkEnvSupplier;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customUploadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java

    private static ExecutorService resolveUploadExecutor(
            Optional<ExecutorService> customUploadExecutorService,
            BaseHadoopShuffleClientConfiguration baseConfig) {
        return customUploadExecutorService.orElseGet(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customDownloadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java

    private static ExecutorService resolveDownloadExecutor(
            Optional<ExecutorService> customDownloadExecutorService,
            BaseHadoopShuffleClientConfiguration baseConfig) {
        return customDownloadExecutorService.orElseGet(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customUploadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java
            ShuffleDriverEndpointRef driverEndpointRef,
            Clock clock,
            Optional<ExecutorService> customUploadExecutorService,
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customDownloadExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java
            Clock clock,
            Optional<ExecutorService> customUploadExecutorService,
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
            S3AsyncShuffleMetrics metrics) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customUploadCoordinatorExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java
            Optional<ExecutorService> customUploadExecutorService,
            Optional<ExecutorService> customDownloadExecutorService,
            Optional<ScheduledExecutorService> customUploadCoordinatorExecutorService,
            S3AsyncShuffleMetrics metrics) {
        BaseHadoopShuffleClientConfiguration baseConfig = BaseHadoopShuffleClientConfiguration.of(sparkConf);
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getShuffleBlockId` may produce `NullPointerException`
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
            try {
                BlockDataResult result = fetchResults.poll(TIMEOUT.getSeconds(), TimeUnit.SECONDS);
                activeFetchRequests.remove(result.getShuffleBlockId());
                return result.getResult();
            } catch (InterruptedException e) {
```

### DataFlowIssue
Method invocation `ifPresent` may produce `NullPointerException`
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
        @Override
        public void onSuccess(Optional<ShuffleUploadTaskMetrics> maybeUploadTaskMetrics) {
            maybeUploadTaskMetrics.ifPresent(uploadTaskMetrics ->
                    this.metrics.markUploadCompleted(
                            shuffleId,
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/util/SizedInput.java`
#### Snippet
```java

/**
 * Extension to {@link java.io.InputStream} that allows getting the number of bytes
 * the stream will provide.
 */
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
        long totalSize = dataSizedInput
                .map(input -> indexSizedInput.getStreamSizeInBytes() + input.getStreamSizeInBytes())
                .orElseGet(() -> indexSizedInput.getStreamSizeInBytes());
        long now = clock.millis();
        return Optional.of(
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `shufflePartitionWriters` are updated, but never queried
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleMapOutputWriter.java`
#### Snippet
```java
    private final ShuffleClient shuffleClient;
    private final ShuffleFileLocator shuffleFileLocator;
    private final Set<ShufflePartitionWriter> shufflePartitionWriters;
    private final int shuffleId;
    private final int mapId;
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/FallbackToS3ShuffleIterator.java`
#### Snippet
```java
                    ShuffleBlockId resolvedBlockId = convertBlockId(resultBlock);
                    remainingAttemptsByBlock.remove(resolvedBlockId);
                } catch (RuntimeException | Error e) {

                    throw e;
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `writeThrougputBytesPerSec` is redundant
in `async-shuffle-upload-data-generator/src/main/java/com/palantir/spark/shuffle/async/s3/client/AsyncShuffleBenchmark.java`
#### Snippet
```java

        double totalBytes = numBytesInPartition * numFiles * numPartitions;
        double writeThrougputBytesPerSec =
                totalBytes / Duration.ofMillis(System.currentTimeMillis() - startMillis).getSeconds();

```

### UnnecessaryLocalVariable
Local variable `readThrougputBytesPerSec` is redundant
in `async-shuffle-upload-data-generator/src/main/java/com/palantir/spark/shuffle/async/s3/client/AsyncShuffleBenchmark.java`
#### Snippet
```java
        }
        double totalBytes = numBytesInPartition * numFiles * numPartitions;
        double readThrougputBytesPerSec =
                totalBytes / Duration.ofMillis(System.currentTimeMillis() - startMillis).getSeconds();

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/util/EmptySizedInput.java`
#### Snippet
```java
    @Override
    public InputStream openStream() {
        return new ByteArrayInputStream(new byte[0]);
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/ShuffleMapInputBatch.java`
#### Snippet
```java

    public ShuffleMapInput[] inputBatch() {
        return inputBatch.toArray(new ShuffleMapInput[0]);
    }

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Long`
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/MergingHadoopShuffleClient.java`
#### Snippet
```java
    private ListenableFuture<?> startDownloadTask(
            long mergeId,
            Map<Long, ListenableFuture<?>> tasks,
            Runnable taskRunnable) {
        return tasks.computeIfAbsent(
```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.ListeningScheduledExecutorService'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/MergingShuffleUploadCoordinator.java`
#### Snippet
```java
    private int totalStagedInputs;

    public MergingShuffleUploadCoordinator(
            long maxBatchSizeBytes,
            long maxBatchAgeMillis,
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SparkShuffleAwsCredentials` has no concrete subclass
in `async-shuffle-upload-api/src/main/java/com/palantir/spark/shuffle/async/api/SparkShuffleAwsCredentials.java`
#### Snippet
```java
@JsonDeserialize(as = ImmutableSparkShuffleAwsCredentials.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SparkShuffleAwsCredentials {

    private static final ObjectMapper MAPPER = new ObjectMapper();
```

### AbstractClassNeverImplemented
Abstract class `BlockDataSuccessResult` has no concrete subclass
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
    @Value.Immutable
    @ImmutablesStyle
    abstract static class BlockDataSuccessResult implements BlockDataResult {
        abstract ShuffleBlockInputStream blockDataStream();

```

### AbstractClassNeverImplemented
Abstract class `BlockDataErrorResult` has no concrete subclass
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
    @Value.Immutable
    @ImmutablesStyle
    abstract static class BlockDataErrorResult implements BlockDataResult {
        abstract Exception error();

```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/BaseHadoopShuffleClientConfiguration.java`
#### Snippet
```java
                        SafeArg.of("config", SparkShuffleApiConstants.SHUFFLE_S3A_CREDS_FILE_CONF));
        try {
            return SparkShuffleAwsCredentials.fromBytes(Files.readAllBytes(Paths.get(credentialsFilename.get())));
        } catch (FileNotFoundException e) {
            LOGGER.error("Expected aws credentials file to be there",
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `limitedDataInputStream` is always 'null'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/PartitionDecoder.java`
#### Snippet
```java
            limitedDataInputStream = new LimitedInputStream(dataInputStream, nextOffset - dataOffset);
        } catch (IOException e) {
            closeQuietly(limitedDataInputStream, e);
            closeQuietly(dataInputStream, e);
            throw new RuntimeException(e);
```

### ConstantValue
Value `dataInputStream` is always 'null'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/PartitionDecoder.java`
#### Snippet
```java
        } catch (IOException e) {
            closeQuietly(limitedDataInputStream, e);
            closeQuietly(dataInputStream, e);
            throw new RuntimeException(e);
        }
```

### ConstantValue
Value `blockId` is always 'null'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/FallbackToS3ShuffleIterator.java`
#### Snippet
```java
        if (blockId instanceof ShuffleBlockId) {
            return (ShuffleBlockId) blockId;
        } else if (blockId instanceof ShuffleBlockAttemptId) {
            shuffleId = ((ShuffleBlockAttemptId) blockId).shuffleId();
            mapId = ((ShuffleBlockAttemptId) blockId).mapId();
```

### ConstantValue
Value `blockId` is always 'null'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/FallbackToS3ShuffleIterator.java`
#### Snippet
```java
            mapId = ((ShuffleBlockAttemptId) blockId).mapId();
            reduceId = ((ShuffleBlockAttemptId) blockId).reduceId();
        } else if (blockId instanceof ShuffleDataBlockId) {
            shuffleId = ((ShuffleDataBlockId) blockId).shuffleId();
            mapId = ((ShuffleDataBlockId) blockId).mapId();
```

### ConstantValue
Value `blockId` is always 'null'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/FallbackToS3ShuffleIterator.java`
#### Snippet
```java
            mapId = ((ShuffleDataBlockId) blockId).mapId();
            reduceId = ((ShuffleDataBlockId) blockId).reduceId();
        } else if (blockId instanceof ShuffleIndexBlockId) {
            shuffleId = ((ShuffleIndexBlockId) blockId).shuffleId();
            mapId = ((ShuffleIndexBlockId) blockId).mapId();
```

### ConstantValue
Value `blockId` is always 'null'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/FallbackToS3ShuffleIterator.java`
#### Snippet
```java
            throw new SafeIllegalArgumentException(
                    "Block id is not valid - must be a shuffle block id.",
                    SafeArg.of("blockId", blockId));
        }
        return new ShuffleBlockId(shuffleId, mapId, reduceId);
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/merger/FileMerger.java`
#### Snippet
```java
                        LimitedInputStream limitedInput = new LimitedInputStream(
                                mergedInput, mapFileSize, false)) {
                    ByteStreams.copy(limitedInput, mapOut);
                }
            } else {
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/merger/FileMerger.java`
#### Snippet
```java
            if (stream.getStreamSizeInBytes() > 0L) {
                try (InputStream inputStream = stream.openStream()) {
                    ByteStreams.copy(inputStream, mergedOutput);
                }
            }
```

### UnstableApiUsage
'copy(java.io.InputStream, java.io.OutputStream)' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/merger/FileMerger.java`
#### Snippet
```java
            if (stream.getStreamSizeInBytes() > 0L) {
                try (InputStream inputStream = stream.openStream()) {
                    ByteStreams.copy(inputStream, mergedOutput);
                }
            }
```

### UnstableApiUsage
'com.google.common.util.concurrent.ListenableScheduledFuture' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/MergingShuffleUploadCoordinator.java`
#### Snippet
```java
    private final ShuffleFileBatchUploader batchUploader;

    private ListenableScheduledFuture<?> uploadCoordinatorTask;
    private int totalStagedInputs;

```

### UnstableApiUsage
'scheduleWithFixedDelay(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit)' is declared in unstable interface 'com.google.common.util.concurrent.ListeningScheduledExecutorService' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/MergingShuffleUploadCoordinator.java`
#### Snippet
```java
    public void start() {
        if (uploadCoordinatorTask == null) {
            uploadCoordinatorTask = uploadCoordinatorExecutor.scheduleWithFixedDelay(
                    this::uploadEligibleBatches,
                    pollingIntervalMillis,
```

### UnstableApiUsage
'com.google.common.util.concurrent.ListeningScheduledExecutorService' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/MergingShuffleUploadCoordinator.java`
#### Snippet
```java
            long pollingIntervalMillis,
            ShuffleDriverEndpointRef shuffleDriverEndpointRef,
            ListeningScheduledExecutorService uploadCoordinatorExecutor,
            Clock clock,
            ShuffleFileBatchUploader batchUploader) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.ListeningScheduledExecutorService' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/MergingShuffleUploadCoordinator.java`
#### Snippet
```java
    private final ShuffleDriverEndpointRef shuffleDriverEndpointRef;
    private final Map<Integer, ShuffleMapInputBatch> stagedBatches;
    private final ListeningScheduledExecutorService uploadCoordinatorExecutor;
    private final Clock clock;
    private final ShuffleFileBatchUploader batchUploader;
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
        streamCount.incrementAndGet();
        ShuffleBlockId shuffleBlockId = ShuffleBlockId.apply(shuffleId, mapId, reduceId);
        FluentFuture<InputStream> fetchFuture =
                FluentFuture.from(client.getBlockData(shuffleId, mapId, reduceId, attemptId));
        activeFetchRequests.put(shuffleBlockId, fetchFuture);
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
        ShuffleBlockId shuffleBlockId = ShuffleBlockId.apply(shuffleId, mapId, reduceId);
        FluentFuture<InputStream> fetchFuture =
                FluentFuture.from(client.getBlockData(shuffleId, mapId, reduceId, attemptId));
        activeFetchRequests.put(shuffleBlockId, fetchFuture);
        fetchFuture
```

### UnstableApiUsage
'from(com.google.common.util.concurrent.ListenableFuture)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
        ShuffleBlockId shuffleBlockId = ShuffleBlockId.apply(shuffleId, mapId, reduceId);
        FluentFuture<InputStream> fetchFuture =
                FluentFuture.from(client.getBlockData(shuffleId, mapId, reduceId, attemptId));
        activeFetchRequests.put(shuffleBlockId, fetchFuture);
        fetchFuture
```

### UnstableApiUsage
'withTimeout(long, java.util.concurrent.TimeUnit, java.util.concurrent.ScheduledExecutorService)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
        activeFetchRequests.put(shuffleBlockId, fetchFuture);
        fetchFuture
                .withTimeout(TIMEOUT.getSeconds(), TimeUnit.SECONDS, timeoutExecutorService)
                .<BlockDataResult>transform(
                        stream -> {
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
        fetchFuture
                .withTimeout(TIMEOUT.getSeconds(), TimeUnit.SECONDS, timeoutExecutorService)
                .<BlockDataResult>transform(
                        stream -> {
                            LOG.info("Successfully opened input stream for map output from remote storage.",
```

### UnstableApiUsage
'catching(java.lang.Class, com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
                        }, executorService)

                .catching(
                        Exception.class,
                        error -> {
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
                        },
                        executorService)
                .transform(fetchResults::add, executorService)
                .addCallback(new FutureCallback<Boolean>() {
                    @Override
```

### UnstableApiUsage
'addCallback(com.google.common.util.concurrent.FutureCallback, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
                        executorService)
                .transform(fetchResults::add, executorService)
                .addCallback(new FutureCallback<Boolean>() {
                    @Override
                    public void onSuccess(Boolean _result) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
            }
        });
        Futures.addCallback(uploadTask, new UploadBatchFinishedListener(appId, batch), uploadExecutor);
    }

```

### UnstableApiUsage
'addCallback(com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.FutureCallback, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
            }
        });
        Futures.addCallback(uploadTask, new UploadBatchFinishedListener(appId, batch), uploadExecutor);
    }

```

### UnstableApiUsage
'com.google.common.io.CountingOutputStream' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        long startTime = clock.millis();
        long bytesWritten;
        CountingOutputStream resolvedCountingDataOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedDataFile(mergedOutputId);
                CountingOutputStream countingDataOut = new CountingOutputStream(mergedOut);
```

### UnstableApiUsage
'com.google.common.io.CountingOutputStream' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        CountingOutputStream resolvedCountingDataOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedDataFile(mergedOutputId);
                CountingOutputStream countingDataOut = new CountingOutputStream(mergedOut);
                DataOutputStream mergedDataOut = new DataOutputStream(countingDataOut)) {
            FileMerger.mergeMapOutputs(inputs, mergedDataOut, ShuffleMapInput::dataSizedInput);
```

### UnstableApiUsage
'CountingOutputStream(java.io.OutputStream)' is declared in unstable class 'com.google.common.io.CountingOutputStream' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        CountingOutputStream resolvedCountingDataOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedDataFile(mergedOutputId);
                CountingOutputStream countingDataOut = new CountingOutputStream(mergedOut);
                DataOutputStream mergedDataOut = new DataOutputStream(countingDataOut)) {
            FileMerger.mergeMapOutputs(inputs, mergedDataOut, ShuffleMapInput::dataSizedInput);
```

### UnstableApiUsage
'com.google.common.io.CountingOutputStream' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        CountingOutputStream resolvedCountingDataOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedDataFile(mergedOutputId);
                CountingOutputStream countingDataOut = new CountingOutputStream(mergedOut);
                DataOutputStream mergedDataOut = new DataOutputStream(countingDataOut)) {
            FileMerger.mergeMapOutputs(inputs, mergedDataOut, ShuffleMapInput::dataSizedInput);
```

### UnstableApiUsage
'getCount()' is declared in unstable class 'com.google.common.io.CountingOutputStream' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
            throw new RuntimeException(e);
        } finally {
            bytesWritten = resolvedCountingDataOut == null ? 0L : resolvedCountingDataOut.getCount();
        }
        long now = clock.millis();
```

### UnstableApiUsage
'com.google.common.io.CountingOutputStream' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        long startTime = clock.millis();
        long bytesWritten;
        CountingOutputStream resolvedCountingIndexOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedIndexFile(mergedOutputId);
                CountingOutputStream countingIndexOut = new CountingOutputStream(mergedOut);
```

### UnstableApiUsage
'com.google.common.io.CountingOutputStream' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        CountingOutputStream resolvedCountingIndexOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedIndexFile(mergedOutputId);
                CountingOutputStream countingIndexOut = new CountingOutputStream(mergedOut);
                DataOutputStream mergedDataOut = new DataOutputStream(countingIndexOut)) {
            FileMerger.mergeMapOutputs(inputs, mergedDataOut, ShuffleMapInput::indexSizedInput);
```

### UnstableApiUsage
'CountingOutputStream(java.io.OutputStream)' is declared in unstable class 'com.google.common.io.CountingOutputStream' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        CountingOutputStream resolvedCountingIndexOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedIndexFile(mergedOutputId);
                CountingOutputStream countingIndexOut = new CountingOutputStream(mergedOut);
                DataOutputStream mergedDataOut = new DataOutputStream(countingIndexOut)) {
            FileMerger.mergeMapOutputs(inputs, mergedDataOut, ShuffleMapInput::indexSizedInput);
```

### UnstableApiUsage
'com.google.common.io.CountingOutputStream' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        CountingOutputStream resolvedCountingIndexOut = null;
        try (OutputStream mergedOut = shuffleFiles.createRemoteMergedIndexFile(mergedOutputId);
                CountingOutputStream countingIndexOut = new CountingOutputStream(mergedOut);
                DataOutputStream mergedDataOut = new DataOutputStream(countingIndexOut)) {
            FileMerger.mergeMapOutputs(inputs, mergedDataOut, ShuffleMapInput::indexSizedInput);
```

### UnstableApiUsage
'getCount()' is declared in unstable class 'com.google.common.io.CountingOutputStream' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
            throw new RuntimeException(e);
        } finally {
            bytesWritten = resolvedCountingIndexOut == null ? 0L : resolvedCountingIndexOut.getCount();
        }
        long now = clock.millis();
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/MergingHadoopShuffleClient.java`
#### Snippet
```java

            if (!downloadFutures.isEmpty()) {
                return FluentFuture.from(Futures.allAsList(downloadFutures))
                        .transform(
                                ignored -> getDownloadedBlockDataChecked(
```

### UnstableApiUsage
'from(com.google.common.util.concurrent.ListenableFuture)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/MergingHadoopShuffleClient.java`
#### Snippet
```java

            if (!downloadFutures.isEmpty()) {
                return FluentFuture.from(Futures.allAsList(downloadFutures))
                        .transform(
                                ignored -> getDownloadedBlockDataChecked(
```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/MergingHadoopShuffleClient.java`
#### Snippet
```java

            if (!downloadFutures.isEmpty()) {
                return FluentFuture.from(Futures.allAsList(downloadFutures))
                        .transform(
                                ignored -> getDownloadedBlockDataChecked(
```

### UnstableApiUsage
'allAsList(java.lang.Iterable\>)' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/MergingHadoopShuffleClient.java`
#### Snippet
```java

            if (!downloadFutures.isEmpty()) {
                return FluentFuture.from(Futures.allAsList(downloadFutures))
                        .transform(
                                ignored -> getDownloadedBlockDataChecked(
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/MergingHadoopShuffleClient.java`
#### Snippet
```java
            if (!downloadFutures.isEmpty()) {
                return FluentFuture.from(Futures.allAsList(downloadFutures))
                        .transform(
                                ignored -> getDownloadedBlockDataChecked(
                                        shuffleId, mapId, reduceId, attemptId),
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
        try (InputStream openInputStream = sizedInput.openStream();
                OutputStream dataOutput = createRemoteFsOutputStream(hadoopFilePath)) {
            ByteStreams.copy(openInputStream, dataOutput);
        } catch (IOException e) {
            LOGGER.error(
```

### UnstableApiUsage
'copy(java.io.InputStream, java.io.OutputStream)' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
        try (InputStream openInputStream = sizedInput.openStream();
                OutputStream dataOutput = createRemoteFsOutputStream(hadoopFilePath)) {
            ByteStreams.copy(openInputStream, dataOutput);
        } catch (IOException e) {
            LOGGER.error(
```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
                        attemptId,
                        timeSubmitted));
        Futures.addCallback(
                uploadTask,
                new ShuffleUploadFinishedListener(
```

### UnstableApiUsage
'addCallback(com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.FutureCallback, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
                        attemptId,
                        timeSubmitted));
        Futures.addCallback(
                uploadTask,
                new ShuffleUploadFinishedListener(
```

### UnstableApiUsage
'listeningDecorator(java.util.concurrent.ScheduledExecutorService)' is unstable because its signature references unstable interface 'com.google.common.util.concurrent.ListeningScheduledExecutorService' marked with @Beta
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java
                            mergingConf.pollingIntervalMillis(),
                            driverEndpointRef,
                            MoreExecutors.listeningDecorator(resolvedUploadCoordinatorExecutor),
                            clock,
                            batchUploader);
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `async-shuffle-upload-data-generator/src/main/java/com/palantir/spark/shuffle/async/data/AsyncShuffleUploadDataGeneratorBenchmark.java`
#### Snippet
```java
        Preconditions.checkNotNull(value, "Expected env variable to not be null",
                SafeArg.of("envVar", name));
        return Integer.valueOf(value);
    }

```

