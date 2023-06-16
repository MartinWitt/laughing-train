# jakarta-package-alignment 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-jakarta-package-alignment-269035838171990135418123125720213727443/jakarta-package-alignment/src/main/java/com/palantir/gradle/jakartapackagealignment/JakartaPackageAlignmentPlugin.java`
#### Snippet
```java
replacement.toString()
```

