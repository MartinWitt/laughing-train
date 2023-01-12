# auto-parallelizable 
 
# Bad smells
I found 8 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 5 | false |
| AbstractClassNeverImplemented | 1 | false |
| CodeBlock2Expr | 1 | true |
| NonProtectedConstructorInAbstractClass | 1 | true |
## RuleId[ruleID=SystemOutErr]
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

## RuleId[ruleID=AbstractClassNeverImplemented]
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

## RuleId[ruleID=CodeBlock2Expr]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
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

