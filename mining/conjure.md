# conjure 
 
# Bad smells
I found 43 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 13 | false |
| JavadocReference | 7 | false |
| DuplicatedCode | 4 | false |
| FieldMayBeFinal | 3 | false |
| BlockingMethodInNonBlockingContext | 3 | false |
| SimplifyOptionalCallChains | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| UnnecessarySemicolon | 1 | false |
| DataFlowIssue | 1 | false |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| DuplicateThrows | 1 | false |
| FuseStreamOperations | 1 | false |
| RegExpDuplicateAlternationBranch | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'declaredSafety'
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/SafetyValidator.java`
#### Snippet
```java
            EndpointDefinition endpointDefinition,
            ArgumentName argumentName,
            Optional<LogSafety> declaredSafety,
            Type type,
            SafetyDeclarationRequirements safetyDeclarations) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'declaredSafety'
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/SafetyValidator.java`
#### Snippet
```java

        private Stream<String> validateType(
                Type type, Optional<LogSafety> declaredSafety, String qualifiedTypeReference) {
            if (declaredSafety.isPresent()) {
                return type.accept(new SafetyTypeVisitor(qualifiedTypeReference));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'conjurePackage'
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    public static String parsePackageOrElseThrow(
            Optional<ConjurePackage> conjurePackage, Optional<String> defaultPackage) {
        String packageName = conjurePackage
                .map(ConjurePackage::name)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultPackage'
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    public static String parsePackageOrElseThrow(
            Optional<ConjurePackage> conjurePackage, Optional<String> defaultPackage) {
        String packageName = conjurePackage
                .map(ConjurePackage::name)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultAuth'
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
            com.palantir.conjure.parser.services.EndpointDefinition def,
            PathString basePath,
            Optional<AuthType> defaultAuth,
            ReferenceTypeResolver typeResolver,
            DealiasingTypeVisitor dealiasingVisitor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultPackage'
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
            String name,
            com.palantir.conjure.parser.types.BaseObjectTypeDefinition def,
            Optional<String> defaultPackage) {
        TypeName type = TypeName.of(name, parsePackageOrElseThrow(def.conjurePackage(), defaultPackage));
        TypeNameValidator.validate(type);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'importedFrom'
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
    private static final ObjectMapper MAPPER = createConjureParserObjectMapper();

    private static String getErrorMessage(File file, Optional<File> importedFrom) {
        String message = "Import not found: " + file.getAbsolutePath();
        return importedFrom
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'importedFrom'
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
        }

        ConjureSourceFile parse(File file, Optional<File> importedFrom) {
            // HashMap.computeIfAbsent does not work with recursion; the size of the map gets corrupted,
            // and if the map gets resized during the recursion, some of the new nodes can be put in wrong
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'importedFrom'
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
        }

        public ImportNotFoundException(File file, Optional<File> importedFrom) {
            super(getErrorMessage(file, importedFrom));
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'importedFrom'
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java

    private static AnnotatedConjureSourceFile parseSingleFile(
            CachingParser parser, File file, Optional<File> importedFrom) {
        ConjureSourceFile parsed = parser.parse(file, importedFrom);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'importedFrom'
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
        }

        private ConjureSourceFile parseInternal(File file, Optional<File> importedFrom) {
            if (!Files.exists(file.toPath())) {
                throw new ImportNotFoundException(file, importedFrom);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultPackage'
in `conjure-core/src/main/java/com/palantir/conjure/defs/TypeDefinitionParserVisitor.java`
#### Snippet
```java
    public TypeDefinitionParserVisitor(
            String typeName,
            Optional<String> defaultPackage,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        this.name = typeName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'defaultPackage'
in `conjure-core/src/main/java/com/palantir/conjure/defs/TypeDefinitionParserVisitor.java`
#### Snippet
```java

    private final String name;
    private final Optional<String> defaultPackage;
    private final ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver;

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ConjureDefinition`
in `conjure-core/src/main/java/com/palantir/conjure/defs/Conjure.java`
#### Snippet
```java

    /**
     * Deserializes {@link ConjureDefinition} from their YAML representations in the given files.
     */
    public static ConjureDefinition parse(ConjureArgs args) {
```

### JavadocReference
Cannot resolve symbol `ConjureDefinition`
in `conjure-core/src/main/java/com/palantir/conjure/defs/Conjure.java`
#### Snippet
```java

    /**
     * Deserializes {@link ConjureDefinition} from their YAML representations in the given files.
     *
     * @deprecated in favor of {@link #parse(ConjureArgs)}
```

### JavadocReference
Cannot resolve symbol `com.palantir.conjure.spec.ErrorCode`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/ErrorCode.java`
#### Snippet
```java
/**
 * Represents the code of a conjure {@link ErrorTypeDefinition#code() error}. Must be the UpperCamel version of one of
 * the {@link com.palantir.conjure.spec.ErrorCode error codes}.
 */
@JsonDeserialize(as = ImmutableErrorCode.class)
```

### JavadocReference
Cannot resolve symbol `FieldName`
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/FieldNameValidator.java`
#### Snippet
```java
    }

    /** Converts this {@link FieldName} to a {@link FieldName} with the given case. */
    public static FieldName toCase(FieldName fieldName, CaseConverter.Case targetCase) {
        return FieldName.of(nameCase(fieldName).convertTo(fieldName.get(), targetCase));
```

### JavadocReference
Cannot resolve symbol `FieldName`
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/FieldNameValidator.java`
#### Snippet
```java
    }

    /** Converts this {@link FieldName} to a {@link FieldName} with the given case. */
    public static FieldName toCase(FieldName fieldName, CaseConverter.Case targetCase) {
        return FieldName.of(nameCase(fieldName).convertTo(fieldName.get(), targetCase));
```

### JavadocReference
Cannot resolve symbol `FieldName`
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/FieldNameValidator.java`
#### Snippet
```java

    /**
     * Converts this {@link FieldName} to an upper camel case string (e.g. myVariant -> MyVariant).
     * Note that the resultant string is no longer a valid {@link FieldName}.
     */
```

### JavadocReference
Cannot resolve symbol `FieldName`
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/FieldNameValidator.java`
#### Snippet
```java
    /**
     * Converts this {@link FieldName} to an upper camel case string (e.g. myVariant -> MyVariant).
     * Note that the resultant string is no longer a valid {@link FieldName}.
     */
    public static String capitalize(FieldName fieldName) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
                    dealiasingTypeVisitor.dealias(input).fold(_typeDefinition -> Optional.empty(), Optional::of);
            // typeDef isn't binary
            if (!dealiased.isPresent()) {
                return true;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
                    dealiasingTypeVisitor.dealias(input).fold(_typeDefinition -> Optional.empty(), Optional::of);
            // typeDef isn't bearertoken
            if (!dealiased.isPresent()) {
                return true;
            }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/ExpectationResult.java`
#### Snippet
```java
public enum ExpectationResult {
    CORRECT,
    INCORRECT;
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `accept` may produce `NullPointerException`
in `conjure-generator-common/src/main/java/com/palantir/conjure/visitor/DealiasingTypeVisitor.java`
#### Snippet
```java
        Preconditions.checkState(
                typeDefinition != null, "Referenced TypeDefinition not found in map of types for TypeName: %s", value);
        return typeDefinition.accept(new TypeDefinition.Visitor<Either<TypeDefinition, Type>>() {
            @Override
            public Either<TypeDefinition, Type> visitAlias(AliasDefinition value) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
            definition.getArgs().forEach(arg -> {
                ParameterType paramType = arg.getParamType();
                if (paramType.accept(ParameterTypeVisitor.IS_BODY) || paramType.accept(ParameterTypeVisitor.IS_PATH)) {
                    // No validation for param-id of body and path parameters, as it is never (de)serialized.
                } else if (paramType.accept(ParameterTypeVisitor.IS_HEADER)) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `separator` may be 'final'
in `conjure-core/src/main/java/com/palantir/parsec/parsers/KeyValueParser.java`
#### Snippet
```java
    private Parser<A> keyParser;
    private Parser<B> valueParser;
    private Parser<?> separator;

    public KeyValueParser(Parser<A> keyParser, Parser<?> separator, Parser<B> valueParser) {
```

### FieldMayBeFinal
Field `keyParser` may be 'final'
in `conjure-core/src/main/java/com/palantir/parsec/parsers/KeyValueParser.java`
#### Snippet
```java
public final class KeyValueParser<A, B> implements Parser<KeyValue<A, B>> {

    private Parser<A> keyParser;
    private Parser<B> valueParser;
    private Parser<?> separator;
```

### FieldMayBeFinal
Field `valueParser` may be 'final'
in `conjure-core/src/main/java/com/palantir/parsec/parsers/KeyValueParser.java`
#### Snippet
```java

    private Parser<A> keyParser;
    private Parser<B> valueParser;
    private Parser<?> separator;

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (8 lines)
in `conjure-core/src/main/java/com/palantir/parsec/parsers/DefaultingDispatchingParser.java`
#### Snippet
```java
                    lastResult = defaultParser.parse(input);

                    // // Gingerly will have either released the mark or rewound to
                    // // it, so we don't need to do either. We can just handle the result.
                    // if (lastResult == null) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'parseConjureDef' is still used
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    @Deprecated
    static ConjureDefinition parseConjureDef(Collection<AnnotatedConjureSourceFile> annotatedParsedDefs) {
        return parseConjureDef(annotatedParsedDefs.stream()
                .collect(Collectors.toMap(source -> source.sourceFile().getAbsolutePath(), Function.identity())));
```

### DeprecatedIsStillUsed
Deprecated member 'parseConjureDef' is still used
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    @Deprecated
    static ConjureDefinition parseConjureDef(Map<String, AnnotatedConjureSourceFile> annotatedParsedDefs) {
        return parseConjureDef(annotatedParsedDefs, SafetyDeclarationRequirements.ALLOWED);
    }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `unmatchedOptions` are queried, but never updated
in `conjure/src/main/java/com/palantir/conjure/cli/ConjureCli.java`
#### Snippet
```java
        @CommandLine.Unmatched
        @Nullable
        private List<String> unmatchedOptions;

        @SuppressWarnings("BanSystemErr")
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
            Map<TypeName, TypeDefinition> definitionMap = definition.getTypes().stream()
                    .collect(Collectors.toMap(entry -> entry.accept(TypeDefinitionVisitor.TYPE_NAME), entry -> entry));
            definition.getTypes().forEach(def -> validateTypeDefinition(def, definitionMap));
            definition.getErrors().forEach(def -> validateErrorDefinition(def, definitionMap));
            definition.getServices().forEach(def -> validateServiceDefinition(def, definitionMap));
```

### DuplicatedCode
Duplicated code
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
            Optional<Type> dealiased =
                    dealiasingTypeVisitor.dealias(input).fold(_typeDefinition -> Optional.empty(), Optional::of);
            // typeDef isn't binary
            if (!dealiased.isPresent()) {
                return true;
            }
            Type type = dealiased.get();
            if (input.accept(TypeVisitor.IS_OPTIONAL)) {
                return validateType(input.accept(TypeVisitor.OPTIONAL).getItemType(), dealiasingTypeVisitor);
            }
            if (input.accept(TypeVisitor.IS_LIST)) {
                return validateType(input.accept(TypeVisitor.LIST).getItemType(), dealiasingTypeVisitor);
            }
            if (input.accept(TypeVisitor.IS_SET)) {
                return validateType(input.accept(TypeVisitor.SET).getItemType(), dealiasingTypeVisitor);
            }
```

### DuplicatedCode
Duplicated code
in `conjure-generator-common/src/main/java/com/palantir/conjure/CamelCasePattern.java`
#### Snippet
```java
        int len = value.length();
        if (len == 0) {
            return false;
        }

        char firstChar = value.charAt(0);
        if (!CharUtils.isLower(firstChar)) {
            return false;
        }

        int uppercaseChars = 0;
```

### DuplicatedCode
Duplicated code
in `conjure-generator-common/src/main/java/com/palantir/conjure/KebabCasePattern.java`
#### Snippet
```java
                i++;
                if (i >= len) {
                    return false;
                }
                curChar = value.charAt(i);
                if (dashChars >= 2 || !CharUtils.isLower(curChar)) {
                    return false;
                }
                dashChars++;
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `conjure-core/src/main/java/com/palantir/conjure/parser/services/ArgumentDefinition.java`
#### Snippet
```java
        @Override
        public ArgumentDefinition deserialize(JsonParser parser, DeserializationContext _context)
                throws IOException, JsonProcessingException {

            String candidate = parser.getValueAsString();
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing ArrayDeque
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
        Map<String, AnnotatedConjureSourceFile> parsed = new HashMap<>();
        Queue<FileWithProvenance> toProcess =
                new ArrayDeque<>(files.stream().map(FileWithProvenance::of).collect(Collectors.toList()));

        while (!toProcess.isEmpty()) {
```

## RuleId[id=RegExpDuplicateAlternationBranch]
### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/HttpPathValidator.java`
#### Snippet
```java
    private static final Pattern PARAM_SEGMENT_PATTERN = Pattern.compile("^\\{" + PATTERN + "}$");
    private static final Pattern PARAM_REGEX_SEGMENT_PATTERN =
            Pattern.compile("^\\{" + PATTERN + "(" + Pattern.quote(":.+") + "|" + Pattern.quote(":.*") + ")" + "}$");

    /**
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `curr == -1` is always `false`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/QuotedStringParser.java`
#### Snippet
```java
                }
            }
            if (curr == -1) {
                throw new ParseException("Reached end of file while processing quoted string.", input);
            }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/reference/ConjureImports.java`
#### Snippet
```java
            return ImmutableConjureImports.builder()
                    .file(file())
                    .absoluteFile(baseDir.resolve(file()).toFile().getCanonicalFile())
                    .build();
        } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure/src/main/java/com/palantir/conjure/cli/CliConfiguration.java`
#### Snippet
```java
        final Collection<File> inputFiles;
        if (input.isDirectory()) {
            try (Stream<Path> fileStream = Files.find(input.toPath(), 999, (path, bfa) -> bfa.isRegularFile())) {
                inputFiles = fileStream.map(Path::toFile).collect(Collectors.toList());
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
            File nextFile;
            try {
                nextFile = nextFileWithProvenance.file().getCanonicalFile();
            } catch (IOException e) {
                throw new SafeRuntimeException("Couldn't canonicalize file path", e);
```

