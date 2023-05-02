# incubator-paimon-presto 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 19 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| Deprecation | 1 | false |
| DataFlowIssue | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
            @JsonProperty("serializedTable") byte[] serializedTable,
            @JsonProperty("filter") TupleDomain<PrestoColumnHandle> filter,
            @JsonProperty("projection") Optional<List<ColumnHandle>> projectedColumns) {
        this.schemaName = schemaName;
        this.tableName = tableName;
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoMetadata.java`
#### Snippet
```java
    private List<String> getPartitionedKeys(Map<String, Object> tableProperties) {
        List<String> partitionedKeys =
                (List<String>) tableProperties.get(CoreOptions.PARTITION.key());
        return partitionedKeys == null ? ImmutableList.of() : ImmutableList.copyOf(partitionedKeys);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoMetadata.java`
#### Snippet
```java
    private List<String> getPrimaryKeys(Map<String, Object> tableProperties) {
        List<String> primaryKeys =
                (List<String>) tableProperties.get(CoreOptions.PRIMARY_KEY.key());
        return primaryKeys == null ? ImmutableList.of() : ImmutableList.copyOf(primaryKeys);
    }
```

## RuleId[id=Deprecation]
### Deprecation
'getLength()' is deprecated
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (prestoType instanceof VarcharType) {
            return DataTypes.VARCHAR(
                    Math.min(Integer.MAX_VALUE, ((VarcharType) prestoType).getLength()));
        } else if (prestoType instanceof com.facebook.presto.common.type.BooleanType) {
            return DataTypes.BOOLEAN();
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

## RuleId[id=ConstantValue]
### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
                            com.facebook.presto.common.type.CharType.MAX_LENGTH,
                            ((CharType) paimonType).getLength()));
        } else if (paimonType instanceof VarCharType) {
            return VarcharType.createUnboundedVarcharType();
        } else if (paimonType instanceof BooleanType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof VarCharType) {
            return VarcharType.createUnboundedVarcharType();
        } else if (paimonType instanceof BooleanType) {
            return com.facebook.presto.common.type.BooleanType.BOOLEAN;
        } else if (paimonType instanceof BinaryType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof BooleanType) {
            return com.facebook.presto.common.type.BooleanType.BOOLEAN;
        } else if (paimonType instanceof BinaryType) {
            return VarbinaryType.VARBINARY;
        } else if (paimonType instanceof VarBinaryType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof BinaryType) {
            return VarbinaryType.VARBINARY;
        } else if (paimonType instanceof VarBinaryType) {
            return VarbinaryType.VARBINARY;
        } else if (paimonType instanceof DecimalType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof VarBinaryType) {
            return VarbinaryType.VARBINARY;
        } else if (paimonType instanceof DecimalType) {
            return com.facebook.presto.common.type.DecimalType.createDecimalType(
                    ((DecimalType) paimonType).getPrecision(),
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
                    ((DecimalType) paimonType).getPrecision(),
                    ((DecimalType) paimonType).getScale());
        } else if (paimonType instanceof TinyIntType) {
            return TinyintType.TINYINT;
        } else if (paimonType instanceof SmallIntType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof TinyIntType) {
            return TinyintType.TINYINT;
        } else if (paimonType instanceof SmallIntType) {
            return SmallintType.SMALLINT;
        } else if (paimonType instanceof IntType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof SmallIntType) {
            return SmallintType.SMALLINT;
        } else if (paimonType instanceof IntType) {
            return IntegerType.INTEGER;
        } else if (paimonType instanceof BigIntType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof IntType) {
            return IntegerType.INTEGER;
        } else if (paimonType instanceof BigIntType) {
            return BigintType.BIGINT;
        } else if (paimonType instanceof FloatType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof BigIntType) {
            return BigintType.BIGINT;
        } else if (paimonType instanceof FloatType) {
            return RealType.REAL;
        } else if (paimonType instanceof DoubleType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof FloatType) {
            return RealType.REAL;
        } else if (paimonType instanceof DoubleType) {
            return com.facebook.presto.common.type.DoubleType.DOUBLE;
        } else if (paimonType instanceof DateType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof DoubleType) {
            return com.facebook.presto.common.type.DoubleType.DOUBLE;
        } else if (paimonType instanceof DateType) {
            return com.facebook.presto.common.type.DateType.DATE;
        } else if (paimonType instanceof TimeType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof DateType) {
            return com.facebook.presto.common.type.DateType.DATE;
        } else if (paimonType instanceof TimeType) {
            return com.facebook.presto.common.type.TimeType.TIME;
        } else if (paimonType instanceof TimestampType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof TimeType) {
            return com.facebook.presto.common.type.TimeType.TIME;
        } else if (paimonType instanceof TimestampType) {
            return com.facebook.presto.common.type.TimestampType.TIMESTAMP;
        } else if (paimonType instanceof LocalZonedTimestampType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof TimestampType) {
            return com.facebook.presto.common.type.TimestampType.TIMESTAMP;
        } else if (paimonType instanceof LocalZonedTimestampType) {
            return TimestampWithTimeZoneType.TIMESTAMP_WITH_TIME_ZONE;
        } else if (paimonType instanceof ArrayType) {
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else if (paimonType instanceof LocalZonedTimestampType) {
            return TimestampWithTimeZoneType.TIMESTAMP_WITH_TIME_ZONE;
        } else if (paimonType instanceof ArrayType) {
            DataType elementType = ((ArrayType) paimonType).getElementType();
            return new com.facebook.presto.common.type.ArrayType(
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
            return new com.facebook.presto.common.type.ArrayType(
                    Objects.requireNonNull(toPrestoType(elementType, typeManager)));
        } else if (paimonType instanceof MapType) {
            MapType paimonMapType = (MapType) paimonType;
            TypeSignature keyType =
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
                            TypeSignatureParameter.of(keyType),
                            TypeSignatureParameter.of(valueType)));
        } else if (paimonType instanceof RowType) {
            RowType rowType = (RowType) paimonType;
            List<com.facebook.presto.common.type.RowType.Field> fields =
```

### ConstantValue
Value `paimonType` is always 'null'
in `paimon-presto-common/src/main/java/org/apache/paimon/presto/PrestoTypeUtils.java`
#### Snippet
```java
        } else {
            throw new UnsupportedOperationException(
                    format("Cannot convert from Paimon type '%s' to Presto type", paimonType));
        }
    }
```

