# incubator-paimon-presto 
 
# Bad smells
I found 22 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalContainsCollection | 5 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| ReturnNull | 3 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| NonProtectedConstructorInAbstractClass | 3 | true |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DataFlowIssue | 1 | false |
| NestedAssignment | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoPageSourceBase.java`
#### Snippet
```java
    private final List<DataType> paimonColumnTypes;

    private boolean isFinished = false;

    public PrestoPageSourceBase(
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'projectedColumns'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java
            @JsonProperty("serializedTable") byte[] serializedTable,
            @JsonProperty("filter") TupleDomain<PrestoColumnHandle> filter,
            @JsonProperty("projection") Optional<List<ColumnHandle>> projectedColumns) {
        this.schemaName = schemaName;
        this.tableName = tableName;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'projectedColumns'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java
    private final byte[] serializedTable;
    private final TupleDomain<PrestoColumnHandle> filter;
    private final Optional<List<ColumnHandle>> projectedColumns;

    private Table lazyTable;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'projectedColumns'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java
    }

    public PrestoTableHandle copy(Optional<List<ColumnHandle>> projectedColumns) {
        return new PrestoTableHandle(
                schemaName, tableName, serializedTable, filter, projectedColumns);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoMetadata.java`
#### Snippet
```java
            serializedTable = InstantiationUtil.serializeObject(catalog.getTable(tablePath));
        } catch (Catalog.TableNotExistException e) {
            return null;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
```

### ReturnNull
Return of `null`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoMetadata.java`
#### Snippet
```java
            ConnectorTableMetadata tableMetadata,
            Optional<ConnectorNewTableLayout> layout) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoPageSourceBase.java`
#### Snippet
```java
        if (batch == null) {
            isFinished = true;
            return null;
        }
        InternalRow row;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-23-03-10-14.320.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FieldNameUtils` has only 'static' members, and lacks a 'private' constructor
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/FieldNameUtils.java`
#### Snippet
```java

/** Utils for fieldName. */
public class FieldNameUtils {

    public static List<String> fieldNames(RowType rowType) {
```

### UtilityClassWithoutPrivateConstructor
Class `ClassLoaderUtils` has only 'static' members, and lacks a 'private' constructor
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/ClassLoaderUtils.java`
#### Snippet
```java

/** Utils for {@link ClassLoader}. */
public class ClassLoaderUtils {

    public static <T> T runWithContextClassLoader(Supplier<T> supplier, ClassLoader classLoader) {
```

### UtilityClassWithoutPrivateConstructor
Class `EncodingUtils` has only 'static' members, and lacks a 'private' constructor
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/EncodingUtils.java`
#### Snippet
```java

/** Utils for encoding. */
public class EncodingUtils {

    private static final Base64.Encoder BASE64_ENCODER = Base64.getUrlEncoder().withoutPadding();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Result of 'min' is the same as the second argument making the call meaningless
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (prestoType instanceof VarcharType) {
            return DataTypes.VARCHAR(
                    Math.min(Integer.MAX_VALUE, ((VarcharType) prestoType).getLength()));
        } else if (prestoType instanceof com.facebook.presto.common.type.BooleanType) {
            return DataTypes.BOOLEAN();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoPageSourceBase.java`
#### Snippet
```java
        }
        InternalRow row;
        while ((row = batch.next()) != null) {
            pageBuilder.declarePosition();
            for (int i = 0; i < prestoColumnTypes.size(); i++) {
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Set`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoMetadata.java`
#### Snippet
```java
            ConnectorTableHandle table,
            Constraint<ColumnHandle> constraint,
            Optional<Set<ColumnHandle>> desiredColumns) {
        PrestoTableHandle handle = (PrestoTableHandle) table;
        ConnectorTableLayout layout =
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java
            @JsonProperty("serializedTable") byte[] serializedTable,
            @JsonProperty("filter") TupleDomain<PrestoColumnHandle> filter,
            @JsonProperty("projection") Optional<List<ColumnHandle>> projectedColumns) {
        this.schemaName = schemaName;
        this.tableName = tableName;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java
    private final byte[] serializedTable;
    private final TupleDomain<PrestoColumnHandle> filter;
    private final Optional<List<ColumnHandle>> projectedColumns;

    private Table lazyTable;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java
    }

    public PrestoTableHandle copy(Optional<List<ColumnHandle>> projectedColumns) {
        return new PrestoTableHandle(
                schemaName, tableName, serializedTable, filter, projectedColumns);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTableHandle.java`
#### Snippet
```java

    @JsonProperty
    public Optional<List<ColumnHandle>> getProjectedColumns() {
        return projectedColumns;
    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `PrestoConnectorBase()` of an abstract class should not be declared 'public'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoConnectorBase.java`
#### Snippet
```java
    private final PrestoMetadataFactory prestoMetadataFactory;

    public PrestoConnectorBase(
            PrestoTransactionManager transactionManager,
            PrestoSplitManager prestoSplitManager,
```

### NonProtectedConstructorInAbstractClass
Constructor `PrestoSplitBase()` of an abstract class should not be declared 'public'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoSplitBase.java`
#### Snippet
```java

    @JsonCreator
    public PrestoSplitBase(@JsonProperty("splitSerialized") String splitSerialized) {
        this.splitSerialized = splitSerialized;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PrestoPageSourceBase()` of an abstract class should not be declared 'public'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoPageSourceBase.java`
#### Snippet
```java
    private boolean isFinished = false;

    public PrestoPageSourceBase(
            RecordReader<InternalRow> reader, List<ColumnHandle> projectedColumns) {
        this.reader = reader;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
                                            new DataField(
                                                    id.getAndIncrement(),
                                                    field.getName().get(),
                                                    toPaimonType(field.getType())))
                            .collect(Collectors.toList());
```

