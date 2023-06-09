# keyple-distributed-local-java-lib 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-keyple-distributed-local-java-lib634894413900783312417164190226178795918/src/main/java/org/eclipse/keyple/distributed/LocalServiceClientAdapter.java`
#### Snippet
```java
parser.fromJson(message.getBody(), JsonObject.class).getAsJsonObject(JsonProperty.OUTPUT_DATA.getKey()).toString()
```

