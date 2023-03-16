# auto-parallelizable 
 
# Bad smells
I found 19 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 11 | false |
| AbstractClassNeverImplemented | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| UnstableApiUsage | 2 | false |
| StaticCallOnSubclass | 1 | false |
| CodeBlock2Expr | 1 | true |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:RegexpSinglelineJava")
    static void action(Params params) {
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
    static void action(Params params) {
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
                + params.getFilesValue().getFiles().stream().map(File::getName).collect(Collectors.joining(", ")));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
                + params.getFilesValue().getFiles().stream().map(File::getName).collect(Collectors.joining(", ")));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:RegexpSinglelineJava")
    static void action(Params params, @Inject ProviderFactory providerFactory) {
        System.out.println("provider: "
                + providerFactory
                        .gradleProperty("autoparallelizable-inject-test")
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
                        .gradleProperty("autoparallelizable-inject-test")
                        .get());
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
                        .get());
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
                + params.getFilesValue().getFiles().stream().map(File::getName).collect(Collectors.joining(", ")));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
                + params.getFilesValue().getFiles().stream().map(File::getName).collect(Collectors.joining(", ")));
    }
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `get()` declared in class 'com.squareup.javapoet.TypeName' but referenced via subclass 'com.squareup.javapoet.ClassName'
in `auto-parallelizable/src/main/java/com/palantir/gradle/autoparallelizable/AutoParallelizableProcessor.java`
#### Snippet
```java
                .filter(AutoParallelizableProcessor::isInjectable)
                .map(injectable ->
                        injectMethod(ClassName.get(injectable.asType()), getMethodNameBasedOnType(injectable)))
                .collect(Collectors.toList());

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `DoItTask` has no concrete subclass
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
@AutoParallelizable
public final class DoIt {
    public abstract static class DoItTask extends DoItTaskImpl {
        public DoItTask() {
            setDescription("lol");
```

### AbstractClassNeverImplemented
Abstract class `DoItInjectedParameterTask` has no concrete subclass
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
@AutoParallelizable
public final class DoItInjectedParameter {
    public abstract static class DoItInjectedParameterTask extends DoItInjectedParameterTaskImpl {
        public DoItInjectedParameterTask() {
            setDescription("lol");
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DoItTask()` of an abstract class should not be declared 'public'
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
public final class DoIt {
    public abstract static class DoItTask extends DoItTaskImpl {
        public DoItTask() {
            setDescription("lol");
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `DoItInjectedParameterTask()` of an abstract class should not be declared 'public'
in `integ-test/src/main/java/integtest/DoItInjectedParameter.java`
#### Snippet
```java
public final class DoItInjectedParameter {
    public abstract static class DoItInjectedParameterTask extends DoItInjectedParameterTaskImpl {
        public DoItInjectedParameterTask() {
            setDescription("lol");
        }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `auto-parallelizable/src/main/java/com/palantir/gradle/autoparallelizable/AutoParallelizableProcessor.java`
#### Snippet
```java
        }

        roundEnv.getElementsAnnotatedWith(AutoParallelizable.class).forEach(element -> {
            paralleliseTask((TypeElement) element);
        });
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `auto-parallelizable/src/main/java/com/palantir/gradle/autoparallelizable/AutoParallelizableProcessor.java`
#### Snippet
```java

    private static boolean isInjectable(VariableElement parameter) {
        return MoreElements.isAnnotationPresent(parameter, AutoParallelizable.Inject.class);
    }

```

### UnstableApiUsage
'isAnnotationPresent(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `auto-parallelizable/src/main/java/com/palantir/gradle/autoparallelizable/AutoParallelizableProcessor.java`
#### Snippet
```java

    private static boolean isInjectable(VariableElement parameter) {
        return MoreElements.isAnnotationPresent(parameter, AutoParallelizable.Inject.class);
    }

```

