# incubator-uniffle 
 
# Bad smells
I found 494 bad smells with 14 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 302 | false |
| UnstableApiUsage | 22 | false |
| DuplicatedCode | 18 | false |
| JavadocDeclaration | 17 | false |
| FieldCanBeLocal | 16 | false |
| UnusedAssignment | 16 | false |
| SwitchStatementWithTooFewBranches | 14 | false |
| UnnecessaryLocalVariable | 11 | true |
| ConstantValue | 10 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 7 | false |
| StringConcatenationInsideStringBufferAppend | 7 | false |
| FinalStaticMethod | 6 | false |
| UNCHECKED_WARNING | 5 | false |
| TrivialIf | 5 | false |
| BusyWait | 5 | false |
| DataFlowIssue | 3 | false |
| InfiniteLoopStatement | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| WriteOnlyObject | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| IOStreamConstructor | 2 | false |
| DanglingJavadoc | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| SimplifyStreamApiCallChains | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| RegExpRedundantEscape | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| AutoCloseableResource | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RedundantCast | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| JavaReflectionInvocation | 1 | false |
| FuseStreamOperations | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/NodesServlet.java`
#### Snippet
```java
  @Override
  protected Response<List<ServerNode>> handleGet(HttpServletRequest req, HttpServletResponse resp) {
    List<ServerNode> serverList = coordinator.getClusterManager().getServerList(Collections.EMPTY_SET);
    String id = req.getParameter("id");
    String status = req.getParameter("status");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/NodesServlet.java`
#### Snippet
```java
  @Override
  protected Response<List<ServerNode>> handleGet(HttpServletRequest req, HttpServletResponse resp) {
    List<ServerNode> serverList = coordinator.getClusterManager().getServerList(Collections.EMPTY_SET);
    String id = req.getParameter("id");
    String status = req.getParameter("status");
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `server/src/main/java/org/apache/uniffle/server/storage/HadoopStorageManagerFallbackStrategy.java`
#### Snippet
```java
public class HadoopStorageManagerFallbackStrategy extends AbstractStorageManagerFallbackStrategy {
  private final Long fallBackTimes;
  private Set<Class<? extends StorageManager>> excludeTypes = Sets.newHashSet(HadoopStorageManager.class);

  public HadoopStorageManagerFallbackStrategy(ShuffleServerConf conf) {
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `server/src/main/java/org/apache/uniffle/server/storage/LocalStorageManagerFallbackStrategy.java`
#### Snippet
```java
public class LocalStorageManagerFallbackStrategy extends AbstractStorageManagerFallbackStrategy {
  private final Long fallBackTimes;
  private Set<Class<? extends StorageManager>> excludeTypes = Sets.newHashSet(LocalStorageManager.class);

  public LocalStorageManagerFallbackStrategy(ShuffleServerConf conf) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `server/src/main/java/org/apache/uniffle/server/storage/StorageMediaFromEnvProvider.java`
#### Snippet
```java
    ObjectMapper om = new ObjectMapper();
    try {
      Map<String, String> mappings = om.readValue(jsonSource, Map.class);
      localStorageTypes.clear();
      for (Map.Entry<String, String> entry : mappings.entrySet()) {
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
Condition `e instanceof MultiException` is redundant and can be replaced with a null check
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      }
      return isServerPortBindCollision(e.getCause());
    } else if (e instanceof MultiException) {
      return !((MultiException) e).getThrowables().stream()
          .noneMatch((Throwable throwable) -> isServerPortBindCollision(throwable));
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

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/BaseServlet.java`
#### Snippet
```java
  }

  protected <T> T parseParamsFromJson(HttpServletRequest req, Class<T> clazz) throws IOException {
    return mapper.readValue(req.getInputStream(), clazz);
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

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `val` in enum 'StorageType'
in `storage/src/main/java/org/apache/uniffle/storage/util/StorageType.java`
#### Snippet
```java
  MEMORY_LOCALFILE_HDFS(7);

  private int val;

  StorageType(int val) {
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcNettyClient.java`
#### Snippet
```java
    GetLocalShuffleIndexResponse getLocalShuffleIndexResponse = (GetLocalShuffleIndexResponse) rpcResponse;
    StatusCode statusCode = rpcResponse.getStatusCode();
    switch (statusCode) {
      case SUCCESS:
        return new RssGetShuffleIndexResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcNettyClient.java`
#### Snippet
```java
    GetMemoryShuffleDataResponse getMemoryShuffleDataResponse = (GetMemoryShuffleDataResponse) rpcResponse;
    StatusCode statusCode = rpcResponse.getStatusCode();
    switch (statusCode) {
      case SUCCESS:
        return new RssGetInMemoryShuffleDataResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcNettyClient.java`
#### Snippet
```java
    GetLocalShuffleDataResponse getLocalShuffleDataResponse  = (GetLocalShuffleDataResponse) rpcResponse;
    StatusCode statusCode = rpcResponse.getStatusCode();
    switch (statusCode) {
      case SUCCESS:
        return new RssGetShuffleDataResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/CoordinatorGrpcClient.java`
#### Snippet
```java
    RssAccessClusterResponse response;
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();
    switch (statusCode) {
      case SUCCESS:
        response = new RssAccessClusterResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/CoordinatorGrpcClient.java`
#### Snippet
```java
    RssApplicationInfoResponse response;
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();
    switch (statusCode) {
      case SUCCESS:
        response = new RssApplicationInfoResponse(StatusCode.SUCCESS);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/CoordinatorGrpcClient.java`
#### Snippet
```java
    RssAppHeartBeatResponse response;
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();
    switch (statusCode) {
      case SUCCESS:
        response = new RssAppHeartBeatResponse(StatusCode.SUCCESS);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();
    RssReportShuffleResultResponse response;
    switch (statusCode) {
      case SUCCESS:
        response = new RssReportShuffleResultResponse(StatusCode.SUCCESS);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();

    switch (statusCode) {
      case SUCCESS:
        response = new RssUnregisterShuffleResponse(StatusCode.SUCCESS);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java

    RssGetShuffleIndexResponse response;
    switch (statusCode) {
      case SUCCESS:
        response = new RssGetShuffleIndexResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java

    RssGetShuffleDataResponse response;
    switch (statusCode) {
      case SUCCESS:
        response = new RssGetShuffleDataResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java

    RssGetShuffleResultResponse response;
    switch (statusCode) {
      case SUCCESS:
        try {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java

    RssGetInMemoryShuffleDataResponse response;
    switch (statusCode) {
      case SUCCESS:
        response = new RssGetInMemoryShuffleDataResponse(
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
    RssRegisterShuffleResponse response;
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();
    switch (statusCode) {
      case SUCCESS:
        response = new RssRegisterShuffleResponse(StatusCode.SUCCESS);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java

    RssGetShuffleResultResponse response;
    switch (statusCode) {
      case SUCCESS:
        try {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/uniffle/common/config/ConfigOption.java`
#### Snippet
```java
    final Stream<FallbackKey> newFallbackKeys =
        Arrays.stream(fallbackKeys).map(FallbackKey::createFallbackKey);
    final Stream<FallbackKey> currentAlternativeKeys = Arrays.stream(this.fallbackKeys);

    // put fallback keys first so that they are prioritized
    final FallbackKey[] mergedAlternativeKeys =
        Stream.concat(newFallbackKeys, currentAlternativeKeys).toArray(FallbackKey[]::new);
    return new ConfigOption<>(
        key, clazz, description, defaultValue, converter, mergedAlternativeKeys);
```

### DuplicatedCode
Duplicated code
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/storage/AppBalanceSelectStorageStrategy.java`
#### Snippet
```java
    LOG.info("The sorted remote path list is: {}", uris);
    for (Map.Entry<String, RankValue> entry : uris) {
      String storagePath = entry.getKey();
      if (availableRemoteStorageInfo.containsKey(storagePath)) {
        return appIdToRemoteStorageInfo.computeIfAbsent(appId, x -> availableRemoteStorageInfo.get(storagePath));
      }
    }
    LOG.warn("No remote storage is available, we will default to the first.");
    return availableRemoteStorageInfo.values().iterator().next();
```

### DuplicatedCode
Duplicated code
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
    RssProtos.StatusCode statusCode = rpcResponse.getStatus();

    RssGetShuffleResultResponse response;
    switch (statusCode) {
      case SUCCESS:
        try {
          response = new RssGetShuffleResultResponse(StatusCode.SUCCESS,
              rpcResponse.getSerializedBitmap().toByteArray());
        } catch (Exception e) {
          throw new RssException(e);
        }
        break;
      default:
        String msg = "Can't get shuffle result from " + host + ":" + port
            + " for [appId=" + request.getAppId() + ", shuffleId=" + request.getShuffleId()
            + ", errorMsg:" + rpcResponse.getRetMsg();
        LOG.error(msg);
        throw new RssFetchFailedException(msg);
    }

    return response;
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcMetrics.java`
#### Snippet
```java
    gaugeMap.putIfAbsent(REGISTER_SHUFFLE_METHOD,
        metricsManager.addLabeledGauge(GRPC_REGISTERED_SHUFFLE));
    gaugeMap.putIfAbsent(SEND_SHUFFLE_DATA_METHOD,
        metricsManager.addLabeledGauge(GRPC_SEND_SHUFFLE_DATA));
    gaugeMap.putIfAbsent(COMMIT_SHUFFLE_TASK_METHOD,
        metricsManager.addLabeledGauge(GRPC_COMMIT_SHUFFLE_TASK));
    gaugeMap.putIfAbsent(FINISH_SHUFFLE_METHOD,
        metricsManager.addLabeledGauge(GRPC_FINISH_SHUFFLE));
    gaugeMap.putIfAbsent(REQUIRE_BUFFER_METHOD,
        metricsManager.addLabeledGauge(GRPC_REQUIRE_BUFFER));
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcMetrics.java`
#### Snippet
```java
    counterMap.putIfAbsent(REPORT_SHUFFLE_RESULT_METHOD,
        metricsManager.addLabeledCounter(GRPC_REPORT_SHUFFLE_RESULT_TOTAL));
    counterMap.putIfAbsent(GET_SHUFFLE_RESULT_METHOD,
        metricsManager.addLabeledCounter(GRPC_GET_SHUFFLE_RESULT_TOTAL));
    counterMap.putIfAbsent(GET_SHUFFLE_DATA_METHOD,
        metricsManager.addLabeledCounter(GRPC_GET_SHUFFLE_DATA_TOTAL));
    counterMap.putIfAbsent(GET_MEMORY_SHUFFLE_DATA_METHOD,
        metricsManager.addLabeledCounter(GRPC_GET_MEMORY_SHUFFLE_DATA_TOTAL));
    counterMap.putIfAbsent(GET_SHUFFLE_INDEX_METHOD,
        metricsManager.addLabeledCounter(GRPC_GET_SHUFFLE_INDEX_TOTAL));
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    long timestamp = req.getTimestamp();
    if (timestamp > 0) {
      /*
      * Here we record the transport time, but we don't consider the impact of data size on transport time.
      * The amount of data will not cause great fluctuations in latency. For example, 100K costs 1ms,
      * and 1M costs 10ms. This seems like a normal fluctuation, but it may rise to 10s when the server load is high.
      * In addition, we need to pay attention to that the time of the client machine and the machine
      * time of the Shuffle Server should be kept in sync. TransportTime is accurate only if this condition is met.
      * */
      long transportTime = System.currentTimeMillis() - timestamp;
      if (transportTime > 0) {
        shuffleServer.getGrpcMetrics().recordTransportTime(
            ShuffleServerGrpcMetrics.SEND_SHUFFLE_DATA_METHOD, transportTime);
      }
    }
    int requireSize = shuffleServer
        .getShuffleTaskManager().getRequireBufferSize(requireBufferId);

    StatusCode ret = StatusCode.SUCCESS;
    String responseMessage = "OK";
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
final long start = System.currentTimeMillis();
      List<ShufflePartitionedData> shufflePartitionedData = toPartitionedData(req);
      long alreadyReleasedSize = 0;
      for (ShufflePartitionedData spd : shufflePartitionedData) {
        String shuffleDataInfo = "appId[" + appId + "], shuffleId[" + shuffleId
            + "], partitionId[" + spd.getPartitionId() + "]";
        try {
          ret = manager.cacheShuffleData(appId, shuffleId, isPreAllocated, spd);
          if (ret != StatusCode.SUCCESS) {
            String errorMsg = "Error happened when shuffleEngine.write for "
                + shuffleDataInfo + ", statusCode=" + ret;
            LOG.error(errorMsg);
            responseMessage = errorMsg;
            break;
          } else {
            long toReleasedSize = spd.getTotalBlockSize();
            // after each cacheShuffleData call, the `preAllocatedSize` is updated timely.
            manager.releasePreAllocatedSize(toReleasedSize);
            alreadyReleasedSize += toReleasedSize;
            manager.updateCachedBlockIds(appId, shuffleId, spd.getPartitionId(), spd.getBlockList());
          }
        } catch (Exception e) {
          String errorMsg = "Error happened when shuffleEngine.write for "
              + shuffleDataInfo + ": " + e.getMessage();
          ret = StatusCode.INTERNAL_ERROR;
          responseMessage = errorMsg;
          LOG.error(errorMsg);
          break;
        }
      }
      // since the required buffer id is only used once, the shuffle client would try to require another buffer whether
      // current connection succeeded or not. Therefore, the preAllocatedBuffer is first get and removed, then after
      // cacheShuffleData finishes, the preAllocatedSize should be updated accordingly.
      if (info.getRequireSize() > alreadyReleasedSize) {
        manager.releasePreAllocatedSize(info.getRequireSize() - alreadyReleasedSize);
      }
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    ByteString serializedBlockIdsBytes = ByteString.EMPTY;

    try {
      serializedBlockIds = shuffleServer.getShuffleTaskManager().getFinishedBlockIds(
          appId, shuffleId, Sets.newHashSet(partitionId));
      if (serializedBlockIds == null) {
        status = StatusCode.INTERNAL_ERROR;
        msg = "Can't get shuffle result for " + requestInfo;
        LOG.warn(msg);
      } else {
        serializedBlockIdsBytes = UnsafeByteOperations.unsafeWrap(serializedBlockIds);
      }
    } catch (Exception e) {
      status = StatusCode.INTERNAL_ERROR;
      msg = e.getMessage();
      LOG.error("Error happened when get shuffle result for {}", requestInfo, e);
    }
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    String appId = request.getAppId();
    int shuffleId = request.getShuffleId();
    int partitionId = request.getPartitionId();
    int partitionNumPerRange = request.getPartitionNumPerRange();
    int partitionNum = request.getPartitionNum();
    long offset = request.getOffset();
    int length = request.getLength();
    long timestamp = request.getTimestamp();
    if (timestamp > 0) {
      long transportTime = System.currentTimeMillis() - timestamp;
      if (transportTime > 0) {
        shuffleServer.getGrpcMetrics().recordTransportTime(
            ShuffleServerGrpcMetrics.GET_SHUFFLE_DATA_METHOD, transportTime);
      }
    }
    String storageType = shuffleServer.getShuffleServerConf().get(RssBaseConf.RSS_STORAGE_TYPE);
    StatusCode status = StatusCode.SUCCESS;
    String msg = "OK";
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    ShuffleDataResult sdr;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitionId["
        + partitionId + "]" + "offset[" + offset + "]" + "length[" + length + "]";

    int[] range = ShuffleStorageUtils.getPartitionRange(partitionId, partitionNumPerRange, partitionNum);
    Storage storage = shuffleServer
        .getStorageManager()
        .selectStorage(
            new ShuffleDataReadEvent(appId, shuffleId, partitionId, range[0])
        );
    if (storage != null) {
      storage.updateReadMetrics(new StorageReadMetrics(appId, shuffleId));
    }
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
        long start = System.currentTimeMillis();
        sdr = shuffleServer.getShuffleTaskManager().getShuffleData(appId, shuffleId, partitionId,
            partitionNumPerRange, partitionNum, storageType, offset, length);
        long readTime = System.currentTimeMillis() - start;
        ShuffleServerMetrics.counterTotalReadTime.inc(readTime);
        ShuffleServerMetrics.counterTotalReadDataSize.inc(sdr.getData().length);
        ShuffleServerMetrics.counterTotalReadLocalDataFileSize.inc(sdr.getData().length);
        shuffleServer.getGrpcMetrics().recordProcessTime(
            ShuffleServerGrpcMetrics.GET_SHUFFLE_DATA_METHOD, readTime);
        LOG.info("Successfully getShuffleData cost {} ms for shuffle"
            + " data with {}", readTime, requestInfo);
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    String appId = request.getAppId();
    int shuffleId = request.getShuffleId();
    int partitionId = request.getPartitionId();
    int partitionNumPerRange = request.getPartitionNumPerRange();
    int partitionNum = request.getPartitionNum();
    StatusCode status = StatusCode.SUCCESS;
    String msg = "OK";
    GetLocalShuffleIndexResponse reply;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitionId["
        + partitionId + "]";

    int[] range = ShuffleStorageUtils.getPartitionRange(partitionId, partitionNumPerRange, partitionNum);
    Storage storage = shuffleServer.getStorageManager()
        .selectStorage(new ShuffleDataReadEvent(appId, shuffleId, partitionId, range[0]));
    if (storage != null) {
      storage.updateReadMetrics(new StorageReadMetrics(appId, shuffleId));
    }
    // Index file is expected small size and won't cause oom problem with the assumed size. An index segment is 40B,
    // with the default size - 2MB, it can support 50k blocks for shuffle data.
    long assumedFileSize = shuffleServer
        .getShuffleServerConf().getLong(ShuffleServerConf.SERVER_SHUFFLE_INDEX_SIZE_HINT);
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerGrpcService.java`
#### Snippet
```java
    String appId = request.getAppId();
    int shuffleId = request.getShuffleId();
    int partitionId = request.getPartitionId();
    long blockId = request.getLastBlockId();
    int readBufferSize = request.getReadBufferSize();
    long timestamp = request.getTimestamp();

    if (timestamp > 0) {
      long transportTime = System.currentTimeMillis() - timestamp;
      if (transportTime > 0) {
        shuffleServer.getGrpcMetrics().recordTransportTime(
            ShuffleServerGrpcMetrics.GET_MEMORY_SHUFFLE_DATA_METHOD, transportTime);
      }
    }
    long start = System.currentTimeMillis();
    StatusCode status = StatusCode.SUCCESS;
    String msg = "OK";
    GetMemoryShuffleDataResponse reply;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitionId["
        + partitionId + "]";
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
    counterTotalReceivedDataSize = metricsManager.addLabeledCounter(TOTAL_RECEIVED_DATA);
    counterTotalWriteDataSize = metricsManager.addLabeledCounter(TOTAL_WRITE_DATA);
    counterTotalWriteBlockSize = metricsManager.addLabeledCounter(TOTAL_WRITE_BLOCK);
    counterTotalWriteTime = metricsManager.addLabeledCounter(TOTAL_WRITE_TIME);
    counterWriteException = metricsManager.addLabeledCounter(TOTAL_WRITE_EXCEPTION);
    counterWriteSlow = metricsManager.addLabeledCounter(TOTAL_WRITE_SLOW);
    counterWriteTotal = metricsManager.addLabeledCounter(TOTAL_WRITE_NUM);
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleServerMetrics.java`
#### Snippet
```java
    gaugeLocalStorageTotalDirsNum = metricsManager.addLabeledGauge(LOCAL_STORAGE_TOTAL_DIRS_NUM);
    gaugeLocalStorageCorruptedDirsNum = metricsManager.addLabeledGauge(LOCAL_STORAGE_CORRUPTED_DIRS_NUM);
    gaugeLocalStorageTotalSpace = metricsManager.addLabeledGauge(LOCAL_STORAGE_TOTAL_SPACE);
    gaugeLocalStorageUsedSpace = metricsManager.addLabeledGauge(LOCAL_STORAGE_USED_SPACE);
    gaugeLocalStorageUsedSpaceRatio = metricsManager.addLabeledGauge(LOCAL_STORAGE_USED_SPACE_RATIO);

    gaugeIsHealthy = metricsManager.addLabeledGauge(IS_HEALTHY);
    gaugeAllocatedBufferSize = metricsManager.addLabeledGauge(ALLOCATED_BUFFER_SIZE);
    gaugeInFlushBufferSize = metricsManager.addLabeledGauge(IN_FLUSH_BUFFER_SIZE);
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
    CreateShuffleReadHandlerRequest request = new CreateShuffleReadHandlerRequest();
    request.setAppId(appId);
    request.setShuffleId(shuffleId);
    request.setPartitionId(partitionId);
    request.setPartitionNumPerRange(partitionNumPerRange);
    request.setPartitionNum(partitionNum);
    request.setStorageType(storageType);
    request.setRssBaseConf(conf);
    int[] range = ShuffleStorageUtils.getPartitionRange(partitionId, partitionNumPerRange, partitionNum);
    Storage storage = storageManager.selectStorage(new ShuffleDataReadEvent(appId, shuffleId, partitionId, range[0]));
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
      if (expectedTaskIds != null && !expectedTaskIds.contains(block.getTaskAttemptId())) {
        continue;
      }
      // add bufferSegment with block
      bufferSegments.add(new BufferSegment(block.getBlockId(), currentOffset, block.getLength(),
          block.getUncompressLength(), block.getCrc(), block.getTaskAttemptId()));
      readBlocks.add(block);
      // update offset
      currentOffset += block.getLength();
      // check if length >= request buffer size
      if (currentOffset >= readBufferSize) {
        break;
      }
```

### DuplicatedCode
Duplicated code
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleWriteHandler.java`
#### Snippet
```java
        for (ShufflePartitionedBlock block : shuffleBlocks) {
          long blockId = block.getBlockId();
          long crc = block.getCrc();
          long startOffset = dataWriter.nextOffset();
          dataWriter.writeData(ByteBufUtils.readBytes(block.getData()));

          FileBasedShuffleSegment segment = new FileBasedShuffleSegment(
              blockId, startOffset, block.getLength(), block.getUncompressLength(), crc, block.getTaskAttemptId());
          indexWriter.writeIndex(segment);
        }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
    final Map<String, String> result = new HashMap<>();

    try (InputStreamReader inReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
      Properties properties = new Properties();
      properties.load(inReader);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java
  public LocalFileReader(String path) throws Exception {
    this.path = path;
    dataInputStream = new DataInputStream(new FileInputStream(path));
  }

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

  public static final void copyByteBuf(ByteBuf from, ByteBuf to) {
    to.writeInt(from.readableBytes());
    to.writeBytes(from);
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java
    List<Long> indexTaskIds = new ArrayList<>();

    /**
     * One ShuffleDataSegment should meet following requirements:
     *
```

### DanglingJavadoc
Dangling Javadoc comment
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
    List<ShufflePartitionedBlock> inFlushedQueueBlocks = spBlocks;
    if (dataDistributionType == ShuffleDataDistributionType.LOCAL_ORDER) {
      /**
       * When reordering the blocks, it will break down the original reads sequence to cause
       * the data lost in some cases.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
  private AtomicLong crcCheckTime = new AtomicLong(0);
  private ClientReadHandler clientReadHandler;
  private IdHelper idHelper;

  public ShuffleReadClientImpl(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `coordinator/src/main/java/org/apache/uniffle/coordinator/access/checker/AccessQuotaChecker.java`
#### Snippet
```java

  private final QuotaManager quotaManager;
  private final CoordinatorConf conf;
  private static final LongAdder COUNTER = new LongAdder();
  private final String hostIp;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ApplicationManager.java`
#### Snippet
```java
  private static final List<String> REMOTE_PATH_SCHEMA = Arrays.asList("hdfs");
  private final long expired;
  private final StrategyName storageStrategy;
  private final SelectStorageStrategy selectStorageStrategy;
  // store appId -> remote path to make sure all shuffle data of the same application
```

### FieldCanBeLocal
Field can be converted to a local variable
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerInternalGrpcClient.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleServerInternalGrpcClient.class);
  private static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleServerInternalGrpc.ShuffleServerInternalBlockingStub blockingStub;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `cli/src/main/java/org/apache/uniffle/cli/UniffleCLI.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(UniffleCLI.class);
  private final Options allOptions;
  private final Option uniffleClientCli;
  private final Option uniffleAdminCli;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleManagerGrpcClient.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleManagerGrpcClient.class);
  private static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleManagerGrpc.ShuffleManagerBlockingStub blockingStub;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/org/apache/uniffle/common/config/ConfigOptions.java`
#### Snippet
```java
    private final String key;
    private final Class<E> clazz;
    private final Function<Object, E> atomicConverter;
    private Function<Object, List<E>> asListConverter;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/org/apache/uniffle/common/storage/StorageMedia.java`
#### Snippet
```java
  OBJECT_STORE(4);

  private final byte val;

  StorageMedia(int code) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private long commitCheckIntervalMax;
  private long leakShuffleDataCheckInterval;
  private long triggerFlushInterval;
  // appId -> shuffleId -> blockIds to avoid too many appId
  // store taskAttemptId info to filter speculation task
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private final ScheduledExecutorService scheduledExecutorService;
  private final ScheduledExecutorService expiredAppCleanupExecutorService;
  private final ScheduledExecutorService leakShuffleDataCheckExecutorService;
  private ScheduledExecutorService triggerFlushExecutorService;
  private final StorageManager storageManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private long preAllocationExpired;
  private long commitCheckIntervalMax;
  private long leakShuffleDataCheckInterval;
  private long triggerFlushInterval;
  // appId -> shuffleId -> blockIds to avoid too many appId
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private Map<String, ShuffleTaskInfo> shuffleTaskInfos = JavaUtils.newConcurrentMap();
  private Map<Long, PreAllocatedBufferInfo> requireBufferIds = JavaUtils.newConcurrentMap();
  private Runnable clearResourceThread;
  private BlockingQueue<PurgeEvent> expiredAppIdQueue = Queues.newLinkedBlockingQueue();

```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private final ScheduledExecutorService expiredAppCleanupExecutorService;
  private final ScheduledExecutorService leakShuffleDataCheckExecutorService;
  private ScheduledExecutorService triggerFlushExecutorService;
  private final StorageManager storageManager;
  private AtomicLong requireBufferId = new AtomicLong(0);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleTaskManager.class);
  private final ShuffleFlushManager shuffleFlushManager;
  private final ScheduledExecutorService scheduledExecutorService;
  private final ScheduledExecutorService expiredAppCleanupExecutorService;
  private final ScheduledExecutorService leakShuffleDataCheckExecutorService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private final ShuffleFlushManager shuffleFlushManager;
  private final ScheduledExecutorService scheduledExecutorService;
  private final ScheduledExecutorService expiredAppCleanupExecutorService;
  private final ScheduledExecutorService leakShuffleDataCheckExecutorService;
  private ScheduledExecutorService triggerFlushExecutorService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriter.java`
#### Snippet
```java

  private DataOutputStream dataOutputStream;
  private FileOutputStream fileOutputStream;
  private long nextOffset;

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `coordinator/src/main/java/org/apache/uniffle/coordinator/CoordinatorServer.java`
#### Snippet
```java
      return true;
    }
    if (accessManager.isPropertyReconfigurable(property)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `coordinator/src/main/java/org/apache/uniffle/coordinator/web/servlet/NodesServlet.java`
#### Snippet
```java
        return false;
      }
      if (status != null && !server.getStatus().toString().equals(status)) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `server/src/main/java/org/apache/uniffle/server/LocalStorageChecker.java`
#### Snippet
```java
        LOG.error("Storage read and write error. Storage dir: {}", storageDir, e);
        // avoid check bad track failure due to lack of disk space
        if (e.getMessage() !=  null && DEVICE_NO_SPACE_ERROR_MESSAGE.equals(e.getMessage())) {
          return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `server/src/main/java/org/apache/uniffle/server/storage/SingleStorageManager.java`
#### Snippet
```java
      Storage storage = selectStorage(event);
      // if storage is null, appId may not be registered
      if (storage == null || !storage.canWrite()) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    }
    Entry<Range<Integer>, ShuffleBuffer> entry = rangeToBuffers.getEntry(partitionId);
    if (entry == null) {
      return null;
    }
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'TransportClient' used without 'try'-with-resources statement
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClientFactory.java`
#### Snippet
```java
        }
      }
      clientPool.clients[clientIndex] = internalCreateClient(resolvedAddress, decoder);
      return clientPool.clients[clientIndex];
    }
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param shuffleServerInfoSet` tag description is missing
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   * This method will wait until all shuffle data have been flushed
   * to durable storage in assigned shuffle servers.
   * @param shuffleServerInfoSet
   * @param appId
   * @param shuffleId
```

### JavadocDeclaration
`@param appId` tag description is missing
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   * to durable storage in assigned shuffle servers.
   * @param shuffleServerInfoSet
   * @param appId
   * @param shuffleId
   * @param numMaps
```

### JavadocDeclaration
`@param shuffleId` tag description is missing
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   * @param shuffleServerInfoSet
   * @param appId
   * @param shuffleId
   * @param numMaps
   * @return
```

### JavadocDeclaration
`@param numMaps` tag description is missing
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   * @param appId
   * @param shuffleId
   * @param numMaps
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
   * @param shuffleId
   * @param numMaps
   * @return
   */
  @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/util/RetryUtils.java`
#### Snippet
```java
   * @param exceptionClasses exception classes which need to be retry, null for all.
   * @param <T>              return type
   * @return
   * @throws Throwable
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/util/RetryUtils.java`
#### Snippet
```java
   * @param <T>              return type
   * @return
   * @throws Throwable
   */
  public static <T> T retry(RetryCmd<T> cmd, RetryCallBack callBack, long intervalMs,
```

### JavadocDeclaration
`@param sourceLength` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/compression/Codec.java`
#### Snippet
```java
  /**
   * maximum size of the compressed data
   * @param sourceLength
   */
  public abstract int maxCompressedLength(int sourceLength);
```

### JavadocDeclaration
`@param src` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/compression/Codec.java`
#### Snippet
```java
  /**
   *
   * @param src
   * @param uncompressedLen
   * @param dest
```

### JavadocDeclaration
`@param uncompressedLen` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/compression/Codec.java`
#### Snippet
```java
   *
   * @param src
   * @param uncompressedLen
   * @param dest
   * @param destOffset
```

### JavadocDeclaration
`@param dest` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/compression/Codec.java`
#### Snippet
```java
   * @param src
   * @param uncompressedLen
   * @param dest
   * @param destOffset
   */
```

### JavadocDeclaration
`@param destOffset` tag description is missing
in `common/src/main/java/org/apache/uniffle/common/compression/Codec.java`
#### Snippet
```java
   * @param uncompressedLen
   * @param dest
   * @param destOffset
   */
  public abstract void decompress(ByteBuffer src, int uncompressedLen, ByteBuffer dest, int destOffset);
```

### JavadocDeclaration
Wrong tag `class`
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java

/**
 * {@class LocalOrderSegmentSplitter} will be initialized only when the {@class ShuffleDataDistributionType}
 * is LOCAL_ORDER, which means the index file will be split into several segments according to its
 * locally ordered properties. And it will skip some blocks, but the remaining blocks in a segment
```

### JavadocDeclaration
Wrong tag `class`
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java

/**
 * {@class LocalOrderSegmentSplitter} will be initialized only when the {@class ShuffleDataDistributionType}
 * is LOCAL_ORDER, which means the index file will be split into several segments according to its
 * locally ordered properties. And it will skip some blocks, but the remaining blocks in a segment
```

### JavadocDeclaration
`@param appId` tag description is missing
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  /**
   * Clear up the partial resources of shuffleIds of App.
   * @param appId
   * @param shuffleIds
   */
```

### JavadocDeclaration
`@param shuffleIds` tag description is missing
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
   * Clear up the partial resources of shuffleIds of App.
   * @param appId
   * @param shuffleIds
   */
  public void removeResourcesByShuffleIds(String appId, List<Integer> shuffleIds) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `storage/src/main/java/org/apache/uniffle/storage/handler/api/ShuffleWriteHandler.java`
#### Snippet
```java
   *
   * @param shuffleBlocks blocks to storage
   * @throws Exception
   */
  void write(List<ShufflePartitionedBlock> shuffleBlocks) throws Exception;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `readBufferSize` to `int` is redundant
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
    request.setPartitionNumPerRange(partitionNumPerRange);
    request.setPartitionNum(partitionNum);
    request.setReadBufferSize((int) readBufferSize);
    request.setStorageBasePath(storageBasePath);
    request.setShuffleServerInfoList(shuffleServerInfoList);
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `successBlockIds` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/response/SendShuffleDataResult.java`
#### Snippet
```java
public class SendShuffleDataResult {

  private Set<Long> successBlockIds;
  private Set<Long> failedBlockIds;

```

### FieldMayBeFinal
Field `uncompressLength` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/response/CompressedShuffleBlock.java`
#### Snippet
```java

  private ByteBuffer byteBuffer;
  private int uncompressLength;

  public CompressedShuffleBlock(ByteBuffer byteBuffer, int uncompressLength) {
```

### FieldMayBeFinal
Field `failedBlockIds` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/response/SendShuffleDataResult.java`
#### Snippet
```java

  private Set<Long> successBlockIds;
  private Set<Long> failedBlockIds;

  public SendShuffleDataResult(Set<Long> successBlockIds, Set<Long> failedBlockIds) {
```

### FieldMayBeFinal
Field `byteBuffer` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/response/CompressedShuffleBlock.java`
#### Snippet
```java
public class CompressedShuffleBlock {

  private ByteBuffer byteBuffer;
  private int uncompressLength;

```

### FieldMayBeFinal
Field `basePath` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int partitionId;
  private String basePath;
  private int partitionNumPerRange;
  private int partitionNum;
```

### FieldMayBeFinal
Field `idHelper` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private List<ShuffleServerInfo> shuffleServerInfoList;
  private Configuration hadoopConf;
  private IdHelper idHelper;
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
  private boolean expectedTaskIdsBitmapFilterEnable = false;
```

### FieldMayBeFinal
Field `shuffleServerInfoList` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private Roaring64NavigableMap blockIdBitmap;
  private Roaring64NavigableMap taskIdBitmap;
  private List<ShuffleServerInfo> shuffleServerInfoList;
  private Configuration hadoopConf;
  private IdHelper idHelper;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;
  private int partitionId;
  private String basePath;
```

### FieldMayBeFinal
Field `partitionNum` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private String basePath;
  private int partitionNumPerRange;
  private int partitionNum;
  private Roaring64NavigableMap blockIdBitmap;
  private Roaring64NavigableMap taskIdBitmap;
```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;
  private String basePath;
  private int partitionNumPerRange;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
public class CreateShuffleReadClientRequest {

  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `blockIdBitmap` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private int partitionNumPerRange;
  private int partitionNum;
  private Roaring64NavigableMap blockIdBitmap;
  private Roaring64NavigableMap taskIdBitmap;
  private List<ShuffleServerInfo> shuffleServerInfoList;
```

### FieldMayBeFinal
Field `taskIdBitmap` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private int partitionNum;
  private Roaring64NavigableMap blockIdBitmap;
  private Roaring64NavigableMap taskIdBitmap;
  private List<ShuffleServerInfo> shuffleServerInfoList;
  private Configuration hadoopConf;
```

### FieldMayBeFinal
Field `partitionNumPerRange` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private int partitionId;
  private String basePath;
  private int partitionNumPerRange;
  private int partitionNum;
  private Roaring64NavigableMap blockIdBitmap;
```

### FieldMayBeFinal
Field `hadoopConf` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private Roaring64NavigableMap taskIdBitmap;
  private List<ShuffleServerInfo> shuffleServerInfoList;
  private Configuration hadoopConf;
  private IdHelper idHelper;
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
```

### FieldMayBeFinal
Field `preAllocatedMemory` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private int grpcPort;
  private long usedMemory;
  private long preAllocatedMemory;
  private long availableMemory;
  private int eventNumInFlush;
```

### FieldMayBeFinal
Field `usedMemory` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private String ip;
  private int grpcPort;
  private long usedMemory;
  private long preAllocatedMemory;
  private long availableMemory;
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private int eventNumInFlush;
  private long timestamp;
  private Set<String> tags;
  private boolean isHealthy;
  private final ServerStatus status;
```

### FieldMayBeFinal
Field `availableMemory` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private long usedMemory;
  private long preAllocatedMemory;
  private long availableMemory;
  private int eventNumInFlush;
  private long timestamp;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
public class ServerNode implements Comparable<ServerNode> {

  private String id;
  private String ip;
  private int grpcPort;
```

### FieldMayBeFinal
Field `ip` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java

  private String id;
  private String ip;
  private int grpcPort;
  private long usedMemory;
```

### FieldMayBeFinal
Field `eventNumInFlush` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private long preAllocatedMemory;
  private long availableMemory;
  private int eventNumInFlush;
  private long timestamp;
  private Set<String> tags;
```

### FieldMayBeFinal
Field `isHealthy` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private long timestamp;
  private Set<String> tags;
  private boolean isHealthy;
  private final ServerStatus status;
  private Map<String, StorageInfo> storageInfo;
```

### FieldMayBeFinal
Field `storageInfo` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private boolean isHealthy;
  private final ServerStatus status;
  private Map<String, StorageInfo> storageInfo;
  private int nettyPort = -1;

```

### FieldMayBeFinal
Field `grpcPort` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ServerNode.java`
#### Snippet
```java
  private String id;
  private String ip;
  private int grpcPort;
  private long usedMemory;
  private long preAllocatedMemory;
```

### FieldMayBeFinal
Field `crcCheckTime` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
  private AtomicLong readDataTime = new AtomicLong(0);
  private AtomicLong copyTime = new AtomicLong(0);
  private AtomicLong crcCheckTime = new AtomicLong(0);
  private ClientReadHandler clientReadHandler;
  private IdHelper idHelper;
```

### FieldMayBeFinal
Field `readDataTime` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
  private Roaring64NavigableMap processedBlockIds = Roaring64NavigableMap.bitmapOf();
  private Queue<BufferSegment> bufferSegmentQueue = Queues.newLinkedBlockingQueue();
  private AtomicLong readDataTime = new AtomicLong(0);
  private AtomicLong copyTime = new AtomicLong(0);
  private AtomicLong crcCheckTime = new AtomicLong(0);
```

### FieldMayBeFinal
Field `copyTime` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
  private Queue<BufferSegment> bufferSegmentQueue = Queues.newLinkedBlockingQueue();
  private AtomicLong readDataTime = new AtomicLong(0);
  private AtomicLong copyTime = new AtomicLong(0);
  private AtomicLong crcCheckTime = new AtomicLong(0);
  private ClientReadHandler clientReadHandler;
```

### FieldMayBeFinal
Field `bufferSegmentQueue` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
  private Roaring64NavigableMap pendingBlockIds;
  private Roaring64NavigableMap processedBlockIds = Roaring64NavigableMap.bitmapOf();
  private Queue<BufferSegment> bufferSegmentQueue = Queues.newLinkedBlockingQueue();
  private AtomicLong readDataTime = new AtomicLong(0);
  private AtomicLong copyTime = new AtomicLong(0);
```

### FieldMayBeFinal
Field `processedBlockIds` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleReadClientImpl.java`
#### Snippet
```java
  private Roaring64NavigableMap taskIdBitmap;
  private Roaring64NavigableMap pendingBlockIds;
  private Roaring64NavigableMap processedBlockIds = Roaring64NavigableMap.bitmapOf();
  private Queue<BufferSegment> bufferSegmentQueue = Queues.newLinkedBlockingQueue();
  private AtomicLong readDataTime = new AtomicLong(0);
```

### FieldMayBeFinal
Field `heartbeatTimeout` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  private Map<String, Set<ServerNode>> tagToNodes = JavaUtils.newConcurrentMap();
  private AtomicLong excludeLastModify = new AtomicLong(0L);
  private long heartbeatTimeout;
  private volatile int shuffleNodesMax;
  private ScheduledExecutorService scheduledExecutorService;
```

### FieldMayBeFinal
Field `tagToNodes` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  private Set<String> excludeNodes = Sets.newConcurrentHashSet();
  // tag -> nodes
  private Map<String, Set<ServerNode>> tagToNodes = JavaUtils.newConcurrentMap();
  private AtomicLong excludeLastModify = new AtomicLong(0L);
  private long heartbeatTimeout;
```

### FieldMayBeFinal
Field `startupSilentPeriodDurationMs` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  private long startTime;
  private boolean startupSilentPeriodEnabled;
  private long startupSilentPeriodDurationMs;
  private boolean readyForServe = false;

```

### FieldMayBeFinal
Field `excludeLastModify` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  // tag -> nodes
  private Map<String, Set<ServerNode>> tagToNodes = JavaUtils.newConcurrentMap();
  private AtomicLong excludeLastModify = new AtomicLong(0L);
  private long heartbeatTimeout;
  private volatile int shuffleNodesMax;
```

### FieldMayBeFinal
Field `scheduledExecutorService` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/SimpleClusterManager.java`
#### Snippet
```java
  private long heartbeatTimeout;
  private volatile int shuffleNodesMax;
  private ScheduledExecutorService scheduledExecutorService;
  private ScheduledExecutorService checkNodesExecutorService;
  private FileSystem hadoopFileSystem;
```

### FieldMayBeFinal
Field `strategy` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/host/PreferDiffHostAssignmentStrategy.java`
#### Snippet
```java
public class PreferDiffHostAssignmentStrategy implements HostAssignmentStrategy {

  private MustDiffHostAssignmentStrategy strategy;

  public PreferDiffHostAssignmentStrategy() {
```

### FieldMayBeFinal
Field `clusterManager` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/BasicAssignmentStrategy.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(BasicAssignmentStrategy.class);

  private ClusterManager clusterManager;

  public BasicAssignmentStrategy(ClusterManager clusterManager, CoordinatorConf conf) {
```

### FieldMayBeFinal
Field `clusterManager` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/AssignmentStrategyFactory.java`
#### Snippet
```java

  private CoordinatorConf conf;
  private ClusterManager clusterManager;

  public AssignmentStrategyFactory(CoordinatorConf conf, ClusterManager clusterManager) {
```

### FieldMayBeFinal
Field `conf` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/AssignmentStrategyFactory.java`
#### Snippet
```java
public class AssignmentStrategyFactory {

  private CoordinatorConf conf;
  private ClusterManager clusterManager;

```

### FieldMayBeFinal
Field `clusterManager` may be 'final'
in `coordinator/src/main/java/org/apache/uniffle/coordinator/strategy/assignment/PartitionBalanceAssignmentStrategy.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(PartitionBalanceAssignmentStrategy.class);

  private ClusterManager clusterManager;
  private Map<ServerNode, PartitionAssignmentInfo> serverToPartitions = JavaUtils.newConcurrentMap();

```

### FieldMayBeFinal
Field `blockingStub` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerInternalGrpcClient.java`
#### Snippet
```java
  private static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleServerInternalGrpc.ShuffleServerInternalBlockingStub blockingStub;

  public ShuffleServerInternalGrpcClient(String host, int port) {
```

### FieldMayBeFinal
Field `rpcTimeout` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerInternalGrpcClient.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleServerInternalGrpcClient.class);
  private static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleServerInternalGrpc.ShuffleServerInternalBlockingStub blockingStub;

```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssSendCommitRequest.java`
#### Snippet
```java
public class RssSendCommitRequest {

  private String appId;
  private int shuffleId;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssSendCommitRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;

  public RssSendCommitRequest(String appId, int shuffleId) {
```

### FieldMayBeFinal
Field `blockingStub` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleManagerGrpcClient.java`
#### Snippet
```java
  private static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleManagerGrpc.ShuffleManagerBlockingStub blockingStub;

  public ShuffleManagerGrpcClient(String host, int port) {
```

### FieldMayBeFinal
Field `rpcTimeout` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleManagerGrpcClient.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleManagerGrpcClient.class);
  private static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleManagerGrpc.ShuffleManagerBlockingStub blockingStub;

```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleFetchFailureRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int stageAttemptId;
  private int partitionId;
  private String exception;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleFetchFailureRequest.java`
#### Snippet
```java
public class RssReportShuffleFetchFailureRequest {
  private String appId;
  private int shuffleId;
  private int stageAttemptId;
  private int partitionId;
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleFetchFailureRequest.java`
#### Snippet
```java
  private int stageAttemptId;
  private int partitionId;
  private String exception;

  public RssReportShuffleFetchFailureRequest(
```

### FieldMayBeFinal
Field `stageAttemptId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleFetchFailureRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int stageAttemptId;
  private int partitionId;
  private String exception;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleFetchFailureRequest.java`
#### Snippet
```java

public class RssReportShuffleFetchFailureRequest {
  private String appId;
  private int shuffleId;
  private int stageAttemptId;
```

### FieldMayBeFinal
Field `clientType` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/factory/CoordinatorClientFactory.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(CoordinatorClientFactory.class);

  private ClientType clientType;

  public CoordinatorClientFactory(ClientType clientType) {
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssSendShuffleDataRequest.java`
#### Snippet
```java
public class RssSendShuffleDataRequest {

  private String appId;
  private int retryMax;
  private long retryIntervalMax;
```

### FieldMayBeFinal
Field `retryIntervalMax` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssSendShuffleDataRequest.java`
#### Snippet
```java
  private String appId;
  private int retryMax;
  private long retryIntervalMax;
  private Map<Integer, Map<Integer, List<ShuffleBlockInfo>>> shuffleIdToBlocks;

```

### FieldMayBeFinal
Field `shuffleIdToBlocks` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssSendShuffleDataRequest.java`
#### Snippet
```java
  private int retryMax;
  private long retryIntervalMax;
  private Map<Integer, Map<Integer, List<ShuffleBlockInfo>>> shuffleIdToBlocks;

  public RssSendShuffleDataRequest(String appId, int retryMax, long retryIntervalMax,
```

### FieldMayBeFinal
Field `retryMax` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssSendShuffleDataRequest.java`
#### Snippet
```java

  private String appId;
  private int retryMax;
  private long retryIntervalMax;
  private Map<Integer, Map<Integer, List<ShuffleBlockInfo>>> shuffleIdToBlocks;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleResultRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;
  private int partitionId;

```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleResultRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;

  public RssGetShuffleResultRequest(String appId, int shuffleId, int partitionId) {
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleResultRequest.java`
#### Snippet
```java
public class RssGetShuffleResultRequest {

  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `assignmentShuffleServerNumber` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
  private int dataReplica;
  private Set<String> requiredTags;
  private int assignmentShuffleServerNumber;
  private int estimateTaskConcurrency;

```

### FieldMayBeFinal
Field `dataReplica` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
  private int partitionNum;
  private int partitionNumPerRange;
  private int dataReplica;
  private Set<String> requiredTags;
  private int assignmentShuffleServerNumber;
```

### FieldMayBeFinal
Field `partitionNumPerRange` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int partitionNum;
  private int partitionNumPerRange;
  private int dataReplica;
  private Set<String> requiredTags;
```

### FieldMayBeFinal
Field `partitionNum` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionNum;
  private int partitionNumPerRange;
  private int dataReplica;
```

### FieldMayBeFinal
Field `estimateTaskConcurrency` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
  private Set<String> requiredTags;
  private int assignmentShuffleServerNumber;
  private int estimateTaskConcurrency;

  @VisibleForTesting
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;
  private int partitionNum;
  private int partitionNumPerRange;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
public class RssGetShuffleAssignmentsRequest {

  private String appId;
  private int shuffleId;
  private int partitionNum;
```

### FieldMayBeFinal
Field `requiredTags` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleAssignmentsRequest.java`
#### Snippet
```java
  private int partitionNumPerRange;
  private int dataReplica;
  private Set<String> requiredTags;
  private int assignmentShuffleServerNumber;
  private int estimateTaskConcurrency;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssUnregisterShuffleRequest.java`
#### Snippet
```java
public class RssUnregisterShuffleRequest {
  private String appId;
  private int shuffleId;

  public RssUnregisterShuffleRequest(String appId, int shuffleId) {
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssUnregisterShuffleRequest.java`
#### Snippet
```java

public class RssUnregisterShuffleRequest {
  private String appId;
  private int shuffleId;

```

### FieldMayBeFinal
Field `bitmapNum` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleResultRequest.java`
#### Snippet
```java
  private int shuffleId;
  private long taskAttemptId;
  private int bitmapNum;
  private Map<Integer, List<Long>> partitionToBlockIds;

```

### FieldMayBeFinal
Field `partitionToBlockIds` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleResultRequest.java`
#### Snippet
```java
  private long taskAttemptId;
  private int bitmapNum;
  private Map<Integer, List<Long>> partitionToBlockIds;

  public RssReportShuffleResultRequest(String appId, int shuffleId, long taskAttemptId,
```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleResultRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private long taskAttemptId;
  private int bitmapNum;
  private Map<Integer, List<Long>> partitionToBlockIds;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleResultRequest.java`
#### Snippet
```java
public class RssReportShuffleResultRequest {

  private String appId;
  private int shuffleId;
  private long taskAttemptId;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleResultForMultiPartRequest.java`
#### Snippet
```java

public class RssGetShuffleResultForMultiPartRequest {
  private String appId;
  private int shuffleId;
  private Set<Integer> partitions;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleResultForMultiPartRequest.java`
#### Snippet
```java
public class RssGetShuffleResultForMultiPartRequest {
  private String appId;
  private int shuffleId;
  private Set<Integer> partitions;

```

### FieldMayBeFinal
Field `partitions` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssGetShuffleResultForMultiPartRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private Set<Integer> partitions;

  public RssGetShuffleResultForMultiPartRequest(String appId, int shuffleId, Set<Integer> partitions) {
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssReportShuffleResultRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;
  private long taskAttemptId;
  private int bitmapNum;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssFetchRemoteStorageRequest.java`
#### Snippet
```java
public class RssFetchRemoteStorageRequest {

  private String appId;

  public RssFetchRemoteStorageRequest(String appId) {
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssFinishShuffleRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;

  public RssFinishShuffleRequest(String appId, int shuffleId) {
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssFinishShuffleRequest.java`
#### Snippet
```java
public class RssFinishShuffleRequest {

  private String appId;
  private int shuffleId;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;
  private List<PartitionRange> partitionRanges;
  private RemoteStorageInfo remoteStorageInfo;
```

### FieldMayBeFinal
Field `dataDistributionType` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java
  private RemoteStorageInfo remoteStorageInfo;
  private String user;
  private ShuffleDataDistributionType dataDistributionType;
  private int maxConcurrencyPerPartitionToWrite;

```

### FieldMayBeFinal
Field `user` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java
  private List<PartitionRange> partitionRanges;
  private RemoteStorageInfo remoteStorageInfo;
  private String user;
  private ShuffleDataDistributionType dataDistributionType;
  private int maxConcurrencyPerPartitionToWrite;
```

### FieldMayBeFinal
Field `remoteStorageInfo` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java
  private int shuffleId;
  private List<PartitionRange> partitionRanges;
  private RemoteStorageInfo remoteStorageInfo;
  private String user;
  private ShuffleDataDistributionType dataDistributionType;
```

### FieldMayBeFinal
Field `partitionRanges` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private List<PartitionRange> partitionRanges;
  private RemoteStorageInfo remoteStorageInfo;
  private String user;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java
public class RssRegisterShuffleRequest {

  private String appId;
  private int shuffleId;
  private List<PartitionRange> partitionRanges;
```

### FieldMayBeFinal
Field `maxConcurrencyPerPartitionToWrite` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/request/RssRegisterShuffleRequest.java`
#### Snippet
```java
  private String user;
  private ShuffleDataDistributionType dataDistributionType;
  private int maxConcurrencyPerPartitionToWrite;

  public RssRegisterShuffleRequest(
```

### FieldMayBeFinal
Field `remoteStorageInfo` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/response/RssFetchRemoteStorageResponse.java`
#### Snippet
```java

public class RssFetchRemoteStorageResponse extends ClientResponse {
  private RemoteStorageInfo remoteStorageInfo;

  public RssFetchRemoteStorageResponse(
```

### FieldMayBeFinal
Field `retMsg` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/response/RssDecommissionResponse.java`
#### Snippet
```java

public class RssDecommissionResponse extends ClientResponse {
  private String retMsg;

  public RssDecommissionResponse(StatusCode statusCode, String retMsg) {
```

### FieldMayBeFinal
Field `reSubmitWholeStage` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/response/RssReportShuffleFetchFailureResponse.java`
#### Snippet
```java

public class RssReportShuffleFetchFailureResponse extends ClientResponse {
  private boolean reSubmitWholeStage;

  public RssReportShuffleFetchFailureResponse(StatusCode code, String msg, boolean recomputeStage) {
```

### FieldMayBeFinal
Field `blockIdBitmap` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/response/RssGetShuffleResultResponse.java`
#### Snippet
```java
public class RssGetShuffleResultResponse extends ClientResponse {

  private Roaring64NavigableMap blockIdBitmap;

  public RssGetShuffleResultResponse(StatusCode statusCode, byte[] serializedBitmap) throws IOException {
```

### FieldMayBeFinal
Field `retMsg` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/response/RssCancelDecommissionResponse.java`
#### Snippet
```java

public class RssCancelDecommissionResponse extends ClientResponse {
  private String retMsg;

  public RssCancelDecommissionResponse(StatusCode statusCode, String retMsg) {
```

### FieldMayBeFinal
Field `clientFactory` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcNettyClient.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleServerGrpcNettyClient.class);
  private int nettyPort;
  private TransportClientFactory clientFactory;

  public ShuffleServerGrpcNettyClient(RssConf rssConf, String host, int grpcPort, int nettyPort) {
```

### FieldMayBeFinal
Field `nettyPort` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcNettyClient.java`
#### Snippet
```java
public class ShuffleServerGrpcNettyClient extends ShuffleServerGrpcClient {
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleServerGrpcNettyClient.class);
  private int nettyPort;
  private TransportClientFactory clientFactory;

```

### FieldMayBeFinal
Field `partitionToServers` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleAssignmentsInfo.java`
#### Snippet
```java
public class ShuffleAssignmentsInfo {

  private Map<Integer, List<ShuffleServerInfo>> partitionToServers;
  private Map<ShuffleServerInfo, List<PartitionRange>> serverToPartitionRanges;

```

### FieldMayBeFinal
Field `serverToPartitionRanges` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleAssignmentsInfo.java`
#### Snippet
```java

  private Map<Integer, List<ShuffleServerInfo>> partitionToServers;
  private Map<ShuffleServerInfo, List<PartitionRange>> serverToPartitionRanges;

  public ShuffleAssignmentsInfo(
```

### FieldMayBeFinal
Field `blockList` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShufflePartitionedData.java`
#### Snippet
```java

  private int partitionId;
  private ShufflePartitionedBlock[] blockList;

  public ShufflePartitionedData(int partitionId, ShufflePartitionedBlock[] blockList) {
```

### FieldMayBeFinal
Field `partitionRanges` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleRegisterInfo.java`
#### Snippet
```java

  private ShuffleServerInfo shuffleServerInfo;
  private List<PartitionRange> partitionRanges;

  public ShuffleRegisterInfo(ShuffleServerInfo shuffleServerInfo, List<PartitionRange> partitionRanges) {
```

### FieldMayBeFinal
Field `shuffleServerInfo` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleRegisterInfo.java`
#### Snippet
```java
public class ShuffleRegisterInfo {

  private ShuffleServerInfo shuffleServerInfo;
  private List<PartitionRange> partitionRanges;

```

### FieldMayBeFinal
Field `blockingStub` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/CoordinatorGrpcClient.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(CoordinatorGrpcClient.class);
  private CoordinatorServerBlockingStub blockingStub;

  public CoordinatorGrpcClient(String host, int port) {
```

### FieldMayBeFinal
Field `clientType` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ShuffleWriteClientImpl.class);

  private String clientType;
  private int retryMax;
  private long retryIntervalMax;
```

### FieldMayBeFinal
Field `replicaWrite` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private ExecutorService heartBeatExecutorService;
  private int replica;
  private int replicaWrite;
  private int replicaRead;
  private boolean replicaSkipEnabled;
```

### FieldMayBeFinal
Field `retryIntervalMax` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private String clientType;
  private int retryMax;
  private long retryIntervalMax;
  private List<CoordinatorClient> coordinatorClients = Lists.newLinkedList();
  //appId -> shuffleId -> servers
```

### FieldMayBeFinal
Field `rssConf` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private final int unregisterRequestTimeSec;
  private Set<ShuffleServerInfo> defectiveServers;
  private RssConf rssConf;

  public ShuffleWriteClientImpl(
```

### FieldMayBeFinal
Field `replicaRead` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private int replica;
  private int replicaWrite;
  private int replicaRead;
  private boolean replicaSkipEnabled;
  private int dataCommitPoolSize = -1;
```

### FieldMayBeFinal
Field `blockId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/BufferSegment.java`
#### Snippet
```java
public class BufferSegment {

  private long blockId;
  private long offset;
  private int length;
```

### FieldMayBeFinal
Field `coordinatorClients` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private int retryMax;
  private long retryIntervalMax;
  private List<CoordinatorClient> coordinatorClients = Lists.newLinkedList();
  //appId -> shuffleId -> servers
  private Map<String, Map<Integer, Set<ShuffleServerInfo>>> shuffleServerInfoMap = JavaUtils.newConcurrentMap();
```

### FieldMayBeFinal
Field `offset` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/BufferSegment.java`
#### Snippet
```java

  private long blockId;
  private long offset;
  private int length;
  private int uncompressLength;
```

### FieldMayBeFinal
Field `replicaSkipEnabled` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private int replicaWrite;
  private int replicaRead;
  private boolean replicaSkipEnabled;
  private int dataCommitPoolSize = -1;
  private final ExecutorService dataTransferPool;
```

### FieldMayBeFinal
Field `uncompressLength` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/BufferSegment.java`
#### Snippet
```java
  private long offset;
  private int length;
  private int uncompressLength;
  private long crc;
  private long taskAttemptId;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/BufferSegment.java`
#### Snippet
```java
  private long blockId;
  private long offset;
  private int length;
  private int uncompressLength;
  private long crc;
```

### FieldMayBeFinal
Field `shuffleServerInfoMap` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private List<CoordinatorClient> coordinatorClients = Lists.newLinkedList();
  //appId -> shuffleId -> servers
  private Map<String, Map<Integer, Set<ShuffleServerInfo>>> shuffleServerInfoMap = JavaUtils.newConcurrentMap();
  private CoordinatorClientFactory coordinatorClientFactory;
  private ExecutorService heartBeatExecutorService;
```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/BufferSegment.java`
#### Snippet
```java
  private int uncompressLength;
  private long crc;
  private long taskAttemptId;

  public BufferSegment(long blockId, long offset, int length, int uncompressLength, long crc, long taskAttemptId) {
```

### FieldMayBeFinal
Field `replica` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private CoordinatorClientFactory coordinatorClientFactory;
  private ExecutorService heartBeatExecutorService;
  private int replica;
  private int replicaWrite;
  private int replicaRead;
```

### FieldMayBeFinal
Field `crc` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/BufferSegment.java`
#### Snippet
```java
  private int length;
  private int uncompressLength;
  private long crc;
  private long taskAttemptId;

```

### FieldMayBeFinal
Field `coordinatorClientFactory` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  //appId -> shuffleId -> servers
  private Map<String, Map<Integer, Set<ShuffleServerInfo>>> shuffleServerInfoMap = JavaUtils.newConcurrentMap();
  private CoordinatorClientFactory coordinatorClientFactory;
  private ExecutorService heartBeatExecutorService;
  private int replica;
```

### FieldMayBeFinal
Field `heartBeatExecutorService` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java
  private Map<String, Map<Integer, Set<ShuffleServerInfo>>> shuffleServerInfoMap = JavaUtils.newConcurrentMap();
  private CoordinatorClientFactory coordinatorClientFactory;
  private ExecutorService heartBeatExecutorService;
  private int replica;
  private int replicaWrite;
```

### FieldMayBeFinal
Field `retryMax` may be 'final'
in `client/src/main/java/org/apache/uniffle/client/impl/ShuffleWriteClientImpl.java`
#### Snippet
```java

  private String clientType;
  private int retryMax;
  private long retryIntervalMax;
  private List<CoordinatorClient> coordinatorClients = Lists.newLinkedList();
```

### FieldMayBeFinal
Field `grpcPort` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleServerInfo.java`
#### Snippet
```java
  private String host;

  private int grpcPort;

  private int nettyPort = -1;
```

### FieldMayBeFinal
Field `host` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleServerInfo.java`
#### Snippet
```java
  private String id;

  private String host;

  private int grpcPort;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleServerInfo.java`
#### Snippet
```java
public class ShuffleServerInfo implements Serializable {

  private String id;

  private String host;
```

### FieldMayBeFinal
Field `dataFileLen` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleIndexResult.java`
#### Snippet
```java
public class ShuffleIndexResult {
  private final ByteBuffer indexData;
  private long dataFileLen;

  public ShuffleIndexResult() {
```

### FieldMayBeFinal
Field `uncompressLength` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShufflePartitionedBlock.java`
#### Snippet
```java
  private long crc;
  private long blockId;
  private int uncompressLength;
  private ByteBuf data;
  private long taskAttemptId;
```

### FieldMayBeFinal
Field `blockId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java

  private int partitionId;
  private long blockId;
  private int length;
  private int shuffleId;
```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private int shuffleId;
  private long crc;
  private long taskAttemptId;
  private ByteBuf data;
  private List<ShuffleServerInfo> shuffleServerInfos;
```

### FieldMayBeFinal
Field `uncompressLength` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private ByteBuf data;
  private List<ShuffleServerInfo> shuffleServerInfos;
  private int uncompressLength;
  private long freeMemory;

```

### FieldMayBeFinal
Field `freeMemory` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private List<ShuffleServerInfo> shuffleServerInfos;
  private int uncompressLength;
  private long freeMemory;

  public ShuffleBlockInfo(int shuffleId, int partitionId, long blockId, int length, long crc,
```

### FieldMayBeFinal
Field `crc` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private int length;
  private int shuffleId;
  private long crc;
  private long taskAttemptId;
  private ByteBuf data;
```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
public class ShuffleBlockInfo {

  private int partitionId;
  private long blockId;
  private int length;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private long blockId;
  private int length;
  private int shuffleId;
  private long crc;
  private long taskAttemptId;
```

### FieldMayBeFinal
Field `data` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private long crc;
  private long taskAttemptId;
  private ByteBuf data;
  private List<ShuffleServerInfo> shuffleServerInfos;
  private int uncompressLength;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private int partitionId;
  private long blockId;
  private int length;
  private int shuffleId;
  private long crc;
```

### FieldMayBeFinal
Field `shuffleServerInfos` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/ShuffleBlockInfo.java`
#### Snippet
```java
  private long taskAttemptId;
  private ByteBuf data;
  private List<ShuffleServerInfo> shuffleServerInfos;
  private int uncompressLength;
  private long freeMemory;
```

### FieldMayBeFinal
Field `blockingStub` may be 'final'
in `internal-client/src/main/java/org/apache/uniffle/client/impl/grpc/ShuffleServerGrpcClient.java`
#### Snippet
```java
  protected static final long RPC_TIMEOUT_DEFAULT_MS = 60000;
  private long rpcTimeout = RPC_TIMEOUT_DEFAULT_MS;
  private ShuffleServerBlockingStub blockingStub;

  public ShuffleServerGrpcClient(String host, int port) {
```

### FieldMayBeFinal
Field `registry` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/web/CommonMetricsServlet.java`
#### Snippet
```java

  final boolean isPrometheus;
  private CollectorRegistry registry;

  public CommonMetricsServlet(CollectorRegistry registry) {
```

### FieldMayBeFinal
Field `servicesWithInterceptors` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/rpc/GrpcServer.java`
#### Snippet
```java
    private GRPCMetrics grpcMetrics;

    private List<Pair<BindableService, List<ServerInterceptor>>> servicesWithInterceptors = new ArrayList<>();

    public static Builder newBuilder() {
```

### FieldMayBeFinal
Field `servicesWithInterceptors` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/rpc/GrpcServer.java`
#### Snippet
```java
  private int listenPort;
  private final ExecutorService pool;
  private List<Pair<BindableService, List<ServerInterceptor>>> servicesWithInterceptors;
  private GRPCMetrics grpcMetrics;
  private RssBaseConf rssConf;
```

### FieldMayBeFinal
Field `rssConf` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/rpc/GrpcServer.java`
#### Snippet
```java
  private List<Pair<BindableService, List<ServerInterceptor>>> servicesWithInterceptors;
  private GRPCMetrics grpcMetrics;
  private RssBaseConf rssConf;

  protected GrpcServer(
```

### FieldMayBeFinal
Field `grpcMetrics` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/rpc/GrpcServer.java`
#### Snippet
```java
  private final ExecutorService pool;
  private List<Pair<BindableService, List<ServerInterceptor>>> servicesWithInterceptors;
  private GRPCMetrics grpcMetrics;
  private RssBaseConf rssConf;

```

### FieldMayBeFinal
Field `transportConf` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportContext.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(TransportContext.class);

  private TransportConf transportConf;
  private final BaseMessageHandler msgHandler;
  private boolean closeIdleConnections;
```

### FieldMayBeFinal
Field `closeIdleConnections` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportContext.java`
#### Snippet
```java
  private TransportConf transportConf;
  private final BaseMessageHandler msgHandler;
  private boolean closeIdleConnections;

  private static final MessageEncoder ENCODER = MessageEncoder.INSTANCE;
```

### FieldMayBeFinal
Field `outstandingRpcRequests` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/handle/TransportResponseHandler.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(TransportResponseHandler.class);

  private Map<Long, RpcResponseCallback> outstandingRpcRequests;
  private Channel channel;

```

### FieldMayBeFinal
Field `channel` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/handle/TransportResponseHandler.java`
#### Snippet
```java

  private Map<Long, RpcResponseCallback> outstandingRpcRequests;
  private Channel channel;

  /** Records the time (in system nanoseconds) that the last fetch or RPC request was sent. */
```

### FieldMayBeFinal
Field `headerBuf` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/TransportFrameDecoder.java`
#### Snippet
```java
  private int msgSize = -1;
  private Message.Type curType = Message.Type.UNKNOWN_TYPE;
  private ByteBuf headerBuf = Unpooled.buffer(HEADER_SIZE, HEADER_SIZE);
  private static final int MAX_FRAME_SIZE = Integer.MAX_VALUE;
  private static final int UNKNOWN_FRAME_SIZE = -1;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClient.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(TransportClient.class);

  private Channel channel;
  private TransportResponseHandler handler;
  private volatile boolean timedOut;
```

### FieldMayBeFinal
Field `handler` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClient.java`
#### Snippet
```java

  private Channel channel;
  private TransportResponseHandler handler;
  private volatile boolean timedOut;

```

### FieldMayBeFinal
Field `partitionNumPerRange` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int partitionId;
  private int partitionNumPerRange;
  private int partitionNum;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexRequest.java`
#### Snippet
```java
public class GetLocalShuffleIndexRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private int partitionId;
  private int partitionNumPerRange;
```

### FieldMayBeFinal
Field `partitionNum` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexRequest.java`
#### Snippet
```java
  private int partitionId;
  private int partitionNumPerRange;
  private int partitionNum;

  public GetLocalShuffleIndexRequest(long requestId, String appId, int shuffleId, int partitionId,
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexRequest.java`
#### Snippet
```java

public class GetLocalShuffleIndexRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;
  private int partitionNumPerRange;
  private int partitionNum;
```

### FieldMayBeFinal
Field `data` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataResponse.java`
#### Snippet
```java
public class GetMemoryShuffleDataResponse extends RpcResponse {
  private List<BufferSegment> bufferSegments;
  private ByteBuf data;

  public GetMemoryShuffleDataResponse(long requestId, StatusCode statusCode,
```

### FieldMayBeFinal
Field `bufferSegments` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataResponse.java`
#### Snippet
```java

public class GetMemoryShuffleDataResponse extends RpcResponse {
  private List<BufferSegment> bufferSegments;
  private ByteBuf data;

```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;
  private int partitionNumPerRange;
  private int partitionNum;
```

### FieldMayBeFinal
Field `timestamp` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
  private long offset;
  private int length;
  private long timestamp;

  public GetLocalShuffleDataRequest(long requestId, String appId, int shuffleId, int partitionId,
```

### FieldMayBeFinal
Field `offset` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
  private int partitionNumPerRange;
  private int partitionNum;
  private long offset;
  private int length;
  private long timestamp;
```

### FieldMayBeFinal
Field `partitionNum` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
  private int partitionId;
  private int partitionNumPerRange;
  private int partitionNum;
  private long offset;
  private int length;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java

public class GetLocalShuffleDataRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `partitionNumPerRange` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int partitionId;
  private int partitionNumPerRange;
  private int partitionNum;
  private long offset;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
  private int partitionNum;
  private long offset;
  private int length;
  private long timestamp;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataRequest.java`
#### Snippet
```java
public class GetLocalShuffleDataRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private int partitionId;
  private int partitionNumPerRange;
```

### FieldMayBeFinal
Field `expectedTaskIdsBitmap` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java
  private int readBufferSize;
  private long timestamp;
  private Roaring64NavigableMap expectedTaskIdsBitmap;

  public GetMemoryShuffleDataRequest(long requestId, String appId, int shuffleId, int partitionId, long lastBlockId,
```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;
  private long lastBlockId;
  private int readBufferSize;
```

### FieldMayBeFinal
Field `timestamp` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java
  private long lastBlockId;
  private int readBufferSize;
  private long timestamp;
  private Roaring64NavigableMap expectedTaskIdsBitmap;

```

### FieldMayBeFinal
Field `appId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java

public class GetMemoryShuffleDataRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `lastBlockId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int partitionId;
  private long lastBlockId;
  private int readBufferSize;
  private long timestamp;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java
public class GetMemoryShuffleDataRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private int partitionId;
  private long lastBlockId;
```

### FieldMayBeFinal
Field `readBufferSize` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetMemoryShuffleDataRequest.java`
#### Snippet
```java
  private int partitionId;
  private long lastBlockId;
  private int readBufferSize;
  private long timestamp;
  private Roaring64NavigableMap expectedTaskIdsBitmap;
```

### FieldMayBeFinal
Field `requestId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/RpcResponse.java`
#### Snippet
```java

public class RpcResponse extends Message {
  private long requestId;
  private StatusCode statusCode;
  private String retMessage;
```

### FieldMayBeFinal
Field `statusCode` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/RpcResponse.java`
#### Snippet
```java
public class RpcResponse extends Message {
  private long requestId;
  private StatusCode statusCode;
  private String retMessage;

```

### FieldMayBeFinal
Field `retMessage` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/RpcResponse.java`
#### Snippet
```java
  private long requestId;
  private StatusCode statusCode;
  private String retMessage;

  public RpcResponse(long requestId, StatusCode statusCode) {
```

### FieldMayBeFinal
Field `data` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleDataResponse.java`
#### Snippet
```java

public class GetLocalShuffleDataResponse extends RpcResponse {
  private ByteBuf data;

  public GetLocalShuffleDataResponse(long requestId, StatusCode statusCode, byte[] data) {
```

### FieldMayBeFinal
Field `indexData` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexResponse.java`
#### Snippet
```java

public class GetLocalShuffleIndexResponse extends RpcResponse {
  private ByteBuf indexData;
  private long fileLength;

```

### FieldMayBeFinal
Field `fileLength` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/GetLocalShuffleIndexResponse.java`
#### Snippet
```java
public class GetLocalShuffleIndexResponse extends RpcResponse {
  private ByteBuf indexData;
  private long fileLength;

  public GetLocalShuffleIndexResponse(long requestId, StatusCode statusCode, byte[] indexData, long fileLength) {
```

### FieldMayBeFinal
Field `requireId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/SendShuffleDataRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private long requireId;
  private Map<Integer, List<ShuffleBlockInfo>> partitionToBlocks;
  private long timestamp;
```

### FieldMayBeFinal
Field `timestamp` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/SendShuffleDataRequest.java`
#### Snippet
```java
  private long requireId;
  private Map<Integer, List<ShuffleBlockInfo>> partitionToBlocks;
  private long timestamp;

  public SendShuffleDataRequest(long requestId, String appId, int shuffleId, long requireId,
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/SendShuffleDataRequest.java`
#### Snippet
```java
public class SendShuffleDataRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private long requireId;
  private Map<Integer, List<ShuffleBlockInfo>> partitionToBlocks;
```

### FieldMayBeFinal
Field `partitionToBlocks` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/SendShuffleDataRequest.java`
#### Snippet
```java
  private int shuffleId;
  private long requireId;
  private Map<Integer, List<ShuffleBlockInfo>> partitionToBlocks;
  private long timestamp;

```

### FieldMayBeFinal
Field `appId` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/protocol/SendShuffleDataRequest.java`
#### Snippet
```java

public class SendShuffleDataRequest extends RequestMessage {
  private String appId;
  private int shuffleId;
  private long requireId;
```

### FieldMayBeFinal
Field `workerGroup` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClientFactory.java`
#### Snippet
```java

  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  private PooledByteBufAllocator pooledAllocator;

```

### FieldMayBeFinal
Field `pooledAllocator` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClientFactory.java`
#### Snippet
```java
  private final Class<? extends Channel> socketChannelClass;
  private EventLoopGroup workerGroup;
  private PooledByteBufAllocator pooledAllocator;

  public TransportClientFactory(TransportContext context) {
```

### FieldMayBeFinal
Field `info` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/security/SecurityConfig.java`
#### Snippet
```java

  public static class Builder {
    private SecurityConfig info;

    public Builder() {
```

### FieldMayBeFinal
Field `writingSpeed5M` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  // -1 indicates these field is not used and shall not be serialized to proto.
  private long writingSpeed1M;
  private long writingSpeed5M;
  private long writingSpeed1H;
  private long numberOfWritingFailures;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
public class StorageInfo {
  private String mountPoint;
  private StorageMedia type;
  private long capacity;
  private long usedBytes;
```

### FieldMayBeFinal
Field `status` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  private long writingSpeed1H;
  private long numberOfWritingFailures;
  private StorageStatus status;

  public StorageInfo(
```

### FieldMayBeFinal
Field `writingSpeed1M` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  private long usedBytes;
  // -1 indicates these field is not used and shall not be serialized to proto.
  private long writingSpeed1M;
  private long writingSpeed5M;
  private long writingSpeed1H;
```

### FieldMayBeFinal
Field `capacity` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  private String mountPoint;
  private StorageMedia type;
  private long capacity;
  private long usedBytes;
  // -1 indicates these field is not used and shall not be serialized to proto.
```

### FieldMayBeFinal
Field `mountPoint` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java

public class StorageInfo {
  private String mountPoint;
  private StorageMedia type;
  private long capacity;
```

### FieldMayBeFinal
Field `usedBytes` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  private StorageMedia type;
  private long capacity;
  private long usedBytes;
  // -1 indicates these field is not used and shall not be serialized to proto.
  private long writingSpeed1M;
```

### FieldMayBeFinal
Field `numberOfWritingFailures` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  private long writingSpeed5M;
  private long writingSpeed1H;
  private long numberOfWritingFailures;
  private StorageStatus status;

```

### FieldMayBeFinal
Field `writingSpeed1H` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/storage/StorageInfo.java`
#### Snippet
```java
  private long writingSpeed1M;
  private long writingSpeed5M;
  private long writingSpeed1H;
  private long numberOfWritingFailures;
  private StorageStatus status;
```

### FieldMayBeFinal
Field `refreshScheduledExecutor` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/security/HadoopSecurityContext.java`
#### Snippet
```java

  private UserGroupInformation loginUgi;
  private ScheduledExecutorService refreshScheduledExecutor;

  // The purpose of the proxy user ugi cache is to prevent the creation of
```

### FieldMayBeFinal
Field `loginUgi` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/security/HadoopSecurityContext.java`
#### Snippet
```java
  private static final String KRB5_CONF_KEY = "java.security.krb5.conf";

  private UserGroupInformation loginUgi;
  private ScheduledExecutorService refreshScheduledExecutor;

```

### FieldMayBeFinal
Field `readBufferSize` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/segment/FixedSizeSegmentSplitter.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(FixedSizeSegmentSplitter.class);

  private int readBufferSize;

  public FixedSizeSegmentSplitter(int readBufferSize) {
```

### FieldMayBeFinal
Field `readBufferSize` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java

  private Roaring64NavigableMap expectTaskIds;
  private int readBufferSize;

  public LocalOrderSegmentSplitter(Roaring64NavigableMap expectTaskIds, int readBufferSize) {
```

### FieldMayBeFinal
Field `expectTaskIds` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/segment/LocalOrderSegmentSplitter.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(LocalOrderSegmentSplitter.class);

  private Roaring64NavigableMap expectTaskIds;
  private int readBufferSize;

```

### FieldMayBeFinal
Field `specification` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleSpecification.java`
#### Snippet
```java

  public static class Builder {
    private ShuffleSpecification specification;

    private Builder() {
```

### FieldMayBeFinal
Field `lz4Factory` may be 'final'
in `common/src/main/java/org/apache/uniffle/common/compression/Lz4Codec.java`
#### Snippet
```java
public class Lz4Codec extends Codec {

  private LZ4Factory lz4Factory;

  private static class LazyHolder {
```

### FieldMayBeFinal
Field `checkers` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/HealthCheck.java`
#### Snippet
```java
  private final Thread thread;
  private volatile boolean isStop = false;
  private List<Checker> checkers = Lists.newArrayList();

  public HealthCheck(AtomicBoolean isHealthy, ShuffleServerConf conf, List<Checker> buildInCheckers) {
```

### FieldMayBeFinal
Field `heartBeatTimeout` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/RegisterHeartBeat.java`
#### Snippet
```java
      ThreadUtils.getDaemonSingleThreadScheduledExecutor("startHeartBeat");
  private final ExecutorService heartBeatExecutorService;
  private long heartBeatTimeout;

  public RegisterHeartBeat(ShuffleServer shuffleServer) {
```

### FieldMayBeFinal
Field `startPartition` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleDataReadEvent.java`
#### Snippet
```java
  private int shuffleId;
  private int partitionId;
  private int startPartition;

  public ShuffleDataReadEvent(String appId, int shuffleId, int partitionId, int startPartitionOfRange) {
```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleDataReadEvent.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;
  private int startPartition;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleDataReadEvent.java`
#### Snippet
```java

  private String appId;
  private int shuffleId;
  private int partitionId;
  private int startPartition;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleDataReadEvent.java`
#### Snippet
```java
public class ShuffleDataReadEvent {

  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/event/PurgeEvent.java`
#### Snippet
```java
// mentioned in https://github.com/apache/incubator-uniffle/pull/249#discussion_r983001435
public abstract class PurgeEvent {
  private String appId;
  private String user;
  private List<Integer> shuffleIds;
```

### FieldMayBeFinal
Field `user` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/event/PurgeEvent.java`
#### Snippet
```java
public abstract class PurgeEvent {
  private String appId;
  private String user;
  private List<Integer> shuffleIds;

```

### FieldMayBeFinal
Field `shuffleIds` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/event/PurgeEvent.java`
#### Snippet
```java
  private String appId;
  private String user;
  private List<Integer> shuffleIds;

  public PurgeEvent(String appId, String user, List<Integer> shuffleIds) {
```

### FieldMayBeFinal
Field `commitLocks` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
   */
  private Map<Integer, AtomicInteger> commitCounts;
  private Map<Integer, Object> commitLocks;
  /**
   * shuffleId -> blockIds
```

### FieldMayBeFinal
Field `commitCounts` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
   * shuffleId -> commit count
   */
  private Map<Integer, AtomicInteger> commitCounts;
  private Map<Integer, Object> commitLocks;
  /**
```

### FieldMayBeFinal
Field `partitionDataSizes` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
   * shuffleId -> partitionId -> partition shuffle data size
   */
  private Map<Integer, Map<Integer, Long>> partitionDataSizes;
  /**
   * shuffleId -> huge partitionIds set
```

### FieldMayBeFinal
Field `totalDataSize` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
  private AtomicReference<String> user;

  private AtomicLong totalDataSize = new AtomicLong(0);
  /**
   * shuffleId -> partitionId -> partition shuffle data size
```

### FieldMayBeFinal
Field `cachedBlockIds` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
   * shuffleId -> blockIds
    */
  private Map<Integer, Roaring64NavigableMap> cachedBlockIds;
  private AtomicReference<String> user;

```

### FieldMayBeFinal
Field `user` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskInfo.java`
#### Snippet
```java
    */
  private Map<Integer, Roaring64NavigableMap> cachedBlockIds;
  private AtomicReference<String> user;

  private AtomicLong totalDataSize = new AtomicLong(0);
```

### FieldMayBeFinal
Field `isHealthy` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
  private HealthCheck healthCheck;
  private Set<String> tags = Sets.newHashSet();
  private AtomicBoolean isHealthy = new AtomicBoolean(true);
  private GRPCMetrics grpcMetrics;
  private MetricReporter metricReporter;
```

### FieldMayBeFinal
Field `shuffleServerConf` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
  private int grpcPort;
  private int nettyPort;
  private ShuffleServerConf shuffleServerConf;
  private JettyServer jettyServer;
  private ShuffleTaskManager shuffleTaskManager;
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleServer.java`
#### Snippet
```java
  private StorageManager storageManager;
  private HealthCheck healthCheck;
  private Set<String> tags = Sets.newHashSet();
  private AtomicBoolean isHealthy = new AtomicBoolean(true);
  private GRPCMetrics grpcMetrics;
```

### FieldMayBeFinal
Field `requireId` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/PreAllocatedBufferInfo.java`
#### Snippet
```java
public class PreAllocatedBufferInfo {

  private long requireId;
  private long timestamp;
  private int requireSize;
```

### FieldMayBeFinal
Field `timestamp` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/PreAllocatedBufferInfo.java`
#### Snippet
```java

  private long requireId;
  private long timestamp;
  private int requireSize;

```

### FieldMayBeFinal
Field `requireSize` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/PreAllocatedBufferInfo.java`
#### Snippet
```java
  private long requireId;
  private long timestamp;
  private int requireSize;

  public PreAllocatedBufferInfo(long requireId, long timestamp, int requireSize) {
```

### FieldMayBeFinal
Field `shuffleServerConf` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/netty/StreamServer.java`
#### Snippet
```java
  private EventLoopGroup shuffleBossGroup;
  private EventLoopGroup shuffleWorkerGroup;
  private ShuffleServerConf shuffleServerConf;
  private ChannelFuture channelFuture;

```

### FieldMayBeFinal
Field `shuffleServer` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/netty/StreamServer.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(StreamServer.class);

  private ShuffleServer shuffleServer;
  private EventLoopGroup shuffleBossGroup;
  private EventLoopGroup shuffleWorkerGroup;
```

### FieldMayBeFinal
Field `excludeTypes` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/storage/HadoopStorageManagerFallbackStrategy.java`
#### Snippet
```java
public class HadoopStorageManagerFallbackStrategy extends AbstractStorageManagerFallbackStrategy {
  private final Long fallBackTimes;
  private Set<Class<? extends StorageManager>> excludeTypes = Sets.newHashSet(HadoopStorageManager.class);

  public HadoopStorageManagerFallbackStrategy(ShuffleServerConf conf) {
```

### FieldMayBeFinal
Field `blocks` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  // it will be removed after flush to storage
  // the strategy ensure that shuffle is in memory or storage
  private List<ShufflePartitionedBlock> blocks;
  private Map<Long, List<ShufflePartitionedBlock>> inFlushBlockMap;

```

### FieldMayBeFinal
Field `inFlushBlockMap` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBuffer.java`
#### Snippet
```java
  // the strategy ensure that shuffle is in memory or storage
  private List<ShufflePartitionedBlock> blocks;
  private Map<Long, List<ShufflePartitionedBlock>> inFlushBlockMap;

  public ShuffleBuffer(long capacity) {
```

### FieldMayBeFinal
Field `committedBlockIds` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
  private Configuration hadoopConf;
  // appId -> shuffleId -> committed shuffle blockIds
  private Map<String, Map<Integer, Roaring64NavigableMap>> committedBlockIds = JavaUtils.newConcurrentMap();
  private final int retryMax;

```

### FieldMayBeFinal
Field `excludeTypes` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/storage/LocalStorageManagerFallbackStrategy.java`
#### Snippet
```java
public class LocalStorageManagerFallbackStrategy extends AbstractStorageManagerFallbackStrategy {
  private final Long fallBackTimes;
  private Set<Class<? extends StorageManager>> excludeTypes = Sets.newHashSet(LocalStorageManager.class);

  public LocalStorageManagerFallbackStrategy(ShuffleServerConf conf) {
```

### FieldMayBeFinal
Field `localStorageTypes` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/storage/StorageMediaFromEnvProvider.java`
#### Snippet
```java
public class StorageMediaFromEnvProvider implements StorageMediaProvider {
  private static Logger logger = LoggerFactory.getLogger(StorageMediaFromEnvProvider.class);
  private Map<String, StorageMedia> localStorageTypes = Maps.newHashMap();

  /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/storage/StorageMediaFromEnvProvider.java`
#### Snippet
```java

public class StorageMediaFromEnvProvider implements StorageMediaProvider {
  private static Logger logger = LoggerFactory.getLogger(StorageMediaFromEnvProvider.class);
  private Map<String, StorageMedia> localStorageTypes = Maps.newHashMap();

```

### FieldMayBeFinal
Field `preAllocationExpired` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private ShuffleServerConf conf;
  private long appExpiredWithoutHB;
  private long preAllocationExpired;
  private long commitCheckIntervalMax;
  private long leakShuffleDataCheckInterval;
```

### FieldMayBeFinal
Field `shuffleTaskInfos` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private Map<String, Map<Integer, Roaring64NavigableMap[]>> partitionsToBlockIds;
  private final ShuffleBufferManager shuffleBufferManager;
  private Map<String, ShuffleTaskInfo> shuffleTaskInfos = JavaUtils.newConcurrentMap();
  private Map<Long, PreAllocatedBufferInfo> requireBufferIds = JavaUtils.newConcurrentMap();
  private Runnable clearResourceThread;
```

### FieldMayBeFinal
Field `conf` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private final StorageManager storageManager;
  private AtomicLong requireBufferId = new AtomicLong(0);
  private ShuffleServerConf conf;
  private long appExpiredWithoutHB;
  private long preAllocationExpired;
```

### FieldMayBeFinal
Field `partitionsToBlockIds` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  // merge different blockId of partition to one bitmap can reduce memory cost,
  // but when get blockId, performance will degrade a little which can be optimized by client configuration
  private Map<String, Map<Integer, Roaring64NavigableMap[]>> partitionsToBlockIds;
  private final ShuffleBufferManager shuffleBufferManager;
  private Map<String, ShuffleTaskInfo> shuffleTaskInfos = JavaUtils.newConcurrentMap();
```

### FieldMayBeFinal
Field `appExpiredWithoutHB` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private AtomicLong requireBufferId = new AtomicLong(0);
  private ShuffleServerConf conf;
  private long appExpiredWithoutHB;
  private long preAllocationExpired;
  private long commitCheckIntervalMax;
```

### FieldMayBeFinal
Field `requireBufferIds` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private final ShuffleBufferManager shuffleBufferManager;
  private Map<String, ShuffleTaskInfo> shuffleTaskInfos = JavaUtils.newConcurrentMap();
  private Map<Long, PreAllocatedBufferInfo> requireBufferIds = JavaUtils.newConcurrentMap();
  private Runnable clearResourceThread;
  private BlockingQueue<PurgeEvent> expiredAppIdQueue = Queues.newLinkedBlockingQueue();
```

### FieldMayBeFinal
Field `triggerFlushInterval` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private long commitCheckIntervalMax;
  private long leakShuffleDataCheckInterval;
  private long triggerFlushInterval;
  // appId -> shuffleId -> blockIds to avoid too many appId
  // store taskAttemptId info to filter speculation task
```

### FieldMayBeFinal
Field `commitCheckIntervalMax` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private long appExpiredWithoutHB;
  private long preAllocationExpired;
  private long commitCheckIntervalMax;
  private long leakShuffleDataCheckInterval;
  private long triggerFlushInterval;
```

### FieldMayBeFinal
Field `requireBufferId` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private ScheduledExecutorService triggerFlushExecutorService;
  private final StorageManager storageManager;
  private AtomicLong requireBufferId = new AtomicLong(0);
  private ShuffleServerConf conf;
  private long appExpiredWithoutHB;
```

### FieldMayBeFinal
Field `leakShuffleDataCheckInterval` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private long preAllocationExpired;
  private long commitCheckIntervalMax;
  private long leakShuffleDataCheckInterval;
  private long triggerFlushInterval;
  // appId -> shuffleId -> blockIds to avoid too many appId
```

### FieldMayBeFinal
Field `clearResourceThread` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private Map<String, ShuffleTaskInfo> shuffleTaskInfos = JavaUtils.newConcurrentMap();
  private Map<Long, PreAllocatedBufferInfo> requireBufferIds = JavaUtils.newConcurrentMap();
  private Runnable clearResourceThread;
  private BlockingQueue<PurgeEvent> expiredAppIdQueue = Queues.newLinkedBlockingQueue();

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/StorageReadMetrics.java`
#### Snippet
```java
  private long lastReadTs;
  private String appId;
  private int shuffleId;

  public StorageReadMetrics(String appId, int shuffleId) {
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/StorageReadMetrics.java`
#### Snippet
```java

  private long lastReadTs;
  private String appId;
  private int shuffleId;

```

### FieldMayBeFinal
Field `lastReadTs` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/StorageReadMetrics.java`
#### Snippet
```java
public class StorageReadMetrics {

  private long lastReadTs;
  private String appId;
  private int shuffleId;
```

### FieldMayBeFinal
Field `expiredAppIdQueue` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  private Map<Long, PreAllocatedBufferInfo> requireBufferIds = JavaUtils.newConcurrentMap();
  private Runnable clearResourceThread;
  private BlockingQueue<PurgeEvent> expiredAppIdQueue = Queues.newLinkedBlockingQueue();

  public ShuffleTaskManager(
```

### FieldMayBeFinal
Field `val` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/util/StorageType.java`
#### Snippet
```java
  MEMORY_LOCALFILE_HDFS(7);

  private int val;

  StorageType(int val) {
```

### FieldMayBeFinal
Field `key` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/ShuffleInfo.java`
#### Snippet
```java

public class ShuffleInfo {
  private String key;
  private long size;

```

### FieldMayBeFinal
Field `size` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/ShuffleInfo.java`
#### Snippet
```java
public class ShuffleInfo {
  private String key;
  private long size;

  public ShuffleInfo(String key, long size) {
```

### FieldMayBeFinal
Field `pathToStorages` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/storage/HadoopStorageManager.java`
#### Snippet
```java
  private final Configuration hadoopConf;
  private Map<String, HadoopStorage> appIdToStorages = JavaUtils.newConcurrentMap();
  private Map<String, HadoopStorage> pathToStorages = JavaUtils.newConcurrentMap();

  HadoopStorageManager(ShuffleServerConf conf) {
```

### FieldMayBeFinal
Field `appIdToStorages` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/storage/HadoopStorageManager.java`
#### Snippet
```java

  private final Configuration hadoopConf;
  private Map<String, HadoopStorage> appIdToStorages = JavaUtils.newConcurrentMap();
  private Map<String, HadoopStorage> pathToStorages = JavaUtils.newConcurrentMap();

```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/FileBasedShuffleSegment.java`
#### Snippet
```java
  private long crc;
  private long blockId;
  private long taskAttemptId;

  public FileBasedShuffleSegment(
```

### FieldMayBeFinal
Field `uncompressLength` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/FileBasedShuffleSegment.java`
#### Snippet
```java
  private long offset;
  private int length;
  private int uncompressLength;
  private long crc;
  private long blockId;
```

### FieldMayBeFinal
Field `crc` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/FileBasedShuffleSegment.java`
#### Snippet
```java
  private int length;
  private int uncompressLength;
  private long crc;
  private long blockId;
  private long taskAttemptId;
```

### FieldMayBeFinal
Field `bufferFlushThreshold` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private long lowWaterMark;
  private boolean bufferFlushEnabled;
  private long bufferFlushThreshold;
  // when shuffle buffer manager flushes data, shuffles with data size < shuffleFlushThreshold is kept in memory to
  // reduce small I/Os to persistent storage, especially for local HDDs.
```

### FieldMayBeFinal
Field `readDataMemory` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  protected AtomicLong inFlushSize = new AtomicLong(0L);
  protected AtomicLong usedMemory = new AtomicLong(0L);
  private AtomicLong readDataMemory = new AtomicLong(0L);
  // appId -> shuffleId -> partitionId -> ShuffleBuffer to avoid too many appId
  protected Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> bufferPool;
```

### FieldMayBeFinal
Field `retryNum` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private long capacity;
  private long readCapacity;
  private int retryNum;
  private long highWaterMark;
  private long lowWaterMark;
```

### FieldMayBeFinal
Field `hugePartitionMemoryLimitSize` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  // Huge partition vars
  private long hugePartitionSizeThreshold;
  private long hugePartitionMemoryLimitSize;

  protected long bufferSize = 0;
```

### FieldMayBeFinal
Field `hugePartitionSizeThreshold` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private long shuffleFlushThreshold;
  // Huge partition vars
  private long hugePartitionSizeThreshold;
  private long hugePartitionMemoryLimitSize;

```

### FieldMayBeFinal
Field `bufferFlushEnabled` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private long highWaterMark;
  private long lowWaterMark;
  private boolean bufferFlushEnabled;
  private long bufferFlushThreshold;
  // when shuffle buffer manager flushes data, shuffles with data size < shuffleFlushThreshold is kept in memory to
```

### FieldMayBeFinal
Field `lowWaterMark` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private int retryNum;
  private long highWaterMark;
  private long lowWaterMark;
  private boolean bufferFlushEnabled;
  private long bufferFlushThreshold;
```

### FieldMayBeFinal
Field `shuffleFlushThreshold` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  // when shuffle buffer manager flushes data, shuffles with data size < shuffleFlushThreshold is kept in memory to
  // reduce small I/Os to persistent storage, especially for local HDDs.
  private long shuffleFlushThreshold;
  // Huge partition vars
  private long hugePartitionSizeThreshold;
```

### FieldMayBeFinal
Field `highWaterMark` may be 'final'
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
  private long readCapacity;
  private int retryNum;
  private long highWaterMark;
  private long lowWaterMark;
  private boolean bufferFlushEnabled;
```

### FieldMayBeFinal
Field `requests` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/AbstractStorage.java`
#### Snippet
```java

  private Map<String, Map<String, ShuffleWriteHandler>> writerHandlers = JavaUtils.newConcurrentMap();
  private Map<String, Map<String, CreateShuffleWriteHandlerRequest>> requests = JavaUtils.newConcurrentMap();
  private Map<String, Map<String, ServerReadHandler>> readerHandlers = JavaUtils.newConcurrentMap();

```

### FieldMayBeFinal
Field `writerHandlers` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/AbstractStorage.java`
#### Snippet
```java
public abstract class AbstractStorage implements Storage {

  private Map<String, Map<String, ShuffleWriteHandler>> writerHandlers = JavaUtils.newConcurrentMap();
  private Map<String, Map<String, CreateShuffleWriteHandlerRequest>> requests = JavaUtils.newConcurrentMap();
  private Map<String, Map<String, ServerReadHandler>> readerHandlers = JavaUtils.newConcurrentMap();
```

### FieldMayBeFinal
Field `readerHandlers` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/common/AbstractStorage.java`
#### Snippet
```java
  private Map<String, Map<String, ShuffleWriteHandler>> writerHandlers = JavaUtils.newConcurrentMap();
  private Map<String, Map<String, CreateShuffleWriteHandlerRequest>> requests = JavaUtils.newConcurrentMap();
  private Map<String, Map<String, ServerReadHandler>> readerHandlers = JavaUtils.newConcurrentMap();

  abstract ShuffleWriteHandler newWriteHandler(CreateShuffleWriteHandlerRequest request);
```

### FieldMayBeFinal
Field `dataInputStream` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(LocalFileReader.class);
  private String path;
  private DataInputStream dataInputStream;

  public LocalFileReader(String path) throws Exception {
```

### FieldMayBeFinal
Field `path` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileReader.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(LocalFileReader.class);
  private String path;
  private DataInputStream dataInputStream;

```

### FieldMayBeFinal
Field `shuffleServerClient` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/MemoryClientReadHandler.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MemoryClientReadHandler.class);
  private long lastBlockId = Constants.INVALID_BLOCK_ID;
  private ShuffleServerClient shuffleServerClient;
  private Roaring64NavigableMap expectTaskIds;
  
```

### FieldMayBeFinal
Field `expectTaskIds` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/MemoryClientReadHandler.java`
#### Snippet
```java
  private long lastBlockId = Constants.INVALID_BLOCK_ID;
  private ShuffleServerClient shuffleServerClient;
  private Roaring64NavigableMap expectTaskIds;
  
  public MemoryClientReadHandler(
```

### FieldMayBeFinal
Field `path` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopFileReader.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(HadoopFileReader.class);
  private Path path;
  private Configuration hadoopConf;
  private FSDataInputStream fsDataInputStream;
```

### FieldMayBeFinal
Field `hadoopConf` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopFileReader.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(HadoopFileReader.class);
  private Path path;
  private Configuration hadoopConf;
  private FSDataInputStream fsDataInputStream;
  private FileSystem fileSystem;
```

### FieldMayBeFinal
Field `path` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/FileSegment.java`
#### Snippet
```java
public class FileSegment {

  private String path;
  private long offset;
  private int length;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/FileSegment.java`
#### Snippet
```java
  private String path;
  private long offset;
  private int length;

  public FileSegment(String path, long offset, int length) {
```

### FieldMayBeFinal
Field `offset` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/FileSegment.java`
#### Snippet
```java

  private String path;
  private long offset;
  private int length;

```

### FieldMayBeFinal
Field `shuffleServerClient` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileClientReadHandler.java`
#### Snippet
```java
  private final int partitionNumPerRange;
  private final int partitionNum;
  private ShuffleServerClient shuffleServerClient;

  public LocalFileClientReadHandler(
```

### FieldMayBeFinal
Field `hadoopConf` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopFileWriter.java`
#### Snippet
```java

  private Path path;
  private Configuration hadoopConf;
  private FSDataOutputStream fsDataOutputStream;
  private long nextOffset;
```

### FieldMayBeFinal
Field `path` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopFileWriter.java`
#### Snippet
```java
  private final FileSystem fileSystem;

  private Path path;
  private Configuration hadoopConf;
  private FSDataOutputStream fsDataOutputStream;
```

### FieldMayBeFinal
Field `hadoopConf` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleDeleteHandler.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(HadoopShuffleDeleteHandler.class);

  private Configuration hadoopConf;

  public HadoopShuffleDeleteHandler(Configuration hadoopConf) {
```

### FieldMayBeFinal
Field `dataOutputStream` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriter.java`
#### Snippet
```java
public class LocalFileWriter implements FileWriter, Closeable {

  private DataOutputStream dataOutputStream;
  private FileOutputStream fileOutputStream;
  private long nextOffset;
```

### FieldMayBeFinal
Field `fileOutputStream` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriter.java`
#### Snippet
```java

  private DataOutputStream dataOutputStream;
  private FileOutputStream fileOutputStream;
  private long nextOffset;

```

### FieldMayBeFinal
Field `expectTaskIds` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopClientReadHandler.java`
#### Snippet
```java
  private int readHandlerIndex;
  private ShuffleDataDistributionType distributionType;
  private Roaring64NavigableMap expectTaskIds;
  private boolean offHeapEnable = false;

```

### FieldMayBeFinal
Field `distributionType` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopClientReadHandler.java`
#### Snippet
```java
  protected final List<HadoopShuffleReadHandler> readHandlers = Lists.newArrayList();
  private int readHandlerIndex;
  private ShuffleDataDistributionType distributionType;
  private Roaring64NavigableMap expectTaskIds;
  private boolean offHeapEnable = false;
```

### FieldMayBeFinal
Field `storageType` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleDeleteHandlerRequest.java`
#### Snippet
```java
public class CreateShuffleDeleteHandlerRequest {

  private String storageType;
  private Configuration conf;

```

### FieldMayBeFinal
Field `conf` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleDeleteHandlerRequest.java`
#### Snippet
```java

  private String storageType;
  private Configuration conf;

  public CreateShuffleDeleteHandlerRequest(String storageType, Configuration conf) {
```

### FieldMayBeFinal
Field `bufferSegments` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/DataFileSegment.java`
#### Snippet
```java
public class DataFileSegment extends FileSegment {

  private List<BufferSegment> bufferSegments;

  public DataFileSegment(String path, long offset, int length, List<BufferSegment> bufferSegments) {
```

### FieldMayBeFinal
Field `fileNamePrefix` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleWriteHandler.java`
#### Snippet
```java
  private Configuration hadoopConf;
  private String basePath;
  private String fileNamePrefix;
  private Lock writeLock = new ReentrantLock();
  private int failTimes = 0;
```

### FieldMayBeFinal
Field `basePath` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleWriteHandler.java`
#### Snippet
```java

  private Configuration hadoopConf;
  private String basePath;
  private String fileNamePrefix;
  private Lock writeLock = new ReentrantLock();
```

### FieldMayBeFinal
Field `hadoopConf` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleWriteHandler.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(HadoopShuffleWriteHandler.class);

  private Configuration hadoopConf;
  private String basePath;
  private String fileNamePrefix;
```

### FieldMayBeFinal
Field `writeLock` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleWriteHandler.java`
#### Snippet
```java
  private String basePath;
  private String fileNamePrefix;
  private Lock writeLock = new ReentrantLock();
  private int failTimes = 0;
  private String user;
```

### FieldMayBeFinal
Field `fileNamePrefix` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriteHandler.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(LocalFileWriteHandler.class);

  private String fileNamePrefix;
  private String basePath;

```

### FieldMayBeFinal
Field `basePath` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileWriteHandler.java`
#### Snippet
```java

  private String fileNamePrefix;
  private String basePath;

  public LocalFileWriteHandler(
```

### FieldMayBeFinal
Field `startPartition` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int startPartition;
  private int endPartition;
  private String[] storageBasePaths;
```

### FieldMayBeFinal
Field `maxFileNumber` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private int storageDataReplica;
  private String user;
  private int maxFileNumber;

  public CreateShuffleWriteHandlerRequest(
```

### FieldMayBeFinal
Field `endPartition` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private int shuffleId;
  private int startPartition;
  private int endPartition;
  private String[] storageBasePaths;
  private String fileNamePrefix;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private String storageType;
  private String appId;
  private int shuffleId;
  private int startPartition;
  private int endPartition;
```

### FieldMayBeFinal
Field `storageType` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
public class CreateShuffleWriteHandlerRequest {

  private String storageType;
  private String appId;
  private int shuffleId;
```

### FieldMayBeFinal
Field `conf` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private String[] storageBasePaths;
  private String fileNamePrefix;
  private Configuration conf;
  private int storageDataReplica;
  private String user;
```

### FieldMayBeFinal
Field `fileNamePrefix` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private int endPartition;
  private String[] storageBasePaths;
  private String fileNamePrefix;
  private Configuration conf;
  private int storageDataReplica;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java

  private String storageType;
  private String appId;
  private int shuffleId;
  private int startPartition;
```

### FieldMayBeFinal
Field `storageDataReplica` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private String fileNamePrefix;
  private Configuration conf;
  private int storageDataReplica;
  private String user;
  private int maxFileNumber;
```

### FieldMayBeFinal
Field `storageBasePaths` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/request/CreateShuffleWriteHandlerRequest.java`
#### Snippet
```java
  private int startPartition;
  private int endPartition;
  private String[] storageBasePaths;
  private String fileNamePrefix;
  private Configuration conf;
```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileServerReadHandler.java`
#### Snippet
```java
  private String dataFileName = "";
  private String appId;
  private int shuffleId;
  private int partitionId;

```

### FieldMayBeFinal
Field `appId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileServerReadHandler.java`
#### Snippet
```java
  private String indexFileName = "";
  private String dataFileName = "";
  private String appId;
  private int shuffleId;
  private int partitionId;
```

### FieldMayBeFinal
Field `partitionId` may be 'final'
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/LocalFileServerReadHandler.java`
#### Snippet
```java
  private String appId;
  private int shuffleId;
  private int partitionId;

  public LocalFileServerReadHandler(
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

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `handler`
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClientFactory.java`
#### Snippet
```java
      TransportChannelHandler handler =
          cachedClient.getChannel().pipeline().get(TransportChannelHandler.class);
      synchronized (handler) {
        handler.getResponseHandler().updateTimeOfLastRequest();
      }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bitmap`
in `server/src/main/java/org/apache/uniffle/server/ShuffleFlushManager.java`
#### Snippet
```java
    shuffleToBlockIds.computeIfAbsent(shuffleId, key -> Roaring64NavigableMap.bitmapOf());
    Roaring64NavigableMap bitmap = shuffleToBlockIds.get(shuffleId);
    synchronized (bitmap) {
      for (ShufflePartitionedBlock spb : blocks) {
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

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `value` is redundant
in `common/src/main/java/org/apache/uniffle/common/config/RssConf.java`
#### Snippet
```java
    }
    Class<?> clazz = option.getClazz();
    Optional<T> value = rawValue.map(v -> option.convertValue(v, clazz));
    return value;
  }
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
Local variable `hadoopStorage` is redundant
in `server/src/main/java/org/apache/uniffle/server/storage/HadoopStorageManager.java`
#### Snippet
```java
        }
      }
      HadoopStorage hadoopStorage = new HadoopStorage(remoteStorage, remoteStorageHadoopConf);
      return hadoopStorage;
    });
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
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleWriteHandler.java`
#### Snippet
```java
  public HadoopFileWriter createWriter(String fileName) throws IOException, IllegalStateException {
    Path path = new Path(basePath, fileName);
    HadoopFileWriter writer = new HadoopFileWriter(fileSystem, path, hadoopConf);
    return writer;
  }
```

## RuleId[id=FuseStreamOperations]
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

## RuleId[id=BusyWait]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ApplicationManager.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ApplicationManager.class);
  // TODO: Add anomaly detection for other storage
  private static final List<String> REMOTE_PATH_SCHEMA = Arrays.asList("hdfs");
  private final long expired;
  private final StrategyName storageStrategy;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java
  @VisibleForTesting
  void removeShuffleDataSync(String appId, int shuffleId) {
    removeResourcesByShuffleIds(appId, Arrays.asList(shuffleId));
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `server/src/main/java/org/apache/uniffle/server/ShuffleTaskManager.java`
#### Snippet
```java

  public void removeShuffleDataAsync(String appId, int shuffleId) {
    expiredAppIdQueue.add(new ShufflePurgeEvent(appId, getUserByAppId(appId), Arrays.asList(shuffleId)));
  }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `expectedTaskIdsBitmapFilterEnable` initializer `false` is redundant
in `client/src/main/java/org/apache/uniffle/client/request/CreateShuffleReadClientRequest.java`
#### Snippet
```java
  private IdHelper idHelper;
  private ShuffleDataDistributionType shuffleDataDistributionType = ShuffleDataDistributionType.NORMAL;
  private boolean expectedTaskIdsBitmapFilterEnable = false;
  private RssConf rssConf;

```

### UnusedAssignment
Variable `content` initializer `null` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/ClientConfManager.java`
#### Snippet
```java

  private String loadClientConfContent() {
    String content = null;
    try (FSDataInputStream in = fileSystem.open(path)) {
      content = IOUtils.toString(in, StandardCharsets.UTF_8);
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
Variable `content` initializer `null` is redundant
in `coordinator/src/main/java/org/apache/uniffle/coordinator/access/checker/AccessCandidatesChecker.java`
#### Snippet
```java

  private String loadFileContent() {
    String content = null;
    try (FSDataInputStream in = fileSystem.open(path)) {
      content = IOUtils.toString(in, StandardCharsets.UTF_8);
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
    GetShuffleResultResponse reply;
    byte[] serializedBlockIds = null;
    String requestInfo = "appId[" + appId + "], shuffleId[" + shuffleId + "], partitionId[" + partitionId + "]";
    ByteString serializedBlockIdsBytes = ByteString.EMPTY;
```

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
Variable `indexData` initializer `null` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopShuffleReadHandler.java`
#### Snippet
```java
    long start = System.currentTimeMillis();
    try {
      ByteBuffer indexData = null;
      if (offHeapEnabled) {
        indexData = indexReader.readAsByteBuffer();
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
Variable `indexFiles` initializer `null` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopClientReadHandler.java`
#### Snippet
```java
    }

    FileStatus[] indexFiles = null;
    try {
      // get all index files
```

### UnusedAssignment
Variable `offHeapEnable` initializer `false` is redundant
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopClientReadHandler.java`
#### Snippet
```java
  private ShuffleDataDistributionType distributionType;
  private Roaring64NavigableMap expectTaskIds;
  private boolean offHeapEnable = false;

  public HadoopClientReadHandler(
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `e instanceof Errors.NativeIoException` is always `false`
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      return !((MultiException) e).getThrowables().stream()
          .noneMatch((Throwable throwable) -> isServerPortBindCollision(throwable));
    } else if (e instanceof Errors.NativeIoException) {
      return (e.getMessage() != null && e.getMessage().startsWith("bind() failed: "))
              || isServerPortBindCollision(e.getCause());
```

### ConstantValue
Value `e` is always 'null'
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      return !((MultiException) e).getThrowables().stream()
          .noneMatch((Throwable throwable) -> isServerPortBindCollision(throwable));
    } else if (e instanceof Errors.NativeIoException) {
      return (e.getMessage() != null && e.getMessage().startsWith("bind() failed: "))
              || isServerPortBindCollision(e.getCause());
```

### ConstantValue
Condition `e instanceof IOException` is always `false`
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      return (e.getMessage() != null && e.getMessage().startsWith("bind() failed: "))
              || isServerPortBindCollision(e.getCause());
    } else if (e instanceof IOException) {
      return (e.getMessage() != null && e.getMessage().startsWith("Failed to bind to address"))
          || isServerPortBindCollision(e.getCause());
```

### ConstantValue
Value `e` is always 'null'
in `common/src/main/java/org/apache/uniffle/common/util/RssUtils.java`
#### Snippet
```java
      return (e.getMessage() != null && e.getMessage().startsWith("bind() failed: "))
              || isServerPortBindCollision(e.getCause());
    } else if (e instanceof IOException) {
      return (e.getMessage() != null && e.getMessage().startsWith("Failed to bind to address"))
          || isServerPortBindCollision(e.getCause());
```

### ConstantValue
Value `fileSystem` is always 'null'
in `common/src/main/java/org/apache/uniffle/common/filesystem/HadoopFilesystemProvider.java`
#### Snippet
```java
    }

    return fileSystem;
  }
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
Value `isPreAllocated` is always 'true'
in `server/src/main/java/org/apache/uniffle/server/netty/ShuffleServerNettyHandler.java`
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
          buffer.getBlocks().forEach(spb -> spb.getData().release());
```

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
Condition `e instanceof FileNotFoundException` is always `false`
in `storage/src/main/java/org/apache/uniffle/storage/handler/impl/HadoopClientReadHandler.java`
#### Snippet
```java
              && (shuffleServerId == null || file.getName().startsWith(shuffleServerId)));
    } catch (Exception e) {
      if (e instanceof FileNotFoundException) {
        LOG.info("Directory[" + baseFolder
            + "] not found. The data may not be flushed to this directory. Nothing will be read.");
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

  @VisibleForTesting
  public Map<String, Map<Integer, RangeMap<Integer, ShuffleBuffer>>> getBufferPool() {
    return bufferPool;
  }
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
  public StatusCode registerBuffer(String appId, int shuffleId, int startPartition, int endPartition) {
    bufferPool.computeIfAbsent(appId, key -> JavaUtils.newConcurrentMap());
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.computeIfAbsent(shuffleId, key -> TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    bufferPool.computeIfAbsent(appId, key -> JavaUtils.newConcurrentMap());
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.computeIfAbsent(shuffleId, key -> TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    bufferPool.computeIfAbsent(appId, key -> JavaUtils.newConcurrentMap());
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.computeIfAbsent(shuffleId, key -> TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    shuffleIdToBuffers.computeIfAbsent(shuffleId, key -> TreeRangeMap.create());
    RangeMap<Integer, ShuffleBuffer> bufferRangeMap = shuffleIdToBuffers.get(shuffleId);
    if (bufferRangeMap.get(startPartition) == null) {
      ShuffleServerMetrics.counterTotalPartitionNum.inc();
```

### UnstableApiUsage
'get(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `server/src/main/java/org/apache/uniffle/server/buffer/ShuffleBufferManager.java`
#### Snippet
```java
    shuffleIdToBuffers.computeIfAbsent(shuffleId, key -> TreeRangeMap.create());
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

  public void removeBuffer(String appId) {
    Map<Integer, RangeMap<Integer, ShuffleBuffer>> shuffleIdToBuffers = bufferPool.get(appId);
    if (shuffleIdToBuffers == null) {
      return;
```

## RuleId[id=WriteOnlyObject]
### WriteOnlyObject
Write-only object
in `common/src/main/java/org/apache/uniffle/common/netty/client/TransportClientFactory.java`
#### Snippet
```java

    final AtomicReference<TransportClient> clientRef = new AtomicReference<>();
    final AtomicReference<Channel> channelRef = new AtomicReference<>();

    bootstrap.handler(
```

### WriteOnlyObject
Write-only object
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorageMeta.java`
#### Snippet
```java
    private final AtomicLong size = new AtomicLong(0);
    private final RoaringBitmap partitionBitmap = RoaringBitmap.bitmapOf();
    private final AtomicBoolean isStartRead = new AtomicBoolean(false);
    private final AtomicLong lastReadTs = new AtomicLong(-1L);

```

### WriteOnlyObject
Write-only object
in `storage/src/main/java/org/apache/uniffle/storage/common/LocalStorageMeta.java`
#### Snippet
```java
    private final RoaringBitmap partitionBitmap = RoaringBitmap.bitmapOf();
    private final AtomicBoolean isStartRead = new AtomicBoolean(false);
    private final AtomicLong lastReadTs = new AtomicLong(-1L);

    public AtomicLong getSize() {
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

