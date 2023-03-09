# conjure-java 
 
# Bad smells
I found 243 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 54 | false |
| OptionalUsedAsFieldOrParameterType | 44 | false |
| JavaLangImport | 38 | false |
| UnstableApiUsage | 27 | false |
| SimplifyOptionalCallChains | 8 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| EmptyMethod | 6 | false |
| ReturnNull | 6 | false |
| OptionalGetWithoutIsPresent | 6 | false |
| StaticPseudoFunctionalStyleMethod | 5 | false |
| ZeroLengthArrayInitialization | 5 | false |
| SimplifyStreamApiCallChains | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| RegExpRedundantEscape | 3 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| WrongPackageStatement | 3 | false |
| OptionalIsPresent | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| RedundantSuppression | 2 | false |
| SystemOutErr | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| CodeBlock2Expr | 2 | true |
| UnnecessaryLocalVariable | 2 | true |
| ReplaceInefficientStreamCount | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| RedundantFieldInitialization | 1 | false |
| UnusedAssignment | 1 | false |
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

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.anyMatch()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
                .addStatement("this.$N = true", BUILT_FIELD);

        if (enrichedFields.stream().filter(EnrichedField::isPrimitive).count() != 0) {
            method.addStatement("validatePrimitiveFieldsHaveBeenInitialized()");
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

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/EnumGenerator.java`
#### Snippet
```java
    private static Iterable<FieldSpec> createConstants(
            Iterable<EnumValueDefinition> values, ClassName thisClass, ClassName enumClass) {
        return Iterables.transform(values, v -> {
            FieldSpec.Builder fieldSpec = FieldSpec.builder(
                            thisClass, v.getValue(), Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java

    private boolean hasPathArgument(List<ArgumentDefinition> args) {
        return Iterables.any(args, arg -> arg.getParamType().accept(ParameterTypeVisitor.IS_PATH));
    }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java

    private boolean hasQueryArgument(List<ArgumentDefinition> args) {
        return Iterables.any(args, arg -> arg.getParamType().accept(ParameterTypeVisitor.IS_QUERY));
    }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
                        .addStatement("return $1T.of($2L)", ImmutableList.class, endpointBlock)
                        .build())
                .addTypes(Lists.transform(
                        serviceDefinition.getEndpoints(),
                        e -> generateEndpointHandler(
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java

    private boolean hasHeaderArgument(List<ArgumentDefinition> args) {
        return Iterables.any(args, arg -> arg.getParamType().accept(ParameterTypeVisitor.IS_HEADER));
    }

```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `SpecializeBinaryClassNameVisitor` on 'this' is unnecessary in this context
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SpecializeBinaryClassNameVisitor.java`
#### Snippet
```java
        return TypeFunctions.getReferencedType(typeName, types)
                .flatMap(this::dealiasBinary)
                .map(value -> value.accept(SpecializeBinaryClassNameVisitor.this))
                .orElseGet(() -> delegate.visitReference(typeName));
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/Javadoc.java`
#### Snippet
```java
        documentation.map(Javadoc::render).ifPresent(sb::append);
        deprecation.map(Javadoc::getDeprecatedJavadoc).ifPresent(sb::append);
        return sb.length() > 0 ? Optional.of(sb.toString()) : Optional.empty();
    }

```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/ServiceGenerators.java`
#### Snippet
```java
        depr.ifPresent(sb::append);
        incDoc.ifPresent(sb::append);
        return sb.length() > 0 ? Optional.of(sb.toString()) : Optional.empty();
    }

```

### SizeReplaceableByIsEmpty
`encodings.size() > 0` can be replaced with '!encodings.isEmpty()'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        this.encodings =
                encodings.stream().map(LazilyInitializedEncoding::new).collect(ImmutableList.toImmutableList());
        Preconditions.checkArgument(encodings.size() > 0, "At least one Encoding is required");
    }

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SafeLong` has no concrete subclass
in `conjure-lib/src/main/java/com/palantir/conjure/java/lib/SafeLong.java`
#### Snippet
```java
/** A wrapper around a long which is safe for json-serialization as a number without loss of precision. */
@Value.Immutable
public abstract class SafeLong implements Comparable<SafeLong> {

    private static final long MIN_SAFE_VALUE = -(1L << 53) + 1;
```

### AbstractClassNeverImplemented
Abstract class `DefaultParamDecoder` has no concrete subclass
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/DefaultParamDecoder.java`
#### Snippet
```java

/** Marker interface to appease the compiler. Not used at runtime. */
public abstract class DefaultParamDecoder implements ParamDecoder<Object>, CollectionParamDecoder<Object> {
    private DefaultParamDecoder() {}
}
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Generator`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/GenerationCoordinator.java`
#### Snippet
```java
    private final Set<Generator> generators;

    public GenerationCoordinator(Executor executor, Set<Generator> generators) {
        this.executor = executor;
        this.generators = generators;
```

### BoundedWildcard
Can generalize to `? super CodeBlock`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/AliasGenerator.java`
#### Snippet
```java

    private static MethodSpec createCompareTo(
            TypeName aliasType, BiFunction<CodeBlock, CodeBlock, CodeBlock> comparisonFunc) {
        return MethodSpec.methodBuilder("compareTo")
                .addModifiers(Modifier.PUBLIC)
```

### BoundedWildcard
Can generalize to `? super CodeBlock`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/AliasGenerator.java`
#### Snippet
```java

    private static MethodSpec createCompareTo(
            TypeName aliasType, BiFunction<CodeBlock, CodeBlock, CodeBlock> comparisonFunc) {
        return MethodSpec.methodBuilder("compareTo")
                .addModifiers(Modifier.PUBLIC)
```

### BoundedWildcard
Can generalize to `? super TypeName`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java
        private final Type.Visitor<Optional<LogSafety>> fieldVisitor;

        private TypeDefinitionSafetyVisitor(Map<TypeName, TypeDefinition> definitionMap, Set<TypeName> inProgress) {
            this.inProgress = inProgress;
            this.fieldVisitor = new FieldSafetyVisitor(definitionMap, this);
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java

    private MethodSpec createBuild(
            Collection<EnrichedField> enrichedFields, Collection<FieldSpec> fields, boolean override) {
        MethodSpec.Builder method = MethodSpec.methodBuilder("build")
                .addAnnotations(ConjureAnnotations.override(override))
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
    }

    private Collection<FieldSpec> primitivesInitializedFields(Collection<EnrichedField> enrichedFields) {
        return enrichedFields.stream()
                .filter(EnrichedField::isPrimitive)
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
    }

    private static MethodSpec createValidateFieldsMethod(List<EnrichedField> primitives) {
        MethodSpec.Builder builder = MethodSpec.methodBuilder("validatePrimitiveFieldsHaveBeenInitialized")
                .addModifiers(Modifier.PRIVATE);
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java

    private Iterable<MethodSpec> createSetters(
            Collection<EnrichedField> fields,
            Map<com.palantir.conjure.spec.TypeName, TypeDefinition> typesMap,
            boolean override) {
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
    }

    private MethodSpec createFromObject(Collection<EnrichedField> enrichedFields, boolean override) {
        CodeBlock assignmentBlock = CodeBlocks.of(Collections2.transform(
                enrichedFields,
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
    }

    private Collection<MethodSpec> maybeCreateValidateFieldsMethods(Collection<EnrichedField> enrichedFields) {
        List<EnrichedField> primitives =
                enrichedFields.stream().filter(EnrichedField::isPrimitive).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super Optional`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DialogueInterfaceGenerator.java`
#### Snippet
```java
    }

    private MethodSpec apiMethod(EndpointDefinition endpointDef, Function<Optional<Type>, TypeName> returnTypeMapper) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(
                        endpointDef.getEndpointName().get())
```

### BoundedWildcard
Can generalize to `? extends TypeName`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DialogueInterfaceGenerator.java`
#### Snippet
```java
    }

    private MethodSpec apiMethod(EndpointDefinition endpointDef, Function<Optional<Type>, TypeName> returnTypeMapper) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(
                        endpointDef.getEndpointName().get())
```

### BoundedWildcard
Can generalize to `? super HttpServerExchange`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/SafeExchangeCompletionListener.java`
#### Snippet
```java
    private final Consumer<HttpServerExchange> action;

    private SafeExchangeCompletionListener(Consumer<HttpServerExchange> action) {
        this.action = action;
    }
```

### BoundedWildcard
Can generalize to `? extends SerializableError`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java

    private static void writeResponse(
            HttpServerExchange exchange, Optional<SerializableError> maybeBody, int statusCode) {
        // Do not attempt to write the failure if data has already been written
        if (!isResponseStarted(exchange)) {
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanGenerator.java`
#### Snippet
```java
        }

        static ImmutableList<FieldSpec> toPoetSpecs(Collection<EnrichedField> fields) {
            return fields.stream().map(EnrichedField::poetSpec).collect(ImmutableList.toImmutableList());
        }
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanGenerator.java`
#### Snippet
```java
    }

    private static boolean useCachedHashCode(Collection<EnrichedField> fields) {
        if (fields.size() == 1) {
            EnrichedField field = Iterables.getOnlyElement(fields);
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanGenerator.java`
#### Snippet
```java
            TypeMapper typeMapper,
            ImmutableList<EnrichedField> fieldsNeedingBuilderStage,
            ImmutableList<EnrichedField> otherFields,
            SafetyEvaluator safetyEvaluator) {
        List<TypeSpec.Builder> interfaces = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanGenerator.java`
#### Snippet
```java
    }

    private static MethodSpec createValidateFields(Collection<EnrichedField> fields) {
        MethodSpec.Builder builder =
                MethodSpec.methodBuilder("validateFields").addModifiers(Modifier.PRIVATE, Modifier.STATIC);
```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanGenerator.java`
#### Snippet
```java
    }

    private static MethodSpec createConstructor(Collection<EnrichedField> fields, Collection<FieldSpec> poetFields) {
        MethodSpec.Builder builder = MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE);

```

### BoundedWildcard
Can generalize to `? extends EnrichedField`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanGenerator.java`
#### Snippet
```java

    private static Collection<MethodSpec> createGetters(
            Collection<EnrichedField> fields,
            Map<com.palantir.conjure.spec.TypeName, TypeDefinition> typesMap,
            Options featureFlags,
```

### BoundedWildcard
Can generalize to `? extends Endpoint`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java
        @Deprecated
        @CanIgnoreReturnValue
        public Builder addAllEndpoints(Iterable<Endpoint> values) {
            Preconditions.checkNotNull(values, "Values is required");
            for (Endpoint endpoint : values) {
```

### BoundedWildcard
Can generalize to `? extends Endpoint`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java
    }

    private static void registerOptionsEndpoints(RoutingHandler routingHandler, List<Endpoint> endpoints) {
        endpoints.stream()
                .collect(ImmutableSetMultimap.toImmutableSetMultimap(
```

### BoundedWildcard
Can generalize to `? extends EndpointHandlerWrapper`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java
        }

        private static Endpoint wrap(Endpoint input, List<EndpointHandlerWrapper> wrappers) {
            Endpoint current = input;
            for (EndpointHandlerWrapper wrapper : wrappers) {
```

### BoundedWildcard
Can generalize to `? extends Endpoint`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java
    }

    private static List<Endpoint> applyHeadEndpoints(RoutingHandler routingHandler, List<Endpoint> endpoints) {
        List<Endpoint> result = new ArrayList<>(endpoints.size());
        for (Endpoint endpoint : endpoints) {
```

### BoundedWildcard
Can generalize to `? extends Endpoint`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java
        }

        private static void checkOverlappingPaths(List<Endpoint> endpoints) {
            Set<String> duplicates = endpoints.stream()
                    .collect(Collectors.groupingBy(endpoint ->
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/TracedEncoding.java`
#### Snippet
```java
        private final ImmutableMap<String, String> tags;

        TracedDeserializer(Deserializer<T> delegate, String operation, ImmutableMap<String, String> tags) {
            this.delegate = delegate;
            this.operation = operation;
```

### BoundedWildcard
Can generalize to `? super T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/TracedEncoding.java`
#### Snippet
```java
        private final ImmutableMap<String, String> tags;

        TracedSerializer(Serializer<T> delegate, String operation, ImmutableMap<String, String> tags) {
            this.delegate = delegate;
            this.operation = operation;
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAsyncRequestProcessing.java`
#### Snippet
```java

    private <T> void writeCompleteFuture(
            ListenableFuture<T> future, ReturnValueWriter<T> returnValueWriter, HttpServerExchange exchange)
            throws IOException {
        try {
```

### BoundedWildcard
Can generalize to `? super T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAsyncRequestProcessing.java`
#### Snippet
```java

    private <T> void writeCompleteFuture(
            ListenableFuture<T> future, ReturnValueWriter<T> returnValueWriter, HttpServerExchange exchange)
            throws IOException {
        try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAsyncRequestProcessing.java`
#### Snippet
```java

    private <T> void registerCallback(
            ListenableFuture<T> future,
            ReturnValueWriter<T> returnValueWriter,
            Duration requestAsyncTimeout,
```

### BoundedWildcard
Can generalize to `? super T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAsyncRequestProcessing.java`
#### Snippet
```java
    private <T> void registerCallback(
            ListenableFuture<T> future,
            ReturnValueWriter<T> returnValueWriter,
            Duration requestAsyncTimeout,
            HttpServerExchange exchange) {
```

### BoundedWildcard
Can generalize to `? extends FormValue`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/FormParamDeserializer.java`
#### Snippet
```java
    }

    private Collection<String> getValues(Deque<FormValue> maybeValues) {
        if (maybeValues == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        private final TypeMarker<T> marker;

        EncodingDeserializerRegistry(List<Encoding> encodings, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encodings = encodings.stream()
                    .map(encoding -> new EncodingDeserializerContainer<>(encoding, token, endpoint))
```

### BoundedWildcard
Can generalize to `? super Optional`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/DefaultSerDe.java`
#### Snippet
```java
        private final Serializer<Optional<T>> delegate;

        OptionalDelegatingSerializer(Serializer<Optional<T>> delegate) {
            this.delegate = delegate;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/DefaultSerDe.java`
#### Snippet
```java
        private final Serializer<T> delegate;

        OptionalValueDelegatingSerializer(Serializer<T> delegate) {
            this.delegate = delegate;
        }
```

### BoundedWildcard
Can generalize to `? extends TypeName`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/UnionGenerator.java`
#### Snippet
```java
    }

    private static List<MethodSpec> generateMemberVisitMethods(Map<FieldDefinition, TypeName> memberTypes) {
        return memberTypes.entrySet().stream()
                .map(entry -> {
```

### BoundedWildcard
Can generalize to `? extends TypeName`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/UnionGenerator.java`
#### Snippet
```java
    }

    private static Stream<NameTypeMetadata> sortedStageNameTypePairs(Map<FieldDefinition, TypeName> memberTypes) {
        return Stream.concat(
                memberTypes.entrySet().stream()
```

### BoundedWildcard
Can generalize to `? extends ArgumentDefinition`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/EndpointDefinitions.java`
#### Snippet
```java
    }

    private static List<ArgumentDefinition> getPathMultiParams(List<ArgumentDefinition> argumentDefinitions) {
        return argumentDefinitions.stream()
                .filter(definition -> IS_PATH_MULTI_PARAMETER.apply(definition.paramType()))
```

### BoundedWildcard
Can generalize to `? super DefaultErrorContext`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
    }

    private void validationStep(Consumer<DefaultErrorContext> validationFunction) {
        processingStep(ctx -> {
            validationFunction.accept(ctx);
```

### BoundedWildcard
Can generalize to `? super DefaultErrorContext`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
    }

    private <T> T processingStep(Function<DefaultErrorContext, T> stepFunction) {
        try (DefaultErrorContext ctx = new DefaultErrorContext(messager)) {
            return stepFunction.apply(ctx);
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/AnnotationReflector.java`
#### Snippet
```java
    }

    default <T> Optional<T> getFieldMaybe(String fieldName, Class<T> valueClazz) {
        Preconditions.checkArgument(
                methods().containsKey(fieldName),
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java
    }

    public static <T> ParamDecoder<T> complexParamDecoder(PlainSerDe serde, Function<String, T> factory) {
        return DelegatingParamDecoder.of(value -> serde.deserializeComplex(value, factory));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java

    public static <T> CollectionParamDecoder<T> complexCollectionParamDecoder(
            PlainSerDe serde, Function<String, T> factory) {
        return DelegatingCollectionParamDecoder.of(value -> serde.deserializeComplex(value, factory));
    }
```

### BoundedWildcard
Can generalize to `? super Collection`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java
        private final Function<Collection<String>, T> factory;

        private DelegatingCollectionParamDecoder(Function<Collection<String>, T> factory) {
            this.factory = factory;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java
        private final Function<Collection<String>, T> factory;

        private DelegatingCollectionParamDecoder(Function<Collection<String>, T> factory) {
            this.factory = factory;
        }
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java
        private final Optional<T> noValuePresent;

        private DelegatingParamDecoder(Function<String, T> factory, Optional<T> noValuePresent) {
            this.factory = factory;
            this.noValuePresent = noValuePresent;
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java
        private final Optional<T> noValuePresent;

        private DelegatingParamDecoder(Function<String, T> factory, Optional<T> noValuePresent) {
            this.factory = factory;
            this.noValuePresent = noValuePresent;
```

### BoundedWildcard
Can generalize to `? super ArgumentDefinition`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
            ParameterType.Visitor<Boolean> paramTypeVisitor,
            String paramsVarName,
            Function<ArgumentDefinition, String> toParamId,
            Map<com.palantir.conjure.spec.TypeName, TypeDefinition> typeDefinitions,
            TypeMapper typeMapper,
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjurePlainSerDe.java`
#### Snippet
```java

    @Override
    public <T> T deserializeComplex(@Nullable Iterable<String> in, Function<String, T> factory) {
        return factory.apply(deserializeString(in));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjurePlainSerDe.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> deserializeOptionalComplex(@Nullable Iterable<String> in, Function<String, T> factory) {
        return deserializeOptionalString(in).map(factory);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjurePlainSerDe.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> deserializeOptionalComplex(@Nullable Iterable<String> in, Function<String, T> factory) {
        return deserializeOptionalString(in).map(factory);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjurePlainSerDe.java`
#### Snippet
```java

    @Override
    public <T> Set<T> deserializeComplexSet(@Nullable Iterable<String> in, Function<String, T> factory) {
        if (in == null) {
            return Collections.emptySet();
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjurePlainSerDe.java`
#### Snippet
```java

    @Override
    public <T> List<T> deserializeComplexList(@Nullable Iterable<String> in, Function<String, T> factory) {
        if (in == null) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjurePlainSerDe.java`
#### Snippet
```java

    @Override
    public <T> T deserializeComplex(@Nullable String in, Function<String, T> factory) {
        return factory.apply(deserializeString(checkArgumentNotNull(in)));
    }
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/DefaultClassNameVisitor.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("CyclomaticComplexity")
    public TypeName visitOptional(OptionalType type) {
        if (type.getItemType().accept(TypeVisitor.IS_PRIMITIVE)) {
            PrimitiveType primitiveType = type.getItemType().accept(TypeVisitor.PRIMITIVE);
```

### RedundantSuppression
Redundant suppression
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ArgumentTypesResolver.java`
#### Snippet
```java

    @SuppressWarnings("CyclomaticComplexity")
    private ArgumentType getArgumentTypeImpl(Element paramContext, TypeMirror actualTypeMirror) {
        TypeName typeName = TypeName.get(actualTypeMirror);
        Optional<OptionalType> optionalType = getOptionalType(paramContext, actualTypeMirror);
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

    public static TypeName widenParameterIfPossible(
            TypeName current, Type type, TypeMapper typeMapper, Optional<LogSafety> safety) {
        if (type.accept(TypeVisitor.IS_LIST)) {
            Type innerType = type.accept(TypeVisitor.LIST).getItemType();
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
`Optional` used as type for field 'timeout'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowTypeFunctions.java`
#### Snippet
```java

    static final class AsyncRequestProcessingMetadata {
        private final Optional<HumanReadableDuration> timeout;

        AsyncRequestProcessingMetadata() {
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
`Optional` used as type for parameter 'builderInterfaceClass'
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/BeanBuilderGenerator.java`
#### Snippet
```java
            Map<com.palantir.conjure.spec.TypeName, TypeDefinition> typesMap,
            Options options,
            Optional<ClassName> builderInterfaceClass) {
        return new BeanBuilderGenerator(typeMapper, safetyEvaluator, builderClass, objectClass, options)
                .generate(typeDef, typesMap, builderInterfaceClass);
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
            ObjectDefinition typeDef,
            Map<com.palantir.conjure.spec.TypeName, TypeDefinition> typesMap,
            Optional<ClassName> builderInterfaceClass) {
        Collection<EnrichedField> enrichedFields = enrichFields(typeDef.getFields());
        Collection<FieldSpec> poetFields = EnrichedField.toPoetSpecs(enrichedFields);
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
`Optional` used as type for parameter 'endpoint'
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureBodySerDe.java`
#### Snippet
```java
        private final Encoding.Serializer<T> serializer;

        EncodingSerializerContainer(Encoding encoding, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encoding = encoding;
            this.serializer = endpoint.isPresent()
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
        private final List<EncodingSerializerContainer<T>> encodings;

        EncodingSerializerRegistry(List<Encoding> encodings, TypeMarker<T> token, Optional<Endpoint> endpoint) {
            this.encodings = encodings.stream()
                    .map(encoding -> new EncodingSerializerContainer<>(encoding, token, endpoint))
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
`Optional` used as type for field 'noValuePresent'
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/ParamDecoders.java`
#### Snippet
```java

        private final Function<String, T> factory;
        private final Optional<T> noValuePresent;

        private DelegatingParamDecoder(Function<String, T> factory, Optional<T> noValuePresent) {
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `conjure-java/src/main/java/com/palantir/conjure/java/cli/ConjureJavaCli.java`
#### Snippet
```java
    @Override
    public void run() {
        CommandLine.usage(this, System.out);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `conjure-java/src/main/java/com/palantir/conjure/java/cli/ConjureJavaCli.java`
#### Snippet
```java
            CliConfiguration config = getConfiguration();
            if (config.generateObjects() && !config.options().useImmutableBytes()) {
                System.err.println("[WARNING] Using deprecated ByteBuffer codegen, please enable the "
                        + "--useImmutableBytes feature flag to opt into the preferred implementation");
            }
```

## RuleId[id=JavaLangImport]
### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueEmptyPathEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.PathTemplate;
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueEmptyPathEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueEteBinaryEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.PathTemplate;
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueEteBinaryEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteBinaryServiceBlocking.java`
#### Snippet
```java
import com.palantir.tokens.auth.AuthHeader;
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteBinaryServiceBlocking.java`
#### Snippet
```java
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceBlocking.java`
#### Snippet
```java
import com.palantir.dialogue.Request;
import com.palantir.tokens.auth.BearerToken;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceBlocking.java`
#### Snippet
```java
import com.palantir.tokens.auth.BearerToken;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceBlocking.java`
#### Snippet
```java
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import com.palantir.tokens.auth.BearerToken;
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.time.OffsetDateTime;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceBlocking.java`
#### Snippet
```java
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.time.OffsetDateTime;
import java.util.List;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EmptyPathServiceBlocking.java`
#### Snippet
```java
import com.palantir.dialogue.Request;
import com.palantir.dialogue.TypeMarker;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EmptyPathServiceBlocking.java`
#### Snippet
```java
import com.palantir.dialogue.TypeMarker;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EmptyPathServiceBlocking.java`
#### Snippet
```java
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EmptyPathServiceAsync.java`
#### Snippet
```java
import com.palantir.dialogue.Request;
import com.palantir.dialogue.TypeMarker;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EmptyPathServiceAsync.java`
#### Snippet
```java
import com.palantir.dialogue.TypeMarker;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EmptyPathServiceAsync.java`
#### Snippet
```java
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import com.palantir.tokens.auth.BearerToken;
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.time.OffsetDateTime;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteServiceAsync.java`
#### Snippet
```java
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.time.OffsetDateTime;
import java.util.List;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteBinaryServiceAsync.java`
#### Snippet
```java
import com.palantir.tokens.auth.AuthHeader;
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteBinaryServiceAsync.java`
#### Snippet
```java
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceAsync.java`
#### Snippet
```java
import com.palantir.dialogue.Request;
import com.palantir.tokens.auth.BearerToken;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceAsync.java`
#### Snippet
```java
import com.palantir.tokens.auth.BearerToken;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/CookieServiceAsync.java`
#### Snippet
```java
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueCookieEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.PathTemplate;
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueCookieEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import javax.annotation.processing.Generated;

```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueEteEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.PathTemplate;
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import java.util.Set;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `conjure-java-core/src/integrationInput/java/com/palantir/product/DialogueEteEndpoints.java`
#### Snippet
```java
import com.palantir.dialogue.UrlBuilder;
import java.lang.Override;
import java.lang.String;
import java.util.Set;
import javax.annotation.processing.Generated;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/Names.java`
#### Snippet
```java

    public static ClassName endpointsClassName(ServiceDefinition def, Options options) {
        String simpleName = "Dialogue" + def.getServiceName().getName().replaceAll("Service$", "") + "Endpoints";
        return maybeRelocate(def, options, simpleName);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureHandler.java`
#### Snippet
```java

    private static String normalizeTemplate(String template) {
        return template.replaceAll("\\{.*?\\}", "{param}");
    }
}
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
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
    // deserialized optional parameter.
    private Optional<String> addAuthCode(CodeBlock.Builder code, EndpointDefinition endpointDefinition) {
        if (!endpointDefinition.getAuth().isPresent()) {
            return Optional.empty();
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.logsafe` is unnecessary, and can be replaced with an import
in `conjure-java-core/src/main/java/com/palantir/conjure/java/util/TypeFunctions.java`
#### Snippet
```java
    // (reference) type.
    public static Type getReferencedType(Type type, Map<TypeName, TypeDefinition> typeDefinitions) {
        com.palantir.logsafe.Preconditions.checkArgument(
                isReferenceType(type), "Expected a reference", SafeArg.of("type", type));
        return getReferencedType(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.spec` is unnecessary, and can be replaced with an import
in `conjure-java-core/src/main/java/com/palantir/conjure/java/visitor/DefaultTypeVisitor.java`
#### Snippet
```java

    @Override
    public T visitReference(com.palantir.conjure.spec.TypeName _value) {
        return visitDefault();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `conjure-java-core/src/main/java/com/palantir/conjure/java/types/SafetyEvaluator.java`
#### Snippet
```java

        @Override
        public java.lang.Boolean visitPrimitive(PrimitiveType value) {
            return !value.equals(PrimitiveType.BEARERTOKEN);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `io.undertow.server` is unnecessary and can be removed
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/EndpointHandlerWrapper.java`
#### Snippet
```java
 * Adding logic pre and post handling by the next handlers, by adding the logic before and after
 * {@link HttpHandler#handleRequest(HttpServerExchange)} - Adding logic post completion of the request by all handlers
 * {@link io.undertow.server.HttpServerExchange#addExchangeCompleteListener(ExchangeCompletionListener)} - Catching and
 * handling exceptions surrounding {@link HttpHandler#handleRequest(HttpServerExchange)} with try ... catch ... finally.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.java.undertow.annotations` is unnecessary and can be removed
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/data/ParamTypesResolver.java`
#### Snippet
```java
    /**
     * Generates the corresponding factory invocation for a default decoder as declared in
     * {@link com.palantir.conjure.java.undertow.annotations.ParamDecoders}.
     *
     * E.g. calling {@code getDefaultDecoderMethodName(String, LIST, OPTIONAL} will return
```

### UnnecessaryFullyQualifiedName
Qualifier `io.undertow.util` is unnecessary, and can be replaced with an import
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
                    PATH_PARAMS_VAR_NAME,
                    EXCHANGE_VAR_NAME,
                    io.undertow.util.PathTemplateMatch.class);
            code.add(generatePathParameterCodeBlock(endpointDefinition, typeDefinitions, typeMapper, safetyEvaluator));
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `io.undertow.util` is unnecessary, and can be replaced with an import
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
            code.addStatement(
                    "$1T $2N = $3N.getRequestHeaders()",
                    io.undertow.util.HeaderMap.class,
                    HEADER_PARAMS_VAR_NAME,
                    EXCHANGE_VAR_NAME);
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/dialogue/DialogueEndpointsGenerator.java`
#### Snippet
```java
                .addAnnotation(ConjureAnnotations.getConjureGeneratedAnnotation(DialogueEndpointsGenerator.class));

        def.getEndpoints().forEach(endpoint -> {
            enumBuilder.addEnumConstant(
                    endpoint.getEndpointName().get(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureExceptions.java`
#### Snippet
```java
                @Override
                public Consumer<HttpServerExchange> visit(QosException.Throttle exception) {
                    return exchange -> exception.getRetryAfter().ifPresent(duration -> {
                        exchange.getResponseHeaders()
                                .put(Headers.RETRY_AFTER, Long.toString(duration.get(ChronoUnit.SECONDS)));
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `types` is accessed in both synchronized and unsynchronized contexts
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
    private Filer filer;
    private Elements elements;
    private Types types;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `elements` is accessed in both synchronized and unsynchronized contexts
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messager` is accessed in both synchronized and unsynchronized contexts
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
public final class ConjureUndertowAnnotationProcessor extends AbstractProcessor {

    private Messager messager;
    private Filer filer;
    private Elements elements;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `filer` is accessed in both synchronized and unsynchronized contexts
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java

    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteService.java`
#### Snippet
```java
    @Path("base/no-return")
    @ClientEndpoint(method = "POST", path = "/base/no-return")
    void noReturn(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteService.java`
#### Snippet
```java
    @Path("base/datasets/{datasetRid}/strings")
    @ClientEndpoint(method = "GET", path = "/base/datasets/{datasetRid}/strings")
    void complexQueryParameters(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @PathParam("datasetRid") ResourceIdentifier datasetRid,
```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteService.java`
#### Snippet
```java
    @Path("base/list/optionals")
    @ClientEndpoint(method = "PUT", path = "/base/list/optionals")
    void receiveListOfOptionals(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader, @NotNull List<Optional<String>> value);

```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteService.java`
#### Snippet
```java
    @Path("base/set/optionals")
    @ClientEndpoint(method = "PUT", path = "/base/set/optionals")
    void receiveSetOfOptionals(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader, @NotNull Set<Optional<String>> value);

```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-core/src/integrationInput/java/com/palantir/product/EteService.java`
#### Snippet
```java
    @Path("base/list/strings")
    @ClientEndpoint(method = "PUT", path = "/base/list/strings")
    void receiveListOfStrings(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader, @NotNull List<String> value);

```

### EmptyMethod
All implementations of this method are empty
in `conjure-undertow-processor-example/src/main/java/com/palantir/conjure/java/undertow/example/ExampleService.java`
#### Snippet
```java

    @Handle(method = HttpMethod.GET, path = "/simple")
    void simple();

    @Handle(method = HttpMethod.GET, path = "/ping")
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java

        private final Messager messager;
        private volatile boolean errors = false;

        private DefaultErrorContext(Messager messager) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/ConjureMarkers.java`
#### Snippet
```java
    public static Optional<LogSafety> markerSafety(ArgumentDefinition argument) {
        ImmutableList<LogSafety> markerSafety = argument.getMarkers().stream()
                .map(type -> type.accept(TypeVisitor.IS_REFERENCE) ? type.accept(TypeVisitor.REFERENCE) : null)
                .map(typeName -> {
                    if (SAFE_TYPE_NAME.equals(typeName)) {
```

### ReturnNull
Return of `null`
in `conjure-java-core/src/main/java/com/palantir/conjure/java/ConjureMarkers.java`
#### Snippet
```java
                        return LogSafety.UNSAFE;
                    }
                    return null;
                })
                .filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `conjure-java-undertow-runtime/src/main/java/com/palantir/conjure/java/undertow/runtime/ConjureAsyncRequestProcessing.java`
#### Snippet
```java
                exceptionHandler.handle(exchange, t);
            }
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/DefaultSerDe.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-undertow-annotations/src/main/java/com/palantir/conjure/java/undertow/annotations/DefaultSerDe.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/ConjureUndertowAnnotationProcessor.java`
#### Snippet
```java
        processingStep(ctx -> {
            validationFunction.accept(ctx);
            return null;
        });
    }
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/JerseyServiceGenerator.java`
#### Snippet
```java
                .build();

        methodBuilder.addStatement(sb.toString(), methodCallArgs.toArray(new Object[0]));

        return methodBuilder.build();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/Retrofit2ServiceGenerator.java`
#### Snippet
```java
                .build();

        methodBuilder.addStatement(sb.toString(), methodCallArgs.toArray(new Object[0]));

        return methodBuilder.build();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-undertow-processor/src/main/java/com/palantir/conjure/java/undertow/processor/generate/ConjureUndertowEndpointsGenerator.java`
#### Snippet
```java
            if (collectionClass != null) {
                return ParameterizedTypeName.get(
                        ClassName.get(collectionClass), parameterized.typeArguments.toArray(new TypeName[0]));
            }
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
            if (LIST_NAME.equals(parameterized.rawType)) {
                return ParameterizedTypeName.get(
                        IMMUTABLE_LIST_NAME, parameterized.typeArguments.toArray(new TypeName[0]));
            } else if (SET_NAME.equals(parameterized.rawType)) {
                return ParameterizedTypeName.get(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-java-core/src/main/java/com/palantir/conjure/java/services/UndertowServiceHandlerGenerator.java`
#### Snippet
```java
            } else if (SET_NAME.equals(parameterized.rawType)) {
                return ParameterizedTypeName.get(
                        IMMUTABLE_SET_NAME, parameterized.typeArguments.toArray(new TypeName[0]));
            }
        }
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

