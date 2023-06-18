# volley 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-volley-54190618068817488252329688021737717866/core/src/main/java/com/android/volley/toolbox/ImageLoader.java`
#### Snippet
```java
new StringBuilder(url.length() + 12).append("#W").append(maxWidth).append("#H").append(maxHeight).append("#S").append(scaleType.ordinal()).append(url).toString()
```

