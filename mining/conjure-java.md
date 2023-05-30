# conjure-java 
 
# Bad smells
I found 121 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 43 | false |
| UnstableApiUsage | 27 | false |
| SimplifyOptionalCallChains | 8 | false |
| JavadocLinkAsPlainText | 7 | false |
| OptionalGetWithoutIsPresent | 6 | false |
| SimplifyStreamApiCallChains | 4 | false |
| BlockingMethodInNonBlockingContext | 4 | false |
| RegExpRedundantEscape | 3 | false |
| WrongPackageStatement | 3 | false |
| OptionalIsPresent | 2 | false |
| JavadocReference | 2 | false |
| DuplicatedCode | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| Deprecation | 2 | false |
| AutoCloseableResource | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| NullableProblems | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packagePrefix'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Packages.java`
#### Snippet
```java
    }

    public static String getPrefixedPackage(String packageName, Optional<String> packagePrefix) {
        return packagePrefix.map(prefix -> prefix + "." + packageName).orElse(packageName);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packagePrefix'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Packages.java`
#### Snippet
```java
public final class Packages {

    public static TypeName getPrefixedName(TypeName original, Optional<String> packagePrefix) {
        return packagePrefix
                .map(prefix -> TypeName.of(original.getName(), prefix + "." + original.getPackage()))
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/ConjureAnnotations.java`
#### Snippet
```java
    }

    public static ImmutableList<AnnotationSpec> safety(Optional<LogSafety> value) {
        return value.map(safety -> {
                    switch (safety.get()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deprecation'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/ConjureAnnotations.java`
#### Snippet
```java
    }

    public static ImmutableList<AnnotationSpec> deprecation(Optional<Documentation> deprecation) {
        return deprecation.isPresent() ? DEPRECATED : ImmutableList.of();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeSafety'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/ConjureAnnotations.java`
#### Snippet
```java
    }

    public static TypeName withSafety(TypeName typeName, Optional<LogSafety> maybeSafety) {
        if (maybeSafety.isPresent()) {
            if (typeName instanceof ParameterizedTypeName) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'documentation'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Javadoc.java`
#### Snippet
```java
    }

    public static Optional<String> render(Optional<Documentation> documentation, Optional<Documentation> deprecation) {
        if (!documentation.isPresent() && !deprecation.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deprecation'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Javadoc.java`
#### Snippet
```java
    }

    public static Optional<String> render(Optional<Documentation> documentation, Optional<Documentation> deprecation) {
        if (!documentation.isPresent() && !deprecation.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'safety'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderAuxiliarySettersUtils.java`
#### Snippet
```java
            TypeMapper typeMapper,
            ClassName returnClass,
            Optional<LogSafety> safety) {
        FieldSpec field = enriched.poetSpec();
        return publicSetter(enriched, returnClass)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'safety'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderAuxiliarySettersUtils.java`
#### Snippet
```java

    public static TypeName widenParameterIfPossible(
            TypeName current, Type type, TypeMapper typeMapper, Optional<LogSafety> safety) {
        if (type.accept(TypeVisitor.IS_LIST)) {
            Type innerType = type.accept(TypeVisitor.LIST).getItemType();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ENUM_SAFETY'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
     * for past and future values which are known at compile-time in that version.
     */
    public static final Optional<LogSafety> ENUM_SAFETY = Optional.of(LogSafety.SAFE);
    /**
     * Unknown variant should be considered unsafe because we don't know what kind of data it may contain,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'declaredSafety'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
    }

    public Optional<LogSafety> evaluate(Type type, Optional<LogSafety> declaredSafety) {
        return declaredSafety.or(() -> evaluate(type));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'UNKNOWN_UNION_VARINT_SAFETY'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
     * better tooling to extract safe components.
     */
    public static final Optional<LogSafety> UNKNOWN_UNION_VARINT_SAFETY = Optional.empty();

    private final Map<TypeName, TypeDefinition> definitionMap;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'safety'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
        }

        private Optional<LogSafety> getSafety(Type type, Optional<LogSafety> safety) {
            return safety.or(() -> type.accept(fieldVisitor));
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'required'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
    }

    public static boolean allows(Optional<LogSafety> required, Optional<LogSafety> given) {
        if (required.isEmpty() || given.isEmpty()) {
            // If there is no requirement, all inputs are allowed.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'given'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
    }

    public static boolean allows(Optional<LogSafety> required, Optional<LogSafety> given) {
        if (required.isEmpty() || given.isEmpty()) {
            // If there is no requirement, all inputs are allowed.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'one'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
    }

    public static Optional<LogSafety> combine(Optional<LogSafety> one, Optional<LogSafety> two) {
        if (one.isPresent() && two.isPresent()) {
            return Optional.of(combine(one.get(), two.get()));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'two'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
    }

    public static Optional<LogSafety> combine(Optional<LogSafety> one, Optional<LogSafety> two) {
        if (one.isPresent() && two.isPresent()) {
            return Optional.of(combine(one.get(), two.get()));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'safety'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java

    private MethodSpec createItemSetter(
            EnrichedField enriched, Type itemType, boolean override, Optional<LogSafety> safety) {
        FieldSpec field = enriched.poetSpec();
        return BeanBuilderAuxiliarySettersUtils.createItemSetterBuilder(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'builderInterfaceClass'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
            Map<com.palantir.conjure.spec.TypeName, TypeDefinition> typesMap,
            String className,
            Optional<String> builderInterfaceClass,
            boolean strict) {
        Collection<EnrichedField> enrichedFields = enrichFields(typeDef.getFields());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeout'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowTypeFunctions.java`
