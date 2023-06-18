# keyple-distributed-remote-java-lib 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-keyple-distributed-remote-java-lib-892430606145438506516966079308657608220/src/main/java/org/eclipse/keyple/distributed/ObservableRemotePluginServerAdapter.java`
#### Snippet
```java
body.getAsJsonObject(JsonProperty.INITIAL_CARD_CONTENT.getKey()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-keyple-distributed-remote-java-lib-892430606145438506516966079308657608220/src/main/java/org/eclipse/keyple/distributed/ObservableRemotePluginServerAdapter.java`
#### Snippet
```java
body.getAsJsonObject(JsonProperty.INPUT_DATA.getKey()).toString()
```

