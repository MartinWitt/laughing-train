# microprofile-metrics 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-microprofile-metrics590131210050587916515909224871631613016/tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java
given().header(acceptHeader).port(applicationPort).when().get(RESTREQUEST_METRIC_ENDPOINT).toString()
```

