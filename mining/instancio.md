# instancio 
 
# Bad smells
I found 317 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 202 | false |
| Deprecation | 27 | false |
| DefaultAnnotationParam | 18 | false |
| UNCHECKED_WARNING | 12 | false |
| BlockingMethodInNonBlockingContext | 11 | false |
| DataFlowIssue | 9 | false |
| DeprecatedIsStillUsed | 8 | false |
| SimplifyOptionalCallChains | 7 | false |
| TrivialStringConcatenation | 7 | false |
| RedundantMethodOverride | 3 | false |
| Lombok | 3 | false |
| DuplicatedCode | 3 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| MissingSerialAnnotation | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| FuseStreamOperations | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckBV.java`
#### Snippet
```java
    @Data
    public static class WithEndAndCheckDigitIndicesEqual {
        @LuhnCheck(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
        private String value0;
        @LuhnCheck(startIndex = 5, endIndex = 10, checkDigitIndex = 10)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndIndices {
        @LuhnCheck(startIndex = 0, endIndex = 7)
        private String value0;
        @LuhnCheck(startIndex = 5, endIndex = 10)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndAndCheckDigitIndices {
        @LuhnCheck(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
        private String value0;
        @LuhnCheck(startIndex = 5, endIndex = 10, checkDigitIndex = 3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndIndices {
        @Mod11Check(startIndex = 0, endIndex = 7)
        private String value0;
        @Mod11Check(startIndex = 5, endIndex = 10)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckBV.java`
#### Snippet
```java
    @Data
    public static class WithEndAndCheckDigitIndicesEqual {
        @Mod11Check(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
        private String value0;
        @Mod11Check(startIndex = 5, endIndex = 10, checkDigitIndex = 10)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 17)
        @Mod11Check(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndAndCheckDigitIndices {
        @Mod11Check(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
        private String value0;
        @Mod11Check(startIndex = 5, endIndex = 10, checkDigitIndex = 3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 8, max = 8)
        @Mod11Check(startIndex = 0, endIndex = 7)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 17)
        @Mod11Check(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndIndices {
        @Mod10Check(startIndex = 0, endIndex = 7)
        private String value0;
        @Mod10Check(startIndex = 5, endIndex = 10)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndAndCheckDigitIndices {
        @Mod10Check(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
        private String value0;
        @Mod10Check(startIndex = 5, endIndex = 10, checkDigitIndex = 3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckBV.java`
#### Snippet
```java
    @Data
    public static class WithEndAndCheckDigitIndicesEqual {
        @Mod10Check(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
        private String value0;
        @Mod10Check(startIndex = 5, endIndex = 10, checkDigitIndex = 10)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 8, max = 8)
        @LuhnCheck(startIndex = 0, endIndex = 7)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 17)
        @LuhnCheck(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 17)
        @LuhnCheck(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 8, max = 8)
        @Mod10Check(startIndex = 0, endIndex = 7)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 17)
        @Mod10Check(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
        private String value0;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        @NotNull
        @Length(min = 17)
        @Mod10Check(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
        private String value0;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `toString()` is identical to its super method
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/person/PhoneWithType.java`
#### Snippet
```java

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
```

### RedundantMethodOverride
Method `toString()` is identical to its super method
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/generics/inheritance/WithGenericParent.java`
#### Snippet
```java

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
        }
```

### RedundantMethodOverride
Method `toString()` is identical to its super method
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/performance/LargeCyclicSubclass.java`
#### Snippet
```java

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `instancio-core/src/main/java/org/instancio/internal/util/StringUtils.java`
#### Snippet
```java

    public static boolean startsWithAny(@Nullable final String s, final String... prefixes) {
        if (s == null || prefixes.length == 0) {
            return false;
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec' to 'org.instancio.generator.Generator'
in `instancio-core/src/main/java/org/instancio/internal/ApiImpl.java`
#### Snippet
```java

        ApiValidator.validateGenerateSecondArgument(spec);
        modelContextBuilder.withGenerator(selector, (Generator<T>) spec);
        return this;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.internal.generator.lang.AbstractRandomNumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/util/BeanValidationUtils.java`
#### Snippet
```java
        if (spec instanceof NumberGeneratorSpec<?> && field.getType().isPrimitive()) {
            // prevent 0 being generated for nullable primitives,
            ((AbstractRandomNumberGeneratorSpec<Number>) spec).nullable(false);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.generator.specs.NumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java
            if (spec instanceof NumberGeneratorSpec<?>) {
                final Function<Long, Number> fromLongConverter = NumberUtils.longConverter(fieldType);
                ((NumberGeneratorSpec<Number>) spec).min(fromLongConverter.apply(getValue(annotation)));
                BeanValidationUtils.setNonNullablePrimitive(spec, field);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.generator.specs.NumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java

            } else if (spec instanceof NumberGeneratorSpec<?>) {
                final NumberGeneratorSpec<Number> numSpec = (NumberGeneratorSpec<Number>) spec;

                final int integer = getInteger(annotation);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.internal.generator.lang.AbstractRandomNumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java
                final Function<BigDecimal, Number> converter = NumberUtils.bigDecimalConverter(fieldType);
                final BigDecimal min = new BigDecimal(value);
                final AbstractRandomNumberGeneratorSpec<Number> numSpec = (AbstractRandomNumberGeneratorSpec<Number>) spec;
                numSpec.min(converter.apply(min));
                BeanValidationUtils.setNonNullablePrimitive(spec, field);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.generator.specs.NumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java
            if (spec instanceof NumberGeneratorSpec<?>) {
                final Function<Long, Number> fromLongConverter = NumberUtils.longConverter(fieldType);
                ((NumberGeneratorSpec<Number>) spec).max(fromLongConverter.apply(getValue(annotation)));
                BeanValidationUtils.setNonNullablePrimitive(spec, field);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.generator.specs.NumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java

            if (spec instanceof NumberGeneratorSpec<?>) {
                final NumberGeneratorSpec<Number> numSpec = (NumberGeneratorSpec<Number>) spec;
                final Function<BigDecimal, Number> converter = NumberUtils.bigDecimalConverter(fieldType);
                final Number numberMinValue = NumberUtils.getMinValue(fieldType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.generator.specs.NumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java
                final Function<BigDecimal, Number> converter = NumberUtils.bigDecimalConverter(fieldType);
                final BigDecimal max = new BigDecimal(value);
                ((NumberGeneratorSpec<Number>) spec).max(converter.apply(max));
                BeanValidationUtils.setNonNullablePrimitive(spec, field);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.generator.specs.NumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/CommonBeanValidationHandlerResolver.java`
#### Snippet
```java

            if (spec instanceof NumberGeneratorSpec<?>) {
                final NumberGeneratorSpec<Number> numSpec = (NumberGeneratorSpec<Number>) spec;
                final Function<BigDecimal, Number> converter = NumberUtils.bigDecimalConverter(fieldType);
                final Number numberMaxValue = NumberUtils.getMaxValue(fieldType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.generator.GeneratorSpec\>' to 'org.instancio.internal.generator.lang.AbstractRandomNumberGeneratorSpec'
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/HibernateBeanValidationHandlerResolver.java`
#### Snippet
```java
                final Function<Long, Number> fromLongConverter = NumberUtils.longConverter(fieldType);

                final AbstractRandomNumberGeneratorSpec<Number> numSpec = (AbstractRandomNumberGeneratorSpec<Number>) spec;
                numSpec
                        .min(fromLongConverter.apply(range.min()))
```

### UNCHECKED_WARNING
Unchecked cast: 'org.instancio.settings.SettingKey' to 'org.instancio.settings.SettingKey'
in `instancio-core/src/main/java/org/instancio/settings/Keys.java`
#### Snippet
```java
                propertyKey, type, defaultValue, rangeAdjuster, allowsNullValue);

        ALL_KEYS.add((SettingKey<Object>) settingKey);
        return settingKey;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `instancio-processor/src/main/java/org/instancio/processor/InstancioAnnotationProcessor.java`
#### Snippet
```java
                am.getElementValues().forEach((executableElement, annotationValue) -> {
                    if (attributeName.equals(executableElement.getSimpleName().toString())) {
                        annotationValues.addAll((List<AnnotationValue>) annotationValue.getValue());
                    }
                });
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/util/ArrayUtils.java`
#### Snippet
```java
    public static <T> List<T> toList(T... values) {
        List<T> result = new ArrayList<>();
        for (T v : values) result.add(v);
        return result;
    }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-core/src/main/java/org/instancio/internal/InstancioEngine.java`
#### Snippet
```java
        // Handle the case where user supplies a generator for creating a record.
        Optional<Generator<?>> generator = context.getGenerator(node);
        if (!generator.isPresent()) {
            generator = generatorFacade.getGenerator(node);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-core/src/main/java/org/instancio/internal/handlers/UsingGeneratorResolverHandler.java`
#### Snippet
```java
        final Optional<Generator<?>> generatorOpt = generatorResolver.get(node);

        if (!generatorOpt.isPresent()) {
            return GeneratorResult.emptyResult();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-core/src/main/java/org/instancio/internal/handlers/UserSuppliedGeneratorHandler.java`
#### Snippet
```java
        final Optional<Generator<?>> generatorOpt = modelContext.getGenerator(node);

        if (!generatorOpt.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-core/src/main/java/org/instancio/internal/handlers/UserSuppliedGeneratorHandler.java`
#### Snippet
```java
        final Optional<Generator<?>> generatorOpt = getUserSuppliedGenerator(node);

        if (!generatorOpt.isPresent()) {
            return GeneratorResult.emptyResult();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-core/src/main/java/org/instancio/internal/instantiation/LeastArgumentsConstructorInstantiationStrategy.java`
#### Snippet
```java
                .min(Comparator.comparingInt(Constructor::getParameterCount));

        if (!optCtor.isPresent()) {
            return null;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-junit/src/main/java/org/instancio/junit/InstancioExtension.java`
#### Snippet
```java
        if (context.getExecutionException().isPresent()) {
            final Optional<Method> testMethod = context.getTestMethod();
            if (!testMethod.isPresent()) {
                return;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `instancio-junit/src/main/java/org/instancio/junit/internal/ExtensionSupport.java`
#### Snippet
```java

        final Optional<Class<?>> testClass = context.getTestClass();
        if (!testClass.isPresent()) {
            return;
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/ApiValidator.java`
#### Snippet
```java
                final Class<Object> paramRawType = TypeUtils.getRawType(param);

                if (paramRawType.getTypeParameters().length > 0) {
                    final String classWithTypeParams = String.format("%s<%s>",
                            paramRawType.getSimpleName(), Format.getTypeVariablesCsv(paramRawType));
```

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeHelper.java`
#### Snippet
```java
    private static void addTypeParameters(final ParameterizedType parameterizedType, final Map<Type, Type> typeMap) {
        final Class<?> rawSuperclassType = TypeUtils.getRawType(parameterizedType);
        final TypeVariable<?>[] typeVars = rawSuperclassType.getTypeParameters();
        final Type[] typeArgs = parameterizedType.getActualTypeArguments();

```

### DataFlowIssue
Method invocation `getGenericSuperclass` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeHelper.java`
#### Snippet
```java

            final Class<?> rawSuper = TypeUtils.getRawType(supertype);
            supertype = rawSuper.getGenericSuperclass();
        }

```

### DataFlowIssue
Dereference of `ctorArgs` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/InstancioEngine.java`
#### Snippet
```java
        // There may have been a cyclic node structure that was terminated with a null node.
        // If we don't have enough arguments for the record's constructor, simply return null.
        if (ctorArgs.length != args.length) {
            LOG.debug("Record {} has {} constructor arguments, but got {}",
                    node.getTargetClass(), ctorArgs.length, args.length);
```

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeMap.java`
#### Snippet
```java
            final Class<?> rawType = TypeUtils.getRawType(genericType);
            final Type[] typeArgs = TypeUtils.getTypeArguments(genericType);
            final TypeVariable<?>[] typeVars = rawType.getTypeParameters();

            for (int i = 0; i < typeArgs.length; i++) {
```

### DataFlowIssue
Argument `targetClass` might be null
in `instancio-core/src/main/java/org/instancio/internal/nodes/NodeCreator.java`
#### Snippet
```java
        // If the child node inherits a TypeVariable field declaration from
        // the parent, we need to map Parent.T -> Child.T to resolve the type variable
        final Map<Type, Type> genericSuperclassTypeMap = typeHelper.createSuperclassTypeMap(targetClass);

        if (!genericSuperclassTypeMap.isEmpty()) {
```

### DataFlowIssue
Method invocation `isPrimitive` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/nodes/NodeCreator.java`
#### Snippet
```java
        }

        if (rawType != targetClass && !targetClass.isEnum() && !rawType.isPrimitive()) {
            ApiValidator.validateSubtype(rawType, targetClass);

```

### DataFlowIssue
Argument `rootClass` might be null
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java

        final Class<?> rootClass = TypeUtils.getRawType(rootType);
        ApiValidator.validateTypeParameters(rootClass, rootTypeParameters);

        final Class<?> targetClass = rootClass.isArray()
```

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java
            final ParameterizedType genericSuperclass = (ParameterizedType) gsClass;
            final Class<?> rawType = TypeUtils.getRawType(genericSuperclass.getRawType());
            final TypeVariable<?>[] typeParameters = rawType.getTypeParameters();

            final Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `instancio-junit/src/main/java/org/instancio/junit/internal/InstancioArgumentsProvider.java`
#### Snippet
```java

    static Object[] createObjects(final Type[] types, final Random random, final Settings settings) {
        return Arrays.stream(types).map(type -> createObject(type, random, settings)).collect(Collectors.toList()).toArray();
    }

```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/misc/WithSerialVersionUID.java`
#### Snippet
```java
public class WithSerialVersionUID implements Serializable {

    private static final long serialVersionUID = 5516075349620653480L;

    private String foo;
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'org.instancio.TargetSelector\[\]' expected, 'org.instancio.GroupableSelector\[\]' found
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java
        } else if (selector instanceof SelectorGroupImpl) {
            final List<TargetSelector> results = flattenSelectorGroup((SelectorGroupImpl) selector, rootClass);
            return new SelectorGroupImpl(results.toArray(new GroupableSelector[0]));
        } else if (selector instanceof GetMethodSelector<?, ?>) {
            return MethodReferenceHelper.resolve((GetMethodSelector<?, ?>) selector);
```

## RuleId[id=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/person/AddressExtension.java`
#### Snippet
```java
import lombok.Data;

@Data
public class AddressExtension extends Address {
    private String additionalInfo;
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/person/PhoneWithType.java`
#### Snippet
```java
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@SuperBuilder
@AllArgsConstructor
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/pojo/performance/LargeCyclicSubclass.java`
#### Snippet
```java
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@SuppressWarnings("unused")
public class LargeCyclicSubclass extends LargeClass {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'TypeResolver' is still used
in `instancio-core/src/main/java/org/instancio/spi/TypeResolver.java`
#### Snippet
```java
 */
@Deprecated
public interface TypeResolver {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'InstancioMetamodel' is still used
in `instancio-core/src/main/java/org/instancio/InstancioMetamodel.java`
#### Snippet
```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface InstancioMetamodel {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getGenerators' is still used
in `instancio-core/src/main/java/org/instancio/spi/GeneratorProvider.java`
#### Snippet
```java
     */
    @Deprecated
    Map<Class<?>, Generator<?>> getGenerators(GeneratorContext context);
}

```

### DeprecatedIsStillUsed
Deprecated member 'GeneratorProvider' is still used
in `instancio-core/src/main/java/org/instancio/spi/GeneratorProvider.java`
#### Snippet
```java
 */
@Deprecated
public interface GeneratorProvider {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'MetamodelSelector' is still used
in `instancio-core/src/main/java/org/instancio/internal/selectors/MetamodelSelector.java`
#### Snippet
```java
 */
@Deprecated
public final class MetamodelSelector extends SelectorImpl {

    private MetamodelSelector(final Class<?> targetClass, final String fieldName) {
```

### DeprecatedIsStillUsed
Deprecated member 'asString' is still used
in `instancio-core/src/main/java/org/instancio/generator/AsStringGeneratorSpec.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings("unchecked")
    default GeneratorSpec<String> asString(Function<T, String> toStringFunction) {
        return (Generator<String>) random -> {
            final Generator<T> generator = (Generator<T>) this;
```

### DeprecatedIsStillUsed
Deprecated member 'InstancioAnnotationProcessor' is still used
in `instancio-processor/src/main/java/org/instancio/processor/InstancioAnnotationProcessor.java`
#### Snippet
```java
@SupportedOptions({"instancio.verbose", "instancio.suffix"})
@SupportedAnnotationTypes("org.instancio.InstancioMetamodel")
public final class InstancioAnnotationProcessor extends AbstractProcessor {
    private static final String CLASSES_ATTRIBUTE = "classes";
    private static final String TRUE = "true";
```

### DeprecatedIsStillUsed
Deprecated member 'METAMODEL' is still used
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/tags/Feature.java`
#### Snippet
```java
    MAX_DEPTH,
    @Deprecated
    METAMODEL,
    METHOD_REFERENCE_SELECTOR,
    MODE,
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/JakartaBeanValidationHandlerResolver.java`
#### Snippet
```java
final Map<Class<?>, FieldAnnotationHandler> map = new HashMap<>();
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.DecimalMax.class, new DecimalMaxHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.DecimalMin.class, new DecimalMinHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Digits.class, new DigitsHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Future.class, new FutureHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.FutureOrPresent.class, new FutureHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Max.class, new MaxHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Min.class, new MinHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Negative.class, new NegativeHandler(new BigDecimal("-0.5"))));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.NotBlank.class, new NotEmptyHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.NotEmpty.class, new NotEmptyHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.NotNull.class, new NotNullHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.NegativeOrZero.class, new NegativeHandler(BigDecimal.ZERO)));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Past.class, new PastHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.PastOrPresent.class, new PastHandler()));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Positive.class, new PositiveHandler(new BigDecimal("0.5"))));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.PositiveOrZero.class, new PositiveHandler(BigDecimal.ZERO)));
        runIgnoringTheNoClassDefFoundError(() -> map.put(jakarta.validation.constraints.Size.class, new SizeHandler()));
        return map;
```

### DuplicatedCode
Duplicated code
in `instancio-core/src/main/java/org/instancio/internal/beanvalidation/JakartaBeanValidationProcessor.java`
#### Snippet
```java
        Map<Class<? extends Annotation>, BiFunction<Annotation, GeneratorContext, Generator<?>>> map = new HashMap<>();
        runIgnoringTheNoClassDefFoundError(() ->
                map.put(jakarta.validation.constraints.Email.class, ((annotation, context) -> new EmailGenerator(context)))
        );
        return map;
```

### DuplicatedCode
Duplicated code
in `instancio-core/src/main/java/org/instancio/internal/reflect/DeclaredAndInheritedFieldsCollector.java`
#### Snippet
```java
        Class<?> next = klass;

        final List<Field> collected = new ArrayList<>();
        while (shouldCollectFrom(next)) {
            for (Field field : next.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    collected.add(field);
                }
            }
            next = next.getSuperclass();
        }
        return collected;
```

## RuleId[id=Deprecation]
### Deprecation
'org.instancio.spi.TypeResolver' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeResolverFacade.java`
#### Snippet
```java
class TypeResolverFacade {

    private static final List<TypeResolver> DEPRECATED_TYPE_RESOLVERS = ServiceLoaders.loadAll(TypeResolver.class);

    private final List<ProviderEntry<InstancioServiceProvider.TypeResolver>> providerEntries;
```

### Deprecation
'org.instancio.spi.TypeResolver' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeResolverFacade.java`
#### Snippet
```java
class TypeResolverFacade {

    private static final List<TypeResolver> DEPRECATED_TYPE_RESOLVERS = ServiceLoaders.loadAll(TypeResolver.class);

    private final List<ProviderEntry<InstancioServiceProvider.TypeResolver>> providerEntries;
```

### Deprecation
'org.instancio.spi.TypeResolver' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeResolverFacade.java`
#### Snippet
```java

    private static Optional<Class<?>> resolvedViaDeprecatedSPI(final Class<?> typeToResolve) {
        for (TypeResolver resolver : DEPRECATED_TYPE_RESOLVERS) {
            final Optional<Class<?>> resolved = resolver.resolve(typeToResolve);
            if (resolved.isPresent()) {
```

### Deprecation
'resolve(java.lang.Class)' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/nodes/TypeResolverFacade.java`
#### Snippet
```java
    private static Optional<Class<?>> resolvedViaDeprecatedSPI(final Class<?> typeToResolve) {
        for (TypeResolver resolver : DEPRECATED_TYPE_RESOLVERS) {
            final Optional<Class<?>> resolved = resolver.resolve(typeToResolve);
            if (resolved.isPresent()) {
                return resolved;
```

### Deprecation
'org.instancio.internal.selectors.MetamodelSelector' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java
        Verify.notNull(selector, "Selector must not be null");

        if (selector instanceof MetamodelSelector) {
            return ((MetamodelSelector) selector).copyWithNewStackTraceHolder();
        } else if (selector instanceof SelectorGroupImpl) {
```

### Deprecation
'org.instancio.internal.selectors.MetamodelSelector' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java

        if (selector instanceof MetamodelSelector) {
            return ((MetamodelSelector) selector).copyWithNewStackTraceHolder();
        } else if (selector instanceof SelectorGroupImpl) {
            final List<TargetSelector> results = flattenSelectorGroup((SelectorGroupImpl) selector, rootClass);
```

### Deprecation
'org.instancio.internal.selectors.MetamodelSelector' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java

        for (Selector groupMember : selectorGroup.getSelectors()) {
            if (groupMember instanceof MetamodelSelector) {
                results.add(((MetamodelSelector) groupMember).copyWithNewStackTraceHolder());
            } else if (groupMember instanceof SelectorImpl) {
```

### Deprecation
'org.instancio.internal.selectors.MetamodelSelector' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/context/ModelContextHelper.java`
#### Snippet
```java
        for (Selector groupMember : selectorGroup.getSelectors()) {
            if (groupMember instanceof MetamodelSelector) {
                results.add(((MetamodelSelector) groupMember).copyWithNewStackTraceHolder());
            } else if (groupMember instanceof SelectorImpl) {
                final SelectorImpl selector = applyRootClass((SelectorImpl) groupMember, rootClass);
```

### Deprecation
'org.instancio.spi.GeneratorProvider' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/generator/GeneratorProviderFacade.java`
#### Snippet
```java
    private final GeneratorContext context;
    private final Generators generators;
    private final List<GeneratorProvider> generatorProviders;
    private final List<ProviderEntry<InstancioServiceProvider.GeneratorProvider>> providerEntries;
    private final AfterGenerate afterGenerate;
```

### Deprecation
'org.instancio.spi.GeneratorProvider' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/generator/GeneratorProviderFacade.java`
#### Snippet
```java
        final Class<?> forClass = node.getTargetClass();

        for (GeneratorProvider provider : generatorProviders) {
            final Generator<?> generator = provider.getGenerators(context).get(forClass);
            if (generator != null) {
```

### Deprecation
'getGenerators(org.instancio.generator.GeneratorContext)' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/generator/GeneratorProviderFacade.java`
#### Snippet
```java

        for (GeneratorProvider provider : generatorProviders) {
            final Generator<?> generator = provider.getGenerators(context).get(forClass);
            if (generator != null) {
                LOG.trace("Custom generator '{}' found for {}", generator.getClass().getName(), forClass);
```

### Deprecation
'org.instancio.spi.GeneratorProvider' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/generator/GeneratorProviderFacade.java`
#### Snippet
```java
    GeneratorProviderFacade(
            final GeneratorContext context,
            final List<GeneratorProvider> generatorProviders,
            final List<ProviderEntry<InstancioServiceProvider.GeneratorProvider>> providerEntries) {

```

### Deprecation
'org.instancio.spi.GeneratorProvider' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/generator/GeneratorResolver.java`
#### Snippet
```java
public class GeneratorResolver {

    private static final List<GeneratorProvider> DEPRECATED_PROVIDERS =
            ServiceLoaders.loadAll(GeneratorProvider.class);

```

### Deprecation
'org.instancio.spi.GeneratorProvider' is deprecated
in `instancio-core/src/main/java/org/instancio/internal/generator/GeneratorResolver.java`
#### Snippet
```java

    private static final List<GeneratorProvider> DEPRECATED_PROVIDERS =
            ServiceLoaders.loadAll(GeneratorProvider.class);

    private final GeneratorContext context;
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/URIAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface URIAsGeneratorSpec
        extends URIGeneratorSpec, AsGeneratorSpec<URI>, AsStringGeneratorSpec<URI> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/BigDecimalAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface BigDecimalAsGeneratorSpec
        extends BigDecimalGeneratorSpec, AsGeneratorSpec<BigDecimal>, AsStringGeneratorSpec<BigDecimal> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/EnumAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface EnumAsGeneratorSpec<E extends Enum<E>>
        extends AsGeneratorSpec<E>, AsStringGeneratorSpec<E>, EnumGeneratorSpec<E> {

    @SuppressWarnings("unchecked")
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/NumberAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface NumberAsGeneratorSpec<T extends Number>
        extends NumberGeneratorSpec<T>, AsGeneratorSpec<T>, AsStringGeneratorSpec<T> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/URLAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface URLAsGeneratorSpec
        extends URLGeneratorSpec, AsGeneratorSpec<URL>, AsStringGeneratorSpec<URL> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/TemporalAaStringGeneratorSpec.java`
#### Snippet
```java

/**
 * Generator spec for temporal values that supports {@link AsStringGeneratorSpec}.
 *
 * @since 2.6.0
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/TemporalAaStringGeneratorSpec.java`
#### Snippet
```java
 */
public interface TemporalAaStringGeneratorSpec<T>
        extends TemporalGeneratorSpec<T>, AsGeneratorSpec<T>, AsStringGeneratorSpec<T> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/CharacterAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface CharacterAsGeneratorSpec
        extends CharacterGeneratorSpec, AsGeneratorSpec<Character>, AsStringGeneratorSpec<Character> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/PathAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface PathAsGeneratorSpec<T>
        extends PathGeneratorSpec<T>, AsGeneratorSpec<T>, AsStringGeneratorSpec<T> {

    @Override
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/BooleanAsGeneratorSpec.java`
#### Snippet
```java
 */
public interface BooleanAsGeneratorSpec
        extends BooleanGeneratorSpec, AsGeneratorSpec<Boolean>, AsStringGeneratorSpec<Boolean> {

    /**
```

### Deprecation
'org.instancio.generator.AsStringGeneratorSpec' is deprecated
in `instancio-core/src/main/java/org/instancio/generator/specs/MonthDayGeneratorSpec.java`
#### Snippet
```java
 * @since 2.3.0
 */
public interface MonthDayGeneratorSpec extends AsGeneratorSpec<MonthDay>, AsStringGeneratorSpec<MonthDay> {

    /**
```

### Deprecation
'METAMODEL' is deprecated
in `instancio-tests/default-package-tests/src/test/java/DefaultPackageTest.java`
#### Snippet
```java
import static org.assertj.core.api.Assertions.assertThat;

@FeatureTag(Feature.METAMODEL)
@InstancioMetamodel(classes = DefaultPackageClass.class)
class DefaultPackageTest {
```

### Deprecation
'org.instancio.InstancioMetamodel' is deprecated
in `instancio-tests/default-package-tests/src/test/java/DefaultPackageTest.java`
#### Snippet
```java

@FeatureTag(Feature.METAMODEL)
@InstancioMetamodel(classes = DefaultPackageClass.class)
class DefaultPackageTest {

```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `instancio-junit/src/main/java/org/instancio/junit/internal/InstancioArgumentsProvider.java`
#### Snippet
```java

    static Object[] createObjects(final Type[] types, final Random random, final Settings settings) {
        return Arrays.stream(types).map(type -> createObject(type, random, settings)).collect(Collectors.toList()).toArray();
    }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-core/src/main/java/org/instancio/internal/ApiValidator.java`
#### Snippet
```java

    public static void validateSubtype(final Class<?> from, final Class<?> to) {
        isTrue(from.isAssignableFrom(to), () -> String.format("" +
                "invalid subtype mapping" +
                "%n -> class '%s' is not a subtype of '%s'", to.getTypeName(), from.getTypeName()));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-core/src/main/java/org/instancio/internal/ApiValidator.java`
#### Snippet
```java

    // Note: include nested generic class in the example as it's used as a validation message for this use case
    private static final String CREATE_TYPE_TOKEN_HELP = "" +
            "%n\tExample:" +
            "%n\tMap<String, List<Integer>> map = Instancio.create(new TypeToken<Map<String, List<Integer>>>(){});" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-core/src/main/java/org/instancio/internal/ApiValidator.java`
#### Snippet
```java
            "%n\tMap<String, List<Integer>> map = Instancio.of(new TypeToken<Map<String, List<Integer>>>(){}).create();";

    private static final String CREATE_CLASS_HELP = "" +
            "%n\tExample:" +
            "%n\tPerson person = Instancio.create(Person.class);" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-core/src/main/java/org/instancio/internal/util/Fail.java`
#### Snippet
```java
        final ErrorArgs errorArgs = unpackArgs(args);
        final String msgWithArgs = String.format(msg, errorArgs.args);
        final String fullErrorMsg = String.format("" +
                "%n" +
                "%s" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-core/src/main/java/org/instancio/internal/util/Fail.java`
#### Snippet
```java
        final String msgWithArgs = String.format(msg, errorArgs.args);

        final String fullErrorMsg = String.format("" +
                "%n" +
                "%nError creating an object" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-core/src/main/java/org/instancio/internal/util/Fail.java`
#### Snippet
```java
public final class Fail {

    static final String SUBMIT_BUG_REPORT_MSG = String.format("" +
            "Instancio encountered an error.%n" +
            "Please submit a bug report including the stacktrace:%n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `instancio-processor/src/main/java/org/instancio/processor/MetamodelSourceGenerator.java`
#### Snippet
```java
class MetamodelSourceGenerator {
    private static final String PACKAGE_TEMPLATE = "package %s;";
    private static final String IMPORTS = String.format(""
            + "import org.instancio.internal.selectors.MetamodelSelector;%n"
            + "import org.instancio.Selector;"
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `instancio-core/src/main/java/org/instancio/internal/context/SortedSetWithReverseInsertionOrder.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(@NotNull final T[] a) {
        throw new UnsupportedOperationException();
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringBlanknessBV.java`
#### Snippet
```java
    @Data
    public static class WithNotNull {
        @NotNull
        private String value;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
        @Size(min = 20)
        private String s2;
        @NotNull
        private String s3;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSize {
        @NotNull
        @Size(min = 8)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSizeZero {
        @NotNull
        @Size(max = 0)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSizeZero {
        @NotNull
        @Size
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSize {
        @NotNull
        @Size(max = 1)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxEqual {
        @NotNull
        @Size(min = 5, max = 5)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class ThreeFieldsOneMin {
        @NotNull
        private String s1;
        @NotNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxSize {
        @NotNull
        @Size(min = 19, max = 20)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringSizeBV.java`
#### Snippet
```java
        @NotNull
        private String s1;
        @NotNull
        @Size(min = 20)
        private String s2;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringDigitsBV.java`
#### Snippet
```java
        @Digits(integer = 15, fraction = 0)
        private String s2;
        @NotNull
        @Digits(integer = 1, fraction = 1)
        private String s3;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringDigitsBV.java`
#### Snippet
```java
        @Digits(integer = 0, fraction = 2)
        private String s0;
        @NotNull
        @Digits(integer = 1, fraction = 0)
        private String s1;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringDigitsBV.java`
#### Snippet
```java
    @Data
    public static class OnString {
        @NotNull
        @Digits(integer = 0, fraction = 2)
        private String s0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringDigitsBV.java`
#### Snippet
```java
    @Data
    public static class OnCharSequence {
        @NotNull
        @Digits(integer = 3, fraction = 5)
        private CharSequence value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringDigitsBV.java`
#### Snippet
```java
        @Digits(integer = 1, fraction = 1)
        private String s3;
        @NotNull
        @Digits(integer = 15, fraction = 20)
        private String s4;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringDigitsBV.java`
#### Snippet
```java
        @Digits(integer = 1, fraction = 0)
        private String s1;
        @NotNull
        @Digits(integer = 15, fraction = 0)
        private String s2;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/ArraySizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSizeZero {
        @NotNull
        @Size
        private int[] value;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/ArraySizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSizeZero {
        @NotNull
        @Size(max = 0)
        private int[] value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java

        @NotNull @Negative private BigInteger bigInteger;
        @NotNull @Negative private BigDecimal bigDecimal;
        //@formatter:on
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @Negative private Integer integerWrapper;
        @NotNull @Negative private Long longWrapper;
        @NotNull @Negative private Float floatWrapper;
        @NotNull @Negative private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @NegativeOrZero private Integer integerWrapper;
        @NotNull @NegativeOrZero private Long longWrapper;
        @NotNull @NegativeOrZero private Float floatWrapper;
        @NotNull @NegativeOrZero private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @NegativeOrZero private Double doubleWrapper;

        @NotNull @NegativeOrZero private BigInteger bigInteger;
        @NotNull @NegativeOrZero private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @Negative private Byte byteWrapper;
        @NotNull @Negative private Short shortWrapper;
        @NotNull @Negative private Integer integerWrapper;
        @NotNull @Negative private Long longWrapper;
        @NotNull @Negative private Float floatWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java

        @NotNull @Negative private Byte byteWrapper;
        @NotNull @Negative private Short shortWrapper;
        @NotNull @Negative private Integer integerWrapper;
        @NotNull @Negative private Long longWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java

        @NotNull @NegativeOrZero private Byte byteWrapper;
        @NotNull @NegativeOrZero private Short shortWrapper;
        @NotNull @NegativeOrZero private Integer integerWrapper;
        @NotNull @NegativeOrZero private Long longWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @Negative private Long longWrapper;
        @NotNull @Negative private Float floatWrapper;
        @NotNull @Negative private Double doubleWrapper;

        @NotNull @Negative private BigInteger bigInteger;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @Negative private Short shortWrapper;
        @NotNull @Negative private Integer integerWrapper;
        @NotNull @Negative private Long longWrapper;
        @NotNull @Negative private Float floatWrapper;
        @NotNull @Negative private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @NegativeOrZero private Long longWrapper;
        @NotNull @NegativeOrZero private Float floatWrapper;
        @NotNull @NegativeOrZero private Double doubleWrapper;

        @NotNull @NegativeOrZero private BigInteger bigInteger;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @NegativeOrZero private Short shortWrapper;
        @NotNull @NegativeOrZero private Integer integerWrapper;
        @NotNull @NegativeOrZero private Long longWrapper;
        @NotNull @NegativeOrZero private Float floatWrapper;
        @NotNull @NegativeOrZero private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @NegativeOrZero private Byte byteWrapper;
        @NotNull @NegativeOrZero private Short shortWrapper;
        @NotNull @NegativeOrZero private Integer integerWrapper;
        @NotNull @NegativeOrZero private Long longWrapper;
        @NotNull @NegativeOrZero private Float floatWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NegativeOrZero private double primitiveDouble;

        @NotNull @NegativeOrZero private Byte byteWrapper;
        @NotNull @NegativeOrZero private Short shortWrapper;
        @NotNull @NegativeOrZero private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @Negative private double primitiveDouble;

        @NotNull @Negative private Byte byteWrapper;
        @NotNull @Negative private Short shortWrapper;
        @NotNull @Negative private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java

        @NotNull @NegativeOrZero private BigInteger bigInteger;
        @NotNull @NegativeOrZero private BigDecimal bigDecimal;
        //@formatter:on
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersNegativeBV.java`
#### Snippet
```java
        @NotNull @Negative private Double doubleWrapper;

        @NotNull @Negative private BigInteger bigInteger;
        @NotNull @Negative private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 4, fraction = 0)
        private Long longWrapper;
        @NotNull @Digits(integer = 5, fraction = 0)
        private Float floatWrapper;
        @NotNull @Digits(integer = 6, fraction = 0)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        private double primitiveDouble;

        @NotNull @Digits(integer = 0, fraction = 4)
        private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 2, fraction = 0)
        private Short shortWrapper;
        @NotNull @Digits(integer = 3, fraction = 0)
        private Integer integerWrapper;
        @NotNull @Digits(integer = 4, fraction = 0)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 3, fraction = 0)
        private Integer integerWrapper;
        @NotNull @Digits(integer = 4, fraction = 0)
        private Long longWrapper;
        @NotNull @Digits(integer = 5, fraction = 0)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        private Double doubleWrapper;

        @NotNull @Digits(integer = 9, fraction = 20)
        private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 5, fraction = 3)
        private Float floatWrapper;
        @NotNull @Digits(integer = 6, fraction = 4)
        private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        private double primitiveDouble;

        @NotNull @Digits(integer = 5, fraction = 3)
        private Float floatWrapper;
        @NotNull @Digits(integer = 6, fraction = 4)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 11, fraction = 0)
        private BigInteger bigInteger;
        @NotNull @Digits(integer = 12, fraction = 0)
        private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 1, fraction = 0)
        private Byte byteWrapper;
        @NotNull @Digits(integer = 2, fraction = 0)
        private Short shortWrapper;
        @NotNull @Digits(integer = 3, fraction = 0)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        private Double doubleWrapper;

        @NotNull @Digits(integer = 11, fraction = 0)
        private BigInteger bigInteger;
        @NotNull @Digits(integer = 12, fraction = 0)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        @NotNull @Digits(integer = 5, fraction = 0)
        private Float floatWrapper;
        @NotNull @Digits(integer = 6, fraction = 0)
        private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDigitsBV.java`
#### Snippet
```java
        private double primitiveDouble;

        @NotNull @Digits(integer = 1, fraction = 0)
        private Byte byteWrapper;
        @NotNull @Digits(integer = 2, fraction = 0)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private String[] array;
    @NotNull private Collection<String> collection;
    @NotNull private Map<UUID, Integer> map;
    //@formatter:on
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private Byte byteWrapper;
    @NotNull private Short shortWrapper;
    @NotNull private Integer integerWrapper;
    @NotNull private Long longWrapper;
    @NotNull private Float floatWrapper;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private String string;
    @NotNull private byte primitiveByte;
    @NotNull private short primitiveShort;
    @NotNull private int primitiveInt;
    @NotNull private long primitiveLong;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private Float floatWrapper;
    @NotNull private Double doubleWrapper;
    @NotNull private BigInteger bigInteger;
    @NotNull private BigDecimal bigDecimal;
    @NotNull private String[] array;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private long primitiveLong;
    @NotNull private float primitiveFloat;
    @NotNull private double primitiveDouble;
    @NotNull private Byte byteWrapper;
    @NotNull private Short shortWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private Integer integerWrapper;
    @NotNull private Long longWrapper;
    @NotNull private Float floatWrapper;
    @NotNull private Double doubleWrapper;
    @NotNull private BigInteger bigInteger;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private short primitiveShort;
    @NotNull private int primitiveInt;
    @NotNull private long primitiveLong;
    @NotNull private float primitiveFloat;
    @NotNull private double primitiveDouble;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private byte primitiveByte;
    @NotNull private short primitiveShort;
    @NotNull private int primitiveInt;
    @NotNull private long primitiveLong;
    @NotNull private float primitiveFloat;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private float primitiveFloat;
    @NotNull private double primitiveDouble;
    @NotNull private Byte byteWrapper;
    @NotNull private Short shortWrapper;
    @NotNull private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private Double doubleWrapper;
    @NotNull private BigInteger bigInteger;
    @NotNull private BigDecimal bigDecimal;
    @NotNull private String[] array;
    @NotNull private Collection<String> collection;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    //@formatter:off
    @NotNull private String string;
    @NotNull private byte primitiveByte;
    @NotNull private short primitiveShort;
    @NotNull private int primitiveInt;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private double primitiveDouble;
    @NotNull private Byte byteWrapper;
    @NotNull private Short shortWrapper;
    @NotNull private Integer integerWrapper;
    @NotNull private Long longWrapper;
```

### NullableProblems
Primitive type members cannot be annotated
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private int primitiveInt;
    @NotNull private long primitiveLong;
    @NotNull private float primitiveFloat;
    @NotNull private double primitiveDouble;
    @NotNull private Byte byteWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private BigDecimal bigDecimal;
    @NotNull private String[] array;
    @NotNull private Collection<String> collection;
    @NotNull private Map<UUID, Integer> map;
    //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private Long longWrapper;
    @NotNull private Float floatWrapper;
    @NotNull private Double doubleWrapper;
    @NotNull private BigInteger bigInteger;
    @NotNull private BigDecimal bigDecimal;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java

    //@formatter:off
    @NotNull private String string;
    @NotNull private byte primitiveByte;
    @NotNull private short primitiveShort;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NotNullBv.java`
#### Snippet
```java
    @NotNull private Short shortWrapper;
    @NotNull private Integer integerWrapper;
    @NotNull private Long longWrapper;
    @NotNull private Float floatWrapper;
    @NotNull private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Float floatWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Short shortWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Integer integerWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    private double primitiveDouble;

    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Byte byteWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    private Double doubleWrapper;

    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private BigInteger bigInteger;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private BigInteger bigInteger;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private BigDecimal bigDecimal;
    //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Integer integerWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Long longWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Byte byteWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Short shortWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    private Double doubleWrapper;

    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private BigInteger bigInteger;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Long longWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Float floatWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Long longWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Float floatWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private BigInteger bigInteger;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private BigDecimal bigDecimal;
    //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Short shortWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Integer integerWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Byte byteWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Short shortWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    private double primitiveDouble;

    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Byte byteWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Float floatWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Integer integerWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Long longWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EmailComboBV.java`
#### Snippet
```java
        private String emailThenSize;

        @NotNull
        @Size(min = 10, max = 10)
        @Email
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EmailComboBV.java`
#### Snippet
```java
    public static class NotNullEmailWithSize {
        @Email
        @NotNull
        @Size(min = 15, max = 20)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EmailComboBV.java`
#### Snippet
```java
    @Data
    public static class EmailWithSize {
        @NotNull
        @Email
        @Size(min = 7, max = 12)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EmailBV.java`
#### Snippet
```java
    @Data
    public static class OnString {
        @NotNull
        @Email
        private String email;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EmailBV.java`
#### Snippet
```java
    @Data
    public static class OnCharSequence {
        @NotNull
        @Email
        private CharSequence email;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/MapSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSizeZero {
        @NotNull
        @Size(max = 0)
        private NavigableMap<Integer, String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/MapSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSize {
        @NotNull
        @Size(min = 8)
        private Map<String, Long> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/MapSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSize {
        @NotNull
        @Size(max = 1)
        private HashMap<UUID, BigDecimal> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/MapSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxSize {
        @NotNull
        @Size(min = 19, max = 20)
        private TreeMap<String, Character> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/MapSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSizeZero {
        @NotNull
        @Size
        private SortedMap<Integer, String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/MapSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxEqual {
        @NotNull
        @Size(min = 5, max = 5)
        private Map<Long, Double> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CollectionSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSizeZero {
        @NotNull
        @Size(max = 0)
        private ArrayList<String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CollectionSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxEqual {
        @NotNull
        @Size(min = 5, max = 5)
        private Queue<String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CollectionSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxSize {
        @NotNull
        @Size(min = 19, max = 20)
        private Deque<String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CollectionSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSize {
        @NotNull
        @Size(max = 1)
        private Set<String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CollectionSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSize {
        @NotNull
        @Size(min = 8)
        private Collection<String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CollectionSizeBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSizeZero {
        @NotNull
        @Size
        private List<String> value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    private double primitiveDouble;

    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Byte byteWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private BigInteger bigInteger;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private BigDecimal bigDecimal;
    //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Byte byteWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Short shortWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    private Double doubleWrapper;

    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private BigInteger bigInteger;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Float floatWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Short shortWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Integer integerWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Long longWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Float floatWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersDecimalMinMaxPositiveBV.java`
#### Snippet
```java
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Integer integerWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
    private Long longWrapper;
    @NotNull @DecimalMin(MIN_STR) @DecimalMax(MAX_STR)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @PositiveOrZero private Integer integerWrapper;
        @NotNull @PositiveOrZero private Long longWrapper;
        @NotNull @PositiveOrZero private Float floatWrapper;
        @NotNull @PositiveOrZero private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    private Double doubleWrapper;

    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private BigInteger bigInteger;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @PositiveOrZero private Long longWrapper;
        @NotNull @PositiveOrZero private Float floatWrapper;
        @NotNull @PositiveOrZero private Double doubleWrapper;

        @NotNull @PositiveOrZero private BigInteger bigInteger;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Float floatWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @Positive private Short shortWrapper;
        @NotNull @Positive private Integer integerWrapper;
        @NotNull @Positive private Long longWrapper;
        @NotNull @Positive private Float floatWrapper;
        @NotNull @Positive private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Byte byteWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Short shortWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @Positive private Byte byteWrapper;
        @NotNull @Positive private Short shortWrapper;
        @NotNull @Positive private Integer integerWrapper;
        @NotNull @Positive private Long longWrapper;
        @NotNull @Positive private Float floatWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Integer integerWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Long longWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @PositiveOrZero private double primitiveDouble;

        @NotNull @PositiveOrZero private Byte byteWrapper;
        @NotNull @PositiveOrZero private Short shortWrapper;
        @NotNull @PositiveOrZero private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    private double primitiveDouble;

    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Byte byteWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @PositiveOrZero private Short shortWrapper;
        @NotNull @PositiveOrZero private Integer integerWrapper;
        @NotNull @PositiveOrZero private Long longWrapper;
        @NotNull @PositiveOrZero private Float floatWrapper;
        @NotNull @PositiveOrZero private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Long longWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Float floatWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private BigInteger bigInteger;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private BigDecimal bigDecimal;
    //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java

        @NotNull @Positive private Byte byteWrapper;
        @NotNull @Positive private Short shortWrapper;
        @NotNull @Positive private Integer integerWrapper;
        @NotNull @Positive private Long longWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersMinMaxNegativeBV.java`
#### Snippet
```java
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Short shortWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
    private Integer integerWrapper;
    @NotNull @Min(MIN_VAL) @Max(MAX_VAL)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @Positive private Double doubleWrapper;

        @NotNull @Positive private BigInteger bigInteger;
        @NotNull @Positive private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @Positive private Long longWrapper;
        @NotNull @Positive private Float floatWrapper;
        @NotNull @Positive private Double doubleWrapper;

        @NotNull @Positive private BigInteger bigInteger;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java

        @NotNull @PositiveOrZero private Byte byteWrapper;
        @NotNull @PositiveOrZero private Short shortWrapper;
        @NotNull @PositiveOrZero private Integer integerWrapper;
        @NotNull @PositiveOrZero private Long longWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @Positive private double primitiveDouble;

        @NotNull @Positive private Byte byteWrapper;
        @NotNull @Positive private Short shortWrapper;
        @NotNull @Positive private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java

        @NotNull @PositiveOrZero private BigInteger bigInteger;
        @NotNull @PositiveOrZero private BigDecimal bigDecimal;
        //@formatter:on
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @PositiveOrZero private Double doubleWrapper;

        @NotNull @PositiveOrZero private BigInteger bigInteger;
        @NotNull @PositiveOrZero private BigDecimal bigDecimal;
        //@formatter:on
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @Positive private Integer integerWrapper;
        @NotNull @Positive private Long longWrapper;
        @NotNull @Positive private Float floatWrapper;
        @NotNull @Positive private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java
        @NotNull @PositiveOrZero private Byte byteWrapper;
        @NotNull @PositiveOrZero private Short shortWrapper;
        @NotNull @PositiveOrZero private Integer integerWrapper;
        @NotNull @PositiveOrZero private Long longWrapper;
        @NotNull @PositiveOrZero private Float floatWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-jakarta-tests/src/main/java/org/instancio/test/pojo/beanvalidation/NumbersPositiveBV.java`
#### Snippet
```java

        @NotNull @Positive private BigInteger bigInteger;
        @NotNull @Positive private BigDecimal bigDecimal;
        //@formatter:on
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/UniqueElementsWithSizeBV.java`
#### Snippet
```java
    public static class WithUnsupportedType {
        // Unsupported type for @UniqueElements, the annotation should be ignored.
        @NotNull
        @UniqueElements
        private String string;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/UniqueElementsWithSizeBV.java`
#### Snippet
```java
        public static final int MAX_SIZE = 2;

        @NotNull
        @Size(min = MIN_SIZE, max = MAX_SIZE)
        @UniqueElements
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EmailComboBV.java`
#### Snippet
```java
    public static class NotNullEmailWithLength {
        @Email
        @NotNull
        @Length(min = 15, max = 20)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
        @Length(min = 20)
        private String s2;
        @NotNull
        private String s3;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxEqual {
        @NotNull
        @Length(min = 5, max = 5)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(max = 20) // min = 0
        @Mod11Check(startIndex = 5, endIndex = 10, checkDigitIndex = 10, treatCheck10As = 'A', treatCheck11As = 'B')
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value1;

        @NotNull
        @Length(min = 20)
        @Mod11Check(startIndex = 3, endIndex = 10, checkDigitIndex = 10, threshold = 5, treatCheck10As = 'C', treatCheck11As = 'N')
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value2;

        @NotNull
        @Length(max = 50) // min = 0
        @Mod11Check(startIndex = 10, endIndex = 25, checkDigitIndex = 5, threshold = 9, processingDirection = Mod11Check.ProcessingDirection.LEFT_TO_RIGHT)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
        @NotNull
        private String s1;
        @NotNull
        @Length(min = 20)
        private String s2;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndAndCheckDigitIndices {
        @NotNull
        @Length(min = 17)
        @Mod11Check(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSize {
        @NotNull
        @Length(min = 8)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value1;

        @NotNull
        @Length(min = 10, max = 15)
        @Mod11Check(startIndex = 3, endIndex = 10, threshold = 5, treatCheck10As = 'C', treatCheck11As = 'N')
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSize {
        @NotNull
        @Length(max = 1)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value2;

        @NotNull
        @Length(max = 50) // min = 0
        @Mod11Check(startIndex = 10, endIndex = 25, checkDigitIndex = 25, threshold = 9, processingDirection = Mod11Check.ProcessingDirection.LEFT_TO_RIGHT)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class ThreeFieldsOneMin {
        @NotNull
        private String s1;
        @NotNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(min = 20, max = 22)
        @Mod11Check(startIndex = 5, endIndex = 10, treatCheck10As = 'A', treatCheck11As = 'B')
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithMaxSizeZero {
        @NotNull
        @Length(max = 0)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value2;

        @NotNull
        @Length(min = 15, max = 20)
        @Mod11Check(startIndex = 5, endIndex = 15, threshold = 9, processingDirection = Mod11Check.ProcessingDirection.LEFT_TO_RIGHT)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndIndices {
        @NotNull
        @Length(min = 8, max = 8)
        @Mod11Check(startIndex = 0, endIndex = 7)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithMinSizeZero {
        @NotNull
        @Length
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithEndAndCheckDigitIndicesEqual {
        @NotNull
        @Length(min = 17)
        @Mod11Check(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/StringLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithMinMaxSize {
        @NotNull
        @Length(min = 19, max = 20)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(max = 20) // min = 0
        @Mod11Check(startIndex = 5, endIndex = 10, checkDigitIndex = 3, treatCheck10As = 'A', treatCheck11As = 'B')
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
        private String value1;

        @NotNull
        @Length(min = 20)
        @Mod11Check(startIndex = 3, endIndex = 10, checkDigitIndex = 15, threshold = 5, treatCheck10As = 'C', treatCheck11As = 'N')
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod11CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithDefaults {
        @NotNull
        @Length(min = 10)
        @Mod11Check
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/CreditCardNumberBV.java`
#### Snippet
```java
public class CreditCardNumberBV {

    @NotNull
    @CreditCardNumber
    private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Byte byteWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigInteger bigInteger;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigDecimal bigDecimal;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Byte byteWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @Range(min = MIN_VAL, max = MAX_VAL) private double primitiveDouble;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Byte byteWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigInteger bigInteger;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigDecimal bigDecimal;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private String string;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigInteger bigInteger;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangePositiveBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigDecimal bigDecimal;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private String string;
    //@formatter:on
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/IsbnBV.java`
#### Snippet
```java

    @ISBN
    @NotNull
    private String isbn13;
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/UrlBV.java`
#### Snippet
```java
    @Data
    public static class WithAttributes {
        @NotNull
        @URL(protocol = PROTOCOL, host = HOST, port = PORT)
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/UrlBV.java`
#### Snippet
```java
    @Data
    public static class WithDefaults {
        @NotNull
        @URL
        private String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EanBV.java`
#### Snippet
```java

    @EAN
    @NotNull
    private String ean13;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/EanBV.java`
#### Snippet
```java

    @EAN(type = EAN.Type.EAN8)
    @NotNull
    private String ean8;
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/person/PhoneBV.java`
#### Snippet
```java
    private String countryCode;

    @NotNull
    @Digits(integer = 7, fraction = 0)
    private String number;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(max = 20) // min = 0
        @LuhnCheck(startIndex = 5, endIndex = 10, checkDigitIndex = 3)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndIndices {
        @NotNull
        @Length(min = 8, max = 8)
        @LuhnCheck(startIndex = 0, endIndex = 7)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(max = 20) // min = 0
        @LuhnCheck(startIndex = 5, endIndex = 10, checkDigitIndex = 10)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithDefaults {
        @NotNull
        @Length(min = 10)
        @LuhnCheck
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndAndCheckDigitIndices {
        @NotNull
        @Length(min = 17)
        @LuhnCheck(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithEndAndCheckDigitIndicesEqual {
        @NotNull
        @Length(min = 17)
        @LuhnCheck(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/LuhnCheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(min = 20, max = 22)
        @LuhnCheck(startIndex = 5, endIndex = 10)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value1;

        @NotNull
        @Length(min = 10, max = 15)
        @Mod10Check(startIndex = 3, endIndex = 10, multiplier = 5)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/person/AddressBV.java`
#### Snippet
```java
    private String country;

    @NotNull
    @Size(min = 1, max = 5)
    private List<PhoneBV> phoneNumbers;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(max = 20) // min = 0
        @Mod10Check(startIndex = 5, endIndex = 10, checkDigitIndex = 10)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value2;

        @NotNull
        @Length(max = 50) // min = 0
        @Mod10Check(startIndex = 10, endIndex = 25, checkDigitIndex = 25, multiplier = 7, weight = 3)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndIndices {
        @NotNull
        @Length(min = 8, max = 8)
        @Mod10Check(startIndex = 0, endIndex = 7)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithStartEndAndCheckDigitIndices {
        @NotNull
        @Length(min = 17)
        @Mod10Check(startIndex = 0, endIndex = 7, checkDigitIndex = 8)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value2;

        @NotNull
        @Length(min = 15, max = 20)
        @Mod10Check(startIndex = 5, endIndex = 15, multiplier = 7, weight = 3)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(min = 20, max = 22)
        @Mod10Check(startIndex = 5, endIndex = 10)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value0;

        @NotNull
        @Length(max = 20) // min = 0
        @Mod10Check(startIndex = 5, endIndex = 10, checkDigitIndex = 3)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithEndAndCheckDigitIndicesEqual {
        @NotNull
        @Length(min = 17)
        @Mod10Check(startIndex = 0, endIndex = 7, checkDigitIndex = 7)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
    @Data
    public static class WithDefaults {
        @NotNull
        @Length(min = 10)
        @Mod10Check
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value1;

        @NotNull
        @Length(min = 20)
        @Mod10Check(startIndex = 3, endIndex = 10, checkDigitIndex = 10, multiplier = 5)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value2;

        @NotNull
        @Length(max = 50) // min = 0
        @Mod10Check(startIndex = 10, endIndex = 25, checkDigitIndex = 5, multiplier = 7, weight = 3)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/Mod10CheckAndLengthBV.java`
#### Snippet
```java
        private String value1;

        @NotNull
        @Length(min = 20)
        @Mod10Check(startIndex = 3, endIndex = 10, checkDigitIndex = 15, multiplier = 5)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/person/PersonBV.java`
#### Snippet
```java

    @PersonName // this his not a validation annotation and should be ignored
    @NotNull
    @Length(min = 2)
    private String name;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/person/PersonBV.java`
#### Snippet
```java
public class PersonBV {

    @NotNull
    @UUID
    private String uuid;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @Range(min = MIN_VAL, max = MAX_VAL) private double primitiveDouble;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Byte byteWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigInteger bigInteger;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigDecimal bigDecimal;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigInteger bigInteger;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigDecimal bigDecimal;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private String string;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigInteger bigInteger;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Byte byteWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private BigDecimal bigDecimal;

    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private String string;
    //@formatter:on
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Byte byteWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Short shortWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `instancio-tests/bean-validation-hibernate-tests/src/main/java/org/instancio/test/pojo/beanvalidation/RangeNegativeBV.java`
#### Snippet
```java
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Integer integerWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Long longWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Float floatWrapper;
    @NotNull @Range(min = MIN_VAL, max = MAX_VAL) private Double doubleWrapper;

```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `instancio-tests/instancio-test-support/src/main/java/org/instancio/test/support/util/ArrayUtils.java`
#### Snippet
```java
    public static <T> List<T> toList(T... values) {
        List<T> result = new ArrayList<>();
        for (T v : values) result.add(v);
        return result;
    }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/util/IOUtils.java`
#### Snippet
```java
        Verify.notNull(inputStream, "Input stream is null");
        try (InputStream in = inputStream;
             OutputStream out = Files.newOutputStream(path)) {
            final byte[] buf = new byte[512];
            for (int read; (read = in.read(buf)) != -1; ) { // NOPMD
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/util/IOUtils.java`
#### Snippet
```java
             OutputStream out = Files.newOutputStream(path)) {
            final byte[] buf = new byte[512];
            for (int read; (read = in.read(buf)) != -1; ) { // NOPMD
                out.write(buf, 0, read);
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/util/IOUtils.java`
#### Snippet
```java
            final byte[] buf = new byte[512];
            for (int read; (read = in.read(buf)) != -1; ) { // NOPMD
                out.write(buf, 0, read);
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/context/PropertiesLoader.java`
#### Snippet
```java
            }
            LOG.info("Found '{}' on classpath", file);
            properties.load(inStream);
            return properties;
        } catch (IOException ex) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/generator/net/InetAddressGenerator.java`
#### Snippet
```java

    InetAddress getLocalHost() throws UnknownHostException {
        return InetAddress.getLocalHost();
    }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/generator/nio/file/PathGenerator.java`
#### Snippet
```java

        if (!Files.exists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }
        if (!Files.exists(completePath)) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/generator/nio/file/PathGenerator.java`
#### Snippet
```java
        if (!Files.exists(completePath)) {
            if (createPathType == CreatePathType.FILE) {
                final Path file = Files.createFile(completePath);
                if (inputStream != null) {
                    IOUtils.writeTo(file, inputStream);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-core/src/main/java/org/instancio/internal/generator/nio/file/PathGenerator.java`
#### Snippet
```java
                return file;
            } else if (createPathType == CreatePathType.DIRECTORY) {
                return Files.createDirectory(completePath);
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-processor/src/main/java/org/instancio/processor/InstancioAnnotationProcessor.java`
#### Snippet
```java
        final String filename = metaModelClass.getMetamodelClassName();

        try (Writer writer = new BufferedWriter(filer.createSourceFile(filename, element).openWriter())) {
            logger.debug("Generating metamodel class: %s", filename);
            writer.write(sourceGenerator.getSource(metaModelClass));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-processor/src/main/java/org/instancio/processor/InstancioAnnotationProcessor.java`
#### Snippet
```java
        final String filename = metaModelClass.getMetamodelClassName();

        try (Writer writer = new BufferedWriter(filer.createSourceFile(filename, element).openWriter())) {
            logger.debug("Generating metamodel class: %s", filename);
            writer.write(sourceGenerator.getSource(metaModelClass));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `instancio-processor/src/main/java/org/instancio/processor/InstancioAnnotationProcessor.java`
#### Snippet
```java
        try (Writer writer = new BufferedWriter(filer.createSourceFile(filename, element).openWriter())) {
            logger.debug("Generating metamodel class: %s", filename);
            writer.write(sourceGenerator.getSource(metaModelClass));
        } catch (Exception ex) {
            logger.warn("Error generating metamodel for '%s'", metaModelClass, ex);
```

