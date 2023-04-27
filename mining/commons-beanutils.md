# commons-beanutils 
 
# Bad smells
I found 463 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 87 | false |
| AssignmentToMethodParameter | 65 | false |
| ReturnNull | 65 | false |
| UnusedAssignment | 53 | false |
| UnnecessaryBoxing | 36 | false |
| SynchronizeOnNonFinalField | 24 | false |
| ConstantValue | 17 | false |
| ClassNameSameAsAncestorName | 15 | false |
| TypeParameterExtendsObject | 14 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| SynchronizeOnThis | 9 | false |
| MethodOverridesStaticMethod | 8 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| UnnecessaryToStringCall | 5 | true |
| CastCanBeRemovedNarrowingVariableType | 5 | false |
| MismatchedJavadocCode | 4 | false |
| BoundedWildcard | 4 | false |
| RedundantSuppression | 4 | false |
| DataFlowIssue | 3 | false |
| UnnecessaryUnboxing | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| SuspiciousSystemArraycopy | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| IgnoreResultOfCall | 2 | false |
| SystemOutErr | 2 | false |
| UnnecessaryModifier | 1 | true |
| ClassGetClass | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| RefusedBequest | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| FinalStaticMethod | 1 | false |
| MissortedModifiers | 1 | false |
| RedundantMethodOverride | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    * Commons Logging
    */
    private static transient Log LOG = LogFactory.getLog(LazyDynaBean.class);

    /** BigInteger Zero */
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PropertyDescriptors` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/beanutils2/PropertyDescriptors.java`
#### Snippet
```java
import java.beans.PropertyDescriptor;

class PropertyDescriptors {

    static final PropertyDescriptor[] EMPTY_ARRAY = {};
```

### UtilityClassWithoutPrivateConstructor
Class `LocaleConvertUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtils.java`
#### Snippet
```java
 *
 */
public class LocaleConvertUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/beanutils2/PropertyUtils.java`
#### Snippet
```java
 */

public class PropertyUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ConstructorUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
 *
 */
public class ConstructorUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ConvertUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/beanutils2/ConvertUtils.java`
#### Snippet
```java
 * @see ConvertUtilsBean
 */
public class ConvertUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MethodUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
 * If this call fails then a warning will be logged and the method may fail.</p>
 */
public class MethodUtils {

    /**
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
`indexedProperty` is not of an array type
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
                final Class<?> componentType = indexedProperty.getClass().getComponentType();
                final Object newArray = Array.newInstance(componentType, index + 1);
                System.arraycopy(indexedProperty, 0, newArray, 0, length);
                indexedProperty = newArray;
                set(name, indexedProperty);
```

### SuspiciousSystemArraycopy
`newArray` is not of an array type
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
                final Class<?> componentType = indexedProperty.getClass().getComponentType();
                final Object newArray = Array.newInstance(componentType, index + 1);
                System.arraycopy(indexedProperty, 0, newArray, 0, length);
                indexedProperty = newArray;
                set(name, indexedProperty);
```

## RuleId[id=ClassGetClass]
### ClassGetClass
'getClass()' is called on Class instance
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        if (propertyName == null || propertyName.isEmpty()) {
            throw new IntrospectionException("bad property name: " +
                    propertyName + " on class: " + beanClass.getClass().getName());
        }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `firstEx` may produce `NullPointerException`
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
            throw ConversionException.format("Error converting '%s' to '%s' using  patterns '%s'", toString(sourceType), toString(targetType), displayPatterns);
        }
        throw firstEx;
    }

```

### DataFlowIssue
Argument `defaultNumber` might be null
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        register(BigInteger.class, throwException ? new BigIntegerConverter() : new BigIntegerConverter(bigIntDeflt));
        register(Boolean.class,    throwException ? new BooleanConverter()    : new BooleanConverter(booleanDefault));
        register(Byte.class,       throwException ? new ByteConverter()       : new ByteConverter(defaultNumber));
        register(Character.class,  throwException ? new CharacterConverter()  : new CharacterConverter(charDefault));
        register(Double.class,     throwException ? new DoubleConverter()     : new DoubleConverter(defaultNumber));
