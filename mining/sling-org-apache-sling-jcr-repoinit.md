# sling-org-apache-sling-jcr-repoinit 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sling-org-apache-sling-jcr-repoinit48938351932808119286059948614898422978/src/test/java/org/apache/sling/jcr/repoinit/LogCapture.java`
#### Snippet
```java
this.list.toString()
```

