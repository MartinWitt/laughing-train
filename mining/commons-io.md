# commons-io 
 
# Bad smells
I found 6 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 6 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-commons-io213406738498841315814492372721403874870/src/test/java/org/apache/commons/io/input/CharacterFilterReaderTest.java`
#### Snippet
```java
output.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-commons-io213406738498841315814492372721403874870/src/test/java/org/apache/commons/io/input/CharacterSetFilterReaderTest.java`
#### Snippet
```java
output.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-commons-io213406738498841315814492372721403874870/src/test/java/org/apache/commons/io/input/QueueInputStreamTest.java`
#### Snippet
```java
stopwatch.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-commons-io213406738498841315814492372721403874870/src/test/java/org/apache/commons/io/output/BrokenWriterTest.java`
#### Snippet
```java
brokenWriter.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-commons-io213406738498841315814492372721403874870/src/test/java/org/apache/commons/io/output/UncheckedFilterOutputStreamTest.java`
#### Snippet
```java
brokenWriter.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-commons-io213406738498841315814492372721403874870/src/test/java/org/apache/commons/io/output/UncheckedFilterWriterTest.java`
#### Snippet
```java
brokenWriter.toString()
```

