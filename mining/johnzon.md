# johnzon 
 
# Bad smells
I found 1185 bad smells with 56 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantClassCall | 697 | false |
| ReturnNull | 120 | false |
| BoundedWildcard | 46 | false |
| RedundantFieldInitialization | 31 | false |
| UnnecessaryModifier | 29 | true |
| NestedAssignment | 27 | false |
| ConstantValue | 23 | false |
| MissortedModifiers | 12 | false |
| SynchronizeOnThis | 12 | false |
| DynamicRegexReplaceableByCompiledPattern | 12 | false |
| UnnecessaryFullyQualifiedName | 11 | false |
| NonProtectedConstructorInAbstractClass | 11 | true |
| TrivialStringConcatenation | 9 | false |
| DataFlowIssue | 8 | false |
| ZeroLengthArrayInitialization | 7 | false |
| SimplifyOptionalCallChains | 6 | false |
| TypeParameterHidesVisibleType | 6 | false |
| PublicFieldAccessedInSynchronizedContext | 6 | false |
| UnusedAssignment | 5 | false |
| CharsetObjectCanBeUsed | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| SizeReplaceableByIsEmpty | 4 | true |
| UnnecessaryUnboxing | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| CommentedOutCode | 3 | false |
| StringBufferReplaceableByString | 3 | false |
| RedundantMethodOverride | 3 | false |
| DoubleBraceInitialization | 3 | false |
| IOResource | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| MismatchedJavadocCode | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| WhileCanBeForeach | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| DuplicateExpressions | 2 | false |
| AnonymousHasLambdaAlternative | 2 | false |
| CodeBlock2Expr | 2 | true |
| EmptyMethod | 2 | false |
| StringRepeatCanBeUsed | 2 | false |
| Convert2MethodRef | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| RegExpDuplicateAlternationBranch | 2 | false |
| StringEqualsEmptyString | 2 | false |
| MissingDeprecatedAnnotation | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| StaticCallOnSubclass | 1 | false |
| Java8ListReplaceAll | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| IgnoreResultOfCall | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| SimplifiableBooleanExpression | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantImplements | 1 | false |
| InstanceofCatchParameter | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| RedundantLengthCheck | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| UnnecessaryBoxing | 1 | false |
| ReplaceNullCheck | 1 | false |
| Java8MapApi | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Type\[args.size()\]'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        }
        if (args != null) {
            return new JohnzonParameterizedType(parameterizedType.getRawType(), args.toArray(new Type[args.size()]));
        }
        return value;
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new AccessMode.Writer\[all.size()\]'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }
            }
            this.delegates = all.toArray(new AccessMode.Writer[all.size()]);
        }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new AccessMode.Reader\[all.size()\]'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }
            }
            this.delegates = all.toArray(new AccessMode.Reader[all.size()]);
        }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
    
    static final byte COMMA_EVENT=Byte.MAX_VALUE;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
    
    static final byte COMMA_EVENT=Byte.MAX_VALUE;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    String NULL = "null".intern();
    
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    String NULL = "null".intern();
    
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    
    static final byte COMMA_EVENT=Byte.MAX_VALUE;
    static final byte KEY_SEPARATOR_EVENT=Byte.MIN_VALUE;
    
    static final Event[] EVT_MAP =Event.values();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    
    static final byte COMMA_EVENT=Byte.MAX_VALUE;
    static final byte KEY_SEPARATOR_EVENT=Byte.MIN_VALUE;
    
    static final Event[] EVT_MAP =Event.values();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
    
    static final byte COMMA_EVENT=Byte.MAX_VALUE;
    static final byte KEY_SEPARATOR_EVENT=Byte.MIN_VALUE;
    
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
    
    static final byte COMMA_EVENT=Byte.MAX_VALUE;
    static final byte KEY_SEPARATOR_EVENT=Byte.MIN_VALUE;
    
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_TRUE=(byte) Event.VALUE_TRUE.ordinal();
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
    
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte VALUE_FALSE=(byte) Event.VALUE_FALSE.ordinal(); 
    static final byte VALUE_NULL=(byte) Event.VALUE_NULL.ordinal();
    static final byte END_OBJECT=(byte) Event.END_OBJECT.ordinal();
    static final byte END_ARRAY=(byte) Event.END_ARRAY.ordinal();
    
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte KEY_SEPARATOR_EVENT=Byte.MIN_VALUE;
    
    static final Event[] EVT_MAP =Event.values();
    
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte KEY_SEPARATOR_EVENT=Byte.MIN_VALUE;
    
    static final Event[] EVT_MAP =Event.values();
    
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
    static final byte START_OBJECT = (byte) Event.START_OBJECT.ordinal();
    static final byte KEY_NAME=(byte) Event.KEY_NAME.ordinal();
    static final byte VALUE_STRING=(byte) Event.VALUE_STRING.ordinal(); 
    static final byte VALUE_NUMBER=(byte) Event.VALUE_NUMBER.ordinal(); 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/Config.java`
#### Snippet
```java
)
public @interface Config {
    public static final String CONFIG_PID = "org.apache.johnzon.jaxrs.jsonb";

    @AttributeDefinition(description = "List of fully qualified class names to ignore")
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/Config.java`
#### Snippet
```java
)
public @interface Config {
    public static final String CONFIG_PID = "org.apache.johnzon.jaxrs.jsonb";

    @AttributeDefinition(description = "List of fully qualified class names to ignore")
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/Config.java`
#### Snippet
```java
)
public @interface Config {
    public static final String CONFIG_PID = "org.apache.johnzon.jaxrs.jsonb";

