# airavata-mft 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-airavata-mft-409713273038089980917628497347329989993/transport/azure-transport/src/main/java/org/apache/airavata/mft/transport/azure/AzureMetadataCollector.java`
#### Snippet
```java
md5sb.toString()
```