#### Snippet
```java

    static final class AsyncRequestProcessingMetadata {
        private final Optional<HumanReadableDuration> timeout;

        AsyncRequestProcessingMetadata() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'type'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/ReturnTypeMapper.java`
#### Snippet
```java
    }

    public TypeName baseType(Optional<Type> type) {
        return type.map(this::baseType).orElse(TypeName.VOID);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'type'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/ReturnTypeMapper.java`
#### Snippet
```java
    }

    public TypeName async(Optional<Type> type) {
        return ParameterizedTypeName.get(LISTENABLE_FUTURE, Primitives.box(baseType(type)));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'auth'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/Retrofit2ServiceGenerator.java`
#### Snippet
```java
    }

    private Optional<ParameterSpec> getAuthParameter(Optional<AuthType> auth) {
        if (!auth.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'apiVersion'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DialogueEndpointsGenerator.java`
#### Snippet
```java
    }

    private static TypeSpec endpointField(EndpointDefinition def, String serviceName, Optional<String> apiVersion) {
        TypeSpec.Builder builder = TypeSpec.anonymousClassBuilder("");
        def.getDocs().ifPresent(docs -> builder.addJavadoc("$L", Javadoc.render(docs)));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'auth'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/JerseyServiceGenerator.java`
#### Snippet
```java
    }

    private Optional<ParameterSpec> createAuthParameter(Optional<AuthType> auth, boolean withAnnotations) {
        if (!auth.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'type'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DefaultStaticFactoryMethodGenerator.java`
