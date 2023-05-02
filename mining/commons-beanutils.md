# commons-beanutils 
 
# Bad smells
I found 191 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedAssignment | 53 | false |
| UNCHECKED_WARNING | 28 | false |
| SynchronizeOnNonFinalField | 24 | false |
| ConstantValue | 18 | false |
| TypeParameterExtendsObject | 14 | false |
| DuplicatedCode | 9 | false |
| UnnecessaryToStringCall | 5 | true |
| JavadocDeclaration | 5 | false |
| CastCanBeRemovedNarrowingVariableType | 5 | false |
| MismatchedJavadocCode | 4 | false |
| TrivialIf | 4 | false |
| DataFlowIssue | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| SuspiciousSystemArraycopy | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| IgnoreResultOfCall | 2 | false |
| RedundantCast | 2 | false |
| UnnecessaryModifier | 1 | true |
| JavadocReference | 1 | false |
| ClassGetClass | 1 | false |
| RefusedBequest | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| FinalStaticMethod | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `src/main/java/org/apache/commons/beanutils2/BeanToPropertyValueTransformer.java`
#### Snippet
```java

        try {
            propertyValue = (R) PropertyUtils.getProperty(object, propertyName);
        } catch (final IllegalArgumentException e) {
            final String errorMsg = "Problem during transformation. Null value encountered in property path...";
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.BeanComparator.NaturalOrderComparator' to 'java.util.Comparator'
in `src/main/java/org/apache/commons/beanutils2/BeanComparator.java`
#### Snippet
```java
    public BeanComparator(final String property, final Comparator<V> comparator) {
        setProperty(property);
        this.comparator = comparator != null ? comparator : NaturalOrderComparator.INSTANCE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.BeanComparator.NaturalOrderComparator' to 'java.util.Comparator'
in `src/main/java/org/apache/commons/beanutils2/BeanComparator.java`
#### Snippet
```java
     */
    public BeanComparator(final String property) {
        this(property, NaturalOrderComparator.INSTANCE);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'C'
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
        C defaultValue = null;
        if (defaultSize >= 0) {
            defaultValue = (C) Array.newInstance(defaultType.getComponentType(), defaultSize);
        }
        setDefaultValue(defaultValue);
```

### UNCHECKED_WARNING
Unchecked call to 'convert(Class, Object)' as a member of raw type 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
            // TODO - probably should catch conversion errors and throw
            //        new exception providing better info back to the user
            element = elementConverter.convert(componentType, element);
            Array.set(newArray, i, element);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'convert(Class, Object)' as a member of raw type 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/converters/ArrayConverter.java`
#### Snippet
```java
            }
            Object element = iterator == null ? Array.get(value, i) : iterator.next();
            element = elementConverter.convert(String.class, element);
            if (element != null) {
                buffer.append(element);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/apache/commons/beanutils2/BeanPredicate.java`
#### Snippet
```java

        try {
            final T propValue = (T) PropertyUtils.getProperty(object, propertyName);
            evaluation = predicate.test(propValue);
        } catch (final IllegalArgumentException e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'D'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
        // Handle Date
        if (value instanceof Date) {
            return (D) value;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Date' to 'D'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
        // Handle Calendar
        if (value instanceof java.util.Calendar) {
            return (D) ((java.util.Calendar) value).getTime();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'D'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DateLocaleConverter.java`
#### Snippet
```java
        }

        return (D) parsedValue;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: '? extends java.util.Map' to 'java.util.Map'
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
            final
            // The new map is used as properties map
            Map<String, Object> temp = getMap().getClass().newInstance();
            newMap = temp;
        } catch (final Exception ex) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DecimalLocaleConverter.java`
#### Snippet
```java
    protected T parse(final Object value, final String pattern) throws ParseException {
        if (value instanceof Number) {
            return (T) value;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Number' to 'T'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/DecimalLocaleConverter.java`
#### Snippet
```java
        }

        return (T) formatter.parse((String) value);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java
            }
            if (result != null) {
                mappedDescriptors.put(name, result);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map,java.util.Map\>'
in `src/main/java/org/apache/commons/beanutils2/PropertyUtilsBean.java`
#### Snippet
```java

        // Look up any cached descriptors for this bean class
        return mappedDescriptorsCache.get(beanClass);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `src/main/java/org/apache/commons/beanutils2/locale/BaseLocaleConverter.java`
#### Snippet
```java
        if (type == null) {
            // In this case we cannot do much: The result object is returned.
            return (R) result;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
    private <T> void registerArrayConverter(final Class<T> componentType, final Converter<T> componentConverter,
            final boolean throwException, final int defaultArraySize) {
        final Class<T[]> arrayType = (Class<T[]>) Array.newInstance(componentType, 0).getClass();
        final Converter<T[]> arrayConverter;
        if (throwException) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.converters.EnumConverter' to 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        // @formatter:off
        register(Class.class,          throwException ? new ClassConverter<>()        : new ClassConverter<>(null));
        register(Enum.class,           throwException ? new EnumConverter()           : new EnumConverter(null));
        register(java.util.Date.class, throwException ? new DateConverter()           : new DateConverter(null));
        register(Calendar.class,       throwException ? new CalendarConverter()       : new CalendarConverter(null));
```

### UNCHECKED_WARNING
Unchecked call to 'EnumConverter(Enum)' as a member of raw type 'org.apache.commons.beanutils2.converters.EnumConverter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        // @formatter:off
        register(Class.class,          throwException ? new ClassConverter<>()        : new ClassConverter<>(null));
        register(Enum.class,           throwException ? new EnumConverter()           : new EnumConverter(null));
        register(java.util.Date.class, throwException ? new DateConverter()           : new DateConverter(null));
        register(Calendar.class,       throwException ? new CalendarConverter()       : new CalendarConverter(null));
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.converters.ClassConverter' to 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java

        // Other
        registerArrayConverter(Class.class,          new ClassConverter(),         throwException, defaultArraySize);
        registerArrayConverter(Enum.class,           new EnumConverter(),          throwException, defaultArraySize);
        registerArrayConverter(java.util.Date.class, new DateConverter(),          throwException, defaultArraySize);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.converters.EnumConverter' to 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        // Other
        registerArrayConverter(Class.class,          new ClassConverter(),         throwException, defaultArraySize);
        registerArrayConverter(Enum.class,           new EnumConverter(),          throwException, defaultArraySize);
        registerArrayConverter(java.util.Date.class, new DateConverter(),          throwException, defaultArraySize);
        registerArrayConverter(Calendar.class,       new CalendarConverter(),      throwException, defaultArraySize);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.Converter' to 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
                converter = lookup(String.class);
            }
            return converter;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.Converter' to 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
                converter = lookup(String[].class);
            }
            return converter;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.beanutils2.Converter' to 'org.apache.commons.beanutils2.Converter'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
            converter = lookup(String.class);
        }
        return convert(values, type, converter);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.function.Function,capture\>' to 'java.util.function.Function'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     */
    protected <R> Function<Object, R> getTypeTransformer(final Class<R> type) {
        return (Function<Object, R>) typeTransformers.get(type);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'convert(Class, Object, String)' as a member of raw type 'org.apache.commons.beanutils2.locale.LocaleConverter'
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
        }

        return converter.convert(targetClass, value, pattern);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
        }

        final T[] array = (T[]) Array.newInstance(type, values.length);
        for (int i = 0; i < values.length; i++) {
            Array.set(array, i, convert(values[i], type, locale, pattern));
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.commons.beanutils2.locale.LocaleConverter\>' to 'org.apache.commons.beanutils2.locale.LocaleConverter'
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleConvertUtilsBean.java`
#### Snippet
```java
     */
    public <T> LocaleConverter<T> lookup(final Class<T> clazz, final Locale locale) {
        final LocaleConverter<T> converter = (LocaleConverter<T>) lookup(locale).get(clazz);

        if (LOG.isTraceEnabled()) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/beanutils2/locale/BaseLocaleConverter.java`
#### Snippet
```java
     * correct target type. Otherwise, an exception is thrown.
     *
     * @param <T>    the desired result type
     * @param type   the target class of the conversion
     * @param result the conversion result object
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
        if (dest.isAssignableFrom(source) ||
                dest == Boolean.TYPE && source == Boolean.class ||
                dest == Byte.TYPE && source == Byte.class ||
                dest == Character.TYPE && source == Character.class ||
                dest == Double.TYPE && source == Double.class ||
                dest == Float.TYPE && source == Float.class ||
                dest == Integer.TYPE && source == Integer.class ||
                dest == Long.TYPE && source == Long.class ||
                dest == Short.TYPE && source == Short.class) {
            return true;
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
        if (value == null) {
            if (descriptor.getType().isPrimitive()) {
                throw new NullPointerException
                        ("Primitive value for '" + name + "'");
            }
        } else if (!isAssignable(descriptor.getType(), value.getClass())) {
            throw ConversionException.format("Cannot assign value of type '%s' to property '%s' of type '%s'", value.getClass().getName(), name,
                    descriptor.getType().getName());
        }
        values.put(name, value);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
            sb.append(bean);
            sb.append(", ");
            sb.append(name);
            sb.append(", ");
            if (value == null) {
                sb.append("<NULL>");
            } else if (value instanceof String) {
                sb.append((String) value);
            } else if (value instanceof String[]) {
                final String[] values = (String[]) value;
                sb.append('[');
                for (int i = 0; i < values.length; i++) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(values[i]);
                }
                sb.append(']');
            } else {
                sb.append(value.toString());
            }
            sb.append(')');
            LOG.trace(sb.toString());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        Object target = bean;
        final Resolver resolver = getPropertyUtils().getResolver();
        while (resolver.hasNested(name)) {
            try {
                target = getPropertyUtils().getProperty(target, resolver.next(name));
                name = resolver.remove(name);
            } catch (final NoSuchMethodException e) {
                return; // Skip this property setter
            }
        }
        if (LOG.isTraceEnabled()) {
            LOG.trace("    Target bean = " + target);
            LOG.trace("    Target name = " + name);
        }

        // Declare local variables we will require
        final String propName = resolver.getProperty(name); // Simple name of target property
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
        while (resolver.hasNested(name)) {
            try {
                target = getPropertyUtils().getProperty(target, resolver.next(name));
                name = resolver.remove(name);
            } catch (final NoSuchMethodException e) {
                return; // Skip this property setter
            }
        }
        if (LOG.isTraceEnabled()) {
            LOG.trace("    Target bean = " + target);
            LOG.trace("    Target name = " + name);
        }

        // Declare local variables we will require
        final String propName = resolver.getProperty(name); // Simple name of target property
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        if (LOG.isTraceEnabled()) {
            LOG.trace("    Target bean = " + target);
            LOG.trace("    Target name = " + name);
        }

        // Declare local variables we will require
        final String propName = resolver.getProperty(name); // Simple name of target property
        Class<?> type = null;                         // Java type of target property
        final int index  = resolver.getIndex(name);         // Indexed subscript value (if any)
        final String key = resolver.getKey(name);           // Mapped key value (if any)
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
        if (LOG.isTraceEnabled()) {
            final StringBuilder sb = new StringBuilder("  setProperty(");
            sb.append(bean);
            sb.append(", ");
            sb.append(name);
            sb.append(", ");
            if (value == null) {
                sb.append("<NULL>");
            } else if (value instanceof String) {
                sb.append((String) value);
            } else if (value instanceof String[]) {
                final String[] values = (String[]) value;
                sb.append('[');
                for (int i = 0; i < values.length; i++) {
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(values[i]);
                }
                sb.append(']');
            } else {
                sb.append(value.toString());
            }
            sb.append(')');
            LOG.trace(sb.toString());
        }

        // Resolve any nested expression to get the actual target bean
        Object target = bean;
        final Resolver resolver = getPropertyUtils().getResolver();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
        if (args == null) {
            args = BeanUtils.EMPTY_OBJECT_ARRAY;
        }
        final int arguments = args.length;
        final Class<?>[] parameterTypes = new Class[arguments];
        for (int i = 0; i < arguments; i++) {
            parameterTypes[i] = args[i].getClass();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/beanutils2/expression/DefaultResolver.java`
#### Snippet
```java
        if (expression == null || expression.isEmpty()) {
            return false;
        }
        for (int i = 0; i < expression.length(); i++) {
            final char c = expression.charAt(i);
            if (c == NESTED || c == MAPPED_START) {
                return false;
            }
            if (c == INDEXED_START) {
                return true;
            }
        }
        return false;
```

## RuleId[id=MismatchedJavadocCode]
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
in `src/main/java/org/apache/commons/beanutils2/LazyDynaMap.java`
#### Snippet
```java
     * {@code getBeanInfo()} instead, which returns property descriptors
     * and a bunch of other stuff?</p>
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
in `src/main/java/org/apache/commons/beanutils2/DynaClass.java`
#### Snippet
```java
     * and a bunch of other stuff?</p>
     *
     * @return the set of properties for this DynaClass
     */
    DynaProperty[] getDynaProperties();
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'HashMap.get()'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     */
    protected Method getReadMethod(final Object name) {
        return readMethods.get(name);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'HashMap.get()'
in `src/main/java/org/apache/commons/beanutils2/BeanMap.java`
#### Snippet
```java
     */
    protected Method getWriteMethod(final Object name) {
        return writeMethods.get(name);
    }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/beanutils2/MappedPropertyDescriptor.java`
#### Snippet
```java
     * released.
     *
     * See https://issues.apache.org/jira/browse/BEANUTILS-291
     */
    private static class MappedMethodReference {
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/beanutils2/BeanComparator.java`
#### Snippet
```java
            return beanComparator.property == null;
        }
        if (!property.equals(beanComparator.property)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/beanutils2/DynaProperty.java`
#### Snippet
```java
            return false;
        }
        if (type.isArray() || List.class.isAssignableFrom(type)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/beanutils2/BasicDynaBean.java`
#### Snippet
```java
    protected boolean isAssignable(final Class<?> dest, final Class<?> source) {

        if (dest.isAssignableFrom(source) ||
                dest == Boolean.TYPE && source == Boolean.class ||
                dest == Byte.TYPE && source == Byte.class ||
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/beanutils2/LazyDynaBean.java`
#### Snippet
```java
     */
    protected boolean isAssignable(final Class<?> dest, final Class<?> source) {
        if (dest.isAssignableFrom(source) ||
                dest == Boolean.TYPE && source == Boolean.class ||
                dest == Byte.TYPE && source == Byte.class ||
```

## RuleId[id=SynchronizeOnNonFinalField]
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
        synchronized (map) {
            if (mo.size() != map.size()) {
                return false;
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
                return get(map).toArray(o);
            }
            synchronized (map) {
                return get(map).toArray(o);
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
                return get(map).equals(o);
            }
            synchronized (map) {
                return get(map).equals(o);
            }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
     * {@code false} if a default value should be used.
     * @param defaultNull {@code true}if the <i>standard</i> converters
     * (see {@link ConvertUtilsBean#registerStandard(boolean, boolean)})
     * should use a default value of {@code null</code>, otherwise <code>false}.
     * N.B. This values is ignored if {@code throwException</code> is <code>true}
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
     *
     * <p> This is a convenient wrapper for
     * {@link #invokeMethod(Object object,String methodName,Object [] args)}.
     * </p>
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
     *
     * <p> This is a convenient wrapper for
     * {@link #invokeExactStaticMethod(Class objectClass,String methodName,Object [] args)}.
     * </p>
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
     *
     * <p> This is a convenient wrapper for
     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args)}.
     * </p>
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/beanutils2/MethodUtils.java`
#### Snippet
```java
     *
     * <p> This is a convenient wrapper for
     * {@link #invokeExactMethod(Object object,String methodName,Object [] args)}.
     * </p>
     *
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `super.parse(...)` to `java.util.Date` is redundant
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlTimeLocaleConverter.java`
#### Snippet
```java
    protected Time parse(final Object value, final String pattern) throws ParseException {
        // MUST cast to java.util.Date to avoid a CCE.
        return new Time(((java.util.Date) super.parse(value, pattern)).getTime());
    }
}
```

### RedundantCast
Casting `super.parse(...)` to `java.util.Date` is redundant
in `src/main/java/org/apache/commons/beanutils2/sql/converters/locale/SqlDateLocaleConverter.java`
#### Snippet
```java
    protected Date parse(final Object value, final String pattern) throws ParseException {
        // MUST cast to java.util.Date to avoid a CCE.
        return new Date(((java.util.Date) super.parse(value, pattern)).getTime());
    }
}
```

## RuleId[id=UnnecessaryLocalVariable]
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

        Object newBean = null;
        final Class<? extends Object> beanClass = bean.getClass(); // Cannot throw Exception
        try {
            newBean = beanClass.newInstance();
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

## RuleId[id=UnusedAssignment]
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
    public Object get(final String name, final String key) {
        Object value = null;
        try {
            value = getPropertyUtils().getMappedProperty(instance, name, key);
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
Variable `newValue` initializer `null` is redundant
in `src/main/java/org/apache/commons/beanutils2/locale/LocaleBeanUtilsBean.java`
#### Snippet
```java
        }

        Object newValue = null;

        if (type.isArray() && index < 0) { // Scalar value into array
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

## RuleId[id=ConstantValue]
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
Value `value` is always 'null'
in `src/main/java/org/apache/commons/beanutils2/BeanUtilsBean.java`
#### Snippet
```java
     */
    private Object convertForCopy(final Object value, final Class<?> type) {
        return value != null ? convert(value, type) : value;
    }

```

### ConstantValue
Value `booleanDefault` is always 'false'
in `src/main/java/org/apache/commons/beanutils2/ConvertUtilsBean.java`
#### Snippet
```java
        register(BigDecimal.class, throwException ? new BigDecimalConverter() : new BigDecimalConverter(bigDecDeflt));
        register(BigInteger.class, throwException ? new BigIntegerConverter() : new BigIntegerConverter(bigIntDeflt));
        register(Boolean.class,    throwException ? new BooleanConverter()    : new BooleanConverter(booleanDefault));
        register(Byte.class,       throwException ? new ByteConverter()       : new ByteConverter(defaultNumber));
        register(Character.class,  throwException ? new CharacterConverter()  : new CharacterConverter(charDefault));
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

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
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
Cast may be removed by changing the type of 'result' to 'Long'
in `src/main/java/org/apache/commons/beanutils2/locale/converters/LongLocaleConverter.java`
#### Snippet
```java

        if (result == null || result instanceof Long) {
            return (Long) result;
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

