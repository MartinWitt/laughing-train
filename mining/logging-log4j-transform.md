# logging-log4j-transform 
 
# Bad smells
I found 9 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 2 | false |
| BoundedWildcard | 2 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| UnnecessaryModifier | 1 | true |
| ReturnNull | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationMethodVisitor.java`
#### Snippet
```java
    private final Label[] startLabels = new Label[12];
    // Next available variable index
    private int nextVariable = 0;

    private int lineNumber;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `log4j-transform-maven-shade-plugin-extensions/src/main/java/org/apache/logging/log4j/maven/plugins/shade/transformer/Log4j2PluginCacheFileTransformer.java`
#### Snippet
```java
     * Store youngest (i.e. largest millisecond) so that we can produce reproducible jar file
     */
    private long youngestTime = 0;


```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'argumentTypes' in a Serializable class
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/SupplierLambdaType.java`
#### Snippet
```java
    ENTRY_MESSAGE_STRING_SUPPLIERS(LOGGER_TYPE, STRING_TYPE, SUPPLIER_ARRAY_TYPE);

    private final Type[] argumentTypes;

    private SupplierLambdaType(final Type... argumentTypes) {
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationClassVisitor.java`
#### Snippet
```java
                ? new LocationMethodVisitor(this, Collections.unmodifiableMap(conversionHandlers), mv, access, name,
                        descriptor)
                : null;
    }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-05-01-15-32-15.916.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-weaver/src/main/java/org/apache/logging/log4j/weaver/LocationCacheGenerator.java`
#### Snippet
```java
        public int addLocation(final String internalClassName, final String methodName, final String fileName,
                final int lineNumber) {
            final StackTraceElement location = new StackTraceElement(internalClassName.replaceAll("/", "."), methodName,
                    fileName, lineNumber);
            locations.add(location);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Path`
in `log4j-transform-maven-plugin/src/main/java/org/apache/logging/log4j/transform/maven/LocationMojo.java`
#### Snippet
```java
    }

    private void convertClassfiles(List<Path> classFiles, LocationClassConverter converter,
            LocationCacheGenerator locationCache) {
        final Path sourceDirectory = this.sourceDirectory.toPath();
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `log4j-transform-maven-shade-plugin-extensions/src/main/java/org/apache/logging/log4j/maven/plugins/shade/transformer/Log4j2PluginCacheFileTransformer.java`
#### Snippet
```java

    private Relocator findFirstMatchingRelocator(final String originalClassName,
                                                 final List<Relocator> relocators) {
        Relocator result = null;
        for (final Relocator relocator : relocators) {
```

