# spring-cloud-azure 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-spring-cloud-azure-85200664082567259841357754420619994314/spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
resource.getURL().toString()
```

