# doris-spark-connector 
 
# Bad smells
I found 4 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 4 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-doris-spark-connector482320392495325762916792427683318246733/spark-doris-connector/src/main/java/org/apache/doris/spark/rest/RestService.java`
#### Snippet
```java
request.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-doris-spark-connector482320392495325762916792427683318246733/spark-doris-connector/src/main/java/org/apache/doris/spark/rest/RestService.java`
#### Snippet
```java
request.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-doris-spark-connector482320392495325762916792427683318246733/spark-doris-connector/src/main/java/org/apache/doris/spark/rest/RestService.java`
#### Snippet
```java
request.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-doris-spark-connector482320392495325762916792427683318246733/spark-doris-connector/src/main/java/org/apache/doris/spark/serialization/RowBatch.java`
#### Snippet
```java
listVector.getObject(rowIndex).toString()
```

