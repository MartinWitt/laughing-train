# astor-experiments 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-astor-experiments-52512059113880383324930066967243761459/cardumen-patches/patched_programs/Chart/bug_17/patch1/org/jfree/data/time/TimeSeries.java`
#### Snippet
```java
item.getPeriod().toString()
```

