# safe-logging 
 
# Bad smells
I found 9 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 3 | false |
| DataFlowIssue | 2 | false |
| NullableProblems | 2 | false |
| Deprecation | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
            MethodSpec.Builder methodBuilder = spec.toBuilder();
            methodBuilder.modifiers.clear();
            boolean isVoidMethod = ClassName.VOID.equals(spec.returnType);
            boolean hasArgList = hasArgList(spec);
            boolean hasThrowableArg = hasThrowableArg(spec);
            CodeBlock args = Stream.concat(
                            Stream.of(CodeBlock.of("$N", MARKER_FIELD)),
                            spec.parameters.stream().flatMap(param -> {
                                if (hasArgList && ARGS_LIST_TYPE.equals(param.type)) {
                                    if (hasThrowableArg) {
                                        return Stream.of(CodeBlock.of("merge($N, $N)", param.name, THROWABLE_NAME));
                                    } else {
                                        return Stream.of(
                                                CodeBlock.of("$N.toArray(new $T[0])", param.name, Object.class));
                                    }
                                } else if (hasThrowableArg && hasArgList && THROWABLE_TYPE.equals(param.type)) {
                                    return Stream.empty();
                                }
                                return Stream.of(CodeBlock.of("$N", param.name));
                            }))
                    .collect(CodeBlock.joining(", "));
            methodBuilder.addAnnotation(Override.class).addModifiers(Modifier.PUBLIC);
```

### DuplicatedCode
Duplicated code
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
            if (requiresLevelCheck) {
                methodBuilder.beginControlFlow(
                        "if ($N())",
                        LoggerLevel.valueOf(spec.name.toUpperCase(Locale.ENGLISH))
                                .isEnabled());
            }
            methodBuilder.addStatement("$L$N.$N($L)", isVoidMethod ? "" : "return ", DELEGATE, spec.name, args);
            if (requiresLevelCheck) {
                methodBuilder.endControlFlow();
            }
            loggerBuilder.addMethod(methodBuilder.build());
```

### DuplicatedCode
Duplicated code
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                        loggerBuilder
                                .addMethod(MethodSpec.methodBuilder("merge")
                                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                                        .returns(ArrayTypeName.of(Object.class))
                                        .addParameter(ParameterSpec.builder(ARGS_LIST_TYPE, "args")
                                                .build())
                                        .addParameter(ParameterSpec.builder(THROWABLE_TYPE, THROWABLE_NAME)
                                                .build())
                                        .addStatement(
                                                "$1T $2N = $3N.toArray(new $4T[$3N.size() + 1])",
                                                ArrayTypeName.of(Object.class),
                                                "result",
                                                "args",
                                                Object.class)
                                        .addStatement("$1N[$1N.length - 1] = $2N", "result", THROWABLE_NAME)
                                        .addStatement("return $N", "result")
                                        .build())
                                .build())
```

## RuleId[id=Deprecation]
### Deprecation
'areEqual(java.lang.Object, java.lang.Object)' is deprecated
in `preconditions-assertj/src/main/java/com/palantir/logsafe/testing/LoggableExceptionAssert.java`
#### Snippet
```java

        String actualMessage = actual.getLogMessage();
        if (!Objects.areEqual(actualMessage, logMessage)) {
            throw new AssertionError(String.format(
                    "Expecting safe logging message:%n <%s>%nbut was:%n <%s>", logMessage, actualMessage));
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `cause` might be null
in `preconditions/src/main/java/com/palantir/logsafe/exceptions/SafeUncheckedIoException.java`
#### Snippet
```java

    public SafeUncheckedIoException(@Nullable IOException cause) {
        super("", cause);
        this.logMessage = "";
        this.arguments = Collections.emptyList();
```

### DataFlowIssue
Argument `cause` might be null
in `preconditions/src/main/java/com/palantir/logsafe/exceptions/SafeUncheckedIoException.java`
#### Snippet
```java
    public SafeUncheckedIoException(
            @CompileTimeConstant String message, @Nullable IOException cause, Arg<?>... arguments) {
        super(SafeExceptions.renderMessage(message, arguments), cause);
        this.logMessage = message;
        this.arguments = Collections.unmodifiableList(Arrays.asList(arguments));
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'hasArgs' is still used
in `preconditions-assertj/src/main/java/com/palantir/logsafe/testing/LoggableExceptionAssert.java`
#### Snippet
```java
     */
    @Deprecated
    public LoggableExceptionAssert<T> hasArgs(Arg<?>... args) {
        return containsArgs(args);
    }
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `safe-logging/src/main/java/com/palantir/logsafe/Arg.java`
#### Snippet
```java
public abstract class Arg<T> implements Serializable {

    @Nonnull
    private final String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `safe-logging/src/main/java/com/palantir/logsafe/Arg.java`
#### Snippet
```java
    private final String name;

    @Nullable
    private final T value;

```

