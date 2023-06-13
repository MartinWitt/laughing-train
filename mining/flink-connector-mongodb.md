# flink-connector-mongodb 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-flink-connector-mongodb13012024004900782373612616052037119495/flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/RowDataToBsonConverters.java`
#### Snippet
```java
keyArray.getString(i).toString()
```

