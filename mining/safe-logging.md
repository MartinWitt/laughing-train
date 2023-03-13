# safe-logging 
 
# Bad smells
I found 12 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 8 | false |
| NullableProblems | 2 | false |
| ClassNameSameAsAncestorName | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Assertions` is the same as one of its superclass' names
in `preconditions-assertj/src/main/java/com/palantir/logsafe/testing/Assertions.java`
#### Snippet
```java

@CheckReturnValue
public class Assertions extends org.assertj.core.api.Assertions {
    Assertions() {}

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.logging.log4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                .addModifiers(Modifier.FINAL)
                .addSuperinterface(BRIDGE_NAME)
                .addField(FieldSpec.builder(ClassName.get(org.apache.logging.log4j.Marker.class), MARKER_FIELD)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.logging.log4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer(
                                "$T.getMarker($S)", org.apache.logging.log4j.MarkerManager.class, Safe.class.getName())
                        .build())
                .addField(FieldSpec.builder(ClassName.get(org.apache.logging.log4j.Logger.class), DELEGATE)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.logging.log4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                                "$T.getMarker($S)", org.apache.logging.log4j.MarkerManager.class, Safe.class.getName())
                        .build())
                .addField(FieldSpec.builder(ClassName.get(org.apache.logging.log4j.Logger.class), DELEGATE)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .build())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.logging.log4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                .addMethod(MethodSpec.constructorBuilder()
                        .addParameter(
                                ParameterSpec.builder(ClassName.get(org.apache.logging.log4j.Logger.class), DELEGATE)
                                        .build())
                        .addStatement(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                .addModifiers(Modifier.FINAL)
                .addSuperinterface(BRIDGE_NAME)
                .addField(FieldSpec.builder(ClassName.get(org.slf4j.Marker.class), MARKER_FIELD)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.getMarker($S)", org.slf4j.MarkerFactory.class, Safe.class.getName())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                .addField(FieldSpec.builder(ClassName.get(org.slf4j.Marker.class), MARKER_FIELD)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.getMarker($S)", org.slf4j.MarkerFactory.class, Safe.class.getName())
                        .build())
                .addField(FieldSpec.builder(ClassName.get(org.slf4j.Logger.class), DELEGATE)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                        .initializer("$T.getMarker($S)", org.slf4j.MarkerFactory.class, Safe.class.getName())
                        .build())
                .addField(FieldSpec.builder(ClassName.get(org.slf4j.Logger.class), DELEGATE)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .build())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `logger-generator/src/main/java/com/palantir/logsafe/logger/generator/LoggerGenerator.java`
#### Snippet
```java
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(ClassName.get(org.slf4j.Logger.class), DELEGATE)
                                .build())
                        .addStatement(
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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `safe-logging/src/main/java/com/palantir/logsafe/Arg.java`
#### Snippet
```java
    private final String name;

    @Nullable
    private final T value;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `safe-logging/src/main/java/com/palantir/logsafe/Arg.java`
#### Snippet
```java
public abstract class Arg<T> implements Serializable {

    @Nonnull
    private final String name;

```

