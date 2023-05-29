# auto-parallelizable 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 4 | false |
| DuplicatedCode | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `integ-test/src/main/java/integtest/DoIt.java`
#### Snippet
```java
        System.out.println("string: " + params.getStringValue().get());
        System.out.println("file: " + params.getFileValue().get().getAsFile().getName());
        System.out.println("dir: " + params.getDirValue().get().getAsFile().getName());
        System.out.println("ints: " + params.getIntsValue().get());
        System.out.println("files: "
                + params.getFilesValue().getFiles().stream().map(File::getName).collect(Collectors.joining(", ")));
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `integ-test/src/main/java/integtest/DoItNested.java`
#### Snippet
```java
                + params.getNestedProperties().getSetProperty().get().stream()
                        .findFirst()
                        .get()
                        .getStringValue()
                        .get());
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

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `auto-parallelizable/src/main/java/com/palantir/gradle/autoparallelizable/AutoParallelizableProcessor.java`
#### Snippet
```java

    private static boolean isNested(Element element) {
        return MoreElements.isAnnotationPresent(element, "org.gradle.api.tasks.Nested");
    }

```

### UnstableApiUsage
'isAnnotationPresent(javax.lang.model.element.Element, java.lang.String)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `auto-parallelizable/src/main/java/com/palantir/gradle/autoparallelizable/AutoParallelizableProcessor.java`
#### Snippet
```java

    private static boolean isNested(Element element) {
        return MoreElements.isAnnotationPresent(element, "org.gradle.api.tasks.Nested");
    }

```

