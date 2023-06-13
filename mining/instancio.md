# instancio 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-instancio-790894099775901028415830304840280641192/instancio-tests/feature-tests/src/test/java/org/instancio/test/features/values/AbstractNumberSpecTestTemplate.java`
#### Snippet
```java
range.getLeft().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-instancio-790894099775901028415830304840280641192/instancio-tests/feature-tests/src/test/java/org/instancio/test/features/values/AbstractNumberSpecTestTemplate.java`
#### Snippet
```java
range.getRight().toString()
```

