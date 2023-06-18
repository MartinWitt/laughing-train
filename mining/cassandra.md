# cassandra 
 
# Bad smells
I found 40 bad smells with 40 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 40 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/config/CFMetaData.java`
#### Snippet
```java
new ToStringBuilder(this).append("cfId", cfId).append("ksName", ksName).append("cfName", cfName).append("cfType", cfType).append("comparator", comparator).append("comment", comment).append("readRepairChance", readRepairChance).append("dcLocalReadRepairChance", dcLocalReadRepairChance).append("gcGraceSeconds", gcGraceSeconds).append("defaultValidator", defaultValidator).append("keyValidator", keyValidator).append("minCompactionThreshold", minCompactionThreshold).append("maxCompactionThreshold", maxCompactionThreshold).append("columnMetadata", columnMetadata.values()).append("compactionStrategyClass", compactionStrategyClass).append("compactionStrategyOptions", compactionStrategyOptions).append("compressionParameters", compressionParameters.asThriftOptions()).append("bloomFilterFpChance", getBloomFilterFpChance()).append("memtableFlushPeriod", memtableFlushPeriod).append("caching", caching).append("defaultTimeToLive", defaultTimeToLive).append("minIndexInterval", minIndexInterval).append("maxIndexInterval", maxIndexInterval).append("speculativeRetry", speculativeRetry).append("droppedColumns", droppedColumns).append("triggers", triggers.values()).append("isDense", isDense).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/config/ColumnDefinition.java`
#### Snippet
```java
Objects.toStringHelper(this).add("name", name).add("type", type).add("kind", kind).add("componentIndex", componentIndex).add("indexName", indexName).add("indexType", indexType).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/config/KSMetaData.java`
#### Snippet
```java
Objects.toStringHelper(this).add("name", name).add("strategyClass", strategyClass.getSimpleName()).add("strategyOptions", strategyOptions).add("cfMetaData", cfMetaData).add("durableWrites", durableWrites).add("userTypes", userTypes).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/config/TriggerDefinition.java`
#### Snippet
```java
Objects.toStringHelper(this).add("name", name).add("classOption", classOption).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/cql3/ColumnSpecification.java`
#### Snippet
```java
Objects.toStringHelper(this).add("name", name).add("type", type).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/cql3/selection/AbstractFunctionSelector.java`
#### Snippet
```java
new StrBuilder(fun.name().toString()).append('(').appendWithSeparators(factories.getColumnNames(), ", ").append(')').toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/cql3/selection/AbstractFunctionSelector.java`
#### Snippet
```java
new StrBuilder().append(fun.name()).append("(").appendWithSeparators(argSelectors, ", ").append(")").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/cql3/selection/Selectable.java`
#### Snippet
```java
new StrBuilder().append(functionName).append("(").appendWithSeparators(args, ", ").append(")").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/cql3/selection/Selection.java`
#### Snippet
```java
Objects.toStringHelper(this).add("columns", columns).add("columnMapping", columnMapping).add("metadata", metadata).add("collectTimestamps", collectTimestamps).add("collectTTLs", collectTTLs).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java`
#### Snippet
```java
Objects.toStringHelper(this).add("name", cfName).add("selectClause", selectClause).add("whereClause", whereClause).add("isDistinct", parameters.isDistinct).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/DataRange.java`
#### Snippet
```java
Objects.toStringHelper(this).add("keyRange", keyRange).add("columnFilter", columnFilter).add("selectFullRow", selectFullRow).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/DataRange.java`
#### Snippet
```java
Objects.toStringHelper(this).add("keyRange", keyRange).add("sliceFilter", sliceFilter).add("columnFilter", columnFilter).add("firstPartitionColumnStart", firstPartitionColumnStart == null ? "null" : cfm.comparator.getString(firstPartitionColumnStart)).add("lastPartitionColumnFinish", lastPartitionColumnFinish == null ? "null" : cfm.comparator.getString(lastPartitionColumnFinish)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/RangeSliceCommand.java`
#### Snippet
```java
Objects.toStringHelper(this).add("keyspace", keyspace).add("columnFamily", columnFamily).add("predicate", predicate).add("keyRange", keyRange).add("rowFilter", rowFilter).add("maxResults", maxResults).add("counterCQL3Rows", countCQL3Rows).add("timestamp", timestamp).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/SliceByNamesReadCommand.java`
#### Snippet
```java
Objects.toStringHelper(this).add("ksName", ksName).add("cfName", cfName).add("key", ByteBufferUtil.bytesToHex(key)).add("filter", filter).add("timestamp", timestamp).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/SliceFromReadCommand.java`
#### Snippet
```java
Objects.toStringHelper(this).add("ksName", ksName).add("cfName", cfName).add("key", ByteBufferUtil.bytesToHex(key)).add("filter", filter).add("timestamp", timestamp).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/filter/ExtendedFilter.java`
#### Snippet
```java
Objects.toStringHelper(this).add("dataRange", dataRange).add("maxResults", maxResults).add("currentLimit", currentLimit).add("timestamp", timestamp).add("countCQL3Rows", countCQL3Rows).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/filter/ExtendedFilter.java`
#### Snippet
```java
Objects.toStringHelper(this).add("dataRange", dataRange).add("timestamp", timestamp).add("clause", clause).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/db/index/SecondaryIndex.java`
#### Snippet
```java
Objects.toStringHelper(this).add("columnDefs", columnDefs).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java`
#### Snippet
```java
subrange.getStart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java`
#### Snippet
```java
subrange.getStart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java`
#### Snippet
```java
subrange.getEnd().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java`
#### Snippet
```java
subrange.getEnd().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java`
#### Snippet
```java
tokenRange.getStart().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java`
#### Snippet
```java
tokenRange.getEnd().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/pig/CassandraStorage.java`
#### Snippet
```java
be.getLhs().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/pig/CassandraStorage.java`
#### Snippet
```java
be.getRhs().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/pig/CqlNativeStorage.java`
#### Snippet
```java
be.getLhs().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/pig/CqlNativeStorage.java`
#### Snippet
```java
be.getRhs().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/hadoop/pig/CqlNativeStorage.java`
#### Snippet
```java
columnMetadata.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/locator/InetAddressAndPort.java`
#### Snippet
```java
HostAndPort.fromParts(address.getHostAddress(), port).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/service/StorageService.java`
#### Snippet
```java
logger.getLevel().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/unit/org/apache/cassandra/service/StorageServiceServerTest.java`
#### Snippet
```java
new LongToken(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/unit/org/apache/cassandra/service/StorageServiceServerTest.java`
#### Snippet
```java
new LongToken(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/utils/NativeSSTableLoaderClient.java`
#### Snippet
```java
tokenRange.getStart().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/src/java/org/apache/cassandra/utils/NativeSSTableLoaderClient.java`
#### Snippet
```java
tokenRange.getEnd().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/distributed/org/apache/cassandra/distributed/impl/RowUtil.java`
#### Snippet
```java
columnSpec.name.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/pig/org/apache/cassandra/pig/CqlTableTest.java`
#### Snippet
```java
t.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/pig/org/apache/cassandra/pig/CqlTableTest.java`
#### Snippet
```java
t.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/pig/org/apache/cassandra/pig/ThriftColumnFamilyTest.java`
#### Snippet
```java
t.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-cassandra-583695816680971651710368504563528277853/test/pig/org/apache/pig/test/MiniCluster.java`
#### Snippet
```java
m_fileSys.getUri().toString()
```