    @AttributeDefinition(description = "List of fully qualified class names to ignore")
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getInstance()` declared in class 'java.util.Calendar' but referenced via subclass 'java.util.GregorianCalendar'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
                public GregorianCalendar fromString(final String text) {
                    final ZonedDateTime zonedDateTime = parseZonedDateTime(text, dateTimeFormatter, zoneIDUTC);
                    final Calendar instance = GregorianCalendar.getInstance();
                    instance.setTimeZone(TimeZone.getTimeZone(zonedDateTime.getZone()));
                    instance.setTime(Date.from(zonedDateTime.toInstant()));
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
        private void loadMapping(final Type rtType) {
            final Class<?> from;
            if (ParameterizedType.class.isInstance(rtType)) {
                final Type rawType = ParameterizedType.class.cast(rtType).getRawType();
                if (!Class.class.isInstance(rawType)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
            final Class<?> from;
            if (ParameterizedType.class.isInstance(rtType)) {
                final Type rawType = ParameterizedType.class.cast(rtType).getRawType();
                if (!Class.class.isInstance(rawType)) {
                    throw new IllegalStateException("Unsupported type: " + rawType);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
            if (ParameterizedType.class.isInstance(rtType)) {
                final Type rawType = ParameterizedType.class.cast(rtType).getRawType();
                if (!Class.class.isInstance(rawType)) {
                    throw new IllegalStateException("Unsupported type: " + rawType);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
                    throw new IllegalStateException("Unsupported type: " + rawType);
                }
                from = Class.class.cast(rawType);
            } else if (Class.class.isInstance(rtType)) {
                from = Class.class.cast(rtType);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
                }
                from = Class.class.cast(rawType);
            } else if (Class.class.isInstance(rtType)) {
                from = Class.class.cast(rtType);
            } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
                from = Class.class.cast(rawType);
            } else if (Class.class.isInstance(rtType)) {
                from = Class.class.cast(rtType);
            } else {
                throw new IllegalStateException("Unsupported type: " + rtType);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/TypeValidation.java`
#### Snippet
```java

    private Stream<? extends JsonValue.ValueType> mapType(final JsonValue value) {
        switch (JsonString.class.cast(value).getString()) {
            case "null":
                return Stream.of(JsonValue.ValueType.NULL);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/TypeValidation.java`
#### Snippet
```java
    public Optional<Function<JsonValue, Stream<ValidationResult.ValidationError>>> create(final ValidationContext model) {
        final JsonValue value = model.getSchema().get("type");
        if (JsonString.class.isInstance(value)) {
            return Optional.of(new Impl(model.toPointer(), model.getValueProvider(), mapType(JsonString.class.cast(value)).toArray(JsonValue.ValueType[]::new)));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/TypeValidation.java`
#### Snippet
```java
        final JsonValue value = model.getSchema().get("type");
        if (JsonString.class.isInstance(value)) {
            return Optional.of(new Impl(model.toPointer(), model.getValueProvider(), mapType(JsonString.class.cast(value)).toArray(JsonValue.ValueType[]::new)));
        }
        if (JsonArray.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/TypeValidation.java`
#### Snippet
```java
            return Optional.of(new Impl(model.toPointer(), model.getValueProvider(), mapType(JsonString.class.cast(value)).toArray(JsonValue.ValueType[]::new)));
        }
        if (JsonArray.class.isInstance(value)) {
            return Optional.of(new Impl(model.toPointer(), model.getValueProvider(),
                    value.asJsonArray().stream().flatMap(this::mapType).toArray(JsonValue.ValueType[]::new)));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
    private Type resolveType(final Type type, final Class<?> declaringClass) {
        final Type realType = extractRealType(declaringClass, type);
        if (ParameterizedType.class.isInstance(type) && (realType != type ||
                Stream.of(ParameterizedType.class.cast(type).getActualTypeArguments()).anyMatch(TypeVariable.class::isInstance))) {
            return resolveParameterizedType(type, declaringClass);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        final Type realType = extractRealType(declaringClass, type);
        if (ParameterizedType.class.isInstance(type) && (realType != type ||
                Stream.of(ParameterizedType.class.cast(type).getActualTypeArguments()).anyMatch(TypeVariable.class::isInstance))) {
            return resolveParameterizedType(type, declaringClass);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            return resolveParameterizedType(type, declaringClass);
        }
        if (TypeVariable.class.isInstance(type) && declaringClass.getSuperclass() != null) {
            final TypeVariable tv = TypeVariable.class.cast(type);
            final TypeVariable<? extends Class<?>>[] typeParameters = declaringClass.getSuperclass().getTypeParameters();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        }
        if (TypeVariable.class.isInstance(type) && declaringClass.getSuperclass() != null) {
            final TypeVariable tv = TypeVariable.class.cast(type);
            final TypeVariable<? extends Class<?>>[] typeParameters = declaringClass.getSuperclass().getTypeParameters();
            if (typeParameters != null && ParameterizedType.class.isInstance(declaringClass.getGenericSuperclass())) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            final TypeVariable tv = TypeVariable.class.cast(type);
            final TypeVariable<? extends Class<?>>[] typeParameters = declaringClass.getSuperclass().getTypeParameters();
            if (typeParameters != null && ParameterizedType.class.isInstance(declaringClass.getGenericSuperclass())) {
                final ParameterizedType pt = ParameterizedType.class.cast(declaringClass.getGenericSuperclass());
                if (typeParameters.length == pt.getActualTypeArguments().length) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            final TypeVariable<? extends Class<?>>[] typeParameters = declaringClass.getSuperclass().getTypeParameters();
            if (typeParameters != null && ParameterizedType.class.isInstance(declaringClass.getGenericSuperclass())) {
                final ParameterizedType pt = ParameterizedType.class.cast(declaringClass.getGenericSuperclass());
                if (typeParameters.length == pt.getActualTypeArguments().length) {
                    for (int i = 0; i < typeParameters.length; i++) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java

        private Object tryCreatingObjectInstance(final Type javaType) {
            final Class<?> type = Class.class.cast(javaType);
            if (type.isPrimitive()) {
                if (int.class == type) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java

    private Type extractRealType(final Class<?> root, final Type type) {
        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType pt = ParameterizedType.class.cast(type);
            return Stream.of(Optional.class, CompletionStage.class, CompletableFuture.class)
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
    private Type extractRealType(final Class<?> root, final Type type) {
        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType pt = ParameterizedType.class.cast(type);
            return Stream.of(Optional.class, CompletionStage.class, CompletableFuture.class)
                    .anyMatch(gt -> pt.getRawType() == gt) ?
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            return Stream.of(Optional.class, CompletionStage.class, CompletableFuture.class)
                    .anyMatch(gt -> pt.getRawType() == gt) ?
                    (ParameterizedType.class.isInstance(pt.getActualTypeArguments()[0]) ?
                            resolveParameterizedType(pt.getActualTypeArguments()[0], root) : pt.getActualTypeArguments()[0]) :
                    pt;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    pt;
        }
        if (TypeVariable.class.isInstance(type)) {
            final Map<Type, Type> resolution = toResolvedTypes(root, 0);
            Type value = type;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                           final Instance instance) {
        final Type model = unwrapType(rawModel);
        if (Class.class.isInstance(model)) {
            if (boolean.class == model) {
                schema.setType(Schema.SchemaType.bool);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                schema.setNullable(true);
            } else {
                final Class<?> from = Class.class.cast(model);
                if (from.isEnum()) {
                    schema.setId(from.getName().replace('.', '_').replace('$', '_'));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            }
        } else {
            if (ParameterizedType.class.isInstance(model)) {
                final ParameterizedType pt = ParameterizedType.class.cast(model);
                if (Class.class.isInstance(pt.getRawType()) && Map.class.isAssignableFrom(Class.class.cast(pt.getRawType()))) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        } else {
            if (ParameterizedType.class.isInstance(model)) {
                final ParameterizedType pt = ParameterizedType.class.cast(model);
                if (Class.class.isInstance(pt.getRawType()) && Map.class.isAssignableFrom(Class.class.cast(pt.getRawType()))) {
                    schema.setType(Schema.SchemaType.object);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            if (ParameterizedType.class.isInstance(model)) {
                final ParameterizedType pt = ParameterizedType.class.cast(model);
                if (Class.class.isInstance(pt.getRawType()) && Map.class.isAssignableFrom(Class.class.cast(pt.getRawType()))) {
                    schema.setType(Schema.SchemaType.object);
                    getOrCreateReusableObjectComponent(Object.class, schema, cache, reflectionValueExtractor, instance);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            if (ParameterizedType.class.isInstance(model)) {
                final ParameterizedType pt = ParameterizedType.class.cast(model);
                if (Class.class.isInstance(pt.getRawType()) && Map.class.isAssignableFrom(Class.class.cast(pt.getRawType()))) {
                    schema.setType(Schema.SchemaType.object);
                    getOrCreateReusableObjectComponent(Object.class, schema, cache, reflectionValueExtractor, instance);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    schema.setType(Schema.SchemaType.object);
                    getOrCreateReusableObjectComponent(Object.class, schema, cache, reflectionValueExtractor, instance);
                } else if (pt.getActualTypeArguments().length == 1 && Class.class.isInstance(pt.getActualTypeArguments()[0])) {
                    schema.setType(Schema.SchemaType.array);
                    final Schema items = new Schema();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    schema.setType(Schema.SchemaType.array);
                    final Schema items = new Schema();
                    final Class<?> type = Class.class.cast(pt.getActualTypeArguments()[0]);
                    final Instance item;
                    if (instance != null && Collection.class.isInstance(instance.value) && !Collection.class.cast(instance.value).isEmpty()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    final Class<?> type = Class.class.cast(pt.getActualTypeArguments()[0]);
                    final Instance item;
                    if (instance != null && Collection.class.isInstance(instance.value) && !Collection.class.cast(instance.value).isEmpty()) {
                        item = new Instance(Collection.class.cast(instance.value).iterator().next(), instance.isCreated());
                    } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    final Class<?> type = Class.class.cast(pt.getActualTypeArguments()[0]);
                    final Instance item;
                    if (instance != null && Collection.class.isInstance(instance.value) && !Collection.class.cast(instance.value).isEmpty()) {
                        item = new Instance(Collection.class.cast(instance.value).iterator().next(), instance.isCreated());
                    } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    final Instance item;
                    if (instance != null && Collection.class.isInstance(instance.value) && !Collection.class.cast(instance.value).isEmpty()) {
                        item = new Instance(Collection.class.cast(instance.value).iterator().next(), instance.isCreated());
                    } else {
                        item = null;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    schema.setType(Schema.SchemaType.array);
                }
            } else if (TypeVariable.class.isInstance(model)) {
                schema.setType(Schema.SchemaType.object);
            } else { // todo?
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            return emptyMap();
        }
        if (Class.class.isInstance(clazz)) {
            return toResolvedTypes(Class.class.cast(clazz).getGenericSuperclass(), maxIt + 1);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        }
        if (Class.class.isInstance(clazz)) {
            return toResolvedTypes(Class.class.cast(clazz).getGenericSuperclass(), maxIt + 1);
        }
        if (ParameterizedType.class.isInstance(clazz)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            return toResolvedTypes(Class.class.cast(clazz).getGenericSuperclass(), maxIt + 1);
        }
        if (ParameterizedType.class.isInstance(clazz)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(clazz);
            if (!Class.class.isInstance(parameterizedType.getRawType())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        }
        if (ParameterizedType.class.isInstance(clazz)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(clazz);
            if (!Class.class.isInstance(parameterizedType.getRawType())) {
                return emptyMap(); // not yet supported
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        if (ParameterizedType.class.isInstance(clazz)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(clazz);
            if (!Class.class.isInstance(parameterizedType.getRawType())) {
                return emptyMap(); // not yet supported
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                return emptyMap(); // not yet supported
            }
            final Class<?> raw = Class.class.cast(parameterizedType.getRawType());
            final Type[] arguments = parameterizedType.getActualTypeArguments();
            if (arguments.length > 0) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java

    private Type unwrapType(final Type rawModel) {
        if (ParameterizedType.class.isInstance(rawModel)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(rawModel);
            if (Stream.of(parameterizedType.getActualTypeArguments()).allMatch(WildcardType.class::isInstance)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
    private Type unwrapType(final Type rawModel) {
        if (ParameterizedType.class.isInstance(rawModel)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(rawModel);
            if (Stream.of(parameterizedType.getActualTypeArguments()).allMatch(WildcardType.class::isInstance)) {
                return parameterizedType.getRawType();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                return parameterizedType.getRawType();
            }
            if (Class.class.isInstance(parameterizedType.getRawType()) &&
                    CompletionStage.class.isAssignableFrom(Class.class.cast(parameterizedType.getRawType()))) {
                return parameterizedType.getActualTypeArguments()[0];
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            }
            if (Class.class.isInstance(parameterizedType.getRawType()) &&
                    CompletionStage.class.isAssignableFrom(Class.class.cast(parameterizedType.getRawType()))) {
                return parameterizedType.getActualTypeArguments()[0];
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java

    private Type resolveParameterizedType(final Type type, final Class<?> declaringClass) {
        final ParameterizedType pt = ParameterizedType.class.cast(type);
        final Type resolvedParam = resolveType(pt.getActualTypeArguments()[0], declaringClass);
        if (pt.getActualTypeArguments()[0] != resolvedParam) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java

            final Type javaType = field.getGenericType();
            if (Class.class.isInstance(javaType)) {
                return new Instance(tryCreatingObjectInstance(javaType), true);
            } else if (ParameterizedType.class.isInstance(javaType)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            if (Class.class.isInstance(javaType)) {
                return new Instance(tryCreatingObjectInstance(javaType), true);
            } else if (ParameterizedType.class.isInstance(javaType)) {
                final ParameterizedType pt = ParameterizedType.class.cast(javaType);
                final Type rawType = pt.getRawType();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                return new Instance(tryCreatingObjectInstance(javaType), true);
            } else if (ParameterizedType.class.isInstance(javaType)) {
                final ParameterizedType pt = ParameterizedType.class.cast(javaType);
                final Type rawType = pt.getRawType();
                if (Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType))
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                final ParameterizedType pt = ParameterizedType.class.cast(javaType);
                final Type rawType = pt.getRawType();
                if (Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType))
                        && pt.getActualTypeArguments().length == 1
                        && Class.class.isInstance(pt.getActualTypeArguments()[0])) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                final ParameterizedType pt = ParameterizedType.class.cast(javaType);
                final Type rawType = pt.getRawType();
                if (Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType))
                        && pt.getActualTypeArguments().length == 1
                        && Class.class.isInstance(pt.getActualTypeArguments()[0])) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                if (Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType))
                        && pt.getActualTypeArguments().length == 1
                        && Class.class.isInstance(pt.getActualTypeArguments()[0])) {
                    final Object instance = tryCreatingObjectInstance(pt.getActualTypeArguments()[0]);
                    final Class<?> collectionType = Class.class.cast(rawType);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                        && Class.class.isInstance(pt.getActualTypeArguments()[0])) {
                    final Object instance = tryCreatingObjectInstance(pt.getActualTypeArguments()[0]);
                    final Class<?> collectionType = Class.class.cast(rawType);
                    if (Set.class == collectionType) {
                        return new Instance(singleton(instance), true);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java

        private Instance createInstance(final Type model) {
            if (Class.class.isInstance(model)) {
                try {
                    return new Instance(Class.class.cast(model).getConstructor().newInstance(), true);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            if (Class.class.isInstance(model)) {
                try {
                    return new Instance(Class.class.cast(model).getConstructor().newInstance(), true);
                } catch (final NoSuchMethodException | InstantiationException | IllegalAccessException
                        | InvocationTargetException e) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java

    public boolean isAssignableFrom(final Type type) {
        return keyAsClass != null && Class.class.isInstance(type) && keyAsClass.isAssignableFrom(Class.class.cast(type));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java

    public boolean isAssignableFrom(final Type type) {
        return keyAsClass != null && Class.class.isInstance(type) && keyAsClass.isAssignableFrom(Class.class.cast(type));
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java
        this.to = to;
        if (!lookup) {
            this.keyAsClass = Class.class.isInstance(from) ? Class.class.cast(from) : null;
            this.valueAsClass = Class.class.isInstance(to) ? Class.class.cast(to) : null;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java
        this.to = to;
        if (!lookup) {
            this.keyAsClass = Class.class.isInstance(from) ? Class.class.cast(from) : null;
            this.valueAsClass = Class.class.isInstance(to) ? Class.class.cast(to) : null;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java
        if (!lookup) {
            this.keyAsClass = Class.class.isInstance(from) ? Class.class.cast(from) : null;
            this.valueAsClass = Class.class.isInstance(to) ? Class.class.cast(to) : null;
        }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java
        if (!lookup) {
            this.keyAsClass = Class.class.isInstance(from) ? Class.class.cast(from) : null;
            this.valueAsClass = Class.class.isInstance(to) ? Class.class.cast(to) : null;
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java

    public boolean isAssignableTo(final Type type) {
        return valueAsClass != null && Class.class.isInstance(type) && valueAsClass.isAssignableFrom(Class.class.cast(type));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java

    public boolean isAssignableTo(final Type type) {
        return valueAsClass != null && Class.class.isInstance(type) && valueAsClass.isAssignableFrom(Class.class.cast(type));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/AdapterKey.java`
#### Snippet
```java
        }

        final AdapterKey that = AdapterKey.class.cast(o);
        return from.equals(that.from) && to.equals(that.to);

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/RequiredValidation.java`
#### Snippet
```java
                .map(JsonValue::asJsonArray)
                .filter(arr -> arr.stream().allMatch(it -> it.getValueType() == JsonValue.ValueType.STRING))
                .map(arr -> arr.stream().map(it -> JsonString.class.cast(it).getString()).collect(toSet()))
                .map(required -> new Impl(required, model.getValueProvider(), model.toPointer()));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/regex/JavascriptRegex.java`
#### Snippet
```java
        bindings.put("indicators", indicators);
        try {
            return Boolean.class.cast(ENGINE.eval("new RegExp(regex, indicators).test(text)", bindings));
        } catch (final ScriptException e) {
            return false;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/Snippet.java`
#### Snippet
```java
                this.mode = new Writing(max, new BoundedOutputStreamWriter(
                        buffer,
                        JsonGeneratorFactoryImpl.class.isInstance(generatorFactory) ?
                                JsonGeneratorFactoryImpl.class.cast(generatorFactory).getDefaultEncoding() :
                                UTF_8,
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/Snippet.java`
#### Snippet
```java
                        buffer,
                        JsonGeneratorFactoryImpl.class.isInstance(generatorFactory) ?
                                JsonGeneratorFactoryImpl.class.cast(generatorFactory).getDefaultEncoding() :
                                UTF_8,
                        max));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java

    private Class<?> toType(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) :
                (ParameterizedType.class.isInstance(type) ? toType(ParameterizedType.class.cast(type).getRawType()) :
                        Object.class /*fallback*/);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java

    private Class<?> toType(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) :
                (ParameterizedType.class.isInstance(type) ? toType(ParameterizedType.class.cast(type).getRawType()) :
                        Object.class /*fallback*/);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
    private Class<?> toType(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) :
                (ParameterizedType.class.isInstance(type) ? toType(ParameterizedType.class.cast(type).getRawType()) :
                        Object.class /*fallback*/);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
    private Class<?> toType(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) :
                (ParameterizedType.class.isInstance(type) ? toType(ParameterizedType.class.cast(type).getRawType()) :
                        Object.class /*fallback*/);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
            if (m != null && (ignoreVisibilityFilter || Modifier.isPublic(m.getModifiers()))) {
                for (final Reader w : methodReaders.values()) {
                    if (MethodAccessMode.MethodDecoratedType.class.cast(w).getMethod().equals(m)) {
                        if (w.getAnnotation(JohnzonProperty.class) != null || w.getAnnotation(JohnzonIgnore.class) != null) {
                            skip = true;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java

        for (final Map.Entry<String, Reader> entry : methodReaders.entrySet()) {
            final Method mr = MethodAccessMode.MethodDecoratedType.class.cast(entry.getValue()).getMethod();
            final String fieldName = record ?
                    mr.getName() :
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
            if (f != null) {
                for (final Reader w : fieldsReaders.values()) {
                    if (FieldAccessMode.FieldDecoratedType.class.cast(w).getField().equals(f)) {
                        if (w.getAnnotation(JohnzonProperty.class) != null || w.getAnnotation(JohnzonIgnore.class) != null) {
                            skip = true;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
            if (m != null && (ignoreVisibilityFilter || Modifier.isPublic(m.getModifiers()))) {
                for (final Writer w : metodWriters.values()) {
                    if (MethodAccessMode.MethodDecoratedType.class.cast(w).getMethod().equals(m)) {
                        if (w.getAnnotation(JohnzonProperty.class) != null) {
                            skip = true;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java

        for (final Map.Entry<String, Writer> entry : metodWriters.entrySet()) {
            final Method mr = MethodAccessMode.MethodDecoratedType.class.cast(entry.getValue()).getMethod();
            final String fieldName = BeanUtil.decapitalize(mr.getName().startsWith("is") ? mr.getName().substring(2) : mr.getName().substring(3));
            final Field f = getField(fieldName, clazz);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
            if (f != null) {
                for (final Writer w : fieldWriters.values()) {
                    if (FieldAccessMode.FieldDecoratedType.class.cast(w).getField().equals(f)) {
                        if (w.getAnnotation(JohnzonProperty.class) != null) {
                            skip = true;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
    public static boolean matches(final Type type, final MapperConverter adapter) {
        Type convertType = null;
        if (ConverterAdapter.class.isInstance(adapter)) {
            final Converter delegate = ConverterAdapter.class.cast(adapter).getConverter();
            if (Converter.TypeAccess.class.isInstance(delegate)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
        Type convertType = null;
        if (ConverterAdapter.class.isInstance(adapter)) {
            final Converter delegate = ConverterAdapter.class.cast(adapter).getConverter();
            if (Converter.TypeAccess.class.isInstance(delegate)) {
                convertType = Converter.TypeAccess.class.cast(delegate).type();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
        if (ConverterAdapter.class.isInstance(adapter)) {
            final Converter delegate = ConverterAdapter.class.cast(adapter).getConverter();
            if (Converter.TypeAccess.class.isInstance(delegate)) {
                convertType = Converter.TypeAccess.class.cast(delegate).type();
            } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            final Converter delegate = ConverterAdapter.class.cast(adapter).getConverter();
            if (Converter.TypeAccess.class.isInstance(delegate)) {
                convertType = Converter.TypeAccess.class.cast(delegate).type();
            } else {
                for (final Type pt : delegate.getClass().getGenericInterfaces()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            } else {
                for (final Type pt : delegate.getClass().getGenericInterfaces()) {
                    if (ParameterizedType.class.isInstance(pt) && ParameterizedType.class.cast(pt).getRawType() == Converter.class) {
                        convertType = ParameterizedType.class.cast(pt).getActualTypeArguments()[0];
                        break;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            } else {
                for (final Type pt : delegate.getClass().getGenericInterfaces()) {
                    if (ParameterizedType.class.isInstance(pt) && ParameterizedType.class.cast(pt).getRawType() == Converter.class) {
                        convertType = ParameterizedType.class.cast(pt).getActualTypeArguments()[0];
                        break;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                for (final Type pt : delegate.getClass().getGenericInterfaces()) {
                    if (ParameterizedType.class.isInstance(pt) && ParameterizedType.class.cast(pt).getRawType() == Converter.class) {
                        convertType = ParameterizedType.class.cast(pt).getActualTypeArguments()[0];
                        break;
                    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                }
            }
        } else if (TypeAwareAdapter.class.isInstance(adapter)) {
            convertType = TypeAwareAdapter.class.cast(adapter).getFrom();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            }
        } else if (TypeAwareAdapter.class.isInstance(adapter)) {
            convertType = TypeAwareAdapter.class.cast(adapter).getFrom();
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
        }

        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
            final Type rawType = parameterizedType.getRawType();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java

        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
            final Type rawType = parameterizedType.getRawType();
            if (Class.class.isInstance(rawType)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
            final Type rawType = parameterizedType.getRawType();
            if (Class.class.isInstance(rawType)) {
                final Class<?> clazz = Class.class.cast(rawType);
                if (Collection.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 1) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            final Type rawType = parameterizedType.getRawType();
            if (Class.class.isInstance(rawType)) {
                final Class<?> clazz = Class.class.cast(rawType);
                if (Collection.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 1) {
                    final Type argType = parameterizedType.getActualTypeArguments()[0];
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                if (Collection.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 1) {
                    final Type argType = parameterizedType.getActualTypeArguments()[0];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                if (Collection.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 1) {
                    final Type argType = parameterizedType.getActualTypeArguments()[0];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                    final Type argType = parameterizedType.getActualTypeArguments()[0];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
                } else if (Map.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 2) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                    final Type argType = parameterizedType.getActualTypeArguments()[0];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
                } else if (Map.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 2) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                } else if (Map.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 2) {
                    final Type argType = parameterizedType.getActualTypeArguments()[1];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                } else if (Map.class.isAssignableFrom(clazz) && parameterizedType.getActualTypeArguments().length == 2) {
                    final Type argType = parameterizedType.getActualTypeArguments()[1];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                    final Type argType = parameterizedType.getActualTypeArguments()[1];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
                    final Type argType = parameterizedType.getActualTypeArguments()[1];
                    if (Class.class.isInstance(argType) && Class.class.isInstance(convertType)) {
                        return !Class.class.cast(convertType).isAssignableFrom(Class.class.cast(argType));
                    }
                }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            }
        }
        if (Class.class.isInstance(type)) {
            final Class<?> clazz = Class.class.cast(type);
            if (clazz.isArray()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
        }
        if (Class.class.isInstance(type)) {
            final Class<?> clazz = Class.class.cast(type);
            if (clazz.isArray()) {
                return !Class.class.cast(convertType).isAssignableFrom(clazz.getComponentType());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Converters.java`
#### Snippet
```java
            final Class<?> clazz = Class.class.cast(type);
            if (clazz.isArray()) {
                return !Class.class.cast(convertType).isAssignableFrom(clazz.getComponentType());
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/PatternValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("pattern"))
                    .filter(val -> val.getValueType() == JsonValue.ValueType.STRING)
                    .map(pattern -> new Impl(model.toPointer(), model.getValueProvider(), predicateFactory.apply(JsonString.class.cast(pattern).getString())));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
        if (ref != null && ref.getValueType() == JsonValue.ValueType.STRING) {
            final String name = onRef(new Ref(
                    JsonString.class.cast(ref).getString(), configuration.getClassName(), imports, attributes, nested));
            if (name != null) {
                return name;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
            }
        } else {
            type = JsonString.class.cast(value).getString();
        }
        final JsonValue formatValue = schema.get("date-time");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
        final JsonValue formatValue = schema.get("date-time");
        if (formatValue != null && formatValue.getValueType() == JsonValue.ValueType.STRING) {
            type = JsonString.class.cast(formatValue).getString();
        }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
            final JsonValue propTypeValue = propSchema.get("type");
            if (propTypeValue != null && propTypeValue.getValueType() == JsonValue.ValueType.STRING) {
                String propType = JsonString.class.cast(propTypeValue).getString();
                final JsonValue formatValue = schema.get("date-time");
                if (formatValue != null && formatValue.getValueType() == JsonValue.ValueType.STRING) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                final JsonValue formatValue = schema.get("date-time");
                if (formatValue != null && formatValue.getValueType() == JsonValue.ValueType.STRING) {
                    propType = JsonString.class.cast(formatValue).getString();
                }
                switch (propType) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
        if (ref != null && ref.getValueType() == JsonValue.ValueType.STRING) {
            final String name = onRef(new Ref(
                    JsonString.class.cast(ref).getString(), configuration.getClassName(),
                    imports, attributes, nested));
            if (name != null) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
        final JsonValue propTypeValue = schema.get("type");
        if (propTypeValue != null && propTypeValue.getValueType() == JsonValue.ValueType.STRING) {
            String type = JsonString.class.cast(propTypeValue).getString();
            final JsonValue formatValue = schema.get("date-time");
            if (formatValue != null && formatValue.getValueType() == JsonValue.ValueType.STRING) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
            final JsonValue formatValue = schema.get("date-time");
            if (formatValue != null && formatValue.getValueType() == JsonValue.ValueType.STRING) {
                type = JsonString.class.cast(formatValue).getString();
            }
            switch (type) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonNumberImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        return JsonNumber.class.isInstance(obj) && JsonNumber.class.cast(obj).bigDecimalValue().equals(value);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonNumberImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        return JsonNumber.class.isInstance(obj) && JsonNumber.class.cast(obj).bigDecimalValue().equals(value);
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/AccessMode.java`
#### Snippet
```java
                     .filter(ParameterizedType.class::isInstance)
                     .map(ParameterizedType.class::cast)
                     .filter(it -> Class.class.isInstance(it.getRawType()) && Map.class.isAssignableFrom(Class.class.cast(it.getRawType())))
                     .map(ParameterizedType::getActualTypeArguments)
                     .filter(a -> a.length == 2)
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/AccessMode.java`
#### Snippet
```java
                     .filter(ParameterizedType.class::isInstance)
                     .map(ParameterizedType.class::cast)
                     .filter(it -> Class.class.isInstance(it.getRawType()) && Map.class.isAssignableFrom(Class.class.cast(it.getRawType())))
                     .map(ParameterizedType::getActualTypeArguments)
                     .filter(a -> a.length == 2)
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MinPropertiesValidation.java`
#### Snippet
```java
        return Optional.ofNullable(model.getSchema().get("minProperties"))
                .filter(it -> it.getValueType() == JsonValue.ValueType.NUMBER)
                .map(it -> JsonNumber.class.cast(it).intValue())
                .filter(it -> it >= 0)
                .map(max -> new Impl(model.toPointer(), model.getValueProvider(), max));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/ExclusiveMaximumValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("exclusiveMaximum"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).doubleValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java

    private static Type resolveWildcardType(final Type value) {
        final WildcardType wildcardType = WildcardType.class.cast(value);
        if (Stream.of(wildcardType.getUpperBounds()).anyMatch(it -> it == Object.class) &&
                wildcardType.getLowerBounds().length == 0) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        }

        final TypeVariable<?> tv = TypeVariable.class.cast(value);
        Type parent = rootClass;
        while (Class.class.isInstance(parent)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        final TypeVariable<?> tv = TypeVariable.class.cast(value);
        Type parent = rootClass;
        while (Class.class.isInstance(parent)) {
            parent = Class.class.cast(parent).getGenericSuperclass();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        Type parent = rootClass;
        while (Class.class.isInstance(parent)) {
            parent = Class.class.cast(parent).getGenericSuperclass();
        }
        while (ParameterizedType.class.isInstance(parent) && ParameterizedType.class.cast(parent).getRawType() != tv.getGenericDeclaration()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            parent = Class.class.cast(parent).getGenericSuperclass();
        }
        while (ParameterizedType.class.isInstance(parent) && ParameterizedType.class.cast(parent).getRawType() != tv.getGenericDeclaration()) {
            parent = Class.class.cast(ParameterizedType.class.cast(parent).getRawType()).getGenericSuperclass();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            parent = Class.class.cast(parent).getGenericSuperclass();
        }
        while (ParameterizedType.class.isInstance(parent) && ParameterizedType.class.cast(parent).getRawType() != tv.getGenericDeclaration()) {
            parent = Class.class.cast(ParameterizedType.class.cast(parent).getRawType()).getGenericSuperclass();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        }
        while (ParameterizedType.class.isInstance(parent) && ParameterizedType.class.cast(parent).getRawType() != tv.getGenericDeclaration()) {
            parent = Class.class.cast(ParameterizedType.class.cast(parent).getRawType()).getGenericSuperclass();
        }
        if (ParameterizedType.class.isInstance(parent)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        }
        while (ParameterizedType.class.isInstance(parent) && ParameterizedType.class.cast(parent).getRawType() != tv.getGenericDeclaration()) {
            parent = Class.class.cast(ParameterizedType.class.cast(parent).getRawType()).getGenericSuperclass();
        }
        if (ParameterizedType.class.isInstance(parent)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            parent = Class.class.cast(ParameterizedType.class.cast(parent).getRawType()).getGenericSuperclass();
        }
        if (ParameterizedType.class.isInstance(parent)) {
            final ParameterizedType parentPt = ParameterizedType.class.cast(parent);
            final int argIndex = asList(Class.class.cast(parentPt.getRawType()).getTypeParameters()).indexOf(tv);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        }
        if (ParameterizedType.class.isInstance(parent)) {
            final ParameterizedType parentPt = ParameterizedType.class.cast(parent);
            final int argIndex = asList(Class.class.cast(parentPt.getRawType()).getTypeParameters()).indexOf(tv);
            if (argIndex >= 0) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        if (ParameterizedType.class.isInstance(parent)) {
            final ParameterizedType parentPt = ParameterizedType.class.cast(parent);
            final int argIndex = asList(Class.class.cast(parentPt.getRawType()).getTypeParameters()).indexOf(tv);
            if (argIndex >= 0) {
                final Type type = parentPt.getActualTypeArguments()[argIndex];
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            if (argIndex >= 0) {
                final Type type = parentPt.getActualTypeArguments()[argIndex];
                if (TypeVariable.class.isInstance(type)) {
                    return resolveTypeVariable(type, rootClass, resolved);
                }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            }
        }
        if (Class.class.isInstance(rootClass)) {
            return Object.class; // prefer a default over
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
    public static Type resolve(final Type value, final Type rootClass,
                               final Map<Type, Type> resolved) {
        if (TypeVariable.class.isInstance(value)) {
            return resolveTypeVariable(value, rootClass, resolved);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            return resolveTypeVariable(value, rootClass, resolved);
        }
        if (ParameterizedType.class.isInstance(value)) {
            return resolveParameterizedType(value, rootClass, resolved);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
            return resolveParameterizedType(value, rootClass, resolved);
        }
        if (WildcardType.class.isInstance(value)) {
            return resolveWildcardType(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
                                                 final Map<Type, Type> resolved) {
        Collection<Type> args = null;
        final ParameterizedType parameterizedType = ParameterizedType.class.cast(value);
        int index = 0;
        for (final Type arg : parameterizedType.getActualTypeArguments()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java

    public static Map<Type, Type> toResolvedTypes(final Type clazz) {
        if (ParameterizedType.class.isInstance(clazz)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(clazz);
            if (!Class.class.isInstance(parameterizedType.getRawType())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
    public static Map<Type, Type> toResolvedTypes(final Type clazz) {
        if (ParameterizedType.class.isInstance(clazz)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(clazz);
            if (!Class.class.isInstance(parameterizedType.getRawType())) {
                return emptyMap(); // not yet supported
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
        if (ParameterizedType.class.isInstance(clazz)) {
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(clazz);
            if (!Class.class.isInstance(parameterizedType.getRawType())) {
                return emptyMap(); // not yet supported
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
                return emptyMap(); // not yet supported
            }
            final Class<?> raw = Class.class.cast(parameterizedType.getRawType());
            final Type[] arguments = parameterizedType.getActualTypeArguments();
            if (arguments.length > 0) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/ExclusiveMinimumValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("exclusiveMinimum"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).doubleValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/IntegerValidation.java`
#### Snippet
```java
    public Optional<Function<JsonValue, Stream<ValidationError>>> create(ValidationContext model) {
        final JsonValue type = model.getSchema().get("type");
        if (type.getValueType().equals(ValueType.STRING) && "integer".equals(JsonString.class.cast(type).getString())) {
            return Optional.of(new MultipleOfValidation.Impl(model.toPointer(), model.getValueProvider(), 1));
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
        if (value == null) {
            return defaultValue;
        } else if (String.class.isInstance(value)) {
            return String.class.cast(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
            return defaultValue;
        } else if (String.class.isInstance(value)) {
            return String.class.cast(value);
        }
        return value.toString();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
        if (boolValue == null) {
            return defaultValue;
        } else if (Boolean.class.isInstance(boolValue)) {
            return Boolean.class.cast(boolValue);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
            return defaultValue;
        } else if (Boolean.class.isInstance(boolValue)) {
            return Boolean.class.cast(boolValue);
        }
        return Boolean.parseBoolean(boolValue.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
        if (intValue == null) {
            return defaultValue;
        } else if (Number.class.isInstance(intValue)) {
            return Number.class.cast(intValue).intValue();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
            return defaultValue;
        } else if (Number.class.isInstance(intValue)) {
            return Number.class.cast(intValue).intValue();
        }
        return Integer.parseInt(intValue.toString());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
                    if (a.annotationType() == JohnzonConverter.class) {
                        try {
                            MapperConverter mapperConverter = JohnzonConverter.class.cast(a).value().newInstance();
                            if (mapperConverter instanceof Converter) {
                                final Adapter<?, ?> converter = new ConverterAdapter((Converter) mapperConverter, constructor.getGenericParameterTypes()[i]);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
            case ARRAY:
                writeStartArray();
                final JsonArray array = JsonArray.class.cast(value);
                final Iterator<JsonValue> ait = array.iterator();
                while (ait.hasNext()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
            case OBJECT:
                writeStartObject();
                final JsonObject object = JsonObject.class.cast(value);
                final Iterator<Map.Entry<String, JsonValue>> oit = object.entrySet().iterator();
                while (oit.hasNext()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                break;
            case STRING:
                write(JsonString.class.cast(value).getString());
                break;
            case NUMBER:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                break;
            case NUMBER:
                final JsonNumber number = JsonNumber.class.cast(value);
                if (number instanceof JsonLongImpl) {
                    write(number.longValueExact());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                break;
            case STRING:
                write(name, JsonString.class.cast(value).getString());
                break;
            case NUMBER:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
            case NUMBER:
                //TODO optimize
                final JsonNumber number = JsonNumber.class.cast(value);
                if (number.isIntegral()) {
                    write(name, number.longValueExact());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MaxLengthValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("maxLength"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).intValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MinimumValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("minimum"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).doubleValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/TypeAwareDecoder.java`
#### Snippet
```java
        }

        if (ServerEndpointConfig.class.isInstance(endpointConfig)) {
            final Class<?> endpointClass = ServerEndpointConfig.class.cast(endpointConfig).getEndpointClass();
            for (final Method m : endpointClass.getMethods()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/TypeAwareDecoder.java`
#### Snippet
```java

        if (ServerEndpointConfig.class.isInstance(endpointConfig)) {
            final Class<?> endpointClass = ServerEndpointConfig.class.cast(endpointConfig).getEndpointClass();
            for (final Method m : endpointClass.getMethods()) {
                if (Object.class == m.getDeclaringClass()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/TypeAwareDecoder.java`
#### Snippet
```java
            }
        } else {
            type = Type.class.cast(endpointConfig.getUserProperties().get("johnzon.websocket.message.type"));
            if (type == null) {
                throw new IllegalArgumentException("didn't find johnzon.websocket.message.type");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java

    private void visit(final JsonStructure structure, final Visitor visitor) {
        if (JsonObject.class.isInstance(structure)) {
            visitor.visitObject(JsonObject.class.cast(structure));
        } else if (JsonArray.class.isInstance(structure)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
    private void visit(final JsonStructure structure, final Visitor visitor) {
        if (JsonObject.class.isInstance(structure)) {
            visitor.visitObject(JsonObject.class.cast(structure));
        } else if (JsonArray.class.isInstance(structure)) {
            visitor.visitArray(JsonArray.class.cast(structure));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
        if (JsonObject.class.isInstance(structure)) {
            visitor.visitObject(JsonObject.class.cast(structure));
        } else if (JsonArray.class.isInstance(structure)) {
            visitor.visitArray(JsonArray.class.cast(structure));
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
            visitor.visitObject(JsonObject.class.cast(structure));
        } else if (JsonArray.class.isInstance(structure)) {
            visitor.visitArray(JsonArray.class.cast(structure));
        } else {
            throw new UnsupportedOperationException("Can't visit " + structure);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
        try (final JsonReader reader = readerFactory.createReader(new FileReader(source))) {
            final JsonStructure structure = reader.read();
            if (JsonArray.class.isInstance(structure) || !JsonObject.class.isInstance(structure)) { // quite redundant for now but to avoid surprises in future
                throw new MojoExecutionException("This plugin doesn't support array generation, generate the model (generic) and handle arrays in your code");
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
        try (final JsonReader reader = readerFactory.createReader(new FileReader(source))) {
            final JsonStructure structure = reader.read();
            if (JsonArray.class.isInstance(structure) || !JsonObject.class.isInstance(structure)) { // quite redundant for now but to avoid surprises in future
                throw new MojoExecutionException("This plugin doesn't support array generation, generate the model (generic) and handle arrays in your code");
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
            }

            final JsonObject object = JsonObject.class.cast(structure);
            final Collection<String> imports = new TreeSet<>();

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
                             final Collection<String> imports,
                             final boolean last) throws IOException {
        final JsonArray array = JsonArray.class.cast(value);
        if (array.size() > 0) { // keep it simple for now - 1 level, we can have an awesome recursive algo later if needed
            final JsonValue jsonValue = array.get(0);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
                case OBJECT:
                    final String javaName = toJavaName(fieldName);
                    nestedTypes.put(javaName, JsonObject.class.cast(jsonValue));
                    fieldGetSetMethods(writer, jsonField, fieldName, javaName, prefix, arrayLevel, imports, last);
                    break;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
                    case OBJECT:
                        final String type = toJavaName(fieldName);
                        nestedTypes.put(type, JsonObject.class.cast(entry.getValue()));
                        fieldGetSetMethods(writer, key, fieldName, type, prefix, 0, imports, !hasNext);
                        break;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/JohnzonMessageBodyReader.java`
#### Snippet
```java
        if (rawType.isArray()) {
            return (T) mapper.readArray(entityStream, rawType.getComponentType());
        } else if (Collection.class.isAssignableFrom(rawType) && ParameterizedType.class.isInstance(genericType)) {
            return (T) mapper.readCollection(entityStream, ParameterizedType.class.cast(genericType));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/JohnzonMessageBodyReader.java`
#### Snippet
```java
            return (T) mapper.readArray(entityStream, rawType.getComponentType());
        } else if (Collection.class.isAssignableFrom(rawType) && ParameterizedType.class.isInstance(genericType)) {
            return (T) mapper.readCollection(entityStream, ParameterizedType.class.cast(genericType));
        }
        return mapper.readObject(entityStream, genericType);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/WildcardConfigurableJohnzonProvider.java`
#### Snippet
```java
    public void setSerializeValueFilter(final String val) {
        try {
            builder.setSerializeValueFilter(SerializeValueFilter.class.cast(
                    Thread.currentThread().getContextClassLoader().loadClass(val).getConstructor().newInstance()));
        } catch (final InstantiationException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException e) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/mapper/JohnzonTextEncoder.java`
#### Snippet
```java
    @Override
    public void init(final EndpointConfig endpointConfig) {
        mapper = Mapper.class.cast(MapperLocator.locate());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MultipleOfValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("multipleOf"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).doubleValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MinLengthValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("minLength"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).intValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStringImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        return JsonString.class.isInstance(obj) && JsonString.class.cast(obj).getString().equals(value);
    }
}
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStringImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        return JsonString.class.isInstance(obj) && JsonString.class.cast(obj).getString().equals(value);
    }
}
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
                delegate.writeEnd();
            } else if (level == 0 &&
                    InObjectOrPrimitiveJsonGenerator.class.isInstance(delegate) && // normally always true
                    InObjectOrPrimitiveJsonGenerator.class.cast(delegate).implicitStart) {
                delegate.writeEnd();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
            } else if (level == 0 &&
                    InObjectOrPrimitiveJsonGenerator.class.isInstance(delegate) && // normally always true
                    InObjectOrPrimitiveJsonGenerator.class.cast(delegate).implicitStart) {
                delegate.writeEnd();
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
        private JsonGenerator unwrap(final JsonGenerator delegate) {
            JsonGenerator current = delegate;
            while (SkipLastWriteEndGenerator.class.isInstance(current)) {
                current = SkipLastWriteEndGenerator.class.cast(current).delegate;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
            JsonGenerator current = delegate;
            while (SkipLastWriteEndGenerator.class.isInstance(current)) {
                current = SkipLastWriteEndGenerator.class.cast(current).delegate;
            }
            return current;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java

        public static void endIfNeeded(final JsonGenerator generator) {
            if (!InObjectOrPrimitiveJsonGenerator.class.isInstance(generator)) {
                return;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
                return;
            }
            final InObjectOrPrimitiveJsonGenerator jsonGenerator = InObjectOrPrimitiveJsonGenerator.class.cast(generator);
            if (jsonGenerator.state == WritingState.WROTE_START) {
                jsonGenerator.doWriteEnd(true);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonParameterizedType.java`
#### Snippet
```java
    private ParameterizedType findUserParameterizedType() {
        final Type genericSuperclass = getClass().getGenericSuperclass();
        if (!ParameterizedType.class.isInstance(genericSuperclass)) {
            throw new IllegalArgumentException("raw can be null only for children classes");
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonParameterizedType.java`
#### Snippet
```java
            throw new IllegalArgumentException("raw can be null only for children classes");
        }
        final ParameterizedType pt = ParameterizedType.class.cast(genericSuperclass); // our type, then unwrap it

        final Type userType = pt.getActualTypeArguments()[0];
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonParameterizedType.java`
#### Snippet
```java

        final Type userType = pt.getActualTypeArguments()[0];
        if (!ParameterizedType.class.isInstance(userType)) {
            throw new IllegalArgumentException("You need to pass a parameterized type to Johnzon*Types");
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonParameterizedType.java`
#### Snippet
```java
        }

        return ParameterizedType.class.cast(userType);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayBuilderImpl.java`
#### Snippet
```java
            add((String) value);
        } else if (value instanceof Map) {
            add(new JsonObjectBuilderImpl(Map.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
        } else if (value instanceof Collection) {
            add(new JsonArrayBuilderImpl(Collection.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayBuilderImpl.java`
#### Snippet
```java
            add(new JsonObjectBuilderImpl(Map.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
        } else if (value instanceof Collection) {
            add(new JsonArrayBuilderImpl(Collection.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
        } else if (value.getClass().isArray()) {
            final Collection<Object> collection = ArrayUtil.newCollection(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MaxPropertiesValidation.java`
#### Snippet
```java
        return Optional.ofNullable(model.getSchema().get("maxProperties"))
                .filter(it -> it.getValueType() == JsonValue.ValueType.NUMBER)
                .map(it -> JsonNumber.class.cast(it).intValue())
                .filter(it -> it >= 0)
                .map(max -> new Impl(model.toPointer(), model.getValueProvider(), max));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorFactoryImpl.java`
#### Snippet
```java
        }

        final int bufferSize = Buffered.class.cast(flushable).bufferSize();

        if (customBuffer != null && customBuffer.size == bufferSize) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorFactoryImpl.java`
#### Snippet
```java
        this.defaultEncoding = ofNullable(config)
                .map(c -> c.get(ENCODING))
                .map(it -> Charset.class.isInstance(it) ? Charset.class.cast(it) : Charset.forName(it.toString()))
                .orElse(UTF_8);

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorFactoryImpl.java`
#### Snippet
```java
        this.defaultEncoding = ofNullable(config)
                .map(c -> c.get(ENCODING))
                .map(it -> Charset.class.isInstance(it) ? Charset.class.cast(it) : Charset.forName(it.toString()))
                .orElse(UTF_8);

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectBuilderImpl.java`
#### Snippet
```java
            addNull(name);
        } else if (value instanceof Map) {
            add(name, new JsonObjectBuilderImpl(Map.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
        } else if (value instanceof Collection) {
            add(name, new JsonArrayBuilderImpl(Collection.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectBuilderImpl.java`
#### Snippet
```java
            add(name, new JsonObjectBuilderImpl(Map.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
        } else if (value instanceof Collection) {
            add(name, new JsonArrayBuilderImpl(Collection.class.cast(value), bufferProvider, rejectDuplicateKeysMode).build());
        } else if (value.getClass().isArray()) {
            final Collection<Object> collection = ArrayUtil.newCollection(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java
    public void setSerializeValueFilter(final String val) {
        try {
            builder.setSerializeValueFilter(SerializeValueFilter.class.cast(
                    Thread.currentThread().getContextClassLoader().loadClass(val).getConstructor().newInstance()));
        } catch (final InstantiationException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException e) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/BaseValidation.java`
#### Snippet
```java
        switch (value.getValueType()) {
            case STRING:
                return onString(JsonString.class.cast(value));
            case TRUE:
            case FALSE:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/BaseValidation.java`
#### Snippet
```java
                return onBoolean(JsonValue.ValueType.TRUE == value.getValueType());
            case NUMBER:
                return onNumber(JsonNumber.class.cast(value));
            case OBJECT:
                return onObject(value.asJsonObject());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParser.java`
#### Snippet
```java
        @Override
        public boolean isFitLong() {
            return JohnzonJsonParser.class.isInstance(jsonParser) ?
                    JohnzonJsonParser.class.cast(jsonParser).isFitLong() : false;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParser.java`
#### Snippet
```java
        public boolean isFitLong() {
            return JohnzonJsonParser.class.isInstance(jsonParser) ?
                    JohnzonJsonParser.class.cast(jsonParser).isFitLong() : false;
        }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory.java`
#### Snippet
```java

    public CdiJohnzonAdapterFactory(final Object bm) {
        this.bm = BeanManager.class.cast(bm);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java

        private InlineReader(final Function<T, F> accessor, final Class<F> type) {
            this.accessor = Function.class.cast(accessor);
            this.type = type;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                @Override
                public Object create(final Object[] params) {
                    return new Exception(String.class.cast(params[0]));
                }
            };
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                @Override
                public Object create(final Object[] params) {
                    return new Throwable(String.class.cast(params[0]));
                }
            };
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                @Override
                public Object create(final Object[] params) {
                    return new Error(String.class.cast(params[0]));
                }
            };
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                public Object create(final Object[] params) {
                    return new StackTraceElement(
                            String.class.cast(params[0]),
                            String.class.cast(params[1]),
                            String.class.cast(params[2]),
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                    return new StackTraceElement(
                            String.class.cast(params[0]),
                            String.class.cast(params[1]),
                            String.class.cast(params[2]),
                            params.length < 4 || params[3] == null ? -1 : Integer.class.cast(params[3]));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                            String.class.cast(params[0]),
                            String.class.cast(params[1]),
                            String.class.cast(params[2]),
                            params.length < 4 || params[3] == null ? -1 : Integer.class.cast(params[3]));
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
                            String.class.cast(params[1]),
                            String.class.cast(params[2]),
                            params.length < 4 || params[3] == null ? -1 : Integer.class.cast(params[3]));
                }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
            if (value != null) {
                try {
                    final Collection<?> collection = Collection.class.cast(method.invoke(instance));
                    if (collection != null) {
                        collection.addAll(Collection.class.cast(value));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
                    final Collection<?> collection = Collection.class.cast(method.invoke(instance));
                    if (collection != null) {
                        collection.addAll(Collection.class.cast(value));
                    }
                } catch (final Exception e) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/cdi/CDIs.java`
#### Snippet
```java

        private static JohnzonCdiExtension load(final Object beanManager) {
            final jakarta.enterprise.inject.spi.BeanManager bm = jakarta.enterprise.inject.spi.BeanManager.class.cast(beanManager);
            return JohnzonCdiExtension.class.cast(
                bm.getReference(bm.resolve(bm.getBeans(JohnzonCdiExtension.class)), JohnzonCdiExtension.class, bm.createCreationalContext(null)));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/cdi/CDIs.java`
#### Snippet
```java
        private static JohnzonCdiExtension load(final Object beanManager) {
            final jakarta.enterprise.inject.spi.BeanManager bm = jakarta.enterprise.inject.spi.BeanManager.class.cast(beanManager);
            return JohnzonCdiExtension.class.cast(
                bm.getReference(bm.resolve(bm.getBeans(JohnzonCdiExtension.class)), JohnzonCdiExtension.class, bm.createCreationalContext(null)));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java
    @Override
    public JsonStructure read() {
        return JsonStructure.class.cast(readValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java
        final JsonStructure read = read();
        checkType(JsonObject.class, read);
        return JsonObject.class.cast(read);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java
        final JsonStructure read = read();
        checkType(JsonArray.class, read);
        return JsonArray.class.cast(read);
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/PropertyNamingStrategyFactory.java`
#### Snippet
```java

    public PropertyNamingStrategy create() {
        if (String.class.isInstance(value)) {
            final String val = value.toString();
            switch (val) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/PropertyNamingStrategyFactory.java`
#### Snippet
```java
            }
        }
        if (PropertyNamingStrategy.class.isInstance(value)) {
            return PropertyNamingStrategy.class.cast(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/PropertyNamingStrategyFactory.java`
#### Snippet
```java
        }
        if (PropertyNamingStrategy.class.isInstance(value)) {
            return PropertyNamingStrategy.class.cast(value);
        }
        throw new IllegalArgumentException(value + " not supported as PropertyNamingStrategy");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/reflect/Types.java`
#### Snippet
```java

    public Class<?> asClass(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) : null;
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/reflect/Types.java`
#### Snippet
```java

    public Class<?> asClass(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) : null;
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidatorFactory.java`
#### Snippet
```java
            // unwrap when possible to simplify the stack and make toString readable (debug)
            this.delegates = validations.stream()
                    .flatMap(it -> ValidationsFunction.class.isInstance(it) ? ValidationsFunction.class.cast(it).delegates.stream() : Stream.of(it))
                    .filter(it -> it != NO_VALIDATION)
                    .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidatorFactory.java`
#### Snippet
```java
            // unwrap when possible to simplify the stack and make toString readable (debug)
            this.delegates = validations.stream()
                    .flatMap(it -> ValidationsFunction.class.isInstance(it) ? ValidationsFunction.class.cast(it).delegates.stream() : Stream.of(it))
                    .filter(it -> it != NO_VALIDATION)
                    .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
                    instance.setTimeZone(TimeZone.getTimeZone(zonedDateTime.getZone()));
                    instance.setTime(Date.from(zonedDateTime.toInstant()));
                    return GregorianCalendar.class.cast(instance);
                }
            }, GregorianCalendar.class));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
        }
        if (found == null) {
            if (!AdapterKey.class.isInstance(key)) {
                return null;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
                return null;
            }
            final AdapterKey k = AdapterKey.class.cast(key);
            if (k.getTo() == String.class) {
                final Adapter<?, ?> adapter = doLazyLookup(k);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/spi/AsyncOperator.java`
#### Snippet
```java
        } catch (ExecutionException e) {
            final Throwable cause = e.getCause();
            if (RuntimeException.class.isInstance(cause)) {
                throw RuntimeException.class.cast(cause);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/spi/AsyncOperator.java`
#### Snippet
```java
            final Throwable cause = e.getCause();
            if (RuntimeException.class.isInstance(cause)) {
                throw RuntimeException.class.cast(cause);
            }
            throw new IllegalStateException(cause);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java

    private Boolean toBool(final Object v) {
        return !Boolean.class.isInstance(v) ? Boolean.parseBoolean(v.toString()) : Boolean.class.cast(v);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java

    private Boolean toBool(final Object v) {
        return !Boolean.class.isInstance(v) ? Boolean.parseBoolean(v.toString()) : Boolean.class.cast(v);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
    @Override
    public Jsonb build() {
        builder.setEnumConverterFactory(type -> newEnumConverter(Class.class.cast(type)));
        if (jsonp != null) {
            builder.setGeneratorFactory(jsonp.createGeneratorFactory(generatorConfig()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        config.getProperty(JsonbConfig.ENCODING).ifPresent(encoding -> builder.setEncoding(String.valueOf(encoding)));
        final boolean isNillable = config.getProperty(JsonbConfig.NULL_VALUES)
                .map(it -> String.class.isInstance(it) ? Boolean.parseBoolean(it.toString()) : Boolean.class.cast(it))
                .map(serNulls -> {
                    builder.setSkipNull(!serNulls);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        config.getProperty(JsonbConfig.ENCODING).ifPresent(encoding -> builder.setEncoding(String.valueOf(encoding)));
        final boolean isNillable = config.getProperty(JsonbConfig.NULL_VALUES)
                .map(it -> String.class.isInstance(it) ? Boolean.parseBoolean(it.toString()) : Boolean.class.cast(it))
                .map(serNulls -> {
                    builder.setSkipNull(!serNulls);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                .map(PropertyVisibilityStrategy.class::cast).orElse(new DefaultPropertyVisibilityStrategy());

        config.getProperty("johnzon.attributeOrder").ifPresent(comp -> builder.setAttributeOrder(Comparator.class.cast(comp)));
        config.getProperty("johnzon.primitiveConverters")
                .map(this::toBool)
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                .map(String.class::cast)
                .ifPresent(dateFormat -> builder.setAdaptersDateTimeFormatter(config.getProperty(JsonbConfig.LOCALE)
                        .map(it -> String.class.isInstance(it) ? new LocaleConverter().to(it.toString()) : Locale.class.cast(it))
                        .map(value -> ofPattern(dateFormat, value))
                        .orElseGet(() -> ofPattern(dateFormat))));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                .map(String.class::cast)
                .ifPresent(dateFormat -> builder.setAdaptersDateTimeFormatter(config.getProperty(JsonbConfig.LOCALE)
                        .map(it -> String.class.isInstance(it) ? new LocaleConverter().to(it.toString()) : Locale.class.cast(it))
                        .map(value -> ofPattern(dateFormat, value))
                        .orElseGet(() -> ofPattern(dateFormat))));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java

        final JohnzonAdapterFactory factory = config.getProperty("johnzon.factory").map(val -> {
            if (JohnzonAdapterFactory.class.isInstance(val)) {
                return JohnzonAdapterFactory.class.cast(val);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        final JohnzonAdapterFactory factory = config.getProperty("johnzon.factory").map(val -> {
            if (JohnzonAdapterFactory.class.isInstance(val)) {
                return JohnzonAdapterFactory.class.cast(val);
            }
            if (String.class.isInstance(val)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                return JohnzonAdapterFactory.class.cast(val);
            }
            if (String.class.isInstance(val)) {
                try {
                    return JohnzonAdapterFactory.class.cast(tccl().loadClass(val.toString()).newInstance());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
            if (String.class.isInstance(val)) {
                try {
                    return JohnzonAdapterFactory.class.cast(tccl().loadClass(val.toString()).newInstance());
                } catch (final InstantiationException | ClassNotFoundException | IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                }
            }
            if (Class.class.isInstance(val)) {
                try {
                    return JohnzonAdapterFactory.class.cast(Class.class.cast(val).newInstance());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
            if (Class.class.isInstance(val)) {
                try {
                    return JohnzonAdapterFactory.class.cast(Class.class.cast(val).newInstance());
                } catch (final InstantiationException | IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
            if (Class.class.isInstance(val)) {
                try {
                    return JohnzonAdapterFactory.class.cast(Class.class.cast(val).newInstance());
                } catch (final InstantiationException | IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java

        config.getProperty("johnzon.snippetMaxLength")
                .map(it -> Number.class.isInstance(it)?
                        Number.class.cast(it).intValue() :
                        Integer.parseInt(it.toString()))
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        config.getProperty("johnzon.snippetMaxLength")
                .map(it -> Number.class.isInstance(it)?
                        Number.class.cast(it).intValue() :
                        Integer.parseInt(it.toString()))
                .ifPresent(builder::setSnippetMaxLength);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        final Types types = new Types();

        config.getProperty(JsonbConfig.ADAPTERS).ifPresent(adapters -> Stream.of(JsonbAdapter[].class.cast(adapters)).forEach(adapter -> {
            final ParameterizedType pt = types.findParameterizedType(adapter.getClass(), JsonbAdapter.class);
            if (pt == null) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        ofNullable(config.getProperty("johnzon.fail-on-unknown-properties")
                .orElseGet(() -> config.getProperty("jsonb.fail-on-unknown-properties").orElse(null)))
                .map(v -> Boolean.class.isInstance(v) ? Boolean.class.cast(v) : Boolean.parseBoolean(String.valueOf(v)))
                .ifPresent(builder::setFailOnUnknownProperties);

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        ofNullable(config.getProperty("johnzon.fail-on-unknown-properties")
                .orElseGet(() -> config.getProperty("jsonb.fail-on-unknown-properties").orElse(null)))
                .map(v -> Boolean.class.isInstance(v) ? Boolean.class.cast(v) : Boolean.parseBoolean(String.valueOf(v)))
                .ifPresent(builder::setFailOnUnknownProperties);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        config.getProperty("johnzon.serialize-value-filter")
                .map(s -> {
                    if (String.class.isInstance(s)) {
                        try {
                            return SerializeValueFilter.class.cast(
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                    if (String.class.isInstance(s)) {
                        try {
                            return SerializeValueFilter.class.cast(
                                    Thread.currentThread().getContextClassLoader().loadClass(s.toString()).getConstructor().newInstance());
                        } catch (final InstantiationException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException e) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                    return s;
                })
                .ifPresent(s -> builder.setSerializeValueFilter(SerializeValueFilter.class.cast(s)));

        config.getProperty(JsonbConfig.SERIALIZERS).map(JsonbSerializer[].class::cast).ifPresent(serializers -> {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                final Type[] args = pt.getActualTypeArguments();
                // TODO: support PT in ObjectConverter (list)
                if (args.length != 1 || !Class.class.isInstance(args[0])) {
                    throw new IllegalArgumentException("We only support serializer on Class for now");
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                }
                builder.addObjectConverter(
                    Class.class.cast(args[0]), (ObjectConverter.Writer) (instance, jsonbGenerator) ->
                        s.serialize(
                                instance, jsonbGenerator.getJsonGenerator(),
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                final ParameterizedType pt = types.findParameterizedType(d.getClass(), JsonbDeserializer.class);
                final Type[] args = pt.getActualTypeArguments();
                if (args.length != 1 || !Class.class.isInstance(args[0])) {
                    throw new IllegalArgumentException("We only support deserializer on Class for now");
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                final JsonBuilderFactory builderFactory = builderFactorySupplier.get();
                builder.addObjectConverter(
                        Class.class.cast(args[0]), (ObjectConverter.Reader)
                                (jsonObject, targetType, parser) -> d.deserialize(
                                        JsonValueParserAdapter.createFor(jsonObject, parserFactoryProvider),
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        });

        if (Closeable.class.isInstance(accessMode)) {
            builder.addCloseable(Closeable.class.cast(accessMode));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java

        if (Closeable.class.isInstance(accessMode)) {
            builder.addCloseable(Closeable.class.cast(accessMode));
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java

    private AccessMode toAccessMode(final Object s) {
        if (String.class.isInstance(s)) {
            try {
                return AccessMode.class.cast(
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        if (String.class.isInstance(s)) {
            try {
                return AccessMode.class.cast(
                        Thread.currentThread().getContextClassLoader().loadClass(s.toString()).getConstructor().newInstance());
            } catch (final InstantiationException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException e) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
            }
        }
        return AccessMode.class.cast(s);
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        final String name;
        Object previous = builders.getLast();
        if (NamedBuilder.class.isInstance(previous)) {
            final NamedBuilder namedBuilder = NamedBuilder.class.cast(previous);
            name = namedBuilder.name;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        Object previous = builders.getLast();
        if (NamedBuilder.class.isInstance(previous)) {
            final NamedBuilder namedBuilder = NamedBuilder.class.cast(previous);
            name = namedBuilder.name;
            previous = namedBuilder.builder;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        }

        if (JsonArrayBuilder.class.isInstance(last)) {
            final JsonArrayBuilder array = JsonArrayBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java

        if (JsonArrayBuilder.class.isInstance(last)) {
            final JsonArrayBuilder array = JsonArrayBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
                arrayBuilder = JsonArrayBuilder.class.cast(previous);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        if (JsonArrayBuilder.class.isInstance(last)) {
            final JsonArrayBuilder array = JsonArrayBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
                arrayBuilder = JsonArrayBuilder.class.cast(previous);
                objectBuilder = null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            final JsonArrayBuilder array = JsonArrayBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
                arrayBuilder = JsonArrayBuilder.class.cast(previous);
                objectBuilder = null;
                arrayBuilder.add(array);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                objectBuilder = null;
                arrayBuilder.add(array);
            } else if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                arrayBuilder = null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                arrayBuilder.add(array);
            } else if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                arrayBuilder = null;
                objectBuilder.add(name, array);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                throw new IllegalArgumentException("Unsupported previous builder: " + previous);
            }
        } else if (JsonObjectBuilder.class.isInstance(last)) {
            final JsonObjectBuilder object = JsonObjectBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            }
        } else if (JsonObjectBuilder.class.isInstance(last)) {
            final JsonObjectBuilder object = JsonObjectBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
                arrayBuilder = JsonArrayBuilder.class.cast(previous);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        } else if (JsonObjectBuilder.class.isInstance(last)) {
            final JsonObjectBuilder object = JsonObjectBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
                arrayBuilder = JsonArrayBuilder.class.cast(previous);
                objectBuilder = null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            final JsonObjectBuilder object = JsonObjectBuilder.class.cast(last);
            if (JsonArrayBuilder.class.isInstance(previous)) {
                arrayBuilder = JsonArrayBuilder.class.cast(previous);
                objectBuilder = null;
                arrayBuilder.add(object);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                objectBuilder = null;
                arrayBuilder.add(object);
            } else if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                arrayBuilder = null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                arrayBuilder.add(object);
            } else if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                arrayBuilder = null;
                objectBuilder.add(name, object);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                throw new IllegalArgumentException("Unsupported previous builder: " + previous);
            }
        } else if (NamedBuilder.class.isInstance(last)) {
            final NamedBuilder<?> namedBuilder = NamedBuilder.class.cast(last);
            if (JsonObjectBuilder.class.isInstance(previous)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            }
        } else if (NamedBuilder.class.isInstance(last)) {
            final NamedBuilder<?> namedBuilder = NamedBuilder.class.cast(last);
            if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        } else if (NamedBuilder.class.isInstance(last)) {
            final NamedBuilder<?> namedBuilder = NamedBuilder.class.cast(last);
            if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                if (JsonArrayBuilder.class.isInstance(namedBuilder.builder)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            final NamedBuilder<?> namedBuilder = NamedBuilder.class.cast(last);
            if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                if (JsonArrayBuilder.class.isInstance(namedBuilder.builder)) {
                    objectBuilder.add(namedBuilder.name, JsonArrayBuilder.class.cast(namedBuilder.builder));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            if (JsonObjectBuilder.class.isInstance(previous)) {
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                if (JsonArrayBuilder.class.isInstance(namedBuilder.builder)) {
                    objectBuilder.add(namedBuilder.name, JsonArrayBuilder.class.cast(namedBuilder.builder));
                    arrayBuilder = null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                objectBuilder = JsonObjectBuilder.class.cast(previous);
                if (JsonArrayBuilder.class.isInstance(namedBuilder.builder)) {
                    objectBuilder.add(namedBuilder.name, JsonArrayBuilder.class.cast(namedBuilder.builder));
                    arrayBuilder = null;
                } else if (JsonObjectBuilder.class.isInstance(namedBuilder.builder)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                    objectBuilder.add(namedBuilder.name, JsonArrayBuilder.class.cast(namedBuilder.builder));
                    arrayBuilder = null;
                } else if (JsonObjectBuilder.class.isInstance(namedBuilder.builder)) {
                    objectBuilder.add(namedBuilder.name, JsonObjectBuilder.class.cast(namedBuilder.builder));
                    arrayBuilder = null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
                    arrayBuilder = null;
                } else if (JsonObjectBuilder.class.isInstance(namedBuilder.builder)) {
                    objectBuilder.add(namedBuilder.name, JsonObjectBuilder.class.cast(namedBuilder.builder));
                    arrayBuilder = null;
                } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
    public JsonValue getResult() {
        final Object last = builders.getLast();
        if (JsonArrayBuilder.class.isInstance(last)) {
            return JsonArrayBuilder.class.cast(last).build();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        final Object last = builders.getLast();
        if (JsonArrayBuilder.class.isInstance(last)) {
            return JsonArrayBuilder.class.cast(last).build();
        }
        if (JsonObjectBuilder.class.isInstance(last)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
            return JsonArrayBuilder.class.cast(last).build();
        }
        if (JsonObjectBuilder.class.isInstance(last)) {
            return JsonObjectBuilder.class.cast(last).build();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JsonObjectGenerator.java`
#### Snippet
```java
        }
        if (JsonObjectBuilder.class.isInstance(last)) {
            return JsonObjectBuilder.class.cast(last).build();
        }
        throw new IllegalArgumentException("Nothing prepared or wrongly prepared");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
        final Object v = value(name, JsonValue.class);
        if (v != null && v instanceof JsonNumber) {
            return JsonNumber.class.cast(v).intValue();
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        return (JsonObjectImpl.class.isInstance(obj)
                && unmodifieableBackingMap.equals(JsonObjectImpl.class.cast(obj).unmodifieableBackingMap))
                || (Map.class.isInstance(obj) && unmodifieableBackingMap.equals(Map.class.cast(obj)));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
    public boolean equals(final Object obj) {
        return (JsonObjectImpl.class.isInstance(obj)
                && unmodifieableBackingMap.equals(JsonObjectImpl.class.cast(obj).unmodifieableBackingMap))
                || (Map.class.isInstance(obj) && unmodifieableBackingMap.equals(Map.class.cast(obj)));
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
        return (JsonObjectImpl.class.isInstance(obj)
                && unmodifieableBackingMap.equals(JsonObjectImpl.class.cast(obj).unmodifieableBackingMap))
                || (Map.class.isInstance(obj) && unmodifieableBackingMap.equals(Map.class.cast(obj)));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
        return (JsonObjectImpl.class.isInstance(obj)
                && unmodifieableBackingMap.equals(JsonObjectImpl.class.cast(obj).unmodifieableBackingMap))
                || (Map.class.isInstance(obj) && unmodifieableBackingMap.equals(Map.class.cast(obj)));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
        final Object v = value(name, JsonValue.class);
        if (v != null && v instanceof JsonString) {
            return JsonString.class.cast(v).getString();
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/JohnzonMessageBodyWriter.java`
#### Snippet
```java
        if (rawType.isArray()) {
            mapper.writeArray(t, entityStream);
        } else if (Collection.class.isInstance(t)) {
            mapper.writeArray(Collection.class.cast(t), entityStream);
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/JohnzonMessageBodyWriter.java`
#### Snippet
```java
            mapper.writeArray(t, entityStream);
        } else if (Collection.class.isInstance(t)) {
            mapper.writeArray(Collection.class.cast(t), entityStream);
        } else {
            mapper.writeObject(t, entityStream);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonDoubleImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        if (JsonDoubleImpl.class.isInstance(obj)) {
            return JsonDoubleImpl.class.cast(obj).value == value;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonDoubleImpl.java`
#### Snippet
```java
    public boolean equals(final Object obj) {
        if (JsonDoubleImpl.class.isInstance(obj)) {
            return JsonDoubleImpl.class.cast(obj).value == value;
        }
        return JsonNumber.class.isInstance(obj) && Objects.equals(JsonNumber.class.cast(obj).bigDecimalValue(), bigDecimalValue());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonDoubleImpl.java`
#### Snippet
```java
            return JsonDoubleImpl.class.cast(obj).value == value;
        }
        return JsonNumber.class.isInstance(obj) && Objects.equals(JsonNumber.class.cast(obj).bigDecimalValue(), bigDecimalValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonDoubleImpl.java`
#### Snippet
```java
            return JsonDoubleImpl.class.cast(obj).value == value;
        }
        return JsonNumber.class.isInstance(obj) && Objects.equals(JsonNumber.class.cast(obj).bigDecimalValue(), bigDecimalValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                .map(it -> logic.apply(it, params))
                .filter(it -> it.getValueType() == JsonValue.ValueType.STRING)
                .map(it -> JsonString.class.cast(it).getString())
                .collect(joining()));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
    public JohnzonJsonLogic registerExtensionsOperators() {
        registerOperator("jsonpatch", (logic, config, params) -> getJsonPatch(config)
                .apply(JsonStructure.class.cast(params)));
        registerOperator("jsonmergepatch", (logic, config, params) -> getJsonMergePatch(config)
                .apply(params));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                .filter(it -> varImpl(logic.apply(it, params), params) == JsonValue.NULL)
                .collect(toArray());
        if ((tested.size() - missing.size()) < JsonNumber.class.cast(logic.apply(configArray.get(0), params)).intValue()) {
            return missing;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
        if (string.contains(".")) {
            try {
                objectAttribute = toPointer(string).getValue(JsonStructure.class.cast(params));
            } catch (final JsonException je) { // missing
                return JsonValue.NULL;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    throw new IllegalArgumentException("Only numbers can be compared: " + first + " / " + second);
                }
                return comparator.test(JsonNumber.class.cast(first).doubleValue(), JsonNumber.class.cast(second).doubleValue()) ?
                        JsonValue.TRUE : JsonValue.FALSE;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    throw new IllegalArgumentException("Only numbers can be compared: " + first + " / " + second);
                }
                return comparator.test(JsonNumber.class.cast(first).doubleValue(), JsonNumber.class.cast(second).doubleValue()) ?
                        JsonValue.TRUE : JsonValue.FALSE;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    throw new IllegalArgumentException("Only numbers can be compared");
                }
                return comparator.test(JsonNumber.class.cast(first).doubleValue(), JsonNumber.class.cast(second).doubleValue()) &&
                        comparator.test(JsonNumber.class.cast(second).doubleValue(), JsonNumber.class.cast(third).doubleValue()) ?
                        JsonValue.TRUE : JsonValue.FALSE;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    throw new IllegalArgumentException("Only numbers can be compared");
                }
                return comparator.test(JsonNumber.class.cast(first).doubleValue(), JsonNumber.class.cast(second).doubleValue()) &&
                        comparator.test(JsonNumber.class.cast(second).doubleValue(), JsonNumber.class.cast(third).doubleValue()) ?
                        JsonValue.TRUE : JsonValue.FALSE;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                }
                return comparator.test(JsonNumber.class.cast(first).doubleValue(), JsonNumber.class.cast(second).doubleValue()) &&
                        comparator.test(JsonNumber.class.cast(second).doubleValue(), JsonNumber.class.cast(third).doubleValue()) ?
                        JsonValue.TRUE : JsonValue.FALSE;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                }
                return comparator.test(JsonNumber.class.cast(first).doubleValue(), JsonNumber.class.cast(second).doubleValue()) &&
                        comparator.test(JsonNumber.class.cast(second).doubleValue(), JsonNumber.class.cast(third).doubleValue()) ?
                        JsonValue.TRUE : JsonValue.FALSE;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                throw new IllegalArgumentException("/ only supports arrays with 2 elements: '" + config + "'");
            }
            return provider.createValue(JsonNumber.class.cast(logic.apply(array.get(0), params)).doubleValue() /
                    JsonNumber.class.cast(logic.apply(array.get(1), params)).doubleValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
            }
            return provider.createValue(JsonNumber.class.cast(logic.apply(array.get(0), params)).doubleValue() /
                    JsonNumber.class.cast(logic.apply(array.get(1), params)).doubleValue());
        }
        throw new IllegalArgumentException("Unsupported / operation: '" + config + "'");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                switch (accessor.getValueType()) {
                    case NUMBER:
                        final int index = JsonNumber.class.cast(accessor).intValue();
                        final JsonArray array = params.asJsonArray();
                        final JsonValue arrayAttribute = index >= array.size() ? null : array.get(index);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                        return arrayAttribute == null ? (values.size() > 1 ? apply(values.get(1), params) : JsonValue.NULL) : arrayAttribute;
                    case STRING:
                        final JsonValue objectAttribute = extractValue(params, JsonString.class.cast(accessor).getString());
                        return objectAttribute == JsonValue.NULL && values.size() > 1 ? apply(values.get(1), params) : objectAttribute;
                    default:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                }
            case STRING:
                return extractValue(params, JsonString.class.cast(config).getString());
            case NUMBER:
                final int index = JsonNumber.class.cast(config).intValue();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                return extractValue(params, JsonString.class.cast(config).getString());
            case NUMBER:
                final int index = JsonNumber.class.cast(config).intValue();
                final JsonArray array = params.asJsonArray();
                final JsonValue arrayAttribute = array.size() <= index ? null : array.get(index);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
            throw new IllegalArgumentException("expected a string for substr, got '" + value + "'");
        }
        final String valueStr = JsonString.class.cast(value).getString();
        final JsonValue from = logic.apply(array.get(1), params);
        if (from.getValueType() != JsonValue.ValueType.NUMBER) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
            throw new IllegalArgumentException("expected a number for substr, got '" + from + "'");
        }
        final int fromIdx = JsonNumber.class.cast(from).intValue();
        final int start;
        if (fromIdx < 0) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                throw new IllegalArgumentException("expected a number for substr, got '" + to + "'");
            }
            final int length = JsonNumber.class.cast(to).intValue();
            end = length < 0 ? valueStr.length() + length : start + length;
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                .map(it -> logic.apply(it, params))
                .filter(it -> it.getValueType() == JsonValue.ValueType.NUMBER)
                .mapToDouble(it -> JsonNumber.class.cast(it).doubleValue());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
        switch (value.getValueType()) {
            case NUMBER:
                return JsonNumber.class.cast(value).intValue() == 0;
            case ARRAY:
                return value.asJsonArray().isEmpty();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                return value.asJsonArray().isEmpty();
            case STRING:
                return JsonString.class.cast(value).getString().isEmpty();
            case FALSE:
            case NULL:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    case NUMBER:
                        try {
                            return Double.parseDouble(JsonString.class.cast(a).getString()) == JsonNumber.class.cast(b).doubleValue();
                        } catch (final NumberFormatException nfe) {
                            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    case NUMBER:
                        try {
                            return Double.parseDouble(JsonString.class.cast(a).getString()) == JsonNumber.class.cast(b).doubleValue();
                        } catch (final NumberFormatException nfe) {
                            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    case STRING:
                        try {
                            return Double.parseDouble(JsonString.class.cast(b).getString()) == JsonNumber.class.cast(a).doubleValue();
                        } catch (final NumberFormatException nfe) {
                            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                    case STRING:
                        try {
                            return Double.parseDouble(JsonString.class.cast(b).getString()) == JsonNumber.class.cast(a).doubleValue();
                        } catch (final NumberFormatException nfe) {
                            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                throw new IllegalArgumentException("% only supports arrays with 2 elements: '" + config + "'");
            }
            return provider.createValue(JsonNumber.class.cast(logic.apply(array.get(0), params)).doubleValue() %
                    JsonNumber.class.cast(logic.apply(array.get(1), params)).doubleValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
            }
            return provider.createValue(JsonNumber.class.cast(logic.apply(array.get(0), params)).doubleValue() %
                    JsonNumber.class.cast(logic.apply(array.get(1), params)).doubleValue());
        }
        throw new IllegalArgumentException("Unsupported % operation: '" + config + "'");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                throw new IllegalArgumentException("- only supports arrays with 2 elements: '" + config + "'");
            }
            return provider.createValue(JsonNumber.class.cast(logic.apply(array.get(0), params)).doubleValue() -
                    JsonNumber.class.cast(logic.apply(array.get(1), params)).doubleValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
            }
            return provider.createValue(JsonNumber.class.cast(logic.apply(array.get(0), params)).doubleValue() -
                    JsonNumber.class.cast(logic.apply(array.get(1), params)).doubleValue());
        }
        final JsonValue applied = logic.apply(config, params);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
        final JsonValue applied = logic.apply(config, params);
        if (applied.getValueType() == JsonValue.ValueType.NUMBER) {
            return provider.createValue(-1 * JsonNumber.class.cast(applied).doubleValue());
        }
        throw new IllegalArgumentException("Unsupported - operation: '" + config + "'");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
        switch (value.getValueType()) {
            case STRING:
                return expected.getValueType() == JsonValue.ValueType.STRING && JsonString.class.cast(value).getString()
                        .contains(JsonString.class.cast(expected).getString()) ? JsonValue.TRUE : JsonValue.FALSE;
            case ARRAY:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
            case STRING:
                return expected.getValueType() == JsonValue.ValueType.STRING && JsonString.class.cast(value).getString()
                        .contains(JsonString.class.cast(expected).getString()) ? JsonValue.TRUE : JsonValue.FALSE;
            case ARRAY:
                return value.getValueType() == JsonValue.ValueType.ARRAY && value.asJsonArray().stream()
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
                return value;
            case STRING:
                return provider.createValue(Double.parseDouble(JsonString.class.cast(value).getString()));
            default:
                throw new IllegalArgumentException("Unsupported value to number: '" + value + "'");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    @Override
    public JsonValue toJsonValue(final Object rawObject, final Type runtimeType) {
        if (JsonValue.class.isInstance(rawObject)) {
            return JsonValue.class.cast(rawObject);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    public JsonValue toJsonValue(final Object rawObject, final Type runtimeType) {
        if (JsonValue.class.isInstance(rawObject)) {
            return JsonValue.class.cast(rawObject);
        }
        try (final JsonObjectGenerator jsonObjectGenerator = new JsonObjectGenerator(delegate.getBuilderFactory())) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        switch (json.getValueType()) {
            case NULL:
                if (Class.class.isInstance(type) && Class.class.cast(type).isPrimitive()) {
                    throw new JsonbException("can't map a primritive to null");
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        switch (json.getValueType()) {
            case NULL:
                if (Class.class.isInstance(type) && Class.class.cast(type).isPrimitive()) {
                    throw new JsonbException("can't map a primritive to null");
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                    throw new JsonbException("STRING json can't be casted to " + type);
                }
                return (T) JsonString.class.cast(json).getString();
            case TRUE:
            case FALSE:
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return (T) Boolean.valueOf(JsonValue.ValueType.TRUE == json.getValueType());
            case NUMBER:
                if (!Class.class.isInstance(type) || !Number.class.isAssignableFrom(Class.class.cast(type))) {
                    throw new JsonbException("NUMBER json can't be casted to " + type);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return (T) Boolean.valueOf(JsonValue.ValueType.TRUE == json.getValueType());
            case NUMBER:
                if (!Class.class.isInstance(type) || !Number.class.isAssignableFrom(Class.class.cast(type))) {
                    throw new JsonbException("NUMBER json can't be casted to " + type);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                    throw new JsonbException("NUMBER json can't be casted to " + type);
                }
                final JsonNumber jsonNumber = JsonNumber.class.cast(json);
                if (int.class == type || Integer.class == type) {
                    return (T) Integer.valueOf(jsonNumber.intValue());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            case OBJECT:
            case ARRAY:
                return delegate.readObject(JsonStructure.class.cast(json), type);
            default:
                throw new JsonbException("Unsupported type: " + json.getValueType());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            delegate.writeArray((Object[]) object, stream);
        } else if (isCollection(runtimeType)) {
            delegate.writeArray(Collection.class.cast(object), stream);
        } else if (ijson && isNotObjectOrArray(object)) {
            throw new JsonbException("I-JSON mode only accepts arrays and objects as root instances");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        try {
            if (isArray(runtimeType)) {
                final Class cast = Class.class.cast(runtimeType);
                return (T) delegate.readTypedArray(new StringReader(str), cast.getComponentType(), cast);
            } else if (JsonArray.class == runtimeType) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            if (isArray(object.getClass())) {
                return delegate.writeArrayAsString(toArray(object));
            } else if (Collection.class.isInstance(object)) {
                return delegate.writeArrayAsString(Collection.class.cast(object));
            } else if (ijson && isNotObjectOrArray(object)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return delegate.writeArrayAsString(toArray(object));
            } else if (Collection.class.isInstance(object)) {
                return delegate.writeArrayAsString(Collection.class.cast(object));
            } else if (ijson && isNotObjectOrArray(object)) {
                throw new JsonbException("I-JSON mode only accepts arrays and objects as root instances");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        try {
            if (isArray(runtimeType)) {
                final Class<T> type = Class.class.cast(runtimeType);
                return delegate.readTypedArray(parser, type.getComponentType(), type);
            } else if (JsonArray.class == runtimeType) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return (T) delegate.readJsonArray(parser);
            } else if (isCollection(runtimeType)) {
                return (T) delegate.readCollection(parser, ParameterizedType.class.cast(runtimeType));
            }
            final Type mappingType = unwrapPrimitiveOptional(runtimeType);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    public void toJson(final Object inObject, final Type runtimeType, final Writer writer) throws JsonbException {
        if (isValueConsumer(writer)) {
            Consumer.class.cast(writer).accept(delegate.toStructure(inObject));
            return;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            delegate.writeArray((Object[]) object, writer);
        } else if (isCollection(runtimeType)) {
            delegate.writeArray(Collection.class.cast(object), writer);
        } else if (ijson && isNotObjectOrArray(object)) {
            throw new JsonbException("I-JSON mode only accepts arrays and objects as root instances");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return (T) OptionalDouble.empty();
            }
            return (T) OptionalDouble.of(Number.class.cast(object).doubleValue());
        } else if (OptionalInt.class == type) {
            if (object == null) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return (T) OptionalInt.empty();
            }
            return (T) OptionalInt.of(Number.class.cast(object).intValue());
        } else if (OptionalLong.class == type) {
            if (object == null) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                return (T) OptionalLong.empty();
            }
            return (T) OptionalLong.of(Number.class.cast(object).longValue());
        }
        // Optional
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private ParameterizedType toCollectionType(final Type runtimeType) {
        if (ParameterizedType.class.isInstance(runtimeType)) {
            return ParameterizedType.class.cast(runtimeType);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    private ParameterizedType toCollectionType(final Type runtimeType) {
        if (ParameterizedType.class.isInstance(runtimeType)) {
            return ParameterizedType.class.cast(runtimeType);
        }
        return new JohnzonParameterizedType(runtimeType, Object.class);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        } else if (OptionalLong.class == type) {
            return long.class;
        } else if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType pt = ParameterizedType.class.cast(type);
            if (Optional.class == pt.getRawType()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            return long.class;
        } else if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType pt = ParameterizedType.class.cast(type);
            if (Optional.class == pt.getRawType()) {
                return pt.getActualTypeArguments()[0];
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private boolean isCollection(final Type runtimeType) {
        if (!ParameterizedType.class.isInstance(runtimeType)) {
            return runtimeType == List.class || runtimeType == Set.class ||
                    runtimeType == SortedSet.class || runtimeType == Collection.class;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                    runtimeType == SortedSet.class || runtimeType == Collection.class;
        }
        final Type rawType = ParameterizedType.class.cast(runtimeType).getRawType();
        return Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType));
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        }
        final Type rawType = ParameterizedType.class.cast(runtimeType).getRawType();
        return Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        }
        final Type rawType = ParameterizedType.class.cast(runtimeType).getRawType();
        return Class.class.isInstance(rawType) && Collection.class.isAssignableFrom(Class.class.cast(rawType));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        try {
            if (isArray(runtimeType)) {
                final Class<T> type = Class.class.cast(runtimeType);
                return delegate.readTypedArray(stream, type.getComponentType(), type);
            } else if (JsonArray.class == runtimeType) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private boolean isArray(final Type runtimeType) {
        return Class.class.isInstance(runtimeType) && Class.class.cast(runtimeType).isArray();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private boolean isArray(final Type runtimeType) {
        return Class.class.isInstance(runtimeType) && Class.class.cast(runtimeType).isArray();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    public void toJson(final Object inObject, final Writer writer) throws JsonbException {
        if (isValueConsumer(writer)) {
            Consumer.class.cast(writer).accept(delegate.toStructure(inObject));
            return;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        if (object != null && isArray(object.getClass())) {
            delegate.writeArray((Object[]) object, writer);
        } else if (Collection.class.isInstance(object)) {
            delegate.writeArray(Collection.class.cast(object), writer);
        } else if (ijson && isNotObjectOrArray(object)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            delegate.writeArray((Object[]) object, writer);
        } else if (Collection.class.isInstance(object)) {
            delegate.writeArray(Collection.class.cast(object), writer);
        } else if (ijson && isNotObjectOrArray(object)) {
            throw new JsonbException("I-JSON mode only accepts arrays and objects as root instances");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    @Override
    public <T> T fromJson(final JsonParser json, final Class<T> type) {
        return type.cast(fromJson(json, Type.class.cast(type)));
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private Object unwrapOptional(final Object inObject) {
        if (Optional.class.isInstance(inObject)) {
            return Optional.class.cast(inObject).orElse(null);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    private Object unwrapOptional(final Object inObject) {
        if (Optional.class.isInstance(inObject)) {
            return Optional.class.cast(inObject).orElse(null);
        }
        if (OptionalInt.class.isInstance(inObject)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            return Optional.class.cast(inObject).orElse(null);
        }
        if (OptionalInt.class.isInstance(inObject)) {
            final OptionalInt optionalInt = OptionalInt.class.cast(inObject);
            return optionalInt.isPresent() ? optionalInt.getAsInt() : null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        }
        if (OptionalInt.class.isInstance(inObject)) {
            final OptionalInt optionalInt = OptionalInt.class.cast(inObject);
            return optionalInt.isPresent() ? optionalInt.getAsInt() : null;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            return optionalInt.isPresent() ? optionalInt.getAsInt() : null;
        }
        if (OptionalLong.class.isInstance(inObject)) {
            final OptionalLong optionalLong = OptionalLong.class.cast(inObject);
            return optionalLong.isPresent() ? optionalLong.getAsLong() : null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        }
        if (OptionalLong.class.isInstance(inObject)) {
            final OptionalLong optionalLong = OptionalLong.class.cast(inObject);
            return optionalLong.isPresent() ? optionalLong.getAsLong() : null;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            return optionalLong.isPresent() ? optionalLong.getAsLong() : null;
        }
        if (OptionalDouble.class.isInstance(inObject)) {
            final OptionalDouble optionalDouble = OptionalDouble.class.cast(inObject);
            return optionalDouble.isPresent() ? optionalDouble.getAsDouble() : null;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        }
        if (OptionalDouble.class.isInstance(inObject)) {
            final OptionalDouble optionalDouble = OptionalDouble.class.cast(inObject);
            return optionalDouble.isPresent() ? optionalDouble.getAsDouble() : null;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private boolean isNotObjectOrArray(final Object object) {
        if (String.class.isInstance(object) || Number.class.isInstance(object) || Boolean.class.isInstance(object)) {
            return true;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private boolean isNotObjectOrArray(final Object object) {
        if (String.class.isInstance(object) || Number.class.isInstance(object) || Boolean.class.isInstance(object)) {
            return true;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java

    private boolean isNotObjectOrArray(final Object object) {
        if (String.class.isInstance(object) || Number.class.isInstance(object) || Boolean.class.isInstance(object)) {
            return true;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            return true;
        }
        if (JsonValue.class.isInstance(object)) {
            switch (JsonValue.class.cast(object).getValueType()) {
                case ARRAY:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        }
        if (JsonValue.class.isInstance(object)) {
            switch (JsonValue.class.cast(object).getValueType()) {
                case ARRAY:
                case OBJECT:
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        try {
            if (isArray(runtimeType)) {
                final Class<T> type = Class.class.cast(runtimeType);
                return delegate.readTypedArray(reader, type.getComponentType(), type);
            } else if (JsonArray.class == runtimeType) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        if (object != null && isArray(object.getClass())) {
            delegate.writeArray(toArray(object), stream);
        } else if (Collection.class.isInstance(object)) {
            delegate.writeArray(Collection.class.cast(object), stream);
        } else if (ijson && isNotObjectOrArray(object)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            delegate.writeArray(toArray(object), stream);
        } else if (Collection.class.isInstance(object)) {
            delegate.writeArray(Collection.class.cast(object), stream);
        } else if (ijson && isNotObjectOrArray(object)) {
            throw new JsonbException("I-JSON mode only accepts arrays and objects as root instances");
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
            return delegate.writeArrayAsString(toArray(object));
        } else if (isCollection(runtimeType)) {
            return delegate.writeArrayAsString(Collection.class.cast(object));
        } else if (ijson && isNotObjectOrArray(object)) {
            throw new JsonbException("I-JSON mode only accepts arrays and objects as root instances");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                        .anyMatch(pt -> pt.getRawType() == rawType &&
                                pt.getActualTypeArguments().length == 1 &&
                                Class.class.isInstance(pt.getActualTypeArguments()[0]) &&
                                JsonValue.class.isAssignableFrom(Class.class.cast(pt.getActualTypeArguments()[0])));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                                pt.getActualTypeArguments().length == 1 &&
                                Class.class.isInstance(pt.getActualTypeArguments()[0]) &&
                                JsonValue.class.isAssignableFrom(Class.class.cast(pt.getActualTypeArguments()[0])));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
    @Override
    public <T> T fromJsonValue(final JsonValue json, final Class<T> type) {
        return fromJsonValue(json, Type.class.cast(type));
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/mapper/MapperLocatorDelegate.java`
#### Snippet
```java
    public void contextDestroyed(final ServletContextEvent servletContextEvent) {
        final Supplier<Mapper> supplier = MAPPER_BY_LOADER.remove(servletContextEvent.getServletContext().getClassLoader());
        if (LazySupplier.class.isInstance(supplier)) {
            final Object mapper = LazySupplier.class.cast(supplier).getInstance();
            if (mapper != null) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/mapper/MapperLocatorDelegate.java`
#### Snippet
```java
        final Supplier<Mapper> supplier = MAPPER_BY_LOADER.remove(servletContextEvent.getServletContext().getClassLoader());
        if (LazySupplier.class.isInstance(supplier)) {
            final Object mapper = LazySupplier.class.cast(supplier).getInstance();
            if (mapper != null) {
                Mapper.class.cast(mapper).close();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/mapper/MapperLocatorDelegate.java`
#### Snippet
```java
            final Object mapper = LazySupplier.class.cast(supplier).getInstance();
            if (mapper != null) {
                Mapper.class.cast(mapper).close();
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MaxItemsValidation.java`
#### Snippet
```java
        return Optional.ofNullable(model.getSchema().get("maxItems"))
                .filter(it -> it.getValueType() == JsonValue.ValueType.NUMBER)
                .map(it -> JsonNumber.class.cast(it).intValue())
                .filter(it -> it >= 0)
                .map(max -> new Impl(model.toPointer(), model.getValueProvider(), max));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JohnzonCores.java`
#### Snippet
```java
        }
        try {
            return JsonReader.class.cast(CREATE_READER.invoke(readerFactory, parser));
        } catch (final IllegalAccessException e) {
            throw new IllegalStateException(e);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MaximumValidation.java`
#### Snippet
```java
            return Optional.ofNullable(model.getSchema().get("maximum"))
                    .filter(v -> v.getValueType() == JsonValue.ValueType.NUMBER)
                    .map(m -> new Impl(model.toPointer(), model.getValueProvider(), JsonNumber.class.cast(m).doubleValue()));
        }
        return Optional.empty();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                              final ObjectConverter.Reader objectConverter,
                              final JsonPointerTracker jsonPointer, final Type rootType) {
        if (Class.class.isInstance(type)) {
            final Class clazz = Class.class.cast(type);
            if (clazz.isArray()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                              final JsonPointerTracker jsonPointer, final Type rootType) {
        if (Class.class.isInstance(type)) {
            final Class clazz = Class.class.cast(type);
            if (clazz.isArray()) {
                final Class<?> componentType = clazz.getComponentType();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }

        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType genericType = ParameterizedType.class.cast(type);
            if (Stream.class == genericType.getRawType()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType genericType = ParameterizedType.class.cast(type);
            if (Stream.class == genericType.getRawType()) {
                return Stream.of(1).flatMap(seed -> Collection.class.cast(buildArray(
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final ParameterizedType genericType = ParameterizedType.class.cast(type);
            if (Stream.class == genericType.getRawType()) {
                return Stream.of(1).flatMap(seed -> Collection.class.cast(buildArray(
                        new JohnzonParameterizedType(List.class, genericType.getActualTypeArguments()),
                        jsonArray, itemConverter, objectConverter, jsonPointer, rootType)).stream());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }

        if (GenericArrayType.class.isInstance(type)) {
            Type genericComponentType = GenericArrayType.class.cast(type).getGenericComponentType();
            while (ParameterizedType.class.isInstance(genericComponentType)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (GenericArrayType.class.isInstance(type)) {
            Type genericComponentType = GenericArrayType.class.cast(type).getGenericComponentType();
            while (ParameterizedType.class.isInstance(genericComponentType)) {
                genericComponentType = ParameterizedType.class.cast(genericComponentType).getRawType();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (GenericArrayType.class.isInstance(type)) {
            Type genericComponentType = GenericArrayType.class.cast(type).getGenericComponentType();
            while (ParameterizedType.class.isInstance(genericComponentType)) {
                genericComponentType = ParameterizedType.class.cast(genericComponentType).getRawType();
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            Type genericComponentType = GenericArrayType.class.cast(type).getGenericComponentType();
            while (ParameterizedType.class.isInstance(genericComponentType)) {
                genericComponentType = ParameterizedType.class.cast(genericComponentType).getRawType();
            }
            if (Class.class.isInstance(genericComponentType)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                genericComponentType = ParameterizedType.class.cast(genericComponentType).getRawType();
            }
            if (Class.class.isInstance(genericComponentType)) {
                return buildArrayWithComponentType(jsonArray, Class.class.cast(genericComponentType), itemConverter, jsonPointer, rootType);
            } // else: fail for now
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (Class.class.isInstance(genericComponentType)) {
                return buildArrayWithComponentType(jsonArray, Class.class.cast(genericComponentType), itemConverter, jsonPointer, rootType);
            } // else: fail for now
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        // guess we don't want to map stream impls - keep it lazy since it is the only advantage to have streams there
        if (IntStream.class == type) {
            return Stream.of(1).flatMapToInt(seed -> IntStream.of(int[].class.cast(
                    buildArray(int[].class, jsonArray, null, null, jsonPointer, rootType))));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (LongStream.class == type) {
            return Stream.of(1).flatMapToLong(seed -> LongStream.of(long[].class.cast(
                    buildArray(long[].class, jsonArray, null, null, jsonPointer, rootType))));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (DoubleStream.class == type) {
            return Stream.of(1).flatMapToDouble(seed -> DoubleStream.of(double[].class.cast(
                    buildArray(double[].class, jsonArray, null, null, jsonPointer, rootType))));
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (classMapping == null) {
            if (ParameterizedType.class.isInstance(type)) {
                final ParameterizedType aType = ParameterizedType.class.cast(type);
                final Type[] fieldArgTypes = aType.getActualTypeArguments();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (classMapping == null) {
            if (ParameterizedType.class.isInstance(type)) {
                final ParameterizedType aType = ParameterizedType.class.cast(type);
                final Type[] fieldArgTypes = aType.getActualTypeArguments();
                if (fieldArgTypes.length >= 2) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                final Type[] fieldArgTypes = aType.getActualTypeArguments();
                if (fieldArgTypes.length >= 2) {
                    final Class<?> raw = Class.class.cast(aType.getRawType());
                    final Map map;
                    if (SortedMap.class.isAssignableFrom(raw) || NavigableMap.class == raw || TreeMap.class == raw) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                                    "set supportEnumMapDeserialization=true to disable that arbitrary limitation");
                        }
                        map = new EnumMap(Class.class.cast(fieldArgTypes[0]));
                    } else if (Map.class.isAssignableFrom(raw)) {
                        map = new LinkedHashMap(object.size()); // todo: configurable from config.getNewDefaultMap()?
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                        for (final Map.Entry<String, JsonValue> value : object.entrySet()) {
                            final JsonValue jsonValue = value.getValue();
                            if (JsonNumber.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), config.isUseBigDecimalForObjectNumbers() ?
                                        JsonNumber.class.cast(jsonValue).bigDecimalValue() : toNumberValue(JsonNumber.class.cast(jsonValue)));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                            if (JsonNumber.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), config.isUseBigDecimalForObjectNumbers() ?
                                        JsonNumber.class.cast(jsonValue).bigDecimalValue() : toNumberValue(JsonNumber.class.cast(jsonValue)));
                            } else if (JsonString.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), JsonString.class.cast(jsonValue).getString());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                            if (JsonNumber.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), config.isUseBigDecimalForObjectNumbers() ?
                                        JsonNumber.class.cast(jsonValue).bigDecimalValue() : toNumberValue(JsonNumber.class.cast(jsonValue)));
                            } else if (JsonString.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), JsonString.class.cast(jsonValue).getString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                                map.put(value.getKey(), config.isUseBigDecimalForObjectNumbers() ?
                                        JsonNumber.class.cast(jsonValue).bigDecimalValue() : toNumberValue(JsonNumber.class.cast(jsonValue)));
                            } else if (JsonString.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), JsonString.class.cast(jsonValue).getString());
                            } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                                        JsonNumber.class.cast(jsonValue).bigDecimalValue() : toNumberValue(JsonNumber.class.cast(jsonValue)));
                            } else if (JsonString.class.isInstance(jsonValue) && any) {
                                map.put(value.getKey(), JsonString.class.cast(jsonValue).getString());
                            } else {
                                map.put(convertTo(keyType, value.getKey()), toObject(null, jsonValue, fieldArgTypes[1], null, jsonPointer, Object.class));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (applyObjectConverter && classMapping.reader != null && (skippedConverters == null || !skippedConverters.contains(type))) {
            final Collection<Class<?>> skipped = skippedConverters == null ? new ArrayList<>() : skippedConverters;
            if (Class.class.isInstance(type)) { // more than likely, drop this check?
                skipped.add(Class.class.cast(type));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final Collection<Class<?>> skipped = skippedConverters == null ? new ArrayList<>() : skippedConverters;
            if (Class.class.isInstance(type)) { // more than likely, drop this check?
                skipped.add(Class.class.cast(type));
            }
            return classMapping.reader.fromJson(object, type, new SuppressConversionMappingParser(this, object, skipped));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            } else {
                t = classMapping.factory.create(createParameters(classMapping, object, jsonPointer, e -> {
                    if (FactoryCreateException.class.isInstance(e)) {
                        throw FactoryCreateException.class.cast(e);
                    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                t = classMapping.factory.create(createParameters(classMapping, object, jsonPointer, e -> {
                    if (FactoryCreateException.class.isInstance(e)) {
                        throw FactoryCreateException.class.cast(e);
                    }
                    throw new FactoryCreateException(type, object, config.getSnippet().of(object), e);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                            isDedup() ? new JsonPointerTracker(jsonPointer, jsonEntry.getKey()) : null, inType,
                            e -> {
                                if (SetterMappingException.class.isInstance(e)) {
                                    throw SetterMappingException.class.cast(e);
                                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                            e -> {
                                if (SetterMappingException.class.isInstance(e)) {
                                    throw SetterMappingException.class.cast(e);
                                }
                                final String snippet = config.getSnippet().of(jsonValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    .filter(it -> !classMapping.setters.containsKey(it.getKey()))
                    .collect(toMap(Map.Entry::getKey, e -> toValue(null, e.getValue(), null, null,
                            ParameterizedType.class.cast(classMapping.anyField.getGenericType()).getActualTypeArguments()[1], null,
                            isDedup() ? new JsonPointerTracker(jsonPointer, e.getKey()) : null, type,
                            MapperException::new))));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (adapterKey == null) {
            if (converter instanceof TypeAwareAdapter) {
                return TypeAwareAdapter.class.cast(converter).getKey();

            } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    final Type[] types = current.getGenericInterfaces();
                    for (final Type t : types) {
                        if (!ParameterizedType.class.isInstance(t)) {
                            continue;
                        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                            continue;
                        }
                        final ParameterizedType pt = ParameterizedType.class.cast(t);
                        if (Adapter.class == pt.getRawType()) {
                            final Type[] actualTypeArguments = pt.getActualTypeArguments();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            try {
                Type to = key.getTo();
                param = buildObject(to, JsonObject.class.cast(jsonValue), to instanceof Class, jsonPointer, getSkippedConverters());
            } catch (final Exception e) {
                throw new MapperException(e);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (STRING.equals(valueType)) {
            if (key.getTo() == JsonString.class) {
                return converter.to(JsonString.class.cast(jsonValue));
            }
            return converter.to(JsonString.class.cast(jsonValue).getString());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return converter.to(JsonString.class.cast(jsonValue));
            }
            return converter.to(JsonString.class.cast(jsonValue).getString());
        }
        if (TRUE.equals(valueType) || FALSE.equals(valueType)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            if (key != null) {
                if (Long.class == key.getTo() || long.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).longValue());
                } else if (Integer.class == key.getTo() || int.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).intValue());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    return converter.to(JsonNumber.class.cast(jsonValue).longValue());
                } else if (Integer.class == key.getTo() || int.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).intValue());
                } else if (Double.class == key.getTo() || double.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).doubleValue());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    return converter.to(JsonNumber.class.cast(jsonValue).intValue());
                } else if (Double.class == key.getTo() || double.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).doubleValue());
                } else if (Float.class == key.getTo() || float.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).doubleValue());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    return converter.to(JsonNumber.class.cast(jsonValue).doubleValue());
                } else if (Float.class == key.getTo() || float.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).doubleValue());
                } else if (BigInteger.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).bigIntegerValue());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    return converter.to(JsonNumber.class.cast(jsonValue).doubleValue());
                } else if (BigInteger.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).bigIntegerValue());
                } else if (BigDecimal.class == key.getTo() ||  Number.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).bigDecimalValue());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    return converter.to(JsonNumber.class.cast(jsonValue).bigIntegerValue());
                } else if (BigDecimal.class == key.getTo() ||  Number.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue).bigDecimalValue());
                } else if (JsonNumber.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    return converter.to(JsonNumber.class.cast(jsonValue).bigDecimalValue());
                } else if (JsonNumber.class == key.getTo()) {
                    return converter.to(JsonNumber.class.cast(jsonValue));
                }
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return converter.to(jsonValue.asJsonObject());
            }
            if (TypeAwareAdapter.class.isInstance(converter)) {
                final TypeAwareAdapter adapter = TypeAwareAdapter.class.cast(converter);
                if (adapter.getFrom().equals(targetType)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (TypeAwareAdapter.class.isInstance(converter)) {
                final TypeAwareAdapter adapter = TypeAwareAdapter.class.cast(converter);
                if (adapter.getFrom().equals(targetType)) {
                    return converter.to(readObject(jsonValue, adapter.getTo()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return false;
            }
            if (JsonNumber.class.isInstance(jsonValue)) {
                return toNumberValue(JsonNumber.class.cast(jsonValue));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (JsonNumber.class.isInstance(jsonValue)) {
                return toNumberValue(JsonNumber.class.cast(jsonValue));
            }
            if (JsonString.class.isInstance(jsonValue)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return toNumberValue(JsonNumber.class.cast(jsonValue));
            }
            if (JsonString.class.isInstance(jsonValue)) {
                return JsonString.class.cast(jsonValue).getString();
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (JsonString.class.isInstance(jsonValue)) {
                return JsonString.class.cast(jsonValue).getString();
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (type == Character.class || type == char.class) {
            return convertTo(Class.class.cast(type), (JsonString.class.cast(jsonValue).getString()));
        }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (type == Character.class || type == char.class) {
            return convertTo(Class.class.cast(type), (JsonString.class.cast(jsonValue).getString()));
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }

        if (JsonObject.class.isInstance(jsonValue)) {
            if (JsonObject.class == type || JsonStructure.class == type || JsonValue.class == type) {
                return jsonValue;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return jsonValue;
            }
            final boolean typedAdapter = !ConverterAdapter.class.isInstance(itemConverter) && TypeAwareAdapter.class.isInstance(itemConverter);
            final Object object = buildObject(
                    baseInstance != null ? baseInstance.getClass() : (
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return jsonValue;
            }
            final boolean typedAdapter = !ConverterAdapter.class.isInstance(itemConverter) && TypeAwareAdapter.class.isInstance(itemConverter);
            final Object object = buildObject(
                    baseInstance != null ? baseInstance.getClass() : (
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final Object object = buildObject(
                    baseInstance != null ? baseInstance.getClass() : (
                            typedAdapter ? TypeAwareAdapter.class.cast(itemConverter).getTo() : type),
                    JsonObject.class.cast(jsonValue), type instanceof Class,
                    jsonPointer, getSkippedConverters());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    baseInstance != null ? baseInstance.getClass() : (
                            typedAdapter ? TypeAwareAdapter.class.cast(itemConverter).getTo() : type),
                    JsonObject.class.cast(jsonValue), type instanceof Class,
                    jsonPointer, getSkippedConverters());
            return typedAdapter ? itemConverter.to(object) : object;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    jsonPointer, getSkippedConverters());
            return typedAdapter ? itemConverter.to(object) : object;
        } else if (JsonArray.class.isInstance(jsonValue)) {
            if (JsonArray.class == type || JsonStructure.class == type || JsonValue.class == type) {
                return jsonValue;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return jsonValue;
            }
            return buildArray(type, JsonArray.class.cast(jsonValue), itemConverter, null, jsonPointer, rootType);
        } else if (JsonNumber.class.isInstance(jsonValue)) {
            if (JsonNumber.class == type || JsonValue.class == type) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            return buildArray(type, JsonArray.class.cast(jsonValue), itemConverter, null, jsonPointer, rootType);
        } else if (JsonNumber.class.isInstance(jsonValue)) {
            if (JsonNumber.class == type || JsonValue.class == type) {
                return jsonValue;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }

            final JsonNumber number = JsonNumber.class.cast(jsonValue);

            if (type == Long.class || type == long.class) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }

        } else if (JsonString.class.isInstance(jsonValue)) {
            if (JsonString.class == type || JsonValue.class == type) {
                return jsonValue;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }

            final String string = JsonString.class.cast(jsonValue).getString();
            if (itemConverter == null) {
                // check whether we have a jsonPointer to a previously deserialised object
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return delegate.readObject(jsonValue, targetType, false, skippedConverters);
            }
            final boolean useConverters = (Class.class.isInstance(targetType) &&
                    (skippedConverters == null || skippedConverters.stream().noneMatch(it -> it.isAssignableFrom(Class.class.cast(targetType))))) ||
                    ParameterizedType.class.isInstance(targetType);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            final boolean useConverters = (Class.class.isInstance(targetType) &&
                    (skippedConverters == null || skippedConverters.stream().noneMatch(it -> it.isAssignableFrom(Class.class.cast(targetType))))) ||
                    ParameterizedType.class.isInstance(targetType);
            return delegate.readObject(jsonValue, targetType, useConverters, skippedConverters);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final boolean useConverters = (Class.class.isInstance(targetType) &&
                    (skippedConverters == null || skippedConverters.stream().noneMatch(it -> it.isAssignableFrom(Class.class.cast(targetType))))) ||
                    ParameterizedType.class.isInstance(targetType);
            return delegate.readObject(jsonValue, targetType, useConverters, skippedConverters);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (collection.isEmpty()) {
                return EnumSet.noneOf(Class.class.cast(mapping.arg));
            } else if (collection.size() == 1) {
                return Collection.class.cast(EnumSet.of(Enum.class.cast(collection.iterator().next())));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return EnumSet.noneOf(Class.class.cast(mapping.arg));
            } else if (collection.size() == 1) {
                return Collection.class.cast(EnumSet.of(Enum.class.cast(collection.iterator().next())));
            } else {
                final List<Enum> list = List.class.cast(collection);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return EnumSet.noneOf(Class.class.cast(mapping.arg));
            } else if (collection.size() == 1) {
                return Collection.class.cast(EnumSet.of(Enum.class.cast(collection.iterator().next())));
            } else {
                final List<Enum> list = List.class.cast(collection);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                return Collection.class.cast(EnumSet.of(Enum.class.cast(collection.iterator().next())));
            } else {
                final List<Enum> list = List.class.cast(collection);
                return Collection.class.cast(EnumSet.of(list.get(0), list.subList(1, list.size()).toArray(new Enum[list.size() - 1])));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            } else {
                final List<Enum> list = List.class.cast(collection);
                return Collection.class.cast(EnumSet.of(list.get(0), list.subList(1, list.size()).toArray(new Enum[list.size() - 1])));
            }
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            return (T) jsonValue;
        }
        if (JsonObject.class.isInstance(jsonValue)) {
            return (T) buildObject(
                    targetType, JsonObject.class.cast(jsonValue), applyObjectConverter,
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (JsonObject.class.isInstance(jsonValue)) {
            return (T) buildObject(
                    targetType, JsonObject.class.cast(jsonValue), applyObjectConverter,
                    null, skippedConverters);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    null, skippedConverters);
        }
        if (JsonString.class.isInstance(jsonValue)) {
            if ((targetType == String.class || targetType == Object.class)) {
                return (T) JsonString.class.cast(jsonValue).getString();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (JsonString.class.isInstance(jsonValue)) {
            if ((targetType == String.class || targetType == Object.class)) {
                return (T) JsonString.class.cast(jsonValue).getString();
            }
            if (targetType == Character.class || targetType == char.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (targetType == Character.class || targetType == char.class) {
                final CharSequence string = JsonString.class.cast(jsonValue).getChars();
                if (string.length() == 1) {
                    return (T) Character.valueOf(string.charAt(0));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final Mappings.ClassMapping classMapping = mappings.getClassMapping(targetType);
            if (classMapping != null && classMapping.adapter != null) {
                return (T) classMapping.adapter.to(JsonString.class.cast(jsonValue).getString());
            }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

            final Adapter adapter = findAdapter(targetType);
            if (adapter != null && TypeAwareAdapter.class.isInstance(adapter)) {
                final TypeAwareAdapter typeAwareAdapter = TypeAwareAdapter.class.cast(adapter);
                if (typeAwareAdapter.getTo() == String.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final Adapter adapter = findAdapter(targetType);
            if (adapter != null && TypeAwareAdapter.class.isInstance(adapter)) {
                final TypeAwareAdapter typeAwareAdapter = TypeAwareAdapter.class.cast(adapter);
                if (typeAwareAdapter.getTo() == String.class) {
                    return (T) adapter.to(JsonString.class.cast(jsonValue).getString());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                final TypeAwareAdapter typeAwareAdapter = TypeAwareAdapter.class.cast(adapter);
                if (typeAwareAdapter.getTo() == String.class) {
                    return (T) adapter.to(JsonString.class.cast(jsonValue).getString());
                }
                if (typeAwareAdapter.getTo() == JsonString.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                }
                if (typeAwareAdapter.getTo() == JsonString.class) {
                    return (T) adapter.to(JsonString.class.cast(jsonValue));
                }
                if (typeAwareAdapter.getTo() == CharSequence.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                }
                if (typeAwareAdapter.getTo() == CharSequence.class) {
                    return (T) adapter.to(JsonString.class.cast(jsonValue).getChars());
                }
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
        }
        if (JsonNumber.class.isInstance(jsonValue)) {
            final JsonNumber number = JsonNumber.class.cast(jsonValue);
            if (targetType == int.class || targetType == Integer.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (JsonNumber.class.isInstance(jsonValue)) {
            final JsonNumber number = JsonNumber.class.cast(jsonValue);
            if (targetType == int.class || targetType == Integer.class) {
                return (T) Integer.valueOf(number.intValue());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
        }
        if (JsonArray.class.isInstance(jsonValue)) {

            JsonArray jsonArray = (JsonArray) jsonValue;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            JsonArray jsonArray = (JsonArray) jsonValue;

            if (Class.class.isInstance(targetType)) {
                final Class<?> asClass = (Class) targetType;
                if (asClass.isArray()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                }
            }
            if (ParameterizedType.class.isInstance(targetType)) {

                final ParameterizedType pt = (ParameterizedType) targetType;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

                final Type arg = pt.getActualTypeArguments()[0];
                return (T) mapCollection(mapping, jsonArray, Class.class.isInstance(arg) ? config.findAdapter(Class.class.cast(arg)) : null,
                        null, isDedup() ? JsonPointerTracker.ROOT : null, Object.class);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

                final Type arg = pt.getActualTypeArguments()[0];
                return (T) mapCollection(mapping, jsonArray, Class.class.isInstance(arg) ? config.findAdapter(Class.class.cast(arg)) : null,
                        null, isDedup() ? JsonPointerTracker.ROOT : null, Object.class);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            }
            if (Object.class == targetType) {
                return (T) new ArrayList(asList(Object[].class.cast(buildArrayWithComponentType(jsonArray, Object.class, null,
                        isDedup() ? JsonPointerTracker.ROOT : null, Object.class))));
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            return converter;
        }
        if (Class.class.isInstance(aClass)) {
            final Class<?> clazz = Class.class.cast(aClass);
            if (Enum.class.isAssignableFrom(clazz)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (Class.class.isInstance(aClass)) {
            final Class<?> clazz = Class.class.cast(aClass);
            if (Enum.class.isAssignableFrom(clazz)) {
                final Adapter<?, ?> enumConverter = new ConverterAdapter(config.getEnumConverterFactory().apply(clazz), clazz);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (matched.size() == 1) {
            final Adapter<?, ?> adapter = config.getAdapters().get(matched.iterator().next());
            if (TypeAwareAdapter.class.isInstance(adapter)) {
                config.getAdapters().put(new AdapterKey(aClass, TypeAwareAdapter.class.cast(adapter).getTo()), adapter);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            final Adapter<?, ?> adapter = config.getAdapters().get(matched.iterator().next());
            if (TypeAwareAdapter.class.isInstance(adapter)) {
                config.getAdapters().put(new AdapterKey(aClass, TypeAwareAdapter.class.cast(adapter).getTo()), adapter);
            }
            return adapter;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        final Adapter converter = findAdapter(aClass);
        Method method = valueOfs.get(aClass);
        if (method == null && Class.class.isInstance(aClass)) { // handle primitives
            final Class cast = Class.class.cast(aClass);
            try {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        Method method = valueOfs.get(aClass);
        if (method == null && Class.class.isInstance(aClass)) { // handle primitives
            final Class cast = Class.class.cast(aClass);
            try {
                method = cast.getMethod("valueOf", String.class);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                }
                try {
                    return convertTo(Class.class.cast(cast.getField("TYPE").get(null)), text);
                } catch (final Exception e1) {
                    // no-op
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (converter == null) {
            if (ParameterizedType.class.isInstance(aClass)) {
                return convertTo(ParameterizedType.class.cast(aClass).getRawType(), text);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        if (converter == null) {
            if (ParameterizedType.class.isInstance(aClass)) {
                return convertTo(ParameterizedType.class.cast(aClass).getRawType(), text);
            }
            throw new MapperException("Missing a Converter for type " + aClass + " to convert the JSON String '" +
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/mapper/JohnzonTextDecoder.java`
#### Snippet
```java
    public void init(final EndpointConfig endpointConfig) {
        if (mapper == null) {
            mapper = Mapper.class.cast(MapperLocator.locate());
        }
        if (type != null) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/mapper/JohnzonTextDecoder.java`
#### Snippet
```java
        }

        if (ServerEndpointConfig.class.isInstance(endpointConfig)) {
            final Class<?> endpointClass = ServerEndpointConfig.class.cast(endpointConfig).getEndpointClass();
            for (final Method m : endpointClass.getMethods()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/mapper/JohnzonTextDecoder.java`
#### Snippet
```java

        if (ServerEndpointConfig.class.isInstance(endpointConfig)) {
            final Class<?> endpointClass = ServerEndpointConfig.class.cast(endpointConfig).getEndpointClass();
            for (final Method m : endpointClass.getMethods()) {
                if (Object.class == m.getDeclaringClass()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/mapper/JohnzonTextDecoder.java`
#### Snippet
```java
            }
        } else {
            type = Type.class.cast(endpointConfig.getUserProperties().get("johnzon.websocket.message.type"));
            if (type == null) {
                throw new IllegalArgumentException("didn't find johnzon.websocket.message.type");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        return List.class.isInstance(obj) && super.equals(obj);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
            return defaultValue;
        } else {
            return JsonNumber.class.cast(val).intValue();
        }
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
            return defaultValue;
        } else {
            return JsonString.class.cast(val).getString();
        }
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    @Override
    public synchronized void close() throws Exception {
        if (AutoCloseable.class.isInstance(delegate)) {
            AutoCloseable.class.cast(delegate).close();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    public synchronized void close() throws Exception {
        if (AutoCloseable.class.isInstance(delegate)) {
            AutoCloseable.class.cast(delegate).close();
        }
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLongImpl.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object obj) {
        if (JsonLongImpl.class.isInstance(obj)) {
            return JsonLongImpl.class.cast(obj).value == value;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLongImpl.java`
#### Snippet
```java
    public boolean equals(final Object obj) {
        if (JsonLongImpl.class.isInstance(obj)) {
            return JsonLongImpl.class.cast(obj).value == value;
        }
        return JsonNumber.class.isInstance(obj) && JsonNumber.class.cast(obj).bigDecimalValue().equals(bigDecimalValue());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLongImpl.java`
#### Snippet
```java
            return JsonLongImpl.class.cast(obj).value == value;
        }
        return JsonNumber.class.isInstance(obj) && JsonNumber.class.cast(obj).bigDecimalValue().equals(bigDecimalValue());
    }
}
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLongImpl.java`
#### Snippet
```java
            return JsonLongImpl.class.cast(obj).value == value;
        }
        return JsonNumber.class.isInstance(obj) && JsonNumber.class.cast(obj).bigDecimalValue().equals(bigDecimalValue());
    }
}
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLocationImpl.java`
#### Snippet
```java
        }

        final JsonLocationImpl that = JsonLocationImpl.class.cast(o);
        return columnNumber == that.columnNumber && lineNumber == that.lineNumber && streamOffset == that.streamOffset;

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
                        throw new UnsupportedOperationException("use readValue()");
                    default:
                        return JsonStructure.class.cast(readValue());
                }
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        final Adapter adapter = config.findAdapter(object.getClass());
        if (adapter != null && TypeAwareAdapter.class.isInstance(adapter) && TypeAwareAdapter.class.cast(adapter).getTo() == JsonString.class) {
            writeObject(adapter.from(object), stream);
            return;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        final Adapter adapter = config.findAdapter(object.getClass());
        if (adapter != null && TypeAwareAdapter.class.isInstance(adapter) && TypeAwareAdapter.class.cast(adapter).getTo() == JsonString.class) {
            writeObject(adapter.from(object), stream);
            return;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        try (final JsonGenerator generator = generatorFactory.createGenerator(stream(stream))) {
            final Object converted = adapter == null ? object : adapter.from(object);
            if (CharSequence.class.isInstance(converted)) {
                writeObjectWithGenerator(provider.createValue(converted.toString()), generator);
            } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return JsonValue.NULL;
        }
        if (JsonStructure.class.isInstance(object)) {
            return JsonStructure.class.cast(object);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (JsonStructure.class.isInstance(object)) {
            return JsonStructure.class.cast(object);
        }
        if (Boolean.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return JsonStructure.class.cast(object);
        }
        if (Boolean.class.isInstance(object)) {
            return Boolean.class.cast(object) ? JsonValue.TRUE : JsonValue.FALSE;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (Boolean.class.isInstance(object)) {
            return Boolean.class.cast(object) ? JsonValue.TRUE : JsonValue.FALSE;
        }
        if (String.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return Boolean.class.cast(object) ? JsonValue.TRUE : JsonValue.FALSE;
        }
        if (String.class.isInstance(object)) {
            return provider.createValue(String.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (String.class.isInstance(object)) {
            return provider.createValue(String.class.cast(object));
        }
        if (Double.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return provider.createValue(String.class.cast(object));
        }
        if (Double.class.isInstance(object)) {
            return provider.createValue(Double.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (Double.class.isInstance(object)) {
            return provider.createValue(Double.class.cast(object));
        }
        if (Float.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return provider.createValue(Double.class.cast(object));
        }
        if (Float.class.isInstance(object)) {
            return provider.createValue(Float.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (Float.class.isInstance(object)) {
            return provider.createValue(Float.class.cast(object));
        }
        if (Long.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return provider.createValue(Float.class.cast(object));
        }
        if (Long.class.isInstance(object)) {
            return provider.createValue(Long.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (Long.class.isInstance(object)) {
            return provider.createValue(Long.class.cast(object));
        }
        if (Integer.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return provider.createValue(Long.class.cast(object));
        }
        if (Integer.class.isInstance(object)) {
            return provider.createValue(Integer.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (Integer.class.isInstance(object)) {
            return provider.createValue(Integer.class.cast(object));
        }
        if (BigDecimal.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return provider.createValue(Integer.class.cast(object));
        }
        if (BigDecimal.class.isInstance(object)) {
            return provider.createValue(BigDecimal.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (BigDecimal.class.isInstance(object)) {
            return provider.createValue(BigDecimal.class.cast(object));
        }
        if (BigInteger.class.isInstance(object)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
            return provider.createValue(BigDecimal.class.cast(object));
        }
        if (BigInteger.class.isInstance(object)) {
            return provider.createValue(BigInteger.class.cast(object));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mapper.java`
#### Snippet
```java
        }
        if (BigInteger.class.isInstance(object)) {
            return provider.createValue(BigInteger.class.cast(object));
        }
        final JsonObjectGenerator objectGenerator = new JsonObjectGenerator(builderFactory);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
            throw new IllegalStateException("getBigDecimal is for numbers");
        }
        return JsonNumber.class.cast(currentValue).bigDecimalValue();
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
    @Override
    public boolean isFitLong() {
        return JsonLongImpl.class.isInstance(currentValue);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
            throw new IllegalStateException("isIntegralNumber is for numbers");
        }
        return JsonNumber.class.cast(currentValue).isIntegral();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
            throw new IllegalStateException("getLong is for numbers");
        }
        return JsonNumber.class.cast(currentValue).longValue();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
            throw new IllegalStateException("String is for numbers and strings");
        }
        return JsonString.class.cast(currentValue).getString();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
            throw new IllegalStateException("getInt is for numbers");
        }
        return JsonNumber.class.cast(currentValue).intValue();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Records.java`
#### Snippet
```java
    public static boolean isRecord(final Class<?> clazz) {
        try {
            return IS_RECORD != null && Boolean.class.cast(IS_RECORD.invoke(clazz));
        } catch (final InvocationTargetException | IllegalAccessException e) {
            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/MinItemsValidation.java`
#### Snippet
```java
        return Optional.ofNullable(model.getSchema().get("minItems"))
                .filter(it -> it.getValueType() == JsonValue.ValueType.NUMBER)
                .map(it -> JsonNumber.class.cast(it).intValue())
                .filter(it -> it >= 0)
                .map(max -> new Impl(model.toPointer(), model.getValueProvider(), max));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            generator.writeNull();
        } else if (!writePrimitives(o)) {
            if (Collection.class.isInstance(o)) {
                doWriteIterable(Collection.class.cast(o), ignoredProperties, jsonPointer);
            } else if (o.getClass().isArray()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        } else if (!writePrimitives(o)) {
            if (Collection.class.isInstance(o)) {
                doWriteIterable(Collection.class.cast(o), ignoredProperties, jsonPointer);
            } else if (o.getClass().isArray()) {
                final int length = ArrayUtil.getArrayLength(o);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            int i = 0;
            for (final T t : object) {
                if (JsonValue.class.isInstance(t)) {
                    generator.write(JsonValue.class.cast(t));
                } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            for (final T t : object) {
                if (JsonValue.class.isInstance(t)) {
                    generator.write(JsonValue.class.cast(t));
                } else {
                    if (t == null) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (JsonValue.class.isAssignableFrom(type)) {
            generator.write(key, JsonValue.class.cast(value));
            handled = true;
        } else if (type == long.class || type == Long.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == long.class || type == Long.class) {
            final long longValue = Long.class.cast(value).longValue();
            if (isInJsRange(longValue)) {
                generator.write(key, longValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (isInt(type)) {
            generator.write(key, Number.class.cast(value).intValue());
            handled = true;
        } else if (isFloat(type)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        } else if (isFloat(type)) {
            if (type == Float.class || type == float.class) {
                if (!Float.isNaN(Float.class.cast(value))) {
                    generator.write(key, new BigDecimal(value.toString()));
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                }
            } else {
                final double doubleValue = Number.class.cast(value).doubleValue();
                if (!Double.isNaN(doubleValue)) {
                    generator.write(key, doubleValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == boolean.class || type == Boolean.class) {
            generator.write(key, Boolean.class.cast(value));
            handled = true;
        } else if (type == BigDecimal.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == BigDecimal.class) {
            generator.write(key, BigDecimal.class.cast(value));
            handled = true;
        } else if (type == BigInteger.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == BigInteger.class) {
            generator.write(key, BigInteger.class.cast(value));
            handled = true;
        } else if (type == char.class || type == Character.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == char.class || type == Character.class) {
            generator.write(key, Character.class.cast(value).toString());
            handled = true;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        } else if ((!dynamic && collection) || (dynamic && Iterable.class.isAssignableFrom(type))) {
            writeIterator(itemConverter, key, objectConverter, ignoredProperties, jsonPointer, generator,
                    Iterable.class.cast(value).iterator(), value);
        } else if ((!dynamic && map) || (dynamic && Map.class.isAssignableFrom(type))) {
            generator.writeStartObject(key);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        } else if (BaseStream.class.isAssignableFrom(type)) {
            writeIterator(itemConverter, key, objectConverter, ignoredProperties, jsonPointer, generator,
                    BaseStream.class.cast(value).iterator(), value);
        } else if (Iterator.class.isAssignableFrom(type)) {
            if (objectConverter != null) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            } else {
                writeIterator(itemConverter, key, objectConverter, ignoredProperties, jsonPointer, generator,
                        Iterator.class.cast(value), value);
            }
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (JsonValue.class.isAssignableFrom(type)) {
            generator.write(JsonValue.class.cast(value));
            handled = true;
        } else if (type == long.class || type == Long.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == long.class || type == Long.class) {
            final long longValue = Long.class.cast(value).longValue();
            if (isInJsRange(longValue)) {
                generator.write(longValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (isInt(type)) {
            generator.write(Number.class.cast(value).intValue());
            handled = true;
        } else if (isFloat(type)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        } else if (isFloat(type)) {
            if (type == Float.class || type == float.class) {
                if (!Float.isNaN(Float.class.cast(value))) {
                    generator.write(new BigDecimal(value.toString()));
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                }
            } else {
                final double doubleValue = Number.class.cast(value).doubleValue();
                if (!Double.isNaN(doubleValue)) {
                    generator.write(doubleValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == boolean.class || type == Boolean.class) {
            generator.write(Boolean.class.cast(value));
            return true;
        } else if (type == BigDecimal.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            return true;
        } else if (type == BigDecimal.class) {
            generator.write(BigDecimal.class.cast(value));
            handled = true;
        } else if (type == BigInteger.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == BigInteger.class) {
            generator.write(BigInteger.class.cast(value));
            handled = true;
        } else if (type == char.class || type == Character.class) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == char.class || type == Character.class) {
            generator.write(Character.class.cast(value).toString());
            handled = true;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java

            final Object value = getter.reader.read(object);
            if (JsonValue.class.isInstance(value)) {
                generator.write(getterEntry.getKey(), JsonValue.class.cast(value));
                continue;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            final Object value = getter.reader.read(object);
            if (JsonValue.class.isInstance(value)) {
                generator.write(getterEntry.getKey(), JsonValue.class.cast(value));
                continue;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        // sorting is up to the user for this part (TreeMap if desired)
        if (classMapping.anyGetter != null) {
            final Map<String, Object> any = Map.class.cast(classMapping.anyGetter.reader.read(object));
            if (any != null) {
                writeMapBody(any, null);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                               final Object originalValue) {
        if (objectConverter != null && objectConverter.isGlobal()) {
            final List<Object> list = List.class.isInstance(originalValue) ?
                    List.class.cast(originalValue) :
                    StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.IMMUTABLE), false)
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
        if (objectConverter != null && objectConverter.isGlobal()) {
            final List<Object> list = List.class.isInstance(originalValue) ?
                    List.class.cast(originalValue) :
                    StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.IMMUTABLE), false)
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            return this;
        } else if (object instanceof JsonValue) {
            generator.write(key, JsonValue.class.cast(object));
        } else {
            final Class<?> objectClass = object.getClass();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            final Class<?> objectClass = object.getClass();
            try {
                if (Map.class.isInstance(object)) {
                    writeValue(Map.class, false, false, false, false, true, null, key, object,
                            null, emptyList(), isDedup() ? JsonPointerTracker.ROOT : null, generator);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                    writeValue(Map.class, false, false, true, false, false, null, key, object,
                            null, emptyList(), isDedup() ? JsonPointerTracker.ROOT : null, generator);
                } else if (Iterable.class.isInstance(object)) {
                    writeValue(Map.class, false, false, false, true, false, null, key, object,
                            null, emptyList(), isDedup() ? JsonPointerTracker.ROOT : null, generator);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isOptional(final Type type) {
        return ParameterizedType.class.isInstance(type) && Optional.class == ParameterizedType.class.cast(type).getRawType();
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isOptional(final Type type) {
        return ParameterizedType.class.isInstance(type) && Optional.class == ParameterizedType.class.cast(type).getRawType();
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

            final Reader finalReader;
            if (FieldAndMethodAccessMode.CompositeDecoratedType.class.isInstance(initialReader)) { // unwrap to use the right reader
                final FieldAndMethodAccessMode.CompositeDecoratedType decoratedType = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(initialReader);
                final DecoratedType type2 = decoratedType.getType2();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            final Reader finalReader;
            if (FieldAndMethodAccessMode.CompositeDecoratedType.class.isInstance(initialReader)) { // unwrap to use the right reader
                final FieldAndMethodAccessMode.CompositeDecoratedType decoratedType = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(initialReader);
                final DecoratedType type2 = decoratedType.getType2();
                if (MethodAccessMode.MethodReader.class.isInstance(type2)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                final FieldAndMethodAccessMode.CompositeDecoratedType decoratedType = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(initialReader);
                final DecoratedType type2 = decoratedType.getType2();
                if (MethodAccessMode.MethodReader.class.isInstance(type2)) {
                    finalReader = Reader.class.cast(type2);
                } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                final DecoratedType type2 = decoratedType.getType2();
                if (MethodAccessMode.MethodReader.class.isInstance(type2)) {
                    finalReader = Reader.class.cast(type2);
                } else {
                    finalReader = initialReader;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            final Type readerType = finalReader.getType();
            if (isOptional(readerType)) {
                type = ParameterizedType.class.cast(readerType).getActualTypeArguments()[0];
                reader = i -> ofNullable(finalReader.read(i)).map(o -> Optional.class.cast(o).orElse(null)).orElse(null);
            } else if (OptionalInt.class == readerType) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            if (isOptional(readerType)) {
                type = ParameterizedType.class.cast(readerType).getActualTypeArguments()[0];
                reader = i -> ofNullable(finalReader.read(i)).map(o -> Optional.class.cast(o).orElse(null)).orElse(null);
            } else if (OptionalInt.class == readerType) {
                type = Integer.class;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = Integer.class;
                reader = i -> {
                    final OptionalInt optionalInt = OptionalInt.class.cast(finalReader.read(i));
                    return optionalInt == null || !optionalInt.isPresent() ? null : optionalInt.getAsInt();
                };
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = Long.class;
                reader = i -> {
                    final OptionalLong optionalLong = OptionalLong.class.cast(finalReader.read(i));
                    return optionalLong == null || !optionalLong.isPresent() ? null : optionalLong.getAsLong();
                };
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = Double.class;
                reader = i -> {
                    final OptionalDouble optionalDouble = OptionalDouble.class.cast(finalReader.read(i));
                    return optionalDouble == null || !optionalDouble.isPresent() ? null : optionalDouble.getAsDouble();
                };
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                };
            } else if (isOptionalArray(finalReader)) {
                final Type optionalUnwrappedType = findOptionalType(GenericArrayType.class.cast(readerType).getGenericComponentType());
                type = new GenericArrayTypeImpl(optionalUnwrappedType);
                reader = i -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = new GenericArrayTypeImpl(optionalUnwrappedType);
                reader = i -> {
                    final Object[] optionals = Object[].class.cast(finalReader.read(i));
                    return optionals == null ?
                            null : Stream.of(optionals)
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isReversedAdapter(final Class<?> payloadType, final Class<?> aClass, final Adapter<?, ?> instance) {
        if (TypeAwareAdapter.class.isInstance(instance)) {
            return payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getTo()))
                    && !payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getFrom()));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    private boolean isReversedAdapter(final Class<?> payloadType, final Class<?> aClass, final Adapter<?, ?> instance) {
        if (TypeAwareAdapter.class.isInstance(instance)) {
            return payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getTo()))
                    && !payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getFrom()));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    private boolean isReversedAdapter(final Class<?> payloadType, final Class<?> aClass, final Adapter<?, ?> instance) {
        if (TypeAwareAdapter.class.isInstance(instance)) {
            return payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getTo()))
                    && !payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getFrom()));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        if (TypeAwareAdapter.class.isInstance(instance)) {
            return payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getTo()))
                    && !payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getFrom()));
        }
        final Type[] genericInterfaces = aClass.getGenericInterfaces();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        if (TypeAwareAdapter.class.isInstance(instance)) {
            return payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getTo()))
                    && !payloadType.isAssignableFrom(Class.class.cast(TypeAwareAdapter.class.cast(instance).getFrom()));
        }
        final Type[] genericInterfaces = aClass.getGenericInterfaces();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        final Type[] genericInterfaces = aClass.getGenericInterfaces();
        return Stream.of(genericInterfaces).filter(ParameterizedType.class::isInstance)
                .filter(i -> Adapter.class.isAssignableFrom(Class.class.cast(ParameterizedType.class.cast(i).getRawType())))
                .findFirst()
                .map(pt -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        final Type[] genericInterfaces = aClass.getGenericInterfaces();
        return Stream.of(genericInterfaces).filter(ParameterizedType.class::isInstance)
                .filter(i -> Adapter.class.isAssignableFrom(Class.class.cast(ParameterizedType.class.cast(i).getRawType())))
                .findFirst()
                .map(pt -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                .findFirst()
                .map(pt -> {
                    final Type argument = ParameterizedType.class.cast(pt).getActualTypeArguments()[0];
                    return Class.class.isInstance(argument) && payloadType.isAssignableFrom(Class.class.cast(argument));
                })
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                .map(pt -> {
                    final Type argument = ParameterizedType.class.cast(pt).getActualTypeArguments()[0];
                    return Class.class.isInstance(argument) && payloadType.isAssignableFrom(Class.class.cast(argument));
                })
                .orElseGet(() -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                .map(pt -> {
                    final Type argument = ParameterizedType.class.cast(pt).getActualTypeArguments()[0];
                    return Class.class.isInstance(argument) && payloadType.isAssignableFrom(Class.class.cast(argument));
                })
                .orElseGet(() -> {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                                 final Class<?> root,
                                 final boolean read) {
        if (FieldAccessMode.FieldDecoratedType.class.isInstance(t)) {
            final Field field = FieldAccessMode.FieldDecoratedType.class.cast(t).getField();
            if (DefaultPropertyVisibilityStrategy.class.isInstance(visibility)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                                 final boolean read) {
        if (FieldAccessMode.FieldDecoratedType.class.isInstance(t)) {
            final Field field = FieldAccessMode.FieldDecoratedType.class.cast(t).getField();
            if (DefaultPropertyVisibilityStrategy.class.isInstance(visibility)) {
                return !DefaultPropertyVisibilityStrategy.class.cast(visibility).isVisible(field, root, read);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        if (FieldAccessMode.FieldDecoratedType.class.isInstance(t)) {
            final Field field = FieldAccessMode.FieldDecoratedType.class.cast(t).getField();
            if (DefaultPropertyVisibilityStrategy.class.isInstance(visibility)) {
                return !DefaultPropertyVisibilityStrategy.class.cast(visibility).isVisible(field, root, read);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            final Field field = FieldAccessMode.FieldDecoratedType.class.cast(t).getField();
            if (DefaultPropertyVisibilityStrategy.class.isInstance(visibility)) {
                return !DefaultPropertyVisibilityStrategy.class.cast(visibility).isVisible(field, root, read);
            }
            return !visibility.isVisible(field);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            return !visibility.isVisible(field);
        }
        if (MethodAccessMode.MethodDecoratedType.class.isInstance(t)) {
            final Method method = MethodAccessMode.MethodDecoratedType.class.cast(t).getMethod();
            return !visibility.isVisible(method);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        }
        if (MethodAccessMode.MethodDecoratedType.class.isInstance(t)) {
            final Method method = MethodAccessMode.MethodDecoratedType.class.cast(t).getMethod();
            return !visibility.isVisible(method);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isTransient(final DecoratedType dt, final PropertyVisibilityStrategy visibility, final Class<?> root, final boolean read) {
        if (!FieldAndMethodAccessMode.CompositeDecoratedType.class.isInstance(dt)) {
            return isTransient(dt) || shouldSkip(visibility, dt, root, read);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            return isTransient(dt) || shouldSkip(visibility, dt, root, read);
        }
        final FieldAndMethodAccessMode.CompositeDecoratedType cdt = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(dt);
        return isTransient(cdt.getType1()) || isTransient(cdt.getType2()) ||
                (shouldSkip(visibility, cdt.getType1(), root, read) && shouldSkip(visibility, cdt.getType2(), root, read));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isNumberType(final Type type) {
        if (!Class.class.isInstance(type)) {
            return false;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            return false;
        }
        final Class<?> clazz = Class.class.cast(type);
        return Number.class.isAssignableFrom(clazz) || clazz.isPrimitive();
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isOptionalArray(final DecoratedType value) {
        return GenericArrayType.class.isInstance(value.getType()) &&
                isOptional(GenericArrayType.class.cast(value.getType()).getGenericComponentType());
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    private boolean isOptionalArray(final DecoratedType value) {
        return GenericArrayType.class.isInstance(value.getType()) &&
                isOptional(GenericArrayType.class.cast(value.getType()).getGenericComponentType());
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                        if (fn == null) {
                            if (value.getValueType() == JsonValue.ValueType.ARRAY) {
                                if (ParameterizedType.class.isInstance(targetType)) {
                                    final ParameterizedType parameterizedType = ParameterizedType.class.cast(targetType);
                                    final Class<?> paramType = types.findParamType(parameterizedType, Collection.class);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                            if (value.getValueType() == JsonValue.ValueType.ARRAY) {
                                if (ParameterizedType.class.isInstance(targetType)) {
                                    final ParameterizedType parameterizedType = ParameterizedType.class.cast(targetType);
                                    final Class<?> paramType = types.findParamType(parameterizedType, Collection.class);
                                    if (paramType != null && (mappedType == null /*Object*/ || mappedType.isAssignableFrom(paramType))) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    @Override
    public void clean(final Class<?> value) {
        if (Cleanable.class.isInstance(visibility)) {
            Cleanable.class.cast(visibility).clean(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    public void clean(final Class<?> value) {
        if (Cleanable.class.isInstance(visibility)) {
            Cleanable.class.cast(visibility).clean(value);
        }
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

            final Writer finalWriter;
            if (FieldAndMethodAccessMode.CompositeDecoratedType.class.isInstance(initialWriter)) { // unwrap to use the right reader
                final FieldAndMethodAccessMode.CompositeDecoratedType decoratedType = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(initialWriter);
                final DecoratedType type2 = decoratedType.getType2();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            final Writer finalWriter;
            if (FieldAndMethodAccessMode.CompositeDecoratedType.class.isInstance(initialWriter)) { // unwrap to use the right reader
                final FieldAndMethodAccessMode.CompositeDecoratedType decoratedType = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(initialWriter);
                final DecoratedType type2 = decoratedType.getType2();
                if (MethodAccessMode.MethodWriter.class.isInstance(type2)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                final FieldAndMethodAccessMode.CompositeDecoratedType decoratedType = FieldAndMethodAccessMode.CompositeDecoratedType.class.cast(initialWriter);
                final DecoratedType type2 = decoratedType.getType2();
                if (MethodAccessMode.MethodWriter.class.isInstance(type2)) {
                    finalWriter = Writer.class.cast(type2);
                } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                final DecoratedType type2 = decoratedType.getType2();
                if (MethodAccessMode.MethodWriter.class.isInstance(type2)) {
                    finalWriter = Writer.class.cast(type2);
                } else {
                    finalWriter = initialWriter;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = Integer.class;
                writer = (i, value) -> finalWriter.write(i, value == null ?
                        OptionalInt.empty() : OptionalInt.of(Number.class.cast(value).intValue()));
            } else if (OptionalLong.class == writerType) {
                type = Long.class;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = Long.class;
                writer = (i, value) -> finalWriter.write(i, value == null ?
                        OptionalLong.empty() : OptionalLong.of(Number.class.cast(value).longValue()));
            } else if (OptionalDouble.class == writerType) {
                type = Double.class;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                type = Double.class;
                writer = (i, value) -> finalWriter.write(i, value == null ?
                        OptionalDouble.empty() : OptionalDouble.of(Number.class.cast(value).doubleValue()));
            } else if (isOptionalArray(initialWriter)) {
                final Type optionalUnwrappedType = findOptionalType(GenericArrayType.class.cast(writerType).getGenericComponentType());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                        OptionalDouble.empty() : OptionalDouble.of(Number.class.cast(value).doubleValue()));
            } else if (isOptionalArray(initialWriter)) {
                final Type optionalUnwrappedType = findOptionalType(GenericArrayType.class.cast(writerType).getGenericComponentType());
                type = new GenericArrayTypeImpl(optionalUnwrappedType);
                writer = (i, value) -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                writer = (i, value) -> {
                    if (value != null) {
                        finalWriter.write(i, Stream.of(Object[].class.cast(value))
                                .map(Optional::ofNullable)
                                .toArray(Optional[]::new));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private Type findOptionalType(final Type writerType) {
        return ParameterizedType.class.cast(writerType).getActualTypeArguments()[0];
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean hasRawType(final Type type) {
        return Class.class.isInstance(type) ||
                (ParameterizedType.class.isInstance(type) &&
                        Class.class.isInstance(ParameterizedType.class.cast(type).getRawType()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    private boolean hasRawType(final Type type) {
        return Class.class.isInstance(type) ||
                (ParameterizedType.class.isInstance(type) &&
                        Class.class.isInstance(ParameterizedType.class.cast(type).getRawType()));
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        return Class.class.isInstance(type) ||
                (ParameterizedType.class.isInstance(type) &&
                        Class.class.isInstance(ParameterizedType.class.cast(type).getRawType()));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        return Class.class.isInstance(type) ||
                (ParameterizedType.class.isInstance(type) &&
                        Class.class.isInstance(ParameterizedType.class.cast(type).getRawType()));
    }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    public void close() throws IOException {
        toRelease.forEach(JohnzonAdapterFactory.Instance::release);
        if (Closeable.class.isInstance(delegate)) {
            Closeable.class.cast(delegate).close();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        toRelease.forEach(JohnzonAdapterFactory.Instance::release);
        if (Closeable.class.isInstance(delegate)) {
            Closeable.class.cast(delegate).close();
        }
        toRelease.clear();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private Class<?> getRawTargetType(final Type type) { // only intended to be used after hasRawType check
        if (Class.class.isInstance(type)) {
            return Class.class.cast(type);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    private Class<?> getRawTargetType(final Type type) { // only intended to be used after hasRawType check
        if (Class.class.isInstance(type)) {
            return Class.class.cast(type);
        }
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            return Class.class.cast(type);
        }
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> rawType = Class.class.cast(parameterizedType.getRawType());
        if (Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        }
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> rawType = Class.class.cast(parameterizedType.getRawType());
        if (Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType)) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type itemType = actualTypeArguments[actualTypeArguments.length - 1];
            if (Class.class.isInstance(itemType)) {
                return Class.class.cast(itemType);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            Type itemType = actualTypeArguments[actualTypeArguments.length - 1];
            if (Class.class.isInstance(itemType)) {
                return Class.class.cast(itemType);
            }
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java

    private boolean isDateType(final Type type) {
        if (!Class.class.isInstance(type)) {
            return false;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            return false;
        }
        final Class<?> clazz = Class.class.cast(type);
        return type.getTypeName().startsWith("java.time.") || Date.class == type || Calendar.class.isAssignableFrom(clazz);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        }
        // TODO: spec requirement, this sounds wrong since you cant customize 2 kind of serializations on the same model
        if (FieldAccessMode.FieldDecoratedType.class.isInstance(t)) {
            final Field field = FieldAccessMode.FieldDecoratedType.class.cast(t).getField();
            return Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        // TODO: spec requirement, this sounds wrong since you cant customize 2 kind of serializations on the same model
        if (FieldAccessMode.FieldDecoratedType.class.isInstance(t)) {
            final Field field = FieldAccessMode.FieldDecoratedType.class.cast(t).getField();
            return Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                if (setter.getValue().array) {
                    componentTypes.put(setter.getKey(),
                            Class.class.isInstance(setter.getValue().paramType) ?
                                    Class.class.cast(setter.getValue().paramType).getComponentType() :
                                    cast(GenericArrayType.class.cast(setter.getValue().paramType).getGenericComponentType()));
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    componentTypes.put(setter.getKey(),
                            Class.class.isInstance(setter.getValue().paramType) ?
                                    Class.class.cast(setter.getValue().paramType).getComponentType() :
                                    cast(GenericArrayType.class.cast(setter.getValue().paramType).getGenericComponentType()));
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                            Class.class.isInstance(setter.getValue().paramType) ?
                                    Class.class.cast(setter.getValue().paramType).getComponentType() :
                                    cast(GenericArrayType.class.cast(setter.getValue().paramType).getGenericComponentType()));
                }
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            return mapping;
        } finally {
            if (Cleanable.class.isInstance(accessMode)) {
                ((Cleanable<Class<?>>) accessMode).clean(clazz);
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        ClassMapping classMapping = classes.get(clazz);
        if (classMapping == null) {
            if (ParameterizedType.class.isInstance(clazz)) {
                final ParameterizedType pt = ParameterizedType.class.cast(clazz);
                final ClassMapping mapping = doFindOrCreateClassMapping(pt.getRawType(), Generics.toResolvedTypes(pt), true);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        if (classMapping == null) {
            if (ParameterizedType.class.isInstance(clazz)) {
                final ParameterizedType pt = ParameterizedType.class.cast(clazz);
                final ClassMapping mapping = doFindOrCreateClassMapping(pt.getRawType(), Generics.toResolvedTypes(pt), true);
                return putOrGetClassMapping(clazz, mapping);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                return putOrGetClassMapping(clazz, mapping);
            }
            if (!Class.class.isInstance(clazz)) {
                return null;
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                return null;
            }
            final Class asClass = Class.class.cast(clazz);
            if (Map.class.isAssignableFrom(asClass) || asClass.isInterface()) {
                final Class<?> mapping = config.getInterfaceImplementationMapping().get(clazz);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        final Type[] fieldArgTypes = aType.getActualTypeArguments();
        final Type raw = aType.getRawType();
        if (fieldArgTypes.length == 1 && Class.class.isInstance(raw)) {
            final Class<?> r = Class.class.cast(raw);
            final Class<?> collectionType;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        final Type raw = aType.getRawType();
        if (fieldArgTypes.length == 1 && Class.class.isInstance(raw)) {
            final Class<?> r = Class.class.cast(raw);
            final Class<?> collectionType;
            if (PriorityQueue.class.isAssignableFrom(r)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    if (o == null) {
                        map.put(entry.getKey(), entry.getValue());
                    } else if (Map.class.isInstance(o)) {
                        // TODO
                    } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Collection<AccessMode.Reader> all = new LinkedList<AccessMode.Reader>();
            for (final AccessMode.Reader r : delegates) {
                if (CompositeReader.class.isInstance(r)) {
                    all.addAll(asList(CompositeReader.class.cast(r).delegates));
                } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            for (final AccessMode.Reader r : delegates) {
                if (CompositeReader.class.isInstance(r)) {
                    all.addAll(asList(CompositeReader.class.cast(r).delegates));
                } else {
                    all.add(r);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    } else {
                        if (converter instanceof Converter) {
                            if (ParameterizedType.class.isInstance(readerType) && ParameterizedType.class.cast(readerType).getActualTypeArguments().length > 0) {
                                final Type[] args = ParameterizedType.class.cast(readerType).getActualTypeArguments();
                                // List<A> or Map<String, A> lead to read the last arg in all cases
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    } else {
                        if (converter instanceof Converter) {
                            if (ParameterizedType.class.isInstance(readerType) && ParameterizedType.class.cast(readerType).getActualTypeArguments().length > 0) {
                                final Type[] args = ParameterizedType.class.cast(readerType).getActualTypeArguments();
                                // List<A> or Map<String, A> lead to read the last arg in all cases
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                        if (converter instanceof Converter) {
                            if (ParameterizedType.class.isInstance(readerType) && ParameterizedType.class.cast(readerType).getActualTypeArguments().length > 0) {
                                final Type[] args = ParameterizedType.class.cast(readerType).getActualTypeArguments();
                                // List<A> or Map<String, A> lead to read the last arg in all cases
                                theItemConverter = new ConverterAdapter((Converter) converter, args[args.length - 1]);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Collection<AccessMode.Writer> all = new LinkedList<AccessMode.Writer>();
            for (final AccessMode.Writer r : writers) {
                if (CompositeWriter.class.isInstance(r)) {
                    all.addAll(asList(CompositeWriter.class.cast(r).delegates));
                } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            for (final AccessMode.Writer r : writers) {
                if (CompositeWriter.class.isInstance(r)) {
                    all.addAll(asList(CompositeWriter.class.cast(r).delegates));
                } else {
                    all.add(r);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            Map<String, Object> nested = null;
            for (final String path : paths) {
                nested = Map.class.cast(nested == null ? value : nested.get(path));
                if (nested == null) {
                    return;
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                final Object rawValue = nested.get(key);
                Object val = value == null || setterValue.converter == null ?
                        rawValue : Converter.class.cast(setterValue.converter).toString(rawValue);
                if (val == null) {
                    continue;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }

                if (setterValue.array && Collection.class.isInstance(val)) {
                    final Collection<?> collection = Collection.class.cast(val);
                    final Object[] array = (Object[]) Array.newInstance(componentTypes.get(key), collection.size());
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java

                if (setterValue.array && Collection.class.isInstance(val)) {
                    final Collection<?> collection = Collection.class.cast(val);
                    final Object[] array = (Object[]) Array.newInstance(componentTypes.get(key), collection.size());
                    val = collection.toArray(array);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            }
            final Type param = lookupType(value, resolvedTypes);
            final Class<?> returnType = Class.class.isInstance(param) ? Class.class.cast(param) : null;
            final Setter setter = new Setter(
                    value, isPrimitive(param),
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            }
            final Type param = lookupType(value, resolvedTypes);
            final Class<?> returnType = Class.class.isInstance(param) ? Class.class.cast(param) : null;
            final Setter setter = new Setter(
                    value, isPrimitive(param),
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Setter setter = new Setter(
                    value, isPrimitive(param),
                    (returnType != null && returnType.isArray()) || GenericArrayType.class.isInstance(value.getType()),
                    resolve(param, rootClass, resolvedTypes),
                    findConverter(copyDate, value), value.findObjectConverterReader(),
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java

        private Class<?> cast(final Type genericComponentType) {
            if (Class.class.isInstance(genericComponentType)) {
                return Class.class.cast(genericComponentType);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        private Class<?> cast(final Type genericComponentType) {
            if (Class.class.isInstance(genericComponentType)) {
                return Class.class.cast(genericComponentType);
            }
            if (ParameterizedType.class.isInstance(genericComponentType)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                return Class.class.cast(genericComponentType);
            }
            if (ParameterizedType.class.isInstance(genericComponentType)) {
                return cast(ParameterizedType.class.cast(genericComponentType).getRawType());
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            }
            if (ParameterizedType.class.isInstance(genericComponentType)) {
                return cast(ParameterizedType.class.cast(genericComponentType).getRawType());
            }
            throw new UnsupportedOperationException("Unsupported type: " + genericComponentType);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                throw new IllegalArgumentException(e);
            }
        } else if (ParameterizedType.class.isInstance(decoratedType.getType())) {
            final ParameterizedType type = ParameterizedType.class.cast(decoratedType.getType());
            final Type rawType = type.getRawType();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            }
        } else if (ParameterizedType.class.isInstance(decoratedType.getType())) {
            final ParameterizedType type = ParameterizedType.class.cast(decoratedType.getType());
            final Type rawType = type.getRawType();
            if (Class.class.isInstance(rawType)
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final ParameterizedType type = ParameterizedType.class.cast(decoratedType.getType());
            final Type rawType = type.getRawType();
            if (Class.class.isInstance(rawType)
                    && Collection.class.isAssignableFrom(Class.class.cast(rawType))
                    && type.getActualTypeArguments().length >= 1) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Type rawType = type.getRawType();
            if (Class.class.isInstance(rawType)
                    && Collection.class.isAssignableFrom(Class.class.cast(rawType))
                    && type.getActualTypeArguments().length >= 1) {
                typeToTest = type.getActualTypeArguments()[0];
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            } // TODO: map
        }
        if (converter == null && Class.class.isInstance(typeToTest)) {
            final Class type = Class.class.cast(typeToTest);
            ConcurrentMap<AdapterKey, Adapter<?, ?>> adapters = config.getAdapters();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        }
        if (converter == null && Class.class.isInstance(typeToTest)) {
            final Class type = Class.class.cast(typeToTest);
            ConcurrentMap<AdapterKey, Adapter<?, ?>> adapters = config.getAdapters();

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java

            if (Date.class.isAssignableFrom(type) && copyDate) {
                converter = new DateWithCopyConverter(Adapter.class.cast(adapters.get(new AdapterKey(Date.class, String.class))));
            } else {
                for (final Map.Entry<AdapterKey, Adapter<?, ?>> adapterEntry : adapters.entrySet()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    if (adapterEntry.getKey().getFrom() == type && !(
                            // ignore internal converters to let primitives be correctly handled
                            ConverterAdapter.class.isInstance(adapterEntry.getValue()) &&
                                    isBuiltInJohnzonConverter(ConverterAdapter.class.cast(adapterEntry.getValue()).getConverter()))) {

```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                            // ignore internal converters to let primitives be correctly handled
                            ConverterAdapter.class.isInstance(adapterEntry.getValue()) &&
                                    isBuiltInJohnzonConverter(ConverterAdapter.class.cast(adapterEntry.getValue()).getConverter()))) {

                        if (converter != null) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        if (readIgnore == null || readIgnore.minVersion() >= 0) {
            final Type type = lookupType(value, resolvedTypes);
            final Class<?> returnType = Class.class.isInstance(type) ? Class.class.cast(type) : null;
            final ParameterizedType pt = ParameterizedType.class.isInstance(type) ? ParameterizedType.class.cast(type) : null;
            final Getter getter = new Getter(value, returnType == Object.class, isPrimitive(returnType),
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        if (readIgnore == null || readIgnore.minVersion() >= 0) {
            final Type type = lookupType(value, resolvedTypes);
            final Class<?> returnType = Class.class.isInstance(type) ? Class.class.cast(type) : null;
            final ParameterizedType pt = ParameterizedType.class.isInstance(type) ? ParameterizedType.class.cast(type) : null;
            final Getter getter = new Getter(value, returnType == Object.class, isPrimitive(returnType),
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Type type = lookupType(value, resolvedTypes);
            final Class<?> returnType = Class.class.isInstance(type) ? Class.class.cast(type) : null;
            final ParameterizedType pt = ParameterizedType.class.isInstance(type) ? ParameterizedType.class.cast(type) : null;
            final Getter getter = new Getter(value, returnType == Object.class, isPrimitive(returnType),
                    (returnType != null && returnType.isArray()) || GenericArrayType.class.isInstance(type),
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Type type = lookupType(value, resolvedTypes);
            final Class<?> returnType = Class.class.isInstance(type) ? Class.class.cast(type) : null;
            final ParameterizedType pt = ParameterizedType.class.isInstance(type) ? ParameterizedType.class.cast(type) : null;
            final Getter getter = new Getter(value, returnType == Object.class, isPrimitive(returnType),
                    (returnType != null && returnType.isArray()) || GenericArrayType.class.isInstance(type),
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final ParameterizedType pt = ParameterizedType.class.isInstance(type) ? ParameterizedType.class.cast(type) : null;
            final Getter getter = new Getter(value, returnType == Object.class, isPrimitive(returnType),
                    (returnType != null && returnType.isArray()) || GenericArrayType.class.isInstance(type),
                    (pt != null && Collection.class.isAssignableFrom(Class.class.cast(pt.getRawType())))
                            || (returnType != null && Collection.class.isAssignableFrom(returnType)),
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            final Getter getter = new Getter(value, returnType == Object.class, isPrimitive(returnType),
                    (returnType != null && returnType.isArray()) || GenericArrayType.class.isInstance(type),
                    (pt != null && Collection.class.isAssignableFrom(Class.class.cast(pt.getRawType())))
                            || (returnType != null && Collection.class.isAssignableFrom(returnType)),
                    (pt != null && Map.class.isAssignableFrom(Class.class.cast(pt.getRawType())))
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    (pt != null && Collection.class.isAssignableFrom(Class.class.cast(pt.getRawType())))
                            || (returnType != null && Collection.class.isAssignableFrom(returnType)),
                    (pt != null && Map.class.isAssignableFrom(Class.class.cast(pt.getRawType())))
                            || (returnType != null && Map.class.isAssignableFrom(returnType)),
                    findConverter(copyDate, value), value.findObjectConverterWriter(),
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            Map<String, Object> nested = map;
            for (int i = 1; i < paths.length; i++) {
                nested = Map.class.cast(nested.get(paths[i]));
            }
            for (final Map.Entry<String, Getter> g : getters.entrySet()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    } else {
                        if (converter instanceof Converter) {
                            if (ParameterizedType.class.isInstance(writerType) && ParameterizedType.class.cast(writerType).getActualTypeArguments().length > 0) {
                                final Type[] args = ParameterizedType.class.cast(writerType).getActualTypeArguments();
                                // List<A> or Map<String, A> lead to read the last arg in all cases
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    } else {
                        if (converter instanceof Converter) {
                            if (ParameterizedType.class.isInstance(writerType) && ParameterizedType.class.cast(writerType).getActualTypeArguments().length > 0) {
                                final Type[] args = ParameterizedType.class.cast(writerType).getActualTypeArguments();
                                // List<A> or Map<String, A> lead to read the last arg in all cases
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                        if (converter instanceof Converter) {
                            if (ParameterizedType.class.isInstance(writerType) && ParameterizedType.class.cast(writerType).getActualTypeArguments().length > 0) {
                                final Type[] args = ParameterizedType.class.cast(writerType).getActualTypeArguments();
                                // List<A> or Map<String, A> lead to read the last arg in all cases
                                theItemConverter = new ConverterAdapter((Converter) converter, args[args.length - 1]);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        }
        */
        if (Class.class.isInstance(aClass)) {
            final Class<?> clazz = Class.class.cast(aClass);
            if (Enum.class.isAssignableFrom(clazz)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        */
        if (Class.class.isInstance(aClass)) {
            final Class<?> clazz = Class.class.cast(aClass);
            if (Enum.class.isAssignableFrom(clazz)) {
                final Adapter<?, ?> enumConverter = new ConverterAdapter(enumConverterFactory.apply(clazz), clazz);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        if (matched.size() == 1) {
            final Adapter<?, ?> adapter = adapters.get(matched.iterator().next());
            if (TypeAwareAdapter.class.isInstance(adapter)) {
                adapters.put(new AdapterKey(aClass, TypeAwareAdapter.class.cast(adapter).getTo()), adapter);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
            final Adapter<?, ?> adapter = adapters.get(matched.iterator().next());
            if (TypeAwareAdapter.class.isInstance(adapter)) {
                adapters.put(new AdapterKey(aClass, TypeAwareAdapter.class.cast(adapter).getTo()), adapter);
            }
            return adapter;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java

    public <T> MapperBuilder addObjectConverter(final Class<T> targetType, final MapperConverter objectConverter) {
        if (ObjectConverter.Reader.class.isInstance(objectConverter)) {
            this.objectConverterReaders.put(targetType, ObjectConverter.Reader.class.cast(objectConverter));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
    public <T> MapperBuilder addObjectConverter(final Class<T> targetType, final MapperConverter objectConverter) {
        if (ObjectConverter.Reader.class.isInstance(objectConverter)) {
            this.objectConverterReaders.put(targetType, ObjectConverter.Reader.class.cast(objectConverter));
        }
        if (ObjectConverter.Writer.class.isInstance(objectConverter)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
            this.objectConverterReaders.put(targetType, ObjectConverter.Reader.class.cast(objectConverter));
        }
        if (ObjectConverter.Writer.class.isInstance(objectConverter)) {
            this.objectConverterWriters.put(targetType, ObjectConverter.Writer.class.cast(objectConverter));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
        }
        if (ObjectConverter.Writer.class.isInstance(objectConverter)) {
            this.objectConverterWriters.put(targetType, ObjectConverter.Writer.class.cast(objectConverter));
        }
        return this;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
    public MapperBuilder addAdapter(final Adapter<?, ?> converter) {
        for (final Type gi : converter.getClass().getGenericInterfaces()) {
            if (ParameterizedType.class.isInstance(gi) && Adapter.class == ParameterizedType.class.cast(gi).getRawType()) {
                final Type[] args = ParameterizedType.class.cast(gi).getActualTypeArguments();
                adapters.put(new AdapterKey(args[0], args[1]), converter);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
    public MapperBuilder addAdapter(final Adapter<?, ?> converter) {
        for (final Type gi : converter.getClass().getGenericInterfaces()) {
            if (ParameterizedType.class.isInstance(gi) && Adapter.class == ParameterizedType.class.cast(gi).getRawType()) {
                final Type[] args = ParameterizedType.class.cast(gi).getActualTypeArguments();
                adapters.put(new AdapterKey(args[0], args[1]), converter);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
        for (final Type gi : converter.getClass().getGenericInterfaces()) {
            if (ParameterizedType.class.isInstance(gi) && Adapter.class == ParameterizedType.class.cast(gi).getRawType()) {
                final Type[] args = ParameterizedType.class.cast(gi).getActualTypeArguments();
                adapters.put(new AdapterKey(args[0], args[1]), converter);
                return this;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
        }
        if (fieldFilteringStrategy != null) {
            if (!BaseAccessMode.class.isInstance(accessMode)) {
                throw new IllegalArgumentException("fieldFilteringStrategy can't be set with this access mode: " + accessMode);
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
                throw new IllegalArgumentException("fieldFilteringStrategy can't be set with this access mode: " + accessMode);
            }
            BaseAccessMode.class.cast(accessMode).setFieldFilteringStrategy(fieldFilteringStrategy);
        }
        if (!ignoredForFields.isEmpty()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
        }
        if (!ignoredForFields.isEmpty()) {
            if (BaseAccessMode.class.isInstance(accessMode)) {
                final BaseAccessMode baseAccessMode = BaseAccessMode.class.cast(accessMode);
                final BaseAccessMode.FieldFilteringStrategy strategy = baseAccessMode.getFieldFilteringStrategy();
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
        if (!ignoredForFields.isEmpty()) {
            if (BaseAccessMode.class.isInstance(accessMode)) {
                final BaseAccessMode baseAccessMode = BaseAccessMode.class.cast(accessMode);
                final BaseAccessMode.FieldFilteringStrategy strategy = baseAccessMode.getFieldFilteringStrategy();
                if (BaseAccessMode.ConfiguredFieldFilteringStrategy.class.isInstance(strategy)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
                final BaseAccessMode baseAccessMode = BaseAccessMode.class.cast(accessMode);
                final BaseAccessMode.FieldFilteringStrategy strategy = baseAccessMode.getFieldFilteringStrategy();
                if (BaseAccessMode.ConfiguredFieldFilteringStrategy.class.isInstance(strategy)) {
                    final BaseAccessMode.ConfiguredFieldFilteringStrategy filteringStrategy =
                            BaseAccessMode.ConfiguredFieldFilteringStrategy.class.cast(strategy);
```

### RedundantClassCall
Redundant call to `cast()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
                if (BaseAccessMode.ConfiguredFieldFilteringStrategy.class.isInstance(strategy)) {
                    final BaseAccessMode.ConfiguredFieldFilteringStrategy filteringStrategy =
                            BaseAccessMode.ConfiguredFieldFilteringStrategy.class.cast(strategy);
                    for (final Map.Entry<Class<?>, String[]> ignored : ignoredForFields.entrySet()) {
                        final String[] fields = ignored.getValue();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
            }
        }
        if (!skipAccessModeWrapper && !KnownNotOpenedJavaTypesAccessMode.class.isInstance(accessMode)) {
            accessMode = new KnownNotOpenedJavaTypesAccessMode(accessMode);
        }
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                final JsonArray array = JsonArray.class.cast(value);
                final Iterator<JsonValue> ait = array.iterator();
                while (ait.hasNext()) {
                    write(ait.next());
                }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                final JsonObject object = JsonObject.class.cast(value);
                final Iterator<Map.Entry<String, JsonValue>> oit = object.entrySet().iterator();
                while (oit.hasNext()) {
                    final Map.Entry<String, JsonValue> keyval = oit.next();
                    write(keyval.getKey(), keyval.getValue());
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (97 lines)
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java

    //optimized number optimizations
    /*
        private void writeLong0(final long i) {
            if (i == Long.MIN_VALUE) {
```

### CommentedOutCode
Commented out code (3 lines)
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            isCurrentNumberIntegral = true;
        }
        //        if (currentBigDecimalNumber != null) {
        //            currentBigDecimalNumber = null;
        //        }
```

### CommentedOutCode
Commented out code (3 lines)
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            //since JOHNZON-18 not longer necessary
            //prevent "bufferoverflow
            //if(bufferPos + 1 >= availableCharsInBuffer) {
            //    return EOF;
            //}
```

## RuleId[id=Java8ListReplaceAll]
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            final List<String> indexed = new ArrayList<>(asList(orderAnnotation.value()));
            if (naming != null) { // JsonbPropertyOrder applies on java names
                for (int i = 0; i < indexed.size(); i++) {
                    indexed.set(i, naming.translateName(indexed.get(i)));
                }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `config.keySet()` may be replaced with 'entrySet()' iteration
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
            }
            
            for (String configKey : config.keySet()) {
                if(supportedConfigKeys.contains(configKey)) {
                    internalConfig.put(configKey, config.get(configKey));
```

### KeySetIterationMayUseEntrySet
Iteration over `config.keySet()` may be replaced with 'entrySet()' iteration
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonBuilderFactoryImpl.java`
#### Snippet
```java
        this.rejectDuplicateKeysMode = rejectDuplicateKeysMode;
        if (config != null && !config.isEmpty()) {
            for (String configKey : config.keySet()) {
                if(SUPPORTED_CONFIG_KEYS.contains(configKey)) {
                    internalConfig.put(configKey, config.get(configKey));
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/PropertyNamingStrategyFactory.java`
#### Snippet
```java
                    return propertyName -> camelCase.translateName(space.translateName(propertyName));
                case PropertyNamingStrategy.CASE_INSENSITIVE:
                    return propertyName -> propertyName;
                default:
                    throw new IllegalArgumentException(val + " unknown as PropertyNamingStrategy");
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `key.length() > 1 ? key.substring(1) : ""`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
            Method m = record ?
                    getMethod(key, clazz) :
                    getMethod("get" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            if (m == null && !record && (boolean.class == entry.getValue().getType() || Boolean.class == entry.getValue().getType())) {
                m = getMethod("is" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
```

### DuplicateExpressions
Multiple occurrences of `key.length() > 1 ? key.substring(1) : ""`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
                    getMethod("get" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            if (m == null && !record && (boolean.class == entry.getValue().getType() || Boolean.class == entry.getValue().getType())) {
                m = getMethod("is" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            }
            boolean skip = false;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`text.length() > 0` can be replaced with '!text.isEmpty()'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/CharacterConverter.java`
#### Snippet
```java
    @Override
    public Character fromString(final String text) {
        return text.length() > 0 ? text.charAt(0) : null;
    }
}
```

### SizeReplaceableByIsEmpty
`array.size() > 0` can be replaced with '!array.isEmpty()'
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
                             final boolean last) throws IOException {
        final JsonArray array = JsonArray.class.cast(value);
        if (array.size() > 0) { // keep it simple for now - 1 level, we can have an awesome recursive algo later if needed
            final JsonValue jsonValue = array.get(0);
            switch (jsonValue.getValueType()) {
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/util/BeanUtil.java`
#### Snippet
```java
     */
    public static String decapitalize(String name) {
        if (name == null || name.length() == 0) {
            return name;
        }
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPointerUtil.java`
#### Snippet
```java
     */
    public static String decode(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/util/BeanUtil.java`
#### Snippet
```java
     */
    public static String setterName(String fieldName) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("set");
        sb.append(Character.toUpperCase(fieldName.charAt(0))).append(fieldName.substring(1));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/util/BeanUtil.java`
#### Snippet
```java
     */
    public static String getterName(String fieldName, Class<?> type) {
        StringBuilder sb = new StringBuilder(50);
        sb.append(type == Boolean.class || type == boolean.class ? "is" : "get");
        sb.append(Character.toUpperCase(fieldName.charAt(0))).append(fieldName.substring(1));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/util/BeanUtil.java`
#### Snippet
```java
     */
    public static String capitalize(String fieldName) {
        StringBuilder sb = new StringBuilder(50);
        sb.append(Character.toUpperCase(fieldName.charAt(0))).append(fieldName.substring(1));
        return sb.toString();
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `currentState != GeneratorState.START_ARRAY & currentState != GeneratorState.AFTER_KE...`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
    private void checkArrayOrValue() {
        final GeneratorState currentState = currentState();
        if (currentState != GeneratorState.IN_ARRAY && currentState != GeneratorState.START_ARRAY &
                currentState != GeneratorState.AFTER_KEY) {
            if (currentState != GeneratorState.INITIAL) {
                throw new JsonGenerationException("write(param) is only valid in arrays");
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
        final boolean injectValues = !values.keySet().equals(new HashSet<>(values.values())); // java != json
        nested.put(
                configuration.getPackageName().replace('.', '/') + '/' + className + ".java", "" +
                        "package " + configuration.getPackageName() + ";\n" +
                        "\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                        "public enum " + className + afterEnumName(values, injectValues) + " {\n" +
                        values.entrySet().stream()
                                .map(it -> "" +
                                        (injectValues && configuration.isAddJsonbProperty() ?
                                                "    @JsonbProperty(\"" + it.getKey().replace("\"", "\\\"") + "\")\n" :
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                                .collect(joining(",\n", "", injectValues ? ";\n\n" : "\n")) +
                        (injectValues ?
                                "" +
                                        "    private String value;\n" +
                                        "\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                                        "        return value;\n" +
                                        "    }\n" +
                                        "" :
                                "") +
                        beforeEnumEnd() +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
            imports.add(Objects.class.getName());
        }
        final String content = "" +
                "package " + configuration.getPackageName() + ";\n" +
                "\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                "public class " + configuration.getClassName() + afterClassName() + " {\n" +
                (attributes.isEmpty() ?
                        ("" +
                                "    @Override\n" +
                                "    public int hashCode() {\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                                "    }\n") :
                        (attributes.stream()
                                .map(a -> "" +
                                        (configuration.isAddJsonbProperty() && !Objects.equals(a.javaName, a.jsonName) ?
                                                "    @JsonbProperty(\"" + a.jsonName.replace("\"", "\\\"") + "\")\n" :
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                                        .map(a -> {
                                            final String marker = Character.toUpperCase(a.javaName.charAt(0)) + a.javaName.substring(1);
                                            return "" +
                                                    "    public " + a.type + " get" + Character.toUpperCase(a.javaName.charAt(0)) + a.javaName.substring(1) + "() {\n" +
                                                    "        return " + a.javaName + ";\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
                                                    (configuration.isFluentSetters() ? "        return this;\n" : "") +
                                                    "    }\n" +
                                                    "";
                                        })
                                        .collect(joining("\n", "", "\n")) +
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `JohnzonListType` has no concrete subclass
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonListType.java`
#### Snippet
```java
import java.util.List;

public abstract class JohnzonListType<A> extends JohnzonCollectionType<List<A>> {
}

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonProviderImpl.java`
#### Snippet
```java
        private volatile T computed;

        private Cached(final Supplier<T> delegate) {
            this.delegate = delegate;
        }
```

### BoundedWildcard
Can generalize to `? super CharSequence`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/PatternValidation.java`
#### Snippet
```java

        private Impl(final String pointer, final Function<JsonValue, JsonValue> valueProvider,
                     final Predicate<CharSequence> matcher) {
            super(pointer, valueProvider, JsonValue.ValueType.STRING);
            this.matcher = matcher;
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/PatternValidation.java`
#### Snippet
```java
    private final Function<String, Predicate<CharSequence>> predicateFactory;

    public PatternValidation(final Function<String, Predicate<CharSequence>> predicateFactory) {
        this.predicateFactory = predicateFactory;
    }
```

### BoundedWildcard
Can generalize to `? extends Predicate`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/PatternValidation.java`
#### Snippet
```java
    private final Function<String, Predicate<CharSequence>> predicateFactory;

    public PatternValidation(final Function<String, Predicate<CharSequence>> predicateFactory) {
        this.predicateFactory = predicateFactory;
    }
```

### BoundedWildcard
Can generalize to `? extends Package`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/Meta.java`
#### Snippet
```java
    private static <T extends Annotation> T getIndirectAnnotation(final Class<T> api,
                                                                  final Supplier<Class<?>> ownerSupplier,
                                                                  final Supplier<Package> packageSupplier) {
        final T ownerAnnotation = ownerSupplier.get().getAnnotation(api);
        if (ownerAnnotation != null) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Generics.java`
#### Snippet
```java
    // for now the level is hardcoded to 2 with generic > concrete
    private static Type resolveTypeVariable(final Type value, final Type rootClass,
                                            final Map<Type, Type> resolved) {
        final Type alreadyResolved = resolved.get(value);
        if (alreadyResolved != null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/DelegateProvider.java`
#### Snippet
```java
    private final MessageBodyWriter<T> writer;

    protected DelegateProvider(final MessageBodyReader<T> reader, final MessageBodyWriter<T> writer) {
        this.reader = shouldThrowNoContentExceptionOnEmptyStreams() && isJaxRs2() ?
                new NoContentExceptionHandlerReader<>(reader) : reader;
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
    protected final Map<String, Object> internalConfig = new HashMap<String, Object>();
    
    protected AbstractJsonFactory(final Map<String, ?> config, Collection<String> supportedConfigKeys,
                                  final Collection<String> defaultSupportedConfigKeys) {
        if(config != null && !config.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/lazy/LazySupplier.java`
#### Snippet
```java
    private volatile T instance;

    public LazySupplier(final Supplier<T> provider) {
        this.delegate = provider;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
                                    final String jsonField, final String field,
                                    final String type, final String prefix, final int arrayLevel,
                                    final Collection<String> imports, final boolean last) throws IOException {
        final String actualType = buildArrayType(arrayLevel, type);
        final String actualField = buildValidFieldName(jsonField);
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java

    private void handleArray(final Writer writer, final String prefix,
                             final Map<String, JsonObject> nestedTypes,
                             final JsonValue value,
                             final String jsonField, final String fieldName,
```

### BoundedWildcard
Can generalize to `? super JsonObject`
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java

    private void handleArray(final Writer writer, final String prefix,
                             final Map<String, JsonObject> nestedTypes,
                             final JsonValue value,
                             final String jsonField, final String fieldName,
```

### BoundedWildcard
Can generalize to `? extends JsonSchemaValidator`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/ItemsValidation.java`
#### Snippet
```java
        private ItemsValidator(final String pointer,
                               final Function<JsonValue, JsonValue> extractor,
                               final Collection<JsonSchemaValidator> objectValidators) {
            super(pointer, extractor, JsonValue.ValueType.ARRAY);
            this.objectValidators = objectValidators;
```

### BoundedWildcard
Can generalize to `? super Character`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/PropertyNamingStrategyFactory.java`
#### Snippet
```java
        private final char separator;

        public ConfigurableNamingStrategy(final Function<Character, Character> wordConverter, final char sep) {
            this.converter = wordConverter;
            this.separator = sep;
```

### BoundedWildcard
Can generalize to `? super JsonValue`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidatorFactory.java`
#### Snippet
```java
    private Function<JsonValue, Stream<ValidationResult.ValidationError>> buildPatternPropertiesValidations(final String[] path,
                                                                                                     final JsonObject schema,
                                                                                                     final Function<JsonValue, JsonValue> valueProvider) {
        return ofNullable(schema.get("patternProperties"))
                .filter(it -> it.getValueType() == JsonValue.ValueType.OBJECT)
```

### BoundedWildcard
Can generalize to `? super JsonValue`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidatorFactory.java`
#### Snippet
```java
        private final String key;

        private ChainedValueAccessor(final Function<JsonValue, JsonValue> valueProvider, final String key) {
            this.parent = valueProvider;
            this.key = key;
```

### BoundedWildcard
Can generalize to `? extends JsonValue`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidatorFactory.java`
#### Snippet
```java
        private final String key;

        private ChainedValueAccessor(final Function<JsonValue, JsonValue> valueProvider, final String key) {
            this.parent = valueProvider;
            this.key = key;
```

### BoundedWildcard
Can generalize to `? super ZonedDateTime`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
    }

    private <T extends Calendar> T fromCalendar(final String text, final Function<ZonedDateTime, T> calendarSupplier) {
        switch (text.length()) {
            case 10: {
```

### BoundedWildcard
Can generalize to `? super NumberFormat`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/converter/JsonbNumberConverter.java`
#### Snippet
```java
    }

    private <T> T execute(final Function<NumberFormat, T> function) {
        NumberFormat format = pool.poll();
        if (format == null) {
```

### BoundedWildcard
Can generalize to `? extends JsonParserFactory`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonValueParserAdapter.java`
#### Snippet
```java

    private static JsonParser doCreate(final JsonValue jsonValue,
                                       final Supplier<JsonParserFactory> parserFactoryProvider) {
        switch (jsonValue.getValueType()) {
            case OBJECT: return parserFactoryProvider.get().createParser(jsonValue.asJsonObject());
```

### BoundedWildcard
Can generalize to `? extends ServletContextListener`
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/servlet/IgnoreIfMissing.java`
#### Snippet
```java
    private boolean skipped;

    public IgnoreIfMissing(final Supplier<ServletContextListener> delegate) {
        this.delegate = delegate;
    }
```

### BoundedWildcard
Can generalize to `? super JsonValue`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
    }

    private JsonValue comparison(final BiPredicate<JsonValue, JsonValue> comparator,
                                 final JsonValue config, final JohnzonJsonLogic self,
                                 final JsonValue params) {
```

### BoundedWildcard
Can generalize to `? super JsonValue`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
    }

    private JsonValue comparison(final BiPredicate<JsonValue, JsonValue> comparator,
                                 final JsonValue config, final JohnzonJsonLogic self,
                                 final JsonValue params) {
```

### BoundedWildcard
Can generalize to `? super Double`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
    }

    private JsonValue numericComparison(final BiPredicate<Double, Double> comparator,
                                        final JsonValue config, final JohnzonJsonLogic self,
                                        final JsonValue params) {
```

### BoundedWildcard
Can generalize to `? super Double`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java
    }

    private JsonValue numericComparison(final BiPredicate<Double, Double> comparator,
                                        final JsonValue config, final JohnzonJsonLogic self,
                                        final JsonValue params) {
```

### BoundedWildcard
Can generalize to `? super JsonValue`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java

    private JsonValue arrayTest(final JohnzonJsonLogic self, final JsonValue config, final JsonValue params,
                                final BiPredicate<JsonValue, Stream<JsonValue>> tester) {
        if (config.getValueType() == JsonValue.ValueType.ARRAY) {
            final JsonArray array = config.asJsonArray();
```

### BoundedWildcard
Can generalize to `? super Stream`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/JohnzonJsonLogic.java`
#### Snippet
```java

    private JsonValue arrayTest(final JohnzonJsonLogic self, final JsonValue config, final JsonValue params,
                                final BiPredicate<JsonValue, Stream<JsonValue>> tester) {
        if (config.getValueType() == JsonValue.ValueType.ARRAY) {
            final JsonArray array = config.asJsonArray();
```

### BoundedWildcard
Can generalize to `? super JsonValue`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidator.java`
#### Snippet
```java
    private final Function<JsonValue, Stream<ValidationResult.ValidationError>> validationFunction;

    JsonSchemaValidator(final Function<JsonValue, Stream<ValidationResult.ValidationError>> validationFunction) {
        this.validationFunction = validationFunction;
    }
```

### BoundedWildcard
Can generalize to `? extends Stream`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/JsonSchemaValidator.java`
#### Snippet
```java
    private final Function<JsonValue, Stream<ValidationResult.ValidationError>> validationFunction;

    JsonSchemaValidator(final Function<JsonValue, Stream<ValidationResult.ValidationError>> validationFunction) {
        this.validationFunction = validationFunction;
    }
```

### BoundedWildcard
Can generalize to `? super Exception`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                           final Adapter itemConverter, final Type type, final ObjectConverter.Reader objectConverter,
                           final JsonPointerTracker jsonPointer, final Type rootType,
                           final Function<Exception, RuntimeException> onException) {

        if (objectConverter != null) {
```

### BoundedWildcard
Can generalize to `? extends RuntimeException`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                           final Adapter itemConverter, final Type type, final ObjectConverter.Reader objectConverter,
                           final JsonPointerTracker jsonPointer, final Type rootType,
                           final Function<Exception, RuntimeException> onException) {

        if (objectConverter != null) {
```

### BoundedWildcard
Can generalize to `? extends JsonValue`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
    private int size = -1;

    JsonArrayImpl(final List<JsonValue> backingList, final BufferStrategy.BufferProvider<char[]> provider) {
        this.unmodifieableBackingList = backingList;
        this.provider = provider;
```

### BoundedWildcard
Can generalize to `? extends Jsonb`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
        private final ContextResolver<Jsonb> contextResolver;

        private DynamicInstance(final ContextResolver<Jsonb> resolver) {
            this.contextResolver = resolver;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/factory/SimpleJohnzonAdapterFactory.java`
#### Snippet
```java
public class SimpleJohnzonAdapterFactory implements JohnzonAdapterFactory {
    @Override
    public <T> Instance<T> create(Class<T> type) {
        try {
            return new ConstantInstance<>(type.newInstance());
```

### BoundedWildcard
Can generalize to `? extends Adapter`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    public JsonbAccessMode(final PropertyNamingStrategy propertyNamingStrategy, final String orderValue,
                           final PropertyVisibilityStrategy visibilityStrategy, final boolean caseSensitive,
                           final Map<AdapterKey, Adapter<?, ?>> defaultConverters, final JohnzonAdapterFactory factory,
                           final JsonProvider jsonProvider, final Supplier<JsonBuilderFactory> builderFactory,
                           final Supplier<JsonParserFactory> parserFactory,
```

### BoundedWildcard
Can generalize to `? extends JsonBuilderFactory`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                           final PropertyVisibilityStrategy visibilityStrategy, final boolean caseSensitive,
                           final Map<AdapterKey, Adapter<?, ?>> defaultConverters, final JohnzonAdapterFactory factory,
                           final JsonProvider jsonProvider, final Supplier<JsonBuilderFactory> builderFactory,
                           final Supplier<JsonParserFactory> parserFactory,
                           final AccessMode delegate,
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    }

    private void addSetterIfNeeded(final Map<String, Setter> setters,
                                   final String key,
                                   final AccessMode.Writer value,
```

### BoundedWildcard
Can generalize to `? super Setter`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    }

    private void addSetterIfNeeded(final Map<String, Setter> setters,
                                   final String key,
                                   final AccessMode.Writer value,
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    }

    private void addGetterIfNeeded(final Map<String, Getter> getters,
                                   final String key,
                                   final AccessMode.Reader value,
```

### BoundedWildcard
Can generalize to `? super Getter`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    }

    private void addGetterIfNeeded(final Map<String, Getter> getters,
                                   final String key,
                                   final AccessMode.Reader value,
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java

    // idea is quite trivial, simulate an object with a Map<String, Object>
    private void handleVirtualObject(final Collection<String> virtualFields,
                                     final JohnzonVirtualObject o,
                                     final Map<String, Getter> getters,
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    private void handleVirtualObject(final Collection<String> virtualFields,
                                     final JohnzonVirtualObject o,
                                     final Map<String, Getter> getters,
                                     final Map<String, Setter> setters,
                                     final Map<String, AccessMode.Reader> readers,
```

### BoundedWildcard
Can generalize to `? super String`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                                     final JohnzonVirtualObject o,
                                     final Map<String, Getter> getters,
                                     final Map<String, Setter> setters,
                                     final Map<String, AccessMode.Reader> readers,
                                     final Map<String, AccessMode.Writer> writers,
```

### BoundedWildcard
Can generalize to `? extends AccessMode.Reader`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                                     final Map<String, Getter> getters,
                                     final Map<String, Setter> setters,
                                     final Map<String, AccessMode.Reader> readers,
                                     final Map<String, AccessMode.Writer> writers,
                                     final boolean copyDate,
```

### BoundedWildcard
Can generalize to `? extends AccessMode.Writer`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                                     final Map<String, Setter> setters,
                                     final Map<String, AccessMode.Reader> readers,
                                     final Map<String, AccessMode.Writer> writers,
                                     final boolean copyDate,
                                     final Class<?> rootClazz) {
```

### BoundedWildcard
Can generalize to `? super Class`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
    private <T> T findObjectConverter(final Class clazz,
                                      final Map<Class<?>, T> from,
                                      final Map<Class<?>, T> cache) {
        if (clazz == null) {
            throw new IllegalArgumentException("clazz must not be null");
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-core/src/main/java/org/apache/johnzon/core/Snippet.java`
#### Snippet
```java

    // skips some methods using a buffer
    private static abstract class PassthroughWriter extends Writer {
        @Override
        public void write(final char[] cbuf) throws IOException {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
    }

    public static abstract class CompositeDecoratedType<T extends DecoratedType> implements DecoratedType {
        protected final T type1;
        protected final T type2;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
    }

    public static abstract class ConfiguredFieldFilteringStrategy implements FieldFilteringStrategy {
        private final Map<Class<?>, Collection<String>> fieldsToRemove = new LinkedHashMap<>();

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
    }

    private static abstract class DelegatingGenerator implements JsonGenerator {
        protected final JsonGenerator delegate;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
    }

    private static abstract class QueueProvider<T> implements BufferStrategy.BufferProvider<T> {
        private final int size;
        private final ConcurrentLinkedQueue<T> queue = new ConcurrentLinkedQueue<T>();
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
    }

    private static abstract class SingletonProvider<T> implements BufferStrategy.BufferProvider<T> {
        protected final T buffer;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
    }

    private static abstract class ThreadLocalProvider<T> implements BufferStrategy.BufferProvider<T> {
        private final ThreadLocalBufferCache<T> cache;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    }

    private static abstract class ExceptionMessageFactory extends BaseFactory {
        @Override
        public Type[] getParameterTypes() {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    }

    private static abstract class BaseFactory implements Factory {
        @Override
        public Type[] getParameterTypes() {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
    }

    public static abstract class MethodDecoratedType implements DecoratedType {
        protected final Method method;
        protected final Type type;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
    }

    private static abstract class Lazy<T> implements Supplier<T> {
        private final AtomicReference<T> ref = new AtomicReference<>();

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAccessMode.java`
#### Snippet
```java
    }

    public static abstract class FieldDecoratedType implements DecoratedType {
        protected final Field field;
        protected final Type type;
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/DateConverter.java`
#### Snippet
```java

    public DateConverter(final String pattern) {
        format = new ThreadLocal<DateFormat>() {
            @Override
            protected DateFormat initialValue() {
```

### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `johnzon-core/src/main/java/org/apache/johnzon/core/ThreadLocalBufferCache.java`
#### Snippet
```java

    public ThreadLocalBufferCache(final int defaultSize) {
        this.buffers = new ThreadLocal<T>() {
            @Override
            protected T initialValue() {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
        final File outputFile = new File(target, jsonToClass.replace('.', '/') + ".java");

        outputFile.getParentFile().mkdirs();
        try (final OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputFile), UTF_8.name())) {
            generate(readerFactory, source, writer, javaName);
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                return getBigDecimal().longValue();
            } else {
                return retVal.longValue();
            }
        } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                return getBigDecimal().intValue();
            } else {
                return retVal.intValue();
            }
        } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == long.class || type == Long.class) {
            final long longValue = Long.class.cast(value).longValue();
            if (isInJsRange(longValue)) {
                generator.write(key, longValue);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (type == long.class || type == Long.class) {
            final long longValue = Long.class.cast(value).longValue();
            if (isInJsRange(longValue)) {
                generator.write(longValue);
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `ClassMapping` is the same as one of its superclass' names
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbMappings.java`
#### Snippet
```java
    }

    public static class ClassMapping extends Mappings.ClassMapping {
        protected ClassMapping(final Class<?> clazz, final AccessMode.Factory factory,
                               final Map<String, Getter> getters, final Map<String, Setter> setters,
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `readFrom()` only delegates to its super method
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/JsrProvider.java`
#### Snippet
```java

    @Override
    public JsonStructure readFrom(final Class<JsonStructure> rawType, final Type genericType,
                                  final Annotation[] annotations, final MediaType mediaType,
                                  final MultivaluedMap<String, String> httpHeaders,
```

### RedundantMethodOverride
Method `release()` is identical to its super method
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java

        @Override
        public void release(final char[] value) {
            // no-op
        }
```

### RedundantMethodOverride
Method `getType()` is identical to its super method
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAccessMode.java`
#### Snippet
```java

        @Override
        public Type getType() {
            return type;
        }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java

            if (value == null) {
                if (config.isSkipNull()) {
                    continue;
                } else {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                .filter(it -> it)
                .map(it -> {
                    if (!config.getProperty(JsonbConfig.BINARY_DATA_STRATEGY).isPresent()) {
                        config.withBinaryDataStrategy(BinaryDataStrategy.BASE_64);
                    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                        config.withBinaryDataStrategy(BinaryDataStrategy.BASE_64);
                    }
                    if (!config.getProperty(JsonbConfig.DATE_FORMAT).isPresent()) {
                        config.withDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'xxx", Locale.ROOT);
                    }
```

### SimplifyOptionalCallChains
'map()' can be replaced with 'flatMap()'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            if (isOptional(readerType)) {
                type = ParameterizedType.class.cast(readerType).getActualTypeArguments()[0];
                reader = i -> ofNullable(finalReader.read(i)).map(o -> Optional.class.cast(o).orElse(null)).orElse(null);
            } else if (OptionalInt.class == readerType) {
                type = Integer.class;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                reader = i -> {
                    final OptionalInt optionalInt = OptionalInt.class.cast(finalReader.read(i));
                    return optionalInt == null || !optionalInt.isPresent() ? null : optionalInt.getAsInt();
                };
            } else if (OptionalLong.class == readerType) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                reader = i -> {
                    final OptionalLong optionalLong = OptionalLong.class.cast(finalReader.read(i));
                    return optionalLong == null || !optionalLong.isPresent() ? null : optionalLong.getAsLong();
                };
            } else if (OptionalDouble.class == readerType) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                reader = i -> {
                    final OptionalDouble optionalDouble = OptionalDouble.class.cast(finalReader.read(i));
                    return optionalDouble == null || !optionalDouble.isPresent() ? null : optionalDouble.getAsDouble();
                };
            } else if (isOptionalArray(finalReader)) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
    public Set<AdapterKey> adapterKeys() {
        return Stream.concat(
                super.keySet().stream()
                        .filter(it -> super.get(it) != NO_ADAPTER),
                Stream.of(Date.class, URI.class, URL.class, Class.class, String.class, BigDecimal.class, BigInteger.class,
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/jsonp/RewindableJsonParser.java`
#### Snippet
```java
    @Override
    public Event next() {
        return last = delegate.next();
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/JsonPointerTracker.java`
#### Snippet
```java
        }
        if (parent != null) {
            return jsonPointer = (parent != ROOT ? parent + "/" : "/") + encode(currentNode);
        }
        if (currentNode != null) {
```

### NestedAssignment
Result of assignment expression used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/JsonPointerTracker.java`
#### Snippet
```java
        }
        if (currentNode != null) {
            return jsonPointer = "/" + encode(currentNode);
        }
        return jsonPointer = "/";
```

### NestedAssignment
Result of assignment expression used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/JsonPointerTracker.java`
#### Snippet
```java
            return jsonPointer = "/" + encode(currentNode);
        }
        return jsonPointer = "/";
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
    private void writeEscaped0(final String value) {
        int len = 0;
        if (value == null || (len = value.length()) == 0) {
            return;
        }
```

### NestedAssignment
Result of assignment expression used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
    @Override
    public JsonGenerator getJsonGenerator() {
        return generator == null ? generator = new InObjectOrPrimitiveJsonGenerator(
                getRawJsonGenerator(), writeStart, keyName, writeEnd) : generator;
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java
                case START_ARRAY:
                    JsonArrayBuilder subArray = null;
                    parseArray(subArray = new JsonArrayBuilderImpl(emptyList(), bufferProvider, rejectDuplicateKeysMode));
                    builder.add(subArray);
                    break;
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        //sum up the digit values 
        int cumulatedDigitValue = 0;
        while (isAsciiDigit(y = readNextChar())) {

            if (c == ZERO) {
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            isCurrentNumberIntegral = false;
            cumulatedDigitValue = 0;
            while (isAsciiDigit(y = readNextChar())) {
                cumulatedDigitValue++;
            }
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            }

            while (isAsciiDigit(y = readNextChar())) {
                //no-op
            }
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

            if (n == QUOTE_CHAR) {
                endOfValueInBuffer = startOfValueInBuffer = bufferPos; //->"" case
                return;
            } else if (n == EOL) {
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                endOfValueInBuffer = -1;

                while ((n = readNextChar()) > '\u001F' && n != ESCAPE_CHAR && n != EOL && n != QUOTE_CHAR) {
                    //read fast
                }
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        arrayDepth++;

        return EVT_MAP[previousEvent = START_ARRAY];
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        objectDepth++;

        return EVT_MAP[previousEvent = START_OBJECT];

    }
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            }

            return EVT_MAP[previousEvent = VALUE_STRING];

        } else { //Event is  START_OBJECT  OR START_ARRAY OR COMMA_EVENT
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

            if ((currentStructureElement != null && currentStructureElement.isArray) || currentStructureElement == null) {
                return EVT_MAP[previousEvent = VALUE_STRING];
            }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            }

            return EVT_MAP[previousEvent = KEY_NAME];
        }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                    throw uexc("Expected LITERAL: true");
                }
                return EVT_MAP[previousEvent = VALUE_TRUE];
            case FALSE_F:

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                }

                return EVT_MAP[previousEvent = VALUE_FALSE];

            case NULL_N:
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                    throw uexc("Expected LITERAL: null");
                }
                return EVT_MAP[previousEvent = VALUE_NULL];

            default:
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            default:
                readNumber();
                return EVT_MAP[previousEvent = VALUE_NUMBER];
        }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        }

        startOfValueInBuffer = endOfValueInBuffer = -1;
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        arrayDepth--;

        return EVT_MAP[previousEvent = END_ARRAY];
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        }

        startOfValueInBuffer = endOfValueInBuffer = -1;

        switch (c) {
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        objectDepth--;

        return EVT_MAP[previousEvent = END_OBJECT];
    }

```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
        }

        if (index > s - 1 || !((val = get(index)) instanceof JsonNumber)) {
            return defaultValue;
        } else {
```

### NestedAssignment
Result of assignment expression used
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
        }

        if (index > s - 1 || !((val = get(index)) instanceof JsonString)) {
            return defaultValue;
        } else {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                .ifPresent(s -> builder.setSerializeValueFilter(SerializeValueFilter.class.cast(s)));

        config.getProperty(JsonbConfig.SERIALIZERS).map(JsonbSerializer[].class::cast).ifPresent(serializers -> {
            Stream.of(serializers).forEach(s -> {
                final ParameterizedType pt = types.findParameterizedType(s.getClass(), JsonbSerializer.class);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
            });
        });
        config.getProperty(JsonbConfig.DESERIALIZERS).map(JsonbDeserializer[].class::cast).ifPresent(deserializers -> {
            Stream.of(deserializers).forEach(d -> {
                final ParameterizedType pt = types.findParameterizedType(d.getClass(), JsonbDeserializer.class);
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`(currentStructureElement != null && currentStructureElement.isArray) || currentStructureElement == n...` can be simplified to 'currentStructureElement == null\|\|currentStructureElement.isArray'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            //must be a key if we are in an object, if not its a value 

            if ((currentStructureElement != null && currentStructureElement.isArray) || currentStructureElement == null) {
                return EVT_MAP[previousEvent = VALUE_STRING];
            }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `jsonSchemaExtensions` are queried, but never updated
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/JsonSchemaToPojoMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "johnzon.jsonschema.extensions", defaultValue = ".jsonschema.json")
    private List<String> jsonSchemaExtensions;

    /**
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `customized` is accessed in both synchronized and unsynchronized contexts
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    protected volatile Function<Class<?>, Jsonb> delegate = null;
    protected volatile ReadImpl readImpl = null;
    private boolean customized;
    private Boolean throwNoContentExceptionOnEmptyStreams;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `throwNoContentExceptionOnEmptyStreams` is accessed in both synchronized and unsynchronized contexts
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    protected volatile ReadImpl readImpl = null;
    private boolean customized;
    private Boolean throwNoContentExceptionOnEmptyStreams;

    @Context
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `path` is accessed in both synchronized and unsynchronized contexts
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPatchImpl.java`
#### Snippet
```java
        private final JsonProvider provider;
        private final JsonPatch.Operation operation;
        private String path;
        private String from;
        private final JsonPointer pathPointer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `from` is accessed in both synchronized and unsynchronized contexts
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPatchImpl.java`
#### Snippet
```java
        private final JsonPatch.Operation operation;
        private String path;
        private String from;
        private final JsonPointer pathPointer;
        private final JsonPointer fromPointer;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method and all its derivables are empty
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java

        @Override
        public void release(final T value) {
            // no-op
        }
```

### EmptyMethod
The method is empty
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
    }

    protected void onIgnored(final Schema schema, final Field f, final Cache cache) {
        // no-op
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonWriterImpl.java`
#### Snippet
```java
    private final JsonGenerator generator;
    private boolean called = false;
    private boolean closed = false;

    JsonWriterImpl(final JsonGenerator generator) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonWriterImpl.java`
#### Snippet
```java
class JsonWriterImpl implements JsonWriter, Serializable {
    private final JsonGenerator generator;
    private boolean called = false;
    private boolean closed = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
        private boolean addJsonbProperty = true;
        private boolean addAllArgsConstructor = true;
        private boolean fluentSetters = false;
        private Function<Ref, String> onRef;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonNumberImpl.java`
#### Snippet
```java
final class JsonNumberImpl implements JsonNumber, Serializable {
    private final BigDecimal value;
    private transient Integer hashCode = null;

    JsonNumberImpl(final BigDecimal decimal) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
    private final BufferStrategy.BufferProvider<char[]> bufferProvider;
    private final char[] buffer;
    private int bufferPos = 0;
    private final boolean prettyPrint;
    private static final String INDENT = "  ";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
    private final boolean prettyPrint;
    private static final String INDENT = "  ";
    private int depth = 0;
    private boolean closed;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStringImpl.java`
#### Snippet
```java
    private final String value;
    private String escape;
    private transient Integer hashCode = null;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/DynamicMappingGenerator.java`
#### Snippet
```java
        private final String keyIfNoObject;
        private WritingState state = WritingState.NONE; // todo: we need a stack (linkedlist) here to be accurate
        private int nested = 0;
        private boolean implicitStart;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/converter/JsonbDateConverter.java`
#### Snippet
```java
    //       -> rewrite it
    private volatile boolean hasTimezone = true;
    private volatile boolean isIso = false;

    public JsonbDateConverter(final JsonbDateFormat dateFormat) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java
    private final BufferStrategy.BufferProvider<char[]> bufferProvider;
    private final RejectDuplicateKeysMode rejectDuplicateKeysMode;
    private boolean closed = false;

    private boolean subStreamReader;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

    private int arrayDepth = 0;
    private int objectDepth = 0;

    private boolean closed;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
    //This stack here is only needed for validating the above mentioned case, if we want to be lenient we can skip suing the stack.
    //Stack can cause out of memory issues when the nesting depth of a Json stream is too deep.
    private StructureElement currentStructureElement = null;

    private int arrayDepth = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
    private StructureElement currentStructureElement = null;

    private int arrayDepth = 0;
    private int objectDepth = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

    // performance optimisation to avoid subtraction on readNextChar
    private int bufferLeft = 0;

    //available character in the buffer. It might be <= "buffer.length".
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/HStack.java`
#### Snippet
```java
public class HStack<T> implements Serializable {

    private Node<T> topElement = null;
    private int size;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/cdi/JohnzonCdiExtension.java`
#### Snippet
```java
    private final Collection<JohnzonJsonb> jsonbs = new ArrayList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private volatile boolean canWrite = false;

    public boolean isCanWrite() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
    private final BufferStrategy.BufferProvider<char[]> provider;

    private transient Integer hashCode = null;
    private final Map<String, JsonValue> unmodifieableBackingMap;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonDoubleImpl.java`
#### Snippet
```java
    private final double value;

    private Integer hashCode = null;

    JsonDoubleImpl(final double value) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
     */
    private class JsonArrayIterator implements Iterator<JsonValue> {
        private int cursor = 0;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
class JsonArrayImpl extends AbstractList<JsonValue> implements JsonArray, Serializable {
    private final BufferStrategy.BufferProvider<char[]> provider;
    private Integer hashCode = null;
    private final List<JsonValue> unmodifieableBackingList;
    private int size = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    protected final JsonbConfig config = new JsonbConfig();
    protected volatile Function<Class<?>, Jsonb> delegate = null;
    protected volatile ReadImpl readImpl = null;
    private boolean customized;
    private Boolean throwNoContentExceptionOnEmptyStreams;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    protected final Collection<String> ignores;
    protected final JsonbConfig config = new JsonbConfig();
    protected volatile Function<Class<?>, Jsonb> delegate = null;
    protected volatile ReadImpl readImpl = null;
    private boolean customized;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLongImpl.java`
#### Snippet
```java
public final class JsonLongImpl implements JsonNumber, Serializable {
    private final long value;
    private Integer hashCode = null;

    JsonLongImpl(final long value) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
    private JsonValue currentValue;
    private int arrayDepth = 0;
    private int objectDepth = 0;

    private class ArrayIterator implements Iterator<Event> {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
        private final Iterator<Map.Entry<String, JsonValue>> oentries;
        private JsonValue jsonValue;
        private Boolean end = null;

        public ObjectIterator(final JsonObject jo) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java
    private Event currentEvent;
    private JsonValue currentValue;
    private int arrayDepth = 0;
    private int objectDepth = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonInMemoryParser.java`
#### Snippet
```java

        private final Iterator<JsonValue> aentries;
        private Boolean end = null;

        public ArrayIterator(final JsonArray ja) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParserImpl.java`
#### Snippet
```java
    protected abstract BufferStrategy.BufferProvider<char[]> getCharArrayProvider();

    private boolean manualNext = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
    private SerializeValueFilter serializeValueFilter;
    private boolean useBigDecimalForFloats;
    private Boolean deduplicateObjects = null;
    private boolean useJsRange;
    private boolean useBigDecimalForObjectNumbers;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
    private String bufferStrategy;
    private boolean autoAdjustStringBuffers;
    private Comparator<String> attributeOrder = null;
    private boolean supportConstructors;
    private boolean useGetterForCollections;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java
    private Map<Class<?>, String[]> ignoredForFields = new HashMap<Class<?>, String[]>();
    private Map<Class<?>, Class<?>> interfaceImplementationMapping = new HashMap<>();
    private BaseAccessMode.FieldFilteringStrategy fieldFilteringStrategy = null;
    private boolean primitiveConverters;
    private boolean failOnUnknownProperties;
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
import java.util.stream.Stream;

public class JohnzonJsonb implements Jsonb, AutoCloseable, JsonbExtension {
    private final Mapper delegate;
    private final boolean ijson;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    convertTo(converter, jsonValue, jsonPointer, type);
        } catch (final Exception e) {
            if (e instanceof MapperException) {
                throw e;
            }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-28-10-36-06.092.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `NothingToRead` does not end with 'Exception'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java
    }

    public static class NothingToRead extends IllegalStateException {
        public NothingToRead() {
            super("Nothing to read");
```

## RuleId[id=StringRepeatCanBeUsed]
### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java

        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arrayLevel; i++) {
            builder.append("List<");
        }
```

### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java
        }
        builder.append(type);
        for (int i = 0; i < arrayLevel; i++) {
            builder.append(">");
        }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?>[] getParameterItemConverter() {
            return new Adapter[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public String[] getParameterNames() {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?>[] getParameterConverter() {
            return new Adapter[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Codec<?>[] getObjectConverter() {
            return new ObjectConverter.Codec[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public Type[] getParameterTypes() {
            return new Type[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-core/src/main/java/org/apache/johnzon/core/RFC4627AwareInputStreamReader.java`
#### Snippet
```java
        final int first = inputStream.read();
        if(first == -1) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java

    public MapperBuilder setIgnoreFieldsForType(final Class<?> type, final String... fields) {
        ignoredForFields.put(type, fields == null ? new String[0] : fields);
        return this;
    }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
        private void ensureInit() {
            if (classMapping == null) {
                synchronized (this) {
                    if (classMapping == null) {
                        classMapping = new ConcurrentHashMap<>();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
        private void ensureInit() {
            if (idMapping == null) {
                synchronized (this) {
                    if (idMapping == null) {
                        idMapping = new ConcurrentHashMap<>();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
            ensureInit();
            if (classMapping == null || classMapping.isEmpty()) {
                synchronized (this) {
                    if (classMapping == null || classMapping.isEmpty()) {
                        loadMapping(rtType);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonProviderImpl.java`
#### Snippet
```java
        public T get() {
            if (computed == null) {
                synchronized (this) {
                    if (computed == null) {
                        computed = delegate.get();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/lazy/LazySupplier.java`
#### Snippet
```java
    public T get() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = delegate.get();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorFactoryImpl.java`
#### Snippet
```java
        }

        synchronized (this) {
            customBuffer = new Buffer(getBufferProvider().newCharProvider(bufferSize), bufferSize);
            return customBuffer.provider;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/cdi/JohnzonCdiExtension.java`
#### Snippet
```java

    public void untrack(final JohnzonJsonb jsonb) {
        synchronized (this) {
            lock.lock();
            try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    protected Jsonb getJsonb(final Class<?> type) {
        if (delegate == null){
            synchronized (this) {
                if (delegate == null) {
                    if (throwNoContentExceptionOnEmptyStreams == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPatchImpl.java`
#### Snippet
```java
        JsonObject toJson() {
            if (json == null) {
                synchronized (this) {
                    if (json == null) {
                        JsonObjectBuilder builder = provider.createObjectBuilder()
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPatchImpl.java`
#### Snippet
```java
        }
        if (json == null) {
            synchronized (this) {
                if (json == null) {
                    final JsonArrayBuilder builder = provider.createArrayBuilder();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPatchImpl.java`
#### Snippet
```java
        public String toString() {
            if (str == null) {
                synchronized (this) {
                    if (str == null) {
                        str = "{op: " + operation + ", path: " +
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPatchImpl.java`
#### Snippet
```java
        public int hashCode() {
            if (hash == null) {
                synchronized (this) {
                    if (hash == null) {
                        int result = operation.hashCode();
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/cdi/RegisterCdiExtension.java`
#### Snippet
```java
    @SuppressWarnings("serial")
    private static Map<String, Object> getCdiExtensionProperties() {
        return new HashMap<String, Object>() {{
            put(CDIConstants.CDI_EXTENSION_PROPERTY, "JavaJSONB");
            put("aries.cdi.extension.mode", "implicit");
```

### DoubleBraceInitialization
Double brace initialization
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/Activator.java`
#### Snippet
```java
        Enumeration<String> keys = properties.keys();

        return new HashMap<String, Object>() {{
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
```

### DoubleBraceInitialization
Double brace initialization
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java

    public void setOtherProperties(final String others) {
        final Properties properties = new Properties() {{
            try {
                load(new StringReader(others));
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/AccessMode.java`
#### Snippet
```java

    default Factory findFactory(final Class<?> clazz) {
        return findFactory(clazz, null);
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `len` initializer `0` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java

    private void writeEscaped0(final String value) {
        int len = 0;
        if (value == null || (len = value.length()) == 0) {
            return;
```

### UnusedAssignment
Variable `subArray` initializer `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonReaderImpl.java`
#### Snippet
```java

                case START_ARRAY:
                    JsonArrayBuilder subArray = null;
                    parseArray(subArray = new JsonArrayBuilderImpl(emptyList(), bufferProvider, rejectDuplicateKeysMode));
                    builder.add(subArray);
```

### UnusedAssignment
Variable `y` initializer `EOF` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        endOfValueInBuffer = -1;

        char y = EOF;

        //sum up the digit values 
```

### UnusedAssignment
Variable `val` initializer `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
    @Override
    public int getInt(final int index, final int defaultValue) {
        JsonValue val = null;
        int s = size;

```

### UnusedAssignment
Variable `val` initializer `null` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonArrayImpl.java`
#### Snippet
```java
    @Override
    public String getString(final int index, final String defaultValue) {
        JsonValue val = null;
        int s = size;

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `typeParameters != null` is always `true`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            final TypeVariable tv = TypeVariable.class.cast(type);
            final TypeVariable<? extends Class<?>>[] typeParameters = declaringClass.getSuperclass().getTypeParameters();
            if (typeParameters != null && ParameterizedType.class.isInstance(declaringClass.getGenericSuperclass())) {
                final ParameterizedType pt = ParameterizedType.class.cast(declaringClass.getGenericSuperclass());
                if (typeParameters.length == pt.getActualTypeArguments().length) {
```

### ConstantValue
Condition `record` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
        for (final Map.Entry<String, Reader> entry : fieldsReaders.entrySet()) {
            final String key = entry.getKey();
            Method m = record ?
                    getMethod(key, clazz) :
                    getMethod("get" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
```

### ConstantValue
Condition `!record` is always `true`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
                    getMethod(key, clazz) :
                    getMethod("get" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            if (m == null && !record && (boolean.class == entry.getValue().getType() || Boolean.class == entry.getValue().getType())) {
                m = getMethod("is" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            }
```

### ConstantValue
Value `record` is always 'false'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
                    getMethod(key, clazz) :
                    getMethod("get" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            if (m == null && !record && (boolean.class == entry.getValue().getType() || Boolean.class == entry.getValue().getType())) {
                m = getMethod("is" + Character.toUpperCase(key.charAt(0)) + (key.length() > 1 ? key.substring(1) : ""), clazz);
            }
```

### ConstantValue
Condition `record` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
        for (final Map.Entry<String, Reader> entry : methodReaders.entrySet()) {
            final Method mr = MethodAccessMode.MethodDecoratedType.class.cast(entry.getValue()).getMethod();
            final String fieldName = record ?
                    mr.getName() :
                    BeanUtil.decapitalize(mr.getName().startsWith("is") ?
```

### ConstantValue
Condition `c < SPACE` is always `true`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                    break;
                default:
                    if (c < SPACE) {
                        switch (c) {
                            case EOL:
```

### ConstantValue
Condition `last != GeneratorState.ROOT_VALUE` is always `true`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
        if (last == GeneratorState.IN_ARRAY || last == GeneratorState.START_ARRAY) {
            justWrite(END_ARRAY_CHAR);
        } else if (last != GeneratorState.ROOT_VALUE) {
            justWrite(END_OBJECT_CHAR);
        }
```

### ConstantValue
Condition `itemErrors != null` is always `true`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/ItemsValidation.java`
#### Snippet
```java
                        .flatMap(validator -> validator.apply(value).getErrors().stream())
                        .collect(toList());
                if (itemErrors != null && !itemErrors.isEmpty()) {
                    if (errors == null) {
                        errors = new ArrayList<>();
```

### ConstantValue
Condition `n != EOL` is always `true`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                endOfValueInBuffer = -1;

                while ((n = readNextChar()) > '\u001F' && n != ESCAPE_CHAR && n != EOL && n != QUOTE_CHAR) {
                    //read fast
                }
```

### ConstantValue
Condition `n >= '\u0000'` is always `true`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                    throw uexc("Unexpected linebreak");

                } else if (n >= '\u0000' && n <= '\u001F') {
                    throw uexc("Unescaped control character");
                }
```

### ConstantValue
Condition `previousEvent != KEY_SEPARATOR_EVENT` is always `true`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

        //last event must one of the following-> : , [
        if (previousEvent > 0 && previousEvent != KEY_SEPARATOR_EVENT && previousEvent != START_ARRAY && previousEvent != COMMA_EVENT) {
            throw uexc("Expected : , [");
        }
```

### ConstantValue
Condition `previousEvent != KEY_SEPARATOR_EVENT` is always `true`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

        //last event must one of the following-> : , [
        if (previousEvent > 0 && previousEvent != KEY_SEPARATOR_EVENT && previousEvent != START_ARRAY && previousEvent != COMMA_EVENT) {
            throw uexc("Expected : , [");
        }
```

### ConstantValue
Value `it` is always 'true'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
                        config.withDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'xxx", Locale.ROOT);
                    }
                    return it;
                }).orElse(false);

```

### ConstantValue
Condition `fieldArgTypes.length < 2` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                    if (map != null) {
                        final Type keyType = fieldArgTypes[0];
                        final boolean any = fieldArgTypes.length < 2 || fieldArgTypes[1] == Object.class;
                        for (final Map.Entry<String, JsonValue> value : object.entrySet()) {
                            final JsonValue jsonValue = value.getValue();
```

### ConstantValue
Value `objectConverter` is always 'null'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                generator.writeEnd();
            } else {
                writeIterator(itemConverter, key, objectConverter, ignoredProperties, jsonPointer, generator,
                        Iterator.class.cast(value), value);
            }
```

### ConstantValue
Value `objectConverter` is always 'null'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                return;
            } else {
                ObjectConverter.Writer objectConverterToUse = objectConverter;
                if (objectConverterToUse == null) {
                    objectConverterToUse = config.findObjectConverterWriter(type);
```

### ConstantValue
Condition `objectConverterToUse == null` is always `true`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            } else {
                ObjectConverter.Writer objectConverterToUse = objectConverter;
                if (objectConverterToUse == null) {
                    objectConverterToUse = config.findObjectConverterWriter(type);
                }
```

### ConstantValue
Condition `!writeBody` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            ObjectConverter.Writer objectConverter = config.findObjectConverterWriter(objectClass);
            if (writeBody && objectConverter != null) {
                if (!writeBody) {
                    objectConverter.writeJson(object, this);
                } else {
```

### ConstantValue
Value `writeBody` is always 'true'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            ObjectConverter.Writer objectConverter = config.findObjectConverterWriter(objectClass);
            if (writeBody && objectConverter != null) {
                if (!writeBody) {
                    objectConverter.writeJson(object, this);
                } else {
```

### ConstantValue
Condition `type == long.class` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            generator.write(JsonValue.class.cast(value));
            handled = true;
        } else if (type == long.class || type == Long.class) {
            final long longValue = Long.class.cast(value).longValue();
            if (isInJsRange(longValue)) {
```

### ConstantValue
Condition `type == float.class` is always `false` when reached
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            handled = true;
        } else if (isFloat(type)) {
            if (type == Float.class || type == float.class) {
                if (!Float.isNaN(Float.class.cast(value))) {
                    generator.write(new BigDecimal(value.toString()));
```

### ConstantValue
Condition `type == boolean.class` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            }
            handled = true;
        } else if (type == boolean.class || type == Boolean.class) {
            generator.write(Boolean.class.cast(value));
            return true;
```

### ConstantValue
Condition `type == char.class` is always `false`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
            generator.write(BigInteger.class.cast(value));
            handled = true;
        } else if (type == char.class || type == Character.class) {
            generator.write(Character.class.cast(value).toString());
            handled = true;
```

## RuleId[id=IOResource]
### IOResource
'JsonReaderImpl' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParserImpl.java`
#### Snippet
```java
        }

        JsonReaderImpl jsonReader = new JsonReaderImpl(this, true, getCharArrayProvider(), RejectDuplicateKeysMode.DEFAULT);
        return jsonReader.readArray();
    }
```

### IOResource
'JsonReaderImpl' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParserImpl.java`
#### Snippet
```java
        }

        JsonReaderImpl jsonReader = new JsonReaderImpl(this, true, getCharArrayProvider(), RejectDuplicateKeysMode.DEFAULT);
        return jsonReader.readObject();
    }
```

### IOResource
'JsonReaderImpl' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParserImpl.java`
#### Snippet
```java
            case START_ARRAY:
            case START_OBJECT:
                JsonReaderImpl jsonReader = new JsonReaderImpl(this, true, getCharArrayProvider(), RejectDuplicateKeysMode.DEFAULT);
                return jsonReader.readValue();
            case VALUE_TRUE:
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java

            Class[] interfaces = toProcess.getInterfaces();
            if (interfaces.length > 0) {
                for (Class interfaceToSearch : interfaces) {

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getGenericType` may produce `NullPointerException`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
            }

            final Type javaType = field.getGenericType();
            if (Class.class.isInstance(javaType)) {
                return new Instance(tryCreatingObjectInstance(javaType), true);
```

### DataFlowIssue
Method invocation `getTo` may produce `NullPointerException`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (JsonValue.ValueType.OBJECT == valueType) {
            if (JsonObject.class == key.getTo() || JsonStructure.class == key.getTo()) {
                return converter.to(jsonValue.asJsonObject());
            }
```

### DataFlowIssue
Method invocation `getTo` may produce `NullPointerException`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (STRING.equals(valueType)) {
            if (key.getTo() == JsonString.class) {
                return converter.to(JsonString.class.cast(jsonValue));
            }
```

### DataFlowIssue
Method invocation `getTo` may produce `NullPointerException`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (ARRAY.equals(valueType)) {
            if (JsonArray.class == key.getTo() || JsonStructure.class == key.getTo()) {
                return converter.to(jsonValue.asJsonObject());
            }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
            return buildArray(key.getTo(), jsonValue.asJsonArray(), null, null, jsonPointer, null);
        }
        return converter.to(jsonValue.toString());

    }
```

### DataFlowIssue
Method invocation `compareTo` may produce `NullPointerException`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                                case PropertyOrderStrategy.ANY:
                                case PropertyOrderStrategy.LEXICOGRAPHICAL:
                                    return o1.compareTo(o2);
                                case PropertyOrderStrategy.REVERSE:
                                    return o2.compareTo(o1);
```

### DataFlowIssue
Argument `o1` might be null
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                                    return o1.compareTo(o2);
                                case PropertyOrderStrategy.REVERSE:
                                    return o2.compareTo(o1);
                                default:
                                    return 1;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                final Setter setterValue = setter.getValue();
                final String key = setter.getKey();
                final Object rawValue = nested.get(key);
                Object val = value == null || setterValue.converter == null ?
                        rawValue : Converter.class.cast(setterValue.converter).toString(rawValue);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Collections.singletonList().stream()' can be replaced with 'Stream.of()'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JohnzonJsonParserImpl.java`
#### Snippet
```java
            case VALUE_FALSE:
            case VALUE_NULL:
                    return Collections.singletonList(getValue()).stream();
            default:
                throw new IllegalStateException(event + " doesn't support getValueStream");
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java

        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            final T found = type1.getClassOrPackageAnnotation(clazz);
            return found == null ? type2.getClassOrPackageAnnotation(clazz) : found;
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java

        @Override
        public <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            final T found = type1.getAnnotation(clazz);
            return found == null ? type2.getAnnotation(clazz) : found;
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java

        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java

        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java

        @Override
        public <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            return null;
        }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java

        @Override
        public <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            return null;
        }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `intern()` on compile-time constant is unnecessary
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonChars.java`
#### Snippet
```java
    char CR = '\r';

    String NULL = "null".intern();
    
    static final byte START_ARRAY = (byte) Event.START_ARRAY.ordinal();
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'findAdapter' is still used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
     * @deprecated see MapperConfig - it is acually reversed so maybe not deprecated after all?
     */
    private Adapter findAdapter(final Type aClass) {
        if (config.getNoParserAdapterTypes().contains(aClass)) {
            return null;
```

### DeprecatedIsStillUsed
Deprecated member 'convertTo' is still used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
     * @deprecated see MapperConfig
     */
    private Object convertTo(final Type aClass, final String text) {
        if (Object.class == aClass || String.class == aClass) {
            return text;
```

### DeprecatedIsStillUsed
Deprecated member 'addConverter' is still used
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperBuilder.java`
#### Snippet
```java

    @Deprecated // use addAdapter
    public MapperBuilder addConverter(final Type clazz, final Converter<?> converter) {
        adapters.put(new AdapterKey(clazz, String.class), new ConverterAdapter(converter, clazz));
        return this;
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/jsonb/JsonbLocator.java`
#### Snippet
```java
public class JsonbLocator extends IgnoreIfMissing {
    public JsonbLocator() {
        super(() -> new JsonbLocatorDelegate());
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/mapper/MapperLocator.java`
#### Snippet
```java
public class MapperLocator extends IgnoreIfMissing {
    public MapperLocator() {
        super(() -> new MapperLocatorDelegate());
    }

```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'isRecord'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/Records.java`
#### Snippet
```java
        Method isRecord = null;
        try {
            isRecord = Class.class.getMethod("isRecord");
        } catch (final NoSuchMethodException e) {
            // no-op
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `newInstance()` during object construction
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java

        public SingletonProvider(final int size) {
            buffer = newInstance(size);
        }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'customBuffer' in a Serializable class
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorFactoryImpl.java`
#### Snippet
```java
    private final int boundedOutputStreamWriter;
    private final Buffer buffer;
    private volatile Buffer customBuffer;

    public JsonGeneratorFactoryImpl(final Map<String, ?> config) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'buffer' in a Serializable class
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorFactoryImpl.java`
#### Snippet
```java
    private final boolean pretty;
    private final int boundedOutputStreamWriter;
    private final Buffer buffer;
    private volatile Buffer customBuffer;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'dateTimeFormatter' in a Serializable class
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java

    private boolean useShortISO8601Format = true;
    private DateTimeFormatter dateTimeFormatter;

    public void setUseShortISO8601Format(final boolean useShortISO8601Format) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'buffers' in a Serializable class
in `johnzon-core/src/main/java/org/apache/johnzon/core/ThreadLocalBufferCache.java`
#### Snippet
```java
public abstract class ThreadLocalBufferCache<T> implements Serializable {
    // alloc are expensive so using a very trivial buffer, we remove from TL to say we use it and reset it when we are done (close)
    private final ThreadLocal<T> buffers;
    private final int defaultSize;

```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/Streams.java`
#### Snippet
```java

            @Override
            public void mark(final int readlimit) {
                from.mark(readlimit);
            }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/internal/Streams.java`
#### Snippet
```java

            @Override
            public void reset() throws IOException {
                from.reset();
            }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
    public @interface JsonChildren {
        /**
         * @return the list of leaf classes which can be instantiated by the children.
         */
        Class<?>[] value();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JohnzonVirtualObjects.java`
#### Snippet
```java
public @interface JohnzonVirtualObjects {
    /**
     * @return list of virtual objects for this class.
     */
    JohnzonVirtualObject[] value();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JohnzonVirtualObject.java`
#### Snippet
```java

    /**
     * @return the list of fields to consider.
     */
    Field[] fields();
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
            if (bsClass == null || bsClass.isAssignableFrom(BufferStrategy.class)) {
                throw new IllegalArgumentException("Could not load Johnzon BufferStrategy " + strategyName +
                        ". Valid BufferStrategies are " + DEFAULT_STRATEGIES.keySet().toString() +
                        " or a fully qualified class name of an implementation of " + BufferStrategy.class.getName());
            }
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
                }

                i++;
                c = value.charAt(i);
            }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain keys of type 'Class'
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                final JohnzonConverter johnzonConverter = getAnnotation(parameter, JohnzonConverter.class);
                if (adapter == null && dateFormat == null && numberFormat == null && johnzonConverter == null) {
                    converters[i] = defaultConverters.get(parameter.getType());
                    itemConverters[i] = null;
                } else {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MethodGetterAsWriter` may be 'static'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
    }

    private class MethodGetterAsWriter extends MethodReader implements Writer {
        public MethodGetterAsWriter(final Method readMethod, final Type type) {
            super(readMethod, type);
```

## RuleId[id=RegExpDuplicateAlternationBranch]
### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/WildcardConfigurableJohnzonProvider.java`
#### Snippet
```java
    // type=a,b,c|type2=d,e
    public void setIgnoreFieldsForType(final String mapping) {
        for (final String config : mapping.split(" *| *")) {
            final String[] parts = config.split(" *= *");
            try {
```

### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java
    // type=a,b,c|type2=d,e
    public void setIgnoreFieldsForType(final String mapping) {
        for (final String config : mapping.split(" *| *")) {
            final String[] parts = config.split(" *= *");
            try {
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPointerImpl.java`
#### Snippet
```java
            throw new NullPointerException("jsonPointer must not be null");
        }
        if (!jsonPointer.equals("") && !jsonPointer.startsWith("/")) {
            throw new JsonException("A non-empty JsonPointer string must begin with a '/'");
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPointerImpl.java`
#### Snippet
```java

    private boolean isEmptyJsonPointer() {
        return jsonPointer.equals("");
    }

```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `delegate` accessed in synchronized context
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
        if (delegate == null){
            synchronized (this) {
                if (delegate == null) {
                    if (throwNoContentExceptionOnEmptyStreams == null) {
                        throwNoContentExceptionOnEmptyStreams = initThrowNoContentExceptionOnEmptyStreams();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `delegate` accessed in synchronized context
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
                            logger().warning("Using a ContextResolver<Jsonb>, NoContentException will not be thrown for empty streams");
                        }
                        delegate = new DynamicInstance(contextResolver); // faster than contextResolver::getContext
                    } else {
                        // don't recreate it for perfs
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `delegate` accessed in synchronized context
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
                    } else {
                        // don't recreate it for perfs
                        delegate = new ProvidedInstance(createJsonb());
                    }
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `readImpl` accessed in synchronized context
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
                    }
                }
                readImpl = throwNoContentExceptionOnEmptyStreams ?
                        this::doReadWithNoContentException :
                        this::doRead;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `delegate` accessed in synchronized context
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    @Override
    public synchronized void close() throws Exception {
        if (AutoCloseable.class.isInstance(delegate)) {
            AutoCloseable.class.cast(delegate).close();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `delegate` accessed in synchronized context
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    public synchronized void close() throws Exception {
        if (AutoCloseable.class.isInstance(delegate)) {
            AutoCloseable.class.cast(delegate).close();
        }
    }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/Activator.java`
#### Snippet
```java

    private static Optional<Boolean> whenTrue(boolean value) {
        return of(Boolean.valueOf(value)).filter(b -> b == Boolean.TRUE);
    }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
UTF_8 can be used instead
in `johnzon-maven-plugin/src/main/java/org/apache/johnzon/maven/plugin/ExampleToModelMojo.java`
#### Snippet
```java

        outputFile.getParentFile().mkdirs();
        try (final OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputFile), UTF_8.name())) {
            generate(readerFactory, source, writer, javaName);
        } catch (IOException e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16BE can be used instead
in `johnzon-core/src/main/java/org/apache/johnzon/core/RFC4627AwareInputStreamReader.java`
#### Snippet
```java
            int second = (utfBytes[1] & 0xFF);
            if (first == 0x00) {
                charset = (second == 0x00) ? Charset.forName("UTF-32BE") : Charset.forName("UTF-16BE");
            } else if (utfBytes.length > 2 && second == 0x00) {
                int third = (utfBytes[2] & 0xFF);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16LE can be used instead
in `johnzon-core/src/main/java/org/apache/johnzon/core/RFC4627AwareInputStreamReader.java`
#### Snippet
```java
            } else if (utfBytes.length > 2 && second == 0x00) {
                int third = (utfBytes[2] & 0xFF);
                charset = (third  == 0x00) ? Charset.forName("UTF-32LE") : Charset.forName("UTF-16LE");
            } else {

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16BE can be used instead
in `johnzon-core/src/main/java/org/apache/johnzon/core/RFC4627AwareInputStreamReader.java`
#### Snippet
```java

                if(first == 0xFE && second == 0xFF) {
                    charset = Charset.forName("UTF-16BE");
                    bomLength=2;
                } else if(first == 0xFF && second == 0xFE) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16LE can be used instead
in `johnzon-core/src/main/java/org/apache/johnzon/core/RFC4627AwareInputStreamReader.java`
#### Snippet
```java
                        bomLength=4;
                    }else {
                        charset = Charset.forName("UTF-16LE");
                        bomLength=2;
                    }
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
     * @deprecated see MapperConfig - it is acually reversed so maybe not deprecated after all?
     */
    private Adapter findAdapter(final Type aClass) {
        if (config.getNoParserAdapterTypes().contains(aClass)) {
            return null;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
     * @deprecated see MapperConfig
     */
    private Object convertTo(final Type aClass, final String text) {
        if (Object.class == aClass || String.class == aClass) {
            return text;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'v != null' covered by subsequent condition 'v instanceof JsonNumber'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
    public int getInt(final String name, final int defaultValue) {
        final Object v = value(name, JsonValue.class);
        if (v != null && v instanceof JsonNumber) {
            return JsonNumber.class.cast(v).intValue();
        }
```

### ConditionCoveredByFurtherCondition
Condition 'v != null' covered by subsequent condition 'v instanceof JsonString'
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
    public String getString(final String name, final String defaultValue) {
        final Object v = value(name, JsonValue.class);
        if (v != null && v instanceof JsonString) {
            return JsonString.class.cast(v).getString();
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/AccessMode.java`
#### Snippet
```java
                         return Stream.of( // direct name or if the pattern is FoosImpl try addFoo
                                 simpleName,
                                 simpleName.replaceAll("Impl$" ,"").replaceAll("s$", ""))
                                      .map(it -> {
                                          try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/AccessMode.java`
#### Snippet
```java
                         return Stream.of( // direct name or if the pattern is FoosImpl try addFoo
                                 simpleName,
                                 simpleName.replaceAll("Impl$" ,"").replaceAll("s$", ""))
                                      .map(it -> {
                                          try {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/WildcardConfigurableJohnzonProvider.java`
#### Snippet
```java
    // type=a,b,c|type2=d,e
    public void setIgnoreFieldsForType(final String mapping) {
        for (final String config : mapping.split(" *| *")) {
            final String[] parts = config.split(" *= *");
            try {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/WildcardConfigurableJohnzonProvider.java`
#### Snippet
```java
    public void setIgnoreFieldsForType(final String mapping) {
        for (final String config : mapping.split(" *| *")) {
            final String[] parts = config.split(" *= *");
            try {
                final Class<?> type = Thread.currentThread().getContextClassLoader().loadClass(parts[0]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/WildcardConfigurableJohnzonProvider.java`
#### Snippet
```java
                    builder.setIgnoreFieldsForType(type);
                } else {
                    builder.setIgnoreFieldsForType(type, parts[1].split(" *, *"));
                }
            } catch (final ClassNotFoundException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/WildcardConfigurableJohnzonProvider.java`
#### Snippet
```java

    public void setIgnores(final String ignores) {
        this.ignores = ignores == null ? null : asList(ignores.split(" *, *"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java

    public void setIgnores(final String ignores) {
        this.ignores = ignores == null ? null : asList(ignores.split(" *, *"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java
    private Set<Class<?>> asSet(final String classes) {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return Stream.of(classes.split(" *, *"))
                .map(n -> {
                    try {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java
    // type=a,b,c|type2=d,e
    public void setIgnoreFieldsForType(final String mapping) {
        for (final String config : mapping.split(" *| *")) {
            final String[] parts = config.split(" *= *");
            try {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java
    public void setIgnoreFieldsForType(final String mapping) {
        for (final String config : mapping.split(" *| *")) {
            final String[] parts = config.split(" *= *");
            try {
                final Class<?> type = Thread.currentThread().getContextClassLoader().loadClass(parts[0]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/ConfigurableJohnzonProvider.java`
#### Snippet
```java
                    builder.setIgnoreFieldsForType(type);
                } else {
                    builder.setIgnoreFieldsForType(type, parts[1].split(" *, *"));
                }
            } catch (final ClassNotFoundException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider.java`
#### Snippet
```java
    private Set<Class<?>> asSet(final String classes) {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return Stream.of(classes.split(" *, *"))
                .map(n -> {
                    try {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/number/Validator.java`
#### Snippet
```java
        // resp https://github.com/eclipse-ee4j/jsonb-api/issues/82 is properly specced
        if (value < -128 || value > 255) {
            throw new java.lang.ArithmeticException("Overflow");
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.json.bind.config` is unnecessary and can be removed
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/DefaultPropertyVisibilityStrategy.java`
#### Snippet
```java
import static java.util.Optional.ofNullable;

class DefaultPropertyVisibilityStrategy implements jakarta.json.bind.config.PropertyVisibilityStrategy, Cleanable<Class<?>> {
    private final ConcurrentMap<Class<?>, PropertyVisibilityStrategy> strategies = new ConcurrentHashMap<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.enterprise.inject.spi` is unnecessary, and can be replaced with an import
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/cdi/RegisterCdiExtension.java`
#### Snippet
```java
        if (tryLoadingCdi()) {
            return register(
                jakarta.enterprise.inject.spi.Extension.class,
                new org.apache.johnzon.osgi.cdi.CdiExtensionFactory(),
                getCdiExtensionProperties()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.johnzon.osgi.cdi` is unnecessary and can be removed
in `johnzon-osgi/src/main/java/org/apache/johnzon/osgi/cdi/RegisterCdiExtension.java`
#### Snippet
```java
            return register(
                jakarta.enterprise.inject.spi.Extension.class,
                new org.apache.johnzon.osgi.cdi.CdiExtensionFactory(),
                getCdiExtensionProperties()
            );
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.enterprise.inject.spi` is unnecessary, and can be replaced with an import
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/cdi/CDIs.java`
#### Snippet
```java

        private static JohnzonCdiExtension load(final Object beanManager) {
            final jakarta.enterprise.inject.spi.BeanManager bm = jakarta.enterprise.inject.spi.BeanManager.class.cast(beanManager);
            return JohnzonCdiExtension.class.cast(
                bm.getReference(bm.resolve(bm.getBeans(JohnzonCdiExtension.class)), JohnzonCdiExtension.class, bm.createCreationalContext(null)));
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.enterprise.inject.spi` is unnecessary, and can be replaced with an import
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/cdi/CDIs.java`
#### Snippet
```java

        private static JohnzonCdiExtension load(final Object beanManager) {
            final jakarta.enterprise.inject.spi.BeanManager bm = jakarta.enterprise.inject.spi.BeanManager.class.cast(beanManager);
            return JohnzonCdiExtension.class.cast(
                bm.getReference(bm.resolve(bm.getBeans(JohnzonCdiExtension.class)), JohnzonCdiExtension.class, bm.createCreationalContext(null)));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.johnzon.jsonb.factory` is unnecessary, and can be replaced with an import
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonBuilder.java`
#### Snippet
```java
        }
        try { // don't trigger CDI is not there
            return new org.apache.johnzon.jsonb.factory.CdiJohnzonAdapterFactory(beanManager);
        } catch (final NoClassDefFoundError | Exception e) {
            return new SimpleJohnzonAdapterFactory();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java

    @Override
    public Set<java.util.Map.Entry<String, JsonValue>> entrySet() {
        return unmodifieableBackingMap.entrySet();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.johnzon.core` is unnecessary, and can be replaced with an import
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/JohnzonCores.java`
#### Snippet
```java

        private static SnippetFactory of(final int max, final JsonGeneratorFactory factory) {
            return new org.apache.johnzon.core.Snippet(max, factory)::of;
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                short shortVal = (short) intValue;
                if (intValue != shortVal) {
                    throw new java.lang.ArithmeticException("Overflow");
                }
                return shortVal;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonLongImpl.java`
#### Snippet
```java
        int intVal =  intValue();
        if (intVal != value) {
            throw new java.lang.ArithmeticException("Overflow");
        }
        return intVal;
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        }

        if (converter == null) {
            cache.put(clazz, (T) NO_CONVERTER);
        } else {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ConfiguredFieldFilteringStrategy()` of an abstract class should not be declared 'public'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
        private final Map<Class<?>, Collection<String>> fieldsToRemove = new LinkedHashMap<>();

        public ConfiguredFieldFilteringStrategy() {
            // mainly built it in the JVM types == user cant handle them
            fieldsToRemove.put(Throwable.class, asList("suppressedExceptions", "cause"));
```

### NonProtectedConstructorInAbstractClass
Constructor `TypeAwareDecoder()` of an abstract class should not be declared 'public'
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/TypeAwareDecoder.java`
#### Snippet
```java
    }

    public TypeAwareDecoder(final Type type) {
        this.type = type;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TypeAwareDecoder()` of an abstract class should not be declared 'public'
in `johnzon-websocket/src/main/java/org/apache/johnzon/websocket/internal/TypeAwareDecoder.java`
#### Snippet
```java
    protected Type type;

    public TypeAwareDecoder() {
        // no-op
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseValidation()` of an abstract class should not be declared 'public'
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/BaseValidation.java`
#### Snippet
```java
    private final boolean rootCanBeNull;

    public BaseValidation(final String pointer, final Function<JsonValue, JsonValue> extractor, final JsonValue.ValueType validType) {
        this.pointer = pointer;
        this.extractor = extractor != null ? extractor : v -> v;
```

### NonProtectedConstructorInAbstractClass
Constructor `ThreadLocalProvider()` of an abstract class should not be declared 'public'
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
        private final ThreadLocalBufferCache<T> cache;

        public ThreadLocalProvider(final int size) {
            cache = new ThreadLocalBufferCache<T>(size) {
                @Override
```

### NonProtectedConstructorInAbstractClass
Constructor `SingletonProvider()` of an abstract class should not be declared 'public'
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
        protected final T buffer;

        public SingletonProvider(final int size) {
            buffer = newInstance(size);
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `QueueProvider()` of an abstract class should not be declared 'public'
in `johnzon-core/src/main/java/org/apache/johnzon/core/BufferStrategyFactory.java`
#### Snippet
```java
        private final ConcurrentLinkedQueue<T> queue = new ConcurrentLinkedQueue<T>();

        public QueueProvider(final int size) {
            this.size = size;
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `MethodDecoratedType()` of an abstract class should not be declared 'public'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
        protected final Type type;

        public MethodDecoratedType(final Method method, final Type type) {
            this.method = method;
            if (!method.isAccessible()) {
```

### NonProtectedConstructorInAbstractClass
Constructor `ThreadLocalBufferCache()` of an abstract class should not be declared 'public'
in `johnzon-core/src/main/java/org/apache/johnzon/core/ThreadLocalBufferCache.java`
#### Snippet
```java
    private final int defaultSize;

    public ThreadLocalBufferCache(final int defaultSize) {
        this.buffers = new ThreadLocal<T>() {
            @Override
```

### NonProtectedConstructorInAbstractClass
Constructor `JohnzonCollectionType()` of an abstract class should not be declared 'public'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonCollectionType.java`
#### Snippet
```java

public abstract class JohnzonCollectionType<TYPE> extends JohnzonParameterizedType {
    public JohnzonCollectionType() {
        super(null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FieldDecoratedType()` of an abstract class should not be declared 'public'
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAccessMode.java`
#### Snippet
```java
        protected final Type type;

        public FieldDecoratedType(final Field field, final Type type) {
            this.field = field;
            if (!field.isAccessible()) {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `johnzon-jaxrs/src/main/java/org/apache/johnzon/jaxrs/xml/WadlDocumentToJson.java`
#### Snippet
```java
            final String name = node.getNodeName();
            Collection<Node> nodes = nodesByName.get(name);
            if (nodes == null) {
                nodes = new LinkedList<Node>();
                nodesByName.put(name, nodes);
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `supportedConfigKeys`
in `johnzon-core/src/main/java/org/apache/johnzon/core/AbstractJsonFactory.java`
#### Snippet
```java
        if(config != null && !config.isEmpty()) {
            if(defaultSupportedConfigKeys != null) {
                supportedConfigKeys = new ArrayList<>(supportedConfigKeys);
                supportedConfigKeys.addAll(defaultSupportedConfigKeys);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java

            //read next character
            c = readNextChar();

        }
```

### AssignmentToMethodParameter
Assignment to method parameter `jsonValue`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonPointerImpl.java`
#### Snippet
```java
        if (jsonValue instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonValue;
            jsonValue = jsonObject.get(referenceToken);

            if (jsonValue != null) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/CharacterConverter.java`
#### Snippet
```java
    @Override
    public Character fromString(final String text) {
        return text.length() > 0 ? text.charAt(0) : null;
    }
}
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/EnumConverter.java`
#### Snippet
```java
    @Override // no need of cache here, it is already fast
    public String toString(final T instance) {
        return instance != null ? instance.name() : null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-json-extras/src/main/java/org/apache/johnzon/jsonb/extras/polymorphism/Polymorphic.java`
#### Snippet
```java
            }
            if (!parser.hasNext()) {
                return null;
            }
            eatStartObject(parser);
```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                || type.getName().startsWith("jakarta.")
            ) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                // no-op, ignore defaults there
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
        @Override
        public Type getOwnerType() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                    }
                    // todo?
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/SchemaProcessor.java`
#### Snippet
```java
                return refs.get(type);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/Schema.java`
#### Snippet
```java
        @Override
        public String adaptToJson(final SchemaType obj) {
            return obj == null ? null : obj == SchemaType.bool ? "boolean" : obj.name();
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/Schema.java`
#### Snippet
```java
        @Override
        public SchemaType adaptFromJson(final String obj) {
            return obj == null ? null : "boolean".equals(obj) ? SchemaType.bool : SchemaType.valueOf(obj);
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAndMethodAccessMode.java`
#### Snippet
```java
            t = t.getSuperclass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/generator/PojoGenerator.java`
#### Snippet
```java
            return configuration.getOnRef().apply(ref);
        }
        return null; // todo: check if already in nested for ex
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/AccessMode.java`
#### Snippet
```java
                                              return finder.get(it, type, param);
                                          } catch (final NoSuchMethodException e) {
                                              return null;
                                          }
                                      })
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/Meta.java`
#### Snippet
```java
        while (current != null && current != Object.class) {
            if (!visited.add(current)) {
                return null;
            }
            final T annotation = current.getAnnotation(api);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/Meta.java`
#### Snippet
```java
            current = current.getSuperclass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/Meta.java`
#### Snippet
```java
            }
        } // todo: meta?
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/Meta.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/Meta.java`
#### Snippet
```java
            return meta;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/LocaleConverter.java`
#### Snippet
```java
    public Locale to(final String locale) {
        if (locale == null) {
            return null;
        }
        final int len = locale.length();
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
    @Override
    public Adapter<?, ?> findAdapter(Class<?> clazz) {
        return null; // TODO: converter?
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
    @Override
    public ObjectConverter.Reader<?> findReader(final Class<?> clazz) {
        return null; // TODO: converter?
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
    public Field findAnyField(final Class<?> clazz) {
        if (clazz.isInterface() || clazz.isEnum()) {
            return null;
        }
        Class<?> current = clazz;
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
            current = clazz.getSuperclass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
                    constructor = clazz.getConstructor();
                } catch (final NoSuchMethodException e) {
                    return null; // readOnly class
                }
            }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
    @Override
    public ObjectConverter.Writer<?> findWriter(final Class<?> clazz) {
        return null; // TODO: converter?
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/BaseAccessMode.java`
#### Snippet
```java
    @Override
    public Comparator<String> fieldComparator(final Class<?> clazz) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-jsonschema/src/main/java/org/apache/johnzon/jsonschema/spi/builtin/ItemsValidation.java`
#### Snippet
```java
                                    .collect(toList()));
                        default:
                            return null;
                    }
                });
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/reflection/JohnzonParameterizedType.java`
#### Snippet
```java
    @Override
    public Type getOwnerType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/util/ClassUtil.java`
#### Snippet
```java
        } catch (ClassNotFoundException e) {
            // all fine, that class is optional!
            return null;
        } catch (NoClassDefFoundError ncdfe) {
            if (ignoreBrokenClasses) {
```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/util/ClassUtil.java`
#### Snippet
```java
        } catch (NoClassDefFoundError ncdfe) {
            if (ignoreBrokenClasses) {
                return null;
            }
            throw ncdfe;
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    public Method findMapAdder(final Class<?> clazz) {
        if (isJavaThrowable(clazz) || isStackTraceElement(clazz)) {
            return null;
        }
        return delegate.findMapAdder(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
            return delegate.findFactory(clazz);
        } catch (final RuntimeException | Error e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    public Field findAnyField(final Class<?> clazz) {
        if (isJavaThrowable(clazz) || isStackTraceElement(clazz)) {
            return null;
        }
        return delegate.findAnyField(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    public Method findAnySetter(final Class<?> clazz) {
        if (isJavaThrowable(clazz) || isStackTraceElement(clazz)) {
            return null;
        }
        return delegate.findAnySetter(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    public Method findAnyGetter(final Class<?> clazz) {
        if (isJavaThrowable(clazz) || isStackTraceElement(clazz)) {
            return null;
        }
        return delegate.findAnyGetter(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Writer<?> findObjectConverterWriter() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    public ObjectConverter.Writer<?> findWriter(final Class<?> clazz) {
        if (isJavaThrowable(clazz) || isStackTraceElement(clazz)) {
            return null;
        }
        return delegate.findWriter(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
    public ObjectConverter.Reader<?> findReader(final Class<?> clazz) {
        if (isJavaThrowable(clazz) || isStackTraceElement(clazz)) {
            return null;
        }
        return delegate.findReader(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Reader<?> findObjectConverterReader() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/KnownNotOpenedJavaTypesAccessMode.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Reader<?> findObjectConverterReader() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Writer<?> findObjectConverterWriter() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/MethodAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Reader<?> findObjectConverterReader() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            final int tmp = retVal * 10 + (chars[i] - ZERO);
            if (tmp < retVal) { //check overflow
                return null;
            } else {
                retVal = tmp;
```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
            final long tmp = retVal * 10 + (chars[i] - ZERO);
            if (tmp < retVal) { //check overflow
                return null;
            } else {
                retVal = tmp;
```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
        return previousEvent >= 0 && previousEvent < Event.values().length
                ? Event.values()[previousEvent]
                : null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/adapter/JsonbEnumAdapter.java`
#### Snippet
```java
    @Override // no need of cache here, it is already fast
    public String toString(final T instance) {
        return instance != null ? reversed.get(instance) : null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/reflect/Types.java`
#### Snippet
```java
        @Override
        public Type getOwnerType() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/reflect/Types.java`
#### Snippet
```java
    public Class<?> findParamType(final ParameterizedType type, final Class<?> expectedWrapper) {
        if (type.getActualTypeArguments().length != 1) {
            return null;
        }
        final Class<?> asClass = asClass(type.getRawType());
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/reflect/Types.java`
#### Snippet
```java
        final Class<?> asClass = asClass(type.getRawType());
        if (asClass == null || !expectedWrapper.isAssignableFrom(asClass)) {
            return null;
        }
        return asClass(type.getActualTypeArguments()[0]);
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/reflect/Types.java`
#### Snippet
```java

    public Class<?> asClass(final Type type) {
        return Class.class.isInstance(type) ? Class.class.cast(type) : null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/HStack.java`
#### Snippet
```java

    T peek() {
        return topElement == null ? null : topElement.object;
    }

```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/HStack.java`
#### Snippet
```java

        if (topElement == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
            }, OffsetTime.class));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
        final Adapter<?, ?> found = super.get(key);
        if (found == NO_ADAPTER) {
            return null;
        }
        if (found == null) {
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
        if (found == null) {
            if (!AdapterKey.class.isInstance(key)) {
                return null;
            }
            final AdapterKey k = AdapterKey.class.cast(key);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/map/LazyConverterMap.java`
#### Snippet
```java
            }
            add(k, NO_ADAPTER);
            return null;
        }
        return found;
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/converter/JohnzonJsonbAdapter.java`
#### Snippet
```java
    public JsonType from(final OriginalType obj) {
        if (obj == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/converter/JohnzonJsonbAdapter.java`
#### Snippet
```java
    public OriginalType to(final JsonType obj) {
        if (obj == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `johnzon-jsonlogic/src/main/java/org/apache/johnzon/jsonlogic/spi/AsyncOperator.java`
#### Snippet
```java
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            final Throwable cause = e.getCause();
```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonObjectImpl.java`
#### Snippet
```java
            return clazz.cast(v);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-core/src/main/java/org/apache/johnzon/core/Types.java`
#### Snippet
```java
        @Override
        public Type getOwnerType() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
                    throw new JsonbException("can't map a primritive to null");
                }
                return null;
            case STRING:
                if (String.class != type) {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        if (OptionalInt.class.isInstance(inObject)) {
            final OptionalInt optionalInt = OptionalInt.class.cast(inObject);
            return optionalInt.isPresent() ? optionalInt.getAsInt() : null;
        }
        if (OptionalLong.class.isInstance(inObject)) {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        if (OptionalLong.class.isInstance(inObject)) {
            final OptionalLong optionalLong = OptionalLong.class.cast(inObject);
            return optionalLong.isPresent() ? optionalLong.getAsLong() : null;
        }
        if (OptionalDouble.class.isInstance(inObject)) {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JohnzonJsonb.java`
#### Snippet
```java
        if (OptionalDouble.class.isInstance(inObject)) {
            final OptionalDouble optionalDouble = OptionalDouble.class.cast(inObject);
            return optionalDouble.isPresent() ? optionalDouble.getAsDouble() : null;
        }
        return inObject;
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java

        if (NULL.equals(valueType)) {
            return null;
        }
        if (STRING.equals(valueType)) {
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
                            final Type rootType) {
        if (jsonValue == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        JsonValue.ValueType valueType = jsonValue.getValueType();
        if (JsonValue.ValueType.NULL == valueType) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        if (NULL == valueType) {
            return null;
        }
        if (TRUE == valueType && (Boolean.class == targetType || boolean.class == targetType || Object.class == targetType)) {
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
    private Adapter findAdapter(final Type aClass) {
        if (config.getNoParserAdapterTypes().contains(aClass)) {
            return null;
        }
        final Adapter<?, ?> converter = config.getAdapters().get(new AdapterKey(aClass, String.class, true));
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParserImpl.java`
#### Snippet
```java
        }
        config.getNoParserAdapterTypes().add(aClass);
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/polymorphism/JsonbPolymorphismHandler.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingParser.java`
#### Snippet
```java

    default Collection<Class<?>> getSkippedConverters() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/TimestampAdapter.java`
#### Snippet
```java
    @Override
    public Date to(final Long aLong) {
        return aLong == null ? null : new Date(aLong);
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/converter/TimestampAdapter.java`
#### Snippet
```java
    @Override
    public Long from(final Date date) {
        return date == null ? null : date.getTime();
    }
}
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Reader<?> findObjectConverterReader() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAccessMode.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Writer<?> findObjectConverterWriter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/access/FieldAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                reader = i -> {
                    final OptionalInt optionalInt = OptionalInt.class.cast(finalReader.read(i));
                    return optionalInt == null || !optionalInt.isPresent() ? null : optionalInt.getAsInt();
                };
            } else if (OptionalLong.class == readerType) {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                reader = i -> {
                    final OptionalLong optionalLong = OptionalLong.class.cast(finalReader.read(i));
                    return optionalLong == null || !optionalLong.isPresent() ? null : optionalLong.getAsLong();
                };
            } else if (OptionalDouble.class == readerType) {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                reader = i -> {
                    final OptionalDouble optionalDouble = OptionalDouble.class.cast(finalReader.read(i));
                    return optionalDouble == null || !optionalDouble.isPresent() ? null : optionalDouble.getAsDouble();
                };
            } else if (isOptionalArray(finalReader)) {
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
                    final Object[] optionals = Object[].class.cast(finalReader.read(i));
                    return optionals == null ?
                            null : Stream.of(optionals)
                            .map(Optional.class::cast)
                            .map(o -> o.orElse(null))
```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
    private String getJsonbProperty(final AnnotatedElement a) {
        final JsonbProperty p = Meta.getAnnotation(a, JsonbProperty.class);
        return p != null ? p.value() : null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
            return declaredConstructor.newInstance();
        } catch (final Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    public ClassMapping findOrCreateClassMapping(final Type clazz) {
        if (isPrimitive(clazz)) {
            return null;
        }
        return doFindOrCreateClassMapping(clazz, emptyMap(), false);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            }
            if (!Class.class.isInstance(clazz)) {
                return null;
            }
            final Class asClass = Class.class.cast(clazz);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                    classMapping = createClassMapping(mapping, args);
                } else if (asClass.getName().startsWith("java.")) { // we'll not be able to map it with pojo rules
                    return null;
                } else { // assume that it can be written with pojo rules but not deserialized
                    classMapping = createClassMapping(asClass, args);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Reader<?> findObjectConverterReader() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                collectionType = Collection.class;
            } else {
                return null;
            }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            return mapping;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public Adapter<?, ?> findConverter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public ObjectConverter.Writer<?> findObjectConverterWriter() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            return false;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
    private ClassMapping putOrGetClassMapping(final Type clazz, final ClassMapping classMapping) {
        if (classMapping == null) {
            return null;
        }
        final ClassMapping existing = classes.putIfAbsent(clazz, classMapping);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
        @Override
        public <T extends Annotation> T getClassOrPackageAnnotation(final Class<T> clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
            collectionMapping = createCollectionMapping(genericType, enclosingType);
            if (collectionMapping == null) {
                return null;
            }
            final CollectionMapping existing = collections.putIfAbsent(genericType, collectionMapping);
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/Mappings.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        // if we have found a dummy, we return null
        if (converter == NO_CONVERTER) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        if (matchingConverters.isEmpty()) {
            cache.put(clazz, (T) NO_CONVERTER);
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        @Override
        public Object fromJson(JsonValue jsonObject, Type targetType, MappingParser parser) {
            return null;
        }
    };
```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
    public Adapter findAdapter(final Type aClass) {
        if (getNoGeneratorAdapterTypes().contains(aClass)) { // avoid to create a key for nothing
            return null;
        }

```

### ReturnNull
Return of `null`
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MapperConfig.java`
#### Snippet
```java
        }
        getNoGeneratorAdapterTypes().add(aClass);
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `s` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonGeneratorImpl.java`
#### Snippet
```java
    private static String toUnicode(final char c) {
        final String hex = UNICODE_PREFIX_HELPER + Integer.toHexString(c);
        final String s = UNICODE_PREFIX + hex.substring(hex.length() - 4);
        return s;
    }
```

### UnnecessaryLocalVariable
Local variable `localStructureElement` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                throw uexc("Expected \"");
            }
            final StructureElement localStructureElement = new StructureElement(currentStructureElement, true);
            currentStructureElement = localStructureElement;
        }
```

### UnnecessaryLocalVariable
Local variable `localStructureElement` is redundant
in `johnzon-core/src/main/java/org/apache/johnzon/core/JsonStreamParserImpl.java`
#### Snippet
```java
                throw uexc("Expected :");
            }
            final StructureElement localStructureElement = new StructureElement(currentStructureElement, false);
            currentStructureElement = localStructureElement;
        }
```

### UnnecessaryLocalVariable
Local variable `dynamicMappingGenerator` is redundant
in `johnzon-mapper/src/main/java/org/apache/johnzon/mapper/MappingGeneratorImpl.java`
#### Snippet
```java
                                          final ObjectConverter.Writer objectConverter,
                                          final Object value) {
        final DynamicMappingGenerator dynamicMappingGenerator = generator;
        objectConverter.writeJson(value, dynamicMappingGenerator);
        dynamicMappingGenerator.flushIfNeeded();
```

### UnnecessaryLocalVariable
Local variable `delegateFactory` is redundant
in `johnzon-jsonb/src/main/java/org/apache/johnzon/jsonb/JsonbAccessMode.java`
#### Snippet
```java
        if (constructor == null && factory == null && !invalidConstructorForDeserialization) {
            final Stream<Function<AnnotatedElement, String>> jsonbFn = Stream.of(this::getJsonbProperty);
            final Factory delegateFactory = delegate.findFactory(
                    clazz,
                    (parameterNameExtractors == null ?
```

