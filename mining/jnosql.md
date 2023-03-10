# jnosql 
 
# Bad smells
I found 346 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantClassCall | 170 | false |
| BoundedWildcard | 46 | false |
| UnnecessaryFullyQualifiedName | 22 | false |
| TypeParameterHidesVisibleType | 13 | false |
| RedundantImplements | 13 | false |
| MissortedModifiers | 10 | false |
| ReturnNull | 10 | false |
| EmptyMethod | 9 | false |
| UnnecessaryLocalVariable | 9 | true |
| RedundantMethodOverride | 8 | false |
| CallToStringConcatCanBeReplacedByOperator | 7 | false |
| UnnecessaryModifier | 5 | true |
| OptionalGetWithoutIsPresent | 3 | false |
| OptionalIsPresent | 2 | false |
| DataFlowIssue | 2 | false |
| OptionalContainsCollection | 2 | false |
| RedundantComparatorComparing | 2 | false |
| Java9UndeclaredServiceUsage | 2 | false |
| UnnecessarySemicolon | 1 | false |
| Convert2MethodRef | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| ExtendsAnnotation | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| PointlessBooleanExpression | 1 | true |
| ConstantValue | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/InsertQueryParser.java`
#### Snippet
```java
            throw new QueryException("To run a query with a parameter use a PrepareStatement instead.");
        }
        if (ttl.isPresent()) {
            return Stream.of(manager.insert(entity, ttl.get()));
        } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/InsertQueryParser.java`
#### Snippet
```java
            throw new QueryException("To run a query with a parameter use a PrepareStatement instead.");
        }
        if (ttl.isPresent()) {
            return Stream.of(collectionManager.insert(entity, ttl.get()));
        } else {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
public class StreamTypeReferenceReader implements TypeReferenceReader {

    private static final transient ValueReader SERVICE_PROVIDER = ValueReaderDecorator.getInstance();

    @Override
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java
public class OptionalTypeReferenceReader implements TypeReferenceReader {

    private static final transient ValueReader SERVICE_PROVIDER = ValueReaderDecorator.getInstance();

    @Override
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
public class NavigableSetTypeReferenceReader implements TypeReferenceReader {

    private static final transient ValueReader SERVICE_PROVIDER = ValueReaderDecorator.getInstance();

    @Override
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
public class QueueTypeReferenceReader implements TypeReferenceReader {

    private static final transient ValueReader SERVICE_PROVIDER = ValueReaderDecorator.getInstance();

    @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Column.java`
#### Snippet
```java
     * @see Columns
     */
    public static <V> Column of(String name, V value) {
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(value, "value is required");
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/ValueType.java`
#### Snippet
```java
     * In computer science, a Boolean is a logical data type that can have only the values true or false
     */
    BOOLEAN;
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `RepositoryReturn.class::isInstance` is redundant and can be replaced with a null check
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturnConverter.java`
#### Snippet
```java
                .stream()
                .map(ServiceLoader.Provider::get)
                .filter(RepositoryReturn.class::isInstance)
                .map(RepositoryReturn.class::cast)
                .filter(r -> r.isCompatible(typeClass, returnType))
```

### DataFlowIssue
Unboxing of `bool` may produce `NullPointerException`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java

        if (isAtomicBoolean) {
            return (T) new AtomicBoolean(bool);
        }
        return (T) bool;
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/util/ParamsBinder.java`
#### Snippet
```java
            if (value instanceof Iterable) {
                List<Object> values = new ArrayList<>();
                for (Object item : Iterable.class.cast(value)) {
                    values.add(ConverterUtil.getValue(item, converters, field));
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphQueryMethod.java`
#### Snippet
```java
    public Object getValue(String name, QueryValue<?> value) {
        if (value instanceof BooleanQueryValue) {
            return BooleanQueryValue.class.cast(value).get();
        }
        return ConverterUtil.getValue(getValue(), mapping, name, converters);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        boolean isAtomicBoolean = AtomicBoolean.class.equals(type);

        if (isAtomicBoolean && AtomicBoolean.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        }
        Boolean bool = null;
        if (Boolean.class.isInstance(value)) {
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        Boolean bool = null;
        if (Boolean.class.isInstance(value)) {
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        if (Boolean.class.isInstance(value)) {
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
        } else if (String.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
        } else if (String.class.isInstance(value)) {
            bool = Boolean.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
        } else if (String.class.isInstance(value)) {
            bool = Boolean.valueOf(value.toString());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Date.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (Character.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Character.valueOf((char) Number.class.cast(value).intValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Character.valueOf((char) Number.class.cast(value).intValue());
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return (List.class.equals(parameterizedType.getRawType())
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
                    || Iterable.class.equals(parameterizedType.getRawType())
                    || Collection.class.equals(parameterizedType.getRawType())) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toList());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (AtomicInteger.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicInteger(Number.class.cast(value).intValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicInteger(Number.class.cast(value).intValue());
        } else {
            return (T) new AtomicInteger(Integer.parseInt(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (LocalDateTime.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (AtomicLong.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicLong(Number.class.cast(value).longValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicLong(Number.class.cast(value).longValue());
        } else {
            return (T) new AtomicLong(Long.parseLong(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NumberReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (Number.class.isInstance(value)) {
            return (T) value;
        } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/IntegerReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Integer.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/IntegerReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Integer.valueOf(Number.class.cast(value).intValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/IntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Integer.valueOf(Number.class.cast(value).intValue());
        } else {
            return (T) Integer.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Stream.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java

            return Stream.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (BigInteger.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) BigInteger.valueOf(Number.class.cast(value).longValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) BigInteger.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) BigInteger.valueOf(Long.parseLong(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ShortReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Short.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ShortReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Short.valueOf(Number.class.cast(value).shortValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ShortReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Short.valueOf(Number.class.cast(value).shortValue());
        } else {
            return (T) Short.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (BigDecimal.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) BigDecimal.valueOf(Number.class.cast(value).doubleValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) BigDecimal.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) BigDecimal.valueOf(Double.parseDouble(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Double.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Double.valueOf(Number.class.cast(value).doubleValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Double.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) Double.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (LocalTime.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Optional.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java

            return Optional.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java

        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        return (T) Optional.ofNullable(SERVICE_PROVIDER.read(classType, value));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Calendar.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis( ((Number) value).longValue());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date)value);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StringReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (CharSequence.class.equals(type) && CharSequence.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            Type collectionType = parameterizedType.getRawType();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
                    ||
                    SortedSet.class.equals(collectionType));
            boolean isElementCompatible = Class.class.isInstance(elementType)
                    && Comparable.class.isAssignableFrom((Class<?>) elementType);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(Collectors.toCollection(TreeSet::new));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java

    private OffsetTime getOffSetDateTime(Object value) {
        if (OffsetTime.class.isInstance(value)) {
            return OffsetTime.class.cast(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
    private OffsetTime getOffSetDateTime(Object value) {
        if (OffsetTime.class.isInstance(value)) {
            return OffsetTime.class.cast(value);
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return ((Calendar) value).toInstant().atZone(ZoneId.systemDefault())
                    .toOffsetDateTime().toOffsetTime();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return ((Date) value).toInstant().atZone(ZoneId.systemDefault())
                    .toOffsetDateTime()
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault())
                    .toOffsetDateTime()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toSet());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Set.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java

            return Set.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Float.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Float.valueOf(Number.class.cast(value).floatValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Float.valueOf(Number.class.cast(value).floatValue());
        } else {
            return (T) Float.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (LocalDate.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Year.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
        List<Enum> elements = getEnumList((Class<Enum>) type);

        if (Number.class.isInstance(value)) {
            int index = Number.class.cast(value).intValue();
            return (T) elements.stream().filter(element -> element.ordinal() == index).findFirst()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java

        if (Number.class.isInstance(value)) {
            int index = Number.class.cast(value).intValue();
            return (T) elements.stream().filter(element -> element.ordinal() == index).findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("There is not index in enum to value: " + index));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Byte.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Byte.valueOf(Number.class.cast(value).byteValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Byte.valueOf(Number.class.cast(value).byteValue());
        } else {
            return (T) Byte.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Long.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Long.valueOf(Number.class.cast(value).longValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Long.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) Long.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (ZonedDateTime.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java

    private OffsetDateTime getOffSetDateTime(Object value) {
        if (OffsetDateTime.class.isInstance(value)) {
            return OffsetDateTime.class.cast(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
    private OffsetDateTime getOffSetDateTime(Object value) {
        if (OffsetDateTime.class.isInstance(value)) {
            return OffsetDateTime.class.cast(value);
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            boolean isCollectionRight = Queue.class.equals(parameterizedType.getRawType())
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
                    || Deque.class.equals(parameterizedType.getRawType());
            return isCollectionRight &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(Collectors.toCollection(LinkedList::new));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearMonthReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (YearMonth.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Optional.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java

    private void convertEntryToMap(Object value, Map<String, Object> map) {
        Entry entry = Entry.class.cast(value);
        Object entryValue = entry.value().get();
        if (entryValue instanceof Entry) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
        if (entryValue instanceof Entry) {
            Map<String, Object> subMap = new HashMap<>();
            Entry subEntry = Entry.class.cast(entryValue);
            convertEntryToMap(subEntry, subMap);
            map.put(entry.name(), subMap);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> keyType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        Class<?> valueType = (Class<?>) Optional.of(parameterizedType.getActualTypeArguments()[1])
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Map.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java

            return Map.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0])
                    && Class.class.isInstance(parameterizedType.getActualTypeArguments()[1]);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
            return Map.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0])
                    && Class.class.isInstance(parameterizedType.getActualTypeArguments()[1]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java

    private <K, V> Map<K, V> convertToMap(Class<K> keyClass, Class<V> valueClass, Object value) {
        Map mapValue = Map.class.cast(value);
        return (Map<K, V>) mapValue.keySet().stream()
                .collect(Collectors.toMap(mapKeyElement(keyClass), mapValueElement(valueClass, mapValue)));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    private <K, V> Map<K, V> getMap(Class<K> keyClass, Class<V> valueClass, Object value) {

        if (Map.class.isInstance(value)) {
            return convertToMap(keyClass, valueClass, value);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
            return convertToMap(keyClass, valueClass, value);
        }
        if (Iterable.class.isInstance(value)) {
            List<Object> collection = new ArrayList<>();
            Iterable.class.cast(value).forEach(collection::add);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            List<Object> collection = new ArrayList<>();
            Iterable.class.cast(value).forEach(collection::add);
            if (collection.isEmpty()) {
                return Collections.emptyMap();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java

    private static Object executeConvert(Params parameters, Object[] params) {
        Object value = get(QueryValue.class.cast(params[0]), parameters);
        return Value.of(value)
                .get((Class<?>) params[1]);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
                return value.get();
            case PARAMETER:
                return parameters.add(ParamQueryValue.class.cast(value).get());
            case ARRAY:
                return Stream.of(ArrayQueryValue.class.cast(value).get())
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
                return parameters.add(ParamQueryValue.class.cast(value).get());
            case ARRAY:
                return Stream.of(ArrayQueryValue.class.cast(value).get())
                        .map(v -> get(v, parameters))
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
                        .collect(toList());
            case FUNCTION:
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
                throw new QueryException(message);
            case JSON:
                return JSONQueryValue.class.cast(value).get().toString();
            case CONDITION:
            default:
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
        Object result = get(value, parameters);
        if (result instanceof Value) {
            return Value.class.cast(result);
        }
        return Value.of(result);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/KeyValueEntity.java`
#### Snippet
```java
    private static Value getValue(Object value) {
        if (value instanceof Value) {
            return Value.class.cast(value);
        }
        return Value.of(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/KeyValueEntity.java`
#### Snippet
```java
    private static Object getKey(Object key) {
        if (key instanceof Value) {
            return Value.class.cast(key).get();
        }
        return key;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                                parameters)));
            case NOT:
                return getCondition(ConditionQueryValue.class.cast(condition.value()).get().get(0),
                        parameters, observer,
                        entity).negate();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                        entity).negate();
            case OR:
                return ColumnCondition.or(ConditionQueryValue.class.cast(condition.value())
                        .get()
                        .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                        .toArray(ColumnCondition[]::new));
            case AND:
                return ColumnCondition.and(ConditionQueryValue.class.cast(condition.value())
                        .get()
                        .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java

        if (value instanceof Map) {
            List list = Columns.of((Map.class.cast(value)));
            if(list.size() == 1) {
                return list.get(0);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Columns::getValue).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Column.java`
#### Snippet
```java
    private static Value getValue(Object value) {
        if (value instanceof Value) {
            return Value.class.cast(value);
        } else {
            return Value.of(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
                return value.get();
            case PARAMETER:
                return parameters.add(ParamQueryValue.class.cast(value).get());
            case ARRAY:
                return Stream.of(ArrayQueryValue.class.cast(value).get())
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
                return parameters.add(ParamQueryValue.class.cast(value).get());
            case ARRAY:
                return Stream.of(ArrayQueryValue.class.cast(value).get())
                        .map(v -> get(v, parameters))
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
                        .collect(toList());
            case FUNCTION:
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
                Object[] params = function.params();
                if ("convert".equals(name)) {
                    return Value.of(get(QueryValue.class.cast(params[0]), parameters))
                            .get((Class<?>) params[1]);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
                throw new QueryException(message);
            case JSON:
                return JsonObjects.getColumns(JSONQueryValue.class.cast(value).get());
            case CONDITION:
            default:
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java

    private static void checkBetweenClause(Object value) {
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
            if (count != 2) {
                throw new IllegalArgumentException("On ColumnCondition#between you must use an iterable" +
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
    private Object convert(Object value) {
        if (value instanceof Column) {
            Column column = Column.class.cast(value);
            return Collections.singletonMap(column.name(), convert(column.get()));
        } else if (value instanceof Iterable) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
        } else if (value instanceof Iterable) {
            List<Object> list = new ArrayList<>();
            Iterable.class.cast(value).forEach(e -> list.add(convert(e)));
            return list;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractWhereSupplier.java`
#### Snippet
```java

        if (operator.equals(this.condition.condition())) {
            ConditionQueryValue conditionValue = ConditionQueryValue.class.cast(this.condition.value());
            List<QueryCondition> conditions = new ArrayList<>(conditionValue.get());
            conditions.add(newCondition);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractWhereSupplier.java`
#### Snippet
```java
            this.condition = new DefaultQueryCondition("_" + operator.name(), operator, ConditionQueryValue.of(conditions));
        } else {
            List<QueryCondition> conditions = ConditionQueryValue.class.cast(this.condition.value()).get();
            QueryCondition lastCondition = conditions.get(conditions.size() - 1);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractWhereSupplier.java`
#### Snippet
```java
            if (isAppendable(lastCondition) && operator.equals(lastCondition.condition())) {
                List<QueryCondition> lastConditions = new ArrayList<>(ConditionQueryValue.class
                        .cast(lastCondition.value()).get());
                lastConditions.add(newCondition);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java

        if (operator.equals(this.condition.condition())) {
            ConditionQueryValue conditionValue = ConditionQueryValue.class.cast(this.condition.value());
            List<QueryCondition> conditions = new ArrayList<>(conditionValue.get());
            conditions.add(newCondition);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
            this.condition = new MethodCondition(SUB_ENTITY_FLAG + operator.name(), operator, ConditionQueryValue.of(conditions));
        } else {
            List<QueryCondition> conditions = ConditionQueryValue.class.cast(this.condition.value()).get();
            QueryCondition lastCondition = conditions.get(conditions.size() - 1);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java

            if (isAppendable(lastCondition) && Condition.EQUALS.equals(lastCondition.condition())) {
                List<QueryCondition> lastConditions = new ArrayList<>(ConditionQueryValue.class.cast(lastCondition.value()).get());
                lastConditions.add(newCondition);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
                        Values.get(condition.value(), parameters)));
            case NOT:
                return getCondition(ConditionQueryValue.class.cast(condition.value()).get().get(0),
                        parameters, observer,
                        entity).negate();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
                        entity).negate();
            case OR:
                return or(ConditionQueryValue.class.cast(condition.value())
                        .get()
                        .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
                        .toArray(DocumentCondition[]::new));
            case AND:
                return and(ConditionQueryValue.class.cast(condition.value())
                        .get()
                        .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Document.java`
#### Snippet
```java
    private static Value getValue(Object value) {
        if (value instanceof Value) {
            return Value.class.cast(value);
        } else {
            return Value.of(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
                return value.get();
            case PARAMETER:
                return parameters.add(ParamQueryValue.class.cast(value).get());
            case ARRAY:
                return Stream.of(ArrayQueryValue.class.cast(value).get())
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
                return parameters.add(ParamQueryValue.class.cast(value).get());
            case ARRAY:
                return Stream.of(ArrayQueryValue.class.cast(value).get())
                        .map(v -> get(v, parameters))
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
                        .collect(toList());
            case FUNCTION:
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
                Object[] params = function.params();
                if ("convert".equals(name)) {
                    return Value.of(get(QueryValue.class.cast(params[0]), parameters))
                            .get((Class<?>) params[1]);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
                throw new QueryException(message);
            case JSON:
                return JsonObjects.getDocuments(JSONQueryValue.class.cast(value).get());
            case CONDITION:
            default:
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java

        if (value instanceof Map) {
            List list = Documents.of((Map.class.cast(value)));
            if(list.size() == 1) {
                return list.get(0);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Documents::getValue).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java

    private static void checkBetweenClause(Object value) {
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();

            if (count != 2) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
    private Object convert(Object value) {
        if (value instanceof Document) {
            Document column = Document.class.cast(value);
            return singletonMap(column.name(), convert(column.get()));
        } else if (value instanceof Iterable) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
        } else if (value instanceof Iterable) {
            List<Object> list = new ArrayList<>();
            Iterable.class.cast(value).forEach(e -> list.add(convert(e)));
            return list;
        }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/spi/AbstractBean.java`
#### Snippet
```java
    }

    protected <T> T getInstance(Class<T> bean, Annotation qualifier) {
        return CDI.current().select(bean, qualifier).get();
    }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/spi/AbstractBean.java`
#### Snippet
```java
public abstract class AbstractBean<T> implements Bean<T>, PassivationCapable {

    protected <T> T getInstance(Class<T> bean) {
        return CDI.current().select(bean).get();
    }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexUntilTraversal.java`
#### Snippet
```java

    @Override
    public <T> VertexTraversal hasLabel(P<String> predicate) {
        requireNonNull(predicate, "predicate is required");
        return new DefaultVertexTraversal(supplier, flow.andThen(g -> g.hasLabel(predicate)), converter);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexUntilTraversal.java`
#### Snippet
```java

    @Override
    public <T> VertexTraversal hasLabel(Class<T> type) {
        requireNonNull(type, "type is required");
        Entity entity = type.getAnnotation(Entity.class);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> Stream<T> next(int limit) {
        return flow.apply(supplier.get())
                .next(limit).stream()
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> VertexTraversal filter(Predicate<T> predicate) {
        requireNonNull(predicate, "predicate is required");

```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> next() {
        Optional<Vertex> vertex = flow.apply(supplier.get()).tryNext();
        return vertex.map(converter::toEntity);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> VertexTraversal hasLabel(P<String> predicate) {
        requireNonNull(predicate, "predicate is required");
        return new DefaultVertexTraversal(supplier, flow.andThen(g -> g.hasLabel(predicate)), converter);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> VertexTraversal hasLabel(Class<T> type) {
        requireNonNull(type, "type is required");
        Entity entity = type.getAnnotation(Entity.class);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> getSingleResult() {
        final Stream<T> stream = getResult();
        final Iterator<T> iterator = stream.iterator();
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultVertexTraversal.java`
#### Snippet
```java

    @Override
    public <T> Stream<T> getResult() {
        return flow.apply(supplier.get())
                .toStream()
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexConditionTraversal.java`
#### Snippet
```java
     * @throws NullPointerException when predicate is null
     */
    <T> VertexTraversal hasLabel(P<String> predicate);

    /**
```

### TypeParameterHidesVisibleType
Type parameter `T` hides visible type 'org.apache.tinkerpop.gremlin.structure.T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexConditionTraversal.java`
#### Snippet
```java
     * @throws NullPointerException when entityClazz is null
     */
    <T> VertexTraversal hasLabel(Class<T> type);

    /**
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Map`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/ValueMapTraversal.java`
#### Snippet
```java
     * @return the entity result otherwise {@link Optional#empty()}
     */
    Optional<Map<String, Object>> getSingleResult();

    /**
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultValueMapTraversal.java`
#### Snippet
```java

    @Override
    public Optional<Map<String, Object>> getSingleResult() {
        List<Map<String, Object>> result = getResultList();
        if (result.isEmpty()) {
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ParameterMetaDataBuilder.java`
#### Snippet
```java
        String name = Optional.ofNullable(id)
                .map(Id::value)
                .orElseGet(() -> column.value());
        MappingType mappingType = MappingType.of(parameter);
        switch (mappingType) {
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/DefaultSettings.java`
#### Snippet
```java
        return configurations.entrySet().stream()
                .filter(prefixCondition)
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
```

### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/DefaultSettings.java`
#### Snippet
```java
        return configurations.entrySet().stream()
                .filter(e -> e.getKey().startsWith(prefix))
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'reflections' in a Serializable class
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassOperationFactory.java`
#### Snippet
```java
    private static final Logger LOGGER = Logger.getLogger(ClassOperationFactory.class.getName());

    private final Reflections reflections = new Reflections();

    private final ClassOperation reflection = new ReflectionClassOperation(reflections);
```

## RuleId[id=Java9UndeclaredServiceUsage]
### Java9UndeclaredServiceUsage
Usage of service 'org.eclipse.jnosql.communication.column.ColumnConfiguration' is not declared in module-info
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnConfiguration.java`
#### Snippet
```java
     */
    static <T extends ColumnConfiguration> T getConfiguration() {
        return (T) ServiceLoader.load(ColumnConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
```

### Java9UndeclaredServiceUsage
Usage of service 'org.eclipse.jnosql.communication.column.ColumnConfiguration' is not declared in module-info
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnConfiguration.java`
#### Snippet
```java
     */
    static <T extends ColumnConfiguration> T getConfiguration(Class<T> type) {
        return (T) ServiceLoader.load(ColumnConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ColumnManager`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/DefaultColumnTemplate.java`
#### Snippet
```java

    @Inject
    DefaultColumnTemplate(ColumnEntityConverter converter, Instance<ColumnManager> manager,
                          ColumnWorkflow flow,
                          ColumnEventPersistManager eventManager,
```

### BoundedWildcard
Can generalize to `? extends BucketManager`
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/DefaultKeyValueTemplate.java`
#### Snippet
```java
    @Inject
    DefaultKeyValueTemplate(KeyValueEntityConverter converter,
                            Instance<BucketManager> manager,
                            KeyValueWorkflow flow,
                            KeyValueEventPersistManager eventManager) {
```

### BoundedWildcard
Can generalize to `? extends FieldMapping`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnEntityConverter.java`
#### Snippet
```java
    }

    protected <T> Consumer<String> feedObject(T entity, List<Column> columns, Map<String, FieldMapping> fieldsGroupByName) {
        return (String k) -> {
            Optional<Column> column = columns.stream().filter(c -> c.name().equals(k)).findFirst();
```

### BoundedWildcard
Can generalize to `? super DatabaseMetadata`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/Databases.java`
#### Snippet
```java
     * @see DatabaseType
     */
    public static void addDatabase(final ProcessProducer processProducer, final DatabaseType type, final Set<DatabaseMetadata> databases) {

        Set<Annotation> annotations = processProducer.getAnnotatedMember().getAnnotations();
```

### BoundedWildcard
Can generalize to `? extends Graph`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultGraphTemplate.java`
#### Snippet
```java

    @Inject
    DefaultGraphTemplate(Instance<Graph> graph, EntitiesMetadata entities, GraphConverter converter,
                         GraphWorkflow workflow,
                         Converters converters) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
    }

    private void appendFields(Map<String, NativeMapping> nativeFieldGroupByJavaField,
                              FieldMapping field, String javaField, String nativeField,
                              Class<?> type) {
```

### BoundedWildcard
Can generalize to `? super NativeMapping`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
    }

    private void appendFields(Map<String, NativeMapping> nativeFieldGroupByJavaField,
                              FieldMapping field, String javaField, String nativeField,
                              Class<?> type) {
```

### BoundedWildcard
Can generalize to `? extends FieldMapping`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
    }

    private Map<String, NativeMapping> getNativeFieldGroupByJavaField(List<FieldMapping> fields,
                                                                      String javaField, String nativeField) {

```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
    }

    private void appendDefaultField(Map<String, NativeMapping> nativeFieldGroupByJavaField,
                                    FieldMapping field, String javaField, String nativeField) {

```

### BoundedWildcard
Can generalize to `? super NativeMapping`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
    }

    private void appendDefaultField(Map<String, NativeMapping> nativeFieldGroupByJavaField,
                                    FieldMapping field, String javaField, String nativeField) {

```

### BoundedWildcard
Can generalize to `? super EdgeEntity`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultEdgeTraversal.java`
#### Snippet
```java

    @Override
    public EdgeTraversal filter(Predicate<EdgeEntity> predicate) {
        requireNonNull(predicate, "predicate is required");

```

### BoundedWildcard
Can generalize to `? extends T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractGraphTemplate.java`
#### Snippet
```java

    @Override
    public <T> Iterable<T> update(Iterable<T> entities) {
        requireNonNull(entities, "entities is required");
        return StreamSupport.stream(entities.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends Stream`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
    private DynamicReturn(Class<T> classSource, Method methodSource,
                          Supplier<Optional<T>> singleResult,
                          Supplier<Stream<T>> result, Pageable pagination,
                          Function<Pageable, Optional<T>> singleResultPagination,
                          Function<Pageable, Stream<T>> streamPagination,
```

### BoundedWildcard
Can generalize to `? super Pageable`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
                          Supplier<Optional<T>> singleResult,
                          Supplier<Stream<T>> result, Pageable pagination,
                          Function<Pageable, Optional<T>> singleResultPagination,
                          Function<Pageable, Stream<T>> streamPagination,
                          Function<Pageable, Page<T>> page) {
```

### BoundedWildcard
Can generalize to `? super Pageable`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
                          Supplier<Stream<T>> result, Pageable pagination,
                          Function<Pageable, Optional<T>> singleResultPagination,
                          Function<Pageable, Stream<T>> streamPagination,
                          Function<Pageable, Page<T>> page) {
        this.classSource = classSource;
```

### BoundedWildcard
Can generalize to `? extends Stream`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
                          Supplier<Stream<T>> result, Pageable pagination,
                          Function<Pageable, Optional<T>> singleResultPagination,
                          Function<Pageable, Stream<T>> streamPagination,
                          Function<Pageable, Page<T>> page) {
        this.classSource = classSource;
```

### BoundedWildcard
Can generalize to `? super Pageable`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
                          Function<Pageable, Optional<T>> singleResultPagination,
                          Function<Pageable, Stream<T>> streamPagination,
                          Function<Pageable, Page<T>> page) {
        this.classSource = classSource;
        this.methodSource = methodSource;
```

### BoundedWildcard
Can generalize to `? extends Page`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
                          Function<Pageable, Optional<T>> singleResultPagination,
                          Function<Pageable, Stream<T>> streamPagination,
                          Function<Pageable, Page<T>> page) {
        this.classSource = classSource;
        this.methodSource = methodSource;
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/config/MicroProfileSettings.java`
#### Snippet
```java

    @Override
    public Optional<Object> getSupplier(Iterable<Supplier<String>> suppliers) {
        Objects.requireNonNull(suppliers, "supplier is required");
        List<String> keys = StreamSupport.stream(suppliers.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/config/MicroProfileSettings.java`
#### Snippet
```java

    @Override
    public List<Object> prefixSupplier(Iterable<Supplier<String>> suppliers) {
        Objects.requireNonNull(suppliers, "suppliers is required");
        Iterable<String> prefixes = StreamSupport.stream(suppliers.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends Graph`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultGraphConverter.java`
#### Snippet
```java
    @Inject
    DefaultGraphConverter(EntitiesMetadata entities, Converters converters,
                          Instance<Graph> graph, GraphEventPersistManager eventManager) {
        this.entities = entities;
        this.converters = converters;
```

### BoundedWildcard
Can generalize to `? extends GraphTraversalSourceSupplier`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultGraphTraversalSourceTemplate.java`
#### Snippet
```java

    @Inject
    DefaultGraphTraversalSourceTemplate(Instance<GraphTraversalSourceSupplier> supplierInstance,
                                        EntitiesMetadata entities,
                                        @GraphTraversalSourceOperation GraphConverter converter,
```

### BoundedWildcard
Can generalize to `? extends GraphTraversalSourceSupplier`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultGraphTraversalSourceConverter.java`
#### Snippet
```java
    @Inject
    DefaultGraphTraversalSourceConverter(EntitiesMetadata entities, Converters converters,
                                         Instance<GraphTraversalSourceSupplier> suppliers,
                                         GraphEventPersistManager eventManager) {
        this.entities = entities;
```

### BoundedWildcard
Can generalize to `? extends GraphTraversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultValueMapTraversal.java`
#### Snippet
```java
    private final Function<GraphTraversal<?, ?>, GraphTraversal<Vertex, Map<Object, Object>>> flow;

    DefaultValueMapTraversal(Supplier<GraphTraversal<?, ?>> supplier, Function<GraphTraversal<?, ?>,
            GraphTraversal<Vertex, Map<Object, Object>>> flow) {
        this.supplier = supplier;
```

### BoundedWildcard
Can generalize to `? super GraphTraversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultValueMapTraversal.java`
#### Snippet
```java
    private final Function<GraphTraversal<?, ?>, GraphTraversal<Vertex, Map<Object, Object>>> flow;

    DefaultValueMapTraversal(Supplier<GraphTraversal<?, ?>> supplier, Function<GraphTraversal<?, ?>,
            GraphTraversal<Vertex, Map<Object, Object>>> flow) {
        this.supplier = supplier;
```

### BoundedWildcard
Can generalize to `? extends GraphTraversal`>
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultValueMapTraversal.java`
#### Snippet
```java

    DefaultValueMapTraversal(Supplier<GraphTraversal<?, ?>> supplier, Function<GraphTraversal<?, ?>,
            GraphTraversal<Vertex, Map<Object, Object>>> flow) {
        this.supplier = supplier;
        this.flow = flow;
```

### BoundedWildcard
Can generalize to `? extends FieldMapping`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConverter.java`
#### Snippet
```java

    private <T> Consumer<String> feedObject(T instance, List<Property> elements,
                                            Map<String, FieldMapping> fieldsGroupByName) {
        return k -> {
            Optional<Property> element = elements
```

### BoundedWildcard
Can generalize to `? extends Enum`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
    }

    private <T> List<Enum> getEnumList(Class<Enum> type) {
        EnumSet enumSet = EnumSet.allOf(type);
        return new ArrayList<>(enumSet);
```

### BoundedWildcard
Can generalize to `? extends ValidatorFactory`
in `jnosql-mapping/jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
         * @throws NullPointerException when the provided validatorFactories or the validators instances are null
         */
        private static Validator get(Instance<ValidatorFactory> validatorFactories, Instance<Validator> validators) {
            Objects.requireNonNull(validatorFactories, "validatorFactories is required");
            Objects.requireNonNull(validators, "validators is required");
```

### BoundedWildcard
Can generalize to `? extends Validator`
in `jnosql-mapping/jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
         * @throws NullPointerException when the provided validatorFactories or the validators instances are null
         */
        private static Validator get(Instance<ValidatorFactory> validatorFactories, Instance<Validator> validators) {
            Objects.requireNonNull(validatorFactories, "validatorFactories is required");
            Objects.requireNonNull(validators, "validators is required");
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    }

    private void convertEntryToMap(Object value, Map<String, Object> map) {
        Entry entry = Entry.class.cast(value);
        Object entryValue = entry.value().get();
```

### BoundedWildcard
Can generalize to `? extends Value`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/DefaultKeyValuePreparedStatement.java`
#### Snippet
```java
    private final Value value;

    DefaultKeyValuePreparedStatement(Value key, Value value, List<Value> keys,
                                     PreparedStatementType type,
                                     BucketManager manager,
```

### BoundedWildcard
Can generalize to `? extends T`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
     * @throws NullPointerException when there are null parameters
     */
    public <T> Optional<T> find(String columnName, TypeSupplier<T> type) {
        Objects.requireNonNull(columnName, "columnName is required");
        Objects.requireNonNull(type, "type is required");
```

### BoundedWildcard
Can generalize to `? extends T`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
     * @throws NullPointerException when there are null parameters
     */
    public <T> Optional<T> find(String columnName, Class<T> type) {
        Objects.requireNonNull(columnName, "columnName is required");
        Objects.requireNonNull(type, "type is required");
```

### BoundedWildcard
Can generalize to `? extends Column`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java


    public void addAll(List<Column> columns) {
        Objects.requireNonNull(columns, "The object column is required");
        columns.forEach(this::add);
```

### BoundedWildcard
Can generalize to `? extends QueryCondition`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/ConditionQueryValue.java`
#### Snippet
```java
    private final List<QueryCondition> conditions;

    private ConditionQueryValue(List<QueryCondition> conditions) {
        this.conditions = conditions;
    }
```

### BoundedWildcard
Can generalize to `? extends QueryValue`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/DelQuery.java`
#### Snippet
```java
    private final List<QueryValue<?>> keys;

    DelQuery(List<QueryValue<?>> keys) {
        this.keys = keys;
    }
```

### BoundedWildcard
Can generalize to `? extends QueryValue`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/GetQuery.java`
#### Snippet
```java
    private final List<QueryValue<?>> keys;

    GetQuery(List<QueryValue<?>> keys) {
        this.keys = keys;
    }
```

### BoundedWildcard
Can generalize to `? extends DocumentManager`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/DefaultDocumentTemplate.java`
#### Snippet
```java

    @Inject
    DefaultDocumentTemplate(DocumentEntityConverter converter, Instance<DocumentManager> manager,
                            DocumentWorkflow workflow, DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities, Converters converters) {
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/DefaultSettings.java`
#### Snippet
```java

    @Override
    public List<Object> prefixSupplier(Iterable<Supplier<String>> suppliers) {
        Objects.requireNonNull(suppliers, "suppliers is required");
        Iterable<String> prefixes = StreamSupport.stream(suppliers.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/DefaultSettings.java`
#### Snippet
```java

    @Override
    public Optional<Object> getSupplier(Iterable<Supplier<String>> suppliers) {
        Objects.requireNonNull(suppliers, "supplier is required");
        List<String> keys = StreamSupport.stream(suppliers.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends T`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/DefaultSettings.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> get(String key, Class<T> type) {
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(type, "type is required");
```

### BoundedWildcard
Can generalize to `? extends FieldMapping`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/DocumentEntityConverter.java`
#### Snippet
```java
  

    protected <T> Consumer<String> feedObject(T entity, List<Document> documents, Map<String, FieldMapping> fieldsGroupByName) {
        return k -> {
            Optional<Document> document = documents.stream().filter(c -> c.name().equals(k)).findFirst();
```

### BoundedWildcard
Can generalize to `? extends Document`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
     * @throws NullPointerException          when document is null
     */
    public void addAll(Iterable<Document> documents) {
        requireNonNull(documents, "documents are required");
        documents.forEach(this::add);
```

### BoundedWildcard
Can generalize to `? extends T`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
     * @throws NullPointerException when there are null parameters
     */
    public <T> Optional<T> find(String documentName, TypeSupplier<T> type) {
        Objects.requireNonNull(documentName, "documentName is required");
        Objects.requireNonNull(type, "type is required");
```

### BoundedWildcard
Can generalize to `? extends T`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
     * @throws NullPointerException when there are null parameters
     */
    public <T> Optional<T> find(String documentName, Class<T> type) {
        Objects.requireNonNull(documentName, "documentName is required");
        Objects.requireNonNull(type, "type is required");
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/AbstractMapperQuery.java`
#### Snippet
```java
    protected String name;

    protected transient final EntityMetadata mapping;

    protected transient final Converters converters;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final EntityMetadata mapping;

    protected transient final Converters converters;

    protected transient final JNoSQLColumnTemplate template;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final Converters converters;

    protected transient final JNoSQLColumnTemplate template;

    protected long start;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final Converters converters;

    protected transient final GraphTraversal<Vertex, Vertex> traversal;

    protected transient final GraphConverter converter;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractMapperQuery.java`
#### Snippet
```java
    protected String name;

    protected transient final EntityMetadata mapping;

    protected transient final Converters converters;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final GraphTraversal<Vertex, Vertex> traversal;

    protected transient final GraphConverter converter;

    protected transient GraphTraversal<Object, Object> condition;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final EntityMetadata mapping;

    protected transient final Converters converters;

    protected transient final GraphTraversal<Vertex, Vertex> traversal;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/AbstractMapperQuery.java`
#### Snippet
```java
    protected String name;

    protected transient final EntityMetadata mapping;

    protected transient final Converters converters;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final EntityMetadata mapping;

    protected transient final Converters converters;

    protected transient final JNoSQLDocumentTemplate template;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/AbstractMapperQuery.java`
#### Snippet
```java
    protected transient final Converters converters;

    protected transient final JNoSQLDocumentTemplate template;

    protected long start;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `type()` is identical to its super method
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/DefaultQueryValue.java`
#### Snippet
```java

    @Override
    public ValueType type() {
        return ValueType.PARAMETER;
    }
```

### RedundantMethodOverride
Method `getScope()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public Class<? extends Annotation> getScope() {
        return ApplicationScoped.class;
    }
```

### RedundantMethodOverride
Method `isAlternative()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public boolean isAlternative() {
        return false;
    }
```

### RedundantMethodOverride
Method `isNullable()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public boolean isNullable() {
        return false;
    }
```

### RedundantMethodOverride
Method `destroy()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public void destroy(JNoSQLDocumentTemplate instance, CreationalContext<JNoSQLDocumentTemplate> creationalContext) {

    }
```

### RedundantMethodOverride
Method `getInjectionPoints()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public Set<InjectionPoint> getInjectionPoints() {
        return Collections.emptySet();
    }
```

### RedundantMethodOverride
Method `getName()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public String getName() {
        return null;
    }
```

### RedundantMethodOverride
Method `getStereotypes()` is identical to its super method
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java

    @Override
    public Set<Class<? extends Annotation>> getStereotypes() {
        return Collections.emptySet();
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/RepositoryObserverParser.java`
#### Snippet
```java
        } else {
            String currentField = "";
            String[] fields = field.split(CAMEL_CASE);
            for (int index = 0; index < fields.length; index++) {
                if (currentField.isEmpty()) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jakarta.data.repository` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/ColumnRepositoryProxy.java`
#### Snippet
```java

/**
 * Proxy handle to generate {@link jakarta.data.repository.PageableRepository}
 *
 * @param <T>  the type
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.data.repository` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/query/RepositoryType.java`
#### Snippet
```java
    QUERY(""),
    /**
     * Method that has {@link jakarta.data.repository.OrderBy} annotation
     */
    ORDER_BY("");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ConstructorMetadata.java`
#### Snippet
```java

/**
 * This class has information about {@link java.lang.reflect.Constructor}
 */
public final class ConstructorMetadata {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConfiguration.java`
#### Snippet
```java

    /**
     * creates and returns a  {@link GraphConfiguration}  instance from {@link java.util.ServiceLoader}
     *
     * @param <T> the configuration type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeEntity.java`
#### Snippet
```java

    /**
     * Returns an id from {@link org.eclipse.jnosql.communication.Value#get(Class)}
     *
     * @param type the class type
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicQueryMethodReturn.java`
#### Snippet
```java
    private final Object[] args;
    private final Class<?> typeClass;
    private final java.util.function.Function<String, Stream<?>> queryConverter;
    private final Function<String, PreparedStatement> prepareConverter;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.tinkerpop.gremlin.structure` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

/**
 * Utilitarian to {@link org.apache.tinkerpop.gremlin.structure.Transaction}
 */
final class GraphTransactionUtil {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.tinkerpop.gremlin.structure` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultEdgeEntity.java`
#### Snippet
```java
    public Optional<Value> get(String key) {
        requireNonNull(key, "key is required");
        org.apache.tinkerpop.gremlin.structure.Property property = edge.property(key);
        if (property.isPresent()) {
            return Optional.of(Value.of(property.value()));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.tinkerpop.gremlin.structure` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultEdgeEntity.java`
#### Snippet
```java
    public void remove(String key) {
        requireNonNull(key, "key is required");
        org.apache.tinkerpop.gremlin.structure.Property property = edge.property(key);
        property.ifPresent(o -> property.remove());
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.data.repository` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphRepositoryProxy.java`
#### Snippet
```java

/**
 * Proxy handle to generate {@link jakarta.data.repository.PageableRepository}
 *
 * @param <T>  the type
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java

/**
 * The {@link TypeReferenceReader} to {@link java.util.List} and {@link java.lang.Iterable}
 */
public class ListTypeReferenceReader implements TypeReferenceReader {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java

/**
 * The {@link TypeReferenceReader} to {@link java.util.List} and {@link java.lang.Iterable}
 */
public class ListTypeReferenceReader implements TypeReferenceReader {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.stream` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java

/**
 * The {@link TypeReferenceReader} to {@link java.util.stream.Stream}
 */
public class StreamTypeReferenceReader implements TypeReferenceReader {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java

/**
 * The {@link TypeReferenceReader} to {@link java.util.Optional}
 */
@SuppressWarnings("unchecked")
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param event the event
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param event the event
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param entity the entity to be validated
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping/jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param entity the entity to be validated
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java
     * Returns a new {@link ColumnCondition} aggregating ,as "AND", all the conditions as just one condition.
     * The {@link Column} will storage the {@link Condition#getNameField()} as key and the value gonna be
     * the {@link java.util.List} of all conditions, in other words.
     * <p>Given:</p>
     * {@code
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java
     * Returns a new {@link ColumnCondition} aggregating ,as "OR", all the conditions as just one condition.
     * The {@link Column} will storage the {@link Condition#getNameField()} as key and the value gonna be
     * the {@link java.util.List} of all conditions, in other words.
     * <p>Given:</p>
     * {@code
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java
     * Returns a new {@link DocumentCondition} aggregating ,as "OR", all the conditions as just one condition.
     * The {@link Document} will storage the {@link Condition#getNameField()} as key and the value gonna be
     * the {@link java.util.List} of all conditions, in other words.
     * <p>Given:</p>
     * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java
     * Returns a new {@link DocumentCondition} aggregating ,as "AND", all the conditions as just one condition.
     * The {@link Document} will storage the {@link Condition#getNameField()} as key and the value gonna be
     * the {@link java.util.List} of all conditions, in other words.
     * <p>Given:</p>
     * <pre>
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`currentField = currentField + capitalize(fields[index], true)` could be simplified to 'currentField += capitalize(fields\[index\], true)'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/RepositoryObserverParser.java`
#### Snippet
```java
                    currentField = capitalize(fields[index], false);
                } else {
                    currentField = currentField + capitalize(fields[index], true);
                }
                Optional<FieldMapping> mapping = metadata.fieldMapping(currentField);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractKeyValueRepository()` of an abstract class should not be declared 'public'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/AbstractKeyValueRepository.java`
#### Snippet
```java
    protected abstract KeyValueTemplate getTemplate();

    public AbstractKeyValueRepository(Class<T> type) {
        this.type = type;
    }
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'DatabaseQualifier' implements annotation interface `Database`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/DatabaseQualifier.java`
#### Snippet
```java
 * Utilitarian class to select the {@link Database}
 */
public final class DatabaseQualifier extends AnnotationLiteral<Database> implements Database {

    private static final DatabaseQualifier DEFAULT_DOCUMENT_PROVIDER = new DatabaseQualifier("", DOCUMENT);
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnManager.java`
#### Snippet
```java
     * @throws UnsupportedOperationException if the implementation does not support any operation that a query has.
     */
    void delete(ColumnDeleteQuery query);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentManager.java`
#### Snippet
```java
     * @throws UnsupportedOperationException if the implementation does not support any operation that a query has.
     */
    void delete(DocumentDeleteQuery query);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws NullPointerException when either key or value are null
     */
    <K, V> void put(K key, V value);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws NullPointerException when entity is null
     */
    void put(KeyValueEntity entity);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws UnsupportedOperationException when expired time is not supported
     */
    void put(KeyValueEntity entity, Duration ttl);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws NullPointerException when the iterable is null
     */
    void put(Iterable<KeyValueEntity> entities);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws UnsupportedOperationException when expired time is not supported
     */
    void put(Iterable<KeyValueEntity> entities, Duration ttl);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws NullPointerException when the key is null
     */
    <K> void delete(K key);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/BucketManager.java`
#### Snippet
```java
     * @throws NullPointerException when the key is null
     */
    <K> void delete(Iterable<K> keys);

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphQueryMethod.java`
#### Snippet
```java
    private final Converters converters;
    private final Method method;
    private int counter = 0;

    GraphQueryMethod(EntityMetadata mapping,
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `MapperDeleteNameCondition`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnMapperDelete.java`
#### Snippet
```java

final class ColumnMapperDelete extends AbstractMapperQuery implements MapperDeleteFrom,
        MapperDeleteWhere, MapperDeleteNameCondition, MapperDeleteNotCondition  {


```

### RedundantImplements
Redundant interface declaration `MapperNameCondition`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnMapperSelect.java`
#### Snippet
```java

final class ColumnMapperSelect extends AbstractMapperQuery implements MapperFrom, MapperLimit,
        MapperSkip, MapperOrder, MapperNameCondition,
        MapperNotCondition, MapperNameOrder, MapperWhere {

```

### RedundantImplements
Redundant interface declaration `PageableRepository`
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/ColumnRepositoryProxy.java`
#### Snippet
```java


    static class ColumnRepository extends AbstractColumnRepository implements PageableRepository {

        private final JNoSQLColumnTemplate template;
```

### RedundantImplements
Redundant interface declaration `ParameterMetaData`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/GenericParameterMetaData.java`
#### Snippet
```java
import java.util.ServiceLoader;

public final class GenericParameterMetaData extends DefaultParameterMetaData implements ParameterMetaData {

    private final TypeSupplier<?> typeSupplier;
```

### RedundantImplements
Redundant interface declaration `MapperDeleteNameCondition`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphMapperDelete.java`
#### Snippet
```java

final class GraphMapperDelete extends AbstractMapperQuery implements MapperDeleteFrom,
        MapperDeleteWhere, MapperDeleteNameCondition, MapperDeleteNotCondition {
    GraphMapperDelete(EntityMetadata mapping, Converters converters, GraphTraversal<Vertex, Vertex> traversal,
                      GraphConverter converter) {
```

### RedundantImplements
Redundant interface declaration `MapperNameCondition`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphMapperSelect.java`
#### Snippet
```java
final class GraphMapperSelect extends AbstractMapperQuery
        implements MapperFrom, MapperLimit,
        MapperSkip, MapperOrder, MapperNameCondition,
        MapperNotCondition, MapperNameOrder, MapperWhere {

```

### RedundantImplements
Redundant interface declaration `PageableRepository`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphRepositoryProxy.java`
#### Snippet
```java


    static class GraphRepository extends AbstractGraphRepository implements PageableRepository {

        private final GraphTemplate template;
```

### RedundantImplements
Redundant interface declaration `ColumnNameCondition`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/DefaultFluentColumnQueryBuilder.java`
#### Snippet
```java
class DefaultFluentColumnQueryBuilder extends BaseQueryBuilder implements
        ColumnSelect, ColumnFrom, ColumnLimit, ColumnSkip,
        ColumnOrder, ColumnNameCondition, ColumnNotCondition, ColumnNameOrder, ColumnWhere, ColumnQueryBuild {


```

### RedundantImplements
Redundant interface declaration `ColumnQueryBuild`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/DefaultFluentColumnQueryBuilder.java`
#### Snippet
```java
class DefaultFluentColumnQueryBuilder extends BaseQueryBuilder implements
        ColumnSelect, ColumnFrom, ColumnLimit, ColumnSkip,
        ColumnOrder, ColumnNameCondition, ColumnNotCondition, ColumnNameOrder, ColumnWhere, ColumnQueryBuild {


```

### RedundantImplements
Redundant interface declaration `MapperDeleteNameCondition`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/DocumentMapperDelete.java`
#### Snippet
```java

final class DocumentMapperDelete extends AbstractMapperQuery implements MapperDeleteFrom,
        MapperDeleteWhere, MapperDeleteNameCondition, MapperDeleteNotCondition {


```

### RedundantImplements
Redundant interface declaration `MapperNameCondition`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/DocumentMapperSelect.java`
#### Snippet
```java

final class DocumentMapperSelect extends AbstractMapperQuery implements MapperFrom, MapperLimit,
        MapperSkip, MapperOrder, MapperNameCondition,
        MapperNotCondition, MapperNameOrder, MapperWhere {

```

### RedundantImplements
Redundant interface declaration `PageableRepository`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/DocumentRepositoryProxy.java`
#### Snippet
```java


    static class DocumentRepository extends AbstractDocumentRepository implements PageableRepository {

        private final JNoSQLDocumentTemplate template;
```

### RedundantImplements
Redundant interface declaration `DocumentQueryBuild`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DefaultFluentDocumentQueryBuilder.java`
#### Snippet
```java
 */
class DefaultFluentDocumentQueryBuilder extends BaseQueryBuilder implements DocumentSelect, DocumentFrom, DocumentLimit,
        DocumentSkip, DocumentOrder, DocumentNotCondition, DocumentNameOrder, DocumentWhere, DocumentQueryBuild {


```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-10-12-53-54.330.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
            return field;
        } else {
            return prefix.concat(field);
        }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java

    private String appendPreparePrefix(String prefix, String field) {
        return appendPrefix(prefix, field).concat(".");
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java
                                    FieldMapping field, String javaField, String nativeField) {

        nativeFieldGroupByJavaField.put(javaField.concat(field.fieldName()),
                NativeMapping.of(nativeField.concat(field.name()), field));
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ClassConverter.java`
#### Snippet
```java

        nativeFieldGroupByJavaField.put(javaField.concat(field.fieldName()),
                NativeMapping.of(nativeField.concat(field.name()), field));
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/MethodParamQueryValue.java`
#### Snippet
```java

    MethodParamQueryValue(String value) {
        this.value = value.concat("_")
                .concat(Long.toString(System.nanoTime()));
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/MethodParamQueryValue.java`
#### Snippet
```java
    MethodParamQueryValue(String value) {
        this.value = value.concat("_")
                .concat(Long.toString(System.nanoTime()));
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
    private String formatField(String text) {
        String lowerCase = String.valueOf(text.charAt(0)).toLowerCase(Locale.US);
        return lowerCase.concat(text.substring(1));
    }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/KeyValueEntityConverter.java`
#### Snippet
```java
        T bean = entity.value(type);
        if (Objects.isNull(bean)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/spi/AbstractBean.java`
#### Snippet
```java
    @Override
    public String getName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/FieldMapping.java`
#### Snippet
```java
     */
    default Field nativeField() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/Reflections.java`
#### Snippet
```java
            LOGGER.log(Level.FINEST, "There is an issue with returning value from this field.", exception);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/Reflections.java`
#### Snippet
```java
        } catch (Exception exception) {
            LOGGER.log(Level.FINEST, "There is an issue to creating an entity from this constructor", exception);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/Reflections.java`
#### Snippet
```java
        } catch (Exception exception) {
            LOGGER.log(Level.FINEST, "There is an issue to creating an entity from this constructor", exception);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
    public static Pageable findPageable(Object[] params) {
        if (params == null || params.length == 0) {
            return null;
        }
        return Stream.of(params)
```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphMapperSelect.java`
#### Snippet
```java
    public <T> MapperWhere in(Iterable<T> values) {
        inImpl(values);
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/spi/TemplateBean.java`
#### Snippet
```java
    @Override
    public String getName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepositoryProxy.java`
#### Snippet
```java
                DocumentDeleteQuery documentDeleteQuery = getDeleteQuery(method, args);
                getTemplate().delete(documentDeleteQuery);
                return null;
            case OBJECT_METHOD:
                return method.invoke(this, args);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `graph` is redundant
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/configuration/GraphSupplier.java`
#### Snippet
```java
                }).orElseGet(GraphConfiguration::getConfiguration);

        Graph graph = configuration.apply(settings);
        return graph;
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = GREATER_EQUALS_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = GREATER_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = IN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
    @Override
    public void exitEq(MethodParser.EqContext ctx) {
        Condition operator = EQUALS;
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = LESSER_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = LIKE;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = LESSER_EQUALS_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = BETWEEN;
        ArrayQueryValue value = MethodArrayValue.of(variable);
        checkCondition(new MethodCondition(variable, operator, value), hasNot);
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`sort.isAscending() == true` can be simplified to 'sort.isAscending()'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/SelectQueryParser.java`
#### Snippet
```java
    private Sort toSort(Sort sort, DocumentObserverParser observer, String entity) {
        return Sort.of(observer.fireField(entity, sort.property()),
                sort.isAscending() == true ? Direction.ASC : Direction.DESC, false);
    }

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractGraphTemplate.java`
#### Snippet
```java
    private <T> boolean isIdNull(T entity) {
        EntityMetadata entityMetadata = getEntities().get(entity.getClass());
        FieldMapping field = entityMetadata.id().get();
        return isNull(field.read(entity));

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractGraphTemplate.java`
#### Snippet
```java
    private <T> Optional<Vertex> vertex(T entity) {
        EntityMetadata entityMetadata = getEntities().get(entity.getClass());
        FieldMapping field = entityMetadata.id().get();
        Object id = field.read(entity);
        Iterator<Vertex> vertices = vertices(id);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/writer/OptionalValueWriter.java`
#### Snippet
```java
    @Override
    public T write(Optional<T> optional) {
        return optional.get();
    }
}
```

## RuleId[id=ConstantValue]
### ConstantValue
Method reference result is always 'true'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/AbstractKeyValueTemplate.java`
#### Snippet
```java
        Optional<Value> value = getManager().get(key);
        return value.map(v -> getConverter().toEntity(type, KeyValueEntity.of(key, v)))
                .filter(Objects::nonNull).map(e -> {
                    getEventManager().firePostEntity(e);
                    return e;
```

