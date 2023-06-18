# kafka 
 
# Bad smells
I found 44 bad smells with 44 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 44 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/clients/src/test/java/org/apache/kafka/common/security/oauthbearer/internals/secured/ConfigurationUtilsTest.java`
#### Snippet
```java
new File("/tmp/not/a/real/file.txt").toURI().toURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/clients/src/test/java/org/apache/kafka/common/security/oauthbearer/internals/secured/ConfigurationUtilsTest.java`
#### Snippet
```java
file.toURI().toURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/clients/src/test/java/org/apache/kafka/common/utils/LogCaptureAppender.java`
#### Snippet
```java
event.getLevel().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java`
#### Snippet
```java
namespacedUrl(workerUrl).path("connectors").path(id.connector()).path("fence").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/distributed/DistributedHerder.java`
#### Snippet
```java
namespacedUrl(leaderUrl).path("connectors").path(connName).path("tasks").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/rest/HerderRequestHandler.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/runtime/rest/resources/ConnectorsResourceTest.java`
#### Snippet
```java
connectorsResource.createConnector(FORWARD, NULL_HEADERS, body).getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/runtime/rest/resources/ConnectorsResourceTest.java`
#### Snippet
```java
connectorsResource.createConnector(FORWARD, NULL_HEADERS, body).getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/runtime/rest/resources/ConnectorsResourceTest.java`
#### Snippet
```java
connectorsResource.putConnectorConfig(CONNECTOR_NAME_SPECIAL_CHARS, NULL_HEADERS, FORWARD, CONNECTOR_CONFIG_SPECIAL_CHARS).getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/runtime/rest/resources/ConnectorsResourceTest.java`
#### Snippet
```java
connectorsResource.putConnectorConfig(CONNECTOR_NAME_CONTROL_SEQUENCES1, NULL_HEADERS, FORWARD, CONNECTOR_CONFIG_CONTROL_SEQUENCES).getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/connect/runtime/src/test/java/org/apache/kafka/connect/integration/OffsetsApiIntegrationTest.java`
#### Snippet
```java
response.getEntity().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/group-coordinator/src/test/java/org/apache/kafka/coordinator/group/GroupMetadataManagerTest.java`
#### Snippet
```java
Uuid.randomUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/group-coordinator/src/test/java/org/apache/kafka/coordinator/group/GroupMetadataManagerTest.java`
#### Snippet
```java
Uuid.randomUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/group-coordinator/src/test/java/org/apache/kafka/coordinator/group/GroupMetadataManagerTest.java`
#### Snippet
```java
Uuid.randomUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/group-coordinator/src/test/java/org/apache/kafka/coordinator/group/GroupMetadataManagerTest.java`
#### Snippet
```java
Uuid.randomUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/jmh-benchmarks/src/main/java/org/apache/kafka/jmh/common/FetchRequestBenchmark.java`
#### Snippet
```java
RequestConvertToJson.request(consumerRequest).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/jmh-benchmarks/src/main/java/org/apache/kafka/jmh/common/ListOffsetRequestBenchmark.java`
#### Snippet
```java
RequestConvertToJson.request(offsetRequest).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/jmh-benchmarks/src/main/java/org/apache/kafka/jmh/common/ProduceRequestBenchmark.java`
#### Snippet
```java
RequestConvertToJson.request(produceRequest).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/KRaftMetadataRequestBenchmark.java`
#### Snippet
```java
RequestConvertToJson.requestDesc(allTopicMetadataRequest.header(), allTopicMetadataRequest.requestLog(), allTopicMetadataRequest.isForwarded()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/jmh-benchmarks/src/main/java/org/apache/kafka/jmh/metadata/MetadataRequestBenchmark.java`
#### Snippet
```java
RequestConvertToJson.requestDesc(allTopicMetadataRequest.header(), allTopicMetadataRequest.requestLog(), allTopicMetadataRequest.isForwarded()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/metadata/src/test/java/org/apache/kafka/controller/metrics/ControllerMetricsTestUtils.java`
#### Snippet
```java
bld.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/metadata/src/test/java/org/apache/kafka/controller/metrics/ControllerMetricsTestUtils.java`
#### Snippet
```java
bld.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/metadata/src/test/java/org/apache/kafka/metadata/PartitionRegistrationTest.java`
#### Snippet
```java
new LeaderAndIsrPartitionState().setTopicName("foo").setPartitionIndex(1).setControllerEpoch(-1).setLeader(1).setLeaderEpoch(123).setIsr(Arrays.asList(1, 2)).setPartitionEpoch(456).setReplicas(Arrays.asList(1, 2, 3)).setAddingReplicas(Collections.emptyList()).setRemovingReplicas(Collections.emptyList()).setIsNew(true).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/metadata/src/test/java/org/apache/kafka/metadata/PartitionRegistrationTest.java`
#### Snippet
```java
new LeaderAndIsrPartitionState().setTopicName("bar").setPartitionIndex(0).setControllerEpoch(-1).setLeader(2).setLeaderEpoch(234).setIsr(Arrays.asList(2, 3, 4)).setPartitionEpoch(567).setReplicas(Arrays.asList(2, 3, 4)).setAddingReplicas(Collections.emptyList()).setRemovingReplicas(Collections.emptyList()).setIsNew(false).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/metadata/src/main/java/org/apache/kafka/metadata/util/RecordRedactor.java`
#### Snippet
```java
record.name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/tools/src/main/java/org/apache/kafka/tools/ConsumerPerformance.java`
#### Snippet
```java
options.valueOf(socketBufferSizeOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/tools/src/main/java/org/apache/kafka/tools/ConsumerPerformance.java`
#### Snippet
```java
options.valueOf(fetchSizeOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/trogdor/src/main/java/org/apache/kafka/trogdor/agent/AgentClient.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/trogdor/src/main/java/org/apache/kafka/trogdor/coordinator/CoordinatorClient.java`
#### Snippet
```java
UriBuilder.fromPath(url("/coordinator/tasks/{taskId}")).build(request.taskId()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/trogdor/src/main/java/org/apache/kafka/trogdor/workload/ExternalCommandWorker.java`
#### Snippet
```java
resp.get("status").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/core/src/test/java/kafka/test/junit/RaftClusterInvocationContext.java`
#### Snippet
```java
key.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/core/src/test/java/kafka/test/junit/RaftClusterInvocationContext.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/core/src/test/java/kafka/test/junit/RaftClusterInvocationContext.java`
#### Snippet
```java
key.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/core/src/test/java/kafka/test/junit/RaftClusterInvocationContext.java`
#### Snippet
```java
value.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-kafka-46899306415904101653804288366872243850/core/src/test/java/kafka/testkit/KafkaClusterTestKit.java`
#### Snippet
```java
nodes.clusterId().toString()
```

