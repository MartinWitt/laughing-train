# logging-log4j-transform 
 
# Bad smells
I found 14 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 5 | true |
| FieldMayBeFinal | 5 | false |
| DuplicatedCode | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| JavadocReference | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/log4j2/LoggerConversionHandler.java`
#### Snippet
```java
        final Type[] types = Type.getArgumentTypes(descriptor);
        final int[] vars = new int[types.length];
        for (int i = vars.length - 1; i >= 0; i--) {
            vars[i] = mv.nextLocal();
            mv.storeLocal(vars[i]);
        }
        // only Logger on stack
        mv.dup();
        final int loggerIdx = mv.nextLocal();
        mv.storeLocal(loggerIdx, LOGGER_TYPE);
        mv.invokeInterface(LOGGER_TYPE, AT_TRACE_METHOD);
        mv.storeLocation();
        mv.getStatic(ABSTRACT_LOGGER_TYPE, ENTRY_MARKER, MARKER_TYPE);
        mv.invokeInterface(LOG_BUILDER_TYPE, WITH_MARKER_METHOD);
        mv.loadLocal(loggerIdx, LOGGER_TYPE);
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationClassVisitor.java`
#### Snippet
```java

    public Handle createLambda(SupplierLambdaType type) {
        switch (type) {
            case MESSAGE_SUPPLIER:
                return new Handle(Opcodes.H_INVOKEINTERFACE, MESSAGE_SUPPLIER_TYPE.getInternalName(), "get",
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/SupplierLambdaType.java`
#### Snippet
```java
    private final Type[] argumentTypes;

    private SupplierLambdaType(final Type... argumentTypes) {
        this.argumentTypes = argumentTypes;
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/scan/ClassFileInclusionScanner.java`
#### Snippet
```java
public interface ClassFileInclusionScanner {

    static final String DEFAULT_INCLUSION_PATTERN = "**/*.class";
    static final String DEFAULT_EXCLUSION_PATTERN = "**/*" + Constants.LOCATION_CACHE_SUFFIX + ".class";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/scan/ClassFileInclusionScanner.java`
#### Snippet
```java
public interface ClassFileInclusionScanner {

    static final String DEFAULT_INCLUSION_PATTERN = "**/*.class";
    static final String DEFAULT_EXCLUSION_PATTERN = "**/*" + Constants.LOCATION_CACHE_SUFFIX + ".class";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/scan/ClassFileInclusionScanner.java`
#### Snippet
```java

    static final String DEFAULT_INCLUSION_PATTERN = "**/*.class";
    static final String DEFAULT_EXCLUSION_PATTERN = "**/*" + Constants.LOCATION_CACHE_SUFFIX + ".class";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/scan/ClassFileInclusionScanner.java`
#### Snippet
```java

    static final String DEFAULT_INCLUSION_PATTERN = "**/*.class";
    static final String DEFAULT_EXCLUSION_PATTERN = "**/*" + Constants.LOCATION_CACHE_SUFFIX + ".class";

    /**
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Relocator`
in `log4j-transform-maven-shade-plugin-extensions/src/main/java/org/apache/logging/log4j/maven/plugins/shade/transformer/Log4j2PluginCacheFileTransformer.java`
#### Snippet
```java
    private final List<Path> tempFiles;
    /**
     * {@link Relocator} instances to share across the transformation stages.
     */
    private final List<Relocator> tempRelocators;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `SUPPLIER_OF_MESSAGE_TYPE` may be 'final'
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationMethodVisitor.java`
#### Snippet
```java
    // Programmatically define LAMBDA_METAFACTORY_HANDLE
    private static Type SUPPLIER_OF_OBJECT_TYPE = Type.getMethodType(OBJECT_TYPE);
    private static Type SUPPLIER_OF_MESSAGE_TYPE = Type.getMethodType(MESSAGE_TYPE);
    private static final Type LAMBDA_METAFACTORY_TYPE = Type.getType(LambdaMetafactory.class);
    private static final Type METHOD_HANDLE_TYPE = Type.getType(MethodHandle.class);
```

### FieldMayBeFinal
Field `SUPPLIER_OF_OBJECT_TYPE` may be 'final'
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationMethodVisitor.java`
#### Snippet
```java

    // Programmatically define LAMBDA_METAFACTORY_HANDLE
    private static Type SUPPLIER_OF_OBJECT_TYPE = Type.getMethodType(OBJECT_TYPE);
    private static Type SUPPLIER_OF_MESSAGE_TYPE = Type.getMethodType(MESSAGE_TYPE);
    private static final Type LAMBDA_METAFACTORY_TYPE = Type.getType(LambdaMetafactory.class);
```

### FieldMayBeFinal
Field `lambdas` may be 'final'
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationCacheGenerator.java`
#### Snippet
```java
    private static class LocationCacheContents {
        private final List<StackTraceElement> locations = new CopyOnWriteArrayList<>();
        private Set<SupplierLambdaType> lambdas = EnumSet.noneOf(SupplierLambdaType.class);

        public int addLocation(final String internalClassName, final String methodName, final String fileName,
```

### FieldMayBeFinal
Field `includes` may be 'final'
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/LocationMojo.java`
#### Snippet
```java
     */
    @Parameter
    private Set<String> includes = new HashSet<>();

    /**
```

### FieldMayBeFinal
Field `excludes` may be 'final'
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/LocationMojo.java`
#### Snippet
```java
     */
    @Parameter
    private Set<String> excludes = new HashSet<>();

    /**
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `excludes` are queried, but never updated
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/LocationMojo.java`
#### Snippet
```java
     */
    @Parameter
    private Set<String> excludes = new HashSet<>();

    /**
```

