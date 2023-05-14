# proxy-processor 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 1 | false |
## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `methodFieldName` might be null
in `proxy-processor/src/main/java/com/palantir/proxy/processor/Methods.java`
#### Snippet
```java
            result.put(method, methodFieldName);
            typeBuilder.addField(
                    FieldSpec.builder(Method.class, methodFieldName, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                            .build());
            initializers.add(CodeBlock.builder()
```

