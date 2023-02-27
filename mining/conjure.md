# conjure 
 
# Bad smells
I found 128 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 47 | false |
| ReturnNull | 15 | false |
| BoundedWildcard | 15 | false |
| OptionalUsedAsFieldOrParameterType | 13 | false |
| AbstractClassNeverImplemented | 11 | false |
| CodeBlock2Expr | 3 | true |
| AssignmentToForLoopParameter | 3 | false |
| RedundantSuppression | 3 | false |
| SystemOutErr | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| UnnecessarySemicolon | 1 | false |
| DataFlowIssue | 1 | false |
| NestedAssignment | 1 | false |
| CommentedOutCode | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantFieldInitialization | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| FuseStreamOperations | 1 | false |
| DuplicateThrows | 1 | false |
| RegExpDuplicateAlternationBranch | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

        private ConjureSourceFile parseInternal(File file, Optional<File> importedFrom) {
            if (!Files.exists(file.toPath())) {
                throw new ImportNotFoundException(file, importedFrom);
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

    private static AnnotatedConjureSourceFile parseSingleFile(
            CachingParser parser, File file, Optional<File> importedFrom) {
        ConjureSourceFile parsed = parser.parse(file, importedFrom);

```

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

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `conjure/src/main/java/com/palantir/conjure/cli/ConjureCli.java`
#### Snippet
```java
    @Override
    public void run() {
        CommandLine.usage(this, System.out);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `conjure/src/main/java/com/palantir/conjure/cli/ConjureCli.java`
#### Snippet
```java
        public void run() {
            if (unmatchedOptions != null && !unmatchedOptions.isEmpty()) {
                System.err.println("Ignoring unknown options: " + unmatchedOptions);
            }
            CliConfiguration config = getConfiguration();
```

## RuleId[ruleID=SimplifyOptionalCallChains]
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

## RuleId[ruleID=UnnecessarySemicolon]
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EnumDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class ValuesValidator implements ConjureValidator<EnumDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EnumDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class UniqueEnumValuesValidator implements ConjureValidator<EnumDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EnumDefinitionValidator.java`
#### Snippet
```java
import java.util.Set;

@com.google.errorprone.annotations.Immutable
public enum EnumDefinitionValidator implements ConjureValidator<EnumDefinition> {
    UniqueEnumValues(new UniqueEnumValuesValidator()),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/TypeName.java`
#### Snippet
```java
 * Represents the name of a conjure {@link NamedTypesDefinition#objects() object}.
 */
@com.google.errorprone.annotations.Immutable
@Value.Immutable
@ConjureImmutablesStyle
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureValidator.java`
#### Snippet
```java
package com.palantir.conjure.defs.validator;

@com.google.errorprone.annotations.Immutable
public interface ConjureValidator<T> {
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UniqueFieldNamesValidator.java`
#### Snippet
```java
 * {@link CaseConverter.Case#LOWER_CAMEL_CASE lower camel case}.
 */
@com.google.errorprone.annotations.Immutable
public final class UniqueFieldNamesValidator implements ConjureValidator<Set<FieldName>> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

@com.google.errorprone.annotations.Immutable
public enum EndpointDefinitionValidator implements ConjureContextualValidator<EndpointDefinition> {
    ARGUMENT_TYPE(new NonBodyArgumentTypeValidator()),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoGetBodyParamValidator implements ConjureValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class PathParamValidator implements ConjureValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NonBodyArgumentTypeValidator implements ConjureContextualValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoBearerTokenPathOrQueryParams
            implements ConjureContextualValidator<EndpointDefinition> {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class SingleBodyParamValidator implements ConjureValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class ParamIdValidator implements ConjureValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class ParameterNameValidator implements ConjureValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoComplexHeaderParamValidator implements ConjureContextualValidator<EndpointDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoComplexPathParamValidator implements ConjureContextualValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoComplexQueryParamValidator implements ConjureContextualValidator<EndpointDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EndpointDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoOptionalBinaryBodyParamValidator
            implements ConjureContextualValidator<EndpointDefinition> {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EnumValueDefinitionValidator.java`
#### Snippet
```java
import com.palantir.conjure.spec.EnumValueDefinition;

@com.google.errorprone.annotations.Immutable
public enum EnumValueDefinitionValidator implements ConjureValidator<EnumValueDefinition> {
    UnknownValueNotUsed(new UnknownValueNotUsedValidator()),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EnumValueDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class FormatValidator implements ConjureValidator<EnumValueDefinition> {
        private static final EnumPattern REQUIRED_FORMAT = EnumPattern.get();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/EnumValueDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class UnknownValueNotUsedValidator implements ConjureValidator<EnumValueDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureContextualValidator.java`
#### Snippet
```java
import com.palantir.conjure.visitor.DealiasingTypeVisitor;

@com.google.errorprone.annotations.Immutable
public interface ConjureContextualValidator<T> {
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/TypeNameValidator.java`
#### Snippet
```java

    static final List<String> PRIMITIVE_TYPES =
            Lists.transform(java.util.Arrays.asList(PrimitiveType.Value.values()), PrimitiveType.Value::name);

    public static void validate(TypeName typeName) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UnionDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class KeySyntaxValidator implements ConjureValidator<UnionDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UnionDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoTrailingUnderscoreValidator implements ConjureValidator<UnionDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UnionDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoClobberTypeValidator implements ConjureValidator<UnionDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UnionDefinitionValidator.java`
#### Snippet
```java
import com.palantir.conjure.spec.UnionDefinition;

@com.google.errorprone.annotations.Immutable
public enum UnionDefinitionValidator implements ConjureValidator<UnionDefinition> {
    KEY_SYNTAX(new KeySyntaxValidator()),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ServiceDefinitionValidator.java`
#### Snippet
```java
    private static final Pattern PATHVAR_PATTERN = Pattern.compile(Pattern.quote("{") + ".+?" + Pattern.quote("}"));

    @com.google.errorprone.annotations.Immutable
    private static final class UniquePathMethodsValidator implements ConjureValidator<ServiceDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ServiceDefinitionValidator.java`
#### Snippet
```java
import java.util.regex.Pattern;

@com.google.errorprone.annotations.Immutable
public enum ServiceDefinitionValidator implements ConjureValidator<ServiceDefinition> {
    UNIQUE_PATH_METHODS(new UniquePathMethodsValidator()),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ServiceDefinitionValidator.java`
#### Snippet
```java
     * This ensures that ExperimentalFeatures.DisambiguateRetrofitServices won't cause collisions.
     */
    @com.google.errorprone.annotations.Immutable
    private static final class IllegalSuffixesValidator implements ConjureValidator<ServiceDefinition> {
        private static final String RETROFIT_SUFFIX = "Retrofit";
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
import java.util.stream.Stream;

@com.google.errorprone.annotations.Immutable
public enum ConjureDefinitionValidator implements ConjureValidator<ConjureDefinition> {
    UNIQUE_SERVICE_NAMES(new UniqueServiceNamesValidator()),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class IllegalVersionValidator implements ConjureValidator<ConjureDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class IllegalMapKeyValidator implements ConjureValidator<ConjureDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class NoRecursiveTypesValidator implements ConjureValidator<ConjureDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class UniqueNamesValidator implements ConjureValidator<ConjureDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class LogSafetyConjureDefinitionValidator implements ConjureValidator<ConjureDefinition> {

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    public static final class NoNestedOptionalValidator implements ConjureValidator<ConjureDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/ConjureDefinitionValidator.java`
#### Snippet
```java
    }

    @com.google.errorprone.annotations.Immutable
    private static final class UniqueServiceNamesValidator implements ConjureValidator<ConjureDefinition> {
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types.complex` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
    public static TypeDefinition parseUnionType(
            TypeName name,
            com.palantir.conjure.parser.types.complex.UnionTypeDefinition def,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        UnionDefinition unionType = UnionDefinition.builder()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
    public static TypeName createTypeName(
            String name,
            com.palantir.conjure.parser.types.BaseObjectTypeDefinition def,
            Optional<String> defaultPackage) {
        TypeName type = TypeName.of(name, parsePackageOrElseThrow(def.conjurePackage(), defaultPackage));
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types.reference` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
    public static TypeDefinition parseAliasType(
            TypeName name,
            com.palantir.conjure.parser.types.reference.AliasTypeDefinition def,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        return TypeDefinition.alias(AliasDefinition.builder()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types.complex` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
    public static ErrorDefinition parseErrorType(
            TypeName name,
            com.palantir.conjure.parser.types.complex.ErrorTypeDefinition def,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        ErrorDefinition errorType = ErrorDefinition.builder()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.services` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    private static Optional<AuthType> parseAuthType(
            com.palantir.conjure.parser.services.AuthDefinition authDefinition) {

        switch (authDefinition.type()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types.complex` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    public static TypeDefinition parseEnumType(
            TypeName name, com.palantir.conjure.parser.types.complex.EnumTypeDefinition def) {

        EnumDefinition enumType = EnumDefinition.builder()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    private static Set<Type> parseMarkers(
            Set<com.palantir.conjure.parser.types.ConjureType> markers,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        return markers.stream()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    static Map<TypeName, TypeDefinition> parseObjects(
            com.palantir.conjure.parser.types.TypesDefinition parsed,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        Optional<String> defaultPackage =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.conjure.parser.types.complex` is unnecessary, and can be replaced with an import
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
    public static TypeDefinition parseObjectType(
            TypeName name,
            com.palantir.conjure.parser.types.complex.ObjectTypeDefinition def,
            ConjureTypeParserVisitor.ReferenceTypeResolver typeResolver) {
        ObjectDefinition objectType = ObjectDefinition.builder()
```

## RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `conjure-core/src/main/java/com/palantir/parsec/parsers/QuotedStringParser.java`
#### Snippet
```java
        int curr;
        boolean escaped = false;
        while ((curr = input.next()) != -1) {
            if (escaped) {
                escaped = false;
```

## RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UnionDefinitionValidator.java`
#### Snippet
```java
        @Override
        public void validate(UnionDefinition definition) {
            definition.getUnion().forEach(fieldDef -> {
                Preconditions.checkArgument(
                        !fieldDef.getFieldName().get().endsWith("_"),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-core/src/main/java/com/palantir/conjure/defs/validator/UnionDefinitionValidator.java`
#### Snippet
```java
        @Override
        public void validate(UnionDefinition definition) {
            definition.getUnion().forEach(fieldDef -> {
                com.palantir.logsafe.Preconditions.checkArgument(
                        !fieldDef.getFieldName().get().equals("type"), "Union member key must not be 'type'");
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java
                DealiasingTypeVisitor dealiasingVisitor = new DealiasingTypeVisitor(allObjects);

                parsed.services().forEach((serviceName, service) -> {
                    servicesBuilder.add(parseService(
                            service,
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `conjure-core/src/main/java/com/palantir/parsec/StringParserState.java`
#### Snippet
```java

    private final CharSequence seq;
    private int current = 0;

    public StringParserState(CharSequence str) {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/KebabCaseEnforcingAnnotationInspector.java`
#### Snippet
```java
        }

        return null; // delegate to the next introspector in an AnnotationIntrospectorPair.
    }
}
```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/RawStringParser.java`
#### Snippet
```java
            if (firstChar) {
                if (condition.notAllowedToStartWith((char) curr)) {
                    return null;
                }
                firstChar = false;
```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/RawStringParser.java`
#### Snippet
```java
            curr = input.next();
        }
        return sb.length() > 0 ? sb.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            ExpectationResult result = Parsers.expect("set").parse(input);
            if (Parsers.nullOrUnexpected(result)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            ExpectationResult result = Parsers.expect("list").parse(input);
            if (Parsers.nullOrUnexpected(result)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            if (typeReference == null) {
                mark.rewind();
                return null;
            }
            TypeName typeName = TypeName.of(typeReference);
```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            ExpectationResult result = Parsers.expect("map").parse(input);
            if (Parsers.nullOrUnexpected(result)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            ExpectationResult result = Parsers.expect("optional").parse(input);
            if (Parsers.nullOrUnexpected(result)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            ExpectationResult result = Parsers.expect(type).parse(input);
            if (Parsers.nullOrUnexpected(result)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/TypeParser.java`
#### Snippet
```java
            String namespace = NAMESPACE_PARSER.parse(input);
            if (Parsers.nullOrUnexpected(Parsers.expect(".").parse(input))) {
                return null;
            }
            String ref = TypeReferenceParser.REF_PARSER.parse(input);
```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/IntegerParser.java`
#### Snippet
```java
    public Integer parse(ParserState input) throws ParseException {
        String str = RAW_INT_PARSER.parse(input);
        return str != null ? Integer.valueOf(str) : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/KeyValueParser.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-generator-common/src/main/java/com/palantir/conjure/visitor/TypeVisitor.java`
#### Snippet
```java
        @Override
        public T visitPrimitive(PrimitiveType _value) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/parsec/Parsers.java`
#### Snippet
```java

                if (input.curr() != -1) {
                    return null;
                }
                return result;
```

### ReturnNull
Return of `null`
in `conjure-core/src/main/java/com/palantir/parsec/Parsers.java`
#### Snippet
```java
                }

                return null;
            }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `conjure-core/src/main/java/com/palantir/parsec/parsers/RawStringParser.java`
#### Snippet
```java
            curr = input.next();
        }
        return sb.length() > 0 ? sb.toString() : null;
    }

```

## RuleId[ruleID=FuseStreamOperations]
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

## RuleId[ruleID=DuplicateThrows]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `conjure-generator-common/src/main/java/com/palantir/conjure/PackagePattern.java`
#### Snippet
```java
                    return false;
                }
                i++;
                if (i >= len) {
                    return false;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `conjure-generator-common/src/main/java/com/palantir/conjure/KebabCasePattern.java`
#### Snippet
```java

            if (curChar == '-') {
                i++;
                if (i >= len) {
                    return false;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `conjure-generator-common/src/main/java/com/palantir/conjure/SnakeCasePattern.java`
#### Snippet
```java

            if (curChar == '_') {
                i++;
                if (i >= len) {
                    return false;
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends A`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/MapParser.java`
#### Snippet
```java
    private final Parser<?> separator;

    public MapParser(Parser<A> keyParser, Parser<B> valueParser, Parser<?> separator) {
        this.keyParser = keyParser;
        this.valueParser = valueParser;
```

### BoundedWildcard
Can generalize to `? extends B`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/MapParser.java`
#### Snippet
```java
    private final Parser<?> separator;

    public MapParser(Parser<A> keyParser, Parser<B> valueParser, Parser<?> separator) {
        this.keyParser = keyParser;
        this.valueParser = valueParser;
```

### BoundedWildcard
Can generalize to `? extends File`
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
    private static final ObjectMapper MAPPER = createConjureParserObjectMapper();

    private static String getErrorMessage(File file, Optional<File> importedFrom) {
        String message = "Import not found: " + file.getAbsolutePath();
        return importedFrom
```

### BoundedWildcard
Can generalize to `? extends File`
in `conjure-core/src/main/java/com/palantir/conjure/parser/ConjureParser.java`
#### Snippet
```java
     * Parse all files & imports (breadth-first).
     */
    public static Map<String, AnnotatedConjureSourceFile> parseAnnotated(Collection<File> files) {
        CachingParser parser = new CachingParser();

```

### BoundedWildcard
Can generalize to `? extends AnnotatedConjureSourceFile`
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureTypeParserVisitor.java`
#### Snippet
```java
                TypesDefinition types,
                Map<Namespace, String> importProviders,
                Map<String, AnnotatedConjureSourceFile> externalTypes) {
            this.types = types;
            this.importProviders = importProviders;
```

### BoundedWildcard
Can generalize to `? extends A`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/KeyValueParser.java`
#### Snippet
```java
    private Parser<?> separator;

    public KeyValueParser(Parser<A> keyParser, Parser<?> separator, Parser<B> valueParser) {
        this.keyParser = keyParser;
        this.separator = separator;
```

### BoundedWildcard
Can generalize to `? extends B`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/KeyValueParser.java`
#### Snippet
```java
    private Parser<?> separator;

    public KeyValueParser(Parser<A> keyParser, Parser<?> separator, Parser<B> valueParser) {
        this.keyParser = keyParser;
        this.separator = separator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/BetweenParser.java`
#### Snippet
```java
    private final String description;

    public BetweenParser(Parser<?> start, Parser<T> parser, Parser<?> end, String description) {
        this.start = start;
        this.parser = parser;
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/ListParser.java`
#### Snippet
```java
    private final Parser<T> valueParser;

    public ListParser(Parser<T> valueParser, Parser<?> separator) {
        this.valueParser = valueParser;
        this.separator = separator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-core/src/main/java/com/palantir/parsec/parsers/DefaultingDispatchingParser.java`
#### Snippet
```java
     * @param defaultParser the default parser to apply
     */
    public void setDefaultParser(Parser<T> defaultParser) {
        this.defaultParser = defaultParser;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-core/src/main/java/com/palantir/parsec/Parsers.java`
#### Snippet
```java
     * @return the specified parser
     */
    public static <T> Parser<T> gingerly(final Parser<T> parser) {
        return new Parser<T>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-core/src/main/java/com/palantir/parsec/Parsers.java`
#### Snippet
```java
    }

    public static <T> Parser<T> eof(Parser<T> parser) {
        return new Parser<T>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-core/src/main/java/com/palantir/parsec/Parsers.java`
#### Snippet
```java
     * @return the specified parser
     */
    public static <T> Parser<T> prefix(final Parser<?> prefix, final Parser<T> parser) {
        return new Parser<T>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends AnnotatedConjureSourceFile`
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    @Deprecated
    static ConjureDefinition parseConjureDef(Collection<AnnotatedConjureSourceFile> annotatedParsedDefs) {
        return parseConjureDef(annotatedParsedDefs.stream()
                .collect(Collectors.toMap(source -> source.sourceFile().getAbsolutePath(), Function.identity())));
```

### BoundedWildcard
Can generalize to `? extends ConjurePackage`
in `conjure-core/src/main/java/com/palantir/conjure/defs/ConjureParserUtils.java`
#### Snippet
```java

    public static String parsePackageOrElseThrow(
            Optional<ConjurePackage> conjurePackage, Optional<String> defaultPackage) {
        String packageName = conjurePackage
                .map(ConjurePackage::name)
```

## RuleId[ruleID=RegExpDuplicateAlternationBranch]
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

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `Namespace` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/Namespace.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class Namespace {

    private static final Pattern NAMESPACE_PATTERN = Pattern.compile("^[_a-zA-Z][_a-zA-Z0-9]*$");
```

### AbstractClassNeverImplemented
Abstract class `ConjurePackage` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/ConjurePackage.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class ConjurePackage {

    @JsonValue
```

### AbstractClassNeverImplemented
Abstract class `TypeName` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/TypeName.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class TypeName {

    private static final Pattern CUSTOM_TYPE_PATTERN = Pattern.compile("^[A-Z][a-z0-9]+([A-Z][a-z0-9]+)*$");
```

### AbstractClassNeverImplemented
Abstract class `FieldName` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/FieldName.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class FieldName {

    private static final Logger log = LoggerFactory.getLogger(FieldName.class);
```

### AbstractClassNeverImplemented
Abstract class `ErrorNamespace` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/ErrorNamespace.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class ErrorNamespace {

    private static final Pattern UPPER_CAMEL_CASE = Pattern.compile("(([A-Z][a-z0-9]+)+)");
```

### AbstractClassNeverImplemented
Abstract class `Right` has no concrete subclass
in `conjure-generator-common/src/main/java/com/palantir/conjure/either/Either.java`
#### Snippet
```java

    @Immutable
    abstract class Right<L, R> implements Either<L, R> {
        @Parameter
        abstract R value();
```

### AbstractClassNeverImplemented
Abstract class `Left` has no concrete subclass
in `conjure-generator-common/src/main/java/com/palantir/conjure/either/Either.java`
#### Snippet
```java

    @Immutable
    abstract class Left<L, R> implements Either<L, R> {

        @Parameter
```

### AbstractClassNeverImplemented
Abstract class `PathString` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/services/PathString.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class PathString {

    /** Returns the well-formed path associated with this path definition. */
```

### AbstractClassNeverImplemented
Abstract class `ErrorCode` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/names/ErrorCode.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class ErrorCode {

    private static final Set<String> VALID_ERROR_CODE_NAMES = Arrays.stream(
```

### AbstractClassNeverImplemented
Abstract class `ParameterName` has no concrete subclass
in `conjure-core/src/main/java/com/palantir/conjure/parser/services/ParameterName.java`
#### Snippet
```java
@Value.Immutable
@ConjureImmutablesStyle
public abstract class ParameterName {

    public static final String PATTERN = "[a-z][a-z0-9]*([A-Z0-9][a-z0-9]+)*";
```

### AbstractClassNeverImplemented
Abstract class `CliConfiguration` has no concrete subclass
in `conjure/src/main/java/com/palantir/conjure/cli/CliConfiguration.java`
#### Snippet
```java

@Value.Immutable
public abstract class CliConfiguration {
    abstract Collection<File> inputFiles();

```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `ConjureException` ends with 'Exception'
in `conjure-core/src/main/java/com/palantir/conjure/exceptions/ConjureException.java`
#### Snippet
```java
package com.palantir.conjure.exceptions;

public interface ConjureException {}

```

## RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `conjure-core/src/main/java/com/palantir/conjure/parser/services/ArgumentDefinition.java`
#### Snippet
```java
        @SuppressWarnings("deprecation")
        @Override
        public ArgumentDefinition deserialize(JsonParser parser, DeserializationContext _context)
                throws IOException, JsonProcessingException {

```

### RedundantSuppression
Redundant suppression
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/complex/EnumValueDefinition.java`
#### Snippet
```java
        @SuppressWarnings("deprecation")
        @Override
        public EnumValueDefinition deserialize(JsonParser parser, DeserializationContext _ctxt) throws IOException {
            String candidate = parser.getValueAsString();
            if (candidate != null) {
```

### RedundantSuppression
Redundant suppression
in `conjure-core/src/main/java/com/palantir/conjure/parser/types/complex/FieldDefinition.java`
#### Snippet
```java
        @SuppressWarnings("deprecation")
        @Override
        public FieldDefinition deserialize(JsonParser parser, DeserializationContext _context) throws IOException {

            String candidate = parser.getValueAsString();
```

