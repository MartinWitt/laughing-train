# conjure-postman 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-conjure-postman504674084268992423716233106240001349780/conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanRequestGenerator.java`
#### Snippet
```java
endpointDefinition.getHttpMethod().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-conjure-postman504674084268992423716233106240001349780/conjure-postman-core/src/main/java/com/palantir/conjure/postman/PostmanRequestGenerator.java`
#### Snippet
```java
Paths.get(apiBaseVariable).resolve(endpointDefinition.getHttpPath().get()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-conjure-postman504674084268992423716233106240001349780/conjure-postman-core/src/main/java/com/palantir/conjure/postman/visitor/TemplateTypeVisitor.java`
#### Snippet
```java
wrapped.toString()
```