```

### DataFlowIssue
Method invocation `getInterfaces` may produce `NullPointerException`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        // the argument class is itself an interface, and when the argument
        // class is an abstract class.
        final Class<?>[] interfaces = initial.getInterfaces();
        for (final Class<?> interface1 : interfaces) {
            final Method method = internalGetMethod(interface1, methodName, parameterCount);
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LOG` from instance context
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    private Log logger() {
        if (LOG == null) {
            LOG = LogFactory.getLog(LazyDynaBean.class);
        }
        return LOG;
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        WeakFastHashMap<K, V> results = null;
        if (fast) {
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'instance' in a Serializable class
in `src/main/java/org/apache/commons/beanutils2/WrapDynaBean.java`
#### Snippet
```java
     * The JavaBean instance wrapped by this WrapDynaBean.
     */
    protected Object instance;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'constructorValues' in a Serializable class
in `src/main/java/org/apache/commons/beanutils2/BasicDynaClass.java`
#### Snippet
```java
     * to create new DynaBean instances.
     */
    protected Object[] constructorValues = { this };

    /**
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is array
in `src/main/java/org/apache/commons/beanutils2/DynaClass.java`
#### Snippet
```java
     * and a bunch of other stuff?</p>
     *
     * @return the set of properties for this DynaClass
     */
    DynaProperty[] getDynaProperties();
```

### MismatchedJavadocCode
Method is specified to return set but the return type is array
in `src/main/java/org/apache/commons/beanutils2/WrapDynaClass.java`
#### Snippet
```java
     * and a bunch of other stuff?</p>
     *
     * @return the set of properties for this DynaClass
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return set but the return type is array
in `src/main/java/org/apache/commons/beanutils2/BasicDynaClass.java`
#### Snippet
```java
     * and a bunch of other stuff?</p>
     *
     * @return the set of properties for this DynaClass
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return set but the return type is array
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
     * {@code getBeanInfo()} instead, which returns property descriptors
     * and a bunch of other stuff?</p>
     * @return the set of properties for this DynaClass
     */
    @Override
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append(toString(getClass()));
        buffer.append("[UseDefault=");
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
     * @return true if the assignment is compatible.
     */
    public static final boolean isAssignmentCompatible(final Class<?> parameterType, final Class<?> parameterization) {
        // try plain assignment
        if (parameterType.isAssignableFrom(parameterization)) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
            }
            else {
                sb.append(value.toString());
            }
            sb.append(')');
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/beanutils2/BeanComparator.java`
#### Snippet
```java
            return internalCompare(value1, value2);
        } catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e.getClass().getSimpleName()+": " + e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/beanutils2/converters/ConverterFacade.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "ConverterFacade[" + converter.toString() + "]";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
                sb.append(']');
            } else {
                sb.append(value.toString());
            }
            sb.append(')');
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
                sb.append(']');
            } else {
                sb.append(value.toString());
            }
            sb.append(')');
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java

        @Override
        protected K iteratorNext(final Map.Entry<K, V> entry) {
            return entry.getKey();
        }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java

        @Override
        protected V iteratorNext(final Map.Entry<K, V> entry) {
            return entry.getValue();
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
     * underlying Converter
     */
    public <T> T[] convert(final String[] values, final Class<T> clazz, final String pattern) {
        return convert(values, clazz, getDefaultLocale(), pattern);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
     * @since 1.8.0
     */
    protected void setPropertyOfMapBean(final Map<String, Object> bean, String propertyName, final Object value)
        throws IllegalArgumentException, IllegalAccessException,
        InvocationTargetException, NoSuchMethodException {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract protected`
in `src/main/java/org/apache/commons/beanutils2/locale/BaseLocaleConverter.java`
#### Snippet
```java
     * @throws ParseException if conversion cannot be performed successfully
     */
    abstract protected T parse(Object value, String pattern) throws ParseException;
}

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/beanutils2/sql/ResultSetDynaClass.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getResultSet() does not allocate.
    public Object getObjectFromResultSet(final String name) throws SQLException {
        return getObject(getResultSet(), name);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/beanutils2/sql/ResultSetIterator.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getResultSet() does not allocate.
    protected void advance() throws SQLException {
        if (!current && !eof) {
            if (dynaClass.getResultSet().next()) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/beanutils2/sql/ResultSetIterator.java`
#### Snippet
```java
    @SuppressWarnings("resource") // getResultSet() does not allocate.
    @Override
    public void set(final String name, final Object value) {
        if (dynaClass.getDynaProperty(name) == null) {
            throw new IllegalArgumentException(name);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/beanutils2/sql/RowSetDynaClass.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // resultSet is not allocated here
    public RowSetDynaClass(final ResultSet resultSet, final boolean lowerCase, final int limit, final boolean useColumnLabel) throws SQLException {
        Objects.requireNonNull(resultSet, "resultSet");
        this.lowerCase = lowerCase;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Map.isEmpty()` is ignored
in `src/main/java/org/apache/commons/beanutils2/ContextClassLoaderLocal.java`
#### Snippet
```java

        // make sure that the map is given a change to purge itself
        valueByClassLoader.isEmpty();
        try {

```

### IgnoreResultOfCall
Result of `Map.isEmpty()` is ignored
in `src/main/java/org/apache/commons/beanutils2/ContextClassLoaderLocal.java`
#### Snippet
```java

        // make sure that the map is given a change to purge itself
        valueByClassLoader.isEmpty();
        try {

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/locale/converters/FloatLocaleConverter.java`
#### Snippet
```java
            throw new ConversionException("Supplied number is not of type Float: " + parsed);
        }
        return Float.valueOf(parsed.floatValue()); // unlike superclass it returns Float type
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    private static final Float FLOAT_ZERO = Float.valueOf((float) 0.0);

    private static final Double DOUBLE_ZERO = Double.valueOf(0.0);

    private static final Character CHARACTER_ZERO = Character.valueOf((char) 0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    private static final Integer INTEGER_ZERO = Integer.valueOf(0);

    private static final Float FLOAT_ZERO = Float.valueOf((float) 0.0);

    private static final Double DOUBLE_ZERO = Double.valueOf(0.0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    private static final Double DOUBLE_ZERO = Double.valueOf(0.0);

    private static final Character CHARACTER_ZERO = Character.valueOf((char) 0);

    private static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    private static final Short SHORT_ZERO = Short.valueOf((short) 0);

    private static final Long LONG_ZERO = Long.valueOf(0);

    private static final Integer INTEGER_ZERO = Integer.valueOf(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
public class BasicDynaBean implements DynaBean, Serializable {

    private static final Short SHORT_ZERO = Short.valueOf((short) 0);

    private static final Long LONG_ZERO = Long.valueOf(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    private static final Character CHARACTER_ZERO = Character.valueOf((char) 0);

    private static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);

    private static final long serialVersionUID = 1L;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    private static final Long LONG_ZERO = Long.valueOf(0);

    private static final Integer INTEGER_ZERO = Integer.valueOf(0);

    private static final Float FLOAT_ZERO = Float.valueOf((float) 0.0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java
        }

        return Long.valueOf(result.longValue());
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            if (writeMethod != null) {
                final Object[] subscript = new Object[2];
                subscript[0] = Integer.valueOf(index);
                subscript[1] = value;
                try {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            if (readMethod != null) {
                final Object[] subscript = new Object[1];
                subscript[0] = Integer.valueOf(index);
                try {
                    return invokeMethod(readMethod,bean, subscript);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java

        // now returns property Short
        return Short.valueOf(parsed.shortValue());
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
public class ConvertUtilsBean {

    private static final Integer ZERO = Integer.valueOf(0);
    private static final Character SPACE = Character.valueOf(' ');

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java

    private static final Integer ZERO = Integer.valueOf(0);
    private static final Character SPACE = Character.valueOf(' ');

    /**
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java

    private static final Integer ZERO = Integer.valueOf(0);
    private static final Integer ONE  = Integer.valueOf(1);

    private String pattern;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
        // Handle Date --> Long
        if (value instanceof Date && Long.class.equals(targetType)) {
            return targetType.cast(Long.valueOf(((Date)value).getTime()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
        // Handle Calendar --> Long
        if (value instanceof Calendar  && Long.class.equals(targetType)) {
            return targetType.cast(Long.valueOf(((Calendar)value).getTime().getTime()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
                throw ConversionException.format("%s value '%s' is too small %s", toString(sourceType), value, toString(targetType));
            }
            return targetType.cast(Byte.valueOf(value.byteValue()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
                throw ConversionException.format("%s value '%s' is too small %s", toString(sourceType), value, toString(targetType));
            }
            return targetType.cast(Short.valueOf(value.shortValue()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
                throw ConversionException.format("%s value '%s' is too small %s", toString(sourceType), value, toString(targetType));
            }
            return targetType.cast(Integer.valueOf(value.intValue()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
        // Long
        if (targetType.equals(Long.class)) {
            return targetType.cast(Long.valueOf(value.longValue()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
                throw ConversionException.format("%s value '%s' is too large for %s", toString(sourceType), value, toString(targetType));
            }
            return targetType.cast(Float.valueOf(value.floatValue()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
        // Double
        if (targetType.equals(Double.class)) {
            return targetType.cast(Double.valueOf(value.doubleValue()));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
public abstract class NumberConverter<N extends Number> extends AbstractConverter<N> {

    private static final Integer ZERO = Integer.valueOf(0);
    private static final Integer ONE  = Integer.valueOf(1);

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
        final Map<Class<? extends Object>, Function<?, ?>> defTransformers = new HashMap<>();
        defTransformers.put(Boolean.TYPE, input -> Boolean.valueOf(input.toString()));
        defTransformers.put(Character.TYPE, input -> Character.valueOf(input.toString().charAt(0)));
        defTransformers.put(Byte.TYPE, input -> Byte.valueOf(input.toString()));
        defTransformers.put(Short.TYPE, input -> Short.valueOf(input.toString()));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/locale/converters/IntegerLocaleConverter.java`
#### Snippet
```java
            throw new ConversionException("Supplied number is not of type Integer: " + parsed.longValue());
        }
        return Integer.valueOf(parsed.intValue()); // unlike superclass it will return proper Integer
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final Float      Float_ZERO      = Float.valueOf((byte)0);
    /** Double Zero */
    protected static final Double     Double_ZERO     = Double.valueOf((byte)0);

    static final LazyDynaBean[] EMPTY_ARRAY = {};
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final Integer    Integer_ZERO    = Integer.valueOf(0);
    /** Long Zero */
    protected static final Long       Long_ZERO       = Long.valueOf(0);
    /** Float Zero */
    protected static final Float      Float_ZERO      = Float.valueOf((byte)0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final Long       Long_ZERO       = Long.valueOf(0);
    /** Float Zero */
    protected static final Float      Float_ZERO      = Float.valueOf((byte)0);
    /** Double Zero */
    protected static final Double     Double_ZERO     = Double.valueOf((byte)0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final Byte       Byte_ZERO       = Byte.valueOf((byte)0);
    /** Short Zero */
    protected static final Short      Short_ZERO      = Short.valueOf((short)0);
    /** Integer Zero */
    protected static final Integer    Integer_ZERO    = Integer.valueOf(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final Short      Short_ZERO      = Short.valueOf((short)0);
    /** Integer Zero */
    protected static final Integer    Integer_ZERO    = Integer.valueOf(0);
    /** Long Zero */
    protected static final Long       Long_ZERO       = Long.valueOf(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final Character  Character_SPACE = Character.valueOf(' ');
    /** Byte Zero */
    protected static final Byte       Byte_ZERO       = Byte.valueOf((byte)0);
    /** Short Zero */
    protected static final Short      Short_ZERO      = Short.valueOf((short)0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected static final BigDecimal BigDecimal_ZERO = new BigDecimal("0");
    /** Character Space */
    protected static final Character  Character_SPACE = Character.valueOf(' ');
    /** Byte Zero */
    protected static final Byte       Byte_ZERO       = Byte.valueOf((byte)0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/converters/CharacterConverter.java`
#### Snippet
```java
    protected <T> T convertToType(final Class<T> type, final Object value) throws Exception {
        if (Character.class.equals(type) || Character.TYPE.equals(type)) {
            return type.cast(Character.valueOf(value.toString().charAt(0)));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ByteLocaleConverter.java`
#### Snippet
```java
        }
        // now returns property Byte
        return Byte.valueOf(parsed.byteValue());
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DoubleLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);
        if (result instanceof Long) {
            return Double.valueOf(result.doubleValue());
        }
        return (Double) result;
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            }
        } else {
            synchronized (map) {
                map.putAll(in);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            return map.containsValue(value);
        }
        synchronized (map) {
            return map.containsValue(value);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            }
        }
        synchronized (map) {
            return map.remove(key);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                }
            } else {
                synchronized (map) {
                    get(map).clear();
                }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            return map.get(key);
        }
        synchronized (map) {
            return map.get(key);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).contains(o);
            }
            synchronized (map) {
                return get(map).contains(o);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).toArray();
            }
            synchronized (map) {
                return get(map).toArray();
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            results = new WeakFastHashMap<>(map);
        } else {
            synchronized (map) {
                results = new WeakFastHashMap<>(map);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            return map.isEmpty();
        }
        synchronized (map) {
            return map.isEmpty();
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).equals(o);
            }
            synchronized (map) {
                return get(map).equals(o);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).hashCode();
            }
            synchronized (map) {
                return get(map).hashCode();
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).size();
            }
            synchronized (map) {
                return get(map).size();
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            return map.size();
        }
        synchronized (map) {
            return map.size();
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            return map.containsKey(key);
        }
        synchronized (map) {
            return map.containsKey(key);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).isEmpty();
            }
            synchronized (map) {
                return get(map).isEmpty();
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                }
            }
            synchronized (map) {
                return get(map).removeAll(o);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            }
        } else {
            synchronized (map) {
                map.clear();
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                }
            }
            synchronized (map) {
                return get(map).retainAll(o);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                }
            }
            synchronized (map) {
                return get(map).remove(o);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            return h;
        }
        synchronized (map) {
            int h = 0;
            for (final Map.Entry<K, V> e : map.entrySet()) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java

        }
        synchronized (map) {
            if (mo.size() != map.size()) {
                return false;
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
            }
        }
        synchronized (map) {
            return map.put(key, value);
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).containsAll(o);
            }
            synchronized (map) {
                return get(map).containsAll(o);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `map`
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                return get(map).toArray(o);
            }
            synchronized (map) {
                return get(map).toArray(o);
            }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
    protected void logWarn(final Exception ex) {
        // Deliberately do not use LOG4J or Commons Logging to avoid dependencies
        System.out.println("WARN: Exception: " + ex);
        ex.printStackTrace();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
    protected void logInfo(final Exception ex) {
        // Deliberately do not use LOG4J or Commons Logging to avoid dependencies
        System.out.println("INFO: Exception: " + ex);
    }

```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
            date = ((Calendar) value).getTime();
        } else if (value instanceof Long) {
            date = new Date(((Long) value).longValue());
        } else if (value instanceof LocalDateTime) {
            date = java.sql.Timestamp.valueOf(((LocalDateTime) value));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        if (value instanceof Long) {
            final Long longObj = (Long) value;
            return toDate(targetType, longObj.longValue());
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
        // Handle Boolean
        if (value instanceof Boolean) {
            return toNumber(sourceType, targetType, ((Boolean)value).booleanValue() ? ONE : ZERO);
        }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `containsValue()` only delegates to its super method
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     */
    @Override
    public boolean containsValue(final Object value) {
        // use default implementation
        return super.containsValue(value);
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/FloatLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link ByteLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, Float> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/StringLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link StringLocaleConverter}.
     */
    public static class Builder extends BaseLocaleConverter.Builder<Builder, String> {

        /**
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimeLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link SqlTimeLocaleConverter}.
     */
    public static class Builder extends DateLocaleConverter.Builder<Builder, Time> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link ByteLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, Long> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link ByteLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, Short> {

        /**
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
     * @param <D> The Date type.
     */
    public static class Builder<B extends Builder<B, D>, D extends Date> extends BaseLocaleConverter.Builder<B, D> {

        /** Should the date conversion be lenient? */
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigIntegerLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link BigIntegerLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, BigInteger> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     * Map entry used by {@link BeanMap}.
     */
    protected static class Entry extends AbstractMap.SimpleEntry<String, Object> {

        private static final long serialVersionUID = 1L;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/IntegerLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link ByteLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, Integer> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigDecimalLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link BigDecimalLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, BigDecimal> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimestampLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link SqlTimestampLocaleConverter}.
     */
    public static class Builder extends DateLocaleConverter.Builder<Builder, Timestamp> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlDateLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link SqlDateLocaleConverter}.
     */
    public static class Builder extends DateLocaleConverter.Builder<Builder, Date> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ByteLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link ByteLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, Byte> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DoubleLocaleConverter.java`
#### Snippet
```java
     * Builds instances of {@link ByteLocaleConverter}.
     */
    public static class Builder extends DecimalLocaleConverter.Builder<Builder, Double> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DecimalLocaleConverter.java`
#### Snippet
```java
     * @param <T> The Number type.
     */
    public static class Builder<B extends Builder<B, T>, T extends Number> extends BaseLocaleConverter.Builder<B, T> {

        /**
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/OffsetDateTimeConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.OffsetDateTime
 */
public final class OffsetDateTimeConverter extends DateTimeConverter<OffsetDateTime> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/ZoneIdConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.ZoneId
 */
public final class ZoneIdConverter extends AbstractConverter<ZoneId> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/PeriodConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.Period
 */
public final class PeriodConverter extends AbstractConverter<Period> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/OffsetTimeConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.OffsetTime
 */
public final class OffsetTimeConverter extends AbstractConverter<OffsetTime> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanPropertyValueEqualsPredicate.java`
#### Snippet
```java
 * @param <V> The property value type.
 *
 * @see org.apache.commons.beanutils2.PropertyUtils
 * @see java.util.function.Predicate
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanPropertyValueEqualsPredicate.java`
#### Snippet
```java
 *
 * @see org.apache.commons.beanutils2.PropertyUtils
 * @see java.util.function.Predicate
 */
public class BeanPropertyValueEqualsPredicate<T, V> implements Predicate<T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanPropertyValueChangeConsumer.java`
#### Snippet
```java
 * @param <V> The property value type.
 *
 * @see org.apache.commons.beanutils2.PropertyUtils
 * @see java.util.function.Consumer
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanPropertyValueChangeConsumer.java`
#### Snippet
```java
 *
 * @see org.apache.commons.beanutils2.PropertyUtils
 * @see java.util.function.Consumer
 */
public class BeanPropertyValueChangeConsumer<T, V> implements Consumer<T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/FloatLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.math.BigDecimal} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2.locale` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/StringLocaleConverter.java`
#### Snippet
```java

/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive object into a {@link String}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/StringLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive object into a {@link String}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
public class StringLocaleConverter extends BaseLocaleConverter<String> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimeLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.sql.Time} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error
 * occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimeLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.sql.Time} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error
 * occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimeLocaleConverter.java`
#### Snippet
```java
    protected Time parse(final Object value, final String pattern) throws ParseException {
        // MUST cast to java.util.Date to avoid a CCE.
        return new Time(((java.util.Date) super.parse(value, pattern)).getTime());
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
        // conversion format patterns of java.sql.* types should correspond to default
        // behavior of toString and valueOf methods of these classes
        converter.put(java.sql.Date.class, SqlDateLocaleConverter.builder().setLocale(locale).setPattern("yyyy-MM-dd").get());
        converter.put(java.sql.Time.class, SqlTimeLocaleConverter.builder().setLocale(locale).setPattern("HH:mm:ss").get());
        converter.put(java.sql.Timestamp.class, SqlTimestampLocaleConverter.builder().setLocale(locale).setPattern("yyyy-MM-dd HH:mm:ss.S").get());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
        // behavior of toString and valueOf methods of these classes
        converter.put(java.sql.Date.class, SqlDateLocaleConverter.builder().setLocale(locale).setPattern("yyyy-MM-dd").get());
        converter.put(java.sql.Time.class, SqlTimeLocaleConverter.builder().setLocale(locale).setPattern("HH:mm:ss").get());
        converter.put(java.sql.Timestamp.class, SqlTimestampLocaleConverter.builder().setLocale(locale).setPattern("yyyy-MM-dd HH:mm:ss.S").get());

```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
        converter.put(java.sql.Date.class, SqlDateLocaleConverter.builder().setLocale(locale).setPattern("yyyy-MM-dd").get());
        converter.put(java.sql.Time.class, SqlTimeLocaleConverter.builder().setLocale(locale).setPattern("HH:mm:ss").get());
        converter.put(java.sql.Timestamp.class, SqlTimestampLocaleConverter.builder().setLocale(locale).setPattern("yyyy-MM-dd HH:mm:ss.S").get());

        converter.setFast(true);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/DynaProperty.java`
#### Snippet
```java
    /**
     * Checks this instance against the specified Object for equality. Overrides the
     * default reference test for equality provided by {@link java.lang.Object#equals(Object)}
     * @param obj The object to compare to
     * @return {@code true} if object is a dyna property with the same name
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
            date = new Date(((Long) value).longValue());
        } else if (value instanceof LocalDateTime) {
            date = java.sql.Timestamp.valueOf(((LocalDateTime) value));
        } else if (value instanceof LocalDate) {
            date = java.sql.Date.valueOf(((LocalDate) value));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java

        // java.sql.Time
        if (type.equals(java.sql.Time.class)) {
            try {
                return type.cast(java.sql.Time.valueOf(value));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        if (type.equals(java.sql.Time.class)) {
            try {
                return type.cast(java.sql.Time.valueOf(value));
            } catch (final IllegalArgumentException e) {
                throw new ConversionException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java

        // java.sql.Timestamp
        if (type.equals(java.sql.Timestamp.class)) {
            try {
                return type.cast(java.sql.Timestamp.valueOf(value));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        if (type.equals(java.sql.Timestamp.class)) {
            try {
                return type.cast(java.sql.Timestamp.valueOf(value));
            } catch (final IllegalArgumentException e) {
                throw new ConversionException(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java

        // java.sql.Time
        if (type.equals(java.sql.Time.class)) {
            return type.cast(new java.sql.Time(value));
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        // java.sql.Time
        if (type.equals(java.sql.Time.class)) {
            return type.cast(new java.sql.Time(value));
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java

        // java.sql.Timestamp
        if (type.equals(java.sql.Timestamp.class)) {
            return type.cast(new java.sql.Timestamp(value));
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        // java.sql.Timestamp
        if (type.equals(java.sql.Timestamp.class)) {
            return type.cast(new java.sql.Timestamp(value));
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java

        // Handle java.sql.Timestamp
        if (value instanceof java.sql.Timestamp) {


```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
            //      didn't include the milliseconds. The following code
            //      ensures it works consistently across JDK versions
            final java.sql.Timestamp timestamp = (java.sql.Timestamp)value;
            long timeInMillis = ((timestamp.getTime() / 1000) * 1000);
            timeInMillis += timestamp.getNanos() / 1000000;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
            //      didn't include the milliseconds. The following code
            //      ensures it works consistently across JDK versions
            final java.sql.Timestamp timestamp = (java.sql.Timestamp)value;
            long timeInMillis = ((timestamp.getTime() / 1000) * 1000);
            timeInMillis += timestamp.getNanos() / 1000000;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
        if (value instanceof Number ||
            value instanceof Boolean ||
            value instanceof java.util.Date) {
            final List<Object> list = new ArrayList<>(1);
            list.add(value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/LazyDynaClass.java`
#### Snippet
```java
    @Override
    public void add(final String name, final Class<?> type, final boolean readable, final boolean writable) {
        throw new java.lang.UnsupportedOperationException("readable/writable properties not supported");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/YearMonthConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.YearMonth
 */
public final class YearMonthConverter extends AbstractConverter<YearMonth> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        final Object invokeResult = invokeMethod(readMethod, bean, BeanUtils.EMPTY_OBJECT_ARRAY);
        /* test and fetch from the map */
        if (invokeResult instanceof java.util.Map) {
          final java.util.Map<String, Object> map = toPropertyMap(invokeResult);
          map.put(key, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        /* test and fetch from the map */
        if (invokeResult instanceof java.util.Map) {
          final java.util.Map<String, Object> map = toPropertyMap(invokeResult);
          map.put(key, value);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        final Object invokeResult = invokeMethod(readMethod, bean, BeanUtils.EMPTY_OBJECT_ARRAY);
        /* test and fetch from the map */
        if (invokeResult instanceof java.util.Map) {
          result = ((java.util.Map<?, ?>)invokeResult).get(key);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        /* test and fetch from the map */
        if (invokeResult instanceof java.util.Map) {
          result = ((java.util.Map<?, ?>)invokeResult).get(key);
        }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        final Object value = invokeMethod(readMethod, bean, BeanUtils.EMPTY_OBJECT_ARRAY);
        if (!value.getClass().isArray()) {
            if (!(value instanceof java.util.List)) {
                throw new IllegalArgumentException("Property '" + name +
                        "' is not indexed on bean class '" + bean.getClass() + "'");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            //get the List's value
            return ((java.util.List<?>) value).get(index);
        }
        //get the array's value
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a {@link Long}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
public class LongLocaleConverter extends DecimalLocaleConverter<Long> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a {@link Short}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
public class ShortLocaleConverter extends DecimalLocaleConverter<Short> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/ZonedDateTimeConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.ZonedDateTime
 */
public final class ZonedDateTimeConverter extends DateTimeConverter<ZonedDateTime> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        register(Class.class,          throwException ? new ClassConverter<>()        : new ClassConverter<>(null));
        register(Enum.class,           throwException ? new EnumConverter()           : new EnumConverter(null));
        register(java.util.Date.class, throwException ? new DateConverter()           : new DateConverter(null));
        register(Calendar.class,       throwException ? new CalendarConverter()       : new CalendarConverter(null));
        register(File.class,           throwException ? new FileConverter()           : new FileConverter(null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        register(File.class,           throwException ? new FileConverter()           : new FileConverter(null));
        register(Path.class,           throwException ? new PathConverter()           : new PathConverter(null));
        register(java.sql.Date.class,  throwException ? new SqlDateConverter()        : new SqlDateConverter(null));
        register(java.sql.Time.class,  throwException ? new SqlTimeConverter()        : new SqlTimeConverter(null));
        register(Timestamp.class,      throwException ? new SqlTimestampConverter()   : new SqlTimestampConverter(null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        register(Path.class,           throwException ? new PathConverter()           : new PathConverter(null));
        register(java.sql.Date.class,  throwException ? new SqlDateConverter()        : new SqlDateConverter(null));
        register(java.sql.Time.class,  throwException ? new SqlTimeConverter()        : new SqlTimeConverter(null));
        register(Timestamp.class,      throwException ? new SqlTimestampConverter()   : new SqlTimestampConverter(null));
        register(URL.class,            throwException ? new URLConverter()            : new URLConverter(null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        registerArrayConverter(Class.class,          new ClassConverter(),         throwException, defaultArraySize);
        registerArrayConverter(Enum.class,           new EnumConverter(),          throwException, defaultArraySize);
        registerArrayConverter(java.util.Date.class, new DateConverter(),          throwException, defaultArraySize);
        registerArrayConverter(Calendar.class,       new CalendarConverter(),      throwException, defaultArraySize);
        registerArrayConverter(File.class,           new FileConverter(),          throwException, defaultArraySize);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        registerArrayConverter(File.class,           new FileConverter(),          throwException, defaultArraySize);
        registerArrayConverter(Path.class,           new PathConverter(),          throwException, defaultArraySize);
        registerArrayConverter(java.sql.Date.class,  new SqlDateConverter(),       throwException, defaultArraySize);
        registerArrayConverter(java.sql.Time.class,  new SqlTimeConverter(),       throwException, defaultArraySize);
        registerArrayConverter(Timestamp.class,      new SqlTimestampConverter(),  throwException, defaultArraySize);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        registerArrayConverter(Path.class,           new PathConverter(),          throwException, defaultArraySize);
        registerArrayConverter(java.sql.Date.class,  new SqlDateConverter(),       throwException, defaultArraySize);
        registerArrayConverter(java.sql.Time.class,  new SqlTimeConverter(),       throwException, defaultArraySize);
        registerArrayConverter(Timestamp.class,      new SqlTimestampConverter(),  throwException, defaultArraySize);
        registerArrayConverter(URL.class,            new URLConverter(),           throwException, defaultArraySize);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2.locale` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java

/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@code java.util.Date} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error
 * occurs.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@code java.util.Date} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error
 * occurs.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java

        // Handle Calendar
        if (value instanceof java.util.Calendar) {
            return (D) ((java.util.Calendar) value).getTime();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
        // Handle Calendar
        if (value instanceof java.util.Calendar) {
            return (D) ((java.util.Calendar) value).getTime();
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
     *
     * @return true if the {@code DateFormat} used for formatting is lenient
     * @see java.text.DateFormat#isLenient
     */
    public boolean isLenient() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/LocalDateTimeConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.LocalDateTime
 */
public final class LocalDateTimeConverter extends DateTimeConverter<LocalDateTime> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/DefaultBeanIntrospector.java`
#### Snippet
```java

    /** Constant for arguments types of a method that expects a list argument. */
    private static final Class<?>[] LIST_CLASS_PARAMETER = new Class[] { java.util.List.class };

    /** For logging. Each subclass gets its own log instance. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/LocalTimeConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.LocalTime
 */
public final class LocalTimeConverter extends AbstractConverter<LocalTime> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/sql/JDBCDynaClass.java`
#### Snippet
```java
            final int sqlType = metadata.getColumnType(i);
            switch (sqlType) {
            case java.sql.Types.DATE:
                return new DynaProperty(name, java.sql.Date.class);
            case java.sql.Types.TIMESTAMP:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/JDBCDynaClass.java`
#### Snippet
```java
            switch (sqlType) {
            case java.sql.Types.DATE:
                return new DynaProperty(name, java.sql.Date.class);
            case java.sql.Types.TIMESTAMP:
                return new DynaProperty(name, java.sql.Timestamp.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/sql/JDBCDynaClass.java`
#### Snippet
```java
            case java.sql.Types.DATE:
                return new DynaProperty(name, java.sql.Date.class);
            case java.sql.Types.TIMESTAMP:
                return new DynaProperty(name, java.sql.Timestamp.class);
            case java.sql.Types.TIME:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/JDBCDynaClass.java`
#### Snippet
```java
                return new DynaProperty(name, java.sql.Date.class);
            case java.sql.Types.TIMESTAMP:
                return new DynaProperty(name, java.sql.Timestamp.class);
            case java.sql.Types.TIME:
                return new DynaProperty(name, java.sql.Time.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/sql/JDBCDynaClass.java`
#### Snippet
```java
            case java.sql.Types.TIMESTAMP:
                return new DynaProperty(name, java.sql.Timestamp.class);
            case java.sql.Types.TIME:
                return new DynaProperty(name, java.sql.Time.class);
            default:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/JDBCDynaClass.java`
#### Snippet
```java
                return new DynaProperty(name, java.sql.Timestamp.class);
            case java.sql.Types.TIME:
                return new DynaProperty(name, java.sql.Time.class);
            default:
                className = metadata.getColumnClassName(i);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/MonthDayConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.MonthDay
 */
public final class MonthDayConverter extends AbstractConverter<MonthDay> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/ZoneOffsetConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.ZoneOffset
 */
public final class ZoneOffsetConverter extends AbstractConverter<ZoneOffset> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigIntegerLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.math.BigInteger} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigIntegerLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.math.BigInteger} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/DurationConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.Duration
 */
public final class DurationConverter extends AbstractConverter<Duration> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/IntegerLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a {@link Integer}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
public class IntegerLocaleConverter extends DecimalLocaleConverter<Integer> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigDecimalLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.math.BigDecimal} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigDecimalLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.math.BigDecimal} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
 * <p>where {@code <strong>Property</strong>} must be replaced
 * by the name of the property.
 * @see java.beans.PropertyDescriptor
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimestampLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.sql.Timestamp} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimestampLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.sql.Timestamp} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion
 * error occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimestampLocaleConverter.java`
#### Snippet
```java
    protected Timestamp parse(final Object value, final String pattern) throws ParseException {
        // MUST cast to java.util.Date to avoid a CCE.
        return new Timestamp(((java.util.Date) super.parse(value, pattern)).getTime());
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
     * @return null if matching accessible constructor can not be found.
     * @see Class#getConstructor
     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)
     */
    public static <T> Constructor<T> getAccessibleConstructor(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
     * @return null if matching accessible constructor can not be found
     * @see Class#getConstructor
     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)
     */
    public static <T> Constructor<T> getAccessibleConstructor(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/LocalDateConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.LocalDate
 */
public final class LocalDateConverter extends DateTimeConverter<LocalDate> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanToPropertyValueTransformer.java`
#### Snippet
```java
 * @param <R> the type of the result of the function
 *
 * @see org.apache.commons.beanutils2.PropertyUtils
 * @see java.util.function.Function
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanToPropertyValueTransformer.java`
#### Snippet
```java
 *
 * @see org.apache.commons.beanutils2.PropertyUtils
 * @see java.util.function.Function
 */
public class BeanToPropertyValueTransformer<T, R> implements Function<T, R> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/converters/YearConverter.java`
#### Snippet
```java
 *
 * @since 2.0
 * @see java.time.Year
 */
public final class YearConverter extends AbstractConverter<Year> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlDateLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.sql.Date} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error
 * occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlDateLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a
 * {@link java.sql.Date} object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error
 * occurs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            methodName.equals(md.methodName) &&
            cls.equals(md.cls) &&
            java.util.Arrays.equals(paramTypes, md.paramTypes);
        }
        /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ByteLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a {@link Byte}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
public class ByteLocaleConverter extends DecimalLocaleConverter<Byte> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DoubleLocaleConverter.java`
#### Snippet
```java
/**
 * Standard {@link org.apache.commons.beanutils2.locale.LocaleConverter} implementation that converts an incoming locale-sensitive String into a {@link Double}
 * object, optionally using a default value or throwing a {@link org.apache.commons.beanutils2.ConversionException} if a conversion error occurs.
 */
public class DoubleLocaleConverter extends DecimalLocaleConverter<Double> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        if (bean == null) {
        //            return (Collections.EMPTY_MAP);
            return new java.util.HashMap<>();
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
    @Override
    public void add(final String name, final Class<?> type, final boolean readable, final boolean writable) {
        throw new java.lang.UnsupportedOperationException("readable/writable properties not supported");
    }

```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
        // Deliberately do not use LOG4J or Commons Logging to avoid dependencies
        System.out.println("WARN: Exception: " + ex);
        ex.printStackTrace();
    }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BaseDynaBeanMapDecorator()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/BaseDynaBeanMapDecorator.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the {@link DynaBean} is null.
     */
    public BaseDynaBeanMapDecorator(final DynaBean dynaBean, final boolean readOnly) {
        if (dynaBean == null) {
            throw new IllegalArgumentException("DynaBean is null");
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseDynaBeanMapDecorator()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/BaseDynaBeanMapDecorator.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the {@link DynaBean} is null.
     */
    public BaseDynaBeanMapDecorator(final DynaBean dynaBean) {
        this(dynaBean, true);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CollectionView()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
        }

        public CollectionView() {
        }
        @Override
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractConverter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
     * occurs converting the value.
     */
    public AbstractConverter(final D defaultValue) {
        setDefaultValue(defaultValue);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractConverter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
     * {@code ConversionException} if an error occurs.
     */
    public AbstractConverter() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `DateTimeConverter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
     * {@code ConversionException} if an error occurs.
     */
    public DateTimeConverter() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `DateTimeConverter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
     * occurs converting the value.
     */
    public DateTimeConverter(final D defaultValue) {
        super(defaultValue);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `NumberConverter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
     * @param allowDecimals Indicates whether decimals are allowed
     */
    public NumberConverter(final boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `NumberConverter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
     * @param defaultValue The default value to be returned
     */
    public NumberConverter(final boolean allowDecimals, final N defaultValue) {
        this.allowDecimals = allowDecimals;
        setDefaultValue(defaultValue);
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `expected` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
        private class CollectionViewIterator implements Iterator<E> {

            private Map<K, V> expected;
            private Map.Entry<K, V> lastReturned;
            private final Iterator<Map.Entry<K, V>> iterator;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastReturned` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java

            private Map<K, V> expected;
            private Map.Entry<K, V> lastReturned;
            private final Iterator<Map.Entry<K, V>> iterator;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `CACHE_METHODS` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
     * which may introduce memory-leak problems.
     */
    private static boolean CACHE_METHODS = true;

    /**
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     * @param newValue the new value for that property
     */
    protected void firePropertyChange(final Object key, final Object oldValue, final Object newValue) {
        // noop
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
            try {
                target = getPropertyUtils().getProperty(target, resolver.next(name));
                name = resolver.remove(name);
            } catch (final NoSuchMethodException e) {
                return; // Skip this property setter
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
        }

        value = convertArray(value);

        // Missing Value
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java

        // Trim any matching '{' and '}' delimiters
        value = toTrim(value);
        if (value.startsWith("{") && value.endsWith("}")) {
            value = value.substring(1, value.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
        value = toTrim(value);
        if (value.startsWith("{") && value.endsWith("}")) {
            value = value.substring(1, value.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                        "' on bean class '" + bean.getClass() + "'");
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Remove any subscript from the final name value
        name = resolver.getProperty(name);

        // Treat WrapDynaBean as special case - may be a write-only property
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        // (see Jira issue# BEANUTILS-61)
        if (bean instanceof WrapDynaBean) {
            bean = ((WrapDynaBean)bean).getInstance();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Isolate the name
        name = resolver.getProperty(name);

        // Set the specified indexed property value
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                        "' on bean class '" + bean.getClass() + "'");
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Remove any subscript from the final name value
        name = resolver.getProperty(name);

        // Treat WrapDynaBean as special case - may be a read-only property
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        // (see Jira issue# BEANUTILS-61)
        if (bean instanceof WrapDynaBean) {
            bean = ((WrapDynaBean)bean).getInstance();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                        "' on bean class '" + bean.getClass() + "'");
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Remove any subscript from the final name value
        name = resolver.getProperty(name);

        // Look up and return this property from our cache
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                        "' on bean class '" + bean.getClass() + "'");
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Remove any subscript from the final name value
        name = resolver.getProperty(name);

        // Special handling for DynaBeans
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                        "' on bean class '" + bean.getClass() + "'");
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        if (bean instanceof Map) {
            bean = getPropertyOfMapBean((Map<?, ?>) bean, name);
        } else if (resolver.isMapped(name)) {
            bean = getMappedProperty(bean, name);
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            bean = getPropertyOfMapBean((Map<?, ?>) bean, name);
        } else if (resolver.isMapped(name)) {
            bean = getMappedProperty(bean, name);
        } else if (resolver.isIndexed(name)) {
            bean = getIndexedProperty(bean, name);
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            bean = getMappedProperty(bean, name);
        } else if (resolver.isIndexed(name)) {
            bean = getIndexedProperty(bean, name);
        } else {
            bean = getSimpleProperty(bean, name);
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            bean = getIndexedProperty(bean, name);
        } else {
            bean = getSimpleProperty(bean, name);
        }
        return bean;
```

### AssignmentToMethodParameter
Assignment to method parameter `propertyName`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            final String name = resolver.getProperty(propertyName);
            if (name == null || name.isEmpty()) {
                propertyName = resolver.getKey(propertyName);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Isolate the name
        name = resolver.getProperty(name);

        // Request the specified indexed property value
```

### AssignmentToMethodParameter
Assignment to method parameter `propertyName`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            final String name = resolver.getProperty(propertyName);
            if (name == null || name.isEmpty()) {
                propertyName = resolver.getKey(propertyName);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bean`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                         "' on bean class '" + bean.getClass() + "'");
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            bean = nestedBean;
            name = resolver.remove(name);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Isolate the name
        name = resolver.getProperty(name);

        // Request the specified indexed property value
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Isolate the name
        name = resolver.getProperty(name);

        // Request the specified indexed property value
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
            return null;
        }
        value = Array.get(value, 0);
        if (value == null) {
            return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java

        if (localizedPattern) {
            pattern = convertLocalizedPattern(pattern, locale);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
                    final Class<? extends Object> paramType = paramTypes[0];
                    if (!paramType.isAssignableFrom(value.getClass())) {
                        value = convertType(paramType, value);
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `indexedProperty`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
                final Object newArray = Array.newInstance(componentType, index + 1);
                System.arraycopy(indexedProperty, 0, newArray, 0, length);
                indexedProperty = newArray;
                set(name, indexedProperty);
                final int newLength = Array.getLength(indexedProperty);
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java

        if (null == args) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java

        if (parameterTypes == null) {
            parameterTypes = BeanUtils.EMPTY_CLASS_ARRAY;
        }
        if (args == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
        }
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java

        if (null == args) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java

        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java

        if (parameterTypes == null) {
            parameterTypes = BeanUtils.EMPTY_CLASS_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `dynaBeanClass`
in `src/main/java/org/apache/commons/beanutils2/BasicDynaClass.java`
#### Snippet
```java
        }
        if (dynaBeanClass == null) {
            dynaBeanClass = BasicDynaBean.class;
        }
        setDynaBeanClass(dynaBeanClass);
```

### AssignmentToMethodParameter
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java

        if (parameterTypes == null) {
            parameterTypes = BeanUtils.EMPTY_CLASS_ARRAY;
        }
        if (args == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        }
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `srcClass`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            }
            cost++;
            srcClass = srcClass.getSuperclass();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        boolean sameClass = true;
        if (clazz == null) {
            clazz = method.getDeclaringClass();
        } else {
            if (!method.getDeclaringClass().isAssignableFrom(clazz)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `method`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java

        // Check the implemented interfaces and subinterfaces
        method =
                getAccessibleMethodFromInterfaceNest(clazz,
                        methodName,
```

### AssignmentToMethodParameter
Assignment to method parameter `method`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        // Check the superclass chain
        if (method == null) {
            method = getAccessibleMethodFromSuperclass(clazz,
                        methodName,
                        parameterTypes);
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java

        if (parameterTypes == null) {
            parameterTypes = BeanUtils.EMPTY_CLASS_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java

        if (parameterTypes == null) {
            parameterTypes = BeanUtils.EMPTY_CLASS_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
                    InvocationTargetException {
        if (parameterTypes == null) {
            parameterTypes = BeanUtils.EMPTY_CLASS_ARRAY;
        }
        if (args == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        }
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `paramTypes`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            }
            if (paramTypes == null) {
                paramTypes = BeanUtils.EMPTY_CLASS_ARRAY;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java

        // Search up the superclass chain
        for (; clazz != null; clazz = clazz.getSuperclass()) {

            // Check the implemented interfaces of the parent class
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
                    return;
                }
                name = resolver.remove(name);
            } catch (final NoSuchMethodException e) {
                return; // Skip this property setter
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
            try {
                target = getPropertyUtils().getProperty(target, resolver.next(name));
                name = resolver.remove(name);
            } catch (final NoSuchMethodException e) {
                return; // Skip this property setter
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        // Convert the specified value to the required type and store it
        if (index >= 0) {                    // Destination must be indexed
            value = convertForCopy(value, type.getComponentType());
            try {
                getPropertyUtils().setIndexedProperty(target, propName,
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
            }
        } else {                             // Destination must be simple
            value = convertForCopy(value, type);
            try {
                getPropertyUtils().setSimpleProperty(target, propName, value);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-27-09-56-52.993.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/apache/commons/beanutils2/locale/BaseLocaleConverter.java`
#### Snippet
```java
                return getDefaultAs(targetType);
            }
            if (e instanceof ConversionException) {
                throw (ConversionException) e;
            }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BeanIntrospectionData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BaseDynaBeanMapDecorator.java`
#### Snippet
```java
     */
    private String toString(final Object obj) {
        return obj == null ? null : obj.toString();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/locale/BaseLocaleConverter.java`
#### Snippet
```java

        if (result == null) {
            return null;
        }
        if (type.isInstance(result)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/locale/BaseLocaleConverter.java`
#### Snippet
```java
            // so do not: throw new ConversionException("No value specified");
            LOG.debug("Null value specified for conversion, returning null");
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
            final DynaProperty dynaProperty = dynaClass.getDynaProperty(propName);
            if (dynaProperty == null) {
                return null; // Skip this property setter
            }
            type = dynaProperty.getType();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
                        getPropertyUtils().getPropertyDescriptor(target, name);
                if (descriptor == null) {
                    return null; // Skip this property setter
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
            }
            catch (final NoSuchMethodException e) {
                return null; // Skip this property setter
            }
            if (descriptor instanceof MappedPropertyDescriptor) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
    protected Object getDefault(final Class<?> type) {
        if (type.equals(String.class)) {
            return null;
        }
        return defaultValue;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
    protected Object convertArray(final Object value) {
        if (value == null) {
            return null;
        }
        if (value.getClass().isArray()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
                return Array.get(value, 0);
            }
            return null;
        }
        if (value instanceof Collection) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
                return collection.iterator().next();
            }
            return null;
        }
        return value;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
    protected Object getDefault(final Class<?> type) {
        if (type.equals(String.class)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
        final Object defaultValue = super.getDefault(type);
        if (defaultValue == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
            return SHORT_ZERO;
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        // creating and adding it to the cache if not found.
        if (name == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
    Map getMappedPropertyDescriptors(final Object bean) {
        if (bean == null) {
            return null;
        }
        return getMappedPropertyDescriptors(bean.getClass());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            return descriptor.getPropertyEditorClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                    ((DynaBean) bean).getDynaClass().getDynaProperty(name);
            if (descriptor == null) {
                return null;
            }
            final Class<?> type = descriptor.getType();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            final Class<?> type = descriptor.getType();
            if (type == null) {
                return null;
            }
            if (type.isArray()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
                getPropertyDescriptor(bean, name);
        if (descriptor == null) {
            return null;
        }
        if (descriptor instanceof IndexedPropertyDescriptor) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
    Map<Class<?>, Map> getMappedPropertyDescriptors(final Class<?> beanClass) {
        if (beanClass == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java

        if (value == null) {
            return null;
        }
        if (!value.getClass().isArray()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        }
        if (Array.getLength(value) < 1) {
            return null;
        }
        value = Array.get(value, 0);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        value = Array.get(value, 0);
        if (value == null) {
            return null;
        }
        final Converter<String> converter = lookup(String.class);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
    private String convertLocalizedPattern(final String localizedPattern, final Locale locale) {
        if (localizedPattern == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ContextClassLoaderLocal.java`
#### Snippet
```java
     */
    protected T initialValue() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
        // Property doesn't exist
        if (!isDynaProperty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
                        type.getName() + "' for '" + name + "' ", ex);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
     */
    protected Object createNumberProperty(final String name, final Class<?> type) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected Object createProperty(final String name, final Class<?> type) {
        if (type == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
            Date.class.isAssignableFrom(type)) {

            return null;

        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
                logger().warn("Error instantiating property of type '" + type.getName() + "' for '" + name + "' ", ex);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
            return Character_SPACE;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
            throws IntrospectionException {
        if (methodName == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
                return classLoader.loadClass(name);
            } catch (final ClassNotFoundException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        private Method get() {
            if (methodRef == null) {
                return null;
            }
            Method m = methodRef.get();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
                                           throws IntrospectionException {
        if (methodName == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
        // Make sure we have a method to check
        if (ctor == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
        // If the requested method is not public we cannot call it
        if (!Modifier.isPublic(ctor.getModifiers())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java

        // what else can we do?
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
                klass.getConstructor(parameterTypes));
        } catch (final NoSuchMethodException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/ConstructorUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
    public String getKey(final String expression) {
        if (expression == null || expression.isEmpty()) {
            return null;
        }
        for (int i = 0; i < expression.length(); i++) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
            final char c = expression.charAt(i);
            if (c == NESTED || c == INDEXED_START) {
                return null;
            }
            if (c == MAPPED_START) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
    public String remove(final String expression) {
        if (expression == null || expression.isEmpty()) {
            return null;
        }
        final String property = next(expression);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
        final String property = next(expression);
        if (expression.length() == property.length()) {
            return null;
        }
        int start = property.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
    public String next(final String expression) {
        if (expression == null || expression.isEmpty()) {
            return null;
        }
        boolean indexed = false;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        // Make sure we have a method to check
        if (method == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        // If the requested method is not public we cannot call it
        if (!Modifier.isPublic(method.getModifiers())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            return method;
        } catch (final NoSuchMethodException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        // Make sure we have a method to check
        if (method == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            LOG.debug("Not a known primitive wrapper class: " + wrapperType);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            return Character.class;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
                    return parentClazz.getMethod(methodName, parameterTypes);
                } catch (final NoSuchMethodException e) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
            parentClazz = parentClazz.getSuperclass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java

        // We did not find anything
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
                log.warn("Throwable does not have initCause() method in JDK 1.3");
            }
            return null;
        } catch (final Throwable e) {
            final Log log = LogFactory.getLog(BeanUtils.class);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
                log.warn("Error getting the Throwable initCause() method", e);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        final Object value = getPropertyUtils().getProperty(bean, name);
        if (value == null) {
            return null;
        }
        if (value instanceof Collection) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        }
        if (value instanceof Collection) {
            return ((Collection<?>) value).stream().map(item -> item != null ? getConvertUtils().convert(item) : null).toArray(String[]::new);
        }
        if (!value.getClass().isArray()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
        // create a new DynaProperty
        if (value == null && isReturnNull()) {
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `calendar` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
            throw new ConversionException(msg);
        }
        final Calendar calendar = format.getCalendar();
        return calendar;
    }
```

### UnnecessaryLocalVariable
Local variable `answer` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
                }
            }
            final Object[] answer = { value };
            return answer;
        } catch (final InvocationTargetException e) {
```

### UnnecessaryLocalVariable
Local variable `temp` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
            final
            // The new map is used as properties map
            Map<String, Object> temp = getMap().getClass().newInstance();
            newMap = temp;
        } catch (final Exception ex) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
    public void putAll(final Map<? extends K, ? extends V> in) {
        if (fast) {
            synchronized (this) {
                final Map<K, V> temp =  cloneMap(map);
                temp.putAll(in);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
    public V remove(final Object key) {
        if (fast) {
            synchronized (this) {
                final Map<K, V> temp = cloneMap(map);
                final V result = temp.remove(key);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
        public void clear() {
            if (fast) {
                synchronized (WeakFastHashMap.this) {
                    map = createMap();
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
        public boolean removeAll(final Collection<?> o) {
            if (fast) {
                synchronized (WeakFastHashMap.this) {
                    final Map<K, V> temp = cloneMap(map);
                    final boolean r = get(temp).removeAll(o);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
                }
                if (fast) {
                    synchronized (WeakFastHashMap.this) {
                        if (expected != map) {
                            throw new ConcurrentModificationException();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
    public void clear() {
        if (fast) {
            synchronized (this) {
                map = createMap();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
        public boolean retainAll(final Collection<?> o) {
            if (fast) {
                synchronized (WeakFastHashMap.this) {
                    final Map<K, V> temp = cloneMap(map);
                    final boolean r = get(temp).retainAll(o);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
        public boolean remove(final Object o) {
            if (fast) {
                synchronized (WeakFastHashMap.this) {
                    final Map<K, V> temp = cloneMap(map);
                    final boolean r = get(temp).remove(o);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
    public V put(final K key, final V value) {
        if (fast) {
            synchronized (this) {
                final Map<K, V> temp = cloneMap(map);
                final V result = temp.put(key, value);
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanUtils.java`
#### Snippet
```java
     * @see BeanUtilsBean#populate
     */
    public static void populate(final Object bean, final Map<String, ? extends Object> properties)
        throws IllegalAccessException, InvocationTargetException {

```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BaseDynaBeanMapDecorator.java`
#### Snippet
```java
     */
    @Override
    public void putAll(final Map<? extends K, ? extends Object> map) {
        if (isReadOnly()) {
            throw new UnsupportedOperationException("Map is read only");
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     */
    private static final Map<Class<? extends Object>, Function<?, ?>> typeTransformers = Collections.unmodifiableMap(createTypeTransformers());
    private static Map<Class<? extends Object>, Function<?, ?>> createTypeTransformers() {
        final Map<Class<? extends Object>, Function<?, ?>> defTransformers = new HashMap<>();
        defTransformers.put(Boolean.TYPE, input -> Boolean.valueOf(input.toString()));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
    private static final Map<Class<? extends Object>, Function<?, ?>> typeTransformers = Collections.unmodifiableMap(createTypeTransformers());
    private static Map<Class<? extends Object>, Function<?, ?>> createTypeTransformers() {
        final Map<Class<? extends Object>, Function<?, ?>> defTransformers = new HashMap<>();
        defTransformers.put(Boolean.TYPE, input -> Boolean.valueOf(input.toString()));
        defTransformers.put(Character.TYPE, input -> Character.valueOf(input.toString().charAt(0)));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     * N.B. private & unmodifiable replacement for the (public & static) defaultTransformers instance.
     */
    private static final Map<Class<? extends Object>, Function<?, ?>> typeTransformers = Collections.unmodifiableMap(createTypeTransformers());
    private static Map<Class<? extends Object>, Function<?, ?>> createTypeTransformers() {
        final Map<Class<? extends Object>, Function<?, ?>> defTransformers = new HashMap<>();
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
        }

        final Class<? extends Object> beanClass = getBean().getClass();
        try {
            // BeanInfo beanInfo = Introspector.getBeanInfo( bean, null );
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
                        final Method readMethod = propertyDescriptor.getReadMethod();
                        final Method writeMethod = propertyDescriptor.getWriteMethod();
                        final Class<? extends Object> aType = propertyDescriptor.getPropertyType();

                        if (readMethod != null) {
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
        try {
            if (value != null) {
                final Class<? extends Object>[] paramTypes = method.getParameterTypes();
                if (paramTypes != null && paramTypes.length > 0) {
                    final Class<? extends Object> paramType = paramTypes[0];
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
                final Class<? extends Object>[] paramTypes = method.getParameterTypes();
                if (paramTypes != null && paramTypes.length > 0) {
                    final Class<? extends Object> paramType = paramTypes[0];
                    if (!paramType.isAssignableFrom(value.getClass())) {
                        value = convertType(paramType, value);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
        }

        Class<? extends Object> beanClass = null;
        try {
            beanClass = bean.getClass();
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java


    private final transient HashMap<String, Class<? extends Object>> types = new HashMap<>();

    /**
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java

        Object newBean = null;
        final Class<? extends Object> beanClass = bean.getClass(); // Cannot throw Exception
        try {
            newBean = beanClass.newInstance();
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
     *  throws an exception
     */
    public void populate(final Object bean, final Map<String, ? extends Object> properties)
        throws IllegalAccessException, InvocationTargetException {
        // Do nothing unless both arguments have been specified
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java

        // Loop through the property name/value pairs to be set
        for(final Map.Entry<String, ? extends Object> entry : properties.entrySet()) {
            // Identify the property name and value(s) to be assigned
            final String name = entry.getKey();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `results` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java
    @Override
    public Object clone() {
        WeakFastHashMap<K, V> results = null;
        if (fast) {
            results = new WeakFastHashMap<>(map);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/locale/converters/StringLocaleConverter.java`
#### Snippet
```java
    @Override
    protected String parse(final Object value, final String pattern) throws ParseException {
        String result = null;

        if (value instanceof Integer || value instanceof Long || value instanceof BigInteger || value instanceof Byte || value instanceof Short) {
```

### UnusedAssignment
Variable `evaluation` initializer `false` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanPredicate.java`
#### Snippet
```java
    @Override
    public boolean test(final Object object) {
        boolean evaluation = false;

        try {
```

### UnusedAssignment
Variable `newValue` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
        }

        Object newValue = null;

        if (type.isArray() && index < 0) { // Scalar value into array
```

### UnusedAssignment
Variable `newValue` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
     */
    protected Object convert(final Class<?> type, final int index, final Object value) {
        Object newValue = null;

        if (type.isArray() && index < 0) { // Scalar value into array
```

### UnusedAssignment
Variable `type` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
    protected Class<?> definePropertyType(final Object target, final String name, final String propName)
            throws IllegalAccessException, InvocationTargetException {
        Class<?> type = null;               // Java type of target property

        if (target instanceof DynaBean) {
```

### UnusedAssignment
Variable `descriptor` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
        }
        else {
            PropertyDescriptor descriptor = null;
            try {
                descriptor =
```

### UnusedAssignment
Variable `cex` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
        }

        ConversionException cex = null;
        if (cause instanceof ConversionException) {
            cex = (ConversionException)cause;
```

### UnusedAssignment
Variable `typeName` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/AbstractConverter.java`
#### Snippet
```java
     */
    String toString(final Class<?> type) {
        String typeName = null;
        if (type == null) {
            typeName = "null";
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        }

        String result = null;
        if (useLocaleFormat && date != null) {
            DateFormat format = null;
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        String result = null;
        if (useLocaleFormat && date != null) {
            DateFormat format = null;
            if (patterns != null && patterns.length > 0) {
                format = getFormat(patterns[0]);
```

### UnusedAssignment
Variable `calendar` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        // java.util.Calendar
        if (type.equals(Calendar.class)) {
            Calendar calendar = null;
            if (locale == null && timeZone == null) {
                calendar = Calendar.getInstance();
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
     */
    protected DateFormat getFormat(final Locale locale, final TimeZone timeZone) {
        DateFormat format = null;
        if (locale == null) {
            format = DateFormat.getDateInstance(DateFormat.SHORT);
```

### UnusedAssignment
Variable `calendar` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/DateTimeConverter.java`
#### Snippet
```java
        // Parse the Date/Time
        if (useLocaleFormat) {
            Calendar calendar = null;
            if (patterns != null && patterns.length > 0) {
                calendar = parse(sourceType, targetType, stringValue);
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/sql/converters/SqlTimeConverter.java`
#### Snippet
```java
    @Override
    protected DateFormat getFormat(final Locale locale, final TimeZone timeZone) {
        DateFormat format = null;
        if (locale == null) {
            format = DateFormat.getTimeInstance(DateFormat.SHORT);
```

### UnusedAssignment
Variable `size` initializer `0` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
    @Override
    protected String convertToString(final Object value) {
        int size = 0;
        Iterator<?> iterator = null;
        final Class<?> type = value.getClass();
```

### UnusedAssignment
Variable `size` initializer `0` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java

        // Handle the source
        int size = 0;
        Iterator<?> iterator = null;
        if (value.getClass().isArray()) {
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/WrapDynaBean.java`
#### Snippet
```java
    @Override
    public Object get(final String name) {
        Object value = null;
        try {
            value = getPropertyUtils().getSimpleProperty(instance, name);
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/WrapDynaBean.java`
#### Snippet
```java
    @Override
    public Object get(final String name, final int index) {
        Object value = null;
        try {
            value = getPropertyUtils().getIndexedProperty(instance, name, index);
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/WrapDynaBean.java`
#### Snippet
```java
    @Override
    public Object get(final String name, final String key) {
        Object value = null;
        try {
            value = getPropertyUtils().getMappedProperty(instance, name, key);
```

### UnusedAssignment
Variable `nestedBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        while (resolver.hasNested(name)) {
            final String next = resolver.next(name);
            Object nestedBean = null;
            try {
                nestedBean = getProperty(bean, next);
```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Identify the index of the requested individual property
        int index = -1;
        try {
            index = resolver.getIndex(name);
```

### UnusedAssignment
Variable `nestedBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        while (resolver.hasNested(name)) {
            final String next = resolver.next(name);
            Object nestedBean = null;
            try {
                nestedBean = getProperty(bean, next);
```

### UnusedAssignment
Variable `nestedBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        while (resolver.hasNested(name)) {
            final String next = resolver.next(name);
            Object nestedBean = null;
            if (bean instanceof Map) {
                nestedBean = getPropertyOfMapBean((Map<?, ?>) bean, next);
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Identify the key of the requested individual property
        String key  = null;
        try {
            key = resolver.getKey(name);
```

### UnusedAssignment
Variable `nestedBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
        while (resolver.hasNested(name)) {
            final String next = resolver.next(name);
            Object nestedBean = null;
            if (bean instanceof Map) {
                nestedBean = getPropertyOfMapBean((Map<?, ?>)bean, next);
```

### UnusedAssignment
Variable `key` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Identify the key of the requested individual property
        String key  = null;
        try {
            key = resolver.getKey(name);
```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Identify the index of the requested individual property
        int index = -1;
        try {
            index = resolver.getIndex(name);
```

### UnusedAssignment
Variable `limit` initializer `-1` is redundant
in `src/main/java/org/apache/commons/beanutils2/sql/RowSetDynaClass.java`
#### Snippet
```java
     * the size of the result.
     */
    protected int limit = -1;

    /**
```

### UnusedAssignment
Variable `beanInfo` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/DefaultBeanIntrospector.java`
#### Snippet
```java
    @Override
    public void introspect(final IntrospectionContext icontext) {
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(icontext.getTargetClass());
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/sql/converters/SqlTimestampConverter.java`
#### Snippet
```java
    @Override
    protected DateFormat getFormat(final Locale locale, final TimeZone timeZone) {
        DateFormat format = null;
        if (locale == null) {
            format = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
     */
    private NumberFormat getFormat() {
        NumberFormat format = null;
        if (pattern != null) {
            if (locale == null) {
```

### UnusedAssignment
Variable `number` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java

        // Convert/Parse a String
        Number number = null;
        if (useLocaleFormat) {
            final NumberFormat format = getFormat();
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/converters/NumberConverter.java`
#### Snippet
```java
    protected String convertToString(final Object value) {

        String result = null;
        if (useLocaleFormat && value instanceof Number) {
            final NumberFormat format = getFormat();
```

### UnusedAssignment
Variable `newBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
        }

        Object newBean = null;
        final Class<? extends Object> beanClass = bean.getClass(); // Cannot throw Exception
        try {
```

### UnusedAssignment
Variable `mappedProperty` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected Object createMappedProperty(final String name, final Class<?> type) {
        // Create the mapped object
        Object mappedProperty = null;

        if ((type == null) || type.isInterface()) {
```

### UnusedAssignment
Variable `indexedProperty` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
    protected Object createIndexedProperty(final String name, final Class<?> type) {
        // Create the indexed object
        Object indexedProperty = null;

        if (type == null) {
```

### UnusedAssignment
Variable `mappedWriteMethod` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        // search the mapped get and set methods
        Method mappedReadMethod;
        Method mappedWriteMethod = null;
        mappedReadMethod =
            getMethod(beanClass, mappedGetterName, STRING_CLASS_PARAMETER);
```

### UnusedAssignment
Variable `paramTypes` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
                            className + " could not be reconstructed - class reference has gone");
                }
                Class<?>[] paramTypes = null;
                if (writeParamClassNames != null) {
                    paramTypes = new Class[2];
```

### UnusedAssignment
Variable `index` initializer `0` is redundant
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
                    throw new IllegalArgumentException("No Index Value");
                }
                int index = 0;
                try {
                    index = Integer.parseInt(value, 10);
```

### UnusedAssignment
Variable `myCost` initializer `Float.MAX_VALUE` is redundant
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        final Method[] methods = clazz.getMethods();
        float bestMatchCost = Float.MAX_VALUE;
        float myCost = Float.MAX_VALUE;
        for (final Method method2 : methods) {
            if (method2.getName().equals(methodName)) {
```

### UnusedAssignment
Variable `dynaBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaList.java`
#### Snippet
```java
     */
    private DynaBean transform(final Object element) {
        DynaBean dynaBean     = null;
        Class<?> newDynaBeanType = null;
        Class<?> newElementType;
```

### UnusedAssignment
Variable `newDynaBeanType` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaList.java`
#### Snippet
```java
    private DynaBean transform(final Object element) {
        DynaBean dynaBean     = null;
        Class<?> newDynaBeanType = null;
        Class<?> newElementType;

```

### UnusedAssignment
The value `element.getClass()` assigned to `newElementType` is never used
in `src/main/java/org/apache/commons/beanutils2/LazyDynaList.java`
#### Snippet
```java

            // Transform Object to a DynaBean
            newElementType = element.getClass();
            if (Map.class.isAssignableFrom(element.getClass())) {
                dynaBean = createDynaBeanForMapProperty(element);
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaList.java`
#### Snippet
```java

        // Create a new object of the specified type
        Object object = null;
        try {
            object = elementType.newInstance();
```

### UnusedAssignment
Variable `dynaBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaList.java`
#### Snippet
```java

        // Create a DynaBean
        DynaBean dynaBean = null;
        if (Map.class.isAssignableFrom(elementType)) {
            dynaBean = createDynaBeanForMapProperty(object);
```

### UnusedAssignment
Variable `type` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        // Declare local variables we will require
        final String propName = resolver.getProperty(name); // Simple name of target property
        Class<?> type = null;                         // Java type of target property
        final int index  = resolver.getIndex(name);         // Indexed subscript value (if any)
        final String key = resolver.getKey(name);           // Mapped key value (if any)
```

### UnusedAssignment
Variable `descriptor` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
            type = Array.get(target, index).getClass();
        } else {
            PropertyDescriptor descriptor = null;
            try {
                descriptor =
```

### UnusedAssignment
Variable `newValue` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java

        // Convert the specified value to the required type
        Object newValue = null;
        if (type.isArray() && index < 0) { // Scalar value into array
            if (value == null) {
```

### UnusedAssignment
Variable `type` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        // Declare local variables we will require
        final String propName = resolver.getProperty(name); // Simple name of target property
        Class<?> type = null;                         // Java type of target property
        final int index  = resolver.getIndex(name);         // Indexed subscript value (if any)
        final String key = resolver.getKey(name);           // Mapped key value (if any)
```

### UnusedAssignment
Variable `descriptor` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
            type = dynaPropertyType(dynaProperty, value);
        } else {
            PropertyDescriptor descriptor = null;
            try {
                descriptor =
```

### UnusedAssignment
Variable `newBean` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
            LOG.debug("Cloning bean: " + bean.getClass().getName());
        }
        Object newBean = null;
        if (bean instanceof DynaBean) {
            newBean = ((DynaBean) bean).getDynaClass().newInstance();
```

### UnusedAssignment
Variable `newMap` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
    public DynaBean newInstance()  {
        // Create a new instance of the Map
        Map<String, Object> newMap = null;
        try {
            final
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/commons/beanutils2/WeakFastHashMap.java`
#### Snippet
```java

        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `value` is always 'null'
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
        final Class<?> type = getDynaProperty(name).getType();
        if (!type.isPrimitive()) {
            return value;
        }

```

### ConstantValue
Condition `result == null || result instanceof Long` is always `true`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);

        if (result == null || result instanceof Long) {
            return (Long) result;
        }
```

### ConstantValue
Condition `result instanceof Long` is always `true` when reached
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);

        if (result == null || result instanceof Long) {
            return (Long) result;
        }
```

### ConstantValue
Condition `parTypes != null` is always `true`
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            final StringBuilder expectedString = new StringBuilder();
            final Class<?>[] parTypes = method.getParameterTypes();
            if (parTypes != null) {
                for (int i = 0; i < parTypes.length; i++) {
                    if (i > 0) {
```

### ConstantValue
Condition `result == null || result instanceof Short` is always `true`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java
        final Object result = super.parse(value, pattern);

        if (result == null || result instanceof Short) {
            return (Short) result;
        }
```

### ConstantValue
Condition `result instanceof Short` is always `true` when reached
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java
        final Object result = super.parse(value, pattern);

        if (result == null || result instanceof Short) {
            return (Short) result;
        }
```

### ConstantValue
Value `converter` is always 'null'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
            final Converter<String> sConverter = lookup(String.class);
            if (LOG.isTraceEnabled()) {
                LOG.trace("  Using converter " + converter);
            }
            return sConverter.convert(String.class, value);
```

### ConstantValue
Condition `result == null || result instanceof BigInteger` is always `true`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigIntegerLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);

        if (result == null || result instanceof BigInteger) {
            return (BigInteger) result;
        }
```

### ConstantValue
Condition `result instanceof BigInteger` is always `true` when reached
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigIntegerLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);

        if (result == null || result instanceof BigInteger) {
            return (BigInteger) result;
        }
```

### ConstantValue
Condition `paramTypes != null` is always `true`
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
            if (value != null) {
                final Class<? extends Object>[] paramTypes = method.getParameterTypes();
                if (paramTypes != null && paramTypes.length > 0) {
                    final Class<? extends Object> paramType = paramTypes[0];
                    if (!paramType.isAssignableFrom(value.getClass())) {
```

### ConstantValue
Condition `result == null || result instanceof BigDecimal` is always `true`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigDecimalLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);

        if (result == null || result instanceof BigDecimal) {
            return (BigDecimal) result;
        }
```

### ConstantValue
Condition `result instanceof BigDecimal` is always `true` when reached
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigDecimalLocaleConverter.java`
#### Snippet
```java
        final Number result = super.parse(value, pattern);

        if (result == null || result instanceof BigDecimal) {
            return (BigDecimal) result;
        }
```

### ConstantValue
Condition `propertyName == null` is always `false`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        super(propertyName, null, null);

        if (propertyName == null || propertyName.isEmpty()) {
            throw new IntrospectionException("bad property name: " +
                    propertyName + " on class: " + beanClass.getClass().getName());
```

### ConstantValue
Condition `propertyName == null` is always `false`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        super(propertyName, null, null);

        if (propertyName == null || propertyName.isEmpty()) {
            throw new IntrospectionException("bad property name: " +
                    propertyName);
```

### ConstantValue
Condition `propertyName == null` is always `false`
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
        super(propertyName, mappedGetter, mappedSetter);

        if (propertyName == null || propertyName.isEmpty()) {
            throw new IntrospectionException("bad property name: " +
                    propertyName);
```

### ConstantValue
Condition `result instanceof Long` is always `false`
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DoubleLocaleConverter.java`
#### Snippet
```java
    protected Double parse(final Object value, final String pattern) throws ParseException {
        final Number result = super.parse(value, pattern);
        if (result instanceof Long) {
            return Double.valueOf(result.doubleValue());
        }
```

### ConstantValue
Value `value` is always 'null'
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
     */
    private Object convertForCopy(final Object value, final Class<?> type) {
        return value != null ? convert(value, type) : value;
    }

```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `setProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#setProperty(Object, String, Object)
     */
    public static void setProperty(final Object bean, final String name, final Object value)
            throws IllegalAccessException, InvocationTargetException {
        LocaleBeanUtilsBean.getLocaleBeanUtilsInstance().setProperty(bean, name, value);
```

### MethodOverridesStaticMethod
Method `getIndexedProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getIndexedProperty(Object, String)
     */
    public static String getIndexedProperty(final Object bean, final String name)
            throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
```

### MethodOverridesStaticMethod
Method `getSimpleProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getSimpleProperty(Object, String)
     */
    public static String getSimpleProperty(final Object bean, final String name)
            throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
```

### MethodOverridesStaticMethod
Method `getMappedProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getMappedProperty(Object, String)
     */
    public static String getMappedProperty(final Object bean, final String name)
            throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
```

### MethodOverridesStaticMethod
Method `getMappedProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getMappedProperty(Object, String, String)
     */
    public static String getMappedProperty(final Object bean,
                                           final String name, final String key)
            throws IllegalAccessException, InvocationTargetException,
```

### MethodOverridesStaticMethod
Method `getProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getProperty(Object, String)
     */
    public static String getProperty(final Object bean, final String name)
            throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
```

### MethodOverridesStaticMethod
Method `getNestedProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getNestedProperty(Object, String)
     */
    public static String getNestedProperty(final Object bean, final String name)
            throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
```

### MethodOverridesStaticMethod
Method `getIndexedProperty()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtils.java`
#### Snippet
```java
     * @see LocaleBeanUtilsBean#getIndexedProperty(Object, String, int)
     */
    public static String getIndexedProperty(final Object bean,
                                            final String name, final int index)
            throws IllegalAccessException, InvocationTargetException,
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'Long'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java

        if (result == null || result instanceof Long) {
            return (Long) result;
        }

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'Short'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java

        if (result == null || result instanceof Short) {
            return (Short) result;
        }

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'Number'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/ShortLocaleConverter.java`
#### Snippet
```java
        }

        final Number parsed = (Number) result;
        if (parsed.longValue() != parsed.shortValue()) {
            throw new ConversionException("Supplied number is not of type Short: " + parsed.longValue());
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'BigInteger'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigIntegerLocaleConverter.java`
#### Snippet
```java

        if (result == null || result instanceof BigInteger) {
            return (BigInteger) result;
        }

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'BigDecimal'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/BigDecimalLocaleConverter.java`
#### Snippet
```java

        if (result == null || result instanceof BigDecimal) {
            return (BigDecimal) result;
        }

```

