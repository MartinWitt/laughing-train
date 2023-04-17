# proxy-processor 
 
# Bad smells
I found 5 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| DataFlowIssue | 1 | false |
## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `proxy-processor/src/main/java/com/palantir/proxy/processor/ProxyAnnotationProcessor.java`
#### Snippet
```java
                        .build())
                .addMethod(MethodSpec.methodBuilder("create")
                        .addTypeVariables(Lists.transform(typeElement.getTypeParameters(), TypeVariableName::get))
                        .addAnnotations(
                                typeElement.getTypeParameters().isEmpty()
```

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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `elements` is accessed in both synchronized and unsynchronized contexts
in `proxy-processor/src/main/java/com/palantir/proxy/processor/ProxyAnnotationProcessor.java`
#### Snippet
```java
    private Messager messager;
    private Filer filer;
    private Elements elements;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `filer` is accessed in both synchronized and unsynchronized contexts
in `proxy-processor/src/main/java/com/palantir/proxy/processor/ProxyAnnotationProcessor.java`
#### Snippet
```java

    private Messager messager;
    private Filer filer;
    private Elements elements;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messager` is accessed in both synchronized and unsynchronized contexts
in `proxy-processor/src/main/java/com/palantir/proxy/processor/ProxyAnnotationProcessor.java`
#### Snippet
```java
    private static final ImmutableSet<String> ANNOTATIONS = ImmutableSet.of(Proxy.class.getName());

    private Messager messager;
    private Filer filer;
    private Elements elements;
```

