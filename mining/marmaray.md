# marmaray 
 
# Bad smells
I found 43 bad smells with 43 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 43 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/configuration/ErrorTableConfiguration.java`
#### Snippet
```java
this.getDestPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/TestDataFrameDataConverter.java`
#### Snippet
```java
gr.get(STRING_FIELD).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/TestDataFrameDataConverter.java`
#### Snippet
```java
gr2.get(STRING_FIELD).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/TestDataFrameDataConverter.java`
#### Snippet
```java
gr.get(STRING_FIELD).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataConverter.java`
#### Snippet
```java
record.get(field.name()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
row.getData().get(this.row_identifier).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestCassandraSinkCQLDataConverter.java`
#### Snippet
```java
result.get(0).getSuccessData().get().getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestCassandraSinkCQLDataConverter.java`
#### Snippet
```java
result.get(0).getSuccessData().get().getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestCassandraSinkCQLDataConverter.java`
#### Snippet
```java
result.get(0).getSuccessData().get().getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestCassandraSinkCQLDataConverter.java`
#### Snippet
```java
result.get(0).getSuccessData().get().getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestFileSinkDataCSVConverter.java`
#### Snippet
```java
this.fileSystem.get().getWorkingDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestFileSinkDataCSVConverter.java`
#### Snippet
```java
this.fileSystem.get().getWorkingDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestFileSinkDataJSONConverter.java`
#### Snippet
```java
this.fileSystem.get().getWorkingDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/converters/data/TestFileSinkDataJSONConverter.java`
#### Snippet
```java
this.fileSystem.get().getWorkingDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/dataset/TestUtilTable.java`
#### Snippet
```java
f.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/dataset/TestUtilTable.java`
#### Snippet
```java
ImmutableMap.of("tag1-" + i, "tagVal1-" + i, "tag2-" + i, "tagVal2-" + i).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
metadataManagerValue.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/metadata/TestHDFSJobLevelMetadataTracker.java`
#### Snippet
```java
this.tracker.get().get(TEST_TOPIC_1).get().get("metaKey1").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/metadata/TestHDFSJobLevelMetadataTracker.java`
#### Snippet
```java
this.tracker.get().get(TEST_TOPIC_1).get().get("metaKey1").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/metadata/TestHDFSPartitionManager.java`
#### Snippet
```java
fs.get().getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/reporters/ConsoleReporter.java`
#### Snippet
```java
m.getTags().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/schema/TestHDFSSchemaService.java`
#### Snippet
```java
output1.get("firstName").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/schema/TestHDFSSchemaService.java`
#### Snippet
```java
output1.get("lastName").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/schema/TestHDFSSchemaService.java`
#### Snippet
```java
output2.get("firstName").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/schema/TestHDFSSchemaService.java`
#### Snippet
```java
output2.get("lastName").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/schema/TestHDFSSchemaService.java`
#### Snippet
```java
output2.get("middleName").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
this.ttl.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
field.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
this.ttl.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
this.timestamp.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
field.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
msgDay.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/sinks/file/FileSinkTestUtil.java`
#### Snippet
```java
this.fileSystem.get().getWorkingDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/sources/hive/TestHiveSource.java`
#### Snippet
```java
record.get(LEFT_FIELD).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/sources/hive/TestHiveSource.java`
#### Snippet
```java
record.get(RIGHT_FIELD).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
entry.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/test/java/com/uber/marmaray/common/util/FileSinkConfigTestUtil.java`
#### Snippet
```java
this.fileSystem.get().getWorkingDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/utilities/ErrorTableUtil.java`
#### Snippet
```java
errorTableConf.getDestPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java
payload.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java
payload.getData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/utilities/JsonSourceConverterErrorExtractor.java`
#### Snippet
```java
errorData.getRawData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
lastFile.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-marmaray-535843622492274899514880162590403293679/marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
lastFile.getPath().toString()
```