#### Snippet
```java
    }

    private Optional<FieldSpec> deserializer(EndpointName endpointName, Optional<Type> type) {
        TypeName className = Primitives.box(returnTypes.baseType(type));
        if (isBinaryOrOptionalBinary(className, returnTypes)) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'token'
in `conjure-undertow-lib/src/main/java/com/palantir/conjure/java/undertow/lib/AuthorizationExtractor.java`
#### Snippet
```java
     * This data is never used for auth and is not guaranteed to be verified.
     */
    default void setRequestToken(HttpServerExchange exchange, Optional<UnverifiedJsonWebToken> token) {
        // no-op default implementation for cross-version compatibility.
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `conjure-undertow-lib/src/main/java/com/palantir/conjure/java/undertow/lib/Endpoint.java`
#### Snippet
```java

        @CanIgnoreReturnValue
        public Builder deprecated(Optional<String> value) {
            deprecated = Preconditions.checkNotNull(value, "deprecated is required");
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'deprecated'
in `conjure-undertow-lib/src/main/java/com/palantir/conjure/java/undertow/lib/Endpoint.java`
#### Snippet
```java
        private String serviceName;
        private String name;
        private Optional<String> deprecated = Optional.empty();
        private ImmutableSet<String> tags = ImmutableSet.of();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'listInnerType'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ArgumentType.java`
#### Snippet
```java
    interface Cases<R> {
        /** Should be handled by {@link ParameterDeserializer}. */
        R primitive(TypeName javaTypeName, String parameterSerializerMethodName, Optional<TypeName> listInnerType);

        R rawRequestBody(TypeName requestBodyType);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'noValuePresent'
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java
        private final Optional<T> noValuePresent;

        private DelegatingParamDecoder(Function<String, T> factory, Optional<T> noValuePresent) {
            this.factory = factory;
            this.noValuePresent = noValuePresent;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'noValuePresent'
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java

        private final Function<String, T> factory;
        private final Optional<T> noValuePresent;

        private DelegatingParamDecoder(Function<String, T> factory, Optional<T> noValuePresent) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java
    @VisibleForTesting
    static String getDefaultDecoderMethodName(
            Optional<String> className, ContainerType inputType, ContainerType outType) {
        Preconditions.checkState(
                INPUT_TYPES.contains(inputType),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'listType'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java

    private static ContainerType getOutputType(
            Optional<TypeMirror> listType, Optional<TypeMirror> setType, Optional<TypeMirror> optionalType) {
        if (listType.isPresent()) {
            return ContainerType.LIST;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'setType'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java

    private static ContainerType getOutputType(
            Optional<TypeMirror> listType, Optional<TypeMirror> setType, Optional<TypeMirror> optionalType) {
        if (listType.isPresent()) {
            return ContainerType.LIST;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalType'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java

    private static ContainerType getOutputType(
            Optional<TypeMirror> listType, Optional<TypeMirror> setType, Optional<TypeMirror> optionalType) {
        if (listType.isPresent()) {
            return ContainerType.LIST;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeBody'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java

    private static void writeResponse(
            HttpServerExchange exchange, Optional<SerializableError> maybeBody, int statusCode) {
        // Do not attempt to write the failure if data has already been written
        if (!isResponseStarted(exchange)) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cookieValue'
in `conjure-undertow-processor-example/src/main/java/com/palantir/conjure/java/undertow/example/ExampleService.java`
#### Snippet
```java

    @Handle(method = HttpMethod.GET, path = "/optionalCookie")
    String optionalCookie(@Cookie(value = "MY_COOKIE") Optional<String> cookieValue);

    @Handle(method = HttpMethod.GET, path = "/authCookie")
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cookieValue'
in `conjure-undertow-processor-example/src/main/java/com/palantir/conjure/java/undertow/example/ExampleService.java`
#### Snippet
```java

    @Handle(method = HttpMethod.GET, path = "/optionalBigIntegerCookie")
    String optionalBigIntegerCookie(@Cookie(value = "BIG_INTEGER") Optional<BigInteger> cookieValue);

    interface CustomBinaryResponseBody extends Closeable, BinaryResponseBody {}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'endpoint'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        private final List<EncodingSerializerContainer<T>> encodings;

        EncodingSerializerRegistry(List<Encoding> encodings, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encodings = encodings.stream()
                    .map(encoding -> new EncodingSerializerContainer<>(encoding, token, endpoint))
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'endpoint'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        private final TypeMarker<T> marker;

        EncodingDeserializerRegistry(List<Encoding> encodings, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encodings = encodings.stream()
                    .map(encoding -> new EncodingDeserializerContainer<>(encoding, token, endpoint))
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'endpoint'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        private final Encoding.Deserializer<T> deserializer;

        EncodingDeserializerContainer(Encoding encoding, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encoding = encoding;
            this.deserializer = endpoint.isPresent()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'endpoint'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        private final Encoding.Serializer<T> serializer;

        EncodingSerializerContainer(Encoding encoding, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encoding = encoding;
            this.serializer = endpoint.isPresent()
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/AliasGenerator.java`
#### Snippet
```java
        Optional<CodeBlock> maybeValueOfFactoryMethod =
                valueOfFactoryMethod(typeDef.getAlias(), aliasTypeName, typeMapper, options);
        if (maybeValueOfFactoryMethod.isPresent()) {
            spec.addMethod(MethodSpec.methodBuilder("valueOf")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
        Optional<CodeBlock> complexDeserializer =
                getComplexTypeStringDeserializer(type, typeMapper, resultVarName, paramsVarName, paramId);
        if (complexDeserializer.isPresent()) {
            return complexDeserializer.get();
        }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FormDataParser' used without 'try'-with-resources statement
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/FormParamDeserializer.java`
#### Snippet
```java
    @Override
    public T deserialize(HttpServerExchange exchange) throws IOException {
        FormDataParser parser = FORM_PARSER_FACTORY.createParser(exchange);
        if (parser == null) {
            throw new SafeIllegalArgumentException(
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Iterable\>' to 'java.util.Collection'
in `conjure-lib/src/main/java/com/palantir/conjure/java/lib/internal/ConjureCollections.java`
#### Snippet
```java
        Preconditions.checkNotNull(iterable, "iterable cannot be null");
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection<T>) iterable);
        }
        LinkedHashSet<T> set = new LinkedHashSet<>();
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `com.palantir.conjure.visitor.TypeVisitor.IsTypeVisitor` is inaccessible from here
in `conjure-java-core/src/main/java/com/palantir/conjure/java/visitor/MoreVisitors.java`
#### Snippet
```java
    }

    /** Copied from {@link com.palantir.conjure.visitor.TypeVisitor.IsTypeVisitor}. */
    private static class IsTypeVisitor implements Type.Visitor<Boolean> {
        @Override
```

### JavadocReference
Cannot resolve symbol `ParameterDeserializer`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ArgumentType.java`
#### Snippet
```java
public interface ArgumentType {
    interface Cases<R> {
        /** Should be handled by {@link ParameterDeserializer}. */
        R primitive(TypeName javaTypeName, String parameterSerializerMethodName, Optional<TypeName> listInnerType);

```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Javadoc.java`
#### Snippet
```java

    public static Optional<String> render(Optional<Documentation> documentation, Optional<Documentation> deprecation) {
        if (!documentation.isPresent() && !deprecation.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Javadoc.java`
#### Snippet
```java

    public static Optional<String> render(Optional<Documentation> documentation, Optional<Documentation> deprecation) {
        if (!documentation.isPresent() && !deprecation.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/Retrofit2ServiceGenerator.java`
#### Snippet
```java
                .addAnnotation(Deprecated.class)
                .addParameters(IntStream.range(0, sortedParams.size())
                        .filter(i -> !sortedMaybeExtraArgs.get(i).isPresent())
                        .mapToObj(sortedParams::get)
                        .collect(Collectors.toList()))
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/Retrofit2ServiceGenerator.java`
#### Snippet
```java

    private Optional<ParameterSpec> getAuthParameter(Optional<AuthType> auth) {
        if (!auth.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DialogueEndpointsGenerator.java`
#### Snippet
```java
        });

        if (!options.apiVersion().isPresent()) {
            enumBuilder.addField(FieldSpec.builder(
                            TypeName.get(String.class), "VERSION", Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/JerseyServiceGenerator.java`
#### Snippet
```java

    private Optional<ParameterSpec> createAuthParameter(Optional<AuthType> auth, boolean withAnnotations) {
        if (!auth.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/JerseyServiceGenerator.java`
#### Snippet
```java
                .addAnnotations(ConjureAnnotations.getClientEndpointAnnotations(endpointDef))
                .addParameters(IntStream.range(0, sortedParams.size())
                        .filter(i -> !sortedMaybeExtraArgs.get(i).isPresent())
                        .mapToObj(sortedParams::get)
                        .collect(Collectors.toList()));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
    // deserialized optional parameter.
    private Optional<String> addAuthCode(CodeBlock.Builder code, EndpointDefinition endpointDefinition) {
        if (!endpointDefinition.getAuth().isPresent()) {
            return Optional.empty();
        }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParameterType.java`
#### Snippet
```java
        SAFE,
        UNSAFE,
        UNKNOWN;
    }
}
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Stream.of()'
in `conjure-java/src/main/java/com/palantir/conjure/java/cli/CliConfiguration.java`
#### Snippet
```java
        long count = Arrays.asList(
                        generateObjects(), generateJersey(), generateRetrofit(), generateUndertow(), generateDialogue())
                .stream()
                .filter(b -> b)
                .count();
```

### SimplifyStreamApiCallChains
Can be replaced with '.keySet().stream()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/UnionGenerator.java`
#### Snippet
```java
        if (!memberTypes.isEmpty()) {
            List<AnnotationSpec> subAnnotations = memberTypes.entrySet().stream()
                    .map(entry -> AnnotationSpec.builder(JsonSubTypes.Type.class)
                            .addMember(
                                    "value",
```

### SimplifyStreamApiCallChains
Can be replaced with 'count()'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
        if (!args.stream()
                        .filter(Predicates.not(Optional::isPresent))
                        .collect(Collectors.toList())
                        .isEmpty()
                || maybeReturnType.isEmpty()) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'count()'
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
                    maybeEndpoints.stream()
                            .filter(Predicates.not(Optional::isPresent))
                            .collect(Collectors.toList())
                            .isEmpty(),
                    "Failed validation");
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'DeprecatedResource' is still used
in `conjure-undertow-processor-example/src/main/java/com/palantir/conjure/java/undertow/example/DeprecatedResource.java`
#### Snippet
```java
 */
@Deprecated
public final class DeprecatedResource {

    @Handle(method = HttpMethod.GET, path = "/deprecated/ping")
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/Retrofit2ServiceGenerator.java`
#### Snippet
```java

    private Set<ArgumentName> extractEncodedPathArgs(HttpPath path) {
        Pattern pathArg = Pattern.compile("\\{([^\\}]+)\\}");
        Matcher matcher = pathArg.matcher(path.toString());
        ImmutableSet.Builder<ArgumentName> encodedArgs = ImmutableSet.builder();
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/Retrofit2ServiceGenerator.java`
#### Snippet
```java

    private Set<ArgumentName> extractEncodedPathArgs(HttpPath path) {
        Pattern pathArg = Pattern.compile("\\{([^\\}]+)\\}");
        Matcher matcher = pathArg.matcher(path.toString());
        ImmutableSet.Builder<ArgumentName> encodedArgs = ImmutableSet.builder();
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java

    private static String normalizeTemplate(String template) {
        return template.replaceAll("\\{.*?\\}", "{param}");
    }
}
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/JerseyServiceGenerator.java`
#### Snippet
```java
        List<ArgumentDefinition> queryArgs = new ArrayList<>();

        for (ArgumentDefinition arg : endpointDef.getArgs()) {
            if (arg.getParamType().accept(ParameterTypeVisitor.IS_QUERY)
                    && arg.getType().accept(DefaultableTypeVisitor.INSTANCE)) {
                queryArgs.add(arg);
            }
        }

        List<MethodSpec> alternateMethods = new ArrayList<>();
        for (int i = 0; i < queryArgs.size(); i++) {
            alternateMethods.add(createCompatibilityBackfillMethod(
                    endpointDef,
                    safetyEvaluator,
                    returnTypeMapper,
                    argumentTypeMapper,
                    queryArgs.subList(i, queryArgs.size())));
        }

        return alternateMethods;
```

### DuplicatedCode
Duplicated code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/JerseyServiceGenerator.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder(endpointDef.getReturns().isPresent() ? "return $N(" : "$N(");
        List<Object> values = IntStream.range(0, sortedParams.size())
                .mapToObj(i -> {
                    Optional<ArgumentDefinition> maybeArgDef = sortedMaybeExtraArgs.get(i);
                    if (maybeArgDef.isPresent()) {
                        sb.append("$L, ");
                        return maybeArgDef.get().getType().accept(DefaultTypeValueVisitor.INSTANCE);
                    } else {
                        sb.append("$N, ");
                        return sortedParams.get(i);
                    }
                })
                .collect(Collectors.toList());
        // trim the end
        sb.setLength(sb.length() - 2);
        sb.append(")");

        ImmutableList<Object> methodCallArgs = ImmutableList.builder()
                .add(endpointDef.getEndpointName().get())
                .addAll(values)
                .build();

        methodBuilder.addStatement(sb.toString(), methodCallArgs.toArray(new Object[0]));

        return methodBuilder.build();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `build` is redundant
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DialogueEndpointsGenerator.java`
#### Snippet
```java
        }

        CodeBlock build = pathTemplateBuilder.add(".build()").build();
        return build;
    }
```

### UnnecessaryLocalVariable
Local variable `method` is redundant
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DefaultStaticFactoryMethodGenerator.java`
#### Snippet
```java
                "Creates a synchronous/blocking client for a $L service.",
                "Creates an " + "asynchronous/non-blocking client for a $L service.");
        MethodSpec method = MethodSpec.methodBuilder("of")
                .addModifiers(Modifier.STATIC, Modifier.PUBLIC)
                .addJavadoc(javadoc, def.getServiceName().getName())
```

## RuleId[id=Deprecation]
### Deprecation
'run(R, java.lang.String...)' is deprecated
in `conjure-java/src/main/java/com/palantir/conjure/java/cli/ConjureJavaCli.java`
#### Snippet
```java

    public static void main(String[] args) {
        CommandLine.run(new ConjureJavaCli(), args);
    }

```

### Deprecation
'getRequestCookies()' is deprecated
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAuthorizationExtractor.java`
#### Snippet
```java
    @Override
    public BearerToken cookie(HttpServerExchange exchange, String cookieName) {
        Cookie cookie = exchange.getRequestCookies().get(cookieName);
        if (cookie == null) {
            throw new ServiceException(MISSING_CREDENTIAL_ERROR_TYPE);
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'test.api' does not correspond to the file path 'com.palantir.product'
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceBlocking.java`
#### Snippet
```java
package test.api;

import com.palantir.conjure.java.lib.internal.ClientEndpoint;
```

### WrongPackageStatement
Package name 'test.api' does not correspond to the file path 'com.palantir.product'
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceAsync.java`
#### Snippet
```java
package test.api;

import com.google.common.util.concurrent.ListenableFuture;
```

### WrongPackageStatement
Package name 'test.api' does not correspond to the file path 'com.palantir.product'
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueCookieEndpoints.java`
#### Snippet
```java
package test.api;

import com.google.common.collect.ListMultimap;
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAsyncRequestProcessing.java`
#### Snippet
```java

                    @Override
                    public void onFailure(Throwable throwable) {
                        exchange.dispatch(wrapCallback(
                                serverExchange -> exceptionHandler.handle(
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `identifier` initializer `null` is redundant
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/JavaNameSanitizer.java`
#### Snippet
```java
    /** Sanitizes the given {@link FieldName} for use as a java specifier. */
    public static String sanitize(FieldName fieldName) {
        String identifier = null;
        try {
            identifier = CaseConverter.toCase(fieldName.get(), CaseConverter.Case.LOWER_CAMEL_CASE);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/DeprecationReportingResponseHandler.java`
#### Snippet
```java
 * Adds HTTP response headers to indicate endpoint deprecation.
 *
 * <p>https://tools.ietf.org/id/draft-dalal-deprecation-header-01.html#rfc.section.2.1
 */
final class DeprecationReportingResponseHandler implements HttpHandler {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/NoCachingResponseHandler.java`
#### Snippet
```java
 * Adds HTTP response headers to GET requests to disable caching.
 *
 * <p>https://tools.ietf.org/html/rfc7234#page-5 "Although caching is an entirely OPTIONAL feature of HTTP, it can be
 * assumed that reusing a cached response is desirable and that such reuse is the default behavior when no requirement
 * or local configuration prevents it."
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/WebSecurityHandler.java`
#### Snippet
```java
 * <dl>
 *   <dt>Content Security Policy (including support for IE 10 + 11)
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/CSP
 *   <dt>Referrer Policy
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/WebSecurityHandler.java`
#### Snippet
```java
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/CSP
 *   <dt>Referrer Policy
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy
 *   <dt>Content Type Options
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/WebSecurityHandler.java`
#### Snippet
```java
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy
 *   <dt>Content Type Options
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options
 *   <dt>Frame Options
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/WebSecurityHandler.java`
#### Snippet
```java
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options
 *   <dt>Frame Options
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options
 *   <dt>XSS Protection
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/WebSecurityHandler.java`
#### Snippet
```java
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options
 *   <dt>XSS Protection
 *   <dd>https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection
 * </dl>
 */
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Primitives.java`
#### Snippet
```java
        if (isPrimitive(type)) {
            List<AnnotationSpec> annotations = type.annotations;
            return PRIMITIVES.get(getPrimitiveType(type).get()).annotated(annotations);
        } else {
            return type;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/TypeFunctions.java`
#### Snippet
```java
                        }),
                        typeDefinitions)
                .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/ServiceGenerators.java`
#### Snippet
```java

    public static String getJavaDocWithRequestLine(EndpointDefinition endpointDef) {
        return getJavaDocInternal(endpointDef, true).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/UnionGenerator.java`
#### Snippet
```java
                                        sortedStageNameTypePairs(memberTypes)
                                                .findFirst()
                                                .get()
                                                .memberName),
                                TYPE_VARIABLE))
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java

        List<ArgumentDefinition> argumentDefinitions =
                args.stream().map(Optional::get).collect(Collectors.toList());

        List<ArgumentDefinition> multiPathParams = getPathMultiParams(argumentDefinitions);
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
                            .isEmpty(),
                    "Failed validation");
            return maybeEndpoints.stream().map(Optional::get).collect(Collectors.toList());
        });

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/TypeFunctions.java`
#### Snippet
```java
    public static Map<TypeName, TypeDefinition> toTypesMap(List<TypeDefinition> typeDefinitions) {
        ImmutableMap.Builder<TypeName, TypeDefinition> builder =
                ImmutableMap.builderWithExpectedSize(typeDefinitions.size());
        typeDefinitions.forEach(def -> builder.put(def.accept(TypeDefinitionVisitor.TYPE_NAME), def));
        return builder.buildOrThrow();
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/AnnotationReflector.java`
#### Snippet
```java
    @Value.Derived
    default TypeElement annotationTypeElement() {
        return MoreElements.asType(annotationMirror().getAnnotationType().asElement());
    }

```

### UnstableApiUsage
'asType(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/AnnotationReflector.java`
#### Snippet
```java
    @Value.Derived
    default TypeElement annotationTypeElement() {
        return MoreElements.asType(annotationMirror().getAnnotationType().asElement());
    }

```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
    public Optional<EndpointDefinition> tryParseEndpointDefinition(
            DeclaredType annotatedType, ExecutableElement element) {
        AnnotationReflector requestAnnotationReflector = MoreElements.getAnnotationMirror(element, Handle.class)
                .toJavaUtil()
                .map(ImmutableAnnotationReflector::of)
```

### UnstableApiUsage
'getAnnotationMirror(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
    public Optional<EndpointDefinition> tryParseEndpointDefinition(
            DeclaredType annotatedType, ExecutableElement element) {
        AnnotationReflector requestAnnotationReflector = MoreElements.getAnnotationMirror(element, Handle.class)
                .toJavaUtil()
                .map(ImmutableAnnotationReflector::of)
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
                .returns(maybeReturnType.get())
                .addAllArguments(argumentDefinitions)
                .deprecated(MoreElements.isAnnotationPresent(element, Deprecated.class)
                        || MoreElements.isAnnotationPresent(element.getEnclosingElement(), Deprecated.class))
                .addTags(requestAnnotationReflector.getAnnotationValue("tags", String[].class))
```

### UnstableApiUsage
'isAnnotationPresent(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
                .returns(maybeReturnType.get())
                .addAllArguments(argumentDefinitions)
                .deprecated(MoreElements.isAnnotationPresent(element, Deprecated.class)
                        || MoreElements.isAnnotationPresent(element.getEnclosingElement(), Deprecated.class))
                .addTags(requestAnnotationReflector.getAnnotationValue("tags", String[].class))
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
                .addAllArguments(argumentDefinitions)
                .deprecated(MoreElements.isAnnotationPresent(element, Deprecated.class)
                        || MoreElements.isAnnotationPresent(element.getEnclosingElement(), Deprecated.class))
                .addTags(requestAnnotationReflector.getAnnotationValue("tags", String[].class))
                .build());
```

### UnstableApiUsage
'isAnnotationPresent(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
                .addAllArguments(argumentDefinitions)
                .deprecated(MoreElements.isAnnotationPresent(element, Deprecated.class)
                        || MoreElements.isAnnotationPresent(element.getEnclosingElement(), Deprecated.class))
                .addTags(requestAnnotationReflector.getAnnotationValue("tags", String[].class))
                .build());
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
        DeclaredType annotatedDeclaredType = MoreTypes.asDeclared(annotatedTypeElement.asType());
        Collection<? extends Element> annotatedMethods =
                MoreElements.getAllMethods(annotatedTypeElement, types, elements).stream()
                        .filter(element -> MoreElements.getAnnotationMirror(element, Handle.class)
                                .isPresent())
```

### UnstableApiUsage
'getAllMethods(javax.lang.model.element.TypeElement, javax.lang.model.util.Types, javax.lang.model.util.Elements)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
        DeclaredType annotatedDeclaredType = MoreTypes.asDeclared(annotatedTypeElement.asType());
        Collection<? extends Element> annotatedMethods =
                MoreElements.getAllMethods(annotatedTypeElement, types, elements).stream()
                        .filter(element -> MoreElements.getAnnotationMirror(element, Handle.class)
                                .isPresent())
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
        Collection<? extends Element> annotatedMethods =
                MoreElements.getAllMethods(annotatedTypeElement, types, elements).stream()
                        .filter(element -> MoreElements.getAnnotationMirror(element, Handle.class)
                                .isPresent())
                        .collect(Collectors.toList());
```

### UnstableApiUsage
'getAnnotationMirror(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
        Collection<? extends Element> annotatedMethods =
                MoreElements.getAllMethods(annotatedTypeElement, types, elements).stream()
                        .filter(element -> MoreElements.getAnnotationMirror(element, Handle.class)
                                .isPresent())
                        .collect(Collectors.toList());
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
            EndpointDefinitions endpointDefinitions = new EndpointDefinitions(ctx, elements, types);
            List<Optional<EndpointDefinition>> maybeEndpoints = annotatedMethods.stream()
                    .map(MoreElements::asExecutable)
                    .map(element -> endpointDefinitions.tryParseEndpointDefinition(annotatedDeclaredType, element))
                    .collect(Collectors.toList());
```

### UnstableApiUsage
'asExecutable(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
            EndpointDefinitions endpointDefinitions = new EndpointDefinitions(ctx, elements, types);
            List<Optional<EndpointDefinition>> maybeEndpoints = annotatedMethods.stream()
                    .map(MoreElements::asExecutable)
                    .map(element -> endpointDefinitions.tryParseEndpointDefinition(annotatedDeclaredType, element))
                    .collect(Collectors.toList());
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java

        ClassName serviceInterface = ClassName.get(
                MoreElements.getPackage(annotatedType).getQualifiedName().toString(),
                annotatedType.getSimpleName().toString());

```

### UnstableApiUsage
'getPackage(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java

        ClassName serviceInterface = ClassName.get(
                MoreElements.getPackage(annotatedType).getQualifiedName().toString(),
                annotatedType.getSimpleName().toString());

```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
                .visibility(Visibility.of(annotatedType))
                .addAllEndpoints(endpoints)
                .deprecated(MoreElements.isAnnotationPresent(annotatedType, Deprecated.class))
                .build();

```

### UnstableApiUsage
'isAnnotationPresent(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
                .visibility(Visibility.of(annotatedType))
                .addAllEndpoints(endpoints)
                .deprecated(MoreElements.isAnnotationPresent(annotatedType, Deprecated.class))
                .build();

```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
                        roundEnv.getElementsAnnotatedWith(Handle.Generate.class).stream())
                .distinct()
                .filter(element -> MoreElements.getAnnotationMirror(element, Handle.Generate.class)
                        .toJavaUtil()
                        .map(mirror -> ImmutableAnnotationReflector.of(mirror).getAnnotationValue(Boolean.class))
```

### UnstableApiUsage
'getAnnotationMirror(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
                        roundEnv.getElementsAnnotatedWith(Handle.Generate.class).stream())
                .distinct()
                .filter(element -> MoreElements.getAnnotationMirror(element, Handle.Generate.class)
                        .toJavaUtil()
                        .map(mirror -> ImmutableAnnotationReflector.of(mirror).getAnnotationValue(Boolean.class))
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java
        for (AnnotationMirror annotationMirror : variableElement.getAnnotationMirrors()) {
            TypeElement annotationTypeElement =
                    MoreElements.asType(annotationMirror.getAnnotationType().asElement());
            if (SUPPORTED_ANNOTATIONS.contains(
                    annotationTypeElement.getQualifiedName().toString())) {
```

### UnstableApiUsage
'asType(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java
        for (AnnotationMirror annotationMirror : variableElement.getAnnotationMirrors()) {
            TypeElement annotationTypeElement =
                    MoreElements.asType(annotationMirror.getAnnotationType().asElement());
            if (SUPPORTED_ANNOTATIONS.contains(
                    annotationTypeElement.getQualifiedName().toString())) {
```

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java
        if (log.isDebugEnabled()) {
            log.debug("Quality-of-Service error handling request", qosException);
        } else if (qosExceptionHasAdditionalMetadata(qosException) || qosLoggingRateLimiter.tryAcquire()) {
            log.info("Quality-of-Service error handling request", qosException);
        }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java

    // Log at most once every second
    private static final RateLimiter qosLoggingRateLimiter = RateLimiter.create(1);

    @Override
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java

    // Log at most once every second
    private static final RateLimiter qosLoggingRateLimiter = RateLimiter.create(1);

    @Override
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java

    // Log at most once every second
    private static final RateLimiter qosLoggingRateLimiter = RateLimiter.create(1);

    @Override
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/DefaultSerDe.java`
#### Snippet
```java
                    responseBody -> {
                        try (value) {
                            value.transferTo(responseBody);
                        }
                    },
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureContexts.java`
#### Snippet
```java
            if (sslSession != null) {
                try {
                    return ImmutableList.copyOf(sslSession.getPeerCertificates());
                } catch (SSLPeerUnverifiedException e) {
                    log.debug("Failed to extract peer certificates", e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
            // to deserialize.
            PushbackInputStream requestStream = new PushbackInputStream(exchange.getInputStream(), 1);
            int firstByte = requestStream.read();
            if (firstByte == -1) {
                return TypeMarkers.getEmptyOptional(marker);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
            }
            // Otherwise reset the request stream and deserialize normally.
            requestStream.unread(firstByte);
            return deserializeInternal(exchange, requestStream);
        }
```

