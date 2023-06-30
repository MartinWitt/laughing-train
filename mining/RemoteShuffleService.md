# RemoteShuffleService 
 
# Bad smells
I found 439 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 153 | false |
| JavadocDeclaration | 70 | false |
| UNUSED_IMPORT | 46 | false |
| FieldCanBeLocal | 18 | false |
| UnnecessaryLocalVariable | 18 | true |
| UnusedAssignment | 12 | false |
| DataFlowIssue | 11 | false |
| FinalStaticMethod | 9 | false |
| SimplifyStreamApiCallChains | 8 | false |
| AutoCloseableResource | 8 | false |
| RedundantStringFormatCall | 8 | false |
| DuplicatedCode | 7 | false |
| IgnoreResultOfCall | 7 | false |
| BusyWait | 6 | false |
| DuplicateExpressions | 5 | false |
| ConstantValue | 5 | false |
| WrapperTypeMayBePrimitive | 4 | false |
| SynchronizeOnNonFinalField | 4 | false |
| IntegerMultiplicationImplicitCastToLong | 4 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| UnstableApiUsage | 4 | false |
| NullableProblems | 3 | false |
| UnnecessaryContinue | 3 | false |
| FinalPrivateMethod | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| IfStatementWithIdenticalBranches | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| PlaceholderCountMatchesArgumentCount | 1 | false |
| IOStreamConstructor | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SillyAssignment | 1 | false |
| RedundantTypeArguments | 1 | false |
| ExplicitArrayFilling | 1 | false |
| RedundantMethodOverride | 1 | false |
| MalformedFormatString | 1 | false |
| ImplicitArrayToString | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| FuseStreamOperations | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                // We wanted to keep 500 ms offset to compare
                long offfset = 500;
                Long latency1 = o1.getRequestLatency();
                Long latency2 = o2.getRequestLatency();

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                long offfset = 500;
                Long latency1 = o1.getRequestLatency();
                Long latency2 = o2.getRequestLatency();

                long diff = latency1 - latency2;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                    }
                }
                Long connections1 = o1.getConcurrentConnections();
                Long connections2 = o2.getConcurrentConnections();
                return Long.compare(connections1,connections2);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                }
                Long connections1 = o1.getConcurrentConnections();
                Long connections2 = o2.getConcurrentConnections();
                return Long.compare(connections1,connections2);
            })
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `filePaths` are written to, but never read
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java

    private int numFiles = 1;
    private String[] filePaths;
    private FileOutputStream[] fileStreams;

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        int countIntValue = (int)count;
        while (countIntValue > 0) {
            int batchSize = Math.min(countIntValue, list.peek().length - currentReadCursor);
            byteBuffer.put(list.peek(), currentReadCursor, batchSize);
            countIntValue -= batchSize;
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        byte value;

        if (currentReadCursor <= list.peek().length - 1) {
            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
```

### DataFlowIssue
Array access `list.peek()[currentReadCursor++]` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        if (currentReadCursor <= list.peek().length - 1) {
            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
        } else {
            list.pop();
```

### DataFlowIssue
Array access `list.peek()[currentReadCursor++]` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java

            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
        }

```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java

    private void checkAndAdjustReadCursor() {
        if (currentReadCursor == list.peek().length) {
            list.pop();
            currentReadCursor = 0;
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
            list.pop();
            currentReadCursor = 0;
        } else if (currentReadCursor > list.peek().length) {
            throw new RssInvalidStateException(String.format("Read cursor %s should not exceed max length %s", currentReadCursor, list.peek().length));
        }
```

### DataFlowIssue
Dereference of `list.peek()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
            currentReadCursor = 0;
        } else if (currentReadCursor > list.peek().length) {
            throw new RssInvalidStateException(String.format("Read cursor %s should not exceed max length %s", currentReadCursor, list.peek().length));
        }
    }
```

### DataFlowIssue
Dereference of `childFiles` may produce `NullPointerException`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
    private static void deleteDirRecursively(File rootDir) {
        File[] childFiles = rootDir.listFiles();
        if (childFiles.length == 0) {
            try {
                logger.info("Deleting dir: " + rootDir);
```

### DataFlowIssue
Dereference of `rootDirFile.listFiles()` may produce `NullPointerException`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java

        // delete empty directories
        for (File childFile: rootDirFile.listFiles()) {
            if (childFile.isDirectory()) {
                deleteDirRecursively(childFile);
```

### DataFlowIssue
Argument `bytes` might be null
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
        long taskAttemptId = ByteBufUtils.readLong(bytes, 0);
        bytes = StreamUtils.readBytes(inputStream, Integer.BYTES);
        int dataBlockLength = ByteBufUtils.readInt(bytes, 0);
        byte[] dataBlockBytes = StreamUtils.readBytes(inputStream, dataBlockLength);
        dataBlockStreamData.writeBytes(dataBlockBytes);
```

### DataFlowIssue
Argument `bytes` might be null
in `src/main/java/com/uber/rss/tools/TestUtils.java`
#### Snippet
```java

        bytes = StreamUtils.readBytes(stream, len);
        return new String(bytes, StandardCharsets.UTF_8);
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
                        logger.info(String.format(
                            "Trying to look up RSS servers (data center: %s, cluster: %s) for %s",
                            dataCenter, cluster, serverIds.stream().collect(Collectors.joining(","))));
                        return serviceRegistry.lookupServers(dataCenter, cluster, serverIds);
                    } catch (Throwable ex) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            // Close writers in case there are still writers not closed
            removedAppShuffleStageStates.stream().forEach(t -> t.closeWriters());

            try {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java

    synchronized (this) {
      pools.values().stream().forEach(pool -> pool.idleClients.forEach(clientAndState -> {
        try {
          clientAndState.closeClient();
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
          taskAttemptIdInfo = String.format("no task attempt committed");
        } else {
          List<Long> taskAttemptIds = mapTaskCommitStatus.getTaskAttemptIds().values().stream().collect(Collectors.toList());
          Collections.sort(taskAttemptIds);
          taskAttemptIdInfo = String.format("committed task ids: %s, fetching tasks: %s",
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
                String str = args[i++];
                String[] strArray = str.split(":");
                List<ServerDetail> serverDetails = Arrays.asList(strArray).stream().map(t->{
                    ServerHostAndPort hostAndPort = ServerHostAndPort.fromString(t);
                    return TestUtils.getServerDetail(hostAndPort.getHost(), hostAndPort.getPort());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

    private void deleteDirectories(List<String> directories) {
        directories.stream().forEach(t -> {
            logger.info("Deleting directory: " + t);
            if (!storage.exists(t)) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

                Map<Integer, Long> expectedTotalRecordsForEachPartition = new HashMap<>();
                numPartitionRecords.entrySet().stream().forEach(t -> expectedTotalRecordsForEachPartition.put(t.getKey(), t.getValue().get()));

                StreamReadClientVerify streamReadClientVerify = new StreamReadClientVerify();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/uber/rss/metadata/ZooKeeperFaultTolerantServiceRegistry.java`
#### Snippet
```java
    @Override
    public void registerServer(String dataCenter, String cluster, String serverId, String runningVersion, String hostAndPort) {
        zooKeeperServiceRegistries.stream().forEach(t->t.registerServer(dataCenter, cluster, serverId, runningVersion, hostAndPort));
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
        }
        String result = address.getCanonicalHostName();
        if (result.toLowerCase().equals("localhost")) {
            result = address.getHostName();
        }
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (3) than placeholders specified (2)
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
                } catch (RssTooMuchDataException e) {
                    logger.info(
                        "Cannot handle new connection due to writing too much data from app (%s). " +
                                "Closing current connection: {}. {}", appId, connectionInfo,
                                ExceptionUtils.getSimpleMessage(e));
                    M3Stats.addException(e, M3Stats.TAG_VALUE_SERVER_HANDLER);
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    }
    
    private final void checkHeaderResponseStatus(int responseStatus) {
        if (responseStatus == MessageConstants.RESPONSE_STATUS_SERVER_BUSY) {
            throw new RssServerBusyException(String.format("Server busy: %s", connectionInfo));
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    }

    private final void checkOKResponseStatus(int responseStatus) {
        switch (responseStatus) {
            case MessageConstants.RESPONSE_STATUS_OK:
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
      this.commitMapTaskCommitStatus = connectDownloadResponse.getMapTaskCommitStatus();
      if (this.commitMapTaskCommitStatus == null) {
        throw new RssInvalidDataException("MapTaskCommitStatus should not be null");
      }
      this.commitTaskAttemptIds = new HashSet<>(this.commitMapTaskCommitStatus.getTaskAttemptIds().values());
      if (!this.commitTaskAttemptIds.containsAll(fetchTaskAttemptIds)) {
        throw new RssInvalidDataException(String.format(
            "Task attempt ids not matched, committed: %s, fetching: %s",
            this.commitTaskAttemptIds,
            fetchTaskAttemptIds));
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
        servers.parallelStream().forEach(t -> connectSingleClient(t));

        // use synchronize to make sure reads on clients array element getting latest value from other threads
        // see http://www.cs.umd.edu/~pugh/java/memoryModel/jsr-133-faq.html
        synchronized (clients) {
            // sanity check that clients are initialized correctly
            for (int i = 0; i < clients.length; i++) {
                if (clients[i] == null) {
                    throw new RssInvalidStateException(String.format("Client %s is null", i));
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
        try {
            ConnectDownloadResponse connectDownloadResponse = dataBlockSocketReadClient.connect();
            DownloadServerVerboseInfo downloadServerVerboseInfo = new DownloadServerVerboseInfo();
            downloadServerVerboseInfo.setId(connectDownloadResponse.getServerId());
            downloadServerVerboseInfo.setRunningVersion(connectDownloadResponse.getRunningVersion());
            downloadServerVerboseInfo.setMapTaskCommitStatus(connectDownloadResponse.getMapTaskCommitStatus());
            return downloadServerVerboseInfo;
        } catch (RuntimeException ex) {
            logger.warn(String.format("Failed to connect %s", this), ex);
            close();
            throw ex;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
        try {
            DataBlock dataBlock = dataBlockSocketReadClient.readDataBlock();
            if (dataBlock == null) {
                return null;
            }
            shuffleReadBytes += DataBlockHeader.NUM_BYTES + dataBlock.getPayload().length;
            return new TaskDataBlock(dataBlock.getPayload(), dataBlock.getHeader().getTaskAttemptId());
        } catch (RuntimeException ex) {
            logger.warn(String.format("Failed to read shuffle data %s", this), ex);
            close();
            throw ex;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/messages/ConnectDownloadRequest.java`
#### Snippet
```java
        ByteBufUtils.writeLengthAndString(buf, user);
        ByteBufUtils.writeLengthAndString(buf, appId);
        ByteBufUtils.writeLengthAndString(buf, appAttempt);
        buf.writeInt(shuffleId);
        buf.writeInt(partitionId);
        buf.writeInt(taskAttemptIds.size());
        for (Long entry: taskAttemptIds) {
            buf.writeLong(entry);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/messages/ConnectDownloadRequest.java`
#### Snippet
```java
        String user = ByteBufUtils.readLengthAndString(buf);
        String appId = ByteBufUtils.readLengthAndString(buf);
        String appAttempt = ByteBufUtils.readLengthAndString(buf);
        int shuffleId = buf.readInt();
        int partitionId = buf.readInt();
        int numTaskAttemptIds = buf.readInt();
        List<Long> taskAttemptIds = new ArrayList<>(numTaskAttemptIds);
        for (int i = 0; i < numTaskAttemptIds; i++) {
            long taskAttemptId = buf.readLong();
            taskAttemptIds.add(taskAttemptId);
        }
        return new ConnectDownloadRequest(user, appId, appAttempt, shuffleId, partitionId, taskAttemptIds);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/rss/metadata/InMemoryServiceRegistry.java`
#### Snippet
```java
        if (StringUtils.isBlank(dataCenter)) {
            throw new IllegalArgumentException(String.format("Invalid input: dataCenter=%s", dataCenter));
        }

        if (StringUtils.isBlank(cluster)) {
            throw new IllegalArgumentException(String.format("Invalid input: cluster=%s", cluster));
        }

        if (StringUtils.isBlank(serverId)) {
            throw new IllegalArgumentException(String.format("Invalid input: serverId=%s", serverId));
        }

        if (StringUtils.isBlank(runningVersion)) {
            throw new IllegalArgumentException(String.format("Invalid input: runningVersion=%s", runningVersion));
        }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, STATE_DIR_NAME)`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java

  public LocalFileStateStore(String rootDir, long fileRotationMillis, long fileRetentionMillis) {
    this.stateDir = Paths.get(rootDir, STATE_DIR_NAME).toString();
    this.fileRotationMillis = fileRotationMillis;
    this.fileRetentionMillis = fileRetentionMillis;
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, STATE_DIR_NAME)`
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
    this.fileRotationMillis = fileRotationMillis;
    this.fileRetentionMillis = fileRetentionMillis;
    Paths.get(rootDir, STATE_DIR_NAME).toFile().mkdirs();
    createNewFileIfNecessary();
  }
```

### DuplicateExpressions
Multiple occurrences of `strLower.substring(0, strLower.length() - 1).trim()`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
                scale = KB_SIZE;
            } if (strLower.endsWith("k")) {
                strLower = strLower.substring(0, strLower.length() - 1).trim();
                scale = KB_SIZE;
            } else if (strLower.endsWith("mb")) {
```

### DuplicateExpressions
Multiple occurrences of `strLower.substring(0, strLower.length() - 1).trim()`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
                scale = MB_SIZE;
            } else if (strLower.endsWith("m")) {
                strLower = strLower.substring(0, strLower.length() - 1).trim();
                scale = MB_SIZE;
            } else if (strLower.endsWith("gb")) {
```

### DuplicateExpressions
Multiple occurrences of `strLower.substring(0, strLower.length() - 1).trim()`
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
                scale = GB_SIZE;
            } else if (strLower.endsWith("g")) {
                strLower = strLower.substring(0, strLower.length() - 1).trim();
                scale = GB_SIZE;
            } else if (strLower.endsWith("bytes")) {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
    public InputStream createReaderStream(String path) {
        try {
            return new FileInputStream(path);
        } catch (Throwable e) {
            throw new RssException("Failed to open file: " + path, e);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    List<ClientPool> poolsToCheck = new ArrayList<>();
    synchronized (this) {
      poolsToCheck.addAll(pools.values());
    }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
    byte[] bytes = StreamUtils.readBytes(inputStream, header.getLength());
    if (bytes == null) {
      throw new RssEndOfStreamException("Failed to read data block: " + this.toString());
    }

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final long readLong(byte[] bytes, int index) {
        return ((long) bytes[index] & 0xff) << 56 |
            ((long) bytes[index + 1] & 0xff) << 48 |
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void writeLong(byte[] bytes, int index, long value) {
        bytes[index] = (byte) (value >>> 56);
        bytes[index + 1] = (byte) (value >>> 48);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java

public class ByteBufUtils {
    public static final byte[] convertIntToBytes(int value) {
        byte[] bytes = new byte[Integer.BYTES];
        writeInt(bytes, 0, value);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final byte[] readBytes(ByteBuf buf) {
        // TODO a better implementation?
        byte[] bytes = new byte[buf.readableBytes()];
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void writeLengthAndString(ByteBuf buf, String str) {
        if (str == null) {
            buf.writeInt(-1);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final int readInt(byte[] bytes, int index) {
        return (bytes[index] & 0xff) << 24 |
            (bytes[index + 1] & 0xff) << 16 |
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void readBytesToStream(ByteBuf buf, OutputStream stream) throws IOException {
        final int maxNumBytes = 64000;
        byte[] bytes = new byte[maxNumBytes];
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }
    
    public static final String readLengthAndString(ByteBuf buf) {
        int length = buf.readInt();
        if (length == -1) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
    }

    public static final void writeInt(byte[] bytes, int index, int value) {
        bytes[index] = (byte) (value >>> 24);
        bytes[index + 1] = (byte) (value >>> 16);
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'zooKeeperServersBackup' is assigned to itself
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java

  public void setZooKeeperServersBackup(String value) {
    this.zooKeeperServersBackup = zooKeeperServersBackup;
  }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ClientAndState` may be 'static'
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  }

  private class ClientAndState {
    final PooledShuffleDataSyncWriteClient client;
    long lastActiveTime = 0;
```

### InnerClassMayBeStatic
Inner class `DataCenterAndCluster` may be 'static'
in `src/main/java/com/uber/rss/common/ServerDetailCollection.java`
#### Snippet
```java
    }

    private class DataCenterAndCluster {
        private String dataCenter;
        private String cluster;
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/uber/rss/util/ExceptionUtils.java`
#### Snippet
```java
  // see https://stackoverflow.com/questions/4519557/is-there-a-way-to-throw-an-exception-without-adding-the-throws-declaration/4519576
  public static void throwException(Throwable exception) {
    ExceptionUtils.<RuntimeException>throwException1(exception);
  }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/uber/rss/common/FixedLengthInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b) throws IOException {
    return read(b, 0, b.length);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/uber/rss/common/FixedLengthInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    if (len == 0) {
      return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/uber/rss/util/CountedOutputStream.java`
#### Snippet
```java

    @Override
    public synchronized void write(byte[] b, int off, int len) throws IOException {
        underlyingStream.write(b, off, len);
        writtenBytes += len;
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
    runAllActiveClients(t->t.close());

    for (int i = 0; i < clients.length; i++) {
      clients[i] = null;
    }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/metrics/ScheduledMetricCollector.java`
#### Snippet
```java
    private final MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
    
    private final int metricCollectingIntervalSeconds = 60;
    
    public ScheduledMetricCollector(ServiceRegistry serviceRegistry) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private String appAttempt = null;

    private StartUploadMessage startUploadMessage = null;

    private ChannelIdleCheck idleCheck;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
public class PartitionFileChecker {
  private String filePath;
  private String fileCompressCodec = Compression.COMPRESSION_CODEC_LZ4;
  private String blockCompressCodec = Compression.COMPRESSION_CODEC_LZ4;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
  private String filePath;
  private String fileCompressCodec = Compression.COMPRESSION_CODEC_LZ4;
  private String blockCompressCodec = Compression.COMPRESSION_CODEC_LZ4;

  public void run() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java

    private long lastLogTime = System.currentTimeMillis();
    private final long logInterval = 30000;

    private final AtomicLong queueInsertTime = new AtomicLong();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java

  private boolean downloadStarted = false;
  private long dataLength = -1;

  private int totalReadDataBlocks = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
    private Map<Integer, Long> expectedTotalRecordsForEachPartition;

    private int maxValueLen = 10000;

    private Runnable actionToSimulateBadServer = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java
    private final String appId;
    private final String appAttempt;
    private final long maxTryingMillis;
    private final ShuffleWriteConfig shuffleWriteConfig;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private List<Thread> allMapThreads = new ArrayList<>();
    
    private AppShuffleId appShuffleId;
    
    private AtomicLong mapThreadErrors = new AtomicLong();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/ServerBusyRetriableWriteClient.java`
#### Snippet
```java
    private final String user;
    private final String appId;
    private final String appAttempt;
    private SingleServerWriteClient delegate;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/ServerBusyRetriableWriteClient.java`
#### Snippet
```java
    private final long maxTryingMillis;
    private final String user;
    private final String appId;
    private final String appAttempt;
    private SingleServerWriteClient delegate;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
    private FileOutputStream[] fileStreams;

    private int numTestValues = 1000;
    private int maxTestValueSize = 10000;
    private byte[][] testValues;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java

    private int numFiles = 1;
    private String[] filePaths;
    private FileOutputStream[] fileStreams;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private Configuration hadoopConfig = null;

  private long stateCommitIntervalMillis = 60000;

  public static StreamServerConfig buildFromArgs(String[] args) throws IOException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java

    // Max length for test string values to uses
    private int maxStringValueLen = 10000;

    private List<HashMap<String, String>> testObjects = new ArrayList<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java

    // Total number of test objects to serialize
    private int numTestObjects = 10000;

    // Max length for test string values to uses
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
  private static class ExceptionLogInfo {
    private String logMsg;
    private Throwable exception;

    public ExceptionLogInfo(String logMsg, Throwable exception) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java

  private static class ExceptionLogInfo {
    private String logMsg;
    private Throwable exception;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
    public void deleteFile(String path) {
        try {
            new File(path).delete();
        } catch (Throwable e) {
            throw new RssException("Failed to delete file: " + path, e);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/com/uber/rss/execution/LocalFileStateStore.java`
#### Snippet
```java
    this.fileRotationMillis = fileRotationMillis;
    this.fileRetentionMillis = fileRetentionMillis;
    Paths.get(rootDir, STATE_DIR_NAME).toFile().mkdirs();
    createNewFileIfNecessary();
  }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
            try {
                logger.info("Deleting dir: " + rootDir);
                rootDir.delete();
            } catch (Throwable ex) {
                logger.info("Failed to delete dir: " + rootDir, ex);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
            try {
                logger.info("Deleting file: " + fileToDelete);
                fileToDelete.delete();
            } catch (Throwable ex) {
                logger.info("Failed to delete file: " + fileToDelete, ex);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
          lowPriorityExecutorService.shutdown();
          try {
            lowPriorityExecutorService.awaitTermination(3, TimeUnit.MINUTES);
          } catch (InterruptedException e) {
            e.printStackTrace();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
      for (int i = 0; i < dirCount; i++) {
        Path dirPath = Paths.get(rootDir, "dir" + i);
        dirPath.toFile().mkdirs();
        dirPath.toFile().deleteOnExit();
        System.out.println(String.format("Creating files under %s, current file descriptors: %s", dirPath.toAbsolutePath(), SystemUtils.getFileDescriptorCount()));
```

### IgnoreResultOfCall
Result of `ByteArrayInputStream.read()` is ignored
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
                }

                byteArrayInputStream.read(bytesBuffer, 0, objectSize);

                HashMap<String, String> object = serializer.deserialize(ByteBuffer.wrap(bytesBuffer), classTag);
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `servers`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                long hitPointToShutdownServers = numBytes/2;
                if (totalShuffleWrittenBytesOldValue < hitPointToShutdownServers && totalShuffleWrittenBytes.get() >= hitPointToShutdownServers) {
                    synchronized (servers) {
                        synchronized (serverIdsToShutdownDuringShuffleWrite) {
                            for (String serverId : serverIdsToShutdownDuringShuffleWrite) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `servers`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

                streamReadClientVerify.setActionToSimulateBadServer(() -> {
                    synchronized (servers) {
                        synchronized (serverIdsToShutdownDuringShuffleRead) {
                            for (String serverId : serverIdsToShutdownDuringShuffleRead) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `servers`
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                PooledWriteClientFactory.getInstance().shutdown();

                synchronized (servers) {
                    servers.forEach(t -> {
                        if (t != null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `defaultScopeClosedLock`
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
    
    public static void closeDefaultScope() {
        synchronized (defaultScopeClosedLock) {
            if (defaultScopeClosed) {
                logger.info("M3 scope already closed, do not close again");
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `close()` is identical to its super method
in `src/main/java/com/uber/rss/metrics/ExceptionMetrics.java`
#### Snippet
```java

    @Override
    public void close() {
        M3Stats.decreaseNumM3Scopes();
    }
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
                throw new RssFileCorruptedException(String.format("Shuffle file corrupted or application writing too much data: %s", connectionInfo));
            case MessageConstants.RESPONSE_STATUS_STALE_TASK_ATTEMPT:
                throw new RssStaleTaskAttemptException(String.format("Task attempt is stale (there is a new task retry, thus the old task is not valid any more)", responseStatus, connectionInfo));
            default:
                throw new RssNetworkException(String.format("Response not ok: %s, %s", responseStatus, connectionInfo));
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `record.getPayload()`
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
                        throw new RuntimeException(String.format(
                                "Read wrong value len %s after reading %s records for %s from server %s",
                                record.getPayload(), numReadPartitionRecords, appShufflePartitionId, serverReplicationGroups));
                    }

```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
timeoutMillis \* serverReplicationGroup.getServers().size(): integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
    long startTime = currentTime;

    long maxRetryTimeoutMillis = timeoutMillis * serverReplicationGroup.getServers().size();
    long sleepMillis = dataAvailablePollInterval;

```

### IntegerMultiplicationImplicitCastToLong
pollInterval \* 10: integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/clients/LazyWriteClient.java`
#### Snippet
```java
     */
    private void lazyConnect() {
        RetryUtils.retry(pollInterval, pollInterval * 10, maxWaitMillis, "create write client", () -> {
            writeClient.connect();
            return 0;
```

### IntegerMultiplicationImplicitCastToLong
networkTimeoutMillis \* 4: integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
                try {
                    // TODO optimize the max wait time for poll
                    long pollMaxWait = networkTimeoutMillis * 4;
                    while (exceptions.isEmpty()) {
                        long startTime = System.nanoTime();
```

### IntegerMultiplicationImplicitCastToLong
runMinutes \* 60 \* 1000: integer multiplication implicitly cast to long
in `src/main/java/com/uber/rss/tools/StreamServerStressToolLongRun.java`
#### Snippet
```java
        String[] compressCodecValues = new String[] {"", Compression.COMPRESSION_CODEC_LZ4};

        while (System.currentTimeMillis() - startTime < runMinutes * 60 * 1000) {
            int writeClientQueueSize = 0;
            int writeClientThreads = 0;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
    public List<String> listAllFiles(String dir) {
        try {
            return Files.walk(Paths.get(dir))
                    .filter(Files::isRegularFile)
                    .map(t->t.toString()).collect(Collectors.toList());
```

### AutoCloseableResource
'RetriableSocketReadClient' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
    for (int i = 0; i < servers.size(); i++) {
      ServerDetail serverDetail = servers.get(i);
      RetriableSocketReadClient client = new RetriableSocketReadClient(serverDetail,
          timeoutMillis,
          clientRetryOptions,
```

### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
          Map<String, String> tags = new HashMap<>();
          tags.put("remote", unreachableHost);
          Scope scope = M3Stats.createSubScope(tags);
          scope.counter("unreachableHosts").inc(1);
        }
```

### AutoCloseableResource
'ReplicatedWriteClient' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java

    private void connectSingleClient(ServerConnectionInfo server) {
        ReplicatedWriteClient client = new ReplicatedWriteClient(
            server.server, networkTimeoutMillis, serverConnectionRefresher, finishUploadAck, usePooledConnection, user, appId, appAttempt, shuffleWriteConfig);
        client.connect();
```

### AutoCloseableResource
'ReplicatedWriteClient' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java
    private void connectSingleClient(ServerConnectionInfo server) {
        final long startTime = System.currentTimeMillis();
        ReplicatedWriteClient client = new ReplicatedWriteClient(
            server.server, networkTimeoutMillis, serverConnectionRefresher, finishUploadAck, usePooledConnection, user, appId, appAttempt, shuffleWriteConfig);
        client.connect();
```

### AutoCloseableResource
'FileOutputStream' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
                filePaths[i] = tempFile.getAbsolutePath();

                FileOutputStream stream = new FileOutputStream(tempFile);
                fileStreams[i] = stream;

```

### AutoCloseableResource
'ServerIdAwareSyncWriteClient' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
    for (int i = 0; i < servers.size(); i++) {
      ServerDetail serverDetail = servers.get(i);
      ServerIdAwareSyncWriteClient client = new ServerIdAwareSyncWriteClient(serverDetail, timeoutMillis, finishUploadAck, usePooledConnection, user, appId, appAttempt, shuffleWriteConfig, serverConnectionRefresher);
      clients[i] = client;
    }
```

### AutoCloseableResource
'ShuffleOutputStream' used without 'try'-with-resources statement
in `src/main/java/com/uber/rss/execution/ShufflePartitionWriter.java`
#### Snippet
```java
            String actualFile = filePathBase + "." + fileIndex;
            logger.info("Opening shuffle file: {}", actualFile);
            outputStreams[i] = storage.createWriterStream(actualFile, "");
        }
        closed = false;
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        byte value;

        if (currentReadCursor <= list.peek().length - 1) {
            totalReadBytes++;
            value = list.peek()[currentReadCursor++];
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
        List<ServerReplicationGroup> serverReplicationGroups = ServerReplicationGroupUtil.createReplicationGroups(serverDetails, numReplicas);
        boolean finishUploadAck = true; // TODO make this configurable
        if (writeClientQueueSize == 0) {
            // Use sync write client (MultiServerSyncWriteClient)
            writeClient = new MultiServerSyncWriteClient(serverReplicationGroups, partitionFanout, networkTimeoutMillis, maxTryingMillis, null, finishUploadAck, useConnectionPool, "user1", appId, appAttempt, shuffleWriteConfig);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppShuffleId;`
in `src/main/java/com/uber/rss/StreamServer.java`
#### Snippet
```java
package com.uber.rss;

import com.uber.rss.common.AppShuffleId;
import com.uber.rss.common.ServerDetail;
import com.uber.rss.common.ServerDetailCollection;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.Compression;`
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java

import com.uber.rss.clients.ClientConstants;
import com.uber.rss.common.Compression;
import com.uber.rss.execution.ShuffleExecutor;
import com.uber.rss.handlers.UploadChannelManager;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssMissingShuffleWriteConfigException;`
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
import com.uber.rss.exceptions.RssFileCorruptedException;
import com.uber.rss.exceptions.RssInvalidDataException;
import com.uber.rss.exceptions.RssMissingShuffleWriteConfigException;
import com.uber.rss.exceptions.RssNetworkException;
import com.uber.rss.exceptions.RssShuffleStageNotStartedException;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Supplier;`
in `src/main/java/com/uber/rss/clients/LazyWriteClient.java`
#### Snippet
```java

import java.nio.ByteBuffer;
import java.util.function.Supplier;

/**
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.util.NetworkUtils;`
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java

import com.uber.rss.common.ServerDetail;
import com.uber.rss.util.NetworkUtils;
import com.uber.rss.util.ServerHostAndPort;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssException;`
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
import com.uber.rss.common.ServerReplicationGroup;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `src/main/java/com/uber/rss/common/MapTaskCommitStatus.java`
#### Snippet
```java
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

// TODO remove mapper count
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppMapId;`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java

import com.uber.rss.clients.ShuffleWriteConfig;
import com.uber.rss.common.AppMapId;
import com.uber.rss.common.FilePathAndLength;
import com.uber.rss.common.MapTaskCommitStatus;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppMapId;`
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java
package com.uber.rss.execution;

import com.uber.rss.common.AppMapId;

import java.util.Comparator;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java
import com.uber.rss.common.AppMapId;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppMapId;`
in `src/main/java/com/uber/rss/execution/TaskAttemptIdAndState.java`
#### Snippet
```java
package com.uber.rss.execution;

import com.uber.rss.common.AppMapId;
import com.uber.rss.exceptions.RssInvalidStateException;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppShufflePartitionId;`
in `src/main/java/com/uber/rss/handlers/DownloadServerHandler.java`
#### Snippet
```java
import com.uber.rss.clients.ShuffleWriteConfig;
import com.uber.rss.common.AppShuffleId;
import com.uber.rss.common.AppShufflePartitionId;
import com.uber.rss.common.FilePathAndLength;
import com.uber.rss.exceptions.RssInvalidStateException;
```

### UNUSED_IMPORT
Unused import `import com.uber.m3.tally.Stopwatch;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java

import com.uber.m3.tally.Gauge;
import com.uber.m3.tally.Stopwatch;
import com.uber.rss.metrics.M3Stats;
import com.uber.rss.tools.FileDescriptorStressTest;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.tools.FileDescriptorStressTest;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
import com.uber.m3.tally.Stopwatch;
import com.uber.rss.metrics.M3Stats;
import com.uber.rss.tools.FileDescriptorStressTest;
import com.uber.rss.util.ExceptionUtils;
import com.uber.rss.util.FileUtils;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.util.FileUtils;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
import com.uber.rss.tools.FileDescriptorStressTest;
import com.uber.rss.util.ExceptionUtils;
import com.uber.rss.util.FileUtils;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
```

### UNUSED_IMPORT
Unused import `import org.spark_project.guava.util.concurrent.RateLimiter;`
in `src/main/java/com/uber/rss/handlers/HttpChannelInboundHandler.java`
#### Snippet
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spark_project.guava.util.concurrent.RateLimiter;

import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.MemoryMonitor;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
package com.uber.rss.handlers;

import com.uber.rss.common.MemoryMonitor;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppTaskAttemptId;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java

import com.uber.rss.common.MemoryMonitor;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
import com.uber.rss.exceptions.RssInvalidStateException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import com.uber.rss.common.MemoryMonitor;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssMaxConnectionsException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssInvalidStateException;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.exceptions.RssDuplicateAppTaskAttemptException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssMaxConnectionsException;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ConcurrentHashMap;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ScheduledExecutorService;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

```

### UNUSED_IMPORT
Unused import `import com.uber.rss.common.AppTaskAttemptId;`
in `src/main/java/com/uber/rss/messages/StageCorruptionStateItem.java`
#### Snippet
```java

import com.uber.rss.common.AppShuffleId;
import com.uber.rss.common.AppTaskAttemptId;
import com.uber.rss.util.ByteBufUtils;
import io.netty.buffer.ByteBuf;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.messages.MessageConstants;`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import com.uber.rss.exceptions.RssServerDownException;
import com.uber.rss.messages.GetBusyStatusResponse;
import com.uber.rss.messages.MessageConstants;
import com.uber.rss.metrics.M3Stats;
import com.uber.rss.util.NetworkUtils;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/com/uber/rss/metadata/ServiceRegistryUtils.java`
#### Snippet
```java
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Proxy;`
in `src/main/java/com/uber/rss/metadata/ZooKeeperFaultTolerantServiceRegistry.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Proxy;`
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLDecoder;
import java.net.URLEncoder;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedInputStream;`
in `src/main/java/com/uber/rss/storage/ShuffleFileStorage.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
```

### UNUSED_IMPORT
Unused import `import io.airlift.compress.zstd.ZstdDecompressor;`
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
import com.uber.rss.util.ByteBufUtils;
import com.uber.rss.util.StreamUtils;
import io.airlift.compress.zstd.ZstdDecompressor;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
```

### UNUSED_IMPORT
Unused import `import java.nio.ByteBuffer;`
in `src/main/java/com/uber/rss/util/ByteBufUtils.java`
#### Snippet
```java
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.FileOutputStream;`
in `src/main/java/com/uber/rss/util/FileUtils.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
```

### UNUSED_IMPORT
Unused import `import java.net.ServerSocket;`
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java

import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssException;`
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
package com.uber.rss.util;

import com.uber.rss.exceptions.RssException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssNetworkException;
```

### UNUSED_IMPORT
Unused import `import com.uber.rss.exceptions.RssNetworkException;`
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
import com.uber.rss.exceptions.RssException;
import com.uber.rss.exceptions.RssInvalidStateException;
import com.uber.rss.exceptions.RssNetworkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param dir` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Delete directory and its children.
     * @param dir
     */
    void deleteDirectory(String dir);
```

### JavadocDeclaration
`@param path` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Check whether the file exists.
     * @param path
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * Check whether the file exists.
     * @param path
     * @return
     */
    boolean exists(String path);
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * Check whether this is local storage on Remote Shuffle Service, or
     * external storage like HDFS.
     * @return
     */
    boolean isLocalStorage();
```

### JavadocDeclaration
`@param path` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Create a stream for a given file path to write shuffle data.
     * @param path
     * @param compressionCodec
     * @return
```

### JavadocDeclaration
`@param compressionCodec` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * Create a stream for a given file path to write shuffle data.
     * @param path
     * @param compressionCodec
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * @param path
     * @param compressionCodec
     * @return
     */
    ShuffleOutputStream createWriterStream(String path, String compressionCodec);
```

### JavadocDeclaration
`@param dir` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Create directory and its parents.
     * @param dir
     */
    void createDirectories(String dir);
```

### JavadocDeclaration
`@param path` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Get the size of the file.
     * @param path
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * Get the size of the file.
     * @param path
     * @return
     */
    long size(String path);
```

### JavadocDeclaration
`@param path` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Delete file.
     * @param path
     */
    void deleteFile(String path);
```

### JavadocDeclaration
`@param path` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * Create a stream for a given file path to read shuffle data.
     * @param path
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * Create a stream for a given file path to read shuffle data.
     * @param path
     * @return
     */
    InputStream createReaderStream(String path);
```

### JavadocDeclaration
`@param dir` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
    /***
     * List all files under a directory.
     * @param dir
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleStorage.java`
#### Snippet
```java
     * List all files under a directory.
     * @param dir
     * @return
     */
    List<String> listAllFiles(String dir);
```

### JavadocDeclaration
`@param stream` tag description is missing
in `src/main/java/com/uber/rss/util/StreamUtils.java`
#### Snippet
```java
     * Read given number of bytes from the stream.
     * Return null means end of stream.
     * @param stream
     * @param numBytes
     * @return byte array, returning null means end of stream
```

### JavadocDeclaration
`@param numBytes` tag description is missing
in `src/main/java/com/uber/rss/util/StreamUtils.java`
#### Snippet
```java
     * Return null means end of stream.
     * @param stream
     * @param numBytes
     * @return byte array, returning null means end of stream
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
    /***
     * Retry the callable until it succeeds.
     * @return
     */
    public static <T> T retry(long minIntervalMillis, long maxIntervalMillis, long retryMaxMillis, String logInfo, Supplier<T> callable) {
```

### JavadocDeclaration
`@param intervalMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
    /***
     * Retry the callable until it returns not null.
     * @param intervalMillis
     * @param maxTryMillis
     * @param callable
```

### JavadocDeclaration
`@param maxTryMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * Retry the callable until it returns not null.
     * @param intervalMillis
     * @param maxTryMillis
     * @param callable
     * @return
```

### JavadocDeclaration
`@param callable` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param intervalMillis
     * @param maxTryMillis
     * @param callable
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param maxTryMillis
     * @param callable
     * @return
     */
    public static <T> T retryUntilNotNull(long intervalMillis, long maxTryMillis, Supplier<T> callable) {
```

### JavadocDeclaration
`@param minIntervalMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
    /***
     * Retry the callable until it returns not null.
     * @param minIntervalMillis
     * @param maxIntervalMillis
     * @param maxTryMillis
```

### JavadocDeclaration
`@param maxIntervalMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * Retry the callable until it returns not null.
     * @param minIntervalMillis
     * @param maxIntervalMillis
     * @param maxTryMillis
     * @param callable
```

### JavadocDeclaration
`@param maxTryMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param minIntervalMillis
     * @param maxIntervalMillis
     * @param maxTryMillis
     * @param callable
     * @return
```

### JavadocDeclaration
`@param callable` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param maxIntervalMillis
     * @param maxTryMillis
     * @param callable
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param maxTryMillis
     * @param callable
     * @return
     */
    public static <T> T retryUntilNotNull(long minIntervalMillis, long maxIntervalMillis, long maxTryMillis, Supplier<T> callable) {
```

### JavadocDeclaration
`@param intervalMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
    /***
     * Retry the callable until it returns true.
     * @param intervalMillis
     * @param maxTryMillis
     * @param callable
```

### JavadocDeclaration
`@param maxTryMillis` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * Retry the callable until it returns true.
     * @param intervalMillis
     * @param maxTryMillis
     * @param callable
     * @return
```

### JavadocDeclaration
`@param callable` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param intervalMillis
     * @param maxTryMillis
     * @param callable
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
     * @param maxTryMillis
     * @param callable
     * @return
     */
    public static boolean retryUntilTrue(long intervalMillis, long maxTryMillis, Supplier<Boolean> callable) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  /***
   * Get stage status, which contains map task commit status (last successful map task attempt id)
   * @return
   */
  public synchronized ShuffleStageStatus getShuffleStageStatus() {
```

### JavadocDeclaration
`@param taskId` tag description is missing
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  /***
   * Set last successful task attempt id for a given map id
   * @param taskId
   */
  public synchronized void commitMapTask(long taskId) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
  /***
   * Get total persisted bytes for all partitions.
   * @return
   */
  public synchronized long getPersistedBytes() {
```

### JavadocDeclaration
`@param list` tag description is missing
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
   * Make a string for a sorted integer list. e.g. for 1,2,3,5,6,7, this method will
   * return string like "1-3,5-7".
   * @param list
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/StringUtils.java`
#### Snippet
```java
   * return string like "1-3,5-7".
   * @param list
   * @return
   */
    public static <T extends Number> String toString4SortedIntList(List<T> list) {
```

### JavadocDeclaration
`@param appShuffleId` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    /***
     * Get config for the given shuffle stage.
     * @param appShuffleId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
     * Get config for the given shuffle stage.
     * @param appShuffleId
     * @return
     */
    public ShuffleWriteConfig getShuffleWriteConfig(AppShuffleId appShuffleId) {
```

### JavadocDeclaration
`@param appTaskAttemptId` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
     * It prints out internal state. So make sure not use it in production 
     * code.
     * @param appTaskAttemptId
     * @param maxWaitMillis
     */
```

### JavadocDeclaration
`@param maxWaitMillis` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
     * code.
     * @param appTaskAttemptId
     * @param maxWaitMillis
     */
    public void pollAndWaitMapAttemptCommitted(AppTaskAttemptId appTaskAttemptId,
```

### JavadocDeclaration
`@param appId` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
  /**
     * Update liveness indicator for the given application.
     * @param appId
     */
    public ExecutorAppState updateLiveness(String appId) {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    /***
     * Add an operation to indicate a map task finishing upload data.
     * @return true when things are good, false when hitting stale task attempt (old task attempt tries
     * to finish upload, but there is a new task attempt uploading data, which may happen when there is
     * task retry);
```

### JavadocDeclaration
`@param rootDir` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    /***
     * Create an instance.
     * @param rootDir
     */
    public ShuffleExecutor(String rootDir,
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    /**
     * Get background executor service.
     * @return
     */
    public ScheduledExecutorService getLowPriorityExecutorService() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    /**
     * Get root directory.
     * @return
     */
    public String getRootDir() {
```

### JavadocDeclaration
`@param appTaskAttemptId` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
     * It prints out internal state. So make sure not use it in production
     * code.
     * @param appTaskAttemptId
     * @param maxWaitMillis
     */
```

### JavadocDeclaration
`@param maxWaitMillis` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
     * code.
     * @param appTaskAttemptId
     * @param maxWaitMillis
     */
    public void pollAndWaitMapAttemptFinishedUpload(AppTaskAttemptId appTaskAttemptId,
```

### JavadocDeclaration
`@param writeOp` tag description is missing
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
     * Add an operation to write shuffle record data.
     * This method will make sure the ByteBuf inside writeOp gets released.
     * @param writeOp
     */
    public void writeData(ShuffleDataWrapper writeOp) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/common/MapTaskRssInfo.java`
#### Snippet
```java
  /***
   * This serialize method is faster than json serialization.
   * @return
   */
  public String serializeToString() {
```

### JavadocDeclaration
`@param client` tag description is missing
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  /***
   * Return the client to connection pool for later reuse.
   * @param client
   */
  public void returnClientToPool(PooledShuffleDataSyncWriteClient client) {
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleOutputStream.java`
#### Snippet
```java
    /***
     * Write data to the stream.
     * @param bytes
     */
    void write(byte[] bytes);
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/storage/ShuffleOutputStream.java`
#### Snippet
```java
    /***
     * Get file location for this stream.
     * @return
     */
    String getLocation();
```

### JavadocDeclaration
`@param servers` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
  /***
   * Create replication groups for a given partition
   * @param servers
   * @param numReplicas
   * @param partition
```

### JavadocDeclaration
`@param numReplicas` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * Create replication groups for a given partition
   * @param servers
   * @param numReplicas
   * @param partition
   * @param partitionFanout
```

### JavadocDeclaration
`@param partition` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * @param servers
   * @param numReplicas
   * @param partition
   * @param partitionFanout
   * @return
```

### JavadocDeclaration
`@param partitionFanout` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * @param numReplicas
   * @param partition
   * @param partitionFanout
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * @param partition
   * @param partitionFanout
   * @return
   */
  public static List<ServerReplicationGroup> createReplicationGroupsForPartition(Collection<ServerDetail> servers, int numReplicas, int partition, int partitionFanout) {
```

### JavadocDeclaration
`@param servers` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
  /**
   * Create a list of replication groups from given servers
   * @param servers
   * @param numReplicas
   * @return
```

### JavadocDeclaration
`@param numReplicas` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * Create a list of replication groups from given servers
   * @param servers
   * @param numReplicas
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/clients/ServerReplicationGroupUtil.java`
#### Snippet
```java
   * @param servers
   * @param numReplicas
   * @return
   */
  public static List<ServerReplicationGroup> createReplicationGroups(Collection<ServerDetail> servers, int numReplicas) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/clients/ShuffleDataWriter.java`
#### Snippet
```java
  /**
   * Get write bytes since last start upload.
   * @return
   */
  long getShuffleWriteBytes();
```

### JavadocDeclaration
`@param endMapId` tag description is missing
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
     * setNumMaps() will reset value for endMapId.
     * Thus please make sure to not call setNumMaps() after calling this method. 
     * @param endMapId
     */
    public void setEndMapId(int endMapId) {
```

### JavadocDeclaration
`@param numMaps` tag description is missing
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    /***
     * This method will reset endMapId value as well.
     * @param numMaps
     */
    public void setNumMaps(int numMaps) {
```

### JavadocDeclaration
`@param delta` tag description is missing
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
    /***
     * Add value, and return the rate if time has elapsed longer than checkpoint interval.
     * @param delta
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
     * Add value, and return the rate if time has elapsed longer than checkpoint interval.
     * @param delta
     * @return
     */
    public Double addValueAndGetRate(long delta) {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
    /***
     * Get overall change rate since this instance is created.
     * @return
     */
    public double getOverallRate() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
    /***
     * Get overall value.
     * @return
     */
    public long getOverallValue() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ShufflePartitionWriter.java`
#### Snippet
```java
    /***
     * Get all file locations.
     * @return
     */
    public List<String> getFileLocations() {
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/com/uber/rss/execution/ShufflePartitionWriter.java`
#### Snippet
```java
     * Writes data to storage. This method will release the ByteBuf object in the argument.
     * @param taskAttemptId task attempt id, used to route the data to proper split.
     * @param bytes
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/rss/execution/ShufflePartitionWriter.java`
#### Snippet
```java
     * @param taskAttemptId task attempt id, used to route the data to proper split.
     * @param bytes
     * @return
     */
    public synchronized int writeData(long taskAttemptId, ByteBuf bytes) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `byteBuffers` may be 'final'
in `src/main/java/com/uber/rss/util/AsyncSocketState.java`
#### Snippet
```java
public class AsyncSocketState {
    private AsynchronousSocketChannel socket;
    private ConcurrentLinkedQueue<ByteBuffer> byteBuffers = new ConcurrentLinkedQueue<>();

    public AsyncSocketState(AsynchronousSocketChannel socket) {
```

### FieldMayBeFinal
Field `socket` may be 'final'
in `src/main/java/com/uber/rss/util/AsyncSocketState.java`
#### Snippet
```java

public class AsyncSocketState {
    private AsynchronousSocketChannel socket;
    private ConcurrentLinkedQueue<ByteBuffer> byteBuffers = new ConcurrentLinkedQueue<>();

```

### FieldMayBeFinal
Field `index` may be 'final'
in `src/main/java/com/uber/rss/util/MovingAverageCalculator.java`
#### Snippet
```java
public class MovingAverageCalculator {
    private final AtomicLongArray values;
    private AtomicInteger index = new AtomicInteger(0);
    private volatile boolean fullyFilled = false;

```

### FieldMayBeFinal
Field `internalCountedOutputStream` may be 'final'
in `src/main/java/com/uber/rss/storage/ShuffleFileOutputStream.java`
#### Snippet
```java
    private OutputStream outputStream;
    private long initialFileSize = 0L;
    private CountedOutputStream internalCountedOutputStream;

    public ShuffleFileOutputStream(File file) {
```

### FieldMayBeFinal
Field `startTime` may be 'final'
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
  private final byte[] taskAttemptIdBytes = new byte[Long.BYTES];

  private long startTime = System.currentTimeMillis();
  private long numIncomingBytes = 0;

```

### FieldMayBeFinal
Field `metricGroupContainer` may be 'final'
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
  private static final int INVALID_TASK_ATTEMPT_ID = -1;

  private static NettyServerSideMetricGroupContainer<ServerHandlerMetrics> metricGroupContainer =
      new NettyServerSideMetricGroupContainer<>(ServerHandlerMetrics::new);

```

### FieldMayBeFinal
Field `logMsg` may be 'final'
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java

  private static class ExceptionLogInfo {
    private String logMsg;
    private Throwable exception;

```

### FieldMayBeFinal
Field `exception` may be 'final'
in `src/main/java/com/uber/rss/clients/ReplicatedReadClient.java`
#### Snippet
```java
  private static class ExceptionLogInfo {
    private String logMsg;
    private Throwable exception;

    public ExceptionLogInfo(String logMsg, Throwable exception) {
```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `src/main/java/com/uber/rss/clients/TaskByteArrayDataBlock.java`
#### Snippet
```java
    private final byte[] payload;

    private long taskAttemptId;

    public TaskByteArrayDataBlock(byte[] payload, long taskAttemptId) {
```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `src/main/java/com/uber/rss/clients/TaskDataBlock.java`
#### Snippet
```java
    private final byte[] payload;
    
    private long taskAttemptId;

    public TaskDataBlock(byte[] payload, long taskAttemptId) {
```

### FieldMayBeFinal
Field `servers` may be 'final'
in `src/main/java/com/uber/rss/clients/ServerConnectionStringCache.java`
#### Snippet
```java
  }

  private ConcurrentHashMap<String, ServerDetail> servers = new ConcurrentHashMap<>();

  public ServerConnectionStringCache() {
```

### FieldMayBeFinal
Field `exceptionCallback` may be 'final'
in `src/main/java/com/uber/rss/util/AsyncSocketCompletionHandler.java`
#### Snippet
```java

public class AsyncSocketCompletionHandler implements CompletionHandler<Integer, AsyncSocketState> {
    private Consumer<Throwable> exceptionCallback;
    
    public AsyncSocketCompletionHandler(Consumer<Throwable> exceptionCallback) {
```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `src/main/java/com/uber/rss/execution/TaskAttemptIdAndState.java`
#### Snippet
```java
  }

  private long taskAttemptId;
  private TaskAttemptState state = TaskAttemptState.NOT_STARTED;

```

### FieldMayBeFinal
Field `source` may be 'final'
in `src/main/java/com/uber/rss/metrics/ReadClientMetricsKey.java`
#### Snippet
```java

public class ReadClientMetricsKey {
    private String source;
    private String user;

```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/ReadClientMetricsKey.java`
#### Snippet
```java
public class ReadClientMetricsKey {
    private String source;
    private String user;

    public ReadClientMetricsKey(String source, String user) {
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/NettyServerSideMetricsKey.java`
#### Snippet
```java

public class NettyServerSideMetricsKey {
    private String user;

    public NettyServerSideMetricsKey(String user) {
```

### FieldMayBeFinal
Field `status` may be 'final'
in `src/main/java/com/uber/rss/handlers/ResponseStatusAndMessage.java`
#### Snippet
```java
 */
public class ResponseStatusAndMessage<T> {
    private byte status;
    private T message;

```

### FieldMayBeFinal
Field `message` may be 'final'
in `src/main/java/com/uber/rss/handlers/ResponseStatusAndMessage.java`
#### Snippet
```java
public class ResponseStatusAndMessage<T> {
    private byte status;
    private T message;

    public ResponseStatusAndMessage(byte status, T message) {
```

### FieldMayBeFinal
Field `dataCenter` may be 'final'
in `src/main/java/com/uber/rss/messages/RegisterServerRequestMessage.java`
#### Snippet
```java

public class RegisterServerRequestMessage extends ControlMessage {
    private String dataCenter;
    private String cluster;
    private String serverId;
```

### FieldMayBeFinal
Field `connectionString` may be 'final'
in `src/main/java/com/uber/rss/messages/RegisterServerRequestMessage.java`
#### Snippet
```java
    private String serverId;
    private String runningVersion;
    private String connectionString;

    public RegisterServerRequestMessage(String dataCenter, String cluster, String serverId, String runningVersion, String connectionString) {
```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/messages/RegisterServerRequestMessage.java`
#### Snippet
```java
    private String dataCenter;
    private String cluster;
    private String serverId;
    private String runningVersion;
    private String connectionString;
```

### FieldMayBeFinal
Field `cluster` may be 'final'
in `src/main/java/com/uber/rss/messages/RegisterServerRequestMessage.java`
#### Snippet
```java
public class RegisterServerRequestMessage extends ControlMessage {
    private String dataCenter;
    private String cluster;
    private String serverId;
    private String runningVersion;
```

### FieldMayBeFinal
Field `runningVersion` may be 'final'
in `src/main/java/com/uber/rss/messages/RegisterServerRequestMessage.java`
#### Snippet
```java
    private String cluster;
    private String serverId;
    private String runningVersion;
    private String connectionString;

```

### FieldMayBeFinal
Field `closedIdleUploadChannels` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private static Gauge finishUploadRequestLag = M3Stats.getDefaultScope().gauge("finishUploadRequestLag");

    private static Counter closedIdleUploadChannels = M3Stats.getDefaultScope().counter("closedIdleUploadChannels");

    private final String serverId;
```

### FieldMayBeFinal
Field `finishUploadRequestLag` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
    private static Gauge numConcurrentChannels = M3Stats.getDefaultScope().gauge("numConcurrentUploadChannels");
    private static Gauge finishUploadRequestLag = M3Stats.getDefaultScope().gauge("finishUploadRequestLag");

    private static Counter closedIdleUploadChannels = M3Stats.getDefaultScope().counter("closedIdleUploadChannels");
```

### FieldMayBeFinal
Field `concurrentChannelsAtomicInteger` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private static Counter numChannelInactive = M3Stats.getDefaultScope().counter("numUploadChannelInactive");

    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
    private static Gauge numConcurrentChannels = M3Stats.getDefaultScope().gauge("numConcurrentUploadChannels");
    private static Gauge finishUploadRequestLag = M3Stats.getDefaultScope().gauge("finishUploadRequestLag");
```

### FieldMayBeFinal
Field `numChannelActive` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(UploadChannelInboundHandler.class);

    private static Counter numChannelActive = M3Stats.getDefaultScope().counter("numUploadChannelActive");
    private static Counter numChannelInactive = M3Stats.getDefaultScope().counter("numUploadChannelInactive");

```

### FieldMayBeFinal
Field `numConcurrentChannels` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java

    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
    private static Gauge numConcurrentChannels = M3Stats.getDefaultScope().gauge("numConcurrentUploadChannels");
    private static Gauge finishUploadRequestLag = M3Stats.getDefaultScope().gauge("finishUploadRequestLag");

```

### FieldMayBeFinal
Field `numChannelInactive` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelInboundHandler.java`
#### Snippet
```java

    private static Counter numChannelActive = M3Stats.getDefaultScope().counter("numUploadChannelActive");
    private static Counter numChannelInactive = M3Stats.getDefaultScope().counter("numUploadChannelInactive");

    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/ApplicationMetricsKey.java`
#### Snippet
```java

public class ApplicationMetricsKey {
    private String user;
    private String attemptId;

```

### FieldMayBeFinal
Field `attemptId` may be 'final'
in `src/main/java/com/uber/rss/metrics/ApplicationMetricsKey.java`
#### Snippet
```java
public class ApplicationMetricsKey {
    private String user;
    private String attemptId;

    public ApplicationMetricsKey(String user, String attemptId) {
```

### FieldMayBeFinal
Field `concurrentConnections` may be 'final'
in `src/main/java/com/uber/rss/common/ServerCandidate.java`
#### Snippet
```java
  private ServerDetail serverDetail;
  private long requestLatency;
  private long concurrentConnections;

  public ServerCandidate(ServerDetail serverDetail, long requestLatency, long concurrentConnections) {
```

### FieldMayBeFinal
Field `serverDetail` may be 'final'
in `src/main/java/com/uber/rss/common/ServerCandidate.java`
#### Snippet
```java

public class ServerCandidate {
  private ServerDetail serverDetail;
  private long requestLatency;
  private long concurrentConnections;
```

### FieldMayBeFinal
Field `requestLatency` may be 'final'
in `src/main/java/com/uber/rss/common/ServerCandidate.java`
#### Snippet
```java
public class ServerCandidate {
  private ServerDetail serverDetail;
  private long requestLatency;
  private long concurrentConnections;

```

### FieldMayBeFinal
Field `fileCompressCodec` may be 'final'
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
public class PartitionFileChecker {
  private String filePath;
  private String fileCompressCodec = Compression.COMPRESSION_CODEC_LZ4;
  private String blockCompressCodec = Compression.COMPRESSION_CODEC_LZ4;

```

### FieldMayBeFinal
Field `blockCompressCodec` may be 'final'
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
  private String filePath;
  private String fileCompressCodec = Compression.COMPRESSION_CODEC_LZ4;
  private String blockCompressCodec = Compression.COMPRESSION_CODEC_LZ4;

  public void run() {
```

### FieldMayBeFinal
Field `idleCheckExecutor` may be 'final'
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(PooledWriteClientFactory.class);

  private static ScheduledExecutorService idleCheckExecutor = Executors.newSingleThreadScheduledExecutor(
      new ThreadFactoryBuilder()
          .setDaemon(true)
```

### FieldMayBeFinal
Field `numConnections` may be 'final'
in `src/main/java/com/uber/rss/handlers/UploadChannelManager.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(UploadChannelManager.class);

    private AtomicInteger numConnections = new AtomicInteger();

    private int maxConnections = DEFAULT_MAX_CONNECTIONS;
```

### FieldMayBeFinal
Field `channels` may be 'final'
in `src/main/java/com/uber/rss/StreamServer.java`
#### Snippet
```java

    private UploadChannelManager channelManager;
    private List<Channel> channels = new ArrayList<>(2);

    // this is used when the shuffle server could serve as a registry server
```

### FieldMayBeFinal
Field `servers` may be 'final'
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java

  private final long networkTimeoutMillis;
  private ConcurrentHashMap<String, ServerDetail> servers = new ConcurrentHashMap<>();

  private volatile boolean keepRunning = true;
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/messages/GetBusyStatusRequest.java`
#### Snippet
```java

public class GetBusyStatusRequest extends BaseMessage {
    private String user;

    public GetBusyStatusRequest(String user) {
```

### FieldMayBeFinal
Field `dataAvailable` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectDownloadResponse.java`
#### Snippet
```java

    // if dataAvailable is true, the server sends shuffle data immediately after this message
    private boolean dataAvailable;

    public ConnectDownloadResponse(String serverId, String serverVersion, String runningVersion, String compressionCodec, MapTaskCommitStatus mapTaskCommitStatus, boolean dataAvailable) {
```

### FieldMayBeFinal
Field `serverVersion` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectDownloadResponse.java`
#### Snippet
```java
public class ConnectDownloadResponse extends ServerResponseMessage {
    private String serverId;
    private String serverVersion;
    private String runningVersion;
    private String compressionCodec;
```

### FieldMayBeFinal
Field `compressionCodec` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectDownloadResponse.java`
#### Snippet
```java
    private String serverVersion;
    private String runningVersion;
    private String compressionCodec;

    // this could be null
```

### FieldMayBeFinal
Field `runningVersion` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectDownloadResponse.java`
#### Snippet
```java
    private String serverId;
    private String serverVersion;
    private String runningVersion;
    private String compressionCodec;

```

### FieldMayBeFinal
Field `mapTaskCommitStatus` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectDownloadResponse.java`
#### Snippet
```java

    // this could be null
    private MapTaskCommitStatus mapTaskCommitStatus;

    // if dataAvailable is true, the server sends shuffle data immediately after this message
```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectDownloadResponse.java`
#### Snippet
```java
 */
public class ConnectDownloadResponse extends ServerResponseMessage {
    private String serverId;
    private String serverVersion;
    private String runningVersion;
```

### FieldMayBeFinal
Field `message` may be 'final'
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java

public class RssMaxConnectionsException extends Exception {
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/NotifyClientMetricsKey.java`
#### Snippet
```java
public class NotifyClientMetricsKey {
    private String source;
    private String user;

    public NotifyClientMetricsKey(String source, String user) {
```

### FieldMayBeFinal
Field `source` may be 'final'
in `src/main/java/com/uber/rss/metrics/NotifyClientMetricsKey.java`
#### Snippet
```java

public class NotifyClientMetricsKey {
    private String source;
    private String user;

```

### FieldMayBeFinal
Field `tasks` may be 'final'
in `src/main/java/com/uber/rss/execution/TaskAttemptCollection.java`
#### Snippet
```java
 */
public class TaskAttemptCollection {
  private Map<Long, TaskAttemptIdAndState> tasks = new HashMap<>();

  public TaskAttemptCollection() {
```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectNotifyResponse.java`
#### Snippet
```java

public class ConnectNotifyResponse extends ServerResponseMessage {
    private String serverId;

    public ConnectNotifyResponse(String serverId) {
```

### FieldMayBeFinal
Field `numPartitions` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java
    private long attemptId;
    private int numMaps;
    private int numPartitions;
    private String fileCompressionCodec;
    private short numSplits;
```

### FieldMayBeFinal
Field `mapId` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java

    private int shuffleId;
    private int mapId;
    private long attemptId;
    private int numMaps;
```

### FieldMayBeFinal
Field `attemptId` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java
    private int shuffleId;
    private int mapId;
    private long attemptId;
    private int numMaps;
    private int numPartitions;
```

### FieldMayBeFinal
Field `numMaps` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java
    private int mapId;
    private long attemptId;
    private int numMaps;
    private int numPartitions;
    private String fileCompressionCodec;
```

### FieldMayBeFinal
Field `numSplits` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java
    private int numPartitions;
    private String fileCompressionCodec;
    private short numSplits;

    public StartUploadMessage(int shuffleId, int mapId, long attemptId, int numMaps, int numPartitions, String fileCompressionCodec, short numSplits) {
```

### FieldMayBeFinal
Field `fileCompressionCodec` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java
    private int numMaps;
    private int numPartitions;
    private String fileCompressionCodec;
    private short numSplits;

```

### FieldMayBeFinal
Field `shuffleId` may be 'final'
in `src/main/java/com/uber/rss/messages/StartUploadMessage.java`
#### Snippet
```java
public class StartUploadMessage extends BaseMessage {

    private int shuffleId;
    private int mapId;
    private long attemptId;
```

### FieldMayBeFinal
Field `appAttempt` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationAttemptRequestMessage.java`
#### Snippet
```java
public class FinishApplicationAttemptRequestMessage extends ControlMessage {
    private String appId;
    private String appAttempt;

    public FinishApplicationAttemptRequestMessage(String appId, String appAttempt) {
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationAttemptRequestMessage.java`
#### Snippet
```java

public class FinishApplicationAttemptRequestMessage extends ControlMessage {
    private String appId;
    private String appAttempt;

```

### FieldMayBeFinal
Field `index` may be 'final'
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java

    private static class ServerConnectionInfo {
        private int index;
        private ServerReplicationGroup server;

```

### FieldMayBeFinal
Field `server` may be 'final'
in `src/main/java/com/uber/rss/clients/MultiServerAsyncWriteClient.java`
#### Snippet
```java
    private static class ServerConnectionInfo {
        private int index;
        private ServerReplicationGroup server;

        public ServerConnectionInfo(int index, ServerReplicationGroup server) {
```

### FieldMayBeFinal
Field `mapTaskCommitStatus` may be 'final'
in `src/main/java/com/uber/rss/messages/GetDataAvailabilityResponse.java`
#### Snippet
```java

    // this could be null
    private MapTaskCommitStatus mapTaskCommitStatus;

    // if dataAvailable is true, the server sends shuffle data immediately after this message
```

### FieldMayBeFinal
Field `dataAvailable` may be 'final'
in `src/main/java/com/uber/rss/messages/GetDataAvailabilityResponse.java`
#### Snippet
```java

    // if dataAvailable is true, the server sends shuffle data immediately after this message
    private boolean dataAvailable;

    public GetDataAvailabilityResponse(MapTaskCommitStatus mapTaskCommitStatus, boolean dataAvailable) {
```

### FieldMayBeFinal
Field `metricGroupContainer` may be 'final'
in `src/main/java/com/uber/rss/metrics/MetadataClientMetricsContainer.java`
#### Snippet
```java

public class MetadataClientMetricsContainer {
    private MetricGroupContainer<MetadataClientMetricsKey, MetadataClientMetrics> metricGroupContainer;
    
    public MetadataClientMetricsContainer() {
```

### FieldMayBeFinal
Field `metricGroupContainer` may be 'final'
in `src/main/java/com/uber/rss/metrics/ExceptionMetricGroupContainer.java`
#### Snippet
```java

public class ExceptionMetricGroupContainer  {
    private MetricGroupContainer<ExceptionMetricsKey, ExceptionMetrics> metricGroupContainer;
    
    public ExceptionMetricGroupContainer() {
```

### FieldMayBeFinal
Field `payload` may be 'final'
in `src/main/java/com/uber/rss/common/DataBlock.java`
#### Snippet
```java
public class DataBlock {
  private DataBlockHeader header;
  private byte[] payload;

  public DataBlock(DataBlockHeader header, byte[] payload) {
```

### FieldMayBeFinal
Field `header` may be 'final'
in `src/main/java/com/uber/rss/common/DataBlock.java`
#### Snippet
```java

public class DataBlock {
  private DataBlockHeader header;
  private byte[] payload;

```

### FieldMayBeFinal
Field `length` may be 'final'
in `src/main/java/com/uber/rss/common/PartitionFilePathAndLength.java`
#### Snippet
```java
  private int partition;
  private String path;
  private long length;

  public PartitionFilePathAndLength(int partition, String path, long length) {
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/ApplicationJobStatusMetricsKey.java`
#### Snippet
```java

public class ApplicationJobStatusMetricsKey {
    private String user;
    private String jobStatus;

```

### FieldMayBeFinal
Field `path` may be 'final'
in `src/main/java/com/uber/rss/common/PartitionFilePathAndLength.java`
#### Snippet
```java
public class PartitionFilePathAndLength {
  private int partition;
  private String path;
  private long length;

```

### FieldMayBeFinal
Field `jobStatus` may be 'final'
in `src/main/java/com/uber/rss/metrics/ApplicationJobStatusMetricsKey.java`
#### Snippet
```java
public class ApplicationJobStatusMetricsKey {
    private String user;
    private String jobStatus;

    public ApplicationJobStatusMetricsKey(String user, String jobStatus) {
```

### FieldMayBeFinal
Field `partition` may be 'final'
in `src/main/java/com/uber/rss/common/PartitionFilePathAndLength.java`
#### Snippet
```java

public class PartitionFilePathAndLength {
  private int partition;
  private String path;
  private long length;
```

### FieldMayBeFinal
Field `cluster` may be 'final'
in `src/main/java/com/uber/rss/common/ServerDetailCollection.java`
#### Snippet
```java
    private class DataCenterAndCluster {
        private String dataCenter;
        private String cluster;

        public DataCenterAndCluster(String dataCenter, String cluster) {
```

### FieldMayBeFinal
Field `dataCenter` may be 'final'
in `src/main/java/com/uber/rss/common/ServerDetailCollection.java`
#### Snippet
```java

    private class DataCenterAndCluster {
        private String dataCenter;
        private String cluster;

```

### FieldMayBeFinal
Field `taskAttemptId` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishUploadMessage.java`
#### Snippet
```java
    public static final byte ACK_FLAG_HAS_ACK = 1;

    private long taskAttemptId;
    private long timestamp;
    private byte ackFlag;
```

### FieldMayBeFinal
Field `timestamp` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishUploadMessage.java`
#### Snippet
```java

    private long taskAttemptId;
    private long timestamp;
    private byte ackFlag;

```

### FieldMayBeFinal
Field `ackFlag` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishUploadMessage.java`
#### Snippet
```java
    private long taskAttemptId;
    private long timestamp;
    private byte ackFlag;

    public FinishUploadMessage(long taskAttemptId, long timestamp, byte ackFlag) {
```

### FieldMayBeFinal
Field `appAttempt` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationJobRequestMessage.java`
#### Snippet
```java
public class FinishApplicationJobRequestMessage extends ControlMessage {
    private String appId;
    private String appAttempt;
    private int jobId;
    private String jobStatus;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationJobRequestMessage.java`
#### Snippet
```java

public class FinishApplicationJobRequestMessage extends ControlMessage {
    private String appId;
    private String appAttempt;
    private int jobId;
```

### FieldMayBeFinal
Field `jobId` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationJobRequestMessage.java`
#### Snippet
```java
    private String appId;
    private String appAttempt;
    private int jobId;
    private String jobStatus;
    private String exceptionName;
```

### FieldMayBeFinal
Field `exceptionDetail` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationJobRequestMessage.java`
#### Snippet
```java
    private String jobStatus;
    private String exceptionName;
    private String exceptionDetail;

    public FinishApplicationJobRequestMessage(String appId, String appAttempt, int jobId, String jobStatus, String exceptionName, String exceptionDetail) {
```

### FieldMayBeFinal
Field `jobStatus` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationJobRequestMessage.java`
#### Snippet
```java
    private String appAttempt;
    private int jobId;
    private String jobStatus;
    private String exceptionName;
    private String exceptionDetail;
```

### FieldMayBeFinal
Field `exceptionName` may be 'final'
in `src/main/java/com/uber/rss/messages/FinishApplicationJobRequestMessage.java`
#### Snippet
```java
    private int jobId;
    private String jobStatus;
    private String exceptionName;
    private String exceptionDetail;

```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectRegistryRequest.java`
#### Snippet
```java

public class ConnectRegistryRequest extends BaseMessage {
    private String user;

    public ConnectRegistryRequest(String user) {
```

### FieldMayBeFinal
Field `path` may be 'final'
in `src/main/java/com/uber/rss/common/FilePathAndLength.java`
#### Snippet
```java

public class FilePathAndLength {
  private String path;
  private long length;

```

### FieldMayBeFinal
Field `length` may be 'final'
in `src/main/java/com/uber/rss/common/FilePathAndLength.java`
#### Snippet
```java
public class FilePathAndLength {
  private String path;
  private long length;

  public FilePathAndLength(String path, long length) {
```

### FieldMayBeFinal
Field `maxValueLen` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamReadClientVerify.java`
#### Snippet
```java
    private Map<Integer, Long> expectedTotalRecordsForEachPartition;

    private int maxValueLen = 10000;

    private Runnable actionToSimulateBadServer = null;
```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/common/ServerDetail.java`
#### Snippet
```java
    }

    private String serverId;
    private String runningVersion;
    private String connectionString;
```

### FieldMayBeFinal
Field `connectionString` may be 'final'
in `src/main/java/com/uber/rss/common/ServerDetail.java`
#### Snippet
```java
    private String serverId;
    private String runningVersion;
    private String connectionString;

    public ServerDetail(String serverId, String runningVersion, String connectionString) {
```

### FieldMayBeFinal
Field `runningVersion` may be 'final'
in `src/main/java/com/uber/rss/common/ServerDetail.java`
#### Snippet
```java

    private String serverId;
    private String runningVersion;
    private String connectionString;

```

### FieldMayBeFinal
Field `index` may be 'final'
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java

    private static class ServerConnectionInfo {
        private int index;
        private ServerReplicationGroup server;

```

### FieldMayBeFinal
Field `server` may be 'final'
in `src/main/java/com/uber/rss/clients/MultiServerSyncWriteClient.java`
#### Snippet
```java
    private static class ServerConnectionInfo {
        private int index;
        private ServerReplicationGroup server;

        public ServerConnectionInfo(int index, ServerReplicationGroup server) {
```

### FieldMayBeFinal
Field `applicationJobStatusMetricsContainer` may be 'final'
in `src/main/java/com/uber/rss/metrics/NotifyServerMetricsContainer.java`
#### Snippet
```java

public class NotifyServerMetricsContainer {
    private MetricGroupContainer<ApplicationJobStatusMetricsKey, ApplicationJobStatusMetrics> applicationJobStatusMetricsContainer;

    private MetricGroupContainer<ApplicationMetricsKey, ApplicationMetrics> applicationMetricsContainer;
```

### FieldMayBeFinal
Field `applicationMetricsContainer` may be 'final'
in `src/main/java/com/uber/rss/metrics/NotifyServerMetricsContainer.java`
#### Snippet
```java
    private MetricGroupContainer<ApplicationJobStatusMetricsKey, ApplicationJobStatusMetrics> applicationJobStatusMetricsContainer;

    private MetricGroupContainer<ApplicationMetricsKey, ApplicationMetrics> applicationMetricsContainer;
    
    public NotifyServerMetricsContainer() {
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/messages/HeartbeatMessage.java`
#### Snippet
```java

public class HeartbeatMessage extends BaseMessage {
    private String user;
    private String appId;
    private String appAttempt;
```

### FieldMayBeFinal
Field `keepLive` may be 'final'
in `src/main/java/com/uber/rss/messages/HeartbeatMessage.java`
#### Snippet
```java
    private String appId;
    private String appAttempt;
    private boolean keepLive;

    public HeartbeatMessage(String user, String appId, String appAttempt, boolean keepLive) {
```

### FieldMayBeFinal
Field `appAttempt` may be 'final'
in `src/main/java/com/uber/rss/messages/HeartbeatMessage.java`
#### Snippet
```java
    private String user;
    private String appId;
    private String appAttempt;
    private boolean keepLive;

```

### FieldMayBeFinal
Field `appId` may be 'final'
in `src/main/java/com/uber/rss/messages/HeartbeatMessage.java`
#### Snippet
```java
public class HeartbeatMessage extends BaseMessage {
    private String user;
    private String appId;
    private String appAttempt;
    private boolean keepLive;
```

### FieldMayBeFinal
Field `serverVersion` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectUploadResponse.java`
#### Snippet
```java
public class ConnectUploadResponse extends ServerResponseMessage {
    private String serverId;
    private String serverVersion;
    private String runningVersion;

```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectUploadResponse.java`
#### Snippet
```java

public class ConnectUploadResponse extends ServerResponseMessage {
    private String serverId;
    private String serverVersion;
    private String runningVersion;
```

### FieldMayBeFinal
Field `runningVersion` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectUploadResponse.java`
#### Snippet
```java
    private String serverId;
    private String serverVersion;
    private String runningVersion;

    public ConnectUploadResponse(String serverId, String serverVersion, String runningVersion) {
```

### FieldMayBeFinal
Field `usedPartitionIds` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private AtomicLong mapThreadErrors = new AtomicLong();

    private ConcurrentHashMap<Integer, Object> usedPartitionIds = new ConcurrentHashMap<>();

    public void setServerHosts(List<String> serverHosts) {
```

### FieldMayBeFinal
Field `totalSocketBytes` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    
    // Total bytes sent through socket
    private AtomicLong totalSocketBytes = new AtomicLong();

    // Threads for all map tasks
```

### FieldMayBeFinal
Field `servers` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private ScheduledMetricCollector scheduledMetricCollector;
    
    private List<StreamServer> servers = new ArrayList<>();

    // store servers to shut down, this is to simulate failed servers during shuffle write/read, when there are shuffle replicas.
```

### FieldMayBeFinal
Field `random` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private ServiceRegistry serviceRegistry = new InMemoryServiceRegistry();
    
    private Random random = new Random();
    
    // Total written bytes in shuffle files
```

### FieldMayBeFinal
Field `successShuffleWrittenRecords` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

    // Successfully written records (by last mapper task attempt) in shuffle files
    private AtomicLong successShuffleWrittenRecords = new AtomicLong();
    
    // Total bytes sent through socket
```

### FieldMayBeFinal
Field `totalShuffleWrittenRecords` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private AtomicLong totalShuffleWrittenBytes = new AtomicLong();
    // Total written records in shuffle files
    private AtomicLong totalShuffleWrittenRecords = new AtomicLong();

    // Successfully written records (by last mapper task attempt) in shuffle files
```

### FieldMayBeFinal
Field `allMapThreads` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java

    // Threads for all map tasks
    private List<Thread> allMapThreads = new ArrayList<>();
    
    private AppShuffleId appShuffleId;
```

### FieldMayBeFinal
Field `mapThreadErrors` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private AppShuffleId appShuffleId;
    
    private AtomicLong mapThreadErrors = new AtomicLong();

    private ConcurrentHashMap<Integer, Object> usedPartitionIds = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `serverDetails` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    private List<Integer> serverPorts = new ArrayList<>();
    private List<String> serverRootDirs = new ArrayList<>();
    private List<ServerDetail> serverDetails = new ArrayList<>();

    private boolean useEpoll = false;
```

### FieldMayBeFinal
Field `totalShuffleWrittenBytes` may be 'final'
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
    
    // Total written bytes in shuffle files
    private AtomicLong totalShuffleWrittenBytes = new AtomicLong();
    // Total written records in shuffle files
    private AtomicLong totalShuffleWrittenRecords = new AtomicLong();
```

### FieldMayBeFinal
Field `metricGroupContainer` may be 'final'
in `src/main/java/com/uber/rss/metrics/NettyServerSideMetricGroupContainer.java`
#### Snippet
```java

public class NettyServerSideMetricGroupContainer <M extends MetricGroup<NettyServerSideMetricsKey>>  {
    private MetricGroupContainer<NettyServerSideMetricsKey, M> metricGroupContainer;
    
    public NettyServerSideMetricGroupContainer(Function<NettyServerSideMetricsKey, ? extends M> createFunction) {
```

### FieldMayBeFinal
Field `cause` may be 'final'
in `src/main/java/com/uber/rss/clients/FailedFetchRecordKeyValuePair.java`
#### Snippet
```java
 */
public class FailedFetchRecordKeyValuePair extends TaskByteArrayDataBlock {
    private Throwable cause;

    public FailedFetchRecordKeyValuePair(Throwable cause) {
```

### FieldMayBeFinal
Field `servers` may be 'final'
in `src/main/java/com/uber/rss/messages/GetServersResponseMessage.java`
#### Snippet
```java

public class GetServersResponseMessage extends ServerResponseMessage {
    private List<ServerDetail> servers;

    public GetServersResponseMessage(List<ServerDetail> servers) {
```

### FieldMayBeFinal
Field `maxCount` may be 'final'
in `src/main/java/com/uber/rss/messages/GetServersRequestMessage.java`
#### Snippet
```java
    private String dataCenter;
    private String cluster;
    private int maxCount;

    public GetServersRequestMessage(String dataCenter, String cluster, int maxCount) {
```

### FieldMayBeFinal
Field `dataCenter` may be 'final'
in `src/main/java/com/uber/rss/messages/GetServersRequestMessage.java`
#### Snippet
```java

public class GetServersRequestMessage extends ControlMessage {
    private String dataCenter;
    private String cluster;
    private int maxCount;
```

### FieldMayBeFinal
Field `cluster` may be 'final'
in `src/main/java/com/uber/rss/messages/GetServersRequestMessage.java`
#### Snippet
```java
public class GetServersRequestMessage extends ControlMessage {
    private String dataCenter;
    private String cluster;
    private int maxCount;

```

### FieldMayBeFinal
Field `source` may be 'final'
in `src/main/java/com/uber/rss/metrics/ClientConnectMetricsKey.java`
#### Snippet
```java

public class ClientConnectMetricsKey {
    private String source;
    private String remote;

```

### FieldMayBeFinal
Field `remote` may be 'final'
in `src/main/java/com/uber/rss/metrics/ClientConnectMetricsKey.java`
#### Snippet
```java
public class ClientConnectMetricsKey {
    private String source;
    private String remote;

    public ClientConnectMetricsKey(String source, String remote) {
```

### FieldMayBeFinal
Field `defaultScopeClosedLock` may be 'final'
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
    private static final Scope defaultScope;
    private static boolean defaultScopeClosed = false;
    private static Object defaultScopeClosedLock = new Object();

    private static final Gauge numM3Scopes;
```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectRegistryResponse.java`
#### Snippet
```java

public class ConnectRegistryResponse extends ServerResponseMessage {
    private String serverId;

    public ConnectRegistryResponse(String serverId) {
```

### FieldMayBeFinal
Field `numChannelActive` may be 'final'
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(DownloadChannelInboundHandler.class);

    private static Counter numChannelActive = M3Stats.getDefaultScope().counter("numDownloadChannelActive");
    private static Counter numChannelInactive = M3Stats.getDefaultScope().counter("numDownloadChannelInactive");

```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectUploadRequest.java`
#### Snippet
```java

public class ConnectUploadRequest extends BaseMessage {
    private String user;
    private String appId;
    private String appAttempt;
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectUploadRequest.java`
#### Snippet
```java
public class ConnectUploadRequest extends BaseMessage {
    private String user;
    private String appId;
    private String appAttempt;

```

### FieldMayBeFinal
Field `appAttempt` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectUploadRequest.java`
#### Snippet
```java
    private String user;
    private String appId;
    private String appAttempt;

    public ConnectUploadRequest(String user, String appId, String appAttempt) {
```

### FieldMayBeFinal
Field `random` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
    private AtomicInteger fsyncMillisValuesIndex = new AtomicInteger();

    private Random random = new Random();

    private AtomicLong totalOperationCount = new AtomicLong();
```

### FieldMayBeFinal
Field `totalWriteTime` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
    private AtomicLong totalOperationCount = new AtomicLong();

    private AtomicLong totalWriteTime = new AtomicLong();
    private AtomicLong totalFlushTime = new AtomicLong();
    private AtomicLong totalFsyncTime = new AtomicLong();
```

### FieldMayBeFinal
Field `totalFsyncTime` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
    private AtomicLong totalWriteTime = new AtomicLong();
    private AtomicLong totalFlushTime = new AtomicLong();
    private AtomicLong totalFsyncTime = new AtomicLong();

    private void prepare() {
```

### FieldMayBeFinal
Field `fsyncMillisValuesIndex` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java

    private double[] fsyncMillisValues;
    private AtomicInteger fsyncMillisValuesIndex = new AtomicInteger();

    private Random random = new Random();
```

### FieldMayBeFinal
Field `totalFlushTime` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java

    private AtomicLong totalWriteTime = new AtomicLong();
    private AtomicLong totalFlushTime = new AtomicLong();
    private AtomicLong totalFsyncTime = new AtomicLong();

```

### FieldMayBeFinal
Field `numTestValues` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
    private FileOutputStream[] fileStreams;

    private int numTestValues = 1000;
    private int maxTestValueSize = 10000;
    private byte[][] testValues;
```

### FieldMayBeFinal
Field `totalOperationCount` may be 'final'
in `src/main/java/com/uber/rss/tools/FsyncPerfTest.java`
#### Snippet
```java
    private Random random = new Random();

    private AtomicLong totalOperationCount = new AtomicLong();

    private AtomicLong totalWriteTime = new AtomicLong();
```

### FieldMayBeFinal
Field `numConcurrentChannels` may be 'final'
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java

    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
    private static Gauge numConcurrentChannels = M3Stats.getDefaultScope().gauge("numConcurrentDownloadChannels");

    private static Counter closedIdleDownloadChannels = M3Stats.getDefaultScope().counter("closedIdleDownloadChannels");
```

### FieldMayBeFinal
Field `numChannelInactive` may be 'final'
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java

    private static Counter numChannelActive = M3Stats.getDefaultScope().counter("numDownloadChannelActive");
    private static Counter numChannelInactive = M3Stats.getDefaultScope().counter("numDownloadChannelInactive");

    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
```

### FieldMayBeFinal
Field `concurrentChannelsAtomicInteger` may be 'final'
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java
    private static Counter numChannelInactive = M3Stats.getDefaultScope().counter("numDownloadChannelInactive");

    private static AtomicInteger concurrentChannelsAtomicInteger = new AtomicInteger();
    private static Gauge numConcurrentChannels = M3Stats.getDefaultScope().gauge("numConcurrentDownloadChannels");

```

### FieldMayBeFinal
Field `closedIdleDownloadChannels` may be 'final'
in `src/main/java/com/uber/rss/handlers/DownloadChannelInboundHandler.java`
#### Snippet
```java
    private static Gauge numConcurrentChannels = M3Stats.getDefaultScope().gauge("numConcurrentDownloadChannels");

    private static Counter closedIdleDownloadChannels = M3Stats.getDefaultScope().counter("closedIdleDownloadChannels");

    private final String serverId;
```

### FieldMayBeFinal
Field `underlyingStream` may be 'final'
in `src/main/java/com/uber/rss/util/CountedOutputStream.java`
#### Snippet
```java
    private long writtenBytes = 0;

    private OutputStream underlyingStream;

    public CountedOutputStream(OutputStream underlyingStream) {
```

### FieldMayBeFinal
Field `serverId` may be 'final'
in `src/main/java/com/uber/rss/messages/RegisterServerResponseMessage.java`
#### Snippet
```java

public class RegisterServerResponseMessage extends ServerResponseMessage {
    private String serverId;

    public RegisterServerResponseMessage(String serverId) {
```

### FieldMayBeFinal
Field `stateCommitIntervalMillis` may be 'final'
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private Configuration hadoopConfig = null;

  private long stateCommitIntervalMillis = 60000;

  public static StreamServerConfig buildFromArgs(String[] args) throws IOException {
```

### FieldMayBeFinal
Field `hadoopConfig` may be 'final'
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
  private String principal = null;

  private Configuration hadoopConfig = null;

  private long stateCommitIntervalMillis = 60000;
```

### FieldMayBeFinal
Field `source` may be 'final'
in `src/main/java/com/uber/rss/metrics/WriteClientMetricsKey.java`
#### Snippet
```java

public class WriteClientMetricsKey {
    private String source;
    private String user;

```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/WriteClientMetricsKey.java`
#### Snippet
```java
public class WriteClientMetricsKey {
    private String source;
    private String user;

    public WriteClientMetricsKey(String source, String user) {
```

### FieldMayBeFinal
Field `queue` may be 'final'
in `src/main/java/com/uber/rss/metrics/ShuffleClientStageMetricsKey.java`
#### Snippet
```java
public class ShuffleClientStageMetricsKey {
    private String user;
    private String queue;

    public ShuffleClientStageMetricsKey(String user, String queue) {
```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/metrics/ShuffleClientStageMetricsKey.java`
#### Snippet
```java

public class ShuffleClientStageMetricsKey {
    private String user;
    private String queue;

```

### FieldMayBeFinal
Field `user` may be 'final'
in `src/main/java/com/uber/rss/messages/ConnectNotifyRequest.java`
#### Snippet
```java

public class ConnectNotifyRequest extends BaseMessage {
    private String user;

    public ConnectNotifyRequest(String user) {
```

### FieldMayBeFinal
Field `maxStringValueLen` may be 'final'
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java

    // Max length for test string values to uses
    private int maxStringValueLen = 10000;

    private List<HashMap<String, String>> testObjects = new ArrayList<>();
```

### FieldMayBeFinal
Field `random` may be 'final'
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
    private byte[] bytesBuffer;

    private Random random = new Random();

    public void setSerializer(SerializerInstance serializer) {
```

### FieldMayBeFinal
Field `testObjects` may be 'final'
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
    private int maxStringValueLen = 10000;

    private List<HashMap<String, String>> testObjects = new ArrayList<>();

    private ByteArrayOutputStream byteArrayOutputStream;
```

### FieldMayBeFinal
Field `numTestObjects` may be 'final'
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java

    // Total number of test objects to serialize
    private int numTestObjects = 10000;

    // Max length for test string values to uses
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java
  private static class ExceptionLogInfo {
    private String logMsg;
    private Throwable exception;

    public ExceptionLogInfo(String logMsg, Throwable exception) {
```

### FieldMayBeFinal
Field `logMsg` may be 'final'
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java

  private static class ExceptionLogInfo {
    private String logMsg;
    private Throwable exception;

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reporters` are queried, but never updated
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
    private static final Gauge numM3Scopes;
    
    private static final ConcurrentLinkedQueue<StatsReporter> reporters = new ConcurrentLinkedQueue<>();

    private static final ExceptionMetricGroupContainer exceptionMetricGroupContainer;
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
        fileStream = null;
        fileSize = 0;
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
                    }
                }
                continue;
            }
        } while (System.currentTimeMillis() <= startTime + retryMaxMillis);
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/com/uber/rss/clients/RetriableSocketReadClient.java`
#### Snippet
```java
          ThreadUtils.sleep(waitMillis);
        }
        continue;
      }
    } while (System.currentTimeMillis() <= startTime + retryOptions.getRetryMaxMillis());
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `attachment`
in `src/main/java/com/uber/rss/util/AsyncSocketCompletionHandler.java`
#### Snippet
```java
        ByteBuffer byteBuffer;
        
        synchronized (attachment) {
            byteBuffer = attachment.peekBuffer();
            if (byteBuffer == null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `attachment`
in `src/main/java/com/uber/rss/util/AsyncSocketCompletionHandler.java`
#### Snippet
```java
        
        if (byteBuffer.remaining() == 0) {
            synchronized (attachment) {
                ByteBuffer removed = attachment.removeBuffer();
                if (removed != byteBuffer) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `stageState`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

    private void saveShuffleStage(ExecutorShuffleStageState stageState) {
      synchronized (stageState) {
        if (!stageState.isStateSaved()) {
          stageState.closeWriters();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `stageState`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

      ExecutorShuffleStageState stageState = getStageState(appShuffleId);
      synchronized (stageState) {
        stageState.commitMapTask(taskAttemptId);
      }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `getBusyStatusResponse` is redundant
in `src/main/java/com/uber/rss/clients/BusyStatusSocketClient.java`
#### Snippet
```java
    writeControlMessageAndWaitResponseStatus(getBusyStatusRequest);

    GetBusyStatusResponse getBusyStatusResponse = readResponseMessage(MessageConstants.MESSAGE_GetBusyStatusResponse,
                                                                        GetBusyStatusResponse::deserialize);
    return getBusyStatusResponse;
```

### UnnecessaryLocalVariable
Local variable `path` is redundant
in `src/main/java/com/uber/rss/storage/ShuffleFileUtils.java`
#### Snippet
```java
        String fileName = getShuffleFileName(
                appShuffleId.getShuffleId(), partitionId);
        String path = Paths.get(
                getAppShuffleDir(rootDir, appShuffleId.getAppId()), 
                appShuffleId.getAppAttempt(),
```

### UnnecessaryLocalVariable
Local variable `heartbeatMessage` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
        return FinishUploadMessage.deserialize(in);
      case MessageConstants.MESSAGE_HeartbeatMessage:
        HeartbeatMessage heartbeatMessage = HeartbeatMessage.deserialize(in);
        return heartbeatMessage;
      case MessageConstants.MESSAGE_GetBusyStatusRequest:
```

### UnnecessaryLocalVariable
Local variable `getBusyStatusRequest` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
        return heartbeatMessage;
      case MessageConstants.MESSAGE_GetBusyStatusRequest:
        GetBusyStatusRequest getBusyStatusRequest = GetBusyStatusRequest.deserialize(in);
        return getBusyStatusRequest;
      case MessageConstants.MESSAGE_GetBusyStatusResponse:
```

### UnnecessaryLocalVariable
Local variable `getBusyStatusResponse` is redundant
in `src/main/java/com/uber/rss/decoders/StreamServerMessageDecoder.java`
#### Snippet
```java
        return getBusyStatusRequest;
      case MessageConstants.MESSAGE_GetBusyStatusResponse:
        GetBusyStatusResponse getBusyStatusResponse = GetBusyStatusResponse.deserialize(in);
        return getBusyStatusResponse;
      case MessageConstants.MESSAGE_ConnectDownloadRequest:
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        try {
            R response = deserializer.apply(buf);
            return response;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `streamer` is redundant
in `src/main/java/com/uber/rss/execution/ExecutorShuffleStageState.java`
#### Snippet
```java
      String path = ShuffleFileUtils.getShuffleFilePath(
          rootDir, appShuffleId, partition);
      ShufflePartitionWriter streamer
          = new ShufflePartitionWriter(appShufflePartitionId,
          path, fileStartIndex, storage, appConfig.getNumSplits());
```

### UnnecessaryLocalVariable
Local variable `targetState` is redundant
in `src/main/java/com/uber/rss/execution/TaskAttemptIdAndState.java`
#### Snippet
```java

  public void markCommitted() {
    TaskAttemptState targetState = TaskAttemptState.COMMITTED;
    state = targetState;
  }
```

### UnnecessaryLocalVariable
Local variable `persistedBytes` is redundant
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

        ExecutorShuffleStageState stageState = getStageState(appShuffleId);
        List<FilePathAndLength>  persistedBytes = stageState.getPersistedBytesSnapshot(partition);
        return persistedBytes;
    }
```

### UnnecessaryLocalVariable
Local variable `client` is redundant
in `src/main/java/com/uber/rss/clients/PooledWriteClientFactory.java`
#### Snippet
```java
    ClientKey clientKey = new ClientKey(host, port, user, appId, appAttempt);
    ClientPool pool = getPool(clientKey);
    ShuffleDataSyncWriteClient client = pool.getOrCreateClient(timeoutMillis, finishUploadAck, shuffleWriteConfig);
    return client;
  }
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        try {
            long value = buf.readLong();
            return value;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `src/main/java/com/uber/rss/util/SocketUtils.java`
#### Snippet
```java
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        try {
            int value = buf.readInt();
            return value;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `numValueBytes` is redundant
in `src/main/java/com/uber/rss/clients/ShuffleDataSyncWriteClientBase.java`
#### Snippet
```java

  protected int getRecordSerializedSize(ByteBuffer value) {
    int numValueBytes = value == null ? 0 : value.remaining();
    return numValueBytes;
  }
```

### UnnecessaryLocalVariable
Local variable `writeClient` is redundant
in `src/main/java/com/uber/rss/clients/UnpooledWriteClientFactory.java`
#### Snippet
```java
  @Override
  public ShuffleDataSyncWriteClient getOrCreateClient(String host, int port, int timeoutMillis, boolean finishUploadAck, String user, String appId, String appAttempt, ShuffleWriteConfig shuffleWriteConfig) {
    final ShuffleDataSyncWriteClient writeClient = new PlainShuffleDataSyncWriteClient(
        host,
        port,
```

### UnnecessaryLocalVariable
Local variable `getDataAvailabilityResponse` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
    GetDataAvailabilityRequest request = new GetDataAvailabilityRequest();
    writeControlMessageAndWaitResponseStatus(request);
    GetDataAvailabilityResponse getDataAvailabilityResponse = readResponseMessage(MessageConstants.MESSAGE_GetDataAvailabilityResponse, GetDataAvailabilityResponse::deserialize);
    return getDataAvailabilityResponse;
  }
```

### UnnecessaryLocalVariable
Local variable `ratePerMillis` is redundant
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
            checkpointTime.set(currentTime);
            long prevCheckpointValue = checkpointValue.getAndSet(newValue);
            double ratePerMillis = (double)(newValue - prevCheckpointValue) / (double)(currentTime - lastCheckpointTime);
            return ratePerMillis;
        }
```

### UnnecessaryLocalVariable
Local variable `ratePerMillis` is redundant
in `src/main/java/com/uber/rss/util/RateCounter.java`
#### Snippet
```java
        }

        double ratePerMillis = (double)totalValue.get() / (double)duration;
        return ratePerMillis;
    }
```

### UnnecessaryLocalVariable
Local variable `scope` is redundant
in `src/main/java/com/uber/rss/metrics/M3Stats.java`
#### Snippet
```java
        }

        Scope scope = scopeBuilder.reportEvery(Duration.ofSeconds(30));
        return scope;
    }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
          taskAttemptIdInfo = String.format("no task attempt committed");
        } else {
          List<Long> taskAttemptIds = mapTaskCommitStatus.getTaskAttemptIds().values().stream().collect(Collectors.toList());
          Collections.sort(taskAttemptIds);
          taskAttemptIdInfo = String.format("committed task ids: %s, fetching tasks: %s",
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
    public void stop(boolean wait) {
        // Logging mechanism (e.g. log4j, kafka) may not work in shutdown hook, thus use println() to log.
        System.out.println(String.format("%s Stop shuffle executor during shutdown", System.currentTimeMillis()));

        if (wait) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        stageStates.values().parallelStream().forEach(stageState -> saveShuffleStage(stageState));

        System.out.println(String.format("%s Close state store during shutdown", System.currentTimeMillis()));

        stateStore.close();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java
        stateStore.close();

        System.out.println(String.format("%s Stopped shuffle executor during shutdown", System.currentTimeMillis()));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/PartitionFileChecker.java`
#### Snippet
```java
        byte[] dataBlockBytes = StreamUtils.readBytes(inputStream, dataBlockLength);
        dataBlockStreamData.writeBytes(dataBlockBytes);
        System.out.println(String.format("Got data block from task attempt %s, %s bytes", taskAttemptId, dataBlockLength));
      }
    } catch (Throwable e) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
    int filesPerDir = 1000;
    int dirCount = (int)Math.ceil(((double)fileCount)/filesPerDir);
    System.out.println(String.format("Creating %s files with %s directories inside %s", fileCount, dirCount, rootDir));

    List<FileOutputStream> fileStreams = new ArrayList<>();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
        dirPath.toFile().mkdirs();
        dirPath.toFile().deleteOnExit();
        System.out.println(String.format("Creating files under %s, current file descriptors: %s", dirPath.toAbsolutePath(), SystemUtils.getFileDescriptorCount()));
        for (int j = 0; j < filesPerDir; j++) {
          if (fileStreams.size() >= fileCount) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/tools/FileDescriptorStressTest.java`
#### Snippet
```java
      }
    } finally {
      System.out.println(String.format("Created %s files, current file descriptors: %s", fileStreams.size(), SystemUtils.getFileDescriptorCount()));
      fileStreams.forEach(t-> {
        try {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/rss/clients/DataBlockSocketReadClient.java`
#### Snippet
```java
        MapTaskCommitStatus mapTaskCommitStatus = getDataAvailabilityRetryResult.getMapTaskCommitStatus();
        if (mapTaskCommitStatus.getTaskAttemptIds().isEmpty()) {
          taskAttemptIdInfo = String.format("no task attempt committed");
        } else {
          List<Long> taskAttemptIds = mapTaskCommitStatus.getTaskAttemptIds().values().stream().collect(Collectors.toList());
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                logger.warn("Interrupted when waiting in retry", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/util/RetryUtils.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                logger.warn("Interrupted when waiting in retry", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            try {
                Thread.sleep(INTERNAL_WAKEUP_MILLIS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/execution/ShuffleExecutor.java`
#### Snippet
```java

            try {
                Thread.sleep(INTERNAL_WAKEUP_MILLIS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/clients/MultiServerHeartbeatClient.java`
#### Snippet
```java

        try {
          Thread.sleep(heartbeatIntervalMillis);
        } catch (Throwable e) {
          logger.info("RSS Heartbeat thread got interrupted", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                if (mapSlowness > 0) {
                    try {
                        Thread.sleep(mapSlowness);
                    } catch (InterruptedException e) {
                        M3Stats.addException(e, M3Stats.TAG_VALUE_STRESS_TOOL);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/ShuffleDataSocketReadClient.java`
#### Snippet
```java
  private long shuffleReadBytes;

  private ReadClientMetrics metrics = null;

  protected ShuffleDataSocketReadClient(String host, int port, int timeoutMillis, String user, AppShufflePartitionId appShufflePartitionId, Collection<Long> fetchTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
```

### UnusedAssignment
Variable `initialFileSize` initializer `0L` is redundant
in `src/main/java/com/uber/rss/storage/ShuffleFileOutputStream.java`
#### Snippet
```java
    private final String filePath;
    private OutputStream outputStream;
    private long initialFileSize = 0L;
    private CountedOutputStream internalCountedOutputStream;

```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/RecordSocketReadClient.java`
#### Snippet
```java
    private long shuffleReadBytes;

    private ReadClientMetrics metrics = null;

    protected RecordSocketReadClient(String host, int port, int timeoutMillis, String user, AppShufflePartitionId appShufflePartitionId, Collection<Long> fetchTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
```

### UnusedAssignment
Variable `connectionInfo` initializer `""` is redundant
in `src/main/java/com/uber/rss/clients/ClientBase.java`
#### Snippet
```java
    protected OutputStream outputStream;

    protected String connectionInfo = "";

    private final long internalClientId = internalClientIdSeed.getAndIncrement();
```

### UnusedAssignment
Variable `decodeResult` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
        }

        TDecodeResult decodeResult = null;
        do {
            TState oldState = state;
```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/NotifyClient.java`
#### Snippet
```java
  private final String user;

  private NotifyClientMetrics metrics = null;

  public NotifyClient(String host, int port, int timeoutMillis, String user) {
```

### UnusedAssignment
Variable `currentConnections` initializer `-1` is redundant
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java
public class RssMaxConnectionsException extends Exception {
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;

```

### UnusedAssignment
Variable `maxConnections` initializer `-1` is redundant
in `src/main/java/com/uber/rss/exceptions/RssMaxConnectionsException.java`
#### Snippet
```java
    private String message;
    private int currentConnections = -1;
    private int maxConnections = -1;

    public RssMaxConnectionsException(int currentConnections, int maxConnections, String message) {
```

### UnusedAssignment
Variable `metrics` initializer `null` is redundant
in `src/main/java/com/uber/rss/clients/DataBlockSyncWriteClient.java`
#### Snippet
```java
  private long startUploadShuffleByteSnapshot = 0;

  private WriteClientMetrics metrics = null;

  public DataBlockSyncWriteClient(String host, int port, int timeoutMillis, String user, String appId, String appAttempt) {
```

### UnusedAssignment
Variable `bytes` initializer `null` is redundant
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java
    private ServerDetail getServerInfo(String path, String node) {
        String nodePath = String.format("%s/%s", path, node);
        byte[] bytes = null;
        try {
            bytes = zk.getData().forPath(nodePath);
```

### UnusedAssignment
The value `args[i++]` assigned to `hadoopConfFiles` is never used
in `src/main/java/com/uber/rss/StreamServerConfig.java`
#### Snippet
```java
        serverConfig.appMaxWriteBytes = Long.parseLong(args[i++]);
      } else if (argName.equalsIgnoreCase("-hadoopConf")) {
        hadoopConfFiles = args[i++];
      } else if (argName.equalsIgnoreCase("-keytab")) {
        serverConfig.keytab = args[i++];
```

### UnusedAssignment
Variable `elapsedMinutes` initializer `0` is redundant
in `src/main/java/com/uber/rss/tools/StreamServerStressToolLongRun.java`
#### Snippet
```java
        long startTime = System.currentTimeMillis();
        long numIterations = 0;
        long elapsedMinutes = 0;
        
        Random random = new Random();
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                        synchronized (serverIdsToShutdownDuringShuffleWrite) {
                            for (String serverId : serverIdsToShutdownDuringShuffleWrite) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
                                logger.info(String.format("Simulate bad server during shuffle write by shutting down server: %s", server));
                                shutdownServer(server);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/rss/tools/StreamServerStressTool.java`
#### Snippet
```java
                        synchronized (serverIdsToShutdownDuringShuffleRead) {
                            for (String serverId : serverIdsToShutdownDuringShuffleRead) {
                                StreamServer server = servers.stream().filter(t -> t != null).filter(t -> t.getServerId().equals(serverId)).findFirst().get();
                                logger.info(String.format("Simulate bad server during shuffle read by shutting down server: %s", server));
                                shutdownServer(server);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `nextItem != null` is always `true`
in `src/main/java/com/uber/rss/execution/LocalFileStateStoreIterator.java`
#### Snippet
```java
      // TODO messages was originally designed to read data in batches, now we do not need it anymore
      // delete it later.
      if (nextItem != null) {
        messages.add(nextItem);
      }
```

### ConstantValue
Condition `decodeResult == null` is always `true`
in `src/main/java/com/uber/rss/clients/StreamDecoderBase.java`
#### Snippet
```java
                return null;
            }
        } while (decodeResult == null);

        return decodeResult;
```

### ConstantValue
Condition `i < 2` is always `true`
in `src/main/java/com/uber/rss/metadata/ZooKeeperServiceRegistry.java`
#### Snippet
```java
        // Two loops because first loop will only fail in the unlikely situation that the ephemeral node already exists
        // and needs to be deleted before trying again.
        for (int i = 0; i < 2; i++) {
            try {
                zk.create()
```

### ConstantValue
Condition `ex instanceof EOFException` is always `false`
in `src/main/java/com/uber/rss/tools/SerializerBenchmark.java`
#### Snippet
```java
                    object = deserializationStream.readObject(classTag);
                } catch (Throwable ex) {
                    if (ex instanceof EOFException) {
                        break;
                    } else {
```

### ConstantValue
Condition `exception == null` is always `false`
in `src/main/java/com/uber/rss/clients/ReplicatedWriteClient.java`
#### Snippet
```java

    if (!succeeded) {
      if (exception == null) {
        throw new RssInvalidStateException(String.format("No underlying client succeeded, but no exception as well, %s", this));
      }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
        try {
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
        try {
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
                inetAddress = InetAddress.getByName(host);
```

### UnstableApiUsage
'forString(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `src/main/java/com/uber/rss/util/NetworkUtils.java`
#### Snippet
```java
            InetAddress inetAddress;
            if (InetAddresses.isInetAddress(host)) {
                inetAddress = InetAddresses.forString(host);
            } else {
                inetAddress = InetAddress.getByName(host);
```

