# jreleaser 
 
# Bad smells
I found 1147 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 291 | false |
| ReturnNull | 170 | false |
| BoundedWildcard | 160 | false |
| DynamicRegexReplaceableByCompiledPattern | 140 | false |
| AssignmentToMethodParameter | 68 | false |
| UnusedAssignment | 36 | false |
| RedundantImplements | 30 | false |
| SystemOutErr | 22 | false |
| RegExpRedundantEscape | 21 | false |
| EmptyMethod | 18 | false |
| CallToStringConcatCanBeReplacedByOperator | 16 | false |
| IgnoreResultOfCall | 15 | false |
| DataFlowIssue | 15 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| TrivialStringConcatenation | 11 | false |
| ConstantValue | 11 | false |
| UnstableApiUsage | 10 | false |
| DuplicateExpressions | 8 | false |
| NestedAssignment | 8 | false |
| RedundantEscapeInRegexReplacement | 8 | false |
| ClassNameSameAsAncestorName | 7 | false |
| OctalLiteral | 6 | false |
| NonShortCircuitBoolean | 5 | false |
| RedundantLengthCheck | 5 | false |
| RedundantSuppression | 5 | false |
| KeySetIterationMayUseEntrySet | 4 | false |
| AbstractClassNeverImplemented | 4 | false |
| RedundantMethodOverride | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| RegExpSimplifiable | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| EqualsWhichDoesntCheckParameterClass | 3 | false |
| CharsetObjectCanBeUsed | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| MagicConstant | 1 | false |
| CommentedOutCode | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| DefaultAnnotationParam | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| SlowListContainsAll | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| ExcessiveLambdaUsage | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| DuplicateThrows | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| OptionalIsPresent | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| CatchMayIgnoreException | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                if (null != fileTime) archiveEntry.setTime(fileTime);

                archiveEntry.setMethod(ZipOutputStream.DEFLATED);
                if (inputFile.isFile() && Files.isExecutable(path)) {
                    archiveEntry.setUnixMode(0100755);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/distributions/DistributionsValidator.java`
#### Snippet
```java
        boolean valid = true;
        // TODO: activate in 2.0.0
        // if (isBlank(distribution.getJava().getVersion())) {
        //     errors.warning(RB.$("validation_is_missing", "distribution." + distribution.getName() + ".java.version"));
        //     valid = false;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
 */
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
 */
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
 */
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");

    private final String version;
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");

```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
    private static final Pattern FULL_SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_MINOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

    private final int major;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
 */
public class SemanticVersion implements Version<SemanticVersion> {
    private static final Pattern FULL_SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_MINOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
public class SemanticVersion implements Version<SemanticVersion> {
    private static final Pattern FULL_SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_MINOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
 */
public final class JpackageAssemblerValidator {
    private static final String MAC_IDENTIFIER = "[a-zA-Z0-9][a-zA-Z0-9\\.\\-]*";
    private static final Pattern MAC_IDENTIFIER_PATTERN = Pattern.compile(MAC_IDENTIFIER);

```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
    private static final Pattern PATTERN_MINIMUM_OS_VERSION = Pattern.compile("^(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])(\\.(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])){0,3}$");
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
    private static final Pattern PATTERN_MINIMUM_OS_VERSION = Pattern.compile("^(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])(\\.(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])){0,3}$");
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
    private static final Pattern PATTERN_MINIMUM_OS_VERSION = Pattern.compile("^(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])(\\.(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])){0,3}$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `assetsToBePublished.keySet()` may be replaced with 'Map.forEach()' iteration
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
```

### KeySetIterationMayUseEntrySet
Iteration over `assetsToBePublished.keySet()` may be replaced with 'Map.forEach()' iteration
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
```

### KeySetIterationMayUseEntrySet
Iteration over `assetsToBePublished.keySet()` may be replaced with 'Map.forEach()' iteration
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
```

### KeySetIterationMayUseEntrySet
Iteration over `assetsToBePublished.keySet()` may be replaced with 'Map.forEach()' iteration
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    private static final Pattern GETTER_PATTERN_1 = Pattern.compile("^get[A-Z][\\w]*$");
    private static final Pattern GETTER_PATTERN_2 = Pattern.compile("^is[A-Z][\\w]*$");
    private static final Pattern SETTER_PATTERN = Pattern.compile("^set[A-Z][\\w]*$");
    private static final String ERROR_METHOD_NULL = "Argument 'method' must not be null";
    private static final Pattern REGEX_CHARS = Pattern.compile("[{}()\\[\\].+*?^$\\\\|/]");
```

### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    private static final String PROPERTY_SET_PREFIX = "set";
    private static final String PROPERTY_GET_PREFIX = "get";
    private static final Pattern GETTER_PATTERN_1 = Pattern.compile("^get[A-Z][\\w]*$");
    private static final Pattern GETTER_PATTERN_2 = Pattern.compile("^is[A-Z][\\w]*$");
    private static final Pattern SETTER_PATTERN = Pattern.compile("^set[A-Z][\\w]*$");
```

### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    private static final String PROPERTY_GET_PREFIX = "get";
    private static final Pattern GETTER_PATTERN_1 = Pattern.compile("^get[A-Z][\\w]*$");
    private static final Pattern GETTER_PATTERN_2 = Pattern.compile("^is[A-Z][\\w]*$");
    private static final Pattern SETTER_PATTERN = Pattern.compile("^set[A-Z][\\w]*$");
    private static final String ERROR_METHOD_NULL = "Argument 'method' must not be null";
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0100755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                archiveEntry.setMethod(ZipOutputStream.DEFLATED);
                if (inputFile.isFile() && Files.isExecutable(path)) {
                    archiveEntry.setUnixMode(0100755);
                }

```

### OctalLiteral
Octal integer `0100755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

            if (inputFile.isFile() && Files.isExecutable(path)) {
                archiveEntry.setMode(0100755);
            }

```

### OctalLiteral
Octal integer `0777`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static int getEntryMode(ArchiveEntry entry, int mode, File file) {
        int unixMode = mode & 0777;
        if (unixMode == 0) {
            if (entry.isDirectory()) {
```

### OctalLiteral
Octal integer `0755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        if (unixMode == 0) {
            if (entry.isDirectory()) {
                unixMode = 0755;
            } else if ("bin".equalsIgnoreCase(file.getParentFile().getName())) {
                // zipEntry.unixMode returns 0 most times even if the entry is executable
```

### OctalLiteral
Octal integer `0777`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                // zipEntry.unixMode returns 0 most times even if the entry is executable
                // force executable bit only if parent dir == 'bin'
                unixMode = 0777;
            } else {
                unixMode = 0644;
```

### OctalLiteral
Octal integer `0644`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                unixMode = 0777;
            } else {
                unixMode = 0644;
            }
        }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `v.length() + 1 + p.length() + 1`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
            if (version.charAt(v.length()) == '-') {
                p = take(version, v.length() + 1, listOf('+'));
                if (v.length() + 1 + p.length() + 1 < version.length()) {
                    b = take(version, v.length() + 1 + p.length() + 1, emptyList());
                }
```

### DuplicateExpressions
Multiple occurrences of `v.length() + 1 + p.length() + 1`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
                p = take(version, v.length() + 1, listOf('+'));
                if (v.length() + 1 + p.length() + 1 < version.length()) {
                    b = take(version, v.length() + 1 + p.length() + 1, emptyList());
                }
            } else {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, FTPClient ftp, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, SSHClient ssh, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, SFTPClient sftp, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
     */
    public static boolean isBlank(String str) {
        if (null == str || str.length() == 0) {
            return true;
        }
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getClassNameRepresentation(String name) {
        StringBuilder buf = new StringBuilder();
        if (null != name && name.length() > 0) {
            String[] tokens = name.split("[^\\w\\d]");
            for (String token1 : tokens) {
```

### SizeReplaceableByIsEmpty
`token.length() == 0` can be replaced with 'token.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
            String[] tokens = name.split("-");
            for (String token : tokens) {
                if (null == token || token.length() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`buf.length() > 0` can be replaced with '!buf.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
                    continue;
                }
                if (buf.length() > 0) {
                    buf.append(' ');
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

    private static String applyQuotes(String string) {
        if (null == string || string.length() == 0) {
            return "\"\"";
        }
```

### SizeReplaceableByIsEmpty
`w.length() == 0` can be replaced with 'w.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

            if (Character.isLowerCase(c) || Character.isDigit(c)) {
                if (Character.isLowerCase(c) && w.length() == 0) {
                    c = Character.toUpperCase(c);
                } else if (w.length() > 1 && Character.isUpperCase(w.charAt(w.length() - 1))) {
```

### SizeReplaceableByIsEmpty
`w.length() == 0` can be replaced with 'w.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
                words.set(i, w + c);
            } else if (Character.isUpperCase(c)) {
                if (i == 0 && w.length() == 0 || Character.isUpperCase(w.charAt(w.length() - 1))) {
                    words.set(i, w + c);
                } else {
```

### SizeReplaceableByIsEmpty
`token.length() == 0` can be replaced with 'token.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
            String[] tokens = name.split("-");
            for (String token : tokens) {
                if (null == token || token.length() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`accumulator.length() > 0` can be replaced with '!accumulator.isEmpty()'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        }

        if (accumulator.length() > 0) {
            tokens.add(accumulator.toString());
        }
```

### SizeReplaceableByIsEmpty
`indent.length() > 0` can be replaced with '!indent.isEmpty()'
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/AbstractJReleaserLogger.java`
#### Snippet
```java
    @Override
    public void decreaseIndent() {
        if (indent.length() > 0) {
            indent = indent.substring(0, indent.length() - 2);
        }
```

### SizeReplaceableByIsEmpty
`current.length() > 0` can be replaced with '!current.isEmpty()'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
                        state = inDoubleQuote;
                    } else if (" ".equals(nextTok)) {
                        if (lastTokenHasBeenQuoted || current.length() > 0) {
                            result.add(current.toString());
                            current.setLength(0);
```

### SizeReplaceableByIsEmpty
`current.length() > 0` can be replaced with '!current.isEmpty()'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
        }

        if (lastTokenHasBeenQuoted || current.length() > 0) {
            result.add(current.toString());
        }
```

### SizeReplaceableByIsEmpty
`changes.length() > 0` can be replaced with '!changes.isEmpty()'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java

        if (!changelog.getHide().isUncategorized() && categories.containsKey(UNCATEGORIZED)) {
            if (changes.length() > 0) {
                changes.append("---")
                    .append(lineSeparator);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/Links.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Links[");
        sb.append("first='").append(first).append('\'');
        sb.append(", next='").append(next).append('\'');
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `success &= exclude != PlatformUtils.isCompatible(PlatformUtils.getCurrentFull(), platform)`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
            }

            success &= exclude != PlatformUtils.isCompatible(PlatformUtils.getCurrentFull(), platform);
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValu...`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibSpec.java`
#### Snippet
```java
            String key = e.getKey();
            if (KEY_PLATFORM.equals(key)) {
                matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matched &= e.getValue().equals(artifact.getExtraProperties().get(key))`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibSpec.java`
#### Snippet
```java
                matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValu...`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
            String key = e.getKey();
            if (KEY_PLATFORM.equals(key)) {
                matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matched &= e.getValue().equals(artifact.getExtraProperties().get(key))`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
                matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
            }
        }
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        }

        folderIndex = folderIndex < 0 ? 0 : folderIndex;

        return path.substring(folderIndex, extIndex);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        setProperty(props, DETECTED_NAME, detectedName);
        setProperty(props, DETECTED_ARCH, detectedArch);
        setProperty(props, DETECTED_BITNESS, "" + detectedBitness);

        final Matcher versionMatcher = VERSION_REGEX.matcher(osVersion);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

    private static String getPadding(String padding, int length) {
        return padding.length() < length ? times(padding, length / padding.length() + 1).substring(0, length) : "" + padding.subSequence(0, length);
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
                return "\\" + character;
            default:
                return "" + character;
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/init/Init.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            LocalDate now = LocalDate.now();
            content = content.replace("@year@", now.getYear() + "");

            logger.info($("jreleaser.init.TEXT_writing_file"), outputFile.toAbsolutePath());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/ClientUtils.java`
#### Snippet
```java
            }
            connection.addRequestProperty("User-Agent", "JReleaser/" + JReleaserVersion.getPlainVersion());
            connection.addRequestProperty("Content-Length", data.getData().length + "");
            connection.setRequestProperty("Content-Type", data.getContentType());
            headers.forEach(connection::setRequestProperty);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java
                int count = Integer.parseInt(readQuietly(markerFile));
                if (count < 3 && !JReleaserOutput.isQuiet()) out.println(INSTANCE.message);
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3 && !quiet) log.info(INSTANCE.message);
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
                        writer.println(INSTANCE.message);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3 && !quiet) log.info(INSTANCE.message);
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SbomCatalogerProcessorHelper` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/SbomCatalogerProcessorHelper.java`
#### Snippet
```java
 * @since 1.5.0
 */
public abstract class SbomCatalogerProcessorHelper {
    private static final Set<String> SUPPORTED_EXTENSIONS = setOf(
        ZIP.extension(),
```

### AbstractClassNeverImplemented
Abstract class `Banner` has no concrete subclass
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
 * @author Andres Almiray
 */
public abstract class Banner implements BuildService<Banner.Params> {
    private static final String ORG_JRELEASER_BANNER = "org.jreleaser.banner";

```

### AbstractClassNeverImplemented
Abstract class `Banner` has no concrete subclass
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
 * @author Andres Almiray
 */
public abstract class Banner implements BuildService<Banner.Params> {
    private static final String ORG_JRELEASER_BANNER = "org.jreleaser.banner";

```

### AbstractClassNeverImplemented
Abstract class `JReleaserLoggerService` has no concrete subclass
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
 * @since 1.4.0
 */
public abstract class JReleaserLoggerService implements BuildService<JReleaserLoggerService.Params>, AutoCloseable {
    private final JReleaserLogger logger;

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Releaseable`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Active.java`
#### Snippet
```java
    private final Predicate<Releaseable> test;

    Active(Predicate<Releaseable> test) {
        this.test = test;
    }
```

### BoundedWildcard
Can generalize to `? super Stream`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
    }

    public static <T> T listFilesAndProcess(Path path, Function<Stream<Path>, T> function) throws IOException {
        try (Stream<Path> files = Files.list(path)) {
            return function.apply(files);
```

### BoundedWildcard
Can generalize to `? extends Path`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
    }

    public static void copyFiles(JReleaserLogger logger, Path source, Path target, Set<Path> paths) throws IOException {
        logger.debug(RB.$("files.copy", source, target));

```

### BoundedWildcard
Can generalize to `? super Stream`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
    }

    public static void listFilesAndConsume(Path path, Consumer<Stream<Path>> consumer) throws IOException {
        try (Stream<Path> files = Files.list(path)) {
            consumer.accept(files);
```

### BoundedWildcard
Can generalize to `? super Path`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        private boolean success = true;

        FileTreeCopy(JReleaserLogger logger, Path source, Path target, Predicate<Path> filter) {
            this.logger = logger;
            this.source = source;
```

### BoundedWildcard
Can generalize to `? extends SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static void verify(JReleaserContext context, List<SigningUtils.FilePair> files) throws SigningException {
        context.getLogger().debug(RB.$("signing.verify.signatures"), files.size());

```

### BoundedWildcard
Can generalize to `? extends SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static void sign(JReleaserContext context, Keyring keyring, List<SigningUtils.FilePair> files) throws SigningException {
        Path signaturesDirectory = context.getSignaturesDirectory();

```

### BoundedWildcard
Can generalize to `? extends SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static void verify(JReleaserContext context, List<SigningUtils.FilePair> files,
                               Cosign cosign, Path publicKeyFile) throws SigningException {
        context.getLogger().debug(RB.$("signing.verify.signatures"), files.size());
```

### BoundedWildcard
Can generalize to `? super SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static List<SigningUtils.FilePair> collectArtifacts(JReleaserContext context, boolean forceSign, Predicate<SigningUtils.FilePair> validator) {
        List<SigningUtils.FilePair> files = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static void sign(JReleaserContext context, List<SigningUtils.FilePair> files) throws SigningException {
        Path signaturesDirectory = context.getSignaturesDirectory();

```

### BoundedWildcard
Can generalize to `? extends SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static void sign(JReleaserContext context, List<SigningUtils.FilePair> files,
                             Cosign cosign, Path privateKeyFile, String password) throws SigningException {
        Path signaturesDirectory = context.getSignaturesDirectory();
```

### BoundedWildcard
Can generalize to `? super String`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static void safePut(String key, Map<String, Object> src, Map<String, Object> dest, boolean forceKey) {
        if (src.containsKey(key)) {
            dest.put(key, src.get(key));
```

### BoundedWildcard
Can generalize to `? super String`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static void safePut(String key, Map<String, Object> src, Map<String, Object> dest) {
        if (src.containsKey(key)) {
            dest.put(key, src.get(key));
```

### BoundedWildcard
Can generalize to `? extends T`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static <T> List<T> reverse(Collection<T> input) {
        List<T> output = new ArrayList<>(input);
        Collections.reverse(output);
```

### BoundedWildcard
Can generalize to `? extends T`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static <T> boolean intersects(Set<T> s1, Set<T> s2) {
        Set<T> intersection = new LinkedHashSet<>(s1);
        intersection.removeAll(s2);
```

### BoundedWildcard
Can generalize to `? super String`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static void safePut(String key, Object value, Map<String, Object> dest) {
        if (null != value) {
            dest.put(key, value);
```

### BoundedWildcard
Can generalize to `? extends T`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static <T> List<T> reverse(List<T> input) {
        List<T> output = new ArrayList<>(input);
        Collections.reverse(output);
```

### BoundedWildcard
Can generalize to `? super String`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static void safePut(String key, Object value, Map<String, Object> dest, boolean forceKey) {
        if (null != value) {
            dest.put(key, value);
```

### BoundedWildcard
Can generalize to `? extends Path`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/NativeImageAssemblerProcessor.java`
#### Snippet
```java
    }

    private void nativeImage(TemplateContext props, Path assembleDirectory, Path graalPath, Set<Path> jars, String imageName) throws AssemblerProcessingException {
        String platform = assembler.getGraal().getPlatform();
        String platformReplaced = assembler.getPlatform().applyReplacements(platform);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
    }

    private void processExtension(JReleaserContext context, Extension extension, Set<String> visitedExtensionNames, Set<String> visitedExtensionTypes) {
        String extensionName = extension.getName();
        String extensionType = extension.getClass().getName();
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
    }

    private void processExtension(JReleaserContext context, Extension extension, Set<String> visitedExtensionNames, Set<String> visitedExtensionTypes) {
        String extensionName = extension.getName();
        String extensionType = extension.getClass().getName();
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/SdkmanHelper.java`
#### Snippet
```java
    }

    public static void collectArtifacts(JReleaserContext context, Distribution distribution, Map<String, String> platforms) {
        for (Artifact artifact : distribution.getArtifacts()) {
            if (!artifact.isActiveAndSelected()) continue;
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/SdkmanHelper.java`
#### Snippet
```java
    }

    public static void collectArtifacts(JReleaserContext context, Distribution distribution, Map<String, String> platforms) {
        for (Artifact artifact : distribution.getArtifacts()) {
            if (!artifact.isActiveAndSelected()) continue;
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/hooks/CommandHook.java`
#### Snippet
```java

    @Override
    public void asMap(boolean full, Map<String, Object> map) {
        map.put("cmd", cmd);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/hooks/ScriptHook.java`
#### Snippet
```java

    @Override
    public void asMap(boolean full, Map<String, Object> map) {
        map.put("shell", shell);
        map.put("run", run);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/HttpDelegate.java`
#### Snippet
```java
    }

    public void asMap(Map<String, Object> props) {
        props.put("authorization", authorization);
        props.put("username", isNotBlank(username) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/SshDelegate.java`
#### Snippet
```java
    }

    public void asMap(Map<String, Object> props) {
        props.put("host", isNotBlank(host) ? HIDE : UNSET);
        props.put("port", getPort());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/FtpDelegate.java`
#### Snippet
```java
    }

    public void asMap(Map<String, Object> props) {
        props.put("host", host);
        props.put("port", getPort());
```

### BoundedWildcard
Can generalize to `? extends PathMatcher`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java
        private boolean failed;

        private GlobResolver(JReleaserLogger logger, Path basedir, List<PathMatcher> matchers) {
            this.logger = logger;
            this.matchers = matchers;
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Nexus2MavenDeployer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("snapshotUrl", snapshotUrl);
        props.put("closeRepository", isCloseRepository());
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <T> Map<String, T> merge(Map<String, T> existing, Map<String, T> incoming) {
        Map<String, T> m1 = new LinkedHashMap<>();
        if (null != existing) m1.putAll(existing);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <T> Map<String, T> merge(Map<String, T> existing, Map<String, T> incoming) {
        Map<String, T> m1 = new LinkedHashMap<>();
        if (null != existing) m1.putAll(existing);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <E extends ModelObject<E>, T extends E> Map<String, T> mergeModel(Map<String, T> existing, Map<String, T> incoming) {
        Map<String, T> m1 = new LinkedHashMap<>();
        if (null != existing) m1.putAll(existing);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <T> Set<T> merge(Set<T> existing, Set<T> incoming) {
        Set<T> s1 = new LinkedHashSet<>();
        if (null != existing) s1.addAll(existing);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <T> Set<T> merge(Set<T> existing, Set<T> incoming) {
        Set<T> s1 = new LinkedHashSet<>();
        if (null != existing) s1.addAll(existing);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <T> List<T> merge(List<T> existing, List<T> incoming) {
        List<T> l1 = new ArrayList<>();
        if (null != existing) l1.addAll(existing);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/AbstractModelObject.java`
#### Snippet
```java
    }

    protected <T> List<T> merge(List<T> existing, List<T> incoming) {
        List<T> l1 = new ArrayList<>();
        if (null != existing) l1.addAll(existing);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/GitlabMavenDeployer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("projectIdentifier", projectIdentifier);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/GithubMavenDeployer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("repository", repository);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/GiteaUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("owner", owner);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractWebUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("uploadUrl", uploadUrl);
        props.put("downloadUrl", downloadUrl);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/GitlabUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("projectIdentifier", projectIdentifier);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractGitPackageUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("token", isNotBlank(token) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/S3Uploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("region", region);
        props.put("bucket", bucket);
```

### BoundedWildcard
Can generalize to `? extends WorkflowListener`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserContext.java`
#### Snippet
```java
    }

    public void setWorkflowListeners(Collection<WorkflowListener> workflowListeners) {
        this.workflowListeners.clear();
        this.workflowListeners.addAll(workflowListeners);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("version", version);
        props.put("formats", formats);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("version", version);
        props.put("formats", formats);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TeamsAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        props.put("messageTemplate", messageTemplate);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscussionsAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("organization", organization);
        props.put("team", team);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/WebhooksAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        this.webhooks.values()
            .stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/ArticleAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("commitAuthor", commitAuthor.asMap(full));
        props.put("repository", repository.asMap(full));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SdkmanAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("consumerKey", isNotBlank(consumerKey) ? HIDE : UNSET);
        props.put("consumerToken", isNotBlank(consumerToken) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/AbstractMessageAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("message", message);
        props.put("messageTemplate", messageTemplate);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TelegramAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("token", isNotBlank(token) ? HIDE : UNSET);
        props.put("chatId", isNotBlank(chatId) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/WebhookAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        super.asMap(full, props);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/MastodonAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("accessToken", isNotBlank(accessToken) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/GitterAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/MattermostAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SlackAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        props.put("token", isNotBlank(token) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TwitterAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("consumerKey", isNotBlank(consumerKey) ? HIDE : UNSET);
        props.put("consumerSecret", isNotBlank(consumerSecret) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncers.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        this.http.values()
            .stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/GoogleChatAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/LinkedinAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("owner", isNotBlank(owner) ? HIDE : UNSET);
        props.put("accessToken", isNotBlank(accessToken) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscourseAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("apiKey", isNotBlank(apiKey) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/OpenCollectiveAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("token", isNotBlank(token) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("transport", transport);
        props.put("host", host);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/ZulipAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("account", account);
        props.put("apiKey", isNotBlank(apiKey) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscordAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(webhook) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/AbstractJavaAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("executable", executable);
        props.put("mainJar", mainJar.asMap(full));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/ArchiveAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("archiveName", archiveName);
        props.put("distributionType", distributionType);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JavaArchiveAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("archiveName", archiveName);
        props.put("formats", formats);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("imageName", imageName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("imageName", imageName);
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/AbstractDownloader.java`
#### Snippet
```java

    @Override
    public void setAssets(List<Asset> assets) {
        this.assets.clear();
        this.assets.addAll(assets);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SdkmanPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("candidate", candidate);
        props.put("command", command);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> map) {
        super.asMap(full, map);
        map.put("requiresTerminal", isRequiresTerminal());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("packageName", packageName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractAppdataPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("componentId", componentId);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("packageName", packageName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("toolcheck", toolCheck);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> map) {
        super.asMap(full, map);
        map.put("runtime", runtime);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractRepositoryPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("commitAuthor", commitAuthor.asMap(full));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("repository", repository.asMap(full));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("commitAuthor", commitAuthor.asMap(full));
        props.put("repository", repository.asMap(full));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("packageName", packageName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibSpec.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("matchers", matchers);
        if (null != artifact) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/WingetPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("defaultLocale", defaultLocale);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("jlink", jlink);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        protected void asMap(boolean full, Map<String, Object> props) {
            props.put("packageIdentifier", packageIdentifier);
            props.put("packageName", packageName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        protected void asMap(boolean full, Map<String, Object> props) {
            props.put("console", console);
            props.put("dirChooser", dirChooser);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        protected void asMap(boolean full, Map<String, Object> props) {
            props.put("packageName", packageName);
            props.put("maintainer", maintainer);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractTemplatePackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("templateDirectory", templateDirectory);
        props.put("skipTemplates", skipTemplates);
```

### BoundedWildcard
Can generalize to `? extends List`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java
        }

        public void setZap(Map<String, List<String>> zap) {
            this.zap.clear();
            zap.forEach((name, items) -> this.zap.add(new CaskItem(name, items)));
```

### BoundedWildcard
Can generalize to `? extends List`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java
        }

        public void setUninstall(Map<String, List<String>> uninstall) {
            this.uninstall.clear();
            uninstall.forEach((name, items) -> this.uninstall.add(new CaskItem(name, items)));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("formulaName", formulaName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("matchers", matchers);
        if (null != artifact) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("packageName", packageName);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("alias", alias);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("version", version);
        props.put("commitAuthor", commitAuthor.asMap(full));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("packageName", packageName);
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/release/AbstractReleaserBuilder.java`
#### Snippet
```java

    @Override
    public ReleaserBuilder<R> setReleaseAssets(List<Asset> assets) {
        if (null != assets) {
            this.assets.addAll(assets);
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactUploader.java`
#### Snippet
```java
    }

    private void resolveHeaders(Artifact artifact, Map<String, String> headers) {
        TemplateContext props = uploader.artifactProps(context, artifact);
        uploader.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactUploader.java`
#### Snippet
```java
    }

    private void resolveHeaders(Artifact artifact, Map<String, String> headers) {
        TemplateContext props = uploader.artifactProps(context, artifact);
        uploader.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
    }

    private void resolveHeaders(org.jreleaser.model.internal.announce.HttpAnnouncer announcer, Map<String, String> headers) {
        TemplateContext props = context.props();
        announcer.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
    }

    private void resolveHeaders(org.jreleaser.model.internal.announce.HttpAnnouncer announcer, Map<String, String> headers) {
        TemplateContext props = context.props();
        announcer.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaMavenDeployer.java`
#### Snippet
```java

    @Override
    protected void deleteExistingPackages(String baseUrl, String token, Set<Deployable> deployables) throws DeployException {
        for (Deployable deployable : deployables) {
            if (deployable.getFilename().endsWith(".pom")) {
```

### BoundedWildcard
Can generalize to `? extends GtLabel`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/api/GtIssue.java`
#### Snippet
```java
    }

    public void setLabels(List<GtLabel> labels) {
        if (null != labels) {
            this.labels.clear();
```

### BoundedWildcard
Can generalize to `? extends GhLabel`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/api/GhIssue.java`
#### Snippet
```java
    }

    public void setLabels(List<GhLabel> labels) {
        if (null != labels) {
            this.labels.clear();
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
    }

    public void updateAssets(String owner, String repo, GtRelease release, Set<Asset> assets, Map<String, GtAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends GtAsset`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
    }

    public void updateAssets(String owner, String repo, GtRelease release, Set<Asset> assets, Map<String, GtAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
    }

    public void uploadAssets(String owner, String repo, GtRelease release, Set<Asset> assets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubMavenDeployer.java`
#### Snippet
```java

    @Override
    protected void deleteExistingPackages(String baseUrl, String token, Set<Deployable> deployables) throws DeployException {
        for (Deployable deployable : deployables) {
            if (deployable.getFilename().endsWith(".pom")) {
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabMavenDeployer.java`
#### Snippet
```java

    @Override
    protected void deleteExistingPackages(String baseUrl, String token, Set<Deployable> deployables) throws DeployException {
        Gitlab api = createApi(baseUrl, token);
        List<GlPackage> glPackages = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/internal/Page.java`
#### Snippet
```java
    }

    private int resolveInt(Map<String, Collection<String>> headers, String key) {
        Collection<String> values = headers.get(key);
        if (null != values && !values.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    private void collectPackageVersions(Page<List<GhPackageVersion>> page, List<GhPackageVersion> issues) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super GhPackageVersion`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    private void collectPackageVersions(Page<List<GhPackageVersion>> page, List<GhPackageVersion> issues) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    void updateAssets(String owner, String repo, GhRelease release, Set<Asset> assets, Map<String, GhAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends GhAsset`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    void updateAssets(String owner, String repo, GhRelease release, Set<Asset> assets, Map<String, GhAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    void uploadAssets(GhRelease release, Set<Asset> assets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends GlFileUpload`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    void linkReleaseAssets(String owner, String repoName, GlRelease release, Integer projectIdentifier, Collection<GlFileUpload> uploads) throws RestAPIException {
        logger.info(RB.$("git.upload.asset.links"), owner, repoName, release.getTagName());

```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectBranches(Page<List<GlBranch>> page, List<String> branches) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectBranches(Page<List<GlBranch>> page, List<String> branches) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectPackages(Page<List<GlPackage>> page, List<GlPackage> packages) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super GlPackage`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectPackages(Page<List<GlPackage>> page, List<GlPackage> packages) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectIssues(Page<List<GlIssue>> page, List<GlIssue> issues) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super GlIssue`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectIssues(Page<List<GlIssue>> page, List<GlIssue> issues) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    Collection<GlFileUpload> uploadAssets(String owner, String repoName, Integer projectIdentifier, Set<Asset> assets) throws IOException, RestAPIException {
        logger.debug(RB.$("git.upload.assets"), owner, repoName);

```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectLabels(Page<List<GlLabel>> page, List<GlLabel> labels) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super GlLabel`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectLabels(Page<List<GlLabel>> page, List<GlLabel> labels) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectReleases(Page<List<GlRelease>> page, List<Release> releases) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super Release`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectReleases(Page<List<GlRelease>> page, List<Release> releases) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends List`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectLinks(Page<List<GlLink>> page, List<GlLink> links) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super GlLink`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    private void collectLinks(Page<List<GlLink>> page, List<GlLink> links) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? extends GlLinkRequest`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    void linkAssets(String owner, String repoName, GlRelease release, Integer projectIdentifier, Collection<GlLinkRequest> links) throws RestAPIException {
        logger.info(RB.$("git.upload.asset.links"), owner, repoName, release.getTagName());

```

### BoundedWildcard
Can generalize to `? extends R`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
        }

        public <R> R retry(CheckedPredicate<R> stopFunction, CheckedSupplier<R> retriableOperation) {
            final int maxAttempts = maxRetries + 1;

```

### BoundedWildcard
Can generalize to `? super GlLinkRequest`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
    }

    private void collectUploadLinks(Uploader<?> uploader, List<GlLinkRequest> links) {
        List<String> keys = uploader.resolveSkipKeys();
        keys.add(org.jreleaser.model.api.release.GitlabReleaser.SKIP_GITLAB_LINKS);
```

### BoundedWildcard
Can generalize to `? extends GlLink`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
    }

    private void updateAssets(Gitlab api, GlRelease release, Set<Asset> assetsToBeUpdated, Integer projectIdentifier, String tagName, Map<String, GlLink> existingLinks) throws IOException {
        if (!assetsToBeUpdated.isEmpty()) {
            for (Asset asset : assetsToBeUpdated) {
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void checksumDeployables(Map<String, Deployable> deployablesMap, Set<Deployable> deployables) {
        if (!getDeployer().isChecksums()) {
            return;
```

### BoundedWildcard
Can generalize to `? super Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void checksumDeployables(Map<String, Deployable> deployablesMap, Set<Deployable> deployables) {
        if (!getDeployer().isChecksums()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void checkMavenCentralRules(Map<String, Deployable> deployablesMap, Errors errors) {
        // 1st check jar, sources, javadoc if applicable
        for (Deployable deployable : deployablesMap.values()) {
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void signDeployables(Map<String, Deployable> deployablesMap, Set<Deployable> deployables) {
        if (!getDeployer().isSign()) {
            return;
```

### BoundedWildcard
Can generalize to `? super Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void signDeployables(Map<String, Deployable> deployablesMap, Set<Deployable> deployables) {
        if (!getDeployer().isSign()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends RevCommit`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
    protected String formatChangelog(JReleaserContext context,
                                     Changelog changelog,
                                     List<RevCommit> commits,
                                     Comparator<RevCommit> revCommitComparator,
                                     String lineSeparator) {
```

### BoundedWildcard
Can generalize to `? super RevCommit`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
                                     Changelog changelog,
                                     List<RevCommit> commits,
                                     Comparator<RevCommit> revCommitComparator,
                                     String lineSeparator) {
        Set<Contributor> contributors = new TreeSet<>();
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-y", "--deployer", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-s", "--assembler", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Config.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-a", "--assembly", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractDistributionModelCommand.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-d", "--distribution", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-d", "--distribution", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-a", "--announcer", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPackagerModelCommand.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-d", "--distribution", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-sn", "--snapshot", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-d", "--downloader", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPlatformAwareModelCommand.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-scp", "--select-current-platform", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Announce.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-a", "--announcer", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractModelCommand.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-grs", "--git-root-search", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractLoggingCommand.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        args.add(new DeprecatedArg("-od", "--output-directory", "1.5.0"));
    }
```

### BoundedWildcard
Can generalize to `? super AbstractCommand.DeprecatedArg`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

    @Override
    protected void collectCandidateDeprecatedArgs(Set<AbstractCommand.DeprecatedArg> args) {
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-d", "--distribution", "1.5.0"));
```

### BoundedWildcard
Can generalize to `? extends License`
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/internal/JReleaserModelConfigurer.java`
#### Snippet
```java
    }

    private static License resolveLicense(List<License> licenses) {
        if (null == licenses || licenses.isEmpty()) return null;
        for (License license : licenses) {
```

### BoundedWildcard
Can generalize to `? extends Developer`
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/internal/JReleaserModelConfigurer.java`
#### Snippet
```java
    }

    private static List<String> resolveAuthors(List<Developer> developers) {
        if (null == developers || developers.isEmpty()) return Collections.emptyList();

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            File s = src.toFile();
            File d = dest.toFile();
            d.setReadable(s.canRead());
            d.setWritable(s.canWrite());
            d.setExecutable(s.canExecute());
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            File d = dest.toFile();
            d.setReadable(s.canRead());
            d.setWritable(s.canWrite());
            d.setExecutable(s.canExecute());
        }
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            d.setReadable(s.canRead());
            d.setWritable(s.canWrite());
            d.setExecutable(s.canExecute());
        }
    }
```

### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            Files.setPosixFilePermissions(path, perms);
        } else if (accessRights.contains("r")) {
            path.toFile().setReadable(true);
        } else if (accessRights.contains("w")) {
            path.toFile().setWritable(true);
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            path.toFile().setReadable(true);
        } else if (accessRights.contains("w")) {
            path.toFile().setWritable(true);
        } else if (accessRights.contains("x")) {
            path.toFile().setExecutable(true);
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            path.toFile().setWritable(true);
        } else if (accessRights.contains("x")) {
            path.toFile().setExecutable(true);
        }
    }
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            fileAttributeView.setPermissions(convertToPermissionsSet(mode));
        } else {
            path.toFile().setExecutable(true);
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
            }
            if (!keepRoot) Files.deleteIfExists(path);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/checksum/Checksum.java`
#### Snippet
```java
            context.getLogger().info("{}.{}", context.relativizeToBasedir(input), algorithm.formatted());
            String hashcode = ChecksumUtils.checksum(algorithm, Files.readAllBytes(input));
            output.toFile().getParentFile().mkdirs();
            Files.write(output, hashcode.getBytes(UTF_8));
            return hashcode;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java
        if (!markerFile.exists()) {
            if (!JReleaserOutput.isQuiet()) out.println(INSTANCE.message);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                writer.println(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java
@CommandLine.Command(name = "generate")
public class TemplateGenerate extends AbstractLoggingCommand<Template> {
    @CommandLine.ArgGroup(exclusive = true, multiplicity = "1")
    Composite composite;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractUploader.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/AbstractAnnouncer.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Http` is the same as one of its superclass' names
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Http.java`
#### Snippet
```java
 * @since 1.5.0
 */
public interface Http extends org.jreleaser.model.Http, Serializable {
    void setUsername(String username);

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/DefaultSdkmanCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractSdkmanCommand.Builder<Builder> {
        protected Builder(JReleaserLogger logger) {
            super(logger);
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MajorReleaseSdkmanCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractSdkmanCommand.Builder<Builder> {
        private final Map<String, String> platforms = new LinkedHashMap<>();
        private String hashtag;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/ReleaseSdkmanCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractSdkmanCommand.Builder<Builder> {
        private final Map<String, String> platforms = new LinkedHashMap<>();
        private String url;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/AnnounceSdkmanCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractSdkmanCommand.Builder<Builder> {
        private String hashtag;
        private String releaseNotesUrl;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MinorReleaseSdkmanCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractSdkmanCommand.Builder<Builder> {
        private final Map<String, String> platforms = new LinkedHashMap<>();
        private String hashtag;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `sdks/jreleaser-twitter-java-sdk/src/main/java/org/jreleaser/sdk/twitter/UpdateStatusTwitterCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractTwitterCommand.Builder<Builder> {
        private List<String> statuses;

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/internal/Colorizer.java`
#### Snippet
```java
    @Override
    public void print(String s) {
        super.print(CommandLine.Help.Ansi.AUTO.text("@|red " + s + "|@"));
    }
}
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
        @Override
        public boolean containsAll(Collection<?> objects) {
            return delegate.containsAll(objects);
        }

```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`className = className + trailingName` could be simplified to 'className += trailingName'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        String className = capitalize(logicalName);
        if (null != trailingName) {
            className = className + trailingName;
        }

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/IoUtils.java`
#### Snippet
```java
        try (InputStreamReader reader = new InputStreamReader(input, UTF_8)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                consumer.accept((char) ch);
            }
```

### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            final Set<String> likeSet = new LinkedHashSet<String>();
            String line;
            while((line = reader.readLine()) != null) {
                // Parse the ID line.
                if (line.startsWith(LINUX_ID_PREFIX)) {
```

### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
    private static void unpackArchive(String basename, File destinationDir, ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
                // log something?
```

### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
    private static String resolveRootEntryName(ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
                // log something?
```

### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
                // log something?
```

### NestedAssignment
Result of assignment expression used
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java

                int ch;
                while ((ch = fileInputStream.read()) >= 0) {
                    sig.update((byte) ch);
                }
```

### NestedAssignment
Result of assignment expression used
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java
            byte[] buffer = new byte[8192];
            int length = 0;
            while ((length = in.read(buffer)) >= 0) {
                signatureGenerator.update(buffer, 0, length);
            }
```

### NestedAssignment
Result of assignment expression used
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

                int ch;
                while ((ch = fileInputStream.read()) >= 0) {
                    sig.update((byte) ch);
                }
```

## RuleId[id=ExcessiveLambdaUsage]
### ExcessiveLambdaUsage
Excessive lambda usage
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/signing/SigningValidator.java`
#### Snippet
```java
            .filter(b -> b)
            .findAny()
            .orElseGet(() -> false);

        if (!checkSign) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param context the execution context.
     */
    void onSessionStart(JReleaserContext context);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param context the execution context.
     */
    void onSessionEnd(JReleaserContext context);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param context the execution context.
     */
    void onWorkflowStep(ExecutionEvent event, JReleaserContext context);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param announcer the executing announcer.
     */
    void onAnnounceStep(ExecutionEvent event, JReleaserContext context, Announcer announcer);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param assembler the executing assembler.
     */
    void onAssembleStep(ExecutionEvent event, JReleaserContext context, Assembler assembler);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param cataloger the executing cataloger.
     */
    void onCatalogStep(ExecutionEvent event, JReleaserContext context, Cataloger cataloger);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param deployer the executing deployer.
     */
    void onDeployStep(ExecutionEvent event, JReleaserContext context, Deployer deployer);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param downloader the executing downloader.
     */
    void onDownloadStep(ExecutionEvent event, JReleaserContext context, Downloader downloader);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param uploader the executing uploader.
     */
    void onUploadStep(ExecutionEvent event, JReleaserContext context, Uploader uploader);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param releaser the executing releaser.
     */
    void onReleaseStep(ExecutionEvent event, JReleaserContext context, Releaser releaser);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param distribution the distribution to be processed.
     */
    void onDistributionStart(JReleaserContext context, Distribution distribution);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param distribution the processed distribution.
     */
    void onDistributionEnd(JReleaserContext context, Distribution distribution);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param packager     the executing packager.
     */
    void onPackagerPrepareStep(ExecutionEvent event, JReleaserContext context, Distribution distribution, Packager packager);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param packager     the executing packager.
     */
    void onPackagerPackageStep(ExecutionEvent event, JReleaserContext context, Distribution distribution, Packager packager);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/workflow/WorkflowListener.java`
#### Snippet
```java
     * @param packager     the executing packager.
     */
    void onPackagerPublishStep(ExecutionEvent event, JReleaserContext context, Distribution distribution, Packager packager);
}

```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
    }

    protected abstract void log(String message);
    protected abstract void logProperty(String name, String value);

```

### EmptyMethod
All implementations of this method are empty
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java

    protected abstract void log(String message);
    protected abstract void logProperty(String name, String value);

    private static String normalizeOs(String value) {
```

### EmptyMethod
The method is empty
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
    }

    private static void validateWindows(JReleaserContext context, JpackageAssembler jpackage, JpackageAssembler.Windows packager, Errors errors) {
        // noop
    }
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/upload/FtpUploader.java`
#### Snippet
```java
 * @since 1.1.0
 */
public interface FtpUploader extends Uploader, ExtraProperties, Ftp {
    String getPath();

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/upload/ArtifactoryUploader.java`
#### Snippet
```java
 * @since 0.3.0
 */
public interface ArtifactoryUploader extends Uploader, ExtraProperties {
    String TYPE = "artifactory";

```

### RedundantImplements
Redundant interface declaration `Assembler`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/assemble/NativeImageAssembler.java`
#### Snippet
```java
 * @since 0.2.0
 */
public interface NativeImageAssembler extends Assembler, JavaAssembler {
    String TYPE = "native-image";

```

### RedundantImplements
Redundant interface declaration `Assembler`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/assemble/JlinkAssembler.java`
#### Snippet
```java
 * @since 0.2.0
 */
public interface JlinkAssembler extends Assembler, JavaAssembler {
    String TYPE = "jlink";

```

### RedundantImplements
Redundant interface declaration `Assembler`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/assemble/JpackageAssembler.java`
#### Snippet
```java
 * @since 0.10.0
 */
public interface JpackageAssembler extends Assembler, JavaAssembler {
    String TYPE = "jpackage";

```

### RedundantImplements
Redundant interface declaration `Serializable`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/HttpDelegate.java`
#### Snippet
```java
 * @since 1.5.0
 */
public final class HttpDelegate extends AbstractModelObject<HttpDelegate> implements org.jreleaser.model.internal.common.Http, Serializable {
    private static final long serialVersionUID = 4594339452100983408L;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Glob.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Glob extends AbstractArtifact<Glob> implements Domain, ExtraProperties {
    private static final long serialVersionUID = -7355184705247562138L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Glob.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Glob extends AbstractArtifact<Glob> implements Domain, ExtraProperties {
    private static final long serialVersionUID = -7355184705247562138L;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/FileSet.java`
#### Snippet
```java
 * @since 0.8.0
 */
public final class FileSet extends AbstractArtifact<FileSet> implements Domain, ExtraProperties {
    private static final long serialVersionUID = 4945222704477480182L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/FileSet.java`
#### Snippet
```java
 * @since 0.8.0
 */
public final class FileSet extends AbstractArtifact<FileSet> implements Domain, ExtraProperties {
    private static final long serialVersionUID = 4945222704477480182L;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Artifact.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Artifact extends AbstractArtifact<Artifact> implements Domain, ExtraProperties, Comparable<Artifact> {
    private static final long serialVersionUID = 4590895350785446198L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Artifact.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Artifact extends AbstractArtifact<Artifact> implements Domain, ExtraProperties, Comparable<Artifact> {
    private static final long serialVersionUID = 4590895350785446198L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/AbstractMavenDeployer.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class AbstractMavenDeployer<S extends AbstractMavenDeployer<S, A>, A extends org.jreleaser.model.api.deploy.maven.MavenDeployer> extends AbstractActivatable<S> implements MavenDeployer<A>, ExtraProperties {
    private static final long serialVersionUID = 4927436336504358521L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractUploader.java`
#### Snippet
```java
 * @since 0.3.0
 */
public abstract class AbstractUploader<A extends org.jreleaser.model.api.upload.Uploader, S extends AbstractUploader<A, S>> extends AbstractActivatable<S> implements Uploader<A>, ExtraProperties {
    private static final long serialVersionUID = 2011958303607038304L;

```

### RedundantImplements
Redundant interface declaration `Activatable`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/Sbom.java`
#### Snippet
```java
 * @since 1.5.0
 */
public final class Sbom extends AbstractActivatable<Sbom> implements Domain, Activatable {
    private static final long serialVersionUID = 8210488305115310708L;

```

### RedundantImplements
Redundant interface declaration `Activatable`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
 * @since 1.3.0
 */
public final class Maven extends AbstractActivatable<Maven> implements Domain, Activatable {
    private static final long serialVersionUID = 3407667714827239350L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/AbstractSbomCataloger.java`
#### Snippet
```java
 * @since 1.5.0
 */
public abstract class AbstractSbomCataloger<S extends AbstractSbomCataloger<S, A>, A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger> extends AbstractActivatable<S> implements SbomCataloger<A>, ExtraProperties {
    private static final long serialVersionUID = -8115903657059268124L;

```

### RedundantImplements
Redundant interface declaration `Activatable`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
 * @since 0.2.0
 */
public final class Assemble extends AbstractActivatable<Assemble> implements Domain, Activatable {
    private static final long serialVersionUID = -1628051897310444948L;

```

### RedundantImplements
Redundant interface declaration `RepositoryPackager`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractAppdataPackager.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class AbstractAppdataPackager<A extends org.jreleaser.model.api.packagers.RepositoryPackager, S extends AbstractAppdataPackager<A, S>> extends AbstractRepositoryPackager<A, S> implements RepositoryPackager<A> {
    private static final long serialVersionUID = -7485882117643430732L;

```

### RedundantImplements
Redundant interface declaration `CommitAuthorAware`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class DockerPackager extends AbstractDockerConfiguration<DockerPackager> implements RepositoryPackager<org.jreleaser.model.api.packagers.DockerPackager>, CommitAuthorAware {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -8293471753814007950L;
```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
    }

    public static final class DockerRepository extends AbstractRepositoryTap<DockerRepository> implements Domain {
        private static final long serialVersionUID = -3428854203388975153L;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibSpec.java`
#### Snippet
```java
 * @since 1.6.0
 */
public final class JibSpec extends AbstractJibConfiguration<JibSpec> implements Domain {
    private static final long serialVersionUID = -7696534492476787337L;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
 * @since 0.4.0
 */
public final class DockerSpec extends AbstractDockerConfiguration<DockerSpec> implements Domain {
    private static final long serialVersionUID = 5373884037924711407L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractJibConfiguration.java`
#### Snippet
```java
 */
public abstract class AbstractJibConfiguration<S extends AbstractJibConfiguration<S>> extends AbstractActivatable<S>
    implements JibConfiguration, ExtraProperties {
    private static final long serialVersionUID = 1610025836172412213L;

```

### RedundantImplements
Redundant interface declaration `CommitAuthorAware`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java
 * @since 1.6.0
 */
public final class JibPackager extends AbstractJibConfiguration<JibPackager> implements RepositoryPackager<org.jreleaser.model.api.packagers.JibPackager>, CommitAuthorAware {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -5161609035832200577L;
```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java
    }

    public static final class JibRepository extends AbstractRepositoryTap<JibRepository> implements Domain {
        private static final long serialVersionUID = 897211659819449100L;

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractDockerConfiguration.java`
#### Snippet
```java
 */
public abstract class AbstractDockerConfiguration<S extends AbstractDockerConfiguration<S>> extends AbstractActivatable<S>
    implements DockerConfiguration, ExtraProperties {
    private static final long serialVersionUID = 9145623803421730899L;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Distribution extends Packagers<Distribution> implements Domain, Activatable, ExtraProperties {
    private static final long serialVersionUID = 8423362983187267131L;

```

### RedundantImplements
Redundant interface declaration `Activatable`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Distribution extends Packagers<Distribution> implements Domain, Activatable, ExtraProperties {
    private static final long serialVersionUID = 8423362983187267131L;

```

### RedundantImplements
Redundant interface declaration `Callable`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractLoggingCommand.java`
#### Snippet
```java
 * @since 0.1.0
 */
abstract class AbstractLoggingCommand<C extends IO> extends AbstractCommand<C> implements Callable<Integer> {
    protected JReleaserLogger logger;

```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `NotXml` does not end with 'Exception'
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
    }

    static class NotXml extends IOException {
        private static final long serialVersionUID = -6458245950020411953L;
    }
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                    artifact.isOptional(context) && !artifact.resolvedPathExists()) continue;
                Path input = artifact.getEffectivePath(context);
                Path output = signaturesDirectory.resolve(input.getFileName().toString().concat(extension));
                SigningUtils.FilePair pair = new SigningUtils.FilePair(input, output);
                if (!forceSign) pair.setValid(validator.test(pair));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                    Path input = artifact.getEffectivePath(context, distribution);
                    if (artifact.isOptional(context) && !artifact.resolvedPathExists()) continue;
                    Path output = signaturesDirectory.resolve(input.getFileName().toString().concat(extension));
                    SigningUtils.FilePair pair = new SigningUtils.FilePair(input, output);
                    if (!forceSign) pair.setValid(validator.test(pair));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                for (Artifact artifact : SbomCatalogerProcessorHelper.resolveArtifacts(context, cataloger)) {
                    Path input = artifact.getEffectivePath(context);
                    Path output = signaturesDirectory.resolve(input.getFileName().toString().concat(extension));
                    SigningUtils.FilePair pair = new SigningUtils.FilePair(input, output);
                    if (!forceSign) pair.setValid(validator.test(pair));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                    .resolve(context.getModel().getChecksum().getResolvedName(context, algorithm));
                if (Files.exists(checksums)) {
                    Path output = signaturesDirectory.resolve(checksums.getFileName().toString().concat(extension));
                    SigningUtils.FilePair pair = new SigningUtils.FilePair(checksums, output);
                    if (!forceSign) pair.setValid(validator.test(pair));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/ChocolateyPackagerProcessor.java`
#### Snippet
```java

        Path outputFile = "binary.nuspec".equals(fileName) ?
            outputDirectory.resolve(distribution.getName()).resolve(packager.getPackageName().concat(".nuspec")) :
            fileName.endsWith(".ps1") ? outputDirectory.resolve(distribution.getName()).resolve(fileName) :
                outputDirectory.resolve(fileName);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SpecPackagerProcessor.java`
#### Snippet
```java

        Path outputFile = "app.spec".equals(fileName) ?
            outputDirectory.resolve(packager.getPackageName().concat(".spec")) :
            outputDirectory.resolve(fileName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java
        String scriptName = props.get(KEY_JBANG_SCRIPT_NAME);
        Path outputFile = "jbang.java".equals(fileName) ?
            outputDirectory.resolve(scriptName.concat(".java")) :
            outputDirectory.resolve(fileName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/ScoopPackagerProcessor.java`
#### Snippet
```java

        Path outputFile = "manifest.json".equals(fileName) ?
            outputDirectory.resolve("bucket").resolve(packager.getPackageName().concat(".json")) :
            outputDirectory.resolve(fileName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/GofishPackagerProcessor.java`
#### Snippet
```java

        Path outputFile = "food.lua".equals(fileName) ?
            outputDirectory.resolve("Food").resolve(distribution.getExecutable().getName().concat(".lua")) :
            outputDirectory.resolve(fileName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
            if (FORMULA_RB.equals(fileName) || FORMULA_MULTI_RB.equals(fileName)) return;
            writeFile(content, CASK_RB.equals(fileName) ?
                outputDirectory.resolve(CASKS).resolve(packager.getCask().getResolvedCaskName(props).concat(RB)) :
                outputDirectory.resolve(fileName));
        } else if (packager.isMultiPlatform()) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
            if (CASK_RB.equals(fileName) || FORMULA_RB.equals(fileName)) return;
            writeFile(content, FORMULA_MULTI_RB.equals(fileName) ?
                outputDirectory.resolve(FORMULA).resolve(distribution.getExecutable().getName().concat(RB)) :
                outputDirectory.resolve(fileName));
        } else {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
            writeFile(content, FORMULA_RB.equals(fileName) ?
                outputDirectory.resolve(FORMULA)
                    .resolve(getHyphenatedName(packager.getFormulaName()).concat(RB)) :
                outputDirectory.resolve(fileName));
        }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JavaArchiveAssemblerProcessor.java`
#### Snippet
```java
        unixExtension = isNotBlank(unixExtension) ? "." + unixExtension : "";
        return "bin/launcher.bat".equals(fileName) ?
            targetDirectory.resolve(BIN_DIRECTORY).resolve(executableName.concat(windowsExtension)) :
            "bin/launcher".equals(fileName) ?
                targetDirectory.resolve(BIN_DIRECTORY).resolve(executableName.concat(unixExtension)) :
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JavaArchiveAssemblerProcessor.java`
#### Snippet
```java
            targetDirectory.resolve(BIN_DIRECTORY).resolve(executableName.concat(windowsExtension)) :
            "bin/launcher".equals(fileName) ?
                targetDirectory.resolve(BIN_DIRECTORY).resolve(executableName.concat(unixExtension)) :
                targetDirectory.resolve(fileName);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JlinkAssemblerProcessor.java`
#### Snippet
```java

        return "bin/launcher.bat".equals(fileName) ?
            targetDirectory.resolve(BIN_DIRECTORY).resolve(executableName.concat(BAT.extension())) :
            "bin/launcher".equals(fileName) ?
                targetDirectory.resolve(BIN_DIRECTORY).resolve(executableName) :
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java
        }

        Path output = input.getParent().resolve(input.getFileName().toString().concat(extension));
        FilePair pair = new FilePair(input, output);
        pair.setValid(isValid(context, pair));
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'feign.FeignException', in the throws list already.
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java

        @Override
        public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
            try {
                return xml.decode(response, type);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/signing/Keyring.java`
#### Snippet
```java
    public static class EmptyInputStream extends ByteArrayInputStream {
        public EmptyInputStream() {
            super(new byte[0]);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java

    private String[] split(String s, List<Character> delims) {
        if (isBlank(s)) return new String[0];

        List<String> tokens = new ArrayList<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        }

        return tokens.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ProcessorUtil.java`
#### Snippet
```java
            "",
            fileName,
            context.getElements().toArray(new Element[0]));

        write(content, resource);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static void unpackArchive(String basename, File destinationDir, ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static String resolveRootEntryName(ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        List<String> entries = new ArrayList<>();

        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `y` initializer `null` is redundant
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        List<Character> delims = listOf('.', '_', '-', '[');
        String f = format.trim();
        String y = null;
        String m = null;
        String w = null;
```

### UnusedAssignment
Variable `o` initializer `null` is redundant
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        String n = null;
        String r = null;
        String o = null;
        int i = 0;

```

### UnusedAssignment
Variable `done` initializer `false` is redundant
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java

        boolean micro = false;
        boolean done = false;
        if (binarySearch(NUMBERS, s.token) >= 0) {
            tokens.add(s.token);
```

### UnusedAssignment
Variable `repository` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelConfigurer.java`
#### Snippet
```java
        }

        Repository repository = null;
        try {
            repository = GitSdk.of(context).getRemote();
```

### UnusedAssignment
Variable `fullChangelog` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/ChangelogResolver.java`
#### Snippet
```java

        Path target = context.getBasedir().resolve(append.getTarget());
        String fullChangelog = null;
        try {
            fullChangelog = Files.exists(target) ? new String(Files.readAllBytes(target), UTF_8) : "";
```

### UnusedAssignment
Variable `commandLine` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java

    private void executeCommandLine(Map<String, String> localEnv, Hook hook, String cmd, String resolvedCmd, String errorKey) {
        List<String> commandLine = null;

        Map<String, String> hookEnv = new LinkedHashMap<>(localEnv);
```

### UnusedAssignment
Variable `scriptFile` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
        try {
            for (ScriptHook hook : hooks) {
                Path scriptFile = null;

                try {
```

### UnusedAssignment
Variable `service` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelAutoConfigurer.java`
#### Snippet
```java
            boolean grs = resolveBoolean(org.jreleaser.model.api.JReleaserContext.GIT_ROOT_SEARCH, gitRootSearch);
            Repository repository = GitSdk.of(basedir, grs).getRemote();
            BaseReleaser<?, ?> service = null;
            switch (repository.getKind()) {
                case GITHUB:
```

### UnusedAssignment
Variable `pgpSigList` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                new FileInputStream(filePair.getSignatureFile().toFile())))) {
            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;

            Object obj = pgpObjFactory.nextObject();
```

### UnusedAssignment
Variable `jars` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
        }

        List<Path> jars = null;
        try (Stream<Path> jarPaths = Files.list(directoryPath)) {
            jars = jarPaths
```

### UnusedAssignment
Variable `artifactFile` initializer `""` is redundant
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
        public String apply(String input) {
            String format = MARKDOWN;
            String artifactFile = "";
            String linkName = "";
            String[] parts = input.split(":");
```

### UnusedAssignment
Variable `linkName` initializer `""` is redundant
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
            String format = MARKDOWN;
            String artifactFile = "";
            String linkName = "";
            String[] parts = input.split(":");
            if (parts.length == 1) {
```

### UnusedAssignment
Variable `config` initializer `null` is redundant
in `core/jreleaser-config-yaml/src/main/java/org/jreleaser/config/yaml/YamlJReleaserConfigParser.java`
#### Snippet
```java
    @Override
    public void validate(Path configFile) throws IOException {
        YamlLintConfig config = null;
        try {
            config = new YamlLintConfig(YAML_LINT_CONFIG);
```

### UnusedAssignment
Variable `commit` initializer `null` is redundant
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java
        RevWalk walk = new RevWalk(git.getRepository());
        ObjectId head = git.getRepository().resolve(Constants.HEAD);
        RevCommit commit = null;

        try {
```

### UnusedAssignment
Variable `payload` initializer `""` is redundant
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java

    public void announce(org.jreleaser.model.internal.announce.HttpAnnouncer announcer) throws AnnounceException {
        String payload = "";
        if (isNotBlank(announcer.getPayload())) {
            payload = announcer.getResolvedPayload(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/SmtpAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(smtp.getMessage())) {
            message = smtp.getResolvedMessage(context);
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaMavenDeployer.java`
#### Snippet
```java

    private void deletePackage(String baseUrl, String token, Deployable deployable) throws DeployException {
        URL url = null;

        try {
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-slack-java-sdk/src/main/java/org/jreleaser/sdk/slack/SlackAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(slack.getMessage())) {
            message = slack.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-zulip-java-sdk/src/main/java/org/jreleaser/sdk/zulip/ZulipAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(zulip.getMessage())) {
            message = zulip.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/DiscussionsAnnouncer.java`
#### Snippet
```java
        GithubReleaser github = context.getModel().getRelease().getGithub();

        String message = "";
        if (isNotBlank(discussions.getMessage())) {
            message = discussions.getResolvedMessage(context);
```

### UnusedAssignment
Variable `gtLabel` initializer `null` is redundant
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java
        }

        GtLabel gtLabel = null;

        try {
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabMavenDeployer.java`
#### Snippet
```java

    private Gitlab createApi(String baseUrl, String token) throws DeployException {
        URL url = null;

        try {
```

### UnusedAssignment
Variable `ghLabel` initializer `null` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        }

        GhLabel ghLabel = null;

        try {
```

### UnusedAssignment
Variable `glLabel` initializer `null` is redundant
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        }

        GlLabel glLabel = null;

        try {
```

### UnusedAssignment
Variable `text` initializer `""` is redundant
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinAnnouncer.java`
#### Snippet
```java

        Message message = null;
        String text = "";
        if (isNotBlank(linkedin.getMessage())) {
            text = linkedin.getResolvedMessage(context);
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

            byte[] buffer = new byte[8192];
            int length = 0;
            while ((length = in.read(buffer)) >= 0) {
                signatureGenerator.update(buffer, 0, length);
```

### UnusedAssignment
Variable `pgpSigList` initializer `null` is redundant
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;

            Object obj = pgpObjFactory.nextObject();
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-telegram-java-sdk/src/main/java/org/jreleaser/sdk/telegram/TelegramAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(telegram.getMessage())) {
            message = telegram.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-webhooks-java-sdk/src/main/java/org/jreleaser/sdk/webhooks/WebhooksAnnouncer.java`
#### Snippet
```java

    public static void announce(JReleaserContext context, WebhookAnnouncer webhook, boolean discreet) throws AnnounceException {
        String message = "";
        if (isNotBlank(webhook.getMessage())) {
            message = webhook.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-discourse-java-sdk/src/main/java/org/jreleaser/sdk/discourse/DiscourseAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(discourse.getMessage())) {
            message = discourse.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-opencollective-java-sdk/src/main/java/org/jreleaser/sdk/opencollective/OpenCollectiveAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(openCollective.getMessage())) {
            message = openCollective.getResolvedMessage(context);
```

### UnusedAssignment
Variable `publicKeyID` initializer `Optional.empty()` is redundant
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java

    private void verifyKeyIsPublished() {
        Optional<String> publicKeyID = Optional.empty();

        try {
```

### UnusedAssignment
Variable `gtLabel` initializer `null` is redundant
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        }

        GtLabel gtLabel = null;

        try {
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `algorithm` is always 'null'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ChecksumUtils.java`
#### Snippet
```java
    public static String checksum(Algorithm algorithm, byte[] data) throws IOException {
        if (null == algorithm) {
            throw new IOException(RB.$("ERROR_unsupported_algorithm", algorithm));
        }
        if (null == data || data.length == 0) {
```

### ConstantValue
Value `p` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            Matcher m = O.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, p, b, m.group(1), O);
            }

```

### ConstantValue
Value `b` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            Matcher m = O.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, p, b, m.group(1), O);
            }

```

### ConstantValue
Value `b` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            m = PO.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, m.group(1), b, m.group(2), PO);
            }

```

### ConstantValue
Value `b` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if (value instanceof Boolean) {
            Boolean b = (Boolean) value;
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else if (value instanceof Number) {
            return cyan(String.valueOf(value));
```

### ConstantValue
Value `b` is always 'false'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if (value instanceof Boolean) {
            Boolean b = (Boolean) value;
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else if (value instanceof Number) {
            return cyan(String.valueOf(value));
```

### ConstantValue
Value `value` is always 'null'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        }

        return String.valueOf(value);
    }

```

### ConstantValue
Value `b` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.parseBoolean(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
```

### ConstantValue
Value `b` is always 'false'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.parseBoolean(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
```

### ConstantValue
Result of `isPrimary()` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Screenshot.java`
#### Snippet
```java
        map.put("type", type);
        map.put("url", url);
        if (isPrimary()) map.put("primary", isPrimary());
        map.put("caption", caption);
        map.put("width", width);
```

### ConstantValue
Value `set` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SdkmanPackagerValidator.java`
#### Snippet
```java
                    boolean set = (boolean) distribution.getSdkman().getExtraProperties().remove(MAGIC_SET);
                    if (set) {
                        context.getModel().getAnnounce().getSdkman().getExtraProperties().put(MAGIC_SET, set);
                    }
                }
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `of()` tries to override a static method of a superclass
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        }

        public static Commit of(RevCommit rc) {
            ConventionalCommit c = new ConventionalCommit(rc);
            if (c.isConventional) {
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        for (Map.Entry<String, String> e : gitlab.getUploadLinks().entrySet()) {
            Optional<? extends Uploader> uploader = context.getModel().getUpload().getActiveUploader(e.getKey(), e.getValue());
            if (uploader.isPresent()) {
                collectUploadLinks(uploader.get(), links);
            }
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractModelCommand.java`
#### Snippet
```java
        Properties props = new Properties();

        if (null != properties && properties.length > 0) {
            for (String property : properties) {
                if (property.contains("=")) {
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractLoggingCommand.java`
#### Snippet
```java
    protected List<String> collectEntries(String[] input, boolean lowerCase) {
        List<String> list = new ArrayList<>();
        if (null != input && input.length > 0) {
            for (String s : input) {
                if (isNotBlank(s)) {
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java
    private Set<UpdateSection> collectUpdateSections() {
        Set<UpdateSection> set = new LinkedHashSet<>();
        if (null != composite.autoConfig.updateSections && composite.autoConfig.updateSections.length > 0) {
            for (String updateSection : composite.autoConfig.updateSections) {
                set.add(UpdateSection.of(updateSection.trim()));
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
    private Set<org.jreleaser.model.UpdateSection> collectUpdateSections() {
        Set<org.jreleaser.model.UpdateSection> set = new LinkedHashSet<>();
        if (null != updateSections && updateSections.length > 0) {
            for (UpdateSection updateSection : updateSections) {
                set.add(org.jreleaser.model.UpdateSection.of(updateSection.name()));
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractJReleaserMojo.java`
#### Snippet
```java
    protected List<String> collectEntries(String[] input, boolean lowerCase) {
        List<String> list = new ArrayList<>();
        if (null != input && input.length > 0) {
            for (String s : input) {
                if (isNotBlank(s)) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `fileType` might be null
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        try (InputStream fi = Files.newInputStream(src);
             InputStream bi = new BufferedInputStream(fi);
             InputStream gzi = resolveCompressorInputStream(fileType, bi);
             ArchiveInputStream in = new TarArchiveInputStream(gzi)) {
            return resolveRootEntryName(in);
```

### DataFlowIssue
Argument `fileType` might be null
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        try (InputStream fi = Files.newInputStream(src);
             InputStream bi = new BufferedInputStream(fi);
             InputStream gzi = resolveCompressorInputStream(fileType, bi);
             ArchiveInputStream in = new TarArchiveInputStream(gzi)) {
            return inspectArchive(in);
```

### DataFlowIssue
Argument `fileType` might be null
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        try (InputStream fi = Files.newInputStream(src);
             InputStream bi = new BufferedInputStream(fi);
             InputStream gzi = resolveCompressorInputStream(fileType, bi);
             ArchiveInputStream in = new TarArchiveInputStream(gzi)) {
            unpackArchive(removeRootEntry ? artifactFileName + "/" : "", destinationDir, in);
```

### DataFlowIssue
Dereference of `inputDirectoryFile.listFiles()` may produce `NullPointerException`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/templates/TemplateEvaluator.java`
#### Snippet
```java
        try {
            File inputDirectoryFile = inputDirectory.toFile();
            if (null == inputDirectoryFile.listFiles() || inputDirectoryFile.listFiles().length == 0) {
                throw fail(RB.$("validation_directory_is_empty", "inputDirectory", inputDirectory));
            }
```

### DataFlowIssue
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/NativeImageAssemblerProcessor.java`
#### Snippet
```java
            Archive.Format archiveFormat = Archive.Format.of(str);

            Path imageArchive = assembleDirectory.resolve(finalImageName + "." + archiveFormat.extension());
            FileUtils.packArchive(tempDirectory, imageArchive, assembler.getOptions().toOptions());

```

### DataFlowIssue
Dereference of `templateDirectoryFile.listFiles()` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/ArticleAnnouncerValidator.java`
#### Snippet
```java
        }

        if (null == templateDirectoryFile.listFiles() || templateDirectoryFile.listFiles().length == 0) {
            errors.configuration(RB.$("validation_directory_is_empty", "announce.article.templateDirectory", announcer.getTemplateDirectory()));
        }
```

### DataFlowIssue
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/NativeImageAssemblerResolver.java`
#### Snippet
```java

            Path image = baseOutputDirectory
                .resolve(imageName + "-" + platformReplaced + "." + archiveFormat.extension())
                .toAbsolutePath();

```

### DataFlowIssue
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JlinkAssemblerResolver.java`
#### Snippet
```java

            Path image = baseOutputDirectory
                .resolve(imageName + "-" + platformReplaced + "." + archiveFormat.extension())
                .toAbsolutePath();

```

### DataFlowIssue
Method invocation `storeFile` may produce `NullPointerException`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactUploader.java`
#### Snippet
```java
                        String uploadPath = uploader.getResolvedPath(context, artifact);
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        ftp.storeFile(uploadPath, in);
                    } catch (IOException e) {
                        context.getLogger().trace(e);
```

### DataFlowIssue
Argument `basedir` might be null
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java
        }

        throw new RepositoryNotFoundException(basedir);
    }

```

### DataFlowIssue
Argument `ssh` might be null
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactUploader.java`
#### Snippet
```java
                        String uploadPath = uploader.getResolvedPath(context, artifact);
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        createDirectories(context, uploader, ssh, Paths.get(uploadPath).getParent());
                        ssh.newSCPFileTransfer().upload(path.toAbsolutePath().toString(), uploadPath);
                    } catch (IOException e) {
```

### DataFlowIssue
Dereference of `assets.toFile().listFiles()` may produce `NullPointerException`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/release/AbstractReleaserBuilder.java`
#### Snippet
```java
    public ReleaserBuilder<R> addReleaseAssets(Path assets) {
        if (assets.toFile().exists()) {
            for (File asset : assets.toFile().listFiles()) {
                addReleaseAsset(Asset.file(Artifact.of(asset.toPath().toAbsolutePath())));
            }
```

### DataFlowIssue
Argument `ssh` might be null
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactUploader.java`
#### Snippet
```java
                        String uploadPath = uploader.getResolvedPath(context, artifact);
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        createDirectories(context, uploader, ssh, Paths.get(uploadPath).getParent());
                        sftp.put(path.toAbsolutePath().toString(), uploadPath);
                    } catch (IOException e) {
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactUploader.java`
#### Snippet
```java
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        createDirectories(context, uploader, ssh, Paths.get(uploadPath).getParent());
                        sftp.put(path.toAbsolutePath().toString(), uploadPath);
                    } catch (IOException e) {
                        context.getLogger().trace(e);
```

### DataFlowIssue
Method invocation `urn` may produce `NullPointerException`
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java
        } else {
            Profile profile = wrap(api::getProfile);
            text = text.replace("{{" + KEY_LINKEDIN_OWNER + "}}", profile.urn());
        }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getDocsUrl' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    @Deprecated
    @JsonPropertyDescription("project.docsUrl is deprecated since 1.2.0 and will be removed in 2.0.0. Use project.links.documentation instead")
    public String getDocsUrl() {
        return links.getDocumentation();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getLicenseUrl' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    @Deprecated
    @JsonPropertyDescription("project.licenseUrl is deprecated since 1.2.0 and will be removed in 2.0.0. Use project.links.license instead")
    public String getLicenseUrl() {
        return links.getLicense();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getWebsite' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    @Deprecated
    @JsonPropertyDescription("project.website is deprecated since 1.2.0 and will be removed in 2.0.0. Use project.links.homepage instead")
    public String getWebsite() {
        return links.getHomepage();
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'context' in a Serializable class
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/release/AbstractReleaser.java`
#### Snippet
```java
    private static final long serialVersionUID = 362449254352903201L;

    protected final JReleaserContext context;
    protected final Set<Asset> assets = new TreeSet<>();

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
            try {
                artifactSize = Files.size(artifactPath);
            } catch (IOException ignored) {
                // this would be strange
                context.getLogger().trace(ignored);
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '('
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of '\*'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of ')'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        String effectiveTagName = releaser.getEffectiveTagName(context.getModel());
        String tagName = releaser.getTagName();
        String tagPattern = tagName.replaceAll("\\{\\{.*}}", "\\.\\*");

        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '\*'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        String effectiveTagName = releaser.getEffectiveTagName(context.getModel());
        String tagName = releaser.getTagName();
        String tagPattern = tagName.replaceAll("\\{\\{.*}}", "\\.\\*");

        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
```

### RedundantEscapeInRegexReplacement
Redundant escape of 'n'
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/x-www-form-urlencoded"))
            .withHeader("Accept", equalTo("*/*"))
```

### RedundantEscapeInRegexReplacement
Redundant escape of 'n'
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyJsonRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/json"))
            .withHeader("Accept", or(equalTo("*/*"), equalTo("application/json")))
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <K, V> Map newMap(Object... keysAndValues) {
        return mapOf(keysAndValues);
    }
```

### RedundantSuppression
Redundant suppression
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static class MapBuilder<K, V> implements Map<K, V> {
        private final Map<K, V> delegate;

```

### RedundantSuppression
Redundant suppression
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static class ListBuilder<E> implements List<E> {
        private final List<E> delegate;

```

### RedundantSuppression
Redundant suppression
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static class SetBuilder<E> implements Set<E> {
        private final Set<E> delegate;

```

### RedundantSuppression
Redundant suppression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JpackageAssemblerProcessor.java`
#### Snippet
```java

    @SuppressWarnings("UnnecessaryParentheses")
    private void adjustRuntimeImage(JReleaserContext context, JpackageAssembler assembler, Path workDirectory, String platform) throws AssemblerProcessingException {
        Optional<Artifact> runtimeImageByPlatform = assembler.findRuntimeImageByPlatform(platform);
        if (!runtimeImageByPlatform.isPresent()) {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        if (value.startsWith("os400")) {
            // Avoid the names such as os4000
            if (value.length() <= 5 || !Character.isDigit(value.charAt(5))) {
                return "os400";
            }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        try {
            InputStream in = fileOperationProvider.readFile(fileName);
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

            // There is only a single line in this file.
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        try {
            InputStream in = fileOperationProvider.readFile(fileName);
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

            String id = null;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/JReleaserOutput.java`
#### Snippet
```java
    public static void nag(String msg) {
        if (!isQuiet()) {
            System.err.println("🚨 " + msg);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/SimpleJReleaserLoggerAdapter.java`
#### Snippet
```java

    public SimpleJReleaserLoggerAdapter(Level level) {
        this(System.out, level);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/SimpleJReleaserLoggerAdapter.java`
#### Snippet
```java

    public SimpleJReleaserLoggerAdapter(PrintWriter out, Level level) {
        super(newPrintWriter(System.err));
        this.out = out;
        this.level = level;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/SimpleJReleaserLoggerAdapter.java`
#### Snippet
```java

    public SimpleJReleaserLoggerAdapter() {
        this(System.out, Level.WARN);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserConfigTask.java`
#### Snippet
```java
    protected void doExecute(JReleaserContext context) {
        ModelValidator.validate(context);
        new AntJReleaserModelPrinter(newPrintWriter(System.out))
            .print(context.getModel().asMap(full));
        context.report();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
        File markerFile = getMarkerFile(parent);
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
                int count = Integer.parseInt(readQuietly(markerFile));
                if (count < 3) {
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
                writeQuietly(markerFile, "1");
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserEnvTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));
        Environment.display(initLogger(), Paths.get(".").normalize());
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateGenerateTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));
        if (skip) return;

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserInitTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));
        try {
            initLogger();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserJsonSchemaTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));
        JsonSchemaGenerator.generate(IoUtils.newPrintWriter(System.out));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserJsonSchemaTask.java`
#### Snippet
```java
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));
        JsonSchemaGenerator.generate(IoUtils.newPrintWriter(System.out));
    }
}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractJReleaserTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));
        if (skip) return;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserJsonSchemaMojo.java`
#### Snippet
```java
            return;
        }
        JsonSchemaGenerator.generate(IoUtils.newPrintWriter(System.out));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserConfigMojo.java`
#### Snippet
```java
        JReleaserContext context = createContext();
        ModelValidator.validate(context);
        new MavenJReleaserModelPrinter(newPrintWriter(System.out))
            .print(context.getModel().asMap(full));
        context.report();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserAutoConfigReleaseTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(newPrintWriter(System.err));

        basedir();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
        File markerFile = getMarkerFile(parent);
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
                int count = Integer.parseInt(readQuietly(markerFile));
                if (count < 3) {
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
                writeQuietly(markerFile, "1");
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-tool-provider/src/main/java/org/jreleaser/tool/JReleaser.java`
#### Snippet
```java

    public static void main(String[] args) {
        PrintWriter out = newPrintWriter(System.out);
        PrintWriter err = newPrintWriter(System.err);
        System.exit(Main.run(out, err, args));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-tool-provider/src/main/java/org/jreleaser/tool/JReleaser.java`
#### Snippet
```java
    public static void main(String[] args) {
        PrintWriter out = newPrintWriter(System.out);
        PrintWriter err = newPrintWriter(System.err);
        System.exit(Main.run(out, err, args));
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Algorithm.java`
#### Snippet
```java

        String value = str.toUpperCase(Locale.ENGLISH).trim()
            .replace("-", "_");

        switch (value) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Algorithm.java`
#### Snippet
```java
    public String formatted() {
        if (name().startsWith("SHA3")) {
            return name().toLowerCase(Locale.ENGLISH).replace("_", "-");
        }
        return name().toLowerCase(Locale.ENGLISH).replace("_", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Algorithm.java`
#### Snippet
```java
            return name().toLowerCase(Locale.ENGLISH).replace("_", "-");
        }
        return name().toLowerCase(Locale.ENGLISH).replace("_", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileType.java`
#### Snippet
```java
        if (isBlank(str)) return null;
        return FileType.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace(".", "_"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/VersionPattern.java`
#### Snippet
```java
        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replace(" ", "_")
                .replace("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/VersionPattern.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return Type.valueOf(str.replace(" ", "_")
                .replace("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Active.java`
#### Snippet
```java
        if (isBlank(str)) return null;
        return Active.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace("+", "_")
            .replace("-", "_")
            .replace(" ", "_"));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Active.java`
#### Snippet
```java
        return Active.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace("+", "_")
            .replace("-", "_")
            .replace(" ", "_"));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Active.java`
#### Snippet
```java
            .replace("+", "_")
            .replace("-", "_")
            .replace(" ", "_"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Archive.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace(".", "_"));
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Distribution.java`
#### Snippet
```java
            if (isBlank(str)) return null;

            String value = str.replace(" ", "_")
                .replace("-", "_")
                .toUpperCase(Locale.ENGLISH).trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Distribution.java`
#### Snippet
```java

            String value = str.replace(" ", "_")
                .replace("-", "_")
                .toUpperCase(Locale.ENGLISH).trim();

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java

    public static String toVar(String str) {
        return str.replace(" ", "_")
            .replace("-", "_")
            .replace(".", "_")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
    public static String toVar(String str) {
        return str.replace(" ", "_")
            .replace("-", "_")
            .replace(".", "_")
            .toUpperCase(Locale.ENGLISH);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
        return str.replace(" ", "_")
            .replace("-", "_")
            .replace(".", "_")
            .toUpperCase(Locale.ENGLISH);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
            key = JRELEASER_SYS_PREFIX + key;
        }
        return key.replace(" ", ".")
            .replace("-", ".")
            .replace("_", ".")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
        }
        return key.replace(" ", ".")
            .replace("-", ".")
            .replace("_", ".")
            .toLowerCase(Locale.ENGLISH);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
        return key.replace(" ", ".")
            .replace("-", ".")
            .replace("_", ".")
            .toLowerCase(Locale.ENGLISH);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Stereotype.java`
#### Snippet
```java
        if (isBlank(str)) return null;
        return Stereotype.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace("+", "_")
            .replace("-", "_")
            .replace(" ", "_"));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Stereotype.java`
#### Snippet
```java
        return Stereotype.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace("+", "_")
            .replace("-", "_")
            .replace(" ", "_"));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Stereotype.java`
#### Snippet
```java
            .replace("+", "_")
            .replace("-", "_")
            .replace(" ", "_"));
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/JReleaserCommand.java`
#### Snippet
```java
    public String toStep() {
        return name().toLowerCase(Locale.ENGLISH)
            .replace("_", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ExecutionEvent.java`
#### Snippet
```java
        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replace(" ", "_")
                .replace("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ExecutionEvent.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return Type.valueOf(str.replace(" ", "_")
                .replace("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
    private static String normalizeOsReleaseValue(String value) {
        // Remove any quotes from the string.
        return value.trim().replace("\"", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "";
        }
        return value.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        String bitness = systemPropertyOperationProvider.getSystemProperty("sun.arch.data.model", "");

        if (!bitness.isEmpty() && bitness.matches("[0-9]+")) {
            return Integer.parseInt(bitness, 10);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        bitness = systemPropertyOperationProvider.getSystemProperty("com.ibm.vm.bitmode", "");

        if (!bitness.isEmpty() && bitness.matches("[0-9]+")) {
            return Integer.parseInt(bitness, 10);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java

                    // Split the line on any whitespace.
                    final String[] parts =  line.split("\\s+");
                    Collections.addAll(likeSet, parts);
                }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
    private static String normalizeArch(String value) {
        value = normalize(value);
        if (value.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            return "x86_64";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "x86_64";
        }
        if (value.matches("^(x8632|x86|i[3-6]86|ia32|x32)$")) {
            return "x86_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "x86_32";
        }
        if (value.matches("^(ia64w?|itanium64)$")) {
            return "itanium_64";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "itanium_32";
        }
        if (value.matches("^(sparc|sparc32)$")) {
            return "sparc_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "sparc_32";
        }
        if (value.matches("^(sparcv9|sparc64)$")) {
            return "sparc_64";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "sparc_64";
        }
        if (value.matches("^(arm|arm32)$")) {
            return "arm_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "aarch_64";
        }
        if (value.matches("^(mips|mips32)$")) {
            return "mips_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "mips_32";
        }
        if (value.matches("^(mipsel|mips32el)$")) {
            return "mipsel_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "mipsel_64";
        }
        if (value.matches("^(ppc|ppc32)$")) {
            return "ppc_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "ppc_32";
        }
        if (value.matches("^(ppcle|ppc32le)$")) {
            return "ppcle_32";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            return "s390_64";
        }
        if (value.matches("^(riscv|riscv32)$")) {
            return "riscv";
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java

        public String extension() {
            return "." + alias.replace(".", "-") + ".sbom";
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java
            if (isBlank(str)) return null;

            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java

            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
                .toUpperCase(Locale.ENGLISH).trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java
            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
                .toUpperCase(Locale.ENGLISH).trim();

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java

            return Format.valueOf(value
                .replace(".", "_")
                .toUpperCase(Locale.ENGLISH).trim());
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java

        public String extension() {
            return "." + alias.replace(".", "-") + ".sbom";
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java
            if (isBlank(str)) return null;

            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java

            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
                .toUpperCase(Locale.ENGLISH).trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java
            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
                .toUpperCase(Locale.ENGLISH).trim();

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java

            return Format.valueOf(value
                .replace(".", "_")
                .toUpperCase(Locale.ENGLISH).trim());
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java

        public String formatted() {
            return name().replace("_", "-").toLowerCase(Locale.ROOT);
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        String propertyName = name.substring(0, 1).toLowerCase(Locale.ENGLISH) + name.substring(1);
        if (propertyName.contains(" ")) {
            propertyName = propertyName.replaceAll("\\s", "");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder();
        if (null != name && name.length() > 0) {
            String[] tokens = name.split("[^\\w\\d]");
            for (String token1 : tokens) {
                String token = token1.trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

        String naturalName = getNaturalName(getShortName(name));
        return naturalName.replaceAll("\\s", "-").toLowerCase(Locale.ENGLISH);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java
                if (isBlank(str)) return null;

                String value = str.replace(" ", "")
                    .replace("-", "")
                    .replace("_", "")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java

                String value = str.replace(" ", "")
                    .replace("-", "")
                    .replace("_", "")
                    .toUpperCase(Locale.ENGLISH).trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java
                String value = str.replace(" ", "")
                    .replace("-", "")
                    .replace("_", "")
                    .toUpperCase(Locale.ENGLISH).trim();

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java
                if (isBlank(str)) return null;

                String value = str.replace(" ", "")
                    .replace("-", "")
                    .replace("_", "")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java

                String value = str.replace(" ", "")
                    .replace("-", "")
                    .replace("_", "")
                    .toUpperCase(Locale.ENGLISH).trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java
                String value = str.replace(" ", "")
                    .replace("-", "")
                    .replace("_", "")
                    .toUpperCase(Locale.ENGLISH).trim();

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/JibConfiguration.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace(".", "_"));
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CustomVersion.java`
#### Snippet
```java
    @Override
    public String toRpmVersion() {
        return toString().replace("-", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
    @Override
    public String toRpmVersion() {
        return toString().replace("-", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
        b.append(version);
        if (!hasPrerelease() && !hasBuild() && hasOptional()) {
            b.append("~").append(optional.replace("-", "_"));
        } else {
            if (hasPrerelease()) b.append("~").append(prerelease.replace("-", "_"));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            b.append("~").append(optional.replace("-", "_"));
        } else {
            if (hasPrerelease()) b.append("~").append(prerelease.replace("-", "_"));
            if (hasBuild()) b.append("_").append(build.replace("-", "_"));
            if (hasOptional()) b.append("_").append(optional.replace("-", "_"));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
        } else {
            if (hasPrerelease()) b.append("~").append(prerelease.replace("-", "_"));
            if (hasBuild()) b.append("_").append(build.replace("-", "_"));
            if (hasOptional()) b.append("_").append(optional.replace("-", "_"));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            if (hasPrerelease()) b.append("~").append(prerelease.replace("-", "_"));
            if (hasBuild()) b.append("_").append(build.replace("-", "_"));
            if (hasOptional()) b.append("_").append(optional.replace("-", "_"));
        }
        return b.toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
        if (hasMinor()) b.append(".").append(minor);
        if (hasPatch()) b.append(".").append(patch);
        if (hasTag()) b.append("~").append(tag.replace("-", "_"));
        if (hasBuild()) b.append("_").append(build.replace("-", "_"));
        return b.toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
        if (hasPatch()) b.append(".").append(patch);
        if (hasTag()) b.append("~").append(tag.replace("-", "_"));
        if (hasBuild()) b.append("_").append(build.replace("-", "_"));
        return b.toString();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        StringBuilder b = new StringBuilder();
        b.append(version);
        if (hasPrerelease()) b.append("~").append(prerelease.replace("-", "_"));
        if (hasBuild()) b.append("_").append(build.replace("-", "_"));
        return b.toString();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        b.append(version);
        if (hasPrerelease()) b.append("~").append(prerelease.replace("-", "_"));
        if (hasBuild()) b.append("_").append(build.replace("-", "_"));
        return b.toString();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/init/Init.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            LocalDate now = LocalDate.now();
            content = content.replace("@year@", now.getYear() + "");

            logger.info($("jreleaser.init.TEXT_writing_file"), outputFile.toAbsolutePath());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        requireNonBlank(format, "Argument 'format' must not be blank");

        return of(format, format.replace(T_YEAR_LONG, "2000")
            .replace(T_YEAR_SHORT, "0")
            .replace(T_YEAR_ZERO, "0")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java

        return of(format, format.replace(T_YEAR_LONG, "2000")
            .replace(T_YEAR_SHORT, "0")
            .replace(T_YEAR_ZERO, "0")
            .replace(T_MONTH_SHORT, "1")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        return of(format, format.replace(T_YEAR_LONG, "2000")
            .replace(T_YEAR_SHORT, "0")
            .replace(T_YEAR_ZERO, "0")
            .replace(T_MONTH_SHORT, "1")
            .replace(T_MONTH_ZERO, "01")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_YEAR_SHORT, "0")
            .replace(T_YEAR_ZERO, "0")
            .replace(T_MONTH_SHORT, "1")
            .replace(T_MONTH_ZERO, "01")
            .replace(T_WEEK_SHORT, "1")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_YEAR_ZERO, "0")
            .replace(T_MONTH_SHORT, "1")
            .replace(T_MONTH_ZERO, "01")
            .replace(T_WEEK_SHORT, "1")
            .replace(T_WEEK_ZERO, "01")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_MONTH_SHORT, "1")
            .replace(T_MONTH_ZERO, "01")
            .replace(T_WEEK_SHORT, "1")
            .replace(T_WEEK_ZERO, "01")
            .replace(T_DAY_SHORT, "1")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_MONTH_ZERO, "01")
            .replace(T_WEEK_SHORT, "1")
            .replace(T_WEEK_ZERO, "01")
            .replace(T_DAY_SHORT, "1")
            .replace(T_DAY_ZERO, "01")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_WEEK_SHORT, "1")
            .replace(T_WEEK_ZERO, "01")
            .replace(T_DAY_SHORT, "1")
            .replace(T_DAY_ZERO, "01")
            .replace(T_MINOR, "0")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_WEEK_ZERO, "01")
            .replace(T_DAY_SHORT, "1")
            .replace(T_DAY_ZERO, "01")
            .replace(T_MINOR, "0")
            .replace(T_MICRO, "0")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_DAY_SHORT, "1")
            .replace(T_DAY_ZERO, "01")
            .replace(T_MINOR, "0")
            .replace(T_MICRO, "0")
            .replace(T_MODIFIER, "A")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_DAY_ZERO, "01")
            .replace(T_MINOR, "0")
            .replace(T_MICRO, "0")
            .replace(T_MODIFIER, "A")
            .replace("[", "")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_MINOR, "0")
            .replace(T_MICRO, "0")
            .replace(T_MODIFIER, "A")
            .replace("[", "")
            .replace("]", ""));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_MICRO, "0")
            .replace(T_MODIFIER, "A")
            .replace("[", "")
            .replace("]", ""));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(T_MODIFIER, "A")
            .replace("[", "")
            .replace("]", ""));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
    @Override
    public String toRpmVersion() {
        return toString().replace("-", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/ChangelogResolver.java`
#### Snippet
```java

        if (fullChangelog.contains(JRELEASER_CHANGELOG_ANCHOR)) {
            fullChangelog = fullChangelog.replaceFirst(JRELEASER_CHANGELOG_ANCHOR,
                JRELEASER_CHANGELOG_ANCHOR + separator + appendableChangelog + separator + separator);
        } else {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
                }

                String resolvedCmd = hook.getShell().expression().replace("{{script}}", scriptFile.toAbsolutePath().toString());
                executeCommandLine(localEnv, hook, resolvedCmd, resolvedCmd, "ERROR_script_hook_unexpected_error");
            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/MacportsPackagerProcessor.java`
#### Snippet
```java
            releaser.getResolvedRepoCloneUrl(context.getModel(), packager.getRepository().getOwner(), packager.getRepository().getResolvedName()));

        List<String> longDescription = Arrays.asList(context.getModel().getProject().getLongDescription().split("\\n"));

        props.set(KEY_MACPORTS_PACKAGE_NAME, packager.getPackageName());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java

    private String sanitizeScriptName(String scriptName) {
        scriptName = scriptName.replace("-", "_");
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < scriptName.length(); i++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java

        if (fileName.endsWith("app.png")) {
            outputFile = outputDirectory.resolve(fileName.replace("app", distribution.getExecutable().getName()));
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
    private Path resolvePackageDirectory(Path outputDirectory, String packageIdentifier) {
        return outputDirectory.resolve(packageIdentifier.substring(0, 1).toLowerCase(Locale.ENGLISH) + "/" +
            packageIdentifier.replace(".", "/") + "/" +
            context.getModel().getProject().getResolvedVersion());
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AssemblerUtils.java`
#### Snippet
```java
    public static String maybeAdjust(String path) {
        if (PlatformUtils.isWindows()) {
            return path.replace("/", File.separator);
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        @Override
        public String apply(String input) {
            return input.replace(".", "-")
                .replace("_", "-")
                .replace("+", "-");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        public String apply(String input) {
            return input.replace(".", "-")
                .replace("_", "-")
                .replace("+", "-");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
            return input.replace(".", "-")
                .replace("_", "-")
                .replace("+", "-");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        @Override
        public String apply(String input) {
            return input.replace(".", "/")
                .replace("-", "/")
                .replace("+", "/");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        public String apply(String input) {
            return input.replace(".", "/")
                .replace("-", "/")
                .replace("+", "/");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
            return input.replace(".", "/")
                .replace("-", "/")
                .replace("+", "/");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        @Override
        public String apply(String input) {
            return input.replace(".", "_")
                .replace("-", "_")
                .replace("+", "_");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        public String apply(String input) {
            return input.replace(".", "_")
                .replace("-", "_")
                .replace("+", "_");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
            return input.replace(".", "_")
                .replace("-", "_")
                .replace("+", "_");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/VersionDecoratingWriter.java`
#### Snippet
```java
    public void write(final String str) throws IOException {
        if (needsVersionReplacement(str)) {
            super.write(str.replace(VERSION_MARKER, VERSION_BANNER));
        } else {
            super.write(str);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java

            String content = IOUtils.toString(template.getReader());
            content = content.replace("@groupId@", gav[0])
                .replace("@artifactId@", gav[1])
                .replace("@version@", gav[2]);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            content = content.replace("@groupId@", gav[0])
                .replace("@artifactId@", gav[1])
                .replace("@version@", gav[2]);

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
            content = content.replace("@groupId@", gav[0])
                .replace("@artifactId@", gav[1])
                .replace("@version@", gav[2]);

            Files.write(pom, content.getBytes(UTF_8), WRITE, TRUNCATE_EXISTING);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
                case MARKDOWN:
                    return ("[" + linkName + "](" + getRelease().getReleaser().getDownloadUrl() + ")")
                        .replace("{{artifactFile}}", artifactFile);
                case ASCIIDOC:
                    return ("link:" + getRelease().getReleaser().getDownloadUrl() + "[" + linkName + "]")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
                case ASCIIDOC:
                    return ("link:" + getRelease().getReleaser().getDownloadUrl() + "[" + linkName + "]")
                        .replace("{{artifactFile}}", artifactFile);
                case HTML:
                    return ("<a href=\"" + getRelease().getReleaser().getDownloadUrl() + "\">" + linkName + "</a>")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
                case HTML:
                    return ("<a href=\"" + getRelease().getReleaser().getDownloadUrl() + "\">" + linkName + "</a>")
                        .replace("{{artifactFile}}", artifactFile);
                default:
                    // noop
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Glob.java`
#### Snippet
```java
        String test = path;
        if (PlatformUtils.isWindows()) {
            test = test.replace("*", "x");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Glob.java`
#### Snippet
```java

        if (PlatformUtils.isWindows()) {
            this.pattern = pattern.replace("/", "\\\\");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java

    private String dash(String input) {
        return input.replace(".", "-")
            .replace("_", "-")
            .replace("+", "-");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    private String dash(String input) {
        return input.replace(".", "-")
            .replace("_", "-")
            .replace("+", "-");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
        return input.replace(".", "-")
            .replace("_", "-")
            .replace("+", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java

    private String underscore(String input) {
        return input.replace(".", "_")
            .replace("-", "_")
            .replace("+", "_");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    private String underscore(String input) {
        return input.replace(".", "_")
            .replace("-", "_")
            .replace("+", "_");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
        return input.replace(".", "_")
            .replace("-", "_")
            .replace("+", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java

    public void setTransport(String transport) {
        this.transport = Mail.Transport.valueOf(transport.replace(" ", "_")
            .replace("-", "_")
            .toUpperCase(Locale.ENGLISH));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java
    public void setTransport(String transport) {
        this.transport = Mail.Transport.valueOf(transport.replace(" ", "_")
            .replace("-", "_")
            .toUpperCase(Locale.ENGLISH));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java

    public void setMimeType(String mimeType) {
        this.mimeType = Mail.MimeType.valueOf(mimeType.replace(" ", "_")
            .replace("-", "_")
            .toUpperCase(Locale.ENGLISH));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java
    public void setMimeType(String mimeType) {
        this.mimeType = Mail.MimeType.valueOf(mimeType.replace(" ", "_")
            .replace("-", "_")
            .toUpperCase(Locale.ENGLISH));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/environment/Environment.java`
#### Snippet
```java
            props.forEach((key, value) -> {
                if (key.startsWith("JRELEASER_")) return;
                String k = key.replace(".", "-");
                k = getPropertyNameForLowerCaseHyphenSeparatedName(k);
                map.put(k, value);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

            String owner = parts[parts.length - 2];
            String name = parts[parts.length - 1].replace(".git", "");

            return new Repository(
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabMavenDeployer.java`
#### Snippet
```java
    private void deletePackage(Gitlab api, Deployable deployable, List<GlPackage> glPackages) {
        try {
            String name = deployable.getGroupId().replace(".", "/") + "/" + deployable.getArtifactId();
            Optional<GlPackage> glPackage = glPackages.stream()
                .filter(p -> p.getName().equals(name) && p.getVersion().equals(deployable.getVersion()))
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
                github.getReadTimeout())
                .generateReleaseNotes(github.getOwner(), github.getName(), params);
            return releaseNotes.getBody().replace("...HEAD", "..." + tagName);
        } catch (IOException | GitAPIException e) {
            throw new JReleaserException(RB.$("ERROR_unexpected_error_changelog"), e);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/api/StagingProfileRepository.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return State.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace("-", "_")
                .replace(" ", "_"));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/api/StagingProfileRepository.java`
#### Snippet
```java
            return State.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace("-", "_")
                .replace(" ", "_"));
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java

        this.apiHost = endpoint.substring(0, endpoint.length() - API_V4.length());
        this.graphQlEndpoint = endpoint.replace("v4", "graphql");
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java

        if (isNotBlank(owner)) {
            text = text.replace("{{" + KEY_LINKEDIN_OWNER + "}}", owner);
        } else {
            Profile profile = wrap(api::getProfile);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java
        } else {
            Profile profile = wrap(api::getProfile);
            text = text.replace("{{" + KEY_LINKEDIN_OWNER + "}}", profile.urn());
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-webhooks-java-sdk/src/main/java/org/jreleaser/sdk/webhooks/WebhooksAnnouncer.java`
#### Snippet
```java

    public static String convertLineEndings(String str) {
        return str.replaceAll("\\n", "\\\\n\\\\n");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
                p = p.getParent();
                String gid = p.toString()
                    .replace("/", ".")
                    .replace("\\", ".");
                if (gid.startsWith(".")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
                String gid = p.toString()
                    .replace("/", ".")
                    .replace("\\", ".");
                if (gid.startsWith(".")) {
                    gid = gid.substring(1);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java

        public String getDeployPath() {
            return path.replace("\\", "/");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        String effectiveTagName = releaser.getEffectiveTagName(context.getModel());
        String tagName = releaser.getTagName();
        String tagPattern = tagName.replaceAll("\\{\\{.*}}", "\\.\\*");

        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        protected static String[] split(String str) {
            // Any Unicode linebreak sequence
            return str.split("\\R");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/x-www-form-urlencoded"))
            .withHeader("Accept", equalTo("*/*"))
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyJsonRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/json"))
            .withHeader("Accept", or(equalTo("*/*"), equalTo("application/json")))
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class Env {
    public static final String JRELEASER_ENV_PREFIX = "JRELEASER_";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bouncycastle.openpgp` is unnecessary, and can be replaced with an import
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/signing/Keyring.java`
#### Snippet
```java
        }

        try (InputStream decoded = org.bouncycastle.openpgp.PGPUtil.getDecoderStream(raw)) {
            addSecretKeyRing(new PGPSecretKeyRing(decoded, keyFingerPrintCalculator));
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.bouncycastle.openpgp` is unnecessary, and can be replaced with an import
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/signing/Keyring.java`
#### Snippet
```java
        }

        try (InputStream decoded = org.bouncycastle.openpgp.PGPUtil.getDecoderStream(raw)) {
            addPublicKeyRing(new PGPPublicKeyRing(decoded, keyFingerPrintCalculator));
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/ExtensionManagerHolder.java`
#### Snippet
```java
 * @since 1.3.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ExtensionManagerHolder {
    private static final ThreadLocal<ExtensionManager> EXTENSION_MANAGER_THREAD_LOCAL = ThreadLocal.withInitial(() -> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/JReleaserLogger.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public interface JReleaserLogger {
    PrintWriter getTracer();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/MustacheUtils.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class MustacheUtils {
    private MustacheUtils() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCatalogers.java`
#### Snippet
```java
    }

    public static <A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger, C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> SbomCatalogerProcessor<A, C> findSbomCataloger(JReleaserContext context, C cataloger) {
        Map<String, SbomCatalogerProcessor<?, ?>> catalogers = StreamSupport.stream(ServiceLoader.load(SbomCatalogerProcessorFactory.class,
                ProjectSbomCatalogers.class.getClassLoader()).spliterator(), false)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCatalogers.java`
#### Snippet
```java
    }

    public static <A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger, C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> SbomCatalogerProcessor<A, C> findSbomCataloger(JReleaserContext context, C cataloger) {
        Map<String, SbomCatalogerProcessor<?, ?>> catalogers = StreamSupport.stream(ServiceLoader.load(SbomCatalogerProcessorFactory.class,
                ProjectSbomCatalogers.class.getClassLoader()).spliterator(), false)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCataloger.java`
#### Snippet
```java
        }

        public ProjectSbomCatalogerBuilder cataloger(org.jreleaser.model.internal.catalog.sbom.SbomCataloger<?> cataloger) {
            this.cataloger = requireNonNull(cataloger, "'cataloger' must not be null");
            return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCataloger.java`
#### Snippet
```java

    private ProjectSbomCataloger(JReleaserContext context,
                                 org.jreleaser.model.internal.catalog.sbom.SbomCataloger<?> cataloger) {
        this.context = context;
        this.cataloger = cataloger;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCataloger.java`
#### Snippet
```java
    }

    public org.jreleaser.model.internal.catalog.sbom.SbomCataloger<?> getSbomCataloger() {
        return cataloger;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCataloger.java`
#### Snippet
```java
    public static class ProjectSbomCatalogerBuilder {
        private JReleaserContext context;
        private org.jreleaser.model.internal.catalog.sbom.SbomCataloger<?> cataloger;

        public ProjectSbomCatalogerBuilder context(JReleaserContext context) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCataloger.java`
#### Snippet
```java
public class ProjectSbomCataloger {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.catalog.sbom.SbomCataloger<?> cataloger;

    private ProjectSbomCataloger(JReleaserContext context,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.release` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/ChangelogResolver.java`
#### Snippet
```java
    private static String separator(BaseReleaser<?, ?> releaser) {
        String separator = lineSeparator();
        if (org.jreleaser.model.api.release.GitlabReleaser.TYPE.equals(releaser.getServiceName())) {
            separator += lineSeparator();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessorFactory.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.packagers.DockerConfiguration.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppdataUtils.java`
#### Snippet
```java
                context.getLogger().debug("{} -> {}", iconUrl, context.relativizeToBasedir(iconPath));
                try {
                    org.apache.commons.io.FileUtils.copyURLToFile(
                        new URI(iconUrl).toURL(),
                        iconPath.toFile(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JibPackagerProcessorFactory.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.packagers.JibConfiguration.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/announcers/ArticleAnnouncer.java`
#### Snippet
```java
 * @since 0.6.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class ArticleAnnouncer implements Announcer<org.jreleaser.model.api.announce.ArticleAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ContextCreator.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ContextCreator {
    private ContextCreator() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/CyclonedxSbomCatalogerProcessorFactory.java`
#### Snippet
```java
 */
@ServiceProviderFor(SbomCatalogerProcessorFactory.class)
public class CyclonedxSbomCatalogerProcessorFactory implements SbomCatalogerProcessorFactory<org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger,
    org.jreleaser.model.internal.catalog.sbom.CyclonedxSbomCataloger, CyclonedxSbomCatalogerProcessor> {
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/CyclonedxSbomCatalogerProcessorFactory.java`
#### Snippet
```java
@ServiceProviderFor(SbomCatalogerProcessorFactory.class)
public class CyclonedxSbomCatalogerProcessorFactory implements SbomCatalogerProcessorFactory<org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger,
    org.jreleaser.model.internal.catalog.sbom.CyclonedxSbomCataloger, CyclonedxSbomCatalogerProcessor> {
    @Override
    public String getName() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/CyclonedxSbomCatalogerProcessorFactory.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/SyftSbomCatalogerProcessorFactory.java`
#### Snippet
```java
 */
@ServiceProviderFor(SbomCatalogerProcessorFactory.class)
public class SyftSbomCatalogerProcessorFactory implements SbomCatalogerProcessorFactory<org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger,
    org.jreleaser.model.internal.catalog.sbom.SyftSbomCataloger, SyftSbomCatalogerProcessor> {
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/SyftSbomCatalogerProcessorFactory.java`
#### Snippet
```java
@ServiceProviderFor(SbomCatalogerProcessorFactory.class)
public class SyftSbomCatalogerProcessorFactory implements SbomCatalogerProcessorFactory<org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger,
    org.jreleaser.model.internal.catalog.sbom.SyftSbomCataloger, SyftSbomCatalogerProcessor> {
    @Override
    public String getName() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/SyftSbomCatalogerProcessorFactory.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary and can be removed
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/SyftSbomCatalogerProcessor.java`
#### Snippet
```java
        Path catalogDirectory = resolveCatalogDirectory();

        for (org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.Format format : cataloger.getFormats()) {
            for (Artifact artifact : candidates) {
                String artifactFile = artifact.getEffectivePath().getFileName().toString();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary and can be removed
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/SyftSbomCatalogerProcessor.java`
#### Snippet
```java
    @Override
    public String getType() {
        return org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
 * @since 1.3.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
@ServiceProviderFor(ExtensionManager.class)
public final class DefaultExtensionManager implements ExtensionManager {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateUtils.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class TemplateUtils {
    private static final Properties TEMPLATES_INVENTORY = new Properties();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
    private final JReleaserLogger logger;
    private final String distributionName;
    private final org.jreleaser.model.Distribution.DistributionType distributionType;
    private final String packagerName;
    private final String announcerName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        private JReleaserLogger logger;
        private String distributionName;
        private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
        private String packagerName;
        private String announcerName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        private JReleaserLogger logger;
        private String distributionName;
        private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
        private String packagerName;
        private String announcerName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        }

        public TemplateGeneratorBuilder distributionType(org.jreleaser.model.Distribution.DistributionType distributionType) {
            this.distributionType = distributionType;
            return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
    private TemplateGenerator(JReleaserLogger logger,
                              String distributionName,
                              org.jreleaser.model.Distribution.DistributionType distributionType,
                              String assemblerType,
                              String assemblerName,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/SbomCatalogerProcessor.java`
#### Snippet
```java
 * @since 1.5.0
 */
public interface SbomCatalogerProcessor<A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger,
    C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> {
    C getCataloger();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/SbomCatalogerProcessor.java`
#### Snippet
```java
 */
public interface SbomCatalogerProcessor<A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger,
    C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> {
    C getCataloger();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/SbomCatalogerProcessorFactory.java`
#### Snippet
```java
 * @since 1.5.0
 */
public interface SbomCatalogerProcessorFactory<A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger,
    C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>,
    SC extends SbomCatalogerProcessor<A, C>> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/SbomCatalogerProcessorFactory.java`
#### Snippet
```java
 */
public interface SbomCatalogerProcessorFactory<A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger,
    C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>,
    SC extends SbomCatalogerProcessor<A, C>> {
    String getName();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/AbstractSbomCatalogerProcessor.java`
#### Snippet
```java
 * @since 1.5.0
 */
public abstract class AbstractSbomCatalogerProcessor<A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger,
    C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> implements SbomCatalogerProcessor<A, C> {
    protected final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/catalog/sbom/AbstractSbomCatalogerProcessor.java`
#### Snippet
```java
 */
public abstract class AbstractSbomCatalogerProcessor<A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger,
    C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> implements SbomCatalogerProcessor<A, C> {
    protected final JReleaserContext context;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedSbomCatalogers() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger.TYPE);
        set.add(org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.catalog.sbom` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger.TYPE);
        set.add(org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedMavenDeployers() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.AzureMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.AzureMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.AzureMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.deploy.maven.AzureMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.Nexus2MavenDeployer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.Nexus2MavenDeployer.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.Nexus2MavenDeployer.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedUploaders() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.upload.ArtifactoryUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.FtpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GiteaUploader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.upload.ArtifactoryUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.FtpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GiteaUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GitlabUploader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.upload.ArtifactoryUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.FtpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GiteaUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GitlabUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.HttpUploader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.upload.FtpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GiteaUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GitlabUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.HttpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.S3Uploader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.upload.GiteaUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.GitlabUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.HttpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.S3Uploader.TYPE);
        set.add(org.jreleaser.model.api.upload.ScpUploader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.upload.GitlabUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.HttpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.S3Uploader.TYPE);
        set.add(org.jreleaser.model.api.upload.ScpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.SftpUploader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.upload.HttpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.S3Uploader.TYPE);
        set.add(org.jreleaser.model.api.upload.ScpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.SftpUploader.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.upload` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.upload.S3Uploader.TYPE);
        set.add(org.jreleaser.model.api.upload.ScpUploader.TYPE);
        set.add(org.jreleaser.model.api.upload.SftpUploader.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.download` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedDownloaders() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.download.FtpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.HttpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.ScpDownloader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.download` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.download.FtpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.HttpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.ScpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.SftpDownloader.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.download` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.download.FtpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.HttpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.ScpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.SftpDownloader.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.download` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.download.HttpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.ScpDownloader.TYPE);
        set.add(org.jreleaser.model.api.download.SftpDownloader.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedAnnouncers() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.announce.ArticleAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscordAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.announce.ArticleAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscordAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.ArticleAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscordAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.DiscordAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.WebhooksAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.WebhooksAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.ZulipAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.WebhooksAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.ZulipAnnouncer.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.WebhooksAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.ZulipAnnouncer.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedAssemblers() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.assemble.ArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JavaArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.assemble.ArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JavaArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JpackageAssembler.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.assemble.ArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JavaArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JpackageAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.NativeImageAssembler.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.assemble.JavaArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JpackageAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.NativeImageAssembler.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JpackageAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.NativeImageAssembler.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedPackagers() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.packagers.AppImagePackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.AsdfPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.packagers.AppImagePackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.AsdfPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.AppImagePackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.AsdfPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerConfiguration.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.AsdfPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.DockerConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JibConfiguration.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JibConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JibConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JibConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.JibConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SnapPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SnapPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SpecPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SnapPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SpecPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.WingetPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SnapPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SpecPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.WingetPackager.TYPE);
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.SnapPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SpecPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.WingetPackager.TYPE);
        return unmodifiableSet(set);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class JReleaserModel {
    private final Environment environment = new Environment();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/FileSet.java`
#### Snippet
```java
            .collect(toSet());

        if (!java.nio.file.Files.exists(basedir)) {
            if (isFailOnMissingInput()) {
                throw new IOException(RB.$("ERROR_artifacts_glob_missing_input",
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/FileSet.java`
#### Snippet
```java
        GlobResolver resolver = new GlobResolver(context.getLogger(), basedir, resolvedIncludes, resolvedExcludes);

        java.nio.file.Files.walkFileTree(basedir, resolver);
        if (resolver.failed) {
            throw new IOException(RB.$("ERROR_artifacts_glob_resolution"));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/HttpUploader.java`
#### Snippet
```java
 */
public final class HttpUploader extends AbstractWebUploader<org.jreleaser.model.api.upload.HttpUploader, HttpUploader>
    implements org.jreleaser.model.internal.common.Http {
    private static final long serialVersionUID = 3851047281417864436L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/CodebergReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return CodebergReleaser.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GiteaReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return GiteaReleaser.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GithubReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return GithubReleaser.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GenericGitReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return GenericGitReleaser.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TeamsAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GitlabReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return GitlabReleaser.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/AbstractMessageAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/MastodonAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(statusTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/GitterAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/MattermostAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TwitterAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(statusTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/GoogleChatAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncer.java`
#### Snippet
```java
 * @since 1.3.0
 */
public final class HttpAnnouncer extends AbstractAnnouncer<HttpAnnouncer, org.jreleaser.model.api.announce.HttpAnnouncer> implements org.jreleaser.model.internal.common.Http {
    private static final long serialVersionUID = -8348542653717001938L;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(payloadTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscordAnnouncer.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/ArchiveAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return ArchiveAssembler.this.getPlatform().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Changelog.java`
#### Snippet
```java
        Path templatePath = context.getBasedir().resolve(contentTemplate);
        try {
            return java.nio.file.Files.newBufferedReader(templatePath);
        } catch (IOException e) {
            throw new JReleaserException(RB.$("ERROR_unexpected_error_reading_template",
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Changelog.java`
#### Snippet
```java
            Path templatePath = context.getBasedir().resolve(contentTemplate);
            try {
                return java.nio.file.Files.newBufferedReader(templatePath);
            } catch (IOException e) {
                throw new JReleaserException(RB.$("ERROR_unexpected_error_reading_template",
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.assemble` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JavaArchiveAssembler.java`
#### Snippet
```java
            @Override
            public Map<String, Object> asMap(boolean full) {
                return unmodifiableMap(org.jreleaser.model.internal.assemble.JavaArchiveAssembler.Java.this.asMap(full));
            }
        };
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.assemble` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JavaArchiveAssembler.java`
#### Snippet
```java
    }

    public static final class Java extends AbstractModelObject<org.jreleaser.model.internal.assemble.JavaArchiveAssembler.Java> implements Domain {
        private static final long serialVersionUID = 7202113953208274002L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.assemble` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JavaArchiveAssembler.java`
#### Snippet
```java

        @Override
        public void merge(org.jreleaser.model.internal.assemble.JavaArchiveAssembler.Java source) {
            this.mainModule = merge(this.mainModule, source.mainModule);
            this.mainClass = merge(this.mainClass, source.mainClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JavaArchiveAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return JavaArchiveAssembler.this.getPlatform().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return NativeImageAssembler.this.getPlatform().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.Java getJava() {
            return NativeImageAssembler.this.getJava().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.Java getJava() {
            return JlinkAssembler.this.getJava().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return JlinkAssembler.this.getPlatform().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SdkmanPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SdkmanPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SdkmanPackager.java`
#### Snippet
```java
 */
public final class SdkmanPackager extends AbstractPackager<org.jreleaser.model.api.packagers.SdkmanPackager, SdkmanPackager> implements TimeoutAware {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 3632422575248447545L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.internal.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/HttpDownloader.java`
#### Snippet
```java
 */
public final class HttpDownloader extends AbstractDownloader<org.jreleaser.model.api.download.HttpDownloader, HttpDownloader>
    implements org.jreleaser.model.internal.common.Http {
    private static final long serialVersionUID = -3365213730876579690L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return AppImagePackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java
 */
public final class AppImagePackager extends AbstractAppdataPackager<org.jreleaser.model.api.packagers.AppImagePackager, AppImagePackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -5619053700424178633L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return ChocolateyPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java
 */
public final class ChocolateyPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.ChocolateyPackager, ChocolateyPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -4467824821283380330L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return ScoopPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java
 */
public final class ScoopPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.ScoopPackager, ScoopPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -8156604651470704715L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java
 */
public final class AsdfPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.AsdfPackager, AsdfPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 2289622050226719068L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return AsdfPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return FlatpakPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java
 */
public final class FlatpakPackager extends AbstractAppdataPackager<org.jreleaser.model.api.packagers.FlatpakPackager, FlatpakPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 1676752377583110248L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return GofishPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java
 */
public final class GofishPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.GofishPackager, GofishPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -4053286282850852250L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return MacportsPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java
 */
public final class MacportsPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.MacportsPackager, MacportsPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 6339866408211084697L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/WingetPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return WingetPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return JpackageAssembler.this.getPlatform().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.Java getJava() {
            return JpackageAssembler.this.getJava().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return BrewPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java
 */
public final class SpecPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.SpecPackager, SpecPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 3054130455318535496L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return SpecPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java
 */
public final class JbangPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.JbangPackager, JbangPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 7475917126983967203L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return JbangPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SdkmanAnnouncerValidator.java`
#### Snippet
```java

        if (null == announcer.getCommand()) {
            announcer.setCommand(org.jreleaser.model.Sdkman.Command.MAJOR);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.release` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/DiscussionsAnnouncerValidator.java`
#### Snippet
```java
        }

        if (!org.jreleaser.model.api.release.GithubReleaser.TYPE.equals(context.getModel().getRelease().getReleaser().getServiceName())) {
            errors.configuration(RB.$("validation_discussions_enabled"));
            context.getLogger().debug(RB.$("validation.disabled"));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SmtpAnnouncerValidator.java`
#### Snippet
```java

        if (null == announcer.getTransport()) {
            announcer.setTransport(org.jreleaser.model.Mail.Transport.SMTP);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SmtpAnnouncerValidator.java`
#### Snippet
```java

        if (null == announcer.getMimeType()) {
            announcer.setMimeType(org.jreleaser.model.Mail.MimeType.TEXT);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/project/ProjectValidator.java`
#### Snippet
```java
                "project.versionPattern",
                project.getVersionPattern(),
                org.jreleaser.model.VersionPattern.Type.SEMVER.toString()));

        project.getSnapshot().setPattern(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return SnapPackager.this.getCommitAuthor().asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java
 */
public final class SnapPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.SnapPackager, SnapPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = 4351951573944850125L;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/ArchiveAssemblerResolver.java`
#### Snippet
```java
        String archiveName = assembler.getResolvedArchiveName(context);

        for (org.jreleaser.model.Archive.Format format : assembler.getFormats()) {
            Path path = baseOutputDirectory
                .resolve(archiveName + "." + format.extension())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/BaseReleaserValidator.java`
#### Snippet
```java

        if (mode.validateConfig()) {
            if (service.isSign() && model.getSigning().getMode() == org.jreleaser.model.Signing.Mode.COSIGN) {
                service.setSign(false);
                errors.warning(RB.$("validation_git_signing_cosign", service.getServiceName()));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JavaArchiveAssemblerResolver.java`
#### Snippet
```java
        String archiveName = assembler.getResolvedArchiveName(context);

        for (org.jreleaser.model.Archive.Format format : assembler.getFormats()) {
            Path path = baseOutputDirectory
                .resolve(archiveName + "." + format.extension())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SdkmanPackagerValidator.java`
#### Snippet
```java
            packager.setCommand(parentPackager.getCommand());
            if (null == packager.getCommand()) {
                packager.setCommand(org.jreleaser.model.Sdkman.Command.MAJOR);
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-config-json/src/main/java/org/jreleaser/config/json/JsonJReleaserConfigParser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
@ServiceProviderFor(JReleaserConfigParser.class)
public class JsonJReleaserConfigParser extends AbstractJReleaserConfigParser {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactUploader.java`
#### Snippet
```java
 * @since 1.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class FtpArtifactUploader extends AbstractArtifactUploader<org.jreleaser.model.api.upload.FtpUploader, FtpUploader> {
    private FtpUploader uploader;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.download` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactDownloader.java`
#### Snippet
```java
    @Override
    public String getType() {
        return org.jreleaser.model.api.download.ScpDownloader.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-config-toml/src/main/java/org/jreleaser/config/toml/TomlJReleaserConfigParser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
@ServiceProviderFor(JReleaserConfigParser.class)
public class TomlJReleaserConfigParser extends AbstractJReleaserConfigParser {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-config-yaml/src/main/java/org/jreleaser/config/yaml/YamlJReleaserConfigParser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
@ServiceProviderFor(JReleaserConfigParser.class)
public class YamlJReleaserConfigParser extends AbstractJReleaserConfigParser {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/release/ReleaseUtils.java`
#### Snippet
```java
 * @since 0.7.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ReleaseUtils {
    private ReleaseUtils() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactUploader.java`
#### Snippet
```java
 * @since 1.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class ScpArtifactUploader extends AbstractArtifactUploader<org.jreleaser.model.api.upload.ScpUploader, ScpUploader> {
    private ScpUploader uploader;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.MacportsPackager getMacports() {
            return macports.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncerBuilderFactory.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.announce.HttpAnnouncers.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
    private <T extends Packager<?>> T resolvePackager(String name) {
        switch (name.toLowerCase(Locale.ENGLISH).trim()) {
            case org.jreleaser.model.api.packagers.AppImagePackager.TYPE:
                return (T) getAppImage();
            case org.jreleaser.model.api.packagers.AsdfPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.AppImagePackager.TYPE:
                return (T) getAppImage();
            case org.jreleaser.model.api.packagers.AsdfPackager.TYPE:
                return (T) getAsdf();
            case org.jreleaser.model.api.packagers.BrewPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.AsdfPackager.TYPE:
                return (T) getAsdf();
            case org.jreleaser.model.api.packagers.BrewPackager.TYPE:
                return (T) getBrew();
            case org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.BrewPackager.TYPE:
                return (T) getBrew();
            case org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE:
                return (T) getChocolatey();
            case org.jreleaser.model.api.packagers.DockerConfiguration.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE:
                return (T) getChocolatey();
            case org.jreleaser.model.api.packagers.DockerConfiguration.TYPE:
                return (T) getDocker();
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.DockerConfiguration.TYPE:
                return (T) getDocker();
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
                return (T) getFlatpak();
            case org.jreleaser.model.api.packagers.GofishPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
                return (T) getFlatpak();
            case org.jreleaser.model.api.packagers.GofishPackager.TYPE:
                return (T) getGofish();
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.GofishPackager.TYPE:
                return (T) getGofish();
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
                return (T) getJbang();
            case org.jreleaser.model.api.packagers.JibConfiguration.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
                return (T) getJbang();
            case org.jreleaser.model.api.packagers.JibConfiguration.TYPE:
                return (T) getJib();
            case org.jreleaser.model.api.packagers.MacportsPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.JibConfiguration.TYPE:
                return (T) getJib();
            case org.jreleaser.model.api.packagers.MacportsPackager.TYPE:
                return (T) getMacports();
            case org.jreleaser.model.api.packagers.ScoopPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.MacportsPackager.TYPE:
                return (T) getMacports();
            case org.jreleaser.model.api.packagers.ScoopPackager.TYPE:
                return (T) getScoop();
            case org.jreleaser.model.api.packagers.SdkmanPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.ScoopPackager.TYPE:
                return (T) getScoop();
            case org.jreleaser.model.api.packagers.SdkmanPackager.TYPE:
                return (T) getSdkman();
            case org.jreleaser.model.api.packagers.SnapPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.SdkmanPackager.TYPE:
                return (T) getSdkman();
            case org.jreleaser.model.api.packagers.SnapPackager.TYPE:
                return (T) getSnap();
            case org.jreleaser.model.api.packagers.SpecPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.SnapPackager.TYPE:
                return (T) getSnap();
            case org.jreleaser.model.api.packagers.SpecPackager.TYPE:
                return (T) getSpec();
            case org.jreleaser.model.api.packagers.WingetPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.SpecPackager.TYPE:
                return (T) getSpec();
            case org.jreleaser.model.api.packagers.WingetPackager.TYPE:
                return (T) getWinget();
            default:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.ScoopPackager getScoop() {
            return scoop.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.BrewPackager getBrew() {
            return brew.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.SnapPackager getSnap() {
            return snap.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.JibPackager getJib() {
            return jib.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.AppImagePackager getAppImage() {
            return appImage.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.GofishPackager getGofish() {
            return gofish.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.SdkmanPackager getSdkman() {
            return sdkman.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.DockerPackager getDocker() {
            return docker.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.FlatpakPackager getFlatpak() {
            return flatpak.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.SpecPackager getSpec() {
            return spec.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.AsdfPackager getAsdf() {
            return asdf.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.WingetPackager getWinget() {
            return winget.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.JbangPackager getJbang() {
            return jbang.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.ChocolateyPackager getChocolatey() {
            return chocolatey.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.download` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactDownloader.java`
#### Snippet
```java
    @Override
    public String getType() {
        return org.jreleaser.model.api.download.ScpDownloader.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-s3-java-sdk/src/main/java/org/jreleaser/sdk/s3/S3ArtifactUploader.java`
#### Snippet
```java
 * @since 0.8.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class S3ArtifactUploader extends AbstractArtifactUploader<org.jreleaser.model.api.upload.S3Uploader, S3Uploader> {
    private S3Uploader uploader;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactDownloader.java`
#### Snippet
```java
        if (!context.isDryrun()) {
            try {
                org.apache.commons.io.FileUtils.copyURLToFile(
                    new URI(input).toURL(),
                    outputPath.toFile(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
 * @since 1.3.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class HttpAnnouncer implements Announcer<org.jreleaser.model.api.announce.HttpAnnouncers> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary and can be removed
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class HttpAnnouncer implements Announcer<org.jreleaser.model.api.announce.HttpAnnouncers> {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.announce.HttpAnnouncers https;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary and can be removed
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.announce.HttpAnnouncers.TYPE;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/SmtpAnnouncer.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class SmtpAnnouncer implements Announcer<org.jreleaser.model.api.announce.SmtpAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-disco-java-sdk/src/main/java/org/jreleaser/sdk/disco/JReleaserVersion.java`
#### Snippet
```java
 * @since 0.9.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class JReleaserVersion {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(JReleaserVersion.class.getName());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
        private final JReleaserLogger logger;
        private boolean dryrun;
        private org.jreleaser.model.Mail.Transport transport = org.jreleaser.model.Mail.Transport.SMTP;
        private String host;
        private int port;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
        private final JReleaserLogger logger;
        private boolean dryrun;
        private org.jreleaser.model.Mail.Transport transport = org.jreleaser.model.Mail.Transport.SMTP;
        private String host;
        private int port;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
                props.put("mail.smtp.auth", "true");
            }
            if (transport == org.jreleaser.model.Mail.Transport.SMTP) {
                if (!props.containsKey("mail.smtp.starttls.enable")) {
                    props.put("mail.smtp.starttls.enable", "true");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
        }

        public Builder transport(org.jreleaser.model.Mail.Transport transport) {
            this.transport = transport;
            return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
    private MessageSmtpCommand(JReleaserLogger logger,
                               boolean dryrun,
                               org.jreleaser.model.Mail.Transport transport,
                               String host,
                               int port,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
                               String subject,
                               String message,
                               org.jreleaser.model.Mail.MimeType mimeType,
                               Map<String, String> properties) {
        this.logger = logger;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
        private String subject;
        private String message;
        private org.jreleaser.model.Mail.MimeType mimeType = org.jreleaser.model.Mail.MimeType.TEXT;
        private final Map<String, String> properties = new LinkedHashMap<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
        private String subject;
        private String message;
        private org.jreleaser.model.Mail.MimeType mimeType = org.jreleaser.model.Mail.MimeType.TEXT;
        private final Map<String, String> properties = new LinkedHashMap<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
        }

        public Builder mimeType(org.jreleaser.model.Mail.MimeType mimeType) {
            this.mimeType = mimeType;
            return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
    private final String subject;
    private final String message;
    private final org.jreleaser.model.Mail.MimeType mimeType;
    private final Map<String, String> properties = new LinkedHashMap<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/MessageSmtpCommand.java`
#### Snippet
```java
    private final JReleaserLogger logger;
    private final boolean dryrun;
    private final org.jreleaser.model.Mail.Transport transport;
    private final String host;
    private final int port;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-slack-java-sdk/src/main/java/org/jreleaser/sdk/slack/SlackAnnouncer.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class SlackAnnouncer implements Announcer<org.jreleaser.model.api.announce.SlackAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-teams-java-sdk/src/main/java/org/jreleaser/sdk/teams/TeamsAnnouncer.java`
#### Snippet
```java
 * @since 0.2.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class TeamsAnnouncer implements Announcer<org.jreleaser.model.api.announce.TeamsAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-zulip-java-sdk/src/main/java/org/jreleaser/sdk/zulip/ZulipAnnouncer.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class ZulipAnnouncer implements Announcer<org.jreleaser.model.api.announce.ZulipAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/DiscussionsAnnouncer.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class DiscussionsAnnouncer implements Announcer<org.jreleaser.model.api.announce.DiscussionsAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GiteaReleaser extends AbstractReleaser<org.jreleaser.model.api.release.GiteaReleaser> {
    private static final long serialVersionUID = -8160459963248847787L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-gitter-java-sdk/src/main/java/org/jreleaser/sdk/gitter/GitterAnnouncer.java`
#### Snippet
```java
 * @since 0.2.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GitterAnnouncer implements Announcer<org.jreleaser.model.api.announce.GitterAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-command-java-sdk/src/main/java/org/jreleaser/sdk/command/Command.java`
#### Snippet
```java
 * @since 0.8.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class Command {
    private final List<String> args = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-discord-java-sdk/src/main/java/org/jreleaser/sdk/discord/DiscordAnnouncer.java`
#### Snippet
```java
 * @since 0.2.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class DiscordAnnouncer implements Announcer<org.jreleaser.model.api.announce.DiscordAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/SdkmanAnnouncer.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class SdkmanAnnouncer implements Announcer<org.jreleaser.model.api.announce.SdkmanAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/FilesKeyring.java`
#### Snippet
```java
 * @since 0.4.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class FilesKeyring extends Keyring {
    private final Path publicKeyring;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GitlabReleaser extends AbstractReleaser<org.jreleaser.model.api.release.GitlabReleaser> {
    private static final long serialVersionUID = 1079387159817891884L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-twitter-java-sdk/src/main/java/org/jreleaser/sdk/twitter/TwitterAnnouncer.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class TwitterAnnouncer implements Announcer<org.jreleaser.model.api.announce.TwitterAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinAnnouncer.java`
#### Snippet
```java
 * @since 1.5.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class LinkedinAnnouncer implements Announcer<org.jreleaser.model.api.announce.LinkedinAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-mastodon-java-sdk/src/main/java/org/jreleaser/sdk/mastodon/MastodonAnnouncer.java`
#### Snippet
```java
 * @since 0.4.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class MastodonAnnouncer implements Announcer<org.jreleaser.model.api.announce.MastodonAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-telegram-java-sdk/src/main/java/org/jreleaser/sdk/telegram/TelegramAnnouncer.java`
#### Snippet
```java
 * @since 0.8.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class TelegramAnnouncer implements Announcer<org.jreleaser.model.api.announce.TelegramAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-webhooks-java-sdk/src/main/java/org/jreleaser/sdk/webhooks/WebhooksAnnouncer.java`
#### Snippet
```java
 * @since 0.5.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class WebhooksAnnouncer implements Announcer<org.jreleaser.model.api.announce.WebhooksAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-discourse-java-sdk/src/main/java/org/jreleaser/sdk/discourse/DiscourseAnnouncer.java`
#### Snippet
```java
 * @since 1.3.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class DiscourseAnnouncer implements Announcer<org.jreleaser.model.api.announce.DiscourseAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-mattermost-java-sdk/src/main/java/org/jreleaser/sdk/mattermost/MattermostAnnouncer.java`
#### Snippet
```java
 * @since 0.4.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class MattermostAnnouncer implements Announcer<org.jreleaser.model.api.announce.MattermostAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-genericgit-java-sdk/src/main/java/org/jreleaser/sdk/generic/git/GenericGitReleaser.java`
#### Snippet
```java
 * @since 0.4.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GenericGitReleaser extends AbstractReleaser<org.jreleaser.model.api.release.GenericGitReleaser> {
    private static final long serialVersionUID = -6810299968968134132L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-google-chat-java-sdk/src/main/java/org/jreleaser/sdk/googlechat/GoogleChatAnnouncer.java`
#### Snippet
```java
 * @since 0.5.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GoogleChatAnnouncer implements Announcer<org.jreleaser.model.api.announce.GoogleChatAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-artifactory-java-sdk/src/main/java/org/jreleaser/sdk/artifactory/ArtifactoryArtifactUploader.java`
#### Snippet
```java
 * @since 0.3.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class ArtifactoryArtifactUploader extends AbstractArtifactUploader<org.jreleaser.model.api.upload.ArtifactoryUploader, ArtifactoryUploader> {
    private ArtifactoryUploader uploader;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-opencollective-java-sdk/src/main/java/org/jreleaser/sdk/opencollective/OpenCollectiveAnnouncer.java`
#### Snippet
```java
 * @since 1.6.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class OpenCollectiveAnnouncer implements Announcer<org.jreleaser.model.api.announce.OpenCollectiveAnnouncer> {
    private final JReleaserContext context;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
                DeployableCollector collector = new DeployableCollector(root, context.getModel().getProject().isSnapshot());

                java.nio.file.Files.walkFileTree(root, collector);
                if (collector.failed) {
                    throw new JReleaserException(RB.$("ERROR_deployer_stage_resolution"));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/ClientUtils.java`
#### Snippet
```java
 * @since 0.2.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ClientUtils {
    private static final Tika TIKA = new Tika();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.release` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java

        String separator = lineSeparator();
        if (org.jreleaser.model.api.release.GitlabReleaser.TYPE.equals(releaser.getServiceName())) {
            separator += lineSeparator();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
 * @since 0.4.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class CodebergReleaser extends AbstractReleaser<org.jreleaser.model.api.release.CodebergReleaser> {
    private static final long serialVersionUID = -4458608993449050365L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java
            required = true,
            defaultValue = "JAVA_BINARY")
        org.jreleaser.model.Distribution.DistributionType distributionType;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java
        }

        org.jreleaser.model.Distribution.DistributionType distributionType() {
            return null != packagers ? packagers.distributionType : null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPlatformAwareModelCommand.java`
#### Snippet
```java
            Collections.addAll(list, rejectedPlatforms);
        }
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.REJECT_PLATFORMS, list);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPlatformAwareModelCommand.java`
#### Snippet
```java
    @Override
    protected List<String> collectSelectedPlatforms() {
        boolean resolvedSelectCurrentPlatform = resolveBoolean(org.jreleaser.model.api.JReleaserContext.SELECT_CURRENT_PLATFORM, selectCurrentPlatform);
        if (resolvedSelectCurrentPlatform) return Collections.singletonList(PlatformUtils.getCurrentFull());

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPlatformAwareModelCommand.java`
#### Snippet
```java
            Collections.addAll(list, selectPlatforms);
        }
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.SELECT_PLATFORMS, list);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateGenerateTask.java`
#### Snippet
```java
    }

    public void setDistributionType(org.jreleaser.model.Distribution.DistributionType distributionType) {
        this.distributionType = distributionType;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateGenerateTask.java`
#### Snippet
```java
    private Path outputDir;
    private String distributionName;
    private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
    private String packagerName;
    private String announcerName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateGenerateTask.java`
#### Snippet
```java
    private Path outputDir;
    private String distributionName;
    private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
    private String packagerName;
    private String announcerName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractPlatformAwareJReleaserTask.java`
#### Snippet
```java
    @Override
    protected List<String> collectSelectedPlatforms() {
        boolean resolvedSelectCurrentPlatform = resolveBoolean(org.jreleaser.model.api.JReleaserContext.SELECT_CURRENT_PLATFORM, selectCurrentPlatform);
        if (resolvedSelectCurrentPlatform) return Collections.singletonList(PlatformUtils.getCurrentFull());
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.SELECT_PLATFORMS, selectPlatforms);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractPlatformAwareJReleaserTask.java`
#### Snippet
```java
        boolean resolvedSelectCurrentPlatform = resolveBoolean(org.jreleaser.model.api.JReleaserContext.SELECT_CURRENT_PLATFORM, selectCurrentPlatform);
        if (resolvedSelectCurrentPlatform) return Collections.singletonList(PlatformUtils.getCurrentFull());
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.SELECT_PLATFORMS, selectPlatforms);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractPlatformAwareJReleaserTask.java`
#### Snippet
```java
    @Override
    protected List<String> collectRejectedPlatforms() {
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.REJECT_PLATFORMS, rejectPlatforms);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractPlatformAwareMojo.java`
#### Snippet
```java
            Collections.addAll(list, rejectedPlatforms);
        }
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.REJECT_PLATFORMS, list);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractPlatformAwareMojo.java`
#### Snippet
```java
    @Override
    protected List<String> collectSelectedPlatforms() {
        boolean resolvedSelectCurrentPlatform = resolveBoolean(org.jreleaser.model.api.JReleaserContext.SELECT_CURRENT_PLATFORM, selectCurrentPlatform);
        if (resolvedSelectCurrentPlatform) return Collections.singletonList(PlatformUtils.getCurrentFull());

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractPlatformAwareMojo.java`
#### Snippet
```java
            Collections.addAll(list, selectPlatforms);
        }
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.SELECT_PLATFORMS, list);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserInitMojo.java`
#### Snippet
```java
    protected PrintWriter createTracer() throws MojoExecutionException {
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateGenerateMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jreleaser.template.distribution.type", defaultValue = "JAVA_BINARY")
    private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateGenerateMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jreleaser.template.distribution.type", defaultValue = "JAVA_BINARY")
    private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateGenerateMojo.java`
#### Snippet
```java
    protected PrintWriter createTracer() throws MojoExecutionException {
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
    }

    private Set<org.jreleaser.model.UpdateSection> collectUpdateSections() {
        Set<org.jreleaser.model.UpdateSection> set = new LinkedHashSet<>();
        if (null != updateSections && updateSections.length > 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java

    private Set<org.jreleaser.model.UpdateSection> collectUpdateSections() {
        Set<org.jreleaser.model.UpdateSection> set = new LinkedHashSet<>();
        if (null != updateSections && updateSections.length > 0) {
            for (UpdateSection updateSection : updateSections) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
        if (null != updateSections && updateSections.length > 0) {
            for (UpdateSection updateSection : updateSections) {
                set.add(org.jreleaser.model.UpdateSection.of(updateSection.name()));
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
    private PrintWriter createTracer() throws MojoExecutionException {
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(
                outputDirectory.toPath().resolve("trace.log").toFile()));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractJReleaserMojo.java`
#### Snippet
```java
    protected PrintWriter createTracer() throws MojoExecutionException {
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(
                outputDirectory.toPath().resolve("trace.log").toFile()));
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Detector()` of an abstract class should not be declared 'public'
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
    }

    public Detector(SystemPropertyOperationProvider systemPropertyOperationProvider,
        FileOperationProvider fileOperationProvider) {
        this.systemPropertyOperationProvider = systemPropertyOperationProvider;
```

### NonProtectedConstructorInAbstractClass
Constructor `Detector()` of an abstract class should not be declared 'public'
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
    private final FileOperationProvider fileOperationProvider;

    public Detector() {
        this(new SimpleSystemPropertyOperations(), new SimpleFileOperations());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JReleaserLoggerService()` of an abstract class should not be declared 'public'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
    }

    public JReleaserLoggerService() {
        try {
            Path outputDirectoryPath = getParameters().getOutputDirectory().get().getAsFile().toPath();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `time`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/TimeUtils.java`
#### Snippet
```java

    public static String formatDuration(double time) {
        if (time <= 0d) time = 0d;

        String formatted = String.format("%.3f", time) + " s";
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
    public static String envKey(String key) {
        if (!key.startsWith(JRELEASER_ENV_PREFIX)) {
            key = JRELEASER_ENV_PREFIX + key;
        }
        return toVar(key);
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
    public static String sysKey(String key) {
        if (!key.startsWith(JRELEASER_SYS_PREFIX)) {
            key = JRELEASER_SYS_PREFIX + key;
        }
        return key.replace(" ", ".")
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java

    private static String normalizeArch(String value) {
        value = normalize(value);
        if (value.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            return "x86_64";
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java

    private static String normalizeOs(String value) {
        value = normalize(value);
        if (value.startsWith("aix")) {
            return "aix";
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int i = className.lastIndexOf(".");
        if (i > -1) {
            className = className.substring(i + 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int pos = name.lastIndexOf(".");
        if (pos != -1) {
            name = name.substring(pos + 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                str = applyQuotes(str);
                break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

        if (name.endsWith(".groovy")) {
            name = name.substring(0, name.length() - 7);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
     */
    public static String getNaturalName(String name) {
        name = getShortName(name);
        if (isBlank(name)) {
            return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/Templates.java`
#### Snippet
```java

        while (input.contains("{{")) {
            input = applyTemplate(input, props);
            count++;

```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/init/Init.java`
#### Snippet
```java
    public static void execute(JReleaserLogger logger, String format, boolean overwrite, Path outputDirectory) {
        try {
            if (isBlank(format)) format = "yml";

            if (!getSupportedConfigFormats().contains(format)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SnapPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = outputDirectory.resolve(fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/MacportsPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "Portfile".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/ChocolateyPackagerProcessor.java`
#### Snippet
```java
        }

        fileName = trimTplExtension(fileName);

        Path outputFile = "binary.nuspec".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SpecPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "app.spec".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JibPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "executable".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `scriptName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java

    private String sanitizeScriptName(String scriptName) {
        scriptName = scriptName.replace("-", "_");
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < scriptName.length(); i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        String scriptName = props.get(KEY_JBANG_SCRIPT_NAME);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java
            return;
        } else if (fileName.contains("-github")) {
            fileName = StringUtils.remove(fileName, "-github");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java
        }

        fileName = trimTplExtension(fileName);
        Optional<Stereotype> stereotype = resolveStereotype(fileName);
        if (stereotype.isPresent()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java
        if (stereotype.isPresent()) {
            if (distribution.getStereotype() == stereotype.get()) {
                fileName = fileName.substring(distribution.getStereotype().formatted().length() + 1);
            } else {
                // skip it
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/ScoopPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "manifest.json".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/GofishPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "food.lua".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/FlatpakPackagerProcessor.java`
#### Snippet
```java
            return;
        } else if (fileName.contains("-github")) {
            fileName = StringUtils.remove(fileName, "-github");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/FlatpakPackagerProcessor.java`
#### Snippet
```java
        }

        fileName = trimTplExtension(fileName);
        Optional<Stereotype> stereotype = resolveStereotype(fileName);
        if (stereotype.isPresent()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/FlatpakPackagerProcessor.java`
#### Snippet
```java
        if (stereotype.isPresent()) {
            if (distribution.getStereotype() == stereotype.get()) {
                fileName = fileName.substring(distribution.getStereotype().formatted().length() + 1);
            } else {
                // skip it
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AsdfPackagerProcessor.java`
#### Snippet
```java
            return;
        } else if (fileName.contains("-github")) {
            fileName = StringUtils.remove(fileName, "-github");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AsdfPackagerProcessor.java`
#### Snippet
```java
        }

        fileName = trimTplExtension(fileName);

        Path outputFile = outputDirectory.resolve(fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        if (packager.getCask().isEnabled()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
    @Override
    protected String applyTemplate(String fileName, Reader reader, TemplateContext props) {
        fileName = trimTplExtension(fileName);
        if ("locale.yaml".equals(fileName)) {
            props.set(KEY_WINGET_MANIFEST_TYPE, "defaultLocale");
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        String packageIdentifier = getPackager().getPackage().getIdentifier();
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java

        if ("version.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".version.yaml";
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if ("installer.yaml".equals(fileName)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `outputDirectory`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
        if ("version.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".version.yaml";
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if ("installer.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".installer.yaml";
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if ("installer.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".installer.yaml";
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if ("locale.yaml".equals(fileName)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `outputDirectory`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
        } else if ("installer.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".installer.yaml";
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if ("locale.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".locale." + getPackager().getDefaultLocale() + ".yaml";
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if ("locale.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".locale." + getPackager().getDefaultLocale() + ".yaml";
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if (fileName.startsWith("locale") && fileName.endsWith(".yaml")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `outputDirectory`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
        } else if ("locale.yaml".equals(fileName)) {
            fileName = packageIdentifier + ".locale." + getPackager().getDefaultLocale() + ".yaml";
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if (fileName.startsWith("locale") && fileName.endsWith(".yaml")) {
            fileName = packageIdentifier + "." + fileName;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        } else if (fileName.startsWith("locale") && fileName.endsWith(".yaml")) {
            fileName = packageIdentifier + "." + fileName;
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `outputDirectory`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/WingetPackagerProcessor.java`
#### Snippet
```java
        } else if (fileName.startsWith("locale") && fileName.endsWith(".yaml")) {
            fileName = packageIdentifier + "." + fileName;
            outputDirectory = resolvePackageDirectory(outputDirectory, packageIdentifier);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java
                             Path outputDirectory,
                             String fileName) throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "executable".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AbstractAssemblerProcessor.java`
#### Snippet
```java

    protected void writeFile(String content, TemplateContext props, Path targetDirectory, String fileName) throws AssemblerProcessingException {
        fileName = trimTplExtension(fileName);

        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `errors`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/signing/SigningValidator.java`
#### Snippet
```java
    public static void validateSigning(JReleaserContext context, Mode mode, Errors errors) {
        if (!mode.validateConfig()) {
            errors = new Errors();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
        if (!endpoint.endsWith(API_V1)) {
            if (endpoint.endsWith("/")) {
                endpoint = endpoint.substring(0, endpoint.length() - 1);
            }
            endpoint += API_V1;
```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
                endpoint = endpoint.substring(0, endpoint.length() - 1);
            }
            endpoint += API_V1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java

        if (endpoint.endsWith("/")) {
            endpoint = endpoint.substring(0, endpoint.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listPackageVersions1(next);
        issues.addAll(page.getContent());

```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/Links.java`
#### Snippet
```java

    private String normalize(String url) {
        url = url.trim();
        if (url.startsWith("<") && url.endsWith(">")) {
            url = url.substring(1, url.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/Links.java`
#### Snippet
```java
        url = url.trim();
        if (url.startsWith("<") && url.endsWith(">")) {
            url = url.substring(1, url.length() - 1);
        }
        return url;
```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java

        if (isBlank(endpoint)) {
            endpoint = ENDPOINT;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        if (!endpoint.endsWith(API_V4)) {
            if (endpoint.endsWith("/")) {
                endpoint = endpoint.substring(0, endpoint.length() - 1);
            }
            endpoint += API_V4;
```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
                endpoint = endpoint.substring(0, endpoint.length() - 1);
            }
            endpoint += API_V4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listBranches1(next);
        page.getContent().stream()
            .map(GlBranch::getName)
```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listPackages1(next);
        packages.addAll(page.getContent());

```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listIssues1(next);
        issues.addAll(page.getContent());

```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listLabels1(next);
        labels.addAll(page.getContent());

```

### AssignmentToMethodParameter
Assignment to method parameter `projectIdentifier`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        if (isBlank(projectIdentifier)) {
            GlProject project = getProject(repoName, projectIdentifier);
            projectIdentifier = project.getId().toString();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `projectIdentifier`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        if (isBlank(projectIdentifier)) {
            GlProject project = getProject(repoName, projectIdentifier);
            projectIdentifier = project.getId().toString();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listReleases1(next);
        page.getContent().stream()
            .map(r -> new Release(
```

### AssignmentToMethodParameter
Assignment to method parameter `page`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listLinks1(next);
        links.addAll(page.getContent());

```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java

        if (isNotBlank(owner)) {
            text = text.replace("{{" + KEY_LINKEDIN_OWNER + "}}", owner);
        } else {
            Profile profile = wrap(api::getProfile);
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java
        } else {
            Profile profile = wrap(api::getProfile);
            text = text.replace("{{" + KEY_LINKEDIN_OWNER + "}}", profile.urn());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `host`
in `sdks/jreleaser-mastodon-java-sdk/src/main/java/org/jreleaser/sdk/mastodon/MastodonSdk.java`
#### Snippet
```java
        if (!host.endsWith(API_V1)) {
            if (host.endsWith("/")) {
                host = host.substring(0, host.length() - 1);
            }
            host += API_V1;
```

### AssignmentToMethodParameter
Assignment to method parameter `host`
in `sdks/jreleaser-mastodon-java-sdk/src/main/java/org/jreleaser/sdk/mastodon/MastodonSdk.java`
#### Snippet
```java
                host = host.substring(0, host.length() - 1);
            }
            host += API_V1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/ClientUtils.java`
#### Snippet
```java
                }
                try (Reader reader = new InputStreamReader(connection.getErrorStream(), UTF_8)) {
                    message = IOUtils.toString(reader);
                    if (isNotBlank(message)) {
                        b.append(",")
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
            String search = resolveTemplate(replacer.getSearch(), props);
            String replace = resolveTemplate(replacer.getReplace(), props);
            text = text.replaceAll(search, replace);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `maybeJson`
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/x-www-form-urlencoded"))
            .withHeader("Accept", equalTo("*/*"))
```

### AssignmentToMethodParameter
Assignment to method parameter `maybeJson`
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyJsonRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/json"))
            .withHeader("Accept", or(equalTo("*/*"), equalTo("application/json")))
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Algorithm.java`
#### Snippet
```java
    @JsonCreator
    public static Algorithm of(String str) {
        if (isBlank(str)) return null;

        String value = str.toUpperCase(Locale.ENGLISH).trim()
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileType.java`
#### Snippet
```java

    public static FileType of(String str) {
        if (isBlank(str)) return null;
        return FileType.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace(".", "_"));
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Signing.java`
#### Snippet
```java

        public static Mode of(String str) {
            if (isBlank(str)) return null;
            return Mode.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Sdkman.java`
#### Snippet
```java

        public static Command of(String str) {
            if (isBlank(str)) return null;
            return Command.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Icon.java`
#### Snippet
```java

        public static Type of(String str) {
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Screenshot.java`
#### Snippet
```java

        public static Type of(String str) {
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/VersionPattern.java`
#### Snippet
```java

        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replace(" ", "_")
                .replace("-", "_")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Active.java`
#### Snippet
```java

    public static Active of(String str) {
        if (isBlank(str)) return null;
        return Active.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace("+", "_")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Flatpak.java`
#### Snippet
```java

        public static Runtime of(String str) {
            if (isBlank(str)) return null;
            return Runtime.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Archive.java`
#### Snippet
```java

        public static Format of(String str) {
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace(".", "_"));
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Distribution.java`
#### Snippet
```java

        public static DistributionType of(String str) {
            if (isBlank(str)) return null;

            String value = str.replace(" ", "_")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/UpdateSection.java`
#### Snippet
```java

    public static UpdateSection of(String str) {
        if (isBlank(str)) return null;
        return UpdateSection.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
    }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Stereotype.java`
#### Snippet
```java

    public static Stereotype of(String str) {
        if (isBlank(str)) return null;
        return Stereotype.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
            .replace("+", "_")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Http.java`
#### Snippet
```java

        public static Authorization of(String str) {
            if (isBlank(str)) return null;
            return Authorization.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Http.java`
#### Snippet
```java

        public static Method of(String str) {
            if (isBlank(str)) return null;
            return Method.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ScriptHook.java`
#### Snippet
```java

        public static Shell of(String str) {
            if (isBlank(str)) return null;
            return Shell.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/common/ArchiveOptions.java`
#### Snippet
```java

        public static TarMode of(String str) {
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim());
        }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/common/Apply.java`
#### Snippet
```java

    public static Apply of(String str) {
        if (isBlank(str)) return null;
        return Apply.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
    }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ExecutionEvent.java`
#### Snippet
```java

        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replace(" ", "_")
                .replace("-", "_")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/common/ExtraProperties.java`
#### Snippet
```java
            return String.valueOf(getExtraProperties().get(key));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
                } else {
                    // Other variants are not currently supported.
                    return null;
                }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            closeQuietly(reader);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
            closeQuietly(reader);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java

        public static Format of(String str) {
            if (isBlank(str)) return null;

            String value = str.replace(" ", "")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/SyftSbomCataloger.java`
#### Snippet
```java

        public static Format of(String str) {
            if (isBlank(str)) return null;

            String value = str.replace(" ", "")
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getFilenameExtension(String path) {
        if (null == path) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int extIndex = path.lastIndexOf(".");
        if (extIndex == -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int folderIndex = path.lastIndexOf(File.separator);
        if (folderIndex > extIndex) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getFilename(String path) {
        if (null == path) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int extIndex = path.lastIndexOf(".");
        if (extIndex == -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int folderIndex = path.lastIndexOf(File.separator);
        if (folderIndex > extIndex) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getHyphenatedName(Class<?> clazz) {
        if (null == clazz) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java

            public static Type of(String str) {
                if (isBlank(str)) return null;
                return Type.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
            }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java

            public static Scope of(String str) {
                if (isBlank(str)) return null;
                return Scope.valueOf(str.toUpperCase(Locale.ENGLISH).trim());
            }
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java

            public static UpgradeBehavior of(String str) {
                if (isBlank(str)) return null;

                String value = str.replace(" ", "")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/WingetPackager.java`
#### Snippet
```java

            public static Mode of(String str) {
                if (isBlank(str)) return null;

                String value = str.replace(" ", "")
```

### ReturnNull
Return of `null`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/JibConfiguration.java`
#### Snippet
```java

        public static Format of(String str) {
            if (isBlank(str)) return null;
            return valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace(".", "_"));
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

            public static TarMode of(String str) {
                if (isBlank(str)) return null;
                return valueOf(str.toUpperCase(Locale.ENGLISH).trim());
            }
```

### ReturnNull
Return of `null`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/schema/JsonSchemaGenerator.java`
#### Snippet
```java
            configBuilder.forTypesInGeneral()
                .withDescriptionResolver(scope -> scope.getType().getErasedType() == JReleaserModel.class ?
                    String.format("JReleaser %s", JReleaserVersion.getPlainVersion()) : null)
                .withPatternPropertiesResolver(scope -> {
                    if (scope.getType().isInstanceOf(Map.class)) {
```

### ReturnNull
Return of `null`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/schema/JsonSchemaGenerator.java`
#### Snippet
```java
                        }
                    }
                    return null;
                })
                .withAdditionalPropertiesResolver(scope -> {
```

### ReturnNull
Return of `null`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/schema/JsonSchemaGenerator.java`
#### Snippet
```java
                        }
                    }
                    return null;
                })
                .withDefinitionNamingStrategy(new DefaultSchemaDefinitionNamingStrategy() {
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
        public String getProperty(String key) { // lgtm [java/unsynchronized-getter]
            Object value = map.get(key);
            return null != value ? String.valueOf(value) : null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        if (!supportedAssemblers().contains(assemblerType)) {
            logger.error(RB.$("templates.assembler.not.supported"), assemblerType);
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        if (!supportedAnnouncers().contains(announcerName)) {
            logger.error(RB.$("templates.announcer.not.supported"), announcerName);
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        } catch (FileAlreadyExistsException e) {
            logger.error(RB.$("templates.file_exists.error"), outputFile.toAbsolutePath());
            return null;
        } catch (Exception e) {
            throw fail(e);
```

### ReturnNull
Return of `null`
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
                } catch (FileAlreadyExistsException e) {
                    logger.error(RB.$("templates.file_exists.error"), outputFile.toAbsolutePath());
                    return null;
                } catch (Exception e) {
                    throw fail(e);
```

### ReturnNull
Return of `null`
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
                } catch (FileAlreadyExistsException e) {
                    logger.error(RB.$("templates.file_exists.error"), outputFile.toAbsolutePath());
                    return null;
                } catch (Exception e) {
                    throw fail(e);
```

### ReturnNull
Return of `null`
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        if (!supportedPackagers().contains(packagerName)) {
            logger.error(RB.$("ERROR_packager_not_supported"), packagerName);
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/SdkmanHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
            return cyan(s);
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
            return cyan(s);
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/ExtraProperties.java`
#### Snippet
```java
            return String.valueOf(getExtraProperties().get(key));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java

        String[] parts = coords.split(":");
        if (parts.length != 2) return null;

        Optional<? extends Uploader<?>> uploader = upload
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Release.java`
#### Snippet
```java
        @Override
        public org.jreleaser.model.api.release.GenericGitReleaser getGeneric() {
            return null != generic ? generic.asImmutable() : null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Release.java`
#### Snippet
```java
        @Override
        public org.jreleaser.model.api.release.CodebergReleaser getCodeberg() {
            return null != codeberg ? codeberg.asImmutable() : null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Release.java`
#### Snippet
```java
        @Override
        public org.jreleaser.model.api.release.GiteaReleaser getGitea() {
            return null != gitea ? gitea.asImmutable() : null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Release.java`
#### Snippet
```java
        @Override
        public org.jreleaser.model.api.release.GithubReleaser getGithub() {
            return null != github ? github.asImmutable() : null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Release.java`
#### Snippet
```java
        @Override
        public org.jreleaser.model.api.release.GitlabReleaser getGitlab() {
            return null != gitlab ? gitlab.asImmutable() : null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Release.java`
#### Snippet
```java
        if (null != codeberg) return codeberg.asImmutable();
        if (null != generic) return generic.asImmutable();
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/CodebergReleaser.java`
#### Snippet
```java
    @Override
    public String getReverseRepoHost() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GiteaReleaser.java`
#### Snippet
```java
    @Override
    public String getReverseRepoHost() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java

        public static VersionPattern of(String str) {
            if (isBlank(str)) return null;

            String[] parts = str.trim().split(":");
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

    public String getResolvedImageNameTransform(JReleaserContext context) {
        if (isBlank(imageNameTransform)) return null;
        TemplateContext props = context.getModel().props();
        props.setAll(props());
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

    public String getResolvedImageNameTransform(JReleaserContext context) {
        if (isBlank(imageNameTransform)) return null;
        TemplateContext props = context.getModel().props();
        props.setAll(props());
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpUtils.java`
#### Snippet
```java

    public static FTPClient open(JReleaserContext context, FtpUploader uploader) throws UploadException {
        if (context.isDryrun()) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpUtils.java`
#### Snippet
```java

    public static FTPClient open(JReleaserContext context, FtpDownloader downloader) throws DownloadException {
        if (context.isDryrun()) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SshUtils.java`
#### Snippet
```java

    public static SFTPClient createSFTPClient(SshDownloader<?> downloader, SSHClient ssh) throws DownloadException {
        if (null == ssh) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SshUtils.java`
#### Snippet
```java

    public static SSHClient createSSHClient(JReleaserContext context, SshDownloader<?> downloader) throws DownloadException {
        if (context.isDryrun()) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SshUtils.java`
#### Snippet
```java

    public static SSHClient createSSHClient(JReleaserContext context, SshUploader<?> uploader) throws UploadException {
        if (context.isDryrun()) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SshUtils.java`
#### Snippet
```java

    public static SFTPClient createSFTPClient(SshUploader<?> uploader, SSHClient ssh) throws UploadException {
        if (null == ssh) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-slack-java-sdk/src/main/java/org/jreleaser/sdk/slack/SlackSdk.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
            if (e.isNotFound()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
            if (e.isNotFound()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
            if (e.isNotFound()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java

    private GtRelease findReleaseByTag(Gitea api, String tagName) {
        if (context.isDryrun()) return null;
        return api.findReleaseByTag(gitea.getOwner(), gitea.getName(), tagName);
    }
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java

    private GhRelease findReleaseByTag(Github api, String tagName) {
        if (context.isDryrun()) return null;
        return api.findReleaseByTag(github.getOwner(), github.getName(), tagName);
    }
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/api/StagingProfileRepository.java`
#### Snippet
```java

        public static State of(String str) {
            if (isBlank(str)) return null;
            return State.valueOf(str.toUpperCase(Locale.ENGLISH).trim()
                .replace("-", "_")
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
            if (e.isNotFound()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java

    private String getPrivateEmailUserId(String email) {
        if (!email.endsWith(USERS_NOREPLY_GITHUB_COM)) return null;
        String username = email.substring(0, email.indexOf("@"));
        if (username.contains("+")) {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
            if (e.isNotFound()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
            if (e.isNotFound()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        String configFilePath = environment.getPropertiesFile().toAbsolutePath().normalize().toString();
        String val = check(key, environment.resolve(key), property, dsl, configFilePath, dryrun ? new Errors() : errors);
        return isNotBlank(val) ? Integer.parseInt(val) : null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        Errors errors = new Errors();
        String result = check(keys, environment.getVars(), property, dsl, configFilePath, errors);
        return !errors.hasErrors() ? result : (null != defaultValue ? defaultValue.name() : null);
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        String configFilePath = environment.getPropertiesFile().toAbsolutePath().normalize().toString();
        String val = check(keys, environment.getVars(), property, dsl, configFilePath, dryrun ? new Errors() : errors);
        return isNotBlank(val) ? Integer.parseInt(val) : null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        Errors errors = new Errors();
        String result = check(key, environment.resolve(key), property, dsl, configFilePath, errors);
        return !errors.hasErrors() ? result : (null != defaultValue ? defaultValue.name() : null);
    }

```

### ReturnNull
Return of `null`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
            if (e.isNotFound() || e.isForbidden()) {
                // ok
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
                reader.mark(1);
                if (reader.read() == -1) {
                    return null; // Eagerly returning null avoids "No content to map due to end-of-input"
                }
                reader.reset();
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
                return callable.call();
            }
            return null;
        } catch (Nexus2Exception e) {
            logger.trace(e);
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java

    private GlRelease findReleaseByTag(Gitlab api, String tagName) {
        if (context.isDryrun()) return null;
        return api.findReleaseByTag(gitlab.getOwner(), gitlab.getName(), gitlab.getProjectIdentifier(), tagName);
    }
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java
        Signing signing = context.getModel().getSigning();
        if (context.isDryrun() && isBlank(signing.getPassphrase())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java
                return supplier.get();
            }
            return null;
        } catch (RestAPIException e) {
            logger.trace(e.getStatus() + ": " + e.getReason());
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-genericgit-java-sdk/src/main/java/org/jreleaser/sdk/generic/git/GenericGitReleaser.java`
#### Snippet
```java
    @Override
    public Repository maybeCreateRepository(String owner, String repo, String password) throws IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ReflectConfigGenerator.java`
#### Snippet
```java
        }

        if (collector.isEmpty()) return null;
        return "[\n" + String.join("\n,\n", collector.values()) + "\n]";
    }
```

### ReturnNull
Return of `null`
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ProxyConfigGenerator.java`
#### Snippet
```java
        }

        if (collector.isEmpty()) return null;

        return String.format("[%n" +
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java

    private GtRelease findReleaseByTag(Gitea api, String tagName) {
        if (context.isDryrun()) return null;
        return api.findReleaseByTag(codeberg.getOwner(), codeberg.getName(), tagName);
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] excludedDeployerTypes() {
            return null != exclude ? exclude.excludedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] excludedDeployerNames() {
            return null != exclude ? exclude.excludedDeployerNames : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] includedDeployerTypes() {
            return null != include ? include.includedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] includedDeployerNames() {
            return null != include ? include.includedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] excludedAssemblers() {
            return null != exclude ? exclude.excludedAssemblers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] includedAssemblers() {
            return null != include ? include.includedAssemblers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Catalog.java`
#### Snippet
```java

        String[] includedCatalogers() {
            return null != include ? include.includedCatalogers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Catalog.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Catalog.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Catalog.java`
#### Snippet
```java

        String[] excludedCatalogers() {
            return null != exclude ? exclude.excludedCatalogers : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractDistributionModelCommand.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractDistributionModelCommand.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedUploaderNames() {
            return null != include ? include.includedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedCatalogers() {
            return null != exclude ? exclude.excludedCatalogers : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedUploaderNames() {
            return null != exclude ? exclude.excludedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedUploaderTypes() {
            return null != include ? include.includedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedUploaderTypes() {
            return null != exclude ? exclude.excludedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedCatalogers() {
            return null != include ? include.includedCatalogers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedPackagers() {
            return null != include ? include.includedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedDeployerTypes() {
            return null != include ? include.includedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedCatalogers() {
            return null != include ? include.includedCatalogers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedUploaderTypes() {
            return null != exclude ? exclude.excludedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedAnnouncers() {
            return null != include ? include.includedAnnouncers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedUploaderTypes() {
            return null != include ? include.includedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedDeployerTypes() {
            return null != exclude ? exclude.excludedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedUploaderNames() {
            return null != exclude ? exclude.excludedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedUploaderNames() {
            return null != include ? include.includedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedCatalogers() {
            return null != exclude ? exclude.excludedCatalogers : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedPackagers() {
            return null != exclude ? exclude.excludedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedAnnouncers() {
            return null != exclude ? exclude.excludedAnnouncers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedDeployerNames() {
            return null != exclude ? exclude.excludedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedDeployerNames() {
            return null != include ? include.includedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPackagerModelCommand.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPackagerModelCommand.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPackagerModelCommand.java`
#### Snippet
```java

        String[] excludedPackagers() {
            return null != exclude ? exclude.excludedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractPackagerModelCommand.java`
#### Snippet
```java

        String[] includedPackagers() {
            return null != include ? include.includedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

        String assemblerType() {
            return null != assemblers ? assemblers.assemblerType : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

        String announcerName() {
            return null != announcers ? announcers.announcerName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

        String packagerName() {
            return null != packagers ? packagers.packagerName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

        String distributionName() {
            return null != packagers ? packagers.distributionName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

        String assemblerName() {
            return null != assemblers ? assemblers.assemblerName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java

        org.jreleaser.model.Distribution.DistributionType distributionType() {
            return null != packagers ? packagers.distributionType : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] includedDownloaderTypes() {
            return null != include ? include.includedDownloaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] excludedDownloaderTypes() {
            return null != exclude ? exclude.excludedDownloaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] excludedDownloaderNames() {
            return null != exclude ? exclude.excludedDownloaderNames : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] includedDownloaderNames() {
            return null != include ? include.includedDownloaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Announce.java`
#### Snippet
```java

        String[] includedAnnouncers() {
            return null != include ? include.includedAnnouncers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Announce.java`
#### Snippet
```java

        String[] excludedAnnouncers() {
            return null != exclude ? exclude.excludedAnnouncers : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedDeployerNames() {
            return null != exclude ? exclude.excludedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedUploaderTypes() {
            return null != include ? include.includedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedDeployerNames() {
            return null != include ? include.includedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedCatalogers() {
            return null != exclude ? exclude.excludedCatalogers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedUploaderNames() {
            return null != include ? include.includedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedDistributions() {
            return null != include ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedDeployerTypes() {
            return null != include ? include.includedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedCatalogers() {
            return null != include ? include.includedCatalogers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedUploaderNames() {
            return null != exclude ? exclude.excludedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return null != exclude ? exclude.excludedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedUploaderTypes() {
            return null != exclude ? exclude.excludedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedDeployerTypes() {
            return null != exclude ? exclude.excludedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/SetupDiscoMojo.java`
#### Snippet
```java

        if (result.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/SetupDiscoMojo.java`
#### Snippet
```java
            List<org.jreleaser.sdk.disco.api.Pkg> packages = disco.packages(pkg.asDiscoPkg());

            if (packages.isEmpty()) return null;

            if (packages.size() > 1) {
```

### ReturnNull
Return of `null`
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/SetupDiscoMojo.java`
#### Snippet
```java
            }

            return null;
        } catch (RestAPIException e) {
            getLog().error(e);
```

### ReturnNull
Return of `null`
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/internal/JReleaserModelConfigurer.java`
#### Snippet
```java

    private static License resolveLicense(List<License> licenses) {
        if (null == licenses || licenses.isEmpty()) return null;
        for (License license : licenses) {
            if (isNotBlank(license.getName())) {
```

### ReturnNull
Return of `null`
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/internal/JReleaserModelConfigurer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[1-9]\\d*)`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
 */
public class ChronVer implements Version<ChronVer> {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^([2-9]\\d{3})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[1-2]\\d|3[0-1])(?:\\.((?:[1-9]\\d*)(?:(?:-[a-zA-Z0-9]+)+(?:\\.[1-9]\\d*)?)?))?(?:-[a-zA-Z0-9]+)?$");
    private static final Pattern CHANGESET_PATTERN = Pattern.compile("^(?:((?:[1-9]\\d*))(?:-([a-zA-Z0-9-]+[a-zA-Z0-9]?)(?:\\.([1-9]\\d*))?)?)?$");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[1-9]\\d*)`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
public class ChronVer implements Version<ChronVer> {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^([2-9]\\d{3})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[1-2]\\d|3[0-1])(?:\\.((?:[1-9]\\d*)(?:(?:-[a-zA-Z0-9]+)+(?:\\.[1-9]\\d*)?)?))?(?:-[a-zA-Z0-9]+)?$");
    private static final Pattern CHANGESET_PATTERN = Pattern.compile("^(?:((?:[1-9]\\d*))(?:-([a-zA-Z0-9-]+[a-zA-Z0-9]?)(?:\\.([1-9]\\d*))?)?)?$");

    private final int year;
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return delegate.equals(o);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return delegate.equals(o);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return delegate.equals(o);
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'org.gradle.api.services.BuildServiceParameters' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
    private final List<String> projectNames = new ArrayList<>();

    interface Params extends BuildServiceParameters {
    }

```

### UnstableApiUsage
'org.gradle.api.services.BuildService' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
 * @author Andres Almiray
 */
public abstract class Banner implements BuildService<Banner.Params> {
    private static final String ORG_JRELEASER_BANNER = "org.jreleaser.banner";

```

### UnstableApiUsage
'org.gradle.api.services.BuildServiceParameters' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
    private final List<String> projectNames = new ArrayList<>();

    interface Params extends BuildServiceParameters {
    }

```

### UnstableApiUsage
'org.gradle.api.services.BuildService' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
 * @author Andres Almiray
 */
public abstract class Banner implements BuildService<Banner.Params> {
    private static final String ORG_JRELEASER_BANNER = "org.jreleaser.banner";

```

### UnstableApiUsage
'because' is declared in unstable annotation 'org.gradle.api.tasks.UntrackedTask' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/tasks/JReleaserInitTask.groovy`
#### Snippet
```java
 */
@CompileStatic
@UntrackedTask(because = 'writes to project.basedir')
abstract class JReleaserInitTask extends DefaultTask {
    static final String NAME = 'jreleaserInit'
```

### UnstableApiUsage
'org.gradle.api.services.BuildServiceParameters' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
    private final JReleaserLogger logger;

    public interface Params extends BuildServiceParameters {
        Property<AnsiConsole> getConsole();

```

### UnstableApiUsage
'getParameters()' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
    public JReleaserLoggerService() {
        try {
            Path outputDirectoryPath = getParameters().getOutputDirectory().get().getAsFile().toPath();
            Files.createDirectories(outputDirectoryPath);
            File traceLogFile = outputDirectoryPath.resolve("trace.log").toFile();
```

### UnstableApiUsage
'getParameters()' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
            PrintWriter tracer = IoUtils.newPrintWriter(new FileOutputStream(traceLogFile));

            logger = new JReleaserLoggerAdapter(getParameters().getConsole().get(),
                getParameters().getLogLevel().get(), tracer);
        } catch (IOException e) {
```

### UnstableApiUsage
'getParameters()' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java

            logger = new JReleaserLoggerAdapter(getParameters().getConsole().get(),
                getParameters().getLogLevel().get(), tracer);
        } catch (IOException e) {
            throw new IllegalStateException(e);
```

### UnstableApiUsage
'org.gradle.api.services.BuildService' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
 * @since 1.4.0
 */
public abstract class JReleaserLoggerService implements BuildService<JReleaserLoggerService.Params>, AutoCloseable {
    private final JReleaserLogger logger;

```

