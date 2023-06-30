# async-shuffle-upload 
 
# Bad smells
I found 113 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 37 | false |
| PlaceholderCountMatchesArgumentCount | 33 | false |
| OptionalUsedAsFieldOrParameterType | 18 | false |
| ConstantValue | 6 | false |
| NullableProblems | 5 | false |
| JavadocReference | 2 | false |
| DataFlowIssue | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| EmptyStatementBody | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| DuplicatedCode | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
`Optional` used as type for field 'maybeReadSupport'
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java

    // Read support is split off primarily to reduce the number of lines in the class.
    private Optional<S3AsyncShuffleReadSupport> maybeReadSupport;

    public S3AsyncShuffleExecutorComponents(
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `AsyncShuffleDataIoSparkConfigs`
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/S3AsyncShuffleMetricsFactory.java`
#### Snippet
```java
 * <p>
 * Implementations are instantiated reflectively with a no-arg constructor. Specify the implementation class via
 * {@link AsyncShuffleDataIoSparkConfigs#METRICS_FACTORY_CLASS()}.
 */
public interface S3AsyncShuffleMetricsFactory {
```

### JavadocReference
Cannot resolve symbol `METRICS_FACTORY_CLASS()`
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/S3AsyncShuffleMetricsFactory.java`
#### Snippet
```java
 * <p>
 * Implementations are instantiated reflectively with a no-arg constructor. Specify the implementation class via
 * {@link AsyncShuffleDataIoSparkConfigs#METRICS_FACTORY_CLASS()}.
 */
public interface S3AsyncShuffleMetricsFactory {
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `async-shuffle-upload-data-generator/src/main/java/com/palantir/spark/shuffle/async/s3/client/AsyncShuffleBenchmark.java`
#### Snippet
```java
                    byte[] bytes = new byte[READ_BUFFER_SIZE];
                    try (InputStream stream = future.get()) {
                        while (stream.read(bytes) != -1) {
                            // do nothing
                        }
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jS3FetcherIteratorMetrics.java`
#### Snippet
```java
    @Override
    public void markFetchFromRemoteSucceeded(int shuffleId, int mapId, int reduceId, long attemptId) {
        LOGGER.info("Successfully fetched shuffle blocks from remote storage.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jS3FetcherIteratorMetrics.java`
#### Snippet
```java
    @Override
    public void markFetchFromExecutorFailed(int shuffleId, int mapId, int reduceId, long attemptId) {
        LOGGER.info("Failed to fetch shuffle blocks from other executors in the application.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jS3FetcherIteratorMetrics.java`
#### Snippet
```java
    @Override
    public void markFetchFromRemoteFailed(int shuffleId, int mapId, int reduceId, long attemptId) {
        LOGGER.info("Failed to fetch shuffle blocks from remote storage.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jS3AsyncShuffleMetrics.java`
#### Snippet
```java
    @Override
    public void markUsingAsyncShuffleUploadPlugin() {
        LOGGER.info("Using the async shuffle upload plugin.", Args.sparkAppNameArg(sparkAppName));
    }

```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleDriverComponents.java`
#### Snippet
```java
    @Override
    public void removeShuffle(int shuffleId, boolean blocking) throws IOException {
        LOG.info("Cleaning up shuffle data ", SafeArg.of("shuffleId", shuffleId));
        shuffleIdTracker.unregisterShuffle(shuffleId);
        delegate.removeShuffle(shuffleId, blocking);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markUploadStarted(int shuffleId, int mapId, long attemptId) {
        LOGGER.info("Beginning to upload shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
            long attemptId,
            long requestSubmissionLatencyMillis) {
        LOGGER.info("Requested to upload map output file was submitted to the thread pool.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markUploadFailed(int shuffleId, int mapId, long attemptId, long numRunningOrPendingUploads) {
        LOGGER.info("Failed to upload shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markDownloadStarted(int shuffleId, int mapId, int reduceId, long attemptId) {
        LOGGER.info("Started downloading shuffle block from remote storage.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markUploadRequested(int shuffleId, int mapId, long attemptId, long numRunningOrPendingUploads) {
        LOGGER.info("Requested to upload map output file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (8) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
            long latencyMillis,
            long numRunningOrPendingUploads) {
        LOGGER.info("Finished uploading shuffle map output file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (5) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jBasicShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markDownloadRequested(int shuffleId, int mapId, int reduceId, long attemptId) {
        LOGGER.info("Requested to download shuffle block from remote storage.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (6) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markDownloadFailed(int shuffleId, int mapId, long attemptId, long mergeId, String type) {
        LOGGER.info("Failed download of merged shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (7) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    public void markDownloadCompleted(
            int shuffleId, int mapId, long attemptId, long mergeId, String type, long durationMillis) {
        LOGGER.info("Finished download of merged shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (7) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    public void markUploadCompleted(
            int shuffleId, long mergeId, String type, long batchSizeBytes, long durationMillis, long latencyMillis) {
        LOGGER.info("Successfully uploaded merged shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (6) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markDownloadStarted(int shuffleId, int mapId, long attemptId, long mergeId, String type) {
        LOGGER.info("Started download of merged shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (6) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markDownloadRequested(int shuffleId, int mapId, long attemptId, long mergeId, String type) {
        LOGGER.info("Requested download of merged shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markUploadStarted(int shuffleId, long mergeId, String type) {
        LOGGER.info("Started merged shuffle file upload.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/metrics/slf4j/Slf4jMergingShuffleClientMetrics.java`
#### Snippet
```java
    @Override
    public void markUploadFailed(int shuffleId, long mergeId, String type) {
        LOGGER.info("Failed to upload merged shuffle file.",
                sparkAppNameArg,
                Args.shuffleIdArg(shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/ShuffleClients.java`
#### Snippet
```java
        }
        return baseConfig.baseUri().map(baseUri -> {
            LOGGER.info("Setting up shuffle hadoop client.", UnsafeArg.of("baseUri", baseUri));
            ExecutorService resolvedUploadExecutor = resolveUploadExecutor(customUploadExecutorService, baseConfig);
            ExecutorService resolvedDownloadExecutor =
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
            if (!shuffleDriverEndpointRef.isShuffleRegistered(shuffleId)) {
                LOGGER.info(
                        "Shuffle is no longer active; skipping file upload",
                        SafeArg.of("appId", appId),
                        SafeArg.of("shuffleId", shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
            }
        } catch (RuntimeException e) {
            LOGGER.error("Exception encountered while checking for existence of shuffle.",
                    SafeArg.of("appId", appId),
                    SafeArg.of("shuffleId", shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
            fileSystem.delete(new Path(baseUri.toString(), String.format("%s/%s", DATA_PREFIX, appId)), true);
        } catch (IOException e) {
            LOGGER.error("Encountered error deleting application data",
                    SafeArg.of("appId", appId),
                    e);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java
        } catch (IOException e) {
            LOGGER.error(
                    "Exception encountered while uploading data file.",
                    SafeArg.of("appId", appId),
                    SafeArg.of("shuffleId", shuffleId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
            }
            LOG.info(
                    "Cleaned up the DefaultS3FetcherIterator",
                    SafeArg.of("numFuturesCancelled", numFuturesCancelled),
                    SafeArg.of("numStreamsClosed", streamsToClose));
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
                .<BlockDataResult>transform(
                        stream -> {
                            LOG.info("Successfully opened input stream for map output from remote storage.",
                                    SafeArg.of("shuffleId", shuffleId),
                                    SafeArg.of("mapId", mapId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java
                        Exception.class,
                        error -> {
                            LOG.error("Failed to get stream for map output from remote storage.",
                                    SafeArg.of("shuffleId", shuffleId),
                                    SafeArg.of("mapId", mapId),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultMergingShuffleFiles.java`
#### Snippet
```java
                    Files.move(tempFile.toPath(), outputFile.toPath());
                } catch (FileAlreadyExistsException e) {
                    LOGGER.warn("Map output file was already created; perhaps another thread"
                            + " accidentally downloaded the same data.",
                            SafeArg.of("mapOutputFilePath", outputFile.getAbsolutePath()),
                            e);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/BaseHadoopShuffleClientConfiguration.java`
#### Snippet
```java
            return SparkShuffleAwsCredentials.fromBytes(Files.readAllBytes(Paths.get(credentialsFilename.get())));
        } catch (FileNotFoundException e) {
            LOGGER.error("Expected aws credentials file to be there",
                    SafeArg.of("credentialsFile", credentialsFilename.get()),
                    e);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        @Override
        public void onFailure(Throwable error) {
            LOGGER.error("Failed to upload shuffle files to the backing file system. If this executor fails, shuffle"
                            + " data will need to be recomputed.",
                    SafeArg.of("appId", appId),
                    SafeArg.of("failedMapOutputs", Arrays.asList(batch.mapOutputIds())),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (3) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
        @Override
        public void onSuccess(Object _result) {
            LOGGER.debug("Finished uploading batch of map task files.",
                    SafeArg.of("appId", appId),
                    SafeArg.of("uploadedMapOutputs", Arrays.asList(batch.mapOutputIds())),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
                    .newInstance();
        } catch (Exception e) {
            LOG.error("Failed to load async shuffle plugin's metrics factory specified by the Spark configuration."
                            + " Falling back to SLF4J-logging based implementation.",
                    SafeArg.of("confKey", SparkShuffleApiConstants.METRICS_FACTORY_CLASS_CONF),
                    SafeArg.of("metricsFactoryClass", factoryClassName),
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (4) than placeholders specified (0)
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/io/S3AsyncShuffleExecutorComponents.java`
#### Snippet
```java
    public ShuffleMapOutputWriter createMapOutputWriter(
            int shuffleId, int mapId, long mapTaskAttemptId, int numPartitions) throws IOException {
        LOG.debug("Created MapOutputWriter for shuffle partition with numPartitions",
                SafeArg.of("shuffleId", shuffleId),
                SafeArg.of("mapId", mapId),
```

## RuleId[id=MismatchedCollectionQueryUpdate]
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

## RuleId[id=CaughtExceptionImmediatelyRethrown]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `async-shuffle-upload-data-generator/src/main/java/com/palantir/spark/shuffle/async/s3/client/AsyncShuffleBenchmark.java`
#### Snippet
```java
        for (Future<Boolean> future : uploadFutures) {
            boolean result = future.get();
            Preconditions.checkState(result, "Future did not successfully finish");
            count++;
            if (count % stepSize == 0) {
                String message = String.format("Reaped %s out of %s jobs", count, totalJobs);
                LOGGER.info(message);
            }
        }

        double totalBytes = numBytesInPartition * numFiles * numPartitions;
        double writeThrougputBytesPerSec =
                totalBytes / Duration.ofMillis(System.currentTimeMillis() - startMillis).getSeconds();

        return writeThrougputBytesPerSec;
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
                            + " data will need to be recomputed.",
                    SafeArg.of("appId", appId),
                    SafeArg.of("failedMapOutputs", Arrays.asList(batch.mapOutputIds())),
                    SafeArg.of("batchDataSize", batch.totalDataSizeInBytes()),
                    SafeArg.of("numBatchItems", batch.inputBatch().length),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java
            LOGGER.debug("Finished uploading batch of map task files.",
                    SafeArg.of("appId", appId),
                    SafeArg.of("uploadedMapOutputs", Arrays.asList(batch.mapOutputIds())),
                    SafeArg.of("uploadSize", batch.totalDataSizeInBytes()));
        }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/util/DaemonExecutors.java`
#### Snippet
```java
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable runnable) {
                        Thread thread = Executors.defaultThreadFactory().newThread(runnable);
                        thread.setDaemon(true);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/basic/HadoopShuffleClient.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable error) {
            metrics.markUploadFailed(shuffleId, mapId, attemptId, pendingOrRunningUploadsCounter.decrementAndGet());
            LOGGER.error("Failed to upload shuffle files.", error);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/DefaultS3FetcherIterator.java`
#### Snippet
```java

                    @Override
                    public void onFailure(Throwable error) {
                        // Error is event-logged in the catching block above
                        LOG.error("Error occurred in pushing fetch result into the queue.", error);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/client/merging/DefaultShuffleFileBatchUploader.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable error) {
            LOGGER.error("Failed to upload shuffle files to the backing file system. If this executor fails, shuffle"
                            + " data will need to be recomputed.",
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `async-shuffle-upload-data-generator/src/main/java/com/palantir/spark/shuffle/async/s3/client/AsyncShuffleBenchmark.java`
#### Snippet
```java

        @Override
        public int read(byte[] bytes, int off, int len) {
            if (remainingBytes <= 0) {
                return -1;
```

## RuleId[id=ConstantValue]
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

## RuleId[id=OptionalGetWithoutIsPresent]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `async-shuffle-upload-core/src/main/java/com/palantir/spark/shuffle/async/s3/reader/FallbackToS3ShuffleIterator.java`
#### Snippet
```java
    private final SerializerManager serializerManager;
    private final CompressionCodec compressionCodec;
    private final ShuffleDriverEndpointRef driverEndpointRef;

    public FallbackToS3ShuffleIterator(
```

## RuleId[id=UnstableApiUsage]
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

