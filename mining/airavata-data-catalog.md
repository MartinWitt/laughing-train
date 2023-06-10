# airavata-data-catalog 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-airavata-data-catalog524983921874477689511245089814194091538/data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
currentOperator.getOperator().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-airavata-data-catalog524983921874477689511245089814194091538/data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
currentOperator.getOperator().toString()
```

